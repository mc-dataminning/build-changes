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
   private final jr<cxg> c;
   protected final pb b;
   private static final Map<me.b, pc.a> d = ImmutableMap.builder()
      .put(me.b.a, (pc.a)($$0, $$1, $$2) -> $$0.e($$1, dbv.a($$2)))
      .put(me.b.b, (pc.a)($$0, $$1, $$2) -> $$0.b(pa.a, $$1, dbv.a($$2)))
      .put(me.b.d, (pc.a)($$0, $$1, $$2) -> $$0.f(pa.a, $$1, dbv.a($$2)))
      .put(me.b.e, (pc.a)($$0, $$1, $$2) -> $$0.a($$1, dbv.a($$2)))
      .put(me.b.f, (pc.a)($$0, $$1, $$2) -> $$0.f($$1, dbv.a($$2)))
      .put(me.b.g, (pc.a)($$0, $$1, $$2) -> $$0.f($$1, dbv.a($$2)))
      .put(me.b.h, (pc.a)($$0, $$1, $$2) -> $$0.g($$1, dbv.a($$2)))
      .put(me.b.i, (pc.a)($$0, $$1, $$2) -> $$0.g($$1, dbv.a($$2)))
      .put(me.b.k, (pc.a)($$0, $$1, $$2) -> $$0.h($$1, dbv.a($$2)))
      .put(me.b.l, (pc.a)($$0, $$1, $$2) -> $$0.a(pa.a, $$1, dbv.a($$2)))
      .put(me.b.m, (pc.a)($$0, $$1, $$2) -> $$0.b($$1, dbv.a($$2)))
      .put(me.b.n, (pc.a)($$0, $$1, $$2) -> $$0.c(pa.c, $$1, dbv.a($$2)))
      .put(me.b.o, (pc.a)($$0, $$1, $$2) -> $$0.e(pa.a, $$1, dbv.a($$2)))
      .put(me.b.p, (pc.a)($$0, $$1, $$2) -> $$0.c($$1, dbv.a($$2)))
      .put(me.b.q, (pc.a)($$0, $$1, $$2) -> $$0.d(pa.b, $$1, dbv.a($$2)))
      .build();

   protected pc(js.a $$0, pb $$1) {
      this.a = $$0;
      this.c = $$0.d(mb.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cso $$0) {
      md.a().filter(me::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dgz $$0, dgz $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dgz $$0, dgz $$1, @Nullable String $$2, int $$3) {
      this.b(pa.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dgz> $$0, pa $$1, dgz $$2, float $$3, int $$4, String $$5) {
      this.a(dci.o, dcs::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dgz> $$0, pa $$1, dgz $$2, float $$3, int $$4, String $$5) {
      this.a(dci.p, dbj::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dbf> void a(dci<T> $$0, dbf.a<T> $$1, List<dgz> $$2, pa $$3, dgz $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dgz $$9 : $$2) {
         pf.a(dbv.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cxg $$0, pa $$1, cxg $$2) {
      ph.a(dbv.a(cxo.ym), dbv.a($$0), this.b(ayd.bi), $$1, $$2).a("has_netherite_ingot", this.a(ayd.bi)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cxg $$0, aly<dbz<?>> $$1) {
      pi.a(dbv.a($$0), this.b(ayd.bE), this.b(ayd.bF), pa.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(pa $$0, dgz $$1, dgz $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(pa $$0, dgz $$1, dgz $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(pa $$0, dgz $$1, dgz $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dgz $$0, ayk<cxg> $$1, int $$2) {
      this.b(pa.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgz $$0, ayk<cxg> $$1, int $$2) {
      this.b(pa.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dgz $$0, dgz $$1) {
      this.a(pa.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgz $$0, dgz $$1) {
      this.a(pa.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dkg.J)).a(this.b);
   }

   protected void c(dgz $$0, dgz $$1) {
      this.b(pa.d, $$0).b(dkg.cD).b($$1).b("chest_boat").b("has_boat", this.a(ayd.aT)).a(this.b);
   }

   private oz e(dgz $$0, dbv $$1) {
      return this.b(pa.c, $$0).a($$1);
   }

   protected oz a(dgz $$0, dbv $$1) {
      return this.a(pa.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oz f(dgz $$0, dbv $$1) {
      int $$2 = $$0 == dkg.fC ? 6 : 3;
      cxg $$3 = $$0 == dkg.fC ? cxo.vn : cxo.pM;
      return this.a(pa.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oz g(dgz $$0, dbv $$1) {
      return this.a(pa.c, $$0).a('#', cxo.pM).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dgz $$0, dgz $$1) {
      this.c(pa.c, $$0, dbv.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oz c(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(pa $$0, dgz $$1, dgz $$2) {
      this.a($$0, $$1, dbv.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oz a(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oz b(dgz $$0, dbv $$1) {
      return this.a(pa.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oz c(dgz $$0, dbv $$1) {
      return this.a(pa.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oz h(dgz $$0, dbv $$1) {
      return this.a(pa.b, $$0, 3).c("sign").a('#', $$1).a('X', cxo.pM).b("###").b("###").b(" X ");
   }

   protected void e(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cxo.gf).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cxg> $$0, List<cxg> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, pa.a);
   }

   protected void a(List<cxg> $$0, List<cxg> $$1, @Nullable cxg $$2, String $$3, pa $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cxg $$6 = $$0.get($$5);
         cxg $$7 = $$1.get($$5);
         Stream<cxg> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dbv.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0).a('#', $$1).a('X', ayd.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0).a('#', $$1).a('|', cxo.pM).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dgz $$0, dgz $$1) {
      this.a(pa.a, $$0, 8).a('#', dkg.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dgz)dkg.aX)).a(this.b);
   }

   protected void j(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dgz $$0, dgz $$1) {
      this.a(pa.b, $$0, 8)
         .a('#', dkg.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dgz)dkg.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dkg.fm));
   }

   protected void l(dgz $$0, dgz $$1) {
      this.a(pa.a, $$0, 8).a('#', dkg.iR).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dgz)dkg.iR)).a(this.b);
   }

   protected void m(dgz $$0, dgz $$1) {
      this.b(pa.a, $$0, 8).b($$1).a(dkg.L, 4).a(dkg.O, 4).b("concrete_powder").b("has_sand", this.a((dgz)dkg.L)).b("has_gravel", this.a((dgz)dkg.O)).a(this.b);
   }

   protected void n(dgz $$0, dgz $$1) {
      this.b(pa.b, $$0).b(dkg.qg).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(pa $$0, dgz $$1, dgz $$2) {
      this.d($$0, $$1, dbv.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oz d(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(pa $$0, dgz $$1, dgz $$2) {
      this.e($$0, $$1, dbv.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oz e(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(pa $$0, dgz $$1, dgz $$2) {
      this.f($$0, $$1, dbv.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private pd f(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(pa $$0, dgz $$1, dgz $$2) {
      this.b($$0, $$1, dbv.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(pa $$0, dgz $$1, dgz $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected pd b(pa $$0, dgz $$1, dbv $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(pa $$0, dgz $$1, dgz $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(pa $$0, dgz $$1, dgz $$2, int $$3) {
      pg.a(dbv.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dgz $$0, dgz $$1) {
      pf.c(dbv.a($$1), pa.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(pa $$0, dgz $$1, pa $$2, dgz $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(pa $$0, dgz $$1, pa $$2, dgz $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(pa $$0, dgz $$1, pa $$2, dgz $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(pa $$0, dgz $$1, pa $$2, dgz $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, aly.a(mb.bj, alz.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, aly.a(mb.bj, alz.a($$4)));
   }

   protected void o(dgz $$0, dgz $$1) {
      this.a(pa.i, $$0, 2).a('#', cxo.oV).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dgz $$0, dbv $$1) {
      this.a(pa.i, $$0, 2).a('#', cxo.oV).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dbf> void a(String $$0, dci<T> $$1, dbf.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cxo.sO, cxo.sP, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.sQ, cxo.sR, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.rN, cxo.rR, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.dR, cxo.sL, 0.1F);
      this.a($$0, $$1, $$2, $$3, cxo.rO, cxo.rS, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.vD, cxo.vE, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.qt, cxo.qu, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.uW, cxo.uX, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxo.vq, cxo.vr, 0.35F);
   }

   private <T extends dbf> void a(String $$0, dci<T> $$1, dbf.a<T> $$2, int $$3, dgz $$4, dgz $$5, float $$6) {
      pf.a(dbv.a($$4), pa.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cso $$0) {
      cxb.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(pa.a, $$2).b($$1).b(cxo.xq).b(c($$2)).b(b($$1), this.a((dgz)$$1)).a(this.b, p($$2, cxo.xq));
         }
      });
   }

   protected void a(dke $$0, dke $$1) {
      this.a(pa.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dgz)$$1)).a(this.b);
   }

   protected void b(dke $$0, dke $$1) {
      this.a(pa.c, $$0, 4).a('C', $$1).a('R', cxo.lV).a('B', cxo.sU).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dgz)$$1)).a(this.b);
   }

   protected void a(cxg $$0, dsj $$1) {
      cxk $$2 = new cxk(cxo.wM.f(), 1, kr.a().a(ku.R, $$1.b()).a());
      this.a(pa.g, $$2).b(cxo.oP).b(cxo.dH).b(cxo.dI).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(me $$0, cso $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            pc.a $$4 = d.get($$2);
            dgz $$5 = this.a($$0, $$2);
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

   private dke a(me $$0, me.b $$1) {
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

   private static ap<bs.a> a(dke $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dgz $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dgz $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(ayk<cxg> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dgz $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dgz $$0) {
      return ma.g.b($$0.j()).a();
   }

   protected static String d(dgz $$0) {
      return c($$0);
   }

   protected static String p(dgz $$0, dgz $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dgz $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dgz $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dbv b(ayk<cxg> $$0) {
      return dbv.a(this.c.b($$0));
   }

   protected pd a(pa $$0, dgz $$1) {
      return pd.a(this.c, $$0, $$1);
   }

   protected pd a(pa $$0, dgz $$1, int $$2) {
      return pd.a(this.c, $$0, $$1, $$2);
   }

   protected pe a(pa $$0, cxk $$1) {
      return pe.a(this.c, $$0, $$1);
   }

   protected pe b(pa $$0, dgz $$1) {
      return pe.a(this.c, $$0, $$1);
   }

   protected pe b(pa $$0, dgz $$1, int $$2) {
      return pe.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oz create(pc var1, dgz var2, dgz var3);
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
            final mj.a $$2 = this.d.a(mb.bj);
            final mj.a $$3 = this.d.a(mb.bi);
            final Set<aly<dbz<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            pb $$6 = new pb() {
               @Override
               public void a(aly<dbz<?>> $$0x, dbz<?> $$1x, @Nullable ah $$2x) {
                  if (!$$4.add($$0)) {
                     throw new IllegalStateException("Duplicate recipe " + $$0);
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

               private void a(aly<dbz<?>> $$0x, dbz<?> $$1x) {
                  $$5.add(mh.a($$0, $$1, dbz.a, $$1, $$2.a($$0.a())));
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
