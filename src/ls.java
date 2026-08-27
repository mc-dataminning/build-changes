import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class ls implements jj {
   private final jl.a d;
   private final jl.a e;
   private static final Map<jg.b, BiFunction<cpj, cpj, lq>> f = ImmutableMap.builder()
      .put(jg.b.a, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> c($$0, clw.a($$1)))
      .put(jg.b.b, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> b(lr.a, $$0, clw.a($$1)))
      .put(jg.b.d, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> f(lr.a, $$0, clw.a($$1)))
      .put(jg.b.e, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> a($$0, clw.a($$1)))
      .put(jg.b.f, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> d($$0, clw.a($$1)))
      .put(jg.b.g, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> d($$0, clw.a($$1)))
      .put(jg.b.h, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> e($$0, clw.a($$1)))
      .put(jg.b.i, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> e($$0, clw.a($$1)))
      .put(jg.b.k, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> g($$0, clw.a($$1)))
      .put(jg.b.l, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> a(lr.a, $$0, clw.a($$1)))
      .put(jg.b.m, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> b($$0, clw.a($$1)))
      .put(jg.b.n, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> c(lr.c, $$0, clw.a($$1)))
      .put(jg.b.o, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> e(lr.a, $$0, clw.a($$1)))
      .put(jg.b.p, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> f($$0, clw.a($$1)))
      .put(jg.b.q, (BiFunction<cpj, cpj, lq>)($$0, $$1) -> d(lr.b, $$0, clw.a($$1)))
      .build();

   public ls(jl $$0) {
      this.d = $$0.a(jl.b.a, "recipes");
      this.e = $$0.a(jl.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      Set<aep> $$1 = Sets.newHashSet();
      List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a($$3 -> {
         if (!$$1.add($$3.b())) {
            throw new IllegalStateException("Duplicate recipe " + $$3.b());
         } else {
            $$2.add(jj.a($$0, $$3.a(), this.d.a($$3.b())));
            JsonObject $$4 = $$3.d();
            if ($$4 != null) {
               $$2.add(jj.a($$0, $$4, this.e.a($$3.e())));
            }
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(jh $$0, aep $$1, ae.a $$2) {
      return jj.a($$0, $$2.c(), this.e.a($$1));
   }

   protected abstract void a(Consumer<lp> var1);

   protected static void a(Consumer<lp> $$0, cdt $$1) {
      jf.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(Consumer<lp> $$0, cpj $$1, cpj $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lp> $$0, cpj $$1, cpj $$2, @Nullable String $$3, int $$4) {
      lu.a(lr.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(Consumer<lp> $$0, List<cpj> $$1, lr $$2, cpj $$3, float $$4, int $$5, String $$6) {
      a($$0, cmb.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(Consumer<lp> $$0, List<cpj> $$1, lr $$2, cpj $$3, float $$4, int $$5, String $$6) {
      a($$0, cmb.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(Consumer<lp> $$0, cmb<? extends cli> $$1, List<cpj> $$2, lr $$3, cpj $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cpj $$9 : $$2) {
         lv.a(clw.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(Consumer<lp> $$0, cir $$1, lr $$2, cir $$3) {
      lx.a(clw.a(ciz.ww), clw.a($$1), clw.a(ciz.nV), $$2, $$3).a("has_netherite_ingot", a(ciz.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(Consumer<lp> $$0, cir $$1, aep $$2) {
      ly.a(clw.a($$1), clw.a(apr.aH), clw.a(apr.aI), lr.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      lt.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3, String $$4) {
      lu.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(Consumer<lp> $$0, cpj $$1, apy<cir> $$2, int $$3) {
      lu.a(lr.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lp> $$0, cpj $$1, apy<cir> $$2, int $$3) {
      lu.a(lr.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(csl.G)).a($$0);
   }

   protected static void c(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lu.a(lr.d, $$1).b(csl.cv).b($$2).b("chest_boat").b("has_boat", a(apr.am)).a($$0);
   }

   private static lq c(cpj $$0, clw $$1) {
      return lu.a(lr.c, $$0).a($$1);
   }

   protected static lq a(cpj $$0, clw $$1) {
      return lt.a(lr.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lq d(cpj $$0, clw $$1) {
      int $$2 = $$0 == csl.fo ? 6 : 3;
      cir $$3 = $$0 == csl.fo ? ciz.tD : ciz.oB;
      return lt.a(lr.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lq e(cpj $$0, clw $$1) {
      return lt.a(lr.c, $$0).a('#', ciz.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      c(lr.c, $$1, clw.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lq c(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      a($$1, $$2, clw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lq a(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lq b(cpj $$0, clw $$1) {
      return lt.a(lr.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lq f(cpj $$0, clw $$1) {
      return lt.a(lr.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lq g(cpj $$0, clw $$1) {
      return lt.a(lr.b, $$0, 3).c("sign").a('#', $$1).a('X', ciz.oB).b("###").b("###").b(" X ");
   }

   protected static void e(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', ciz.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lp> $$0, List<cir> $$1, List<cir> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cir $$5 = $$1.get($$4);
         cir $$6 = $$2.get($$4);
         lu.a(lr.a, $$6)
            .b($$5)
            .a(clw.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(ciw::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1).a('#', $$2).a('X', apr.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1).a('#', $$2).a('|', ciz.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.a, $$1, 8).a('#', csl.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cpj)csl.aQ)).a($$0);
   }

   protected static void j(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.b, $$1, 8)
         .a('#', csl.eZ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cpj)csl.eZ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, csl.eZ));
   }

   protected static void l(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.a, $$1, 8).a('#', csl.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cpj)csl.iA)).a($$0);
   }

   protected static void m(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lu.a(lr.a, $$1, 8).b($$2).a(csl.I, 4).a(csl.L, 4).b("concrete_powder").b("has_sand", a((cpj)csl.I)).b("has_gravel", a((cpj)csl.L)).a($$0);
   }

   protected static void n(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lu.a(lr.b, $$1).b(csl.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      d($$1, $$2, clw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lq d(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      e($$1, $$2, clw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lq e(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      f($$1, $$2, clw.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static lt f(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      b($$1, $$2, clw.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      lt.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static lt b(lr $$0, cpj $$1, clw $$2) {
      return lt.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lp> $$0, lr $$1, cpj $$2, cpj $$3, int $$4) {
      lw.a(clw.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lv.c(clw.a($$2), lr.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(Consumer<lp> $$0, lr $$1, cpj $$2, lr $$3, cpj $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(Consumer<lp> $$0, lr $$1, cpj $$2, lr $$3, cpj $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(Consumer<lp> $$0, lr $$1, cpj $$2, lr $$3, cpj $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(Consumer<lp> $$0, lr $$1, cpj $$2, lr $$3, cpj $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      lu.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aep($$7));
      lt.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aep($$5));
   }

   protected static void a(Consumer<lp> $$0, cpj $$1, apy<cir> $$2) {
      lt.a(lr.i, $$1, 2).a('#', ciz.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(Consumer<lp> $$0, cpj $$1, cpj $$2) {
      lt.a(lr.i, $$1, 2).a('#', ciz.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(Consumer<lp> $$0, String $$1, cmb<? extends cli> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, ciz.rl, ciz.rm, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.rn, ciz.ro, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.ql, ciz.qp, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.do, ciz.ri, 0.1F);
      a($$0, $$1, $$2, $$3, ciz.qm, ciz.qq, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.tT, ciz.tU, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.pj, ciz.pk, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.tm, ciz.tn, 0.35F);
      a($$0, $$1, $$2, $$3, ciz.tG, ciz.tH, 0.35F);
   }

   private static void a(Consumer<lp> $$0, String $$1, cmb<? extends cli> $$2, int $$3, cpj $$4, cpj $$5, float $$6) {
      lv.a(clw.a($$4), lr.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(Consumer<lp> $$0) {
      cil.a.get().forEach(($$1, $$2) -> lu.a(lr.a, $$2).b($$1).b(ciz.vA).b(c($$2)).b(b($$1), a((cpj)$$1)).a($$0, a($$2, ciz.vA)));
   }

   protected static void a(Consumer<lp> $$0, jg $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cpj, cpj, lq> $$4 = f.get($$2);
         cpj $$5 = a($$1, $$2);
         if ($$4 != null) {
            lq $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == jg.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == jg.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static csk a(jg $$0, jg.b $$1) {
      if ($$1 == jg.b.b) {
         if (!$$0.b().containsKey(jg.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(jg.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static bk.a a(csk $$0) {
      return new bk.a(ba.a, $$0, cz.a);
   }

   private static bx.a a(cj.d $$0, cpj $$1) {
      return a(bz.a.a().a($$1).a($$0).b());
   }

   protected static bx.a a(cpj $$0) {
      return a(bz.a.a().a($$0).b());
   }

   protected static bx.a a(apy<cir> $$0) {
      return a(bz.a.a().a($$0).b());
   }

   private static bx.a a(bz... $$0) {
      return new bx.a(ba.a, cj.d.e, cj.d.e, cj.d.e, $$0);
   }

   protected static String b(cpj $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cpj $$0) {
      return jc.i.b($$0.k()).a();
   }

   protected static String d(cpj $$0) {
      return c($$0);
   }

   protected static String a(cpj $$0, cpj $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cpj $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cpj $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
