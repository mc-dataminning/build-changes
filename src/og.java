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
   private final jf<cyz> c;
   protected final of b;
   private static final Map<mj.b, og.a> d = ImmutableMap.builder()
      .put(mj.b.a, (og.a)($$0, $$1, $$2) -> $$0.e($$1, ddq.a($$2)))
      .put(mj.b.b, (og.a)($$0, $$1, $$2) -> $$0.b(oe.a, $$1, ddq.a($$2)))
      .put(mj.b.d, (og.a)($$0, $$1, $$2) -> $$0.f(oe.a, $$1, ddq.a($$2)))
      .put(mj.b.e, (og.a)($$0, $$1, $$2) -> $$0.a($$1, ddq.a($$2)))
      .put(mj.b.f, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddq.a($$2)))
      .put(mj.b.g, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddq.a($$2)))
      .put(mj.b.h, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddq.a($$2)))
      .put(mj.b.i, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddq.a($$2)))
      .put(mj.b.k, (og.a)($$0, $$1, $$2) -> $$0.h($$1, ddq.a($$2)))
      .put(mj.b.l, (og.a)($$0, $$1, $$2) -> $$0.a(oe.a, $$1, ddq.a($$2)))
      .put(mj.b.m, (og.a)($$0, $$1, $$2) -> $$0.b($$1, ddq.a($$2)))
      .put(mj.b.n, (og.a)($$0, $$1, $$2) -> $$0.c(oe.c, $$1, ddq.a($$2)))
      .put(mj.b.o, (og.a)($$0, $$1, $$2) -> $$0.e(oe.a, $$1, ddq.a($$2)))
      .put(mj.b.p, (og.a)($$0, $$1, $$2) -> $$0.c($$1, ddq.a($$2)))
      .put(mj.b.q, (og.a)($$0, $$1, $$2) -> $$0.d(oe.b, $$1, ddq.a($$2)))
      .build();

   protected og(jg.a $$0, of $$1) {
      this.a = $$0;
      this.c = $$0.e(mg.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cum $$0) {
      mi.a().filter(mj::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(diz $$0, diz $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(diz $$0, diz $$1, @Nullable String $$2, int $$3) {
      this.b(oe.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<diz> $$0, oe $$1, diz $$2, float $$3, int $$4, String $$5) {
      this.a(dee.o, deo::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<diz> $$0, oe $$1, diz $$2, float $$3, int $$4, String $$5) {
      this.a(dee.p, ddd::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dda> void a(dee<T> $$0, dda.a<T> $$1, List<diz> $$2, oe $$3, diz $$4, float $$5, int $$6, String $$7, String $$8) {
      for (diz $$9 : $$2) {
         oj.a(ddq.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cyz $$0, oe $$1, cyz $$2) {
      ol.a(ddq.a(czh.yH), ddq.a($$0), this.b(axk.bh), $$1, $$2).a("has_netherite_ingot", this.a(axk.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cyz $$0, alf<dhs> $$1, alf<ddu<?>> $$2) {
      je.c<dhs> $$3 = this.a.e(mg.bl).b($$1);
      om.a(ddq.a($$0), this.b(axk.bD), this.b(axk.bE), $$3, oe.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(oe $$0, diz $$1, diz $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oe $$0, diz $$1, diz $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oe $$0, diz $$1, diz $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(diz $$0, axr<cyz> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(diz $$0, axr<cyz> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(diz $$0, diz $$1) {
      this.a(oe.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(diz $$0, diz $$1) {
      this.a(oe.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dmh.J)).a(this.b);
   }

   protected void c(diz $$0, diz $$1) {
      this.b(oe.d, $$0).b(dmh.cG).b($$1).b("chest_boat").b("has_boat", this.a(axk.aS)).a(this.b);
   }

   private od e(diz $$0, ddq $$1) {
      return this.b(oe.c, $$0).a($$1);
   }

   protected od a(diz $$0, ddq $$1) {
      return this.a(oe.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private od f(diz $$0, ddq $$1) {
      int $$2 = $$0 == dmh.fN ? 6 : 3;
      cyz $$3 = $$0 == dmh.fN ? czh.vH : czh.qe;
      return this.a(oe.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private od g(diz $$0, ddq $$1) {
      return this.a(oe.c, $$0).a('#', czh.qe).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(diz $$0, diz $$1) {
      this.c(oe.c, $$0, ddq.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private od c(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oe $$0, diz $$1, diz $$2) {
      this.a($$0, $$1, ddq.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected od a(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected od b(diz $$0, ddq $$1) {
      return this.a(oe.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected od c(diz $$0, ddq $$1) {
      return this.a(oe.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private od h(diz $$0, ddq $$1) {
      return this.a(oe.b, $$0, 3).c("sign").a('#', $$1).a('X', czh.qe).b("###").b("###").b(" X ");
   }

   protected void e(diz $$0, diz $$1) {
      this.a(oe.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', czh.go).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cyz> $$0, List<cyz> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oe.a);
   }

   protected void a(List<cyz> $$0, List<cyz> $$1, @Nullable cyz $$2, String $$3, oe $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cyz $$6 = $$0.get($$5);
         cyz $$7 = $$1.get($$5);
         Stream<cyz> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(ddq.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(diz $$0, diz $$1) {
      this.a(oe.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(diz $$0, diz $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('X', axk.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(diz $$0, diz $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('|', czh.qe).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(diz $$0, diz $$1) {
      this.a(oe.a, $$0, 8).a('#', dmh.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((diz)dmh.aX)).a(this.b);
   }

   protected void j(diz $$0, diz $$1) {
      this.a(oe.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(diz $$0, diz $$1) {
      this.a(oe.b, $$0, 8)
         .a('#', dmh.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((diz)dmh.fq))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dmh.fq));
   }

   protected void l(diz $$0, diz $$1) {
      this.a(oe.a, $$0, 8).a('#', dmh.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((diz)dmh.jc)).a(this.b);
   }

   protected void m(diz $$0, diz $$1) {
      this.b(oe.a, $$0, 8).b($$1).a(dmh.L, 4).a(dmh.O, 4).b("concrete_powder").b("has_sand", this.a((diz)dmh.L)).b("has_gravel", this.a((diz)dmh.O)).a(this.b);
   }

   protected void n(diz $$0, diz $$1) {
      this.b(oe.b, $$0).b(dmh.qt).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oe $$0, diz $$1, diz $$2) {
      this.d($$0, $$1, ddq.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od d(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oe $$0, diz $$1, diz $$2) {
      this.e($$0, $$1, ddq.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od e(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oe $$0, diz $$1, diz $$2) {
      this.f($$0, $$1, ddq.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oh f(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oe $$0, diz $$1, diz $$2) {
      this.b($$0, $$1, ddq.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oe $$0, diz $$1, diz $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oh b(oe $$0, diz $$1, ddq $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oe $$0, diz $$1, diz $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oe $$0, diz $$1, diz $$2, int $$3) {
      ok.a(ddq.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(diz $$0, diz $$1) {
      oj.c(ddq.a($$1), oe.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oe $$0, diz $$1, oe $$2, diz $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oe $$0, diz $$1, oe $$2, diz $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oe $$0, diz $$1, oe $$2, diz $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oe $$0, diz $$1, oe $$2, diz $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alf.a(mg.bu, alg.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alf.a(mg.bu, alg.a($$4)));
   }

   protected void o(diz $$0, diz $$1) {
      this.a(oe.i, $$0, 2).a('#', czh.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(diz $$0, ddq $$1) {
      this.a(oe.i, $$0, 2).a('#', czh.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dda> void a(String $$0, dee<T> $$1, dda.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, czh.ti, czh.tj, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.tk, czh.tl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.sh, czh.sl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.dX, czh.tf, 0.1F);
      this.a($$0, $$1, $$2, $$3, czh.si, czh.sm, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.vY, czh.vZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.qL, czh.qM, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.vq, czh.vr, 0.35F);
      this.a($$0, $$1, $$2, $$3, czh.vL, czh.vM, 0.35F);
   }

   private <T extends dda> void a(String $$0, dee<T> $$1, dda.a<T> $$2, int $$3, diz $$4, diz $$5, float $$6) {
      oj.a(ddq.a($$4), oe.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cum $$0) {
      cyu.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(oe.a, $$2).b($$1).b(czh.xL).b(c($$2)).b(b($$1), this.a((diz)$$1)).a(this.b, p($$2, czh.xL));
         }
      });
   }

   protected void a(dmf $$0, dmf $$1) {
      this.a(oe.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((diz)$$1)).a(this.b);
   }

   protected void b(dmf $$0, dmf $$1) {
      this.a(oe.c, $$0, 4).a('C', $$1).a('R', czh.ml).a('B', czh.to).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((diz)$$1)).a(this.b);
   }

   protected void a(cyz $$0, dur $$1) {
      czd $$2 = new czd(czh.xh.e(), 1, kh.a().a(kj.T, $$1.c()).a());
      this.a(oe.g, $$2).b(czh.ph).b(czh.dN).b(czh.dO).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mj $$0, cum $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            og.a $$4 = d.get($$2);
            diz $$5 = this.a($$0, $$2);
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

   private dmf a(mj $$0, mj.b $$1) {
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

   private static aq<bt.a> a(dmf $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(cv.d $$0, diz $$1) {
      return a(cl.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(diz $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axr<cyz> $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cl.a... $$0) {
      return a(Arrays.stream($$0).map(cl.a::b).toArray(cl[]::new));
   }

   private static aq<cj.a> a(cl... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(diz $$0) {
      return "has_" + c($$0);
   }

   protected static String c(diz $$0) {
      return mf.g.b($$0.h()).a();
   }

   protected static String d(diz $$0) {
      return c($$0);
   }

   protected static String p(diz $$0, diz $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(diz $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(diz $$0) {
      return c($$0) + "_from_blasting";
   }

   protected ddq b(axr<cyz> $$0) {
      return ddq.a(this.c.b($$0));
   }

   protected oh a(oe $$0, diz $$1) {
      return oh.a(this.c, $$0, $$1);
   }

   protected oh a(oe $$0, diz $$1, int $$2) {
      return oh.a(this.c, $$0, $$1, $$2);
   }

   protected oi a(oe $$0, czd $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, diz $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, diz $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      od create(og var1, diz var2, diz var3);
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
            final mo.a $$2 = this.d.a(mg.bu);
            final mo.a $$3 = this.d.a(mg.bt);
            final Set<alf<ddu<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            of $$6 = new of() {
               @Override
               public void a(alf<ddu<?>> $$0x, ddu<?> $$1x, @Nullable ai $$2x) {
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

               private void a(alf<ddu<?>> $$0x, ddu<?> $$1x) {
                  $$5.add(mm.a($$0, $$1, ddu.a, $$1, $$2.a($$0.a())));
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
