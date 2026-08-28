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

public abstract class oi {
   protected final ji.a a;
   private final jh<dag> c;
   protected final oh b;
   private static final Map<ml.b, oi.a> d = ImmutableMap.builder()
      .put(ml.b.a, (oi.a)($$0, $$1, $$2) -> $$0.e($$1, dex.a($$2)))
      .put(ml.b.b, (oi.a)($$0, $$1, $$2) -> $$0.b(og.a, $$1, dex.a($$2)))
      .put(ml.b.d, (oi.a)($$0, $$1, $$2) -> $$0.f(og.a, $$1, dex.a($$2)))
      .put(ml.b.e, (oi.a)($$0, $$1, $$2) -> $$0.a($$1, dex.a($$2)))
      .put(ml.b.f, (oi.a)($$0, $$1, $$2) -> $$0.f($$1, dex.a($$2)))
      .put(ml.b.g, (oi.a)($$0, $$1, $$2) -> $$0.f($$1, dex.a($$2)))
      .put(ml.b.h, (oi.a)($$0, $$1, $$2) -> $$0.g($$1, dex.a($$2)))
      .put(ml.b.i, (oi.a)($$0, $$1, $$2) -> $$0.g($$1, dex.a($$2)))
      .put(ml.b.k, (oi.a)($$0, $$1, $$2) -> $$0.h($$1, dex.a($$2)))
      .put(ml.b.l, (oi.a)($$0, $$1, $$2) -> $$0.a(og.a, $$1, dex.a($$2)))
      .put(ml.b.m, (oi.a)($$0, $$1, $$2) -> $$0.b($$1, dex.a($$2)))
      .put(ml.b.n, (oi.a)($$0, $$1, $$2) -> $$0.c(og.c, $$1, dex.a($$2)))
      .put(ml.b.o, (oi.a)($$0, $$1, $$2) -> $$0.e(og.a, $$1, dex.a($$2)))
      .put(ml.b.p, (oi.a)($$0, $$1, $$2) -> $$0.c($$1, dex.a($$2)))
      .put(ml.b.q, (oi.a)($$0, $$1, $$2) -> $$0.d(og.b, $$1, dex.a($$2)))
      .build();

   protected oi(ji.a $$0, oh $$1) {
      this.a = $$0;
      this.c = $$0.e(mi.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cvs $$0) {
      mk.a().filter(ml::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dki $$0, dki $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dki $$0, dki $$1, @Nullable String $$2, int $$3) {
      this.b(og.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dki> $$0, og $$1, dki $$2, float $$3, int $$4, String $$5) {
      this.a(dfl.o, dfv::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dki> $$0, og $$1, dki $$2, float $$3, int $$4, String $$5) {
      this.a(dfl.p, dek::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends deh> void a(dfl<T> $$0, deh.a<T> $$1, List<dki> $$2, og $$3, dki $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dki $$9 : $$2) {
         ol.a(dex.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(dag $$0, og $$1, dag $$2) {
      on.a(dex.a(dao.yH), dex.a($$0), this.b(axv.bi), $$1, $$2).a("has_netherite_ingot", this.a(axv.bi)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(dag $$0, alq<diz> $$1, alq<dfb<?>> $$2) {
      jg.c<diz> $$3 = this.a.e(mi.bl).b($$1);
      oo.a(dex.a($$0), this.b(axv.bE), this.b(axv.bF), $$3, og.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$2);
   }

   protected void a(og $$0, dki $$1, dki $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(og $$0, dki $$1, dki $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(og $$0, dki $$1, dki $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dki $$0, ayc<dag> $$1, int $$2) {
      this.b(og.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dki $$0, ayc<dag> $$1, int $$2) {
      this.b(og.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dki $$0, dki $$1) {
      this.a(og.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dki $$0, dki $$1) {
      this.a(og.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dnq.J)).a(this.b);
   }

   protected void c(dki $$0, dki $$1) {
      this.b(og.d, $$0).b(dnq.cG).b($$1).b("chest_boat").b("has_boat", this.a(axv.aT)).a(this.b);
   }

   private of e(dki $$0, dex $$1) {
      return this.b(og.c, $$0).a($$1);
   }

   protected of a(dki $$0, dex $$1) {
      return this.a(og.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private of f(dki $$0, dex $$1) {
      int $$2 = $$0 == dnq.fN ? 6 : 3;
      dag $$3 = $$0 == dnq.fN ? dao.vH : dao.qe;
      return this.a(og.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private of g(dki $$0, dex $$1) {
      return this.a(og.c, $$0).a('#', dao.qe).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dki $$0, dki $$1) {
      this.c(og.c, $$0, dex.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private of c(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(og $$0, dki $$1, dki $$2) {
      this.a($$0, $$1, dex.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected of a(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected of b(dki $$0, dex $$1) {
      return this.a(og.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected of c(dki $$0, dex $$1) {
      return this.a(og.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private of h(dki $$0, dex $$1) {
      return this.a(og.b, $$0, 3).c("sign").a('#', $$1).a('X', dao.qe).b("###").b("###").b(" X ");
   }

   protected void e(dki $$0, dki $$1) {
      this.a(og.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', dao.go).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<dag> $$0, List<dag> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, og.a);
   }

   protected void a(List<dag> $$0, List<dag> $$1, @Nullable dag $$2, String $$3, og $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         dag $$6 = $$0.get($$5);
         dag $$7 = $$1.get($$5);
         Stream<dag> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dex.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dki $$0, dki $$1) {
      this.a(og.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dki $$0, dki $$1) {
      this.a(og.b, $$0).a('#', $$1).a('X', axv.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dki $$0, dki $$1) {
      this.a(og.b, $$0).a('#', $$1).a('|', dao.qe).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dki $$0, dki $$1) {
      this.a(og.a, $$0, 8).a('#', dnq.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dki)dnq.aX)).a(this.b);
   }

   protected void j(dki $$0, dki $$1) {
      this.a(og.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dki $$0, dki $$1) {
      this.a(og.b, $$0, 8)
         .a('#', dnq.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dki)dnq.fq))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dnq.fq));
   }

   protected void l(dki $$0, dki $$1) {
      this.a(og.a, $$0, 8).a('#', dnq.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dki)dnq.jc)).a(this.b);
   }

   protected void m(dki $$0, dki $$1) {
      this.b(og.a, $$0, 8).b($$1).a(dnq.L, 4).a(dnq.O, 4).b("concrete_powder").b("has_sand", this.a((dki)dnq.L)).b("has_gravel", this.a((dki)dnq.O)).a(this.b);
   }

   protected void n(dki $$0, dki $$1) {
      this.b(og.b, $$0).b(dnq.qt).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(og $$0, dki $$1, dki $$2) {
      this.d($$0, $$1, dex.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private of d(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(og $$0, dki $$1, dki $$2) {
      this.e($$0, $$1, dex.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private of e(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(og $$0, dki $$1, dki $$2) {
      this.f($$0, $$1, dex.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oj f(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(og $$0, dki $$1, dki $$2) {
      this.b($$0, $$1, dex.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(og $$0, dki $$1, dki $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oj b(og $$0, dki $$1, dex $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(og $$0, dki $$1, dki $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(og $$0, dki $$1, dki $$2, int $$3) {
      om.a(dex.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dki $$0, dki $$1) {
      ol.c(dex.a($$1), og.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(og $$0, dki $$1, og $$2, dki $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(og $$0, dki $$1, og $$2, dki $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(og $$0, dki $$1, og $$2, dki $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(og $$0, dki $$1, og $$2, dki $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alq.a(mi.bv, alr.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alq.a(mi.bv, alr.a($$4)));
   }

   protected void o(dki $$0, dki $$1) {
      this.a(og.i, $$0, 2).a('#', dao.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dki $$0, dex $$1) {
      this.a(og.i, $$0, 2).a('#', dao.pn).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends deh> void a(String $$0, dfl<T> $$1, deh.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, dao.ti, dao.tj, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.tk, dao.tl, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.sh, dao.sl, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.dX, dao.tf, 0.1F);
      this.a($$0, $$1, $$2, $$3, dao.si, dao.sm, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.vY, dao.vZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.qL, dao.qM, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.vq, dao.vr, 0.35F);
      this.a($$0, $$1, $$2, $$3, dao.vL, dao.vM, 0.35F);
   }

   private <T extends deh> void a(String $$0, dfl<T> $$1, deh.a<T> $$2, int $$3, dki $$4, dki $$5, float $$6) {
      ol.a(dex.a($$4), og.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cvs $$0) {
      dab.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(og.a, $$2).b($$1).b(dao.xL).b(c($$2)).b(b($$1), this.a((dki)$$1)).a(this.b, p($$2, dao.xL));
         }
      });
   }

   protected void a(dno $$0, dno $$1) {
      this.a(og.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dki)$$1)).a(this.b);
   }

   protected void b(dno $$0, dno $$1) {
      this.a(og.c, $$0, 4).a('C', $$1).a('R', dao.ml).a('B', dao.to).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dki)$$1)).a(this.b);
   }

   protected void a(dag $$0, dwa $$1) {
      dak $$2 = new dak(dao.xh.e(), 1, kj.a().a(kl.T, $$1.c()).a());
      this.a(og.g, $$2).b(dao.ph).b(dao.dN).b(dao.dO).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(ml $$0, cvs $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            oi.a $$4 = d.get($$2);
            dki $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               of $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == ml.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == ml.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dno a(ml $$0, ml.b $$1) {
      if ($$1 == ml.b.b) {
         if (!$$0.b().containsKey(ml.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(ml.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ar<bv.a> a(dno $$0) {
      return aq.e.a(new bv.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ar<cl.a> a(cx.d $$0, dki $$1) {
      return a(cn.a.a().a(this.c, $$1).a($$0));
   }

   protected ar<cl.a> a(dki $$0) {
      return a(cn.a.a().a(this.c, $$0));
   }

   protected ar<cl.a> a(ayc<dag> $$0) {
      return a(cn.a.a().a(this.c, $$0));
   }

   private static ar<cl.a> a(cn.a... $$0) {
      return a(Arrays.stream($$0).map(cn.a::b).toArray(cn[]::new));
   }

   private static ar<cl.a> a(cn... $$0) {
      return aq.f.a(new cl.a(Optional.empty(), cl.a.a.b, List.of($$0)));
   }

   protected static String b(dki $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dki $$0) {
      return mh.g.b($$0.h()).a();
   }

   protected static String d(dki $$0) {
      return c($$0);
   }

   protected static String p(dki $$0, dki $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dki $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dki $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dex b(ayc<dag> $$0) {
      return dex.a(this.c.b($$0));
   }

   protected oj a(og $$0, dki $$1) {
      return oj.a(this.c, $$0, $$1);
   }

   protected oj a(og $$0, dki $$1, int $$2) {
      return oj.a(this.c, $$0, $$1, $$2);
   }

   protected ok a(og $$0, dak $$1) {
      return ok.a(this.c, $$0, $$1);
   }

   protected ok b(og $$0, dki $$1) {
      return ok.a(this.c, $$0, $$1);
   }

   protected ok b(og $$0, dki $$1, int $$2) {
      return ok.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      of create(oi var1, dki var2, dki var3);
   }

   protected abstract static class b implements mo {
      private final mq d;
      private final CompletableFuture<ji.a> e;

      protected b(mq $$0, CompletableFuture<ji.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mm $$0) {
         return this.e.thenCompose($$1 -> {
            final mq.a $$2 = this.d.a(mi.bv);
            final mq.a $$3 = this.d.a(mi.bu);
            final Set<alq<dfb<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            oh $$6 = new oh() {
               @Override
               public void a(alq<dfb<?>> $$0x, dfb<?> $$1x, @Nullable aj $$2x) {
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
               public ai.a a() {
                  return ai.a.b().a(of.a);
               }

               @Override
               public void b() {
                  aj $$0 = ai.a.b().a("impossible", aq.b.a(new cj.a())).b(of.a);
                  this.a($$0);
               }

               private void a(alq<dfb<?>> $$0x, dfb<?> $$1x) {
                  $$5.add(mo.a($$0, $$1, dfb.a, $$1, $$2.a($$0.a())));
               }

               private void a(aj $$0x) {
                  $$5.add(mo.a($$0, $$1, ai.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract oi a(ji.a var1, oh var2);
   }
}
