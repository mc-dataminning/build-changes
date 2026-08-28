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

public abstract class or {
   protected final jp.a a;
   private final jo<cvg> c;
   protected final oq b;
   private static final Map<ly.b, or.a> d = ImmutableMap.builder()
      .put(ly.b.a, (or.a)($$0, $$1, $$2) -> $$0.e($$1, czp.a($$2)))
      .put(ly.b.b, (or.a)($$0, $$1, $$2) -> $$0.b(op.a, $$1, czp.a($$2)))
      .put(ly.b.d, (or.a)($$0, $$1, $$2) -> $$0.f(op.a, $$1, czp.a($$2)))
      .put(ly.b.e, (or.a)($$0, $$1, $$2) -> $$0.a($$1, czp.a($$2)))
      .put(ly.b.f, (or.a)($$0, $$1, $$2) -> $$0.f($$1, czp.a($$2)))
      .put(ly.b.g, (or.a)($$0, $$1, $$2) -> $$0.f($$1, czp.a($$2)))
      .put(ly.b.h, (or.a)($$0, $$1, $$2) -> $$0.g($$1, czp.a($$2)))
      .put(ly.b.i, (or.a)($$0, $$1, $$2) -> $$0.g($$1, czp.a($$2)))
      .put(ly.b.k, (or.a)($$0, $$1, $$2) -> $$0.h($$1, czp.a($$2)))
      .put(ly.b.l, (or.a)($$0, $$1, $$2) -> $$0.a(op.a, $$1, czp.a($$2)))
      .put(ly.b.m, (or.a)($$0, $$1, $$2) -> $$0.b($$1, czp.a($$2)))
      .put(ly.b.n, (or.a)($$0, $$1, $$2) -> $$0.c(op.c, $$1, czp.a($$2)))
      .put(ly.b.o, (or.a)($$0, $$1, $$2) -> $$0.e(op.a, $$1, czp.a($$2)))
      .put(ly.b.p, (or.a)($$0, $$1, $$2) -> $$0.c($$1, czp.a($$2)))
      .put(ly.b.q, (or.a)($$0, $$1, $$2) -> $$0.d(op.b, $$1, czp.a($$2)))
      .build();

   protected or(jp.a $$0, oq $$1) {
      this.a = $$0;
      this.c = $$0.b(lv.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cqh $$0) {
      lx.a().filter(ly::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(ddr $$0, ddr $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ddr $$0, ddr $$1, @Nullable String $$2, int $$3) {
      this.b(op.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<ddr> $$0, op $$1, ddr $$2, float $$3, int $$4, String $$5) {
      this.a(czy.o, dak::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<ddr> $$0, op $$1, ddr $$2, float $$3, int $$4, String $$5) {
      this.a(czy.p, czd::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends cza> void a(czy<T> $$0, cza.a<T> $$1, List<ddr> $$2, op $$3, ddr $$4, float $$5, int $$6, String $$7, String $$8) {
      for (ddr $$9 : $$2) {
         ou.a(czp.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cvg $$0, op $$1, cvg $$2) {
      ow.a(czp.a(cvo.xy), czp.a($$0), this.b(axb.bc), $$1, $$2).a("has_netherite_ingot", this.a(axb.bc)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cvg $$0, alb $$1) {
      ox.a(czp.a($$0), this.b(axb.bq), this.b(axb.br), op.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(op $$0, ddr $$1, ddr $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(op $$0, ddr $$1, ddr $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(op $$0, ddr $$1, ddr $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(ddr $$0, axi<cvg> $$1, int $$2) {
      this.b(op.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(ddr $$0, axi<cvg> $$1, int $$2) {
      this.b(op.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(ddr $$0, ddr $$1) {
      this.a(op.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(ddr $$0, ddr $$1) {
      this.a(op.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dgx.G)).a(this.b);
   }

   protected void c(ddr $$0, ddr $$1) {
      this.b(op.d, $$0).b(dgx.cv).b($$1).b("chest_boat").b("has_boat", this.a(axb.aN)).a(this.b);
   }

   private oo e(ddr $$0, czp $$1) {
      return this.b(op.c, $$0).a($$1);
   }

   protected oo a(ddr $$0, czp $$1) {
      return this.a(op.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oo f(ddr $$0, czp $$1) {
      int $$2 = $$0 == dgx.fo ? 6 : 3;
      cvg $$3 = $$0 == dgx.fo ? cvo.uz : cvo.pr;
      return this.a(op.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oo g(ddr $$0, czp $$1) {
      return this.a(op.c, $$0).a('#', cvo.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(ddr $$0, ddr $$1) {
      this.c(op.c, $$0, czp.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oo c(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(op $$0, ddr $$1, ddr $$2) {
      this.a($$0, $$1, czp.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oo a(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oo b(ddr $$0, czp $$1) {
      return this.a(op.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oo c(ddr $$0, czp $$1) {
      return this.a(op.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oo h(ddr $$0, czp $$1) {
      return this.a(op.b, $$0, 3).c("sign").a('#', $$1).a('X', cvo.pr).b("###").b("###").b(" X ");
   }

   protected void e(ddr $$0, ddr $$1) {
      this.a(op.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cvo.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cvg> $$0, List<cvg> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, op.a);
   }

   protected void a(List<cvg> $$0, List<cvg> $$1, @Nullable cvg $$2, String $$3, op $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cvg $$6 = $$0.get($$5);
         cvg $$7 = $$1.get($$5);
         Stream<cvg> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(czp.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(ddr $$0, ddr $$1) {
      this.a(op.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(ddr $$0, ddr $$1) {
      this.a(op.b, $$0).a('#', $$1).a('X', axb.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(ddr $$0, ddr $$1) {
      this.a(op.b, $$0).a('#', $$1).a('|', cvo.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(ddr $$0, ddr $$1) {
      this.a(op.a, $$0, 8).a('#', dgx.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((ddr)dgx.aQ)).a(this.b);
   }

   protected void j(ddr $$0, ddr $$1) {
      this.a(op.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(ddr $$0, ddr $$1) {
      this.a(op.b, $$0, 8)
         .a('#', dgx.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((ddr)dgx.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dgx.eY));
   }

   protected void l(ddr $$0, ddr $$1) {
      this.a(op.a, $$0, 8).a('#', dgx.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((ddr)dgx.iA)).a(this.b);
   }

   protected void m(ddr $$0, ddr $$1) {
      this.b(op.a, $$0, 8).b($$1).a(dgx.I, 4).a(dgx.L, 4).b("concrete_powder").b("has_sand", this.a((ddr)dgx.I)).b("has_gravel", this.a((ddr)dgx.L)).a(this.b);
   }

   protected void n(ddr $$0, ddr $$1) {
      this.b(op.b, $$0).b(dgx.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(op $$0, ddr $$1, ddr $$2) {
      this.d($$0, $$1, czp.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oo d(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(op $$0, ddr $$1, ddr $$2) {
      this.e($$0, $$1, czp.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oo e(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(op $$0, ddr $$1, ddr $$2) {
      this.f($$0, $$1, czp.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private os f(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(op $$0, ddr $$1, ddr $$2) {
      this.b($$0, $$1, czp.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(op $$0, ddr $$1, ddr $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected os b(op $$0, ddr $$1, czp $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(op $$0, ddr $$1, ddr $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(op $$0, ddr $$1, ddr $$2, int $$3) {
      ov.a(czp.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(ddr $$0, ddr $$1) {
      ou.c(czp.a($$1), op.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(op $$0, ddr $$1, op $$2, ddr $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(op $$0, ddr $$1, op $$2, ddr $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(op $$0, ddr $$1, op $$2, ddr $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(op $$0, ddr $$1, op $$2, ddr $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alb.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alb.a($$4));
   }

   protected void o(ddr $$0, ddr $$1) {
      this.a(op.i, $$0, 2).a('#', cvo.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(ddr $$0, czp $$1) {
      this.a(op.i, $$0, 2).a('#', cvo.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends cza> void a(String $$0, czy<T> $$1, cza.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cvo.sb, cvo.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.sd, cvo.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.ra, cvo.re, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.dK, cvo.rY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cvo.rb, cvo.rf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.uP, cvo.uQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.pY, cvo.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.ui, cvo.uj, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvo.uC, cvo.uD, 0.35F);
   }

   private <T extends cza> void a(String $$0, czy<T> $$1, cza.a<T> $$2, int $$3, ddr $$4, ddr $$5, float $$6) {
      ou.a(czp.a($$4), op.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cqh $$0) {
      cvb.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(op.a, $$2).b($$1).b(cvo.wC).b(c($$2)).b(b($$1), this.a((ddr)$$1)).a(this.b, p($$2, cvo.wC));
         }
      });
   }

   protected void a(dgv $$0, dgv $$1) {
      this.a(op.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((ddr)$$1)).a(this.b);
   }

   protected void b(dgv $$0, dgv $$1) {
      this.a(op.c, $$0, 4).a('C', $$1).a('R', cvo.lH).a('B', cvo.sh).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((ddr)$$1)).a(this.b);
   }

   protected void a(cvg $$0, doy $$1) {
      cvl $$2 = new cvl(cvo.vY.o(), 1, ko.a().a(kr.J, $$1.b()).a());
      this.a(op.g, $$2).b(cvo.ou).b(cvo.dA).b(cvo.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(ly $$0, cqh $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            or.a $$4 = d.get($$2);
            ddr $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               oo $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == ly.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == ly.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dgv a(ly $$0, ly.b $$1) {
      if ($$1 == ly.b.b) {
         if (!$$0.b().containsKey(ly.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(ly.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dgv $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private ao<cg.a> a(dh.d $$0, ddr $$1) {
      return a(cs.a.a().a(this.c, $$1).a($$0));
   }

   protected ao<cg.a> a(ddr $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   protected ao<cg.a> a(axi<cvg> $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   private static ao<cg.a> a(cs.a... $$0) {
      return a(Arrays.stream($$0).map(cs.a::b).toArray(cs[]::new));
   }

   private static ao<cg.a> a(cs... $$0) {
      return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
   }

   protected static String b(ddr $$0) {
      return "has_" + c($$0);
   }

   protected static String c(ddr $$0) {
      return lu.g.b($$0.r()).a();
   }

   protected static String d(ddr $$0) {
      return c($$0);
   }

   protected static String p(ddr $$0, ddr $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(ddr $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(ddr $$0) {
      return c($$0) + "_from_blasting";
   }

   protected czp b(axi<cvg> $$0) {
      return czp.a(this.c.b($$0));
   }

   protected os a(op $$0, ddr $$1) {
      return os.a(this.c, $$0, $$1);
   }

   protected os a(op $$0, ddr $$1, int $$2) {
      return os.a(this.c, $$0, $$1, $$2);
   }

   protected ot a(op $$0, cvl $$1) {
      return ot.a(this.c, $$0, $$1);
   }

   protected ot b(op $$0, ddr $$1) {
      return ot.a(this.c, $$0, $$1);
   }

   protected ot b(op $$0, ddr $$1, int $$2) {
      return ot.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oo create(or var1, ddr var2, ddr var3);
   }

   protected abstract static class b implements mb {
      private final md d;
      private final CompletableFuture<jp.a> e;

      protected b(md $$0, CompletableFuture<jp.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(lz $$0) {
         return this.e.thenCompose($$1 -> {
            final md.a $$2 = this.d.a(lv.bg);
            final md.a $$3 = this.d.a(lv.bf);
            final Set<alb> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            oq $$6 = new oq() {
               @Override
               public void a(alb $$0x, czt<?> $$1x, @Nullable ag $$2x) {
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
                  return af.a.b().a(oo.a);
               }

               @Override
               public void b() {
                  ag $$0 = af.a.b().a("impossible", an.b.a(new cf.a())).b(oo.a);
                  this.a($$0);
               }

               private void a(alb $$0x, czt<?> $$1x) {
                  $$5.add(mb.a($$0, $$1, czt.h, $$1, $$2.a($$0)));
               }

               private void a(ag $$0x) {
                  $$5.add(mb.a($$0, $$1, af.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract or a(jp.a var1, oq var2);
   }
}
