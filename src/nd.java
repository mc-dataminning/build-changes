import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public abstract class nd implements ko {
   final kq.a d;
   final kq.a e;
   private final CompletableFuture<in.a> f;
   private static final Map<kl.b, BiFunction<cwd, cwd, na>> g = ImmutableMap.builder()
      .put(kl.b.a, (BiFunction<cwd, cwd, na>)($$0, $$1) -> c($$0, csp.a($$1)))
      .put(kl.b.b, (BiFunction<cwd, cwd, na>)($$0, $$1) -> b(nb.a, $$0, csp.a($$1)))
      .put(kl.b.d, (BiFunction<cwd, cwd, na>)($$0, $$1) -> f(nb.a, $$0, csp.a($$1)))
      .put(kl.b.e, (BiFunction<cwd, cwd, na>)($$0, $$1) -> a($$0, csp.a($$1)))
      .put(kl.b.f, (BiFunction<cwd, cwd, na>)($$0, $$1) -> d($$0, csp.a($$1)))
      .put(kl.b.g, (BiFunction<cwd, cwd, na>)($$0, $$1) -> d($$0, csp.a($$1)))
      .put(kl.b.h, (BiFunction<cwd, cwd, na>)($$0, $$1) -> e($$0, csp.a($$1)))
      .put(kl.b.i, (BiFunction<cwd, cwd, na>)($$0, $$1) -> e($$0, csp.a($$1)))
      .put(kl.b.k, (BiFunction<cwd, cwd, na>)($$0, $$1) -> g($$0, csp.a($$1)))
      .put(kl.b.l, (BiFunction<cwd, cwd, na>)($$0, $$1) -> a(nb.a, $$0, csp.a($$1)))
      .put(kl.b.m, (BiFunction<cwd, cwd, na>)($$0, $$1) -> b($$0, csp.a($$1)))
      .put(kl.b.n, (BiFunction<cwd, cwd, na>)($$0, $$1) -> c(nb.c, $$0, csp.a($$1)))
      .put(kl.b.o, (BiFunction<cwd, cwd, na>)($$0, $$1) -> e(nb.a, $$0, csp.a($$1)))
      .put(kl.b.p, (BiFunction<cwd, cwd, na>)($$0, $$1) -> f($$0, csp.a($$1)))
      .put(kl.b.q, (BiFunction<cwd, cwd, na>)($$0, $$1) -> d(nb.b, $$0, csp.a($$1)))
      .build();

   public nd(kq $$0, CompletableFuture<in.a> $$1) {
      this.d = $$0.a(kq.b.a, "recipes");
      this.e = $$0.a(kq.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(km $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final km $$0, final in.a $$1) {
      final Set<ajc> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new nc() {
         @Override
         public void a(ajc $$0x, css<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(ko.a($$0, $$1, css.h, $$1, nd.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(ko.a($$0, $$1, ae.a, $$2.b(), nd.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(na.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(km $$0, in.a $$1, af $$2) {
      return ko.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(nc var1);

   protected static void a(nc $$0, ckl $$1) {
      kk.a().filter(kl::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(nc $$0, cwd $$1, cwd $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(nc $$0, cwd $$1, cwd $$2, @Nullable String $$3, int $$4) {
      nf.a(nb.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(nc $$0, List<cwd> $$1, nb $$2, cwd $$3, float $$4, int $$5, String $$6) {
      a($$0, csw.p, cth::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(nc $$0, List<cwd> $$1, nb $$2, cwd $$3, float $$4, int $$5, String $$6) {
      a($$0, csw.q, cse::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends csb> void a(nc $$0, csw<T> $$1, csb.a<T> $$2, List<cwd> $$3, nb $$4, cwd $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cwd $$10 : $$3) {
         ng.a(csp.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(nc $$0, cpl $$1, nb $$2, cpl $$3) {
      ni.a(csp.a(cpt.xm), csp.a($$1), csp.a(cpt.oI), $$2, $$3).a("has_netherite_ingot", a(cpt.oI)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(nc $$0, cpl $$1, ajc $$2) {
      nj.a(csp.a($$1), csp.a(aum.aM), csp.a(aum.aN), nb.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      ne.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(nc $$0, nb $$1, cwd $$2, cwd $$3, String $$4) {
      nf.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(nc $$0, cwd $$1, aut<cpl> $$2, int $$3) {
      nf.a(nb.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(nc $$0, cwd $$1, aut<cpl> $$2, int $$3) {
      nf.a(nb.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(czh.G)).a($$0);
   }

   protected static void c(nc $$0, cwd $$1, cwd $$2) {
      nf.a(nb.d, $$1).b(czh.cv).b($$2).b("chest_boat").b("has_boat", a(aum.am)).a($$0);
   }

   private static na c(cwd $$0, csp $$1) {
      return nf.a(nb.c, $$0).a($$1);
   }

   protected static na a(cwd $$0, csp $$1) {
      return ne.a(nb.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static na d(cwd $$0, csp $$1) {
      int $$2 = $$0 == czh.fo ? 6 : 3;
      cpl $$3 = $$0 == czh.fo ? cpt.ut : cpt.po;
      return ne.a(nb.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static na e(cwd $$0, csp $$1) {
      return ne.a(nb.c, $$0).a('#', cpt.po).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(nc $$0, cwd $$1, cwd $$2) {
      c(nb.c, $$1, csp.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static na c(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      a($$1, $$2, csp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static na a(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static na b(cwd $$0, csp $$1) {
      return ne.a(nb.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static na f(cwd $$0, csp $$1) {
      return ne.a(nb.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static na g(cwd $$0, csp $$1) {
      return ne.a(nb.b, $$0, 3).c("sign").a('#', $$1).a('X', cpt.po).b("###").b("###").b(" X ");
   }

   protected static void e(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cpt.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(nc $$0, List<cpl> $$1, List<cpl> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cpl $$5 = $$1.get($$4);
         cpl $$6 = $$2.get($$4);
         nf.a(nb.a, $$6)
            .b($$5)
            .a(csp.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cpq::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1).a('#', $$2).a('X', aum.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1).a('#', $$2).a('|', cpt.po).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.a, $$1, 8).a('#', czh.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cwd)czh.aQ)).a($$0);
   }

   protected static void j(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.b, $$1, 8)
         .a('#', czh.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cwd)czh.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, czh.eY));
   }

   protected static void l(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.a, $$1, 8).a('#', czh.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cwd)czh.iA)).a($$0);
   }

   protected static void m(nc $$0, cwd $$1, cwd $$2) {
      nf.a(nb.a, $$1, 8).b($$2).a(czh.I, 4).a(czh.L, 4).b("concrete_powder").b("has_sand", a((cwd)czh.I)).b("has_gravel", a((cwd)czh.L)).a($$0);
   }

   protected static void n(nc $$0, cwd $$1, cwd $$2) {
      nf.a(nb.b, $$1).b(czh.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      d($$1, $$2, csp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static na d(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      e($$1, $$2, csp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static na e(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      f($$1, $$2, csp.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ne f(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      b($$1, $$2, csp.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      ne.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ne b(nb $$0, cwd $$1, csp $$2) {
      return ne.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(nc $$0, nb $$1, cwd $$2, cwd $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(nc $$0, nb $$1, cwd $$2, cwd $$3, int $$4) {
      nh.a(csp.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(nc $$0, cwd $$1, cwd $$2) {
      ng.c(csp.a($$2), nb.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(nc $$0, nb $$1, cwd $$2, nb $$3, cwd $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(nc $$0, nb $$1, cwd $$2, nb $$3, cwd $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(nc $$0, nb $$1, cwd $$2, nb $$3, cwd $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(nc $$0, nb $$1, cwd $$2, nb $$3, cwd $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nf.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ajc($$7));
      ne.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ajc($$5));
   }

   protected static void a(nc $$0, cwd $$1, aut<cpl> $$2) {
      ne.a(nb.i, $$1, 2).a('#', cpt.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(nc $$0, cwd $$1, cwd $$2) {
      ne.a(nb.i, $$1, 2).a('#', cpt.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends csb> void a(nc $$0, String $$1, csw<T> $$2, csb.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cpt.rZ, cpt.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.sb, cpt.sc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.qY, cpt.rc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.dJ, cpt.rW, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cpt.qZ, cpt.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.uJ, cpt.uK, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.pW, cpt.pX, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.uc, cpt.ud, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpt.uw, cpt.ux, 0.35F);
   }

   private static <T extends csb> void a(nc $$0, String $$1, csw<T> $$2, csb.a<T> $$3, int $$4, cwd $$5, cwd $$6, float $$7) {
      ng.a(csp.a($$5), nb.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(nc $$0, ckl $$1) {
      cpg.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nf.a(nb.a, $$3).b($$2).b(cpt.wq).b(c($$3)).b(b($$2), a((cwd)$$2)).a($$0, a($$3, cpt.wq));
         }
      });
   }

   protected static void a(nc $$0, czf $$1, czf $$2) {
      ne.a(nb.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cwd)$$2)).a($$0);
   }

   protected static void b(nc $$0, czf $$1, czf $$2) {
      ne.a(nb.c, $$1, 4).a('C', $$2).a('R', cpt.lG).a('B', cpt.sf).b(" C ").b("CBC").b(" R ").b(b($$2), a((cwd)$$2)).a($$0);
   }

   protected static void a(nc $$0, kl $$1, ckl $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cwd, cwd, na> $$5 = g.get($$3);
            cwd $$6 = a($$1, $$3);
            if ($$5 != null) {
               na $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == kl.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == kl.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static czf a(kl $$0, kl.b $$1) {
      if ($$1 == kl.b.b) {
         if (!$$0.b().containsKey(kl.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kl.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(czf $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cm.d $$0, cwd $$1) {
      return a(cc.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(cwd $$0) {
      return a(cc.a.a().a($$0));
   }

   protected static an<ca.a> a(aut<cpl> $$0) {
      return a(cc.a.a().a($$0));
   }

   private static an<ca.a> a(cc.a... $$0) {
      return a(Arrays.stream($$0).map(cc.a::b).toArray(cc[]::new));
   }

   private static an<ca.a> a(cc... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(cwd $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cwd $$0) {
      return kh.h.b($$0.l()).a();
   }

   protected static String d(cwd $$0) {
      return c($$0);
   }

   protected static String a(cwd $$0, cwd $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cwd $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cwd $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
