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

public abstract class lu implements jk {
   final jm.a d;
   final jm.a e;
   private static final Map<jh.b, BiFunction<cpp, cpp, lr>> f = ImmutableMap.builder()
      .put(jh.b.a, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> c($$0, cmb.a($$1)))
      .put(jh.b.b, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> b(ls.a, $$0, cmb.a($$1)))
      .put(jh.b.d, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> f(ls.a, $$0, cmb.a($$1)))
      .put(jh.b.e, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> a($$0, cmb.a($$1)))
      .put(jh.b.f, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> d($$0, cmb.a($$1)))
      .put(jh.b.g, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> d($$0, cmb.a($$1)))
      .put(jh.b.h, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> e($$0, cmb.a($$1)))
      .put(jh.b.i, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> e($$0, cmb.a($$1)))
      .put(jh.b.k, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> g($$0, cmb.a($$1)))
      .put(jh.b.l, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> a(ls.a, $$0, cmb.a($$1)))
      .put(jh.b.m, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> b($$0, cmb.a($$1)))
      .put(jh.b.n, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> c(ls.c, $$0, cmb.a($$1)))
      .put(jh.b.o, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> e(ls.a, $$0, cmb.a($$1)))
      .put(jh.b.p, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> f($$0, cmb.a($$1)))
      .put(jh.b.q, (BiFunction<cpp, cpp, lr>)($$0, $$1) -> d(ls.b, $$0, cmb.a($$1)))
      .build();

   public lu(jm $$0) {
      this.d = $$0.a(jm.b.a, "recipes");
      this.e = $$0.a(jm.b.a, "advancements");
   }

   @Override
   public CompletableFuture<?> a(final ji $$0) {
      final Set<aeu> $$1 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$2 = new ArrayList<>();
      this.a(new lt() {
         @Override
         public void a(lq $$0x) {
            if (!$$1.add($$0.b())) {
               throw new IllegalStateException("Duplicate recipe " + $$0.b());
            } else {
               $$2.add(jk.a($$0, $$0.a(), lu.this.d.a($$0.b())));
               af $$1 = $$0.d();
               if ($$1 != null) {
                  JsonObject $$2 = $$1.b().a();
                  $$2.add(jk.a($$0, $$2, lu.this.e.a($$1.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(lr.a);
         }
      });
      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ji $$0, af $$1) {
      return jk.a($$0, $$1.b().a(), this.e.a($$1.a()));
   }

   protected abstract void a(lt var1);

   protected static void a(lt $$0, cdx $$1) {
      jg.a().filter($$1x -> $$1x.a($$1)).forEach($$1x -> a($$0, $$1x));
   }

   protected static void a(lt $$0, cpp $$1, cpp $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lt $$0, cpp $$1, cpp $$2, @Nullable String $$3, int $$4) {
      lw.a(ls.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(lt $$0, List<cpp> $$1, ls $$2, cpp $$3, float $$4, int $$5, String $$6) {
      a($$0, cmh.p, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(lt $$0, List<cpp> $$1, ls $$2, cpp $$3, float $$4, int $$5, String $$6) {
      a($$0, cmh.q, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static void a(lt $$0, cmh<? extends clm> $$1, List<cpp> $$2, ls $$3, cpp $$4, float $$5, int $$6, String $$7, String $$8) {
      for (cpp $$9 : $$2) {
         lx.a(cmb.a($$9), $$3, $$4, $$5, $$6, $$1).b($$7).b(b($$9), a($$9)).a($$0, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected static void a(lt $$0, civ $$1, ls $$2, civ $$3) {
      lz.a(cmb.a(cjd.ww), cmb.a($$1), cmb.a(cjd.nV), $$2, $$3).a("has_netherite_ingot", a(cjd.nV)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(lt $$0, civ $$1, aeu $$2) {
      ma.a(cmb.a($$1), cmb.a(apw.aH), cmb.a(apw.aI), ls.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      lv.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(lt $$0, ls $$1, cpp $$2, cpp $$3, String $$4) {
      lw.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(lt $$0, cpp $$1, aqd<civ> $$2, int $$3) {
      lw.a(ls.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lt $$0, cpp $$1, aqd<civ> $$2, int $$3) {
      lw.a(ls.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(csr.G)).a($$0);
   }

   protected static void c(lt $$0, cpp $$1, cpp $$2) {
      lw.a(ls.d, $$1).b(csr.cv).b($$2).b("chest_boat").b("has_boat", a(apw.am)).a($$0);
   }

   private static lr c(cpp $$0, cmb $$1) {
      return lw.a(ls.c, $$0).a($$1);
   }

   protected static lr a(cpp $$0, cmb $$1) {
      return lv.a(ls.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static lr d(cpp $$0, cmb $$1) {
      int $$2 = $$0 == csr.fo ? 6 : 3;
      civ $$3 = $$0 == csr.fo ? cjd.tD : cjd.oB;
      return lv.a(ls.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static lr e(cpp $$0, cmb $$1) {
      return lv.a(ls.c, $$0).a('#', cjd.oB).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(lt $$0, cpp $$1, cpp $$2) {
      c(ls.c, $$1, cmb.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static lr c(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      a($$1, $$2, cmb.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static lr a(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static lr b(cpp $$0, cmb $$1) {
      return lv.a(ls.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static lr f(cpp $$0, cmb $$1) {
      return lv.a(ls.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static lr g(cpp $$0, cmb $$1) {
      return lv.a(ls.b, $$0, 3).c("sign").a('#', $$1).a('X', cjd.oB).b("###").b("###").b(" X ");
   }

   protected static void e(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cjd.fw).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(lt $$0, List<civ> $$1, List<civ> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         civ $$5 = $$1.get($$4);
         civ $$6 = $$2.get($$4);
         lw.a(ls.a, $$6)
            .b($$5)
            .a(cmb.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cja::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1).a('#', $$2).a('X', apw.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1).a('#', $$2).a('|', cjd.oB).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.a, $$1, 8).a('#', csr.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((cpp)csr.aQ)).a($$0);
   }

   protected static void j(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.b, $$1, 8)
         .a('#', csr.eZ)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((cpp)csr.eZ))
         .b(b($$2), a($$2))
         .a($$0, a($$1, csr.eZ));
   }

   protected static void l(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.a, $$1, 8).a('#', csr.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((cpp)csr.iA)).a($$0);
   }

   protected static void m(lt $$0, cpp $$1, cpp $$2) {
      lw.a(ls.a, $$1, 8).b($$2).a(csr.I, 4).a(csr.L, 4).b("concrete_powder").b("has_sand", a((cpp)csr.I)).b("has_gravel", a((cpp)csr.L)).a($$0);
   }

   protected static void n(lt $$0, cpp $$1, cpp $$2) {
      lw.a(ls.b, $$1).b(csr.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      d($$1, $$2, cmb.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lr d(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      e($$1, $$2, cmb.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static lr e(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      f($$1, $$2, cmb.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static lv f(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      b($$1, $$2, cmb.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      lv.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static lv b(ls $$0, cpp $$1, cmb $$2) {
      return lv.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(lt $$0, ls $$1, cpp $$2, cpp $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(lt $$0, ls $$1, cpp $$2, cpp $$3, int $$4) {
      ly.a(cmb.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(lt $$0, cpp $$1, cpp $$2) {
      lx.c(cmb.a($$2), ls.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(lt $$0, ls $$1, cpp $$2, ls $$3, cpp $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(lt $$0, ls $$1, cpp $$2, ls $$3, cpp $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(lt $$0, ls $$1, cpp $$2, ls $$3, cpp $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(lt $$0, ls $$1, cpp $$2, ls $$3, cpp $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      lw.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new aeu($$7));
      lv.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new aeu($$5));
   }

   protected static void a(lt $$0, cpp $$1, aqd<civ> $$2) {
      lv.a(ls.i, $$1, 2).a('#', cjd.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(lt $$0, cpp $$1, cpp $$2) {
      lv.a(ls.i, $$1, 2).a('#', cjd.nK).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(lt $$0, String $$1, cmh<? extends clm> $$2, int $$3) {
      a($$0, $$1, $$2, $$3, cjd.rl, cjd.rm, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.rn, cjd.ro, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.ql, cjd.qp, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.do, cjd.ri, 0.1F);
      a($$0, $$1, $$2, $$3, cjd.qm, cjd.qq, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.tT, cjd.tU, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.pj, cjd.pk, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.tm, cjd.tn, 0.35F);
      a($$0, $$1, $$2, $$3, cjd.tG, cjd.tH, 0.35F);
   }

   private static void a(lt $$0, String $$1, cmh<? extends clm> $$2, int $$3, cpp $$4, cpp $$5, float $$6) {
      lx.a(cmb.a($$4), ls.g, $$5, $$6, $$3, $$2).b(b($$4), a($$4)).a($$0, c($$5) + "_from_" + $$1);
   }

   protected static void b(lt $$0) {
      cip.a.get().forEach(($$1, $$2) -> lw.a(ls.a, $$2).b($$1).b(cjd.vA).b(c($$2)).b(b($$1), a((cpp)$$1)).a($$0, a($$2, cjd.vA)));
   }

   protected static void a(lt $$0, jh $$1) {
      $$1.b().forEach(($$2, $$3) -> {
         BiFunction<cpp, cpp, lr> $$4 = f.get($$2);
         cpp $$5 = a($$1, $$2);
         if ($$4 != null) {
            lr $$6 = $$4.apply($$3, $$5);
            $$1.d().ifPresent($$2x -> $$6.a($$2x + ($$2 == jh.b.d ? "" : "_" + $$2.a())));
            $$6.a($$1.e().orElseGet(() -> b($$5)), a($$5));
            $$6.a($$0);
         }

         if ($$2 == jh.b.c) {
            p($$0, $$3, $$5);
         }
      });
   }

   private static csq a(jh $$0, jh.b $$1) {
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

   private static am<bm.a> a(csq $$0) {
      return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
   }

   private static am<bz.a> a(cl.d $$0, cpp $$1) {
      return a(cb.a.a().a($$1).a($$0));
   }

   protected static am<bz.a> a(cpp $$0) {
      return a(cb.a.a().a($$0));
   }

   protected static am<bz.a> a(aqd<civ> $$0) {
      return a(cb.a.a().a($$0));
   }

   private static am<bz.a> a(cb.a... $$0) {
      return a(Arrays.stream($$0).map(cb.a::b).toArray(cb[]::new));
   }

   private static am<bz.a> a(cb... $$0) {
      return al.e.a(new bz.a(Optional.empty(), cl.d.c, cl.d.c, cl.d.c, List.of($$0)));
   }

   protected static String b(cpp $$0) {
      return "has_" + c($$0);
   }

   protected static String c(cpp $$0) {
      return jd.i.b($$0.k()).a();
   }

   protected static String d(cpp $$0) {
      return c($$0);
   }

   protected static String a(cpp $$0, cpp $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(cpp $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(cpp $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
