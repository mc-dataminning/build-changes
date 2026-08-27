import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public abstract class oi implements lo {
   final lq.a d;
   final lq.a e;
   private final CompletableFuture<jc.a> f;
   private static final Map<ll.b, BiFunction<dbz, dbz, of>> g = ImmutableMap.builder()
      .put(ll.b.a, (BiFunction<dbz, dbz, of>)($$0, $$1) -> c($$0, cyv.a($$1)))
      .put(ll.b.b, (BiFunction<dbz, dbz, of>)($$0, $$1) -> b(og.a, $$0, cyv.a($$1)))
      .put(ll.b.d, (BiFunction<dbz, dbz, of>)($$0, $$1) -> f(og.a, $$0, cyv.a($$1)))
      .put(ll.b.e, (BiFunction<dbz, dbz, of>)($$0, $$1) -> a($$0, cyv.a($$1)))
      .put(ll.b.f, (BiFunction<dbz, dbz, of>)($$0, $$1) -> d($$0, cyv.a($$1)))
      .put(ll.b.g, (BiFunction<dbz, dbz, of>)($$0, $$1) -> d($$0, cyv.a($$1)))
      .put(ll.b.h, (BiFunction<dbz, dbz, of>)($$0, $$1) -> e($$0, cyv.a($$1)))
      .put(ll.b.i, (BiFunction<dbz, dbz, of>)($$0, $$1) -> e($$0, cyv.a($$1)))
      .put(ll.b.k, (BiFunction<dbz, dbz, of>)($$0, $$1) -> g($$0, cyv.a($$1)))
      .put(ll.b.l, (BiFunction<dbz, dbz, of>)($$0, $$1) -> a(og.a, $$0, cyv.a($$1)))
      .put(ll.b.m, (BiFunction<dbz, dbz, of>)($$0, $$1) -> b($$0, cyv.a($$1)))
      .put(ll.b.n, (BiFunction<dbz, dbz, of>)($$0, $$1) -> c(og.c, $$0, cyv.a($$1)))
      .put(ll.b.o, (BiFunction<dbz, dbz, of>)($$0, $$1) -> e(og.a, $$0, cyv.a($$1)))
      .put(ll.b.p, (BiFunction<dbz, dbz, of>)($$0, $$1) -> f($$0, cyv.a($$1)))
      .put(ll.b.q, (BiFunction<dbz, dbz, of>)($$0, $$1) -> d(og.b, $$0, cyv.a($$1)))
      .build();

   public oi(lq $$0, CompletableFuture<jc.a> $$1) {
      this.d = $$0.a(lq.b.a, "recipes");
      this.e = $$0.a(lq.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(lm $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final lm $$0, final jc.a $$1) {
      final Set<akt> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new oh() {
         @Override
         public void a(akt $$0x, cza<?> $$1x, @Nullable ag $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lo.a($$0, $$1, cza.h, $$1, oi.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(lo.a($$0, $$1, af.a, $$2.b(), oi.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public af.a a() {
            return af.a.b().a(of.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(lm $$0, jc.a $$1, ag $$2) {
      return lo.a($$0, $$1, af.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(oh var1);

   protected static void a(oh $$0, cop $$1) {
      lk.a().filter(ll::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(oh $$0, dbz $$1, dbz $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oh $$0, dbz $$1, dbz $$2, @Nullable String $$3, int $$4) {
      ok.a(og.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(oh $$0, List<dbz> $$1, og $$2, dbz $$3, float $$4, int $$5, String $$6) {
      a($$0, cze.q, czp::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(oh $$0, List<dbz> $$1, og $$2, dbz $$3, float $$4, int $$5, String $$6) {
      a($$0, cze.r, cyk::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cyh> void a(oh $$0, cze<T> $$1, cyh.a<T> $$2, List<dbz> $$3, og $$4, dbz $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dbz $$10 : $$3) {
         ol.a(cyv.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(oh $$0, cuc $$1, og $$2, cuc $$3) {
      on.a(cyv.a(cuk.zf), cyv.a($$1), cyv.a(cuk.qc), $$2, $$3).a("has_netherite_ingot", a(cuk.qc)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(oh $$0, cuc $$1, akt $$2) {
      oo.a(cyv.a($$1), cyv.a(awm.bn), cyv.a(awm.bo), og.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(oh $$0, og $$1, dbz $$2, dbz $$3) {
      oj.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(oh $$0, og $$1, dbz $$2, dbz $$3, String $$4) {
      ok.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(oh $$0, og $$1, dbz $$2, dbz $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(oh $$0, dbz $$1, awt<cuc> $$2, int $$3) {
      ok.a(og.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oh $$0, dbz $$1, awt<cuc> $$2, int $$3) {
      ok.a(og.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oh $$0, dbz $$1, dbz $$2, int $$3) {
      ok.a(og.a, $$1, $$3).b($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dfe.al)).a($$0);
   }

   protected static void c(oh $$0, dbz $$1, dbz $$2) {
      ok.a(og.d, $$1).b(dfe.dg).b($$2).b("chest_boat").b("has_boat", a(awm.aO)).a($$0);
   }

   private static of c(dbz $$0, cyv $$1) {
      return ok.a(og.c, $$0).a($$1);
   }

   protected static of a(dbz $$0, cyv $$1) {
      return oj.a(og.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static of d(dbz $$0, cyv $$1) {
      int $$2 = $$0 == dfe.gg ? 6 : 3;
      cuc $$3 = $$0 == dfe.gg ? cuk.wi : cuk.qI;
      return oj.a(og.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static of e(dbz $$0, cyv $$1) {
      return oj.a(og.c, $$0).a('#', cuk.qI).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(oh $$0, dbz $$1, dbz $$2) {
      c(og.c, $$1, cyv.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static of c(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(oh $$0, og $$1, dbz $$2, dbz $$3) {
      a($$1, $$2, cyv.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static of a(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static of b(dbz $$0, cyv $$1) {
      return oj.a(og.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static of f(dbz $$0, cyv $$1) {
      return oj.a(og.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static of g(dbz $$0, cyv $$1) {
      return oj.a(og.b, $$0, 3).c("sign").a('#', $$1).a('X', cuk.qI).b("###").b("###").b(" X ");
   }

   protected static void e(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cuk.hf).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(oh $$0, List<cuc> $$1, List<cuc> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cuc $$5 = $$1.get($$4);
         cuc $$6 = $$2.get($$4);
         ok.a(og.a, $$6)
            .b($$5)
            .a(cyv.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cuh::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1).a('#', $$2).a('X', awm.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1).a('#', $$2).a('|', cuk.qI).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.a, $$1, 8).a('#', dfe.by).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dbz)dfe.by)).a($$0);
   }

   protected static void j(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.b, $$1, 8)
         .a('#', dfe.fQ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dbz)dfe.fQ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dfe.fQ));
   }

   protected static void l(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.a, $$1, 8).a('#', dfe.ju).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dbz)dfe.ju)).a($$0);
   }

   protected static void m(oh $$0, dbz $$1, dbz $$2) {
      ok.a(og.a, $$1, 8).b($$2).a(dfe.an, 4).a(dfe.ar, 4).b("concrete_powder").b("has_sand", a((dbz)dfe.an)).b("has_gravel", a((dbz)dfe.ar)).a($$0);
   }

   protected static void n(oh $$0, dbz $$1, dbz $$2) {
      ok.a(og.b, $$1).b(dfe.qW).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(oh $$0, og $$1, dbz $$2, dbz $$3) {
      d($$1, $$2, cyv.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static of d(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(oh $$0, og $$1, dbz $$2, dbz $$3) {
      e($$1, $$2, cyv.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static of e(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(oh $$0, og $$1, dbz $$2, dbz $$3) {
      f($$1, $$2, cyv.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static oj f(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(oh $$0, og $$1, dbz $$2, dbz $$3) {
      b($$1, $$2, cyv.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(oh $$0, og $$1, dbz $$2, dbz $$3) {
      oj.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static oj b(og $$0, dbz $$1, cyv $$2) {
      return oj.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(oh $$0, og $$1, dbz $$2, dbz $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oh $$0, og $$1, dbz $$2, dbz $$3, int $$4) {
      om.a(cyv.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   protected static void b(oh $$0, og $$1, dbz $$2, dbz $$3, int $$4) {
      om.b(cyv.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_poisonous_potato_cutting");
   }

   protected static void a(oh $$0, cuh $$1, dbz $$2, cuh $$3, float $$4) {
      a($$0, $$1, $$2, cyv.a($$3), $$4);
   }

   protected static void a(oh $$0, cuh $$1, dbz $$2, dbz $$3, float $$4) {
      a($$0, $$1, $$2, cyv.a($$3), $$4);
   }

   protected static void a(oh $$0, cuh $$1, dbz $$2, cyv $$3, float $$4) {
      $$0.a(new akt(a($$1)), new cyz(cyv.a($$2), $$3, $$1, 0.1F, (int)($$4 * 100.0F)), null);
   }

   private static void p(oh $$0, dbz $$1, dbz $$2) {
      ol.c(cyv.a($$2), og.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(oh $$0, og $$1, dbz $$2, og $$3, dbz $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(oh $$0, og $$1, dbz $$2, og $$3, dbz $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(oh $$0, og $$1, dbz $$2, og $$3, dbz $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(oh $$0, og $$1, dbz $$2, og $$3, dbz $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      ok.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akt($$7));
      oj.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akt($$5));
   }

   protected static void a(oh $$0, dbz $$1, awt<cuc> $$2) {
      oj.a(og.i, $$1, 2).a('#', cuk.pO).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(oh $$0, dbz $$1, dbz $$2) {
      oj.a(og.i, $$1, 2).a('#', cuk.pO).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cyh> void a(oh $$0, String $$1, cze<T> $$2, cyh.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cuk.tx, cuk.ty, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.tz, cuk.tA, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.sw, cuk.sA, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.eS, cuk.tu, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cuk.sx, cuk.sB, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.wy, cuk.wz, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.rs, cuk.rt, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.vI, cuk.vJ, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.vM, cuk.vL, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.vN, cuk.vO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuk.wl, cuk.wm, 0.35F);
   }

   private static <T extends cyh> void a(oh $$0, String $$1, cze<T> $$2, cyh.a<T> $$3, int $$4, dbz $$5, dbz $$6, float $$7) {
      ol.a(cyv.a($$5), og.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(oh $$0, cop $$1) {
      ctw.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            ok.a(og.a, $$3).b($$2).b(cuk.yj).b(c($$3)).b(b($$2), a((dbz)$$2)).a($$0, a($$3, cuk.yj));
         }
      });
   }

   protected static void a(oh $$0, dfc $$1, dfc $$2) {
      oj.a(og.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dbz)$$2)).a($$0);
   }

   protected static void b(oh $$0, dfc $$1, dfc $$2) {
      oj.a(og.c, $$1, 4).a('C', $$2).a('R', cuk.mW).a('B', cuk.tD).b(" C ").b("CBC").b(" R ").b(b($$2), a((dbz)$$2)).a($$0);
   }

   protected static void a(oh $$0, ll $$1, cop $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<dbz, dbz, of> $$5 = g.get($$3);
            dbz $$6 = a($$1, $$3);
            if ($$5 != null) {
               of $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == ll.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == ll.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dfc a(ll $$0, ll.b $$1) {
      if ($$1 == ll.b.b) {
         if (!$$0.b().containsKey(ll.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(ll.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<bo.a> a(dfc $$0) {
      return an.e.a(new bo.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static ao<cc.a> a(cu.d $$0, dbz $$1) {
      return a(ci.a.a().a($$1).a($$0));
   }

   protected static ao<cc.a> a(dbz $$0) {
      return a(ci.a.a().a($$0));
   }

   protected static ao<cc.a> a(awt<cuc> $$0) {
      return a(ci.a.a().a($$0));
   }

   private static ao<cc.a> a(ci.a... $$0) {
      return a(Arrays.stream($$0).map(ci.a::b).toArray(ci[]::new));
   }

   private static ao<cc.a> a(ci... $$0) {
      return an.f.a(new cc.a(Optional.empty(), cc.a.a.b, List.of($$0)));
   }

   protected static String b(dbz $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dbz $$0) {
      return lh.h.b($$0.q()).a();
   }

   protected static String d(dbz $$0) {
      return c($$0);
   }

   protected static String a(dbz $$0, dbz $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dbz $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dbz $$0) {
      return c($$0) + "_from_blasting";
   }

   protected static String a(cuh $$0) {
      cuc $$1 = $$0.f();
      cwr $$2 = $$0.a(ke.E);
      String $$3 = "_from_potato_refinement";
      return $$2 != null ? c($$1) + "_with_" + a($$2) + "_from_potato_refinement" : c($$1) + "_from_potato_refinement";
   }

   private static String a(cwr $$0) {
      return new akt($$0.f().get().g()).a();
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
