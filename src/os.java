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

public abstract class os {
   protected final jq.a a;
   private final jp<cvn> c;
   protected final or b;
   private static final Map<lz.b, os.a> d = ImmutableMap.builder()
      .put(lz.b.a, (os.a)($$0, $$1, $$2) -> $$0.e($$1, dag.a($$2)))
      .put(lz.b.b, (os.a)($$0, $$1, $$2) -> $$0.b(oq.a, $$1, dag.a($$2)))
      .put(lz.b.d, (os.a)($$0, $$1, $$2) -> $$0.f(oq.a, $$1, dag.a($$2)))
      .put(lz.b.e, (os.a)($$0, $$1, $$2) -> $$0.a($$1, dag.a($$2)))
      .put(lz.b.f, (os.a)($$0, $$1, $$2) -> $$0.f($$1, dag.a($$2)))
      .put(lz.b.g, (os.a)($$0, $$1, $$2) -> $$0.f($$1, dag.a($$2)))
      .put(lz.b.h, (os.a)($$0, $$1, $$2) -> $$0.g($$1, dag.a($$2)))
      .put(lz.b.i, (os.a)($$0, $$1, $$2) -> $$0.g($$1, dag.a($$2)))
      .put(lz.b.k, (os.a)($$0, $$1, $$2) -> $$0.h($$1, dag.a($$2)))
      .put(lz.b.l, (os.a)($$0, $$1, $$2) -> $$0.a(oq.a, $$1, dag.a($$2)))
      .put(lz.b.m, (os.a)($$0, $$1, $$2) -> $$0.b($$1, dag.a($$2)))
      .put(lz.b.n, (os.a)($$0, $$1, $$2) -> $$0.c(oq.c, $$1, dag.a($$2)))
      .put(lz.b.o, (os.a)($$0, $$1, $$2) -> $$0.e(oq.a, $$1, dag.a($$2)))
      .put(lz.b.p, (os.a)($$0, $$1, $$2) -> $$0.c($$1, dag.a($$2)))
      .put(lz.b.q, (os.a)($$0, $$1, $$2) -> $$0.d(oq.b, $$1, dag.a($$2)))
      .build();

   protected os(jq.a $$0, or $$1) {
      this.a = $$0;
      this.c = $$0.d(lw.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cqq $$0) {
      ly.a().filter(lz::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dei $$0, dei $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dei $$0, dei $$1, @Nullable String $$2, int $$3) {
      this.b(oq.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dei> $$0, oq $$1, dei $$2, float $$3, int $$4, String $$5) {
      this.a(dap.o, dbb::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dei> $$0, oq $$1, dei $$2, float $$3, int $$4, String $$5) {
      this.a(dap.p, czu::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends czr> void a(dap<T> $$0, czr.a<T> $$1, List<dei> $$2, oq $$3, dei $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dei $$9 : $$2) {
         ov.a(dag.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cvn $$0, oq $$1, cvn $$2) {
      ox.a(dag.a(cvw.xy), dag.a($$0), this.b(axe.bc), $$1, $$2).a("has_netherite_ingot", this.a(axe.bc)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cvn $$0, ale $$1) {
      oy.a(dag.a($$0), this.b(axe.bq), this.b(axe.br), oq.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(oq $$0, dei $$1, dei $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oq $$0, dei $$1, dei $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oq $$0, dei $$1, dei $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dei $$0, axl<cvn> $$1, int $$2) {
      this.b(oq.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dei $$0, axl<cvn> $$1, int $$2) {
      this.b(oq.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dei $$0, dei $$1) {
      this.a(oq.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dei $$0, dei $$1) {
      this.a(oq.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dho.G)).a(this.b);
   }

   protected void c(dei $$0, dei $$1) {
      this.b(oq.d, $$0).b(dho.cv).b($$1).b("chest_boat").b("has_boat", this.a(axe.aN)).a(this.b);
   }

   private op e(dei $$0, dag $$1) {
      return this.b(oq.c, $$0).a($$1);
   }

   protected op a(dei $$0, dag $$1) {
      return this.a(oq.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private op f(dei $$0, dag $$1) {
      int $$2 = $$0 == dho.fo ? 6 : 3;
      cvn $$3 = $$0 == dho.fo ? cvw.uz : cvw.pr;
      return this.a(oq.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private op g(dei $$0, dag $$1) {
      return this.a(oq.c, $$0).a('#', cvw.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dei $$0, dei $$1) {
      this.c(oq.c, $$0, dag.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private op c(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oq $$0, dei $$1, dei $$2) {
      this.a($$0, $$1, dag.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected op a(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected op b(dei $$0, dag $$1) {
      return this.a(oq.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected op c(dei $$0, dag $$1) {
      return this.a(oq.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private op h(dei $$0, dag $$1) {
      return this.a(oq.b, $$0, 3).c("sign").a('#', $$1).a('X', cvw.pr).b("###").b("###").b(" X ");
   }

   protected void e(dei $$0, dei $$1) {
      this.a(oq.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cvw.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cvn> $$0, List<cvn> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oq.a);
   }

   protected void a(List<cvn> $$0, List<cvn> $$1, @Nullable cvn $$2, String $$3, oq $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cvn $$6 = $$0.get($$5);
         cvn $$7 = $$1.get($$5);
         Stream<cvn> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dag.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dei $$0, dei $$1) {
      this.a(oq.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dei $$0, dei $$1) {
      this.a(oq.b, $$0).a('#', $$1).a('X', axe.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dei $$0, dei $$1) {
      this.a(oq.b, $$0).a('#', $$1).a('|', cvw.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dei $$0, dei $$1) {
      this.a(oq.a, $$0, 8).a('#', dho.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dei)dho.aQ)).a(this.b);
   }

   protected void j(dei $$0, dei $$1) {
      this.a(oq.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dei $$0, dei $$1) {
      this.a(oq.b, $$0, 8)
         .a('#', dho.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dei)dho.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dho.eY));
   }

   protected void l(dei $$0, dei $$1) {
      this.a(oq.a, $$0, 8).a('#', dho.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dei)dho.iA)).a(this.b);
   }

   protected void m(dei $$0, dei $$1) {
      this.b(oq.a, $$0, 8).b($$1).a(dho.I, 4).a(dho.L, 4).b("concrete_powder").b("has_sand", this.a((dei)dho.I)).b("has_gravel", this.a((dei)dho.L)).a(this.b);
   }

   protected void n(dei $$0, dei $$1) {
      this.b(oq.b, $$0).b(dho.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oq $$0, dei $$1, dei $$2) {
      this.d($$0, $$1, dag.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private op d(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oq $$0, dei $$1, dei $$2) {
      this.e($$0, $$1, dag.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private op e(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oq $$0, dei $$1, dei $$2) {
      this.f($$0, $$1, dag.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private ot f(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oq $$0, dei $$1, dei $$2) {
      this.b($$0, $$1, dag.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oq $$0, dei $$1, dei $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected ot b(oq $$0, dei $$1, dag $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oq $$0, dei $$1, dei $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oq $$0, dei $$1, dei $$2, int $$3) {
      ow.a(dag.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dei $$0, dei $$1) {
      ov.c(dag.a($$1), oq.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oq $$0, dei $$1, oq $$2, dei $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oq $$0, dei $$1, oq $$2, dei $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oq $$0, dei $$1, oq $$2, dei $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oq $$0, dei $$1, oq $$2, dei $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, ale.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, ale.a($$4));
   }

   protected void o(dei $$0, dei $$1) {
      this.a(oq.i, $$0, 2).a('#', cvw.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dei $$0, dag $$1) {
      this.a(oq.i, $$0, 2).a('#', cvw.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends czr> void a(String $$0, dap<T> $$1, czr.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cvw.sb, cvw.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.sd, cvw.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.ra, cvw.re, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.dK, cvw.rY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cvw.rb, cvw.rf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.uP, cvw.uQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.pY, cvw.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.ui, cvw.uj, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvw.uC, cvw.uD, 0.35F);
   }

   private <T extends czr> void a(String $$0, dap<T> $$1, czr.a<T> $$2, int $$3, dei $$4, dei $$5, float $$6) {
      ov.a(dag.a($$4), oq.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cqq $$0) {
      cvi.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(oq.a, $$2).b($$1).b(cvw.wC).b(c($$2)).b(b($$1), this.a((dei)$$1)).a(this.b, p($$2, cvw.wC));
         }
      });
   }

   protected void a(dhm $$0, dhm $$1) {
      this.a(oq.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dei)$$1)).a(this.b);
   }

   protected void b(dhm $$0, dhm $$1) {
      this.a(oq.c, $$0, 4).a('C', $$1).a('R', cvw.lH).a('B', cvw.sh).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dei)$$1)).a(this.b);
   }

   protected void a(cvn $$0, dpp $$1) {
      cvs $$2 = new cvs(cvw.vY.n(), 1, kp.a().a(ks.M, $$1.b()).a());
      this.a(oq.g, $$2).b(cvw.ou).b(cvw.dA).b(cvw.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(lz $$0, cqq $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            os.a $$4 = d.get($$2);
            dei $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               op $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == lz.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == lz.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dhm a(lz $$0, lz.b $$1) {
      if ($$1 == lz.b.b) {
         if (!$$0.b().containsKey(lz.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lz.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dhm $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private ao<cg.a> a(dh.d $$0, dei $$1) {
      return a(cs.a.a().a(this.c, $$1).a($$0));
   }

   protected ao<cg.a> a(dei $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   protected ao<cg.a> a(axl<cvn> $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   private static ao<cg.a> a(cs.a... $$0) {
      return a(Arrays.stream($$0).map(cs.a::b).toArray(cs[]::new));
   }

   private static ao<cg.a> a(cs... $$0) {
      return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
   }

   protected static String b(dei $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dei $$0) {
      return lv.g.b($$0.q()).a();
   }

   protected static String d(dei $$0) {
      return c($$0);
   }

   protected static String p(dei $$0, dei $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dei $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dei $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dag b(axl<cvn> $$0) {
      return dag.a(this.c.b($$0));
   }

   protected ot a(oq $$0, dei $$1) {
      return ot.a(this.c, $$0, $$1);
   }

   protected ot a(oq $$0, dei $$1, int $$2) {
      return ot.a(this.c, $$0, $$1, $$2);
   }

   protected ou a(oq $$0, cvs $$1) {
      return ou.a(this.c, $$0, $$1);
   }

   protected ou b(oq $$0, dei $$1) {
      return ou.a(this.c, $$0, $$1);
   }

   protected ou b(oq $$0, dei $$1, int $$2) {
      return ou.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      op create(os var1, dei var2, dei var3);
   }

   protected abstract static class b implements mc {
      private final me d;
      private final CompletableFuture<jq.a> e;

      protected b(me $$0, CompletableFuture<jq.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(ma $$0) {
         return this.e.thenCompose($$1 -> {
            final me.a $$2 = this.d.a(lw.bi);
            final me.a $$3 = this.d.a(lw.bh);
            final Set<ale> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            or $$6 = new or() {
               @Override
               public void a(ale $$0x, dak<?> $$1x, @Nullable ag $$2x) {
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
               public af.a a() {
                  return af.a.b().a(op.a);
               }

               @Override
               public void b() {
                  ag $$0 = af.a.b().a("impossible", an.b.a(new cf.a())).b(op.a);
                  this.a($$0);
               }

               private void a(ale $$0x, dak<?> $$1x) {
                  $$5.add(mc.a($$0, $$1, dak.h, $$1, $$2.a($$0)));
               }

               private void a(ag $$0x) {
                  $$5.add(mc.a($$0, $$1, af.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract os a(jq.a var1, or var2);
   }
}
