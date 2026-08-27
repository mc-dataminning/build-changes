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

public abstract class nr implements ky {
   final la.a d;
   final la.a e;
   private final CompletableFuture<in.a> f;
   private static final Map<kv.b, BiFunction<cyw, cyw, no>> g = ImmutableMap.builder()
      .put(kv.b.a, (BiFunction<cyw, cyw, no>)($$0, $$1) -> c($$0, cvg.a($$1)))
      .put(kv.b.b, (BiFunction<cyw, cyw, no>)($$0, $$1) -> b(np.a, $$0, cvg.a($$1)))
      .put(kv.b.d, (BiFunction<cyw, cyw, no>)($$0, $$1) -> f(np.a, $$0, cvg.a($$1)))
      .put(kv.b.e, (BiFunction<cyw, cyw, no>)($$0, $$1) -> a($$0, cvg.a($$1)))
      .put(kv.b.f, (BiFunction<cyw, cyw, no>)($$0, $$1) -> d($$0, cvg.a($$1)))
      .put(kv.b.g, (BiFunction<cyw, cyw, no>)($$0, $$1) -> d($$0, cvg.a($$1)))
      .put(kv.b.h, (BiFunction<cyw, cyw, no>)($$0, $$1) -> e($$0, cvg.a($$1)))
      .put(kv.b.i, (BiFunction<cyw, cyw, no>)($$0, $$1) -> e($$0, cvg.a($$1)))
      .put(kv.b.k, (BiFunction<cyw, cyw, no>)($$0, $$1) -> g($$0, cvg.a($$1)))
      .put(kv.b.l, (BiFunction<cyw, cyw, no>)($$0, $$1) -> a(np.a, $$0, cvg.a($$1)))
      .put(kv.b.m, (BiFunction<cyw, cyw, no>)($$0, $$1) -> b($$0, cvg.a($$1)))
      .put(kv.b.n, (BiFunction<cyw, cyw, no>)($$0, $$1) -> c(np.c, $$0, cvg.a($$1)))
      .put(kv.b.o, (BiFunction<cyw, cyw, no>)($$0, $$1) -> e(np.a, $$0, cvg.a($$1)))
      .put(kv.b.p, (BiFunction<cyw, cyw, no>)($$0, $$1) -> f($$0, cvg.a($$1)))
      .put(kv.b.q, (BiFunction<cyw, cyw, no>)($$0, $$1) -> d(np.b, $$0, cvg.a($$1)))
      .build();

   public nr(la $$0, CompletableFuture<in.a> $$1) {
      this.d = $$0.a(la.b.a, "recipes");
      this.e = $$0.a(la.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(kw $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final kw $$0, final in.a $$1) {
      final Set<ajt> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new nq() {
         @Override
         public void a(ajt $$0x, cvj<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(ky.a($$0, $$1, cvj.h, $$1, nr.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(ky.a($$0, $$1, ae.a, $$2.b(), nr.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(no.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kw $$0, in.a $$1, af $$2) {
      return ky.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(nq var1);

   protected static void a(nq $$0, cmg $$1) {
      ku.a().filter(kv::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(nq $$0, cyw $$1, cyw $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(nq $$0, cyw $$1, cyw $$2, @Nullable String $$3, int $$4) {
      nt.a(np.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(nq $$0, List<cyw> $$1, np $$2, cyw $$3, float $$4, int $$5, String $$6) {
      a($$0, cvn.p, cvy::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(nq $$0, List<cyw> $$1, np $$2, cyw $$3, float $$4, int $$5, String $$6) {
      a($$0, cvn.q, cuv::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cus> void a(nq $$0, cvn<T> $$1, cus.a<T> $$2, List<cyw> $$3, np $$4, cyw $$5, float $$6, int $$7, String $$8, String $$9) {
      for (cyw $$10 : $$3) {
         nu.a(cvg.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(nq $$0, cre $$1, np $$2, cre $$3) {
      nw.a(cvg.a(crm.xo), cvg.a($$1), cvg.a(crm.oI), $$2, $$3).a("has_netherite_ingot", a(crm.oI)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(nq $$0, cre $$1, ajt $$2) {
      nx.a(cvg.a($$1), cvg.a(avk.aM), cvg.a(avk.aN), np.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(nq $$0, np $$1, cyw $$2, cyw $$3) {
      ns.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(nq $$0, np $$1, cyw $$2, cyw $$3, String $$4) {
      nt.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(nq $$0, np $$1, cyw $$2, cyw $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(nq $$0, cyw $$1, avr<cre> $$2, int $$3) {
      nt.a(np.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(nq $$0, cyw $$1, avr<cre> $$2, int $$3) {
      nt.a(np.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dca.G)).a($$0);
   }

   protected static void c(nq $$0, cyw $$1, cyw $$2) {
      nt.a(np.d, $$1).b(dca.cv).b($$2).b("chest_boat").b("has_boat", a(avk.am)).a($$0);
   }

   private static no c(cyw $$0, cvg $$1) {
      return nt.a(np.c, $$0).a($$1);
   }

   protected static no a(cyw $$0, cvg $$1) {
      return ns.a(np.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static no d(cyw $$0, cvg $$1) {
      int $$2 = $$0 == dca.fo ? 6 : 3;
      cre $$3 = $$0 == dca.fo ? crm.uv : crm.po;
      return ns.a(np.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static no e(cyw $$0, cvg $$1) {
      return ns.a(np.c, $$0).a('#', crm.po).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(nq $$0, cyw $$1, cyw $$2) {
      c(np.c, $$1, cvg.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static no c(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(nq $$0, np $$1, cyw $$2, cyw $$3) {
      a($$1, $$2, cvg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static no a(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static no b(cyw $$0, cvg $$1) {
      return ns.a(np.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static no f(cyw $$0, cvg $$1) {
      return ns.a(np.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static no g(cyw $$0, cvg $$1) {
      return ns.a(np.b, $$0, 3).c("sign").a('#', $$1).a('X', crm.po).b("###").b("###").b(" X ");
   }

   protected static void e(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', crm.fR).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(nq $$0, List<cre> $$1, List<cre> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cre $$5 = $$1.get($$4);
         cre $$6 = $$2.get($$4);
         nt.a(np.a, $$6)
            .b($$5)
            .a(cvg.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(crj::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1).a('#', $$2).a('X', avk.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1).a('#', $$2).a('|', crm.po).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.a, $$1, 8).a('#', dca.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cyw)dca.aQ)).a($$0);
   }

   protected static void j(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.b, $$1, 8)
         .a('#', dca.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cyw)dca.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dca.eY));
   }

   protected static void l(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.a, $$1, 8).a('#', dca.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cyw)dca.iA)).a($$0);
   }

   protected static void m(nq $$0, cyw $$1, cyw $$2) {
      nt.a(np.a, $$1, 8).b($$2).a(dca.I, 4).a(dca.L, 4).b("concrete_powder").b("has_sand", a((cyw)dca.I)).b("has_gravel", a((cyw)dca.L)).a($$0);
   }

   protected static void n(nq $$0, cyw $$1, cyw $$2) {
      nt.a(np.b, $$1).b(dca.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(nq $$0, np $$1, cyw $$2, cyw $$3) {
      d($$1, $$2, cvg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static no d(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(nq $$0, np $$1, cyw $$2, cyw $$3) {
      e($$1, $$2, cvg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static no e(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(nq $$0, np $$1, cyw $$2, cyw $$3) {
      f($$1, $$2, cvg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ns f(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(nq $$0, np $$1, cyw $$2, cyw $$3) {
      b($$1, $$2, cvg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(nq $$0, np $$1, cyw $$2, cyw $$3) {
      ns.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ns b(np $$0, cyw $$1, cvg $$2) {
      return ns.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(nq $$0, np $$1, cyw $$2, cyw $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(nq $$0, np $$1, cyw $$2, cyw $$3, int $$4) {
      nv.a(cvg.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(nq $$0, cyw $$1, cyw $$2) {
      nu.c(cvg.a($$2), np.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(nq $$0, np $$1, cyw $$2, np $$3, cyw $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(nq $$0, np $$1, cyw $$2, np $$3, cyw $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(nq $$0, np $$1, cyw $$2, np $$3, cyw $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(nq $$0, np $$1, cyw $$2, np $$3, cyw $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      nt.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new ajt($$7));
      ns.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new ajt($$5));
   }

   protected static void a(nq $$0, cyw $$1, avr<cre> $$2) {
      ns.a(np.i, $$1, 2).a('#', crm.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(nq $$0, cyw $$1, cyw $$2) {
      ns.a(np.i, $$1, 2).a('#', crm.ox).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cus> void a(nq $$0, String $$1, cvn<T> $$2, cus.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, crm.rZ, crm.sa, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.sb, crm.sc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.qY, crm.rc, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.dJ, crm.rW, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, crm.qZ, crm.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.uL, crm.uM, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.pW, crm.pX, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.ue, crm.uf, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, crm.uy, crm.uz, 0.35F);
   }

   private static <T extends cus> void a(nq $$0, String $$1, cvn<T> $$2, cus.a<T> $$3, int $$4, cyw $$5, cyw $$6, float $$7) {
      nu.a(cvg.a($$5), np.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(nq $$0, cmg $$1) {
      cqz.a.get().forEach(($$2, $$3) -> {
         if ($$3.m().a($$1)) {
            nt.a(np.a, $$3).b($$2).b(crm.ws).b(c($$3)).b(b($$2), a((cyw)$$2)).a($$0, a($$3, crm.ws));
         }
      });
   }

   protected static void a(nq $$0, dby $$1, dby $$2) {
      ns.a(np.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((cyw)$$2)).a($$0);
   }

   protected static void b(nq $$0, dby $$1, dby $$2) {
      ns.a(np.c, $$1, 4).a('C', $$2).a('R', crm.lG).a('B', crm.sf).b(" C ").b("CBC").b(" R ").b(b($$2), a((cyw)$$2)).a($$0);
   }

   protected static void a(nq $$0, kv $$1, cmg $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.m().a($$2)) {
            BiFunction<cyw, cyw, no> $$5 = g.get($$3);
            cyw $$6 = a($$1, $$3);
            if ($$5 != null) {
               no $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == kv.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == kv.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dby a(kv $$0, kv.b $$1) {
      if ($$1 == kv.b.b) {
         if (!$$0.b().containsKey(kv.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kv.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dby $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
   }

   private static an<ca.a> a(cm.d $$0, cyw $$1) {
      return a(cc.a.a().a($$1).a($$0));
   }

   protected static an<ca.a> a(cyw $$0) {
      return a(cc.a.a().a($$0));
   }

   protected static an<ca.a> a(avr<cre> $$0) {
      return a(cc.a.a().a($$0));
   }

   private static an<ca.a> a(cc.a... $$0) {
      return a(Arrays.stream($$0).map(cc.a::b).toArray(cc[]::new));
   }

   private static an<ca.a> a(cc... $$0) {
      return am.f.a(new ca.a(Optional.empty(), ca.a.a.b, List.of($$0)));
   }

   protected static String b(cyw $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cyw $$0) {
      return kr.h.b($$0.p()).a();
   }

   protected static String d(cyw $$0) {
      return c($$0);
   }

   protected static String a(cyw $$0, cyw $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cyw $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cyw $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
