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

public abstract class og {
   protected final jg.a a;
   private final jf<cyo> c;
   protected final of b;
   private static final Map<mj.b, og.a> d = ImmutableMap.builder()
      .put(mj.b.a, (og.a)($$0, $$1, $$2) -> $$0.e($$1, ddf.a($$2)))
      .put(mj.b.b, (og.a)($$0, $$1, $$2) -> $$0.b(oe.a, $$1, ddf.a($$2)))
      .put(mj.b.d, (og.a)($$0, $$1, $$2) -> $$0.f(oe.a, $$1, ddf.a($$2)))
      .put(mj.b.e, (og.a)($$0, $$1, $$2) -> $$0.a($$1, ddf.a($$2)))
      .put(mj.b.f, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddf.a($$2)))
      .put(mj.b.g, (og.a)($$0, $$1, $$2) -> $$0.f($$1, ddf.a($$2)))
      .put(mj.b.h, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddf.a($$2)))
      .put(mj.b.i, (og.a)($$0, $$1, $$2) -> $$0.g($$1, ddf.a($$2)))
      .put(mj.b.k, (og.a)($$0, $$1, $$2) -> $$0.h($$1, ddf.a($$2)))
      .put(mj.b.l, (og.a)($$0, $$1, $$2) -> $$0.a(oe.a, $$1, ddf.a($$2)))
      .put(mj.b.m, (og.a)($$0, $$1, $$2) -> $$0.b($$1, ddf.a($$2)))
      .put(mj.b.n, (og.a)($$0, $$1, $$2) -> $$0.c(oe.c, $$1, ddf.a($$2)))
      .put(mj.b.o, (og.a)($$0, $$1, $$2) -> $$0.e(oe.a, $$1, ddf.a($$2)))
      .put(mj.b.p, (og.a)($$0, $$1, $$2) -> $$0.c($$1, ddf.a($$2)))
      .put(mj.b.q, (og.a)($$0, $$1, $$2) -> $$0.d(oe.b, $$1, ddf.a($$2)))
      .build();

   protected og(jg.a $$0, of $$1) {
      this.a = $$0;
      this.c = $$0.e(mg.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cub $$0) {
      mi.a().filter(mj::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dio $$0, dio $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dio $$0, dio $$1, @Nullable String $$2, int $$3) {
      this.b(oe.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dio> $$0, oe $$1, dio $$2, float $$3, int $$4, String $$5) {
      this.a(ddt.o, ded::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dio> $$0, oe $$1, dio $$2, float $$3, int $$4, String $$5) {
      this.a(ddt.p, dcs::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dcp> void a(ddt<T> $$0, dcp.a<T> $$1, List<dio> $$2, oe $$3, dio $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dio $$9 : $$2) {
         oj.a(ddf.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cyo $$0, oe $$1, cyo $$2) {
      ol.a(ddf.a(cyw.yA), ddf.a($$0), this.b(axi.bg), $$1, $$2).a("has_netherite_ingot", this.a(axi.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cyo $$0, ald<dhh> $$1, ald<ddj<?>> $$2) {
      je.c<dhh> $$3 = this.a.e(mg.bj).b($$1);
      om.a(ddf.a($$0), this.b(axi.bC), this.b(axi.bD), $$3, oe.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(oe $$0, dio $$1, dio $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(oe $$0, dio $$1, dio $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(oe $$0, dio $$1, dio $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dio $$0, axp<cyo> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dio $$0, axp<cyo> $$1, int $$2) {
      this.b(oe.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dio $$0, dio $$1) {
      this.a(oe.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dio $$0, dio $$1) {
      this.a(oe.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dlw.J)).a(this.b);
   }

   protected void c(dio $$0, dio $$1) {
      this.b(oe.d, $$0).b(dlw.cD).b($$1).b("chest_boat").b("has_boat", this.a(axi.aR)).a(this.b);
   }

   private od e(dio $$0, ddf $$1) {
      return this.b(oe.c, $$0).a($$1);
   }

   protected od a(dio $$0, ddf $$1) {
      return this.a(oe.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private od f(dio $$0, ddf $$1) {
      int $$2 = $$0 == dlw.fJ ? 6 : 3;
      cyo $$3 = $$0 == dlw.fJ ? cyw.vA : cyw.pZ;
      return this.a(oe.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private od g(dio $$0, ddf $$1) {
      return this.a(oe.c, $$0).a('#', cyw.pZ).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dio $$0, dio $$1) {
      this.c(oe.c, $$0, ddf.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private od c(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(oe $$0, dio $$1, dio $$2) {
      this.a($$0, $$1, ddf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected od a(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected od b(dio $$0, ddf $$1) {
      return this.a(oe.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected od c(dio $$0, ddf $$1) {
      return this.a(oe.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private od h(dio $$0, ddf $$1) {
      return this.a(oe.b, $$0, 3).c("sign").a('#', $$1).a('X', cyw.pZ).b("###").b("###").b(" X ");
   }

   protected void e(dio $$0, dio $$1) {
      this.a(oe.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cyw.gj).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cyo> $$0, List<cyo> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, oe.a);
   }

   protected void a(List<cyo> $$0, List<cyo> $$1, @Nullable cyo $$2, String $$3, oe $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cyo $$6 = $$0.get($$5);
         cyo $$7 = $$1.get($$5);
         Stream<cyo> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(ddf.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dio $$0, dio $$1) {
      this.a(oe.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dio $$0, dio $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('X', axi.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dio $$0, dio $$1) {
      this.a(oe.b, $$0).a('#', $$1).a('|', cyw.pZ).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dio $$0, dio $$1) {
      this.a(oe.a, $$0, 8).a('#', dlw.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dio)dlw.aX)).a(this.b);
   }

   protected void j(dio $$0, dio $$1) {
      this.a(oe.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dio $$0, dio $$1) {
      this.a(oe.b, $$0, 8)
         .a('#', dlw.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dio)dlw.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dlw.fm));
   }

   protected void l(dio $$0, dio $$1) {
      this.a(oe.a, $$0, 8).a('#', dlw.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dio)dlw.iY)).a(this.b);
   }

   protected void m(dio $$0, dio $$1) {
      this.b(oe.a, $$0, 8).b($$1).a(dlw.L, 4).a(dlw.O, 4).b("concrete_powder").b("has_sand", this.a((dio)dlw.L)).b("has_gravel", this.a((dio)dlw.O)).a(this.b);
   }

   protected void n(dio $$0, dio $$1) {
      this.b(oe.b, $$0).b(dlw.qp).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(oe $$0, dio $$1, dio $$2) {
      this.d($$0, $$1, ddf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od d(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(oe $$0, dio $$1, dio $$2) {
      this.e($$0, $$1, ddf.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private od e(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(oe $$0, dio $$1, dio $$2) {
      this.f($$0, $$1, ddf.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oh f(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(oe $$0, dio $$1, dio $$2) {
      this.b($$0, $$1, ddf.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(oe $$0, dio $$1, dio $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oh b(oe $$0, dio $$1, ddf $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(oe $$0, dio $$1, dio $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(oe $$0, dio $$1, dio $$2, int $$3) {
      ok.a(ddf.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dio $$0, dio $$1) {
      oj.c(ddf.a($$1), oe.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(oe $$0, dio $$1, oe $$2, dio $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(oe $$0, dio $$1, oe $$2, dio $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(oe $$0, dio $$1, oe $$2, dio $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(oe $$0, dio $$1, oe $$2, dio $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, ald.a(mg.bs, ale.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, ald.a(mg.bs, ale.a($$4)));
   }

   protected void o(dio $$0, dio $$1) {
      this.a(oe.i, $$0, 2).a('#', cyw.pi).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dio $$0, ddf $$1) {
      this.a(oe.i, $$0, 2).a('#', cyw.pi).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dcp> void a(String $$0, ddt<T> $$1, dcp.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cyw.tb, cyw.tc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.td, cyw.te, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.sa, cyw.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.dT, cyw.sY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cyw.sb, cyw.sf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.vR, cyw.vS, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.qG, cyw.qH, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.vj, cyw.vk, 0.35F);
      this.a($$0, $$1, $$2, $$3, cyw.vE, cyw.vF, 0.35F);
   }

   private <T extends dcp> void a(String $$0, ddt<T> $$1, dcp.a<T> $$2, int $$3, dio $$4, dio $$5, float $$6) {
      oj.a(ddf.a($$4), oe.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cub $$0) {
      cyj.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(oe.a, $$2).b($$1).b(cyw.xE).b(c($$2)).b(b($$1), this.a((dio)$$1)).a(this.b, p($$2, cyw.xE));
         }
      });
   }

   protected void a(dlu $$0, dlu $$1) {
      this.a(oe.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dio)$$1)).a(this.b);
   }

   protected void b(dlu $$0, dlu $$1) {
      this.a(oe.c, $$0, 4).a('C', $$1).a('R', cyw.mg).a('B', cyw.th).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dio)$$1)).a(this.b);
   }

   protected void a(cyo $$0, duc $$1) {
      cys $$2 = new cys(cyw.xa.e(), 1, kh.a().a(kj.T, $$1.c()).a());
      this.a(oe.g, $$2).b(cyw.pc).b(cyw.dJ).b(cyw.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mj $$0, cub $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            og.a $$4 = d.get($$2);
            dio $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               od $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mj.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mj.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dlu a(mj $$0, mj.b $$1) {
      if ($$1 == mj.b.b) {
         if (!$$0.b().containsKey(mj.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mj.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static aq<bt.a> a(dlu $$0) {
      return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private aq<cj.a> a(cv.d $$0, dio $$1) {
      return a(cl.a.a().a(this.c, $$1).a($$0));
   }

   protected aq<cj.a> a(dio $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   protected aq<cj.a> a(axp<cyo> $$0) {
      return a(cl.a.a().a(this.c, $$0));
   }

   private static aq<cj.a> a(cl.a... $$0) {
      return a(Arrays.stream($$0).map(cl.a::b).toArray(cl[]::new));
   }

   private static aq<cj.a> a(cl... $$0) {
      return ap.f.a(new cj.a(Optional.empty(), cj.a.a.b, List.of($$0)));
   }

   protected static String b(dio $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dio $$0) {
      return mf.g.b($$0.h()).a();
   }

   protected static String d(dio $$0) {
      return c($$0);
   }

   protected static String p(dio $$0, dio $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dio $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dio $$0) {
      return c($$0) + "_from_blasting";
   }

   protected ddf b(axp<cyo> $$0) {
      return ddf.a(this.c.b($$0));
   }

   protected oh a(oe $$0, dio $$1) {
      return oh.a(this.c, $$0, $$1);
   }

   protected oh a(oe $$0, dio $$1, int $$2) {
      return oh.a(this.c, $$0, $$1, $$2);
   }

   protected oi a(oe $$0, cys $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, dio $$1) {
      return oi.a(this.c, $$0, $$1);
   }

   protected oi b(oe $$0, dio $$1, int $$2) {
      return oi.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      od create(og var1, dio var2, dio var3);
   }

   protected abstract static class b implements mm {
      private final mo d;
      private final CompletableFuture<jg.a> e;

      protected b(mo $$0, CompletableFuture<jg.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mk $$0) {
         return this.e.thenCompose($$1 -> {
            final mo.a $$2 = this.d.a(mg.bs);
            final mo.a $$3 = this.d.a(mg.br);
            final Set<ald<ddj<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            of $$6 = new of() {
               @Override
               public void a(ald<ddj<?>> $$0x, ddj<?> $$1x, @Nullable ai $$2x) {
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
                  return ah.a.b().a(od.a);
               }

               @Override
               public void b() {
                  ai $$0 = ah.a.b().a("impossible", ap.b.a(new ch.a())).b(od.a);
                  this.a($$0);
               }

               private void a(ald<ddj<?>> $$0x, ddj<?> $$1x) {
                  $$5.add(mm.a($$0, $$1, ddj.a, $$1, $$2.a($$0.a())));
               }

               private void a(ai $$0x) {
                  $$5.add(mm.a($$0, $$1, ah.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract og a(jg.a var1, of var2);
   }
}
