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

public abstract class nf implements kp {
   final kr.a d;
   final kr.a e;
   private final CompletableFuture<in.a> f;
   private static final Map<km.b, BiFunction<cxa, cxa, nc>> g = ImmutableMap.builder()
      .put(km.b.a, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> c($$0, ctm.a($$1)))
      .put(km.b.b, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> b(nd.a, $$0, ctm.a($$1)))
      .put(km.b.d, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> f(nd.a, $$0, ctm.a($$1)))
      .put(km.b.e, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> a($$0, ctm.a($$1)))
      .put(km.b.f, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> d($$0, ctm.a($$1)))
      .put(km.b.g, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> d($$0, ctm.a($$1)))
      .put(km.b.h, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> e($$0, ctm.a($$1)))
      .put(km.b.i, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> e($$0, ctm.a($$1)))
      .put(km.b.k, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> g($$0, ctm.a($$1)))
      .put(km.b.l, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> a(nd.a, $$0, ctm.a($$1)))
      .put(km.b.m, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> b($$0, ctm.a($$1)))
      .put(km.b.n, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> c(nd.c, $$0, ctm.a($$1)))
      .put(km.b.o, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> e(nd.a, $$0, ctm.a($$1)))
      .put(km.b.p, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> f($$0, ctm.a($$1)))
      .put(km.b.q, (BiFunction<cxa, cxa, nc>)($$0, $$1) -> d(nd.b, $$0, ctm.a($$1)))
      .build();

   public nf(kr $$0, CompletableFuture<in.a> $$1) {
      this.d = $$0.a(kr.b.a, "recipes");
      this.e = $$0.a(kr.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(kn $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final kn $$0, final in.a $$1) {
      final Set<ajh> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new ne() {
         @Override
         public void a(ajh $$0x, ctp<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(kp.a($$0, $$1, ctp.h, $$1, nf.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(kp.a($$0, $$1, ae.a, $$2.b(), nf.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(nc.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kn $$0, in.a $$1, af $$2) {
      return kp.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(ne var1);

   protected static void a(ne $$0, clh $$1) {
      kl.a().filter(km::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(ne $$0, cxa $$1, cxa $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ne $$0, cxa $$1, cxa $$2, @Nullable String $$3, int $$4) {
      nh.a(nd.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(ne $$0, List<cxa> $$1, nd $$2, cxa $$3, float $$4, int $$5, String $$6) {
      a($$0, ctt.p, cue::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(ne $$0, List<cxa> $$1, nd $$2, cxa $$3, float $$4, int $$5, String $$6) {
      a($$0, ctt.q, ctb::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends csy> void a(ne $$0, ctt<T> $$1, csy.a<T> $$2, List<cxa> $$3, nd $$4, cxa $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cxa $$10 : $$3) {
         ni.a(ctm.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(ne $$0, cqh $$1, nd $$2, cqh $$3) {
      nk.a(ctm.a(cqp.xo), ctm.a($$1), ctm.a(cqp.oI), $$2, $$3).a("has_netherite_ingot", a(cqp.oI)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(ne $$0, cqh $$1, ajh $$2) {
      nl.a(ctm.a($$1), ctm.a(auv.aM), ctm.a(auv.aN), nd.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      ng.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(ne $$0, nd $$1, cxa $$2, cxa $$3, String $$4) {
      nh.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(ne $$0, cxa $$1, avd<cqh> $$2, int $$3) {
      nh.a(nd.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ne $$0, cxa $$1, avd<cqh> $$2, int $$3) {
      nh.a(nd.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dae.G)).a($$0);
   }

   protected static void c(ne $$0, cxa $$1, cxa $$2) {
      nh.a(nd.d, $$1).b(dae.cv).b($$2).b("chest_boat").b("has_boat", a(auv.am)).a($$0);
   }

   private static nc c(cxa $$0, ctm $$1) {
      return nh.a(nd.c, $$0).a($$1);
   }

   protected static nc a(cxa $$0, ctm $$1) {
      return ng.a(nd.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static nc d(cxa $$0, ctm $$1) {
      int $$2 = $$0 == dae.fo ? 6 : 3;
      cqh $$3 = $$0 == dae.fo ? cqp.uv : cqp.po;
      return ng.a(nd.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static nc e(cxa $$0, ctm $$1) {
      return ng.a(nd.c, $$0).a('#', cqp.po).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(ne $$0, cxa $$1, cxa $$2) {
      c(nd.c, $$1, ctm.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static nc c(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      a($$1, $$2, ctm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static nc a(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static nc b(cxa $$0, ctm $$1) {
      return ng.a(nd.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static nc f(cxa $$0, ctm $$1) {
      return ng.a(nd.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static nc g(cxa $$0, ctm $$1) {
      return ng.a(nd.b, $$0, 3).c("sign").a('#', $$1).a('X', cqp.po).b("###").b("###").b(" X ");
   }

   protected static void e(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cqp.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(ne $$0, List<cqh> $$1, List<cqh> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cqh $$5 = $$1.get($$4);
         cqh $$6 = $$2.get($$4);
         nh.a(nd.a, $$6)
            .b($$5)
            .a(ctm.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cqm::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1).a('#', $$2).a('X', auv.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1).a('#', $$2).a('|', cqp.po).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.a, $$1, 8).a('#', dae.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cxa)dae.aQ)).a($$0);
   }

   protected static void j(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.b, $$1, 8)
         .a('#', dae.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cxa)dae.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dae.eY));
   }

   protected static void l(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.a, $$1, 8).a('#', dae.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cxa)dae.iA)).a($$0);
   }

   protected static void m(ne $$0, cxa $$1, cxa $$2) {
      nh.a(nd.a, $$1, 8).b($$2).a(dae.I, 4).a(dae.L, 4).b("concrete_powder").b("has_sand", a((cxa)dae.I)).b("has_gravel", a((cxa)dae.L)).a($$0);
   }

   protected static void n(ne $$0, cxa $$1, cxa $$2) {
      nh.a(nd.b, $$1).b(dae.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      d($$1, $$2, ctm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nc d(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      e($$1, $$2, ctm.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nc e(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      f($$1, $$2, ctm.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ng f(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      b($$1, $$2, ctm.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      ng.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ng b(nd $$0, cxa $$1, ctm $$2) {
      return ng.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(ne $$0, nd $$1, cxa $$2, cxa $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ne $$0, nd $$1, cxa $$2, cxa $$3, int $$4) {
      nj.a(ctm.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(ne $$0, cxa $$1, cxa $$2) {
      ni.c(ctm.a($$2), nd.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(ne $$0, nd $$1, cxa $$2, nd $$3, cxa $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(ne $$0, nd $$1, cxa $$2, nd $$3, cxa $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(ne $$0, nd $$1, cxa $$2, nd $$3, cxa $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(ne $$0, nd $$1, cxa $$2, nd $$3, cxa $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nh.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ajh($$7));
      ng.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ajh($$5));
   }

   protected static void a(ne $$0, cxa $$1, avd<cqh> $$2) {
      ng.a(nd.i, $$1, 2).a('#', cqp.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(ne $$0, cxa $$1, cxa $$2) {
      ng.a(nd.i, $$1, 2).a('#', cqp.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends csy> void a(ne $$0, String $$1, ctt<T> $$2, csy.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cqp.rZ, cqp.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.sb, cqp.sc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.qY, cqp.rc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.dJ, cqp.rW, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cqp.qZ, cqp.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.uL, cqp.uM, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.pW, cqp.pX, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.ue, cqp.uf, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cqp.uy, cqp.uz, 0.35F);
   }

   private static <T extends csy> void a(ne $$0, String $$1, ctt<T> $$2, csy.a<T> $$3, int $$4, cxa $$5, cxa $$6, float $$7) {
      ni.a(ctm.a($$5), nd.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(ne $$0, clh $$1) {
      cqc.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nh.a(nd.a, $$3).b($$2).b(cqp.ws).b(c($$3)).b(b($$2), a((cxa)$$2)).a($$0, a($$3, cqp.ws));
         }
      });
   }

   protected static void a(ne $$0, dac $$1, dac $$2) {
      ng.a(nd.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cxa)$$2)).a($$0);
   }

   protected static void b(ne $$0, dac $$1, dac $$2) {
      ng.a(nd.c, $$1, 4).a('C', $$2).a('R', cqp.lG).a('B', cqp.sf).b(" C ").b("CBC").b(" R ").b(b($$2), a((cxa)$$2)).a($$0);
   }

   protected static void a(ne $$0, km $$1, clh $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cxa, cxa, nc> $$5 = g.get($$3);
            cxa $$6 = a($$1, $$3);
            if ($$5 != null) {
               nc $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == km.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == km.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dac a(km $$0, km.b $$1) {
      if ($$1 == km.b.b) {
         if (!$$0.b().containsKey(km.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(km.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dac $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cm.d $$0, cxa $$1) {
      return a(cc.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(cxa $$0) {
      return a(cc.a.a().a($$0));
   }

   protected static an<ca.a> a(avd<cqh> $$0) {
      return a(cc.a.a().a($$0));
   }

   private static an<ca.a> a(cc.a... $$0) {
      return a(Arrays.stream($$0).map(cc.a::b).toArray(cc[]::new));
   }

   private static an<ca.a> a(cc... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(cxa $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cxa $$0) {
      return ki.h.b($$0.l()).a();
   }

   protected static String d(cxa $$0) {
      return c($$0);
   }

   protected static String a(cxa $$0, cxa $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cxa $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cxa $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
