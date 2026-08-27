import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gbm extends gbl {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gbm aZ = a("solid", exl.j, exs.b.h, 4194304, true, false, gbm.b.a().a(at).a(p).a(an).a(true));
   private static final gbm ba = a("cutout_mipped", exl.j, exs.b.h, 4194304, true, false, gbm.b.a().a(at).a(q).a(an).a(true));
   private static final gbm bb = a("cutout", exl.j, exs.b.h, 786432, true, false, gbm.b.a().a(at).a(r).a(ao).a(true));
   private static final gbm bc = a("translucent", exl.j, exs.b.h, 786432, true, true, a(s));
   private static final gbm bd = a("translucent_moving_block", exl.j, exs.b.h, 786432, false, true, Q());
   private static final Function<akf, gbm> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akf, gbm> bf = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(v).a(new gbl.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", exl.k, exs.b.h, 1536, true, false, $$1);
   });
   private static final Function<akf, gbm> bg = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(w).a(new gbl.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", exl.k, exs.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akf, Boolean, gbm> bh = ac.a(($$0, $$1) -> {
      gbm.b $$2 = gbm.b.a().a(x).a(new gbl.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", exl.k, exs.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akf, Boolean, gbm> bi = ac.a(($$0, $$1) -> {
      gbm.b $$2 = gbm.b.a().a(y).a(new gbl.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", exl.k, exs.b.h, 1536, true, false, $$2);
   });
   private static final Function<akf, gbm> bj = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(z).a(new gbl.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gbl.aD).a(true);
      return a("item_entity_translucent_cull", exl.k, exs.b.h, 1536, true, true, $$1);
   });
   private static final Function<akf, gbm> bk = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(A).a(new gbl.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", exl.k, exs.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akf, Boolean, gbm> bl = ac.a(($$0, $$1) -> {
      gbm.b $$2 = gbm.b.a().a(B).a(new gbl.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", exl.k, exs.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akf, Boolean, gbm> bm = ac.a(($$0, $$1) -> {
      gbm.b $$2 = gbm.b.a().a(C).a(new gbl.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", exl.k, exs.b.h, 1536, true, true, $$2);
   });
   private static final Function<akf, gbm> bn = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(D).a(new gbl.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", exl.k, exs.b.h, 1536, $$1);
   });
   private static final BiFunction<akf, Boolean, gbm> bo = ac.a(($$0, $$1) -> {
      gbm.b $$2 = gbm.b.a().a(E).a(new gbl.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", exl.j, exs.b.h, 1536, false, true, $$2);
   });
   private static final Function<akf, gbm> bp = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(F).a(new gbl.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", exl.k, exs.b.h, 1536, $$1);
   });
   private static final Function<akf, gbm> bq = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(G).a(new gbl.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", exl.k, exs.b.h, 1536, false, true, $$1);
   });
   private static final Function<akf, gbm> br = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(H).a(new gbl.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", exl.k, exs.b.h, 1536, false, false, $$1);
   });
   private static final Function<akf, gbm> bs = ac.b($$0 -> {
      gbm.b $$1 = gbm.b.a().a(I).a(new gbl.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", exl.k, exs.b.h, 1536, $$1);
   });
   private static final BiFunction<akf, gbl.p, gbm> bt = ac.a(($$0, $$1) -> {
      gbl.n $$2 = new gbl.n($$0, false, false);
      return a("eyes", exl.k, exs.b.h, 1536, false, true, gbm.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gbm bu = a("leash", exl.p, exs.b.f, 1536, gbm.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gbm bv = a("water_mask", exl.m, exs.b.h, 1536, gbm.b.a().a(M).a(ap).a(aF).a(false));
   private static final gbm bw = a(
      "armor_glint", exl.q, exs.b.h, 1536, gbm.b.a().a(O).a(new gbl.n(ghl.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gbm bx = a(
      "armor_entity_glint", exl.q, exs.b.h, 1536, gbm.b.a().a(P).a(new gbl.n(ghl.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gbm by = a(
      "glint_translucent", exl.q, exs.b.h, 1536, gbm.b.a().a(Q).a(new gbl.n(ghl.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gbm bz = a("glint", exl.q, exs.b.h, 1536, gbm.b.a().a(R).a(new gbl.n(ghl.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gbm bA = a("glint_direct", exl.q, exs.b.h, 1536, gbm.b.a().a(S).a(new gbl.n(ghl.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gbm bB = a(
      "entity_glint", exl.q, exs.b.h, 1536, gbm.b.a().a(T).a(new gbl.n(ghl.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gbm bC = a(
      "entity_glint_direct", exl.q, exs.b.h, 1536, gbm.b.a().a(U).a(new gbl.n(ghl.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akf, gbm> bD = ac.b($$0 -> {
      gbl.n $$1 = new gbl.n($$0, false, false);
      return a("crumbling", exl.j, exs.b.h, 1536, false, true, gbm.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akf, gbm> bE = ac.b(
      $$0 -> a("text", exl.t, exs.b.h, 786432, false, true, gbm.b.a().a(W).a(new gbl.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gbm bF = a("text_background", exl.p, exs.b.h, 1536, false, true, gbm.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akf, gbm> bG = ac.b(
      $$0 -> a("text_intensity", exl.t, exs.b.h, 786432, false, true, gbm.b.a().a(Y).a(new gbl.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akf, gbm> bH = ac.b(
      $$0 -> a("text_polygon_offset", exl.t, exs.b.h, 1536, false, true, gbm.b.a().a(W).a(new gbl.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akf, gbm> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", exl.t, exs.b.h, 1536, false, true, gbm.b.a().a(Y).a(new gbl.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akf, gbm> bJ = ac.b(
      $$0 -> a("text_see_through", exl.t, exs.b.h, 1536, false, true, gbm.b.a().a(Z).a(new gbl.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gbm bK = a("text_background_see_through", exl.p, exs.b.h, 1536, false, true, gbm.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akf, gbm> bL = ac.b(
      $$0 -> a("text_intensity_see_through", exl.t, exs.b.h, 1536, false, true, gbm.b.a().a(ab).a(new gbl.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gbm bM = a("lightning", exl.n, exs.b.h, 1536, false, true, gbm.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gbm bN = a("tripwire", exl.j, exs.b.h, 1536, true, true, R());
   private static final gbm bO = a(
      "end_portal", exl.m, exs.b.h, 1536, false, false, gbm.b.a().a(ae).a(gbl.i.d().a(gdx.a, false, false).a(gdx.b, false, false).a()).a(false)
   );
   private static final gbm bP = a(
      "end_gateway", exl.m, exs.b.h, 1536, false, false, gbm.b.a().a(af).a(gbl.i.d().a(gdx.a, false, false).a(gdx.b, false, false).a()).a(false)
   );
   private static final gbm bQ = a(false);
   private static final gbm bR = a(true);
   public static final gbm.a aW = a("lines", exl.o, exs.b.a, 1536, gbm.b.a().a(ah).a(new gbl.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gbm.a aX = a(
      "line_strip", exl.o, exs.b.b, 1536, gbm.b.a().a(ah).a(new gbl.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gbm.a> bS = ac.b(
      $$0 -> a("debug_line_strip", exl.n, exs.b.d, 1536, gbm.b.a().a(o).a(new gbl.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gbm.a bT = a("debug_filled_box", exl.n, exs.b.f, 1536, false, true, gbm.b.a().a(o).a(aI).a(h).a(false));
   private static final gbm.a bU = a("debug_quads", exl.n, exs.b.h, 1536, false, true, gbm.b.a().a(o).a(h).a(ay).a(false));
   private static final gbm.a bV = a("debug_section_quads", exl.n, exs.b.h, 1536, false, true, gbm.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gbm.a bW = a("gui", exl.n, exs.b.h, 786432, gbm.b.a().a(ai).a(h).a(aB).a(false));
   private static final gbm.a bX = a("gui_overlay", exl.n, exs.b.h, 1536, gbm.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gbm.a bY = a("gui_text_highlight", exl.n, exs.b.h, 1536, gbm.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gbm.a bZ = a("gui_ghost_recipe_overlay", exl.n, exs.b.h, 1536, gbm.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gbm> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final exs cb;
   private final exs.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gbm> cg;

   public static gbm c() {
      return aZ;
   }

   public static gbm d() {
      return ba;
   }

   public static gbm e() {
      return bb;
   }

   private static gbm.b a(gbl.m $$0) {
      return gbm.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gbm f() {
      return bc;
   }

   private static gbm.b Q() {
      return gbm.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gbm g() {
      return bd;
   }

   private static gbm.a a(String $$0, akf $$1, boolean $$2) {
      gbm.b $$3 = gbm.b.a().a(u).a(new gbl.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, exl.k, exs.b.h, 1536, true, false, $$3);
   }

   public static gbm a(akf $$0) {
      return be.apply($$0);
   }

   public static gbm b(akf $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gbm c(akf $$0) {
      return bf.apply($$0);
   }

   public static gbm d(akf $$0) {
      return bg.apply($$0);
   }

   public static gbm a(akf $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gbm e(akf $$0) {
      return a($$0, true);
   }

   public static gbm b(akf $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gbm f(akf $$0) {
      return b($$0, true);
   }

   public static gbm g(akf $$0) {
      return bj.apply($$0);
   }

   public static gbm h(akf $$0) {
      return bk.apply($$0);
   }

   public static gbm c(akf $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gbm i(akf $$0) {
      return c($$0, true);
   }

   public static gbm d(akf $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gbm j(akf $$0) {
      return d($$0, true);
   }

   public static gbm k(akf $$0) {
      return bn.apply($$0);
   }

   public static gbm e(akf $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gbm l(akf $$0) {
      return bp.apply($$0);
   }

   public static gbm m(akf $$0) {
      return bq.apply($$0);
   }

   public static gbm n(akf $$0) {
      return br.apply($$0);
   }

   public static gbm o(akf $$0) {
      return bs.apply($$0);
   }

   public static gbm p(akf $$0) {
      return bt.apply($$0, d);
   }

   public static gbm q(akf $$0) {
      return bm.apply($$0, false);
   }

   public static gbm a(akf $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         exl.k,
         exs.b.h,
         1536,
         false,
         true,
         gbm.b.a().a(am).a(new gbl.n($$0, false, false)).a(new gbl.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gbm b(akf $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         exl.k,
         exs.b.h,
         1536,
         false,
         true,
         gbm.b.a().a(K).a(new gbl.n($$0, false, false)).a(new gbl.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gbm h() {
      return bu;
   }

   public static gbm i() {
      return bv;
   }

   public static gbm r(akf $$0) {
      return gbm.a.aY.apply($$0, ay);
   }

   public static gbm j() {
      return bw;
   }

   public static gbm k() {
      return bx;
   }

   public static gbm l() {
      return by;
   }

   public static gbm m() {
      return bz;
   }

   public static gbm n() {
      return bA;
   }

   public static gbm o() {
      return bB;
   }

   public static gbm p() {
      return bC;
   }

   public static gbm s(akf $$0) {
      return bD.apply($$0);
   }

   public static gbm t(akf $$0) {
      return bE.apply($$0);
   }

   public static gbm q() {
      return bF;
   }

   public static gbm u(akf $$0) {
      return bG.apply($$0);
   }

   public static gbm v(akf $$0) {
      return bH.apply($$0);
   }

   public static gbm w(akf $$0) {
      return bI.apply($$0);
   }

   public static gbm x(akf $$0) {
      return bJ.apply($$0);
   }

   public static gbm r() {
      return bK;
   }

   public static gbm y(akf $$0) {
      return bL.apply($$0);
   }

   public static gbm s() {
      return bM;
   }

   private static gbm.b R() {
      return gbm.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gbm t() {
      return bN;
   }

   public static gbm u() {
      return bO;
   }

   public static gbm v() {
      return bP;
   }

   private static gbm.a a(boolean $$0) {
      return a("clouds", exl.v, exs.b.h, 786432, false, false, gbm.b.a().a(ag).a(new gbl.n(gbc.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gbm w() {
      return bQ;
   }

   public static gbm x() {
      return bR;
   }

   public static gbm y() {
      return aW;
   }

   public static gbm z() {
      return aX;
   }

   public static gbm a(double $$0) {
      return bS.apply($$0);
   }

   public static gbm A() {
      return bT;
   }

   public static gbm B() {
      return bU;
   }

   public static gbm C() {
      return bV;
   }

   public static gbm D() {
      return bW;
   }

   public static gbm E() {
      return bX;
   }

   public static gbm F() {
      return bY;
   }

   public static gbm G() {
      return bZ;
   }

   public gbm(String $$0, exs $$1, exs.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gbm.a a(String $$0, exs $$1, exs.b $$2, int $$3, gbm.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gbm.a a(String $$0, exs $$1, exs.b $$2, int $$3, boolean $$4, boolean $$5, gbm.b $$6) {
      return new gbm.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(exi $$0, exv $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         exi.b $$2 = $$0.d();
         this.a();
         exj.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gbm> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public exs J() {
      return this.cb;
   }

   public exs.b K() {
      return this.cc;
   }

   public Optional<gbm> L() {
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

   public Optional<gbm> P() {
      return this.cg;
   }

   static final class a extends gbm {
      static final BiFunction<akf, gbl.c, gbm> aY = ac.a(
         ($$0, $$1) -> gbm.a("outline", exl.r, exs.b.h, 1536, gbm.b.a().a(N).a(new gbl.n($$0, false, false)).a($$1).a(az).a(aK).a(gbm.c.b))
      );
      private final gbm.b aZ;
      private final Optional<gbm> ba;
      private final boolean bb;

      a(String $$0, exs $$1, exs.b $$2, int $$3, boolean $$4, boolean $$5, gbm.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gbl::a), () -> $$6.o.forEach(gbl::b));
         this.aZ = $$6;
         this.ba = $$6.n == gbm.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gbm.c.b;
      }

      @Override
      public Optional<gbm> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gbm.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gbl.e a;
      private final gbl.m b;
      private final gbl.p c;
      private final gbl.d d;
      final gbl.c e;
      private final gbl.g f;
      private final gbl.l g;
      private final gbl.f h;
      private final gbl.k i;
      private final gbl.o j;
      private final gbl.q k;
      private final gbl.h l;
      private final gbl.b m;
      final gbm.c n;
      final ImmutableList<gbl> o;

      b(
         gbl.e $$0,
         gbl.m $$1,
         gbl.p $$2,
         gbl.d $$3,
         gbl.c $$4,
         gbl.g $$5,
         gbl.l $$6,
         gbl.f $$7,
         gbl.k $$8,
         gbl.o $$9,
         gbl.q $$10,
         gbl.h $$11,
         gbl.b $$12,
         gbm.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gbl[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gbm.b.a a() {
         return new gbm.b.a();
      }

      public static class a {
         private gbl.e a = gbl.ap;
         private gbl.m b = gbl.i;
         private gbl.p c;
         private gbl.d d;
         private gbl.c e;
         private gbl.g f;
         private gbl.l g;
         private gbl.f h;
         private gbl.k i;
         private gbl.o j;
         private gbl.q k;
         private gbl.h l;
         private gbl.b m;

         a() {
            this.c = gbl.c;
            this.d = gbl.aB;
            this.e = gbl.ax;
            this.f = gbl.au;
            this.g = gbl.aw;
            this.h = gbl.aG;
            this.i = gbl.aJ;
            this.j = gbl.aq;
            this.k = gbl.aD;
            this.l = gbl.aQ;
            this.m = gbl.aR;
         }

         public gbm.b.a a(gbl.e $$0) {
            this.a = $$0;
            return this;
         }

         public gbm.b.a a(gbl.m $$0) {
            this.b = $$0;
            return this;
         }

         public gbm.b.a a(gbl.p $$0) {
            this.c = $$0;
            return this;
         }

         public gbm.b.a a(gbl.d $$0) {
            this.d = $$0;
            return this;
         }

         public gbm.b.a a(gbl.c $$0) {
            this.e = $$0;
            return this;
         }

         public gbm.b.a a(gbl.g $$0) {
            this.f = $$0;
            return this;
         }

         public gbm.b.a a(gbl.l $$0) {
            this.g = $$0;
            return this;
         }

         public gbm.b.a a(gbl.f $$0) {
            this.h = $$0;
            return this;
         }

         public gbm.b.a a(gbl.k $$0) {
            this.i = $$0;
            return this;
         }

         public gbm.b.a a(gbl.o $$0) {
            this.j = $$0;
            return this;
         }

         public gbm.b.a a(gbl.q $$0) {
            this.k = $$0;
            return this;
         }

         public gbm.b.a a(gbl.h $$0) {
            this.l = $$0;
            return this;
         }

         public gbm.b.a a(gbl.b $$0) {
            this.m = $$0;
            return this;
         }

         public gbm.b a(boolean $$0) {
            return this.a($$0 ? gbm.c.c : gbm.c.a);
         }

         public gbm.b a(gbm.c $$0) {
            return new gbm.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
         }
      }
   }

   static enum c {
      a("none"),
      b("is_outline"),
      c("affects_outline");

      private final String d;

      private c(String $$0) {
         this.d = $$0;
      }

      @Override
      public String toString() {
         return this.d;
      }
   }
}
