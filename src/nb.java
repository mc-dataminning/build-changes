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

public abstract class nb implements km {
   final ko.a d;
   final ko.a e;
   private static final Map<kj.b, BiFunction<cvm, cvm, my>> f = ImmutableMap.builder()
      .put(kj.b.a, (BiFunction<cvm, cvm, my>)($$0, $$1) -> c($$0, cry.a($$1)))
      .put(kj.b.b, (BiFunction<cvm, cvm, my>)($$0, $$1) -> b(mz.a, $$0, cry.a($$1)))
      .put(kj.b.d, (BiFunction<cvm, cvm, my>)($$0, $$1) -> f(mz.a, $$0, cry.a($$1)))
      .put(kj.b.e, (BiFunction<cvm, cvm, my>)($$0, $$1) -> a($$0, cry.a($$1)))
      .put(kj.b.f, (BiFunction<cvm, cvm, my>)($$0, $$1) -> d($$0, cry.a($$1)))
      .put(kj.b.g, (BiFunction<cvm, cvm, my>)($$0, $$1) -> d($$0, cry.a($$1)))
      .put(kj.b.h, (BiFunction<cvm, cvm, my>)($$0, $$1) -> e($$0, cry.a($$1)))
      .put(kj.b.i, (BiFunction<cvm, cvm, my>)($$0, $$1) -> e($$0, cry.a($$1)))
      .put(kj.b.k, (BiFunction<cvm, cvm, my>)($$0, $$1) -> g($$0, cry.a($$1)))
      .put(kj.b.l, (BiFunction<cvm, cvm, my>)($$0, $$1) -> a(mz.a, $$0, cry.a($$1)))
      .put(kj.b.m, (BiFunction<cvm, cvm, my>)($$0, $$1) -> b($$0, cry.a($$1)))
      .put(kj.b.n, (BiFunction<cvm, cvm, my>)($$0, $$1) -> c(mz.c, $$0, cry.a($$1)))
      .put(kj.b.o, (BiFunction<cvm, cvm, my>)($$0, $$1) -> e(mz.a, $$0, cry.a($$1)))
      .put(kj.b.p, (BiFunction<cvm, cvm, my>)($$0, $$1) -> f($$0, cry.a($$1)))
      .put(kj.b.q, (BiFunction<cvm, cvm, my>)($$0, $$1) -> d(mz.b, $$0, cry.a($$1)))
      .build();

   public nb(ko $$0) {
      this.d = $$0.a(ko.b.a, "recipes");
      this.e = $$0.a(ko.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final kk $$0) {
      final Set<aiy> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new na() {
         @Override
         public void a(aiy $$0x, csb<?> $$1x, @Nullable af $$2x) {
            if (!$$1.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$2.add(km.a($$0, csb.h, $$1, nb.this.d.a($$0)));
               if ($$2 != null) {
                  $$2.add(km.a($$0, ae.a, $$2.b(), nb.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(my.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kk $$0, af $$1) {
      return km.a($$0, ae.a, $$1.b(), this.e.a($$1.a()));
   }

   protected abstract void a(na var1);

   protected static void a(na $$0, cjs $$1) {
      ki.a().filter(kj::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(na $$0, cvm $$1, cvm $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(na $$0, cvm $$1, cvm $$2, @Nullable String $$3, int $$4) {
      nd.a(mz.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(na $$0, List<cvm> $$1, mz $$2, cvm $$3, float $$4, int $$5, String $$6) {
      a($$0, csf.p, csq::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(na $$0, List<cvm> $$1, mz $$2, cvm $$3, float $$4, int $$5, String $$6) {
      a($$0, csf.q, crn::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends crk> void a(na $$0, csf<T> $$1, crk.a<T> $$2, List<cvm> $$3, mz $$4, cvm $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cvm $$10 : $$3) {
         ne.a(cry.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(na $$0, cou $$1, mz $$2, cou $$3) {
      ng.a(cry.a(cpc.xm), cry.a($$1), cry.a(cpc.oI), $$2, $$3).a("has_netherite_ingot", a(cpc.oI)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(na $$0, cou $$1, aiy $$2) {
      nh.a(cry.a($$1), cry.a(auh.aM), cry.a(auh.aN), mz.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(na $$0, mz $$1, cvm $$2, cvm $$3) {
      nc.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(na $$0, mz $$1, cvm $$2, cvm $$3, String $$4) {
      nd.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(na $$0, mz $$1, cvm $$2, cvm $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(na $$0, cvm $$1, auo<cou> $$2, int $$3) {
      nd.a(mz.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(na $$0, cvm $$1, auo<cou> $$2, int $$3) {
      nd.a(mz.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cyq.G)).a($$0);
   }

   protected static void c(na $$0, cvm $$1, cvm $$2) {
      nd.a(mz.d, $$1).b(cyq.cv).b($$2).b("chest_boat").b("has_boat", a(auh.am)).a($$0);
   }

   private static my c(cvm $$0, cry $$1) {
      return nd.a(mz.c, $$0).a($$1);
   }

   protected static my a(cvm $$0, cry $$1) {
      return nc.a(mz.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static my d(cvm $$0, cry $$1) {
      int $$2 = $$0 == cyq.fo ? 6 : 3;
      cou $$3 = $$0 == cyq.fo ? cpc.ut : cpc.po;
      return nc.a(mz.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static my e(cvm $$0, cry $$1) {
      return nc.a(mz.c, $$0).a('#', cpc.po).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(na $$0, cvm $$1, cvm $$2) {
      c(mz.c, $$1, cry.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static my c(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(na $$0, mz $$1, cvm $$2, cvm $$3) {
      a($$1, $$2, cry.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static my a(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static my b(cvm $$0, cry $$1) {
      return nc.a(mz.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static my f(cvm $$0, cry $$1) {
      return nc.a(mz.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static my g(cvm $$0, cry $$1) {
      return nc.a(mz.b, $$0, 3).c("sign").a('#', $$1).a('X', cpc.po).b("###").b("###").b(" X ");
   }

   protected static void e(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cpc.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(na $$0, List<cou> $$1, List<cou> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cou $$5 = $$1.get($$4);
         cou $$6 = $$2.get($$4);
         nd.a(mz.a, $$6)
            .b($$5)
            .a(cry.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(coz::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1).a('#', $$2).a('X', auh.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1).a('#', $$2).a('|', cpc.po).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.a, $$1, 8).a('#', cyq.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cvm)cyq.aQ)).a($$0);
   }

   protected static void j(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.b, $$1, 8)
         .a('#', cyq.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cvm)cyq.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cyq.eY));
   }

   protected static void l(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.a, $$1, 8).a('#', cyq.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cvm)cyq.iA)).a($$0);
   }

   protected static void m(na $$0, cvm $$1, cvm $$2) {
      nd.a(mz.a, $$1, 8).b($$2).a(cyq.I, 4).a(cyq.L, 4).b("concrete_powder").b("has_sand", a((cvm)cyq.I)).b("has_gravel", a((cvm)cyq.L)).a($$0);
   }

   protected static void n(na $$0, cvm $$1, cvm $$2) {
      nd.a(mz.b, $$1).b(cyq.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(na $$0, mz $$1, cvm $$2, cvm $$3) {
      d($$1, $$2, cry.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static my d(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(na $$0, mz $$1, cvm $$2, cvm $$3) {
      e($$1, $$2, cry.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static my e(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(na $$0, mz $$1, cvm $$2, cvm $$3) {
      f($$1, $$2, cry.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static nc f(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(na $$0, mz $$1, cvm $$2, cvm $$3) {
      b($$1, $$2, cry.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(na $$0, mz $$1, cvm $$2, cvm $$3) {
      nc.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static nc b(mz $$0, cvm $$1, cry $$2) {
      return nc.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(na $$0, mz $$1, cvm $$2, cvm $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(na $$0, mz $$1, cvm $$2, cvm $$3, int $$4) {
      nf.a(cry.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(na $$0, cvm $$1, cvm $$2) {
      ne.c(cry.a($$2), mz.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(na $$0, mz $$1, cvm $$2, mz $$3, cvm $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(na $$0, mz $$1, cvm $$2, mz $$3, cvm $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(na $$0, mz $$1, cvm $$2, mz $$3, cvm $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(na $$0, mz $$1, cvm $$2, mz $$3, cvm $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nd.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aiy($$7));
      nc.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aiy($$5));
   }

   protected static void a(na $$0, cvm $$1, auo<cou> $$2) {
      nc.a(mz.i, $$1, 2).a('#', cpc.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(na $$0, cvm $$1, cvm $$2) {
      nc.a(mz.i, $$1, 2).a('#', cpc.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends crk> void a(na $$0, String $$1, csf<T> $$2, crk.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cpc.rZ, cpc.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.sb, cpc.sc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.qY, cpc.rc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.dJ, cpc.rW, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cpc.qZ, cpc.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.uJ, cpc.uK, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.pW, cpc.pX, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.uc, cpc.ud, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cpc.uw, cpc.ux, 0.35F);
   }

   private static <T extends crk> void a(na $$0, String $$1, csf<T> $$2, crk.a<T> $$3, int $$4, cvm $$5, cvm $$6, float $$7) {
      ne.a(cry.a($$5), mz.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(na $$0, cjs $$1) {
      cop.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nd.a(mz.a, $$3).b($$2).b(cpc.wq).b(c($$3)).b(b($$2), a((cvm)$$2)).a($$0, a($$3, cpc.wq));
         }
      });
   }

   protected static void a(na $$0, cyo $$1, cyo $$2) {
      nc.a(mz.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cvm)$$2)).a($$0);
   }

   protected static void b(na $$0, cyo $$1, cyo $$2) {
      nc.a(mz.c, $$1, 4).a('C', $$2).a('R', cpc.lG).a('B', cpc.sf).b(" C ").b("CBC").b(" R ").b(b($$2), a((cvm)$$2)).a($$0);
   }

   protected static void a(na $$0, kj $$1, cjs $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cvm, cvm, my> $$5 = f.get($$3);
            cvm $$6 = a($$1, $$3);
            if ($$5 != null) {
               my $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == kj.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == kj.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static cyo a(kj $$0, kj.b $$1) {
      if ($$1 == kj.b.b) {
         if (!$$0.b().containsKey(kj.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kj.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(cyo $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cm.d $$0, cvm $$1) {
      return a(cc.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(cvm $$0) {
      return a(cc.a.a().a($$0));
   }

   protected static an<ca.a> a(auo<cou> $$0) {
      return a(cc.a.a().a($$0));
   }

   private static an<ca.a> a(cc.a... $$0) {
      return a(Arrays.stream($$0).map(cc.a::b).toArray(cc[]::new));
   }

   private static an<ca.a> a(cc... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(cvm $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cvm $$0) {
      return kf.h.b($$0.j()).a();
   }

   protected static String d(cvm $$0) {
      return c($$0);
   }

   protected static String a(cvm $$0, cvm $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cvm $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cvm $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
