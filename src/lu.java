import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public abstract class lu implements ji {
   final jk.a d;
   final jk.a e;
   private static final Map<jf.b, BiFunction<cqa, cqa, lr>> f = ImmutableMap.builder()
      .put(jf.b.a, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> c($$0, cmm.a($$1)))
      .put(jf.b.b, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> b(ls.a, $$0, cmm.a($$1)))
      .put(jf.b.d, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> f(ls.a, $$0, cmm.a($$1)))
      .put(jf.b.e, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> a($$0, cmm.a($$1)))
      .put(jf.b.f, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> d($$0, cmm.a($$1)))
      .put(jf.b.g, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> d($$0, cmm.a($$1)))
      .put(jf.b.h, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> e($$0, cmm.a($$1)))
      .put(jf.b.i, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> e($$0, cmm.a($$1)))
      .put(jf.b.k, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> g($$0, cmm.a($$1)))
      .put(jf.b.l, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> a(ls.a, $$0, cmm.a($$1)))
      .put(jf.b.m, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> b($$0, cmm.a($$1)))
      .put(jf.b.n, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> c(ls.c, $$0, cmm.a($$1)))
      .put(jf.b.o, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> e(ls.a, $$0, cmm.a($$1)))
      .put(jf.b.p, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> f($$0, cmm.a($$1)))
      .put(jf.b.q, (BiFunction<cqa, cqa, lr>)($$0, $$1) -> d(ls.b, $$0, cmm.a($$1)))
      .build();

   public lu(jk $$0) {
      this.d = $$0.a(jk.b.a, "recipes");
      this.e = $$0.a(jk.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final jg $$0) {
      final Set<aez> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new lt() {
         @Override
         public void a(lq $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(ji.a($$0, $$0.a(), lu.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(ji.a($$0, $$2, lu.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(lr.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(jg $$0, af $$1) {
      return ji.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(lt var1);

   protected static void a(lt $$0, cei $$1) {
      je.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(lt $$0, cqa $$1, cqa $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lt $$0, cqa $$1, cqa $$2, @Nullable String $$3, int $$4) {
      lw.a(ls.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(lt $$0, List<cqa> $$1, ls $$2, cqa $$3, float $$4, int $$5, String $$6) {
      a($$0, cms.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(lt $$0, List<cqa> $$1, ls $$2, cqa $$3, float $$4, int $$5, String $$6) {
      a($$0, cms.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(lt $$0, cms<? extends clx> $$1, List<cqa> $$2, ls $$3, cqa $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cqa $$9 : $$2) {
         lx.a(cmm.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(lt $$0, cjg $$1, ls $$2, cjg $$3) {
      lz.a(cmm.a(cjo.ww), cmm.a($$1), cmm.a(cjo.nV), $$2, $$3).a("has_netherite_ingot", a(cjo.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(lt $$0, cjg $$1, aez $$2) {
      ma.a(cmm.a($$1), cmm.a(aqd.aH), cmm.a(aqd.aI), ls.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      lv.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(lt $$0, ls $$1, cqa $$2, cqa $$3, String $$4) {
      lw.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(lt $$0, cqa $$1, aqk<cjg> $$2, int $$3) {
      lw.a(ls.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lt $$0, cqa $$1, aqk<cjg> $$2, int $$3) {
      lw.a(ls.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cte.G)).a($$0);
   }

   protected static void c(lt $$0, cqa $$1, cqa $$2) {
      lw.a(ls.d, $$1).b(cte.cv).b($$2).b("chest_boat").b("has_boat", a(aqd.am)).a($$0);
   }

   private static lr c(cqa $$0, cmm $$1) {
      return lw.a(ls.c, $$0).a($$1);
   }

   protected static lr a(cqa $$0, cmm $$1) {
      return lv.a(ls.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lr d(cqa $$0, cmm $$1) {
      int $$2 = $$0 == cte.fo ? 6 : 3;
      cjg $$3 = $$0 == cte.fo ? cjo.tD : cjo.oB;
      return lv.a(ls.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lr e(cqa $$0, cmm $$1) {
      return lv.a(ls.c, $$0).a('#', cjo.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(lt $$0, cqa $$1, cqa $$2) {
      c(ls.c, $$1, cmm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lr c(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      a($$1, $$2, cmm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lr a(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lr b(cqa $$0, cmm $$1) {
      return lv.a(ls.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lr f(cqa $$0, cmm $$1) {
      return lv.a(ls.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lr g(cqa $$0, cmm $$1) {
      return lv.a(ls.b, $$0, 3).c("sign").a('#', $$1).a('X', cjo.oB).b("###").b("###").b(" X ");
   }

   protected static void e(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cjo.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(lt $$0, List<cjg> $$1, List<cjg> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cjg $$5 = $$1.get($$4);
         cjg $$6 = $$2.get($$4);
         lw.a(ls.a, $$6)
            .b($$5)
            .a(cmm.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cjl::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1).a('#', $$2).a('X', aqd.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1).a('#', $$2).a('|', cjo.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.a, $$1, 8).a('#', cte.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cqa)cte.aQ)).a($$0);
   }

   protected static void j(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.b, $$1, 8)
         .a('#', cte.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cqa)cte.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cte.eY));
   }

   protected static void l(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.a, $$1, 8).a('#', cte.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cqa)cte.iA)).a($$0);
   }

   protected static void m(lt $$0, cqa $$1, cqa $$2) {
      lw.a(ls.a, $$1, 8).b($$2).a(cte.I, 4).a(cte.L, 4).b("concrete_powder").b("has_sand", a((cqa)cte.I)).b("has_gravel", a((cqa)cte.L)).a($$0);
   }

   protected static void n(lt $$0, cqa $$1, cqa $$2) {
      lw.a(ls.b, $$1).b(cte.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      d($$1, $$2, cmm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lr d(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      e($$1, $$2, cmm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lr e(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      f($$1, $$2, cmm.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static lv f(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      b($$1, $$2, cmm.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      lv.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static lv b(ls $$0, cqa $$1, cmm $$2) {
      return lv.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(lt $$0, ls $$1, cqa $$2, cqa $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lt $$0, ls $$1, cqa $$2, cqa $$3, int $$4) {
      ly.a(cmm.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(lt $$0, cqa $$1, cqa $$2) {
      lx.c(cmm.a($$2), ls.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(lt $$0, ls $$1, cqa $$2, ls $$3, cqa $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(lt $$0, ls $$1, cqa $$2, ls $$3, cqa $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(lt $$0, ls $$1, cqa $$2, ls $$3, cqa $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(lt $$0, ls $$1, cqa $$2, ls $$3, cqa $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      lw.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aez($$7));
      lv.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aez($$5));
   }

   protected static void a(lt $$0, cqa $$1, aqk<cjg> $$2) {
      lv.a(ls.i, $$1, 2).a('#', cjo.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(lt $$0, cqa $$1, cqa $$2) {
      lv.a(ls.i, $$1, 2).a('#', cjo.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(lt $$0, String $$1, cms<? extends clx> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cjo.rl, cjo.rm, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.rn, cjo.ro, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.ql, cjo.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.do, cjo.ri, 0.1F);
      a($$0, $$1, $$2, $$3, cjo.qm, cjo.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.tT, cjo.tU, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.pj, cjo.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.tm, cjo.tn, 0.35F);
      a($$0, $$1, $$2, $$3, cjo.tG, cjo.tH, 0.35F);
   }

   private static void a(lt $$0, String $$1, cms<? extends clx> $$2, int $$3, cqa $$4, cqa $$5, float $$6) {
      lx.a(cmm.a($$4), ls.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(lt $$0) {
      cja.a.get().forEach(($$1, $$2) -> lw.a(ls.a, $$2).b($$1).b(cjo.vA).b(c($$2)).b(b($$1), a((cqa)$$1)).a($$0, a($$2, cjo.vA)));
   }

   protected static void a(lt $$0, jf $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cqa, cqa, lr> $$4 = f.get($$2);
         cqa $$5 = a($$1, $$2);
         if ($$4 != null) {
            lr $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == jf.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == jf.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static ctc a(jf $$0, jf.b $$1) {
      if ($$1 == jf.b.b) {
         if (!$$0.b().containsKey(jf.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(jf.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static am<bm.a> a(ctc $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, cqa $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(cqa $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(aqk<cjg> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(cqa $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cqa $$0) {
      return jb.i.b($$0.k()).a();
   }

   protected static String d(cqa $$0) {
      return c($$0);
   }

   protected static String a(cqa $$0, cqa $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cqa $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cqa $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
