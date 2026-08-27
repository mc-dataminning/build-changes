import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public abstract class mt implements kf {
   final kh.a d;
   final kh.a e;
   private static final Map<kc.b, BiFunction<crr, crr, mq>> f = ImmutableMap.builder()
      .put(kc.b.a, (BiFunction<crr, crr, mq>)($$0, $$1) -> c($$0, coc.a($$1)))
      .put(kc.b.b, (BiFunction<crr, crr, mq>)($$0, $$1) -> b(mr.a, $$0, coc.a($$1)))
      .put(kc.b.d, (BiFunction<crr, crr, mq>)($$0, $$1) -> f(mr.a, $$0, coc.a($$1)))
      .put(kc.b.e, (BiFunction<crr, crr, mq>)($$0, $$1) -> a($$0, coc.a($$1)))
      .put(kc.b.f, (BiFunction<crr, crr, mq>)($$0, $$1) -> d($$0, coc.a($$1)))
      .put(kc.b.g, (BiFunction<crr, crr, mq>)($$0, $$1) -> d($$0, coc.a($$1)))
      .put(kc.b.h, (BiFunction<crr, crr, mq>)($$0, $$1) -> e($$0, coc.a($$1)))
      .put(kc.b.i, (BiFunction<crr, crr, mq>)($$0, $$1) -> e($$0, coc.a($$1)))
      .put(kc.b.k, (BiFunction<crr, crr, mq>)($$0, $$1) -> g($$0, coc.a($$1)))
      .put(kc.b.l, (BiFunction<crr, crr, mq>)($$0, $$1) -> a(mr.a, $$0, coc.a($$1)))
      .put(kc.b.m, (BiFunction<crr, crr, mq>)($$0, $$1) -> b($$0, coc.a($$1)))
      .put(kc.b.n, (BiFunction<crr, crr, mq>)($$0, $$1) -> c(mr.c, $$0, coc.a($$1)))
      .put(kc.b.o, (BiFunction<crr, crr, mq>)($$0, $$1) -> e(mr.a, $$0, coc.a($$1)))
      .put(kc.b.p, (BiFunction<crr, crr, mq>)($$0, $$1) -> f($$0, coc.a($$1)))
      .put(kc.b.q, (BiFunction<crr, crr, mq>)($$0, $$1) -> d(mr.b, $$0, coc.a($$1)))
      .build();

   public mt(kh $$0) {
      this.d = $$0.a(kh.b.a, "recipes");
      this.e = $$0.a(kh.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final kd $$0) {
      final Set<agg> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new ms() {
         @Override
         public void a(mp $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(kf.a($$0, $$0.a(), mt.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(kf.a($$0, $$2, mt.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(mq.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kd $$0, af $$1) {
      return kf.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(ms var1);

   protected static void a(ms $$0, cfv $$1) {
      kb.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(ms $$0, crr $$1, crr $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ms $$0, crr $$1, crr $$2, @Nullable String $$3, int $$4) {
      mv.a(mr.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(ms $$0, List<crr> $$1, mr $$2, crr $$3, float $$4, int $$5, String $$6) {
      a($$0, coj.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(ms $$0, List<crr> $$1, mr $$2, crr $$3, float $$4, int $$5, String $$6) {
      a($$0, coj.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(ms $$0, coj<? extends cnn> $$1, List<crr> $$2, mr $$3, crr $$4, float $$5, int $$6, String $$7, String $$8) {
      for (crr $$9 : $$2) {
         mw.a(coc.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(ms $$0, ckw $$1, mr $$2, ckw $$3) {
      my.a(coc.a(cle.wx), coc.a($$1), coc.a(cle.nV), $$2, $$3).a("has_netherite_ingot", a(cle.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(ms $$0, ckw $$1, agg $$2) {
      mz.a(coc.a($$1), coc.a(ark.aH), coc.a(ark.aI), mr.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(ms $$0, mr $$1, crr $$2, crr $$3) {
      mu.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(ms $$0, mr $$1, crr $$2, crr $$3, String $$4) {
      mv.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(ms $$0, mr $$1, crr $$2, crr $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(ms $$0, crr $$1, arr<ckw> $$2, int $$3) {
      mv.a(mr.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ms $$0, crr $$1, arr<ckw> $$2, int $$3) {
      mv.a(mr.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cuv.G)).a($$0);
   }

   protected static void c(ms $$0, crr $$1, crr $$2) {
      mv.a(mr.d, $$1).b(cuv.cv).b($$2).b("chest_boat").b("has_boat", a(ark.am)).a($$0);
   }

   private static mq c(crr $$0, coc $$1) {
      return mv.a(mr.c, $$0).a($$1);
   }

   protected static mq a(crr $$0, coc $$1) {
      return mu.a(mr.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mq d(crr $$0, coc $$1) {
      int $$2 = $$0 == cuv.fo ? 6 : 3;
      ckw $$3 = $$0 == cuv.fo ? cle.tE : cle.oB;
      return mu.a(mr.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mq e(crr $$0, coc $$1) {
      return mu.a(mr.c, $$0).a('#', cle.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(ms $$0, crr $$1, crr $$2) {
      c(mr.c, $$1, coc.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mq c(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(ms $$0, mr $$1, crr $$2, crr $$3) {
      a($$1, $$2, coc.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mq a(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mq b(crr $$0, coc $$1) {
      return mu.a(mr.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mq f(crr $$0, coc $$1) {
      return mu.a(mr.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mq g(crr $$0, coc $$1) {
      return mu.a(mr.b, $$0, 3).c("sign").a('#', $$1).a('X', cle.oB).b("###").b("###").b(" X ");
   }

   protected static void e(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cle.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(ms $$0, List<ckw> $$1, List<ckw> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         ckw $$5 = $$1.get($$4);
         ckw $$6 = $$2.get($$4);
         mv.a(mr.a, $$6)
            .b($$5)
            .a(coc.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(clb::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1).a('#', $$2).a('X', ark.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1).a('#', $$2).a('|', cle.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.a, $$1, 8).a('#', cuv.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((crr)cuv.aQ)).a($$0);
   }

   protected static void j(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.b, $$1, 8)
         .a('#', cuv.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((crr)cuv.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cuv.eY));
   }

   protected static void l(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.a, $$1, 8).a('#', cuv.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((crr)cuv.iA)).a($$0);
   }

   protected static void m(ms $$0, crr $$1, crr $$2) {
      mv.a(mr.a, $$1, 8).b($$2).a(cuv.I, 4).a(cuv.L, 4).b("concrete_powder").b("has_sand", a((crr)cuv.I)).b("has_gravel", a((crr)cuv.L)).a($$0);
   }

   protected static void n(ms $$0, crr $$1, crr $$2) {
      mv.a(mr.b, $$1).b(cuv.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(ms $$0, mr $$1, crr $$2, crr $$3) {
      d($$1, $$2, coc.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mq d(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(ms $$0, mr $$1, crr $$2, crr $$3) {
      e($$1, $$2, coc.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mq e(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(ms $$0, mr $$1, crr $$2, crr $$3) {
      f($$1, $$2, coc.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static mu f(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(ms $$0, mr $$1, crr $$2, crr $$3) {
      b($$1, $$2, coc.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(ms $$0, mr $$1, crr $$2, crr $$3) {
      mu.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static mu b(mr $$0, crr $$1, coc $$2) {
      return mu.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(ms $$0, mr $$1, crr $$2, crr $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(ms $$0, mr $$1, crr $$2, crr $$3, int $$4) {
      mx.a(coc.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(ms $$0, crr $$1, crr $$2) {
      mw.c(coc.a($$2), mr.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(ms $$0, mr $$1, crr $$2, mr $$3, crr $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(ms $$0, mr $$1, crr $$2, mr $$3, crr $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(ms $$0, mr $$1, crr $$2, mr $$3, crr $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(ms $$0, mr $$1, crr $$2, mr $$3, crr $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      mv.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new agg($$7));
      mu.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new agg($$5));
   }

   protected static void a(ms $$0, crr $$1, arr<ckw> $$2) {
      mu.a(mr.i, $$1, 2).a('#', cle.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(ms $$0, crr $$1, crr $$2) {
      mu.a(mr.i, $$1, 2).a('#', cle.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(ms $$0, String $$1, coj<? extends cnn> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cle.rm, cle.rn, 0.35F);
      a($$0, $$1, $$2, $$3, cle.ro, cle.rp, 0.35F);
      a($$0, $$1, $$2, $$3, cle.ql, cle.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cle.do, cle.rj, 0.1F);
      a($$0, $$1, $$2, $$3, cle.qm, cle.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cle.tU, cle.tV, 0.35F);
      a($$0, $$1, $$2, $$3, cle.pj, cle.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cle.tn, cle.to, 0.35F);
      a($$0, $$1, $$2, $$3, cle.tH, cle.tI, 0.35F);
   }

   private static void a(ms $$0, String $$1, coj<? extends cnn> $$2, int $$3, crr $$4, crr $$5, float $$6) {
      mw.a(coc.a($$4), mr.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(ms $$0) {
      ckq.a.get().forEach(($$1, $$2) -> mv.a(mr.a, $$2).b($$1).b(cle.vB).b(c($$2)).b(b($$1), a((crr)$$1)).a($$0, a($$2, cle.vB)));
   }

   protected static void a(ms $$0, kc $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<crr, crr, mq> $$4 = f.get($$2);
         crr $$5 = a($$1, $$2);
         if ($$4 != null) {
            mq $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == kc.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == kc.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static cut a(kc $$0, kc.b $$1) {
      if ($$1 == kc.b.b) {
         if (!$$0.b().containsKey(kc.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(kc.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static am<bm.a> a(cut $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, crr $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(crr $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(arr<ckw> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(crr $$0) {
      return "has_" + c($$0);
   }

   protected static String c(crr $$0) {
      return jy.i.b($$0.k()).a();
   }

   protected static String d(crr $$0) {
      return c($$0);
   }

   protected static String a(crr $$0, crr $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(crr $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(crr $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
