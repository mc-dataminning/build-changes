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

public abstract class ov {
   protected final jr.a a;
   private final jq<cvt> c;
   protected final ou b;
   private static final Map<mb.b, ov.a> d = ImmutableMap.builder()
      .put(mb.b.a, (ov.a)($$0, $$1, $$2) -> $$0.e($$1, daf.a($$2)))
      .put(mb.b.b, (ov.a)($$0, $$1, $$2) -> $$0.b(ot.a, $$1, daf.a($$2)))
      .put(mb.b.d, (ov.a)($$0, $$1, $$2) -> $$0.f(ot.a, $$1, daf.a($$2)))
      .put(mb.b.e, (ov.a)($$0, $$1, $$2) -> $$0.a($$1, daf.a($$2)))
      .put(mb.b.f, (ov.a)($$0, $$1, $$2) -> $$0.f($$1, daf.a($$2)))
      .put(mb.b.g, (ov.a)($$0, $$1, $$2) -> $$0.f($$1, daf.a($$2)))
      .put(mb.b.h, (ov.a)($$0, $$1, $$2) -> $$0.g($$1, daf.a($$2)))
      .put(mb.b.i, (ov.a)($$0, $$1, $$2) -> $$0.g($$1, daf.a($$2)))
      .put(mb.b.k, (ov.a)($$0, $$1, $$2) -> $$0.h($$1, daf.a($$2)))
      .put(mb.b.l, (ov.a)($$0, $$1, $$2) -> $$0.a(ot.a, $$1, daf.a($$2)))
      .put(mb.b.m, (ov.a)($$0, $$1, $$2) -> $$0.b($$1, daf.a($$2)))
      .put(mb.b.n, (ov.a)($$0, $$1, $$2) -> $$0.c(ot.c, $$1, daf.a($$2)))
      .put(mb.b.o, (ov.a)($$0, $$1, $$2) -> $$0.e(ot.a, $$1, daf.a($$2)))
      .put(mb.b.p, (ov.a)($$0, $$1, $$2) -> $$0.c($$1, daf.a($$2)))
      .put(mb.b.q, (ov.a)($$0, $$1, $$2) -> $$0.d(ot.b, $$1, daf.a($$2)))
      .build();

   protected ov(jr.a $$0, ou $$1) {
      this.a = $$0;
      this.c = $$0.d(ly.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cra $$0) {
      ma.a().filter(mb::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(deu $$0, deu $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(deu $$0, deu $$1, @Nullable String $$2, int $$3) {
      this.b(ot.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<deu> $$0, ot $$1, deu $$2, float $$3, int $$4, String $$5) {
      this.a(dao.o, dba::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<deu> $$0, ot $$1, deu $$2, float $$3, int $$4, String $$5) {
      this.a(dao.p, czt::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends czq> void a(dao<T> $$0, czq.a<T> $$1, List<deu> $$2, ot $$3, deu $$4, float $$5, int $$6, String $$7, String $$8) {
      for (deu $$9 : $$2) {
         oy.a(daf.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cvt $$0, ot $$1, cvt $$2) {
      pa.a(daf.a(cwb.xy), daf.a($$0), this.b(axi.bd), $$1, $$2).a("has_netherite_ingot", this.a(axi.bd)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cvt $$0, alh $$1) {
      pb.a(daf.a($$0), this.b(axi.bz), this.b(axi.bA), ot.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(ot $$0, deu $$1, deu $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(ot $$0, deu $$1, deu $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(ot $$0, deu $$1, deu $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(deu $$0, axp<cvt> $$1, int $$2) {
      this.b(ot.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(deu $$0, axp<cvt> $$1, int $$2) {
      this.b(ot.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(deu $$0, deu $$1) {
      this.a(ot.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(deu $$0, deu $$1) {
      this.a(ot.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dia.G)).a(this.b);
   }

   protected void c(deu $$0, deu $$1) {
      this.b(ot.d, $$0).b(dia.cv).b($$1).b("chest_boat").b("has_boat", this.a(axi.aO)).a(this.b);
   }

   private os e(deu $$0, daf $$1) {
      return this.b(ot.c, $$0).a($$1);
   }

   protected os a(deu $$0, daf $$1) {
      return this.a(ot.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private os f(deu $$0, daf $$1) {
      int $$2 = $$0 == dia.fo ? 6 : 3;
      cvt $$3 = $$0 == dia.fo ? cwb.uz : cwb.pr;
      return this.a(ot.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private os g(deu $$0, daf $$1) {
      return this.a(ot.c, $$0).a('#', cwb.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(deu $$0, deu $$1) {
      this.c(ot.c, $$0, daf.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private os c(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ot $$0, deu $$1, deu $$2) {
      this.a($$0, $$1, daf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected os a(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected os b(deu $$0, daf $$1) {
      return this.a(ot.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected os c(deu $$0, daf $$1) {
      return this.a(ot.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private os h(deu $$0, daf $$1) {
      return this.a(ot.b, $$0, 3).c("sign").a('#', $$1).a('X', cwb.pr).b("###").b("###").b(" X ");
   }

   protected void e(deu $$0, deu $$1) {
      this.a(ot.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cwb.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cvt> $$0, List<cvt> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, ot.a);
   }

   protected void a(List<cvt> $$0, List<cvt> $$1, @Nullable cvt $$2, String $$3, ot $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cvt $$6 = $$0.get($$5);
         cvt $$7 = $$1.get($$5);
         Stream<cvt> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(daf.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(deu $$0, deu $$1) {
      this.a(ot.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(deu $$0, deu $$1) {
      this.a(ot.b, $$0).a('#', $$1).a('X', axi.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(deu $$0, deu $$1) {
      this.a(ot.b, $$0).a('#', $$1).a('|', cwb.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(deu $$0, deu $$1) {
      this.a(ot.a, $$0, 8).a('#', dia.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((deu)dia.aQ)).a(this.b);
   }

   protected void j(deu $$0, deu $$1) {
      this.a(ot.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(deu $$0, deu $$1) {
      this.a(ot.b, $$0, 8)
         .a('#', dia.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((deu)dia.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dia.eY));
   }

   protected void l(deu $$0, deu $$1) {
      this.a(ot.a, $$0, 8).a('#', dia.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((deu)dia.iA)).a(this.b);
   }

   protected void m(deu $$0, deu $$1) {
      this.b(ot.a, $$0, 8).b($$1).a(dia.I, 4).a(dia.L, 4).b("concrete_powder").b("has_sand", this.a((deu)dia.I)).b("has_gravel", this.a((deu)dia.L)).a(this.b);
   }

   protected void n(deu $$0, deu $$1) {
      this.b(ot.b, $$0).b(dia.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(ot $$0, deu $$1, deu $$2) {
      this.d($$0, $$1, daf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private os d(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ot $$0, deu $$1, deu $$2) {
      this.e($$0, $$1, daf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private os e(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ot $$0, deu $$1, deu $$2) {
      this.f($$0, $$1, daf.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private ow f(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ot $$0, deu $$1, deu $$2) {
      this.b($$0, $$1, daf.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(ot $$0, deu $$1, deu $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected ow b(ot $$0, deu $$1, daf $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ot $$0, deu $$1, deu $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ot $$0, deu $$1, deu $$2, int $$3) {
      oz.a(daf.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(deu $$0, deu $$1) {
      oy.c(daf.a($$1), ot.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(ot $$0, deu $$1, ot $$2, deu $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(ot $$0, deu $$1, ot $$2, deu $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(ot $$0, deu $$1, ot $$2, deu $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(ot $$0, deu $$1, ot $$2, deu $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alh.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alh.a($$4));
   }

   protected void o(deu $$0, deu $$1) {
      this.a(ot.i, $$0, 2).a('#', cwb.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(deu $$0, daf $$1) {
      this.a(ot.i, $$0, 2).a('#', cwb.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends czq> void a(String $$0, dao<T> $$1, czq.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cwb.sb, cwb.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.sd, cwb.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.ra, cwb.re, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.dK, cwb.rY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cwb.rb, cwb.rf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.uP, cwb.uQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.pY, cwb.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.ui, cwb.uj, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwb.uC, cwb.uD, 0.35F);
   }

   private <T extends czq> void a(String $$0, dao<T> $$1, czq.a<T> $$2, int $$3, deu $$4, deu $$5, float $$6) {
      oy.a(daf.a($$4), ot.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cra $$0) {
      cvo.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(ot.a, $$2).b($$1).b(cwb.wC).b(c($$2)).b(b($$1), this.a((deu)$$1)).a(this.b, p($$2, cwb.wC));
         }
      });
   }

   protected void a(dhy $$0, dhy $$1) {
      this.a(ot.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((deu)$$1)).a(this.b);
   }

   protected void b(dhy $$0, dhy $$1) {
      this.a(ot.c, $$0, 4).a('C', $$1).a('R', cwb.lH).a('B', cwb.sh).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((deu)$$1)).a(this.b);
   }

   protected void a(cvt $$0, dqa $$1) {
      cvx $$2 = new cvx(cwb.vY.f(), 1, kq.a().a(kt.Q, $$1.b()).a());
      this.a(ot.g, $$2).b(cwb.ou).b(cwb.dA).b(cwb.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mb $$0, cra $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            ov.a $$4 = d.get($$2);
            deu $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               os $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mb.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mb.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dhy a(mb $$0, mb.b $$1) {
      if ($$1 == mb.b.b) {
         if (!$$0.b().containsKey(mb.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mb.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dhy $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ao<ch.a> a(di.d $$0, deu $$1) {
      return a(ct.a.a().a(this.c, $$1).a($$0));
   }

   protected ao<ch.a> a(deu $$0) {
      return a(ct.a.a().a(this.c, $$0));
   }

   protected ao<ch.a> a(axp<cvt> $$0) {
      return a(ct.a.a().a(this.c, $$0));
   }

   private static ao<ch.a> a(ct.a... $$0) {
      return a(Arrays.stream($$0).map(ct.a::b).toArray(ct[]::new));
   }

   private static ao<ch.a> a(ct... $$0) {
      return an.f.a(new ch.a(Optional.empty(), ch.a.a.b, List.of($$0)));
   }

   protected static String b(deu $$0) {
      return "has_" + c($$0);
   }

   protected static String c(deu $$0) {
      return lx.g.b($$0.j()).a();
   }

   protected static String d(deu $$0) {
      return c($$0);
   }

   protected static String p(deu $$0, deu $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(deu $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(deu $$0) {
      return c($$0) + "_from_blasting";
   }

   protected daf b(axp<cvt> $$0) {
      return daf.a(this.c.b($$0));
   }

   protected ow a(ot $$0, deu $$1) {
      return ow.a(this.c, $$0, $$1);
   }

   protected ow a(ot $$0, deu $$1, int $$2) {
      return ow.a(this.c, $$0, $$1, $$2);
   }

   protected ox a(ot $$0, cvx $$1) {
      return ox.a(this.c, $$0, $$1);
   }

   protected ox b(ot $$0, deu $$1) {
      return ox.a(this.c, $$0, $$1);
   }

   protected ox b(ot $$0, deu $$1, int $$2) {
      return ox.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      os create(ov var1, deu var2, deu var3);
   }

   protected abstract static class b implements me {
      private final mg d;
      private final CompletableFuture<jr.a> e;

      protected b(mg $$0, CompletableFuture<jr.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mc $$0) {
         return this.e.thenCompose($$1 -> {
            final mg.a $$2 = this.d.a(ly.bh);
            final mg.a $$3 = this.d.a(ly.bg);
            final Set<alh> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ou $$6 = new ou() {
               @Override
               public void a(alh $$0x, daj<?> $$1x, @Nullable ag $$2x) {
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
                  return af.a.b().a(os.a);
               }

               @Override
               public void b() {
                  ag $$0 = af.a.b().a("impossible", an.b.a(new cf.a())).b(os.a);
                  this.a($$0);
               }

               private void a(alh $$0x, daj<?> $$1x) {
                  $$5.add(me.a($$0, $$1, daj.h, $$1, $$2.a($$0)));
               }

               private void a(ag $$0x) {
                  $$5.add(me.a($$0, $$1, af.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract ov a(jr.a var1, ou var2);
   }
}
