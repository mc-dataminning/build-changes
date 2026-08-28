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

public abstract class oh {
   protected final jh.a a;
   private final jg<czj> c;
   protected final og b;
   private static final Map<mk.b, oh.a> d = ImmutableMap.builder()
      .put(mk.b.a, (oh.a)($$0, $$1, $$2) -> $$0.e($$1, dea.a($$2)))
      .put(mk.b.b, (oh.a)($$0, $$1, $$2) -> $$0.b(of.a, $$1, dea.a($$2)))
      .put(mk.b.d, (oh.a)($$0, $$1, $$2) -> $$0.f(of.a, $$1, dea.a($$2)))
      .put(mk.b.e, (oh.a)($$0, $$1, $$2) -> $$0.a($$1, dea.a($$2)))
      .put(mk.b.f, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, dea.a($$2)))
      .put(mk.b.g, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, dea.a($$2)))
      .put(mk.b.h, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, dea.a($$2)))
      .put(mk.b.i, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, dea.a($$2)))
      .put(mk.b.k, (oh.a)($$0, $$1, $$2) -> $$0.h($$1, dea.a($$2)))
      .put(mk.b.l, (oh.a)($$0, $$1, $$2) -> $$0.a(of.a, $$1, dea.a($$2)))
      .put(mk.b.m, (oh.a)($$0, $$1, $$2) -> $$0.b($$1, dea.a($$2)))
      .put(mk.b.n, (oh.a)($$0, $$1, $$2) -> $$0.c(of.c, $$1, dea.a($$2)))
      .put(mk.b.o, (oh.a)($$0, $$1, $$2) -> $$0.e(of.a, $$1, dea.a($$2)))
      .put(mk.b.p, (oh.a)($$0, $$1, $$2) -> $$0.c($$1, dea.a($$2)))
      .put(mk.b.q, (oh.a)($$0, $$1, $$2) -> $$0.d(of.b, $$1, dea.a($$2)))
      .build();

   protected oh(jh.a $$0, og $$1) {
      this.a = $$0;
      this.c = $$0.e(mh.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cuw $$0) {
      mj.a().filter(mk::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(djl $$0, djl $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(djl $$0, djl $$1, @Nullable String $$2, int $$3) {
      this.b(of.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<djl> $$0, of $$1, djl $$2, float $$3, int $$4, String $$5) {
      this.a(deo.o, dey::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<djl> $$0, of $$1, djl $$2, float $$3, int $$4, String $$5) {
      this.a(deo.p, ddn::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends ddk> void a(deo<T> $$0, ddk.a<T> $$1, List<djl> $$2, of $$3, djl $$4, float $$5, int $$6, String $$7, String $$8) {
      for (djl $$9 : $$2) {
         ok.a(dea.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(czj $$0, of $$1, czj $$2) {
      om.a(dea.a(czr.yH), dea.a($$0), this.b(axk.bh), $$1, $$2).a("has_netherite_ingot", this.a(axk.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(czj $$0, alf<dic> $$1, alf<dee<?>> $$2) {
      jf.c<dic> $$3 = this.a.e(mh.bl).b($$1);
      on.a(dea.a($$0), this.b(axk.bD), this.b(axk.bE), $$3, of.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(of $$0, djl $$1, djl $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(of $$0, djl $$1, djl $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(of $$0, djl $$1, djl $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(djl $$0, axr<czj> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djl $$0, axr<czj> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(djl $$0, djl $$1) {
      this.a(of.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djl $$0, djl $$1) {
      this.a(of.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dmt.J)).a(this.b);
   }

   protected void c(djl $$0, djl $$1) {
      this.b(of.d, $$0).b(dmt.cG).b($$1).b("chest_boat").b("has_boat", this.a(axk.aS)).a(this.b);
   }

   private oe e(djl $$0, dea $$1) {
      return this.b(of.c, $$0).a($$1);
   }

   protected oe a(djl $$0, dea $$1) {
      return this.a(of.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oe f(djl $$0, dea $$1) {
      int $$2 = $$0 == dmt.fN ? 6 : 3;
      czj $$3 = $$0 == dmt.fN ? czr.vH : czr.qe;
      return this.a(of.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oe g(djl $$0, dea $$1) {
      return this.a(of.c, $$0).a('#', czr.qe).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(djl $$0, djl $$1) {
      this.c(of.c, $$0, dea.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oe c(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(of $$0, djl $$1, djl $$2) {
      this.a($$0, $$1, dea.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oe a(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oe b(djl $$0, dea $$1) {
      return this.a(of.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oe c(djl $$0, dea $$1) {
      return this.a(of.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oe h(djl $$0, dea $$1) {
      return this.a(of.b, $$0, 3).c("sign").a('#', $$1).a('X', czr.qe).b("###").b("###").b(" X ");
   }

   protected void e(djl $$0, djl $$1) {
      this.a(of.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', czr.go).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<czj> $$0, List<czj> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, of.a);
   }

   protected void a(List<czj> $$0, List<czj> $$1, @Nullable czj $$2, String $$3, of $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         czj $$6 = $$0.get($$5);
         czj $$7 = $$1.get($$5);
         Stream<czj> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dea.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(djl $$0, djl $$1) {
      this.a(of.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(djl $$0, djl $$1) {
      this.a(of.b, $$0).a('#', $$1).a('X', axk.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(djl $$0, djl $$1) {
      this.a(of.b, $$0).a('#', $$1).a('|', czr.qe).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(djl $$0, djl $$1) {
      this.a(of.a, $$0, 8).a('#', dmt.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((djl)dmt.aX)).a(this.b);
   }

   protected void j(djl $$0, djl $$1) {
      this.a(of.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(djl $$0, djl $$1) {
      this.a(of.b, $$0, 8)
         .a('#', dmt.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((djl)dmt.fq))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dmt.fq));
   }

   protected void l(djl $$0, djl $$1) {
      this.a(of.a, $$0, 8).a('#', dmt.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((djl)dmt.jc)).a(this.b);
   }

   protected void m(djl $$0, djl $$1) {
      this.b(of.a, $$0, 8).b($$1).a(dmt.L, 4).a(dmt.O, 4).b("concrete_powder").b("has_sand", this.a((djl)dmt.L)).b("has_gravel", this.a((djl)dmt.O)).a(this.b);
   }

   protected void n(djl $$0, djl $$1) {
      this.b(of.b, $$0).b(dmt.qt).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(of $$0, djl $$1, djl $$2) {
      this.d($$0, $$1, dea.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe d(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(of $$0, djl $$1, djl $$2) {
      this.e($$0, $$1, dea.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe e(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(of $$0, djl $$1, djl $$2) {
      this.f($$0, $$1, dea.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oi f(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(of $$0, djl $$1, djl $$2) {
      this.b($$0, $$1, dea.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(of $$0, djl $$1, djl $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oi b(of $$0, djl $$1, dea $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(of $$0, djl $$1, djl $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(of $$0, djl $$1, djl $$2, int $$3) {
      ol.a(dea.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(djl $$0, djl $$1) {
      ok.c(dea.a($$1), of.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(of $$0, djl $$1, of $$2, djl $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(of $$0, djl $$1, of $$2, djl $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(of $$0, djl $$1, of $$2, djl $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(of $$0, djl $$1, of $$2, djl $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alf.a(mh.bv, alg.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alf.a(mh.bv, alg.a($$4)));
   }

   protected void o(djl $$0, djl $$1) {
      this.a(of.i, $$0, 2).a('#', czr.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(djl $$0, dea $$1) {
      this.a(of.i, $$0, 2).a('#', czr.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends ddk> void a(String $$0, deo<T> $$1, ddk.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, czr.ti, czr.tj, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.tk, czr.tl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.sh, czr.sl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.dX, czr.tf, 0.1F);
      this.a($$0, $$1, $$2, $$3, czr.si, czr.sm, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.vY, czr.vZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.qL, czr.qM, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.vq, czr.vr, 0.35F);
      this.a($$0, $$1, $$2, $$3, czr.vL, czr.vM, 0.35F);
   }

   private <T extends ddk> void a(String $$0, deo<T> $$1, ddk.a<T> $$2, int $$3, djl $$4, djl $$5, float $$6) {
      ok.a(dea.a($$4), of.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cuw $$0) {
      cze.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(of.a, $$2).b($$1).b(czr.xL).b(c($$2)).b(b($$1), this.a((djl)$$1)).a(this.b, p($$2, czr.xL));
         }
      });
   }

   protected void a(dmr $$0, dmr $$1) {
      this.a(of.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((djl)$$1)).a(this.b);
   }

   protected void b(dmr $$0, dmr $$1) {
      this.a(of.c, $$0, 4).a('C', $$1).a('R', czr.ml).a('B', czr.to).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((djl)$$1)).a(this.b);
   }

   protected void a(czj $$0, dvd $$1) {
      czn $$2 = new czn(czr.xh.e(), 1, ki.a().a(kk.T, $$1.c()).a());
      this.a(of.g, $$2).b(czr.ph).b(czr.dN).b(czr.dO).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mk $$0, cuw $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oh.a $$4 = d.get($$2);
            djl $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               oe $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mk.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mk.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dmr a(mk $$0, mk.b $$1) {
      if ($$1 == mk.b.b) {
         if (!$$0.b().containsKey(mk.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mk.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ar<bu.a> a(dmr $$0) {
      return aq.e.a(new bu.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ar<ck.a> a(cw.d $$0, djl $$1) {
      return a(cm.a.a().a(this.c, $$1).a($$0));
   }

   protected ar<ck.a> a(djl $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   protected ar<ck.a> a(axr<czj> $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   private static ar<ck.a> a(cm.a... $$0) {
      return a(Arrays.stream($$0).map(cm.a::b).toArray(cm[]::new));
   }

   private static ar<ck.a> a(cm... $$0) {
      return aq.f.a(new ck.a(Optional.empty(), ck.a.a.b, List.of($$0)));
   }

   protected static String b(djl $$0) {
      return "has_" + c($$0);
   }

   protected static String c(djl $$0) {
      return mg.g.b($$0.h()).a();
   }

   protected static String d(djl $$0) {
      return c($$0);
   }

   protected static String p(djl $$0, djl $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(djl $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(djl $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dea b(axr<czj> $$0) {
      return dea.a(this.c.b($$0));
   }

   protected oi a(of $$0, djl $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi a(of $$0, djl $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   protected oj a(of $$0, czn $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djl $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djl $$1, int $$2) {
      return oj.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oe create(oh var1, djl var2, djl var3);
   }

   protected abstract static class b implements mn {
      private final mp d;
      private final CompletableFuture<jh.a> e;

      protected b(mp $$0, CompletableFuture<jh.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(ml $$0) {
         return this.e.thenCompose($$1 -> {
            final mp.a $$2 = this.d.a(mh.bv);
            final mp.a $$3 = this.d.a(mh.bu);
            final Set<alf<dee<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            og $$6 = new og() {
               @Override
               public void a(alf<dee<?>> $$0x, dee<?> $$1x, @Nullable aj $$2x) {
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
               public ai.a a() {
                  return ai.a.b().a(oe.a);
               }

               @Override
               public void b() {
                  aj $$0 = ai.a.b().a("impossible", aq.b.a(new ci.a())).b(oe.a);
                  this.a($$0);
               }

               private void a(alf<dee<?>> $$0x, dee<?> $$1x) {
                  $$5.add(mn.a($$0, $$1, dee.a, $$1, $$2.a($$0.a())));
               }

               private void a(aj $$0x) {
                  $$5.add(mn.a($$0, $$1, ai.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract oh a(jh.a var1, og var2);
   }
}
