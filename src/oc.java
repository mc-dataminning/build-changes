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
   private final js<cwl> c;
   protected final ob b;
   private static final Map<mf.b, oc.a> d = ImmutableMap.builder()
      .put(mf.b.a, (oc.a)($$0, $$1, $$2) -> $$0.e($$1, dba.a($$2)))
      .put(mf.b.b, (oc.a)($$0, $$1, $$2) -> $$0.b(oa.a, $$1, dba.a($$2)))
      .put(mf.b.d, (oc.a)($$0, $$1, $$2) -> $$0.f(oa.a, $$1, dba.a($$2)))
      .put(mf.b.e, (oc.a)($$0, $$1, $$2) -> $$0.a($$1, dba.a($$2)))
      .put(mf.b.f, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, dba.a($$2)))
      .put(mf.b.g, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, dba.a($$2)))
      .put(mf.b.h, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, dba.a($$2)))
      .put(mf.b.i, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, dba.a($$2)))
      .put(mf.b.k, (oc.a)($$0, $$1, $$2) -> $$0.h($$1, dba.a($$2)))
      .put(mf.b.l, (oc.a)($$0, $$1, $$2) -> $$0.a(oa.a, $$1, dba.a($$2)))
      .put(mf.b.m, (oc.a)($$0, $$1, $$2) -> $$0.b($$1, dba.a($$2)))
      .put(mf.b.n, (oc.a)($$0, $$1, $$2) -> $$0.c(oa.c, $$1, dba.a($$2)))
      .put(mf.b.o, (oc.a)($$0, $$1, $$2) -> $$0.e(oa.a, $$1, dba.a($$2)))
      .put(mf.b.p, (oc.a)($$0, $$1, $$2) -> $$0.c($$1, dba.a($$2)))
      .put(mf.b.q, (oc.a)($$0, $$1, $$2) -> $$0.d(oa.b, $$1, dba.a($$2)))
      .build();

   protected oc(jt.a $$0, ob $$1) {
      this.a = $$0;
      this.c = $$0.d(mc.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(crt $$0) {
      me.a().filter(mf::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dgh $$0, dgh $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dgh $$0, dgh $$1, @Nullable String $$2, int $$3) {
      this.b(oa.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dgh> $$0, oa $$1, dgh $$2, float $$3, int $$4, String $$5) {
      this.a(dbo.o, dby::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dgh> $$0, oa $$1, dgh $$2, float $$3, int $$4, String $$5) {
      this.a(dbo.p, dan::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dak> void a(dbo<T> $$0, dak.a<T> $$1, List<dgh> $$2, oa $$3, dgh $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dgh $$9 : $$2) {
         of.a(dba.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cwl $$0, oa $$1, cwl $$2) {
      oh.a(dba.a(cwt.yw), dba.a($$0), this.b(awy.bg), $$1, $$2).a("has_netherite_ingot", this.a(awy.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cwl $$0, akt<dbe<?>> $$1) {
      oi.a(dba.a($$0), this.b(awy.bC), this.b(awy.bD), oa.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(oa $$0, dgh $$1, dgh $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oa $$0, dgh $$1, dgh $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oa $$0, dgh $$1, dgh $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dgh $$0, axf<cwl> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgh $$0, axf<cwl> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dgh $$0, dgh $$1) {
      this.a(oa.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgh $$0, dgh $$1) {
      this.a(oa.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(djo.J)).a(this.b);
   }

   protected void c(dgh $$0, dgh $$1) {
      this.b(oa.d, $$0).b(djo.cD).b($$1).b("chest_boat").b("has_boat", this.a(awy.aR)).a(this.b);
   }

   private nz e(dgh $$0, dba $$1) {
      return this.b(oa.c, $$0).a($$1);
   }

   protected nz a(dgh $$0, dba $$1) {
      return this.a(oa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private nz f(dgh $$0, dba $$1) {
      int $$2 = $$0 == djo.fJ ? 6 : 3;
      cwl $$3 = $$0 == djo.fJ ? cwt.vw : cwt.pV;
      return this.a(oa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private nz g(dgh $$0, dba $$1) {
      return this.a(oa.c, $$0).a('#', cwt.pV).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dgh $$0, dgh $$1) {
      this.c(oa.c, $$0, dba.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private nz c(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oa $$0, dgh $$1, dgh $$2) {
      this.a($$0, $$1, dba.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected nz a(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected nz b(dgh $$0, dba $$1) {
      return this.a(oa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected nz c(dgh $$0, dba $$1) {
      return this.a(oa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private nz h(dgh $$0, dba $$1) {
      return this.a(oa.b, $$0, 3).c("sign").a('#', $$1).a('X', cwt.pV).b("###").b("###").b(" X ");
   }

   protected void e(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cwt.gh).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cwl> $$0, List<cwl> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oa.a);
   }

   protected void a(List<cwl> $$0, List<cwl> $$1, @Nullable cwl $$2, String $$3, oa $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cwl $$6 = $$0.get($$5);
         cwl $$7 = $$1.get($$5);
         Stream<cwl> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dba.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('X', awy.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('|', cwt.pV).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dgh $$0, dgh $$1) {
      this.a(oa.a, $$0, 8).a('#', djo.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dgh)djo.aX)).a(this.b);
   }

   protected void j(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dgh $$0, dgh $$1) {
      this.a(oa.b, $$0, 8)
         .a('#', djo.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dgh)djo.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, djo.fm));
   }

   protected void l(dgh $$0, dgh $$1) {
      this.a(oa.a, $$0, 8).a('#', djo.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dgh)djo.iY)).a(this.b);
   }

   protected void m(dgh $$0, dgh $$1) {
      this.b(oa.a, $$0, 8).b($$1).a(djo.L, 4).a(djo.O, 4).b("concrete_powder").b("has_sand", this.a((dgh)djo.L)).b("has_gravel", this.a((dgh)djo.O)).a(this.b);
   }

   protected void n(dgh $$0, dgh $$1) {
      this.b(oa.b, $$0).b(djo.qn).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oa $$0, dgh $$1, dgh $$2) {
      this.d($$0, $$1, dba.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz d(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oa $$0, dgh $$1, dgh $$2) {
      this.e($$0, $$1, dba.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz e(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oa $$0, dgh $$1, dgh $$2) {
      this.f($$0, $$1, dba.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private od f(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oa $$0, dgh $$1, dgh $$2) {
      this.b($$0, $$1, dba.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oa $$0, dgh $$1, dgh $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected od b(oa $$0, dgh $$1, dba $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oa $$0, dgh $$1, dgh $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oa $$0, dgh $$1, dgh $$2, int $$3) {
      og.a(dba.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dgh $$0, dgh $$1) {
      of.c(dba.a($$1), oa.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oa $$0, dgh $$1, oa $$2, dgh $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oa $$0, dgh $$1, oa $$2, dgh $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oa $$0, dgh $$1, oa $$2, dgh $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oa $$0, dgh $$1, oa $$2, dgh $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, akt.a(mc.bk, aku.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, akt.a(mc.bk, aku.a($$4)));
   }

   protected void o(dgh $$0, dgh $$1) {
      this.a(oa.i, $$0, 2).a('#', cwt.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dgh $$0, dba $$1) {
      this.a(oa.i, $$0, 2).a('#', cwt.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dak> void a(String $$0, dbo<T> $$1, dak.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cwt.sX, cwt.sY, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.sZ, cwt.ta, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.rW, cwt.sa, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.dT, cwt.sU, 0.1F);
      this.a($$0, $$1, $$2, $$3, cwt.rX, cwt.sb, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.vN, cwt.vO, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.qC, cwt.qD, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.vf, cwt.vg, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwt.vA, cwt.vB, 0.35F);
   }

   private <T extends dak> void a(String $$0, dbo<T> $$1, dak.a<T> $$2, int $$3, dgh $$4, dgh $$5, float $$6) {
      of.a(dba.a($$4), oa.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(crt $$0) {
      cwg.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(oa.a, $$2).b($$1).b(cwt.xA).b(c($$2)).b(b($$1), this.a((dgh)$$1)).a(this.b, p($$2, cwt.xA));
         }
      });
   }

   protected void a(djm $$0, djm $$1) {
      this.a(oa.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dgh)$$1)).a(this.b);
   }

   protected void b(djm $$0, djm $$1) {
      this.a(oa.c, $$0, 4).a('C', $$1).a('R', cwt.me).a('B', cwt.td).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dgh)$$1)).a(this.b);
   }

   protected void a(cwl $$0, drt $$1) {
      cwp $$2 = new cwp(cwt.wW.f(), 1, ks.a().a(kv.R, $$1.c()).a());
      this.a(oa.g, $$2).b(cwt.oY).b(cwt.dJ).b(cwt.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mf $$0, crt $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            oc.a $$4 = d.get($$2);
            dgh $$5 = this.a($$0, $$2);
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

   private djm a(mf $$0, mf.b $$1) {
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

   private static aq<bt.a> a(djm $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(dk.d $$0, dgh $$1) {
      return a(cv.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(dgh $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axf<cwl> $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cv.a... $$0) {
      return a(Arrays.stream($$0).map(cv.a::b).toArray(cv[]::new));
   }

   private static aq<cj.a> a(cv... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(dgh $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dgh $$0) {
      return mb.g.b($$0.j()).a();
   }

   protected static String d(dgh $$0) {
      return c($$0);
   }

   protected static String p(dgh $$0, dgh $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dgh $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dgh $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dba b(axf<cwl> $$0) {
      return dba.a(this.c.b($$0));
   }

   protected od a(oa $$0, dgh $$1) {
      return od.a(this.c, $$0, $$1);
   }

   protected od a(oa $$0, dgh $$1, int $$2) {
      return od.a(this.c, $$0, $$1, $$2);
   }

   protected oe a(oa $$0, cwp $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgh $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgh $$1, int $$2) {
      return oe.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      nz create(oc var1, dgh var2, dgh var3);
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
            final mk.a $$2 = this.d.a(mc.bk);
            final mk.a $$3 = this.d.a(mc.bj);
            final Set<akt<dbe<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ob $$6 = new ob() {
               @Override
               public void a(akt<dbe<?>> $$0x, dbe<?> $$1x, @Nullable ai $$2x) {
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

               private void a(akt<dbe<?>> $$0x, dbe<?> $$1x) {
                  $$5.add(mi.a($$0, $$1, dbe.a, $$1, $$2.a($$0.a())));
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
