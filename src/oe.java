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

public abstract class oe {
   protected final ju.a a;
   private final jt<cxu> c;
   protected final od b;
   private static final Map<mh.b, oe.a> d = ImmutableMap.builder()
      .put(mh.b.a, (oe.a)($$0, $$1, $$2) -> $$0.e($$1, dch.a($$2)))
      .put(mh.b.b, (oe.a)($$0, $$1, $$2) -> $$0.b(oc.a, $$1, dch.a($$2)))
      .put(mh.b.d, (oe.a)($$0, $$1, $$2) -> $$0.f(oc.a, $$1, dch.a($$2)))
      .put(mh.b.e, (oe.a)($$0, $$1, $$2) -> $$0.a($$1, dch.a($$2)))
      .put(mh.b.f, (oe.a)($$0, $$1, $$2) -> $$0.f($$1, dch.a($$2)))
      .put(mh.b.g, (oe.a)($$0, $$1, $$2) -> $$0.f($$1, dch.a($$2)))
      .put(mh.b.h, (oe.a)($$0, $$1, $$2) -> $$0.g($$1, dch.a($$2)))
      .put(mh.b.i, (oe.a)($$0, $$1, $$2) -> $$0.g($$1, dch.a($$2)))
      .put(mh.b.k, (oe.a)($$0, $$1, $$2) -> $$0.h($$1, dch.a($$2)))
      .put(mh.b.l, (oe.a)($$0, $$1, $$2) -> $$0.a(oc.a, $$1, dch.a($$2)))
      .put(mh.b.m, (oe.a)($$0, $$1, $$2) -> $$0.b($$1, dch.a($$2)))
      .put(mh.b.n, (oe.a)($$0, $$1, $$2) -> $$0.c(oc.c, $$1, dch.a($$2)))
      .put(mh.b.o, (oe.a)($$0, $$1, $$2) -> $$0.e(oc.a, $$1, dch.a($$2)))
      .put(mh.b.p, (oe.a)($$0, $$1, $$2) -> $$0.c($$1, dch.a($$2)))
      .put(mh.b.q, (oe.a)($$0, $$1, $$2) -> $$0.d(oc.b, $$1, dch.a($$2)))
      .build();

   protected oe(ju.a $$0, od $$1) {
      this.a = $$0;
      this.c = $$0.e(me.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cte $$0) {
      mg.a().filter(mh::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dho $$0, dho $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dho $$0, dho $$1, @Nullable String $$2, int $$3) {
      this.b(oc.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dho> $$0, oc $$1, dho $$2, float $$3, int $$4, String $$5) {
      this.a(dcv.o, ddf::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dho> $$0, oc $$1, dho $$2, float $$3, int $$4, String $$5) {
      this.a(dcv.p, dbu::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dbr> void a(dcv<T> $$0, dbr.a<T> $$1, List<dho> $$2, oc $$3, dho $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dho $$9 : $$2) {
         oh.a(dch.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cxu $$0, oc $$1, cxu $$2) {
      oj.a(dch.a(cyc.yA), dch.a($$0), this.b(axi.bg), $$1, $$2).a("has_netherite_ingot", this.a(axi.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cxu $$0, alc<dcl<?>> $$1) {
      ok.a(dch.a($$0), this.b(axi.bC), this.b(axi.bD), oc.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(oc $$0, dho $$1, dho $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oc $$0, dho $$1, dho $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oc $$0, dho $$1, dho $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dho $$0, axp<cxu> $$1, int $$2) {
      this.b(oc.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dho $$0, axp<cxu> $$1, int $$2) {
      this.b(oc.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dho $$0, dho $$1) {
      this.a(oc.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dho $$0, dho $$1) {
      this.a(oc.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dkw.J)).a(this.b);
   }

   protected void c(dho $$0, dho $$1) {
      this.b(oc.d, $$0).b(dkw.cD).b($$1).b("chest_boat").b("has_boat", this.a(axi.aR)).a(this.b);
   }

   private ob e(dho $$0, dch $$1) {
      return this.b(oc.c, $$0).a($$1);
   }

   protected ob a(dho $$0, dch $$1) {
      return this.a(oc.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ob f(dho $$0, dch $$1) {
      int $$2 = $$0 == dkw.fJ ? 6 : 3;
      cxu $$3 = $$0 == dkw.fJ ? cyc.vA : cyc.pZ;
      return this.a(oc.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ob g(dho $$0, dch $$1) {
      return this.a(oc.c, $$0).a('#', cyc.pZ).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dho $$0, dho $$1) {
      this.c(oc.c, $$0, dch.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private ob c(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oc $$0, dho $$1, dho $$2) {
      this.a($$0, $$1, dch.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected ob a(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ob b(dho $$0, dch $$1) {
      return this.a(oc.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ob c(dho $$0, dch $$1) {
      return this.a(oc.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ob h(dho $$0, dch $$1) {
      return this.a(oc.b, $$0, 3).c("sign").a('#', $$1).a('X', cyc.pZ).b("###").b("###").b(" X ");
   }

   protected void e(dho $$0, dho $$1) {
      this.a(oc.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cyc.gj).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cxu> $$0, List<cxu> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oc.a);
   }

   protected void a(List<cxu> $$0, List<cxu> $$1, @Nullable cxu $$2, String $$3, oc $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cxu $$6 = $$0.get($$5);
         cxu $$7 = $$1.get($$5);
         Stream<cxu> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dch.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dho $$0, dho $$1) {
      this.a(oc.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dho $$0, dho $$1) {
      this.a(oc.b, $$0).a('#', $$1).a('X', axi.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dho $$0, dho $$1) {
      this.a(oc.b, $$0).a('#', $$1).a('|', cyc.pZ).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dho $$0, dho $$1) {
      this.a(oc.a, $$0, 8).a('#', dkw.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dho)dkw.aX)).a(this.b);
   }

   protected void j(dho $$0, dho $$1) {
      this.a(oc.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dho $$0, dho $$1) {
      this.a(oc.b, $$0, 8)
         .a('#', dkw.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dho)dkw.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dkw.fm));
   }

   protected void l(dho $$0, dho $$1) {
      this.a(oc.a, $$0, 8).a('#', dkw.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dho)dkw.iY)).a(this.b);
   }

   protected void m(dho $$0, dho $$1) {
      this.b(oc.a, $$0, 8).b($$1).a(dkw.L, 4).a(dkw.O, 4).b("concrete_powder").b("has_sand", this.a((dho)dkw.L)).b("has_gravel", this.a((dho)dkw.O)).a(this.b);
   }

   protected void n(dho $$0, dho $$1) {
      this.b(oc.b, $$0).b(dkw.qp).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oc $$0, dho $$1, dho $$2) {
      this.d($$0, $$1, dch.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ob d(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oc $$0, dho $$1, dho $$2) {
      this.e($$0, $$1, dch.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ob e(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oc $$0, dho $$1, dho $$2) {
      this.f($$0, $$1, dch.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private of f(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oc $$0, dho $$1, dho $$2) {
      this.b($$0, $$1, dch.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oc $$0, dho $$1, dho $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected of b(oc $$0, dho $$1, dch $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oc $$0, dho $$1, dho $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oc $$0, dho $$1, dho $$2, int $$3) {
      oi.a(dch.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dho $$0, dho $$1) {
      oh.c(dch.a($$1), oc.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oc $$0, dho $$1, oc $$2, dho $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oc $$0, dho $$1, oc $$2, dho $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oc $$0, dho $$1, oc $$2, dho $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oc $$0, dho $$1, oc $$2, dho $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alc.a(me.br, ald.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alc.a(me.br, ald.a($$4)));
   }

   protected void o(dho $$0, dho $$1) {
      this.a(oc.i, $$0, 2).a('#', cyc.pi).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dho $$0, dch $$1) {
      this.a(oc.i, $$0, 2).a('#', cyc.pi).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dbr> void a(String $$0, dcv<T> $$1, dbr.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cyc.tb, cyc.tc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.td, cyc.te, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.sa, cyc.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.dT, cyc.sY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cyc.sb, cyc.sf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.vR, cyc.vS, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.qG, cyc.qH, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.vj, cyc.vk, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyc.vE, cyc.vF, 0.35F);
   }

   private <T extends dbr> void a(String $$0, dcv<T> $$1, dbr.a<T> $$2, int $$3, dho $$4, dho $$5, float $$6) {
      oh.a(dch.a($$4), oc.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cte $$0) {
      cxp.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(oc.a, $$2).b($$1).b(cyc.xE).b(c($$2)).b(b($$1), this.a((dho)$$1)).a(this.b, p($$2, cyc.xE));
         }
      });
   }

   protected void a(dku $$0, dku $$1) {
      this.a(oc.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dho)$$1)).a(this.b);
   }

   protected void b(dku $$0, dku $$1) {
      this.a(oc.c, $$0, 4).a('C', $$1).a('R', cyc.mg).a('B', cyc.th).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dho)$$1)).a(this.b);
   }

   protected void a(cxu $$0, dtc $$1) {
      cxy $$2 = new cxy(cyc.xa.f(), 1, ku.a().a(kx.T, $$1.c()).a());
      this.a(oc.g, $$2).b(cyc.pc).b(cyc.dJ).b(cyc.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mh $$0, cte $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oe.a $$4 = d.get($$2);
            dho $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               ob $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mh.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mh.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dku a(mh $$0, mh.b $$1) {
      if ($$1 == mh.b.b) {
         if (!$$0.b().containsKey(mh.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mh.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static aq<bt.a> a(dku $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(dk.d $$0, dho $$1) {
      return a(cv.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(dho $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axp<cxu> $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cv.a... $$0) {
      return a(Arrays.stream($$0).map(cv.a::b).toArray(cv[]::new));
   }

   private static aq<cj.a> a(cv... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(dho $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dho $$0) {
      return md.g.b($$0.i()).a();
   }

   protected static String d(dho $$0) {
      return c($$0);
   }

   protected static String p(dho $$0, dho $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dho $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dho $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dch b(axp<cxu> $$0) {
      return dch.a(this.c.b($$0));
   }

   protected of a(oc $$0, dho $$1) {
      return of.a(this.c, $$0, $$1);
   }

   protected of a(oc $$0, dho $$1, int $$2) {
      return of.a(this.c, $$0, $$1, $$2);
   }

   protected og a(oc $$0, cxy $$1) {
      return og.a(this.c, $$0, $$1);
   }

   protected og b(oc $$0, dho $$1) {
      return og.a(this.c, $$0, $$1);
   }

   protected og b(oc $$0, dho $$1, int $$2) {
      return og.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ob create(oe var1, dho var2, dho var3);
   }

   protected abstract static class b implements mk {
      private final mm d;
      private final CompletableFuture<ju.a> e;

      protected b(mm $$0, CompletableFuture<ju.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mi $$0) {
         return this.e.thenCompose($$1 -> {
            final mm.a $$2 = this.d.a(me.br);
            final mm.a $$3 = this.d.a(me.bq);
            final Set<alc<dcl<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            od $$6 = new od() {
               @Override
               public void a(alc<dcl<?>> $$0x, dcl<?> $$1x, @Nullable ai $$2x) {
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
                  return ah.a.b().a(ob.a);
               }

               @Override
               public void b() {
                  ai $$0 = ah.a.b().a("impossible", ap.b.a(new ch.a())).b(ob.a);
                  this.a($$0);
               }

               private void a(alc<dcl<?>> $$0x, dcl<?> $$1x) {
                  $$5.add(mk.a($$0, $$1, dcl.a, $$1, $$2.a($$0.a())));
               }

               private void a(ai $$0x) {
                  $$5.add(mk.a($$0, $$1, ah.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract oe a(ju.a var1, od var2);
   }
}
