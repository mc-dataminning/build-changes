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
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class lr implements ji {
   private final jk.a d;
   private final jk.a e;
   private static final Map<jf.b, BiFunction<cpk, cpk, lp>> f = ImmutableMap.builder()
      .put(jf.b.a, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> c($$0, clx.a($$1)))
      .put(jf.b.b, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> b(lq.a, $$0, clx.a($$1)))
      .put(jf.b.d, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> f(lq.a, $$0, clx.a($$1)))
      .put(jf.b.e, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> a($$0, clx.a($$1)))
      .put(jf.b.f, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> d($$0, clx.a($$1)))
      .put(jf.b.g, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> d($$0, clx.a($$1)))
      .put(jf.b.h, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> e($$0, clx.a($$1)))
      .put(jf.b.i, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> e($$0, clx.a($$1)))
      .put(jf.b.k, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> g($$0, clx.a($$1)))
      .put(jf.b.l, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> a(lq.a, $$0, clx.a($$1)))
      .put(jf.b.m, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> b($$0, clx.a($$1)))
      .put(jf.b.n, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> c(lq.c, $$0, clx.a($$1)))
      .put(jf.b.o, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> e(lq.a, $$0, clx.a($$1)))
      .put(jf.b.p, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> f($$0, clx.a($$1)))
      .put(jf.b.q, (BiFunction<cpk, cpk, lp>)($$0, $$1) -> d(lq.b, $$0, clx.a($$1)))
      .build();

   public lr(jk $$0) {
      this.d = $$0.a(jk.b.a, "recipes");
      this.e = $$0.a(jk.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      Set<aer> $$1 = Sets.newHashSet();
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

   protected CompletableFuture<?> a(jg $$0, aer $$1, ae.a $$2) {
      return ji.a($$0, $$2.c(), this.e.a($$1));
   }

   protected abstract void a(Consumer<lo> var1);

   protected static void a(Consumer<lo> $$0, cdu $$1) {
      je.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(Consumer<lo> $$0, cpk $$1, cpk $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lo> $$0, cpk $$1, cpk $$2, @Nullable String $$3, int $$4) {
      lt.a(lq.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(Consumer<lo> $$0, List<cpk> $$1, lq $$2, cpk $$3, float $$4, int $$5, String $$6) {
      a($$0, cmc.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(Consumer<lo> $$0, List<cpk> $$1, lq $$2, cpk $$3, float $$4, int $$5, String $$6) {
      a($$0, cmc.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(Consumer<lo> $$0, cmc<? extends clj> $$1, List<cpk> $$2, lq $$3, cpk $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cpk $$9 : $$2) {
         lu.a(clx.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(Consumer<lo> $$0, cis $$1, lq $$2, cis $$3) {
      lw.a(clx.a(cja.ww), clx.a($$1), clx.a(cja.nV), $$2, $$3).a("has_netherite_ingot", a(cja.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(Consumer<lo> $$0, cis $$1, aer $$2) {
      lx.a(clx.a($$1), clx.a(apt.aH), clx.a(apt.aI), lq.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      ls.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3, String $$4) {
      lt.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(Consumer<lo> $$0, cpk $$1, aqa<cis> $$2, int $$3) {
      lt.a(lq.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, cpk $$1, aqa<cis> $$2, int $$3) {
      lt.a(lq.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(csm.G)).a($$0);
   }

   protected static void c(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      lt.a(lq.d, $$1).b(csm.cv).b($$2).b("chest_boat").b("has_boat", a(apt.am)).a($$0);
   }

   private static lp c(cpk $$0, clx $$1) {
      return lt.a(lq.c, $$0).a($$1);
   }

   protected static lp a(cpk $$0, clx $$1) {
      return ls.a(lq.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lp d(cpk $$0, clx $$1) {
      int $$2 = $$0 == csm.fo ? 6 : 3;
      cis $$3 = $$0 == csm.fo ? cja.tD : cja.oB;
      return ls.a(lq.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lp e(cpk $$0, clx $$1) {
      return ls.a(lq.c, $$0).a('#', cja.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      c(lq.c, $$1, clx.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lp c(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      a($$1, $$2, clx.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lp a(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lp b(cpk $$0, clx $$1) {
      return ls.a(lq.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lp f(cpk $$0, clx $$1) {
      return ls.a(lq.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lp g(cpk $$0, clx $$1) {
      return ls.a(lq.b, $$0, 3).c("sign").a('#', $$1).a('X', cja.oB).b("###").b("###").b(" X ");
   }

   protected static void e(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cja.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, List<cis> $$1, List<cis> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cis $$5 = $$1.get($$4);
         cis $$6 = $$2.get($$4);
         lt.a(lq.a, $$6)
            .b($$5)
            .a(clx.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cix::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1).a('#', $$2).a('X', apt.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1).a('#', $$2).a('|', cja.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.a, $$1, 8).a('#', csm.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cpk)csm.aQ)).a($$0);
   }

   protected static void j(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.b, $$1, 8)
         .a('#', csm.eZ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cpk)csm.eZ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, csm.eZ));
   }

   protected static void l(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.a, $$1, 8).a('#', csm.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cpk)csm.iA)).a($$0);
   }

   protected static void m(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      lt.a(lq.a, $$1, 8).b($$2).a(csm.I, 4).a(csm.L, 4).b("concrete_powder").b("has_sand", a((cpk)csm.I)).b("has_gravel", a((cpk)csm.L)).a($$0);
   }

   protected static void n(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      lt.a(lq.b, $$1).b(csm.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      d($$1, $$2, clx.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lp d(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      e($$1, $$2, clx.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lp e(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      f($$1, $$2, clx.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ls f(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      b($$1, $$2, clx.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      ls.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ls b(lq $$0, cpk $$1, clx $$2) {
      return ls.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cpk $$2, cpk $$3, int $$4) {
      lv.a(clx.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      lu.c(clx.a($$2), lq.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cpk $$2, lq $$3, cpk $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(Consumer<lo> $$0, lq $$1, cpk $$2, lq $$3, cpk $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(Consumer<lo> $$0, lq $$1, cpk $$2, lq $$3, cpk $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(Consumer<lo> $$0, lq $$1, cpk $$2, lq $$3, cpk $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      lt.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aer($$7));
      ls.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aer($$5));
   }

   protected static void a(Consumer<lo> $$0, cpk $$1, aqa<cis> $$2) {
      ls.a(lq.i, $$1, 2).a('#', cja.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(Consumer<lo> $$0, cpk $$1, cpk $$2) {
      ls.a(lq.i, $$1, 2).a('#', cja.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(Consumer<lo> $$0, String $$1, cmc<? extends clj> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cja.rl, cja.rm, 0.35F);
      a($$0, $$1, $$2, $$3, cja.rn, cja.ro, 0.35F);
      a($$0, $$1, $$2, $$3, cja.ql, cja.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cja.do, cja.ri, 0.1F);
      a($$0, $$1, $$2, $$3, cja.qm, cja.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cja.tT, cja.tU, 0.35F);
      a($$0, $$1, $$2, $$3, cja.pj, cja.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cja.tm, cja.tn, 0.35F);
      a($$0, $$1, $$2, $$3, cja.tG, cja.tH, 0.35F);
   }

   private static void a(Consumer<lo> $$0, String $$1, cmc<? extends clj> $$2, int $$3, cpk $$4, cpk $$5, float $$6) {
      lu.a(clx.a($$4), lq.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(Consumer<lo> $$0) {
      cim.a.get().forEach(($$1, $$2) -> lt.a(lq.a, $$2).b($$1).b(cja.vA).b(c($$2)).b(b($$1), a((cpk)$$1)).a($$0, a($$2, cja.vA)));
   }

   protected static void a(Consumer<lo> $$0, jf $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cpk, cpk, lp> $$4 = f.get($$2);
         cpk $$5 = a($$1, $$2);
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

   private static csl a(jf $$0, jf.b $$1) {
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

   private static bk.a a(csl $$0) {
      return new bk.a(Optional.empty(), $$0, Optional.empty());
   }

   private static bx.a a(cj.d $$0, cpk $$1) {
      return a(bz.a.a().a($$1).a($$0));
   }

   protected static bx.a a(cpk $$0) {
      return a(bz.a.a().a($$0));
   }

   protected static bx.a a(aqa<cis> $$0) {
      return a(bz.a.a().a($$0));
   }

   private static bx.a a(bz.a... $$0) {
      return a(Arrays.stream($$0).flatMap($$0x -> $$0x.b().stream()).toArray(bz[]::new));
   }

   private static bx.a a(bz... $$0) {
      return new bx.a(Optional.empty(), cj.d.c, cj.d.c, cj.d.c, List.of($$0));
   }

   protected static String b(cpk $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cpk $$0) {
      return jb.i.b($$0.k()).a();
   }

   protected static String d(cpk $$0) {
      return c($$0);
   }

   protected static String a(cpk $$0, cpk $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cpk $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cpk $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
