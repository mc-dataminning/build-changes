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

public abstract class mz implements kk {
   final km.a d;
   final km.a e;
   private static final Map<kh.b, BiFunction<ctn, ctn, mw>> f = ImmutableMap.builder()
      .put(kh.b.a, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> c($$0, cpy.a($$1)))
      .put(kh.b.b, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> b(mx.a, $$0, cpy.a($$1)))
      .put(kh.b.d, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> f(mx.a, $$0, cpy.a($$1)))
      .put(kh.b.e, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> a($$0, cpy.a($$1)))
      .put(kh.b.f, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> d($$0, cpy.a($$1)))
      .put(kh.b.g, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> d($$0, cpy.a($$1)))
      .put(kh.b.h, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> e($$0, cpy.a($$1)))
      .put(kh.b.i, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> e($$0, cpy.a($$1)))
      .put(kh.b.k, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> g($$0, cpy.a($$1)))
      .put(kh.b.l, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> a(mx.a, $$0, cpy.a($$1)))
      .put(kh.b.m, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> b($$0, cpy.a($$1)))
      .put(kh.b.n, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> c(mx.c, $$0, cpy.a($$1)))
      .put(kh.b.o, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> e(mx.a, $$0, cpy.a($$1)))
      .put(kh.b.p, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> f($$0, cpy.a($$1)))
      .put(kh.b.q, (BiFunction<ctn, ctn, mw>)($$0, $$1) -> d(mx.b, $$0, cpy.a($$1)))
      .build();

   public mz(km $$0) {
      this.d = $$0.a(km.b.a, "recipes");
      this.e = $$0.a(km.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final ki $$0) {
      final Set<ahg> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new my() {
         @Override
         public void a(ahg $$0x, cqb<?> $$1x, @Nullable af $$2x) {
            if (!$$1.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$2.add(kk.a($$0, cqb.h, $$1, mz.this.d.a($$0)));
               if ($$2 != null) {
                  $$2.add(kk.a($$0, ae.a, $$2.b(), mz.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(mw.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ki $$0, af $$1) {
      return kk.a($$0, ae.a, $$1.b(), this.e.a($$1.a()));
   }

   protected abstract void a(my var1);

   protected static void a(my $$0, chr $$1) {
      kg.a().filter(kh::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(my $$0, ctn $$1, ctn $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(my $$0, ctn $$1, ctn $$2, @Nullable String $$3, int $$4) {
      nb.a(mx.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(my $$0, List<ctn> $$1, mx $$2, ctn $$3, float $$4, int $$5, String $$6) {
      a($$0, cqf.p, cqq::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(my $$0, List<ctn> $$1, mx $$2, ctn $$3, float $$4, int $$5, String $$6) {
      a($$0, cqf.q, cpn::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cpk> void a(my $$0, cqf<T> $$1, cpk.a<T> $$2, List<ctn> $$3, mx $$4, ctn $$5, float $$6, int $$7, String $$8, String $$9) {
      for (ctn $$10 : $$3) {
         nc.a(cpy.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(my $$0, cms $$1, mx $$2, cms $$3) {
      ne.a(cpy.a(cna.xj), cpy.a($$1), cpy.a(cna.oG), $$2, $$3).a("has_netherite_ingot", a(cna.oG)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(my $$0, cms $$1, ahg $$2) {
      nf.a(cpy.a($$1), cpy.a(aso.aH), cpy.a(aso.aI), mx.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(my $$0, mx $$1, ctn $$2, ctn $$3) {
      na.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(my $$0, mx $$1, ctn $$2, ctn $$3, String $$4) {
      nb.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(my $$0, mx $$1, ctn $$2, ctn $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(my $$0, ctn $$1, asv<cms> $$2, int $$3) {
      nb.a(mx.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(my $$0, ctn $$1, asv<cms> $$2, int $$3) {
      nb.a(mx.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cwr.G)).a($$0);
   }

   protected static void c(my $$0, ctn $$1, ctn $$2) {
      nb.a(mx.d, $$1).b(cwr.cv).b($$2).b("chest_boat").b("has_boat", a(aso.am)).a($$0);
   }

   private static mw c(ctn $$0, cpy $$1) {
      return nb.a(mx.c, $$0).a($$1);
   }

   protected static mw a(ctn $$0, cpy $$1) {
      return na.a(mx.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mw d(ctn $$0, cpy $$1) {
      int $$2 = $$0 == cwr.fo ? 6 : 3;
      cms $$3 = $$0 == cwr.fo ? cna.uq : cna.pm;
      return na.a(mx.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mw e(ctn $$0, cpy $$1) {
      return na.a(mx.c, $$0).a('#', cna.pm).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(my $$0, ctn $$1, ctn $$2) {
      c(mx.c, $$1, cpy.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mw c(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(my $$0, mx $$1, ctn $$2, ctn $$3) {
      a($$1, $$2, cpy.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mw a(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mw b(ctn $$0, cpy $$1) {
      return na.a(mx.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mw f(ctn $$0, cpy $$1) {
      return na.a(mx.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mw g(ctn $$0, cpy $$1) {
      return na.a(mx.b, $$0, 3).c("sign").a('#', $$1).a('X', cna.pm).b("###").b("###").b(" X ");
   }

   protected static void e(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cna.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(my $$0, List<cms> $$1, List<cms> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cms $$5 = $$1.get($$4);
         cms $$6 = $$2.get($$4);
         nb.a(mx.a, $$6)
            .b($$5)
            .a(cpy.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cmx::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1).a('#', $$2).a('X', aso.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1).a('#', $$2).a('|', cna.pm).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.a, $$1, 8).a('#', cwr.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((ctn)cwr.aQ)).a($$0);
   }

   protected static void j(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.b, $$1, 8)
         .a('#', cwr.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((ctn)cwr.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cwr.eY));
   }

   protected static void l(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.a, $$1, 8).a('#', cwr.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((ctn)cwr.iA)).a($$0);
   }

   protected static void m(my $$0, ctn $$1, ctn $$2) {
      nb.a(mx.a, $$1, 8).b($$2).a(cwr.I, 4).a(cwr.L, 4).b("concrete_powder").b("has_sand", a((ctn)cwr.I)).b("has_gravel", a((ctn)cwr.L)).a($$0);
   }

   protected static void n(my $$0, ctn $$1, ctn $$2) {
      nb.a(mx.b, $$1).b(cwr.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(my $$0, mx $$1, ctn $$2, ctn $$3) {
      d($$1, $$2, cpy.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mw d(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(my $$0, mx $$1, ctn $$2, ctn $$3) {
      e($$1, $$2, cpy.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mw e(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(my $$0, mx $$1, ctn $$2, ctn $$3) {
      f($$1, $$2, cpy.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static na f(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(my $$0, mx $$1, ctn $$2, ctn $$3) {
      b($$1, $$2, cpy.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(my $$0, mx $$1, ctn $$2, ctn $$3) {
      na.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static na b(mx $$0, ctn $$1, cpy $$2) {
      return na.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(my $$0, mx $$1, ctn $$2, ctn $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(my $$0, mx $$1, ctn $$2, ctn $$3, int $$4) {
      nd.a(cpy.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(my $$0, ctn $$1, ctn $$2) {
      nc.c(cpy.a($$2), mx.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(my $$0, mx $$1, ctn $$2, mx $$3, ctn $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(my $$0, mx $$1, ctn $$2, mx $$3, ctn $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(my $$0, mx $$1, ctn $$2, mx $$3, ctn $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(my $$0, mx $$1, ctn $$2, mx $$3, ctn $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nb.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ahg($$7));
      na.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ahg($$5));
   }

   protected static void a(my $$0, ctn $$1, asv<cms> $$2) {
      na.a(mx.i, $$1, 2).a('#', cna.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(my $$0, ctn $$1, ctn $$2) {
      na.a(mx.i, $$1, 2).a('#', cna.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cpk> void a(my $$0, String $$1, cqf<T> $$2, cpk.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cna.rX, cna.rY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.rZ, cna.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.qW, cna.ra, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.dJ, cna.rU, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cna.qX, cna.rb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.uG, cna.uH, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.pU, cna.pV, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.tZ, cna.ua, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cna.ut, cna.uu, 0.35F);
   }

   private static <T extends cpk> void a(my $$0, String $$1, cqf<T> $$2, cpk.a<T> $$3, int $$4, ctn $$5, ctn $$6, float $$7) {
      nc.a(cpy.a($$5), mx.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(my $$0, chr $$1) {
      cmm.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nb.a(mx.a, $$3).b($$2).b(cna.wn).b(c($$3)).b(b($$2), a((ctn)$$2)).a($$0, a($$3, cna.wn));
         }
      });
   }

   protected static void a(my $$0, cwp $$1, cwp $$2) {
      na.a(mx.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((ctn)$$2)).a($$0);
   }

   protected static void b(my $$0, cwp $$1, cwp $$2) {
      na.a(mx.c, $$1, 4).a('C', $$2).a('R', cna.lG).a('B', cna.sd).b(" C ").b("CBC").b(" R ").b(b($$2), a((ctn)$$2)).a($$0);
   }

   protected static void a(my $$0, kh $$1, chr $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<ctn, ctn, mw> $$5 = f.get($$3);
            ctn $$6 = a($$1, $$3);
            if ($$5 != null) {
               mw $$7 = $$5.apply($$4, $$6);
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

   private static cwp a(kh $$0, kh.b $$1) {
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

   private static an<bl.a> a(cwp $$0) {
      return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<by.a> a(ck.d $$0, ctn $$1) {
      return a(ca.a.a().a($$1).a($$0));
   }

   protected static an<by.a> a(ctn $$0) {
      return a(ca.a.a().a($$0));
   }

   protected static an<by.a> a(asv<cms> $$0) {
      return a(ca.a.a().a($$0));
   }

   private static an<by.a> a(ca.a... $$0) {
      return a(Arrays.stream($$0).map(ca.a::b).toArray(ca[]::new));
   }

   private static an<by.a> a(ca... $$0) {
      return am.f.a(new by.a(Optional.empty(), by.a.a.b, List.of($$0)));
   }

   protected static String b(ctn $$0) {
      return "has_" + c($$0);
   }

   protected static String c(ctn $$0) {
      return kd.h.b($$0.k()).a();
   }

   protected static String d(ctn $$0) {
      return c($$0);
   }

   protected static String a(ctn $$0, ctn $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(ctn $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(ctn $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
