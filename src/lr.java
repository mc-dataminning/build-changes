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

public abstract class lr implements ji {
   private final jk.a d;
   private final jk.a e;
   private static final Map<jf.b, BiFunction<cml, cml, lp>> f = ImmutableMap.builder()
      .put(jf.b.a, (BiFunction<cml, cml, lp>)($$0, $$1) -> c($$0, ciz.a($$1)))
      .put(jf.b.b, (BiFunction<cml, cml, lp>)($$0, $$1) -> b(lq.a, $$0, ciz.a($$1)))
      .put(jf.b.d, (BiFunction<cml, cml, lp>)($$0, $$1) -> f(lq.a, $$0, ciz.a($$1)))
      .put(jf.b.e, (BiFunction<cml, cml, lp>)($$0, $$1) -> a($$0, ciz.a($$1)))
      .put(jf.b.f, (BiFunction<cml, cml, lp>)($$0, $$1) -> d($$0, ciz.a($$1)))
      .put(jf.b.g, (BiFunction<cml, cml, lp>)($$0, $$1) -> d($$0, ciz.a($$1)))
      .put(jf.b.h, (BiFunction<cml, cml, lp>)($$0, $$1) -> e($$0, ciz.a($$1)))
      .put(jf.b.i, (BiFunction<cml, cml, lp>)($$0, $$1) -> e($$0, ciz.a($$1)))
      .put(jf.b.k, (BiFunction<cml, cml, lp>)($$0, $$1) -> g($$0, ciz.a($$1)))
      .put(jf.b.l, (BiFunction<cml, cml, lp>)($$0, $$1) -> a(lq.a, $$0, ciz.a($$1)))
      .put(jf.b.m, (BiFunction<cml, cml, lp>)($$0, $$1) -> b($$0, ciz.a($$1)))
      .put(jf.b.n, (BiFunction<cml, cml, lp>)($$0, $$1) -> c(lq.c, $$0, ciz.a($$1)))
      .put(jf.b.o, (BiFunction<cml, cml, lp>)($$0, $$1) -> e(lq.a, $$0, ciz.a($$1)))
      .put(jf.b.p, (BiFunction<cml, cml, lp>)($$0, $$1) -> f($$0, ciz.a($$1)))
      .put(jf.b.q, (BiFunction<cml, cml, lp>)($$0, $$1) -> d(lq.b, $$0, ciz.a($$1)))
      .build();

   public lr(jk $$0) {
      this.d = $$0.a(jk.b.a, "recipes");
      this.e = $$0.a(jk.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      Set<acq> $$1 = Sets.newHashSet();
      List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a($$3 -> {
         if (!$$1.add($$3.b())) {
            throw new IllegalStateException("Duplicate recipe " + $$3.b());
         } else {
            $$2.add(ji.a($$0, $$3.a(), this.d.a($$3.b())));
            JsonObject $$4 = $$3.d();
            if ($$4 != null) {
               $$2.add(ji.a($$0, $$4, this.e.a($$3.e())));
            }
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(jg $$0, acq $$1, ae.a $$2) {
      return ji.a($$0, $$2.c(), this.e.a($$1));
   }

   protected abstract void a(Consumer<lo> var1);

   protected static void a(Consumer<lo> $$0, caw $$1) {
      je.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(Consumer<lo> $$0, cml $$1, cml $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lo> $$0, cml $$1, cml $$2, @Nullable String $$3, int $$4) {
      lt.a(lq.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(Consumer<lo> $$0, List<cml> $$1, lq $$2, cml $$3, float $$4, int $$5, String $$6) {
      a($$0, cje.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(Consumer<lo> $$0, List<cml> $$1, lq $$2, cml $$3, float $$4, int $$5, String $$6) {
      a($$0, cje.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(Consumer<lo> $$0, cje<? extends cil> $$1, List<cml> $$2, lq $$3, cml $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cml $$9 : $$2) {
         lu.a(ciz.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(Consumer<lo> $$0, cfu $$1, lq $$2, cfu $$3) {
      lw.a(ciz.a(cgc.ww), ciz.a($$1), ciz.a(cgc.nV), $$2, $$3).a("has_netherite_ingot", a(cgc.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(Consumer<lo> $$0, cfu $$1, acq $$2) {
      lx.a(ciz.a($$1), ciz.a(ane.aH), ciz.a(ane.aI), lq.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      ls.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3, String $$4) {
      lt.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(Consumer<lo> $$0, cml $$1, anl<cfu> $$2, int $$3) {
      lt.a(lq.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, cml $$1, anl<cfu> $$2, int $$3) {
      lt.a(lq.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cpo.G)).a($$0);
   }

   protected static void c(Consumer<lo> $$0, cml $$1, cml $$2) {
      lt.a(lq.d, $$1).b(cpo.cv).b($$2).b("chest_boat").b("has_boat", a(ane.am)).a($$0);
   }

   private static lp c(cml $$0, ciz $$1) {
      return lt.a(lq.c, $$0).a($$1);
   }

   protected static lp a(cml $$0, ciz $$1) {
      return ls.a(lq.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lp d(cml $$0, ciz $$1) {
      int $$2 = $$0 == cpo.fo ? 6 : 3;
      cfu $$3 = $$0 == cpo.fo ? cgc.tD : cgc.oB;
      return ls.a(lq.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lp e(cml $$0, ciz $$1) {
      return ls.a(lq.c, $$0).a('#', cgc.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(Consumer<lo> $$0, cml $$1, cml $$2) {
      c(lq.c, $$1, ciz.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lp c(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      a($$1, $$2, ciz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lp a(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lp b(cml $$0, ciz $$1) {
      return ls.a(lq.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lp f(cml $$0, ciz $$1) {
      return ls.a(lq.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lp g(cml $$0, ciz $$1) {
      return ls.a(lq.b, $$0, 3).c("sign").a('#', $$1).a('X', cgc.oB).b("###").b("###").b(" X ");
   }

   protected static void e(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cgc.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, List<cfu> $$1, List<cfu> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cfu $$5 = $$1.get($$4);
         cfu $$6 = $$2.get($$4);
         lt.a(lq.a, $$6)
            .b($$5)
            .a(ciz.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cfz::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1).a('#', $$2).a('X', ane.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1).a('#', $$2).a('|', cgc.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.a, $$1, 8).a('#', cpo.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cml)cpo.aQ)).a($$0);
   }

   protected static void j(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.b, $$1, 8)
         .a('#', cpo.eZ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cml)cpo.eZ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cpo.eZ));
   }

   protected static void l(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.a, $$1, 8).a('#', cpo.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cml)cpo.iA)).a($$0);
   }

   protected static void m(Consumer<lo> $$0, cml $$1, cml $$2) {
      lt.a(lq.a, $$1, 8).b($$2).a(cpo.I, 4).a(cpo.L, 4).b("concrete_powder").b("has_sand", a((cml)cpo.I)).b("has_gravel", a((cml)cpo.L)).a($$0);
   }

   protected static void n(Consumer<lo> $$0, cml $$1, cml $$2) {
      lt.a(lq.b, $$1).b(cpo.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      d($$1, $$2, ciz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lp d(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      e($$1, $$2, ciz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lp e(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      f($$1, $$2, ciz.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ls f(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      b($$1, $$2, ciz.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      ls.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ls b(lq $$0, cml $$1, ciz $$2) {
      return ls.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cml $$2, cml $$3, int $$4) {
      lv.a(ciz.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(Consumer<lo> $$0, cml $$1, cml $$2) {
      lu.c(ciz.a($$2), lq.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cml $$2, lq $$3, cml $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cml $$2, lq $$3, cml $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(Consumer<lo> $$0, lq $$1, cml $$2, lq $$3, cml $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(Consumer<lo> $$0, lq $$1, cml $$2, lq $$3, cml $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      lt.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new acq($$7));
      ls.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new acq($$5));
   }

   protected static void a(Consumer<lo> $$0, cml $$1, anl<cfu> $$2) {
      ls.a(lq.i, $$1, 2).a('#', cgc.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(Consumer<lo> $$0, cml $$1, cml $$2) {
      ls.a(lq.i, $$1, 2).a('#', cgc.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, String $$1, cje<? extends cil> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cgc.rl, cgc.rm, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.rn, cgc.ro, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.ql, cgc.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.do, cgc.ri, 0.1F);
      a($$0, $$1, $$2, $$3, cgc.qm, cgc.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.tT, cgc.tU, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.pj, cgc.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.tm, cgc.tn, 0.35F);
      a($$0, $$1, $$2, $$3, cgc.tG, cgc.tH, 0.35F);
   }

   private static void a(Consumer<lo> $$0, String $$1, cje<? extends cil> $$2, int $$3, cml $$4, cml $$5, float $$6) {
      lu.a(ciz.a($$4), lq.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(Consumer<lo> $$0) {
      cfo.a.get().forEach(($$1, $$2) -> lt.a(lq.a, $$2).b($$1).b(cgc.vA).b(c($$2)).b(b($$1), a((cml)$$1)).a($$0, a($$2, cgc.vA)));
   }

   protected static void a(Consumer<lo> $$0, jf $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cml, cml, lp> $$4 = f.get($$2);
         cml $$5 = a($$1, $$2);
         if ($$4 != null) {
            lp $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == jf.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == jf.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static cpn a(jf $$0, jf.b $$1) {
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

   private static bk.a a(cpn $$0) {
      return new bk.a(ba.a, $$0, cz.a);
   }

   private static bx.a a(cj.d $$0, cml $$1) {
      return a(bz.a.a().a($$1).a($$0).b());
   }

   protected static bx.a a(cml $$0) {
      return a(bz.a.a().a($$0).b());
   }

   protected static bx.a a(anl<cfu> $$0) {
      return a(bz.a.a().a($$0).b());
   }

   private static bx.a a(bz... $$0) {
      return new bx.a(ba.a, cj.d.e, cj.d.e, cj.d.e, $$0);
   }

   protected static String b(cml $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cml $$0) {
      return jb.i.b($$0.k()).a();
   }

   protected static String d(cml $$0) {
      return c($$0);
   }

   protected static String a(cml $$0, cml $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cml $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cml $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
