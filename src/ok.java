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
   private static final Map<lu.b, BiFunction<dcf, dcf, oh>> g = ImmutableMap.builder()
      .put(lu.b.a, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> d($$0, cyg.a($$1)))
      .put(lu.b.b, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> b(oi.a, $$0, cyg.a($$1)))
      .put(lu.b.d, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> f(oi.a, $$0, cyg.a($$1)))
      .put(lu.b.e, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> a($$0, cyg.a($$1)))
      .put(lu.b.f, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> e($$0, cyg.a($$1)))
      .put(lu.b.g, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> e($$0, cyg.a($$1)))
      .put(lu.b.h, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> f($$0, cyg.a($$1)))
      .put(lu.b.i, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> f($$0, cyg.a($$1)))
      .put(lu.b.k, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> g($$0, cyg.a($$1)))
      .put(lu.b.l, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> a(oi.a, $$0, cyg.a($$1)))
      .put(lu.b.m, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> b($$0, cyg.a($$1)))
      .put(lu.b.n, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> c(oi.c, $$0, cyg.a($$1)))
      .put(lu.b.o, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> e(oi.a, $$0, cyg.a($$1)))
      .put(lu.b.p, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> c($$0, cyg.a($$1)))
      .put(lu.b.q, (BiFunction<dcf, dcf, oh>)($$0, $$1) -> d(oi.b, $$0, cyg.a($$1)))
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
         public void a(akk $$0x, cyj<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lx.a($$0, $$1, cyj.h, $$1, ok.this.d.a($$0)));
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

   protected static void a(oj $$0, coz $$1) {
      lt.a().filter(lu::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(oj $$0, dcf $$1, dcf $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oj $$0, dcf $$1, dcf $$2, @Nullable String $$3, int $$4) {
      om.a(oi.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(oj $$0, List<dcf> $$1, oi $$2, dcf $$3, float $$4, int $$5, String $$6) {
      a($$0, cyo.p, cza::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(oj $$0, List<dcf> $$1, oi $$2, dcf $$3, float $$4, int $$5, String $$6) {
      a($$0, cyo.q, cxu::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cxr> void a(oj $$0, cyo<T> $$1, cxr.a<T> $$2, List<dcf> $$3, oi $$4, dcf $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dcf $$10 : $$3) {
         on.a(cyg.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(oj $$0, cty $$1, oi $$2, cty $$3) {
      op.a(cyg.a(cug.xv), cyg.a($$1), cyg.a(cug.oK), $$2, $$3).a("has_netherite_ingot", a(cug.oK)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(oj $$0, cty $$1, akk $$2) {
      oq.a(cyg.a($$1), cyg.a(awf.bm), cyg.a(awf.bn), oi.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      ol.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(oj $$0, oi $$1, dcf $$2, dcf $$3, String $$4) {
      om.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(oj $$0, dcf $$1, awm<cty> $$2, int $$3) {
      om.a(oi.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oj $$0, dcf $$1, awm<cty> $$2, int $$3) {
      om.a(oi.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dfk.G)).a($$0);
   }

   protected static void c(oj $$0, dcf $$1, dcf $$2) {
      om.a(oi.d, $$1).b(dfk.cv).b($$2).b("chest_boat").b("has_boat", a(awf.aN)).a($$0);
   }

   private static oh d(dcf $$0, cyg $$1) {
      return om.a(oi.c, $$0).a($$1);
   }

   protected static oh a(dcf $$0, cyg $$1) {
      return ol.a(oi.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static oh e(dcf $$0, cyg $$1) {
      int $$2 = $$0 == dfk.fo ? 6 : 3;
      cty $$3 = $$0 == dfk.fo ? cug.ux : cug.pq;
      return ol.a(oi.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static oh f(dcf $$0, cyg $$1) {
      return ol.a(oi.c, $$0).a('#', cug.pq).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(oj $$0, dcf $$1, dcf $$2) {
      c(oi.c, $$1, cyg.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static oh c(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      a($$1, $$2, cyg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static oh a(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static oh b(dcf $$0, cyg $$1) {
      return ol.a(oi.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected static oh c(dcf $$0, cyg $$1) {
      return ol.a(oi.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static oh g(dcf $$0, cyg $$1) {
      return ol.a(oi.b, $$0, 3).c("sign").a('#', $$1).a('X', cug.pq).b("###").b("###").b(" X ");
   }

   protected static void e(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cug.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(oj $$0, List<cty> $$1, List<cty> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cty $$5 = $$1.get($$4);
         cty $$6 = $$2.get($$4);
         om.a(oi.a, $$6)
            .b($$5)
            .a(cyg.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cud::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1).a('#', $$2).a('X', awf.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1).a('#', $$2).a('|', cug.pq).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.a, $$1, 8).a('#', dfk.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dcf)dfk.aQ)).a($$0);
   }

   protected static void j(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.b, $$1, 8)
         .a('#', dfk.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dcf)dfk.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dfk.eY));
   }

   protected static void l(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.a, $$1, 8).a('#', dfk.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dcf)dfk.iA)).a($$0);
   }

   protected static void m(oj $$0, dcf $$1, dcf $$2) {
      om.a(oi.a, $$1, 8).b($$2).a(dfk.I, 4).a(dfk.L, 4).b("concrete_powder").b("has_sand", a((dcf)dfk.I)).b("has_gravel", a((dcf)dfk.L)).a($$0);
   }

   protected static void n(oj $$0, dcf $$1, dcf $$2) {
      om.a(oi.b, $$1).b(dfk.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      d($$1, $$2, cyg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oh d(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      e($$1, $$2, cyg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oh e(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      f($$1, $$2, cyg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ol f(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      b($$1, $$2, cyg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      ol.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ol b(oi $$0, dcf $$1, cyg $$2) {
      return ol.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(oj $$0, oi $$1, dcf $$2, dcf $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oj $$0, oi $$1, dcf $$2, dcf $$3, int $$4) {
      oo.a(cyg.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(oj $$0, dcf $$1, dcf $$2) {
      on.c(cyg.a($$2), oi.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(oj $$0, oi $$1, dcf $$2, oi $$3, dcf $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(oj $$0, oi $$1, dcf $$2, oi $$3, dcf $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(oj $$0, oi $$1, dcf $$2, oi $$3, dcf $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(oj $$0, oi $$1, dcf $$2, oi $$3, dcf $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      om.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akk($$7));
      ol.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akk($$5));
   }

   protected static void a(oj $$0, dcf $$1, awm<cty> $$2) {
      ol.a(oi.i, $$1, 2).a('#', cug.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(oj $$0, dcf $$1, dcf $$2) {
      ol.a(oi.i, $$1, 2).a('#', cug.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cxr> void a(oj $$0, String $$1, cyo<T> $$2, cxr.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cug.sa, cug.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.sc, cug.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.qZ, cug.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.dK, cug.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cug.ra, cug.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.uN, cug.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.pX, cug.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.ug, cug.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cug.uA, cug.uB, 0.35F);
   }

   private static <T extends cxr> void a(oj $$0, String $$1, cyo<T> $$2, cxr.a<T> $$3, int $$4, dcf $$5, dcf $$6, float $$7) {
      on.a(cyg.a($$5), oi.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(oj $$0, coz $$1) {
      ctt.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            om.a(oi.a, $$3).b($$2).b(cug.wz).b(c($$3)).b(b($$2), a((dcf)$$2)).a($$0, a($$3, cug.wz));
         }
      });
   }

   protected static void a(oj $$0, dfi $$1, dfi $$2) {
      ol.a(oi.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dcf)$$2)).a($$0);
   }

   protected static void b(oj $$0, dfi $$1, dfi $$2) {
      ol.a(oi.c, $$1, 4).a('C', $$2).a('R', cug.lH).a('B', cug.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dcf)$$2)).a($$0);
   }

   protected static void a(oj $$0, lu $$1, coz $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<dcf, dcf, oh> $$5 = g.get($$3);
            dcf $$6 = a($$1, $$3);
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

   private static dfi a(lu $$0, lu.b $$1) {
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

   private static an<bq.a> a(dfi $$0) {
      return am.e.a(new bq.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private static an<ce.a> a(de.d $$0, dcf $$1) {
      return a(cp.a.a().a($$1).a($$0));
   }

   protected static an<ce.a> a(dcf $$0) {
      return a(cp.a.a().a($$0));
   }

   protected static an<ce.a> a(awm<cty> $$0) {
      return a(cp.a.a().a($$0));
   }

   private static an<ce.a> a(cp.a... $$0) {
      return a(Arrays.stream($$0).map(cp.a::b).toArray(cp[]::new));
   }

   private static an<ce.a> a(cp... $$0) {
      return am.f.a(new ce.a(Optional.empty(), ce.a.a.b, List.of($$0)));
   }

   protected static String b(dcf $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dcf $$0) {
      return lq.g.b($$0.r()).a();
   }

   protected static String d(dcf $$0) {
      return c($$0);
   }

   protected static String a(dcf $$0, dcf $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dcf $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dcf $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
