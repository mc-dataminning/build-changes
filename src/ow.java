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

public abstract class ow {
   protected final js.a a;
   private final jr<cvx> c;
   protected final ov b;
   private static final Map<mc.b, ow.a> d = ImmutableMap.builder()
      .put(mc.b.a, (ow.a)($$0, $$1, $$2) -> $$0.e($$1, dal.a($$2)))
      .put(mc.b.b, (ow.a)($$0, $$1, $$2) -> $$0.b(ou.a, $$1, dal.a($$2)))
      .put(mc.b.d, (ow.a)($$0, $$1, $$2) -> $$0.f(ou.a, $$1, dal.a($$2)))
      .put(mc.b.e, (ow.a)($$0, $$1, $$2) -> $$0.a($$1, dal.a($$2)))
      .put(mc.b.f, (ow.a)($$0, $$1, $$2) -> $$0.f($$1, dal.a($$2)))
      .put(mc.b.g, (ow.a)($$0, $$1, $$2) -> $$0.f($$1, dal.a($$2)))
      .put(mc.b.h, (ow.a)($$0, $$1, $$2) -> $$0.g($$1, dal.a($$2)))
      .put(mc.b.i, (ow.a)($$0, $$1, $$2) -> $$0.g($$1, dal.a($$2)))
      .put(mc.b.k, (ow.a)($$0, $$1, $$2) -> $$0.h($$1, dal.a($$2)))
      .put(mc.b.l, (ow.a)($$0, $$1, $$2) -> $$0.a(ou.a, $$1, dal.a($$2)))
      .put(mc.b.m, (ow.a)($$0, $$1, $$2) -> $$0.b($$1, dal.a($$2)))
      .put(mc.b.n, (ow.a)($$0, $$1, $$2) -> $$0.c(ou.c, $$1, dal.a($$2)))
      .put(mc.b.o, (ow.a)($$0, $$1, $$2) -> $$0.e(ou.a, $$1, dal.a($$2)))
      .put(mc.b.p, (ow.a)($$0, $$1, $$2) -> $$0.c($$1, dal.a($$2)))
      .put(mc.b.q, (ow.a)($$0, $$1, $$2) -> $$0.d(ou.b, $$1, dal.a($$2)))
      .build();

   protected ow(js.a $$0, ov $$1) {
      this.a = $$0;
      this.c = $$0.d(lz.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(crf $$0) {
      mb.a().filter(mc::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dfa $$0, dfa $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dfa $$0, dfa $$1, @Nullable String $$2, int $$3) {
      this.b(ou.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dfa> $$0, ou $$1, dfa $$2, float $$3, int $$4, String $$5) {
      this.a(dau.o, dbg::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dfa> $$0, ou $$1, dfa $$2, float $$3, int $$4, String $$5) {
      this.a(dau.p, czz::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends czw> void a(dau<T> $$0, czw.a<T> $$1, List<dfa> $$2, ou $$3, dfa $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dfa $$9 : $$2) {
         oz.a(dal.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cvx $$0, ou $$1, cvx $$2) {
      pb.a(dal.a(cwf.xy), dal.a($$0), this.b(axj.bg), $$1, $$2).a("has_netherite_ingot", this.a(axj.bg)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cvx $$0, ali $$1) {
      pc.a(dal.a($$0), this.b(axj.bC), this.b(axj.bD), ou.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(ou $$0, dfa $$1, dfa $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(ou $$0, dfa $$1, dfa $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(ou $$0, dfa $$1, dfa $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dfa $$0, axq<cvx> $$1, int $$2) {
      this.b(ou.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfa $$0, axq<cvx> $$1, int $$2) {
      this.b(ou.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dfa $$0, dfa $$1) {
      this.a(ou.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dfa $$0, dfa $$1) {
      this.a(ou.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dig.G)).a(this.b);
   }

   protected void c(dfa $$0, dfa $$1) {
      this.b(ou.d, $$0).b(dig.cv).b($$1).b("chest_boat").b("has_boat", this.a(axj.aR)).a(this.b);
   }

   private ot e(dfa $$0, dal $$1) {
      return this.b(ou.c, $$0).a($$1);
   }

   protected ot a(dfa $$0, dal $$1) {
      return this.a(ou.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ot f(dfa $$0, dal $$1) {
      int $$2 = $$0 == dig.fo ? 6 : 3;
      cvx $$3 = $$0 == dig.fo ? cwf.uz : cwf.pr;
      return this.a(ou.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ot g(dfa $$0, dal $$1) {
      return this.a(ou.c, $$0).a('#', cwf.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dfa $$0, dfa $$1) {
      this.c(ou.c, $$0, dal.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private ot c(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ou $$0, dfa $$1, dfa $$2) {
      this.a($$0, $$1, dal.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected ot a(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ot b(dfa $$0, dal $$1) {
      return this.a(ou.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ot c(dfa $$0, dal $$1) {
      return this.a(ou.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ot h(dfa $$0, dal $$1) {
      return this.a(ou.b, $$0, 3).c("sign").a('#', $$1).a('X', cwf.pr).b("###").b("###").b(" X ");
   }

   protected void e(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cwf.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cvx> $$0, List<cvx> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, ou.a);
   }

   protected void a(List<cvx> $$0, List<cvx> $$1, @Nullable cvx $$2, String $$3, ou $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cvx $$6 = $$0.get($$5);
         cvx $$7 = $$1.get($$5);
         Stream<cvx> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dal.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0).a('#', $$1).a('X', axj.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0).a('#', $$1).a('|', cwf.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dfa $$0, dfa $$1) {
      this.a(ou.a, $$0, 8).a('#', dig.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dfa)dig.aQ)).a(this.b);
   }

   protected void j(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dfa $$0, dfa $$1) {
      this.a(ou.b, $$0, 8)
         .a('#', dig.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dfa)dig.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dig.eY));
   }

   protected void l(dfa $$0, dfa $$1) {
      this.a(ou.a, $$0, 8).a('#', dig.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dfa)dig.iA)).a(this.b);
   }

   protected void m(dfa $$0, dfa $$1) {
      this.b(ou.a, $$0, 8).b($$1).a(dig.I, 4).a(dig.L, 4).b("concrete_powder").b("has_sand", this.a((dfa)dig.I)).b("has_gravel", this.a((dfa)dig.L)).a(this.b);
   }

   protected void n(dfa $$0, dfa $$1) {
      this.b(ou.b, $$0).b(dig.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(ou $$0, dfa $$1, dfa $$2) {
      this.d($$0, $$1, dal.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ot d(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ou $$0, dfa $$1, dfa $$2) {
      this.e($$0, $$1, dal.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ot e(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ou $$0, dfa $$1, dfa $$2) {
      this.f($$0, $$1, dal.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private ox f(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ou $$0, dfa $$1, dfa $$2) {
      this.b($$0, $$1, dal.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(ou $$0, dfa $$1, dfa $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected ox b(ou $$0, dfa $$1, dal $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ou $$0, dfa $$1, dfa $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ou $$0, dfa $$1, dfa $$2, int $$3) {
      pa.a(dal.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dfa $$0, dfa $$1) {
      oz.c(dal.a($$1), ou.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(ou $$0, dfa $$1, ou $$2, dfa $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(ou $$0, dfa $$1, ou $$2, dfa $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(ou $$0, dfa $$1, ou $$2, dfa $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(ou $$0, dfa $$1, ou $$2, dfa $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, ali.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, ali.a($$4));
   }

   protected void o(dfa $$0, dfa $$1) {
      this.a(ou.i, $$0, 2).a('#', cwf.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dfa $$0, dal $$1) {
      this.a(ou.i, $$0, 2).a('#', cwf.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends czw> void a(String $$0, dau<T> $$1, czw.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cwf.sb, cwf.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.sd, cwf.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.ra, cwf.re, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.dK, cwf.rY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cwf.rb, cwf.rf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.uP, cwf.uQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.pY, cwf.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.ui, cwf.uj, 0.35F);
      this.a($$0, $$1, $$2, $$3, cwf.uC, cwf.uD, 0.35F);
   }

   private <T extends czw> void a(String $$0, dau<T> $$1, czw.a<T> $$2, int $$3, dfa $$4, dfa $$5, float $$6) {
      oz.a(dal.a($$4), ou.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(crf $$0) {
      cvs.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(ou.a, $$2).b($$1).b(cwf.wC).b(c($$2)).b(b($$1), this.a((dfa)$$1)).a(this.b, p($$2, cwf.wC));
         }
      });
   }

   protected void a(die $$0, die $$1) {
      this.a(ou.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dfa)$$1)).a(this.b);
   }

   protected void b(die $$0, die $$1) {
      this.a(ou.c, $$0, 4).a('C', $$1).a('R', cwf.lH).a('B', cwf.sh).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dfa)$$1)).a(this.b);
   }

   protected void a(cvx $$0, dqg $$1) {
      cwb $$2 = new cwb(cwf.vY.f(), 1, kr.a().a(ku.R, $$1.b()).a());
      this.a(ou.g, $$2).b(cwf.ou).b(cwf.dA).b(cwf.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(mc $$0, crf $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            ow.a $$4 = d.get($$2);
            dfa $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               ot $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mc.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == mc.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private die a(mc $$0, mc.b $$1) {
      if ($$1 == mc.b.b) {
         if (!$$0.b().containsKey(mc.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mc.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ap<bs.a> a(die $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dfa $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dfa $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(axq<cvx> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dfa $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dfa $$0) {
      return ly.g.b($$0.j()).a();
   }

   protected static String d(dfa $$0) {
      return c($$0);
   }

   protected static String p(dfa $$0, dfa $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dfa $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dfa $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dal b(axq<cvx> $$0) {
      return dal.a(this.c.b($$0));
   }

   protected ox a(ou $$0, dfa $$1) {
      return ox.a(this.c, $$0, $$1);
   }

   protected ox a(ou $$0, dfa $$1, int $$2) {
      return ox.a(this.c, $$0, $$1, $$2);
   }

   protected oy a(ou $$0, cwb $$1) {
      return oy.a(this.c, $$0, $$1);
   }

   protected oy b(ou $$0, dfa $$1) {
      return oy.a(this.c, $$0, $$1);
   }

   protected oy b(ou $$0, dfa $$1, int $$2) {
      return oy.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ot create(ow var1, dfa var2, dfa var3);
   }

   protected abstract static class b implements mf {
      private final mh d;
      private final CompletableFuture<js.a> e;

      protected b(mh $$0, CompletableFuture<js.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(md $$0) {
         return this.e.thenCompose($$1 -> {
            final mh.a $$2 = this.d.a(lz.bh);
            final mh.a $$3 = this.d.a(lz.bg);
            final Set<ali> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ov $$6 = new ov() {
               @Override
               public void a(ali $$0x, dap<?> $$1x, @Nullable ah $$2x) {
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
                  return ag.a.b().a(ot.a);
               }

               @Override
               public void b() {
                  ah $$0 = ag.a.b().a("impossible", ao.b.a(new cg.a())).b(ot.a);
                  this.a($$0);
               }

               private void a(ali $$0x, dap<?> $$1x) {
                  $$5.add(mf.a($$0, $$1, dap.h, $$1, $$2.a($$0)));
               }

               private void a(ah $$0x) {
                  $$5.add(mf.a($$0, $$1, ag.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract ow a(js.a var1, ov var2);
   }
}
