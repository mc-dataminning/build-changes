import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gcs extends gcr {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gcs aZ = a("solid", eys.j, eyz.b.h, 4194304, true, false, gcs.b.a().a(at).a(p).a(an).a(true));
   private static final gcs ba = a("cutout_mipped", eys.j, eyz.b.h, 4194304, true, false, gcs.b.a().a(at).a(q).a(an).a(true));
   private static final gcs bb = a("cutout", eys.j, eyz.b.h, 786432, true, false, gcs.b.a().a(at).a(r).a(ao).a(true));
   private static final gcs bc = a("translucent", eys.j, eyz.b.h, 786432, true, true, a(s));
   private static final gcs bd = a("translucent_moving_block", eys.j, eyz.b.h, 786432, false, true, Q());
   private static final Function<akn, gcs> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akn, gcs> bf = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(v).a(new gcr.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", eys.k, eyz.b.h, 1536, true, false, $$1);
   });
   private static final Function<akn, gcs> bg = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(w).a(new gcr.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", eys.k, eyz.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akn, Boolean, gcs> bh = ac.a(($$0, $$1) -> {
      gcs.b $$2 = gcs.b.a().a(x).a(new gcr.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", eys.k, eyz.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akn, Boolean, gcs> bi = ac.a(($$0, $$1) -> {
      gcs.b $$2 = gcs.b.a().a(y).a(new gcr.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", eys.k, eyz.b.h, 1536, true, false, $$2);
   });
   private static final Function<akn, gcs> bj = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(z).a(new gcr.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gcr.aD).a(true);
      return a("item_entity_translucent_cull", eys.k, eyz.b.h, 1536, true, true, $$1);
   });
   private static final Function<akn, gcs> bk = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(A).a(new gcr.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", eys.k, eyz.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akn, Boolean, gcs> bl = ac.a(($$0, $$1) -> {
      gcs.b $$2 = gcs.b.a().a(B).a(new gcr.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", eys.k, eyz.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akn, Boolean, gcs> bm = ac.a(($$0, $$1) -> {
      gcs.b $$2 = gcs.b.a().a(C).a(new gcr.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", eys.k, eyz.b.h, 1536, true, true, $$2);
   });
   private static final Function<akn, gcs> bn = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(D).a(new gcr.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", eys.k, eyz.b.h, 1536, $$1);
   });
   private static final BiFunction<akn, Boolean, gcs> bo = ac.a(($$0, $$1) -> {
      gcs.b $$2 = gcs.b.a().a(E).a(new gcr.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", eys.j, eyz.b.h, 1536, false, true, $$2);
   });
   private static final Function<akn, gcs> bp = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(F).a(new gcr.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", eys.k, eyz.b.h, 1536, $$1);
   });
   private static final Function<akn, gcs> bq = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(G).a(new gcr.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", eys.k, eyz.b.h, 1536, false, true, $$1);
   });
   private static final Function<akn, gcs> br = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(H).a(new gcr.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", eys.k, eyz.b.h, 1536, false, false, $$1);
   });
   private static final Function<akn, gcs> bs = ac.b($$0 -> {
      gcs.b $$1 = gcs.b.a().a(I).a(new gcr.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", eys.k, eyz.b.h, 1536, $$1);
   });
   private static final BiFunction<akn, gcr.p, gcs> bt = ac.a(($$0, $$1) -> {
      gcr.n $$2 = new gcr.n($$0, false, false);
      return a("eyes", eys.k, eyz.b.h, 1536, false, true, gcs.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gcs bu = a("leash", eys.p, eyz.b.f, 1536, gcs.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gcs bv = a("water_mask", eys.m, eyz.b.h, 1536, gcs.b.a().a(M).a(ap).a(aF).a(false));
   private static final gcs bw = a(
      "armor_glint", eys.q, eyz.b.h, 1536, gcs.b.a().a(O).a(new gcr.n(gir.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gcs bx = a(
      "armor_entity_glint", eys.q, eyz.b.h, 1536, gcs.b.a().a(P).a(new gcr.n(gir.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gcs by = a(
      "glint_translucent", eys.q, eyz.b.h, 1536, gcs.b.a().a(Q).a(new gcr.n(gir.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gcs bz = a("glint", eys.q, eyz.b.h, 1536, gcs.b.a().a(R).a(new gcr.n(gir.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gcs bA = a("glint_direct", eys.q, eyz.b.h, 1536, gcs.b.a().a(S).a(new gcr.n(gir.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gcs bB = a(
      "entity_glint", eys.q, eyz.b.h, 1536, gcs.b.a().a(T).a(new gcr.n(gir.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gcs bC = a(
      "entity_glint_direct", eys.q, eyz.b.h, 1536, gcs.b.a().a(U).a(new gcr.n(gir.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akn, gcs> bD = ac.b($$0 -> {
      gcr.n $$1 = new gcr.n($$0, false, false);
      return a("crumbling", eys.j, eyz.b.h, 1536, false, true, gcs.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akn, gcs> bE = ac.b(
      $$0 -> a("text", eys.t, eyz.b.h, 786432, false, true, gcs.b.a().a(W).a(new gcr.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gcs bF = a("text_background", eys.p, eyz.b.h, 1536, false, true, gcs.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akn, gcs> bG = ac.b(
      $$0 -> a("text_intensity", eys.t, eyz.b.h, 786432, false, true, gcs.b.a().a(Y).a(new gcr.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akn, gcs> bH = ac.b(
      $$0 -> a("text_polygon_offset", eys.t, eyz.b.h, 1536, false, true, gcs.b.a().a(W).a(new gcr.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akn, gcs> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eys.t, eyz.b.h, 1536, false, true, gcs.b.a().a(Y).a(new gcr.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akn, gcs> bJ = ac.b(
      $$0 -> a("text_see_through", eys.t, eyz.b.h, 1536, false, true, gcs.b.a().a(Z).a(new gcr.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gcs bK = a("text_background_see_through", eys.p, eyz.b.h, 1536, false, true, gcs.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akn, gcs> bL = ac.b(
      $$0 -> a("text_intensity_see_through", eys.t, eyz.b.h, 1536, false, true, gcs.b.a().a(ab).a(new gcr.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gcs bM = a("lightning", eys.n, eyz.b.h, 1536, false, true, gcs.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gcs bN = a("tripwire", eys.j, eyz.b.h, 1536, true, true, R());
   private static final gcs bO = a(
      "end_portal", eys.m, eyz.b.h, 1536, false, false, gcs.b.a().a(ae).a(gcr.i.d().a(gfd.a, false, false).a(gfd.b, false, false).a()).a(false)
   );
   private static final gcs bP = a(
      "end_gateway", eys.m, eyz.b.h, 1536, false, false, gcs.b.a().a(af).a(gcr.i.d().a(gfd.a, false, false).a(gfd.b, false, false).a()).a(false)
   );
   private static final gcs bQ = a(false);
   private static final gcs bR = a(true);
   public static final gcs.a aW = a("lines", eys.o, eyz.b.a, 1536, gcs.b.a().a(ah).a(new gcr.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gcs.a aX = a(
      "line_strip", eys.o, eyz.b.b, 1536, gcs.b.a().a(ah).a(new gcr.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gcs.a> bS = ac.b(
      $$0 -> a("debug_line_strip", eys.n, eyz.b.d, 1536, gcs.b.a().a(o).a(new gcr.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gcs.a bT = a("debug_filled_box", eys.n, eyz.b.f, 1536, false, true, gcs.b.a().a(o).a(aI).a(h).a(false));
   private static final gcs.a bU = a("debug_quads", eys.n, eyz.b.h, 1536, false, true, gcs.b.a().a(o).a(h).a(ay).a(false));
   private static final gcs.a bV = a("debug_section_quads", eys.n, eyz.b.h, 1536, false, true, gcs.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gcs.a bW = a("gui", eys.n, eyz.b.h, 786432, gcs.b.a().a(ai).a(h).a(aB).a(false));
   private static final gcs.a bX = a("gui_overlay", eys.n, eyz.b.h, 1536, gcs.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gcs.a bY = a("gui_text_highlight", eys.n, eyz.b.h, 1536, gcs.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gcs.a bZ = a("gui_ghost_recipe_overlay", eys.n, eyz.b.h, 1536, gcs.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gcs> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eyz cb;
   private final eyz.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gcs> cg;

   public static gcs c() {
      return aZ;
   }

   public static gcs d() {
      return ba;
   }

   public static gcs e() {
      return bb;
   }

   private static gcs.b a(gcr.m $$0) {
      return gcs.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gcs f() {
      return bc;
   }

   private static gcs.b Q() {
      return gcs.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gcs g() {
      return bd;
   }

   private static gcs.a a(String $$0, akn $$1, boolean $$2) {
      gcs.b $$3 = gcs.b.a().a(u).a(new gcr.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, eys.k, eyz.b.h, 1536, true, false, $$3);
   }

   public static gcs a(akn $$0) {
      return be.apply($$0);
   }

   public static gcs b(akn $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gcs c(akn $$0) {
      return bf.apply($$0);
   }

   public static gcs d(akn $$0) {
      return bg.apply($$0);
   }

   public static gcs a(akn $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gcs e(akn $$0) {
      return a($$0, true);
   }

   public static gcs b(akn $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gcs f(akn $$0) {
      return b($$0, true);
   }

   public static gcs g(akn $$0) {
      return bj.apply($$0);
   }

   public static gcs h(akn $$0) {
      return bk.apply($$0);
   }

   public static gcs c(akn $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gcs i(akn $$0) {
      return c($$0, true);
   }

   public static gcs d(akn $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gcs j(akn $$0) {
      return d($$0, true);
   }

   public static gcs k(akn $$0) {
      return bn.apply($$0);
   }

   public static gcs e(akn $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gcs l(akn $$0) {
      return bp.apply($$0);
   }

   public static gcs m(akn $$0) {
      return bq.apply($$0);
   }

   public static gcs n(akn $$0) {
      return br.apply($$0);
   }

   public static gcs o(akn $$0) {
      return bs.apply($$0);
   }

   public static gcs p(akn $$0) {
      return bt.apply($$0, d);
   }

   public static gcs q(akn $$0) {
      return bm.apply($$0, false);
   }

   public static gcs a(akn $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         eys.k,
         eyz.b.h,
         1536,
         false,
         true,
         gcs.b.a().a(am).a(new gcr.n($$0, false, false)).a(new gcr.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gcs b(akn $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eys.k,
         eyz.b.h,
         1536,
         false,
         true,
         gcs.b.a().a(K).a(new gcr.n($$0, false, false)).a(new gcr.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gcs h() {
      return bu;
   }

   public static gcs i() {
      return bv;
   }

   public static gcs r(akn $$0) {
      return gcs.a.aY.apply($$0, ay);
   }

   public static gcs j() {
      return bw;
   }

   public static gcs k() {
      return bx;
   }

   public static gcs l() {
      return by;
   }

   public static gcs m() {
      return bz;
   }

   public static gcs n() {
      return bA;
   }

   public static gcs o() {
      return bB;
   }

   public static gcs p() {
      return bC;
   }

   public static gcs s(akn $$0) {
      return bD.apply($$0);
   }

   public static gcs t(akn $$0) {
      return bE.apply($$0);
   }

   public static gcs q() {
      return bF;
   }

   public static gcs u(akn $$0) {
      return bG.apply($$0);
   }

   public static gcs v(akn $$0) {
      return bH.apply($$0);
   }

   public static gcs w(akn $$0) {
      return bI.apply($$0);
   }

   public static gcs x(akn $$0) {
      return bJ.apply($$0);
   }

   public static gcs r() {
      return bK;
   }

   public static gcs y(akn $$0) {
      return bL.apply($$0);
   }

   public static gcs s() {
      return bM;
   }

   private static gcs.b R() {
      return gcs.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gcs t() {
      return bN;
   }

   public static gcs u() {
      return bO;
   }

   public static gcs v() {
      return bP;
   }

   private static gcs.a a(boolean $$0) {
      return a("clouds", eys.v, eyz.b.h, 786432, false, false, gcs.b.a().a(ag).a(new gcr.n(gci.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gcs w() {
      return bQ;
   }

   public static gcs x() {
      return bR;
   }

   public static gcs y() {
      return aW;
   }

   public static gcs z() {
      return aX;
   }

   public static gcs a(double $$0) {
      return bS.apply($$0);
   }

   public static gcs A() {
      return bT;
   }

   public static gcs B() {
      return bU;
   }

   public static gcs C() {
      return bV;
   }

   public static gcs D() {
      return bW;
   }

   public static gcs E() {
      return bX;
   }

   public static gcs F() {
      return bY;
   }

   public static gcs G() {
      return bZ;
   }

   public gcs(String $$0, eyz $$1, eyz.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gcs.a a(String $$0, eyz $$1, eyz.b $$2, int $$3, gcs.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gcs.a a(String $$0, eyz $$1, eyz.b $$2, int $$3, boolean $$4, boolean $$5, gcs.b $$6) {
      return new gcs.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(eyp $$0, ezc $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         eyp.b $$2 = $$0.d();
         this.a();
         eyq.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gcs> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eyz J() {
      return this.cb;
   }

   public eyz.b K() {
      return this.cc;
   }

   public Optional<gcs> L() {
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

   public Optional<gcs> P() {
      return this.cg;
   }

   static final class a extends gcs {
      static final BiFunction<akn, gcr.c, gcs> aY = ac.a(
         ($$0, $$1) -> gcs.a("outline", eys.r, eyz.b.h, 1536, gcs.b.a().a(N).a(new gcr.n($$0, false, false)).a($$1).a(az).a(aK).a(gcs.c.b))
      );
      private final gcs.b aZ;
      private final Optional<gcs> ba;
      private final boolean bb;

      a(String $$0, eyz $$1, eyz.b $$2, int $$3, boolean $$4, boolean $$5, gcs.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gcr::a), () -> $$6.o.forEach(gcr::b));
         this.aZ = $$6;
         this.ba = $$6.n == gcs.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gcs.c.b;
      }

      @Override
      public Optional<gcs> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gcs.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gcr.e a;
      private final gcr.m b;
      private final gcr.p c;
      private final gcr.d d;
      final gcr.c e;
      private final gcr.g f;
      private final gcr.l g;
      private final gcr.f h;
      private final gcr.k i;
      private final gcr.o j;
      private final gcr.q k;
      private final gcr.h l;
      private final gcr.b m;
      final gcs.c n;
      final ImmutableList<gcr> o;

      b(
         gcr.e $$0,
         gcr.m $$1,
         gcr.p $$2,
         gcr.d $$3,
         gcr.c $$4,
         gcr.g $$5,
         gcr.l $$6,
         gcr.f $$7,
         gcr.k $$8,
         gcr.o $$9,
         gcr.q $$10,
         gcr.h $$11,
         gcr.b $$12,
         gcs.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gcr[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gcs.b.a a() {
         return new gcs.b.a();
      }

      public static class a {
         private gcr.e a = gcr.ap;
         private gcr.m b = gcr.i;
         private gcr.p c;
         private gcr.d d;
         private gcr.c e;
         private gcr.g f;
         private gcr.l g;
         private gcr.f h;
         private gcr.k i;
         private gcr.o j;
         private gcr.q k;
         private gcr.h l;
         private gcr.b m;

         a() {
            this.c = gcr.c;
            this.d = gcr.aB;
            this.e = gcr.ax;
            this.f = gcr.au;
            this.g = gcr.aw;
            this.h = gcr.aG;
            this.i = gcr.aJ;
            this.j = gcr.aq;
            this.k = gcr.aD;
            this.l = gcr.aQ;
            this.m = gcr.aR;
         }

         public gcs.b.a a(gcr.e $$0) {
            this.a = $$0;
            return this;
         }

         public gcs.b.a a(gcr.m $$0) {
            this.b = $$0;
            return this;
         }

         public gcs.b.a a(gcr.p $$0) {
            this.c = $$0;
            return this;
         }

         public gcs.b.a a(gcr.d $$0) {
            this.d = $$0;
            return this;
         }

         public gcs.b.a a(gcr.c $$0) {
            this.e = $$0;
            return this;
         }

         public gcs.b.a a(gcr.g $$0) {
            this.f = $$0;
            return this;
         }

         public gcs.b.a a(gcr.l $$0) {
            this.g = $$0;
            return this;
         }

         public gcs.b.a a(gcr.f $$0) {
            this.h = $$0;
            return this;
         }

         public gcs.b.a a(gcr.k $$0) {
            this.i = $$0;
            return this;
         }

         public gcs.b.a a(gcr.o $$0) {
            this.j = $$0;
            return this;
         }

         public gcs.b.a a(gcr.q $$0) {
            this.k = $$0;
            return this;
         }

         public gcs.b.a a(gcr.h $$0) {
            this.l = $$0;
            return this;
         }

         public gcs.b.a a(gcr.b $$0) {
            this.m = $$0;
            return this;
         }

         public gcs.b a(boolean $$0) {
            return this.a($$0 ? gcs.c.c : gcs.c.a);
         }

         public gcs.b a(gcs.c $$0) {
            return new gcs.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
