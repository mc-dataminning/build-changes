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
   final BiConsumer<akn, Supplier<JsonElement>> c;
   private final Consumer<ctl> d;
   final List<dea> e = ImmutableList.of(dec.ey, dec.eE, dec.hY);
   final Map<dea, ng.c> f = ImmutableMap.builder().put(dec.b, ng::a).put(dec.sJ, ng::c).put(dec.eM, ng::b).build();
   final Map<dea, nz> g = ImmutableMap.builder()
      .put(dec.aV, nz.y.get(dec.aV))
      .put(dec.jp, nz.y.get(dec.jp))
      .put(dec.jS, nz.a(nx.a(dec.aV, "_top")))
      .put(dec.jU, nz.a(nx.a(dec.jp, "_top")))
      .put(dec.aX, nz.d.get(dec.aV).a($$0x -> $$0x.a(ny.i, nx.G(dec.aX))))
      .put(dec.jr, nz.d.get(dec.jp).a($$0x -> $$0x.a(ny.i, nx.G(dec.jr))))
      .put(dec.hd, nz.d.get(dec.hd))
      .put(dec.jT, nz.a(nx.a(dec.hd, "_bottom")))
      .put(dec.pr, nz.z.get(dec.pr))
      .put(dec.sJ, nz.z.get(dec.sJ))
      .put(dec.he, nz.d.get(dec.he).a($$0x -> $$0x.a(ny.i, nx.G(dec.he))))
      .put(dec.aW, nz.d.get(dec.aW).a($$0x -> {
         $$0x.a(ny.d, nx.a(dec.aV, "_top"));
         $$0x.a(ny.i, nx.G(dec.aW));
      }))
      .put(dec.jq, nz.d.get(dec.jq).a($$0x -> {
         $$0x.a(ny.d, nx.a(dec.jp, "_top"));
         $$0x.a(ny.i, nx.G(dec.jq));
      }))
      .put(dec.qM, nz.z.get(dec.qM))
      .put(dec.qH, nz.z.get(dec.qH))
      .build();
   static final Map<li.b, BiConsumer<ng.b, dea>> h = ImmutableMap.builder()
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
   public static final List<Pair<dru, Function<akn, np>>> a = List.of(
      Pair.of(drt.L, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0)),
      Pair.of(drt.M, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.d, true)),
      Pair.of(drt.N, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.d, true)),
      Pair.of(drt.O, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.d, true)),
      Pair.of(drt.J, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.a, nq.a.d).a(nq.d, true)),
      Pair.of(drt.K, (Function<akn, np>)$$0 -> np.a().a(nq.c, $$0).a(nq.a, nq.a.b).a(nq.d, true))
   );
   private static final Map<ng.d, akn> i = new HashMap<>();

   private static nj a(dea $$0, akn $$1, nx $$2, BiConsumer<akn, Supplier<JsonElement>> $$3) {
      akn $$4 = nw.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nj b(dea $$0, akn $$1, nx $$2, BiConsumer<akn, Supplier<JsonElement>> $$3) {
      akn $$4 = nw.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nj c(dea $$0, akn $$1, nx $$2, BiConsumer<akn, Supplier<JsonElement>> $$3) {
      akn $$4 = nw.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public ng(Consumer<nj> $$0, BiConsumer<akn, Supplier<JsonElement>> $$1, Consumer<ctl> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(dea $$0) {
      this.d.accept($$0.r());
   }

   void a(dea $$0, akn $$1) {
      this.c.accept(nu.a($$0.r()), new nt($$1));
   }

   private void a(ctl $$0, akn $$1) {
      this.c.accept(nu.a($$0), new nt($$1));
   }

   void a(ctl $$0) {
      nw.bx.a(nu.a($$0), nx.b($$0), this.c);
   }

   private void d(dea $$0) {
      ctl $$1 = $$0.r();
      if ($$1 != ctt.a) {
         nw.bx.a(nu.a($$1), nx.F($$0), this.c);
      }
   }

   private void a(dea $$0, String $$1) {
      ctl $$2 = $$0.r();
      nw.bx.a(nu.a($$2), nx.k(nx.a($$0, $$1)), this.c);
   }

   private static nn b() {
      return nn.a(drt.R).a(it.f, np.a().a(nq.b, nq.a.b)).a(it.d, np.a().a(nq.b, nq.a.c)).a(it.e, np.a().a(nq.b, nq.a.d)).a(it.c, np.a());
   }

   private static nn c() {
      return nn.a(drt.R).a(it.d, np.a()).a(it.e, np.a().a(nq.b, nq.a.b)).a(it.c, np.a().a(nq.b, nq.a.c)).a(it.f, np.a().a(nq.b, nq.a.d));
   }

   private static nn d() {
      return nn.a(drt.R).a(it.f, np.a()).a(it.d, np.a().a(nq.b, nq.a.b)).a(it.e, np.a().a(nq.b, nq.a.c)).a(it.c, np.a().a(nq.b, nq.a.d));
   }

   private static nn e() {
      return nn.a(drt.P)
         .a(it.a, np.a().a(nq.a, nq.a.b))
         .a(it.b, np.a().a(nq.a, nq.a.d))
         .a(it.c, np.a())
         .a(it.d, np.a().a(nq.b, nq.a.c))
         .a(it.e, np.a().a(nq.b, nq.a.d))
         .a(it.f, np.a().a(nq.b, nq.a.b));
   }

   private static nm b(dea $$0, akn $$1) {
      return nm.a($$0, a($$1));
   }

   private static np[] a(akn $$0) {
      return new np[]{np.a().a(nq.c, $$0), np.a().a(nq.c, $$0).a(nq.b, nq.a.b), np.a().a(nq.c, $$0).a(nq.b, nq.a.c), np.a().a(nq.c, $$0).a(nq.b, nq.a.d)};
   }

   private static nm a(dea $$0, akn $$1, akn $$2) {
      return nm.a($$0, np.a().a(nq.c, $$1), np.a().a(nq.c, $$2), np.a().a(nq.c, $$1).a(nq.b, nq.a.c), np.a().a(nq.c, $$2).a(nq.b, nq.a.c));
   }

   private static nn a(dru $$0, akn $$1, akn $$2) {
      return nn.a($$0).a(true, np.a().a(nq.c, $$1)).a(false, np.a().a(nq.c, $$2));
   }

   private void e(dea $$0) {
      akn $$1 = nz.a.create($$0, this.c);
      akn $$2 = nz.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(dea $$0) {
      akn $$1 = nz.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(dea $$0) {
      this.b.accept(nm.a($$0).a(nn.a(drt.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         akn $$3 = nx.a($$0, $$2);
         return np.a().a(nq.c, nw.c.a($$0, $$2, new nx().a(ny.a, $$3), this.c));
      })));
      this.a($$0, nx.a($$0, "_0"));
   }

   static nj b(dea $$0, akn $$1, akn $$2) {
      return nm.a($$0)
         .a(nn.a(drt.w).a(false, np.a().a(nq.c, $$1)).a(true, np.a().a(nq.c, $$2)))
         .a(
            nn.a(drt.U, drt.R)
               .a(dro.a, it.f, np.a().a(nq.b, nq.a.b))
               .a(dro.a, it.e, np.a().a(nq.b, nq.a.d))
               .a(dro.a, it.d, np.a().a(nq.b, nq.a.c))
               .a(dro.a, it.c, np.a())
               .a(dro.b, it.f, np.a().a(nq.b, nq.a.b).a(nq.a, nq.a.b).a(nq.d, true))
               .a(dro.b, it.e, np.a().a(nq.b, nq.a.d).a(nq.a, nq.a.b).a(nq.d, true))
               .a(dro.b, it.d, np.a().a(nq.b, nq.a.c).a(nq.a, nq.a.b).a(nq.d, true))
               .a(dro.b, it.c, np.a().a(nq.a, nq.a.b).a(nq.d, true))
               .a(dro.c, it.f, np.a().a(nq.b, nq.a.d).a(nq.a, nq.a.c))
               .a(dro.c, it.e, np.a().a(nq.b, nq.a.b).a(nq.a, nq.a.c))
               .a(dro.c, it.d, np.a().a(nq.a, nq.a.c))
               .a(dro.c, it.c, np.a().a(nq.b, nq.a.c).a(nq.a, nq.a.c))
         );
   }

   private static nn.d<it, drz, dry, Boolean> a(nn.d<it, drz, dry, Boolean> $$0, drz $$1, akn $$2, akn $$3, akn $$4, akn $$5) {
      return $$0.a(it.f, $$1, dry.a, false, np.a().a(nq.c, $$2))
         .a(it.d, $$1, dry.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
         .a(it.e, $$1, dry.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
         .a(it.c, $$1, dry.a, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
         .a(it.f, $$1, dry.b, false, np.a().a(nq.c, $$4))
         .a(it.d, $$1, dry.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
         .a(it.e, $$1, dry.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
         .a(it.c, $$1, dry.b, false, np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
         .a(it.f, $$1, dry.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
         .a(it.d, $$1, dry.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
         .a(it.e, $$1, dry.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
         .a(it.c, $$1, dry.a, true, np.a().a(nq.c, $$3))
         .a(it.f, $$1, dry.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.d))
         .a(it.d, $$1, dry.b, true, np.a().a(nq.c, $$5))
         .a(it.e, $$1, dry.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
         .a(it.c, $$1, dry.b, true, np.a().a(nq.c, $$5).a(nq.b, nq.a.c));
   }

   private static nj a(dea $$0, akn $$1, akn $$2, akn $$3, akn $$4, akn $$5, akn $$6, akn $$7, akn $$8) {
      return nm.a($$0).a(a(a(nn.a(drt.R, drt.ae, drt.be, drt.u), drz.b, $$1, $$2, $$3, $$4), drz.a, $$5, $$6, $$7, $$8));
   }

   static nj a(dea $$0, akn $$1, akn $$2, akn $$3, akn $$4, akn $$5) {
      return nl.a($$0)
         .a(np.a().a(nq.c, $$1))
         .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$2).a(nq.d, false))
         .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$3).a(nq.d, false))
         .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$4).a(nq.d, false))
         .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$5).a(nq.d, false));
   }

   static nj c(dea $$0, akn $$1, akn $$2) {
      return nl.a($$0)
         .a(np.a().a(nq.c, $$1))
         .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$2).a(nq.d, true))
         .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true));
   }

   static nj a(dea $$0, akn $$1, akn $$2, akn $$3) {
      return nl.a($$0)
         .a(nk.a().a(drt.J, true), np.a().a(nq.c, $$1))
         .a(nk.a().a(drt.X, dsp.b), np.a().a(nq.c, $$2).a(nq.d, true))
         .a(nk.a().a(drt.W, dsp.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drt.Y, dsp.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drt.Z, dsp.b), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true))
         .a(nk.a().a(drt.X, dsp.c), np.a().a(nq.c, $$3).a(nq.d, true))
         .a(nk.a().a(drt.W, dsp.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
         .a(nk.a().a(drt.Y, dsp.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
         .a(nk.a().a(drt.Z, dsp.c), np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true));
   }

   static nj a(dea $$0, akn $$1, akn $$2, akn $$3, akn $$4, boolean $$5) {
      return nm.a($$0, np.a().a(nq.d, $$5))
         .a(c())
         .a(
            nn.a(drt.q, drt.u)
               .a(false, false, np.a().a(nq.c, $$2))
               .a(true, false, np.a().a(nq.c, $$4))
               .a(false, true, np.a().a(nq.c, $$1))
               .a(true, true, np.a().a(nq.c, $$3))
         );
   }

   static nj b(dea $$0, akn $$1, akn $$2, akn $$3) {
      return nm.a($$0)
         .a(
            nn.a(drt.R, drt.af, drt.bi)
               .a(it.f, dsc.b, dsm.a, np.a().a(nq.c, $$2))
               .a(it.e, dsc.b, dsm.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.b, dsm.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.b, dsm.a, np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsc.b, dsm.e, np.a().a(nq.c, $$3))
               .a(it.e, dsc.b, dsm.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.b, dsm.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.b, dsm.e, np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsc.b, dsm.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.e, dsc.b, dsm.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.d, dsc.b, dsm.d, np.a().a(nq.c, $$3))
               .a(it.c, dsc.b, dsm.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.f, dsc.b, dsm.c, np.a().a(nq.c, $$1))
               .a(it.e, dsc.b, dsm.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.b, dsm.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.b, dsm.c, np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsc.b, dsm.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.e, dsc.b, dsm.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.d, dsc.b, dsm.b, np.a().a(nq.c, $$1))
               .a(it.c, dsc.b, dsm.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.f, dsc.a, dsm.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsc.a, dsm.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.a, dsm.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.a, dsm.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsc.a, dsm.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.e, dsc.a, dsm.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.d, dsc.a, dsm.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.c, dsc.a, dsm.e, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.f, dsc.a, dsm.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsc.a, dsm.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.a, dsm.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.a, dsm.d, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.f, dsc.a, dsm.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.e, dsc.a, dsm.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
               .a(it.d, dsc.a, dsm.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.c, dsc.a, dsm.c, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.f, dsc.a, dsm.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.d, true))
               .a(it.e, dsc.a, dsm.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.c).a(nq.d, true))
               .a(it.d, dsc.a, dsm.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.b).a(nq.d, true))
               .a(it.c, dsc.a, dsm.b, np.a().a(nq.c, $$1).a(nq.a, nq.a.c).a(nq.b, nq.a.d).a(nq.d, true))
         );
   }

   private static nj c(dea $$0, akn $$1, akn $$2, akn $$3) {
      return nm.a($$0)
         .a(
            nn.a(drt.R, drt.af, drt.u)
               .a(it.c, dsc.b, false, np.a().a(nq.c, $$2))
               .a(it.d, dsc.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
               .a(it.f, dsc.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(it.e, dsc.b, false, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
               .a(it.c, dsc.a, false, np.a().a(nq.c, $$1))
               .a(it.d, dsc.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
               .a(it.f, dsc.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
               .a(it.e, dsc.a, false, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               .a(it.c, dsc.b, true, np.a().a(nq.c, $$3))
               .a(it.d, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(it.c, dsc.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.c))
               .a(it.d, dsc.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.a))
               .a(it.f, dsc.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.d))
               .a(it.e, dsc.a, true, np.a().a(nq.c, $$3).a(nq.a, nq.a.c).a(nq.b, nq.a.b))
         );
   }

   private static nj d(dea $$0, akn $$1, akn $$2, akn $$3) {
      return nm.a($$0)
         .a(
            nn.a(drt.R, drt.af, drt.u)
               .a(it.c, dsc.b, false, np.a().a(nq.c, $$2))
               .a(it.d, dsc.b, false, np.a().a(nq.c, $$2))
               .a(it.f, dsc.b, false, np.a().a(nq.c, $$2))
               .a(it.e, dsc.b, false, np.a().a(nq.c, $$2))
               .a(it.c, dsc.a, false, np.a().a(nq.c, $$1))
               .a(it.d, dsc.a, false, np.a().a(nq.c, $$1))
               .a(it.f, dsc.a, false, np.a().a(nq.c, $$1))
               .a(it.e, dsc.a, false, np.a().a(nq.c, $$1))
               .a(it.c, dsc.b, true, np.a().a(nq.c, $$3))
               .a(it.d, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsc.b, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(it.c, dsc.a, true, np.a().a(nq.c, $$3))
               .a(it.d, dsc.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(it.f, dsc.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(it.e, dsc.a, true, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
         );
   }

   static nm c(dea $$0, akn $$1) {
      return nm.a($$0, np.a().a(nq.c, $$1));
   }

   private static nn f() {
      return nn.a(drt.I).a(it.a.b, np.a()).a(it.a.c, np.a().a(nq.a, nq.a.b)).a(it.a.a, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b));
   }

   static nj a(dea $$0, nx $$1, BiConsumer<akn, Supplier<JsonElement>> $$2) {
      akn $$3 = nw.g.a($$0, $$1, $$2);
      akn $$4 = nw.h.a($$0, $$1, $$2);
      akn $$5 = nw.i.a($$0, $$1, $$2);
      akn $$6 = nw.j.a($$0, $$1, $$2);
      return nm.a($$0, np.a().a(nq.c, $$6)).a(nn.a(drt.I).a(it.a.a, np.a().a(nq.c, $$3)).a(it.a.b, np.a().a(nq.c, $$4)).a(it.a.c, np.a().a(nq.c, $$5)));
   }

   static nj d(dea $$0, akn $$1) {
      return nm.a($$0, np.a().a(nq.c, $$1)).a(f());
   }

   private void e(dea $$0, akn $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dea $$0, nz.a $$1) {
      akn $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(dea $$0, nz.a $$1) {
      akn $$2 = $$1.create($$0, this.c);
      this.b.accept(nm.a($$0, np.a().a(nq.c, $$2)).a(b()));
   }

   static nj d(dea $$0, akn $$1, akn $$2) {
      return nm.a($$0)
         .a(
            nn.a(drt.I)
               .a(it.a.b, np.a().a(nq.c, $$1))
               .a(it.a.c, np.a().a(nq.c, $$2).a(nq.a, nq.a.b))
               .a(it.a.a, np.a().a(nq.c, $$2).a(nq.a, nq.a.b).a(nq.b, nq.a.b))
         );
   }

   private void a(dea $$0, nz.a $$1, nz.a $$2) {
      akn $$3 = $$1.create($$0, this.c);
      akn $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private akn a(dea $$0, String $$1, nv $$2, Function<akn, nx> $$3) {
      return $$2.a($$0, $$1, $$3.apply(nx.a($$0, $$1)), this.c);
   }

   static nj e(dea $$0, akn $$1, akn $$2) {
      return nm.a($$0).a(a(drt.w, $$2, $$1));
   }

   static nj e(dea $$0, akn $$1, akn $$2, akn $$3) {
      return nm.a($$0).a(nn.a(drt.bh).a(dsl.b, np.a().a(nq.c, $$1)).a(dsl.a, np.a().a(nq.c, $$2)).a(dsl.c, np.a().a(nq.c, $$3)));
   }

   public void a(dea $$0) {
      this.b($$0, nz.a);
   }

   public void b(dea $$0, nz.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(dea $$0, nx $$1, nv $$2) {
      akn $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private ng.b h(dea $$0) {
      nz $$1 = this.g.getOrDefault($$0, nz.a.get($$0));
      return new ng.b($$1.b()).a($$0, $$1.a());
   }

   public void a(dea $$0, dea $$1, dea $$2) {
      nx $$3 = nx.u($$0);
      akn $$4 = nw.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.r());
      this.c($$2);
   }

   void i(dea $$0) {
      nx $$1 = nx.t($$0);
      akn $$2 = nw.v.a($$0, $$1, this.c);
      akn $$3 = nw.w.a($$0, $$1, this.c);
      akn $$4 = nw.x.a($$0, $$1, this.c);
      akn $$5 = nw.y.a($$0, $$1, this.c);
      akn $$6 = nw.z.a($$0, $$1, this.c);
      akn $$7 = nw.A.a($$0, $$1, this.c);
      akn $$8 = nw.B.a($$0, $$1, this.c);
      akn $$9 = nw.C.a($$0, $$1, this.c);
      this.a($$0.r());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(dea $$0, dea $$1) {
      akn $$2 = nw.v.a($$0);
      akn $$3 = nw.w.a($$0);
      akn $$4 = nw.x.a($$0);
      akn $$5 = nw.y.a($$0);
      akn $$6 = nw.z.a($$0);
      akn $$7 = nw.A.a($$0);
      akn $$8 = nw.B.a($$0);
      akn $$9 = nw.C.a($$0);
      this.a($$1, nu.a($$0.r()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(dea $$0) {
      nx $$1 = nx.b($$0);
      akn $$2 = nw.ak.a($$0, $$1, this.c);
      akn $$3 = nw.al.a($$0, $$1, this.c);
      akn $$4 = nw.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(dea $$0) {
      nx $$1 = nx.b($$0);
      akn $$2 = nw.ah.a($$0, $$1, this.c);
      akn $$3 = nw.ai.a($$0, $$1, this.c);
      akn $$4 = nw.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(dea $$0, dea $$1) {
      akn $$2 = nw.ah.a($$0);
      akn $$3 = nw.ai.a($$0);
      akn $$4 = nw.aj.a($$0);
      this.a($$1, nu.a($$0.r()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dec.sD);
      akn $$0 = nu.a(dec.sD);
      akn $$1 = nu.a(dec.sD, "_partial_tilt");
      akn $$2 = nu.a(dec.sD, "_full_tilt");
      this.b
         .accept(
            nm.a(dec.sD)
               .a(b())
               .a(nn.a(drt.bl).a(dso.a, np.a().a(nq.c, $$0)).a(dso.b, np.a().a(nq.c, $$0)).a(dso.c, np.a().a(nq.c, $$1)).a(dso.d, np.a().a(nq.c, $$2)))
         );
   }

   private ng.f l(dea $$0) {
      return new ng.f(nx.n($$0));
   }

   private void m(dea $$0) {
      this.c($$0, $$0);
   }

   private void c(dea $$0, dea $$1) {
      this.b.accept(c($$0, nu.a($$1)));
   }

   private void a(dea $$0, ng.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(dea $$0, ng.e $$1, nx $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dea $$0, ng.e $$1) {
      nx $$2 = nx.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dea $$0, ng.e $$1, nx $$2) {
      akn $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(dea $$0, ng.e $$1, dsg<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         nn $$4 = nn.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            nx $$5 = nx.c(nx.a($$0, $$4x));
            akn $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return np.a().a(nq.c, $$6);
         });
         this.a($$0.r());
         this.b.accept(nm.a($$0).a($$4));
      }
   }

   private void a(dea $$0, dea $$1, ng.e $$2) {
      this.a($$0, $$2);
      nx $$3 = nx.d($$0);
      akn $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(dea $$0, dea $$1) {
      nz $$2 = nz.p.get($$0);
      akn $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      akn $$4 = nw.aC.a($$1, $$2.b(), this.c);
      this.b.accept(nm.a($$1, np.a().a(nq.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(dea $$0, dea $$1) {
      this.a($$0.r());
      nx $$2 = nx.h($$0);
      nx $$3 = nx.a($$0, $$1);
      akn $$4 = nw.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            nm.a($$1, np.a().a(nq.c, $$4))
               .a(nn.a(drt.R).a(it.e, np.a()).a(it.d, np.a().a(nq.b, nq.a.d)).a(it.c, np.a().a(nq.b, nq.a.b)).a(it.f, np.a().a(nq.b, nq.a.c)))
         );
      this.b.accept(nm.a($$0).a(nn.a(drt.av).a($$2x -> np.a().a(nq.c, nw.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      dea $$0 = dec.kC;
      this.a($$0.r());
      akn $$1 = nu.a($$0, "_top");
      akn $$2 = nu.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      dea $$0 = dec.kB;
      this.a($$0.r());
      nn $$1 = nn.a(djp.d, drt.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> np.a().a(nq.c, nu.a($$0, "_top_stage_" + $$1x));
            case b -> np.a().a(nq.c, nu.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(nm.a($$0).a($$1));
   }

   private void a(dea $$0, dea $$1, dea $$2, dea $$3, dea $$4, dea $$5, dea $$6, dea $$7) {
      this.a($$0, ng.e.b);
      this.a($$1, ng.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(dea $$0, ng.e $$1) {
      this.a($$0, "_top");
      akn $$2 = this.a($$0, "_top", $$1.a(), nx::c);
      akn $$3 = this.a($$0, "_bottom", $$1.a(), nx::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dec.iD, "_front");
      akn $$0 = nu.a(dec.iD, "_top");
      akn $$1 = this.a(dec.iD, "_bottom", ng.e.b.a(), nx::c);
      this.f(dec.iD, $$0, $$1);
   }

   private void k() {
      akn $$0 = this.a(dec.bx, "_top", nw.bk, nx::a);
      akn $$1 = this.a(dec.bx, "_bottom", nw.bk, nx::a);
      this.f(dec.bx, $$0, $$1);
   }

   private void l() {
      this.c(dec.sF);
      akn $$0 = nu.a(dec.sF, "_top");
      akn $$1 = nu.a(dec.sF, "_bottom");
      this.b.accept(nm.a(dec.sF).a(b()).a(nn.a(drt.ae).a(drz.b, np.a().a(nq.c, $$1)).a(drz.a, np.a().a(nq.c, $$0))));
   }

   private void f(dea $$0, akn $$1, akn $$2) {
      this.b.accept(nm.a($$0).a(nn.a(drt.ae).a(drz.b, np.a().a(nq.c, $$2)).a(drz.a, np.a().a(nq.c, $$1))));
   }

   private void n(dea $$0) {
      nx $$1 = nx.e($$0);
      nx $$2 = nx.e(nx.a($$0, "_corner"));
      akn $$3 = nw.as.a($$0, $$1, this.c);
      akn $$4 = nw.at.a($$0, $$2, this.c);
      akn $$5 = nw.au.a($$0, $$1, this.c);
      akn $$6 = nw.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drt.ag)
                     .a(dsh.a, np.a().a(nq.c, $$3))
                     .a(dsh.b, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
                     .a(dsh.c, np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
                     .a(dsh.d, np.a().a(nq.c, $$6).a(nq.b, nq.a.b))
                     .a(dsh.e, np.a().a(nq.c, $$5))
                     .a(dsh.f, np.a().a(nq.c, $$6))
                     .a(dsh.g, np.a().a(nq.c, $$4))
                     .a(dsh.h, np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
                     .a(dsh.i, np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
                     .a(dsh.j, np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
               )
         );
   }

   private void o(dea $$0) {
      akn $$1 = this.a($$0, "", nw.as, nx::e);
      akn $$2 = this.a($$0, "", nw.au, nx::e);
      akn $$3 = this.a($$0, "", nw.av, nx::e);
      akn $$4 = this.a($$0, "_on", nw.as, nx::e);
      akn $$5 = this.a($$0, "_on", nw.au, nx::e);
      akn $$6 = this.a($$0, "_on", nw.av, nx::e);
      nn $$7 = nn.a(drt.w, drt.ah).a(($$6x, $$7x) -> {
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

   private ng.a a(akn $$0, dea $$1) {
      return new ng.a($$0, $$1);
   }

   private ng.a f(dea $$0, dea $$1) {
      return new ng.a(nu.a($$0), $$1);
   }

   private void a(dea $$0, ctl $$1) {
      akn $$2 = nw.aa.a($$0, nx.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(dea $$0, akn $$1) {
      akn $$2 = nw.aa.a($$0, nx.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(dea $$0, dea $$1) {
      this.a($$0);
      akn $$2 = nz.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(dea $$0) {
      this.a($$0.r());
      akn $$1 = nz.k.create($$0, this.c);
      akn $$2 = nz.l.create($$0, this.c);
      akn $$3 = nz.m.create($$0, this.c);
      akn $$4 = nz.n.create($$0, this.c);
      this.b
         .accept(
            nl.a($$0)
               .a(nk.a().a(drt.S, 1, 2, 3, 4).a(drt.R, it.c), np.a().a(nq.c, $$1))
               .a(nk.a().a(drt.S, 1, 2, 3, 4).a(drt.R, it.f), np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.S, 1, 2, 3, 4).a(drt.R, it.d), np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
               .a(nk.a().a(drt.S, 1, 2, 3, 4).a(drt.R, it.e), np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               .a(nk.a().a(drt.S, 2, 3, 4).a(drt.R, it.c), np.a().a(nq.c, $$2))
               .a(nk.a().a(drt.S, 2, 3, 4).a(drt.R, it.f), np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.S, 2, 3, 4).a(drt.R, it.d), np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
               .a(nk.a().a(drt.S, 2, 3, 4).a(drt.R, it.e), np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
               .a(nk.a().a(drt.S, 3, 4).a(drt.R, it.c), np.a().a(nq.c, $$3))
               .a(nk.a().a(drt.S, 3, 4).a(drt.R, it.f), np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.S, 3, 4).a(drt.R, it.d), np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               .a(nk.a().a(drt.S, 3, 4).a(drt.R, it.e), np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
               .a(nk.a().a(drt.S, 4).a(drt.R, it.c), np.a().a(nq.c, $$4))
               .a(nk.a().a(drt.S, 4).a(drt.R, it.f), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.S, 4).a(drt.R, it.d), np.a().a(nq.c, $$4).a(nq.b, nq.a.c))
               .a(nk.a().a(drt.S, 4).a(drt.R, it.e), np.a().a(nq.c, $$4).a(nq.b, nq.a.d))
         );
   }

   private void a(nz.a $$0, dea... $$1) {
      for (dea $$2 : $$1) {
         akn $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(nz.a $$0, dea... $$1) {
      for (dea $$2 : $$1) {
         akn $$3 = $$0.create($$2, this.c);
         this.b.accept(nm.a($$2, np.a().a(nq.c, $$3)).a(c()));
      }
   }

   private void h(dea $$0, dea $$1) {
      this.a($$0);
      nx $$2 = nx.b($$0, $$1);
      akn $$3 = nw.aI.a($$1, $$2, this.c);
      akn $$4 = nw.aJ.a($$1, $$2, this.c);
      akn $$5 = nw.aK.a($$1, $$2, this.c);
      akn $$6 = nw.aG.a($$1, $$2, this.c);
      akn $$7 = nw.aH.a($$1, $$2, this.c);
      ctl $$8 = $$1.r();
      nw.bx.a(nu.a($$8), nx.F($$0), this.c);
      this.b
         .accept(
            nl.a($$1)
               .a(np.a().a(nq.c, $$3))
               .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$4))
               .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$5))
               .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.L, false), np.a().a(nq.c, $$6))
               .a(nk.a().a(drt.M, false), np.a().a(nq.c, $$7))
               .a(nk.a().a(drt.N, false), np.a().a(nq.c, $$7).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.O, false), np.a().a(nq.c, $$6).a(nq.b, nq.a.d))
         );
   }

   private void q(dea $$0) {
      nx $$1 = nx.z($$0);
      akn $$2 = nw.aL.a($$0, $$1, this.c);
      akn $$3 = this.a($$0, "_conditional", nw.aL, $$1x -> $$1.c(ny.i, $$1x));
      this.b.accept(nm.a($$0).a(a(drt.c, $$3, $$2)).a(e()));
   }

   private void r(dea $$0) {
      akn $$1 = nz.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<np> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> np.a().a(nq.c, nu.a(dec.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dec.mZ);
      this.b
         .accept(
            nl.a(dec.mZ)
               .a(nk.a().a(drt.aq, 0), this.a(0))
               .a(nk.a().a(drt.aq, 1), this.a(1))
               .a(nk.a().a(drt.bk, drp.b), np.a().a(nq.c, nu.a(dec.mZ, "_small_leaves")))
               .a(nk.a().a(drt.bk, drp.c), np.a().a(nq.c, nu.a(dec.mZ, "_large_leaves")))
         );
   }

   private nn n() {
      return nn.a(drt.P)
         .a(it.a, np.a().a(nq.a, nq.a.c))
         .a(it.b, np.a())
         .a(it.c, np.a().a(nq.a, nq.a.b))
         .a(it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
         .a(it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
         .a(it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b));
   }

   private void o() {
      akn $$0 = nx.a(dec.nU, "_top_open");
      this.b
         .accept(
            nm.a(dec.nU)
               .a(this.n())
               .a(
                  nn.a(drt.u)
                     .a(false, np.a().a(nq.c, nz.f.create(dec.nU, this.c)))
                     .a(true, np.a().a(nq.c, nz.f.get(dec.nU).a($$1 -> $$1.a(ny.f, $$0)).a(dec.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> nn a(dsg<T> $$0, T $$1, akn $$2, akn $$3) {
      np $$4 = np.a().a(nq.c, $$2);
      np $$5 = np.a().a(nq.c, $$3);
      return nn.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dea $$0, Function<dea, nx> $$1) {
      nx $$2 = $$1.apply($$0).b(ny.i, ny.c);
      nx $$3 = $$2.c(ny.g, nx.a($$0, "_front_honey"));
      akn $$4 = nw.q.a($$0, $$2, this.c);
      akn $$5 = nw.q.a($$0, "_honey", $$3, this.c);
      this.b.accept(nm.a($$0).a(b()).a(a(drt.aN, 5, $$5, $$4)));
   }

   private void a(dea $$0, dsg<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akn> $$3 = new Int2ObjectOpenHashMap();
         nn $$4 = nn.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akn $$5 = (akn)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, nw.aV, nx::g));
            return np.a().a(nq.c, $$5);
         });
         this.a($$0.r());
         this.b.accept(nm.a($$0).a($$4));
      }
   }

   private void p() {
      akn $$0 = nu.a(dec.od, "_floor");
      akn $$1 = nu.a(dec.od, "_ceiling");
      akn $$2 = nu.a(dec.od, "_wall");
      akn $$3 = nu.a(dec.od, "_between_walls");
      this.a(ctt.wo);
      this.b
         .accept(
            nm.a(dec.od)
               .a(
                  nn.a(drt.R, drt.V)
                     .a(it.c, drr.a, np.a().a(nq.c, $$0))
                     .a(it.d, drr.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.c))
                     .a(it.f, drr.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.b))
                     .a(it.e, drr.a, np.a().a(nq.c, $$0).a(nq.b, nq.a.d))
                     .a(it.c, drr.b, np.a().a(nq.c, $$1))
                     .a(it.d, drr.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
                     .a(it.f, drr.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
                     .a(it.e, drr.b, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
                     .a(it.c, drr.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.d))
                     .a(it.d, drr.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
                     .a(it.f, drr.c, np.a().a(nq.c, $$2))
                     .a(it.e, drr.c, np.a().a(nq.c, $$2).a(nq.b, nq.a.c))
                     .a(it.d, drr.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
                     .a(it.c, drr.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.d))
                     .a(it.f, drr.d, np.a().a(nq.c, $$3))
                     .a(it.e, drr.d, np.a().a(nq.c, $$3).a(nq.b, nq.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            nm.a(dec.nZ, np.a().a(nq.c, nu.a(dec.nZ)))
               .a(
                  nn.a(drt.U, drt.R)
                     .a(dro.a, it.c, np.a())
                     .a(dro.a, it.f, np.a().a(nq.b, nq.a.b))
                     .a(dro.a, it.d, np.a().a(nq.b, nq.a.c))
                     .a(dro.a, it.e, np.a().a(nq.b, nq.a.d))
                     .a(dro.b, it.c, np.a().a(nq.a, nq.a.b))
                     .a(dro.b, it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b))
                     .a(dro.b, it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
                     .a(dro.b, it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
                     .a(dro.c, it.d, np.a().a(nq.a, nq.a.c))
                     .a(dro.c, it.e, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.b))
                     .a(dro.c, it.c, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.c))
                     .a(dro.c, it.f, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.d))
               )
         );
   }

   private void d(dea $$0, nz.a $$1) {
      akn $$2 = $$1.create($$0, this.c);
      akn $$3 = nx.a($$0, "_front_on");
      akn $$4 = $$1.get($$0).a($$1x -> $$1x.a(ny.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(nm.a($$0).a(a(drt.r, $$4, $$2)).a(b()));
   }

   private void a(dea... $$0) {
      akn $$1 = nu.a("campfire_off");

      for (dea $$2 : $$0) {
         akn $$3 = nw.bc.a($$2, nx.E($$2), this.c);
         this.a($$2.r());
         this.b.accept(nm.a($$2).a(a(drt.r, $$3, $$1)).a(c()));
      }
   }

   private void s(dea $$0) {
      akn $$1 = nw.bt.a($$0, nx.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(dea $$0) {
      akn $$1;
      if ($$0 == dec.tj) {
         $$1 = nw.bv.a($$0, nx.m($$0), this.c);
      } else {
         $$1 = nw.bu.a($$0, nx.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      nx $$0 = nx.a(nx.G(dec.cl), nx.G(dec.n));
      akn $$1 = nw.j.a(dec.cl, $$0, this.c);
      this.b.accept(c(dec.cl, $$1));
   }

   private void s() {
      this.a(ctt.lH);
      this.b
         .accept(
            nl.a(dec.cw)
               .a(
                  nk.b(
                     nk.a().a(drt.ab, dsi.c).a(drt.aa, dsi.c).a(drt.ac, dsi.c).a(drt.ad, dsi.c),
                     nk.a().a(drt.ab, dsi.b, dsi.a).a(drt.aa, dsi.b, dsi.a),
                     nk.a().a(drt.aa, dsi.b, dsi.a).a(drt.ac, dsi.b, dsi.a),
                     nk.a().a(drt.ac, dsi.b, dsi.a).a(drt.ad, dsi.b, dsi.a),
                     nk.a().a(drt.ad, dsi.b, dsi.a).a(drt.ab, dsi.b, dsi.a)
                  ),
                  np.a().a(nq.c, nu.a("redstone_dust_dot"))
               )
               .a(nk.a().a(drt.ab, dsi.b, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_side0")))
               .a(nk.a().a(drt.ac, dsi.b, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_side_alt0")))
               .a(nk.a().a(drt.aa, dsi.b, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_side_alt1")).a(nq.b, nq.a.d))
               .a(nk.a().a(drt.ad, dsi.b, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_side1")).a(nq.b, nq.a.d))
               .a(nk.a().a(drt.ab, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_up")))
               .a(nk.a().a(drt.aa, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.ac, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.c))
               .a(nk.a().a(drt.ad, dsi.a), np.a().a(nq.c, nu.a("redstone_dust_up")).a(nq.b, nq.a.d))
         );
   }

   private void t() {
      this.a(ctt.lL);
      this.b
         .accept(
            nm.a(dec.gY)
               .a(c())
               .a(
                  nn.a(drt.bd, drt.w)
                     .a(drw.a, false, np.a().a(nq.c, nu.a(dec.gY)))
                     .a(drw.a, true, np.a().a(nq.c, nu.a(dec.gY, "_on")))
                     .a(drw.b, false, np.a().a(nq.c, nu.a(dec.gY, "_subtract")))
                     .a(drw.b, true, np.a().a(nq.c, nu.a(dec.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      nx $$0 = nx.a(dec.jR);
      nx $$1 = nx.a(nx.a(dec.jE, "_side"), $$0.a(ny.f));
      akn $$2 = nw.ab.a(dec.jE, $$1, this.c);
      akn $$3 = nw.ac.a(dec.jE, $$1, this.c);
      akn $$4 = nw.j.b(dec.jE, "_double", $$1, this.c);
      this.b.accept(e(dec.jE, $$2, $$3, $$4));
      this.b.accept(c(dec.jR, nw.c.a(dec.jR, $$0, this.c)));
   }

   private void v() {
      this.a(ctt.sq);
      this.b
         .accept(
            nl.a(dec.fs)
               .a(np.a().a(nq.c, nx.G(dec.fs)))
               .a(nk.a().a(drt.k, true), np.a().a(nq.c, nx.a(dec.fs, "_bottle0")))
               .a(nk.a().a(drt.l, true), np.a().a(nq.c, nx.a(dec.fs, "_bottle1")))
               .a(nk.a().a(drt.m, true), np.a().a(nq.c, nx.a(dec.fs, "_bottle2")))
               .a(nk.a().a(drt.k, false), np.a().a(nq.c, nx.a(dec.fs, "_empty0")))
               .a(nk.a().a(drt.l, false), np.a().a(nq.c, nx.a(dec.fs, "_empty1")))
               .a(nk.a().a(drt.m, false), np.a().a(nq.c, nx.a(dec.fs, "_empty2")))
         );
   }

   private void u(dea $$0) {
      akn $$1 = nw.bp.a($$0, nx.b($$0), this.c);
      akn $$2 = nu.a("mushroom_block_inside");
      this.b
         .accept(
            nl.a($$0)
               .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$1))
               .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.c).a(nq.d, true))
               .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$1).a(nq.b, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drt.J, true), np.a().a(nq.c, $$1).a(nq.a, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drt.K, true), np.a().a(nq.c, $$1).a(nq.a, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drt.L, false), np.a().a(nq.c, $$2))
               .a(nk.a().a(drt.M, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, false))
               .a(nk.a().a(drt.N, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, false))
               .a(nk.a().a(drt.O, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, false))
               .a(nk.a().a(drt.J, false), np.a().a(nq.c, $$2).a(nq.a, nq.a.d).a(nq.d, false))
               .a(nk.a().a(drt.K, false), np.a().a(nq.c, $$2).a(nq.a, nq.a.b).a(nq.d, false))
         );
      this.a($$0, nz.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(ctt.rB);
      this.b
         .accept(
            nm.a(dec.eg)
               .a(
                  nn.a(drt.ay)
                     .a(0, np.a().a(nq.c, nu.a(dec.eg)))
                     .a(1, np.a().a(nq.c, nu.a(dec.eg, "_slice1")))
                     .a(2, np.a().a(nq.c, nu.a(dec.eg, "_slice2")))
                     .a(3, np.a().a(nq.c, nu.a(dec.eg, "_slice3")))
                     .a(4, np.a().a(nq.c, nu.a(dec.eg, "_slice4")))
                     .a(5, np.a().a(nq.c, nu.a(dec.eg, "_slice5")))
                     .a(6, np.a().a(nq.c, nu.a(dec.eg, "_slice6")))
               )
         );
   }

   private void x() {
      nx $$0 = new nx()
         .a(ny.c, nx.a(dec.nX, "_side3"))
         .a(ny.o, nx.G(dec.t))
         .a(ny.n, nx.a(dec.nX, "_top"))
         .a(ny.j, nx.a(dec.nX, "_side3"))
         .a(ny.l, nx.a(dec.nX, "_side3"))
         .a(ny.k, nx.a(dec.nX, "_side1"))
         .a(ny.m, nx.a(dec.nX, "_side2"));
      this.b.accept(c(dec.nX, nw.a.a(dec.nX, $$0, this.c)));
   }

   private void y() {
      nx $$0 = new nx()
         .a(ny.c, nx.a(dec.ob, "_front"))
         .a(ny.o, nx.a(dec.ob, "_bottom"))
         .a(ny.n, nx.a(dec.ob, "_top"))
         .a(ny.j, nx.a(dec.ob, "_front"))
         .a(ny.k, nx.a(dec.ob, "_front"))
         .a(ny.l, nx.a(dec.ob, "_side"))
         .a(ny.m, nx.a(dec.ob, "_side"));
      this.b.accept(c(dec.ob, nw.a.a(dec.ob, $$0, this.c)));
   }

   private void a(dea $$0, dea $$1, BiFunction<dea, dea, nx> $$2) {
      nx $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, nw.a.a($$0, $$3, this.c)));
   }

   public void b(dea $$0) {
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
      nx $$0 = nx.k(dec.eZ);
      this.b.accept(c(dec.eZ, nu.a(dec.eZ)));
      this.a(dec.ee, $$0);
      this.a(dec.ef, $$0);
   }

   private void a(dea $$0, nx $$1) {
      akn $$2 = nw.p.a($$0, $$1.c(ny.g, nx.G($$0)), this.c);
      this.b.accept(nm.a($$0, np.a().a(nq.c, $$2)).a(b()));
   }

   private void A() {
      this.a(ctt.sr);
      this.m(dec.ft);
      this.b.accept(c(dec.fv, nw.bs.a(dec.fv, nx.j(nx.a(dec.H, "_still")), this.c)));
      this.b
         .accept(
            nm.a(dec.fu)
               .a(
                  nn.a(dij.g)
                     .a(1, np.a().a(nq.c, nw.bq.a(dec.fu, "_level1", nx.j(nx.a(dec.G, "_still")), this.c)))
                     .a(2, np.a().a(nq.c, nw.br.a(dec.fu, "_level2", nx.j(nx.a(dec.G, "_still")), this.c)))
                     .a(3, np.a().a(nq.c, nw.bs.a(dec.fu, "_full", nx.j(nx.a(dec.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            nm.a(dec.fw)
               .a(
                  nn.a(dij.g)
                     .a(1, np.a().a(nq.c, nw.bq.a(dec.fw, "_level1", nx.j(nx.G(dec.qP)), this.c)))
                     .a(2, np.a().a(nq.c, nw.br.a(dec.fw, "_level2", nx.j(nx.G(dec.qP)), this.c)))
                     .a(3, np.a().a(nq.c, nw.bs.a(dec.fw, "_full", nx.j(nx.G(dec.qP)), this.c)))
               )
         );
   }

   private void B() {
      nx $$0 = nx.b(dec.kv);
      akn $$1 = nw.aE.a(dec.kv, $$0, this.c);
      akn $$2 = this.a(dec.kv, "_dead", nw.aE, $$1x -> $$0.c(ny.b, $$1x));
      this.b.accept(nm.a(dec.kv).a(a(drt.au, 5, $$2, $$1)));
   }

   private void C() {
      akn $$0 = nu.a(dec.tq);
      akn $$1 = nu.a(dec.tq, "_triggered");
      akn $$2 = nu.a(dec.tq, "_crafting");
      akn $$3 = nu.a(dec.tq, "_crafting_triggered");
      this.b
         .accept(
            nm.a(dec.tq)
               .a(nn.a(drt.T).a($$0x -> this.a($$0x, np.a())))
               .a(
                  nn.a(drt.A, dft.b)
                     .a(false, false, np.a().a(nq.c, $$0))
                     .a(true, true, np.a().a(nq.c, $$3))
                     .a(true, false, np.a().a(nq.c, $$1))
                     .a(false, true, np.a().a(nq.c, $$2))
               )
         );
   }

   private void v(dea $$0) {
      nx $$1 = new nx().a(ny.f, nx.a(dec.cD, "_top")).a(ny.i, nx.a(dec.cD, "_side")).a(ny.g, nx.a($$0, "_front"));
      nx $$2 = new nx().a(ny.i, nx.a(dec.cD, "_top")).a(ny.g, nx.a($$0, "_front_vertical"));
      akn $$3 = nw.p.a($$0, $$1, this.c);
      akn $$4 = nw.r.a($$0, $$2, this.c);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drt.P)
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
      akn $$0 = nu.a(dec.fy);
      akn $$1 = nu.a(dec.fy, "_filled");
      this.b.accept(nm.a(dec.fy).a(nn.a(drt.h).a(false, np.a().a(nq.c, $$0)).a(true, np.a().a(nq.c, $$1))).a(c()));
   }

   private void E() {
      akn $$0 = nu.a(dec.ku, "_side");
      akn $$1 = nu.a(dec.ku, "_noside");
      akn $$2 = nu.a(dec.ku, "_noside1");
      akn $$3 = nu.a(dec.ku, "_noside2");
      akn $$4 = nu.a(dec.ku, "_noside3");
      this.b
         .accept(
            nl.a(dec.ku)
               .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$0))
               .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.c).a(nq.d, true))
               .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$0).a(nq.b, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drt.J, true), np.a().a(nq.c, $$0).a(nq.a, nq.a.d).a(nq.d, true))
               .a(nk.a().a(drt.K, true), np.a().a(nq.c, $$0).a(nq.a, nq.a.b).a(nq.d, true))
               .a(nk.a().a(drt.L, false), np.a().a(nq.c, $$1).a(nq.e, 2), np.a().a(nq.c, $$2), np.a().a(nq.c, $$3), np.a().a(nq.c, $$4))
               .a(
                  nk.a().a(drt.M, false),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.b).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.b).a(nq.d, true)
               )
               .a(
                  nk.a().a(drt.N, false),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.c).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.c).a(nq.d, true)
               )
               .a(
                  nk.a().a(drt.O, false),
                  np.a().a(nq.c, $$4).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.b, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.b, nq.a.d).a(nq.d, true)
               )
               .a(
                  nk.a().a(drt.J, false),
                  np.a().a(nq.c, $$1).a(nq.e, 2).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$4).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$2).a(nq.a, nq.a.d).a(nq.d, true),
                  np.a().a(nq.c, $$3).a(nq.a, nq.a.d).a(nq.d, true)
               )
               .a(
                  nk.a().a(drt.K, false),
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
            nl.a(dec.pc)
               .a(np.a().a(nq.c, nx.G(dec.pc)))
               .a(nk.a().a(drt.aL, 1), np.a().a(nq.c, nx.a(dec.pc, "_contents1")))
               .a(nk.a().a(drt.aL, 2), np.a().a(nq.c, nx.a(dec.pc, "_contents2")))
               .a(nk.a().a(drt.aL, 3), np.a().a(nq.c, nx.a(dec.pc, "_contents3")))
               .a(nk.a().a(drt.aL, 4), np.a().a(nq.c, nx.a(dec.pc, "_contents4")))
               .a(nk.a().a(drt.aL, 5), np.a().a(nq.c, nx.a(dec.pc, "_contents5")))
               .a(nk.a().a(drt.aL, 6), np.a().a(nq.c, nx.a(dec.pc, "_contents6")))
               .a(nk.a().a(drt.aL, 7), np.a().a(nq.c, nx.a(dec.pc, "_contents7")))
               .a(nk.a().a(drt.aL, 8), np.a().a(nq.c, nx.a(dec.pc, "_contents_ready")))
         );
   }

   private void w(dea $$0) {
      akn $$1 = nw.c.a($$0, nx.a($$0), this.c);
      akn $$2 = this.a($$0, "_powered", nw.c, nx::b);
      akn $$3 = this.a($$0, "_lit", nw.c, nx::b);
      akn $$4 = this.a($$0, "_lit_powered", nw.c, nx::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nj a(dea $$0, akn $$1, akn $$2, akn $$3, akn $$4) {
      return nm.a($$0).a(nn.a(drt.r, drt.w).a(($$4x, $$5) -> $$4x ? np.a().a(nq.c, $$5 ? $$4 : $$2) : np.a().a(nq.c, $$5 ? $$3 : $$1)));
   }

   private void i(dea $$0, dea $$1) {
      akn $$2 = nu.a($$0);
      akn $$3 = nu.a($$0, "_powered");
      akn $$4 = nu.a($$0, "_lit");
      akn $$5 = nu.a($$0, "_lit_powered");
      this.a($$1, nu.a($$0.r()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(dea $$0) {
      this.c($$0);
      this.b.accept(nm.a($$0, np.a().a(nq.c, nw.ao.a($$0, nx.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dec.qy);
      this.x(dec.qx);
      this.x(dec.qw);
      this.x(dec.qv);
   }

   private void H() {
      this.c(dec.st);
      nn.b<it, dsa> $$0 = nn.a(drt.bm, drt.bn);

      for (dsa $$1 : dsa.values()) {
         $$0.a(it.b, $$1, this.a(it.b, $$1));
      }

      for (dsa $$2 : dsa.values()) {
         $$0.a(it.a, $$2, this.a(it.a, $$2));
      }

      this.b.accept(nm.a(dec.st).a($$0));
   }

   private np a(it $$0, dsa $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      nx $$3 = nx.c(nx.a(dec.st, $$2));
      return np.a().a(nq.c, nw.an.a(dec.st, $$2, $$3, this.c));
   }

   private void y(dea $$0) {
      nx $$1 = new nx().a(ny.e, nx.G(dec.dV)).a(ny.f, nx.G($$0)).a(ny.i, nx.a($$0, "_side"));
      this.b.accept(c($$0, nw.n.a($$0, $$1, this.c)));
   }

   private void I() {
      akn $$0 = nx.a(dec.gZ, "_side");
      nx $$1 = new nx().a(ny.f, nx.a(dec.gZ, "_top")).a(ny.i, $$0);
      nx $$2 = new nx().a(ny.f, nx.a(dec.gZ, "_inverted_top")).a(ny.i, $$0);
      this.b
         .accept(
            nm.a(dec.gZ)
               .a(nn.a(drt.p).a(false, np.a().a(nq.c, nw.aF.a(dec.gZ, $$1, this.c))).a(true, np.a().a(nq.c, nw.aF.a(nu.a(dec.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(dea $$0) {
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(this.n()));
   }

   private void J() {
      dea $$0 = dec.ss;
      akn $$1 = nu.a($$0, "_on");
      akn $$2 = nu.a($$0);
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(this.n()).a(a(drt.w, $$1, $$2)));
   }

   private void K() {
      nx $$0 = new nx().a(ny.B, nx.G(dec.j)).a(ny.f, nx.G(dec.cC));
      nx $$1 = new nx().a(ny.B, nx.G(dec.j)).a(ny.f, nx.a(dec.cC, "_moist"));
      akn $$2 = nw.aW.a(dec.cC, $$0, this.c);
      akn $$3 = nw.aW.a(nx.a(dec.cC, "_moist"), $$1, this.c);
      this.b.accept(nm.a(dec.cC).a(a(drt.aQ, 7, $$3, $$2)));
   }

   private List<akn> A(dea $$0) {
      akn $$1 = nw.aX.a(nu.a($$0, "_floor0"), nx.v($$0), this.c);
      akn $$2 = nw.aX.a(nu.a($$0, "_floor1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<akn> B(dea $$0) {
      akn $$1 = nw.aY.a(nu.a($$0, "_side0"), nx.v($$0), this.c);
      akn $$2 = nw.aY.a(nu.a($$0, "_side1"), nx.w($$0), this.c);
      akn $$3 = nw.aZ.a(nu.a($$0, "_side_alt0"), nx.v($$0), this.c);
      akn $$4 = nw.aZ.a(nu.a($$0, "_side_alt1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akn> C(dea $$0) {
      akn $$1 = nw.ba.a(nu.a($$0, "_up0"), nx.v($$0), this.c);
      akn $$2 = nw.ba.a(nu.a($$0, "_up1"), nx.w($$0), this.c);
      akn $$3 = nw.bb.a(nu.a($$0, "_up_alt0"), nx.v($$0), this.c);
      akn $$4 = nw.bb.a(nu.a($$0, "_up_alt1"), nx.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<np> a(List<akn> $$0, UnaryOperator<np> $$1) {
      return $$0.stream().map($$0x -> np.a().a(nq.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      nk $$0 = nk.a().a(drt.L, false).a(drt.M, false).a(drt.N, false).a(drt.O, false).a(drt.J, false);
      List<akn> $$1 = this.A(dec.cr);
      List<akn> $$2 = this.B(dec.cr);
      List<akn> $$3 = this.C(dec.cr);
      this.b
         .accept(
            nl.a(dec.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(nk.b(nk.a().a(drt.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(nk.b(nk.a().a(drt.M, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.b)))
               .a(nk.b(nk.a().a(drt.N, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.c)))
               .a(nk.b(nk.a().a(drt.O, true), $$0), a($$2, $$0x -> $$0x.a(nq.b, nq.a.d)))
               .a(nk.a().a(drt.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<akn> $$0 = this.A(dec.cs);
      List<akn> $$1 = this.B(dec.cs);
      this.b
         .accept(
            nl.a(dec.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.b)))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.c)))
               .a(a($$1, $$0x -> $$0x.a(nq.b, nq.a.d)))
         );
   }

   private void D(dea $$0) {
      akn $$1 = nz.t.create($$0, this.c);
      akn $$2 = nz.u.create($$0, this.c);
      this.a($$0.r());
      this.b.accept(nm.a($$0).a(a(drt.j, $$2, $$1)));
   }

   private void N() {
      nx $$0 = nx.a(nx.a(dec.ad, "_side"), nx.a(dec.ad, "_top"));
      akn $$1 = nw.j.a(dec.ad, $$0, this.c);
      this.b.accept(d(dec.ad, $$1));
   }

   private void O() {
      this.a(ctt.ad);
      dea $$0 = dec.E;
      nn.b<Boolean, Integer> $$1 = nn.a(div.d, div.b);
      akn $$2 = nu.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akn $$4 = nu.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, np.a().a(nq.c, $$4));
         $$1.a(false, $$3, np.a().a(nq.c, $$2));
      }

      this.b.accept(nm.a(dec.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            nm.a(dec.kI)
               .a(
                  nn.a(drt.as)
                     .a(0, np.a().a(nq.c, this.a(dec.kI, "_0", nw.c, nx::b)))
                     .a(1, np.a().a(nq.c, this.a(dec.kI, "_1", nw.c, nx::b)))
                     .a(2, np.a().a(nq.c, this.a(dec.kI, "_2", nw.c, nx::b)))
                     .a(3, np.a().a(nq.c, this.a(dec.kI, "_3", nw.c, nx::b)))
               )
         );
   }

   private void Q() {
      akn $$0 = nx.G(dec.j);
      nx $$1 = new nx().a(ny.e, $$0).b(ny.e, ny.c).a(ny.f, nx.a(dec.i, "_top")).a(ny.i, nx.a(dec.i, "_snow"));
      np $$2 = np.a().a(nq.c, nw.n.a(dec.i, "_snow", $$1, this.c));
      this.a(dec.i, nu.a(dec.i), $$2);
      akn $$3 = nz.f.get(dec.fl).a($$1x -> $$1x.a(ny.e, $$0)).a(dec.fl, this.c);
      this.a(dec.fl, $$3, $$2);
      akn $$4 = nz.f.get(dec.l).a($$1x -> $$1x.a(ny.e, $$0)).a(dec.l, this.c);
      this.a(dec.l, $$4, $$2);
   }

   private void a(dea $$0, akn $$1, np $$2) {
      List<np> $$3 = Arrays.asList(a($$1));
      this.b.accept(nm.a($$0).a(nn.a(drt.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(ctt.rh);
      this.b
         .accept(
            nm.a(dec.fC)
               .a(
                  nn.a(drt.ar)
                     .a(0, np.a().a(nq.c, nu.a(dec.fC, "_stage0")))
                     .a(1, np.a().a(nq.c, nu.a(dec.fC, "_stage1")))
                     .a(2, np.a().a(nq.c, nu.a(dec.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dec.kE, nu.a(dec.kE)));
   }

   private void j(dea $$0, dea $$1) {
      nx $$2 = nx.b($$1);
      akn $$3 = nw.Y.a($$0, $$2, this.c);
      akn $$4 = nw.Z.a($$0, $$2, this.c);
      this.b.accept(nm.a($$0).a(a(drt.aT, 1, $$4, $$3)));
   }

   private void T() {
      akn $$0 = nu.a(dec.hc);
      akn $$1 = nu.a(dec.hc, "_side");
      this.a(ctt.lR);
      this.b
         .accept(
            nm.a(dec.hc)
               .a(
                  nn.a(drt.Q)
                     .a(it.a, np.a().a(nq.c, $$0))
                     .a(it.c, np.a().a(nq.c, $$1))
                     .a(it.f, np.a().a(nq.c, $$1).a(nq.b, nq.a.b))
                     .a(it.d, np.a().a(nq.c, $$1).a(nq.b, nq.a.c))
                     .a(it.e, np.a().a(nq.c, $$1).a(nq.b, nq.a.d))
               )
         );
   }

   private void k(dea $$0, dea $$1) {
      akn $$2 = nu.a($$0);
      this.b.accept(nm.a($$1, np.a().a(nq.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      akn $$0 = nu.a(dec.eW, "_post_ends");
      akn $$1 = nu.a(dec.eW, "_post");
      akn $$2 = nu.a(dec.eW, "_cap");
      akn $$3 = nu.a(dec.eW, "_cap_alt");
      akn $$4 = nu.a(dec.eW, "_side");
      akn $$5 = nu.a(dec.eW, "_side_alt");
      this.b
         .accept(
            nl.a(dec.eW)
               .a(np.a().a(nq.c, $$0))
               .a(nk.a().a(drt.L, false).a(drt.M, false).a(drt.N, false).a(drt.O, false), np.a().a(nq.c, $$1))
               .a(nk.a().a(drt.L, true).a(drt.M, false).a(drt.N, false).a(drt.O, false), np.a().a(nq.c, $$2))
               .a(nk.a().a(drt.L, false).a(drt.M, true).a(drt.N, false).a(drt.O, false), np.a().a(nq.c, $$2).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.L, false).a(drt.M, false).a(drt.N, true).a(drt.O, false), np.a().a(nq.c, $$3))
               .a(nk.a().a(drt.L, false).a(drt.M, false).a(drt.N, false).a(drt.O, true), np.a().a(nq.c, $$3).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.L, true), np.a().a(nq.c, $$4))
               .a(nk.a().a(drt.M, true), np.a().a(nq.c, $$4).a(nq.b, nq.a.b))
               .a(nk.a().a(drt.N, true), np.a().a(nq.c, $$5))
               .a(nk.a().a(drt.O, true), np.a().a(nq.c, $$5).a(nq.b, nq.a.b))
         );
      this.d(dec.eW);
   }

   private void E(dea $$0) {
      this.b.accept(nm.a($$0, np.a().a(nq.c, nu.a($$0))).a(b()));
   }

   private void V() {
      akn $$0 = nu.a(dec.dw);
      akn $$1 = nu.a(dec.dw, "_on");
      this.d(dec.dw);
      this.b
         .accept(
            nm.a(dec.dw)
               .a(a(drt.w, $$0, $$1))
               .a(
                  nn.a(drt.U, drt.R)
                     .a(dro.c, it.c, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.c))
                     .a(dro.c, it.f, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.d))
                     .a(dro.c, it.d, np.a().a(nq.a, nq.a.c))
                     .a(dro.c, it.e, np.a().a(nq.a, nq.a.c).a(nq.b, nq.a.b))
                     .a(dro.a, it.c, np.a())
                     .a(dro.a, it.f, np.a().a(nq.b, nq.a.b))
                     .a(dro.a, it.d, np.a().a(nq.b, nq.a.c))
                     .a(dro.a, it.e, np.a().a(nq.b, nq.a.d))
                     .a(dro.b, it.c, np.a().a(nq.a, nq.a.b))
                     .a(dro.b, it.f, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.b))
                     .a(dro.b, it.d, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.c))
                     .a(dro.b, it.e, np.a().a(nq.a, nq.a.b).a(nq.b, nq.a.d))
               )
         );
   }

   private void W() {
      this.d(dec.fm);
      this.b.accept(b(dec.fm, nu.a(dec.fm)));
   }

   private void X() {
      this.d(dec.tn);
      this.b.accept(c(dec.tn, nu.a(dec.tn)));
   }

   private void Y() {
      this.b.accept(nm.a(dec.ed).a(nn.a(drt.H).a(it.a.a, np.a().a(nq.c, nu.a(dec.ed, "_ns"))).a(it.a.c, np.a().a(nq.c, nu.a(dec.ed, "_ew")))));
   }

   private void Z() {
      akn $$0 = nz.a.create(dec.dV, this.c);
      this.b
         .accept(
            nm.a(
               dec.dV,
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
      akn $$0 = nu.a(dec.kO);
      akn $$1 = nu.a(dec.kO, "_on");
      this.b.accept(nm.a(dec.kO).a(a(drt.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      nx $$0 = new nx().a(ny.e, nx.a(dec.by, "_bottom")).a(ny.i, nx.a(dec.by, "_side"));
      akn $$1 = nx.a(dec.by, "_top_sticky");
      akn $$2 = nx.a(dec.by, "_top");
      nx $$3 = $$0.c(ny.E, $$1);
      nx $$4 = $$0.c(ny.E, $$2);
      akn $$5 = nu.a(dec.by, "_base");
      this.a(dec.by, $$5, $$4);
      this.a(dec.br, $$5, $$3);
      akn $$6 = nw.n.a(dec.by, "_inventory", $$0.c(ny.f, $$2), this.c);
      akn $$7 = nw.n.a(dec.br, "_inventory", $$0.c(ny.f, $$1), this.c);
      this.a(dec.by, $$6);
      this.a(dec.br, $$7);
   }

   private void a(dea $$0, akn $$1, nx $$2) {
      akn $$3 = nw.bh.a($$0, $$2, this.c);
      this.b.accept(nm.a($$0).a(a(drt.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      nx $$0 = new nx().a(ny.F, nx.a(dec.by, "_top")).a(ny.i, nx.a(dec.by, "_side"));
      nx $$1 = $$0.c(ny.E, nx.a(dec.by, "_top_sticky"));
      nx $$2 = $$0.c(ny.E, nx.a(dec.by, "_top"));
      this.b
         .accept(
            nm.a(dec.bz)
               .a(
                  nn.a(drt.x, drt.bg)
                     .a(false, dsf.a, np.a().a(nq.c, nw.bi.a(dec.by, "_head", $$2, this.c)))
                     .a(false, dsf.b, np.a().a(nq.c, nw.bi.a(dec.by, "_head_sticky", $$1, this.c)))
                     .a(true, dsf.a, np.a().a(nq.c, nw.bj.a(dec.by, "_head_short", $$2, this.c)))
                     .a(true, dsf.b, np.a().a(nq.c, nw.bj.a(dec.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      dea $$0 = dec.tr;
      nx $$1 = nx.a($$0, "_side_inactive", "_top_inactive");
      nx $$2 = nx.a($$0, "_side_active", "_top_active");
      nx $$3 = nx.a($$0, "_side_active", "_top_ejecting_reward");
      nx $$4 = nx.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      nx $$5 = nx.a($$0, "_side_active_ominous", "_top_active_ominous");
      nx $$6 = nx.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akn $$7 = nw.o.a($$0, $$1, this.c);
      akn $$8 = nw.o.a($$0, "_active", $$2, this.c);
      akn $$9 = nw.o.a($$0, "_ejecting_reward", $$3, this.c);
      akn $$10 = nw.o.a($$0, "_inactive_ominous", $$4, this.c);
      akn $$11 = nw.o.a($$0, "_active_ominous", $$5, this.c);
      akn $$12 = nw.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(nm.a($$0).a(nn.a(drt.by, drt.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> np.a().a(nq.c, $$7x ? $$10 : $$7);
            case b, c, d -> np.a().a(nq.c, $$7x ? $$11 : $$8);
            case e -> np.a().a(nq.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      dea $$0 = dec.ts;
      nx $$1 = nx.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      nx $$2 = nx.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      nx $$3 = nx.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      nx $$4 = nx.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akn $$5 = nw.bN.a($$0, $$1, this.c);
      akn $$6 = nw.bN.a($$0, "_active", $$2, this.c);
      akn $$7 = nw.bN.a($$0, "_unlocking", $$3, this.c);
      akn $$8 = nw.bN.a($$0, "_ejecting_reward", $$4, this.c);
      nx $$9 = nx.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      nx $$10 = nx.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      nx $$11 = nx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      nx $$12 = nx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akn $$13 = nw.bN.a($$0, "_ominous", $$9, this.c);
      akn $$14 = nw.bN.a($$0, "_active_ominous", $$10, this.c);
      akn $$15 = nw.bN.a($$0, "_unlocking_ominous", $$11, this.c);
      akn $$16 = nw.bN.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(nm.a($$0).a(b()).a(nn.a(dmv.b, dmv.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> np.a().a(nq.c, $$9x ? $$13 : $$5);
            case b -> np.a().a(nq.c, $$9x ? $$14 : $$6);
            case c -> np.a().a(nq.c, $$9x ? $$15 : $$7);
            case d -> np.a().a(nq.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      akn $$0 = nu.a(dec.qQ, "_inactive");
      akn $$1 = nu.a(dec.qQ, "_active");
      this.a(dec.qQ, $$0);
      this.b.accept(nm.a(dec.qQ).a(nn.a(drt.bo).a($$2 -> np.a().a(nq.c, $$2 != dsk.b && $$2 != dsk.c ? $$0 : $$1))));
   }

   private void ag() {
      akn $$0 = nu.a(dec.qR, "_inactive");
      akn $$1 = nu.a(dec.qR, "_active");
      this.a(dec.qR, $$0);
      this.b.accept(nm.a(dec.qR).a(nn.a(drt.bo).a($$2 -> np.a().a(nq.c, $$2 != dsk.b && $$2 != dsk.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      akn $$0 = nw.bM.a(dec.qV, nx.a(false), this.c);
      akn $$1 = nw.bM.a(dec.qV, "_can_summon", nx.a(true), this.c);
      this.a(dec.qV, $$0);
      this.b.accept(nm.a(dec.qV).a(a(drt.G, $$1, $$0)));
   }

   private void ai() {
      akn $$0 = nu.a(dec.nS, "_stable");
      akn $$1 = nu.a(dec.nS, "_unstable");
      this.a(dec.nS, $$0);
      this.b.accept(nm.a(dec.nS).a(a(drt.b, $$1, $$0)));
   }

   private void aj() {
      akn $$0 = this.a(dec.sv, "", nw.ao, nx::c);
      akn $$1 = this.a(dec.sv, "_lit", nw.ao, nx::c);
      this.b.accept(nm.a(dec.sv).a(a(drt.D, $$1, $$0)));
      akn $$2 = this.a(dec.sw, "", nw.ao, nx::c);
      akn $$3 = this.a(dec.sw, "_lit", nw.ao, nx::c);
      this.b.accept(nm.a(dec.sw).a(a(drt.D, $$3, $$2)));
   }

   private void ak() {
      akn $$0 = nz.a.create(dec.fB, this.c);
      akn $$1 = this.a(dec.fB, "_on", nw.c, nx::b);
      this.b.accept(nm.a(dec.fB).a(a(drt.r, $$1, $$0)));
   }

   private void l(dea $$0, dea $$1) {
      nx $$2 = nx.y($$0);
      this.b.accept(c($$0, nw.bf.a($$0, $$2, this.c)));
      this.b.accept(nm.a($$1, np.a().a(nq.c, nw.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      nx $$0 = nx.y(dec.dK);
      nx $$1 = nx.i(nx.a(dec.dK, "_off"));
      akn $$2 = nw.bf.a(dec.dK, $$0, this.c);
      akn $$3 = nw.bf.a(dec.dK, "_off", $$1, this.c);
      this.b.accept(nm.a(dec.dK).a(a(drt.r, $$2, $$3)));
      akn $$4 = nw.bg.a(dec.dL, $$0, this.c);
      akn $$5 = nw.bg.a(dec.dL, "_off", $$1, this.c);
      this.b.accept(nm.a(dec.dL).a(a(drt.r, $$4, $$5)).a(d()));
      this.d(dec.dK);
      this.c(dec.dL);
   }

   private void am() {
      this.a(ctt.lK);
      this.b.accept(nm.a(dec.eh).a(nn.a(drt.aA, drt.s, drt.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return np.a().a(nq.c, nx.a(dec.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(ctt.cT);
      this.b
         .accept(
            nm.a(dec.mV)
               .a(
                  nn.a(drt.aS, drt.C)
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
      nx $$0 = nx.a(dec.dN);
      akn $$1 = nw.c.a(dec.dP, $$0, this.c);
      this.b.accept(nm.a(dec.dN).a(nn.a(drt.aF).a($$1x -> np.a().a(nq.c, $$1x < 8 ? nu.a(dec.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dec.dN, nu.a(dec.dN, "_height2"));
      this.b.accept(c(dec.dP, $$1));
   }

   private void ap() {
      this.b.accept(nm.a(dec.oc, np.a().a(nq.c, nu.a(dec.oc))).a(b()));
   }

   private void aq() {
      akn $$0 = nz.a.create(dec.pa, this.c);
      this.a(dec.pa, $$0);
      this.b.accept(nm.a(dec.pa).a(nn.a(drt.bj).a($$0x -> np.a().a(nq.c, this.a(dec.pa, "_" + $$0x.c(), nw.c, nx::b)))));
   }

   private void ar() {
      this.a(ctt.wr);
      this.b.accept(nm.a(dec.oi).a(nn.a(drt.as).a($$0 -> np.a().a(nq.c, this.a(dec.oi, "_stage" + $$0, nw.ao, nx::c)))));
   }

   private void as() {
      this.a(ctt.ps);
      this.b
         .accept(
            nm.a(dec.fI)
               .a(
                  nn.a(drt.a, drt.M, drt.L, drt.N, drt.O)
                     .a(false, false, false, false, false, np.a().a(nq.c, nu.a(dec.fI, "_ns")))
                     .a(false, true, false, false, false, np.a().a(nq.c, nu.a(dec.fI, "_n")).a(nq.b, nq.a.b))
                     .a(false, false, true, false, false, np.a().a(nq.c, nu.a(dec.fI, "_n")))
                     .a(false, false, false, true, false, np.a().a(nq.c, nu.a(dec.fI, "_n")).a(nq.b, nq.a.c))
                     .a(false, false, false, false, true, np.a().a(nq.c, nu.a(dec.fI, "_n")).a(nq.b, nq.a.d))
                     .a(false, true, true, false, false, np.a().a(nq.c, nu.a(dec.fI, "_ne")))
                     .a(false, true, false, true, false, np.a().a(nq.c, nu.a(dec.fI, "_ne")).a(nq.b, nq.a.b))
                     .a(false, false, false, true, true, np.a().a(nq.c, nu.a(dec.fI, "_ne")).a(nq.b, nq.a.c))
                     .a(false, false, true, false, true, np.a().a(nq.c, nu.a(dec.fI, "_ne")).a(nq.b, nq.a.d))
                     .a(false, false, true, true, false, np.a().a(nq.c, nu.a(dec.fI, "_ns")))
                     .a(false, true, false, false, true, np.a().a(nq.c, nu.a(dec.fI, "_ns")).a(nq.b, nq.a.b))
                     .a(false, true, true, true, false, np.a().a(nq.c, nu.a(dec.fI, "_nse")))
                     .a(false, true, false, true, true, np.a().a(nq.c, nu.a(dec.fI, "_nse")).a(nq.b, nq.a.b))
                     .a(false, false, true, true, true, np.a().a(nq.c, nu.a(dec.fI, "_nse")).a(nq.b, nq.a.c))
                     .a(false, true, true, false, true, np.a().a(nq.c, nu.a(dec.fI, "_nse")).a(nq.b, nq.a.d))
                     .a(false, true, true, true, true, np.a().a(nq.c, nu.a(dec.fI, "_nsew")))
                     .a(true, false, false, false, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_ns")))
                     .a(true, false, true, false, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_n")))
                     .a(true, false, false, true, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_n")).a(nq.b, nq.a.c))
                     .a(true, true, false, false, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_n")).a(nq.b, nq.a.b))
                     .a(true, false, false, false, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_n")).a(nq.b, nq.a.d))
                     .a(true, true, true, false, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_ne")))
                     .a(true, true, false, true, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_ne")).a(nq.b, nq.a.b))
                     .a(true, false, false, true, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_ne")).a(nq.b, nq.a.c))
                     .a(true, false, true, false, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_ne")).a(nq.b, nq.a.d))
                     .a(true, false, true, true, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_ns")))
                     .a(true, true, false, false, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_ns")).a(nq.b, nq.a.b))
                     .a(true, true, true, true, false, np.a().a(nq.c, nu.a(dec.fI, "_attached_nse")))
                     .a(true, true, false, true, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_nse")).a(nq.b, nq.a.b))
                     .a(true, false, true, true, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_nse")).a(nq.b, nq.a.c))
                     .a(true, true, true, false, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_nse")).a(nq.b, nq.a.d))
                     .a(true, true, true, true, true, np.a().a(nq.c, nu.a(dec.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dec.fH);
      this.b.accept(nm.a(dec.fH).a(nn.a(drt.a, drt.w).a(($$0, $$1) -> np.a().a(nq.c, nx.a(dec.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akn a(int $$0, String $$1, nx $$2) {
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

   private akn a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", nx.b(nx.G(dec.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", nx.b(nx.a(dec.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", nx.b(nx.a(dec.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(ctt.kp);
      this.b.accept(nm.a(dec.mf).a(nn.a(drt.aD, drt.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(ctt.kq);
      Function<Integer, akn> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         nx $$2 = nx.a($$1);
         return nw.bw.a(dec.mg, $$1, $$2, this.c);
      };
      this.b.accept(nm.a(dec.mg).a(nn.a(dli.c).a($$1 -> np.a().a(nq.c, $$0.apply($$1)))));
   }

   private void F(dea $$0) {
      this.d($$0);
      akn $$1 = nu.a($$0);
      nl $$2 = nl.a($$0);
      nk.c $$3 = ac.a(nk.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.n().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dru, Function<akn, np>> $$4 : a) {
         dru $$5 = (dru)$$4.getFirst();
         Function<akn, np> $$6 = (Function<akn, np>)$$4.getSecond();
         if ($$0.n().b($$5)) {
            $$2.a(nk.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      akn $$0 = nx.a(dec.qU, "_bottom");
      nx $$1 = new nx().a(ny.e, $$0).a(ny.f, nx.a(dec.qU, "_top")).a(ny.i, nx.a(dec.qU, "_side"));
      nx $$2 = new nx().a(ny.e, $$0).a(ny.f, nx.a(dec.qU, "_top_bloom")).a(ny.i, nx.a(dec.qU, "_side_bloom"));
      akn $$3 = nw.n.a(dec.qU, "", $$1, this.c);
      akn $$4 = nw.n.a(dec.qU, "_bloom", $$2, this.c);
      this.b.accept(nm.a(dec.qU).a(nn.a(drt.E).a($$2x -> np.a().a(nq.c, $$2x ? $$4 : $$3))));
      this.a(ctt.gj, $$3);
   }

   private void ax() {
      dea $$0 = dec.cm;
      akn $$1 = nu.a($$0);
      nl $$2 = nl.a($$0);
      List.of(Pair.of(it.c, nq.a.a), Pair.of(it.f, nq.a.b), Pair.of(it.d, nq.a.c), Pair.of(it.e, nq.a.d)).forEach($$2x -> {
         it $$3 = (it)$$2x.getFirst();
         nq.a $$4 = (nq.a)$$2x.getSecond();
         nk.c $$5 = nk.a().a(drt.R, $$3);
         $$2.a($$5, np.a().a(nq.c, $$1).a(nq.b, $$4).a(nq.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, nu.a($$0, "_inventory"));
      i.clear();
   }

   private void a(nl $$0, nk.c $$1, nq.a $$2) {
      List.of(Pair.of(drt.bp, nw.aM), Pair.of(drt.bq, nw.aN), Pair.of(drt.br, nw.aO), Pair.of(drt.bs, nw.aP), Pair.of(drt.bt, nw.aQ), Pair.of(drt.bu, nw.aR))
         .forEach($$3 -> {
            dru $$4 = (dru)$$3.getFirst();
            nv $$5 = (nv)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(nl $$0, nk.c $$1, nq.a $$2, dru $$3, nv $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      nx $$7 = new nx().a(ny.b, nx.a(dec.cm, $$6));
      ng.d $$8 = new ng.d($$4, $$6);
      akn $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dec.cm, $$6, $$7, this.c));
      $$0.a(nk.a($$1, nk.a().a($$3, $$5)), np.a().a(nq.c, $$9).a(nq.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dec.kJ, nw.c.a(dec.kJ, nx.b(nu.a("magma")), this.c)));
   }

   private void G(dea $$0) {
      this.b($$0, nz.q);
      nw.bD.a(nu.a($$0.r()), nx.u($$0), this.c);
   }

   private void b(dea $$0, dea $$1, ng.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(dea $$0, dea $$1) {
      nw.bE.a(nu.a($$0.r()), nx.u($$1), this.c);
   }

   private void az() {
      akn $$0 = nu.a(dec.b);
      akn $$1 = nu.a(dec.b, "_mirrored");
      this.b.accept(a(dec.eN, $$0, $$1));
      this.a(dec.eN, $$0);
   }

   private void aA() {
      akn $$0 = nu.a(dec.sJ);
      akn $$1 = nu.a(dec.sJ, "_mirrored");
      this.b.accept(a(dec.td, $$0, $$1).a(f()));
      this.a(dec.td, $$0);
   }

   private void n(dea $$0, dea $$1) {
      this.a($$0, ng.e.b);
      nx $$2 = nx.d(nx.a($$0, "_pot"));
      akn $$3 = ng.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      akn $$0 = nx.a(dec.pl, "_bottom");
      akn $$1 = nx.a(dec.pl, "_top_off");
      akn $$2 = nx.a(dec.pl, "_top");
      akn[] $$3 = new akn[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         nx $$5 = new nx().a(ny.e, $$0).a(ny.f, $$4 == 0 ? $$1 : $$2).a(ny.i, nx.a(dec.pl, "_side" + $$4));
         $$3[$$4] = nw.n.a(dec.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(nm.a(dec.pl).a(nn.a(drt.aZ).a($$1x -> np.a().a(nq.c, $$3[$$1x]))));
      this.a(ctt.wP, $$3[0]);
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
      akn $$0 = nx.a(dec.pb, "_top");
      akn $$1 = nx.a(dec.pb, "_bottom");
      akn $$2 = nx.a(dec.pb, "_side");
      akn $$3 = nx.a(dec.pb, "_lock");
      nx $$4 = new nx().a(ny.o, $$2).a(ny.m, $$2).a(ny.l, $$2).a(ny.c, $$0).a(ny.j, $$0).a(ny.k, $$1).a(ny.n, $$3);
      akn $$5 = nw.b.a(dec.pb, $$4, this.c);
      this.b.accept(nm.a(dec.pb, np.a().a(nq.c, $$5)).a(nn.a(drt.T).a($$0x -> this.a($$0x, np.a()))));
   }

   private void aD() {
      dea $$0 = dec.n;
      akn $$1 = nu.a($$0);
      nz $$2 = nz.a.get($$0);
      dea $$3 = dec.jH;
      akn $$4 = nw.ab.a($$3, $$2.b(), this.c);
      akn $$5 = nw.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      lh.a().filter(li::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dec.rf).a(lh.w).a(dec.rf, dec.rD).a(dec.rj, dec.rn).a(lh.y);
      this.h(dec.re).a(lh.A).a(dec.re, dec.rC).a(dec.ri, dec.rm).a(lh.C);
      this.h(dec.rd).a(lh.E).a(dec.rd, dec.rB).a(dec.rh, dec.rl).a(lh.G);
      this.h(dec.rc).a(lh.I).a(dec.rc, dec.rA).a(dec.rg, dec.rk).a(lh.K);
      this.w(dec.sk);
      this.w(dec.sl);
      this.w(dec.sm);
      this.w(dec.sn);
      this.i(dec.sk, dec.so);
      this.i(dec.sl, dec.sp);
      this.i(dec.sm, dec.sq);
      this.i(dec.sn, dec.sr);
      this.m(dec.a);
      this.c(dec.nc, dec.a);
      this.c(dec.nb, dec.a);
      this.m(dec.fO);
      this.m(dec.dQ);
      this.c(dec.nd, dec.G);
      this.m(dec.fA);
      this.m(dec.me);
      this.m(dec.fr);
      this.m(dec.fR);
      this.a(ctt.ue);
      this.m(dec.pg);
      this.m(dec.G);
      this.m(dec.H);
      this.m(dec.hV);
      this.a(ctt.fS);
      this.o(dec.pM, dec.qd);
      this.o(dec.pN, dec.qe);
      this.o(dec.pO, dec.qf);
      this.o(dec.pP, dec.qg);
      this.o(dec.pQ, dec.qh);
      this.o(dec.pR, dec.qi);
      this.o(dec.pS, dec.qj);
      this.o(dec.pT, dec.qk);
      this.o(dec.pU, dec.ql);
      this.o(dec.pV, dec.qm);
      this.o(dec.pW, dec.qn);
      this.o(dec.pX, dec.qo);
      this.o(dec.pY, dec.qp);
      this.o(dec.pZ, dec.qq);
      this.o(dec.qa, dec.qr);
      this.o(dec.qb, dec.qs);
      this.o(dec.pL, dec.qc);
      this.m(dec.na);
      this.m(dec.gs);
      this.m(dec.qP);
      this.m(dec.sx);
      this.s(dec.sy);
      this.s(dec.sz);
      this.t(dec.ti);
      this.t(dec.tj);
      this.aj();
      this.g(dec.sC, dec.sA);
      this.p(dec.sB);
      this.a(dec.hW, ctt.hB);
      this.a(ctt.hB);
      this.aE();
      this.a(dec.kN, ctt.jb);
      this.a(ctt.jb);
      this.f(dec.bQ, nx.a(dec.by, "_side"));
      this.a(dec.R);
      this.a(dec.S);
      this.a(dec.iB);
      this.a(dec.cx);
      this.a(dec.cy);
      this.a(dec.cz);
      this.a(dec.fE);
      this.a(dec.fF);
      this.a(dec.fJ);
      this.a(dec.N);
      this.a(dec.T);
      this.a(dec.O);
      this.a(dec.ch);
      this.a(dec.P);
      this.a(dec.Q);
      this.a(dec.ci);
      this.b(dec.pj, nz.d);
      this.a(dec.pi);
      this.a(dec.aR);
      this.a(dec.aS);
      this.a(dec.aT);
      this.a(dec.hb);
      this.a(dec.dI);
      this.a(dec.dJ);
      this.a(dec.ha);
      this.a(dec.pC);
      this.a(dec.mW);
      this.a(dec.dR);
      this.a(dec.k);
      this.a(dec.pk);
      this.a(dec.fz);
      this.a(dec.ec);
      this.a(dec.L);
      this.a(dec.ph);
      this.a(dec.dO);
      this.b(dec.dT, nz.g);
      this.b(dec.pq, nz.d);
      this.b(dec.fa, nz.d);
      this.m(dec.ac);
      this.m(dec.ga);
      this.a(dec.kK);
      this.a(dec.aY);
      this.a(dec.iC);
      this.a(dec.co);
      this.a(dec.pK);
      this.a(dec.ii);
      this.a(dec.oy);
      this.a(dec.dW);
      this.a(dec.dX);
      this.b(dec.ct, nz.b);
      this.a(dec.aO);
      this.b(dec.bw, nz.v);
      this.a(ctt.cS);
      this.b(dec.ck, nz.f);
      this.b(dec.pd, nz.d);
      this.a(dec.op);
      this.a(dec.aP);
      this.a(dec.qt);
      this.a(dec.qu);
      this.a(dec.qN);
      this.a(dec.su);
      this.a(dec.tf);
      this.a(dec.tg);
      this.a(dec.th);
      this.e(dec.qS);
      this.m(dec.tt);
      this.aD();
      this.a(dec.ra);
      this.a(dec.rb);
      this.a(dec.qW);
      this.a(dec.qX);
      this.a(dec.qY);
      this.a(dec.qZ);
      this.k(dec.qW, dec.rw);
      this.k(dec.qX, dec.ry);
      this.k(dec.qY, dec.rx);
      this.k(dec.qZ, dec.rz);
      this.i(dec.rM);
      this.i(dec.rN);
      this.i(dec.rP);
      this.i(dec.rO);
      this.a(dec.rM, dec.rQ);
      this.a(dec.rN, dec.rR);
      this.a(dec.rP, dec.rT);
      this.a(dec.rO, dec.rS);
      this.k(dec.rU);
      this.k(dec.rV);
      this.k(dec.rX);
      this.k(dec.rW);
      this.b(dec.rU, dec.rY);
      this.b(dec.rV, dec.rZ);
      this.b(dec.rX, dec.sb);
      this.b(dec.rW, dec.sa);
      this.a(dec.sc);
      this.a(dec.sd);
      this.a(dec.se);
      this.a(dec.sf);
      this.k(dec.sc, dec.sg);
      this.k(dec.sd, dec.sh);
      this.k(dec.se, dec.si);
      this.k(dec.sf, dec.sj);
      this.j(dec.gW, dec.ch);
      this.j(dec.gX, dec.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dec.og, dec.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dec.kt);
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
      this.F(dec.ff);
      this.F(dec.fg);
      this.F(dec.qT);
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
      this.E(dec.cO);
      this.d(dec.cO);
      this.E(dec.oa);
      this.g();
      this.E(dec.sE);
      this.l(dec.cp, dec.cq);
      this.l(dec.ea, dec.eb);
      this.a(dec.cA, dec.n, nx::c);
      this.a(dec.nY, dec.p, nx::d);
      this.y(dec.ow);
      this.y(dec.on);
      this.v(dec.aU);
      this.v(dec.hi);
      this.C();
      this.D(dec.oe);
      this.D(dec.of);
      this.e(dec.eX, nu.a(dec.eX));
      this.a(dec.dY, nz.d);
      this.a(dec.dZ, nz.d);
      this.a(dec.te);
      this.a(dec.kM, nz.d);
      this.f(dec.j);
      this.f(dec.sH);
      this.f(dec.I);
      this.g(dec.J);
      this.g(dec.M);
      this.f(dec.K);
      this.e(dec.F);
      this.b(dec.to, nz.f);
      this.a(dec.ij, nz.d, nz.e);
      this.a(dec.kx, nz.w, nz.x);
      this.a(dec.hf, nz.w, nz.x);
      this.a(dec.tk, nz.d, nz.e);
      this.a(dec.tl, nz.d, nz.e);
      this.a(dec.tm, nz.d, nz.e);
      this.c(dec.nT, nz.i);
      this.z();
      this.a(dec.pe, nx::A);
      this.a(dec.pf, nx::C);
      this.a(dec.kD, drt.as, 0, 1, 2, 3);
      this.a(dec.gt, drt.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dec.fq, drt.as, 0, 1, 1, 2);
      this.a(dec.gu, drt.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dec.cB, drt.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dec.kA, ng.e.b, drt.aq, 0, 1);
      this.i();
      this.h();
      this.a(nu.a("decorated_pot"), dec.iA).b(dec.tp);
      this.a(nu.a("banner"), dec.n)
         .a(nw.bF, dec.iJ, dec.iK, dec.iL, dec.iM, dec.iN, dec.iO, dec.iP, dec.iQ, dec.iR, dec.iS, dec.iT, dec.iU, dec.iV, dec.iW, dec.iX, dec.iY)
         .b(dec.iZ, dec.ja, dec.jb, dec.jc, dec.jd, dec.je, dec.jf, dec.jg, dec.jh, dec.ji, dec.jj, dec.jk, dec.jl, dec.jm, dec.jn, dec.jo);
      this.a(nu.a("bed"), dec.n)
         .b(dec.aZ, dec.ba, dec.bb, dec.bc, dec.bd, dec.be, dec.bf, dec.bg, dec.bh, dec.bi, dec.bj, dec.bk, dec.bl, dec.bm, dec.bn, dec.bo);
      this.m(dec.aZ, dec.bA);
      this.m(dec.ba, dec.bB);
      this.m(dec.bb, dec.bC);
      this.m(dec.bc, dec.bD);
      this.m(dec.bd, dec.bE);
      this.m(dec.be, dec.bF);
      this.m(dec.bf, dec.bG);
      this.m(dec.bg, dec.bH);
      this.m(dec.bh, dec.bI);
      this.m(dec.bi, dec.bJ);
      this.m(dec.bj, dec.bK);
      this.m(dec.bk, dec.bL);
      this.m(dec.bl, dec.bM);
      this.m(dec.bm, dec.bN);
      this.m(dec.bn, dec.bO);
      this.m(dec.bo, dec.bP);
      this.a(nu.a("skull"), dec.dW)
         .a(nw.bG, dec.gM, dec.gK, dec.gI, dec.gE, dec.gG, dec.gQ)
         .a(dec.gO)
         .b(dec.gN, dec.gP, dec.gL, dec.gJ, dec.gF, dec.gH, dec.gR);
      this.G(dec.kP);
      this.G(dec.kQ);
      this.G(dec.kR);
      this.G(dec.kS);
      this.G(dec.kT);
      this.G(dec.kU);
      this.G(dec.kV);
      this.G(dec.kW);
      this.G(dec.kX);
      this.G(dec.kY);
      this.G(dec.kZ);
      this.G(dec.la);
      this.G(dec.lb);
      this.G(dec.lc);
      this.G(dec.ld);
      this.G(dec.le);
      this.G(dec.lf);
      this.b(dec.mX, nz.q);
      this.c(dec.mX);
      this.a(nu.a("chest"), dec.n).b(dec.cv, dec.gV);
      this.a(nu.a("ender_chest"), dec.co).b(dec.fG);
      this.f(dec.fx, dec.co).a(dec.fx, dec.kF);
      this.a(dec.aM);
      this.a(dec.aN);
      this.a(dec.lw);
      this.a(dec.lx);
      this.a(dec.ly);
      this.a(dec.lz);
      this.a(dec.lA);
      this.a(dec.lB);
      this.a(dec.lC);
      this.a(dec.lD);
      this.a(dec.lE);
      this.a(dec.lF);
      this.a(dec.lG);
      this.a(dec.lH);
      this.a(dec.lI);
      this.a(dec.lJ);
      this.a(dec.lK);
      this.a(dec.lL);
      this.a(nz.a, dec.lM, dec.lN, dec.lO, dec.lP, dec.lQ, dec.lR, dec.lS, dec.lT, dec.lU, dec.lV, dec.lW, dec.lX, dec.lY, dec.lZ, dec.ma, dec.mb);
      this.a(dec.iA);
      this.a(dec.hj);
      this.a(dec.hk);
      this.a(dec.hl);
      this.a(dec.hm);
      this.a(dec.hn);
      this.a(dec.ho);
      this.a(dec.hp);
      this.a(dec.hq);
      this.a(dec.hr);
      this.a(dec.hs);
      this.a(dec.ht);
      this.a(dec.hu);
      this.a(dec.hv);
      this.a(dec.hw);
      this.a(dec.hx);
      this.a(dec.hy);
      this.a(dec.qO);
      this.h(dec.aQ, dec.eY);
      this.h(dec.ei, dec.hz);
      this.h(dec.ej, dec.hA);
      this.h(dec.ek, dec.hB);
      this.h(dec.el, dec.hC);
      this.h(dec.em, dec.hD);
      this.h(dec.en, dec.hE);
      this.h(dec.eo, dec.hF);
      this.h(dec.ep, dec.hG);
      this.h(dec.eq, dec.hH);
      this.h(dec.er, dec.hI);
      this.h(dec.es, dec.hJ);
      this.h(dec.et, dec.hK);
      this.h(dec.eu, dec.hL);
      this.h(dec.ev, dec.hM);
      this.h(dec.ew, dec.hN);
      this.h(dec.ex, dec.hO);
      this.b(nz.o, dec.lg, dec.lh, dec.li, dec.lj, dec.lk, dec.ll, dec.lm, dec.ln, dec.lo, dec.lp, dec.lq, dec.lr, dec.ls, dec.lt, dec.lu, dec.lv);
      this.g(dec.bA, dec.ik);
      this.g(dec.bB, dec.il);
      this.g(dec.bC, dec.im);
      this.g(dec.bD, dec.in);
      this.g(dec.bE, dec.io);
      this.g(dec.bF, dec.ip);
      this.g(dec.bG, dec.iq);
      this.g(dec.bH, dec.ir);
      this.g(dec.bI, dec.is);
      this.g(dec.bJ, dec.it);
      this.g(dec.bK, dec.iu);
      this.g(dec.bL, dec.iv);
      this.g(dec.bM, dec.iw);
      this.g(dec.bN, dec.ix);
      this.g(dec.bO, dec.iy);
      this.g(dec.bP, dec.iz);
      this.a(dec.sI);
      this.a(dec.eL);
      this.a(dec.bu, dec.gb, ng.e.a);
      this.a(dec.bR, dec.gc, ng.e.b);
      this.a(dec.bT, dec.gd, ng.e.b);
      this.a(dec.bU, dec.ge, ng.e.b);
      this.a(dec.bV, dec.gf, ng.e.b);
      this.a(dec.bW, dec.gg, ng.e.b);
      this.a(dec.bX, dec.gh, ng.e.b);
      this.a(dec.bY, dec.gi, ng.e.b);
      this.a(dec.bZ, dec.gj, ng.e.b);
      this.a(dec.ca, dec.gk, ng.e.b);
      this.a(dec.cb, dec.gl, ng.e.b);
      this.a(dec.cc, dec.gm, ng.e.b);
      this.a(dec.ce, dec.gn, ng.e.b);
      this.a(dec.cd, dec.go, ng.e.b);
      this.a(dec.cg, dec.gp, ng.e.b);
      this.a(dec.cf, dec.gq, ng.e.b);
      this.a(dec.bv, dec.gr, ng.e.b);
      this.a(dec.bS, dec.fS, ng.e.b);
      this.H();
      this.u(dec.eT);
      this.u(dec.eU);
      this.u(dec.eV);
      this.a(dec.bt, ng.e.a);
      this.b(dec.dS, ng.e.a);
      this.a(ctt.dJ);
      this.b(dec.mc, dec.md, ng.e.b);
      this.a(ctt.dK);
      this.c(dec.md);
      this.b(dec.sG, ng.e.b);
      this.c(dec.sG);
      this.c(dec.sw);
      this.b(dec.oz, dec.oA, ng.e.b);
      this.b(dec.oB, dec.oC, ng.e.b);
      this.a(dec.oz, "_plant");
      this.c(dec.oA);
      this.a(dec.oB, "_plant");
      this.c(dec.oC);
      this.a(dec.mY, ng.e.a, nx.c(nx.a(dec.mZ, "_stage0")));
      this.m();
      this.a(dec.bs, ng.e.b);
      this.c(dec.iE, ng.e.b);
      this.c(dec.iF, ng.e.b);
      this.c(dec.iG, ng.e.b);
      this.c(dec.iH, ng.e.a);
      this.c(dec.iI, ng.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dec.mw, dec.mr, dec.mm, dec.mh, dec.mG, dec.mB, dec.mQ, dec.mL);
      this.a(dec.mx, dec.ms, dec.mn, dec.mi, dec.mH, dec.mC, dec.mR, dec.mM);
      this.a(dec.my, dec.mt, dec.mo, dec.mj, dec.mI, dec.mD, dec.mS, dec.mN);
      this.a(dec.mz, dec.mu, dec.mp, dec.mk, dec.mJ, dec.mE, dec.mT, dec.mO);
      this.a(dec.mA, dec.mv, dec.mq, dec.ml, dec.mK, dec.mF, dec.mU, dec.mP);
      this.e(dec.fe, dec.fc);
      this.e(dec.fd, dec.fb);
      this.l(dec.ab).c(dec.ab).a(dec.av);
      this.l(dec.am).c(dec.am).a(dec.aD);
      this.a(dec.am, dec.dj, dec.ds);
      this.b(dec.aL, nz.s);
      this.l(dec.Y).c(dec.Y).a(dec.as);
      this.l(dec.ai).c(dec.ai).a(dec.aA);
      this.a(dec.ai, dec.dd, dec.do);
      this.a(dec.B, dec.fX, ng.e.b);
      this.b(dec.aI, nz.s);
      this.l(dec.Z).d(dec.Z).a(dec.at);
      this.l(dec.aj).d(dec.aj).a(dec.aB);
      this.a(dec.aj, dec.de, dec.dp);
      this.a(dec.C, dec.fY, ng.e.b);
      this.b(dec.aJ, nz.s);
      this.l(dec.W).c(dec.W).a(dec.aq);
      this.l(dec.ag).c(dec.ag).a(dec.ay);
      this.a(dec.ag, dec.dc, dec.dn);
      this.a(dec.z, dec.fV, ng.e.b);
      this.b(dec.aG, nz.s);
      this.l(dec.U).c(dec.U).a(dec.ao);
      this.l(dec.al).c(dec.al).a(dec.aw);
      this.a(dec.al, dec.da, dec.dl);
      this.a(dec.x, dec.fT, ng.e.b);
      this.b(dec.aE, nz.s);
      this.l(dec.V).c(dec.V).a(dec.ap);
      this.l(dec.af).c(dec.af).a(dec.ax);
      this.a(dec.af, dec.db, dec.dm);
      this.a(dec.y, dec.fU, ng.e.b);
      this.b(dec.aF, nz.s);
      this.l(dec.aa).c(dec.aa).a(dec.au);
      this.l(dec.ak).c(dec.ak).a(dec.aC);
      this.a(dec.ak, dec.dg, dec.dr);
      this.a(dec.D, dec.fZ, ng.e.b);
      this.b(dec.aK, nz.s);
      this.l(dec.X).c(dec.X).a(dec.ar);
      this.l(dec.ah).c(dec.ah).a(dec.az);
      this.a(dec.ah, dec.df, dec.dq);
      this.a(dec.A, dec.fW, ng.e.b);
      this.b(dec.aH, nz.s);
      this.l(dec.os).b(dec.os).a(dec.ou);
      this.l(dec.ot).b(dec.ot).a(dec.ov);
      this.a(dec.ot, dec.dh, dec.dt);
      this.a(dec.ox, dec.pm, ng.e.b);
      this.n(dec.oD, dec.po);
      this.l(dec.oj).b(dec.oj).a(dec.ol);
      this.l(dec.ok).b(dec.ok).a(dec.om);
      this.a(dec.ok, dec.di, dec.du);
      this.a(dec.oo, dec.pn, ng.e.b);
      this.n(dec.oq, dec.pp);
      this.l(dec.ae).d(dec.ae);
      this.l(dec.an).d(dec.an);
      this.a(dec.v, dec.dk, dec.dv);
      this.b(dec.or, ng.e.b);
      this.a(ctt.dG);
      this.i(dec.dy);
      this.k(dec.hY);
      this.u();
      this.n(dec.cP);
      this.o(dec.bp);
      this.o(dec.bq);
      this.o(dec.hh);
      this.t();
      this.q(dec.fN);
      this.q(dec.kG);
      this.q(dec.kH);
      this.r(dec.gS);
      this.r(dec.gT);
      this.r(dec.gU);
      this.o();
      this.p();
      this.d(dec.cD, nz.h);
      this.d(dec.nW, nz.h);
      this.d(dec.nV, nz.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dec.eK, dec.eS);
      this.k(dec.m, dec.eO);
      this.k(dec.eJ, dec.eR);
      this.k(dec.eI, dec.eQ);
      this.az();
      this.k(dec.eH, dec.eP);
      this.aA();
      cux.h().forEach($$0 -> this.a($$0, nu.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dec.hX);
      nn.a<Integer> $$0 = nn.a(drt.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         akn $$3 = nx.a(ctt.hC, $$2);
         $$0.a($$1, np.a().a(nq.c, nw.aa.a(dec.hX, $$2, nx.h($$3), this.c)));
         nw.bx.a(nu.a(ctt.hC, $$2), nx.k($$3), this.c);
      }

      this.b.accept(nm.a(dec.hX).a($$0));
   }

   private void o(dea $$0, dea $$1) {
      this.a($$0.r());
      nx $$2 = nx.b(nx.G($$0));
      nx $$3 = nx.b(nx.a($$0, "_lit"));
      akn $$4 = nw.bH.a($$0, "_one_candle", $$2, this.c);
      akn $$5 = nw.bI.a($$0, "_two_candles", $$2, this.c);
      akn $$6 = nw.bJ.a($$0, "_three_candles", $$2, this.c);
      akn $$7 = nw.bK.a($$0, "_four_candles", $$2, this.c);
      akn $$8 = nw.bH.a($$0, "_one_candle_lit", $$3, this.c);
      akn $$9 = nw.bI.a($$0, "_two_candles_lit", $$3, this.c);
      akn $$10 = nw.bJ.a($$0, "_three_candles_lit", $$3, this.c);
      akn $$11 = nw.bK.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            nm.a($$0)
               .a(
                  nn.a(drt.az, drt.r)
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
      akn $$12 = nw.bL.a($$1, nx.a($$0, false), this.c);
      akn $$13 = nw.bL.a($$1, "_lit", nx.a($$0, true), this.c);
      this.b.accept(nm.a($$1).a(a(drt.r, $$13, $$12)));
   }

   class a {
      private final akn b;

      public a(akn $$0, dea $$1) {
         this.b = nw.aa.a($$0, nx.u($$1), ng.this.c);
      }

      public ng.a a(dea... $$0) {
         for (dea $$1 : $$0) {
            ng.this.b.accept(ng.c($$1, this.b));
         }

         return this;
      }

      public ng.a b(dea... $$0) {
         for (dea $$1 : $$0) {
            ng.this.c($$1);
         }

         return this.a($$0);
      }

      public ng.a a(nv $$0, dea... $$1) {
         for (dea $$2 : $$1) {
            $$0.a(nu.a($$2.r()), nx.u($$2), ng.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final nx b;
      private final Map<nv, akn> c = Maps.newHashMap();
      @Nullable
      private li d;
      @Nullable
      private akn e;
      private final Set<dea> f = new HashSet<>();

      public b(nx $$0) {
         this.b = $$0;
      }

      public ng.b a(dea $$0, nv $$1) {
         this.e = $$1.a($$0, this.b, ng.this.c);
         if (ng.this.f.containsKey($$0)) {
            ng.this.b.accept(ng.this.f.get($$0).create($$0, this.e, this.b, ng.this.c));
         } else {
            ng.this.b.accept(ng.c($$0, this.e));
         }

         return this;
      }

      public ng.b a(dea $$0, dea $$1) {
         akn $$2 = nu.a($$0);
         ng.this.b.accept(ng.c($$1, $$2));
         ng.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public ng.b a(dea $$0) {
         akn $$1 = nw.s.a($$0, this.b, ng.this.c);
         akn $$2 = nw.t.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.b($$0, $$1, $$2));
         akn $$3 = nw.u.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$3);
         return this;
      }

      public ng.b b(dea $$0) {
         akn $$1 = nw.M.a($$0, this.b, ng.this.c);
         akn $$2 = nw.N.a($$0, this.b, ng.this.c);
         akn $$3 = nw.O.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$1, $$2, $$3));
         akn $$4 = nw.P.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$4);
         return this;
      }

      public ng.b c(dea $$0) {
         nx $$1 = nx.p($$0);
         akn $$2 = nw.D.a($$0, $$1, ng.this.c);
         akn $$3 = nw.E.a($$0, $$1, ng.this.c);
         akn $$4 = nw.F.a($$0, $$1, ng.this.c);
         akn $$5 = nw.G.a($$0, $$1, ng.this.c);
         akn $$6 = nw.H.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$2, $$3, $$4, $$5, $$6));
         akn $$7 = nw.I.a($$0, $$1, ng.this.c);
         ng.this.a($$0, $$7);
         return this;
      }

      public ng.b d(dea $$0) {
         akn $$1 = nw.J.a($$0, this.b, ng.this.c);
         akn $$2 = nw.K.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.c($$0, $$1, $$2));
         akn $$3 = nw.L.a($$0, this.b, ng.this.c);
         ng.this.a($$0, $$3);
         return this;
      }

      public ng.b e(dea $$0) {
         nx $$1 = nx.p($$0);
         akn $$2 = nw.R.a($$0, $$1, ng.this.c);
         akn $$3 = nw.Q.a($$0, $$1, ng.this.c);
         akn $$4 = nw.T.a($$0, $$1, ng.this.c);
         akn $$5 = nw.S.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public ng.b f(dea $$0) {
         akn $$1 = nw.V.a($$0, this.b, ng.this.c);
         akn $$2 = nw.U.a($$0, this.b, ng.this.c);
         akn $$3 = nw.X.a($$0, this.b, ng.this.c);
         akn $$4 = nw.W.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public ng.b g(dea $$0) {
         akn $$1 = nw.Y.a($$0, this.b, ng.this.c);
         akn $$2 = nw.Z.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.e($$0, $$1, $$2));
         return this;
      }

      public ng.b h(dea $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dea $$1 = this.d.b().get(li.b.r);
            akn $$2 = nw.aa.a($$0, this.b, ng.this.c);
            ng.this.b.accept(ng.c($$0, $$2));
            ng.this.b.accept(ng.c($$1, $$2));
            ng.this.a($$0.r());
            ng.this.c($$1);
            return this;
         }
      }

      public ng.b i(dea $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akn $$1 = this.a(nw.ab, $$0);
            akn $$2 = this.a(nw.ac, $$0);
            ng.this.b.accept(ng.e($$0, $$1, $$2, this.e));
            ng.this.a($$0, $$1);
            return this;
         }
      }

      public ng.b j(dea $$0) {
         akn $$1 = this.a(nw.af, $$0);
         akn $$2 = this.a(nw.ae, $$0);
         akn $$3 = this.a(nw.ag, $$0);
         ng.this.b.accept(ng.b($$0, $$1, $$2, $$3));
         ng.this.a($$0, $$2);
         return this;
      }

      private ng.b k(dea $$0) {
         nz $$1 = ng.this.g.getOrDefault($$0, nz.a.get($$0));
         akn $$2 = $$1.a($$0, ng.this.c);
         ng.this.b.accept(ng.c($$0, $$2));
         return this;
      }

      private ng.b l(dea $$0) {
         ng.this.i($$0);
         return this;
      }

      private void m(dea $$0) {
         if (ng.this.e.contains($$0)) {
            ng.this.k($$0);
         } else {
            ng.this.j($$0);
         }
      }

      private akn a(nv $$0, dea $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, ng.this.c));
      }

      public ng.b a(li $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<ng.b, dea> $$2 = ng.h.get($$0x);
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
      nj create(dea var1, akn var2, nx var3, BiConsumer<akn, Supplier<JsonElement>> var4);
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

      public ng.f a(dea $$0) {
         nx $$1 = this.b.c(ny.d, this.b.a(ny.i));
         akn $$2 = nw.j.a($$0, $$1, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$2));
         return this;
      }

      public ng.f b(dea $$0) {
         akn $$1 = nw.j.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$1));
         return this;
      }

      public ng.f c(dea $$0) {
         akn $$1 = nw.j.a($$0, this.b, ng.this.c);
         akn $$2 = nw.k.a($$0, this.b, ng.this.c);
         ng.this.b.accept(ng.d($$0, $$1, $$2));
         return this;
      }

      public ng.f d(dea $$0) {
         ng.this.b.accept(ng.a($$0, this.b, ng.this.c));
         return this;
      }
   }
}
