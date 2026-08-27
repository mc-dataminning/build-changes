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

public abstract class mx implements kj {
   final kl.a d;
   final kl.a e;
   private static final Map<kg.b, BiFunction<cse, cse, mu>> f = ImmutableMap.builder()
      .put(kg.b.a, (BiFunction<cse, cse, mu>)($$0, $$1) -> c($$0, coq.a($$1)))
      .put(kg.b.b, (BiFunction<cse, cse, mu>)($$0, $$1) -> b(mv.a, $$0, coq.a($$1)))
      .put(kg.b.d, (BiFunction<cse, cse, mu>)($$0, $$1) -> f(mv.a, $$0, coq.a($$1)))
      .put(kg.b.e, (BiFunction<cse, cse, mu>)($$0, $$1) -> a($$0, coq.a($$1)))
      .put(kg.b.f, (BiFunction<cse, cse, mu>)($$0, $$1) -> d($$0, coq.a($$1)))
      .put(kg.b.g, (BiFunction<cse, cse, mu>)($$0, $$1) -> d($$0, coq.a($$1)))
      .put(kg.b.h, (BiFunction<cse, cse, mu>)($$0, $$1) -> e($$0, coq.a($$1)))
      .put(kg.b.i, (BiFunction<cse, cse, mu>)($$0, $$1) -> e($$0, coq.a($$1)))
      .put(kg.b.k, (BiFunction<cse, cse, mu>)($$0, $$1) -> g($$0, coq.a($$1)))
      .put(kg.b.l, (BiFunction<cse, cse, mu>)($$0, $$1) -> a(mv.a, $$0, coq.a($$1)))
      .put(kg.b.m, (BiFunction<cse, cse, mu>)($$0, $$1) -> b($$0, coq.a($$1)))
      .put(kg.b.n, (BiFunction<cse, cse, mu>)($$0, $$1) -> c(mv.c, $$0, coq.a($$1)))
      .put(kg.b.o, (BiFunction<cse, cse, mu>)($$0, $$1) -> e(mv.a, $$0, coq.a($$1)))
      .put(kg.b.p, (BiFunction<cse, cse, mu>)($$0, $$1) -> f($$0, coq.a($$1)))
      .put(kg.b.q, (BiFunction<cse, cse, mu>)($$0, $$1) -> d(mv.b, $$0, coq.a($$1)))
      .build();

   public mx(kl $$0) {
      this.d = $$0.a(kl.b.a, "recipes");
      this.e = $$0.a(kl.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final kh $$0) {
      final Set<agm> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new mw() {
         @Override
         public void a(mt $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(kj.a($$0, $$0.a(), mx.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(kj.a($$0, $$2, mx.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(mu.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kh $$0, af $$1) {
      return kj.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(mw var1);

   protected static void a(mw $$0, cgi $$1) {
      kf.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(mw $$0, cse $$1, cse $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mw $$0, cse $$1, cse $$2, @Nullable String $$3, int $$4) {
      mz.a(mv.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(mw $$0, List<cse> $$1, mv $$2, cse $$3, float $$4, int $$5, String $$6) {
      a($$0, cox.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(mw $$0, List<cse> $$1, mv $$2, cse $$3, float $$4, int $$5, String $$6) {
      a($$0, cox.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(mw $$0, cox<? extends coa> $$1, List<cse> $$2, mv $$3, cse $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cse $$9 : $$2) {
         na.a(coq.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(mw $$0, clj $$1, mv $$2, clj $$3) {
      nc.a(coq.a(clr.xi), coq.a($$1), coq.a(clr.oG), $$2, $$3).a("has_netherite_ingot", a(clr.oG)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(mw $$0, clj $$1, agm $$2) {
      nd.a(coq.a($$1), coq.a(ars.aH), coq.a(ars.aI), mv.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(mw $$0, mv $$1, cse $$2, cse $$3) {
      my.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(mw $$0, mv $$1, cse $$2, cse $$3, String $$4) {
      mz.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(mw $$0, mv $$1, cse $$2, cse $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(mw $$0, cse $$1, arz<clj> $$2, int $$3) {
      mz.a(mv.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mw $$0, cse $$1, arz<clj> $$2, int $$3) {
      mz.a(mv.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(mw $$0, cse $$1, cse $$2) {
      my.a(mv.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mw $$0, cse $$1, cse $$2) {
      my.a(mv.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cvh.G)).a($$0);
   }

   protected static void c(mw $$0, cse $$1, cse $$2) {
      mz.a(mv.d, $$1).b(cvh.cv).b($$2).b("chest_boat").b("has_boat", a(ars.am)).a($$0);
   }

   private static mu c(cse $$0, coq $$1) {
      return mz.a(mv.c, $$0).a($$1);
   }

   protected static mu a(cse $$0, coq $$1) {
      return my.a(mv.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mu d(cse $$0, coq $$1) {
      int $$2 = $$0 == cvh.fo ? 6 : 3;
      clj $$3 = $$0 == cvh.fo ? clr.up : clr.pm;
      return my.a(mv.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mu e(cse $$0, coq $$1) {
      return my.a(mv.c, $$0).a('#', clr.pm).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(mw $$0, cse $$1, cse $$2) {
      c(mv.c, $$1, coq.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mu c(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(mw $$0, mv $$1, cse $$2, cse $$3) {
      a($$1, $$2, coq.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mu a(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mu b(cse $$0, coq $$1) {
      return my.a(mv.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mu f(cse $$0, coq $$1) {
      return my.a(mv.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mu g(cse $$0, coq $$1) {
      return my.a(mv.b, $$0, 3).c("sign").a('#', $$1).a('X', clr.pm).b("###").b("###").b(" X ");
   }

   protected static void e(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', clr.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(mw $$0, List<clj> $$1, List<clj> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         clj $$5 = $$1.get($$4);
         clj $$6 = $$2.get($$4);
         mz.a(mv.a, $$6)
            .b($$5)
            .a(coq.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(clo::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1).a('#', $$2).a('X', ars.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1).a('#', $$2).a('|', clr.pm).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(mw $$0, cse $$1, cse $$2) {
      my.a(mv.a, $$1, 8).a('#', cvh.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cse)cvh.aQ)).a($$0);
   }

   protected static void j(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(mw $$0, cse $$1, cse $$2) {
      my.a(mv.b, $$1, 8)
         .a('#', cvh.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cse)cvh.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cvh.eY));
   }

   protected static void l(mw $$0, cse $$1, cse $$2) {
      my.a(mv.a, $$1, 8).a('#', cvh.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cse)cvh.iA)).a($$0);
   }

   protected static void m(mw $$0, cse $$1, cse $$2) {
      mz.a(mv.a, $$1, 8).b($$2).a(cvh.I, 4).a(cvh.L, 4).b("concrete_powder").b("has_sand", a((cse)cvh.I)).b("has_gravel", a((cse)cvh.L)).a($$0);
   }

   protected static void n(mw $$0, cse $$1, cse $$2) {
      mz.a(mv.b, $$1).b(cvh.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(mw $$0, mv $$1, cse $$2, cse $$3) {
      d($$1, $$2, coq.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mu d(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(mw $$0, mv $$1, cse $$2, cse $$3) {
      e($$1, $$2, coq.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mu e(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(mw $$0, mv $$1, cse $$2, cse $$3) {
      f($$1, $$2, coq.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static my f(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(mw $$0, mv $$1, cse $$2, cse $$3) {
      b($$1, $$2, coq.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(mw $$0, mv $$1, cse $$2, cse $$3) {
      my.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static my b(mv $$0, cse $$1, coq $$2) {
      return my.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(mw $$0, mv $$1, cse $$2, cse $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mw $$0, mv $$1, cse $$2, cse $$3, int $$4) {
      nb.a(coq.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(mw $$0, cse $$1, cse $$2) {
      na.c(coq.a($$2), mv.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(mw $$0, mv $$1, cse $$2, mv $$3, cse $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(mw $$0, mv $$1, cse $$2, mv $$3, cse $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(mw $$0, mv $$1, cse $$2, mv $$3, cse $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(mw $$0, mv $$1, cse $$2, mv $$3, cse $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      mz.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new agm($$7));
      my.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new agm($$5));
   }

   protected static void a(mw $$0, cse $$1, arz<clj> $$2) {
      my.a(mv.i, $$1, 2).a('#', clr.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(mw $$0, cse $$1, cse $$2) {
      my.a(mv.i, $$1, 2).a('#', clr.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(mw $$0, String $$1, cox<? extends coa> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, clr.rX, clr.rY, 0.35F);
      a($$0, $$1, $$2, $$3, clr.rZ, clr.sa, 0.35F);
      a($$0, $$1, $$2, $$3, clr.qW, clr.ra, 0.35F);
      a($$0, $$1, $$2, $$3, clr.dJ, clr.rU, 0.1F);
      a($$0, $$1, $$2, $$3, clr.qX, clr.rb, 0.35F);
      a($$0, $$1, $$2, $$3, clr.uF, clr.uG, 0.35F);
      a($$0, $$1, $$2, $$3, clr.pU, clr.pV, 0.35F);
      a($$0, $$1, $$2, $$3, clr.tY, clr.tZ, 0.35F);
      a($$0, $$1, $$2, $$3, clr.us, clr.ut, 0.35F);
   }

   private static void a(mw $$0, String $$1, cox<? extends coa> $$2, int $$3, cse $$4, cse $$5, float $$6) {
      na.a(coq.a($$4), mv.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(mw $$0) {
      cld.a.get().forEach(($$1, $$2) -> mz.a(mv.a, $$2).b($$1).b(clr.wm).b(c($$2)).b(b($$1), a((cse)$$1)).a($$0, a($$2, clr.wm)));
   }

   protected static void a(mw $$0, cvf $$1, cvf $$2) {
      my.a(mv.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cse)$$2)).a($$0);
   }

   protected static void b(mw $$0, cvf $$1, cvf $$2) {
      my.a(mv.c, $$1, 4).a('C', $$2).a('R', clr.lG).a('B', clr.sd).b(" C ").b("CBC").b(" R ").b(b($$2), a((cse)$$2)).a($$0);
   }

   protected static void a(mw $$0, kg $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cse, cse, mu> $$4 = f.get($$2);
         cse $$5 = a($$1, $$2);
         if ($$4 != null) {
            mu $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == kg.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == kg.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static cvf a(kg $$0, kg.b $$1) {
      if ($$1 == kg.b.b) {
         if (!$$0.b().containsKey(kg.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kg.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static am<bm.a> a(cvf $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, cse $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(cse $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(arz<clj> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(cse $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cse $$0) {
      return kc.i.b($$0.k()).a();
   }

   protected static String d(cse $$0) {
      return c($$0);
   }

   protected static String a(cse $$0, cse $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cse $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cse $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
