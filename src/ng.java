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

public class ng {
   final Consumer<nj> b;
   final BiConsumer<akm, Supplier<JsonElement>> c;
   private final Consumer<ctj> d;
   final List<ddy> e = ImmutableList.of(dea.ey, dea.eE, dea.hY);
   final Map<ddy, ng.c> f = ImmutableMap.builder().put(dea.b, ng::a).put(dea.sJ, ng::c).put(dea.eM, ng::b).build();
   final Map<ddy, nz> g = ImmutableMap.builder()
      .put(dea.aV, nz.y.get(dea.aV))
      .put(dea.jp, nz.y.get(dea.jp))
      .put(dea.jS, nz.a(nx.a(dea.aV, "_top")))
      .put(dea.jU, nz.a(nx.a(dea.jp, "_top")))
      .put(dea.aX, nz.d.get(dea.aV).a($$0x -> $$0x.a(ny.i, nx.G(dea.aX))))
      .put(dea.jr, nz.d.get(dea.jp).a($$0x -> $$0x.a(ny.i, nx.G(dea.jr))))
      .put(dea.hd, nz.d.get(dea.hd))
      .put(dea.jT, nz.a(nx.a(dea.hd, "_bottom")))
      .put(dea.pr, nz.z.get(dea.pr))
      .put(dea.sJ, nz.z.get(dea.sJ))
      .put(dea.he, nz.d.get(dea.he).a($$0x -> $$0x.a(ny.i, nx.G(dea.he))))
      .put(dea.aW, nz.d.get(dea.aW).a($$0x -> {
         $$0x.a(ny.d, nx.a(dea.aV, "_top"));
         $$0x.a(ny.i, nx.G(dea.aW));
      }))
      .put(dea.jq, nz.d.get(dea.jq).a($$0x -> {
         $$0x.a(ny.d, nx.a(dea.jp, "_top"));
         $$0x.a(ny.i, nx.G(dea.jq));
      }))
      .put(dea.qM, nz.z.get(dea.qM))
      .put(dea.qH, nz.z.get(dea.qH))
      .build();
   static final Map<li.b, BiConsumer<ng.b, ddy>> h = ImmutableMap.builder()
      .put(li.b.a, ng.b::a)
      .put(li.b.e, ng.b::l)
      .put(li.b.b, ng.b::k)
      .put(li.b.c, ng.b::k)
      .put(li.b.f, ng.b::c)
      .put(li.b.g, ng.b::d)
      .put(li.b.h, ng.b::e)
      .put(li.b.i, ng.b::f)
      .put(li.b.k, ng.b::h)
      .put(li.b.l, ng.b::i)
      .put(li.b.m, ng.b::j)
      .put(li.b.n, ng.b::g)
      .put(li.b.p, ng.b::m)
      .put(li.b.q, ng.b::b)
      .build();
   public static final List<Pair<drs, Function<akm, np>>> a = List.of(
      Pair.of(drr.L, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0)),
      Pair.of(drr.M, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.d, true)),
      Pair.of(drr.N, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.d, true)),
      Pair.of(drr.O, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.d, true)),
      Pair.of(drr.J, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.a, nq.a.d).a(nq.d, true)),
      Pair.of(drr.K, (Function<akm, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.a, nq.a.b).a(nq.d, true))
   );
   private static final Map<ng.d, akm> i = new HashMap<>();

   private static nj a(ddy $$0, akm $$1, nx $$2, BiConsumer<akm, Supplier<JsonElement>> $$3) {
      akm $$4 = nw.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nj b(ddy $$0, akm $$1, nx $$2, BiConsumer<akm, Supplier<JsonElement>> $$3) {
      akm $$4 = nw.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nj c(ddy $$0, akm $$1, nx $$2, BiConsumer<akm, Supplier<JsonElement>> $$3) {
      akm $$4 = nw.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ng(Consumer<nj> $$0, BiConsumer<akm, Supplier<JsonElement>> $$1, Consumer<ctj> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(ddy $$0) {
      this.d.accept($$0.q());
   }

   void a(ddy $$0, akm $$1) {
      this.c.accept(nu.a($$0.q()), new nt($$1));
   }

   private void a(ctj $$0, akm $$1) {
      this.c.accept(nu.a($$0), new nt($$1));
   }

   void a(ctj $$0) {
      nw.bx.a(nu.a($$0), nx.b($$0), this.c);
   }

   private void d(ddy $$0) {
      ctj $$1 = $$0.q();
      if ($$1 != ctr.a) {
         nw.bx.a(nu.a($$1), nx.F($$0), this.c);
      }
   }

   private void a(ddy $$0, String $$1) {
      ctj $$2 = $$0.q();
      nw.bx.a(nu.a($$2), nx.k(nx.a($$0, $$1)), this.c);
   }

   private static nn b() {
      return nn.a(drr.R).a(it.f, np.a().a(nq.b, nq.a.b)).a(it.d, np.a().a(nq.b, nq.a.c)).a(it.e, np.a().a(nq.b, nq.a.d)).a(it.c, np.a());
   }

   private static nn c() {
      return nn.a(drr.R).a(it.d, np.a()).a(it.e, np.a().a(nq.b, nq.a.b)).a(it.c, np.a().a(nq.b, nq.a.c)).a(it.f, np.a().a(nq.b, nq.a.d));
   }

   private static nn d() {
      return nn.a(drr.R).a(it.f, np.a()).a(it.d, np.a().a(nq.b, nq.a.b)).a(it.e, np.a().a(nq.b, nq.a.c)).a(it.c, np.a().a(nq.b, nq.a.d));
   }

   private static nn e() {
      return nn.a(drr.P)
         .a(it.a, np.a().a(nq.a, nq.a.b))
         .a(it.b, np.a().a(nq.a, nq.a.d))
         .a(it.c, np.a())
         .a(it.d, np.a().a(nq.b, nq.a.c))
         .a(it.e, np.a().a(nq.b, nq.a.d))
         .a(it.f, np.a().a(nq.b, nq.a.b));
   }

   private static nm b(ddy $$0, akm $$1) {
      return nm.a($$0, a($$1));
   }

   private static np[] a(akm $$0) {
      return new np[]{np.a().a(nq.c, $$0), np.a().a(nq.c, $$0).a(nq.b, nq.a.b), np.a().a(nq.c, $$0).a(nq.b, nq.a.c), np.a().a(nq.c, $$0).a(nq.b, nq.a.d)};
   }

   private static nm a(ddy $$0, akm $$1, akm $$2) {
      return nm.a($$0, np.a().a(nq.c, $$1), np.a().a(nq.c, $$2), np.a().a(nq.c, $$1).a(nq.b, nq.a.c), np.a().a(nq.c, $$2).a(nq.b, nq.a.c));
   }

   private static nn a(drs $$0, akm $$1, akm $$2) {
      return nn.a($$0).a(true, np.a().a(nq.c, $$1)).a(false, np.a().a(nq.c, $$2));
   }

   private void e(ddy $$0) {
      akm $$1 = nz.a.create($$0, this.c);
      akm $$2 = nz.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(ddy $$0) {
      akm $$1 = nz.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(ddy $$0) {
      this.b.accept(nm.a($$0).a(nn.a(drr.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akm $$3 = nx.a($$0, $$2);
         return np.a().a(nq.c, nw.c.a($$0, $$2, new nx().a(ny.a, $$3), this.c));
      })));
      this.a($$0, nx.a($$0, "_0"));
   }

   static nj b(ddy $$0, akm $$1, akm $$2) {
      return nm.a($$0)
         .a(nn.a(drr.w).a(false, np.a().a(nq.c, $$1)).a(true, np.a().a(nq.c, $$2)))
         .a(
            nn.a(drr.U, drr.R)
               .a(drm.a, it.f, np.a().a(nq.b, nq.a.b))
               .a(drm.a, it.e, np.a().a(nq.b, nq.a.d))
               .a(drm.a, it.d, np.a().a(nq.b, nq.a.c))
               .a(drm.a, it.c, np.a())
               .a(drm.b, it.f, np.a().a(nq.b, nq.a.b).a(nq.a, nq.a.b).a(nq.d, true))
               .a(drm.b, it.e, np.a().a(nq.b, nq.a.d).a(nq.a, nq.a.b).a(nq.d, true))
               .a(drm.b, it.d, np.a().a(nq.b, nq.a.c).a(nq.a, nq.a.b).a(nq.d, true))
               .a(drm.b, it.c, np.a().a(nq.a, nq.a.b).a(nq.d, true))
               .a(drm.c, it.f, np.a().a(nq.b, nq.a.d).a(nq.a, nq.a.c))
               .a(drm.c, it.e, np.a().a(nq.b, nq.a.b).a(nq.a, nq.a.c))
               .a(drm.c, it.d, np.a().a(nq.a, nq.a.c))
               .a(drm.c, it.c, np.a().a(nq.b, nq.a.c).a(nq.a, nq.a.c))
         );
   }

   private static nn.d<it, drx, drw, Boolean> a(nn.d<it, drx, drw, Boolean> $$0, drx $$1, akm $$2, akm $$3, akm $$4, akm $$5) {
      return $$0.a(it.f, $$1, drw.a, false, np.a().a(nq.c, $$2))
         .a(it.d, $$1, drw.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
         .a(it.e, $$1, drw.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
         .a(it.c, $$1, drw.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
         .a(it.f, $$1, drw.b, false, np.a().a(nq.c, $$4))
         .a(it.d, $$1, drw.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
         .a(it.e, $$1, drw.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
         .a(it.c, $$1, drw.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
         .a(it.f, $$1, drw.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
         .a(it.d, $$1, drw.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
         .a(it.e, $$1, drw.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
         .a(it.c, $$1, drw.a, true, np.a().a(nq.c, $$3))
         .a(it.f, $$1, drw.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.d))
         .a(it.d, $$1, drw.b, true, np.a().a(nq.c, $$5))
         .a(it.e, $$1, drw.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
         .a(it.c, $$1, drw.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.c));
   }

   private static nj a(ddy $$0, akm $$1, akm $$2, akm $$3, akm $$4, akm $$5, akm $$6, akm $$7, akm $$8) {
      return nm.a($$0).a(a(a(nn.a(drr.R, drr.ae, drr.be, drr.u), drx.b, $$1, $$2, $$3, $$4), drx.a, $$5, $$6, $$7, $$8));
   }

   static nj a(ddy $$0, akm $$1, akm $$2, akm $$3, akm $$4, akm $$5) {
      return nl.a($$0)
         .a(np.a().a(nq.c, $$1))
         .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$2).a(nq.d, false))
         .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$3).a(nq.d, false))
         .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$4).a(nq.d, false))
         .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$5).a(nq.d, false));
   }

   static nj c(ddy $$0, akm $$1, akm $$2) {
      return nl.a($$0)
         .a(np.a().a(nq.c, $$1))
         .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$2).a(nq.d, true))
         .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true));
   }

   static nj a(ddy $$0, akm $$1, akm $$2, akm $$3) {
      return nl.a($$0)
         .a(nk.a().a(drr.J, true), np.a().a(nq.c, $$1))
         .a(nk.a().a(drr.X, dsn.b), np.a().a(nq.c, $$2).a(nq.d, true))
         .a(nk.a().a(drr.W, dsn.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drr.Y, dsn.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drr.Z, dsn.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true))
         .a(nk.a().a(drr.X, dsn.c), np.a().a(nq.c, $$3).a(nq.d, true))
         .a(nk.a().a(drr.W, dsn.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drr.Y, dsn.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drr.Z, dsn.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true));
   }

   static nj a(ddy $$0, akm $$1, akm $$2, akm $$3, akm $$4, boolean $$5) {
      return nm.a($$0, np.a().a(nq.d, $$5))
         .a(c())
         .a(
            nn.a(drr.q, drr.u)
               .a(false, false, np.a().a(nq.c, $$2))
               .a(true, false, np.a().a(nq.c, $$4))
               .a(false, true, np.a().a(nq.c, $$1))
               .a(true, true, np.a().a(nq.c, $$3))
         );
   }

   static nj b(ddy $$0, akm $$1, akm $$2, akm $$3) {
      return nm.a($$0)
         .a(
            nn.a(drr.R, drr.af, drr.bi)
               .a(it.f, dsa.b, dsk.a, np.a().a(nq.c, $$2))
               .a(it.e, dsa.b, dsk.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.b, dsk.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.b, dsk.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsa.b, dsk.e, np.a().a(nq.c, $$3))
               .a(it.e, dsa.b, dsk.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.b, dsk.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.b, dsk.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsa.b, dsk.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.e, dsa.b, dsk.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.d, dsa.b, dsk.d, np.a().a(nq.c, $$3))
               .a(it.c, dsa.b, dsk.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.f, dsa.b, dsk.c, np.a().a(nq.c, $$1))
               .a(it.e, dsa.b, dsk.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.b, dsk.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.b, dsk.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsa.b, dsk.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.e, dsa.b, dsk.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.d, dsa.b, dsk.b, np.a().a(nq.c, $$1))
               .a(it.c, dsa.b, dsk.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.f, dsa.a, dsk.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsa.a, dsk.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.a, dsk.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.a, dsk.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsa.a, dsk.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.e, dsa.a, dsk.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.d, dsa.a, dsk.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.c, dsa.a, dsk.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.f, dsa.a, dsk.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsa.a, dsk.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.a, dsk.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.a, dsk.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsa.a, dsk.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.e, dsa.a, dsk.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.d, dsa.a, dsk.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.c, dsa.a, dsk.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.f, dsa.a, dsk.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsa.a, dsk.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsa.a, dsk.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsa.a, dsk.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
         );
   }

   private static nj c(ddy $$0, akm $$1, akm $$2, akm $$3) {
      return nm.a($$0)
         .a(
            nn.a(drr.R, drr.af, drr.u)
               .a(it.c, dsa.b, false, np.a().a(nq.c, $$2))
               .a(it.d, dsa.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
               .a(it.f, dsa.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(it.e, dsa.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
               .a(it.c, dsa.a, false, np.a().a(nq.c, $$1))
               .a(it.d, dsa.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
               .a(it.f, dsa.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
               .a(it.e, dsa.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               .a(it.c, dsa.b, true, np.a().a(nq.c, $$3))
               .a(it.d, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(it.c, dsa.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c))
               .a(it.d, dsa.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.a))
               .a(it.f, dsa.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d))
               .a(it.e, dsa.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b))
         );
   }

   private static nj d(ddy $$0, akm $$1, akm $$2, akm $$3) {
      return nm.a($$0)
         .a(
            nn.a(drr.R, drr.af, drr.u)
               .a(it.c, dsa.b, false, np.a().a(nq.c, $$2))
               .a(it.d, dsa.b, false, np.a().a(nq.c, $$2))
               .a(it.f, dsa.b, false, np.a().a(nq.c, $$2))
               .a(it.e, dsa.b, false, np.a().a(nq.c, $$2))
               .a(it.c, dsa.a, false, np.a().a(nq.c, $$1))
               .a(it.d, dsa.a, false, np.a().a(nq.c, $$1))
               .a(it.f, dsa.a, false, np.a().a(nq.c, $$1))
               .a(it.e, dsa.a, false, np.a().a(nq.c, $$1))
               .a(it.c, dsa.b, true, np.a().a(nq.c, $$3))
               .a(it.d, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsa.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(it.c, dsa.a, true, np.a().a(nq.c, $$3))
               .a(it.d, dsa.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsa.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsa.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
         );
   }

   static nm c(ddy $$0, akm $$1) {
      return nm.a($$0, np.a().a(nq.c, $$1));
   }

   private static nn f() {
      return nn.a(drr.I).a(it.a.b, np.a()).a(it.a.c, np.a().a(nq.a, nq.a.b)).a(it.a.a, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b));
   }

   static nj a(ddy $$0, nx $$1, BiConsumer<akm, Supplier<JsonElement>> $$2) {
      akm $$3 = nw.g.a($$0, $$1, $$2);
      akm $$4 = nw.h.a($$0, $$1, $$2);
      akm $$5 = nw.i.a($$0, $$1, $$2);
      akm $$6 = nw.j.a($$0, $$1, $$2);
      return nm.a($$0, np.a().a(nq.c, $$6)).a(nn.a(drr.I).a(it.a.a, np.a().a(nq.c, $$3)).a(it.a.b, np.a().a(nq.c, $$4)).a(it.a.c, np.a().a(nq.c, $$5)));
   }

   static nj d(ddy $$0, akm $$1) {
      return nm.a($$0, np.a().a(nq.c, $$1)).a(f());
   }

   private void e(ddy $$0, akm $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(ddy $$0, nz.a $$1) {
      akm $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(ddy $$0, nz.a $$1) {
      akm $$2 = $$1.create($$0, this.c);
      this.b.accept(nm.a($$0, np.a().a(nq.c, $$2)).a(b()));
   }

   static nj d(ddy $$0, akm $$1, akm $$2) {
      return nm.a($$0)
         .a(
            nn.a(drr.I)
               .a(it.a.b, np.a().a(nq.c, $$1))
               .a(it.a.c, np.a().a(nq.c, $$2).a(nq.a, nq.a.b))
               .a(it.a.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.b).a(nq.b, nq.a.b))
         );
   }

   private void a(ddy $$0, nz.a $$1, nz.a $$2) {
      akm $$3 = $$1.create($$0, this.c);
      akm $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akm a(ddy $$0, String $$1, nv $$2, Function<akm, nx> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nx.a($$0, $$1)), this.c);
   }

   static nj e(ddy $$0, akm $$1, akm $$2) {
      return nm.a($$0).a(a(drr.w, $$2, $$1));
   }

   static nj e(ddy $$0, akm $$1, akm $$2, akm $$3) {
      return nm.a($$0).a(nn.a(drr.bh).a(dsj.b, np.a().a(nq.c, $$1)).a(dsj.a, np.a().a(nq.c, $$2)).a(dsj.c, np.a().a(nq.c, $$3)));
   }

   public void a(ddy $$0) {
      this.b($$0, nz.a);
   }

   public void b(ddy $$0, nz.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(ddy $$0, nx $$1, nv $$2) {
      akm $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ng.b h(ddy $$0) {
      nz $$1 = this.g.getOrDefault($$0, nz.a.get($$0));
      return new ng.b($$1.b()).a($$0, $$1.a());
   }

   public void a(ddy $$0, ddy $$1, ddy $$2) {
      nx $$3 = nx.u($$0);
      akm $$4 = nw.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.q());
      this.c($$2);
   }

   void i(ddy $$0) {
      nx $$1 = nx.t($$0);
      akm $$2 = nw.v.a($$0, $$1, this.c);
      akm $$3 = nw.w.a($$0, $$1, this.c);
      akm $$4 = nw.x.a($$0, $$1, this.c);
      akm $$5 = nw.y.a($$0, $$1, this.c);
      akm $$6 = nw.z.a($$0, $$1, this.c);
      akm $$7 = nw.A.a($$0, $$1, this.c);
      akm $$8 = nw.B.a($$0, $$1, this.c);
      akm $$9 = nw.C.a($$0, $$1, this.c);
      this.a($$0.q());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(ddy $$0, ddy $$1) {
      akm $$2 = nw.v.a($$0);
      akm $$3 = nw.w.a($$0);
      akm $$4 = nw.x.a($$0);
      akm $$5 = nw.y.a($$0);
      akm $$6 = nw.z.a($$0);
      akm $$7 = nw.A.a($$0);
      akm $$8 = nw.B.a($$0);
      akm $$9 = nw.C.a($$0);
      this.a($$1, nu.a($$0.q()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(ddy $$0) {
      nx $$1 = nx.b($$0);
      akm $$2 = nw.ak.a($$0, $$1, this.c);
      akm $$3 = nw.al.a($$0, $$1, this.c);
      akm $$4 = nw.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(ddy $$0) {
      nx $$1 = nx.b($$0);
      akm $$2 = nw.ah.a($$0, $$1, this.c);
      akm $$3 = nw.ai.a($$0, $$1, this.c);
      akm $$4 = nw.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(ddy $$0, ddy $$1) {
      akm $$2 = nw.ah.a($$0);
      akm $$3 = nw.ai.a($$0);
      akm $$4 = nw.aj.a($$0);
      this.a($$1, nu.a($$0.q()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dea.sD);
      akm $$0 = nu.a(dea.sD);
      akm $$1 = nu.a(dea.sD, "_partial_tilt");
      akm $$2 = nu.a(dea.sD, "_full_tilt");
      this.b
         .accept(
            nm.a(dea.sD)
               .a(b())
               .a(nn.a(drr.bl).a(dsm.a, np.a().a(nq.c, $$0)).a(dsm.b, np.a().a(nq.c, $$0)).a(dsm.c, np.a().a(nq.c, $$1)).a(dsm.d, np.a().a(nq.c, $$2)))
         );
   }

   private ng.f l(ddy $$0) {
      return new ng.f(nx.n($$0));
   }

   private void m(ddy $$0) {
      this.c($$0, $$0);
   }

   private void c(ddy $$0, ddy $$1) {
      this.b.accept(c($$0, nu.a($$1)));
   }

   private void a(ddy $$0, ng.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(ddy $$0, ng.e $$1, nx $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(ddy $$0, ng.e $$1) {
      nx $$2 = nx.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(ddy $$0, ng.e $$1, nx $$2) {
      akm $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(ddy $$0, ng.e $$1, dse<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nn $$4 = nn.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nx $$5 = nx.c(nx.a($$0, $$4x));
            akm $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return np.a().a(nq.c, $$6);
         });
         this.a($$0.q());
         this.b.accept(nm.a($$0).a($$4));
      }
   }

   private void a(ddy $$0, ddy $$1, ng.e $$2) {
      this.a($$0, $$2);
      nx $$3 = nx.d($$0);
      akm $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(ddy $$0, ddy $$1) {
      nz $$2 = nz.p.get($$0);
      akm $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akm $$4 = nw.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nm.a($$1, np.a().a(nq.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(ddy $$0, ddy $$1) {
      this.a($$0.q());
      nx $$2 = nx.h($$0);
      nx $$3 = nx.a($$0, $$1);
      akm $$4 = nw.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nm.a($$1, np.a().a(nq.c, $$4))
               .a(nn.a(drr.R).a(it.e, np.a()).a(it.d, np.a().a(nq.b, nq.a.d)).a(it.c, np.a().a(nq.b, nq.a.b)).a(it.f, np.a().a(nq.b, nq.a.c)))
         );
      this.b.accept(nm.a($$0).a(nn.a(drr.av).a($$2x -> np.a().a(nq.c, nw.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      ddy $$0 = dea.kC;
      this.a($$0.q());
      akm $$1 = nu.a($$0, "_top");
      akm $$2 = nu.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      ddy $$0 = dea.kB;
      this.a($$0.q());
      nn $$1 = nn.a(djn.d, drr.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> np.a().a(nq.c, nu.a($$0, "_top_stage_" + $$1x));
            case b -> np.a().a(nq.c, nu.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nm.a($$0).a($$1));
   }

   private void a(ddy $$0, ddy $$1, ddy $$2, ddy $$3, ddy $$4, ddy $$5, ddy $$6, ddy $$7) {
      this.a($$0, ng.e.b);
      this.a($$1, ng.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(ddy $$0, ng.e $$1) {
      this.a($$0, "_top");
      akm $$2 = this.a($$0, "_top", $$1.a(), nx::c);
      akm $$3 = this.a($$0, "_bottom", $$1.a(), nx::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dea.iD, "_front");
      akm $$0 = nu.a(dea.iD, "_top");
      akm $$1 = this.a(dea.iD, "_bottom", ng.e.b.a(), nx::c);
      this.f(dea.iD, $$0, $$1);
   }

   private void k() {
      akm $$0 = this.a(dea.bx, "_top", nw.bk, nx::a);
      akm $$1 = this.a(dea.bx, "_bottom", nw.bk, nx::a);
      this.f(dea.bx, $$0, $$1);
   }

   private void l() {
      this.c(dea.sF);
      akm $$0 = nu.a(dea.sF, "_top");
      akm $$1 = nu.a(dea.sF, "_bottom");
      this.b.accept(nm.a(dea.sF).a(b()).a(nn.a(drr.ae).a(drx.b, np.a().a(nq.c, $$1)).a(drx.a, np.a().a(nq.c, $$0))));
   }

   private void f(ddy $$0, akm $$1, akm $$2) {
      this.b.accept(nm.a($$0).a(nn.a(drr.ae).a(drx.b, np.a().a(nq.c, $$2)).a(drx.a, np.a().a(nq.c, $$1))));
   }

   private void n(ddy $$0) {
      nx $$1 = nx.e($$0);
      nx $$2 = nx.e(nx.a($$0, "_corner"));
      akm $$3 = nw.as.a($$0, $$1, this.c);
      akm $$4 = nw.at.a($$0, $$2, this.c);
      akm $$5 = nw.au.a($$0, $$1, this.c);
      akm $$6 = nw.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drr.ag)
                     .a(dsf.a, np.a().a(nq.c, $$3))
                     .a(dsf.b, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
                     .a(dsf.c, np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
                     .a(dsf.d, np.a().a(nq.c, $$6).a(nq.b, nq.a.b))
                     .a(dsf.e, np.a().a(nq.c, $$5))
                     .a(dsf.f, np.a().a(nq.c, $$6))
                     .a(dsf.g, np.a().a(nq.c, $$4))
                     .a(dsf.h, np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
                     .a(dsf.i, np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
                     .a(dsf.j, np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
               )
         );
   }

   private void o(ddy $$0) {
      akm $$1 = this.a($$0, "", nw.as, nx::e);
      akm $$2 = this.a($$0, "", nw.au, nx::e);
      akm $$3 = this.a($$0, "", nw.av, nx::e);
      akm $$4 = this.a($$0, "_on", nw.as, nx::e);
      akm $$5 = this.a($$0, "_on", nw.au, nx::e);
      akm $$6 = this.a($$0, "_on", nw.av, nx::e);
      nn $$7 = nn.a(drr.w, drr.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return np.a().a(nq.c, $$6x ? $$4 : $$1);
            case b:
               return np.a().a(nq.c, $$6x ? $$4 : $$1).a(nq.b, nq.a.b);
            case c:
               return np.a().a(nq.c, $$6x ? $$5 : $$2).a(nq.b, nq.a.b);
            case d:
               return np.a().a(nq.c, $$6x ? $$6 : $$3).a(nq.b, nq.a.b);
            case e:
               return np.a().a(nq.c, $$6x ? $$5 : $$2);
            case f:
               return np.a().a(nq.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(nm.a($$0).a($$7));
   }

   private ng.a a(akm $$0, ddy $$1) {
      return new ng.a($$0, $$1);
   }

   private ng.a f(ddy $$0, ddy $$1) {
      return new ng.a(nu.a($$0), $$1);
   }

   private void a(ddy $$0, ctj $$1) {
      akm $$2 = nw.aa.a($$0, nx.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(ddy $$0, akm $$1) {
      akm $$2 = nw.aa.a($$0, nx.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(ddy $$0, ddy $$1) {
      this.a($$0);
      akm $$2 = nz.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(ddy $$0) {
      this.a($$0.q());
      akm $$1 = nz.k.create($$0, this.c);
      akm $$2 = nz.l.create($$0, this.c);
      akm $$3 = nz.m.create($$0, this.c);
      akm $$4 = nz.n.create($$0, this.c);
      this.b
         .accept(
            nl.a($$0)
               .a(nk.a().a(drr.S, 1, 2, 3, 4).a(drr.R, it.c), np.a().a(nq.c, $$1))
               .a(nk.a().a(drr.S, 1, 2, 3, 4).a(drr.R, it.f), np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.S, 1, 2, 3, 4).a(drr.R, it.d), np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
               .a(nk.a().a(drr.S, 1, 2, 3, 4).a(drr.R, it.e), np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               .a(nk.a().a(drr.S, 2, 3, 4).a(drr.R, it.c), np.a().a(nq.c, $$2))
               .a(nk.a().a(drr.S, 2, 3, 4).a(drr.R, it.f), np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.S, 2, 3, 4).a(drr.R, it.d), np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
               .a(nk.a().a(drr.S, 2, 3, 4).a(drr.R, it.e), np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
               .a(nk.a().a(drr.S, 3, 4).a(drr.R, it.c), np.a().a(nq.c, $$3))
               .a(nk.a().a(drr.S, 3, 4).a(drr.R, it.f), np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.S, 3, 4).a(drr.R, it.d), np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(nk.a().a(drr.S, 3, 4).a(drr.R, it.e), np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(nk.a().a(drr.S, 4).a(drr.R, it.c), np.a().a(nq.c, $$4))
               .a(nk.a().a(drr.S, 4).a(drr.R, it.f), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.S, 4).a(drr.R, it.d), np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
               .a(nk.a().a(drr.S, 4).a(drr.R, it.e), np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
         );
   }

   private void a(nz.a $$0, ddy... $$1) {
      for (ddy $$2 : $$1) {
         akm $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nz.a $$0, ddy... $$1) {
      for (ddy $$2 : $$1) {
         akm $$3 = $$0.create($$2, this.c);
         this.b.accept(nm.a($$2, np.a().a(nq.c, $$3)).a(c()));
      }
   }

   private void h(ddy $$0, ddy $$1) {
      this.a($$0);
      nx $$2 = nx.b($$0, $$1);
      akm $$3 = nw.aI.a($$1, $$2, this.c);
      akm $$4 = nw.aJ.a($$1, $$2, this.c);
      akm $$5 = nw.aK.a($$1, $$2, this.c);
      akm $$6 = nw.aG.a($$1, $$2, this.c);
      akm $$7 = nw.aH.a($$1, $$2, this.c);
      ctj $$8 = $$1.q();
      nw.bx.a(nu.a($$8), nx.F($$0), this.c);
      this.b
         .accept(
            nl.a($$1)
               .a(np.a().a(nq.c, $$3))
               .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$4))
               .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$5))
               .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.L, false), np.a().a(nq.c, $$6))
               .a(nk.a().a(drr.M, false), np.a().a(nq.c, $$7))
               .a(nk.a().a(drr.N, false), np.a().a(nq.c, $$7).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.O, false), np.a().a(nq.c, $$6).a(nq.b, nq.a.d))
         );
   }

   private void q(ddy $$0) {
      nx $$1 = nx.z($$0);
      akm $$2 = nw.aL.a($$0, $$1, this.c);
      akm $$3 = this.a($$0, "_conditional", nw.aL, $$1x -> $$1.c(ny.i, $$1x));
      this.b.accept(nm.a($$0).a(a(drr.c, $$3, $$2)).a(e()));
   }

   private void r(ddy $$0) {
      akm $$1 = nz.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<np> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> np.a().a(nq.c, nu.a(dea.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dea.mZ);
      this.b
         .accept(
            nl.a(dea.mZ)
               .a(nk.a().a(drr.aq, 0), this.a(0))
               .a(nk.a().a(drr.aq, 1), this.a(1))
               .a(nk.a().a(drr.bk, drn.b), np.a().a(nq.c, nu.a(dea.mZ, "_small_leaves")))
               .a(nk.a().a(drr.bk, drn.c), np.a().a(nq.c, nu.a(dea.mZ, "_large_leaves")))
         );
   }

   private nn n() {
      return nn.a(drr.P)
         .a(it.a, np.a().a(nq.a, nq.a.c))
         .a(it.b, np.a())
         .a(it.c, np.a().a(nq.a, nq.a.b))
         .a(it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
         .a(it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
         .a(it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b));
   }

   private void o() {
      akm $$0 = nx.a(dea.nU, "_top_open");
      this.b
         .accept(
            nm.a(dea.nU)
               .a(this.n())
               .a(
                  nn.a(drr.u)
                     .a(false, np.a().a(nq.c, nz.f.create(dea.nU, this.c)))
                     .a(true, np.a().a(nq.c, nz.f.get(dea.nU).a($$1 -> $$1.a(ny.f, $$0)).a(dea.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nn a(dse<T> $$0, T $$1, akm $$2, akm $$3) {
      np $$4 = np.a().a(nq.c, $$2);
      np $$5 = np.a().a(nq.c, $$3);
      return nn.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(ddy $$0, Function<ddy, nx> $$1) {
      nx $$2 = $$1.apply($$0).b(ny.i, ny.c);
      nx $$3 = $$2.c(ny.g, nx.a($$0, "_front_honey"));
      akm $$4 = nw.q.a($$0, $$2, this.c);
      akm $$5 = nw.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nm.a($$0).a(b()).a(a(drr.aN, 5, $$5, $$4)));
   }

   private void a(ddy $$0, dse<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akm> $$3 = new Int2ObjectOpenHashMap();
         nn $$4 = nn.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akm $$5 = (akm)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, nw.aV, nx::g));
            return np.a().a(nq.c, $$5);
         });
         this.a($$0.q());
         this.b.accept(nm.a($$0).a($$4));
      }
   }

   private void p() {
      akm $$0 = nu.a(dea.od, "_floor");
      akm $$1 = nu.a(dea.od, "_ceiling");
      akm $$2 = nu.a(dea.od, "_wall");
      akm $$3 = nu.a(dea.od, "_between_walls");
      this.a(ctr.wo);
      this.b
         .accept(
            nm.a(dea.od)
               .a(
                  nn.a(drr.R, drr.V)
                     .a(it.c, drp.a, np.a().a(nq.c, $$0))
                     .a(it.d, drp.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.c))
                     .a(it.f, drp.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.b))
                     .a(it.e, drp.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.d))
                     .a(it.c, drp.b, np.a().a(nq.c, $$1))
                     .a(it.d, drp.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
                     .a(it.f, drp.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
                     .a(it.e, drp.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
                     .a(it.c, drp.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
                     .a(it.d, drp.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
                     .a(it.f, drp.c, np.a().a(nq.c, $$2))
                     .a(it.e, drp.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
                     .a(it.d, drp.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
                     .a(it.c, drp.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
                     .a(it.f, drp.d, np.a().a(nq.c, $$3))
                     .a(it.e, drp.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nm.a(dea.nZ, np.a().a(nq.c, nu.a(dea.nZ)))
               .a(
                  nn.a(drr.U, drr.R)
                     .a(drm.a, it.c, np.a())
                     .a(drm.a, it.f, np.a().a(nq.b, nq.a.b))
                     .a(drm.a, it.d, np.a().a(nq.b, nq.a.c))
                     .a(drm.a, it.e, np.a().a(nq.b, nq.a.d))
                     .a(drm.b, it.c, np.a().a(nq.a, nq.a.b))
                     .a(drm.b, it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b))
                     .a(drm.b, it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
                     .a(drm.b, it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
                     .a(drm.c, it.d, np.a().a(nq.a, nq.a.c))
                     .a(drm.c, it.e, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.b))
                     .a(drm.c, it.c, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.c))
                     .a(drm.c, it.f, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.d))
               )
         );
   }

   private void d(ddy $$0, nz.a $$1) {
      akm $$2 = $$1.create($$0, this.c);
      akm $$3 = nx.a($$0, "_front_on");
      akm $$4 = $$1.get($$0).a($$1x -> $$1x.a(ny.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nm.a($$0).a(a(drr.r, $$4, $$2)).a(b()));
   }

   private void a(ddy... $$0) {
      akm $$1 = nu.a("campfire_off");

      for (ddy $$2 : $$0) {
         akm $$3 = nw.bc.a($$2, nx.E($$2), this.c);
         this.a($$2.q());
         this.b.accept(nm.a($$2).a(a(drr.r, $$3, $$1)).a(c()));
      }
   }

   private void s(ddy $$0) {
      akm $$1 = nw.bt.a($$0, nx.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(ddy $$0) {
      akm $$1;
      if ($$0 == dea.tj) {
         $$1 = nw.bv.a($$0, nx.m($$0), this.c);
      } else {
         $$1 = nw.bu.a($$0, nx.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nx $$0 = nx.a(nx.G(dea.cl), nx.G(dea.n));
      akm $$1 = nw.j.a(dea.cl, $$0, this.c);
      this.b.accept(c(dea.cl, $$1));
   }

   private void s() {
      this.a(ctr.lH);
      this.b
         .accept(
            nl.a(dea.cw)
               .a(
                  nk.b(
                     nk.a().a(drr.ab, dsg.c).a(drr.aa, dsg.c).a(drr.ac, dsg.c).a(drr.ad, dsg.c),
                     nk.a().a(drr.ab, dsg.b, dsg.a).a(drr.aa, dsg.b, dsg.a),
                     nk.a().a(drr.aa, dsg.b, dsg.a).a(drr.ac, dsg.b, dsg.a),
                     nk.a().a(drr.ac, dsg.b, dsg.a).a(drr.ad, dsg.b, dsg.a),
                     nk.a().a(drr.ad, dsg.b, dsg.a).a(drr.ab, dsg.b, dsg.a)
                  ),
                  np.a().a(nq.c, nu.a("redstone_dust_dot"))
               )
               .a(nk.a().a(drr.ab, dsg.b, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_side0")))
               .a(nk.a().a(drr.ac, dsg.b, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_side_alt0")))
               .a(nk.a().a(drr.aa, dsg.b, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_side_alt1")).a(nq.b, nq.a.d))
               .a(nk.a().a(drr.ad, dsg.b, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_side1")).a(nq.b, nq.a.d))
               .a(nk.a().a(drr.ab, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_up")))
               .a(nk.a().a(drr.aa, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.ac, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.c))
               .a(nk.a().a(drr.ad, dsg.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.d))
         );
   }

   private void t() {
      this.a(ctr.lL);
      this.b
         .accept(
            nm.a(dea.gY)
               .a(c())
               .a(
                  nn.a(drr.bd, drr.w)
                     .a(dru.a, false, np.a().a(nq.c, nu.a(dea.gY)))
                     .a(dru.a, true, np.a().a(nq.c, nu.a(dea.gY, "_on")))
                     .a(dru.b, false, np.a().a(nq.c, nu.a(dea.gY, "_subtract")))
                     .a(dru.b, true, np.a().a(nq.c, nu.a(dea.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      nx $$0 = nx.a(dea.jR);
      nx $$1 = nx.a(nx.a(dea.jE, "_side"), $$0.a(ny.f));
      akm $$2 = nw.ab.a(dea.jE, $$1, this.c);
      akm $$3 = nw.ac.a(dea.jE, $$1, this.c);
      akm $$4 = nw.j.b(dea.jE, "_double", $$1, this.c);
      this.b.accept(e(dea.jE, $$2, $$3, $$4));
      this.b.accept(c(dea.jR, nw.c.a(dea.jR, $$0, this.c)));
   }

   private void v() {
      this.a(ctr.sq);
      this.b
         .accept(
            nl.a(dea.fs)
               .a(np.a().a(nq.c, nx.G(dea.fs)))
               .a(nk.a().a(drr.k, true), np.a().a(nq.c, nx.a(dea.fs, "_bottle0")))
               .a(nk.a().a(drr.l, true), np.a().a(nq.c, nx.a(dea.fs, "_bottle1")))
               .a(nk.a().a(drr.m, true), np.a().a(nq.c, nx.a(dea.fs, "_bottle2")))
               .a(nk.a().a(drr.k, false), np.a().a(nq.c, nx.a(dea.fs, "_empty0")))
               .a(nk.a().a(drr.l, false), np.a().a(nq.c, nx.a(dea.fs, "_empty1")))
               .a(nk.a().a(drr.m, false), np.a().a(nq.c, nx.a(dea.fs, "_empty2")))
         );
   }

   private void u(ddy $$0) {
      akm $$1 = nw.bp.a($$0, nx.b($$0), this.c);
      akm $$2 = nu.a("mushroom_block_inside");
      this.b
         .accept(
            nl.a($$0)
               .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$1))
               .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drr.J, true), np.a().a(nq.c, $$1).a(nq.a, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drr.K, true), np.a().a(nq.c, $$1).a(nq.a, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drr.L, false), np.a().a(nq.c, $$2))
               .a(nk.a().a(drr.M, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, false))
               .a(nk.a().a(drr.N, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, false))
               .a(nk.a().a(drr.O, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, false))
               .a(nk.a().a(drr.J, false), np.a().a(nq.c, $$2).a(nq.a, nq.a.d).a(nq.d, false))
               .a(nk.a().a(drr.K, false), np.a().a(nq.c, $$2).a(nq.a, nq.a.b).a(nq.d, false))
         );
      this.a($$0, nz.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(ctr.rB);
      this.b
         .accept(
            nm.a(dea.eg)
               .a(
                  nn.a(drr.ay)
                     .a(0, np.a().a(nq.c, nu.a(dea.eg)))
                     .a(1, np.a().a(nq.c, nu.a(dea.eg, "_slice1")))
                     .a(2, np.a().a(nq.c, nu.a(dea.eg, "_slice2")))
                     .a(3, np.a().a(nq.c, nu.a(dea.eg, "_slice3")))
                     .a(4, np.a().a(nq.c, nu.a(dea.eg, "_slice4")))
                     .a(5, np.a().a(nq.c, nu.a(dea.eg, "_slice5")))
                     .a(6, np.a().a(nq.c, nu.a(dea.eg, "_slice6")))
               )
         );
   }

   private void x() {
      nx $$0 = new nx()
         .a(ny.c, nx.a(dea.nX, "_side3"))
         .a(ny.o, nx.G(dea.t))
         .a(ny.n, nx.a(dea.nX, "_top"))
         .a(ny.j, nx.a(dea.nX, "_side3"))
         .a(ny.l, nx.a(dea.nX, "_side3"))
         .a(ny.k, nx.a(dea.nX, "_side1"))
         .a(ny.m, nx.a(dea.nX, "_side2"));
      this.b.accept(c(dea.nX, nw.a.a(dea.nX, $$0, this.c)));
   }

   private void y() {
      nx $$0 = new nx()
         .a(ny.c, nx.a(dea.ob, "_front"))
         .a(ny.o, nx.a(dea.ob, "_bottom"))
         .a(ny.n, nx.a(dea.ob, "_top"))
         .a(ny.j, nx.a(dea.ob, "_front"))
         .a(ny.k, nx.a(dea.ob, "_front"))
         .a(ny.l, nx.a(dea.ob, "_side"))
         .a(ny.m, nx.a(dea.ob, "_side"));
      this.b.accept(c(dea.ob, nw.a.a(dea.ob, $$0, this.c)));
   }

   private void a(ddy $$0, ddy $$1, BiFunction<ddy, ddy, nx> $$2) {
      nx $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, nw.a.a($$0, $$3, this.c)));
   }

   public void b(ddy $$0) {
      nx $$1 = new nx()
         .a(ny.c, nx.a($$0, "_particle"))
         .a(ny.o, nx.a($$0, "_down"))
         .a(ny.n, nx.a($$0, "_up"))
         .a(ny.j, nx.a($$0, "_north"))
         .a(ny.k, nx.a($$0, "_south"))
         .a(ny.l, nx.a($$0, "_east"))
         .a(ny.m, nx.a($$0, "_west"));
      this.b.accept(c($$0, nw.a.a($$0, $$1, this.c)));
   }

   private void z() {
      nx $$0 = nx.k(dea.eZ);
      this.b.accept(c(dea.eZ, nu.a(dea.eZ)));
      this.a(dea.ee, $$0);
      this.a(dea.ef, $$0);
   }

   private void a(ddy $$0, nx $$1) {
      akm $$2 = nw.p.a($$0, $$1.c(ny.g, nx.G($$0)), this.c);
      this.b.accept(nm.a($$0, np.a().a(nq.c, $$2)).a(b()));
   }

   private void A() {
      this.a(ctr.sr);
      this.m(dea.ft);
      this.b.accept(c(dea.fv, nw.bs.a(dea.fv, nx.j(nx.a(dea.H, "_still")), this.c)));
      this.b
         .accept(
            nm.a(dea.fu)
               .a(
                  nn.a(dih.g)
                     .a(1, np.a().a(nq.c, nw.bq.a(dea.fu, "_level1", nx.j(nx.a(dea.G, "_still")), this.c)))
                     .a(2, np.a().a(nq.c, nw.br.a(dea.fu, "_level2", nx.j(nx.a(dea.G, "_still")), this.c)))
                     .a(3, np.a().a(nq.c, nw.bs.a(dea.fu, "_full", nx.j(nx.a(dea.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nm.a(dea.fw)
               .a(
                  nn.a(dih.g)
                     .a(1, np.a().a(nq.c, nw.bq.a(dea.fw, "_level1", nx.j(nx.G(dea.qP)), this.c)))
                     .a(2, np.a().a(nq.c, nw.br.a(dea.fw, "_level2", nx.j(nx.G(dea.qP)), this.c)))
                     .a(3, np.a().a(nq.c, nw.bs.a(dea.fw, "_full", nx.j(nx.G(dea.qP)), this.c)))
               )
         );
   }

   private void B() {
      nx $$0 = nx.b(dea.kv);
      akm $$1 = nw.aE.a(dea.kv, $$0, this.c);
      akm $$2 = this.a(dea.kv, "_dead", nw.aE, $$1x -> $$0.c(ny.b, $$1x));
      this.b.accept(nm.a(dea.kv).a(a(drr.au, 5, $$2, $$1)));
   }

   private void C() {
      akm $$0 = nu.a(dea.tq);
      akm $$1 = nu.a(dea.tq, "_triggered");
      akm $$2 = nu.a(dea.tq, "_crafting");
      akm $$3 = nu.a(dea.tq, "_crafting_triggered");
      this.b
         .accept(
            nm.a(dea.tq)
               .a(nn.a(drr.T).a($$0x -> this.a($$0x, np.a())))
               .a(
                  nn.a(drr.A, dfr.b)
                     .a(false, false, np.a().a(nq.c, $$0))
                     .a(true, true, np.a().a(nq.c, $$3))
                     .a(true, false, np.a().a(nq.c, $$1))
                     .a(false, true, np.a().a(nq.c, $$2))
               )
         );
   }

   private void v(ddy $$0) {
      nx $$1 = new nx().a(ny.f, nx.a(dea.cD, "_top")).a(ny.i, nx.a(dea.cD, "_side")).a(ny.g, nx.a($$0, "_front"));
      nx $$2 = new nx().a(ny.i, nx.a(dea.cD, "_top")).a(ny.g, nx.a($$0, "_front_vertical"));
      akm $$3 = nw.p.a($$0, $$1, this.c);
      akm $$4 = nw.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drr.P)
                     .a(it.a, np.a().a(nq.c, $$4).a(nq.a, nq.a.c))
                     .a(it.b, np.a().a(nq.c, $$4))
                     .a(it.c, np.a().a(nq.c, $$3))
                     .a(it.f, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
                     .a(it.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
                     .a(it.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               )
         );
   }

   private void D() {
      akm $$0 = nu.a(dea.fy);
      akm $$1 = nu.a(dea.fy, "_filled");
      this.b.accept(nm.a(dea.fy).a(nn.a(drr.h).a(false, np.a().a(nq.c, $$0)).a(true, np.a().a(nq.c, $$1))).a(c()));
   }

   private void E() {
      akm $$0 = nu.a(dea.ku, "_side");
      akm $$1 = nu.a(dea.ku, "_noside");
      akm $$2 = nu.a(dea.ku, "_noside1");
      akm $$3 = nu.a(dea.ku, "_noside2");
      akm $$4 = nu.a(dea.ku, "_noside3");
      this.b
         .accept(
            nl.a(dea.ku)
               .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$0))
               .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.d, true))
               .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drr.J, true), np.a().a(nq.c, $$0).a(nq.a, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drr.K, true), np.a().a(nq.c, $$0).a(nq.a, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drr.L, false), np.a().a(nq.c, $$1).a(nq.e, 2), np.a().a(nq.c, $$2), np.a().a(nq.c, $$3), np.a().a(nq.c, $$4))
               .a(
                  nk.a().a(drr.M, false),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.b).a(nq.d, true)
               )
               .a(
                  nk.a().a(drr.N, false),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true)
               )
               .a(
                  nk.a().a(drr.O, false),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true)
               )
               .a(
                  nk.a().a(drr.J, false),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.a, nq.a.d).a(nq.d, true)
               )
               .a(
                  nk.a().a(drr.K, false),
                  np.a().a(nq.c, $$4).a(nq.a, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.a, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.a, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.a, nq.a.b).a(nq.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            nl.a(dea.pc)
               .a(np.a().a(nq.c, nx.G(dea.pc)))
               .a(nk.a().a(drr.aL, 1), np.a().a(nq.c, nx.a(dea.pc, "_contents1")))
               .a(nk.a().a(drr.aL, 2), np.a().a(nq.c, nx.a(dea.pc, "_contents2")))
               .a(nk.a().a(drr.aL, 3), np.a().a(nq.c, nx.a(dea.pc, "_contents3")))
               .a(nk.a().a(drr.aL, 4), np.a().a(nq.c, nx.a(dea.pc, "_contents4")))
               .a(nk.a().a(drr.aL, 5), np.a().a(nq.c, nx.a(dea.pc, "_contents5")))
               .a(nk.a().a(drr.aL, 6), np.a().a(nq.c, nx.a(dea.pc, "_contents6")))
               .a(nk.a().a(drr.aL, 7), np.a().a(nq.c, nx.a(dea.pc, "_contents7")))
               .a(nk.a().a(drr.aL, 8), np.a().a(nq.c, nx.a(dea.pc, "_contents_ready")))
         );
   }

   private void w(ddy $$0) {
      akm $$1 = nw.c.a($$0, nx.a($$0), this.c);
      akm $$2 = this.a($$0, "_powered", nw.c, nx::b);
      akm $$3 = this.a($$0, "_lit", nw.c, nx::b);
      akm $$4 = this.a($$0, "_lit_powered", nw.c, nx::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nj a(ddy $$0, akm $$1, akm $$2, akm $$3, akm $$4) {
      return nm.a($$0).a(nn.a(drr.r, drr.w).a(($$4x, $$5) -> $$4x ? np.a().a(nq.c, $$5 ? $$4 : $$2) : np.a().a(nq.c, $$5 ? $$3 : $$1)));
   }

   private void i(ddy $$0, ddy $$1) {
      akm $$2 = nu.a($$0);
      akm $$3 = nu.a($$0, "_powered");
      akm $$4 = nu.a($$0, "_lit");
      akm $$5 = nu.a($$0, "_lit_powered");
      this.a($$1, nu.a($$0.q()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(ddy $$0) {
      this.c($$0);
      this.b.accept(nm.a($$0, np.a().a(nq.c, nw.ao.a($$0, nx.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dea.qy);
      this.x(dea.qx);
      this.x(dea.qw);
      this.x(dea.qv);
   }

   private void H() {
      this.c(dea.st);
      nn.b<it, dry> $$0 = nn.a(drr.bm, drr.bn);

      for (dry $$1 : dry.values()) {
         $$0.a(it.b, $$1, this.a(it.b, $$1));
      }

      for (dry $$2 : dry.values()) {
         $$0.a(it.a, $$2, this.a(it.a, $$2));
      }

      this.b.accept(nm.a(dea.st).a($$0));
   }

   private np a(it $$0, dry $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      nx $$3 = nx.c(nx.a(dea.st, $$2));
      return np.a().a(nq.c, nw.an.a(dea.st, $$2, $$3, this.c));
   }

   private void y(ddy $$0) {
      nx $$1 = new nx().a(ny.e, nx.G(dea.dV)).a(ny.f, nx.G($$0)).a(ny.i, nx.a($$0, "_side"));
      this.b.accept(c($$0, nw.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akm $$0 = nx.a(dea.gZ, "_side");
      nx $$1 = new nx().a(ny.f, nx.a(dea.gZ, "_top")).a(ny.i, $$0);
      nx $$2 = new nx().a(ny.f, nx.a(dea.gZ, "_inverted_top")).a(ny.i, $$0);
      this.b
         .accept(
            nm.a(dea.gZ)
               .a(nn.a(drr.p).a(false, np.a().a(nq.c, nw.aF.a(dea.gZ, $$1, this.c))).a(true, np.a().a(nq.c, nw.aF.a(nu.a(dea.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(ddy $$0) {
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(this.n()));
   }

   private void J() {
      ddy $$0 = dea.ss;
      akm $$1 = nu.a($$0, "_on");
      akm $$2 = nu.a($$0);
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(this.n()).a(a(drr.w, $$1, $$2)));
   }

   private void K() {
      nx $$0 = new nx().a(ny.B, nx.G(dea.j)).a(ny.f, nx.G(dea.cC));
      nx $$1 = new nx().a(ny.B, nx.G(dea.j)).a(ny.f, nx.a(dea.cC, "_moist"));
      akm $$2 = nw.aW.a(dea.cC, $$0, this.c);
      akm $$3 = nw.aW.a(nx.a(dea.cC, "_moist"), $$1, this.c);
      this.b.accept(nm.a(dea.cC).a(a(drr.aQ, 7, $$3, $$2)));
   }

   private List<akm> A(ddy $$0) {
      akm $$1 = nw.aX.a(nu.a($$0, "_floor0"), nx.v($$0), this.c);
      akm $$2 = nw.aX.a(nu.a($$0, "_floor1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akm> B(ddy $$0) {
      akm $$1 = nw.aY.a(nu.a($$0, "_side0"), nx.v($$0), this.c);
      akm $$2 = nw.aY.a(nu.a($$0, "_side1"), nx.w($$0), this.c);
      akm $$3 = nw.aZ.a(nu.a($$0, "_side_alt0"), nx.v($$0), this.c);
      akm $$4 = nw.aZ.a(nu.a($$0, "_side_alt1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akm> C(ddy $$0) {
      akm $$1 = nw.ba.a(nu.a($$0, "_up0"), nx.v($$0), this.c);
      akm $$2 = nw.ba.a(nu.a($$0, "_up1"), nx.w($$0), this.c);
      akm $$3 = nw.bb.a(nu.a($$0, "_up_alt0"), nx.v($$0), this.c);
      akm $$4 = nw.bb.a(nu.a($$0, "_up_alt1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<np> a(List<akm> $$0, UnaryOperator<np> $$1) {
      return $$0.stream().map($$0x -> np.a().a(nq.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nk $$0 = nk.a().a(drr.L, false).a(drr.M, false).a(drr.N, false).a(drr.O, false).a(drr.J, false);
      List<akm> $$1 = this.A(dea.cr);
      List<akm> $$2 = this.B(dea.cr);
      List<akm> $$3 = this.C(dea.cr);
      this.b
         .accept(
            nl.a(dea.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nk.b(nk.a().a(drr.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nk.b(nk.a().a(drr.M, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.b)))
               .a(nk.b(nk.a().a(drr.N, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.c)))
               .a(nk.b(nk.a().a(drr.O, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.d)))
               .a(nk.a().a(drr.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akm> $$0 = this.A(dea.cs);
      List<akm> $$1 = this.B(dea.cs);
      this.b
         .accept(
            nl.a(dea.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.d)))
         );
   }

   private void D(ddy $$0) {
      akm $$1 = nz.t.create($$0, this.c);
      akm $$2 = nz.u.create($$0, this.c);
      this.a($$0.q());
      this.b.accept(nm.a($$0).a(a(drr.j, $$2, $$1)));
   }

   private void N() {
      nx $$0 = nx.a(nx.a(dea.ad, "_side"), nx.a(dea.ad, "_top"));
      akm $$1 = nw.j.a(dea.ad, $$0, this.c);
      this.b.accept(d(dea.ad, $$1));
   }

   private void O() {
      this.a(ctr.ad);
      ddy $$0 = dea.E;
      nn.b<Boolean, Integer> $$1 = nn.a(dit.d, dit.b);
      akm $$2 = nu.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akm $$4 = nu.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, np.a().a(nq.c, $$4));
         $$1.a(false, $$3, np.a().a(nq.c, $$2));
      }

      this.b.accept(nm.a(dea.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nm.a(dea.kI)
               .a(
                  nn.a(drr.as)
                     .a(0, np.a().a(nq.c, this.a(dea.kI, "_0", nw.c, nx::b)))
                     .a(1, np.a().a(nq.c, this.a(dea.kI, "_1", nw.c, nx::b)))
                     .a(2, np.a().a(nq.c, this.a(dea.kI, "_2", nw.c, nx::b)))
                     .a(3, np.a().a(nq.c, this.a(dea.kI, "_3", nw.c, nx::b)))
               )
         );
   }

   private void Q() {
      akm $$0 = nx.G(dea.j);
      nx $$1 = new nx().a(ny.e, $$0).b(ny.e, ny.c).a(ny.f, nx.a(dea.i, "_top")).a(ny.i, nx.a(dea.i, "_snow"));
      np $$2 = np.a().a(nq.c, nw.n.a(dea.i, "_snow", $$1, this.c));
      this.a(dea.i, nu.a(dea.i), $$2);
      akm $$3 = nz.f.get(dea.fl).a($$1x -> $$1x.a(ny.e, $$0)).a(dea.fl, this.c);
      this.a(dea.fl, $$3, $$2);
      akm $$4 = nz.f.get(dea.l).a($$1x -> $$1x.a(ny.e, $$0)).a(dea.l, this.c);
      this.a(dea.l, $$4, $$2);
   }

   private void a(ddy $$0, akm $$1, np $$2) {
      List<np> $$3 = Arrays.asList(a($$1));
      this.b.accept(nm.a($$0).a(nn.a(drr.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(ctr.rh);
      this.b
         .accept(
            nm.a(dea.fC)
               .a(
                  nn.a(drr.ar)
                     .a(0, np.a().a(nq.c, nu.a(dea.fC, "_stage0")))
                     .a(1, np.a().a(nq.c, nu.a(dea.fC, "_stage1")))
                     .a(2, np.a().a(nq.c, nu.a(dea.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dea.kE, nu.a(dea.kE)));
   }

   private void j(ddy $$0, ddy $$1) {
      nx $$2 = nx.b($$1);
      akm $$3 = nw.Y.a($$0, $$2, this.c);
      akm $$4 = nw.Z.a($$0, $$2, this.c);
      this.b.accept(nm.a($$0).a(a(drr.aT, 1, $$4, $$3)));
   }

   private void T() {
      akm $$0 = nu.a(dea.hc);
      akm $$1 = nu.a(dea.hc, "_side");
      this.a(ctr.lR);
      this.b
         .accept(
            nm.a(dea.hc)
               .a(
                  nn.a(drr.Q)
                     .a(it.a, np.a().a(nq.c, $$0))
                     .a(it.c, np.a().a(nq.c, $$1))
                     .a(it.f, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
                     .a(it.d, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
                     .a(it.e, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               )
         );
   }

   private void k(ddy $$0, ddy $$1) {
      akm $$2 = nu.a($$0);
      this.b.accept(nm.a($$1, np.a().a(nq.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akm $$0 = nu.a(dea.eW, "_post_ends");
      akm $$1 = nu.a(dea.eW, "_post");
      akm $$2 = nu.a(dea.eW, "_cap");
      akm $$3 = nu.a(dea.eW, "_cap_alt");
      akm $$4 = nu.a(dea.eW, "_side");
      akm $$5 = nu.a(dea.eW, "_side_alt");
      this.b
         .accept(
            nl.a(dea.eW)
               .a(np.a().a(nq.c, $$0))
               .a(nk.a().a(drr.L, false).a(drr.M, false).a(drr.N, false).a(drr.O, false), np.a().a(nq.c, $$1))
               .a(nk.a().a(drr.L, true).a(drr.M, false).a(drr.N, false).a(drr.O, false), np.a().a(nq.c, $$2))
               .a(nk.a().a(drr.L, false).a(drr.M, true).a(drr.N, false).a(drr.O, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.L, false).a(drr.M, false).a(drr.N, true).a(drr.O, false), np.a().a(nq.c, $$3))
               .a(nk.a().a(drr.L, false).a(drr.M, false).a(drr.N, false).a(drr.O, true), np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.L, true), np.a().a(nq.c, $$4))
               .a(nk.a().a(drr.M, true), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drr.N, true), np.a().a(nq.c, $$5))
               .a(nk.a().a(drr.O, true), np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
         );
      this.d(dea.eW);
   }

   private void E(ddy $$0) {
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(b()));
   }

   private void V() {
      akm $$0 = nu.a(dea.dw);
      akm $$1 = nu.a(dea.dw, "_on");
      this.d(dea.dw);
      this.b
         .accept(
            nm.a(dea.dw)
               .a(a(drr.w, $$0, $$1))
               .a(
                  nn.a(drr.U, drr.R)
                     .a(drm.c, it.c, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.c))
                     .a(drm.c, it.f, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.d))
                     .a(drm.c, it.d, np.a().a(nq.a, nq.a.c))
                     .a(drm.c, it.e, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.b))
                     .a(drm.a, it.c, np.a())
                     .a(drm.a, it.f, np.a().a(nq.b, nq.a.b))
                     .a(drm.a, it.d, np.a().a(nq.b, nq.a.c))
                     .a(drm.a, it.e, np.a().a(nq.b, nq.a.d))
                     .a(drm.b, it.c, np.a().a(nq.a, nq.a.b))
                     .a(drm.b, it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b))
                     .a(drm.b, it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
                     .a(drm.b, it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
               )
         );
   }

   private void W() {
      this.d(dea.fm);
      this.b.accept(b(dea.fm, nu.a(dea.fm)));
   }

   private void X() {
      this.d(dea.tn);
      this.b.accept(c(dea.tn, nu.a(dea.tn)));
   }

   private void Y() {
      this.b.accept(nm.a(dea.ed).a(nn.a(drr.H).a(it.a.a, np.a().a(nq.c, nu.a(dea.ed, "_ns"))).a(it.a.c, np.a().a(nq.c, nu.a(dea.ed, "_ew")))));
   }

   private void Z() {
      akm $$0 = nz.a.create(dea.dV, this.c);
      this.b
         .accept(
            nm.a(
               dea.dV,
               np.a().a(nq.c, $$0),
               np.a().a(nq.c, $$0).a(nq.a, nq.a.b),
               np.a().a(nq.c, $$0).a(nq.a, nq.a.c),
               np.a().a(nq.c, $$0).a(nq.a, nq.a.d),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.b),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.a, nq.a.b),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.a, nq.a.c),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.a, nq.a.d),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.c),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.a, nq.a.b),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.a, nq.a.c),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.a, nq.a.d),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.d),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.a, nq.a.b),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.a, nq.a.c),
               np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.a, nq.a.d)
            )
         );
   }

   private void aa() {
      akm $$0 = nu.a(dea.kO);
      akm $$1 = nu.a(dea.kO, "_on");
      this.b.accept(nm.a(dea.kO).a(a(drr.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      nx $$0 = new nx().a(ny.e, nx.a(dea.by, "_bottom")).a(ny.i, nx.a(dea.by, "_side"));
      akm $$1 = nx.a(dea.by, "_top_sticky");
      akm $$2 = nx.a(dea.by, "_top");
      nx $$3 = $$0.c(ny.E, $$1);
      nx $$4 = $$0.c(ny.E, $$2);
      akm $$5 = nu.a(dea.by, "_base");
      this.a(dea.by, $$5, $$4);
      this.a(dea.br, $$5, $$3);
      akm $$6 = nw.n.a(dea.by, "_inventory", $$0.c(ny.f, $$2), this.c);
      akm $$7 = nw.n.a(dea.br, "_inventory", $$0.c(ny.f, $$1), this.c);
      this.a(dea.by, $$6);
      this.a(dea.br, $$7);
   }

   private void a(ddy $$0, akm $$1, nx $$2) {
      akm $$3 = nw.bh.a($$0, $$2, this.c);
      this.b.accept(nm.a($$0).a(a(drr.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      nx $$0 = new nx().a(ny.F, nx.a(dea.by, "_top")).a(ny.i, nx.a(dea.by, "_side"));
      nx $$1 = $$0.c(ny.E, nx.a(dea.by, "_top_sticky"));
      nx $$2 = $$0.c(ny.E, nx.a(dea.by, "_top"));
      this.b
         .accept(
            nm.a(dea.bz)
               .a(
                  nn.a(drr.x, drr.bg)
                     .a(false, dsd.a, np.a().a(nq.c, nw.bi.a(dea.by, "_head", $$2, this.c)))
                     .a(false, dsd.b, np.a().a(nq.c, nw.bi.a(dea.by, "_head_sticky", $$1, this.c)))
                     .a(true, dsd.a, np.a().a(nq.c, nw.bj.a(dea.by, "_head_short", $$2, this.c)))
                     .a(true, dsd.b, np.a().a(nq.c, nw.bj.a(dea.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      ddy $$0 = dea.tr;
      nx $$1 = nx.a($$0, "_side_inactive", "_top_inactive");
      nx $$2 = nx.a($$0, "_side_active", "_top_active");
      nx $$3 = nx.a($$0, "_side_active", "_top_ejecting_reward");
      nx $$4 = nx.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      nx $$5 = nx.a($$0, "_side_active_ominous", "_top_active_ominous");
      nx $$6 = nx.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akm $$7 = nw.o.a($$0, $$1, this.c);
      akm $$8 = nw.o.a($$0, "_active", $$2, this.c);
      akm $$9 = nw.o.a($$0, "_ejecting_reward", $$3, this.c);
      akm $$10 = nw.o.a($$0, "_inactive_ominous", $$4, this.c);
      akm $$11 = nw.o.a($$0, "_active_ominous", $$5, this.c);
      akm $$12 = nw.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nm.a($$0).a(nn.a(drr.by, drr.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> np.a().a(nq.c, $$7x ? $$10 : $$7);
            case b, c, d -> np.a().a(nq.c, $$7x ? $$11 : $$8);
            case e -> np.a().a(nq.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      ddy $$0 = dea.ts;
      nx $$1 = nx.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nx $$2 = nx.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nx $$3 = nx.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nx $$4 = nx.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akm $$5 = nw.bN.a($$0, $$1, this.c);
      akm $$6 = nw.bN.a($$0, "_active", $$2, this.c);
      akm $$7 = nw.bN.a($$0, "_unlocking", $$3, this.c);
      akm $$8 = nw.bN.a($$0, "_ejecting_reward", $$4, this.c);
      nx $$9 = nx.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      nx $$10 = nx.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      nx $$11 = nx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      nx $$12 = nx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akm $$13 = nw.bN.a($$0, "_ominous", $$9, this.c);
      akm $$14 = nw.bN.a($$0, "_active_ominous", $$10, this.c);
      akm $$15 = nw.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      akm $$16 = nw.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nm.a($$0).a(b()).a(nn.a(dmt.b, dmt.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> np.a().a(nq.c, $$9x ? $$13 : $$5);
            case b -> np.a().a(nq.c, $$9x ? $$14 : $$6);
            case c -> np.a().a(nq.c, $$9x ? $$15 : $$7);
            case d -> np.a().a(nq.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akm $$0 = nu.a(dea.qQ, "_inactive");
      akm $$1 = nu.a(dea.qQ, "_active");
      this.a(dea.qQ, $$0);
      this.b.accept(nm.a(dea.qQ).a(nn.a(drr.bo).a($$2 -> np.a().a(nq.c, $$2 != dsi.b && $$2 != dsi.c ? $$0 : $$1))));
   }

   private void ag() {
      akm $$0 = nu.a(dea.qR, "_inactive");
      akm $$1 = nu.a(dea.qR, "_active");
      this.a(dea.qR, $$0);
      this.b.accept(nm.a(dea.qR).a(nn.a(drr.bo).a($$2 -> np.a().a(nq.c, $$2 != dsi.b && $$2 != dsi.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akm $$0 = nw.bM.a(dea.qV, nx.a(false), this.c);
      akm $$1 = nw.bM.a(dea.qV, "_can_summon", nx.a(true), this.c);
      this.a(dea.qV, $$0);
      this.b.accept(nm.a(dea.qV).a(a(drr.G, $$1, $$0)));
   }

   private void ai() {
      akm $$0 = nu.a(dea.nS, "_stable");
      akm $$1 = nu.a(dea.nS, "_unstable");
      this.a(dea.nS, $$0);
      this.b.accept(nm.a(dea.nS).a(a(drr.b, $$1, $$0)));
   }

   private void aj() {
      akm $$0 = this.a(dea.sv, "", nw.ao, nx::c);
      akm $$1 = this.a(dea.sv, "_lit", nw.ao, nx::c);
      this.b.accept(nm.a(dea.sv).a(a(drr.D, $$1, $$0)));
      akm $$2 = this.a(dea.sw, "", nw.ao, nx::c);
      akm $$3 = this.a(dea.sw, "_lit", nw.ao, nx::c);
      this.b.accept(nm.a(dea.sw).a(a(drr.D, $$3, $$2)));
   }

   private void ak() {
      akm $$0 = nz.a.create(dea.fB, this.c);
      akm $$1 = this.a(dea.fB, "_on", nw.c, nx::b);
      this.b.accept(nm.a(dea.fB).a(a(drr.r, $$1, $$0)));
   }

   private void l(ddy $$0, ddy $$1) {
      nx $$2 = nx.y($$0);
      this.b.accept(c($$0, nw.bf.a($$0, $$2, this.c)));
      this.b.accept(nm.a($$1, np.a().a(nq.c, nw.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      nx $$0 = nx.y(dea.dK);
      nx $$1 = nx.i(nx.a(dea.dK, "_off"));
      akm $$2 = nw.bf.a(dea.dK, $$0, this.c);
      akm $$3 = nw.bf.a(dea.dK, "_off", $$1, this.c);
      this.b.accept(nm.a(dea.dK).a(a(drr.r, $$2, $$3)));
      akm $$4 = nw.bg.a(dea.dL, $$0, this.c);
      akm $$5 = nw.bg.a(dea.dL, "_off", $$1, this.c);
      this.b.accept(nm.a(dea.dL).a(a(drr.r, $$4, $$5)).a(d()));
      this.d(dea.dK);
      this.c(dea.dL);
   }

   private void am() {
      this.a(ctr.lK);
      this.b.accept(nm.a(dea.eh).a(nn.a(drr.aA, drr.s, drr.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return np.a().a(nq.c, nx.a(dea.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(ctr.cT);
      this.b
         .accept(
            nm.a(dea.mV)
               .a(
                  nn.a(drr.aS, drr.C)
                     .a(1, false, Arrays.asList(a(nu.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(nu.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(nu.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(nu.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(nu.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(nu.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(nu.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(nu.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      nx $$0 = nx.a(dea.dN);
      akm $$1 = nw.c.a(dea.dP, $$0, this.c);
      this.b.accept(nm.a(dea.dN).a(nn.a(drr.aF).a($$1x -> np.a().a(nq.c, $$1x < 8 ? nu.a(dea.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dea.dN, nu.a(dea.dN, "_height2"));
      this.b.accept(c(dea.dP, $$1));
   }

   private void ap() {
      this.b.accept(nm.a(dea.oc, np.a().a(nq.c, nu.a(dea.oc))).a(b()));
   }

   private void aq() {
      akm $$0 = nz.a.create(dea.pa, this.c);
      this.a(dea.pa, $$0);
      this.b.accept(nm.a(dea.pa).a(nn.a(drr.bj).a($$0x -> np.a().a(nq.c, this.a(dea.pa, "_" + $$0x.c(), nw.c, nx::b)))));
   }

   private void ar() {
      this.a(ctr.wr);
      this.b.accept(nm.a(dea.oi).a(nn.a(drr.as).a($$0 -> np.a().a(nq.c, this.a(dea.oi, "_stage" + $$0, nw.ao, nx::c)))));
   }

   private void as() {
      this.a(ctr.ps);
      this.b
         .accept(
            nm.a(dea.fI)
               .a(
                  nn.a(drr.a, drr.M, drr.L, drr.N, drr.O)
                     .a(false, false, false, false, false, np.a().a(nq.c, nu.a(dea.fI, "_ns")))
                     .a(false, true, false, false, false, np.a().a(nq.c, nu.a(dea.fI, "_n")).a(nq.b, nq.a.b))
                     .a(false, false, true, false, false, np.a().a(nq.c, nu.a(dea.fI, "_n")))
                     .a(false, false, false, true, false, np.a().a(nq.c, nu.a(dea.fI, "_n")).a(nq.b, nq.a.c))
                     .a(false, false, false, false, true, np.a().a(nq.c, nu.a(dea.fI, "_n")).a(nq.b, nq.a.d))
                     .a(false, true, true, false, false, np.a().a(nq.c, nu.a(dea.fI, "_ne")))
                     .a(false, true, false, true, false, np.a().a(nq.c, nu.a(dea.fI, "_ne")).a(nq.b, nq.a.b))
                     .a(false, false, false, true, true, np.a().a(nq.c, nu.a(dea.fI, "_ne")).a(nq.b, nq.a.c))
                     .a(false, false, true, false, true, np.a().a(nq.c, nu.a(dea.fI, "_ne")).a(nq.b, nq.a.d))
                     .a(false, false, true, true, false, np.a().a(nq.c, nu.a(dea.fI, "_ns")))
                     .a(false, true, false, false, true, np.a().a(nq.c, nu.a(dea.fI, "_ns")).a(nq.b, nq.a.b))
                     .a(false, true, true, true, false, np.a().a(nq.c, nu.a(dea.fI, "_nse")))
                     .a(false, true, false, true, true, np.a().a(nq.c, nu.a(dea.fI, "_nse")).a(nq.b, nq.a.b))
                     .a(false, false, true, true, true, np.a().a(nq.c, nu.a(dea.fI, "_nse")).a(nq.b, nq.a.c))
                     .a(false, true, true, false, true, np.a().a(nq.c, nu.a(dea.fI, "_nse")).a(nq.b, nq.a.d))
                     .a(false, true, true, true, true, np.a().a(nq.c, nu.a(dea.fI, "_nsew")))
                     .a(true, false, false, false, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_ns")))
                     .a(true, false, true, false, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_n")))
                     .a(true, false, false, true, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_n")).a(nq.b, nq.a.c))
                     .a(true, true, false, false, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_n")).a(nq.b, nq.a.b))
                     .a(true, false, false, false, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_n")).a(nq.b, nq.a.d))
                     .a(true, true, true, false, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_ne")))
                     .a(true, true, false, true, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_ne")).a(nq.b, nq.a.b))
                     .a(true, false, false, true, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_ne")).a(nq.b, nq.a.c))
                     .a(true, false, true, false, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_ne")).a(nq.b, nq.a.d))
                     .a(true, false, true, true, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_ns")))
                     .a(true, true, false, false, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_ns")).a(nq.b, nq.a.b))
                     .a(true, true, true, true, false, np.a().a(nq.c, nu.a(dea.fI, "_attached_nse")))
                     .a(true, true, false, true, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_nse")).a(nq.b, nq.a.b))
                     .a(true, false, true, true, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_nse")).a(nq.b, nq.a.c))
                     .a(true, true, true, false, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_nse")).a(nq.b, nq.a.d))
                     .a(true, true, true, true, true, np.a().a(nq.c, nu.a(dea.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dea.fH);
      this.b.accept(nm.a(dea.fH).a(nn.a(drr.a, drr.w).a(($$0, $$1) -> np.a().a(nq.c, nx.a(dea.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akm a(int $$0, String $$1, nx $$2) {
      switch ($$0) {
         case 1:
            return nw.bl.a(nu.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return nw.bm.a(nu.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return nw.bn.a(nu.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return nw.bo.a(nu.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akm a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nx.b(nx.G(dea.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nx.b(nx.a(dea.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nx.b(nx.a(dea.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(ctr.kp);
      this.b.accept(nm.a(dea.mf).a(nn.a(drr.aD, drr.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(ctr.kq);
      Function<Integer, akm> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nx $$2 = nx.a($$1);
         return nw.bw.a(dea.mg, $$1, $$2, this.c);
      };
      this.b.accept(nm.a(dea.mg).a(nn.a(dlg.c).a($$1 -> np.a().a(nq.c, $$0.apply($$1)))));
   }

   private void F(ddy $$0) {
      this.d($$0);
      akm $$1 = nu.a($$0);
      nl $$2 = nl.a($$0);
      nk.c $$3 = ac.a(nk.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<drs, Function<akm, np>> $$4 : a) {
         drs $$5 = (drs)$$4.getFirst();
         Function<akm, np> $$6 = (Function<akm, np>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nk.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akm $$0 = nx.a(dea.qU, "_bottom");
      nx $$1 = new nx().a(ny.e, $$0).a(ny.f, nx.a(dea.qU, "_top")).a(ny.i, nx.a(dea.qU, "_side"));
      nx $$2 = new nx().a(ny.e, $$0).a(ny.f, nx.a(dea.qU, "_top_bloom")).a(ny.i, nx.a(dea.qU, "_side_bloom"));
      akm $$3 = nw.n.a(dea.qU, "", $$1, this.c);
      akm $$4 = nw.n.a(dea.qU, "_bloom", $$2, this.c);
      this.b.accept(nm.a(dea.qU).a(nn.a(drr.E).a($$2x -> np.a().a(nq.c, $$2x ? $$4 : $$3))));
      this.a(ctr.gj, $$3);
   }

   private void ax() {
      ddy $$0 = dea.cm;
      akm $$1 = nu.a($$0);
      nl $$2 = nl.a($$0);
      List.of(Pair.of(it.c, nq.a.a), Pair.of(it.f, nq.a.b), Pair.of(it.d, nq.a.c), Pair.of(it.e, nq.a.d)).forEach($$2x -> {
         it $$3 = (it)$$2x.getFirst();
         nq.a $$4 = (nq.a)$$2x.getSecond();
         nk.c $$5 = nk.a().a(drr.R, $$3);
         $$2.a($$5, np.a().a(nq.c, $$1).a(nq.b, $$4).a(nq.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nu.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nl $$0, nk.c $$1, nq.a $$2) {
      List.of(Pair.of(drr.bp, nw.aM), Pair.of(drr.bq, nw.aN), Pair.of(drr.br, nw.aO), Pair.of(drr.bs, nw.aP), Pair.of(drr.bt, nw.aQ), Pair.of(drr.bu, nw.aR))
         .forEach($$3 -> {
            drs $$4 = (drs)$$3.getFirst();
            nv $$5 = (nv)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nl $$0, nk.c $$1, nq.a $$2, drs $$3, nv $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nx $$7 = new nx().a(ny.b, nx.a(dea.cm, $$6));
      ng.d $$8 = new ng.d($$4, $$6);
      akm $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dea.cm, $$6, $$7, this.c));
      $$0.a(nk.a($$1, nk.a().a($$3, $$5)), np.a().a(nq.c, $$9).a(nq.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dea.kJ, nw.c.a(dea.kJ, nx.b(nu.a("magma")), this.c)));
   }

   private void G(ddy $$0) {
      this.b($$0, nz.q);
      nw.bD.a(nu.a($$0.q()), nx.u($$0), this.c);
   }

   private void b(ddy $$0, ddy $$1, ng.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(ddy $$0, ddy $$1) {
      nw.bE.a(nu.a($$0.q()), nx.u($$1), this.c);
   }

   private void az() {
      akm $$0 = nu.a(dea.b);
      akm $$1 = nu.a(dea.b, "_mirrored");
      this.b.accept(a(dea.eN, $$0, $$1));
      this.a(dea.eN, $$0);
   }

   private void aA() {
      akm $$0 = nu.a(dea.sJ);
      akm $$1 = nu.a(dea.sJ, "_mirrored");
      this.b.accept(a(dea.td, $$0, $$1).a(f()));
      this.a(dea.td, $$0);
   }

   private void n(ddy $$0, ddy $$1) {
      this.a($$0, ng.e.b);
      nx $$2 = nx.d(nx.a($$0, "_pot"));
      akm $$3 = ng.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akm $$0 = nx.a(dea.pl, "_bottom");
      akm $$1 = nx.a(dea.pl, "_top_off");
      akm $$2 = nx.a(dea.pl, "_top");
      akm[] $$3 = new akm[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nx $$5 = new nx().a(ny.e, $$0).a(ny.f, $$4 == 0 ? $$1 : $$2).a(ny.i, nx.a(dea.pl, "_side" + $$4));
         $$3[$$4] = nw.n.a(dea.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nm.a(dea.pl).a(nn.a(drr.aZ).a($$1x -> np.a().a(nq.c, $$3[$$1x]))));
      this.a(ctr.wP, $$3[0]);
   }

   private np a(iv $$0, np $$1) {
      switch ($$0) {
         case b:
            return $$1.a(nq.a, nq.a.b);
         case c:
            return $$1.a(nq.a, nq.a.b).a(nq.b, nq.a.c);
         case d:
            return $$1.a(nq.a, nq.a.b).a(nq.b, nq.a.d);
         case a:
            return $$1.a(nq.a, nq.a.b).a(nq.b, nq.a.b);
         case f:
            return $$1.a(nq.a, nq.a.d).a(nq.b, nq.a.c);
         case g:
            return $$1.a(nq.a, nq.a.d);
         case h:
            return $$1.a(nq.a, nq.a.d).a(nq.b, nq.a.b);
         case e:
            return $$1.a(nq.a, nq.a.d).a(nq.b, nq.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(nq.b, nq.a.c);
         case i:
            return $$1.a(nq.b, nq.a.d);
         case j:
            return $$1.a(nq.b, nq.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      akm $$0 = nx.a(dea.pb, "_top");
      akm $$1 = nx.a(dea.pb, "_bottom");
      akm $$2 = nx.a(dea.pb, "_side");
      akm $$3 = nx.a(dea.pb, "_lock");
      nx $$4 = new nx().a(ny.o, $$2).a(ny.m, $$2).a(ny.l, $$2).a(ny.c, $$0).a(ny.j, $$0).a(ny.k, $$1).a(ny.n, $$3);
      akm $$5 = nw.b.a(dea.pb, $$4, this.c);
      this.b.accept(nm.a(dea.pb, np.a().a(nq.c, $$5)).a(nn.a(drr.T).a($$0x -> this.a($$0x, np.a()))));
   }

   private void aD() {
      ddy $$0 = dea.n;
      akm $$1 = nu.a($$0);
      nz $$2 = nz.a.get($$0);
      ddy $$3 = dea.jH;
      akm $$4 = nw.ab.a($$3, $$2.b(), this.c);
      akm $$5 = nw.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lh.a().filter(li::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dea.rf).a(lh.w).a(dea.rf, dea.rD).a(dea.rj, dea.rn).a(lh.y);
      this.h(dea.re).a(lh.A).a(dea.re, dea.rC).a(dea.ri, dea.rm).a(lh.C);
      this.h(dea.rd).a(lh.E).a(dea.rd, dea.rB).a(dea.rh, dea.rl).a(lh.G);
      this.h(dea.rc).a(lh.I).a(dea.rc, dea.rA).a(dea.rg, dea.rk).a(lh.K);
      this.w(dea.sk);
      this.w(dea.sl);
      this.w(dea.sm);
      this.w(dea.sn);
      this.i(dea.sk, dea.so);
      this.i(dea.sl, dea.sp);
      this.i(dea.sm, dea.sq);
      this.i(dea.sn, dea.sr);
      this.m(dea.a);
      this.c(dea.nc, dea.a);
      this.c(dea.nb, dea.a);
      this.m(dea.fO);
      this.m(dea.dQ);
      this.c(dea.nd, dea.G);
      this.m(dea.fA);
      this.m(dea.me);
      this.m(dea.fr);
      this.m(dea.fR);
      this.a(ctr.ue);
      this.m(dea.pg);
      this.m(dea.G);
      this.m(dea.H);
      this.m(dea.hV);
      this.a(ctr.fS);
      this.o(dea.pM, dea.qd);
      this.o(dea.pN, dea.qe);
      this.o(dea.pO, dea.qf);
      this.o(dea.pP, dea.qg);
      this.o(dea.pQ, dea.qh);
      this.o(dea.pR, dea.qi);
      this.o(dea.pS, dea.qj);
      this.o(dea.pT, dea.qk);
      this.o(dea.pU, dea.ql);
      this.o(dea.pV, dea.qm);
      this.o(dea.pW, dea.qn);
      this.o(dea.pX, dea.qo);
      this.o(dea.pY, dea.qp);
      this.o(dea.pZ, dea.qq);
      this.o(dea.qa, dea.qr);
      this.o(dea.qb, dea.qs);
      this.o(dea.pL, dea.qc);
      this.m(dea.na);
      this.m(dea.gs);
      this.m(dea.qP);
      this.m(dea.sx);
      this.s(dea.sy);
      this.s(dea.sz);
      this.t(dea.ti);
      this.t(dea.tj);
      this.aj();
      this.g(dea.sC, dea.sA);
      this.p(dea.sB);
      this.a(dea.hW, ctr.hB);
      this.a(ctr.hB);
      this.aE();
      this.a(dea.kN, ctr.jb);
      this.a(ctr.jb);
      this.f(dea.bQ, nx.a(dea.by, "_side"));
      this.a(dea.R);
      this.a(dea.S);
      this.a(dea.iB);
      this.a(dea.cx);
      this.a(dea.cy);
      this.a(dea.cz);
      this.a(dea.fE);
      this.a(dea.fF);
      this.a(dea.fJ);
      this.a(dea.N);
      this.a(dea.T);
      this.a(dea.O);
      this.a(dea.ch);
      this.a(dea.P);
      this.a(dea.Q);
      this.a(dea.ci);
      this.b(dea.pj, nz.d);
      this.a(dea.pi);
      this.a(dea.aR);
      this.a(dea.aS);
      this.a(dea.aT);
      this.a(dea.hb);
      this.a(dea.dI);
      this.a(dea.dJ);
      this.a(dea.ha);
      this.a(dea.pC);
      this.a(dea.mW);
      this.a(dea.dR);
      this.a(dea.k);
      this.a(dea.pk);
      this.a(dea.fz);
      this.a(dea.ec);
      this.a(dea.L);
      this.a(dea.ph);
      this.a(dea.dO);
      this.b(dea.dT, nz.g);
      this.b(dea.pq, nz.d);
      this.b(dea.fa, nz.d);
      this.m(dea.ac);
      this.m(dea.ga);
      this.a(dea.kK);
      this.a(dea.aY);
      this.a(dea.iC);
      this.a(dea.co);
      this.a(dea.pK);
      this.a(dea.ii);
      this.a(dea.oy);
      this.a(dea.dW);
      this.a(dea.dX);
      this.b(dea.ct, nz.b);
      this.a(dea.aO);
      this.b(dea.bw, nz.v);
      this.a(ctr.cS);
      this.b(dea.ck, nz.f);
      this.b(dea.pd, nz.d);
      this.a(dea.op);
      this.a(dea.aP);
      this.a(dea.qt);
      this.a(dea.qu);
      this.a(dea.qN);
      this.a(dea.su);
      this.a(dea.tf);
      this.a(dea.tg);
      this.a(dea.th);
      this.e(dea.qS);
      this.m(dea.tt);
      this.aD();
      this.a(dea.ra);
      this.a(dea.rb);
      this.a(dea.qW);
      this.a(dea.qX);
      this.a(dea.qY);
      this.a(dea.qZ);
      this.k(dea.qW, dea.rw);
      this.k(dea.qX, dea.ry);
      this.k(dea.qY, dea.rx);
      this.k(dea.qZ, dea.rz);
      this.i(dea.rM);
      this.i(dea.rN);
      this.i(dea.rP);
      this.i(dea.rO);
      this.a(dea.rM, dea.rQ);
      this.a(dea.rN, dea.rR);
      this.a(dea.rP, dea.rT);
      this.a(dea.rO, dea.rS);
      this.k(dea.rU);
      this.k(dea.rV);
      this.k(dea.rX);
      this.k(dea.rW);
      this.b(dea.rU, dea.rY);
      this.b(dea.rV, dea.rZ);
      this.b(dea.rX, dea.sb);
      this.b(dea.rW, dea.sa);
      this.a(dea.sc);
      this.a(dea.sd);
      this.a(dea.se);
      this.a(dea.sf);
      this.k(dea.sc, dea.sg);
      this.k(dea.sd, dea.sh);
      this.k(dea.se, dea.si);
      this.k(dea.sf, dea.sj);
      this.j(dea.gW, dea.ch);
      this.j(dea.gX, dea.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dea.og, dea.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dea.kt);
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
      this.F(dea.ff);
      this.F(dea.fg);
      this.F(dea.qT);
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
      this.E(dea.cO);
      this.d(dea.cO);
      this.E(dea.oa);
      this.g();
      this.E(dea.sE);
      this.l(dea.cp, dea.cq);
      this.l(dea.ea, dea.eb);
      this.a(dea.cA, dea.n, nx::c);
      this.a(dea.nY, dea.p, nx::d);
      this.y(dea.ow);
      this.y(dea.on);
      this.v(dea.aU);
      this.v(dea.hi);
      this.C();
      this.D(dea.oe);
      this.D(dea.of);
      this.e(dea.eX, nu.a(dea.eX));
      this.a(dea.dY, nz.d);
      this.a(dea.dZ, nz.d);
      this.a(dea.te);
      this.a(dea.kM, nz.d);
      this.f(dea.j);
      this.f(dea.sH);
      this.f(dea.I);
      this.g(dea.J);
      this.g(dea.M);
      this.f(dea.K);
      this.e(dea.F);
      this.b(dea.to, nz.f);
      this.a(dea.ij, nz.d, nz.e);
      this.a(dea.kx, nz.w, nz.x);
      this.a(dea.hf, nz.w, nz.x);
      this.a(dea.tk, nz.d, nz.e);
      this.a(dea.tl, nz.d, nz.e);
      this.a(dea.tm, nz.d, nz.e);
      this.c(dea.nT, nz.i);
      this.z();
      this.a(dea.pe, nx::A);
      this.a(dea.pf, nx::C);
      this.a(dea.kD, drr.as, 0, 1, 2, 3);
      this.a(dea.gt, drr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dea.fq, drr.as, 0, 1, 1, 2);
      this.a(dea.gu, drr.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dea.cB, drr.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dea.kA, ng.e.b, drr.aq, 0, 1);
      this.i();
      this.h();
      this.a(nu.a("decorated_pot"), dea.iA).b(dea.tp);
      this.a(nu.a("banner"), dea.n)
         .a(nw.bF, dea.iJ, dea.iK, dea.iL, dea.iM, dea.iN, dea.iO, dea.iP, dea.iQ, dea.iR, dea.iS, dea.iT, dea.iU, dea.iV, dea.iW, dea.iX, dea.iY)
         .b(dea.iZ, dea.ja, dea.jb, dea.jc, dea.jd, dea.je, dea.jf, dea.jg, dea.jh, dea.ji, dea.jj, dea.jk, dea.jl, dea.jm, dea.jn, dea.jo);
      this.a(nu.a("bed"), dea.n)
         .b(dea.aZ, dea.ba, dea.bb, dea.bc, dea.bd, dea.be, dea.bf, dea.bg, dea.bh, dea.bi, dea.bj, dea.bk, dea.bl, dea.bm, dea.bn, dea.bo);
      this.m(dea.aZ, dea.bA);
      this.m(dea.ba, dea.bB);
      this.m(dea.bb, dea.bC);
      this.m(dea.bc, dea.bD);
      this.m(dea.bd, dea.bE);
      this.m(dea.be, dea.bF);
      this.m(dea.bf, dea.bG);
      this.m(dea.bg, dea.bH);
      this.m(dea.bh, dea.bI);
      this.m(dea.bi, dea.bJ);
      this.m(dea.bj, dea.bK);
      this.m(dea.bk, dea.bL);
      this.m(dea.bl, dea.bM);
      this.m(dea.bm, dea.bN);
      this.m(dea.bn, dea.bO);
      this.m(dea.bo, dea.bP);
      this.a(nu.a("skull"), dea.dW)
         .a(nw.bG, dea.gM, dea.gK, dea.gI, dea.gE, dea.gG, dea.gQ)
         .a(dea.gO)
         .b(dea.gN, dea.gP, dea.gL, dea.gJ, dea.gF, dea.gH, dea.gR);
      this.G(dea.kP);
      this.G(dea.kQ);
      this.G(dea.kR);
      this.G(dea.kS);
      this.G(dea.kT);
      this.G(dea.kU);
      this.G(dea.kV);
      this.G(dea.kW);
      this.G(dea.kX);
      this.G(dea.kY);
      this.G(dea.kZ);
      this.G(dea.la);
      this.G(dea.lb);
      this.G(dea.lc);
      this.G(dea.ld);
      this.G(dea.le);
      this.G(dea.lf);
      this.b(dea.mX, nz.q);
      this.c(dea.mX);
      this.a(nu.a("chest"), dea.n).b(dea.cv, dea.gV);
      this.a(nu.a("ender_chest"), dea.co).b(dea.fG);
      this.f(dea.fx, dea.co).a(dea.fx, dea.kF);
      this.a(dea.aM);
      this.a(dea.aN);
      this.a(dea.lw);
      this.a(dea.lx);
      this.a(dea.ly);
      this.a(dea.lz);
      this.a(dea.lA);
      this.a(dea.lB);
      this.a(dea.lC);
      this.a(dea.lD);
      this.a(dea.lE);
      this.a(dea.lF);
      this.a(dea.lG);
      this.a(dea.lH);
      this.a(dea.lI);
      this.a(dea.lJ);
      this.a(dea.lK);
      this.a(dea.lL);
      this.a(nz.a, dea.lM, dea.lN, dea.lO, dea.lP, dea.lQ, dea.lR, dea.lS, dea.lT, dea.lU, dea.lV, dea.lW, dea.lX, dea.lY, dea.lZ, dea.ma, dea.mb);
      this.a(dea.iA);
      this.a(dea.hj);
      this.a(dea.hk);
      this.a(dea.hl);
      this.a(dea.hm);
      this.a(dea.hn);
      this.a(dea.ho);
      this.a(dea.hp);
      this.a(dea.hq);
      this.a(dea.hr);
      this.a(dea.hs);
      this.a(dea.ht);
      this.a(dea.hu);
      this.a(dea.hv);
      this.a(dea.hw);
      this.a(dea.hx);
      this.a(dea.hy);
      this.a(dea.qO);
      this.h(dea.aQ, dea.eY);
      this.h(dea.ei, dea.hz);
      this.h(dea.ej, dea.hA);
      this.h(dea.ek, dea.hB);
      this.h(dea.el, dea.hC);
      this.h(dea.em, dea.hD);
      this.h(dea.en, dea.hE);
      this.h(dea.eo, dea.hF);
      this.h(dea.ep, dea.hG);
      this.h(dea.eq, dea.hH);
      this.h(dea.er, dea.hI);
      this.h(dea.es, dea.hJ);
      this.h(dea.et, dea.hK);
      this.h(dea.eu, dea.hL);
      this.h(dea.ev, dea.hM);
      this.h(dea.ew, dea.hN);
      this.h(dea.ex, dea.hO);
      this.b(nz.o, dea.lg, dea.lh, dea.li, dea.lj, dea.lk, dea.ll, dea.lm, dea.ln, dea.lo, dea.lp, dea.lq, dea.lr, dea.ls, dea.lt, dea.lu, dea.lv);
      this.g(dea.bA, dea.ik);
      this.g(dea.bB, dea.il);
      this.g(dea.bC, dea.im);
      this.g(dea.bD, dea.in);
      this.g(dea.bE, dea.io);
      this.g(dea.bF, dea.ip);
      this.g(dea.bG, dea.iq);
      this.g(dea.bH, dea.ir);
      this.g(dea.bI, dea.is);
      this.g(dea.bJ, dea.it);
      this.g(dea.bK, dea.iu);
      this.g(dea.bL, dea.iv);
      this.g(dea.bM, dea.iw);
      this.g(dea.bN, dea.ix);
      this.g(dea.bO, dea.iy);
      this.g(dea.bP, dea.iz);
      this.a(dea.sI);
      this.a(dea.eL);
      this.a(dea.bu, dea.gb, ng.e.a);
      this.a(dea.bR, dea.gc, ng.e.b);
      this.a(dea.bT, dea.gd, ng.e.b);
      this.a(dea.bU, dea.ge, ng.e.b);
      this.a(dea.bV, dea.gf, ng.e.b);
      this.a(dea.bW, dea.gg, ng.e.b);
      this.a(dea.bX, dea.gh, ng.e.b);
      this.a(dea.bY, dea.gi, ng.e.b);
      this.a(dea.bZ, dea.gj, ng.e.b);
      this.a(dea.ca, dea.gk, ng.e.b);
      this.a(dea.cb, dea.gl, ng.e.b);
      this.a(dea.cc, dea.gm, ng.e.b);
      this.a(dea.ce, dea.gn, ng.e.b);
      this.a(dea.cd, dea.go, ng.e.b);
      this.a(dea.cg, dea.gp, ng.e.b);
      this.a(dea.cf, dea.gq, ng.e.b);
      this.a(dea.bv, dea.gr, ng.e.b);
      this.a(dea.bS, dea.fS, ng.e.b);
      this.H();
      this.u(dea.eT);
      this.u(dea.eU);
      this.u(dea.eV);
      this.a(dea.bt, ng.e.a);
      this.b(dea.dS, ng.e.a);
      this.a(ctr.dJ);
      this.b(dea.mc, dea.md, ng.e.b);
      this.a(ctr.dK);
      this.c(dea.md);
      this.b(dea.sG, ng.e.b);
      this.c(dea.sG);
      this.c(dea.sw);
      this.b(dea.oz, dea.oA, ng.e.b);
      this.b(dea.oB, dea.oC, ng.e.b);
      this.a(dea.oz, "_plant");
      this.c(dea.oA);
      this.a(dea.oB, "_plant");
      this.c(dea.oC);
      this.a(dea.mY, ng.e.a, nx.c(nx.a(dea.mZ, "_stage0")));
      this.m();
      this.a(dea.bs, ng.e.b);
      this.c(dea.iE, ng.e.b);
      this.c(dea.iF, ng.e.b);
      this.c(dea.iG, ng.e.b);
      this.c(dea.iH, ng.e.a);
      this.c(dea.iI, ng.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dea.mw, dea.mr, dea.mm, dea.mh, dea.mG, dea.mB, dea.mQ, dea.mL);
      this.a(dea.mx, dea.ms, dea.mn, dea.mi, dea.mH, dea.mC, dea.mR, dea.mM);
      this.a(dea.my, dea.mt, dea.mo, dea.mj, dea.mI, dea.mD, dea.mS, dea.mN);
      this.a(dea.mz, dea.mu, dea.mp, dea.mk, dea.mJ, dea.mE, dea.mT, dea.mO);
      this.a(dea.mA, dea.mv, dea.mq, dea.ml, dea.mK, dea.mF, dea.mU, dea.mP);
      this.e(dea.fe, dea.fc);
      this.e(dea.fd, dea.fb);
      this.l(dea.ab).c(dea.ab).a(dea.av);
      this.l(dea.am).c(dea.am).a(dea.aD);
      this.a(dea.am, dea.dj, dea.ds);
      this.b(dea.aL, nz.s);
      this.l(dea.Y).c(dea.Y).a(dea.as);
      this.l(dea.ai).c(dea.ai).a(dea.aA);
      this.a(dea.ai, dea.dd, dea.do);
      this.a(dea.B, dea.fX, ng.e.b);
      this.b(dea.aI, nz.s);
      this.l(dea.Z).d(dea.Z).a(dea.at);
      this.l(dea.aj).d(dea.aj).a(dea.aB);
      this.a(dea.aj, dea.de, dea.dp);
      this.a(dea.C, dea.fY, ng.e.b);
      this.b(dea.aJ, nz.s);
      this.l(dea.W).c(dea.W).a(dea.aq);
      this.l(dea.ag).c(dea.ag).a(dea.ay);
      this.a(dea.ag, dea.dc, dea.dn);
      this.a(dea.z, dea.fV, ng.e.b);
      this.b(dea.aG, nz.s);
      this.l(dea.U).c(dea.U).a(dea.ao);
      this.l(dea.al).c(dea.al).a(dea.aw);
      this.a(dea.al, dea.da, dea.dl);
      this.a(dea.x, dea.fT, ng.e.b);
      this.b(dea.aE, nz.s);
      this.l(dea.V).c(dea.V).a(dea.ap);
      this.l(dea.af).c(dea.af).a(dea.ax);
      this.a(dea.af, dea.db, dea.dm);
      this.a(dea.y, dea.fU, ng.e.b);
      this.b(dea.aF, nz.s);
      this.l(dea.aa).c(dea.aa).a(dea.au);
      this.l(dea.ak).c(dea.ak).a(dea.aC);
      this.a(dea.ak, dea.dg, dea.dr);
      this.a(dea.D, dea.fZ, ng.e.b);
      this.b(dea.aK, nz.s);
      this.l(dea.X).c(dea.X).a(dea.ar);
      this.l(dea.ah).c(dea.ah).a(dea.az);
      this.a(dea.ah, dea.df, dea.dq);
      this.a(dea.A, dea.fW, ng.e.b);
      this.b(dea.aH, nz.s);
      this.l(dea.os).b(dea.os).a(dea.ou);
      this.l(dea.ot).b(dea.ot).a(dea.ov);
      this.a(dea.ot, dea.dh, dea.dt);
      this.a(dea.ox, dea.pm, ng.e.b);
      this.n(dea.oD, dea.po);
      this.l(dea.oj).b(dea.oj).a(dea.ol);
      this.l(dea.ok).b(dea.ok).a(dea.om);
      this.a(dea.ok, dea.di, dea.du);
      this.a(dea.oo, dea.pn, ng.e.b);
      this.n(dea.oq, dea.pp);
      this.l(dea.ae).d(dea.ae);
      this.l(dea.an).d(dea.an);
      this.a(dea.v, dea.dk, dea.dv);
      this.b(dea.or, ng.e.b);
      this.a(ctr.dG);
      this.i(dea.dy);
      this.k(dea.hY);
      this.u();
      this.n(dea.cP);
      this.o(dea.bp);
      this.o(dea.bq);
      this.o(dea.hh);
      this.t();
      this.q(dea.fN);
      this.q(dea.kG);
      this.q(dea.kH);
      this.r(dea.gS);
      this.r(dea.gT);
      this.r(dea.gU);
      this.o();
      this.p();
      this.d(dea.cD, nz.h);
      this.d(dea.nW, nz.h);
      this.d(dea.nV, nz.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dea.eK, dea.eS);
      this.k(dea.m, dea.eO);
      this.k(dea.eJ, dea.eR);
      this.k(dea.eI, dea.eQ);
      this.az();
      this.k(dea.eH, dea.eP);
      this.aA();
      cuv.h().forEach($$0 -> this.a($$0, nu.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dea.hX);
      nn.a<Integer> $$0 = nn.a(drr.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akm $$3 = nx.a(ctr.hC, $$2);
         $$0.a($$1, np.a().a(nq.c, nw.aa.a(dea.hX, $$2, nx.h($$3), this.c)));
         nw.bx.a(nu.a(ctr.hC, $$2), nx.k($$3), this.c);
      }

      this.b.accept(nm.a(dea.hX).a($$0));
   }

   private void o(ddy $$0, ddy $$1) {
      this.a($$0.q());
      nx $$2 = nx.b(nx.G($$0));
      nx $$3 = nx.b(nx.a($$0, "_lit"));
      akm $$4 = nw.bH.a($$0, "_one_candle", $$2, this.c);
      akm $$5 = nw.bI.a($$0, "_two_candles", $$2, this.c);
      akm $$6 = nw.bJ.a($$0, "_three_candles", $$2, this.c);
      akm $$7 = nw.bK.a($$0, "_four_candles", $$2, this.c);
      akm $$8 = nw.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akm $$9 = nw.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akm $$10 = nw.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akm $$11 = nw.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drr.az, drr.r)
                     .a(1, false, np.a().a(nq.c, $$4))
                     .a(2, false, np.a().a(nq.c, $$5))
                     .a(3, false, np.a().a(nq.c, $$6))
                     .a(4, false, np.a().a(nq.c, $$7))
                     .a(1, true, np.a().a(nq.c, $$8))
                     .a(2, true, np.a().a(nq.c, $$9))
                     .a(3, true, np.a().a(nq.c, $$10))
                     .a(4, true, np.a().a(nq.c, $$11))
               )
         );
      akm $$12 = nw.bL.a($$1, nx.a($$0, false), this.c);
      akm $$13 = nw.bL.a($$1, "_lit", nx.a($$0, true), this.c);
      this.b.accept(nm.a($$1).a(a(drr.r, $$13, $$12)));
   }

   class a {
      private final akm b;

      public a(akm $$0, ddy $$1) {
         this.b = nw.aa.a($$0, nx.u($$1), ng.this.c);
      }

      public ng.a a(ddy... $$0) {
         for (ddy $$1 : $$0) {
            ng.this.b.accept(ng.c($$1, this.b));
         }

         return this;
      }

      public ng.a b(ddy... $$0) {
         for (ddy $$1 : $$0) {
            ng.this.c($$1);
         }

         return this.a($$0);
      }

      public ng.a a(nv $$0, ddy... $$1) {
         for (ddy $$2 : $$1) {
            $$0.a(nu.a($$2.q()), nx.u($$2), ng.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nx b;
      private final Map<nv, akm> c = Maps.newHashMap();
      @Nullable
      private li d;
      @Nullable
      private akm e;
      private final Set<ddy> f = new HashSet<>();

      public b(nx $$0) {
         this.b = $$0;
      }

      public ng.b a(ddy $$0, nv $$1) {
         this.e = $$1.a($$0, this.b, ng.this.c);
         if (ng.this.f.containsKey($$0)) {
            ng.this.b.accept(ng.this.f.get($$0).create($$0, this.e, this.b, ng.this.c));
         } else {
            ng.this.b.accept(ng.c($$0, this.e));
         }

         return this;
      }

      public ng.b a(ddy $$0, ddy $$1) {
         akm $$2 = nu.a($$0);
         ng.this.b.accept(ng.c($$1, $$2));
         ng.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ng.b a(ddy $$0) {
         akm $$1 = nw.s.a($$0, this.b, ng.this.c);
         akm $$2 = nw.t.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.b($$0, $$1, $$2));
         akm $$3 = nw.u.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$3);
         return this;
      }

      public ng.b b(ddy $$0) {
         akm $$1 = nw.M.a($$0, this.b, ng.this.c);
         akm $$2 = nw.N.a($$0, this.b, ng.this.c);
         akm $$3 = nw.O.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$1, $$2, $$3));
         akm $$4 = nw.P.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$4);
         return this;
      }

      public ng.b c(ddy $$0) {
         nx $$1 = nx.p($$0);
         akm $$2 = nw.D.a($$0, $$1, ng.this.c);
         akm $$3 = nw.E.a($$0, $$1, ng.this.c);
         akm $$4 = nw.F.a($$0, $$1, ng.this.c);
         akm $$5 = nw.G.a($$0, $$1, ng.this.c);
         akm $$6 = nw.H.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$2, $$3, $$4, $$5, $$6));
         akm $$7 = nw.I.a($$0, $$1, ng.this.c);
         ng.this.a($$0, $$7);
         return this;
      }

      public ng.b d(ddy $$0) {
         akm $$1 = nw.J.a($$0, this.b, ng.this.c);
         akm $$2 = nw.K.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.c($$0, $$1, $$2));
         akm $$3 = nw.L.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$3);
         return this;
      }

      public ng.b e(ddy $$0) {
         nx $$1 = nx.p($$0);
         akm $$2 = nw.R.a($$0, $$1, ng.this.c);
         akm $$3 = nw.Q.a($$0, $$1, ng.this.c);
         akm $$4 = nw.T.a($$0, $$1, ng.this.c);
         akm $$5 = nw.S.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ng.b f(ddy $$0) {
         akm $$1 = nw.V.a($$0, this.b, ng.this.c);
         akm $$2 = nw.U.a($$0, this.b, ng.this.c);
         akm $$3 = nw.X.a($$0, this.b, ng.this.c);
         akm $$4 = nw.W.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ng.b g(ddy $$0) {
         akm $$1 = nw.Y.a($$0, this.b, ng.this.c);
         akm $$2 = nw.Z.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.e($$0, $$1, $$2));
         return this;
      }

      public ng.b h(ddy $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            ddy $$1 = this.d.b().get(li.b.r);
            akm $$2 = nw.aa.a($$0, this.b, ng.this.c);
            ng.this.b.accept(ng.c($$0, $$2));
            ng.this.b.accept(ng.c($$1, $$2));
            ng.this.a($$0.q());
            ng.this.c($$1);
            return this;
         }
      }

      public ng.b i(ddy $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akm $$1 = this.a(nw.ab, $$0);
            akm $$2 = this.a(nw.ac, $$0);
            ng.this.b.accept(ng.e($$0, $$1, $$2, this.e));
            ng.this.a($$0, $$1);
            return this;
         }
      }

      public ng.b j(ddy $$0) {
         akm $$1 = this.a(nw.af, $$0);
         akm $$2 = this.a(nw.ae, $$0);
         akm $$3 = this.a(nw.ag, $$0);
         ng.this.b.accept(ng.b($$0, $$1, $$2, $$3));
         ng.this.a($$0, $$2);
         return this;
      }

      private ng.b k(ddy $$0) {
         nz $$1 = ng.this.g.getOrDefault($$0, nz.a.get($$0));
         akm $$2 = $$1.a($$0, ng.this.c);
         ng.this.b.accept(ng.c($$0, $$2));
         return this;
      }

      private ng.b l(ddy $$0) {
         ng.this.i($$0);
         return this;
      }

      private void m(ddy $$0) {
         if (ng.this.e.contains($$0)) {
            ng.this.k($$0);
         } else {
            ng.this.j($$0);
         }
      }

      private akm a(nv $$0, ddy $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ng.this.c));
      }

      public ng.b a(li $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ng.b, ddy> $$2 = ng.h.get($$0x);
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
      nj create(ddy var1, akm var2, nx var3, BiConsumer<akm, Supplier<JsonElement>> var4);
   }

   static record d(nv a, String b) {
   }

   static enum e {
      a,
      b;

      public nv a() {
         return this == a ? nw.ap : nw.ao;
      }

      public nv b() {
         return this == a ? nw.ar : nw.aq;
      }
   }

   class f {
      private final nx b;

      public f(nx $$0) {
         this.b = $$0;
      }

      public ng.f a(ddy $$0) {
         nx $$1 = this.b.c(ny.d, this.b.a(ny.i));
         akm $$2 = nw.j.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$2));
         return this;
      }

      public ng.f b(ddy $$0) {
         akm $$1 = nw.j.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$1));
         return this;
      }

      public ng.f c(ddy $$0) {
         akm $$1 = nw.j.a($$0, this.b, ng.this.c);
         akm $$2 = nw.k.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$1, $$2));
         return this;
      }

      public ng.f d(ddy $$0) {
         ng.this.b.accept(ng.a($$0, this.b, ng.this.c));
         return this;
      }
   }
}
