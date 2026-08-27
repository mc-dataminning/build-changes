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

public abstract class od implements lk {
   final lm.a d;
   final lm.a e;
   private final CompletableFuture<iy.a> f;
   private static final Map<lh.b, BiFunction<dac, dac, oa>> g = ImmutableMap.builder()
      .put(lh.b.a, (BiFunction<dac, dac, oa>)($$0, $$1) -> c($$0, cxa.a($$1)))
      .put(lh.b.b, (BiFunction<dac, dac, oa>)($$0, $$1) -> b(ob.a, $$0, cxa.a($$1)))
      .put(lh.b.d, (BiFunction<dac, dac, oa>)($$0, $$1) -> f(ob.a, $$0, cxa.a($$1)))
      .put(lh.b.e, (BiFunction<dac, dac, oa>)($$0, $$1) -> a($$0, cxa.a($$1)))
      .put(lh.b.f, (BiFunction<dac, dac, oa>)($$0, $$1) -> d($$0, cxa.a($$1)))
      .put(lh.b.g, (BiFunction<dac, dac, oa>)($$0, $$1) -> d($$0, cxa.a($$1)))
      .put(lh.b.h, (BiFunction<dac, dac, oa>)($$0, $$1) -> e($$0, cxa.a($$1)))
      .put(lh.b.i, (BiFunction<dac, dac, oa>)($$0, $$1) -> e($$0, cxa.a($$1)))
      .put(lh.b.k, (BiFunction<dac, dac, oa>)($$0, $$1) -> g($$0, cxa.a($$1)))
      .put(lh.b.l, (BiFunction<dac, dac, oa>)($$0, $$1) -> a(ob.a, $$0, cxa.a($$1)))
      .put(lh.b.m, (BiFunction<dac, dac, oa>)($$0, $$1) -> b($$0, cxa.a($$1)))
      .put(lh.b.n, (BiFunction<dac, dac, oa>)($$0, $$1) -> c(ob.c, $$0, cxa.a($$1)))
      .put(lh.b.o, (BiFunction<dac, dac, oa>)($$0, $$1) -> e(ob.a, $$0, cxa.a($$1)))
      .put(lh.b.p, (BiFunction<dac, dac, oa>)($$0, $$1) -> f($$0, cxa.a($$1)))
      .put(lh.b.q, (BiFunction<dac, dac, oa>)($$0, $$1) -> d(ob.b, $$0, cxa.a($$1)))
      .build();

   public od(lm $$0, CompletableFuture<iy.a> $$1) {
      this.d = $$0.a(lm.b.a, "recipes");
      this.e = $$0.a(lm.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(li $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final li $$0, final iy.a $$1) {
      final Set<akh> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new oc() {
         @Override
         public void a(akh $$0x, cxd<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lk.a($$0, $$1, cxd.h, $$1, od.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(lk.a($$0, $$1, ae.a, $$2.b(), od.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(oa.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(li $$0, iy.a $$1, af $$2) {
      return lk.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(oc var1);

   protected static void a(oc $$0, cnu $$1) {
      lg.a().filter(lh::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(oc $$0, dac $$1, dac $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oc $$0, dac $$1, dac $$2, @Nullable String $$3, int $$4) {
      of.a(ob.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(oc $$0, List<dac> $$1, ob $$2, dac $$3, float $$4, int $$5, String $$6) {
      a($$0, cxh.p, cxs::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(oc $$0, List<dac> $$1, ob $$2, dac $$3, float $$4, int $$5, String $$6) {
      a($$0, cxh.q, cwp::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cwm> void a(oc $$0, cxh<T> $$1, cwm.a<T> $$2, List<dac> $$3, ob $$4, dac $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dac $$10 : $$3) {
         og.a(cxa.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(oc $$0, csu $$1, ob $$2, csu $$3) {
      oi.a(cxa.a(ctc.xs), cxa.a($$1), cxa.a(ctc.oJ), $$2, $$3).a("has_netherite_ingot", a(ctc.oJ)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(oc $$0, csu $$1, akh $$2) {
      oj.a(cxa.a($$1), cxa.a(avz.bm), cxa.a(avz.bn), ob.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(oc $$0, ob $$1, dac $$2, dac $$3) {
      oe.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(oc $$0, ob $$1, dac $$2, dac $$3, String $$4) {
      of.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(oc $$0, ob $$1, dac $$2, dac $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(oc $$0, dac $$1, awg<csu> $$2, int $$3) {
      of.a(ob.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oc $$0, dac $$1, awg<csu> $$2, int $$3) {
      of.a(ob.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(ddg.G)).a($$0);
   }

   protected static void c(oc $$0, dac $$1, dac $$2) {
      of.a(ob.d, $$1).b(ddg.cv).b($$2).b("chest_boat").b("has_boat", a(avz.aN)).a($$0);
   }

   private static oa c(dac $$0, cxa $$1) {
      return of.a(ob.c, $$0).a($$1);
   }

   protected static oa a(dac $$0, cxa $$1) {
      return oe.a(ob.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static oa d(dac $$0, cxa $$1) {
      int $$2 = $$0 == ddg.fo ? 6 : 3;
      csu $$3 = $$0 == ddg.fo ? ctc.ux : ctc.pp;
      return oe.a(ob.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static oa e(dac $$0, cxa $$1) {
      return oe.a(ob.c, $$0).a('#', ctc.pp).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(oc $$0, dac $$1, dac $$2) {
      c(ob.c, $$1, cxa.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static oa c(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(oc $$0, ob $$1, dac $$2, dac $$3) {
      a($$1, $$2, cxa.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static oa a(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static oa b(dac $$0, cxa $$1) {
      return oe.a(ob.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static oa f(dac $$0, cxa $$1) {
      return oe.a(ob.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static oa g(dac $$0, cxa $$1) {
      return oe.a(ob.b, $$0, 3).c("sign").a('#', $$1).a('X', ctc.pp).b("###").b("###").b(" X ");
   }

   protected static void e(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', ctc.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(oc $$0, List<csu> $$1, List<csu> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         csu $$5 = $$1.get($$4);
         csu $$6 = $$2.get($$4);
         of.a(ob.a, $$6)
            .b($$5)
            .a(cxa.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(csz::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1).a('#', $$2).a('X', avz.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1).a('#', $$2).a('|', ctc.pp).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.a, $$1, 8).a('#', ddg.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dac)ddg.aQ)).a($$0);
   }

   protected static void j(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.b, $$1, 8)
         .a('#', ddg.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dac)ddg.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, ddg.eY));
   }

   protected static void l(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.a, $$1, 8).a('#', ddg.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dac)ddg.iA)).a($$0);
   }

   protected static void m(oc $$0, dac $$1, dac $$2) {
      of.a(ob.a, $$1, 8).b($$2).a(ddg.I, 4).a(ddg.L, 4).b("concrete_powder").b("has_sand", a((dac)ddg.I)).b("has_gravel", a((dac)ddg.L)).a($$0);
   }

   protected static void n(oc $$0, dac $$1, dac $$2) {
      of.a(ob.b, $$1).b(ddg.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(oc $$0, ob $$1, dac $$2, dac $$3) {
      d($$1, $$2, cxa.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oa d(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(oc $$0, ob $$1, dac $$2, dac $$3) {
      e($$1, $$2, cxa.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oa e(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(oc $$0, ob $$1, dac $$2, dac $$3) {
      f($$1, $$2, cxa.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static oe f(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(oc $$0, ob $$1, dac $$2, dac $$3) {
      b($$1, $$2, cxa.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(oc $$0, ob $$1, dac $$2, dac $$3) {
      oe.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static oe b(ob $$0, dac $$1, cxa $$2) {
      return oe.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(oc $$0, ob $$1, dac $$2, dac $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oc $$0, ob $$1, dac $$2, dac $$3, int $$4) {
      oh.a(cxa.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(oc $$0, dac $$1, dac $$2) {
      og.c(cxa.a($$2), ob.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(oc $$0, ob $$1, dac $$2, ob $$3, dac $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(oc $$0, ob $$1, dac $$2, ob $$3, dac $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(oc $$0, ob $$1, dac $$2, ob $$3, dac $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(oc $$0, ob $$1, dac $$2, ob $$3, dac $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      of.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akh($$7));
      oe.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akh($$5));
   }

   protected static void a(oc $$0, dac $$1, awg<csu> $$2) {
      oe.a(ob.i, $$1, 2).a('#', ctc.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(oc $$0, dac $$1, dac $$2) {
      oe.a(ob.i, $$1, 2).a('#', ctc.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cwm> void a(oc $$0, String $$1, cxh<T> $$2, cwm.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, ctc.sa, ctc.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.sc, ctc.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.qZ, ctc.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.dK, ctc.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, ctc.ra, ctc.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.uN, ctc.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.pX, ctc.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.ug, ctc.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctc.uA, ctc.uB, 0.35F);
   }

   private static <T extends cwm> void a(oc $$0, String $$1, cxh<T> $$2, cwm.a<T> $$3, int $$4, dac $$5, dac $$6, float $$7) {
      og.a(cxa.a($$5), ob.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(oc $$0, cnu $$1) {
      csp.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            of.a(ob.a, $$3).b($$2).b(ctc.ww).b(c($$3)).b(b($$2), a((dac)$$2)).a($$0, a($$3, ctc.ww));
         }
      });
   }

   protected static void a(oc $$0, dde $$1, dde $$2) {
      oe.a(ob.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dac)$$2)).a($$0);
   }

   protected static void b(oc $$0, dde $$1, dde $$2) {
      oe.a(ob.c, $$1, 4).a('C', $$2).a('R', ctc.lH).a('B', ctc.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dac)$$2)).a($$0);
   }

   protected static void a(oc $$0, lh $$1, cnu $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<dac, dac, oa> $$5 = g.get($$3);
            dac $$6 = a($$1, $$3);
            if ($$5 != null) {
               oa $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lh.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lh.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dde a(lh $$0, lh.b $$1) {
      if ($$1 == lh.b.b) {
         if (!$$0.b().containsKey(lh.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lh.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dde $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<cb.a> a(ct.d $$0, dac $$1) {
      return a(ch.a.a().a($$1).a($$0));
   }

   protected static an<cb.a> a(dac $$0) {
      return a(ch.a.a().a($$0));
   }

   protected static an<cb.a> a(awg<csu> $$0) {
      return a(ch.a.a().a($$0));
   }

   private static an<cb.a> a(ch.a... $$0) {
      return a(Arrays.stream($$0).map(ch.a::b).toArray(ch[]::new));
   }

   private static an<cb.a> a(ch... $$0) {
      return am.f.a(new cb.a(Optional.empty(), cb.a.a.b, List.of($$0)));
   }

   protected static String b(dac $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dac $$0) {
      return ld.h.b($$0.q()).a();
   }

   protected static String d(dac $$0) {
      return c($$0);
   }

   protected static String a(dac $$0, dac $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dac $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dac $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
