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

public abstract class mr implements kf {
   final kh.a d;
   final kh.a e;
   private static final Map<kc.b, BiFunction<cqy, cqy, mo>> f = ImmutableMap.builder()
      .put(kc.b.a, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> c($$0, cnk.a($$1)))
      .put(kc.b.b, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> b(mp.a, $$0, cnk.a($$1)))
      .put(kc.b.d, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> f(mp.a, $$0, cnk.a($$1)))
      .put(kc.b.e, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> a($$0, cnk.a($$1)))
      .put(kc.b.f, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> d($$0, cnk.a($$1)))
      .put(kc.b.g, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> d($$0, cnk.a($$1)))
      .put(kc.b.h, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> e($$0, cnk.a($$1)))
      .put(kc.b.i, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> e($$0, cnk.a($$1)))
      .put(kc.b.k, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> g($$0, cnk.a($$1)))
      .put(kc.b.l, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> a(mp.a, $$0, cnk.a($$1)))
      .put(kc.b.m, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> b($$0, cnk.a($$1)))
      .put(kc.b.n, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> c(mp.c, $$0, cnk.a($$1)))
      .put(kc.b.o, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> e(mp.a, $$0, cnk.a($$1)))
      .put(kc.b.p, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> f($$0, cnk.a($$1)))
      .put(kc.b.q, (BiFunction<cqy, cqy, mo>)($$0, $$1) -> d(mp.b, $$0, cnk.a($$1)))
      .build();

   public mr(kh $$0) {
      this.d = $$0.a(kh.b.a, "recipes");
      this.e = $$0.a(kh.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final kd $$0) {
      final Set<afw> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new mq() {
         @Override
         public void a(mn $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(kf.a($$0, $$0.a(), mr.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(kf.a($$0, $$2, mr.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(mo.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(kd $$0, af $$1) {
      return kf.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(mq var1);

   protected static void a(mq $$0, cfg $$1) {
      kb.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(mq $$0, cqy $$1, cqy $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mq $$0, cqy $$1, cqy $$2, @Nullable String $$3, int $$4) {
      mt.a(mp.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(mq $$0, List<cqy> $$1, mp $$2, cqy $$3, float $$4, int $$5, String $$6) {
      a($$0, cnq.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(mq $$0, List<cqy> $$1, mp $$2, cqy $$3, float $$4, int $$5, String $$6) {
      a($$0, cnq.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(mq $$0, cnq<? extends cmv> $$1, List<cqy> $$2, mp $$3, cqy $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cqy $$9 : $$2) {
         mu.a(cnk.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(mq $$0, cke $$1, mp $$2, cke $$3) {
      mw.a(cnk.a(ckm.ww), cnk.a($$1), cnk.a(ckm.nV), $$2, $$3).a("has_netherite_ingot", a(ckm.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(mq $$0, cke $$1, afw $$2) {
      mx.a(cnk.a($$1), cnk.a(ara.aH), cnk.a(ara.aI), mp.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      ms.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(mq $$0, mp $$1, cqy $$2, cqy $$3, String $$4) {
      mt.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(mq $$0, cqy $$1, arh<cke> $$2, int $$3) {
      mt.a(mp.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mq $$0, cqy $$1, arh<cke> $$2, int $$3) {
      mt.a(mp.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(cuc.G)).a($$0);
   }

   protected static void c(mq $$0, cqy $$1, cqy $$2) {
      mt.a(mp.d, $$1).b(cuc.cv).b($$2).b("chest_boat").b("has_boat", a(ara.am)).a($$0);
   }

   private static mo c(cqy $$0, cnk $$1) {
      return mt.a(mp.c, $$0).a($$1);
   }

   protected static mo a(cqy $$0, cnk $$1) {
      return ms.a(mp.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static mo d(cqy $$0, cnk $$1) {
      int $$2 = $$0 == cuc.fo ? 6 : 3;
      cke $$3 = $$0 == cuc.fo ? ckm.tD : ckm.oB;
      return ms.a(mp.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static mo e(cqy $$0, cnk $$1) {
      return ms.a(mp.c, $$0).a('#', ckm.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(mq $$0, cqy $$1, cqy $$2) {
      c(mp.c, $$1, cnk.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static mo c(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      a($$1, $$2, cnk.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static mo a(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static mo b(cqy $$0, cnk $$1) {
      return ms.a(mp.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static mo f(cqy $$0, cnk $$1) {
      return ms.a(mp.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static mo g(cqy $$0, cnk $$1) {
      return ms.a(mp.b, $$0, 3).c("sign").a('#', $$1).a('X', ckm.oB).b("###").b("###").b(" X ");
   }

   protected static void e(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', ckm.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(mq $$0, List<cke> $$1, List<cke> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cke $$5 = $$1.get($$4);
         cke $$6 = $$2.get($$4);
         mt.a(mp.a, $$6)
            .b($$5)
            .a(cnk.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(ckj::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1).a('#', $$2).a('X', ara.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1).a('#', $$2).a('|', ckm.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.a, $$1, 8).a('#', cuc.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cqy)cuc.aQ)).a($$0);
   }

   protected static void j(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.b, $$1, 8)
         .a('#', cuc.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cqy)cuc.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, cuc.eY));
   }

   protected static void l(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.a, $$1, 8).a('#', cuc.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cqy)cuc.iA)).a($$0);
   }

   protected static void m(mq $$0, cqy $$1, cqy $$2) {
      mt.a(mp.a, $$1, 8).b($$2).a(cuc.I, 4).a(cuc.L, 4).b("concrete_powder").b("has_sand", a((cqy)cuc.I)).b("has_gravel", a((cqy)cuc.L)).a($$0);
   }

   protected static void n(mq $$0, cqy $$1, cqy $$2) {
      mt.a(mp.b, $$1).b(cuc.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      d($$1, $$2, cnk.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mo d(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      e($$1, $$2, cnk.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static mo e(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      f($$1, $$2, cnk.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static ms f(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      b($$1, $$2, cnk.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      ms.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static ms b(mp $$0, cqy $$1, cnk $$2) {
      return ms.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(mq $$0, mp $$1, cqy $$2, cqy $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(mq $$0, mp $$1, cqy $$2, cqy $$3, int $$4) {
      mv.a(cnk.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(mq $$0, cqy $$1, cqy $$2) {
      mu.c(cnk.a($$2), mp.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(mq $$0, mp $$1, cqy $$2, mp $$3, cqy $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(mq $$0, mp $$1, cqy $$2, mp $$3, cqy $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(mq $$0, mp $$1, cqy $$2, mp $$3, cqy $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(mq $$0, mp $$1, cqy $$2, mp $$3, cqy $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      mt.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new afw($$7));
      ms.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new afw($$5));
   }

   protected static void a(mq $$0, cqy $$1, arh<cke> $$2) {
      ms.a(mp.i, $$1, 2).a('#', ckm.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(mq $$0, cqy $$1, cqy $$2) {
      ms.a(mp.i, $$1, 2).a('#', ckm.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(mq $$0, String $$1, cnq<? extends cmv> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, ckm.rl, ckm.rm, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.rn, ckm.ro, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.ql, ckm.qp, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.do, ckm.ri, 0.1F);
      a($$0, $$1, $$2, $$3, ckm.qm, ckm.qq, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.tT, ckm.tU, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.pj, ckm.pk, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.tm, ckm.tn, 0.35F);
      a($$0, $$1, $$2, $$3, ckm.tG, ckm.tH, 0.35F);
   }

   private static void a(mq $$0, String $$1, cnq<? extends cmv> $$2, int $$3, cqy $$4, cqy $$5, float $$6) {
      mu.a(cnk.a($$4), mp.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(mq $$0) {
      cjy.a.get().forEach(($$1, $$2) -> mt.a(mp.a, $$2).b($$1).b(ckm.vA).b(c($$2)).b(b($$1), a((cqy)$$1)).a($$0, a($$2, ckm.vA)));
   }

   protected static void a(mq $$0, kc $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cqy, cqy, mo> $$4 = f.get($$2);
         cqy $$5 = a($$1, $$2);
         if ($$4 != null) {
            mo $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == kc.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == kc.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static cua a(kc $$0, kc.b $$1) {
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

   private static am<bm.a> a(cua $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, cqy $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(cqy $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(arh<cke> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(cqy $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cqy $$0) {
      return jy.i.b($$0.k()).a();
   }

   protected static String d(cqy $$0) {
      return c($$0);
   }

   protected static String a(cqy $$0, cqy $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cqy $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cqy $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
