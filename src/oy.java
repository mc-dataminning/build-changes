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

public abstract class oy {
   protected final js.a a;
   private final jr<cxc> c;
   protected final ox b;
   private static final Map<me.b, oy.a> d = ImmutableMap.builder()
      .put(me.b.a, (oy.a)($$0, $$1, $$2) -> $$0.e($$1, dbr.a($$2)))
      .put(me.b.b, (oy.a)($$0, $$1, $$2) -> $$0.b(ow.a, $$1, dbr.a($$2)))
      .put(me.b.d, (oy.a)($$0, $$1, $$2) -> $$0.f(ow.a, $$1, dbr.a($$2)))
      .put(me.b.e, (oy.a)($$0, $$1, $$2) -> $$0.a($$1, dbr.a($$2)))
      .put(me.b.f, (oy.a)($$0, $$1, $$2) -> $$0.f($$1, dbr.a($$2)))
      .put(me.b.g, (oy.a)($$0, $$1, $$2) -> $$0.f($$1, dbr.a($$2)))
      .put(me.b.h, (oy.a)($$0, $$1, $$2) -> $$0.g($$1, dbr.a($$2)))
      .put(me.b.i, (oy.a)($$0, $$1, $$2) -> $$0.g($$1, dbr.a($$2)))
      .put(me.b.k, (oy.a)($$0, $$1, $$2) -> $$0.h($$1, dbr.a($$2)))
      .put(me.b.l, (oy.a)($$0, $$1, $$2) -> $$0.a(ow.a, $$1, dbr.a($$2)))
      .put(me.b.m, (oy.a)($$0, $$1, $$2) -> $$0.b($$1, dbr.a($$2)))
      .put(me.b.n, (oy.a)($$0, $$1, $$2) -> $$0.c(ow.c, $$1, dbr.a($$2)))
      .put(me.b.o, (oy.a)($$0, $$1, $$2) -> $$0.e(ow.a, $$1, dbr.a($$2)))
      .put(me.b.p, (oy.a)($$0, $$1, $$2) -> $$0.c($$1, dbr.a($$2)))
      .put(me.b.q, (oy.a)($$0, $$1, $$2) -> $$0.d(ow.b, $$1, dbr.a($$2)))
      .build();

   protected oy(js.a $$0, ox $$1) {
      this.a = $$0;
      this.c = $$0.d(mb.K);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(csk $$0) {
      md.a().filter(me::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dgy $$0, dgy $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dgy $$0, dgy $$1, @Nullable String $$2, int $$3) {
      this.b(ow.i, $$0, $$3).b($$1).b($$2).b(b($$1), this.a($$1)).a(this.b, p($$0, $$1));
   }

   protected void a(List<dgy> $$0, ow $$1, dgy $$2, float $$3, int $$4, String $$5) {
      this.a(dcf.o, dcp::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dgy> $$0, ow $$1, dgy $$2, float $$3, int $$4, String $$5) {
      this.a(dcf.p, dbe::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dbb> void a(dcf<T> $$0, dbb.a<T> $$1, List<dgy> $$2, ow $$3, dgy $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dgy $$9 : $$2) {
         pb.a(dbr.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(b($$9), this.a($$9)).a(this.b, c($$4) + $$8 + "_" + c($$9));
      }
   }

   protected void a(cxc $$0, ow $$1, cxc $$2) {
      pd.a(dbr.a(cxk.yw), dbr.a($$0), this.b(axt.bi), $$1, $$2).a("has_netherite_ingot", this.a(axt.bi)).a(this.b, c($$2) + "_smithing");
   }

   protected void a(cxc $$0, alo<dbv<?>> $$1) {
      pe.a(dbr.a($$0), this.b(axt.bE), this.b(axt.bF), ow.i).a("has_smithing_trim_template", this.a($$0)).a(this.b, $$1);
   }

   protected void a(ow $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(b($$2), this.a($$2)).a(this.b);
   }

   protected void a(ow $$0, dgy $$1, dgy $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.a($$2)).a(this.b);
   }

   protected void b(ow $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, $$2, b($$2));
   }

   protected void a(dgy $$0, aya<cxc> $$1, int $$2) {
      this.b(ow.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgy $$0, aya<cxc> $$1, int $$2) {
      this.b(ow.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dgy $$0, dgy $$1) {
      this.a(ow.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dgy $$0, dgy $$1) {
      this.a(ow.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dkf.J)).a(this.b);
   }

   protected void c(dgy $$0, dgy $$1) {
      this.b(ow.d, $$0).b(dkf.cD).b($$1).b("chest_boat").b("has_boat", this.a(axt.aT)).a(this.b);
   }

   private ov e(dgy $$0, dbr $$1) {
      return this.b(ow.c, $$0).a($$1);
   }

   protected ov a(dgy $$0, dbr $$1) {
      return this.a(ow.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ov f(dgy $$0, dbr $$1) {
      int $$2 = $$0 == dkf.fJ ? 6 : 3;
      cxc $$3 = $$0 == dkf.fJ ? cxk.vw : cxk.pV;
      return this.a(ow.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ov g(dgy $$0, dbr $$1) {
      return this.a(ow.c, $$0).a('#', cxk.pV).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dgy $$0, dgy $$1) {
      this.c(ow.c, $$0, dbr.a($$1)).a(b($$1), this.a($$1)).a(this.b);
   }

   private ov c(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ow $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   protected ov a(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ov b(dgy $$0, dbr $$1) {
      return this.a(ow.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ov c(dgy $$0, dbr $$1) {
      return this.a(ow.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ov h(dgy $$0, dbr $$1) {
      return this.a(ow.b, $$0, 3).c("sign").a('#', $$1).a('X', cxk.pV).b("###").b("###").b(" X ");
   }

   protected void e(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', cxk.gh).b("X X").b("###").b("###").b("has_stripped_logs", this.a($$1)).a(this.b);
   }

   protected void a(List<cxc> $$0, List<cxc> $$1, String $$2) {
      this.a($$0, $$1, null, $$2, ow.a);
   }

   protected void a(List<cxc> $$0, List<cxc> $$1, @Nullable cxc $$2, String $$3, ow $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         cxc $$6 = $$0.get($$5);
         cxc $$7 = $$1.get($$5);
         Stream<cxc> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dbr.a($$8)).b($$3).b("has_needed_dye", this.a($$6)).a(this.b, "dye_" + c($$7));
      }
   }

   protected void f(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void g(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0).a('#', $$1).a('X', axt.b).b("###").b("XXX").c("bed").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void h(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0).a('#', $$1).a('|', cxk.pV).b("###").b("###").b(" | ").c("banner").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void i(dgy $$0, dgy $$1) {
      this.a(ow.a, $$0, 8).a('#', dkf.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.a((dgy)dkf.aX)).a(this.b);
   }

   protected void j(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.a($$1)).a(this.b);
   }

   protected void k(dgy $$0, dgy $$1) {
      this.a(ow.b, $$0, 8)
         .a('#', dkf.fm)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.a((dgy)dkf.fm))
         .b(b($$1), this.a($$1))
         .a(this.b, p($$0, dkf.fm));
   }

   protected void l(dgy $$0, dgy $$1) {
      this.a(ow.a, $$0, 8).a('#', dkf.iY).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.a((dgy)dkf.iY)).a(this.b);
   }

   protected void m(dgy $$0, dgy $$1) {
      this.b(ow.a, $$0, 8).b($$1).a(dkf.L, 4).a(dkf.O, 4).b("concrete_powder").b("has_sand", this.a((dgy)dkf.L)).b("has_gravel", this.a((dgy)dkf.O)).a(this.b);
   }

   protected void n(dgy $$0, dgy $$1) {
      this.b(ow.b, $$0).b(dkf.qn).b($$1).b("dyed_candle").b(b($$1), this.a($$1)).a(this.b);
   }

   protected void d(ow $$0, dgy $$1, dgy $$2) {
      this.d($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ov d(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ow $$0, dgy $$1, dgy $$2) {
      this.e($$0, $$1, dbr.a($$2)).a(b($$2), this.a($$2)).a(this.b);
   }

   private ov e(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ow $$0, dgy $$1, dgy $$2) {
      this.f($$0, $$1, dbr.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   private oz f(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ow $$0, dgy $$1, dgy $$2) {
      this.b($$0, $$1, dbr.a($$2)).b(b($$2), this.a($$2)).a(this.b);
   }

   protected void h(ow $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(b($$2), this.a($$2)).a(this.b);
   }

   protected oz b(ow $$0, dgy $$1, dbr $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ow $$0, dgy $$1, dgy $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ow $$0, dgy $$1, dgy $$2, int $$3) {
      pc.a(dbr.a($$2), $$0, $$1, $$3).b(b($$2), this.a($$2)).a(this.b, p($$1, $$2) + "_stonecutting");
   }

   private void q(dgy $$0, dgy $$1) {
      pb.c(dbr.a($$1), ow.a, $$0, 0.1F, 200).b(b($$1), this.a($$1)).a(this.b);
   }

   protected void a(ow $$0, dgy $$1, ow $$2, dgy $$3) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, d($$1), null);
   }

   protected void a(ow $$0, dgy $$1, ow $$2, dgy $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, d($$1), null);
   }

   protected void b(ow $$0, dgy $$1, ow $$2, dgy $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, d($$3), null, $$4, $$5);
   }

   private void a(ow $$0, dgy $$1, ow $$2, dgy $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(b($$3), this.a($$3)).a(this.b, alo.a(mb.bk, alp.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(b($$1), this.a($$1)).a(this.b, alo.a(mb.bk, alp.a($$4)));
   }

   protected void o(dgy $$0, dgy $$1) {
      this.a(ow.i, $$0, 2).a('#', cxk.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected void d(dgy $$0, dbr $$1) {
      this.a(ow.i, $$0, 2).a('#', cxk.pe).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(b($$0), this.a($$0)).a(this.b);
   }

   protected <T extends dbb> void a(String $$0, dcf<T> $$1, dbb.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, cxk.sX, cxk.sY, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.sZ, cxk.ta, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.rW, cxk.sa, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.dT, cxk.sU, 0.1F);
      this.a($$0, $$1, $$2, $$3, cxk.rX, cxk.sb, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.vN, cxk.vO, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.qC, cxk.qD, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.vf, cxk.vg, 0.35F);
      this.a($$0, $$1, $$2, $$3, cxk.vA, cxk.vB, 0.35F);
   }

   private <T extends dbb> void a(String $$0, dcf<T> $$1, dbb.a<T> $$2, int $$3, dgy $$4, dgy $$5, float $$6) {
      pb.a(dbr.a($$4), ow.g, $$5, $$6, $$3, $$1, $$2).b(b($$4), this.a($$4)).a(this.b, c($$5) + "_from_" + $$0);
   }

   protected void b(csk $$0) {
      cwx.a.get().forEach(($$1, $$2) -> {
         if ($$2.i().a($$0)) {
            this.b(ow.a, $$2).b($$1).b(cxk.xA).b(c($$2)).b(b($$1), this.a((dgy)$$1)).a(this.b, p($$2, cxk.xA));
         }
      });
   }

   protected void a(dkd $$0, dkd $$1) {
      this.a(ow.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(b($$1), this.a((dgy)$$1)).a(this.b);
   }

   protected void b(dkd $$0, dkd $$1) {
      this.a(ow.c, $$0, 4).a('C', $$1).a('R', cxk.me).a('B', cxk.td).b(" C ").b("CBC").b(" R ").b(b($$1), this.a((dgy)$$1)).a(this.b);
   }

   protected void a(cxc $$0, dsk $$1) {
      cxg $$2 = new cxg(cxk.wW.f(), 1, kr.a().a(ku.R, $$1.c()).a());
      this.a(ow.g, $$2).b(cxk.oY).b(cxk.dJ).b(cxk.dK).b($$0).b("suspicious_stew").b(b($$0), this.a($$0)).a(this.b, c($$2.h()) + "_from_" + c($$0));
   }

   protected void a(me $$0, csk $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.i().a($$1)) {
            oy.a $$4 = d.get($$2);
            dgy $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               ov $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == me.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> b($$5)), this.a($$5));
               $$6.a(this.b);
            }

            if ($$2 == me.b.c) {
               this.q($$3, $$5);
            }
         }
      });
   }

   private dkd a(me $$0, me.b $$1) {
      if ($$1 == me.b.b) {
         if (!$$0.b().containsKey(me.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(me.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ap<bs.a> a(dkd $$0) {
      return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ap<ci.a> a(dj.d $$0, dgy $$1) {
      return a(cu.a.a().a(this.c, $$1).a($$0));
   }

   protected ap<ci.a> a(dgy $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   protected ap<ci.a> a(aya<cxc> $$0) {
      return a(cu.a.a().a(this.c, $$0));
   }

   private static ap<ci.a> a(cu.a... $$0) {
      return a(Arrays.stream($$0).map(cu.a::b).toArray(cu[]::new));
   }

   private static ap<ci.a> a(cu... $$0) {
      return ao.f.a(new ci.a(Optional.empty(), ci.a.a.b, List.of($$0)));
   }

   protected static String b(dgy $$0) {
      return "has_" + c($$0);
   }

   protected static String c(dgy $$0) {
      return ma.g.b($$0.j()).a();
   }

   protected static String d(dgy $$0) {
      return c($$0);
   }

   protected static String p(dgy $$0, dgy $$1) {
      return c($$0) + "_from_" + c($$1);
   }

   protected static String e(dgy $$0) {
      return c($$0) + "_from_smelting";
   }

   protected static String f(dgy $$0) {
      return c($$0) + "_from_blasting";
   }

   protected dbr b(aya<cxc> $$0) {
      return dbr.a(this.c.b($$0));
   }

   protected oz a(ow $$0, dgy $$1) {
      return oz.a(this.c, $$0, $$1);
   }

   protected oz a(ow $$0, dgy $$1, int $$2) {
      return oz.a(this.c, $$0, $$1, $$2);
   }

   protected pa a(ow $$0, cxg $$1) {
      return pa.a(this.c, $$0, $$1);
   }

   protected pa b(ow $$0, dgy $$1) {
      return pa.a(this.c, $$0, $$1);
   }

   protected pa b(ow $$0, dgy $$1, int $$2) {
      return pa.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ov create(oy var1, dgy var2, dgy var3);
   }

   protected abstract static class b implements mh {
      private final mj d;
      private final CompletableFuture<js.a> e;

      protected b(mj $$0, CompletableFuture<js.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mf $$0) {
         return this.e.thenCompose($$1 -> {
            final mj.a $$2 = this.d.a(mb.bk);
            final mj.a $$3 = this.d.a(mb.bj);
            final Set<alo<dbv<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            ox $$6 = new ox() {
               @Override
               public void a(alo<dbv<?>> $$0x, dbv<?> $$1x, @Nullable ah $$2x) {
                  if (!$$4.add($$0)) {
                     throw new IllegalStateException("Duplicate recipe " + $$0.a());
                  } else {
                     this.a($$0, $$1);
                     if ($$2 != null) {
                        this.a($$2);
                     }
                  }
               }

               @Override
               public ag.a a() {
                  return ag.a.b().a(ov.a);
               }

               @Override
               public void b() {
                  ah $$0 = ag.a.b().a("impossible", ao.b.a(new cg.a())).b(ov.a);
                  this.a($$0);
               }

               private void a(alo<dbv<?>> $$0x, dbv<?> $$1x) {
                  $$5.add(mh.a($$0, $$1, dbv.a, $$1, $$2.a($$0.a())));
               }

               private void a(ah $$0x) {
                  $$5.add(mh.a($$0, $$1, ag.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract oy a(js.a var1, ox var2);
   }
}
