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

public abstract class mv implements ki {
   final kk.a d;
   final kk.a e;
   private static final Map<kf.b, BiFunction<csx, csx, ms>> f = ImmutableMap.builder()
      .put(kf.b.a, (BiFunction<csx, csx, ms>)($$0, $$1) -> c($$0, cpi.a($$1)))
      .put(kf.b.b, (BiFunction<csx, csx, ms>)($$0, $$1) -> b(mt.a, $$0, cpi.a($$1)))
      .put(kf.b.d, (BiFunction<csx, csx, ms>)($$0, $$1) -> f(mt.a, $$0, cpi.a($$1)))
      .put(kf.b.e, (BiFunction<csx, csx, ms>)($$0, $$1) -> a($$0, cpi.a($$1)))
      .put(kf.b.f, (BiFunction<csx, csx, ms>)($$0, $$1) -> d($$0, cpi.a($$1)))
      .put(kf.b.g, (BiFunction<csx, csx, ms>)($$0, $$1) -> d($$0, cpi.a($$1)))
      .put(kf.b.h, (BiFunction<csx, csx, ms>)($$0, $$1) -> e($$0, cpi.a($$1)))
      .put(kf.b.i, (BiFunction<csx, csx, ms>)($$0, $$1) -> e($$0, cpi.a($$1)))
      .put(kf.b.k, (BiFunction<csx, csx, ms>)($$0, $$1) -> g($$0, cpi.a($$1)))
      .put(kf.b.l, (BiFunction<csx, csx, ms>)($$0, $$1) -> a(mt.a, $$0, cpi.a($$1)))
      .put(kf.b.m, (BiFunction<csx, csx, ms>)($$0, $$1) -> b($$0, cpi.a($$1)))
      .put(kf.b.n, (BiFunction<csx, csx, ms>)($$0, $$1) -> c(mt.c, $$0, cpi.a($$1)))
      .put(kf.b.o, (BiFunction<csx, csx, ms>)($$0, $$1) -> e(mt.a, $$0, cpi.a($$1)))
      .put(kf.b.p, (BiFunction<csx, csx, ms>)($$0, $$1) -> f($$0, cpi.a($$1)))
      .put(kf.b.q, (BiFunction<csx, csx, ms>)($$0, $$1) -> d(mt.b, $$0, cpi.a($$1)))
      .build();

   public mv(kk $$0) {
      this.d = $$0.a(kk.b.a, "recipes");
      this.e = $$0.a(kk.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final kg $$0) {
      final Set<agt> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new mu() {
         @Override
         public void a(agt $$0x, cpl<?> $$1x, @Nullable af $$2x) {
            if (!$$1.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$2.add(ki.a($$0, cpl.h, $$1, mv.this.d.a($$0)));
               if ($$2 != null) {
                  $$2.add(ki.a($$0, ae.a, $$2.b(), mv.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(ms.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kg $$0, af $$1) {
      return ki.a($$0, ae.a, $$1.b(), this.e.a($$1.a()));
   }

   protected abstract void a(mu var1);

   protected static void a(mu $$0, chb $$1) {
      ke.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(mu $$0, csx $$1, csx $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mu $$0, csx $$1, csx $$2, @Nullable String $$3, int $$4) {
      mx.a(mt.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(mu $$0, List<csx> $$1, mt $$2, csx $$3, float $$4, int $$5, String $$6) {
      a($$0, cpp.p, cqa::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(mu $$0, List<csx> $$1, mt $$2, csx $$3, float $$4, int $$5, String $$6) {
      a($$0, cpp.q, cox::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cou> void a(mu $$0, cpp<T> $$1, cou.a<T> $$2, List<csx> $$3, mt $$4, csx $$5, float $$6, int $$7, String $$8, String $$9) {
      for (csx $$10 : $$3) {
         my.a(cpi.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(mu $$0, cmc $$1, mt $$2, cmc $$3) {
      na.a(cpi.a(cmk.xj), cpi.a($$1), cpi.a(cmk.oG), $$2, $$3).a("has_netherite_ingot", a(cmk.oG)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(mu $$0, cmc $$1, agt $$2) {
      nb.a(cpi.a($$1), cpi.a(arz.aH), cpi.a(arz.aI), mt.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(mu $$0, mt $$1, csx $$2, csx $$3) {
      mw.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(mu $$0, mt $$1, csx $$2, csx $$3, String $$4) {
      mx.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(mu $$0, mt $$1, csx $$2, csx $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(mu $$0, csx $$1, asg<cmc> $$2, int $$3) {
      mx.a(mt.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mu $$0, csx $$1, asg<cmc> $$2, int $$3) {
      mx.a(mt.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cwb.G)).a($$0);
   }

   protected static void c(mu $$0, csx $$1, csx $$2) {
      mx.a(mt.d, $$1).b(cwb.cv).b($$2).b("chest_boat").b("has_boat", a(arz.am)).a($$0);
   }

   private static ms c(csx $$0, cpi $$1) {
      return mx.a(mt.c, $$0).a($$1);
   }

   protected static ms a(csx $$0, cpi $$1) {
      return mw.a(mt.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static ms d(csx $$0, cpi $$1) {
      int $$2 = $$0 == cwb.fo ? 6 : 3;
      cmc $$3 = $$0 == cwb.fo ? cmk.uq : cmk.pm;
      return mw.a(mt.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static ms e(csx $$0, cpi $$1) {
      return mw.a(mt.c, $$0).a('#', cmk.pm).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(mu $$0, csx $$1, csx $$2) {
      c(mt.c, $$1, cpi.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static ms c(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(mu $$0, mt $$1, csx $$2, csx $$3) {
      a($$1, $$2, cpi.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static ms a(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static ms b(csx $$0, cpi $$1) {
      return mw.a(mt.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static ms f(csx $$0, cpi $$1) {
      return mw.a(mt.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static ms g(csx $$0, cpi $$1) {
      return mw.a(mt.b, $$0, 3).c("sign").a('#', $$1).a('X', cmk.pm).b("###").b("###").b(" X ");
   }

   protected static void e(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cmk.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(mu $$0, List<cmc> $$1, List<cmc> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cmc $$5 = $$1.get($$4);
         cmc $$6 = $$2.get($$4);
         mx.a(mt.a, $$6)
            .b($$5)
            .a(cpi.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cmh::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1).a('#', $$2).a('X', arz.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1).a('#', $$2).a('|', cmk.pm).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.a, $$1, 8).a('#', cwb.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((csx)cwb.aQ)).a($$0);
   }

   protected static void j(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.b, $$1, 8)
         .a('#', cwb.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((csx)cwb.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cwb.eY));
   }

   protected static void l(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.a, $$1, 8).a('#', cwb.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((csx)cwb.iA)).a($$0);
   }

   protected static void m(mu $$0, csx $$1, csx $$2) {
      mx.a(mt.a, $$1, 8).b($$2).a(cwb.I, 4).a(cwb.L, 4).b("concrete_powder").b("has_sand", a((csx)cwb.I)).b("has_gravel", a((csx)cwb.L)).a($$0);
   }

   protected static void n(mu $$0, csx $$1, csx $$2) {
      mx.a(mt.b, $$1).b(cwb.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(mu $$0, mt $$1, csx $$2, csx $$3) {
      d($$1, $$2, cpi.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ms d(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(mu $$0, mt $$1, csx $$2, csx $$3) {
      e($$1, $$2, cpi.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ms e(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(mu $$0, mt $$1, csx $$2, csx $$3) {
      f($$1, $$2, cpi.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static mw f(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(mu $$0, mt $$1, csx $$2, csx $$3) {
      b($$1, $$2, cpi.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(mu $$0, mt $$1, csx $$2, csx $$3) {
      mw.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static mw b(mt $$0, csx $$1, cpi $$2) {
      return mw.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(mu $$0, mt $$1, csx $$2, csx $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mu $$0, mt $$1, csx $$2, csx $$3, int $$4) {
      mz.a(cpi.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(mu $$0, csx $$1, csx $$2) {
      my.c(cpi.a($$2), mt.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(mu $$0, mt $$1, csx $$2, mt $$3, csx $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(mu $$0, mt $$1, csx $$2, mt $$3, csx $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(mu $$0, mt $$1, csx $$2, mt $$3, csx $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(mu $$0, mt $$1, csx $$2, mt $$3, csx $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      mx.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new agt($$7));
      mw.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new agt($$5));
   }

   protected static void a(mu $$0, csx $$1, asg<cmc> $$2) {
      mw.a(mt.i, $$1, 2).a('#', cmk.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(mu $$0, csx $$1, csx $$2) {
      mw.a(mt.i, $$1, 2).a('#', cmk.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cou> void a(mu $$0, String $$1, cpp<T> $$2, cou.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cmk.rX, cmk.rY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.rZ, cmk.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.qW, cmk.ra, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.dJ, cmk.rU, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cmk.qX, cmk.rb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.uG, cmk.uH, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.pU, cmk.pV, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.tZ, cmk.ua, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cmk.ut, cmk.uu, 0.35F);
   }

   private static <T extends cou> void a(mu $$0, String $$1, cpp<T> $$2, cou.a<T> $$3, int $$4, csx $$5, csx $$6, float $$7) {
      my.a(cpi.a($$5), mt.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(mu $$0) {
      clw.a.get().forEach(($$1, $$2) -> mx.a(mt.a, $$2).b($$1).b(cmk.wn).b(c($$2)).b(b($$1), a((csx)$$1)).a($$0, a($$2, cmk.wn)));
   }

   protected static void a(mu $$0, cvz $$1, cvz $$2) {
      mw.a(mt.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((csx)$$2)).a($$0);
   }

   protected static void b(mu $$0, cvz $$1, cvz $$2) {
      mw.a(mt.c, $$1, 4).a('C', $$2).a('R', cmk.lG).a('B', cmk.sd).b(" C ").b("CBC").b(" R ").b(b($$2), a((csx)$$2)).a($$0);
   }

   protected static void a(mu $$0, kf $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<csx, csx, ms> $$4 = f.get($$2);
         csx $$5 = a($$1, $$2);
         if ($$4 != null) {
            ms $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == kf.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == kf.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static cvz a(kf $$0, kf.b $$1) {
      if ($$1 == kf.b.b) {
         if (!$$0.b().containsKey(kf.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kf.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bl.a> a(cvz $$0) {
      return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<by.a> a(ck.d $$0, csx $$1) {
      return a(ca.a.a().a($$1).a($$0));
   }

   protected static an<by.a> a(csx $$0) {
      return a(ca.a.a().a($$0));
   }

   protected static an<by.a> a(asg<cmc> $$0) {
      return a(ca.a.a().a($$0));
   }

   private static an<by.a> a(ca.a... $$0) {
      return a(Arrays.stream($$0).map(ca.a::b).toArray(ca[]::new));
   }

   private static an<by.a> a(ca... $$0) {
      return am.f.a(new by.a(Optional.empty(), by.a.a.b, List.of($$0)));
   }

   protected static String b(csx $$0) {
      return "has_" + c($$0);
   }

   protected static String c(csx $$0) {
      return kb.h.b($$0.k()).a();
   }

   protected static String d(csx $$0) {
      return c($$0);
   }

   protected static String a(csx $$0, csx $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(csx $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(csx $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
