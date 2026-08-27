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

public abstract class og implements ll {
   final ln.a d;
   final ln.a e;
   private final CompletableFuture<iz.a> f;
   private static final Map<li.b, BiFunction<day, day, od>> g = ImmutableMap.builder()
      .put(li.b.a, (BiFunction<day, day, od>)($$0, $$1) -> c($$0, cxt.a($$1)))
      .put(li.b.b, (BiFunction<day, day, od>)($$0, $$1) -> b(oe.a, $$0, cxt.a($$1)))
      .put(li.b.d, (BiFunction<day, day, od>)($$0, $$1) -> f(oe.a, $$0, cxt.a($$1)))
      .put(li.b.e, (BiFunction<day, day, od>)($$0, $$1) -> a($$0, cxt.a($$1)))
      .put(li.b.f, (BiFunction<day, day, od>)($$0, $$1) -> d($$0, cxt.a($$1)))
      .put(li.b.g, (BiFunction<day, day, od>)($$0, $$1) -> d($$0, cxt.a($$1)))
      .put(li.b.h, (BiFunction<day, day, od>)($$0, $$1) -> e($$0, cxt.a($$1)))
      .put(li.b.i, (BiFunction<day, day, od>)($$0, $$1) -> e($$0, cxt.a($$1)))
      .put(li.b.k, (BiFunction<day, day, od>)($$0, $$1) -> g($$0, cxt.a($$1)))
      .put(li.b.l, (BiFunction<day, day, od>)($$0, $$1) -> a(oe.a, $$0, cxt.a($$1)))
      .put(li.b.m, (BiFunction<day, day, od>)($$0, $$1) -> b($$0, cxt.a($$1)))
      .put(li.b.n, (BiFunction<day, day, od>)($$0, $$1) -> c(oe.c, $$0, cxt.a($$1)))
      .put(li.b.o, (BiFunction<day, day, od>)($$0, $$1) -> e(oe.a, $$0, cxt.a($$1)))
      .put(li.b.p, (BiFunction<day, day, od>)($$0, $$1) -> f($$0, cxt.a($$1)))
      .put(li.b.q, (BiFunction<day, day, od>)($$0, $$1) -> d(oe.b, $$0, cxt.a($$1)))
      .build();

   public og(ln $$0, CompletableFuture<iz.a> $$1) {
      this.d = $$0.a(ln.b.a, "recipes");
      this.e = $$0.a(ln.b.a, "advancements");
      this.f = $$1;
   }

   @Override
   public final CompletableFuture<?> a(lj $$0) {
      return this.f.thenCompose($$1 -> this.a($$0, $$1));
   }

   protected CompletableFuture<?> a(final lj $$0, final iz.a $$1) {
      final Set<akn> $$2 = Sets.newHashSet();
      final List<CompletableFuture<?>> $$3 = new ArrayList<>();
      this.a(new of() {
         @Override
         public void a(akn $$0x, cxw<?> $$1x, @Nullable af $$2x) {
            if (!$$2.add($$0)) {
               throw new IllegalStateException("Duplicate recipe " + $$0);
            } else {
               $$3.add(ll.a($$0, $$1, cxw.h, $$1, og.this.d.a($$0)));
               if ($$2 != null) {
                  $$3.add(ll.a($$0, $$1, ae.a, $$2.b(), og.this.e.a($$2.a())));
               }
            }
         }

         @Override
         public ae.a a() {
            return ae.a.b().a(od.a);
         }
      });
      return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
   }

   protected CompletableFuture<?> a(lj $$0, iz.a $$1, af $$2) {
      return ll.a($$0, $$1, ae.a, $$2.b(), this.e.a($$2.a()));
   }

   protected abstract void a(of var1);

   protected static void a(of $$0, col $$1) {
      lh.a().filter(li::d).forEach($$2 -> a($$0, $$2, $$1));
   }

   protected static void a(of $$0, day $$1, day $$2, @Nullable String $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(of $$0, day $$1, day $$2, @Nullable String $$3, int $$4) {
      oi.a(oe.i, $$1, $$4).b($$2).b($$3).b(b($$2), a($$2)).a($$0, a($$1, $$2));
   }

   protected static void a(of $$0, List<day> $$1, oe $$2, day $$3, float $$4, int $$5, String $$6) {
      a($$0, cya.p, cyl::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_smelting");
   }

   protected static void b(of $$0, List<day> $$1, oe $$2, day $$3, float $$4, int $$5, String $$6) {
      a($$0, cya.q, cxi::new, $$1, $$2, $$3, $$4, $$5, $$6, "_from_blasting");
   }

   private static <T extends cxf> void a(of $$0, cya<T> $$1, cxf.a<T> $$2, List<day> $$3, oe $$4, day $$5, float $$6, int $$7, String $$8, String $$9) {
      for (day $$10 : $$3) {
         oj.a(cxt.a($$10), $$4, $$5, $$6, $$7, $$1, $$2).b($$8).b(b($$10), a($$10)).a($$0, c($$5) + $$9 + "_" + c($$10));
      }
   }

   protected static void a(of $$0, ctl $$1, oe $$2, ctl $$3) {
      ol.a(cxt.a(ctt.xs), cxt.a($$1), cxt.a(ctt.oJ), $$2, $$3).a("has_netherite_ingot", a(ctt.oJ)).a($$0, c($$3) + "_smithing");
   }

   protected static void a(of $$0, ctl $$1, akn $$2) {
      om.a(cxt.a($$1), cxt.a(awf.bm), cxt.a(awf.bn), oe.i).a("has_smithing_trim_template", a($$1)).a($$0, $$2);
   }

   protected static void a(of $$0, oe $$1, day $$2, day $$3) {
      oh.a($$1, $$2, 1).a('#', $$3).b("##").b("##").b(b($$3), a($$3)).a($$0);
   }

   protected static void a(of $$0, oe $$1, day $$2, day $$3, String $$4) {
      oi.a($$1, $$2).a($$3, 9).b($$4, a($$3)).a($$0);
   }

   protected static void b(of $$0, oe $$1, day $$2, day $$3) {
      a($$0, $$1, $$2, $$3, b($$3));
   }

   protected static void a(of $$0, day $$1, awm<ctl> $$2, int $$3) {
      oi.a(oe.a, $$1, $$3).a($$2).b("planks").b("has_log", a($$2)).a($$0);
   }

   protected static void b(of $$0, day $$1, awm<ctl> $$2, int $$3) {
      oi.a(oe.a, $$1, $$3).a($$2).b("planks").b("has_logs", a($$2)).a($$0);
   }

   protected static void a(of $$0, day $$1, day $$2) {
      oh.a(oe.a, $$1, 3).a('#', $$2).b("##").b("##").c("bark").b("has_log", a($$2)).a($$0);
   }

   protected static void b(of $$0, day $$1, day $$2) {
      oh.a(oe.d, $$1).a('#', $$2).b("# #").b("###").c("boat").b("in_water", a(dec.G)).a($$0);
   }

   protected static void c(of $$0, day $$1, day $$2) {
      oi.a(oe.d, $$1).b(dec.cv).b($$2).b("chest_boat").b("has_boat", a(awf.aN)).a($$0);
   }

   private static od c(day $$0, cxt $$1) {
      return oi.a(oe.c, $$0).a($$1);
   }

   protected static od a(day $$0, cxt $$1) {
      return oh.a(oe.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private static od d(day $$0, cxt $$1) {
      int $$2 = $$0 == dec.fo ? 6 : 3;
      ctl $$3 = $$0 == dec.fo ? ctt.ux : ctt.pp;
      return oh.a(oe.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private static od e(day $$0, cxt $$1) {
      return oh.a(oe.c, $$0).a('#', ctt.pp).a('W', $$1).b("#W#").b("#W#");
   }

   protected static void d(of $$0, day $$1, day $$2) {
      c(oe.c, $$1, cxt.a($$2)).a(b($$2), a($$2)).a($$0);
   }

   private static od c(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1).a('#', $$2).b("##");
   }

   protected static void c(of $$0, oe $$1, day $$2, day $$3) {
      a($$1, $$2, cxt.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   protected static od a(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected static od b(day $$0, cxt $$1) {
      return oh.a(oe.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   private static od f(day $$0, cxt $$1) {
      return oh.a(oe.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private static od g(day $$0, cxt $$1) {
      return oh.a(oe.b, $$0, 3).c("sign").a('#', $$1).a('X', ctt.pp).b("###").b("###").b(" X ");
   }

   protected static void e(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1, 6).c("hanging_sign").a('#', $$2).a('X', ctt.fS).b("X X").b("###").b("###").b("has_stripped_logs", a($$2)).a($$0);
   }

   protected static void a(of $$0, List<ctl> $$1, List<ctl> $$2, String $$3) {
      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         ctl $$5 = $$1.get($$4);
         ctl $$6 = $$2.get($$4);
         oi.a(oe.a, $$6)
            .b($$5)
            .a(cxt.a($$2.stream().filter($$1x -> !$$1x.equals($$6)).map(ctq::new)))
            .b($$3)
            .b("has_needed_dye", a($$5))
            .a($$0, "dye_" + c($$6));
      }
   }

   protected static void f(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1, 3).a('#', $$2).b("##").c("carpet").b(b($$2), a($$2)).a($$0);
   }

   protected static void g(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1).a('#', $$2).a('X', awf.b).b("###").b("XXX").c("bed").b(b($$2), a($$2)).a($$0);
   }

   protected static void h(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1).a('#', $$2).a('|', ctt.pp).b("###").b("###").b(" | ").c("banner").b(b($$2), a($$2)).a($$0);
   }

   protected static void i(of $$0, day $$1, day $$2) {
      oh.a(oe.a, $$1, 8).a('#', dec.aQ).a('X', $$2).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", a((day)dec.aQ)).a($$0);
   }

   protected static void j(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1, 16).a('#', $$2).b("###").b("###").c("stained_glass_pane").b("has_glass", a($$2)).a($$0);
   }

   protected static void k(of $$0, day $$1, day $$2) {
      oh.a(oe.b, $$1, 8)
         .a('#', dec.eY)
         .a('$', $$2)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", a((day)dec.eY))
         .b(b($$2), a($$2))
         .a($$0, a($$1, dec.eY));
   }

   protected static void l(of $$0, day $$1, day $$2) {
      oh.a(oe.a, $$1, 8).a('#', dec.iA).a('X', $$2).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", a((day)dec.iA)).a($$0);
   }

   protected static void m(of $$0, day $$1, day $$2) {
      oi.a(oe.a, $$1, 8).b($$2).a(dec.I, 4).a(dec.L, 4).b("concrete_powder").b("has_sand", a((day)dec.I)).b("has_gravel", a((day)dec.L)).a($$0);
   }

   protected static void n(of $$0, day $$1, day $$2) {
      oi.a(oe.b, $$1).b(dec.pL).b($$2).b("dyed_candle").b(b($$2), a($$2)).a($$0);
   }

   protected static void d(of $$0, oe $$1, day $$2, day $$3) {
      d($$1, $$2, cxt.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static od d(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected static void e(of $$0, oe $$1, day $$2, day $$3) {
      e($$1, $$2, cxt.a($$3)).a(b($$3), a($$3)).a($$0);
   }

   private static od e(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected static void f(of $$0, oe $$1, day $$2, day $$3) {
      f($$1, $$2, cxt.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   private static oh f(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected static void g(of $$0, oe $$1, day $$2, day $$3) {
      b($$1, $$2, cxt.a($$3)).b(b($$3), a($$3)).a($$0);
   }

   protected static void h(of $$0, oe $$1, day $$2, day $$3) {
      oh.a($$1, $$2).a('#', $$3).b("#").b("#").b(b($$3), a($$3)).a($$0);
   }

   protected static oh b(oe $$0, day $$1, cxt $$2) {
      return oh.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected static void i(of $$0, oe $$1, day $$2, day $$3) {
      a($$0, $$1, $$2, $$3, 1);
   }

   protected static void a(of $$0, oe $$1, day $$2, day $$3, int $$4) {
      ok.a(cxt.a($$3), $$1, $$2, $$4).b(b($$3), a($$3)).a($$0, a($$2, $$3) + "_stonecutting");
   }

   private static void p(of $$0, day $$1, day $$2) {
      oj.c(cxt.a($$2), oe.a, $$1, 0.1F, 200).b(b($$2), a($$2)).a($$0);
   }

   protected static void a(of $$0, oe $$1, day $$2, oe $$3, day $$4) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, d($$2), null);
   }

   protected static void a(of $$0, oe $$1, day $$2, oe $$3, day $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, d($$2), null);
   }

   protected static void b(of $$0, oe $$1, day $$2, oe $$3, day $$4, String $$5, String $$6) {
      a($$0, $$1, $$2, $$3, $$4, d($$4), null, $$5, $$6);
   }

   private static void a(of $$0, oe $$1, day $$2, oe $$3, day $$4, String $$5, @Nullable String $$6, String $$7, @Nullable String $$8) {
      oi.a($$1, $$2, 9).b($$4).b($$8).b(b($$4), a($$4)).a($$0, new akn($$7));
      oh.a($$3, $$4).a('#', $$2).b("###").b("###").b("###").c($$6).b(b($$2), a($$2)).a($$0, new akn($$5));
   }

   protected static void a(of $$0, day $$1, awm<ctl> $$2) {
      oh.a(oe.i, $$1, 2).a('#', ctt.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static void o(of $$0, day $$1, day $$2) {
      oh.a(oe.i, $$1, 2).a('#', ctt.oy).a('C', $$2).a('S', $$1).b("#S#").b("#C#").b("###").b(b($$1), a($$1)).a($$0);
   }

   protected static <T extends cxf> void a(of $$0, String $$1, cya<T> $$2, cxf.a<T> $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, ctt.sa, ctt.sb, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.sc, ctt.sd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.qZ, ctt.rd, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.dK, ctt.rX, 0.1F);
      a($$0, $$1, $$2, $$3, $$4, ctt.ra, ctt.re, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.uN, ctt.uO, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.pX, ctt.pY, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.ug, ctt.uh, 0.35F);
      a($$0, $$1, $$2, $$3, $$4, ctt.uA, ctt.uB, 0.35F);
   }

   private static <T extends cxf> void a(of $$0, String $$1, cya<T> $$2, cxf.a<T> $$3, int $$4, day $$5, day $$6, float $$7) {
      oj.a(cxt.a($$5), oe.g, $$6, $$7, $$4, $$2, $$3).b(b($$5), a($$5)).a($$0, c($$6) + "_from_" + $$1);
   }

   protected static void b(of $$0, col $$1) {
      ctg.a.get().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            oi.a(oe.a, $$3).b($$2).b(ctt.ww).b(c($$3)).b(b($$2), a((day)$$2)).a($$0, a($$3, ctt.ww));
         }
      });
   }

   protected static void a(of $$0, dea $$1, dea $$2) {
      oh.a(oe.a, $$1, 4).a('M', $$2).b(" M ").b("M M").b(" M ").b(b($$2), a((day)$$2)).a($$0);
   }

   protected static void b(of $$0, dea $$1, dea $$2) {
      oh.a(oe.c, $$1, 4).a('C', $$2).a('R', ctt.lH).a('B', ctt.sg).b(" C ").b("CBC").b(" R ").b(b($$2), a((day)$$2)).a($$0);
   }

   protected static void a(of $$0, li $$1, col $$2) {
      $$1.b().forEach(($$3, $$4) -> {
         if ($$4.i().a($$2)) {
            BiFunction<day, day, od> $$5 = g.get($$3);
            day $$6 = a($$1, $$3);
            if ($$5 != null) {
               od $$7 = $$5.apply($$4, $$6);
               $$1.e().ifPresent($$2xx -> $$7.a($$2xx + ($$3 == li.b.d ? "" : "_" + $$3.a())));
               $$7.a($$1.f().orElseGet(() -> b($$6)), a($$6));
               $$7.a($$0);
            }

            if ($$3 == li.b.c) {
               p($$0, $$4, $$6);
            }
         }
      });
   }

   private static dea a(li $$0, li.b $$1) {
      if ($$1 == li.b.b) {
         if (!$$0.b().containsKey(li.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(li.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static an<bn.a> a(dea $$0) {
      return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.q()), Optional.empty()));
   }

   private static an<cb.a> a(ct.d $$0, day $$1) {
      return a(ch.a.a().a($$1).a($$0));
   }

   protected static an<cb.a> a(day $$0) {
      return a(ch.a.a().a($$0));
   }

   protected static an<cb.a> a(awm<ctl> $$0) {
      return a(ch.a.a().a($$0));
   }

   private static an<cb.a> a(ch.a... $$0) {
      return a(Arrays.stream($$0).map(ch.a::b).toArray(ch[]::new));
   }

   private static an<cb.a> a(ch... $$0) {
      return am.f.a(new cb.a(Optional.empty(), cb.a.a.b, List.of($$0)));
   }

   protected static String b(day $$0) {
      return "has_" + c($$0);
   }

   protected static String c(day $$0) {
      return le.h.b($$0.r()).a();
   }

   protected static String d(day $$0) {
      return c($$0);
   }

   protected static String a(day $$0, day $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(day $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(day $$0) {
      return c($$0) + "_from_blasting";
   }

   @Override
   public final String a() {
      return "Recipes";
   }
}
