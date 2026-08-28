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

public abstract class oc {
   protected final jt.a a;
   private final js<cxd> c;
   protected final ob b;
   private static final Map<mf.b, oc.a> d = ImmutableMap.builder()
      .put(mf.b.a, (oc.a)($$0, $$1, $$2) -> $$0.e($$1, dbr.a($$2)))
      .put(mf.b.b, (oc.a)($$0, $$1, $$2) -> $$0.b(oa.a, $$1, dbr.a($$2)))
      .put(mf.b.d, (oc.a)($$0, $$1, $$2) -> $$0.f(oa.a, $$1, dbr.a($$2)))
      .put(mf.b.e, (oc.a)($$0, $$1, $$2) -> $$0.a($$1, dbr.a($$2)))
      .put(mf.b.f, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, dbr.a($$2)))
      .put(mf.b.g, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, dbr.a($$2)))
      .put(mf.b.h, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, dbr.a($$2)))
      .put(mf.b.i, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, dbr.a($$2)))
      .put(mf.b.k, (oc.a)($$0, $$1, $$2) -> $$0.h($$1, dbr.a($$2)))
      .put(mf.b.l, (oc.a)($$0, $$1, $$2) -> $$0.a(oa.a, $$1, dbr.a($$2)))
      .put(mf.b.m, (oc.a)($$0, $$1, $$2) -> $$0.b($$1, dbr.a($$2)))
      .put(mf.b.n, (oc.a)($$0, $$1, $$2) -> $$0.c(oa.c, $$1, dbr.a($$2)))
      .put(mf.b.o, (oc.a)($$0, $$1, $$2) -> $$0.e(oa.a, $$1, dbr.a($$2)))
      .put(mf.b.p, (oc.a)($$0, $$1, $$2) -> $$0.c($$1, dbr.a($$2)))
      .put(mf.b.q, (oc.a)($$0, $$1, $$2) -> $$0.d(oa.b, $$1, dbr.a($$2)))
      .build();

   protected oc(jt.a $$0, ob $$1) {
      this.a = $$0;
      this.c = $$0.d(mc.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(csn $$0) {
      me.a().filter(mf::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dgy $$0, dgy $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dgy $$0, dgy $$1, @Nullable String $$2, int $$3) {
      this.b(oa.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dgy> $$0, oa $$1, dgy $$2, float $$3, int $$4, String $$5) {
      this.a(dcf.o, dcp::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dgy> $$0, oa $$1, dgy $$2, float $$3, int $$4, String $$5) {
      this.a(dcf.p, dbe::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dbb> void a(dcf<T> $$0, dbb.a<T> $$1, List<dgy> $$2, oa $$3, dgy $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dgy $$9 : $$2) {
         of.a(dbr.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cxd $$0, oa $$1, cxd $$2) {
      oh.a(dbr.a(cxl.yy), dbr.a($$0), this.b(awy.bg), $$1, $$2).a("has_netherite_ingot", this.a(awy.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cxd $$0, akt<dbv<?>> $$1) {
      oi.a(dbr.a($$0), this.b(awy.bC), this.b(awy.bD), oa.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(oa $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oa $$0, dgy $$1, dgy $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oa $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dgy $$0, axf<cxd> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgy $$0, axf<cxd> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dgy $$0, dgy $$1) {
      this.a(oa.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgy $$0, dgy $$1) {
      this.a(oa.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dkg.J)).a(this.b);
   }

   protected void c(dgy $$0, dgy $$1) {
      this.b(oa.d, $$0).b(dkg.cD).b($$1).b("chest_boat").b("has_boat", this.a(awy.aR)).a(this.b);
   }

   private nz e(dgy $$0, dbr $$1) {
      return this.b(oa.c, $$0).a($$1);
   }

   protected nz a(dgy $$0, dbr $$1) {
      return this.a(oa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private nz f(dgy $$0, dbr $$1) {
      int $$2 = $$0 == dkg.fJ ? 6 : 3;
      cxd $$3 = $$0 == dkg.fJ ? cxl.vy : cxl.pX;
      return this.a(oa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private nz g(dgy $$0, dbr $$1) {
      return this.a(oa.c, $$0).a('#', cxl.pX).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dgy $$0, dgy $$1) {
      this.c(oa.c, $$0, dbr.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private nz c(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oa $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected nz a(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected nz b(dgy $$0, dbr $$1) {
      return this.a(oa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected nz c(dgy $$0, dbr $$1) {
      return this.a(oa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private nz h(dgy $$0, dbr $$1) {
      return this.a(oa.b, $$0, 3).c("sign").a('#', $$1).a('X', cxl.pX).b("###").b("###").b(" X ");
   }

   protected void e(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cxl.gj).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cxd> $$0, List<cxd> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oa.a);
   }

   protected void a(List<cxd> $$0, List<cxd> $$1, @Nullable cxd $$2, String $$3, oa $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cxd $$6 = $$0.get($$5);
         cxd $$7 = $$1.get($$5);
         Stream<cxd> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dbr.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('X', awy.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('|', cxl.pX).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dgy $$0, dgy $$1) {
      this.a(oa.a, $$0, 8).a('#', dkg.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dgy)dkg.aX)).a(this.b);
   }

   protected void j(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dgy $$0, dgy $$1) {
      this.a(oa.b, $$0, 8)
         .a('#', dkg.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dgy)dkg.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dkg.fm));
   }

   protected void l(dgy $$0, dgy $$1) {
      this.a(oa.a, $$0, 8).a('#', dkg.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dgy)dkg.iY)).a(this.b);
   }

   protected void m(dgy $$0, dgy $$1) {
      this.b(oa.a, $$0, 8).b($$1).a(dkg.L, 4).a(dkg.O, 4).b("concrete_powder").b("has_sand", this.a((dgy)dkg.L)).b("has_gravel", this.a((dgy)dkg.O)).a(this.b);
   }

   protected void n(dgy $$0, dgy $$1) {
      this.b(oa.b, $$0).b(dkg.qn).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oa $$0, dgy $$1, dgy $$2) {
      this.d($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz d(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oa $$0, dgy $$1, dgy $$2) {
      this.e($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz e(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oa $$0, dgy $$1, dgy $$2) {
      this.f($$0, $$1, dbr.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private od f(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oa $$0, dgy $$1, dgy $$2) {
      this.b($$0, $$1, dbr.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oa $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected od b(oa $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oa $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oa $$0, dgy $$1, dgy $$2, int $$3) {
      og.a(dbr.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dgy $$0, dgy $$1) {
      of.c(dbr.a($$1), oa.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oa $$0, dgy $$1, oa $$2, dgy $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oa $$0, dgy $$1, oa $$2, dgy $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oa $$0, dgy $$1, oa $$2, dgy $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oa $$0, dgy $$1, oa $$2, dgy $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, akt.a(mc.bm, aku.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, akt.a(mc.bm, aku.a($$4)));
   }

   protected void o(dgy $$0, dgy $$1) {
      this.a(oa.i, $$0, 2).a('#', cxl.pg).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dgy $$0, dbr $$1) {
      this.a(oa.i, $$0, 2).a('#', cxl.pg).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dbb> void a(String $$0, dcf<T> $$1, dbb.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cxl.sZ, cxl.ta, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.tb, cxl.tc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.rY, cxl.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.dT, cxl.sW, 0.1F);
      this.a($$0, $$1, $$2, $$3, cxl.rZ, cxl.sd, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.vP, cxl.vQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.qE, cxl.qF, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.vh, cxl.vi, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxl.vC, cxl.vD, 0.35F);
   }

   private <T extends dbb> void a(String $$0, dcf<T> $$1, dbb.a<T> $$2, int $$3, dgy $$4, dgy $$5, float $$6) {
      of.a(dbr.a($$4), oa.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(csn $$0) {
      cwy.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(oa.a, $$2).b($$1).b(cxl.xC).b(c($$2)).b(b($$1), this.a((dgy)$$1)).a(this.b, p($$2, cxl.xC));
         }
      });
   }

   protected void a(dke $$0, dke $$1) {
      this.a(oa.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dgy)$$1)).a(this.b);
   }

   protected void b(dke $$0, dke $$1) {
      this.a(oa.c, $$0, 4).a('C', $$1).a('R', cxl.mg).a('B', cxl.tf).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dgy)$$1)).a(this.b);
   }

   protected void a(cxd $$0, dsm $$1) {
      cxh $$2 = new cxh(cxl.wY.f(), 1, ks.a().a(kv.T, $$1.c()).a());
      this.a(oa.g, $$2).b(cxl.pa).b(cxl.dJ).b(cxl.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mf $$0, csn $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oc.a $$4 = d.get($$2);
            dgy $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               nz $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mf.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mf.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dke a(mf $$0, mf.b $$1) {
      if ($$1 == mf.b.b) {
         if (!$$0.b().containsKey(mf.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mf.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static aq<bt.a> a(dke $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(dk.d $$0, dgy $$1) {
      return a(cv.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(dgy $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axf<cxd> $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cv.a... $$0) {
      return a(Arrays.stream($$0).map(cv.a::b).toArray(cv[]::new));
   }

   private static aq<cj.a> a(cv... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(dgy $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dgy $$0) {
      return mb.g.b($$0.i()).a();
   }

   protected static String d(dgy $$0) {
      return c($$0);
   }

   protected static String p(dgy $$0, dgy $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dgy $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dgy $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dbr b(axf<cxd> $$0) {
      return dbr.a(this.c.b($$0));
   }

   protected od a(oa $$0, dgy $$1) {
      return od.a(this.c, $$0, $$1);
   }

   protected od a(oa $$0, dgy $$1, int $$2) {
      return od.a(this.c, $$0, $$1, $$2);
   }

   protected oe a(oa $$0, cxh $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgy $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgy $$1, int $$2) {
      return oe.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      nz create(oc var1, dgy var2, dgy var3);
   }

   protected abstract static class b implements mi {
      private final mk d;
      private final CompletableFuture<jt.a> e;

      protected b(mk $$0, CompletableFuture<jt.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mg $$0) {
         return this.e.thenCompose($$1 -> {
            final mk.a $$2 = this.d.a(mc.bm);
            final mk.a $$3 = this.d.a(mc.bl);
            final Set<akt<dbv<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ob $$6 = new ob() {
               @Override
               public void a(akt<dbv<?>> $$0x, dbv<?> $$1x, @Nullable ai $$2x) {
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
                  return ah.a.b().a(nz.a);
               }

               @Override
               public void b() {
                  ai $$0 = ah.a.b().a("impossible", ap.b.a(new ch.a())).b(nz.a);
                  this.a($$0);
               }

               private void a(akt<dbv<?>> $$0x, dbv<?> $$1x) {
                  $$5.add(mi.a($$0, $$1, dbv.a, $$1, $$2.a($$0.a())));
               }

               private void a(ai $$0x) {
                  $$5.add(mi.a($$0, $$1, ah.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract oc a(jt.a var1, ob var2);
   }
}
