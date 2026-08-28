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

public abstract class on implements ma {
   final mc.a d;
   final mc.a e;
   private final CompletableFuture<jo.a> f;
   private static final Map<lx.b, BiFunction<dct, dct, ok>> g = ImmutableMap.builder()
      .put(lx.b.a, (BiFunction<dct, dct, ok>)($$0, $$1) -> d($$0, cyu.a($$1)))
      .put(lx.b.b, (BiFunction<dct, dct, ok>)($$0, $$1) -> b(ol.a, $$0, cyu.a($$1)))
      .put(lx.b.d, (BiFunction<dct, dct, ok>)($$0, $$1) -> f(ol.a, $$0, cyu.a($$1)))
      .put(lx.b.e, (BiFunction<dct, dct, ok>)($$0, $$1) -> a($$0, cyu.a($$1)))
      .put(lx.b.f, (BiFunction<dct, dct, ok>)($$0, $$1) -> e($$0, cyu.a($$1)))
      .put(lx.b.g, (BiFunction<dct, dct, ok>)($$0, $$1) -> e($$0, cyu.a($$1)))
      .put(lx.b.h, (BiFunction<dct, dct, ok>)($$0, $$1) -> f($$0, cyu.a($$1)))
      .put(lx.b.i, (BiFunction<dct, dct, ok>)($$0, $$1) -> f($$0, cyu.a($$1)))
      .put(lx.b.k, (BiFunction<dct, dct, ok>)($$0, $$1) -> g($$0, cyu.a($$1)))
      .put(lx.b.l, (BiFunction<dct, dct, ok>)($$0, $$1) -> a(ol.a, $$0, cyu.a($$1)))
      .put(lx.b.m, (BiFunction<dct, dct, ok>)($$0, $$1) -> b($$0, cyu.a($$1)))
      .put(lx.b.n, (BiFunction<dct, dct, ok>)($$0, $$1) -> c(ol.c, $$0, cyu.a($$1)))
      .put(lx.b.o, (BiFunction<dct, dct, ok>)($$0, $$1) -> e(ol.a, $$0, cyu.a($$1)))
      .put(lx.b.p, (BiFunction<dct, dct, ok>)($$0, $$1) -> c($$0, cyu.a($$1)))
      .put(lx.b.q, (BiFunction<dct, dct, ok>)($$0, $$1) -> d(ol.b, $$0, cyu.a($$1)))
      .build();

   public on(mc $$0, CompletableFuture<jo.a> $$1) {
      this.d = $$0.a(lu.bg);
      this.e = $$0.a(lu.bf);
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(ly $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final ly $$0, final jo.a $$1) {
      final Set<akq> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new om() {
         @Override
         public void a(akq $$0x, cyx<?> $$1x, @Nullable ag $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(ma.a($$0, $$1, cyx.h, $$1, on.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(ma.a($$0, $$1, af.a, $$2.b(), on.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public af.a a() {
            return af.a.b().a(ok.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(ly $$0, jo.a $$1, ag $$2) {
      return ma.a($$0, $$1, af.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(om var1);

   protected static void a(om $$0, cpj $$1) {
      lw.a().filter(lx::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(om $$0, dct $$1, dct $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(om $$0, dct $$1, dct $$2, @Nullable String $$3, int $$4) {
      op.a(ol.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(om $$0, List<dct> $$1, ol $$2, dct $$3, float $$4, int $$5, String $$6) {
      a($$0, czc.p, czo::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(om $$0, List<dct> $$1, ol $$2, dct $$3, float $$4, int $$5, String $$6) {
      a($$0, czc.q, cyi::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cyf> void a(om $$0, czc<T> $$1, cyf.a<T> $$2, List<dct> $$3, ol $$4, dct $$5, float $$6, int $$7, String $$8, String $$9) {
      for (dct $$10 : $$3) {
         oq.a(cyu.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(om $$0, cuj $$1, ol $$2, cuj $$3) {
      os.a(cyu.a(cur.xv), cyu.a($$1), cyu.a(cur.oK), $$2, $$3).a("has_netherite_ingot", a(cur.oK)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(om $$0, cuj $$1, akq $$2) {
      ot.a(cyu.a($$1), cyu.a(awm.bl), cyu.a(awm.bm), ol.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(om $$0, ol $$1, dct $$2, dct $$3) {
      oo.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(om $$0, ol $$1, dct $$2, dct $$3, String $$4) {
      op.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(om $$0, ol $$1, dct $$2, dct $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(om $$0, dct $$1, awt<cuj> $$2, int $$3) {
      op.a(ol.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(om $$0, dct $$1, awt<cuj> $$2, int $$3) {
      op.a(ol.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(om $$0, dct $$1, dct $$2) {
      oo.a(ol.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(om $$0, dct $$1, dct $$2) {
      oo.a(ol.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dfy.G)).a($$0);
   }

   protected static void c(om $$0, dct $$1, dct $$2) {
      op.a(ol.d, $$1).b(dfy.cv).b($$2).b("chest_boat").b("has_boat", a(awm.aN)).a($$0);
   }

   private static ok d(dct $$0, cyu $$1) {
      return op.a(ol.c, $$0).a($$1);
   }

   protected static ok a(dct $$0, cyu $$1) {
      return oo.a(ol.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static ok e(dct $$0, cyu $$1) {
      int $$2 = $$0 == dfy.fo ? 6 : 3;
      cuj $$3 = $$0 == dfy.fo ? cur.ux : cur.pq;
      return oo.a(ol.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static ok f(dct $$0, cyu $$1) {
      return oo.a(ol.c, $$0).a('#', cur.pq).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(om $$0, dct $$1, dct $$2) {
      c(ol.c, $$1, cyu.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static ok c(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(om $$0, ol $$1, dct $$2, dct $$3) {
      a($$1, $$2, cyu.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static ok a(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static ok b(dct $$0, cyu $$1) {
      return oo.a(ol.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected static ok c(dct $$0, cyu $$1) {
      return oo.a(ol.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static ok g(dct $$0, cyu $$1) {
      return oo.a(ol.b, $$0, 3).c("sign").a('#', $$1).a('X', cur.pq).b("###").b("###").b(" X ");
   }

   protected static void e(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', cur.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(om $$0, List<cuj> $$1, List<cuj> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cuj $$5 = $$1.get($$4);
         cuj $$6 = $$2.get($$4);
         op.a(ol.a, $$6)
            .b($$5)
            .a(cyu.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(cuo::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1).a('#', $$2).a('X', awm.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1).a('#', $$2).a('|', cur.pq).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(om $$0, dct $$1, dct $$2) {
      oo.a(ol.a, $$1, 8).a('#', dfy.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((dct)dfy.aQ)).a($$0);
   }

   protected static void j(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(om $$0, dct $$1, dct $$2) {
      oo.a(ol.b, $$1, 8)
         .a('#', dfy.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((dct)dfy.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dfy.eY));
   }

   protected static void l(om $$0, dct $$1, dct $$2) {
      oo.a(ol.a, $$1, 8).a('#', dfy.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((dct)dfy.iA)).a($$0);
   }

   protected static void m(om $$0, dct $$1, dct $$2) {
      op.a(ol.a, $$1, 8).b($$2).a(dfy.I, 4).a(dfy.L, 4).b("concrete_powder").b("has_sand", a((dct)dfy.I)).b("has_gravel", a((dct)dfy.L)).a($$0);
   }

   protected static void n(om $$0, dct $$1, dct $$2) {
      op.a(ol.b, $$1).b(dfy.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(om $$0, ol $$1, dct $$2, dct $$3) {
      d($$1, $$2, cyu.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ok d(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(om $$0, ol $$1, dct $$2, dct $$3) {
      e($$1, $$2, cyu.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static ok e(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(om $$0, ol $$1, dct $$2, dct $$3) {
      f($$1, $$2, cyu.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static oo f(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(om $$0, ol $$1, dct $$2, dct $$3) {
      b($$1, $$2, cyu.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(om $$0, ol $$1, dct $$2, dct $$3) {
      oo.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static oo b(ol $$0, dct $$1, cyu $$2) {
      return oo.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(om $$0, ol $$1, dct $$2, dct $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(om $$0, ol $$1, dct $$2, dct $$3, int $$4) {
      or.a(cyu.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(om $$0, dct $$1, dct $$2) {
      oq.c(cyu.a($$2), ol.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(om $$0, ol $$1, dct $$2, ol $$3, dct $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(om $$0, ol $$1, dct $$2, ol $$3, dct $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(om $$0, ol $$1, dct $$2, ol $$3, dct $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(om $$0, ol $$1, dct $$2, ol $$3, dct $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      op.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, akq.a($$7));
      oo.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, akq.a($$5));
   }

   protected static void a(om $$0, dct $$1, awt<cuj> $$2) {
      oo.a(ol.i, $$1, 2).a('#', cur.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(om $$0, dct $$1, dct $$2) {
      oo.a(ol.i, $$1, 2).a('#', cur.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void a(om $$0, dct $$1, cyu $$2) {
      oo.a(ol.i, $$1, 2).a('#', cur.oz).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cyf> void a(om $$0, String $$1, czc<T> $$2, cyf.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, cur.sa, cur.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.sc, cur.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.qZ, cur.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.dK, cur.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, cur.ra, cur.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.uN, cur.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.pX, cur.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.ug, cur.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, cur.uA, cur.uB, 0.35F);
   }

   private static <T extends cyf> void a(om $$0, String $$1, czc<T> $$2, cyf.a<T> $$3, int $$4, dct $$5, dct $$6, float $$7) {
      oq.a(cyu.a($$5), ol.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(om $$0, cpj $$1) {
      cue.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            op.a(ol.a, $$3).b($$2).b(cur.wz).b(c($$3)).b(b($$2), a((dct)$$2)).a($$0, a($$3, cur.wz));
         }
      });
   }

   protected static void a(om $$0, dfw $$1, dfw $$2) {
      oo.a(ol.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((dct)$$2)).a($$0);
   }

   protected static void b(om $$0, dfw $$1, dfw $$2) {
      oo.a(ol.c, $$1, 4).a('C', $$2).a('R', cur.lH).a('B', cur.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((dct)$$2)).a($$0);
   }

   protected static void a(om $$0, lx $$1, cpj $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<dct, dct, ok> $$5 = g.get($$3);
            dct $$6 = a($$1, $$3);
            if ($$5 != null) {
               ok $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == lx.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == lx.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dfw a(lx $$0, lx.b $$1) {
      if ($$1 == lx.b.b) {
         if (!$$0.b().containsKey(lx.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(lx.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dfw $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private static ao<cg.a> a(dh.d $$0, dct $$1) {
      return a(cs.a.a().a($$1).a($$0));
   }

   protected static ao<cg.a> a(dct $$0) {
      return a(cs.a.a().a($$0));
   }

   protected static ao<cg.a> a(awt<cuj> $$0) {
      return a(cs.a.a().a($$0));
   }

   private static ao<cg.a> a(cs.a... $$0) {
      return a(Arrays.stream($$0).map(cs.a::b).toArray(cs[]::new));
   }

   private static ao<cg.a> a(cs... $$0) {
      return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
   }

   protected static String b(dct $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dct $$0) {
      return lt.g.b($$0.r()).a();
   }

   protected static String d(dct $$0) {
      return c($$0);
   }

   protected static String a(dct $$0, dct $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dct $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dct $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
