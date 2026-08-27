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

public abstract class lw implements jk {
   final jm.a d;
   final jm.a e;
   private static final Map<jh.b, BiFunction<cpu, cpu, lt>> f = ImmutableMap.builder()
      .put(jh.b.a, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> c($$0, cmg.a($$1)))
      .put(jh.b.b, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> b(lu.a, $$0, cmg.a($$1)))
      .put(jh.b.d, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> f(lu.a, $$0, cmg.a($$1)))
      .put(jh.b.e, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> a($$0, cmg.a($$1)))
      .put(jh.b.f, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> d($$0, cmg.a($$1)))
      .put(jh.b.g, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> d($$0, cmg.a($$1)))
      .put(jh.b.h, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> e($$0, cmg.a($$1)))
      .put(jh.b.i, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> e($$0, cmg.a($$1)))
      .put(jh.b.k, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> g($$0, cmg.a($$1)))
      .put(jh.b.l, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> a(lu.a, $$0, cmg.a($$1)))
      .put(jh.b.m, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> b($$0, cmg.a($$1)))
      .put(jh.b.n, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> c(lu.c, $$0, cmg.a($$1)))
      .put(jh.b.o, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> e(lu.a, $$0, cmg.a($$1)))
      .put(jh.b.p, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> f($$0, cmg.a($$1)))
      .put(jh.b.q, (BiFunction<cpu, cpu, lt>)($$0, $$1) -> d(lu.b, $$0, cmg.a($$1)))
      .build();

   public lw(jm $$0) {
      this.d = $$0.a(jm.b.a, "recipes");
      this.e = $$0.a(jm.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final ji $$0) {
      final Set<aex> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new lv() {
         @Override
         public void a(ls $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(jk.a($$0, $$0.a(), lw.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(jk.a($$0, $$2, lw.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(lt.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ji $$0, af $$1) {
      return jk.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(lv var1);

   protected static void a(lv $$0, cec $$1) {
      jg.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(lv $$0, cpu $$1, cpu $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lv $$0, cpu $$1, cpu $$2, @Nullable String $$3, int $$4) {
      ly.a(lu.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(lv $$0, List<cpu> $$1, lu $$2, cpu $$3, float $$4, int $$5, String $$6) {
      a($$0, cmm.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(lv $$0, List<cpu> $$1, lu $$2, cpu $$3, float $$4, int $$5, String $$6) {
      a($$0, cmm.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(lv $$0, cmm<? extends clr> $$1, List<cpu> $$2, lu $$3, cpu $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cpu $$9 : $$2) {
         lz.a(cmg.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(lv $$0, cja $$1, lu $$2, cja $$3) {
      mb.a(cmg.a(cji.ww), cmg.a($$1), cmg.a(cji.nV), $$2, $$3).a("has_netherite_ingot", a(cji.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(lv $$0, cja $$1, aex $$2) {
      mc.a(cmg.a($$1), cmg.a(aqb.aH), cmg.a(aqb.aI), lu.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      lx.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(lv $$0, lu $$1, cpu $$2, cpu $$3, String $$4) {
      ly.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(lv $$0, cpu $$1, aqi<cja> $$2, int $$3) {
      ly.a(lu.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lv $$0, cpu $$1, aqi<cja> $$2, int $$3) {
      ly.a(lu.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(csw.G)).a($$0);
   }

   protected static void c(lv $$0, cpu $$1, cpu $$2) {
      ly.a(lu.d, $$1).b(csw.cv).b($$2).b("chest_boat").b("has_boat", a(aqb.am)).a($$0);
   }

   private static lt c(cpu $$0, cmg $$1) {
      return ly.a(lu.c, $$0).a($$1);
   }

   protected static lt a(cpu $$0, cmg $$1) {
      return lx.a(lu.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lt d(cpu $$0, cmg $$1) {
      int $$2 = $$0 == csw.fo ? 6 : 3;
      cja $$3 = $$0 == csw.fo ? cji.tD : cji.oB;
      return lx.a(lu.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lt e(cpu $$0, cmg $$1) {
      return lx.a(lu.c, $$0).a('#', cji.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(lv $$0, cpu $$1, cpu $$2) {
      c(lu.c, $$1, cmg.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lt c(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      a($$1, $$2, cmg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lt a(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lt b(cpu $$0, cmg $$1) {
      return lx.a(lu.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lt f(cpu $$0, cmg $$1) {
      return lx.a(lu.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lt g(cpu $$0, cmg $$1) {
      return lx.a(lu.b, $$0, 3).c("sign").a('#', $$1).a('X', cji.oB).b("###").b("###").b(" X ");
   }

   protected static void e(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cji.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(lv $$0, List<cja> $$1, List<cja> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cja $$5 = $$1.get($$4);
         cja $$6 = $$2.get($$4);
         ly.a(lu.a, $$6)
            .b($$5)
            .a(cmg.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cjf::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1).a('#', $$2).a('X', aqb.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1).a('#', $$2).a('|', cji.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.a, $$1, 8).a('#', csw.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cpu)csw.aQ)).a($$0);
   }

   protected static void j(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.b, $$1, 8)
         .a('#', csw.eZ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cpu)csw.eZ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, csw.eZ));
   }

   protected static void l(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.a, $$1, 8).a('#', csw.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cpu)csw.iA)).a($$0);
   }

   protected static void m(lv $$0, cpu $$1, cpu $$2) {
      ly.a(lu.a, $$1, 8).b($$2).a(csw.I, 4).a(csw.L, 4).b("concrete_powder").b("has_sand", a((cpu)csw.I)).b("has_gravel", a((cpu)csw.L)).a($$0);
   }

   protected static void n(lv $$0, cpu $$1, cpu $$2) {
      ly.a(lu.b, $$1).b(csw.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      d($$1, $$2, cmg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lt d(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      e($$1, $$2, cmg.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lt e(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      f($$1, $$2, cmg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static lx f(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      b($$1, $$2, cmg.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      lx.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static lx b(lu $$0, cpu $$1, cmg $$2) {
      return lx.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(lv $$0, lu $$1, cpu $$2, cpu $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lv $$0, lu $$1, cpu $$2, cpu $$3, int $$4) {
      ma.a(cmg.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(lv $$0, cpu $$1, cpu $$2) {
      lz.c(cmg.a($$2), lu.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(lv $$0, lu $$1, cpu $$2, lu $$3, cpu $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(lv $$0, lu $$1, cpu $$2, lu $$3, cpu $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(lv $$0, lu $$1, cpu $$2, lu $$3, cpu $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(lv $$0, lu $$1, cpu $$2, lu $$3, cpu $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      ly.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aex($$7));
      lx.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aex($$5));
   }

   protected static void a(lv $$0, cpu $$1, aqi<cja> $$2) {
      lx.a(lu.i, $$1, 2).a('#', cji.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(lv $$0, cpu $$1, cpu $$2) {
      lx.a(lu.i, $$1, 2).a('#', cji.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(lv $$0, String $$1, cmm<? extends clr> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cji.rl, cji.rm, 0.35F);
      a($$0, $$1, $$2, $$3, cji.rn, cji.ro, 0.35F);
      a($$0, $$1, $$2, $$3, cji.ql, cji.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cji.do, cji.ri, 0.1F);
      a($$0, $$1, $$2, $$3, cji.qm, cji.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cji.tT, cji.tU, 0.35F);
      a($$0, $$1, $$2, $$3, cji.pj, cji.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cji.tm, cji.tn, 0.35F);
      a($$0, $$1, $$2, $$3, cji.tG, cji.tH, 0.35F);
   }

   private static void a(lv $$0, String $$1, cmm<? extends clr> $$2, int $$3, cpu $$4, cpu $$5, float $$6) {
      lz.a(cmg.a($$4), lu.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(lv $$0) {
      ciu.a.get().forEach(($$1, $$2) -> ly.a(lu.a, $$2).b($$1).b(cji.vA).b(c($$2)).b(b($$1), a((cpu)$$1)).a($$0, a($$2, cji.vA)));
   }

   protected static void a(lv $$0, jh $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cpu, cpu, lt> $$4 = f.get($$2);
         cpu $$5 = a($$1, $$2);
         if ($$4 != null) {
            lt $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == jh.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == jh.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static csv a(jh $$0, jh.b $$1) {
      if ($$1 == jh.b.b) {
         if (!$$0.b().containsKey(jh.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(jh.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static am<bm.a> a(csv $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, cpu $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(cpu $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(aqi<cja> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(cpu $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cpu $$0) {
      return jd.i.b($$0.k()).a();
   }

   protected static String d(cpu $$0) {
      return c($$0);
   }

   protected static String a(cpu $$0, cpu $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cpu $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cpu $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
