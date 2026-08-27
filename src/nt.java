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

public abstract class nt implements la {
   final lc.a d;
   final lc.a e;
   private final CompletableFuture<ip.a> f;
   private static final Map<kx.b, BiFunction<czf, czf, nq>> g = ImmutableMap.builder()
      .put(kx.b.a, (BiFunction<czf, czf, nq>)($$0, $$1) -> c($$0, cvp.a($$1)))
      .put(kx.b.b, (BiFunction<czf, czf, nq>)($$0, $$1) -> b(nr.a, $$0, cvp.a($$1)))
      .put(kx.b.d, (BiFunction<czf, czf, nq>)($$0, $$1) -> f(nr.a, $$0, cvp.a($$1)))
      .put(kx.b.e, (BiFunction<czf, czf, nq>)($$0, $$1) -> a($$0, cvp.a($$1)))
      .put(kx.b.f, (BiFunction<czf, czf, nq>)($$0, $$1) -> d($$0, cvp.a($$1)))
      .put(kx.b.g, (BiFunction<czf, czf, nq>)($$0, $$1) -> d($$0, cvp.a($$1)))
      .put(kx.b.h, (BiFunction<czf, czf, nq>)($$0, $$1) -> e($$0, cvp.a($$1)))
      .put(kx.b.i, (BiFunction<czf, czf, nq>)($$0, $$1) -> e($$0, cvp.a($$1)))
      .put(kx.b.k, (BiFunction<czf, czf, nq>)($$0, $$1) -> g($$0, cvp.a($$1)))
      .put(kx.b.l, (BiFunction<czf, czf, nq>)($$0, $$1) -> a(nr.a, $$0, cvp.a($$1)))
      .put(kx.b.m, (BiFunction<czf, czf, nq>)($$0, $$1) -> b($$0, cvp.a($$1)))
      .put(kx.b.n, (BiFunction<czf, czf, nq>)($$0, $$1) -> c(nr.c, $$0, cvp.a($$1)))
      .put(kx.b.o, (BiFunction<czf, czf, nq>)($$0, $$1) -> e(nr.a, $$0, cvp.a($$1)))
      .put(kx.b.p, (BiFunction<czf, czf, nq>)($$0, $$1) -> f($$0, cvp.a($$1)))
      .put(kx.b.q, (BiFunction<czf, czf, nq>)($$0, $$1) -> d(nr.b, $$0, cvp.a($$1)))
      .build();

   public nt(lc $$0, CompletableFuture<ip.a> $$1) {
      this.d = $$0.a(lc.b.a, "recipes");
      this.e = $$0.a(lc.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(ky $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final ky $$0, final ip.a $$1) {
      final Set<ajv> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new ns() {
         @Override
         public void a(ajv $$0x, cvs<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(la.a($$0, $$1, cvs.h, $$1, nt.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(la.a($$0, $$1, ae.a, $$2.b(), nt.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(nq.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ky $$0, ip.a $$1, af $$2) {
      return la.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(ns var1);

   protected static void a(ns $$0, cmn $$1) {
      kw.a().filter(kx::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(ns $$0, czf $$1, czf $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ns $$0, czf $$1, czf $$2, @Nullable String $$3, int $$4) {
      nv.a(nr.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(ns $$0, List<czf> $$1, nr $$2, czf $$3, float $$4, int $$5, String $$6) {
      a($$0, cvw.p, cwh::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(ns $$0, List<czf> $$1, nr $$2, czf $$3, float $$4, int $$5, String $$6) {
      a($$0, cvw.q, cve::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cvb> void a(ns $$0, cvw<T> $$1, cvb.a<T> $$2, List<czf> $$3, nr $$4, czf $$5, float $$6, int $$7, String $$8, String $$9) {
      for (czf $$10 : $$3) {
         nw.a(cvp.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(ns $$0, crn $$1, nr $$2, crn $$3) {
      ny.a(cvp.a(crv.xo), cvp.a($$1), cvp.a(crv.oI), $$2, $$3).a("has_netherite_ingot", a(crv.oI)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(ns $$0, crn $$1, ajv $$2) {
      nz.a(cvp.a($$1), cvp.a(avm.aM), cvp.a(avm.aN), nr.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(ns $$0, nr $$1, czf $$2, czf $$3) {
      nu.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(ns $$0, nr $$1, czf $$2, czf $$3, String $$4) {
      nv.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(ns $$0, nr $$1, czf $$2, czf $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(ns $$0, czf $$1, avt<crn> $$2, int $$3) {
      nv.a(nr.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ns $$0, czf $$1, avt<crn> $$2, int $$3) {
      nv.a(nr.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dcj.G)).a($$0);
   }

   protected static void c(ns $$0, czf $$1, czf $$2) {
      nv.a(nr.d, $$1).b(dcj.cv).b($$2).b("chest_boat").b("has_boat", a(avm.am)).a($$0);
   }

   private static nq c(czf $$0, cvp $$1) {
      return nv.a(nr.c, $$0).a($$1);
   }

   protected static nq a(czf $$0, cvp $$1) {
      return nu.a(nr.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static nq d(czf $$0, cvp $$1) {
      int $$2 = $$0 == dcj.fo ? 6 : 3;
      crn $$3 = $$0 == dcj.fo ? crv.uv : crv.po;
      return nu.a(nr.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static nq e(czf $$0, cvp $$1) {
      return nu.a(nr.c, $$0).a('#', crv.po).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(ns $$0, czf $$1, czf $$2) {
      c(nr.c, $$1, cvp.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static nq c(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(ns $$0, nr $$1, czf $$2, czf $$3) {
      a($$1, $$2, cvp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static nq a(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static nq b(czf $$0, cvp $$1) {
      return nu.a(nr.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static nq f(czf $$0, cvp $$1) {
      return nu.a(nr.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static nq g(czf $$0, cvp $$1) {
      return nu.a(nr.b, $$0, 3).c("sign").a('#', $$1).a('X', crv.po).b("###").b("###").b(" X ");
   }

   protected static void e(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', crv.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(ns $$0, List<crn> $$1, List<crn> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         crn $$5 = $$1.get($$4);
         crn $$6 = $$2.get($$4);
         nv.a(nr.a, $$6)
            .b($$5)
            .a(cvp.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(crs::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1).a('#', $$2).a('X', avm.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1).a('#', $$2).a('|', crv.po).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.a, $$1, 8).a('#', dcj.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((czf)dcj.aQ)).a($$0);
   }

   protected static void j(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.b, $$1, 8)
         .a('#', dcj.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((czf)dcj.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dcj.eY));
   }

   protected static void l(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.a, $$1, 8).a('#', dcj.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((czf)dcj.iA)).a($$0);
   }

   protected static void m(ns $$0, czf $$1, czf $$2) {
      nv.a(nr.a, $$1, 8).b($$2).a(dcj.I, 4).a(dcj.L, 4).b("concrete_powder").b("has_sand", a((czf)dcj.I)).b("has_gravel", a((czf)dcj.L)).a($$0);
   }

   protected static void n(ns $$0, czf $$1, czf $$2) {
      nv.a(nr.b, $$1).b(dcj.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(ns $$0, nr $$1, czf $$2, czf $$3) {
      d($$1, $$2, cvp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nq d(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(ns $$0, nr $$1, czf $$2, czf $$3) {
      e($$1, $$2, cvp.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static nq e(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(ns $$0, nr $$1, czf $$2, czf $$3) {
      f($$1, $$2, cvp.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static nu f(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(ns $$0, nr $$1, czf $$2, czf $$3) {
      b($$1, $$2, cvp.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(ns $$0, nr $$1, czf $$2, czf $$3) {
      nu.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static nu b(nr $$0, czf $$1, cvp $$2) {
      return nu.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(ns $$0, nr $$1, czf $$2, czf $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ns $$0, nr $$1, czf $$2, czf $$3, int $$4) {
      nx.a(cvp.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(ns $$0, czf $$1, czf $$2) {
      nw.c(cvp.a($$2), nr.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(ns $$0, nr $$1, czf $$2, nr $$3, czf $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(ns $$0, nr $$1, czf $$2, nr $$3, czf $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(ns $$0, nr $$1, czf $$2, nr $$3, czf $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(ns $$0, nr $$1, czf $$2, nr $$3, czf $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nv.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ajv($$7));
      nu.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ajv($$5));
   }

   protected static void a(ns $$0, czf $$1, avt<crn> $$2) {
      nu.a(nr.i, $$1, 2).a('#', crv.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(ns $$0, czf $$1, czf $$2) {
      nu.a(nr.i, $$1, 2).a('#', crv.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cvb> void a(ns $$0, String $$1, cvw<T> $$2, cvb.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, crv.rZ, crv.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.sb, crv.sc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.qY, crv.rc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.dJ, crv.rW, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, crv.qZ, crv.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.uL, crv.uM, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.pW, crv.pX, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.ue, crv.uf, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crv.uy, crv.uz, 0.35F);
   }

   private static <T extends cvb> void a(ns $$0, String $$1, cvw<T> $$2, cvb.a<T> $$3, int $$4, czf $$5, czf $$6, float $$7) {
      nw.a(cvp.a($$5), nr.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(ns $$0, cmn $$1) {
      cri.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nv.a(nr.a, $$3).b($$2).b(crv.ws).b(c($$3)).b(b($$2), a((czf)$$2)).a($$0, a($$3, crv.ws));
         }
      });
   }

   protected static void a(ns $$0, dch $$1, dch $$2) {
      nu.a(nr.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((czf)$$2)).a($$0);
   }

   protected static void b(ns $$0, dch $$1, dch $$2) {
      nu.a(nr.c, $$1, 4).a('C', $$2).a('R', crv.lG).a('B', crv.sf).b(" C ").b("CBC").b(" R ").b(b($$2), a((czf)$$2)).a($$0);
   }

   protected static void a(ns $$0, kx $$1, cmn $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<czf, czf, nq> $$5 = g.get($$3);
            czf $$6 = a($$1, $$3);
            if ($$5 != null) {
               nq $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == kx.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == kx.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dch a(kx $$0, kx.b $$1) {
      if ($$1 == kx.b.b) {
         if (!$$0.b().containsKey(kx.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kx.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dch $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cm.d $$0, czf $$1) {
      return a(cc.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(czf $$0) {
      return a(cc.a.a().a($$0));
   }

   protected static an<ca.a> a(avt<crn> $$0) {
      return a(cc.a.a().a($$0));
   }

   private static an<ca.a> a(cc.a... $$0) {
      return a(Arrays.stream($$0).map(cc.a::b).toArray(cc[]::new));
   }

   private static an<ca.a> a(cc... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(czf $$0) {
      return "has_" + c($$0);
   }

   protected static String c(czf $$0) {
      return kt.h.b($$0.p()).a();
   }

   protected static String d(czf $$0) {
      return c($$0);
   }

   protected static String a(czf $$0, czf $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(czf $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(czf $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
