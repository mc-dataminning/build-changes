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
   private final jr<cwi> c;
   protected final ow b;
   private static final Map<md.b, ox.a> d = ImmutableMap.builder()
      .put(md.b.a, (ox.a)($$0, $$1, $$2) -> $$0.e($$1, daw.a($$2)))
      .put(md.b.b, (ox.a)($$0, $$1, $$2) -> $$0.b(ov.a, $$1, daw.a($$2)))
      .put(md.b.d, (ox.a)($$0, $$1, $$2) -> $$0.f(ov.a, $$1, daw.a($$2)))
      .put(md.b.e, (ox.a)($$0, $$1, $$2) -> $$0.a($$1, daw.a($$2)))
      .put(md.b.f, (ox.a)($$0, $$1, $$2) -> $$0.f($$1, daw.a($$2)))
      .put(md.b.g, (ox.a)($$0, $$1, $$2) -> $$0.f($$1, daw.a($$2)))
      .put(md.b.h, (ox.a)($$0, $$1, $$2) -> $$0.g($$1, daw.a($$2)))
      .put(md.b.i, (ox.a)($$0, $$1, $$2) -> $$0.g($$1, daw.a($$2)))
      .put(md.b.k, (ox.a)($$0, $$1, $$2) -> $$0.h($$1, daw.a($$2)))
      .put(md.b.l, (ox.a)($$0, $$1, $$2) -> $$0.a(ov.a, $$1, daw.a($$2)))
      .put(md.b.m, (ox.a)($$0, $$1, $$2) -> $$0.b($$1, daw.a($$2)))
      .put(md.b.n, (ox.a)($$0, $$1, $$2) -> $$0.c(ov.c, $$1, daw.a($$2)))
      .put(md.b.o, (ox.a)($$0, $$1, $$2) -> $$0.e(ov.a, $$1, daw.a($$2)))
      .put(md.b.p, (ox.a)($$0, $$1, $$2) -> $$0.c($$1, daw.a($$2)))
      .put(md.b.q, (ox.a)($$0, $$1, $$2) -> $$0.d(ov.b, $$1, daw.a($$2)))
      .build();

   protected ox(js.a $$0, ow $$1) {
      this.a = $$0;
      this.c = $$0.d(ma.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(crq $$0) {
      mc.a().filter(md::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dfl $$0, dfl $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dfl $$0, dfl $$1, @Nullable String $$2, int $$3) {
      this.b(ov.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dfl> $$0, ov $$1, dfl $$2, float $$3, int $$4, String $$5) {
      this.a(dbf.o, dbq::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dfl> $$0, ov $$1, dfl $$2, float $$3, int $$4, String $$5) {
      this.a(dbf.p, dak::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dah> void a(dbf<T> $$0, dah.a<T> $$1, List<dfl> $$2, ov $$3, dfl $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dfl $$9 : $$2) {
         pa.a(daw.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cwi $$0, ov $$1, cwi $$2) {
      pc.a(daw.a(cwq.xO), daw.a($$0), this.b(axl.bh), $$1, $$2).a("has_netherite_ingot", this.a(axl.bh)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cwi $$0, alj $$1) {
      pd.a(daw.a($$0), this.b(axl.bD), this.b(axl.bE), ov.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(ov $$0, dfl $$1, dfl $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(ov $$0, dfl $$1, dfl $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(ov $$0, dfl $$1, dfl $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dfl $$0, axs<cwi> $$1, int $$2) {
      this.b(ov.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfl $$0, axs<cwi> $$1, int $$2) {
      this.b(ov.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dfl $$0, dfl $$1) {
      this.a(ov.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfl $$0, dfl $$1) {
      this.a(ov.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dis.G)).a(this.b);
   }

   protected void c(dfl $$0, dfl $$1) {
      this.b(ov.d, $$0).b(dis.cv).b($$1).b("chest_boat").b("has_boat", this.a(axl.aS)).a(this.b);
   }

   private ou e(dfl $$0, daw $$1) {
      return this.b(ov.c, $$0).a($$1);
   }

   protected ou a(dfl $$0, daw $$1) {
      return this.a(ov.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ou f(dfl $$0, daw $$1) {
      int $$2 = $$0 == dis.fo ? 6 : 3;
      cwi $$3 = $$0 == dis.fo ? cwq.uP : cwq.pr;
      return this.a(ov.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ou g(dfl $$0, daw $$1) {
      return this.a(ov.c, $$0).a('#', cwq.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dfl $$0, dfl $$1) {
      this.c(ov.c, $$0, daw.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private ou c(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ov $$0, dfl $$1, dfl $$2) {
      this.a($$0, $$1, daw.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected ou a(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ou b(dfl $$0, daw $$1) {
      return this.a(ov.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ou c(dfl $$0, daw $$1) {
      return this.a(ov.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ou h(dfl $$0, daw $$1) {
      return this.a(ov.b, $$0, 3).c("sign").a('#', $$1).a('X', cwq.pr).b("###").b("###").b(" X ");
   }

   protected void e(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cwq.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cwi> $$0, List<cwi> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, ov.a);
   }

   protected void a(List<cwi> $$0, List<cwi> $$1, @Nullable cwi $$2, String $$3, ov $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cwi $$6 = $$0.get($$5);
         cwi $$7 = $$1.get($$5);
         Stream<cwi> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(daw.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0).a('#', $$1).a('X', axl.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0).a('#', $$1).a('|', cwq.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dfl $$0, dfl $$1) {
      this.a(ov.a, $$0, 8).a('#', dis.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dfl)dis.aQ)).a(this.b);
   }

   protected void j(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dfl $$0, dfl $$1) {
      this.a(ov.b, $$0, 8)
         .a('#', dis.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dfl)dis.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dis.eY));
   }

   protected void l(dfl $$0, dfl $$1) {
      this.a(ov.a, $$0, 8).a('#', dis.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dfl)dis.iA)).a(this.b);
   }

   protected void m(dfl $$0, dfl $$1) {
      this.b(ov.a, $$0, 8).b($$1).a(dis.I, 4).a(dis.L, 4).b("concrete_powder").b("has_sand", this.a((dfl)dis.I)).b("has_gravel", this.a((dfl)dis.L)).a(this.b);
   }

   protected void n(dfl $$0, dfl $$1) {
      this.b(ov.b, $$0).b(dis.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(ov $$0, dfl $$1, dfl $$2) {
      this.d($$0, $$1, daw.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ou d(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ov $$0, dfl $$1, dfl $$2) {
      this.e($$0, $$1, daw.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ou e(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ov $$0, dfl $$1, dfl $$2) {
      this.f($$0, $$1, daw.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oy f(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ov $$0, dfl $$1, dfl $$2) {
      this.b($$0, $$1, daw.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(ov $$0, dfl $$1, dfl $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oy b(ov $$0, dfl $$1, daw $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ov $$0, dfl $$1, dfl $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ov $$0, dfl $$1, dfl $$2, int $$3) {
      pb.a(daw.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dfl $$0, dfl $$1) {
      pa.c(daw.a($$1), ov.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(ov $$0, dfl $$1, ov $$2, dfl $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(ov $$0, dfl $$1, ov $$2, dfl $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(ov $$0, dfl $$1, ov $$2, dfl $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(ov $$0, dfl $$1, ov $$2, dfl $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alj.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alj.a($$4));
   }

   protected void o(dfl $$0, dfl $$1) {
      this.a(ov.i, $$0, 2).a('#', cwq.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dfl $$0, daw $$1) {
      this.a(ov.i, $$0, 2).a('#', cwq.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dah> void a(String $$0, dbf<T> $$1, dah.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cwq.sr, cwq.ss, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.st, cwq.su, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.rq, cwq.ru, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.dK, cwq.so, 0.1F);
      this.a($$0, $$1, $$2, $$3, cwq.rr, cwq.rv, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.vf, cwq.vg, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.pY, cwq.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.uy, cwq.uz, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwq.uS, cwq.uT, 0.35F);
   }

   private <T extends dah> void a(String $$0, dbf<T> $$1, dah.a<T> $$2, int $$3, dfl $$4, dfl $$5, float $$6) {
      pa.a(daw.a($$4), ov.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(crq $$0) {
      cwd.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(ov.a, $$2).b($$1).b(cwq.wS).b(c($$2)).b(b($$1), this.a((dfl)$$1)).a(this.b, p($$2, cwq.wS));
         }
      });
   }

   protected void a(diq $$0, diq $$1) {
      this.a(ov.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dfl)$$1)).a(this.b);
   }

   protected void b(diq $$0, diq $$1) {
      this.a(ov.c, $$0, 4).a('C', $$1).a('R', cwq.lH).a('B', cwq.sx).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dfl)$$1)).a(this.b);
   }

   protected void a(cwi $$0, dqs $$1) {
      cwm $$2 = new cwm(cwq.wo.f(), 1, kr.a().a(ku.R, $$1.b()).a());
      this.a(ov.g, $$2).b(cwq.ou).b(cwq.dA).b(cwq.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(md $$0, crq $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            ox.a $$4 = d.get($$2);
            dfl $$5 = this.a($$0, $$2);
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

   private diq a(md $$0, md.b $$1) {
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

   private static ap<bs.a> a(diq $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dfl $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dfl $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(axs<cwi> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dfl $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dfl $$0) {
      return lz.g.b($$0.j()).a();
   }

   protected static String d(dfl $$0) {
      return c($$0);
   }

   protected static String p(dfl $$0, dfl $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dfl $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dfl $$0) {
      return c($$0) + "_from_blasting";
   }

   protected daw b(axs<cwi> $$0) {
      return daw.a(this.c.b($$0));
   }

   protected oy a(ov $$0, dfl $$1) {
      return oy.a(this.c, $$0, $$1);
   }

   protected oy a(ov $$0, dfl $$1, int $$2) {
      return oy.a(this.c, $$0, $$1, $$2);
   }

   protected oz a(ov $$0, cwm $$1) {
      return oz.a(this.c, $$0, $$1);
   }

   protected oz b(ov $$0, dfl $$1) {
      return oz.a(this.c, $$0, $$1);
   }

   protected oz b(ov $$0, dfl $$1, int $$2) {
      return oz.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ou create(ox var1, dfl var2, dfl var3);
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
            final Set<alj> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ow $$6 = new ow() {
               @Override
               public void a(alj $$0x, dba<?> $$1x, @Nullable ah $$2x) {
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

               private void a(alj $$0x, dba<?> $$1x) {
                  $$5.add(mg.a($$0, $$1, dba.h, $$1, $$2.a($$0)));
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
