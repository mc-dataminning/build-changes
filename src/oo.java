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

public abstract class oo implements ma {
   final mc.a d;
   final mc.a e;
   private final CompletableFuture<jo.a> f;
   private static final Map<lx.b, BiFunction<dcv, dcv, ol>> g = ImmutableMap.builder()
      .put(lx.b.a, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> d($$0, cyw.a($$1)))
      .put(lx.b.b, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> b(om.a, $$0, cyw.a($$1)))
      .put(lx.b.d, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> f(om.a, $$0, cyw.a($$1)))
      .put(lx.b.e, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> a($$0, cyw.a($$1)))
      .put(lx.b.f, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> e($$0, cyw.a($$1)))
      .put(lx.b.g, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> e($$0, cyw.a($$1)))
      .put(lx.b.h, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> f($$0, cyw.a($$1)))
      .put(lx.b.i, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> f($$0, cyw.a($$1)))
      .put(lx.b.k, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> g($$0, cyw.a($$1)))
      .put(lx.b.l, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> a(om.a, $$0, cyw.a($$1)))
      .put(lx.b.m, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> b($$0, cyw.a($$1)))
      .put(lx.b.n, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> c(om.c, $$0, cyw.a($$1)))
      .put(lx.b.o, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> e(om.a, $$0, cyw.a($$1)))
      .put(lx.b.p, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> c($$0, cyw.a($$1)))
      .put(lx.b.q, (BiFunction<dcv, dcv, ol>)($$0, $$1) -> d(om.b, $$0, cyw.a($$1)))
      .build();

   public oo(mc $$0, CompletableFuture<jo.a> $$1) {
      this.d = $$0.a(lu.bg);
      this.e = $$0.a(lu.bf);
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(ly $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final ly $$0, final jo.a $$1) {
      final Set<akr> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new on() {
         @Override
         public void a(akr $$0x, cyz<?> $$1x, @Nullable ag $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(ma.a($$0, $$1, cyz.h, $$1, oo.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(ma.a($$0, $$1, af.a, $$2.b(), oo.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public af.a a() {
            return af.a.b().a(ol.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ly $$0, jo.a $$1, ag $$2) {
      return ma.a($$0, $$1, af.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(on var1);

   protected static void a(on $$0, cpl $$1) {
      lw.a().filter(lx::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(on $$0, dcv $$1, dcv $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(on $$0, dcv $$1, dcv $$2, @Nullable String $$3, int $$4) {
      oq.a(om.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(on $$0, List<dcv> $$1, om $$2, dcv $$3, float $$4, int $$5, String $$6) {
      a($$0, cze.p, czq::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(on $$0, List<dcv> $$1, om $$2, dcv $$3, float $$4, int $$5, String $$6) {
      a($$0, cze.q, cyk::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cyh> void a(on $$0, cze<T> $$1, cyh.a<T> $$2, List<dcv> $$3, om $$4, dcv $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dcv $$10 : $$3) {
         or.a(cyw.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(on $$0, cul $$1, om $$2, cul $$3) {
      ot.a(cyw.a(cut.xv), cyw.a($$1), cyw.a(cut.oK), $$2, $$3).a("has_netherite_ingot", a(cut.oK)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(on $$0, cul $$1, akr $$2) {
      ou.a(cyw.a($$1), cyw.a(awn.bl), cyw.a(awn.bm), om.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(on $$0, om $$1, dcv $$2, dcv $$3) {
      op.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(on $$0, om $$1, dcv $$2, dcv $$3, String $$4) {
      oq.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(on $$0, om $$1, dcv $$2, dcv $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(on $$0, dcv $$1, awu<cul> $$2, int $$3) {
      oq.a(om.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(on $$0, dcv $$1, awu<cul> $$2, int $$3) {
      oq.a(om.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(on $$0, dcv $$1, dcv $$2) {
      op.a(om.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(on $$0, dcv $$1, dcv $$2) {
      op.a(om.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dga.G)).a($$0);
   }

   protected static void c(on $$0, dcv $$1, dcv $$2) {
      oq.a(om.d, $$1).b(dga.cv).b($$2).b("chest_boat").b("has_boat", a(awn.aN)).a($$0);
   }

   private static ol d(dcv $$0, cyw $$1) {
      return oq.a(om.c, $$0).a($$1);
   }

   protected static ol a(dcv $$0, cyw $$1) {
      return op.a(om.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static ol e(dcv $$0, cyw $$1) {
      int $$2 = $$0 == dga.fo ? 6 : 3;
      cul $$3 = $$0 == dga.fo ? cut.ux : cut.pq;
      return op.a(om.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static ol f(dcv $$0, cyw $$1) {
      return op.a(om.c, $$0).a('#', cut.pq).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(on $$0, dcv $$1, dcv $$2) {
      c(om.c, $$1, cyw.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static ol c(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(on $$0, om $$1, dcv $$2, dcv $$3) {
      a($$1, $$2, cyw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static ol a(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static ol b(dcv $$0, cyw $$1) {
      return op.a(om.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected static ol c(dcv $$0, cyw $$1) {
      return op.a(om.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static ol g(dcv $$0, cyw $$1) {
      return op.a(om.b, $$0, 3).c("sign").a('#', $$1).a('X', cut.pq).b("###").b("###").b(" X ");
   }

   protected static void e(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cut.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(on $$0, List<cul> $$1, List<cul> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cul $$5 = $$1.get($$4);
         cul $$6 = $$2.get($$4);
         oq.a(om.a, $$6)
            .b($$5)
            .a(cyw.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cuq::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1).a('#', $$2).a('X', awn.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1).a('#', $$2).a('|', cut.pq).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(on $$0, dcv $$1, dcv $$2) {
      op.a(om.a, $$1, 8).a('#', dga.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dcv)dga.aQ)).a($$0);
   }

   protected static void j(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(on $$0, dcv $$1, dcv $$2) {
      op.a(om.b, $$1, 8)
         .a('#', dga.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dcv)dga.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dga.eY));
   }

   protected static void l(on $$0, dcv $$1, dcv $$2) {
      op.a(om.a, $$1, 8).a('#', dga.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dcv)dga.iA)).a($$0);
   }

   protected static void m(on $$0, dcv $$1, dcv $$2) {
      oq.a(om.a, $$1, 8).b($$2).a(dga.I, 4).a(dga.L, 4).b("concrete_powder").b("has_sand", a((dcv)dga.I)).b("has_gravel", a((dcv)dga.L)).a($$0);
   }

   protected static void n(on $$0, dcv $$1, dcv $$2) {
      oq.a(om.b, $$1).b(dga.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(on $$0, om $$1, dcv $$2, dcv $$3) {
      d($$1, $$2, cyw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ol d(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(on $$0, om $$1, dcv $$2, dcv $$3) {
      e($$1, $$2, cyw.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ol e(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(on $$0, om $$1, dcv $$2, dcv $$3) {
      f($$1, $$2, cyw.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static op f(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(on $$0, om $$1, dcv $$2, dcv $$3) {
      b($$1, $$2, cyw.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(on $$0, om $$1, dcv $$2, dcv $$3) {
      op.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static op b(om $$0, dcv $$1, cyw $$2) {
      return op.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(on $$0, om $$1, dcv $$2, dcv $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(on $$0, om $$1, dcv $$2, dcv $$3, int $$4) {
      os.a(cyw.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(on $$0, dcv $$1, dcv $$2) {
      or.c(cyw.a($$2), om.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(on $$0, om $$1, dcv $$2, om $$3, dcv $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(on $$0, om $$1, dcv $$2, om $$3, dcv $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(on $$0, om $$1, dcv $$2, om $$3, dcv $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(on $$0, om $$1, dcv $$2, om $$3, dcv $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      oq.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, akr.a($$7));
      op.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, akr.a($$5));
   }

   protected static void a(on $$0, dcv $$1, awu<cul> $$2) {
      op.a(om.i, $$1, 2).a('#', cut.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(on $$0, dcv $$1, dcv $$2) {
      op.a(om.i, $$1, 2).a('#', cut.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(on $$0, dcv $$1, cyw $$2) {
      op.a(om.i, $$1, 2).a('#', cut.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cyh> void a(on $$0, String $$1, cze<T> $$2, cyh.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cut.sa, cut.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.sc, cut.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.qZ, cut.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.dK, cut.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cut.ra, cut.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.uN, cut.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.pX, cut.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.ug, cut.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cut.uA, cut.uB, 0.35F);
   }

   private static <T extends cyh> void a(on $$0, String $$1, cze<T> $$2, cyh.a<T> $$3, int $$4, dcv $$5, dcv $$6, float $$7) {
      or.a(cyw.a($$5), om.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(on $$0, cpl $$1) {
      cug.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            oq.a(om.a, $$3).b($$2).b(cut.wz).b(c($$3)).b(b($$2), a((dcv)$$2)).a($$0, a($$3, cut.wz));
         }
      });
   }

   protected static void a(on $$0, dfy $$1, dfy $$2) {
      op.a(om.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dcv)$$2)).a($$0);
   }

   protected static void b(on $$0, dfy $$1, dfy $$2) {
      op.a(om.c, $$1, 4).a('C', $$2).a('R', cut.lH).a('B', cut.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dcv)$$2)).a($$0);
   }

   protected static void a(on $$0, lx $$1, cpl $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<dcv, dcv, ol> $$5 = g.get($$3);
            dcv $$6 = a($$1, $$3);
            if ($$5 != null) {
               ol $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lx.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lx.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dfy a(lx $$0, lx.b $$1) {
      if ($$1 == lx.b.b) {
         if (!$$0.b().containsKey(lx.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lx.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dfy $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private static ao<cg.a> a(dh.d $$0, dcv $$1) {
      return a(cs.a.a().a($$1).a($$0));
   }

   protected static ao<cg.a> a(dcv $$0) {
      return a(cs.a.a().a($$0));
   }

   protected static ao<cg.a> a(awu<cul> $$0) {
      return a(cs.a.a().a($$0));
   }

   private static ao<cg.a> a(cs.a... $$0) {
      return a(Arrays.stream($$0).map(cs.a::b).toArray(cs[]::new));
   }

   private static ao<cg.a> a(cs... $$0) {
      return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
   }

   protected static String b(dcv $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dcv $$0) {
      return lt.g.b($$0.r()).a();
   }

   protected static String d(dcv $$0) {
      return c($$0);
   }

   protected static String a(dcv $$0, dcv $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dcv $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dcv $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
