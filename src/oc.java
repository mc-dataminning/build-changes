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
   private final js<cwk> c;
   protected final ob b;
   private static final Map<mf.b, oc.a> d = ImmutableMap.builder()
      .put(mf.b.a, (oc.a)($$0, $$1, $$2) -> $$0.e($$1, daz.a($$2)))
      .put(mf.b.b, (oc.a)($$0, $$1, $$2) -> $$0.b(oa.a, $$1, daz.a($$2)))
      .put(mf.b.d, (oc.a)($$0, $$1, $$2) -> $$0.f(oa.a, $$1, daz.a($$2)))
      .put(mf.b.e, (oc.a)($$0, $$1, $$2) -> $$0.a($$1, daz.a($$2)))
      .put(mf.b.f, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, daz.a($$2)))
      .put(mf.b.g, (oc.a)($$0, $$1, $$2) -> $$0.f($$1, daz.a($$2)))
      .put(mf.b.h, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, daz.a($$2)))
      .put(mf.b.i, (oc.a)($$0, $$1, $$2) -> $$0.g($$1, daz.a($$2)))
      .put(mf.b.k, (oc.a)($$0, $$1, $$2) -> $$0.h($$1, daz.a($$2)))
      .put(mf.b.l, (oc.a)($$0, $$1, $$2) -> $$0.a(oa.a, $$1, daz.a($$2)))
      .put(mf.b.m, (oc.a)($$0, $$1, $$2) -> $$0.b($$1, daz.a($$2)))
      .put(mf.b.n, (oc.a)($$0, $$1, $$2) -> $$0.c(oa.c, $$1, daz.a($$2)))
      .put(mf.b.o, (oc.a)($$0, $$1, $$2) -> $$0.e(oa.a, $$1, daz.a($$2)))
      .put(mf.b.p, (oc.a)($$0, $$1, $$2) -> $$0.c($$1, daz.a($$2)))
      .put(mf.b.q, (oc.a)($$0, $$1, $$2) -> $$0.d(oa.b, $$1, daz.a($$2)))
      .build();

   protected oc(jt.a $$0, ob $$1) {
      this.a = $$0;
      this.c = $$0.d(mc.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(crs $$0) {
      me.a().filter(mf::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dgg $$0, dgg $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dgg $$0, dgg $$1, @Nullable String $$2, int $$3) {
      this.b(oa.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dgg> $$0, oa $$1, dgg $$2, float $$3, int $$4, String $$5) {
      this.a(dbn.o, dbx::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dgg> $$0, oa $$1, dgg $$2, float $$3, int $$4, String $$5) {
      this.a(dbn.p, dam::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends daj> void a(dbn<T> $$0, daj.a<T> $$1, List<dgg> $$2, oa $$3, dgg $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dgg $$9 : $$2) {
         of.a(daz.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cwk $$0, oa $$1, cwk $$2) {
      oh.a(daz.a(cws.yw), daz.a($$0), this.b(awy.bg), $$1, $$2).a("has_netherite_ingot", this.a(awy.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cwk $$0, aku<dbd<?>> $$1) {
      oi.a(daz.a($$0), this.b(awy.bC), this.b(awy.bD), oa.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(oa $$0, dgg $$1, dgg $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oa $$0, dgg $$1, dgg $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oa $$0, dgg $$1, dgg $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dgg $$0, axf<cwk> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgg $$0, axf<cwk> $$1, int $$2) {
      this.b(oa.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dgg $$0, dgg $$1) {
      this.a(oa.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgg $$0, dgg $$1) {
      this.a(oa.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(djn.J)).a(this.b);
   }

   protected void c(dgg $$0, dgg $$1) {
      this.b(oa.d, $$0).b(djn.cD).b($$1).b("chest_boat").b("has_boat", this.a(awy.aR)).a(this.b);
   }

   private nz e(dgg $$0, daz $$1) {
      return this.b(oa.c, $$0).a($$1);
   }

   protected nz a(dgg $$0, daz $$1) {
      return this.a(oa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private nz f(dgg $$0, daz $$1) {
      int $$2 = $$0 == djn.fJ ? 6 : 3;
      cwk $$3 = $$0 == djn.fJ ? cws.vw : cws.pV;
      return this.a(oa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private nz g(dgg $$0, daz $$1) {
      return this.a(oa.c, $$0).a('#', cws.pV).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dgg $$0, dgg $$1) {
      this.c(oa.c, $$0, daz.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private nz c(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oa $$0, dgg $$1, dgg $$2) {
      this.a($$0, $$1, daz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected nz a(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected nz b(dgg $$0, daz $$1) {
      return this.a(oa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected nz c(dgg $$0, daz $$1) {
      return this.a(oa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private nz h(dgg $$0, daz $$1) {
      return this.a(oa.b, $$0, 3).c("sign").a('#', $$1).a('X', cws.pV).b("###").b("###").b(" X ");
   }

   protected void e(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cws.gh).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cwk> $$0, List<cwk> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oa.a);
   }

   protected void a(List<cwk> $$0, List<cwk> $$1, @Nullable cwk $$2, String $$3, oa $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cwk $$6 = $$0.get($$5);
         cwk $$7 = $$1.get($$5);
         Stream<cwk> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(daz.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('X', awy.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0).a('#', $$1).a('|', cws.pV).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dgg $$0, dgg $$1) {
      this.a(oa.a, $$0, 8).a('#', djn.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dgg)djn.aX)).a(this.b);
   }

   protected void j(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dgg $$0, dgg $$1) {
      this.a(oa.b, $$0, 8)
         .a('#', djn.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dgg)djn.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, djn.fm));
   }

   protected void l(dgg $$0, dgg $$1) {
      this.a(oa.a, $$0, 8).a('#', djn.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dgg)djn.iY)).a(this.b);
   }

   protected void m(dgg $$0, dgg $$1) {
      this.b(oa.a, $$0, 8).b($$1).a(djn.L, 4).a(djn.O, 4).b("concrete_powder").b("has_sand", this.a((dgg)djn.L)).b("has_gravel", this.a((dgg)djn.O)).a(this.b);
   }

   protected void n(dgg $$0, dgg $$1) {
      this.b(oa.b, $$0).b(djn.qn).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oa $$0, dgg $$1, dgg $$2) {
      this.d($$0, $$1, daz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz d(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oa $$0, dgg $$1, dgg $$2) {
      this.e($$0, $$1, daz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private nz e(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oa $$0, dgg $$1, dgg $$2) {
      this.f($$0, $$1, daz.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private od f(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oa $$0, dgg $$1, dgg $$2) {
      this.b($$0, $$1, daz.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oa $$0, dgg $$1, dgg $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected od b(oa $$0, dgg $$1, daz $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oa $$0, dgg $$1, dgg $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oa $$0, dgg $$1, dgg $$2, int $$3) {
      og.a(daz.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dgg $$0, dgg $$1) {
      of.c(daz.a($$1), oa.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oa $$0, dgg $$1, oa $$2, dgg $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oa $$0, dgg $$1, oa $$2, dgg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oa $$0, dgg $$1, oa $$2, dgg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oa $$0, dgg $$1, oa $$2, dgg $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, aku.a(mc.bk, akv.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, aku.a(mc.bk, akv.a($$4)));
   }

   protected void o(dgg $$0, dgg $$1) {
      this.a(oa.i, $$0, 2).a('#', cws.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dgg $$0, daz $$1) {
      this.a(oa.i, $$0, 2).a('#', cws.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends daj> void a(String $$0, dbn<T> $$1, daj.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cws.sX, cws.sY, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.sZ, cws.ta, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.rW, cws.sa, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.dT, cws.sU, 0.1F);
      this.a($$0, $$1, $$2, $$3, cws.rX, cws.sb, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.vN, cws.vO, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.qC, cws.qD, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.vf, cws.vg, 0.35F);
      this.a($$0, $$1, $$2, $$3, cws.vA, cws.vB, 0.35F);
   }

   private <T extends daj> void a(String $$0, dbn<T> $$1, daj.a<T> $$2, int $$3, dgg $$4, dgg $$5, float $$6) {
      of.a(daz.a($$4), oa.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(crs $$0) {
      cwf.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(oa.a, $$2).b($$1).b(cws.xA).b(c($$2)).b(b($$1), this.a((dgg)$$1)).a(this.b, p($$2, cws.xA));
         }
      });
   }

   protected void a(djl $$0, djl $$1) {
      this.a(oa.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dgg)$$1)).a(this.b);
   }

   protected void b(djl $$0, djl $$1) {
      this.a(oa.c, $$0, 4).a('C', $$1).a('R', cws.me).a('B', cws.td).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dgg)$$1)).a(this.b);
   }

   protected void a(cwk $$0, drs $$1) {
      cwo $$2 = new cwo(cws.wW.f(), 1, ks.a().a(kv.R, $$1.c()).a());
      this.a(oa.g, $$2).b(cws.oY).b(cws.dJ).b(cws.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mf $$0, crs $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            oc.a $$4 = d.get($$2);
            dgg $$5 = this.a($$0, $$2);
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

   private djl a(mf $$0, mf.b $$1) {
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

   private static aq<bt.a> a(djl $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(dk.d $$0, dgg $$1) {
      return a(cv.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(dgg $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axf<cwk> $$0) {
      return a(cv.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cv.a... $$0) {
      return a(Arrays.stream($$0).map(cv.a::b).toArray(cv[]::new));
   }

   private static aq<cj.a> a(cv... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(dgg $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dgg $$0) {
      return mb.g.b($$0.j()).a();
   }

   protected static String d(dgg $$0) {
      return c($$0);
   }

   protected static String p(dgg $$0, dgg $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dgg $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dgg $$0) {
      return c($$0) + "_from_blasting";
   }

   protected daz b(axf<cwk> $$0) {
      return daz.a(this.c.b($$0));
   }

   protected od a(oa $$0, dgg $$1) {
      return od.a(this.c, $$0, $$1);
   }

   protected od a(oa $$0, dgg $$1, int $$2) {
      return od.a(this.c, $$0, $$1, $$2);
   }

   protected oe a(oa $$0, cwo $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgg $$1) {
      return oe.a(this.c, $$0, $$1);
   }

   protected oe b(oa $$0, dgg $$1, int $$2) {
      return oe.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      nz create(oc var1, dgg var2, dgg var3);
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
            final Set<aku<dbd<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ob $$6 = new ob() {
               @Override
               public void a(aku<dbd<?>> $$0x, dbd<?> $$1x, @Nullable ai $$2x) {
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

               private void a(aku<dbd<?>> $$0x, dbd<?> $$1x) {
                  $$5.add(mi.a($$0, $$1, dbd.a, $$1, $$2.a($$0.a())));
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
