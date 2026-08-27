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

public abstract class oc implements lj {
   final ll.a d;
   final ll.a e;
   private final CompletableFuture<ix.a> f;
   private static final Map<lg.b, BiFunction<czt, czt, nz>> g = ImmutableMap.builder()
      .put(lg.b.a, (BiFunction<czt, czt, nz>)($$0, $$1) -> c($$0, cwd.a($$1)))
      .put(lg.b.b, (BiFunction<czt, czt, nz>)($$0, $$1) -> b(oa.a, $$0, cwd.a($$1)))
      .put(lg.b.d, (BiFunction<czt, czt, nz>)($$0, $$1) -> f(oa.a, $$0, cwd.a($$1)))
      .put(lg.b.e, (BiFunction<czt, czt, nz>)($$0, $$1) -> a($$0, cwd.a($$1)))
      .put(lg.b.f, (BiFunction<czt, czt, nz>)($$0, $$1) -> d($$0, cwd.a($$1)))
      .put(lg.b.g, (BiFunction<czt, czt, nz>)($$0, $$1) -> d($$0, cwd.a($$1)))
      .put(lg.b.h, (BiFunction<czt, czt, nz>)($$0, $$1) -> e($$0, cwd.a($$1)))
      .put(lg.b.i, (BiFunction<czt, czt, nz>)($$0, $$1) -> e($$0, cwd.a($$1)))
      .put(lg.b.k, (BiFunction<czt, czt, nz>)($$0, $$1) -> g($$0, cwd.a($$1)))
      .put(lg.b.l, (BiFunction<czt, czt, nz>)($$0, $$1) -> a(oa.a, $$0, cwd.a($$1)))
      .put(lg.b.m, (BiFunction<czt, czt, nz>)($$0, $$1) -> b($$0, cwd.a($$1)))
      .put(lg.b.n, (BiFunction<czt, czt, nz>)($$0, $$1) -> c(oa.c, $$0, cwd.a($$1)))
      .put(lg.b.o, (BiFunction<czt, czt, nz>)($$0, $$1) -> e(oa.a, $$0, cwd.a($$1)))
      .put(lg.b.p, (BiFunction<czt, czt, nz>)($$0, $$1) -> f($$0, cwd.a($$1)))
      .put(lg.b.q, (BiFunction<czt, czt, nz>)($$0, $$1) -> d(oa.b, $$0, cwd.a($$1)))
      .build();

   public oc(ll $$0, CompletableFuture<ix.a> $$1) {
      this.d = $$0.a(ll.b.a, "recipes");
      this.e = $$0.a(ll.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(lh $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final lh $$0, final ix.a $$1) {
      final Set<akf> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new ob() {
         @Override
         public void a(akf $$0x, cwg<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lj.a($$0, $$1, cwg.h, $$1, oc.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(lj.a($$0, $$1, ae.a, $$2.b(), oc.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(nz.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(lh $$0, ix.a $$1, af $$2) {
      return lj.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(ob var1);

   protected static void a(ob $$0, cmy $$1) {
      lf.a().filter(lg::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(ob $$0, czt $$1, czt $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ob $$0, czt $$1, czt $$2, @Nullable String $$3, int $$4) {
      oe.a(oa.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(ob $$0, List<czt> $$1, oa $$2, czt $$3, float $$4, int $$5, String $$6) {
      a($$0, cwk.p, cwv::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(ob $$0, List<czt> $$1, oa $$2, czt $$3, float $$4, int $$5, String $$6) {
      a($$0, cwk.q, cvs::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cvp> void a(ob $$0, cwk<T> $$1, cvp.a<T> $$2, List<czt> $$3, oa $$4, czt $$5, float $$6, int $$7, String $$8, String $$9) {
      for (czt $$10 : $$3) {
         of.a(cwd.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(ob $$0, cry $$1, oa $$2, cry $$3) {
      oh.a(cwd.a(csg.xs), cwd.a($$1), cwd.a(csg.oJ), $$2, $$3).a("has_netherite_ingot", a(csg.oJ)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(ob $$0, cry $$1, akf $$2) {
      oi.a(cwd.a($$1), cwd.a(avw.aM), cwd.a(avw.aN), oa.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(ob $$0, oa $$1, czt $$2, czt $$3) {
      od.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(ob $$0, oa $$1, czt $$2, czt $$3, String $$4) {
      oe.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(ob $$0, oa $$1, czt $$2, czt $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(ob $$0, czt $$1, awd<cry> $$2, int $$3) {
      oe.a(oa.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ob $$0, czt $$1, awd<cry> $$2, int $$3) {
      oe.a(oa.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(ob $$0, czt $$1, czt $$2) {
      od.a(oa.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ob $$0, czt $$1, czt $$2) {
      od.a(oa.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dcx.G)).a($$0);
   }

   protected static void c(ob $$0, czt $$1, czt $$2) {
      oe.a(oa.d, $$1).b(dcx.cv).b($$2).b("chest_boat").b("has_boat", a(avw.am)).a($$0);
   }

   private static nz c(czt $$0, cwd $$1) {
      return oe.a(oa.c, $$0).a($$1);
   }

   protected static nz a(czt $$0, cwd $$1) {
      return od.a(oa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static nz d(czt $$0, cwd $$1) {
      int $$2 = $$0 == dcx.fo ? 6 : 3;
      cry $$3 = $$0 == dcx.fo ? csg.ux : csg.pp;
      return od.a(oa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static nz e(czt $$0, cwd $$1) {
      return od.a(oa.c, $$0).a('#', csg.pp).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(ob $$0, czt $$1, czt $$2) {
      c(oa.c, $$1, cwd.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static nz c(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(ob $$0, oa $$1, czt $$2, czt $$3) {
      a($$1, $$2, cwd.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static nz a(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static nz b(czt $$0, cwd $$1) {
      return od.a(oa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static nz f(czt $$0, cwd $$1) {
      return od.a(oa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static nz g(czt $$0, cwd $$1) {
      return od.a(oa.b, $$0, 3).c("sign").a('#', $$1).a('X', csg.pp).b("###").b("###").b(" X ");
   }

   protected static void e(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', csg.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(ob $$0, List<cry> $$1, List<cry> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cry $$5 = $$1.get($$4);
         cry $$6 = $$2.get($$4);
         oe.a(oa.a, $$6)
            .b($$5)
            .a(cwd.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(csd::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1).a('#', $$2).a('X', avw.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1).a('#', $$2).a('|', csg.pp).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(ob $$0, czt $$1, czt $$2) {
      od.a(oa.a, $$1, 8).a('#', dcx.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((czt)dcx.aQ)).a($$0);
   }

   protected static void j(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(ob $$0, czt $$1, czt $$2) {
      od.a(oa.b, $$1, 8)
         .a('#', dcx.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((czt)dcx.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dcx.eY));
   }

   protected static void l(ob $$0, czt $$1, czt $$2) {
      od.a(oa.a, $$1, 8).a('#', dcx.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((czt)dcx.iA)).a($$0);
   }

   protected static void m(ob $$0, czt $$1, czt $$2) {
      oe.a(oa.a, $$1, 8).b($$2).a(dcx.I, 4).a(dcx.L, 4).b("concrete_powder").b("has_sand", a((czt)dcx.I)).b("has_gravel", a((czt)dcx.L)).a($$0);
   }

   protected static void n(ob $$0, czt $$1, czt $$2) {
      oe.a(oa.b, $$1).b(dcx.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(ob $$0, oa $$1, czt $$2, czt $$3) {
      d($$1, $$2, cwd.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nz d(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(ob $$0, oa $$1, czt $$2, czt $$3) {
      e($$1, $$2, cwd.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nz e(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(ob $$0, oa $$1, czt $$2, czt $$3) {
      f($$1, $$2, cwd.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static od f(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(ob $$0, oa $$1, czt $$2, czt $$3) {
      b($$1, $$2, cwd.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(ob $$0, oa $$1, czt $$2, czt $$3) {
      od.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static od b(oa $$0, czt $$1, cwd $$2) {
      return od.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(ob $$0, oa $$1, czt $$2, czt $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ob $$0, oa $$1, czt $$2, czt $$3, int $$4) {
      og.a(cwd.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(ob $$0, czt $$1, czt $$2) {
      of.c(cwd.a($$2), oa.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(ob $$0, oa $$1, czt $$2, oa $$3, czt $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(ob $$0, oa $$1, czt $$2, oa $$3, czt $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(ob $$0, oa $$1, czt $$2, oa $$3, czt $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(ob $$0, oa $$1, czt $$2, oa $$3, czt $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      oe.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akf($$7));
      od.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akf($$5));
   }

   protected static void a(ob $$0, czt $$1, awd<cry> $$2) {
      od.a(oa.i, $$1, 2).a('#', csg.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(ob $$0, czt $$1, czt $$2) {
      od.a(oa.i, $$1, 2).a('#', csg.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cvp> void a(ob $$0, String $$1, cwk<T> $$2, cvp.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, csg.sa, csg.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.sc, csg.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.qZ, csg.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.dK, csg.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, csg.ra, csg.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.uN, csg.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.pX, csg.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.ug, csg.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, csg.uA, csg.uB, 0.35F);
   }

   private static <T extends cvp> void a(ob $$0, String $$1, cwk<T> $$2, cvp.a<T> $$3, int $$4, czt $$5, czt $$6, float $$7) {
      of.a(cwd.a($$5), oa.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(ob $$0, cmy $$1) {
      crt.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            oe.a(oa.a, $$3).b($$2).b(csg.ww).b(c($$3)).b(b($$2), a((czt)$$2)).a($$0, a($$3, csg.ww));
         }
      });
   }

   protected static void a(ob $$0, dcv $$1, dcv $$2) {
      od.a(oa.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((czt)$$2)).a($$0);
   }

   protected static void b(ob $$0, dcv $$1, dcv $$2) {
      od.a(oa.c, $$1, 4).a('C', $$2).a('R', csg.lH).a('B', csg.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((czt)$$2)).a($$0);
   }

   protected static void a(ob $$0, lg $$1, cmy $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<czt, czt, nz> $$5 = g.get($$3);
            czt $$6 = a($$1, $$3);
            if ($$5 != null) {
               nz $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lg.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lg.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dcv a(lg $$0, lg.b $$1) {
      if ($$1 == lg.b.b) {
         if (!$$0.b().containsKey(lg.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lg.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dcv $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cs.d $$0, czt $$1) {
      return a(cg.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(czt $$0) {
      return a(cg.a.a().a($$0));
   }

   protected static an<ca.a> a(awd<cry> $$0) {
      return a(cg.a.a().a($$0));
   }

   private static an<ca.a> a(cg.a... $$0) {
      return a(Arrays.stream($$0).map(cg.a::b).toArray(cg[]::new));
   }

   private static an<ca.a> a(cg... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(czt $$0) {
      return "has_" + c($$0);
   }

   protected static String c(czt $$0) {
      return lc.h.b($$0.p()).a();
   }

   protected static String d(czt $$0) {
      return c($$0);
   }

   protected static String a(czt $$0, czt $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(czt $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(czt $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
