import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class og {
   protected final jg.a a;
   private final jf<cyu> c;
   protected final of b;
   private static final Map<mj.b, og.a> d = ImmutableMap.builder()
      .put(mj.b.a, (og.a)($$0, $$1, $$2) -> $$0.e($$1, ddl.a($$2)))
      .put(mj.b.b, (og.a)($$0, $$1, $$2) -> $$0.b(oe.a, $$1, ddl.a($$2)))
      .put(mj.b.d, (og.a)($$0, $$1, $$2) -> $$0.f(oe.a, $$1, ddl.a($$2)))
      .put(mj.b.e, (og.a)($$0, $$1, $$2) -> $$0.a($$1, ddl.a($$2)))
      .put(mj.b.f, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddl.a($$2)))
      .put(mj.b.g, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddl.a($$2)))
      .put(mj.b.h, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddl.a($$2)))
      .put(mj.b.i, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddl.a($$2)))
      .put(mj.b.k, (og.a)($$0, $$1, $$2) -> $$0.h($$1, ddl.a($$2)))
      .put(mj.b.l, (og.a)($$0, $$1, $$2) -> $$0.a(oe.a, $$1, ddl.a($$2)))
      .put(mj.b.m, (og.a)($$0, $$1, $$2) -> $$0.b($$1, ddl.a($$2)))
      .put(mj.b.n, (og.a)($$0, $$1, $$2) -> $$0.c(oe.c, $$1, ddl.a($$2)))
      .put(mj.b.o, (og.a)($$0, $$1, $$2) -> $$0.e(oe.a, $$1, ddl.a($$2)))
      .put(mj.b.p, (og.a)($$0, $$1, $$2) -> $$0.c($$1, ddl.a($$2)))
      .put(mj.b.q, (og.a)($$0, $$1, $$2) -> $$0.d(oe.b, $$1, ddl.a($$2)))
      .build();

   protected og(jg.a $$0, of $$1) {
      this.a = $$0;
      this.c = $$0.e(mg.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cuh $$0) {
      mi.a().filter(mj::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(diu $$0, diu $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(diu $$0, diu $$1, @Nullable String $$2, int $$3) {
      this.b(oe.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<diu> $$0, oe $$1, diu $$2, float $$3, int $$4, String $$5) {
      this.a(ddz.o, dej::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<diu> $$0, oe $$1, diu $$2, float $$3, int $$4, String $$5) {
      this.a(ddz.p, dcy::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dcv> void a(ddz<T> $$0, dcv.a<T> $$1, List<diu> $$2, oe $$3, diu $$4, float $$5, int $$6, String $$7, String $$8) {
      for (diu $$9 : $$2) {
         oj.a(ddl.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cyu $$0, oe $$1, cyu $$2) {
      ol.a(ddl.a(czc.yC), ddl.a($$0), this.b(axk.bg), $$1, $$2).a("has_netherite_ingot", this.a(axk.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cyu $$0, alf<dhn> $$1, alf<ddp<?>> $$2) {
      je.c<dhn> $$3 = this.a.e(mg.bk).b($$1);
      om.a(ddl.a($$0), this.b(axk.bC), this.b(axk.bD), $$3, oe.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(oe $$0, diu $$1, diu $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oe $$0, diu $$1, diu $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oe $$0, diu $$1, diu $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(diu $$0, axr<cyu> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(diu $$0, axr<cyu> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(diu $$0, diu $$1) {
      this.a(oe.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(diu $$0, diu $$1) {
      this.a(oe.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dmc.J)).a(this.b);
   }

   protected void c(diu $$0, diu $$1) {
      this.b(oe.d, $$0).b(dmc.cE).b($$1).b("chest_boat").b("has_boat", this.a(axk.aR)).a(this.b);
   }

   private od e(diu $$0, ddl $$1) {
      return this.b(oe.c, $$0).a($$1);
   }

   protected od a(diu $$0, ddl $$1) {
      return this.a(oe.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private od f(diu $$0, ddl $$1) {
      int $$2 = $$0 == dmc.fK ? 6 : 3;
      cyu $$3 = $$0 == dmc.fK ? czc.vC : czc.qb;
      return this.a(oe.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private od g(diu $$0, ddl $$1) {
      return this.a(oe.c, $$0).a('#', czc.qb).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(diu $$0, diu $$1) {
      this.c(oe.c, $$0, ddl.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private od c(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oe $$0, diu $$1, diu $$2) {
      this.a($$0, $$1, ddl.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected od a(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected od b(diu $$0, ddl $$1) {
      return this.a(oe.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected od c(diu $$0, ddl $$1) {
      return this.a(oe.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private od h(diu $$0, ddl $$1) {
      return this.a(oe.b, $$0, 3).c("sign").a('#', $$1).a('X', czc.qb).b("###").b("###").b(" X ");
   }

   protected void e(diu $$0, diu $$1) {
      this.a(oe.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', czc.gl).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cyu> $$0, List<cyu> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oe.a);
   }

   protected void a(List<cyu> $$0, List<cyu> $$1, @Nullable cyu $$2, String $$3, oe $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cyu $$6 = $$0.get($$5);
         cyu $$7 = $$1.get($$5);
         Stream<cyu> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(ddl.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(diu $$0, diu $$1) {
      this.a(oe.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(diu $$0, diu $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('X', axk.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(diu $$0, diu $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('|', czc.qb).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(diu $$0, diu $$1) {
      this.a(oe.a, $$0, 8).a('#', dmc.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((diu)dmc.aX)).a(this.b);
   }

   protected void j(diu $$0, diu $$1) {
      this.a(oe.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(diu $$0, diu $$1) {
      this.a(oe.b, $$0, 8)
         .a('#', dmc.fn)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((diu)dmc.fn))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dmc.fn));
   }

   protected void l(diu $$0, diu $$1) {
      this.a(oe.a, $$0, 8).a('#', dmc.iZ).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((diu)dmc.iZ)).a(this.b);
   }

   protected void m(diu $$0, diu $$1) {
      this.b(oe.a, $$0, 8).b($$1).a(dmc.L, 4).a(dmc.O, 4).b("concrete_powder").b("has_sand", this.a((diu)dmc.L)).b("has_gravel", this.a((diu)dmc.O)).a(this.b);
   }

   protected void n(diu $$0, diu $$1) {
      this.b(oe.b, $$0).b(dmc.qq).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oe $$0, diu $$1, diu $$2) {
      this.d($$0, $$1, ddl.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od d(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oe $$0, diu $$1, diu $$2) {
      this.e($$0, $$1, ddl.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od e(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oe $$0, diu $$1, diu $$2) {
      this.f($$0, $$1, ddl.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oh f(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oe $$0, diu $$1, diu $$2) {
      this.b($$0, $$1, ddl.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oe $$0, diu $$1, diu $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oh b(oe $$0, diu $$1, ddl $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oe $$0, diu $$1, diu $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oe $$0, diu $$1, diu $$2, int $$3) {
      ok.a(ddl.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(diu $$0, diu $$1) {
      oj.c(ddl.a($$1), oe.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oe $$0, diu $$1, oe $$2, diu $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oe $$0, diu $$1, oe $$2, diu $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oe $$0, diu $$1, oe $$2, diu $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oe $$0, diu $$1, oe $$2, diu $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alf.a(mg.bt, alg.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alf.a(mg.bt, alg.a($$4)));
   }

   protected void o(diu $$0, diu $$1) {
      this.a(oe.i, $$0, 2).a('#', czc.pk).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(diu $$0, ddl $$1) {
      this.a(oe.i, $$0, 2).a('#', czc.pk).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dcv> void a(String $$0, ddz<T> $$1, dcv.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, czc.td, czc.te, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.tf, czc.tg, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.sc, czc.sg, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.dV, czc.ta, 0.1F);
      this.a($$0, $$1, $$2, $$3, czc.sd, czc.sh, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.vT, czc.vU, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.qI, czc.qJ, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.vl, czc.vm, 0.35F);
      this.a($$0, $$1, $$2, $$3, czc.vG, czc.vH, 0.35F);
   }

   private <T extends dcv> void a(String $$0, ddz<T> $$1, dcv.a<T> $$2, int $$3, diu $$4, diu $$5, float $$6) {
      oj.a(ddl.a($$4), oe.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cuh $$0) {
      cyp.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(oe.a, $$2).b($$1).b(czc.xG).b(c($$2)).b(b($$1), this.a((diu)$$1)).a(this.b, p($$2, czc.xG));
         }
      });
   }

   protected void a(dma $$0, dma $$1) {
      this.a(oe.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((diu)$$1)).a(this.b);
   }

   protected void b(dma $$0, dma $$1) {
      this.a(oe.c, $$0, 4).a('C', $$1).a('R', czc.mi).a('B', czc.tj).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((diu)$$1)).a(this.b);
   }

   protected void a(cyu $$0, duk $$1) {
      cyy $$2 = new cyy(czc.xc.e(), 1, kh.a().a(kj.T, $$1.c()).a());
      this.a(oe.g, $$2).b(czc.pe).b(czc.dL).b(czc.dM).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mj $$0, cuh $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            og.a $$4 = d.get($$2);
            diu $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               od $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mj.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mj.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dma a(mj $$0, mj.b $$1) {
      if ($$1 == mj.b.b) {
         if (!$$0.b().containsKey(mj.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mj.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static aq<bt.a> a(dma $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(cv.d $$0, diu $$1) {
      return a(cl.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(diu $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axr<cyu> $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cl.a... $$0) {
      return a(Arrays.stream($$0).map(cl.a::b).toArray(cl[]::new));
   }

   private static aq<cj.a> a(cl... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(diu $$0) {
      return "has_" + c($$0);
   }

   protected static String c(diu $$0) {
      return mf.g.b($$0.h()).a();
   }

   protected static String d(diu $$0) {
      return c($$0);
   }

   protected static String p(diu $$0, diu $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(diu $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(diu $$0) {
      return c($$0) + "_from_blasting";
   }

   protected ddl b(axr<cyu> $$0) {
      return ddl.a(this.c.b($$0));
   }

   protected oh a(oe $$0, diu $$1) {
      return oh.a(this.c, $$0, $$1);
   }

   protected oh a(oe $$0, diu $$1, int $$2) {
      return oh.a(this.c, $$0, $$1, $$2);
   }

   protected oi a(oe $$0, cyy $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, diu $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, diu $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      od create(og var1, diu var2, diu var3);
   }

   protected abstract static class b implements mm {
      private final mo d;
      private final CompletableFuture<jg.a> e;

      protected b(mo $$0, CompletableFuture<jg.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mk $$0) {
         return this.e.thenCompose($$1 -> {
            final mo.a $$2 = this.d.a(mg.bt);
            final mo.a $$3 = this.d.a(mg.bs);
            final Set<alf<ddp<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            of $$6 = new of() {
               @Override
               public void a(alf<ddp<?>> $$0x, ddp<?> $$1x, @Nullable ai $$2x) {
                  if (!$$4.add($$0)) {
                     throw new IllegalStateException("Duplicate recipe " + $$0.a());
                  } else {
                     this.a($$0, $$1);
                     if ($$2 != null) {
                        this.a($$2);
                     }
                  }
               }

               @Override
               public ah.a a() {
                  return ah.a.b().a(od.a);
               }

               @Override
               public void b() {
                  ai $$0 = ah.a.b().a("impossible", ap.b.a(new ch.a())).b(od.a);
                  this.a($$0);
               }

               private void a(alf<ddp<?>> $$0x, ddp<?> $$1x) {
                  $$5.add(mm.a($$0, $$1, ddp.a, $$1, $$2.a($$0.a())));
               }

               private void a(ai $$0x) {
                  $$5.add(mm.a($$0, $$1, ah.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract og a(jg.a var1, of var2);
   }
}
