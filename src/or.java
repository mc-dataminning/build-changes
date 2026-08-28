import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class or {
   protected final jp.a a;
   private final jo<cvk> c;
   protected final oq b;
   private static final Map<ly.b, or.a> d = ImmutableMap.builder()
      .put(ly.b.a, (or.a)($$0, $$1, $$2) -> $$0.e($$1, dad.a($$2)))
      .put(ly.b.b, (or.a)($$0, $$1, $$2) -> $$0.b(op.a, $$1, dad.a($$2)))
      .put(ly.b.d, (or.a)($$0, $$1, $$2) -> $$0.f(op.a, $$1, dad.a($$2)))
      .put(ly.b.e, (or.a)($$0, $$1, $$2) -> $$0.a($$1, dad.a($$2)))
      .put(ly.b.f, (or.a)($$0, $$1, $$2) -> $$0.f($$1, dad.a($$2)))
      .put(ly.b.g, (or.a)($$0, $$1, $$2) -> $$0.f($$1, dad.a($$2)))
      .put(ly.b.h, (or.a)($$0, $$1, $$2) -> $$0.g($$1, dad.a($$2)))
      .put(ly.b.i, (or.a)($$0, $$1, $$2) -> $$0.g($$1, dad.a($$2)))
      .put(ly.b.k, (or.a)($$0, $$1, $$2) -> $$0.h($$1, dad.a($$2)))
      .put(ly.b.l, (or.a)($$0, $$1, $$2) -> $$0.a(op.a, $$1, dad.a($$2)))
      .put(ly.b.m, (or.a)($$0, $$1, $$2) -> $$0.b($$1, dad.a($$2)))
      .put(ly.b.n, (or.a)($$0, $$1, $$2) -> $$0.c(op.c, $$1, dad.a($$2)))
      .put(ly.b.o, (or.a)($$0, $$1, $$2) -> $$0.e(op.a, $$1, dad.a($$2)))
      .put(ly.b.p, (or.a)($$0, $$1, $$2) -> $$0.c($$1, dad.a($$2)))
      .put(ly.b.q, (or.a)($$0, $$1, $$2) -> $$0.d(op.b, $$1, dad.a($$2)))
      .build();

   protected or(jp.a $$0, oq $$1) {
      this.a = $$0;
      this.c = $$0.b(lv.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cqn $$0) {
      lx.a().filter(ly::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(def $$0, def $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(def $$0, def $$1, @Nullable String $$2, int $$3) {
      this.b(op.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<def> $$0, op $$1, def $$2, float $$3, int $$4, String $$5) {
      this.a(dam.o, day::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<def> $$0, op $$1, def $$2, float $$3, int $$4, String $$5) {
      this.a(dam.p, czr::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends czo> void a(dam<T> $$0, czo.a<T> $$1, List<def> $$2, op $$3, def $$4, float $$5, int $$6, String $$7, String $$8) {
      for (def $$9 : $$2) {
         ou.a(dad.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cvk $$0, op $$1, cvk $$2) {
      ow.a(dad.a(cvt.xy), dad.a($$0), this.b(axc.bc), $$1, $$2).a("has_netherite_ingot", this.a(axc.bc)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cvk $$0, alc $$1) {
      ox.a(dad.a($$0), this.b(axc.bq), this.b(axc.br), op.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(op $$0, def $$1, def $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(op $$0, def $$1, def $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(op $$0, def $$1, def $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(def $$0, axj<cvk> $$1, int $$2) {
      this.b(op.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(def $$0, axj<cvk> $$1, int $$2) {
      this.b(op.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(def $$0, def $$1) {
      this.a(op.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(def $$0, def $$1) {
      this.a(op.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dhl.G)).a(this.b);
   }

   protected void c(def $$0, def $$1) {
      this.b(op.d, $$0).b(dhl.cv).b($$1).b("chest_boat").b("has_boat", this.a(axc.aN)).a(this.b);
   }

   private oo e(def $$0, dad $$1) {
      return this.b(op.c, $$0).a($$1);
   }

   protected oo a(def $$0, dad $$1) {
      return this.a(op.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private oo f(def $$0, dad $$1) {
      int $$2 = $$0 == dhl.fo ? 6 : 3;
      cvk $$3 = $$0 == dhl.fo ? cvt.uz : cvt.pr;
      return this.a(op.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private oo g(def $$0, dad $$1) {
      return this.a(op.c, $$0).a('#', cvt.pr).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(def $$0, def $$1) {
      this.c(op.c, $$0, dad.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private oo c(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(op $$0, def $$1, def $$2) {
      this.a($$0, $$1, dad.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected oo a(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected oo b(def $$0, dad $$1) {
      return this.a(op.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected oo c(def $$0, dad $$1) {
      return this.a(op.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private oo h(def $$0, dad $$1) {
      return this.a(op.b, $$0, 3).c("sign").a('#', $$1).a('X', cvt.pr).b("###").b("###").b(" X ");
   }

   protected void e(def $$0, def $$1) {
      this.a(op.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cvt.fS).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cvk> $$0, List<cvk> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, op.a);
   }

   protected void a(List<cvk> $$0, List<cvk> $$1, @Nullable cvk $$2, String $$3, op $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cvk $$6 = $$0.get($$5);
         cvk $$7 = $$1.get($$5);
         Stream<cvk> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dad.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(def $$0, def $$1) {
      this.a(op.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(def $$0, def $$1) {
      this.a(op.b, $$0).a('#', $$1).a('X', axc.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(def $$0, def $$1) {
      this.a(op.b, $$0).a('#', $$1).a('|', cvt.pr).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(def $$0, def $$1) {
      this.a(op.a, $$0, 8).a('#', dhl.aQ).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((def)dhl.aQ)).a(this.b);
   }

   protected void j(def $$0, def $$1) {
      this.a(op.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(def $$0, def $$1) {
      this.a(op.b, $$0, 8)
         .a('#', dhl.eY)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((def)dhl.eY))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dhl.eY));
   }

   protected void l(def $$0, def $$1) {
      this.a(op.a, $$0, 8).a('#', dhl.iA).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((def)dhl.iA)).a(this.b);
   }

   protected void m(def $$0, def $$1) {
      this.b(op.a, $$0, 8).b($$1).a(dhl.I, 4).a(dhl.L, 4).b("concrete_powder").b("has_sand", this.a((def)dhl.I)).b("has_gravel", this.a((def)dhl.L)).a(this.b);
   }

   protected void n(def $$0, def $$1) {
      this.b(op.b, $$0).b(dhl.pL).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(op $$0, def $$1, def $$2) {
      this.d($$0, $$1, dad.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oo d(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(op $$0, def $$1, def $$2) {
      this.e($$0, $$1, dad.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private oo e(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(op $$0, def $$1, def $$2) {
      this.f($$0, $$1, dad.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private os f(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(op $$0, def $$1, def $$2) {
      this.b($$0, $$1, dad.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(op $$0, def $$1, def $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected os b(op $$0, def $$1, dad $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(op $$0, def $$1, def $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(op $$0, def $$1, def $$2, int $$3) {
      ov.a(dad.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(def $$0, def $$1) {
      ou.c(dad.a($$1), op.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(op $$0, def $$1, op $$2, def $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(op $$0, def $$1, op $$2, def $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(op $$0, def $$1, op $$2, def $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(op $$0, def $$1, op $$2, def $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alc.a($$6));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alc.a($$4));
   }

   protected void o(def $$0, def $$1) {
      this.a(op.i, $$0, 2).a('#', cvt.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(def $$0, dad $$1) {
      this.a(op.i, $$0, 2).a('#', cvt.oA).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends czo> void a(String $$0, dam<T> $$1, czo.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cvt.sb, cvt.sc, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.sd, cvt.se, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.ra, cvt.re, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.dK, cvt.rY, 0.1F);
      this.a($$0, $$1, $$2, $$3, cvt.rb, cvt.rf, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.uP, cvt.uQ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.pY, cvt.pZ, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.ui, cvt.uj, 0.35F);
      this.a($$0, $$1, $$2, $$3, cvt.uC, cvt.uD, 0.35F);
   }

   private <T extends czo> void a(String $$0, dam<T> $$1, czo.a<T> $$2, int $$3, def $$4, def $$5, float $$6) {
      ou.a(dad.a($$4), op.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(cqn $$0) {
      cvf.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(op.a, $$2).b($$1).b(cvt.wC).b(c($$2)).b(b($$1), this.a((def)$$1)).a(this.b, p($$2, cvt.wC));
         }
      });
   }

   protected void a(dhj $$0, dhj $$1) {
      this.a(op.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((def)$$1)).a(this.b);
   }

   protected void b(dhj $$0, dhj $$1) {
      this.a(op.c, $$0, 4).a('C', $$1).a('R', cvt.lH).a('B', cvt.sh).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((def)$$1)).a(this.b);
   }

   protected void a(cvk $$0, dpm $$1) {
      cvp $$2 = new cvp(cvt.vY.n(), 1, ko.a().a(kr.M, $$1.b()).a());
      this.a(op.g, $$2).b(cvt.ou).b(cvt.dA).b(cvt.dB).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(ly $$0, cqn $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            or.a $$4 = d.get($$2);
            def $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               oo $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == ly.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == ly.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dhj a(ly $$0, ly.b $$1) {
      if ($$1 == ly.b.b) {
         if (!$$0.b().containsKey(ly.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(ly.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ao<br.a> a(dhj $$0) {
      return an.e.a(new br.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
   }

   private ao<cg.a> a(dh.d $$0, def $$1) {
      return a(cs.a.a().a(this.c, $$1).a($$0));
   }

   protected ao<cg.a> a(def $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   protected ao<cg.a> a(axj<cvk> $$0) {
      return a(cs.a.a().a(this.c, $$0));
   }

   private static ao<cg.a> a(cs.a... $$0) {
      return a(Arrays.stream($$0).map(cs.a::b).toArray(cs[]::new));
   }

   private static ao<cg.a> a(cs... $$0) {
      return an.f.a(new cg.a(Optional.empty(), cg.a.a.b, List.of($$0)));
   }

   protected static String b(def $$0) {
      return "has_" + c($$0);
   }

   protected static String c(def $$0) {
      return lu.g.b($$0.q()).a();
   }

   protected static String d(def $$0) {
      return c($$0);
   }

   protected static String p(def $$0, def $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(def $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(def $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dad b(axj<cvk> $$0) {
      return dad.a(this.c.b($$0));
   }

   protected os a(op $$0, def $$1) {
      return os.a(this.c, $$0, $$1);
   }

   protected os a(op $$0, def $$1, int $$2) {
      return os.a(this.c, $$0, $$1, $$2);
   }

   protected ot a(op $$0, cvp $$1) {
      return ot.a(this.c, $$0, $$1);
   }

   protected ot b(op $$0, def $$1) {
      return ot.a(this.c, $$0, $$1);
   }

   protected ot b(op $$0, def $$1, int $$2) {
      return ot.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      oo create(or var1, def var2, def var3);
   }

   protected abstract static class b implements mb {
      private final md d;
      private final CompletableFuture<jp.a> e;

      protected b(md $$0, CompletableFuture<jp.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(lz $$0) {
         return this.e.thenCompose($$1 -> {
            final md.a $$2 = this.d.a(lv.bh);
            final md.a $$3 = this.d.a(lv.bg);
            final Set<alc> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            oq $$6 = new oq() {
               @Override
               public void a(alc $$0x, dah<?> $$1x, @Nullable ag $$2x) {
                  if (!$$4.add($$0)) {
                     throw new IllegalStateException("Duplicate recipe " + $$0);
                  } else {
                     this.a($$0, $$1);
                     if ($$2 != null) {
                        this.a($$2);
                     }
                  }
               }

               @Override
               public af.a a() {
                  return af.a.b().a(oo.a);
               }

               @Override
               public void b() {
                  ag $$0 = af.a.b().a("impossible", an.b.a(new cf.a())).b(oo.a);
                  this.a($$0);
               }

               private void a(alc $$0x, dah<?> $$1x) {
                  $$5.add(mb.a($$0, $$1, dah.h, $$1, $$2.a($$0)));
               }

               private void a(ag $$0x) {
                  $$5.add(mb.a($$0, $$1, af.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract or a(jp.a var1, oq var2);
   }
}
