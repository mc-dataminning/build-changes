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

public abstract class ox {
   protected final js.a a;
   private final jr<cwb> c;
   protected final ow b;
   private static final Map<md.b, ox.a> d = ImmutableMap.builder()
      .put(md.b.a, (ox.a)($$0, $$1, $$2) -> $$0.e($$1, dap.a($$2)))
      .put(md.b.b, (ox.a)($$0, $$1, $$2) -> $$0.b(ov.a, $$1, dap.a($$2)))
      .put(md.b.d, (ox.a)($$0, $$1, $$2) -> $$0.f(ov.a, $$1, dap.a($$2)))
      .put(md.b.e, (ox.a)($$0, $$1, $$2) -> $$0.a($$1, dap.a($$2)))
      .put(md.b.f, (ox.a)($$0, $$1, $$2) -> $$0.f($$1, dap.a($$2)))
      .put(md.b.g, (ox.a)($$0, $$1, $$2) -> $$0.f($$1, dap.a($$2)))
      .put(md.b.h, (ox.a)($$0, $$1, $$2) -> $$0.g($$1, dap.a($$2)))
      .put(md.b.i, (ox.a)($$0, $$1, $$2) -> $$0.g($$1, dap.a($$2)))
      .put(md.b.k, (ox.a)($$0, $$1, $$2) -> $$0.h($$1, dap.a($$2)))
      .put(md.b.l, (ox.a)($$0, $$1, $$2) -> $$0.a(ov.a, $$1, dap.a($$2)))
      .put(md.b.m, (ox.a)($$0, $$1, $$2) -> $$0.b($$1, dap.a($$2)))
      .put(md.b.n, (ox.a)($$0, $$1, $$2) -> $$0.c(ov.c, $$1, dap.a($$2)))
      .put(md.b.o, (ox.a)($$0, $$1, $$2) -> $$0.e(ov.a, $$1, dap.a($$2)))
      .put(md.b.p, (ox.a)($$0, $$1, $$2) -> $$0.c($$1, dap.a($$2)))
      .put(md.b.q, (ox.a)($$0, $$1, $$2) -> $$0.d(ov.b, $$1, dap.a($$2)))
      .build();

   protected ox(js.a $$0, ow $$1) {
      this.a = $$0;
      this.c = $$0.d(ma.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(crj $$0) {
      mc.a().filter(md::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dfe $$0, dfe $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dfe $$0, dfe $$1, @Nullable String $$2, int $$3) {
      this.b(ov.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dfe> $$0, ov $$1, dfe $$2, float $$3, int $$4, String $$5) {
      this.a(day.o, dbj::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dfe> $$0, ov $$1, dfe $$2, float $$3, int $$4, String $$5) {
      this.a(day.p, dad::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends daa> void a(day<T> $$0, daa.a<T> $$1, List<dfe> $$2, ov $$3, dfe $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dfe $$9 : $$2) {
         pa.a(dap.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cwb $$0, ov $$1, cwb $$2) {
      pc.a(dap.a(cwj.xO), dap.a($$0), this.b(axm.bh), $$1, $$2).a("has_netherite_ingot", this.a(axm.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cwb $$0, all $$1) {
      pd.a(dap.a($$0), this.b(axm.bD), this.b(axm.bE), ov.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(ov $$0, dfe $$1, dfe $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(ov $$0, dfe $$1, dfe $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(ov $$0, dfe $$1, dfe $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dfe $$0, axt<cwb> $$1, int $$2) {
      this.b(ov.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfe $$0, axt<cwb> $$1, int $$2) {
      this.b(ov.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dfe $$0, dfe $$1) {
      this.a(ov.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfe $$0, dfe $$1) {
      this.a(ov.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dil.G)).a(this.b);
   }

   protected void c(dfe $$0, dfe $$1) {
      this.b(ov.d, $$0).b(dil.cv).b($$1).b("chest_boat").b("has_boat", this.a(axm.aS)).a(this.b);
   }

   private ou e(dfe $$0, dap $$1) {
      return this.b(ov.c, $$0).a($$1);
   }

   protected ou a(dfe $$0, dap $$1) {
      return this.a(ov.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ou f(dfe $$0, dap $$1) {
      int $$2 = $$0 == dil.fo ? 6 : 3;
      cwb $$3 = $$0 == dil.fo ? cwj.uP : cwj.pr;
      return this.a(ov.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ou g(dfe $$0, dap $$1) {
      return this.a(ov.c, $$0).a('#', cwj.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dfe $$0, dfe $$1) {
      this.c(ov.c, $$0, dap.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private ou c(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ov $$0, dfe $$1, dfe $$2) {
      this.a($$0, $$1, dap.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected ou a(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ou b(dfe $$0, dap $$1) {
      return this.a(ov.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ou c(dfe $$0, dap $$1) {
      return this.a(ov.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ou h(dfe $$0, dap $$1) {
      return this.a(ov.b, $$0, 3).c("sign").a('#', $$1).a('X', cwj.pr).b("###").b("###").b(" X ");
   }

   protected void e(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cwj.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cwb> $$0, List<cwb> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, ov.a);
   }

   protected void a(List<cwb> $$0, List<cwb> $$1, @Nullable cwb $$2, String $$3, ov $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cwb $$6 = $$0.get($$5);
         cwb $$7 = $$1.get($$5);
         Stream<cwb> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dap.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0).a('#', $$1).a('X', axm.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0).a('#', $$1).a('|', cwj.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dfe $$0, dfe $$1) {
      this.a(ov.a, $$0, 8).a('#', dil.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dfe)dil.aQ)).a(this.b);
   }

   protected void j(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dfe $$0, dfe $$1) {
      this.a(ov.b, $$0, 8)
         .a('#', dil.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dfe)dil.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dil.eY));
   }

   protected void l(dfe $$0, dfe $$1) {
      this.a(ov.a, $$0, 8).a('#', dil.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dfe)dil.iA)).a(this.b);
   }

   protected void m(dfe $$0, dfe $$1) {
      this.b(ov.a, $$0, 8).b($$1).a(dil.I, 4).a(dil.L, 4).b("concrete_powder").b("has_sand", this.a((dfe)dil.I)).b("has_gravel", this.a((dfe)dil.L)).a(this.b);
   }

   protected void n(dfe $$0, dfe $$1) {
      this.b(ov.b, $$0).b(dil.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(ov $$0, dfe $$1, dfe $$2) {
      this.d($$0, $$1, dap.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ou d(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ov $$0, dfe $$1, dfe $$2) {
      this.e($$0, $$1, dap.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ou e(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ov $$0, dfe $$1, dfe $$2) {
      this.f($$0, $$1, dap.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oy f(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ov $$0, dfe $$1, dfe $$2) {
      this.b($$0, $$1, dap.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(ov $$0, dfe $$1, dfe $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oy b(ov $$0, dfe $$1, dap $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ov $$0, dfe $$1, dfe $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ov $$0, dfe $$1, dfe $$2, int $$3) {
      pb.a(dap.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dfe $$0, dfe $$1) {
      pa.c(dap.a($$1), ov.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(ov $$0, dfe $$1, ov $$2, dfe $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(ov $$0, dfe $$1, ov $$2, dfe $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(ov $$0, dfe $$1, ov $$2, dfe $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(ov $$0, dfe $$1, ov $$2, dfe $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, all.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, all.a($$4));
   }

   protected void o(dfe $$0, dfe $$1) {
      this.a(ov.i, $$0, 2).a('#', cwj.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dfe $$0, dap $$1) {
      this.a(ov.i, $$0, 2).a('#', cwj.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends daa> void a(String $$0, day<T> $$1, daa.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cwj.sr, cwj.ss, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.st, cwj.su, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.rq, cwj.ru, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.dK, cwj.so, 0.1F);
      this.a($$0, $$1, $$2, $$3, cwj.rr, cwj.rv, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.vf, cwj.vg, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.pY, cwj.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.uy, cwj.uz, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwj.uS, cwj.uT, 0.35F);
   }

   private <T extends daa> void a(String $$0, day<T> $$1, daa.a<T> $$2, int $$3, dfe $$4, dfe $$5, float $$6) {
      pa.a(dap.a($$4), ov.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(crj $$0) {
      cvw.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(ov.a, $$2).b($$1).b(cwj.wS).b(c($$2)).b(b($$1), this.a((dfe)$$1)).a(this.b, p($$2, cwj.wS));
         }
      });
   }

   protected void a(dij $$0, dij $$1) {
      this.a(ov.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dfe)$$1)).a(this.b);
   }

   protected void b(dij $$0, dij $$1) {
      this.a(ov.c, $$0, 4).a('C', $$1).a('R', cwj.lH).a('B', cwj.sx).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dfe)$$1)).a(this.b);
   }

   protected void a(cwb $$0, dql $$1) {
      cwf $$2 = new cwf(cwj.wo.f(), 1, kr.a().a(ku.R, $$1.b()).a());
      this.a(ov.g, $$2).b(cwj.ou).b(cwj.dA).b(cwj.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(md $$0, crj $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            ox.a $$4 = d.get($$2);
            dfe $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               ou $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == md.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == md.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dij a(md $$0, md.b $$1) {
      if ($$1 == md.b.b) {
         if (!$$0.b().containsKey(md.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(md.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ap<bs.a> a(dij $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dfe $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dfe $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(axt<cwb> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dfe $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dfe $$0) {
      return lz.g.b($$0.j()).a();
   }

   protected static String d(dfe $$0) {
      return c($$0);
   }

   protected static String p(dfe $$0, dfe $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dfe $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dfe $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dap b(axt<cwb> $$0) {
      return dap.a(this.c.b($$0));
   }

   protected oy a(ov $$0, dfe $$1) {
      return oy.a(this.c, $$0, $$1);
   }

   protected oy a(ov $$0, dfe $$1, int $$2) {
      return oy.a(this.c, $$0, $$1, $$2);
   }

   protected oz a(ov $$0, cwf $$1) {
      return oz.a(this.c, $$0, $$1);
   }

   protected oz b(ov $$0, dfe $$1) {
      return oz.a(this.c, $$0, $$1);
   }

   protected oz b(ov $$0, dfe $$1, int $$2) {
      return oz.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ou create(ox var1, dfe var2, dfe var3);
   }

   protected abstract static class b implements mg {
      private final mi d;
      private final CompletableFuture<js.a> e;

      protected b(mi $$0, CompletableFuture<js.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(me $$0) {
         return this.e.thenCompose($$1 -> {
            final mi.a $$2 = this.d.a(ma.bh);
            final mi.a $$3 = this.d.a(ma.bg);
            final Set<all> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ow $$6 = new ow() {
               @Override
               public void a(all $$0x, dat<?> $$1x, @Nullable ah $$2x) {
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
                  return ag.a.b().a(ou.a);
               }

               @Override
               public void b() {
                  ah $$0 = ag.a.b().a("impossible", ao.b.a(new cg.a())).b(ou.a);
                  this.a($$0);
               }

               private void a(all $$0x, dat<?> $$1x) {
                  $$5.add(mg.a($$0, $$1, dat.h, $$1, $$2.a($$0)));
               }

               private void a(ah $$0x) {
                  $$5.add(mg.a($$0, $$1, ag.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract ox a(js.a var1, ow var2);
   }
}
