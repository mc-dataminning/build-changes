import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdr extends gdq {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdr aZ = a("solid", ezr.j, ezy.b.h, 4194304, true, false, gdr.b.a().a(at).a(p).a(an).a(true));
   private static final gdr ba = a("cutout_mipped", ezr.j, ezy.b.h, 4194304, true, false, gdr.b.a().a(at).a(q).a(an).a(true));
   private static final gdr bb = a("cutout", ezr.j, ezy.b.h, 786432, true, false, gdr.b.a().a(at).a(r).a(ao).a(true));
   private static final gdr bc = a("translucent", ezr.j, ezy.b.h, 786432, true, true, a(s));
   private static final gdr bd = a("translucent_moving_block", ezr.j, ezy.b.h, 786432, false, true, Q());
   private static final Function<alb, gdr> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alb, gdr> bf = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(v).a(new gdq.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezr.k, ezy.b.h, 1536, true, false, $$1);
   });
   private static final Function<alb, gdr> bg = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(w).a(new gdq.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezr.k, ezy.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alb, Boolean, gdr> bh = ac.a(($$0, $$1) -> {
      gdr.b $$2 = gdr.b.a().a(x).a(new gdq.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezr.k, ezy.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alb, Boolean, gdr> bi = ac.a(($$0, $$1) -> {
      gdr.b $$2 = gdr.b.a().a(y).a(new gdq.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezr.k, ezy.b.h, 1536, true, false, $$2);
   });
   private static final Function<alb, gdr> bj = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(z).a(new gdq.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdq.aD).a(true);
      return a("item_entity_translucent_cull", ezr.k, ezy.b.h, 1536, true, true, $$1);
   });
   private static final Function<alb, gdr> bk = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(A).a(new gdq.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezr.k, ezy.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alb, Boolean, gdr> bl = ac.a(($$0, $$1) -> {
      gdr.b $$2 = gdr.b.a().a(B).a(new gdq.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezr.k, ezy.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alb, Boolean, gdr> bm = ac.a(($$0, $$1) -> {
      gdr.b $$2 = gdr.b.a().a(C).a(new gdq.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezr.k, ezy.b.h, 1536, true, true, $$2);
   });
   private static final Function<alb, gdr> bn = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(D).a(new gdq.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezr.k, ezy.b.h, 1536, $$1);
   });
   private static final BiFunction<alb, Boolean, gdr> bo = ac.a(($$0, $$1) -> {
      gdr.b $$2 = gdr.b.a().a(E).a(new gdq.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezr.j, ezy.b.h, 1536, false, true, $$2);
   });
   private static final Function<alb, gdr> bp = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(F).a(new gdq.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezr.k, ezy.b.h, 1536, $$1);
   });
   private static final Function<alb, gdr> bq = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(G).a(new gdq.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezr.k, ezy.b.h, 1536, false, true, $$1);
   });
   private static final Function<alb, gdr> br = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(H).a(new gdq.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezr.k, ezy.b.h, 1536, false, false, $$1);
   });
   private static final Function<alb, gdr> bs = ac.b($$0 -> {
      gdr.b $$1 = gdr.b.a().a(I).a(new gdq.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezr.k, ezy.b.h, 1536, $$1);
   });
   private static final BiFunction<alb, gdq.p, gdr> bt = ac.a(($$0, $$1) -> {
      gdq.n $$2 = new gdq.n($$0, false, false);
      return a("eyes", ezr.k, ezy.b.h, 1536, false, true, gdr.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdr bu = a("leash", ezr.p, ezy.b.f, 1536, gdr.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdr bv = a("water_mask", ezr.m, ezy.b.h, 1536, gdr.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdr bw = a(
      "armor_glint", ezr.q, ezy.b.h, 1536, gdr.b.a().a(O).a(new gdq.n(gjq.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdr bx = a(
      "armor_entity_glint", ezr.q, ezy.b.h, 1536, gdr.b.a().a(P).a(new gdq.n(gjq.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdr by = a(
      "glint_translucent", ezr.q, ezy.b.h, 1536, gdr.b.a().a(Q).a(new gdq.n(gjq.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdr bz = a("glint", ezr.q, ezy.b.h, 1536, gdr.b.a().a(R).a(new gdq.n(gjq.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdr bA = a("glint_direct", ezr.q, ezy.b.h, 1536, gdr.b.a().a(S).a(new gdq.n(gjq.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdr bB = a(
      "entity_glint", ezr.q, ezy.b.h, 1536, gdr.b.a().a(T).a(new gdq.n(gjq.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdr bC = a(
      "entity_glint_direct", ezr.q, ezy.b.h, 1536, gdr.b.a().a(U).a(new gdq.n(gjq.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<alb, gdr> bD = ac.b($$0 -> {
      gdq.n $$1 = new gdq.n($$0, false, false);
      return a("crumbling", ezr.j, ezy.b.h, 1536, false, true, gdr.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alb, gdr> bE = ac.b(
      $$0 -> a("text", ezr.t, ezy.b.h, 786432, false, true, gdr.b.a().a(W).a(new gdq.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdr bF = a("text_background", ezr.p, ezy.b.h, 1536, false, true, gdr.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alb, gdr> bG = ac.b(
      $$0 -> a("text_intensity", ezr.t, ezy.b.h, 786432, false, true, gdr.b.a().a(Y).a(new gdq.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<alb, gdr> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezr.t, ezy.b.h, 1536, false, true, gdr.b.a().a(W).a(new gdq.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alb, gdr> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezr.t, ezy.b.h, 1536, false, true, gdr.b.a().a(Y).a(new gdq.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alb, gdr> bJ = ac.b(
      $$0 -> a("text_see_through", ezr.t, ezy.b.h, 1536, false, true, gdr.b.a().a(Z).a(new gdq.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdr bK = a("text_background_see_through", ezr.p, ezy.b.h, 1536, false, true, gdr.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alb, gdr> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezr.t, ezy.b.h, 1536, false, true, gdr.b.a().a(ab).a(new gdq.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdr bM = a("lightning", ezr.n, ezy.b.h, 1536, false, true, gdr.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdr bN = a("tripwire", ezr.j, ezy.b.h, 1536, true, true, R());
   private static final gdr bO = a(
      "end_portal", ezr.m, ezy.b.h, 1536, false, false, gdr.b.a().a(ae).a(gdq.i.d().a(ggc.a, false, false).a(ggc.b, false, false).a()).a(false)
   );
   private static final gdr bP = a(
      "end_gateway", ezr.m, ezy.b.h, 1536, false, false, gdr.b.a().a(af).a(gdq.i.d().a(ggc.a, false, false).a(ggc.b, false, false).a()).a(false)
   );
   private static final gdr bQ = a(false);
   private static final gdr bR = a(true);
   public static final gdr.a aW = a("lines", ezr.o, ezy.b.a, 1536, gdr.b.a().a(ah).a(new gdq.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdr.a aX = a(
      "line_strip", ezr.o, ezy.b.b, 1536, gdr.b.a().a(ah).a(new gdq.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdr.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezr.n, ezy.b.d, 1536, gdr.b.a().a(o).a(new gdq.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdr.a bT = a("debug_filled_box", ezr.n, ezy.b.f, 1536, false, true, gdr.b.a().a(o).a(aI).a(h).a(false));
   private static final gdr.a bU = a("debug_quads", ezr.n, ezy.b.h, 1536, false, true, gdr.b.a().a(o).a(h).a(ay).a(false));
   private static final gdr.a bV = a("debug_section_quads", ezr.n, ezy.b.h, 1536, false, true, gdr.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdr.a bW = a("gui", ezr.n, ezy.b.h, 786432, gdr.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdr.a bX = a("gui_overlay", ezr.n, ezy.b.h, 1536, gdr.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdr.a bY = a("gui_text_highlight", ezr.n, ezy.b.h, 1536, gdr.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdr.a bZ = a("gui_ghost_recipe_overlay", ezr.n, ezy.b.h, 1536, gdr.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdr> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final ezy cb;
   private final ezy.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdr> cg;

   public static gdr c() {
      return aZ;
   }

   public static gdr d() {
      return ba;
   }

   public static gdr e() {
      return bb;
   }

   private static gdr.b a(gdq.m $$0) {
      return gdr.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdr f() {
      return bc;
   }

   private static gdr.b Q() {
      return gdr.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdr g() {
      return bd;
   }

   private static gdr.a a(String $$0, alb $$1, boolean $$2) {
      gdr.b $$3 = gdr.b.a().a(u).a(new gdq.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezr.k, ezy.b.h, 1536, true, false, $$3);
   }

   public static gdr a(alb $$0) {
      return be.apply($$0);
   }

   public static gdr b(alb $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdr c(alb $$0) {
      return bf.apply($$0);
   }

   public static gdr d(alb $$0) {
      return bg.apply($$0);
   }

   public static gdr a(alb $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdr e(alb $$0) {
      return a($$0, true);
   }

   public static gdr b(alb $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdr f(alb $$0) {
      return b($$0, true);
   }

   public static gdr g(alb $$0) {
      return bj.apply($$0);
   }

   public static gdr h(alb $$0) {
      return bk.apply($$0);
   }

   public static gdr c(alb $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdr i(alb $$0) {
      return c($$0, true);
   }

   public static gdr d(alb $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdr j(alb $$0) {
      return d($$0, true);
   }

   public static gdr k(alb $$0) {
      return bn.apply($$0);
   }

   public static gdr e(alb $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdr l(alb $$0) {
      return bp.apply($$0);
   }

   public static gdr m(alb $$0) {
      return bq.apply($$0);
   }

   public static gdr n(alb $$0) {
      return br.apply($$0);
   }

   public static gdr o(alb $$0) {
      return bs.apply($$0);
   }

   public static gdr p(alb $$0) {
      return bt.apply($$0, d);
   }

   public static gdr q(alb $$0) {
      return bm.apply($$0, false);
   }

   public static gdr a(alb $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezr.k,
         ezy.b.h,
         1536,
         false,
         true,
         gdr.b.a().a(am).a(new gdq.n($$0, false, false)).a(new gdq.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdr b(alb $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezr.k,
         ezy.b.h,
         1536,
         false,
         true,
         gdr.b.a().a(K).a(new gdq.n($$0, false, false)).a(new gdq.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdr h() {
      return bu;
   }

   public static gdr i() {
      return bv;
   }

   public static gdr r(alb $$0) {
      return gdr.a.aY.apply($$0, ay);
   }

   public static gdr j() {
      return bw;
   }

   public static gdr k() {
      return bx;
   }

   public static gdr l() {
      return by;
   }

   public static gdr m() {
      return bz;
   }

   public static gdr n() {
      return bA;
   }

   public static gdr o() {
      return bB;
   }

   public static gdr p() {
      return bC;
   }

   public static gdr s(alb $$0) {
      return bD.apply($$0);
   }

   public static gdr t(alb $$0) {
      return bE.apply($$0);
   }

   public static gdr q() {
      return bF;
   }

   public static gdr u(alb $$0) {
      return bG.apply($$0);
   }

   public static gdr v(alb $$0) {
      return bH.apply($$0);
   }

   public static gdr w(alb $$0) {
      return bI.apply($$0);
   }

   public static gdr x(alb $$0) {
      return bJ.apply($$0);
   }

   public static gdr r() {
      return bK;
   }

   public static gdr y(alb $$0) {
      return bL.apply($$0);
   }

   public static gdr s() {
      return bM;
   }

   private static gdr.b R() {
      return gdr.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdr t() {
      return bN;
   }

   public static gdr u() {
      return bO;
   }

   public static gdr v() {
      return bP;
   }

   private static gdr.a a(boolean $$0) {
      return a("clouds", ezr.v, ezy.b.h, 786432, false, false, gdr.b.a().a(ag).a(new gdq.n(gdh.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdr w() {
      return bQ;
   }

   public static gdr x() {
      return bR;
   }

   public static gdr y() {
      return aW;
   }

   public static gdr z() {
      return aX;
   }

   public static gdr a(double $$0) {
      return bS.apply($$0);
   }

   public static gdr A() {
      return bT;
   }

   public static gdr B() {
      return bU;
   }

   public static gdr C() {
      return bV;
   }

   public static gdr D() {
      return bW;
   }

   public static gdr E() {
      return bX;
   }

   public static gdr F() {
      return bY;
   }

   public static gdr G() {
      return bZ;
   }

   public gdr(String $$0, ezy $$1, ezy.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdr.a a(String $$0, ezy $$1, ezy.b $$2, int $$3, gdr.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdr.a a(String $$0, ezy $$1, ezy.b $$2, int $$3, boolean $$4, boolean $$5, gdr.b $$6) {
      return new gdr.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezo $$0, fab $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezo.b $$2 = $$0.d();
         this.a();
         ezp.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdr> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public ezy J() {
      return this.cb;
   }

   public ezy.b K() {
      return this.cc;
   }

   public Optional<gdr> L() {
      return Optional.empty();
   }

   public boolean M() {
      return false;
   }

   public boolean N() {
      return this.ce;
   }

   public boolean O() {
      return !this.cc.l;
   }

   public Optional<gdr> P() {
      return this.cg;
   }

   static final class a extends gdr {
      static final BiFunction<alb, gdq.c, gdr> aY = ac.a(
         ($$0, $$1) -> gdr.a("outline", ezr.r, ezy.b.h, 1536, gdr.b.a().a(N).a(new gdq.n($$0, false, false)).a($$1).a(az).a(aK).a(gdr.c.b))
      );
      private final gdr.b aZ;
      private final Optional<gdr> ba;
      private final boolean bb;

      a(String $$0, ezy $$1, ezy.b $$2, int $$3, boolean $$4, boolean $$5, gdr.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdq::a), () -> $$6.o.forEach(gdq::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdr.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdr.c.b;
      }

      @Override
      public Optional<gdr> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdr.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdq.e a;
      private final gdq.m b;
      private final gdq.p c;
      private final gdq.d d;
      final gdq.c e;
      private final gdq.g f;
      private final gdq.l g;
      private final gdq.f h;
      private final gdq.k i;
      private final gdq.o j;
      private final gdq.q k;
      private final gdq.h l;
      private final gdq.b m;
      final gdr.c n;
      final ImmutableList<gdq> o;

      b(
         gdq.e $$0,
         gdq.m $$1,
         gdq.p $$2,
         gdq.d $$3,
         gdq.c $$4,
         gdq.g $$5,
         gdq.l $$6,
         gdq.f $$7,
         gdq.k $$8,
         gdq.o $$9,
         gdq.q $$10,
         gdq.h $$11,
         gdq.b $$12,
         gdr.c $$13
      ) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
         this.j = $$9;
         this.k = $$10;
         this.l = $$11;
         this.m = $$12;
         this.n = $$13;
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdq[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdr.b.a a() {
         return new gdr.b.a();
      }

      public static class a {
         private gdq.e a = gdq.ap;
         private gdq.m b = gdq.i;
         private gdq.p c;
         private gdq.d d;
         private gdq.c e;
         private gdq.g f;
         private gdq.l g;
         private gdq.f h;
         private gdq.k i;
         private gdq.o j;
         private gdq.q k;
         private gdq.h l;
         private gdq.b m;

         a() {
            this.c = gdq.c;
            this.d = gdq.aB;
            this.e = gdq.ax;
            this.f = gdq.au;
            this.g = gdq.aw;
            this.h = gdq.aG;
            this.i = gdq.aJ;
            this.j = gdq.aq;
            this.k = gdq.aD;
            this.l = gdq.aQ;
            this.m = gdq.aR;
         }

         public gdr.b.a a(gdq.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdr.b.a a(gdq.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdr.b.a a(gdq.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdr.b.a a(gdq.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdr.b.a a(gdq.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdr.b.a a(gdq.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdr.b.a a(gdq.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdr.b.a a(gdq.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdr.b.a a(gdq.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdr.b.a a(gdq.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdr.b.a a(gdq.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdr.b.a a(gdq.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdr.b.a a(gdq.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdr.b a(boolean $$0) {
            return this.a($$0 ? gdr.c.c : gdr.c.a);
         }

         public gdr.b a(gdr.c $$0) {
            return new gdr.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
         }
      }
   }

   static enum c {
      a("none"),
      b("is_outline"),
      c("affects_outline");

      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String toString() {
         return this.d;
      }
   }
}
