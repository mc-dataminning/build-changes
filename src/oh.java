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
   private final jg<czu> c;
   protected final og b;
   private static final Map<mk.b, oh.a> d = ImmutableMap.builder()
      .put(mk.b.a, (oh.a)($$0, $$1, $$2) -> $$0.e($$1, del.a($$2)))
      .put(mk.b.b, (oh.a)($$0, $$1, $$2) -> $$0.b(of.a, $$1, del.a($$2)))
      .put(mk.b.d, (oh.a)($$0, $$1, $$2) -> $$0.f(of.a, $$1, del.a($$2)))
      .put(mk.b.e, (oh.a)($$0, $$1, $$2) -> $$0.a($$1, del.a($$2)))
      .put(mk.b.f, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, del.a($$2)))
      .put(mk.b.g, (oh.a)($$0, $$1, $$2) -> $$0.f($$1, del.a($$2)))
      .put(mk.b.h, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, del.a($$2)))
      .put(mk.b.i, (oh.a)($$0, $$1, $$2) -> $$0.g($$1, del.a($$2)))
      .put(mk.b.k, (oh.a)($$0, $$1, $$2) -> $$0.h($$1, del.a($$2)))
      .put(mk.b.l, (oh.a)($$0, $$1, $$2) -> $$0.a(of.a, $$1, del.a($$2)))
      .put(mk.b.m, (oh.a)($$0, $$1, $$2) -> $$0.b($$1, del.a($$2)))
      .put(mk.b.n, (oh.a)($$0, $$1, $$2) -> $$0.c(of.c, $$1, del.a($$2)))
      .put(mk.b.o, (oh.a)($$0, $$1, $$2) -> $$0.e(of.a, $$1, del.a($$2)))
      .put(mk.b.p, (oh.a)($$0, $$1, $$2) -> $$0.c($$1, del.a($$2)))
      .put(mk.b.q, (oh.a)($$0, $$1, $$2) -> $$0.d(of.b, $$1, del.a($$2)))
      .build();

   protected oh(jh.a $$0, og $$1) {
      this.a = $$0;
      this.c = $$0.e(mh.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cvh $$0) {
      mj.a().filter(mk::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(djw $$0, djw $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(djw $$0, djw $$1, @Nullable String $$2, int $$3) {
      this.b(of.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<djw> $$0, of $$1, djw $$2, float $$3, int $$4, String $$5) {
      this.a(dez.o, dfj::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<djw> $$0, of $$1, djw $$2, float $$3, int $$4, String $$5) {
      this.a(dez.p, ddy::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends ddv> void a(dez<T> $$0, ddv.a<T> $$1, List<djw> $$2, of $$3, djw $$4, float $$5, int $$6, String $$7, String $$8) {
      for (djw $$9 : $$2) {
         ok.a(del.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(czu $$0, of $$1, czu $$2) {
      om.a(del.a(dac.yH), del.a($$0), this.b(axm.bh), $$1, $$2).a("has_netherite_ingot", this.a(axm.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(czu $$0, alh<din> $$1, alh<dep<?>> $$2) {
      jf.c<din> $$3 = this.a.e(mh.bl).b($$1);
      on.a(del.a($$0), this.b(axm.bD), this.b(axm.bE), $$3, of.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(of $$0, djw $$1, djw $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(of $$0, djw $$1, djw $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(of $$0, djw $$1, djw $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(djw $$0, axt<czu> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djw $$0, axt<czu> $$1, int $$2) {
      this.b(of.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(djw $$0, djw $$1) {
      this.a(of.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(djw $$0, djw $$1) {
      this.a(of.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dne.J)).a(this.b);
   }

   protected void c(djw $$0, djw $$1) {
      this.b(of.d, $$0).b(dne.cG).b($$1).b("chest_boat").b("has_boat", this.a(axm.aS)).a(this.b);
   }

   private oe e(djw $$0, del $$1) {
      return this.b(of.c, $$0).a($$1);
   }

   protected oe a(djw $$0, del $$1) {
      return this.a(of.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oe f(djw $$0, del $$1) {
      int $$2 = $$0 == dne.fN ? 6 : 3;
      czu $$3 = $$0 == dne.fN ? dac.vH : dac.qe;
      return this.a(of.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oe g(djw $$0, del $$1) {
      return this.a(of.c, $$0).a('#', dac.qe).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(djw $$0, djw $$1) {
      this.c(of.c, $$0, del.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oe c(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(of $$0, djw $$1, djw $$2) {
      this.a($$0, $$1, del.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oe a(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oe b(djw $$0, del $$1) {
      return this.a(of.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oe c(djw $$0, del $$1) {
      return this.a(of.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oe h(djw $$0, del $$1) {
      return this.a(of.b, $$0, 3).c("sign").a('#', $$1).a('X', dac.qe).b("###").b("###").b(" X ");
   }

   protected void e(djw $$0, djw $$1) {
      this.a(of.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', dac.go).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<czu> $$0, List<czu> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, of.a);
   }

   protected void a(List<czu> $$0, List<czu> $$1, @Nullable czu $$2, String $$3, of $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         czu $$6 = $$0.get($$5);
         czu $$7 = $$1.get($$5);
         Stream<czu> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(del.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(djw $$0, djw $$1) {
      this.a(of.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(djw $$0, djw $$1) {
      this.a(of.b, $$0).a('#', $$1).a('X', axm.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(djw $$0, djw $$1) {
      this.a(of.b, $$0).a('#', $$1).a('|', dac.qe).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(djw $$0, djw $$1) {
      this.a(of.a, $$0, 8).a('#', dne.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((djw)dne.aX)).a(this.b);
   }

   protected void j(djw $$0, djw $$1) {
      this.a(of.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(djw $$0, djw $$1) {
      this.a(of.b, $$0, 8)
         .a('#', dne.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((djw)dne.fq))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dne.fq));
   }

   protected void l(djw $$0, djw $$1) {
      this.a(of.a, $$0, 8).a('#', dne.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((djw)dne.jc)).a(this.b);
   }

   protected void m(djw $$0, djw $$1) {
      this.b(of.a, $$0, 8).b($$1).a(dne.L, 4).a(dne.O, 4).b("concrete_powder").b("has_sand", this.a((djw)dne.L)).b("has_gravel", this.a((djw)dne.O)).a(this.b);
   }

   protected void n(djw $$0, djw $$1) {
      this.b(of.b, $$0).b(dne.qt).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(of $$0, djw $$1, djw $$2) {
      this.d($$0, $$1, del.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe d(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(of $$0, djw $$1, djw $$2) {
      this.e($$0, $$1, del.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oe e(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(of $$0, djw $$1, djw $$2) {
      this.f($$0, $$1, del.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oi f(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(of $$0, djw $$1, djw $$2) {
      this.b($$0, $$1, del.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(of $$0, djw $$1, djw $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oi b(of $$0, djw $$1, del $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(of $$0, djw $$1, djw $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(of $$0, djw $$1, djw $$2, int $$3) {
      ol.a(del.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(djw $$0, djw $$1) {
      ok.c(del.a($$1), of.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(of $$0, djw $$1, of $$2, djw $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(of $$0, djw $$1, of $$2, djw $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(of $$0, djw $$1, of $$2, djw $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(of $$0, djw $$1, of $$2, djw $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alh.a(mh.bv, ali.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alh.a(mh.bv, ali.a($$4)));
   }

   protected void o(djw $$0, djw $$1) {
      this.a(of.i, $$0, 2).a('#', dac.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(djw $$0, del $$1) {
      this.a(of.i, $$0, 2).a('#', dac.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends ddv> void a(String $$0, dez<T> $$1, ddv.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, dac.ti, dac.tj, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.tk, dac.tl, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.sh, dac.sl, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.dX, dac.tf, 0.1F);
      this.a($$0, $$1, $$2, $$3, dac.si, dac.sm, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.vY, dac.vZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.qL, dac.qM, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.vq, dac.vr, 0.35F);
      this.a($$0, $$1, $$2, $$3, dac.vL, dac.vM, 0.35F);
   }

   private <T extends ddv> void a(String $$0, dez<T> $$1, ddv.a<T> $$2, int $$3, djw $$4, djw $$5, float $$6) {
      ok.a(del.a($$4), of.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cvh $$0) {
      czp.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(of.a, $$2).b($$1).b(dac.xL).b(c($$2)).b(b($$1), this.a((djw)$$1)).a(this.b, p($$2, dac.xL));
         }
      });
   }

   protected void a(dnc $$0, dnc $$1) {
      this.a(of.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((djw)$$1)).a(this.b);
   }

   protected void b(dnc $$0, dnc $$1) {
      this.a(of.c, $$0, 4).a('C', $$1).a('R', dac.ml).a('B', dac.to).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((djw)$$1)).a(this.b);
   }

   protected void a(czu $$0, dvo $$1) {
      czy $$2 = new czy(dac.xh.e(), 1, ki.a().a(kk.T, $$1.c()).a());
      this.a(of.g, $$2).b(dac.ph).b(dac.dN).b(dac.dO).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mk $$0, cvh $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oh.a $$4 = d.get($$2);
            djw $$5 = this.a($$0, $$2);
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

   private dnc a(mk $$0, mk.b $$1) {
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

   private static ar<bu.a> a(dnc $$0) {
      return aq.e.a(new bu.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ar<ck.a> a(cw.d $$0, djw $$1) {
      return a(cm.a.a().a(this.c, $$1).a($$0));
   }

   protected ar<ck.a> a(djw $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   protected ar<ck.a> a(axt<czu> $$0) {
      return a(cm.a.a().a(this.c, $$0));
   }

   private static ar<ck.a> a(cm.a... $$0) {
      return a(Arrays.stream($$0).map(cm.a::b).toArray(cm[]::new));
   }

   private static ar<ck.a> a(cm... $$0) {
      return aq.f.a(new ck.a(Optional.empty(), ck.a.a.b, List.of($$0)));
   }

   protected static String b(djw $$0) {
      return "has_" + c($$0);
   }

   protected static String c(djw $$0) {
      return mg.g.b($$0.h()).a();
   }

   protected static String d(djw $$0) {
      return c($$0);
   }

   protected static String p(djw $$0, djw $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(djw $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(djw $$0) {
      return c($$0) + "_from_blasting";
   }

   protected del b(axt<czu> $$0) {
      return del.a(this.c.b($$0));
   }

   protected oi a(of $$0, djw $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi a(of $$0, djw $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   protected oj a(of $$0, czy $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djw $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj b(of $$0, djw $$1, int $$2) {
      return oj.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oe create(oh var1, djw var2, djw var3);
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
            final Set<alh<dep<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            og $$6 = new og() {
               @Override
               public void a(alh<dep<?>> $$0x, dep<?> $$1x, @Nullable aj $$2x) {
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

               private void a(alh<dep<?>> $$0x, dep<?> $$1x) {
                  $$5.add(mn.a($$0, $$1, dep.a, $$1, $$2.a($$0.a())));
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
