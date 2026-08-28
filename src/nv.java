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

public class nv {
   final Consumer<nz> b;
   final BiConsumer<ali, Supplier<JsonElement>> c;
   private final Consumer<cvx> d;
   final List<die> e = ImmutableList.of(dig.ey, dig.eE, dig.hY);
   final Map<die, nv.c> f = ImmutableMap.builder().put(dig.b, nv::a).put(dig.sJ, nv::c).put(dig.eM, nv::b).build();
   final Map<die, op> g = ImmutableMap.builder()
      .put(dig.aV, op.y.get(dig.aV))
      .put(dig.jp, op.y.get(dig.jp))
      .put(dig.jS, op.a(on.a(dig.aV, "_top")))
      .put(dig.jU, op.a(on.a(dig.jp, "_top")))
      .put(dig.aX, op.d.get(dig.aV).a($$0x -> $$0x.a(oo.i, on.G(dig.aX))))
      .put(dig.jr, op.d.get(dig.jp).a($$0x -> $$0x.a(oo.i, on.G(dig.jr))))
      .put(dig.hd, op.d.get(dig.hd))
      .put(dig.jT, op.a(on.a(dig.hd, "_bottom")))
      .put(dig.pr, op.z.get(dig.pr))
      .put(dig.sJ, op.z.get(dig.sJ))
      .put(dig.he, op.d.get(dig.he).a($$0x -> $$0x.a(oo.i, on.G(dig.he))))
      .put(dig.aW, op.d.get(dig.aW).a($$0x -> {
         $$0x.a(oo.d, on.a(dig.aV, "_top"));
         $$0x.a(oo.i, on.G(dig.aW));
      }))
      .put(dig.jq, op.d.get(dig.jq).a($$0x -> {
         $$0x.a(oo.d, on.a(dig.jp, "_top"));
         $$0x.a(oo.i, on.G(dig.jq));
      }))
      .put(dig.qM, op.z.get(dig.qM))
      .put(dig.qH, op.z.get(dig.qH))
      .build();
   static final Map<mc.b, BiConsumer<nv.b, die>> h = ImmutableMap.builder()
      .put(mc.b.a, nv.b::a)
      .put(mc.b.e, nv.b::l)
      .put(mc.b.b, nv.b::k)
      .put(mc.b.c, nv.b::k)
      .put(mc.b.f, nv.b::c)
      .put(mc.b.g, nv.b::d)
      .put(mc.b.h, nv.b::e)
      .put(mc.b.i, nv.b::f)
      .put(mc.b.k, nv.b::h)
      .put(mc.b.l, nv.b::i)
      .put(mc.b.m, nv.b::j)
      .put(mc.b.n, nv.b::g)
      .put(mc.b.p, nv.b::m)
      .put(mc.b.q, nv.b::b)
      .build();
   public static final List<Pair<dwa, Function<ali, of>>> a = List.of(
      Pair.of(dvz.L, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0)),
      Pair.of(dvz.M, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0).a(og.b, og.a.b).a(og.d, true)),
      Pair.of(dvz.N, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0).a(og.b, og.a.c).a(og.d, true)),
      Pair.of(dvz.O, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0).a(og.b, og.a.d).a(og.d, true)),
      Pair.of(dvz.J, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0).a(og.a, og.a.d).a(og.d, true)),
      Pair.of(dvz.K, (Function<ali, of>)$$0 -> of.a().a(og.c, $$0).a(og.a, og.a.b).a(og.d, true))
   );
   private static final Map<nv.d, ali> i = new HashMap<>();

   private static nz a(die $$0, ali $$1, on $$2, BiConsumer<ali, Supplier<JsonElement>> $$3) {
      ali $$4 = om.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static nz b(die $$0, ali $$1, on $$2, BiConsumer<ali, Supplier<JsonElement>> $$3) {
      ali $$4 = om.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static nz c(die $$0, ali $$1, on $$2, BiConsumer<ali, Supplier<JsonElement>> $$3) {
      ali $$4 = om.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public nv(Consumer<nz> $$0, BiConsumer<ali, Supplier<JsonElement>> $$1, Consumer<cvx> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void c(die $$0) {
      this.d.accept($$0.j());
   }

   void a(die $$0, ali $$1) {
      this.c.accept(ok.a($$0.j()), new oj($$1));
   }

   private void a(cvx $$0, ali $$1) {
      this.c.accept(ok.a($$0), new oj($$1));
   }

   void a(cvx $$0) {
      om.bz.a(ok.a($$0), on.b($$0), this.c);
   }

   private void d(die $$0) {
      cvx $$1 = $$0.j();
      if ($$1 != cwf.a) {
         om.bz.a(ok.a($$1), on.F($$0), this.c);
      }
   }

   private void a(die $$0, String $$1) {
      cvx $$2 = $$0.j();
      om.bz.a(ok.a($$2), on.k(on.a($$0, $$1)), this.c);
   }

   private static od b() {
      return od.a(dvz.R).a(jm.f, of.a().a(og.b, og.a.b)).a(jm.d, of.a().a(og.b, og.a.c)).a(jm.e, of.a().a(og.b, og.a.d)).a(jm.c, of.a());
   }

   private static od c() {
      return od.a(dvz.R).a(jm.d, of.a()).a(jm.e, of.a().a(og.b, og.a.b)).a(jm.c, of.a().a(og.b, og.a.c)).a(jm.f, of.a().a(og.b, og.a.d));
   }

   private static od d() {
      return od.a(dvz.R).a(jm.f, of.a()).a(jm.d, of.a().a(og.b, og.a.b)).a(jm.e, of.a().a(og.b, og.a.c)).a(jm.c, of.a().a(og.b, og.a.d));
   }

   private static od e() {
      return od.a(dvz.P)
         .a(jm.a, of.a().a(og.a, og.a.b))
         .a(jm.b, of.a().a(og.a, og.a.d))
         .a(jm.c, of.a())
         .a(jm.d, of.a().a(og.b, og.a.c))
         .a(jm.e, of.a().a(og.b, og.a.d))
         .a(jm.f, of.a().a(og.b, og.a.b));
   }

   private static oc b(die $$0, ali $$1) {
      return oc.a($$0, a($$1));
   }

   private static of[] a(ali $$0) {
      return new of[]{of.a().a(og.c, $$0), of.a().a(og.c, $$0).a(og.b, og.a.b), of.a().a(og.c, $$0).a(og.b, og.a.c), of.a().a(og.c, $$0).a(og.b, og.a.d)};
   }

   private static oc a(die $$0, ali $$1, ali $$2) {
      return oc.a($$0, of.a().a(og.c, $$1), of.a().a(og.c, $$2), of.a().a(og.c, $$1).a(og.b, og.a.c), of.a().a(og.c, $$2).a(og.b, og.a.c));
   }

   private static od a(dwa $$0, ali $$1, ali $$2) {
      return od.a($$0).a(true, of.a().a(og.c, $$1)).a(false, of.a().a(og.c, $$2));
   }

   private void e(die $$0) {
      ali $$1 = op.a.create($$0, this.c);
      ali $$2 = op.c.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void f(die $$0) {
      ali $$1 = op.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   private void g(die $$0) {
      this.b.accept(oc.a($$0).a(od.a(dvz.bv).a($$1 -> {
         String $$2 = "_" + $$1;
         ali $$3 = on.a($$0, $$2);
         return of.a().a(og.c, om.c.a($$0, $$2, new on().a(oo.a, $$3), this.c));
      })));
      this.a($$0, on.a($$0, "_0"));
   }

   static nz b(die $$0, ali $$1, ali $$2) {
      return oc.a($$0)
         .a(od.a(dvz.w).a(false, of.a().a(og.c, $$1)).a(true, of.a().a(og.c, $$2)))
         .a(
            od.a(dvz.U, dvz.R)
               .a(dvu.a, jm.f, of.a().a(og.b, og.a.b))
               .a(dvu.a, jm.e, of.a().a(og.b, og.a.d))
               .a(dvu.a, jm.d, of.a().a(og.b, og.a.c))
               .a(dvu.a, jm.c, of.a())
               .a(dvu.b, jm.f, of.a().a(og.b, og.a.b).a(og.a, og.a.b).a(og.d, true))
               .a(dvu.b, jm.e, of.a().a(og.b, og.a.d).a(og.a, og.a.b).a(og.d, true))
               .a(dvu.b, jm.d, of.a().a(og.b, og.a.c).a(og.a, og.a.b).a(og.d, true))
               .a(dvu.b, jm.c, of.a().a(og.a, og.a.b).a(og.d, true))
               .a(dvu.c, jm.f, of.a().a(og.b, og.a.d).a(og.a, og.a.c))
               .a(dvu.c, jm.e, of.a().a(og.b, og.a.b).a(og.a, og.a.c))
               .a(dvu.c, jm.d, of.a().a(og.a, og.a.c))
               .a(dvu.c, jm.c, of.a().a(og.b, og.a.c).a(og.a, og.a.c))
         );
   }

   private static od.d<jm, dwf, dwe, Boolean> a(od.d<jm, dwf, dwe, Boolean> $$0, dwf $$1, ali $$2, ali $$3, ali $$4, ali $$5) {
      return $$0.a(jm.f, $$1, dwe.a, false, of.a().a(og.c, $$2))
         .a(jm.d, $$1, dwe.a, false, of.a().a(og.c, $$2).a(og.b, og.a.b))
         .a(jm.e, $$1, dwe.a, false, of.a().a(og.c, $$2).a(og.b, og.a.c))
         .a(jm.c, $$1, dwe.a, false, of.a().a(og.c, $$2).a(og.b, og.a.d))
         .a(jm.f, $$1, dwe.b, false, of.a().a(og.c, $$4))
         .a(jm.d, $$1, dwe.b, false, of.a().a(og.c, $$4).a(og.b, og.a.b))
         .a(jm.e, $$1, dwe.b, false, of.a().a(og.c, $$4).a(og.b, og.a.c))
         .a(jm.c, $$1, dwe.b, false, of.a().a(og.c, $$4).a(og.b, og.a.d))
         .a(jm.f, $$1, dwe.a, true, of.a().a(og.c, $$3).a(og.b, og.a.b))
         .a(jm.d, $$1, dwe.a, true, of.a().a(og.c, $$3).a(og.b, og.a.c))
         .a(jm.e, $$1, dwe.a, true, of.a().a(og.c, $$3).a(og.b, og.a.d))
         .a(jm.c, $$1, dwe.a, true, of.a().a(og.c, $$3))
         .a(jm.f, $$1, dwe.b, true, of.a().a(og.c, $$5).a(og.b, og.a.d))
         .a(jm.d, $$1, dwe.b, true, of.a().a(og.c, $$5))
         .a(jm.e, $$1, dwe.b, true, of.a().a(og.c, $$5).a(og.b, og.a.b))
         .a(jm.c, $$1, dwe.b, true, of.a().a(og.c, $$5).a(og.b, og.a.c));
   }

   private static nz a(die $$0, ali $$1, ali $$2, ali $$3, ali $$4, ali $$5, ali $$6, ali $$7, ali $$8) {
      return oc.a($$0).a(a(a(od.a(dvz.R, dvz.ae, dvz.be, dvz.u), dwf.b, $$1, $$2, $$3, $$4), dwf.a, $$5, $$6, $$7, $$8));
   }

   static nz a(die $$0, ali $$1, ali $$2, ali $$3, ali $$4, ali $$5) {
      return ob.a($$0)
         .a(of.a().a(og.c, $$1))
         .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$2).a(og.d, false))
         .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$3).a(og.d, false))
         .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$4).a(og.d, false))
         .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$5).a(og.d, false));
   }

   static nz c(die $$0, ali $$1, ali $$2) {
      return ob.a($$0)
         .a(of.a().a(og.c, $$1))
         .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$2).a(og.d, true))
         .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$2).a(og.b, og.a.b).a(og.d, true))
         .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$2).a(og.b, og.a.c).a(og.d, true))
         .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$2).a(og.b, og.a.d).a(og.d, true));
   }

   static nz a(die $$0, ali $$1, ali $$2, ali $$3) {
      return ob.a($$0)
         .a(oa.a().a(dvz.J, true), of.a().a(og.c, $$1))
         .a(oa.a().a(dvz.X, dwv.b), of.a().a(og.c, $$2).a(og.d, true))
         .a(oa.a().a(dvz.W, dwv.b), of.a().a(og.c, $$2).a(og.b, og.a.b).a(og.d, true))
         .a(oa.a().a(dvz.Y, dwv.b), of.a().a(og.c, $$2).a(og.b, og.a.c).a(og.d, true))
         .a(oa.a().a(dvz.Z, dwv.b), of.a().a(og.c, $$2).a(og.b, og.a.d).a(og.d, true))
         .a(oa.a().a(dvz.X, dwv.c), of.a().a(og.c, $$3).a(og.d, true))
         .a(oa.a().a(dvz.W, dwv.c), of.a().a(og.c, $$3).a(og.b, og.a.b).a(og.d, true))
         .a(oa.a().a(dvz.Y, dwv.c), of.a().a(og.c, $$3).a(og.b, og.a.c).a(og.d, true))
         .a(oa.a().a(dvz.Z, dwv.c), of.a().a(og.c, $$3).a(og.b, og.a.d).a(og.d, true));
   }

   static nz a(die $$0, ali $$1, ali $$2, ali $$3, ali $$4, boolean $$5) {
      return oc.a($$0, of.a().a(og.d, $$5))
         .a(c())
         .a(
            od.a(dvz.q, dvz.u)
               .a(false, false, of.a().a(og.c, $$2))
               .a(true, false, of.a().a(og.c, $$4))
               .a(false, true, of.a().a(og.c, $$1))
               .a(true, true, of.a().a(og.c, $$3))
         );
   }

   static nz b(die $$0, ali $$1, ali $$2, ali $$3) {
      return oc.a($$0)
         .a(
            od.a(dvz.R, dvz.af, dvz.bi)
               .a(jm.f, dwi.b, dws.a, of.a().a(og.c, $$2))
               .a(jm.e, dwi.b, dws.a, of.a().a(og.c, $$2).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.b, dws.a, of.a().a(og.c, $$2).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.b, dws.a, of.a().a(og.c, $$2).a(og.b, og.a.d).a(og.d, true))
               .a(jm.f, dwi.b, dws.e, of.a().a(og.c, $$3))
               .a(jm.e, dwi.b, dws.e, of.a().a(og.c, $$3).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.b, dws.e, of.a().a(og.c, $$3).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.b, dws.e, of.a().a(og.c, $$3).a(og.b, og.a.d).a(og.d, true))
               .a(jm.f, dwi.b, dws.d, of.a().a(og.c, $$3).a(og.b, og.a.d).a(og.d, true))
               .a(jm.e, dwi.b, dws.d, of.a().a(og.c, $$3).a(og.b, og.a.b).a(og.d, true))
               .a(jm.d, dwi.b, dws.d, of.a().a(og.c, $$3))
               .a(jm.c, dwi.b, dws.d, of.a().a(og.c, $$3).a(og.b, og.a.c).a(og.d, true))
               .a(jm.f, dwi.b, dws.c, of.a().a(og.c, $$1))
               .a(jm.e, dwi.b, dws.c, of.a().a(og.c, $$1).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.b, dws.c, of.a().a(og.c, $$1).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.b, dws.c, of.a().a(og.c, $$1).a(og.b, og.a.d).a(og.d, true))
               .a(jm.f, dwi.b, dws.b, of.a().a(og.c, $$1).a(og.b, og.a.d).a(og.d, true))
               .a(jm.e, dwi.b, dws.b, of.a().a(og.c, $$1).a(og.b, og.a.b).a(og.d, true))
               .a(jm.d, dwi.b, dws.b, of.a().a(og.c, $$1))
               .a(jm.c, dwi.b, dws.b, of.a().a(og.c, $$1).a(og.b, og.a.c).a(og.d, true))
               .a(jm.f, dwi.a, dws.a, of.a().a(og.c, $$2).a(og.a, og.a.c).a(og.d, true))
               .a(jm.e, dwi.a, dws.a, of.a().a(og.c, $$2).a(og.a, og.a.c).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.a, dws.a, of.a().a(og.c, $$2).a(og.a, og.a.c).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.a, dws.a, of.a().a(og.c, $$2).a(og.a, og.a.c).a(og.b, og.a.d).a(og.d, true))
               .a(jm.f, dwi.a, dws.e, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.b).a(og.d, true))
               .a(jm.e, dwi.a, dws.e, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.d).a(og.d, true))
               .a(jm.d, dwi.a, dws.e, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.c).a(og.d, true))
               .a(jm.c, dwi.a, dws.e, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.d, true))
               .a(jm.f, dwi.a, dws.d, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.d, true))
               .a(jm.e, dwi.a, dws.d, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.a, dws.d, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.a, dws.d, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.d).a(og.d, true))
               .a(jm.f, dwi.a, dws.c, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.b).a(og.d, true))
               .a(jm.e, dwi.a, dws.c, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.d).a(og.d, true))
               .a(jm.d, dwi.a, dws.c, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.c).a(og.d, true))
               .a(jm.c, dwi.a, dws.c, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.d, true))
               .a(jm.f, dwi.a, dws.b, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.d, true))
               .a(jm.e, dwi.a, dws.b, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.c).a(og.d, true))
               .a(jm.d, dwi.a, dws.b, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.b).a(og.d, true))
               .a(jm.c, dwi.a, dws.b, of.a().a(og.c, $$1).a(og.a, og.a.c).a(og.b, og.a.d).a(og.d, true))
         );
   }

   private static nz c(die $$0, ali $$1, ali $$2, ali $$3) {
      return oc.a($$0)
         .a(
            od.a(dvz.R, dvz.af, dvz.u)
               .a(jm.c, dwi.b, false, of.a().a(og.c, $$2))
               .a(jm.d, dwi.b, false, of.a().a(og.c, $$2).a(og.b, og.a.c))
               .a(jm.f, dwi.b, false, of.a().a(og.c, $$2).a(og.b, og.a.b))
               .a(jm.e, dwi.b, false, of.a().a(og.c, $$2).a(og.b, og.a.d))
               .a(jm.c, dwi.a, false, of.a().a(og.c, $$1))
               .a(jm.d, dwi.a, false, of.a().a(og.c, $$1).a(og.b, og.a.c))
               .a(jm.f, dwi.a, false, of.a().a(og.c, $$1).a(og.b, og.a.b))
               .a(jm.e, dwi.a, false, of.a().a(og.c, $$1).a(og.b, og.a.d))
               .a(jm.c, dwi.b, true, of.a().a(og.c, $$3))
               .a(jm.d, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.c))
               .a(jm.f, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.b))
               .a(jm.e, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.d))
               .a(jm.c, dwi.a, true, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.c))
               .a(jm.d, dwi.a, true, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.a))
               .a(jm.f, dwi.a, true, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.d))
               .a(jm.e, dwi.a, true, of.a().a(og.c, $$3).a(og.a, og.a.c).a(og.b, og.a.b))
         );
   }

   private static nz d(die $$0, ali $$1, ali $$2, ali $$3) {
      return oc.a($$0)
         .a(
            od.a(dvz.R, dvz.af, dvz.u)
               .a(jm.c, dwi.b, false, of.a().a(og.c, $$2))
               .a(jm.d, dwi.b, false, of.a().a(og.c, $$2))
               .a(jm.f, dwi.b, false, of.a().a(og.c, $$2))
               .a(jm.e, dwi.b, false, of.a().a(og.c, $$2))
               .a(jm.c, dwi.a, false, of.a().a(og.c, $$1))
               .a(jm.d, dwi.a, false, of.a().a(og.c, $$1))
               .a(jm.f, dwi.a, false, of.a().a(og.c, $$1))
               .a(jm.e, dwi.a, false, of.a().a(og.c, $$1))
               .a(jm.c, dwi.b, true, of.a().a(og.c, $$3))
               .a(jm.d, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.c))
               .a(jm.f, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.b))
               .a(jm.e, dwi.b, true, of.a().a(og.c, $$3).a(og.b, og.a.d))
               .a(jm.c, dwi.a, true, of.a().a(og.c, $$3))
               .a(jm.d, dwi.a, true, of.a().a(og.c, $$3).a(og.b, og.a.c))
               .a(jm.f, dwi.a, true, of.a().a(og.c, $$3).a(og.b, og.a.b))
               .a(jm.e, dwi.a, true, of.a().a(og.c, $$3).a(og.b, og.a.d))
         );
   }

   static oc c(die $$0, ali $$1) {
      return oc.a($$0, of.a().a(og.c, $$1));
   }

   private static od f() {
      return od.a(dvz.I).a(jm.a.b, of.a()).a(jm.a.c, of.a().a(og.a, og.a.b)).a(jm.a.a, of.a().a(og.a, og.a.b).a(og.b, og.a.b));
   }

   static nz a(die $$0, on $$1, BiConsumer<ali, Supplier<JsonElement>> $$2) {
      ali $$3 = om.g.a($$0, $$1, $$2);
      ali $$4 = om.h.a($$0, $$1, $$2);
      ali $$5 = om.i.a($$0, $$1, $$2);
      ali $$6 = om.j.a($$0, $$1, $$2);
      return oc.a($$0, of.a().a(og.c, $$6)).a(od.a(dvz.I).a(jm.a.a, of.a().a(og.c, $$3)).a(jm.a.b, of.a().a(og.c, $$4)).a(jm.a.c, of.a().a(og.c, $$5)));
   }

   static nz d(die $$0, ali $$1) {
      return oc.a($$0, of.a().a(og.c, $$1)).a(f());
   }

   private void e(die $$0, ali $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(die $$0, op.a $$1) {
      ali $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void c(die $$0, op.a $$1) {
      ali $$2 = $$1.create($$0, this.c);
      this.b.accept(oc.a($$0, of.a().a(og.c, $$2)).a(b()));
   }

   static nz d(die $$0, ali $$1, ali $$2) {
      return oc.a($$0)
         .a(
            od.a(dvz.I)
               .a(jm.a.b, of.a().a(og.c, $$1))
               .a(jm.a.c, of.a().a(og.c, $$2).a(og.a, og.a.b))
               .a(jm.a.a, of.a().a(og.c, $$2).a(og.a, og.a.b).a(og.b, og.a.b))
         );
   }

   private void a(die $$0, op.a $$1, op.a $$2) {
      ali $$3 = $$1.create($$0, this.c);
      ali $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private ali a(die $$0, String $$1, ol $$2, Function<ali, on> $$3) {
      return $$2.a($$0, $$1, $$3.apply(on.a($$0, $$1)), this.c);
   }

   static nz e(die $$0, ali $$1, ali $$2) {
      return oc.a($$0).a(a(dvz.w, $$2, $$1));
   }

   static nz e(die $$0, ali $$1, ali $$2, ali $$3) {
      return oc.a($$0).a(od.a(dvz.bh).a(dwr.b, of.a().a(og.c, $$1)).a(dwr.a, of.a().a(og.c, $$2)).a(dwr.c, of.a().a(og.c, $$3)));
   }

   public void a(die $$0) {
      this.b($$0, op.a);
   }

   public void b(die $$0, op.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(die $$0, on $$1, ol $$2) {
      ali $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private nv.b h(die $$0) {
      op $$1 = this.g.getOrDefault($$0, op.a.get($$0));
      return new nv.b($$1.b()).a($$0, $$1.a());
   }

   public void a(die $$0, die $$1, die $$2) {
      on $$3 = on.u($$0);
      ali $$4 = om.aa.a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
      this.b.accept(c($$2, $$4));
      this.a($$1.j());
      this.c($$2);
   }

   void i(die $$0) {
      on $$1 = on.t($$0);
      ali $$2 = om.v.a($$0, $$1, this.c);
      ali $$3 = om.w.a($$0, $$1, this.c);
      ali $$4 = om.x.a($$0, $$1, this.c);
      ali $$5 = om.y.a($$0, $$1, this.c);
      ali $$6 = om.z.a($$0, $$1, this.c);
      ali $$7 = om.A.a($$0, $$1, this.c);
      ali $$8 = om.B.a($$0, $$1, this.c);
      ali $$9 = om.C.a($$0, $$1, this.c);
      this.a($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void a(die $$0, die $$1) {
      ali $$2 = om.v.a($$0);
      ali $$3 = om.w.a($$0);
      ali $$4 = om.x.a($$0);
      ali $$5 = om.y.a($$0);
      ali $$6 = om.z.a($$0);
      ali $$7 = om.A.a($$0);
      ali $$8 = om.B.a($$0);
      ali $$9 = om.C.a($$0);
      this.a($$1, ok.a($$0.j()));
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void j(die $$0) {
      on $$1 = on.b($$0);
      ali $$2 = om.ak.a($$0, $$1, this.c);
      ali $$3 = om.al.a($$0, $$1, this.c);
      ali $$4 = om.am.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void k(die $$0) {
      on $$1 = on.b($$0);
      ali $$2 = om.ah.a($$0, $$1, this.c);
      ali $$3 = om.ai.a($$0, $$1, this.c);
      ali $$4 = om.aj.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void b(die $$0, die $$1) {
      ali $$2 = om.ah.a($$0);
      ali $$3 = om.ai.a($$0);
      ali $$4 = om.aj.a($$0);
      this.a($$1, ok.a($$0.j()));
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void g() {
      this.c(dig.sD);
      ali $$0 = ok.a(dig.sD);
      ali $$1 = ok.a(dig.sD, "_partial_tilt");
      ali $$2 = ok.a(dig.sD, "_full_tilt");
      this.b
         .accept(
            oc.a(dig.sD)
               .a(b())
               .a(od.a(dvz.bl).a(dwu.a, of.a().a(og.c, $$0)).a(dwu.b, of.a().a(og.c, $$0)).a(dwu.c, of.a().a(og.c, $$1)).a(dwu.d, of.a().a(og.c, $$2)))
         );
   }

   private nv.f l(die $$0) {
      return new nv.f(on.n($$0));
   }

   private void m(die $$0) {
      this.c($$0, $$0);
   }

   private void c(die $$0, die $$1) {
      this.b.accept(c($$0, ok.a($$1)));
   }

   private void a(die $$0, nv.e $$1) {
      this.d($$0);
      this.b($$0, $$1);
   }

   private void a(die $$0, nv.e $$1, on $$2) {
      this.d($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(die $$0, nv.e $$1) {
      on $$2 = on.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(die $$0, nv.e $$1, on $$2) {
      ali $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(die $$0, nv.e $$1, dwm<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         od $$4 = od.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            on $$5 = on.c(on.a($$0, $$4x));
            ali $$6 = $$1.a().a($$0, $$4x, $$5, this.c);
            return of.a().a(og.c, $$6);
         });
         this.a($$0.j());
         this.b.accept(oc.a($$0).a($$4));
      }
   }

   private void a(die $$0, die $$1, nv.e $$2) {
      this.a($$0, $$2);
      on $$3 = on.d($$0);
      ali $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void d(die $$0, die $$1) {
      op $$2 = op.p.get($$0);
      ali $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      ali $$4 = om.aC.a($$1, $$2.b(), this.c);
      this.b.accept(oc.a($$1, of.a().a(og.c, $$4)).a(b()));
      this.d($$0);
   }

   private void e(die $$0, die $$1) {
      this.a($$0.j());
      on $$2 = on.h($$0);
      on $$3 = on.a($$0, $$1);
      ali $$4 = om.aU.a($$1, $$3, this.c);
      this.b
         .accept(
            oc.a($$1, of.a().a(og.c, $$4))
               .a(od.a(dvz.R).a(jm.e, of.a()).a(jm.d, of.a().a(og.b, og.a.d)).a(jm.c, of.a().a(og.b, og.a.b)).a(jm.f, of.a().a(og.b, og.a.c)))
         );
      this.b.accept(oc.a($$0).a(od.a(dvz.av).a($$2x -> of.a().a(og.c, om.aT[$$2x].a($$0, $$2, this.c)))));
   }

   private void h() {
      die $$0 = dig.kC;
      this.a($$0.j());
      ali $$1 = ok.a($$0, "_top");
      ali $$2 = ok.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void i() {
      die $$0 = dig.kB;
      this.a($$0.j());
      od $$1 = od.a(dns.d, dvz.ae).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> of.a().a(og.c, ok.a($$0, "_top_stage_" + $$1x));
            case b -> of.a().a(og.c, ok.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(oc.a($$0).a($$1));
   }

   private void a(die $$0, die $$1, die $$2, die $$3, die $$4, die $$5, die $$6, die $$7) {
      this.a($$0, nv.e.b);
      this.a($$1, nv.e.b);
      this.a($$2);
      this.a($$3);
      this.d($$4, $$6);
      this.d($$5, $$7);
   }

   private void c(die $$0, nv.e $$1) {
      this.a($$0, "_top");
      ali $$2 = this.a($$0, "_top", $$1.a(), on::c);
      ali $$3 = this.a($$0, "_bottom", $$1.a(), on::c);
      this.f($$0, $$2, $$3);
   }

   private void j() {
      this.a(dig.iD, "_front");
      ali $$0 = ok.a(dig.iD, "_top");
      ali $$1 = this.a(dig.iD, "_bottom", nv.e.b.a(), on::c);
      this.f(dig.iD, $$0, $$1);
   }

   private void k() {
      ali $$0 = this.a(dig.bx, "_top", om.bm, on::a);
      ali $$1 = this.a(dig.bx, "_bottom", om.bm, on::a);
      this.f(dig.bx, $$0, $$1);
   }

   private void l() {
      this.c(dig.sF);
      ali $$0 = ok.a(dig.sF, "_top");
      ali $$1 = ok.a(dig.sF, "_bottom");
      this.b.accept(oc.a(dig.sF).a(b()).a(od.a(dvz.ae).a(dwf.b, of.a().a(og.c, $$1)).a(dwf.a, of.a().a(og.c, $$0))));
   }

   private void f(die $$0, ali $$1, ali $$2) {
      this.b.accept(oc.a($$0).a(od.a(dvz.ae).a(dwf.b, of.a().a(og.c, $$2)).a(dwf.a, of.a().a(og.c, $$1))));
   }

   private void n(die $$0) {
      on $$1 = on.e($$0);
      on $$2 = on.e(on.a($$0, "_corner"));
      ali $$3 = om.as.a($$0, $$1, this.c);
      ali $$4 = om.at.a($$0, $$2, this.c);
      ali $$5 = om.au.a($$0, $$1, this.c);
      ali $$6 = om.av.a($$0, $$1, this.c);
      this.d($$0);
      this.b
         .accept(
            oc.a($$0)
               .a(
                  od.a(dvz.ag)
                     .a(dwn.a, of.a().a(og.c, $$3))
                     .a(dwn.b, of.a().a(og.c, $$3).a(og.b, og.a.b))
                     .a(dwn.c, of.a().a(og.c, $$5).a(og.b, og.a.b))
                     .a(dwn.d, of.a().a(og.c, $$6).a(og.b, og.a.b))
                     .a(dwn.e, of.a().a(og.c, $$5))
                     .a(dwn.f, of.a().a(og.c, $$6))
                     .a(dwn.g, of.a().a(og.c, $$4))
                     .a(dwn.h, of.a().a(og.c, $$4).a(og.b, og.a.b))
                     .a(dwn.i, of.a().a(og.c, $$4).a(og.b, og.a.c))
                     .a(dwn.j, of.a().a(og.c, $$4).a(og.b, og.a.d))
               )
         );
   }

   private void o(die $$0) {
      ali $$1 = this.a($$0, "", om.as, on::e);
      ali $$2 = this.a($$0, "", om.au, on::e);
      ali $$3 = this.a($$0, "", om.av, on::e);
      ali $$4 = this.a($$0, "_on", om.as, on::e);
      ali $$5 = this.a($$0, "_on", om.au, on::e);
      ali $$6 = this.a($$0, "_on", om.av, on::e);
      od $$7 = od.a(dvz.w, dvz.ah).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return of.a().a(og.c, $$6x ? $$4 : $$1);
            case b:
               return of.a().a(og.c, $$6x ? $$4 : $$1).a(og.b, og.a.b);
            case c:
               return of.a().a(og.c, $$6x ? $$5 : $$2).a(og.b, og.a.b);
            case d:
               return of.a().a(og.c, $$6x ? $$6 : $$3).a(og.b, og.a.b);
            case e:
               return of.a().a(og.c, $$6x ? $$5 : $$2);
            case f:
               return of.a().a(og.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.d($$0);
      this.b.accept(oc.a($$0).a($$7));
   }

   private nv.a a(ali $$0, die $$1) {
      return new nv.a($$0, $$1);
   }

   private nv.a f(die $$0, die $$1) {
      return new nv.a(ok.a($$0), $$1);
   }

   private void a(die $$0, cvx $$1) {
      ali $$2 = om.aa.a($$0, on.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(die $$0, ali $$1) {
      ali $$2 = om.aa.a($$0, on.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void g(die $$0, die $$1) {
      this.a($$0);
      ali $$2 = op.j.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void p(die $$0) {
      this.a($$0.j());
      ali $$1 = op.k.create($$0, this.c);
      ali $$2 = op.l.create($$0, this.c);
      ali $$3 = op.m.create($$0, this.c);
      ali $$4 = op.n.create($$0, this.c);
      this.b
         .accept(
            ob.a($$0)
               .a(oa.a().a(dvz.S, 1, 2, 3, 4).a(dvz.R, jm.c), of.a().a(og.c, $$1))
               .a(oa.a().a(dvz.S, 1, 2, 3, 4).a(dvz.R, jm.f), of.a().a(og.c, $$1).a(og.b, og.a.b))
               .a(oa.a().a(dvz.S, 1, 2, 3, 4).a(dvz.R, jm.d), of.a().a(og.c, $$1).a(og.b, og.a.c))
               .a(oa.a().a(dvz.S, 1, 2, 3, 4).a(dvz.R, jm.e), of.a().a(og.c, $$1).a(og.b, og.a.d))
               .a(oa.a().a(dvz.S, 2, 3, 4).a(dvz.R, jm.c), of.a().a(og.c, $$2))
               .a(oa.a().a(dvz.S, 2, 3, 4).a(dvz.R, jm.f), of.a().a(og.c, $$2).a(og.b, og.a.b))
               .a(oa.a().a(dvz.S, 2, 3, 4).a(dvz.R, jm.d), of.a().a(og.c, $$2).a(og.b, og.a.c))
               .a(oa.a().a(dvz.S, 2, 3, 4).a(dvz.R, jm.e), of.a().a(og.c, $$2).a(og.b, og.a.d))
               .a(oa.a().a(dvz.S, 3, 4).a(dvz.R, jm.c), of.a().a(og.c, $$3))
               .a(oa.a().a(dvz.S, 3, 4).a(dvz.R, jm.f), of.a().a(og.c, $$3).a(og.b, og.a.b))
               .a(oa.a().a(dvz.S, 3, 4).a(dvz.R, jm.d), of.a().a(og.c, $$3).a(og.b, og.a.c))
               .a(oa.a().a(dvz.S, 3, 4).a(dvz.R, jm.e), of.a().a(og.c, $$3).a(og.b, og.a.d))
               .a(oa.a().a(dvz.S, 4).a(dvz.R, jm.c), of.a().a(og.c, $$4))
               .a(oa.a().a(dvz.S, 4).a(dvz.R, jm.f), of.a().a(og.c, $$4).a(og.b, og.a.b))
               .a(oa.a().a(dvz.S, 4).a(dvz.R, jm.d), of.a().a(og.c, $$4).a(og.b, og.a.c))
               .a(oa.a().a(dvz.S, 4).a(dvz.R, jm.e), of.a().a(og.c, $$4).a(og.b, og.a.d))
         );
   }

   private void a(op.a $$0, die... $$1) {
      for (die $$2 : $$1) {
         ali $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(op.a $$0, die... $$1) {
      for (die $$2 : $$1) {
         ali $$3 = $$0.create($$2, this.c);
         this.b.accept(oc.a($$2, of.a().a(og.c, $$3)).a(c()));
      }
   }

   private void h(die $$0, die $$1) {
      this.a($$0);
      on $$2 = on.b($$0, $$1);
      ali $$3 = om.aI.a($$1, $$2, this.c);
      ali $$4 = om.aJ.a($$1, $$2, this.c);
      ali $$5 = om.aK.a($$1, $$2, this.c);
      ali $$6 = om.aG.a($$1, $$2, this.c);
      ali $$7 = om.aH.a($$1, $$2, this.c);
      cvx $$8 = $$1.j();
      om.bz.a(ok.a($$8), on.F($$0), this.c);
      this.b
         .accept(
            ob.a($$1)
               .a(of.a().a(og.c, $$3))
               .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$4))
               .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$4).a(og.b, og.a.b))
               .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$5))
               .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$5).a(og.b, og.a.b))
               .a(oa.a().a(dvz.L, false), of.a().a(og.c, $$6))
               .a(oa.a().a(dvz.M, false), of.a().a(og.c, $$7))
               .a(oa.a().a(dvz.N, false), of.a().a(og.c, $$7).a(og.b, og.a.b))
               .a(oa.a().a(dvz.O, false), of.a().a(og.c, $$6).a(og.b, og.a.d))
         );
   }

   private void q(die $$0) {
      on $$1 = on.z($$0);
      ali $$2 = om.aL.a($$0, $$1, this.c);
      ali $$3 = this.a($$0, "_conditional", om.aL, $$1x -> $$1.c(oo.i, $$1x));
      this.b.accept(oc.a($$0).a(a(dvz.c, $$3, $$2)).a(e()));
   }

   private void r(die $$0) {
      ali $$1 = op.r.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<of> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> of.a().a(og.c, ok.a(dig.mZ, $$1x + $$1))).collect(Collectors.toList());
   }

   private void m() {
      this.c(dig.mZ);
      this.b
         .accept(
            ob.a(dig.mZ)
               .a(oa.a().a(dvz.aq, 0), this.a(0))
               .a(oa.a().a(dvz.aq, 1), this.a(1))
               .a(oa.a().a(dvz.bk, dvv.b), of.a().a(og.c, ok.a(dig.mZ, "_small_leaves")))
               .a(oa.a().a(dvz.bk, dvv.c), of.a().a(og.c, ok.a(dig.mZ, "_large_leaves")))
         );
   }

   private od n() {
      return od.a(dvz.P)
         .a(jm.a, of.a().a(og.a, og.a.c))
         .a(jm.b, of.a())
         .a(jm.c, of.a().a(og.a, og.a.b))
         .a(jm.d, of.a().a(og.a, og.a.b).a(og.b, og.a.c))
         .a(jm.e, of.a().a(og.a, og.a.b).a(og.b, og.a.d))
         .a(jm.f, of.a().a(og.a, og.a.b).a(og.b, og.a.b));
   }

   private void o() {
      ali $$0 = on.a(dig.nU, "_top_open");
      this.b
         .accept(
            oc.a(dig.nU)
               .a(this.n())
               .a(
                  od.a(dvz.u)
                     .a(false, of.a().a(og.c, op.f.create(dig.nU, this.c)))
                     .a(true, of.a().a(og.c, op.f.get(dig.nU).a($$1 -> $$1.a(oo.f, $$0)).a(dig.nU, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> od a(dwm<T> $$0, T $$1, ali $$2, ali $$3) {
      of $$4 = of.a().a(og.c, $$2);
      of $$5 = of.a().a(og.c, $$3);
      return od.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(die $$0, Function<die, on> $$1) {
      on $$2 = $$1.apply($$0).b(oo.i, oo.c);
      on $$3 = $$2.c(oo.g, on.a($$0, "_front_honey"));
      ali $$4 = om.q.a($$0, "_empty", $$2, this.c);
      ali $$5 = om.q.a($$0, "_honey", $$3, this.c);
      this.c($$0);
      om.q.a(ok.a($$0.j(), "_empty"), $$2, this.c);
      om.q.a(ok.a($$0.j(), "_honey"), $$3, this.c);
      this.b.accept(oc.a($$0).a(b()).a(a(dvz.aN, 5, $$5, $$4)));
   }

   private void a(die $$0, dwm<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ali> $$3 = new Int2ObjectOpenHashMap();
         od $$4 = od.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ali $$5 = (ali)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, om.aV, on::g));
            return of.a().a(og.c, $$5);
         });
         this.a($$0.j());
         this.b.accept(oc.a($$0).a($$4));
      }
   }

   private void p() {
      ali $$0 = ok.a(dig.od, "_floor");
      ali $$1 = ok.a(dig.od, "_ceiling");
      ali $$2 = ok.a(dig.od, "_wall");
      ali $$3 = ok.a(dig.od, "_between_walls");
      this.a(cwf.wu);
      this.b
         .accept(
            oc.a(dig.od)
               .a(
                  od.a(dvz.R, dvz.V)
                     .a(jm.c, dvx.a, of.a().a(og.c, $$0))
                     .a(jm.d, dvx.a, of.a().a(og.c, $$0).a(og.b, og.a.c))
                     .a(jm.f, dvx.a, of.a().a(og.c, $$0).a(og.b, og.a.b))
                     .a(jm.e, dvx.a, of.a().a(og.c, $$0).a(og.b, og.a.d))
                     .a(jm.c, dvx.b, of.a().a(og.c, $$1))
                     .a(jm.d, dvx.b, of.a().a(og.c, $$1).a(og.b, og.a.c))
                     .a(jm.f, dvx.b, of.a().a(og.c, $$1).a(og.b, og.a.b))
                     .a(jm.e, dvx.b, of.a().a(og.c, $$1).a(og.b, og.a.d))
                     .a(jm.c, dvx.c, of.a().a(og.c, $$2).a(og.b, og.a.d))
                     .a(jm.d, dvx.c, of.a().a(og.c, $$2).a(og.b, og.a.b))
                     .a(jm.f, dvx.c, of.a().a(og.c, $$2))
                     .a(jm.e, dvx.c, of.a().a(og.c, $$2).a(og.b, og.a.c))
                     .a(jm.d, dvx.d, of.a().a(og.c, $$3).a(og.b, og.a.b))
                     .a(jm.c, dvx.d, of.a().a(og.c, $$3).a(og.b, og.a.d))
                     .a(jm.f, dvx.d, of.a().a(og.c, $$3))
                     .a(jm.e, dvx.d, of.a().a(og.c, $$3).a(og.b, og.a.c))
               )
         );
   }

   private void q() {
      this.b
         .accept(
            oc.a(dig.nZ, of.a().a(og.c, ok.a(dig.nZ)))
               .a(
                  od.a(dvz.U, dvz.R)
                     .a(dvu.a, jm.c, of.a())
                     .a(dvu.a, jm.f, of.a().a(og.b, og.a.b))
                     .a(dvu.a, jm.d, of.a().a(og.b, og.a.c))
                     .a(dvu.a, jm.e, of.a().a(og.b, og.a.d))
                     .a(dvu.b, jm.c, of.a().a(og.a, og.a.b))
                     .a(dvu.b, jm.f, of.a().a(og.a, og.a.b).a(og.b, og.a.b))
                     .a(dvu.b, jm.d, of.a().a(og.a, og.a.b).a(og.b, og.a.c))
                     .a(dvu.b, jm.e, of.a().a(og.a, og.a.b).a(og.b, og.a.d))
                     .a(dvu.c, jm.d, of.a().a(og.a, og.a.c))
                     .a(dvu.c, jm.e, of.a().a(og.a, og.a.c).a(og.b, og.a.b))
                     .a(dvu.c, jm.c, of.a().a(og.a, og.a.c).a(og.b, og.a.c))
                     .a(dvu.c, jm.f, of.a().a(og.a, og.a.c).a(og.b, og.a.d))
               )
         );
   }

   private void d(die $$0, op.a $$1) {
      ali $$2 = $$1.create($$0, this.c);
      ali $$3 = on.a($$0, "_front_on");
      ali $$4 = $$1.get($$0).a($$1x -> $$1x.a(oo.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(oc.a($$0).a(a(dvz.r, $$4, $$2)).a(b()));
   }

   private void a(die... $$0) {
      ali $$1 = ok.a("campfire_off");

      for (die $$2 : $$0) {
         ali $$3 = om.bc.a($$2, on.E($$2), this.c);
         this.a($$2.j());
         this.b.accept(oc.a($$2).a(a(dvz.r, $$3, $$1)).a(c()));
      }
   }

   private void s(die $$0) {
      ali $$1 = om.bv.a($$0, on.l($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void t(die $$0) {
      ali $$1;
      if ($$0 == dig.tj) {
         $$1 = om.bx.a($$0, on.m($$0), this.c);
      } else {
         $$1 = om.bw.a($$0, on.m($$0), this.c);
      }

      this.b.accept(c($$0, $$1));
   }

   private void r() {
      on $$0 = on.a(on.G(dig.cl), on.G(dig.n));
      ali $$1 = om.j.a(dig.cl, $$0, this.c);
      this.b.accept(c(dig.cl, $$1));
   }

   private void s() {
      this.a(cwf.lH);
      this.b
         .accept(
            ob.a(dig.cw)
               .a(
                  oa.b(
                     oa.a().a(dvz.ab, dwo.c).a(dvz.aa, dwo.c).a(dvz.ac, dwo.c).a(dvz.ad, dwo.c),
                     oa.a().a(dvz.ab, dwo.b, dwo.a).a(dvz.aa, dwo.b, dwo.a),
                     oa.a().a(dvz.aa, dwo.b, dwo.a).a(dvz.ac, dwo.b, dwo.a),
                     oa.a().a(dvz.ac, dwo.b, dwo.a).a(dvz.ad, dwo.b, dwo.a),
                     oa.a().a(dvz.ad, dwo.b, dwo.a).a(dvz.ab, dwo.b, dwo.a)
                  ),
                  of.a().a(og.c, ok.a("redstone_dust_dot"))
               )
               .a(oa.a().a(dvz.ab, dwo.b, dwo.a), of.a().a(og.c, ok.a("redstone_dust_side0")))
               .a(oa.a().a(dvz.ac, dwo.b, dwo.a), of.a().a(og.c, ok.a("redstone_dust_side_alt0")))
               .a(oa.a().a(dvz.aa, dwo.b, dwo.a), of.a().a(og.c, ok.a("redstone_dust_side_alt1")).a(og.b, og.a.d))
               .a(oa.a().a(dvz.ad, dwo.b, dwo.a), of.a().a(og.c, ok.a("redstone_dust_side1")).a(og.b, og.a.d))
               .a(oa.a().a(dvz.ab, dwo.a), of.a().a(og.c, ok.a("redstone_dust_up")))
               .a(oa.a().a(dvz.aa, dwo.a), of.a().a(og.c, ok.a("redstone_dust_up")).a(og.b, og.a.b))
               .a(oa.a().a(dvz.ac, dwo.a), of.a().a(og.c, ok.a("redstone_dust_up")).a(og.b, og.a.c))
               .a(oa.a().a(dvz.ad, dwo.a), of.a().a(og.c, ok.a("redstone_dust_up")).a(og.b, og.a.d))
         );
   }

   private void t() {
      this.a(cwf.lL);
      this.b
         .accept(
            oc.a(dig.gY)
               .a(c())
               .a(
                  od.a(dvz.bd, dvz.w)
                     .a(dwc.a, false, of.a().a(og.c, ok.a(dig.gY)))
                     .a(dwc.a, true, of.a().a(og.c, ok.a(dig.gY, "_on")))
                     .a(dwc.b, false, of.a().a(og.c, ok.a(dig.gY, "_subtract")))
                     .a(dwc.b, true, of.a().a(og.c, ok.a(dig.gY, "_on_subtract")))
               )
         );
   }

   private void u() {
      on $$0 = on.a(dig.jR);
      on $$1 = on.a(on.a(dig.jE, "_side"), $$0.a(oo.f));
      ali $$2 = om.ab.a(dig.jE, $$1, this.c);
      ali $$3 = om.ac.a(dig.jE, $$1, this.c);
      ali $$4 = om.j.b(dig.jE, "_double", $$1, this.c);
      this.b.accept(e(dig.jE, $$2, $$3, $$4));
      this.b.accept(c(dig.jR, om.c.a(dig.jR, $$0, this.c)));
   }

   private void v() {
      this.a(cwf.sr);
      this.b
         .accept(
            ob.a(dig.fs)
               .a(of.a().a(og.c, on.G(dig.fs)))
               .a(oa.a().a(dvz.k, true), of.a().a(og.c, on.a(dig.fs, "_bottle0")))
               .a(oa.a().a(dvz.l, true), of.a().a(og.c, on.a(dig.fs, "_bottle1")))
               .a(oa.a().a(dvz.m, true), of.a().a(og.c, on.a(dig.fs, "_bottle2")))
               .a(oa.a().a(dvz.k, false), of.a().a(og.c, on.a(dig.fs, "_empty0")))
               .a(oa.a().a(dvz.l, false), of.a().a(og.c, on.a(dig.fs, "_empty1")))
               .a(oa.a().a(dvz.m, false), of.a().a(og.c, on.a(dig.fs, "_empty2")))
         );
   }

   private void u(die $$0) {
      ali $$1 = om.br.a($$0, on.b($$0), this.c);
      ali $$2 = ok.a("mushroom_block_inside");
      this.b
         .accept(
            ob.a($$0)
               .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$1))
               .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$1).a(og.b, og.a.b).a(og.d, true))
               .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$1).a(og.b, og.a.c).a(og.d, true))
               .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$1).a(og.b, og.a.d).a(og.d, true))
               .a(oa.a().a(dvz.J, true), of.a().a(og.c, $$1).a(og.a, og.a.d).a(og.d, true))
               .a(oa.a().a(dvz.K, true), of.a().a(og.c, $$1).a(og.a, og.a.b).a(og.d, true))
               .a(oa.a().a(dvz.L, false), of.a().a(og.c, $$2))
               .a(oa.a().a(dvz.M, false), of.a().a(og.c, $$2).a(og.b, og.a.b).a(og.d, false))
               .a(oa.a().a(dvz.N, false), of.a().a(og.c, $$2).a(og.b, og.a.c).a(og.d, false))
               .a(oa.a().a(dvz.O, false), of.a().a(og.c, $$2).a(og.b, og.a.d).a(og.d, false))
               .a(oa.a().a(dvz.J, false), of.a().a(og.c, $$2).a(og.a, og.a.d).a(og.d, false))
               .a(oa.a().a(dvz.K, false), of.a().a(og.c, $$2).a(og.a, og.a.b).a(og.d, false))
         );
      this.a($$0, op.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void w() {
      this.a(cwf.rC);
      this.b
         .accept(
            oc.a(dig.eg)
               .a(
                  od.a(dvz.ay)
                     .a(0, of.a().a(og.c, ok.a(dig.eg)))
                     .a(1, of.a().a(og.c, ok.a(dig.eg, "_slice1")))
                     .a(2, of.a().a(og.c, ok.a(dig.eg, "_slice2")))
                     .a(3, of.a().a(og.c, ok.a(dig.eg, "_slice3")))
                     .a(4, of.a().a(og.c, ok.a(dig.eg, "_slice4")))
                     .a(5, of.a().a(og.c, ok.a(dig.eg, "_slice5")))
                     .a(6, of.a().a(og.c, ok.a(dig.eg, "_slice6")))
               )
         );
   }

   private void x() {
      on $$0 = new on()
         .a(oo.c, on.a(dig.nX, "_side3"))
         .a(oo.o, on.G(dig.t))
         .a(oo.n, on.a(dig.nX, "_top"))
         .a(oo.j, on.a(dig.nX, "_side3"))
         .a(oo.l, on.a(dig.nX, "_side3"))
         .a(oo.k, on.a(dig.nX, "_side1"))
         .a(oo.m, on.a(dig.nX, "_side2"));
      this.b.accept(c(dig.nX, om.a.a(dig.nX, $$0, this.c)));
   }

   private void y() {
      on $$0 = new on()
         .a(oo.c, on.a(dig.ob, "_front"))
         .a(oo.o, on.a(dig.ob, "_bottom"))
         .a(oo.n, on.a(dig.ob, "_top"))
         .a(oo.j, on.a(dig.ob, "_front"))
         .a(oo.k, on.a(dig.ob, "_front"))
         .a(oo.l, on.a(dig.ob, "_side"))
         .a(oo.m, on.a(dig.ob, "_side"));
      this.b.accept(c(dig.ob, om.a.a(dig.ob, $$0, this.c)));
   }

   private void a(die $$0, die $$1, BiFunction<die, die, on> $$2) {
      on $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, om.a.a($$0, $$3, this.c)));
   }

   public void b(die $$0) {
      on $$1 = new on()
         .a(oo.c, on.a($$0, "_particle"))
         .a(oo.o, on.a($$0, "_down"))
         .a(oo.n, on.a($$0, "_up"))
         .a(oo.j, on.a($$0, "_north"))
         .a(oo.k, on.a($$0, "_south"))
         .a(oo.l, on.a($$0, "_east"))
         .a(oo.m, on.a($$0, "_west"));
      this.b.accept(c($$0, om.a.a($$0, $$1, this.c)));
   }

   private void z() {
      on $$0 = on.k(dig.eZ);
      this.b.accept(c(dig.eZ, ok.a(dig.eZ)));
      this.a(dig.ee, $$0);
      this.a(dig.ef, $$0);
   }

   private void a(die $$0, on $$1) {
      ali $$2 = om.p.a($$0, $$1.c(oo.g, on.G($$0)), this.c);
      this.b.accept(oc.a($$0, of.a().a(og.c, $$2)).a(b()));
   }

   private void A() {
      this.a(cwf.ss);
      this.m(dig.ft);
      this.b.accept(c(dig.fv, om.bu.a(dig.fv, on.j(on.a(dig.H, "_still")), this.c)));
      this.b
         .accept(
            oc.a(dig.fu)
               .a(
                  od.a(dmm.g)
                     .a(1, of.a().a(og.c, om.bs.a(dig.fu, "_level1", on.j(on.a(dig.G, "_still")), this.c)))
                     .a(2, of.a().a(og.c, om.bt.a(dig.fu, "_level2", on.j(on.a(dig.G, "_still")), this.c)))
                     .a(3, of.a().a(og.c, om.bu.a(dig.fu, "_full", on.j(on.a(dig.G, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            oc.a(dig.fw)
               .a(
                  od.a(dmm.g)
                     .a(1, of.a().a(og.c, om.bs.a(dig.fw, "_level1", on.j(on.G(dig.qP)), this.c)))
                     .a(2, of.a().a(og.c, om.bt.a(dig.fw, "_level2", on.j(on.G(dig.qP)), this.c)))
                     .a(3, of.a().a(og.c, om.bu.a(dig.fw, "_full", on.j(on.G(dig.qP)), this.c)))
               )
         );
   }

   private void B() {
      on $$0 = on.b(dig.kv);
      ali $$1 = om.aE.a(dig.kv, $$0, this.c);
      ali $$2 = this.a(dig.kv, "_dead", om.aE, $$1x -> $$0.c(oo.b, $$1x));
      this.b.accept(oc.a(dig.kv).a(a(dvz.au, 5, $$2, $$1)));
   }

   private void C() {
      ali $$0 = ok.a(dig.tq);
      ali $$1 = ok.a(dig.tq, "_triggered");
      ali $$2 = ok.a(dig.tq, "_crafting");
      ali $$3 = ok.a(dig.tq, "_crafting_triggered");
      this.b
         .accept(
            oc.a(dig.tq)
               .a(od.a(dvz.T).a($$0x -> this.a($$0x, of.a())))
               .a(
                  od.a(dvz.A, djx.b)
                     .a(false, false, of.a().a(og.c, $$0))
                     .a(true, true, of.a().a(og.c, $$3))
                     .a(true, false, of.a().a(og.c, $$1))
                     .a(false, true, of.a().a(og.c, $$2))
               )
         );
   }

   private void v(die $$0) {
      on $$1 = new on().a(oo.f, on.a(dig.cD, "_top")).a(oo.i, on.a(dig.cD, "_side")).a(oo.g, on.a($$0, "_front"));
      on $$2 = new on().a(oo.i, on.a(dig.cD, "_top")).a(oo.g, on.a($$0, "_front_vertical"));
      ali $$3 = om.p.a($$0, $$1, this.c);
      ali $$4 = om.r.a($$0, $$2, this.c);
      this.b
         .accept(
            oc.a($$0)
               .a(
                  od.a(dvz.P)
                     .a(jm.a, of.a().a(og.c, $$4).a(og.a, og.a.c))
                     .a(jm.b, of.a().a(og.c, $$4))
                     .a(jm.c, of.a().a(og.c, $$3))
                     .a(jm.f, of.a().a(og.c, $$3).a(og.b, og.a.b))
                     .a(jm.d, of.a().a(og.c, $$3).a(og.b, og.a.c))
                     .a(jm.e, of.a().a(og.c, $$3).a(og.b, og.a.d))
               )
         );
   }

   private void D() {
      ali $$0 = ok.a(dig.fy);
      ali $$1 = ok.a(dig.fy, "_filled");
      this.b.accept(oc.a(dig.fy).a(od.a(dvz.h).a(false, of.a().a(og.c, $$0)).a(true, of.a().a(og.c, $$1))).a(c()));
   }

   private void E() {
      ali $$0 = ok.a(dig.ku, "_side");
      ali $$1 = ok.a(dig.ku, "_noside");
      ali $$2 = ok.a(dig.ku, "_noside1");
      ali $$3 = ok.a(dig.ku, "_noside2");
      ali $$4 = ok.a(dig.ku, "_noside3");
      this.b
         .accept(
            ob.a(dig.ku)
               .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$0))
               .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$0).a(og.b, og.a.b).a(og.d, true))
               .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$0).a(og.b, og.a.c).a(og.d, true))
               .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$0).a(og.b, og.a.d).a(og.d, true))
               .a(oa.a().a(dvz.J, true), of.a().a(og.c, $$0).a(og.a, og.a.d).a(og.d, true))
               .a(oa.a().a(dvz.K, true), of.a().a(og.c, $$0).a(og.a, og.a.b).a(og.d, true))
               .a(oa.a().a(dvz.L, false), of.a().a(og.c, $$1).a(og.e, 2), of.a().a(og.c, $$2), of.a().a(og.c, $$3), of.a().a(og.c, $$4))
               .a(
                  oa.a().a(dvz.M, false),
                  of.a().a(og.c, $$2).a(og.b, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$3).a(og.b, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$4).a(og.b, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$1).a(og.e, 2).a(og.b, og.a.b).a(og.d, true)
               )
               .a(
                  oa.a().a(dvz.N, false),
                  of.a().a(og.c, $$3).a(og.b, og.a.c).a(og.d, true),
                  of.a().a(og.c, $$4).a(og.b, og.a.c).a(og.d, true),
                  of.a().a(og.c, $$1).a(og.e, 2).a(og.b, og.a.c).a(og.d, true),
                  of.a().a(og.c, $$2).a(og.b, og.a.c).a(og.d, true)
               )
               .a(
                  oa.a().a(dvz.O, false),
                  of.a().a(og.c, $$4).a(og.b, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$1).a(og.e, 2).a(og.b, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$2).a(og.b, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$3).a(og.b, og.a.d).a(og.d, true)
               )
               .a(
                  oa.a().a(dvz.J, false),
                  of.a().a(og.c, $$1).a(og.e, 2).a(og.a, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$4).a(og.a, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$2).a(og.a, og.a.d).a(og.d, true),
                  of.a().a(og.c, $$3).a(og.a, og.a.d).a(og.d, true)
               )
               .a(
                  oa.a().a(dvz.K, false),
                  of.a().a(og.c, $$4).a(og.a, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$3).a(og.a, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$2).a(og.a, og.a.b).a(og.d, true),
                  of.a().a(og.c, $$1).a(og.e, 2).a(og.a, og.a.b).a(og.d, true)
               )
         );
   }

   private void F() {
      this.b
         .accept(
            ob.a(dig.pc)
               .a(of.a().a(og.c, on.G(dig.pc)))
               .a(oa.a().a(dvz.aL, 1), of.a().a(og.c, on.a(dig.pc, "_contents1")))
               .a(oa.a().a(dvz.aL, 2), of.a().a(og.c, on.a(dig.pc, "_contents2")))
               .a(oa.a().a(dvz.aL, 3), of.a().a(og.c, on.a(dig.pc, "_contents3")))
               .a(oa.a().a(dvz.aL, 4), of.a().a(og.c, on.a(dig.pc, "_contents4")))
               .a(oa.a().a(dvz.aL, 5), of.a().a(og.c, on.a(dig.pc, "_contents5")))
               .a(oa.a().a(dvz.aL, 6), of.a().a(og.c, on.a(dig.pc, "_contents6")))
               .a(oa.a().a(dvz.aL, 7), of.a().a(og.c, on.a(dig.pc, "_contents7")))
               .a(oa.a().a(dvz.aL, 8), of.a().a(og.c, on.a(dig.pc, "_contents_ready")))
         );
   }

   private void w(die $$0) {
      ali $$1 = om.c.a($$0, on.a($$0), this.c);
      ali $$2 = this.a($$0, "_powered", om.c, on::b);
      ali $$3 = this.a($$0, "_lit", om.c, on::b);
      ali $$4 = this.a($$0, "_lit_powered", om.c, on::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private nz a(die $$0, ali $$1, ali $$2, ali $$3, ali $$4) {
      return oc.a($$0).a(od.a(dvz.r, dvz.w).a(($$4x, $$5) -> $$4x ? of.a().a(og.c, $$5 ? $$4 : $$2) : of.a().a(og.c, $$5 ? $$3 : $$1)));
   }

   private void i(die $$0, die $$1) {
      ali $$2 = ok.a($$0);
      ali $$3 = ok.a($$0, "_powered");
      ali $$4 = ok.a($$0, "_lit");
      ali $$5 = ok.a($$0, "_lit_powered");
      this.a($$1, ok.a($$0.j()));
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void x(die $$0) {
      this.c($$0);
      this.b.accept(oc.a($$0, of.a().a(og.c, om.ao.a($$0, on.c($$0), this.c))).a(this.n()));
   }

   private void G() {
      this.x(dig.qy);
      this.x(dig.qx);
      this.x(dig.qw);
      this.x(dig.qv);
   }

   private void H() {
      this.c(dig.st);
      od.b<jm, dwg> $$0 = od.a(dvz.bm, dvz.bn);

      for (dwg $$1 : dwg.values()) {
         $$0.a(jm.b, $$1, this.a(jm.b, $$1));
      }

      for (dwg $$2 : dwg.values()) {
         $$0.a(jm.a, $$2, this.a(jm.a, $$2));
      }

      this.b.accept(oc.a(dig.st).a($$0));
   }

   private of a(jm $$0, dwg $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      on $$3 = on.c(on.a(dig.st, $$2));
      return of.a().a(og.c, om.an.a(dig.st, $$2, $$3, this.c));
   }

   private void y(die $$0) {
      on $$1 = new on().a(oo.e, on.G(dig.dV)).a(oo.f, on.G($$0)).a(oo.i, on.a($$0, "_side"));
      this.b.accept(c($$0, om.n.a($$0, $$1, this.c)));
   }

   private void I() {
      ali $$0 = on.a(dig.gZ, "_side");
      on $$1 = new on().a(oo.f, on.a(dig.gZ, "_top")).a(oo.i, $$0);
      on $$2 = new on().a(oo.f, on.a(dig.gZ, "_inverted_top")).a(oo.i, $$0);
      this.b
         .accept(
            oc.a(dig.gZ)
               .a(od.a(dvz.p).a(false, of.a().a(og.c, om.aF.a(dig.gZ, $$1, this.c))).a(true, of.a().a(og.c, om.aF.a(ok.a(dig.gZ, "_inverted"), $$2, this.c))))
         );
   }

   private void z(die $$0) {
      this.b.accept(oc.a($$0, of.a().a(og.c, ok.a($$0))).a(this.n()));
   }

   private void J() {
      die $$0 = dig.ss;
      ali $$1 = ok.a($$0, "_on");
      ali $$2 = ok.a($$0);
      this.b.accept(oc.a($$0, of.a().a(og.c, ok.a($$0))).a(this.n()).a(a(dvz.w, $$1, $$2)));
   }

   private void K() {
      on $$0 = new on().a(oo.B, on.G(dig.j)).a(oo.f, on.G(dig.cC));
      on $$1 = new on().a(oo.B, on.G(dig.j)).a(oo.f, on.a(dig.cC, "_moist"));
      ali $$2 = om.aW.a(dig.cC, $$0, this.c);
      ali $$3 = om.aW.a(on.a(dig.cC, "_moist"), $$1, this.c);
      this.b.accept(oc.a(dig.cC).a(a(dvz.aQ, 7, $$3, $$2)));
   }

   private List<ali> A(die $$0) {
      ali $$1 = om.aX.a(ok.a($$0, "_floor0"), on.v($$0), this.c);
      ali $$2 = om.aX.a(ok.a($$0, "_floor1"), on.w($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<ali> B(die $$0) {
      ali $$1 = om.aY.a(ok.a($$0, "_side0"), on.v($$0), this.c);
      ali $$2 = om.aY.a(ok.a($$0, "_side1"), on.w($$0), this.c);
      ali $$3 = om.aZ.a(ok.a($$0, "_side_alt0"), on.v($$0), this.c);
      ali $$4 = om.aZ.a(ok.a($$0, "_side_alt1"), on.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ali> C(die $$0) {
      ali $$1 = om.ba.a(ok.a($$0, "_up0"), on.v($$0), this.c);
      ali $$2 = om.ba.a(ok.a($$0, "_up1"), on.w($$0), this.c);
      ali $$3 = om.bb.a(ok.a($$0, "_up_alt0"), on.v($$0), this.c);
      ali $$4 = om.bb.a(ok.a($$0, "_up_alt1"), on.w($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<of> a(List<ali> $$0, UnaryOperator<of> $$1) {
      return $$0.stream().map($$0x -> of.a().a(og.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void L() {
      oa $$0 = oa.a().a(dvz.L, false).a(dvz.M, false).a(dvz.N, false).a(dvz.O, false).a(dvz.J, false);
      List<ali> $$1 = this.A(dig.cr);
      List<ali> $$2 = this.B(dig.cr);
      List<ali> $$3 = this.C(dig.cr);
      this.b
         .accept(
            ob.a(dig.cr)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(oa.b(oa.a().a(dvz.L, true), $$0), a($$2, $$0x -> $$0x))
               .a(oa.b(oa.a().a(dvz.M, true), $$0), a($$2, $$0x -> $$0x.a(og.b, og.a.b)))
               .a(oa.b(oa.a().a(dvz.N, true), $$0), a($$2, $$0x -> $$0x.a(og.b, og.a.c)))
               .a(oa.b(oa.a().a(dvz.O, true), $$0), a($$2, $$0x -> $$0x.a(og.b, og.a.d)))
               .a(oa.a().a(dvz.J, true), a($$3, $$0x -> $$0x))
         );
   }

   private void M() {
      List<ali> $$0 = this.A(dig.cs);
      List<ali> $$1 = this.B(dig.cs);
      this.b
         .accept(
            ob.a(dig.cs)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(og.b, og.a.b)))
               .a(a($$1, $$0x -> $$0x.a(og.b, og.a.c)))
               .a(a($$1, $$0x -> $$0x.a(og.b, og.a.d)))
         );
   }

   private void D(die $$0) {
      ali $$1 = op.t.create($$0, this.c);
      ali $$2 = op.u.create($$0, this.c);
      this.a($$0.j());
      this.b.accept(oc.a($$0).a(a(dvz.j, $$2, $$1)));
   }

   private void N() {
      on $$0 = on.a(on.a(dig.ad, "_side"), on.a(dig.ad, "_top"));
      ali $$1 = om.j.a(dig.ad, $$0, this.c);
      this.b.accept(d(dig.ad, $$1));
   }

   private void O() {
      this.a(cwf.ad);
      die $$0 = dig.E;
      od.b<Boolean, Integer> $$1 = od.a(dmy.d, dmy.b);
      ali $$2 = ok.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ali $$4 = ok.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, of.a().a(og.c, $$4));
         $$1.a(false, $$3, of.a().a(og.c, $$2));
      }

      this.b.accept(oc.a(dig.E).a($$1));
   }

   private void P() {
      this.b
         .accept(
            oc.a(dig.kI)
               .a(
                  od.a(dvz.as)
                     .a(0, of.a().a(og.c, this.a(dig.kI, "_0", om.c, on::b)))
                     .a(1, of.a().a(og.c, this.a(dig.kI, "_1", om.c, on::b)))
                     .a(2, of.a().a(og.c, this.a(dig.kI, "_2", om.c, on::b)))
                     .a(3, of.a().a(og.c, this.a(dig.kI, "_3", om.c, on::b)))
               )
         );
   }

   private void Q() {
      ali $$0 = on.G(dig.j);
      on $$1 = new on().a(oo.e, $$0).b(oo.e, oo.c).a(oo.f, on.a(dig.i, "_top")).a(oo.i, on.a(dig.i, "_snow"));
      of $$2 = of.a().a(og.c, om.n.a(dig.i, "_snow", $$1, this.c));
      this.a(dig.i, ok.a(dig.i), $$2);
      ali $$3 = op.f.get(dig.fl).a($$1x -> $$1x.a(oo.e, $$0)).a(dig.fl, this.c);
      this.a(dig.fl, $$3, $$2);
      ali $$4 = op.f.get(dig.l).a($$1x -> $$1x.a(oo.e, $$0)).a(dig.l, this.c);
      this.a(dig.l, $$4, $$2);
   }

   private void a(die $$0, ali $$1, of $$2) {
      List<of> $$3 = Arrays.asList(a($$1));
      this.b.accept(oc.a($$0).a(od.a(dvz.z).a(true, $$2).a(false, $$3)));
   }

   private void R() {
      this.a(cwf.ri);
      this.b
         .accept(
            oc.a(dig.fC)
               .a(
                  od.a(dvz.ar)
                     .a(0, of.a().a(og.c, ok.a(dig.fC, "_stage0")))
                     .a(1, of.a().a(og.c, ok.a(dig.fC, "_stage1")))
                     .a(2, of.a().a(og.c, ok.a(dig.fC, "_stage2")))
               )
               .a(c())
         );
   }

   private void S() {
      this.b.accept(b(dig.kE, ok.a(dig.kE)));
   }

   private void j(die $$0, die $$1) {
      on $$2 = on.b($$1);
      ali $$3 = om.Y.a($$0, $$2, this.c);
      ali $$4 = om.Z.a($$0, $$2, this.c);
      this.b.accept(oc.a($$0).a(a(dvz.aT, 1, $$4, $$3)));
   }

   private void T() {
      ali $$0 = ok.a(dig.hc);
      ali $$1 = ok.a(dig.hc, "_side");
      this.a(cwf.lR);
      this.b
         .accept(
            oc.a(dig.hc)
               .a(
                  od.a(dvz.Q)
                     .a(jm.a, of.a().a(og.c, $$0))
                     .a(jm.c, of.a().a(og.c, $$1))
                     .a(jm.f, of.a().a(og.c, $$1).a(og.b, og.a.b))
                     .a(jm.d, of.a().a(og.c, $$1).a(og.b, og.a.c))
                     .a(jm.e, of.a().a(og.c, $$1).a(og.b, og.a.d))
               )
         );
   }

   private void k(die $$0, die $$1) {
      ali $$2 = ok.a($$0);
      this.b.accept(oc.a($$1, of.a().a(og.c, $$2)));
      this.a($$1, $$2);
   }

   private void U() {
      ali $$0 = ok.a(dig.eW, "_post_ends");
      ali $$1 = ok.a(dig.eW, "_post");
      ali $$2 = ok.a(dig.eW, "_cap");
      ali $$3 = ok.a(dig.eW, "_cap_alt");
      ali $$4 = ok.a(dig.eW, "_side");
      ali $$5 = ok.a(dig.eW, "_side_alt");
      this.b
         .accept(
            ob.a(dig.eW)
               .a(of.a().a(og.c, $$0))
               .a(oa.a().a(dvz.L, false).a(dvz.M, false).a(dvz.N, false).a(dvz.O, false), of.a().a(og.c, $$1))
               .a(oa.a().a(dvz.L, true).a(dvz.M, false).a(dvz.N, false).a(dvz.O, false), of.a().a(og.c, $$2))
               .a(oa.a().a(dvz.L, false).a(dvz.M, true).a(dvz.N, false).a(dvz.O, false), of.a().a(og.c, $$2).a(og.b, og.a.b))
               .a(oa.a().a(dvz.L, false).a(dvz.M, false).a(dvz.N, true).a(dvz.O, false), of.a().a(og.c, $$3))
               .a(oa.a().a(dvz.L, false).a(dvz.M, false).a(dvz.N, false).a(dvz.O, true), of.a().a(og.c, $$3).a(og.b, og.a.b))
               .a(oa.a().a(dvz.L, true), of.a().a(og.c, $$4))
               .a(oa.a().a(dvz.M, true), of.a().a(og.c, $$4).a(og.b, og.a.b))
               .a(oa.a().a(dvz.N, true), of.a().a(og.c, $$5))
               .a(oa.a().a(dvz.O, true), of.a().a(og.c, $$5).a(og.b, og.a.b))
         );
      this.d(dig.eW);
   }

   private void E(die $$0) {
      this.b.accept(oc.a($$0, of.a().a(og.c, ok.a($$0))).a(b()));
   }

   private void V() {
      ali $$0 = ok.a(dig.dw);
      ali $$1 = ok.a(dig.dw, "_on");
      this.d(dig.dw);
      this.b
         .accept(
            oc.a(dig.dw)
               .a(a(dvz.w, $$0, $$1))
               .a(
                  od.a(dvz.U, dvz.R)
                     .a(dvu.c, jm.c, of.a().a(og.a, og.a.c).a(og.b, og.a.c))
                     .a(dvu.c, jm.f, of.a().a(og.a, og.a.c).a(og.b, og.a.d))
                     .a(dvu.c, jm.d, of.a().a(og.a, og.a.c))
                     .a(dvu.c, jm.e, of.a().a(og.a, og.a.c).a(og.b, og.a.b))
                     .a(dvu.a, jm.c, of.a())
                     .a(dvu.a, jm.f, of.a().a(og.b, og.a.b))
                     .a(dvu.a, jm.d, of.a().a(og.b, og.a.c))
                     .a(dvu.a, jm.e, of.a().a(og.b, og.a.d))
                     .a(dvu.b, jm.c, of.a().a(og.a, og.a.b))
                     .a(dvu.b, jm.f, of.a().a(og.a, og.a.b).a(og.b, og.a.b))
                     .a(dvu.b, jm.d, of.a().a(og.a, og.a.b).a(og.b, og.a.c))
                     .a(dvu.b, jm.e, of.a().a(og.a, og.a.b).a(og.b, og.a.d))
               )
         );
   }

   private void W() {
      this.d(dig.fm);
      this.b.accept(b(dig.fm, ok.a(dig.fm)));
   }

   private void X() {
      this.d(dig.tn);
      this.b.accept(c(dig.tn, ok.a(dig.tn)));
   }

   private void Y() {
      this.b.accept(oc.a(dig.ed).a(od.a(dvz.H).a(jm.a.a, of.a().a(og.c, ok.a(dig.ed, "_ns"))).a(jm.a.c, of.a().a(og.c, ok.a(dig.ed, "_ew")))));
   }

   private void Z() {
      ali $$0 = op.a.create(dig.dV, this.c);
      this.b
         .accept(
            oc.a(
               dig.dV,
               of.a().a(og.c, $$0),
               of.a().a(og.c, $$0).a(og.a, og.a.b),
               of.a().a(og.c, $$0).a(og.a, og.a.c),
               of.a().a(og.c, $$0).a(og.a, og.a.d),
               of.a().a(og.c, $$0).a(og.b, og.a.b),
               of.a().a(og.c, $$0).a(og.b, og.a.b).a(og.a, og.a.b),
               of.a().a(og.c, $$0).a(og.b, og.a.b).a(og.a, og.a.c),
               of.a().a(og.c, $$0).a(og.b, og.a.b).a(og.a, og.a.d),
               of.a().a(og.c, $$0).a(og.b, og.a.c),
               of.a().a(og.c, $$0).a(og.b, og.a.c).a(og.a, og.a.b),
               of.a().a(og.c, $$0).a(og.b, og.a.c).a(og.a, og.a.c),
               of.a().a(og.c, $$0).a(og.b, og.a.c).a(og.a, og.a.d),
               of.a().a(og.c, $$0).a(og.b, og.a.d),
               of.a().a(og.c, $$0).a(og.b, og.a.d).a(og.a, og.a.b),
               of.a().a(og.c, $$0).a(og.b, og.a.d).a(og.a, og.a.c),
               of.a().a(og.c, $$0).a(og.b, og.a.d).a(og.a, og.a.d)
            )
         );
   }

   private void aa() {
      ali $$0 = ok.a(dig.kO);
      ali $$1 = ok.a(dig.kO, "_on");
      this.b.accept(oc.a(dig.kO).a(a(dvz.w, $$1, $$0)).a(e()));
   }

   private void ab() {
      on $$0 = new on().a(oo.e, on.a(dig.by, "_bottom")).a(oo.i, on.a(dig.by, "_side"));
      ali $$1 = on.a(dig.by, "_top_sticky");
      ali $$2 = on.a(dig.by, "_top");
      on $$3 = $$0.c(oo.E, $$1);
      on $$4 = $$0.c(oo.E, $$2);
      ali $$5 = ok.a(dig.by, "_base");
      this.a(dig.by, $$5, $$4);
      this.a(dig.br, $$5, $$3);
      ali $$6 = om.n.a(dig.by, "_inventory", $$0.c(oo.f, $$2), this.c);
      ali $$7 = om.n.a(dig.br, "_inventory", $$0.c(oo.f, $$1), this.c);
      this.a(dig.by, $$6);
      this.a(dig.br, $$7);
   }

   private void a(die $$0, ali $$1, on $$2) {
      ali $$3 = om.bj.a($$0, $$2, this.c);
      this.b.accept(oc.a($$0).a(a(dvz.g, $$1, $$3)).a(e()));
   }

   private void ac() {
      on $$0 = new on().a(oo.F, on.a(dig.by, "_top")).a(oo.i, on.a(dig.by, "_side"));
      on $$1 = $$0.c(oo.E, on.a(dig.by, "_top_sticky"));
      on $$2 = $$0.c(oo.E, on.a(dig.by, "_top"));
      this.b
         .accept(
            oc.a(dig.bz)
               .a(
                  od.a(dvz.x, dvz.bg)
                     .a(false, dwl.a, of.a().a(og.c, om.bk.a(dig.by, "_head", $$2, this.c)))
                     .a(false, dwl.b, of.a().a(og.c, om.bk.a(dig.by, "_head_sticky", $$1, this.c)))
                     .a(true, dwl.a, of.a().a(og.c, om.bl.a(dig.by, "_head_short", $$2, this.c)))
                     .a(true, dwl.b, of.a().a(og.c, om.bl.a(dig.by, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void ad() {
      die $$0 = dig.tr;
      on $$1 = on.a($$0, "_side_inactive", "_top_inactive");
      on $$2 = on.a($$0, "_side_active", "_top_active");
      on $$3 = on.a($$0, "_side_active", "_top_ejecting_reward");
      on $$4 = on.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      on $$5 = on.a($$0, "_side_active_ominous", "_top_active_ominous");
      on $$6 = on.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ali $$7 = om.o.a($$0, $$1, this.c);
      ali $$8 = om.o.a($$0, "_active", $$2, this.c);
      ali $$9 = om.o.a($$0, "_ejecting_reward", $$3, this.c);
      ali $$10 = om.o.a($$0, "_inactive_ominous", $$4, this.c);
      ali $$11 = om.o.a($$0, "_active_ominous", $$5, this.c);
      ali $$12 = om.o.a($$0, "_ejecting_reward_ominous", $$6, this.c);
      this.a($$0, $$7);
      this.b.accept(oc.a($$0).a(od.a(dvz.by, dvz.bA).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> of.a().a(og.c, $$7x ? $$10 : $$7);
            case b, c, d -> of.a().a(og.c, $$7x ? $$11 : $$8);
            case e -> of.a().a(og.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void ae() {
      die $$0 = dig.ts;
      on $$1 = on.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      on $$2 = on.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      on $$3 = on.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      on $$4 = on.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ali $$5 = om.bP.a($$0, $$1, this.c);
      ali $$6 = om.bP.a($$0, "_active", $$2, this.c);
      ali $$7 = om.bP.a($$0, "_unlocking", $$3, this.c);
      ali $$8 = om.bP.a($$0, "_ejecting_reward", $$4, this.c);
      on $$9 = on.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      on $$10 = on.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      on $$11 = on.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      on $$12 = on.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ali $$13 = om.bP.a($$0, "_ominous", $$9, this.c);
      ali $$14 = om.bP.a($$0, "_active_ominous", $$10, this.c);
      ali $$15 = om.bP.a($$0, "_unlocking_ominous", $$11, this.c);
      ali $$16 = om.bP.a($$0, "_ejecting_reward_ominous", $$12, this.c);
      this.a($$0, $$5);
      this.b.accept(oc.a($$0).a(b()).a(od.a(dqz.b, dqz.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> of.a().a(og.c, $$9x ? $$13 : $$5);
            case b -> of.a().a(og.c, $$9x ? $$14 : $$6);
            case c -> of.a().a(og.c, $$9x ? $$15 : $$7);
            case d -> of.a().a(og.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void af() {
      ali $$0 = ok.a(dig.qQ, "_inactive");
      ali $$1 = ok.a(dig.qQ, "_active");
      this.a(dig.qQ, $$0);
      this.b.accept(oc.a(dig.qQ).a(od.a(dvz.bo).a($$2 -> of.a().a(og.c, $$2 != dwq.b && $$2 != dwq.c ? $$0 : $$1))));
   }

   private void ag() {
      ali $$0 = ok.a(dig.qR, "_inactive");
      ali $$1 = ok.a(dig.qR, "_active");
      this.a(dig.qR, $$0);
      this.b.accept(oc.a(dig.qR).a(od.a(dvz.bo).a($$2 -> of.a().a(og.c, $$2 != dwq.b && $$2 != dwq.c ? $$0 : $$1))).a(b()));
   }

   private void ah() {
      ali $$0 = om.bO.a(dig.qV, on.a(false), this.c);
      ali $$1 = om.bO.a(dig.qV, "_can_summon", on.a(true), this.c);
      this.a(dig.qV, $$0);
      this.b.accept(oc.a(dig.qV).a(a(dvz.G, $$1, $$0)));
   }

   private void ai() {
      ali $$0 = ok.a(dig.nS, "_stable");
      ali $$1 = ok.a(dig.nS, "_unstable");
      this.a(dig.nS, $$0);
      this.b.accept(oc.a(dig.nS).a(a(dvz.b, $$1, $$0)));
   }

   private void aj() {
      ali $$0 = this.a(dig.sv, "", om.ao, on::c);
      ali $$1 = this.a(dig.sv, "_lit", om.ao, on::c);
      this.b.accept(oc.a(dig.sv).a(a(dvz.D, $$1, $$0)));
      ali $$2 = this.a(dig.sw, "", om.ao, on::c);
      ali $$3 = this.a(dig.sw, "_lit", om.ao, on::c);
      this.b.accept(oc.a(dig.sw).a(a(dvz.D, $$3, $$2)));
   }

   private void ak() {
      ali $$0 = op.a.create(dig.fB, this.c);
      ali $$1 = this.a(dig.fB, "_on", om.c, on::b);
      this.b.accept(oc.a(dig.fB).a(a(dvz.r, $$1, $$0)));
   }

   private void l(die $$0, die $$1) {
      on $$2 = on.y($$0);
      this.b.accept(c($$0, om.bf.a($$0, $$2, this.c)));
      this.b.accept(oc.a($$1, of.a().a(og.c, om.bg.a($$1, $$2, this.c))).a(d()));
      this.d($$0);
      this.c($$1);
   }

   private void al() {
      on $$0 = on.y(dig.dK);
      on $$1 = on.i(on.a(dig.dK, "_off"));
      ali $$2 = om.bh.a(dig.dK, $$0, this.c);
      ali $$3 = om.bh.a(dig.dK, "_off", $$1, this.c);
      this.b.accept(oc.a(dig.dK).a(a(dvz.r, $$2, $$3)));
      ali $$4 = om.bi.a(dig.dL, $$0, this.c);
      ali $$5 = om.bi.a(dig.dL, "_off", $$1, this.c);
      this.b.accept(oc.a(dig.dL).a(a(dvz.r, $$4, $$5)).a(d()));
      this.d(dig.dK);
      this.c(dig.dL);
   }

   private void am() {
      this.a(cwf.lK);
      this.b.accept(oc.a(dig.eh).a(od.a(dvz.aA, dvz.s, dvz.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return of.a().a(og.c, on.a(dig.eh, $$3.toString()));
      })).a(c()));
   }

   private void an() {
      this.a(cwf.cT);
      this.b
         .accept(
            oc.a(dig.mV)
               .a(
                  od.a(dvz.aS, dvz.C)
                     .a(1, false, Arrays.asList(a(ok.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(ok.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(ok.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(ok.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(ok.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(ok.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(ok.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(ok.a("four_sea_pickles"))))
               )
         );
   }

   private void ao() {
      on $$0 = on.a(dig.dN);
      ali $$1 = om.c.a(dig.dP, $$0, this.c);
      this.b.accept(oc.a(dig.dN).a(od.a(dvz.aF).a($$1x -> of.a().a(og.c, $$1x < 8 ? ok.a(dig.dN, "_height" + $$1x * 2) : $$1))));
      this.a(dig.dN, ok.a(dig.dN, "_height2"));
      this.b.accept(c(dig.dP, $$1));
   }

   private void ap() {
      this.b.accept(oc.a(dig.oc, of.a().a(og.c, ok.a(dig.oc))).a(b()));
   }

   private void aq() {
      ali $$0 = op.a.create(dig.pa, this.c);
      this.a(dig.pa, $$0);
      this.b.accept(oc.a(dig.pa).a(od.a(dvz.bj).a($$0x -> of.a().a(og.c, this.a(dig.pa, "_" + $$0x.c(), om.c, on::b)))));
   }

   private void ar() {
      this.a(cwf.wx);
      this.b.accept(oc.a(dig.oi).a(od.a(dvz.as).a($$0 -> of.a().a(og.c, this.a(dig.oi, "_stage" + $$0, om.ao, on::c)))));
   }

   private void as() {
      this.a(cwf.pt);
      this.b
         .accept(
            oc.a(dig.fI)
               .a(
                  od.a(dvz.a, dvz.M, dvz.L, dvz.N, dvz.O)
                     .a(false, false, false, false, false, of.a().a(og.c, ok.a(dig.fI, "_ns")))
                     .a(false, true, false, false, false, of.a().a(og.c, ok.a(dig.fI, "_n")).a(og.b, og.a.b))
                     .a(false, false, true, false, false, of.a().a(og.c, ok.a(dig.fI, "_n")))
                     .a(false, false, false, true, false, of.a().a(og.c, ok.a(dig.fI, "_n")).a(og.b, og.a.c))
                     .a(false, false, false, false, true, of.a().a(og.c, ok.a(dig.fI, "_n")).a(og.b, og.a.d))
                     .a(false, true, true, false, false, of.a().a(og.c, ok.a(dig.fI, "_ne")))
                     .a(false, true, false, true, false, of.a().a(og.c, ok.a(dig.fI, "_ne")).a(og.b, og.a.b))
                     .a(false, false, false, true, true, of.a().a(og.c, ok.a(dig.fI, "_ne")).a(og.b, og.a.c))
                     .a(false, false, true, false, true, of.a().a(og.c, ok.a(dig.fI, "_ne")).a(og.b, og.a.d))
                     .a(false, false, true, true, false, of.a().a(og.c, ok.a(dig.fI, "_ns")))
                     .a(false, true, false, false, true, of.a().a(og.c, ok.a(dig.fI, "_ns")).a(og.b, og.a.b))
                     .a(false, true, true, true, false, of.a().a(og.c, ok.a(dig.fI, "_nse")))
                     .a(false, true, false, true, true, of.a().a(og.c, ok.a(dig.fI, "_nse")).a(og.b, og.a.b))
                     .a(false, false, true, true, true, of.a().a(og.c, ok.a(dig.fI, "_nse")).a(og.b, og.a.c))
                     .a(false, true, true, false, true, of.a().a(og.c, ok.a(dig.fI, "_nse")).a(og.b, og.a.d))
                     .a(false, true, true, true, true, of.a().a(og.c, ok.a(dig.fI, "_nsew")))
                     .a(true, false, false, false, false, of.a().a(og.c, ok.a(dig.fI, "_attached_ns")))
                     .a(true, false, true, false, false, of.a().a(og.c, ok.a(dig.fI, "_attached_n")))
                     .a(true, false, false, true, false, of.a().a(og.c, ok.a(dig.fI, "_attached_n")).a(og.b, og.a.c))
                     .a(true, true, false, false, false, of.a().a(og.c, ok.a(dig.fI, "_attached_n")).a(og.b, og.a.b))
                     .a(true, false, false, false, true, of.a().a(og.c, ok.a(dig.fI, "_attached_n")).a(og.b, og.a.d))
                     .a(true, true, true, false, false, of.a().a(og.c, ok.a(dig.fI, "_attached_ne")))
                     .a(true, true, false, true, false, of.a().a(og.c, ok.a(dig.fI, "_attached_ne")).a(og.b, og.a.b))
                     .a(true, false, false, true, true, of.a().a(og.c, ok.a(dig.fI, "_attached_ne")).a(og.b, og.a.c))
                     .a(true, false, true, false, true, of.a().a(og.c, ok.a(dig.fI, "_attached_ne")).a(og.b, og.a.d))
                     .a(true, false, true, true, false, of.a().a(og.c, ok.a(dig.fI, "_attached_ns")))
                     .a(true, true, false, false, true, of.a().a(og.c, ok.a(dig.fI, "_attached_ns")).a(og.b, og.a.b))
                     .a(true, true, true, true, false, of.a().a(og.c, ok.a(dig.fI, "_attached_nse")))
                     .a(true, true, false, true, true, of.a().a(og.c, ok.a(dig.fI, "_attached_nse")).a(og.b, og.a.b))
                     .a(true, false, true, true, true, of.a().a(og.c, ok.a(dig.fI, "_attached_nse")).a(og.b, og.a.c))
                     .a(true, true, true, false, true, of.a().a(og.c, ok.a(dig.fI, "_attached_nse")).a(og.b, og.a.d))
                     .a(true, true, true, true, true, of.a().a(og.c, ok.a(dig.fI, "_attached_nsew")))
               )
         );
   }

   private void at() {
      this.d(dig.fH);
      this.b.accept(oc.a(dig.fH).a(od.a(dvz.a, dvz.w).a(($$0, $$1) -> of.a().a(og.c, on.a(dig.fH, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ali a(int $$0, String $$1, on $$2) {
      switch ($$0) {
         case 1:
            return om.bn.a(ok.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return om.bo.a(ok.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return om.bp.a(ok.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return om.bq.a(ok.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ali a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", on.b(on.G(dig.mf)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", on.b(on.a(dig.mf, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", on.b(on.a(dig.mf, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void au() {
      this.a(cwf.kp);
      this.b.accept(oc.a(dig.mf).a(od.a(dvz.aD, dvz.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void av() {
      this.a(cwf.kq);
      Function<Integer, ali> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         on $$2 = on.a($$1);
         return om.by.a(dig.mg, $$1, $$2, this.c);
      };
      this.b.accept(oc.a(dig.mg).a(od.a(dpm.c).a($$1 -> of.a().a(og.c, $$0.apply($$1)))));
   }

   private void F(die $$0) {
      this.d($$0);
      ali $$1 = ok.a($$0);
      ob $$2 = ob.a($$0);
      oa.c $$3 = ae.a(oa.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<dwa, Function<ali, of>> $$4 : a) {
         dwa $$5 = (dwa)$$4.getFirst();
         Function<ali, of> $$6 = (Function<ali, of>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(oa.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void aw() {
      ali $$0 = on.a(dig.qU, "_bottom");
      on $$1 = new on().a(oo.e, $$0).a(oo.f, on.a(dig.qU, "_top")).a(oo.i, on.a(dig.qU, "_side"));
      on $$2 = new on().a(oo.e, $$0).a(oo.f, on.a(dig.qU, "_top_bloom")).a(oo.i, on.a(dig.qU, "_side_bloom"));
      ali $$3 = om.n.a(dig.qU, "", $$1, this.c);
      ali $$4 = om.n.a(dig.qU, "_bloom", $$2, this.c);
      this.b.accept(oc.a(dig.qU).a(od.a(dvz.E).a($$2x -> of.a().a(og.c, $$2x ? $$4 : $$3))));
      this.a(cwf.gj, $$3);
   }

   private void ax() {
      die $$0 = dig.cm;
      ali $$1 = ok.a($$0);
      ob $$2 = ob.a($$0);
      List.of(Pair.of(jm.c, og.a.a), Pair.of(jm.f, og.a.b), Pair.of(jm.d, og.a.c), Pair.of(jm.e, og.a.d)).forEach($$2x -> {
         jm $$3 = (jm)$$2x.getFirst();
         og.a $$4 = (og.a)$$2x.getSecond();
         oa.c $$5 = oa.a().a(dvz.R, $$3);
         $$2.a($$5, of.a().a(og.c, $$1).a(og.b, $$4).a(og.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, ok.a($$0, "_inventory"));
      i.clear();
   }

   private void a(ob $$0, oa.c $$1, og.a $$2) {
      List.of(Pair.of(dvz.bp, om.aM), Pair.of(dvz.bq, om.aN), Pair.of(dvz.br, om.aO), Pair.of(dvz.bs, om.aP), Pair.of(dvz.bt, om.aQ), Pair.of(dvz.bu, om.aR))
         .forEach($$3 -> {
            dwa $$4 = (dwa)$$3.getFirst();
            ol $$5 = (ol)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ob $$0, oa.c $$1, og.a $$2, dwa $$3, ol $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      on $$7 = new on().a(oo.b, on.a(dig.cm, $$6));
      nv.d $$8 = new nv.d($$4, $$6);
      ali $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dig.cm, $$6, $$7, this.c));
      $$0.a(oa.a($$1, oa.a().a($$3, $$5)), of.a().a(og.c, $$9).a(og.b, $$2));
   }

   private void ay() {
      this.b.accept(c(dig.kJ, om.c.a(dig.kJ, on.b(ok.a("magma")), this.c)));
   }

   private void G(die $$0) {
      this.b($$0, op.q);
      om.bF.a(ok.a($$0.j()), on.u($$0), this.c);
   }

   private void b(die $$0, die $$1, nv.e $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void m(die $$0, die $$1) {
      om.bG.a(ok.a($$0.j()), on.u($$1), this.c);
   }

   private void az() {
      ali $$0 = ok.a(dig.b);
      ali $$1 = ok.a(dig.b, "_mirrored");
      this.b.accept(a(dig.eN, $$0, $$1));
      this.a(dig.eN, $$0);
   }

   private void aA() {
      ali $$0 = ok.a(dig.sJ);
      ali $$1 = ok.a(dig.sJ, "_mirrored");
      this.b.accept(a(dig.td, $$0, $$1).a(f()));
      this.a(dig.td, $$0);
   }

   private void n(die $$0, die $$1) {
      this.a($$0, nv.e.b);
      on $$2 = on.d(on.a($$0, "_pot"));
      ali $$3 = nv.e.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void aB() {
      ali $$0 = on.a(dig.pl, "_bottom");
      ali $$1 = on.a(dig.pl, "_top_off");
      ali $$2 = on.a(dig.pl, "_top");
      ali[] $$3 = new ali[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         on $$5 = new on().a(oo.e, $$0).a(oo.f, $$4 == 0 ? $$1 : $$2).a(oo.i, on.a(dig.pl, "_side" + $$4));
         $$3[$$4] = om.n.a(dig.pl, "_" + $$4, $$5, this.c);
      }

      this.b.accept(oc.a(dig.pl).a(od.a(dvz.aZ).a($$1x -> of.a().a(og.c, $$3[$$1x]))));
      this.a(cwf.wV, $$3[0]);
   }

   private of a(jo $$0, of $$1) {
      switch ($$0) {
         case b:
            return $$1.a(og.a, og.a.b);
         case c:
            return $$1.a(og.a, og.a.b).a(og.b, og.a.c);
         case d:
            return $$1.a(og.a, og.a.b).a(og.b, og.a.d);
         case a:
            return $$1.a(og.a, og.a.b).a(og.b, og.a.b);
         case f:
            return $$1.a(og.a, og.a.d).a(og.b, og.a.c);
         case g:
            return $$1.a(og.a, og.a.d);
         case h:
            return $$1.a(og.a, og.a.d).a(og.b, og.a.b);
         case e:
            return $$1.a(og.a, og.a.d).a(og.b, og.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(og.b, og.a.c);
         case i:
            return $$1.a(og.b, og.a.d);
         case j:
            return $$1.a(og.b, og.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aC() {
      ali $$0 = on.a(dig.pb, "_top");
      ali $$1 = on.a(dig.pb, "_bottom");
      ali $$2 = on.a(dig.pb, "_side");
      ali $$3 = on.a(dig.pb, "_lock");
      on $$4 = new on().a(oo.o, $$2).a(oo.m, $$2).a(oo.l, $$2).a(oo.c, $$0).a(oo.j, $$0).a(oo.k, $$1).a(oo.n, $$3);
      ali $$5 = om.b.a(dig.pb, $$4, this.c);
      this.b.accept(oc.a(dig.pb, of.a().a(og.c, $$5)).a(od.a(dvz.T).a($$0x -> this.a($$0x, of.a()))));
   }

   private void aD() {
      die $$0 = dig.n;
      ali $$1 = ok.a($$0);
      op $$2 = op.a.get($$0);
      die $$3 = dig.jH;
      ali $$4 = om.ab.a($$3, $$2.b(), this.c);
      ali $$5 = om.ac.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      mb.a().filter(mc::c).forEach($$0 -> this.h($$0.a()).a($$0));
      this.h(dig.rf).a(mb.w).a(dig.rf, dig.rD).a(dig.rj, dig.rn).a(mb.y);
      this.h(dig.re).a(mb.A).a(dig.re, dig.rC).a(dig.ri, dig.rm).a(mb.C);
      this.h(dig.rd).a(mb.E).a(dig.rd, dig.rB).a(dig.rh, dig.rl).a(mb.G);
      this.h(dig.rc).a(mb.I).a(dig.rc, dig.rA).a(dig.rg, dig.rk).a(mb.K);
      this.w(dig.sk);
      this.w(dig.sl);
      this.w(dig.sm);
      this.w(dig.sn);
      this.i(dig.sk, dig.so);
      this.i(dig.sl, dig.sp);
      this.i(dig.sm, dig.sq);
      this.i(dig.sn, dig.sr);
      this.m(dig.a);
      this.c(dig.nc, dig.a);
      this.c(dig.nb, dig.a);
      this.m(dig.fO);
      this.m(dig.dQ);
      this.c(dig.nd, dig.G);
      this.m(dig.fA);
      this.m(dig.me);
      this.m(dig.fr);
      this.m(dig.fR);
      this.a(cwf.ug);
      this.m(dig.pg);
      this.m(dig.G);
      this.m(dig.H);
      this.m(dig.hV);
      this.a(cwf.fS);
      this.o(dig.pM, dig.qd);
      this.o(dig.pN, dig.qe);
      this.o(dig.pO, dig.qf);
      this.o(dig.pP, dig.qg);
      this.o(dig.pQ, dig.qh);
      this.o(dig.pR, dig.qi);
      this.o(dig.pS, dig.qj);
      this.o(dig.pT, dig.qk);
      this.o(dig.pU, dig.ql);
      this.o(dig.pV, dig.qm);
      this.o(dig.pW, dig.qn);
      this.o(dig.pX, dig.qo);
      this.o(dig.pY, dig.qp);
      this.o(dig.pZ, dig.qq);
      this.o(dig.qa, dig.qr);
      this.o(dig.qb, dig.qs);
      this.o(dig.pL, dig.qc);
      this.m(dig.na);
      this.m(dig.gs);
      this.m(dig.qP);
      this.m(dig.sx);
      this.s(dig.sy);
      this.s(dig.sz);
      this.t(dig.ti);
      this.t(dig.tj);
      this.aj();
      this.g(dig.sC, dig.sA);
      this.p(dig.sB);
      this.a(dig.hW, cwf.hB);
      this.a(cwf.hB);
      this.aE();
      this.a(dig.kN, cwf.jb);
      this.a(cwf.jb);
      this.f(dig.bQ, on.a(dig.by, "_side"));
      this.a(dig.R);
      this.a(dig.S);
      this.a(dig.iB);
      this.a(dig.cx);
      this.a(dig.cy);
      this.a(dig.cz);
      this.a(dig.fE);
      this.a(dig.fF);
      this.a(dig.fJ);
      this.a(dig.N);
      this.a(dig.T);
      this.a(dig.O);
      this.a(dig.ch);
      this.a(dig.P);
      this.a(dig.Q);
      this.a(dig.ci);
      this.b(dig.pj, op.d);
      this.a(dig.pi);
      this.a(dig.aR);
      this.a(dig.aS);
      this.a(dig.aT);
      this.a(dig.hb);
      this.a(dig.dI);
      this.a(dig.dJ);
      this.a(dig.ha);
      this.a(dig.pC);
      this.a(dig.mW);
      this.a(dig.dR);
      this.a(dig.k);
      this.a(dig.pk);
      this.a(dig.fz);
      this.a(dig.ec);
      this.a(dig.L);
      this.a(dig.ph);
      this.a(dig.dO);
      this.b(dig.dT, op.g);
      this.b(dig.pq, op.d);
      this.b(dig.fa, op.d);
      this.m(dig.ac);
      this.m(dig.ga);
      this.a(dig.kK);
      this.a(dig.aY);
      this.a(dig.iC);
      this.a(dig.co);
      this.a(dig.pK);
      this.a(dig.ii);
      this.a(dig.oy);
      this.a(dig.dW);
      this.a(dig.dX);
      this.b(dig.ct, op.b);
      this.a(dig.aO);
      this.b(dig.bw, op.v);
      this.a(cwf.cS);
      this.b(dig.ck, op.f);
      this.b(dig.pd, op.d);
      this.a(dig.op);
      this.a(dig.aP);
      this.a(dig.qt);
      this.a(dig.qu);
      this.a(dig.qN);
      this.a(dig.su);
      this.a(dig.tf);
      this.a(dig.tg);
      this.a(dig.th);
      this.e(dig.qS);
      this.m(dig.tt);
      this.aD();
      this.a(dig.ra);
      this.a(dig.rb);
      this.a(dig.qW);
      this.a(dig.qX);
      this.a(dig.qY);
      this.a(dig.qZ);
      this.k(dig.qW, dig.rw);
      this.k(dig.qX, dig.ry);
      this.k(dig.qY, dig.rx);
      this.k(dig.qZ, dig.rz);
      this.i(dig.rM);
      this.i(dig.rN);
      this.i(dig.rP);
      this.i(dig.rO);
      this.a(dig.rM, dig.rQ);
      this.a(dig.rN, dig.rR);
      this.a(dig.rP, dig.rT);
      this.a(dig.rO, dig.rS);
      this.k(dig.rU);
      this.k(dig.rV);
      this.k(dig.rX);
      this.k(dig.rW);
      this.b(dig.rU, dig.rY);
      this.b(dig.rV, dig.rZ);
      this.b(dig.rX, dig.sb);
      this.b(dig.rW, dig.sa);
      this.a(dig.sc);
      this.a(dig.sd);
      this.a(dig.se);
      this.a(dig.sf);
      this.k(dig.sc, dig.sg);
      this.k(dig.sd, dig.sh);
      this.k(dig.se, dig.si);
      this.k(dig.sf, dig.sj);
      this.j(dig.gW, dig.ch);
      this.j(dig.gX, dig.ci);
      this.G();
      this.r();
      this.ax();
      this.v();
      this.w();
      this.a(dig.og, dig.oh);
      this.x();
      this.A();
      this.B();
      this.E();
      this.F();
      this.I();
      this.D();
      this.z(dig.kt);
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
      this.F(dig.ff);
      this.F(dig.fg);
      this.F(dig.qT);
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
      this.E(dig.cO);
      this.d(dig.cO);
      this.E(dig.oa);
      this.g();
      this.E(dig.sE);
      this.l(dig.cp, dig.cq);
      this.l(dig.ea, dig.eb);
      this.a(dig.cA, dig.n, on::c);
      this.a(dig.nY, dig.p, on::d);
      this.y(dig.ow);
      this.y(dig.on);
      this.v(dig.aU);
      this.v(dig.hi);
      this.C();
      this.D(dig.oe);
      this.D(dig.of);
      this.e(dig.eX, ok.a(dig.eX));
      this.a(dig.dY, op.d);
      this.a(dig.dZ, op.d);
      this.a(dig.te);
      this.a(dig.kM, op.d);
      this.f(dig.j);
      this.f(dig.sH);
      this.f(dig.I);
      this.g(dig.J);
      this.g(dig.M);
      this.f(dig.K);
      this.e(dig.F);
      this.b(dig.to, op.f);
      this.a(dig.ij, op.d, op.e);
      this.a(dig.kx, op.w, op.x);
      this.a(dig.hf, op.w, op.x);
      this.a(dig.tk, op.d, op.e);
      this.a(dig.tl, op.d, op.e);
      this.a(dig.tm, op.d, op.e);
      this.c(dig.nT, op.i);
      this.z();
      this.a(dig.pe, on::A);
      this.a(dig.pf, on::C);
      this.a(dig.kD, dvz.as, 0, 1, 2, 3);
      this.a(dig.gt, dvz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dig.fq, dvz.as, 0, 1, 1, 2);
      this.a(dig.gu, dvz.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dig.cB, dvz.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dig.kA, nv.e.b, dvz.aq, 0, 1);
      this.i();
      this.h();
      this.a(ok.a("decorated_pot"), dig.iA).b(dig.tp);
      this.a(ok.a("banner"), dig.n)
         .a(om.bH, dig.iJ, dig.iK, dig.iL, dig.iM, dig.iN, dig.iO, dig.iP, dig.iQ, dig.iR, dig.iS, dig.iT, dig.iU, dig.iV, dig.iW, dig.iX, dig.iY)
         .b(dig.iZ, dig.ja, dig.jb, dig.jc, dig.jd, dig.je, dig.jf, dig.jg, dig.jh, dig.ji, dig.jj, dig.jk, dig.jl, dig.jm, dig.jn, dig.jo);
      this.a(ok.a("bed"), dig.n)
         .b(dig.aZ, dig.ba, dig.bb, dig.bc, dig.bd, dig.be, dig.bf, dig.bg, dig.bh, dig.bi, dig.bj, dig.bk, dig.bl, dig.bm, dig.bn, dig.bo);
      this.m(dig.aZ, dig.bA);
      this.m(dig.ba, dig.bB);
      this.m(dig.bb, dig.bC);
      this.m(dig.bc, dig.bD);
      this.m(dig.bd, dig.bE);
      this.m(dig.be, dig.bF);
      this.m(dig.bf, dig.bG);
      this.m(dig.bg, dig.bH);
      this.m(dig.bh, dig.bI);
      this.m(dig.bi, dig.bJ);
      this.m(dig.bj, dig.bK);
      this.m(dig.bk, dig.bL);
      this.m(dig.bl, dig.bM);
      this.m(dig.bm, dig.bN);
      this.m(dig.bn, dig.bO);
      this.m(dig.bo, dig.bP);
      this.a(ok.a("skull"), dig.dW)
         .a(om.bI, dig.gM, dig.gK, dig.gI, dig.gE, dig.gG, dig.gQ)
         .a(dig.gO)
         .b(dig.gN, dig.gP, dig.gL, dig.gJ, dig.gF, dig.gH, dig.gR);
      this.G(dig.kP);
      this.G(dig.kQ);
      this.G(dig.kR);
      this.G(dig.kS);
      this.G(dig.kT);
      this.G(dig.kU);
      this.G(dig.kV);
      this.G(dig.kW);
      this.G(dig.kX);
      this.G(dig.kY);
      this.G(dig.kZ);
      this.G(dig.la);
      this.G(dig.lb);
      this.G(dig.lc);
      this.G(dig.ld);
      this.G(dig.le);
      this.G(dig.lf);
      this.b(dig.mX, op.q);
      this.c(dig.mX);
      this.a(ok.a("chest"), dig.n).b(dig.cv, dig.gV);
      this.a(ok.a("ender_chest"), dig.co).b(dig.fG);
      this.f(dig.fx, dig.co).a(dig.fx, dig.kF);
      this.a(dig.aM);
      this.a(dig.aN);
      this.a(dig.lw);
      this.a(dig.lx);
      this.a(dig.ly);
      this.a(dig.lz);
      this.a(dig.lA);
      this.a(dig.lB);
      this.a(dig.lC);
      this.a(dig.lD);
      this.a(dig.lE);
      this.a(dig.lF);
      this.a(dig.lG);
      this.a(dig.lH);
      this.a(dig.lI);
      this.a(dig.lJ);
      this.a(dig.lK);
      this.a(dig.lL);
      this.a(op.a, dig.lM, dig.lN, dig.lO, dig.lP, dig.lQ, dig.lR, dig.lS, dig.lT, dig.lU, dig.lV, dig.lW, dig.lX, dig.lY, dig.lZ, dig.ma, dig.mb);
      this.a(dig.iA);
      this.a(dig.hj);
      this.a(dig.hk);
      this.a(dig.hl);
      this.a(dig.hm);
      this.a(dig.hn);
      this.a(dig.ho);
      this.a(dig.hp);
      this.a(dig.hq);
      this.a(dig.hr);
      this.a(dig.hs);
      this.a(dig.ht);
      this.a(dig.hu);
      this.a(dig.hv);
      this.a(dig.hw);
      this.a(dig.hx);
      this.a(dig.hy);
      this.a(dig.qO);
      this.h(dig.aQ, dig.eY);
      this.h(dig.ei, dig.hz);
      this.h(dig.ej, dig.hA);
      this.h(dig.ek, dig.hB);
      this.h(dig.el, dig.hC);
      this.h(dig.em, dig.hD);
      this.h(dig.en, dig.hE);
      this.h(dig.eo, dig.hF);
      this.h(dig.ep, dig.hG);
      this.h(dig.eq, dig.hH);
      this.h(dig.er, dig.hI);
      this.h(dig.es, dig.hJ);
      this.h(dig.et, dig.hK);
      this.h(dig.eu, dig.hL);
      this.h(dig.ev, dig.hM);
      this.h(dig.ew, dig.hN);
      this.h(dig.ex, dig.hO);
      this.b(op.o, dig.lg, dig.lh, dig.li, dig.lj, dig.lk, dig.ll, dig.lm, dig.ln, dig.lo, dig.lp, dig.lq, dig.lr, dig.ls, dig.lt, dig.lu, dig.lv);
      this.g(dig.bA, dig.ik);
      this.g(dig.bB, dig.il);
      this.g(dig.bC, dig.im);
      this.g(dig.bD, dig.in);
      this.g(dig.bE, dig.io);
      this.g(dig.bF, dig.ip);
      this.g(dig.bG, dig.iq);
      this.g(dig.bH, dig.ir);
      this.g(dig.bI, dig.is);
      this.g(dig.bJ, dig.it);
      this.g(dig.bK, dig.iu);
      this.g(dig.bL, dig.iv);
      this.g(dig.bM, dig.iw);
      this.g(dig.bN, dig.ix);
      this.g(dig.bO, dig.iy);
      this.g(dig.bP, dig.iz);
      this.a(dig.sI);
      this.a(dig.eL);
      this.a(dig.bu, dig.gb, nv.e.a);
      this.a(dig.bR, dig.gc, nv.e.b);
      this.a(dig.bT, dig.gd, nv.e.b);
      this.a(dig.bU, dig.ge, nv.e.b);
      this.a(dig.bV, dig.gf, nv.e.b);
      this.a(dig.bW, dig.gg, nv.e.b);
      this.a(dig.bX, dig.gh, nv.e.b);
      this.a(dig.bY, dig.gi, nv.e.b);
      this.a(dig.bZ, dig.gj, nv.e.b);
      this.a(dig.ca, dig.gk, nv.e.b);
      this.a(dig.cb, dig.gl, nv.e.b);
      this.a(dig.cc, dig.gm, nv.e.b);
      this.a(dig.ce, dig.gn, nv.e.b);
      this.a(dig.cd, dig.go, nv.e.b);
      this.a(dig.cg, dig.gp, nv.e.b);
      this.a(dig.cf, dig.gq, nv.e.b);
      this.a(dig.bv, dig.gr, nv.e.b);
      this.a(dig.bS, dig.fS, nv.e.b);
      this.H();
      this.u(dig.eT);
      this.u(dig.eU);
      this.u(dig.eV);
      this.a(dig.bt, nv.e.a);
      this.b(dig.dS, nv.e.a);
      this.a(cwf.dJ);
      this.b(dig.mc, dig.md, nv.e.b);
      this.a(cwf.dK);
      this.c(dig.md);
      this.b(dig.sG, nv.e.b);
      this.c(dig.sG);
      this.c(dig.sw);
      this.b(dig.oz, dig.oA, nv.e.b);
      this.b(dig.oB, dig.oC, nv.e.b);
      this.a(dig.oz, "_plant");
      this.c(dig.oA);
      this.a(dig.oB, "_plant");
      this.c(dig.oC);
      this.a(dig.mY, nv.e.a, on.c(on.a(dig.mZ, "_stage0")));
      this.m();
      this.a(dig.bs, nv.e.b);
      this.c(dig.iE, nv.e.b);
      this.c(dig.iF, nv.e.b);
      this.c(dig.iG, nv.e.b);
      this.c(dig.iH, nv.e.a);
      this.c(dig.iI, nv.e.a);
      this.j();
      this.k();
      this.l();
      this.a(dig.mw, dig.mr, dig.mm, dig.mh, dig.mG, dig.mB, dig.mQ, dig.mL);
      this.a(dig.mx, dig.ms, dig.mn, dig.mi, dig.mH, dig.mC, dig.mR, dig.mM);
      this.a(dig.my, dig.mt, dig.mo, dig.mj, dig.mI, dig.mD, dig.mS, dig.mN);
      this.a(dig.mz, dig.mu, dig.mp, dig.mk, dig.mJ, dig.mE, dig.mT, dig.mO);
      this.a(dig.mA, dig.mv, dig.mq, dig.ml, dig.mK, dig.mF, dig.mU, dig.mP);
      this.e(dig.fe, dig.fc);
      this.e(dig.fd, dig.fb);
      this.l(dig.ab).c(dig.ab).a(dig.av);
      this.l(dig.am).c(dig.am).a(dig.aD);
      this.a(dig.am, dig.dj, dig.ds);
      this.b(dig.aL, op.s);
      this.l(dig.Y).c(dig.Y).a(dig.as);
      this.l(dig.ai).c(dig.ai).a(dig.aA);
      this.a(dig.ai, dig.dd, dig.do);
      this.a(dig.B, dig.fX, nv.e.b);
      this.b(dig.aI, op.s);
      this.l(dig.Z).d(dig.Z).a(dig.at);
      this.l(dig.aj).d(dig.aj).a(dig.aB);
      this.a(dig.aj, dig.de, dig.dp);
      this.a(dig.C, dig.fY, nv.e.b);
      this.b(dig.aJ, op.s);
      this.l(dig.W).c(dig.W).a(dig.aq);
      this.l(dig.ag).c(dig.ag).a(dig.ay);
      this.a(dig.ag, dig.dc, dig.dn);
      this.a(dig.z, dig.fV, nv.e.b);
      this.b(dig.aG, op.s);
      this.l(dig.U).c(dig.U).a(dig.ao);
      this.l(dig.al).c(dig.al).a(dig.aw);
      this.a(dig.al, dig.da, dig.dl);
      this.a(dig.x, dig.fT, nv.e.b);
      this.b(dig.aE, op.s);
      this.l(dig.V).c(dig.V).a(dig.ap);
      this.l(dig.af).c(dig.af).a(dig.ax);
      this.a(dig.af, dig.db, dig.dm);
      this.a(dig.y, dig.fU, nv.e.b);
      this.b(dig.aF, op.s);
      this.l(dig.aa).c(dig.aa).a(dig.au);
      this.l(dig.ak).c(dig.ak).a(dig.aC);
      this.a(dig.ak, dig.dg, dig.dr);
      this.a(dig.D, dig.fZ, nv.e.b);
      this.b(dig.aK, op.s);
      this.l(dig.X).c(dig.X).a(dig.ar);
      this.l(dig.ah).c(dig.ah).a(dig.az);
      this.a(dig.ah, dig.df, dig.dq);
      this.a(dig.A, dig.fW, nv.e.b);
      this.b(dig.aH, op.s);
      this.l(dig.os).b(dig.os).a(dig.ou);
      this.l(dig.ot).b(dig.ot).a(dig.ov);
      this.a(dig.ot, dig.dh, dig.dt);
      this.a(dig.ox, dig.pm, nv.e.b);
      this.n(dig.oD, dig.po);
      this.l(dig.oj).b(dig.oj).a(dig.ol);
      this.l(dig.ok).b(dig.ok).a(dig.om);
      this.a(dig.ok, dig.di, dig.du);
      this.a(dig.oo, dig.pn, nv.e.b);
      this.n(dig.oq, dig.pp);
      this.l(dig.ae).d(dig.ae);
      this.l(dig.an).d(dig.an);
      this.a(dig.v, dig.dk, dig.dv);
      this.b(dig.or, nv.e.b);
      this.a(cwf.dG);
      this.i(dig.dy);
      this.k(dig.hY);
      this.u();
      this.n(dig.cP);
      this.o(dig.bp);
      this.o(dig.bq);
      this.o(dig.hh);
      this.t();
      this.q(dig.fN);
      this.q(dig.kG);
      this.q(dig.kH);
      this.r(dig.gS);
      this.r(dig.gT);
      this.r(dig.gU);
      this.o();
      this.p();
      this.d(dig.cD, op.h);
      this.d(dig.nW, op.h);
      this.d(dig.nV, op.i);
      this.s();
      this.aB();
      this.aw();
      this.k(dig.eK, dig.eS);
      this.k(dig.m, dig.eO);
      this.k(dig.eJ, dig.eR);
      this.k(dig.eI, dig.eQ);
      this.az();
      this.k(dig.eH, dig.eP);
      this.aA();
      cxk.b().forEach($$0 -> this.a($$0, ok.b("template_spawn_egg")));
   }

   private void aE() {
      this.c(dig.hX);
      od.a<Integer> $$0 = od.a(dvz.aP);

      for (int $$1 = 0; $$1 < 16; $$1++) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         ali $$3 = on.a(cwf.hC, $$2);
         $$0.a($$1, of.a().a(og.c, om.aa.a(dig.hX, $$2, on.h($$3), this.c)));
         om.bz.a(ok.a(cwf.hC, $$2), on.k($$3), this.c);
      }

      this.b.accept(oc.a(dig.hX).a($$0));
   }

   private void o(die $$0, die $$1) {
      this.a($$0.j());
      on $$2 = on.b(on.G($$0));
      on $$3 = on.b(on.a($$0, "_lit"));
      ali $$4 = om.bJ.a($$0, "_one_candle", $$2, this.c);
      ali $$5 = om.bK.a($$0, "_two_candles", $$2, this.c);
      ali $$6 = om.bL.a($$0, "_three_candles", $$2, this.c);
      ali $$7 = om.bM.a($$0, "_four_candles", $$2, this.c);
      ali $$8 = om.bJ.a($$0, "_one_candle_lit", $$3, this.c);
      ali $$9 = om.bK.a($$0, "_two_candles_lit", $$3, this.c);
      ali $$10 = om.bL.a($$0, "_three_candles_lit", $$3, this.c);
      ali $$11 = om.bM.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            oc.a($$0)
               .a(
                  od.a(dvz.az, dvz.r)
                     .a(1, false, of.a().a(og.c, $$4))
                     .a(2, false, of.a().a(og.c, $$5))
                     .a(3, false, of.a().a(og.c, $$6))
                     .a(4, false, of.a().a(og.c, $$7))
                     .a(1, true, of.a().a(og.c, $$8))
                     .a(2, true, of.a().a(og.c, $$9))
                     .a(3, true, of.a().a(og.c, $$10))
                     .a(4, true, of.a().a(og.c, $$11))
               )
         );
      ali $$12 = om.bN.a($$1, on.a($$0, false), this.c);
      ali $$13 = om.bN.a($$1, "_lit", on.a($$0, true), this.c);
      this.b.accept(oc.a($$1).a(a(dvz.r, $$13, $$12)));
   }

   class a {
      private final ali b;

      public a(final ali $$0, final die $$1) {
         this.b = om.aa.a($$0, on.u($$1), nv.this.c);
      }

      public nv.a a(die... $$0) {
         for (die $$1 : $$0) {
            nv.this.b.accept(nv.c($$1, this.b));
         }

         return this;
      }

      public nv.a b(die... $$0) {
         for (die $$1 : $$0) {
            nv.this.c($$1);
         }

         return this.a($$0);
      }

      public nv.a a(ol $$0, die... $$1) {
         for (die $$2 : $$1) {
            $$0.a(ok.a($$2.j()), on.u($$2), nv.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final on b;
      private final Map<ol, ali> c = Maps.newHashMap();
      @Nullable
      private mc d;
      @Nullable
      private ali e;
      private final Set<die> f = new HashSet<>();

      public b(final on $$0) {
         this.b = $$0;
      }

      public nv.b a(die $$0, ol $$1) {
         this.e = $$1.a($$0, this.b, nv.this.c);
         if (nv.this.f.containsKey($$0)) {
            nv.this.b.accept(nv.this.f.get($$0).create($$0, this.e, this.b, nv.this.c));
         } else {
            nv.this.b.accept(nv.c($$0, this.e));
         }

         return this;
      }

      public nv.b a(die $$0, die $$1) {
         ali $$2 = ok.a($$0);
         nv.this.b.accept(nv.c($$1, $$2));
         nv.this.a($$1, $$2);
         this.f.add($$1);
         return this;
      }

      public nv.b a(die $$0) {
         ali $$1 = om.s.a($$0, this.b, nv.this.c);
         ali $$2 = om.t.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.b($$0, $$1, $$2));
         ali $$3 = om.u.a($$0, this.b, nv.this.c);
         nv.this.a($$0, $$3);
         return this;
      }

      public nv.b b(die $$0) {
         ali $$1 = om.M.a($$0, this.b, nv.this.c);
         ali $$2 = om.N.a($$0, this.b, nv.this.c);
         ali $$3 = om.O.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.a($$0, $$1, $$2, $$3));
         ali $$4 = om.P.a($$0, this.b, nv.this.c);
         nv.this.a($$0, $$4);
         return this;
      }

      public nv.b c(die $$0) {
         on $$1 = on.p($$0);
         ali $$2 = om.D.a($$0, $$1, nv.this.c);
         ali $$3 = om.E.a($$0, $$1, nv.this.c);
         ali $$4 = om.F.a($$0, $$1, nv.this.c);
         ali $$5 = om.G.a($$0, $$1, nv.this.c);
         ali $$6 = om.H.a($$0, $$1, nv.this.c);
         nv.this.b.accept(nv.a($$0, $$2, $$3, $$4, $$5, $$6));
         ali $$7 = om.I.a($$0, $$1, nv.this.c);
         nv.this.a($$0, $$7);
         return this;
      }

      public nv.b d(die $$0) {
         ali $$1 = om.J.a($$0, this.b, nv.this.c);
         ali $$2 = om.K.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.c($$0, $$1, $$2));
         ali $$3 = om.L.a($$0, this.b, nv.this.c);
         nv.this.a($$0, $$3);
         return this;
      }

      public nv.b e(die $$0) {
         on $$1 = on.p($$0);
         ali $$2 = om.R.a($$0, $$1, nv.this.c);
         ali $$3 = om.Q.a($$0, $$1, nv.this.c);
         ali $$4 = om.T.a($$0, $$1, nv.this.c);
         ali $$5 = om.S.a($$0, $$1, nv.this.c);
         nv.this.b.accept(nv.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public nv.b f(die $$0) {
         ali $$1 = om.V.a($$0, this.b, nv.this.c);
         ali $$2 = om.U.a($$0, this.b, nv.this.c);
         ali $$3 = om.X.a($$0, this.b, nv.this.c);
         ali $$4 = om.W.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public nv.b g(die $$0) {
         ali $$1 = om.Y.a($$0, this.b, nv.this.c);
         ali $$2 = om.Z.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.e($$0, $$1, $$2));
         return this;
      }

      public nv.b h(die $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            die $$1 = this.d.b().get(mc.b.r);
            ali $$2 = om.aa.a($$0, this.b, nv.this.c);
            nv.this.b.accept(nv.c($$0, $$2));
            nv.this.b.accept(nv.c($$1, $$2));
            nv.this.a($$0.j());
            nv.this.c($$1);
            return this;
         }
      }

      public nv.b i(die $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ali $$1 = this.a(om.ab, $$0);
            ali $$2 = this.a(om.ac, $$0);
            nv.this.b.accept(nv.e($$0, $$1, $$2, this.e));
            nv.this.a($$0, $$1);
            return this;
         }
      }

      public nv.b j(die $$0) {
         ali $$1 = this.a(om.af, $$0);
         ali $$2 = this.a(om.ae, $$0);
         ali $$3 = this.a(om.ag, $$0);
         nv.this.b.accept(nv.b($$0, $$1, $$2, $$3));
         nv.this.a($$0, $$2);
         return this;
      }

      private nv.b k(die $$0) {
         op $$1 = nv.this.g.getOrDefault($$0, op.a.get($$0));
         ali $$2 = $$1.a($$0, nv.this.c);
         nv.this.b.accept(nv.c($$0, $$2));
         return this;
      }

      private nv.b l(die $$0) {
         nv.this.i($$0);
         return this;
      }

      private void m(die $$0) {
         if (nv.this.e.contains($$0)) {
            nv.this.k($$0);
         } else {
            nv.this.j($$0);
         }
      }

      private ali a(ol $$0, die $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, nv.this.c));
      }

      public nv.b a(mc $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<nv.b, die> $$2 = nv.h.get($$0x);
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
      nz create(die var1, ali var2, on var3, BiConsumer<ali, Supplier<JsonElement>> var4);
   }

   static record d(ol a, String b) {
   }

   static enum e {
      a,
      b;

      public ol a() {
         return this == a ? om.ap : om.ao;
      }

      public ol b() {
         return this == a ? om.ar : om.aq;
      }
   }

   class f {
      private final on b;

      public f(final on $$0) {
         this.b = $$0;
      }

      public nv.f a(die $$0) {
         on $$1 = this.b.c(oo.d, this.b.a(oo.i));
         ali $$2 = om.j.a($$0, $$1, nv.this.c);
         nv.this.b.accept(nv.d($$0, $$2));
         return this;
      }

      public nv.f b(die $$0) {
         ali $$1 = om.j.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.d($$0, $$1));
         return this;
      }

      public nv.f c(die $$0) {
         ali $$1 = om.j.a($$0, this.b, nv.this.c);
         ali $$2 = om.k.a($$0, this.b, nv.this.c);
         nv.this.b.accept(nv.d($$0, $$1, $$2));
         return this;
      }

      public nv.f d(die $$0) {
         nv.this.b.accept(nv.a($$0, this.b, nv.this.c));
         return this;
      }
   }
}
