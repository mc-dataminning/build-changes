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

public abstract class or implements lw {
   final ly.a d;
   final ly.a e;
   private final CompletableFuture<jk.a> f;
   private static final Map<lt.b, BiFunction<dbs, dbs, oo>> g = ImmutableMap.builder()
      .put(lt.b.a, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> c($$0, cyn.a($$1)))
      .put(lt.b.b, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> b(op.a, $$0, cyn.a($$1)))
      .put(lt.b.d, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> f(op.a, $$0, cyn.a($$1)))
      .put(lt.b.e, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> a($$0, cyn.a($$1)))
      .put(lt.b.f, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> d($$0, cyn.a($$1)))
      .put(lt.b.g, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> d($$0, cyn.a($$1)))
      .put(lt.b.h, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> e($$0, cyn.a($$1)))
      .put(lt.b.i, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> e($$0, cyn.a($$1)))
      .put(lt.b.k, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> g($$0, cyn.a($$1)))
      .put(lt.b.l, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> a(op.a, $$0, cyn.a($$1)))
      .put(lt.b.m, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> b($$0, cyn.a($$1)))
      .put(lt.b.n, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> c(op.c, $$0, cyn.a($$1)))
      .put(lt.b.o, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> e(op.a, $$0, cyn.a($$1)))
      .put(lt.b.p, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> f($$0, cyn.a($$1)))
      .put(lt.b.q, (BiFunction<dbs, dbs, oo>)($$0, $$1) -> d(op.b, $$0, cyn.a($$1)))
      .build();

   public or(ly $$0, CompletableFuture<jk.a> $$1) {
      this.d = $$0.a(ly.b.a, "recipes");
      this.e = $$0.a(ly.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(lu $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final lu $$0, final jk.a $$1) {
      final Set<alb> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new oq() {
         @Override
         public void a(alb $$0x, cyq<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(lw.a($$0, $$1, cyq.h, $$1, or.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(lw.a($$0, $$1, ae.a, $$2.b(), or.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(oo.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(lu $$0, jk.a $$1, af $$2) {
      return lw.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(oq var1);

   protected static void a(oq $$0, cpg $$1) {
      ls.a().filter(lt::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(oq $$0, dbs $$1, dbs $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oq $$0, dbs $$1, dbs $$2, @Nullable String $$3, int $$4) {
      ot.a(op.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(oq $$0, List<dbs> $$1, op $$2, dbs $$3, float $$4, int $$5, String $$6) {
      a($$0, cyu.p, czf::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(oq $$0, List<dbs> $$1, op $$2, dbs $$3, float $$4, int $$5, String $$6) {
      a($$0, cyu.q, cyc::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cxz> void a(oq $$0, cyu<T> $$1, cxz.a<T> $$2, List<dbs> $$3, op $$4, dbs $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dbs $$10 : $$3) {
         ou.a(cyn.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(oq $$0, cuf $$1, op $$2, cuf $$3) {
      ow.a(cyn.a(cun.xs), cyn.a($$1), cyn.a(cun.oJ), $$2, $$3).a("has_netherite_ingot", a(cun.oJ)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(oq $$0, cuf $$1, alb $$2) {
      ox.a(cyn.a($$1), cyn.a(awu.bm), cyn.a(awu.bn), op.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(oq $$0, op $$1, dbs $$2, dbs $$3) {
      os.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(oq $$0, op $$1, dbs $$2, dbs $$3, String $$4) {
      ot.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(oq $$0, op $$1, dbs $$2, dbs $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(oq $$0, dbs $$1, axb<cuf> $$2, int $$3) {
      ot.a(op.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oq $$0, dbs $$1, axb<cuf> $$2, int $$3) {
      ot.a(op.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dew.G)).a($$0);
   }

   protected static void c(oq $$0, dbs $$1, dbs $$2) {
      ot.a(op.d, $$1).b(dew.cv).b($$2).b("chest_boat").b("has_boat", a(awu.aN)).a($$0);
   }

   private static oo c(dbs $$0, cyn $$1) {
      return ot.a(op.c, $$0).a($$1);
   }

   protected static oo a(dbs $$0, cyn $$1) {
      return os.a(op.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static oo d(dbs $$0, cyn $$1) {
      int $$2 = $$0 == dew.fo ? 6 : 3;
      cuf $$3 = $$0 == dew.fo ? cun.ux : cun.pp;
      return os.a(op.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static oo e(dbs $$0, cyn $$1) {
      return os.a(op.c, $$0).a('#', cun.pp).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(oq $$0, dbs $$1, dbs $$2) {
      c(op.c, $$1, cyn.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static oo c(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(oq $$0, op $$1, dbs $$2, dbs $$3) {
      a($$1, $$2, cyn.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static oo a(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static oo b(dbs $$0, cyn $$1) {
      return os.a(op.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static oo f(dbs $$0, cyn $$1) {
      return os.a(op.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static oo g(dbs $$0, cyn $$1) {
      return os.a(op.b, $$0, 3).c("sign").a('#', $$1).a('X', cun.pp).b("###").b("###").b(" X ");
   }

   protected static void e(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cun.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(oq $$0, List<cuf> $$1, List<cuf> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cuf $$5 = $$1.get($$4);
         cuf $$6 = $$2.get($$4);
         ot.a(op.a, $$6)
            .b($$5)
            .a(cyn.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cuk::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1).a('#', $$2).a('X', awu.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1).a('#', $$2).a('|', cun.pp).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.a, $$1, 8).a('#', dew.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dbs)dew.aQ)).a($$0);
   }

   protected static void j(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.b, $$1, 8)
         .a('#', dew.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dbs)dew.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dew.eY));
   }

   protected static void l(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.a, $$1, 8).a('#', dew.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dbs)dew.iA)).a($$0);
   }

   protected static void m(oq $$0, dbs $$1, dbs $$2) {
      ot.a(op.a, $$1, 8).b($$2).a(dew.I, 4).a(dew.L, 4).b("concrete_powder").b("has_sand", a((dbs)dew.I)).b("has_gravel", a((dbs)dew.L)).a($$0);
   }

   protected static void n(oq $$0, dbs $$1, dbs $$2) {
      ot.a(op.b, $$1).b(dew.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(oq $$0, op $$1, dbs $$2, dbs $$3) {
      d($$1, $$2, cyn.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oo d(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(oq $$0, op $$1, dbs $$2, dbs $$3) {
      e($$1, $$2, cyn.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static oo e(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(oq $$0, op $$1, dbs $$2, dbs $$3) {
      f($$1, $$2, cyn.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static os f(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(oq $$0, op $$1, dbs $$2, dbs $$3) {
      b($$1, $$2, cyn.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(oq $$0, op $$1, dbs $$2, dbs $$3) {
      os.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static os b(op $$0, dbs $$1, cyn $$2) {
      return os.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(oq $$0, op $$1, dbs $$2, dbs $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(oq $$0, op $$1, dbs $$2, dbs $$3, int $$4) {
      ov.a(cyn.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(oq $$0, dbs $$1, dbs $$2) {
      ou.c(cyn.a($$2), op.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(oq $$0, op $$1, dbs $$2, op $$3, dbs $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(oq $$0, op $$1, dbs $$2, op $$3, dbs $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(oq $$0, op $$1, dbs $$2, op $$3, dbs $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(oq $$0, op $$1, dbs $$2, op $$3, dbs $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      ot.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new alb($$7));
      os.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new alb($$5));
   }

   protected static void a(oq $$0, dbs $$1, axb<cuf> $$2) {
      os.a(op.i, $$1, 2).a('#', cun.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(oq $$0, dbs $$1, dbs $$2) {
      os.a(op.i, $$1, 2).a('#', cun.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cxz> void a(oq $$0, String $$1, cyu<T> $$2, cxz.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cun.sa, cun.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.sc, cun.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.qZ, cun.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.dK, cun.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cun.ra, cun.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.uN, cun.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.pX, cun.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.ug, cun.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cun.uA, cun.uB, 0.35F);
   }

   private static <T extends cxz> void a(oq $$0, String $$1, cyu<T> $$2, cxz.a<T> $$3, int $$4, dbs $$5, dbs $$6, float $$7) {
      ou.a(cyn.a($$5), op.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(oq $$0, cpg $$1) {
      cua.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            ot.a(op.a, $$3).b($$2).b(cun.ww).b(c($$3)).b(b($$2), a((dbs)$$2)).a($$0, a($$3, cun.ww));
         }
      });
   }

   protected static void a(oq $$0, deu $$1, deu $$2) {
      os.a(op.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dbs)$$2)).a($$0);
   }

   protected static void b(oq $$0, deu $$1, deu $$2) {
      os.a(op.c, $$1, 4).a('C', $$2).a('R', cun.lH).a('B', cun.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dbs)$$2)).a($$0);
   }

   protected static void a(oq $$0, lt $$1, cpg $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<dbs, dbs, oo> $$5 = g.get($$3);
            dbs $$6 = a($$1, $$3);
            if ($$5 != null) {
               oo $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lt.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lt.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static deu a(lt $$0, lt.b $$1) {
      if ($$1 == lt.b.b) {
         if (!$$0.b().containsKey(lt.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lt.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bq.a> a(deu $$0) {
      return am.e.a(new bq.a(Optional.empty(), Optional.of($$0.q()), Optional.empty()));
   }

   private static an<ce.a> a(de.d $$0, dbs $$1) {
      return a(cp.a.a().a($$1).a($$0));
   }

   protected static an<ce.a> a(dbs $$0) {
      return a(cp.a.a().a($$0));
   }

   protected static an<ce.a> a(axb<cuf> $$0) {
      return a(cp.a.a().a($$0));
   }

   private static an<ce.a> a(cp.a... $$0) {
      return a(Arrays.stream($$0).map(cp.a::b).toArray(cp[]::new));
   }

   private static an<ce.a> a(cp... $$0) {
      return am.f.a(new ce.a(Optional.empty(), ce.a.a.b, List.of($$0)));
   }

   protected static String b(dbs $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dbs $$0) {
      return lp.h.b($$0.r()).a();
   }

   protected static String d(dbs $$0) {
      return c($$0);
   }

   protected static String a(dbs $$0, dbs $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dbs $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dbs $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
