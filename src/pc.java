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

public abstract class pc {
   protected final js.a a;
   private final jr<cxk> c;
   protected final pb b;
   private static final Map<me.b, pc.a> d = ImmutableMap.builder()
      .put(me.b.a, (pc.a)($$0, $$1, $$2) -> $$0.e($$1, dbz.a($$2)))
      .put(me.b.b, (pc.a)($$0, $$1, $$2) -> $$0.b(pa.a, $$1, dbz.a($$2)))
      .put(me.b.d, (pc.a)($$0, $$1, $$2) -> $$0.f(pa.a, $$1, dbz.a($$2)))
      .put(me.b.e, (pc.a)($$0, $$1, $$2) -> $$0.a($$1, dbz.a($$2)))
      .put(me.b.f, (pc.a)($$0, $$1, $$2) -> $$0.f($$1, dbz.a($$2)))
      .put(me.b.g, (pc.a)($$0, $$1, $$2) -> $$0.f($$1, dbz.a($$2)))
      .put(me.b.h, (pc.a)($$0, $$1, $$2) -> $$0.g($$1, dbz.a($$2)))
      .put(me.b.i, (pc.a)($$0, $$1, $$2) -> $$0.g($$1, dbz.a($$2)))
      .put(me.b.k, (pc.a)($$0, $$1, $$2) -> $$0.h($$1, dbz.a($$2)))
      .put(me.b.l, (pc.a)($$0, $$1, $$2) -> $$0.a(pa.a, $$1, dbz.a($$2)))
      .put(me.b.m, (pc.a)($$0, $$1, $$2) -> $$0.b($$1, dbz.a($$2)))
      .put(me.b.n, (pc.a)($$0, $$1, $$2) -> $$0.c(pa.c, $$1, dbz.a($$2)))
      .put(me.b.o, (pc.a)($$0, $$1, $$2) -> $$0.e(pa.a, $$1, dbz.a($$2)))
      .put(me.b.p, (pc.a)($$0, $$1, $$2) -> $$0.c($$1, dbz.a($$2)))
      .put(me.b.q, (pc.a)($$0, $$1, $$2) -> $$0.d(pa.b, $$1, dbz.a($$2)))
      .build();

   protected pc(js.a $$0, pb $$1) {
      this.a = $$0;
      this.c = $$0.d(mb.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(css $$0) {
      md.a().filter(me::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dhg $$0, dhg $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dhg $$0, dhg $$1, @Nullable String $$2, int $$3) {
      this.b(pa.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dhg> $$0, pa $$1, dhg $$2, float $$3, int $$4, String $$5) {
      this.a(dcn.o, dcx::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dhg> $$0, pa $$1, dhg $$2, float $$3, int $$4, String $$5) {
      this.a(dcn.p, dbm::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dbj> void a(dcn<T> $$0, dbj.a<T> $$1, List<dhg> $$2, pa $$3, dhg $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dhg $$9 : $$2) {
         pf.a(dbz.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cxk $$0, pa $$1, cxk $$2) {
      ph.a(dbz.a(cxs.ym), dbz.a($$0), this.b(ayd.bi), $$1, $$2).a("has_netherite_ingot", this.a(ayd.bi)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cxk $$0, aly<dcd<?>> $$1) {
      pi.a(dbz.a($$0), this.b(ayd.bE), this.b(ayd.bF), pa.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(pa $$0, dhg $$1, dhg $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(pa $$0, dhg $$1, dhg $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(pa $$0, dhg $$1, dhg $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dhg $$0, ayk<cxk> $$1, int $$2) {
      this.b(pa.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dhg $$0, ayk<cxk> $$1, int $$2) {
      this.b(pa.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dhg $$0, dhg $$1) {
      this.a(pa.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dhg $$0, dhg $$1) {
      this.a(pa.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dkn.J)).a(this.b);
   }

   protected void c(dhg $$0, dhg $$1) {
      this.b(pa.d, $$0).b(dkn.cD).b($$1).b("chest_boat").b("has_boat", this.a(ayd.aT)).a(this.b);
   }

   private oz e(dhg $$0, dbz $$1) {
      return this.b(pa.c, $$0).a($$1);
   }

   protected oz a(dhg $$0, dbz $$1) {
      return this.a(pa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oz f(dhg $$0, dbz $$1) {
      int $$2 = $$0 == dkn.fC ? 6 : 3;
      cxk $$3 = $$0 == dkn.fC ? cxs.vn : cxs.pM;
      return this.a(pa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oz g(dhg $$0, dbz $$1) {
      return this.a(pa.c, $$0).a('#', cxs.pM).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dhg $$0, dhg $$1) {
      this.c(pa.c, $$0, dbz.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oz c(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(pa $$0, dhg $$1, dhg $$2) {
      this.a($$0, $$1, dbz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oz a(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oz b(dhg $$0, dbz $$1) {
      return this.a(pa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oz c(dhg $$0, dbz $$1) {
      return this.a(pa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oz h(dhg $$0, dbz $$1) {
      return this.a(pa.b, $$0, 3).c("sign").a('#', $$1).a('X', cxs.pM).b("###").b("###").b(" X ");
   }

   protected void e(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cxs.gf).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cxk> $$0, List<cxk> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, pa.a);
   }

   protected void a(List<cxk> $$0, List<cxk> $$1, @Nullable cxk $$2, String $$3, pa $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cxk $$6 = $$0.get($$5);
         cxk $$7 = $$1.get($$5);
         Stream<cxk> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dbz.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0).a('#', $$1).a('X', ayd.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0).a('#', $$1).a('|', cxs.pM).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dhg $$0, dhg $$1) {
      this.a(pa.a, $$0, 8).a('#', dkn.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dhg)dkn.aX)).a(this.b);
   }

   protected void j(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dhg $$0, dhg $$1) {
      this.a(pa.b, $$0, 8)
         .a('#', dkn.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dhg)dkn.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dkn.fm));
   }

   protected void l(dhg $$0, dhg $$1) {
      this.a(pa.a, $$0, 8).a('#', dkn.iR).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dhg)dkn.iR)).a(this.b);
   }

   protected void m(dhg $$0, dhg $$1) {
      this.b(pa.a, $$0, 8).b($$1).a(dkn.L, 4).a(dkn.O, 4).b("concrete_powder").b("has_sand", this.a((dhg)dkn.L)).b("has_gravel", this.a((dhg)dkn.O)).a(this.b);
   }

   protected void n(dhg $$0, dhg $$1) {
      this.b(pa.b, $$0).b(dkn.qg).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(pa $$0, dhg $$1, dhg $$2) {
      this.d($$0, $$1, dbz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oz d(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(pa $$0, dhg $$1, dhg $$2) {
      this.e($$0, $$1, dbz.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oz e(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(pa $$0, dhg $$1, dhg $$2) {
      this.f($$0, $$1, dbz.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private pd f(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(pa $$0, dhg $$1, dhg $$2) {
      this.b($$0, $$1, dbz.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(pa $$0, dhg $$1, dhg $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected pd b(pa $$0, dhg $$1, dbz $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(pa $$0, dhg $$1, dhg $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(pa $$0, dhg $$1, dhg $$2, int $$3) {
      pg.a(dbz.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dhg $$0, dhg $$1) {
      pf.c(dbz.a($$1), pa.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(pa $$0, dhg $$1, pa $$2, dhg $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(pa $$0, dhg $$1, pa $$2, dhg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(pa $$0, dhg $$1, pa $$2, dhg $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(pa $$0, dhg $$1, pa $$2, dhg $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, aly.a(mb.bk, alz.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, aly.a(mb.bk, alz.a($$4)));
   }

   protected void o(dhg $$0, dhg $$1) {
      this.a(pa.i, $$0, 2).a('#', cxs.oV).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dhg $$0, dbz $$1) {
      this.a(pa.i, $$0, 2).a('#', cxs.oV).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dbj> void a(String $$0, dcn<T> $$1, dbj.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cxs.sO, cxs.sP, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.sQ, cxs.sR, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.rN, cxs.rR, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.dR, cxs.sL, 0.1F);
      this.a($$0, $$1, $$2, $$3, cxs.rO, cxs.rS, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.vD, cxs.vE, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.qt, cxs.qu, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.uW, cxs.uX, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxs.vq, cxs.vr, 0.35F);
   }

   private <T extends dbj> void a(String $$0, dcn<T> $$1, dbj.a<T> $$2, int $$3, dhg $$4, dhg $$5, float $$6) {
      pf.a(dbz.a($$4), pa.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(css $$0) {
      cxf.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(pa.a, $$2).b($$1).b(cxs.xq).b(c($$2)).b(b($$1), this.a((dhg)$$1)).a(this.b, p($$2, cxs.xq));
         }
      });
   }

   protected void a(dkl $$0, dkl $$1) {
      this.a(pa.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dhg)$$1)).a(this.b);
   }

   protected void b(dkl $$0, dkl $$1) {
      this.a(pa.c, $$0, 4).a('C', $$1).a('R', cxs.lV).a('B', cxs.sU).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dhg)$$1)).a(this.b);
   }

   protected void a(cxk $$0, dsq $$1) {
      cxo $$2 = new cxo(cxs.wM.f(), 1, kr.a().a(ku.R, $$1.b()).a());
      this.a(pa.g, $$2).b(cxs.oP).b(cxs.dH).b(cxs.dI).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(me $$0, css $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            pc.a $$4 = d.get($$2);
            dhg $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               oz $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == me.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == me.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dkl a(me $$0, me.b $$1) {
      if ($$1 == me.b.b) {
         if (!$$0.b().containsKey(me.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(me.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ap<bs.a> a(dkl $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dhg $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dhg $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(ayk<cxk> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dhg $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dhg $$0) {
      return ma.g.b($$0.j()).a();
   }

   protected static String d(dhg $$0) {
      return c($$0);
   }

   protected static String p(dhg $$0, dhg $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dhg $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dhg $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dbz b(ayk<cxk> $$0) {
      return dbz.a(this.c.b($$0));
   }

   protected pd a(pa $$0, dhg $$1) {
      return pd.a(this.c, $$0, $$1);
   }

   protected pd a(pa $$0, dhg $$1, int $$2) {
      return pd.a(this.c, $$0, $$1, $$2);
   }

   protected pe a(pa $$0, cxo $$1) {
      return pe.a(this.c, $$0, $$1);
   }

   protected pe b(pa $$0, dhg $$1) {
      return pe.a(this.c, $$0, $$1);
   }

   protected pe b(pa $$0, dhg $$1, int $$2) {
      return pe.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oz create(pc var1, dhg var2, dhg var3);
   }

   protected abstract static class b implements mh {
      private final mj d;
      private final CompletableFuture<js.a> e;

      protected b(mj $$0, CompletableFuture<js.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mf $$0) {
         return this.e.thenCompose($$1 -> {
            final mj.a $$2 = this.d.a(mb.bk);
            final mj.a $$3 = this.d.a(mb.bj);
            final Set<aly<dcd<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            pb $$6 = new pb() {
               @Override
               public void a(aly<dcd<?>> $$0x, dcd<?> $$1x, @Nullable ah $$2x) {
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
               public ag.a a() {
                  return ag.a.b().a(oz.a);
               }

               @Override
               public void b() {
                  ah $$0 = ag.a.b().a("impossible", ao.b.a(new cg.a())).b(oz.a);
                  this.a($$0);
               }

               private void a(aly<dcd<?>> $$0x, dcd<?> $$1x) {
                  $$5.add(mh.a($$0, $$1, dcd.a, $$1, $$2.a($$0.a())));
               }

               private void a(ah $$0x) {
                  $$5.add(mh.a($$0, $$1, ag.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract pc a(js.a var1, pb var2);
   }
}
