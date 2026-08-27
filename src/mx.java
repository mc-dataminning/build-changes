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

public abstract class mx implements kk {
   final km.a d;
   final km.a e;
   private static final Map<kh.b, BiFunction<cth, cth, mu>> f = ImmutableMap.builder()
      .put(kh.b.a, (BiFunction<cth, cth, mu>)($$0, $$1) -> c($$0, cps.a($$1)))
      .put(kh.b.b, (BiFunction<cth, cth, mu>)($$0, $$1) -> b(mv.a, $$0, cps.a($$1)))
      .put(kh.b.d, (BiFunction<cth, cth, mu>)($$0, $$1) -> f(mv.a, $$0, cps.a($$1)))
      .put(kh.b.e, (BiFunction<cth, cth, mu>)($$0, $$1) -> a($$0, cps.a($$1)))
      .put(kh.b.f, (BiFunction<cth, cth, mu>)($$0, $$1) -> d($$0, cps.a($$1)))
      .put(kh.b.g, (BiFunction<cth, cth, mu>)($$0, $$1) -> d($$0, cps.a($$1)))
      .put(kh.b.h, (BiFunction<cth, cth, mu>)($$0, $$1) -> e($$0, cps.a($$1)))
      .put(kh.b.i, (BiFunction<cth, cth, mu>)($$0, $$1) -> e($$0, cps.a($$1)))
      .put(kh.b.k, (BiFunction<cth, cth, mu>)($$0, $$1) -> g($$0, cps.a($$1)))
      .put(kh.b.l, (BiFunction<cth, cth, mu>)($$0, $$1) -> a(mv.a, $$0, cps.a($$1)))
      .put(kh.b.m, (BiFunction<cth, cth, mu>)($$0, $$1) -> b($$0, cps.a($$1)))
      .put(kh.b.n, (BiFunction<cth, cth, mu>)($$0, $$1) -> c(mv.c, $$0, cps.a($$1)))
      .put(kh.b.o, (BiFunction<cth, cth, mu>)($$0, $$1) -> e(mv.a, $$0, cps.a($$1)))
      .put(kh.b.p, (BiFunction<cth, cth, mu>)($$0, $$1) -> f($$0, cps.a($$1)))
      .put(kh.b.q, (BiFunction<cth, cth, mu>)($$0, $$1) -> d(mv.b, $$0, cps.a($$1)))
      .build();

   public mx(km $$0) {
      this.d = $$0.a(km.b.a, "recipes");
      this.e = $$0.a(km.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final ki $$0) {
      final Set<ahd> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new mw() {
         @Override
         public void a(ahd $$0x, cpv<?> $$1x, @Nullable af $$2x) {
            if (!$$1.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$2.add(kk.a($$0, cpv.h, $$1, mx.this.d.a($$0)));
               if ($$2 != null) {
                  $$2.add(kk.a($$0, ae.a, $$2.b(), mx.this.e.a($$2.a())));
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

   protected CompletableFuture<?> a(ki $$0, af $$1) {
      return kk.a($$0, ae.a, $$1.b(), this.e.a($$1.a()));
   }

   protected abstract void a(mw var1);

   protected static void a(mw $$0, chl $$1) {
      kg.a().filter(kh::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(mw $$0, cth $$1, cth $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mw $$0, cth $$1, cth $$2, @Nullable String $$3, int $$4) {
      mz.a(mv.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(mw $$0, List<cth> $$1, mv $$2, cth $$3, float $$4, int $$5, String $$6) {
      a($$0, cpz.p, cqk::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(mw $$0, List<cth> $$1, mv $$2, cth $$3, float $$4, int $$5, String $$6) {
      a($$0, cpz.q, cph::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cpe> void a(mw $$0, cpz<T> $$1, cpe.a<T> $$2, List<cth> $$3, mv $$4, cth $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cth $$10 : $$3) {
         na.a(cps.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(mw $$0, cmm $$1, mv $$2, cmm $$3) {
      nc.a(cps.a(cmu.xj), cps.a($$1), cps.a(cmu.oG), $$2, $$3).a("has_netherite_ingot", a(cmu.oG)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(mw $$0, cmm $$1, ahd $$2) {
      nd.a(cps.a($$1), cps.a(asj.aH), cps.a(asj.aI), mv.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(mw $$0, mv $$1, cth $$2, cth $$3) {
      my.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(mw $$0, mv $$1, cth $$2, cth $$3, String $$4) {
      mz.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(mw $$0, mv $$1, cth $$2, cth $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(mw $$0, cth $$1, asq<cmm> $$2, int $$3) {
      mz.a(mv.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mw $$0, cth $$1, asq<cmm> $$2, int $$3) {
      mz.a(mv.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(mw $$0, cth $$1, cth $$2) {
      my.a(mv.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mw $$0, cth $$1, cth $$2) {
      my.a(mv.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cwl.G)).a($$0);
   }

   protected static void c(mw $$0, cth $$1, cth $$2) {
      mz.a(mv.d, $$1).b(cwl.cv).b($$2).b("chest_boat").b("has_boat", a(asj.am)).a($$0);
   }

   private static mu c(cth $$0, cps $$1) {
      return mz.a(mv.c, $$0).a($$1);
   }

   protected static mu a(cth $$0, cps $$1) {
      return my.a(mv.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mu d(cth $$0, cps $$1) {
      int $$2 = $$0 == cwl.fo ? 6 : 3;
      cmm $$3 = $$0 == cwl.fo ? cmu.uq : cmu.pm;
      return my.a(mv.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mu e(cth $$0, cps $$1) {
      return my.a(mv.c, $$0).a('#', cmu.pm).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(mw $$0, cth $$1, cth $$2) {
      c(mv.c, $$1, cps.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mu c(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(mw $$0, mv $$1, cth $$2, cth $$3) {
      a($$1, $$2, cps.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mu a(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mu b(cth $$0, cps $$1) {
      return my.a(mv.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mu f(cth $$0, cps $$1) {
      return my.a(mv.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mu g(cth $$0, cps $$1) {
      return my.a(mv.b, $$0, 3).c("sign").a('#', $$1).a('X', cmu.pm).b("###").b("###").b(" X ");
   }

   protected static void e(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cmu.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(mw $$0, List<cmm> $$1, List<cmm> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cmm $$5 = $$1.get($$4);
         cmm $$6 = $$2.get($$4);
         mz.a(mv.a, $$6)
            .b($$5)
            .a(cps.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cmr::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1).a('#', $$2).a('X', asj.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1).a('#', $$2).a('|', cmu.pm).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(mw $$0, cth $$1, cth $$2) {
      my.a(mv.a, $$1, 8).a('#', cwl.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cth)cwl.aQ)).a($$0);
   }

   protected static void j(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(mw $$0, cth $$1, cth $$2) {
      my.a(mv.b, $$1, 8)
         .a('#', cwl.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cth)cwl.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cwl.eY));
   }

   protected static void l(mw $$0, cth $$1, cth $$2) {
      my.a(mv.a, $$1, 8).a('#', cwl.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cth)cwl.iA)).a($$0);
   }

   protected static void m(mw $$0, cth $$1, cth $$2) {
      mz.a(mv.a, $$1, 8).b($$2).a(cwl.I, 4).a(cwl.L, 4).b("concrete_powder").b("has_sand", a((cth)cwl.I)).b("has_gravel", a((cth)cwl.L)).a($$0);
   }

   protected static void n(mw $$0, cth $$1, cth $$2) {
      mz.a(mv.b, $$1).b(cwl.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(mw $$0, mv $$1, cth $$2, cth $$3) {
      d($$1, $$2, cps.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mu d(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(mw $$0, mv $$1, cth $$2, cth $$3) {
      e($$1, $$2, cps.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mu e(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(mw $$0, mv $$1, cth $$2, cth $$3) {
      f($$1, $$2, cps.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static my f(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(mw $$0, mv $$1, cth $$2, cth $$3) {
      b($$1, $$2, cps.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(mw $$0, mv $$1, cth $$2, cth $$3) {
      my.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static my b(mv $$0, cth $$1, cps $$2) {
      return my.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(mw $$0, mv $$1, cth $$2, cth $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mw $$0, mv $$1, cth $$2, cth $$3, int $$4) {
      nb.a(cps.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(mw $$0, cth $$1, cth $$2) {
      na.c(cps.a($$2), mv.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(mw $$0, mv $$1, cth $$2, mv $$3, cth $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(mw $$0, mv $$1, cth $$2, mv $$3, cth $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(mw $$0, mv $$1, cth $$2, mv $$3, cth $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(mw $$0, mv $$1, cth $$2, mv $$3, cth $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      mz.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ahd($$7));
      my.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ahd($$5));
   }

   protected static void a(mw $$0, cth $$1, asq<cmm> $$2) {
      my.a(mv.i, $$1, 2).a('#', cmu.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(mw $$0, cth $$1, cth $$2) {
      my.a(mv.i, $$1, 2).a('#', cmu.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cpe> void a(mw $$0, String $$1, cpz<T> $$2, cpe.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cmu.rX, cmu.rY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.rZ, cmu.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.qW, cmu.ra, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.dJ, cmu.rU, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cmu.qX, cmu.rb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.uG, cmu.uH, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.pU, cmu.pV, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.tZ, cmu.ua, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmu.ut, cmu.uu, 0.35F);
   }

   private static <T extends cpe> void a(mw $$0, String $$1, cpz<T> $$2, cpe.a<T> $$3, int $$4, cth $$5, cth $$6, float $$7) {
      na.a(cps.a($$5), mv.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(mw $$0, chl $$1) {
      cmg.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            mz.a(mv.a, $$3).b($$2).b(cmu.wn).b(c($$3)).b(b($$2), a((cth)$$2)).a($$0, a($$3, cmu.wn));
         }
      });
   }

   protected static void a(mw $$0, cwj $$1, cwj $$2) {
      my.a(mv.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cth)$$2)).a($$0);
   }

   protected static void b(mw $$0, cwj $$1, cwj $$2) {
      my.a(mv.c, $$1, 4).a('C', $$2).a('R', cmu.lG).a('B', cmu.sd).b(" C ").b("CBC").b(" R ").b(b($$2), a((cth)$$2)).a($$0);
   }

   protected static void a(mw $$0, kh $$1, chl $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cth, cth, mu> $$5 = f.get($$3);
            cth $$6 = a($$1, $$3);
            if ($$5 != null) {
               mu $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == kh.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == kh.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static cwj a(kh $$0, kh.b $$1) {
      if ($$1 == kh.b.b) {
         if (!$$0.b().containsKey(kh.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kh.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bl.a> a(cwj $$0) {
      return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<by.a> a(ck.d $$0, cth $$1) {
      return a(ca.a.a().a($$1).a($$0));
   }

   protected static an<by.a> a(cth $$0) {
      return a(ca.a.a().a($$0));
   }

   protected static an<by.a> a(asq<cmm> $$0) {
      return a(ca.a.a().a($$0));
   }

   private static an<by.a> a(ca.a... $$0) {
      return a(Arrays.stream($$0).map(ca.a::b).toArray(ca[]::new));
   }

   private static an<by.a> a(ca... $$0) {
      return am.f.a(new by.a(Optional.empty(), by.a.a.b, List.of($$0)));
   }

   protected static String b(cth $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cth $$0) {
      return kd.h.b($$0.k()).a();
   }

   protected static String d(cth $$0) {
      return c($$0);
   }

   protected static String a(cth $$0, cth $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cth $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cth $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
