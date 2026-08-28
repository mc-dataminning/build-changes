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
   private final jg<czg> c;
   protected final og b;
   private static final Map<mk.b, oh.a> d = ImmutableMap.builder()
      .put(mk.b.a, (oh.a)($$0, $$1, $$2) -> $$0.e($$1, ddx.a($$2)))
      .put(mk.b.b, (oh.a)($$0, $$1, $$2) -> $$0.b(of.a, $$1, ddx.a($$2)))
      .put(mk.b.d, (oh.a)($$0, $$1, $$2) -> $$0.f(of.a, $$1, ddx.a($$2)))
      .put(mk.b.e, (oh.a)($$0, $$1, $$2) -> $$0.a($$1, ddx.a($$2)))
      .put(mk.b.f, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, ddx.a($$2)))
      .put(mk.b.g, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, ddx.a($$2)))
      .put(mk.b.h, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, ddx.a($$2)))
      .put(mk.b.i, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, ddx.a($$2)))
      .put(mk.b.k, (oh.a)($$0, $$1, $$2) -> $$0.h($$1, ddx.a($$2)))
      .put(mk.b.l, (oh.a)($$0, $$1, $$2) -> $$0.a(of.a, $$1, ddx.a($$2)))
      .put(mk.b.m, (oh.a)($$0, $$1, $$2) -> $$0.b($$1, ddx.a($$2)))
      .put(mk.b.n, (oh.a)($$0, $$1, $$2) -> $$0.c(of.c, $$1, ddx.a($$2)))
      .put(mk.b.o, (oh.a)($$0, $$1, $$2) -> $$0.e(of.a, $$1, ddx.a($$2)))
      .put(mk.b.p, (oh.a)($$0, $$1, $$2) -> $$0.c($$1, ddx.a($$2)))
      .put(mk.b.q, (oh.a)($$0, $$1, $$2) -> $$0.d(of.b, $$1, ddx.a($$2)))
      .build();

   protected oh(jh.a $$0, og $$1) {
      this.a = $$0;
      this.c = $$0.e(mh.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cut $$0) {
      mj.a().filter(mk::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(djg $$0, djg $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(djg $$0, djg $$1, @Nullable String $$2, int $$3) {
      this.b(of.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<djg> $$0, of $$1, djg $$2, float $$3, int $$4, String $$5) {
      this.a(del.o, dev::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<djg> $$0, of $$1, djg $$2, float $$3, int $$4, String $$5) {
      this.a(del.p, ddk::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends ddh> void a(del<T> $$0, ddh.a<T> $$1, List<djg> $$2, of $$3, djg $$4, float $$5, int $$6, String $$7, String $$8) {
      for (djg $$9 : $$2) {
         ok.a(ddx.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(czg $$0, of $$1, czg $$2) {
      om.a(ddx.a(czo.yH), ddx.a($$0), this.b(axk.bh), $$1, $$2).a("has_netherite_ingot", this.a(axk.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(czg $$0, alf<dhz> $$1, alf<deb<?>> $$2) {
      jf.c<dhz> $$3 = this.a.e(mh.bl).b($$1);
      on.a(ddx.a($$0), this.b(axk.bD), this.b(axk.bE), $$3, of.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(of $$0, djg $$1, djg $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(of $$0, djg $$1, djg $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(of $$0, djg $$1, djg $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(djg $$0, axr<czg> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djg $$0, axr<czg> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(djg $$0, djg $$1) {
      this.a(of.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djg $$0, djg $$1) {
      this.a(of.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dmo.J)).a(this.b);
   }

   protected void c(djg $$0, djg $$1) {
      this.b(of.d, $$0).b(dmo.cG).b($$1).b("chest_boat").b("has_boat", this.a(axk.aS)).a(this.b);
   }

   private oe e(djg $$0, ddx $$1) {
      return this.b(of.c, $$0).a($$1);
   }

   protected oe a(djg $$0, ddx $$1) {
      return this.a(of.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oe f(djg $$0, ddx $$1) {
      int $$2 = $$0 == dmo.fN ? 6 : 3;
      czg $$3 = $$0 == dmo.fN ? czo.vH : czo.qe;
      return this.a(of.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oe g(djg $$0, ddx $$1) {
      return this.a(of.c, $$0).a('#', czo.qe).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(djg $$0, djg $$1) {
      this.c(of.c, $$0, ddx.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oe c(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(of $$0, djg $$1, djg $$2) {
      this.a($$0, $$1, ddx.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oe a(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oe b(djg $$0, ddx $$1) {
      return this.a(of.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oe c(djg $$0, ddx $$1) {
      return this.a(of.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oe h(djg $$0, ddx $$1) {
      return this.a(of.b, $$0, 3).c("sign").a('#', $$1).a('X', czo.qe).b("###").b("###").b(" X ");
   }

   protected void e(djg $$0, djg $$1) {
      this.a(of.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', czo.go).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<czg> $$0, List<czg> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, of.a);
   }

   protected void a(List<czg> $$0, List<czg> $$1, @Nullable czg $$2, String $$3, of $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         czg $$6 = $$0.get($$5);
         czg $$7 = $$1.get($$5);
         Stream<czg> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(ddx.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(djg $$0, djg $$1) {
      this.a(of.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(djg $$0, djg $$1) {
      this.a(of.b, $$0).a('#', $$1).a('X', axk.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(djg $$0, djg $$1) {
      this.a(of.b, $$0).a('#', $$1).a('|', czo.qe).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(djg $$0, djg $$1) {
      this.a(of.a, $$0, 8).a('#', dmo.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((djg)dmo.aX)).a(this.b);
   }

   protected void j(djg $$0, djg $$1) {
      this.a(of.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(djg $$0, djg $$1) {
      this.a(of.b, $$0, 8)
         .a('#', dmo.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((djg)dmo.fq))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dmo.fq));
   }

   protected void l(djg $$0, djg $$1) {
      this.a(of.a, $$0, 8).a('#', dmo.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((djg)dmo.jc)).a(this.b);
   }

   protected void m(djg $$0, djg $$1) {
      this.b(of.a, $$0, 8).b($$1).a(dmo.L, 4).a(dmo.O, 4).b("concrete_powder").b("has_sand", this.a((djg)dmo.L)).b("has_gravel", this.a((djg)dmo.O)).a(this.b);
   }

   protected void n(djg $$0, djg $$1) {
      this.b(of.b, $$0).b(dmo.qt).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(of $$0, djg $$1, djg $$2) {
      this.d($$0, $$1, ddx.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe d(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(of $$0, djg $$1, djg $$2) {
      this.e($$0, $$1, ddx.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe e(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(of $$0, djg $$1, djg $$2) {
      this.f($$0, $$1, ddx.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oi f(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(of $$0, djg $$1, djg $$2) {
      this.b($$0, $$1, ddx.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(of $$0, djg $$1, djg $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oi b(of $$0, djg $$1, ddx $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(of $$0, djg $$1, djg $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(of $$0, djg $$1, djg $$2, int $$3) {
      ol.a(ddx.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(djg $$0, djg $$1) {
      ok.c(ddx.a($$1), of.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(of $$0, djg $$1, of $$2, djg $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(of $$0, djg $$1, of $$2, djg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(of $$0, djg $$1, of $$2, djg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(of $$0, djg $$1, of $$2, djg $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alf.a(mh.bu, alg.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alf.a(mh.bu, alg.a($$4)));
   }

   protected void o(djg $$0, djg $$1) {
      this.a(of.i, $$0, 2).a('#', czo.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(djg $$0, ddx $$1) {
      this.a(of.i, $$0, 2).a('#', czo.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends ddh> void a(String $$0, del<T> $$1, ddh.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, czo.ti, czo.tj, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.tk, czo.tl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.sh, czo.sl, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.dX, czo.tf, 0.1F);
      this.a($$0, $$1, $$2, $$3, czo.si, czo.sm, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.vY, czo.vZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.qL, czo.qM, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.vq, czo.vr, 0.35F);
      this.a($$0, $$1, $$2, $$3, czo.vL, czo.vM, 0.35F);
   }

   private <T extends ddh> void a(String $$0, del<T> $$1, ddh.a<T> $$2, int $$3, djg $$4, djg $$5, float $$6) {
      ok.a(ddx.a($$4), of.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cut $$0) {
      czb.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(of.a, $$2).b($$1).b(czo.xL).b(c($$2)).b(b($$1), this.a((djg)$$1)).a(this.b, p($$2, czo.xL));
         }
      });
   }

   protected void a(dmm $$0, dmm $$1) {
      this.a(of.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((djg)$$1)).a(this.b);
   }

   protected void b(dmm $$0, dmm $$1) {
      this.a(of.c, $$0, 4).a('C', $$1).a('R', czo.ml).a('B', czo.to).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((djg)$$1)).a(this.b);
   }

   protected void a(czg $$0, duy $$1) {
      czk $$2 = new czk(czo.xh.e(), 1, ki.a().a(kk.T, $$1.c()).a());
      this.a(of.g, $$2).b(czo.ph).b(czo.dN).b(czo.dO).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mk $$0, cut $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oh.a $$4 = d.get($$2);
            djg $$5 = this.a($$0, $$2);
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

   private dmm a(mk $$0, mk.b $$1) {
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

   private static ar<bu.a> a(dmm $$0) {
      return aq.e.a(new bu.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ar<ck.a> a(cw.d $$0, djg $$1) {
      return a(cm.a.a().a(this.c, $$1).a($$0));
   }

   protected ar<ck.a> a(djg $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   protected ar<ck.a> a(axr<czg> $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   private static ar<ck.a> a(cm.a... $$0) {
      return a(Arrays.stream($$0).map(cm.a::b).toArray(cm[]::new));
   }

   private static ar<ck.a> a(cm... $$0) {
      return aq.f.a(new ck.a(Optional.empty(), ck.a.a.b, List.of($$0)));
   }

   protected static String b(djg $$0) {
      return "has_" + c($$0);
   }

   protected static String c(djg $$0) {
      return mg.g.b($$0.h()).a();
   }

   protected static String d(djg $$0) {
      return c($$0);
   }

   protected static String p(djg $$0, djg $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(djg $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(djg $$0) {
      return c($$0) + "_from_blasting";
   }

   protected ddx b(axr<czg> $$0) {
      return ddx.a(this.c.b($$0));
   }

   protected oi a(of $$0, djg $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi a(of $$0, djg $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   protected oj a(of $$0, czk $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djg $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djg $$1, int $$2) {
      return oj.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oe create(oh var1, djg var2, djg var3);
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
            final mp.a $$2 = this.d.a(mh.bu);
            final mp.a $$3 = this.d.a(mh.bt);
            final Set<alf<deb<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            og $$6 = new og() {
               @Override
               public void a(alf<deb<?>> $$0x, deb<?> $$1x, @Nullable aj $$2x) {
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

               private void a(alf<deb<?>> $$0x, deb<?> $$1x) {
                  $$5.add(mn.a($$0, $$1, deb.a, $$1, $$2.a($$0.a())));
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
