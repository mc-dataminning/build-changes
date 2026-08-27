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
   private static final Map<kh.b, BiFunction<cto, cto, mw>> f = ImmutableMap.builder()
      .put(kh.b.a, (BiFunction<cto, cto, mw>)($$0, $$1) -> c($$0, cpz.a($$1)))
      .put(kh.b.b, (BiFunction<cto, cto, mw>)($$0, $$1) -> b(mx.a, $$0, cpz.a($$1)))
      .put(kh.b.d, (BiFunction<cto, cto, mw>)($$0, $$1) -> f(mx.a, $$0, cpz.a($$1)))
      .put(kh.b.e, (BiFunction<cto, cto, mw>)($$0, $$1) -> a($$0, cpz.a($$1)))
      .put(kh.b.f, (BiFunction<cto, cto, mw>)($$0, $$1) -> d($$0, cpz.a($$1)))
      .put(kh.b.g, (BiFunction<cto, cto, mw>)($$0, $$1) -> d($$0, cpz.a($$1)))
      .put(kh.b.h, (BiFunction<cto, cto, mw>)($$0, $$1) -> e($$0, cpz.a($$1)))
      .put(kh.b.i, (BiFunction<cto, cto, mw>)($$0, $$1) -> e($$0, cpz.a($$1)))
      .put(kh.b.k, (BiFunction<cto, cto, mw>)($$0, $$1) -> g($$0, cpz.a($$1)))
      .put(kh.b.l, (BiFunction<cto, cto, mw>)($$0, $$1) -> a(mx.a, $$0, cpz.a($$1)))
      .put(kh.b.m, (BiFunction<cto, cto, mw>)($$0, $$1) -> b($$0, cpz.a($$1)))
      .put(kh.b.n, (BiFunction<cto, cto, mw>)($$0, $$1) -> c(mx.c, $$0, cpz.a($$1)))
      .put(kh.b.o, (BiFunction<cto, cto, mw>)($$0, $$1) -> e(mx.a, $$0, cpz.a($$1)))
      .put(kh.b.p, (BiFunction<cto, cto, mw>)($$0, $$1) -> f($$0, cpz.a($$1)))
      .put(kh.b.q, (BiFunction<cto, cto, mw>)($$0, $$1) -> d(mx.b, $$0, cpz.a($$1)))
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
         public void a(ahg $$0x, cqc<?> $$1x, @Nullable af $$2x) {
            if (!$$1.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$2.add(kk.a($$0, cqc.h, $$1, mz.this.d.a($$0)));
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

   protected static void a(my $$0, chs $$1) {
      kg.a().filter(kh::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(my $$0, cto $$1, cto $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(my $$0, cto $$1, cto $$2, @Nullable String $$3, int $$4) {
      nb.a(mx.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(my $$0, List<cto> $$1, mx $$2, cto $$3, float $$4, int $$5, String $$6) {
      a($$0, cqg.p, cqr::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(my $$0, List<cto> $$1, mx $$2, cto $$3, float $$4, int $$5, String $$6) {
      a($$0, cqg.q, cpo::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cpl> void a(my $$0, cqg<T> $$1, cpl.a<T> $$2, List<cto> $$3, mx $$4, cto $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cto $$10 : $$3) {
         nc.a(cpz.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(my $$0, cmt $$1, mx $$2, cmt $$3) {
      ne.a(cpz.a(cnb.xj), cpz.a($$1), cpz.a(cnb.oG), $$2, $$3).a("has_netherite_ingot", a(cnb.oG)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(my $$0, cmt $$1, ahg $$2) {
      nf.a(cpz.a($$1), cpz.a(asp.aH), cpz.a(asp.aI), mx.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(my $$0, mx $$1, cto $$2, cto $$3) {
      na.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(my $$0, mx $$1, cto $$2, cto $$3, String $$4) {
      nb.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(my $$0, mx $$1, cto $$2, cto $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(my $$0, cto $$1, asw<cmt> $$2, int $$3) {
      nb.a(mx.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(my $$0, cto $$1, asw<cmt> $$2, int $$3) {
      nb.a(mx.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(my $$0, cto $$1, cto $$2) {
      na.a(mx.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(my $$0, cto $$1, cto $$2) {
      na.a(mx.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cws.G)).a($$0);
   }

   protected static void c(my $$0, cto $$1, cto $$2) {
      nb.a(mx.d, $$1).b(cws.cv).b($$2).b("chest_boat").b("has_boat", a(asp.am)).a($$0);
   }

   private static mw c(cto $$0, cpz $$1) {
      return nb.a(mx.c, $$0).a($$1);
   }

   protected static mw a(cto $$0, cpz $$1) {
      return na.a(mx.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mw d(cto $$0, cpz $$1) {
      int $$2 = $$0 == cws.fo ? 6 : 3;
      cmt $$3 = $$0 == cws.fo ? cnb.uq : cnb.pm;
      return na.a(mx.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mw e(cto $$0, cpz $$1) {
      return na.a(mx.c, $$0).a('#', cnb.pm).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(my $$0, cto $$1, cto $$2) {
      c(mx.c, $$1, cpz.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mw c(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(my $$0, mx $$1, cto $$2, cto $$3) {
      a($$1, $$2, cpz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mw a(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mw b(cto $$0, cpz $$1) {
      return na.a(mx.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mw f(cto $$0, cpz $$1) {
      return na.a(mx.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mw g(cto $$0, cpz $$1) {
      return na.a(mx.b, $$0, 3).c("sign").a('#', $$1).a('X', cnb.pm).b("###").b("###").b(" X ");
   }

   protected static void e(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cnb.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(my $$0, List<cmt> $$1, List<cmt> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cmt $$5 = $$1.get($$4);
         cmt $$6 = $$2.get($$4);
         nb.a(mx.a, $$6)
            .b($$5)
            .a(cpz.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cmy::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1).a('#', $$2).a('X', asp.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1).a('#', $$2).a('|', cnb.pm).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(my $$0, cto $$1, cto $$2) {
      na.a(mx.a, $$1, 8).a('#', cws.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cto)cws.aQ)).a($$0);
   }

   protected static void j(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(my $$0, cto $$1, cto $$2) {
      na.a(mx.b, $$1, 8)
         .a('#', cws.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cto)cws.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cws.eY));
   }

   protected static void l(my $$0, cto $$1, cto $$2) {
      na.a(mx.a, $$1, 8).a('#', cws.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cto)cws.iA)).a($$0);
   }

   protected static void m(my $$0, cto $$1, cto $$2) {
      nb.a(mx.a, $$1, 8).b($$2).a(cws.I, 4).a(cws.L, 4).b("concrete_powder").b("has_sand", a((cto)cws.I)).b("has_gravel", a((cto)cws.L)).a($$0);
   }

   protected static void n(my $$0, cto $$1, cto $$2) {
      nb.a(mx.b, $$1).b(cws.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(my $$0, mx $$1, cto $$2, cto $$3) {
      d($$1, $$2, cpz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mw d(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(my $$0, mx $$1, cto $$2, cto $$3) {
      e($$1, $$2, cpz.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mw e(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(my $$0, mx $$1, cto $$2, cto $$3) {
      f($$1, $$2, cpz.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static na f(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(my $$0, mx $$1, cto $$2, cto $$3) {
      b($$1, $$2, cpz.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(my $$0, mx $$1, cto $$2, cto $$3) {
      na.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static na b(mx $$0, cto $$1, cpz $$2) {
      return na.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(my $$0, mx $$1, cto $$2, cto $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(my $$0, mx $$1, cto $$2, cto $$3, int $$4) {
      nd.a(cpz.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(my $$0, cto $$1, cto $$2) {
      nc.c(cpz.a($$2), mx.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(my $$0, mx $$1, cto $$2, mx $$3, cto $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(my $$0, mx $$1, cto $$2, mx $$3, cto $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(my $$0, mx $$1, cto $$2, mx $$3, cto $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(my $$0, mx $$1, cto $$2, mx $$3, cto $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nb.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ahg($$7));
      na.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ahg($$5));
   }

   protected static void a(my $$0, cto $$1, asw<cmt> $$2) {
      na.a(mx.i, $$1, 2).a('#', cnb.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(my $$0, cto $$1, cto $$2) {
      na.a(mx.i, $$1, 2).a('#', cnb.ov).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cpl> void a(my $$0, String $$1, cqg<T> $$2, cpl.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cnb.rX, cnb.rY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.rZ, cnb.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.qW, cnb.ra, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.dJ, cnb.rU, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cnb.qX, cnb.rb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.uG, cnb.uH, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.pU, cnb.pV, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.tZ, cnb.ua, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cnb.ut, cnb.uu, 0.35F);
   }

   private static <T extends cpl> void a(my $$0, String $$1, cqg<T> $$2, cpl.a<T> $$3, int $$4, cto $$5, cto $$6, float $$7) {
      nc.a(cpz.a($$5), mx.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(my $$0, chs $$1) {
      cmn.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nb.a(mx.a, $$3).b($$2).b(cnb.wn).b(c($$3)).b(b($$2), a((cto)$$2)).a($$0, a($$3, cnb.wn));
         }
      });
   }

   protected static void a(my $$0, cwq $$1, cwq $$2) {
      na.a(mx.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cto)$$2)).a($$0);
   }

   protected static void b(my $$0, cwq $$1, cwq $$2) {
      na.a(mx.c, $$1, 4).a('C', $$2).a('R', cnb.lG).a('B', cnb.sd).b(" C ").b("CBC").b(" R ").b(b($$2), a((cto)$$2)).a($$0);
   }

   protected static void a(my $$0, kh $$1, chs $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cto, cto, mw> $$5 = f.get($$3);
            cto $$6 = a($$1, $$3);
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

   private static cwq a(kh $$0, kh.b $$1) {
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

   private static an<bl.a> a(cwq $$0) {
      return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<by.a> a(ck.d $$0, cto $$1) {
      return a(ca.a.a().a($$1).a($$0));
   }

   protected static an<by.a> a(cto $$0) {
      return a(ca.a.a().a($$0));
   }

   protected static an<by.a> a(asw<cmt> $$0) {
      return a(ca.a.a().a($$0));
   }

   private static an<by.a> a(ca.a... $$0) {
      return a(Arrays.stream($$0).map(ca.a::b).toArray(ca[]::new));
   }

   private static an<by.a> a(ca... $$0) {
      return am.f.a(new by.a(Optional.empty(), by.a.a.b, List.of($$0)));
   }

   protected static String b(cto $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cto $$0) {
      return kd.h.b($$0.k()).a();
   }

   protected static String d(cto $$0) {
      return c($$0);
   }

   protected static String a(cto $$0, cto $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cto $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cto $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
