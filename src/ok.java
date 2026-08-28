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

public abstract class ok implements lx {
   final lz.a d;
   final lz.a e;
   private final CompletableFuture<jl.a> f;
   private static final Map<lu.b, BiFunction<dce, dce, oh>> g = ImmutableMap.builder()
      .put(lu.b.a, (BiFunction<dce, dce, oh>)($$0, $$1) -> d($$0, cyf.a($$1)))
      .put(lu.b.b, (BiFunction<dce, dce, oh>)($$0, $$1) -> b(oi.a, $$0, cyf.a($$1)))
      .put(lu.b.d, (BiFunction<dce, dce, oh>)($$0, $$1) -> f(oi.a, $$0, cyf.a($$1)))
      .put(lu.b.e, (BiFunction<dce, dce, oh>)($$0, $$1) -> a($$0, cyf.a($$1)))
      .put(lu.b.f, (BiFunction<dce, dce, oh>)($$0, $$1) -> e($$0, cyf.a($$1)))
      .put(lu.b.g, (BiFunction<dce, dce, oh>)($$0, $$1) -> e($$0, cyf.a($$1)))
      .put(lu.b.h, (BiFunction<dce, dce, oh>)($$0, $$1) -> f($$0, cyf.a($$1)))
      .put(lu.b.i, (BiFunction<dce, dce, oh>)($$0, $$1) -> f($$0, cyf.a($$1)))
      .put(lu.b.k, (BiFunction<dce, dce, oh>)($$0, $$1) -> g($$0, cyf.a($$1)))
      .put(lu.b.l, (BiFunction<dce, dce, oh>)($$0, $$1) -> a(oi.a, $$0, cyf.a($$1)))
      .put(lu.b.m, (BiFunction<dce, dce, oh>)($$0, $$1) -> b($$0, cyf.a($$1)))
      .put(lu.b.n, (BiFunction<dce, dce, oh>)($$0, $$1) -> c(oi.c, $$0, cyf.a($$1)))
      .put(lu.b.o, (BiFunction<dce, dce, oh>)($$0, $$1) -> e(oi.a, $$0, cyf.a($$1)))
      .put(lu.b.p, (BiFunction<dce, dce, oh>)($$0, $$1) -> c($$0, cyf.a($$1)))
      .put(lu.b.q, (BiFunction<dce, dce, oh>)($$0, $$1) -> d(oi.b, $$0, cyf.a($$1)))
      .build();

   public ok(lz $$0, CompletableFuture<jl.a> $$1) {
      this.d = $$0.a(lz.b.a, "recipes");
      this.e = $$0.a(lz.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(lv $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final lv $$0, final jl.a $$1) {
      final Set<akk> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new oj() {
         @Override
         public void a(akk $$0x, cyi<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lx.a($$0, $$1, cyi.h, $$1, ok.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(lx.a($$0, $$1, ae.a, $$2.b(), ok.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(oh.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(lv $$0, jl.a $$1, af $$2) {
      return lx.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(oj var1);

   protected static void a(oj $$0, coy $$1) {
      lt.a().filter(lu::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(oj $$0, dce $$1, dce $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oj $$0, dce $$1, dce $$2, @Nullable String $$3, int $$4) {
      om.a(oi.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(oj $$0, List<dce> $$1, oi $$2, dce $$3, float $$4, int $$5, String $$6) {
      a($$0, cyn.p, cyz::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(oj $$0, List<dce> $$1, oi $$2, dce $$3, float $$4, int $$5, String $$6) {
      a($$0, cyn.q, cxt::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cxq> void a(oj $$0, cyn<T> $$1, cxq.a<T> $$2, List<dce> $$3, oi $$4, dce $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dce $$10 : $$3) {
         on.a(cyf.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(oj $$0, ctx $$1, oi $$2, ctx $$3) {
      op.a(cyf.a(cuf.xv), cyf.a($$1), cyf.a(cuf.oK), $$2, $$3).a("has_netherite_ingot", a(cuf.oK)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(oj $$0, ctx $$1, akk $$2) {
      oq.a(cyf.a($$1), cyf.a(awf.bm), cyf.a(awf.bn), oi.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(oj $$0, oi $$1, dce $$2, dce $$3) {
      ol.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(oj $$0, oi $$1, dce $$2, dce $$3, String $$4) {
      om.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(oj $$0, oi $$1, dce $$2, dce $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(oj $$0, dce $$1, awm<ctx> $$2, int $$3) {
      om.a(oi.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oj $$0, dce $$1, awm<ctx> $$2, int $$3) {
      om.a(oi.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dfj.G)).a($$0);
   }

   protected static void c(oj $$0, dce $$1, dce $$2) {
      om.a(oi.d, $$1).b(dfj.cv).b($$2).b("chest_boat").b("has_boat", a(awf.aN)).a($$0);
   }

   private static oh d(dce $$0, cyf $$1) {
      return om.a(oi.c, $$0).a($$1);
   }

   protected static oh a(dce $$0, cyf $$1) {
      return ol.a(oi.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static oh e(dce $$0, cyf $$1) {
      int $$2 = $$0 == dfj.fo ? 6 : 3;
      ctx $$3 = $$0 == dfj.fo ? cuf.ux : cuf.pq;
      return ol.a(oi.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static oh f(dce $$0, cyf $$1) {
      return ol.a(oi.c, $$0).a('#', cuf.pq).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(oj $$0, dce $$1, dce $$2) {
      c(oi.c, $$1, cyf.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static oh c(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(oj $$0, oi $$1, dce $$2, dce $$3) {
      a($$1, $$2, cyf.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static oh a(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static oh b(dce $$0, cyf $$1) {
      return ol.a(oi.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected static oh c(dce $$0, cyf $$1) {
      return ol.a(oi.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static oh g(dce $$0, cyf $$1) {
      return ol.a(oi.b, $$0, 3).c("sign").a('#', $$1).a('X', cuf.pq).b("###").b("###").b(" X ");
   }

   protected static void e(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cuf.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(oj $$0, List<ctx> $$1, List<ctx> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         ctx $$5 = $$1.get($$4);
         ctx $$6 = $$2.get($$4);
         om.a(oi.a, $$6)
            .b($$5)
            .a(cyf.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cuc::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1).a('#', $$2).a('X', awf.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1).a('#', $$2).a('|', cuf.pq).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.a, $$1, 8).a('#', dfj.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dce)dfj.aQ)).a($$0);
   }

   protected static void j(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.b, $$1, 8)
         .a('#', dfj.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dce)dfj.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dfj.eY));
   }

   protected static void l(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.a, $$1, 8).a('#', dfj.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dce)dfj.iA)).a($$0);
   }

   protected static void m(oj $$0, dce $$1, dce $$2) {
      om.a(oi.a, $$1, 8).b($$2).a(dfj.I, 4).a(dfj.L, 4).b("concrete_powder").b("has_sand", a((dce)dfj.I)).b("has_gravel", a((dce)dfj.L)).a($$0);
   }

   protected static void n(oj $$0, dce $$1, dce $$2) {
      om.a(oi.b, $$1).b(dfj.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(oj $$0, oi $$1, dce $$2, dce $$3) {
      d($$1, $$2, cyf.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oh d(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(oj $$0, oi $$1, dce $$2, dce $$3) {
      e($$1, $$2, cyf.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oh e(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(oj $$0, oi $$1, dce $$2, dce $$3) {
      f($$1, $$2, cyf.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ol f(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(oj $$0, oi $$1, dce $$2, dce $$3) {
      b($$1, $$2, cyf.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(oj $$0, oi $$1, dce $$2, dce $$3) {
      ol.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ol b(oi $$0, dce $$1, cyf $$2) {
      return ol.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(oj $$0, oi $$1, dce $$2, dce $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oj $$0, oi $$1, dce $$2, dce $$3, int $$4) {
      oo.a(cyf.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(oj $$0, dce $$1, dce $$2) {
      on.c(cyf.a($$2), oi.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(oj $$0, oi $$1, dce $$2, oi $$3, dce $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(oj $$0, oi $$1, dce $$2, oi $$3, dce $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(oj $$0, oi $$1, dce $$2, oi $$3, dce $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(oj $$0, oi $$1, dce $$2, oi $$3, dce $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      om.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akk($$7));
      ol.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akk($$5));
   }

   protected static void a(oj $$0, dce $$1, awm<ctx> $$2) {
      ol.a(oi.i, $$1, 2).a('#', cuf.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(oj $$0, dce $$1, dce $$2) {
      ol.a(oi.i, $$1, 2).a('#', cuf.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cxq> void a(oj $$0, String $$1, cyn<T> $$2, cxq.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cuf.sa, cuf.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.sc, cuf.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.qZ, cuf.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.dK, cuf.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cuf.ra, cuf.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.uN, cuf.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.pX, cuf.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.ug, cuf.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cuf.uA, cuf.uB, 0.35F);
   }

   private static <T extends cxq> void a(oj $$0, String $$1, cyn<T> $$2, cxq.a<T> $$3, int $$4, dce $$5, dce $$6, float $$7) {
      on.a(cyf.a($$5), oi.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(oj $$0, coy $$1) {
      cts.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            om.a(oi.a, $$3).b($$2).b(cuf.wz).b(c($$3)).b(b($$2), a((dce)$$2)).a($$0, a($$3, cuf.wz));
         }
      });
   }

   protected static void a(oj $$0, dfh $$1, dfh $$2) {
      ol.a(oi.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dce)$$2)).a($$0);
   }

   protected static void b(oj $$0, dfh $$1, dfh $$2) {
      ol.a(oi.c, $$1, 4).a('C', $$2).a('R', cuf.lH).a('B', cuf.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dce)$$2)).a($$0);
   }

   protected static void a(oj $$0, lu $$1, coy $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<dce, dce, oh> $$5 = g.get($$3);
            dce $$6 = a($$1, $$3);
            if ($$5 != null) {
               oh $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lu.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lu.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dfh a(lu $$0, lu.b $$1) {
      if ($$1 == lu.b.b) {
         if (!$$0.b().containsKey(lu.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lu.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bq.a> a(dfh $$0) {
      return am.e.a(new bq.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private static an<ce.a> a(de.d $$0, dce $$1) {
      return a(cp.a.a().a($$1).a($$0));
   }

   protected static an<ce.a> a(dce $$0) {
      return a(cp.a.a().a($$0));
   }

   protected static an<ce.a> a(awm<ctx> $$0) {
      return a(cp.a.a().a($$0));
   }

   private static an<ce.a> a(cp.a... $$0) {
      return a(Arrays.stream($$0).map(cp.a::b).toArray(cp[]::new));
   }

   private static an<ce.a> a(cp... $$0) {
      return am.f.a(new ce.a(Optional.empty(), ce.a.a.b, List.of($$0)));
   }

   protected static String b(dce $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dce $$0) {
      return lq.g.b($$0.r()).a();
   }

   protected static String d(dce $$0) {
      return c($$0);
   }

   protected static String a(dce $$0, dce $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dce $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dce $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
