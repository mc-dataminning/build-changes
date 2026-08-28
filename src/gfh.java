import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gfh extends gfg {
   private static final int aV = 1048576;
   public static final int aQ = 4194304;
   public static final int aR = 786432;
   public static final int aS = 1536;
   private static final gfh aW = a("solid", fbg.b, fbn.c.h, 4194304, true, false, gfh.b.a().a(aq).a(o).a(ak).a(true));
   private static final gfh aX = a("cutout_mipped", fbg.b, fbn.c.h, 4194304, true, false, gfh.b.a().a(aq).a(p).a(ak).a(true));
   private static final gfh aY = a("cutout", fbg.b, fbn.c.h, 786432, true, false, gfh.b.a().a(aq).a(q).a(al).a(true));
   private static final gfh aZ = a("translucent", fbg.b, fbn.c.h, 786432, true, true, a(r));
   private static final gfh ba = a("translucent_moving_block", fbg.b, fbn.c.h, 786432, false, true, R());
   private static final Function<akr, gfh> bb = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akr, gfh> bc = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(u).a(new gfg.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_solid", fbg.c, fbn.c.h, 1536, true, false, $$1);
   });
   private static final Function<akr, gfh> bd = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(v).a(new gfg.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_cutout", fbg.c, fbn.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akr, Boolean, gfh> be = ad.a(($$0, $$1) -> {
      gfh.b $$2 = gfh.b.a().a(w).a(new gfg.n($$0, false, false)).a(c).a(av).a(aq).a(as).a($$1);
      return a("entity_cutout_no_cull", fbg.c, fbn.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akr, Boolean, gfh> bf = ad.a(($$0, $$1) -> {
      gfh.b $$2 = gfh.b.a().a(x).a(new gfg.n($$0, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$1);
      return a("entity_cutout_no_cull_z_offset", fbg.c, fbn.c.h, 1536, true, false, $$2);
   });
   private static final Function<akr, gfh> bg = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(y).a(new gfg.n($$0, false, false)).a(h).a(aM).a(aq).a(as).a(gfg.aA).a(true);
      return a("item_entity_translucent_cull", fbg.c, fbn.c.h, 1536, true, true, $$1);
   });
   private static final Function<akr, gfh> bh = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(z).a(new gfg.n($$0, false, false)).a(h).a(aq).a(as).a(true);
      return a("entity_translucent_cull", fbg.c, fbn.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akr, Boolean, gfh> bi = ad.a(($$0, $$1) -> {
      gfh.b $$2 = gfh.b.a().a(A).a(new gfg.n($$0, false, false)).a(h).a(av).a(aq).a(as).a($$1);
      return a("entity_translucent", fbg.c, fbn.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akr, Boolean, gfh> bj = ad.a(($$0, $$1) -> {
      gfh.b $$2 = gfh.b.a().a(B).a(new gfg.n($$0, false, false)).a(h).a(av).a(aB).a(as).a($$1);
      return a("entity_translucent_emissive", fbg.c, fbn.c.h, 1536, true, true, $$2);
   });
   private static final Function<akr, gfh> bk = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(C).a(new gfg.n($$0, false, false)).a(av).a(aq).a(true);
      return a("entity_smooth_cutout", fbg.c, fbn.c.h, 1536, $$1);
   });
   private static final BiFunction<akr, Boolean, gfh> bl = ad.a(($$0, $$1) -> {
      gfh.b $$2 = gfh.b.a().a(D).a(new gfg.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aB : aA).a(false);
      return a("beacon_beam", fbg.b, fbn.c.h, 1536, false, true, $$2);
   });
   private static final Function<akr, gfh> bm = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(E).a(new gfg.n($$0, false, false)).a(ax).a(av).a(aq).a(as).a(false);
      return a("entity_decal", fbg.c, fbn.c.h, 1536, $$1);
   });
   private static final Function<akr, gfh> bn = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(F).a(new gfg.n($$0, false, false)).a(h).a(av).a(aq).a(as).a(aB).a(false);
      return a("entity_no_outline", fbg.c, fbn.c.h, 1536, false, true, $$1);
   });
   private static final Function<akr, gfh> bo = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(G).a(new gfg.n($$0, false, false)).a(h).a(au).a(aq).a(as).a(aB).a(ay).a(aF).a(false);
      return a("entity_shadow", fbg.c, fbn.c.h, 1536, false, false, $$1);
   });
   private static final Function<akr, gfh> bp = ad.b($$0 -> {
      gfh.b $$1 = gfh.b.a().a(H).a(new gfg.n($$0, false, false)).a(av).a(true);
      return a("entity_alpha", fbg.c, fbn.c.h, 1536, $$1);
   });
   private static final BiFunction<akr, gfg.p, gfh> bq = ad.a(($$0, $$1) -> {
      gfg.n $$2 = new gfg.n($$0, false, false);
      return a("eyes", fbg.c, fbn.c.h, 1536, false, true, gfh.b.a().a(I).a($$2).a($$1).a(aB).a(false));
   });
   private static final gfh br = a("leash", fbg.h, fbn.c.f, 1536, gfh.b.a().a(K).a(am).a(av).a(aq).a(false));
   private static final gfh bs = a("water_mask", fbg.e, fbn.c.h, 1536, gfh.b.a().a(L).a(am).a(aC).a(false));
   private static final gfh bt = a(
      "armor_entity_glint", fbg.i, fbn.c.h, 1536, gfh.b.a().a(N).a(new gfg.n(glh.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(aF).a(false)
   );
   private static final gfh bu = a(
      "glint_translucent", fbg.i, fbn.c.h, 1536, gfh.b.a().a(O).a(new gfg.n(glh.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(aM).a(false)
   );
   private static final gfh bv = a("glint", fbg.i, fbn.c.h, 1536, gfh.b.a().a(P).a(new gfg.n(glh.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(false));
   private static final gfh bw = a(
      "entity_glint", fbg.i, fbn.c.h, 1536, gfh.b.a().a(Q).a(new gfg.n(glh.a, true, false)).a(aB).a(av).a(ax).a(f).a(aM).a(ap).a(false)
   );
   private static final gfh bx = a(
      "entity_glint_direct", fbg.i, fbn.c.h, 1536, gfh.b.a().a(R).a(new gfg.n(glh.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(false)
   );
   private static final Function<akr, gfh> by = ad.b($$0 -> {
      gfg.n $$1 = new gfg.n($$0, false, false);
      return a("crumbling", fbg.b, fbn.c.h, 1536, false, true, gfh.b.a().a(S).a($$1).a(g).a(aB).a(aE).a(false));
   });
   private static final Function<akr, gfh> bz = ad.b(
      $$0 -> a("text", fbg.k, fbn.c.h, 786432, false, true, gfh.b.a().a(T).a(new gfg.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final gfh bA = a("text_background", fbg.h, fbn.c.h, 1536, false, true, gfh.b.a().a(U).a(am).a(h).a(aq).a(false));
   private static final Function<akr, gfh> bB = ad.b(
      $$0 -> a("text_intensity", fbg.k, fbn.c.h, 786432, false, true, gfh.b.a().a(V).a(new gfg.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final Function<akr, gfh> bC = ad.b(
      $$0 -> a("text_polygon_offset", fbg.k, fbn.c.h, 1536, false, true, gfh.b.a().a(T).a(new gfg.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akr, gfh> bD = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fbg.k, fbn.c.h, 1536, false, true, gfh.b.a().a(V).a(new gfg.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akr, gfh> bE = ad.b(
      $$0 -> a("text_see_through", fbg.k, fbn.c.h, 1536, false, true, gfh.b.a().a(W).a(new gfg.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gfh bF = a("text_background_see_through", fbg.h, fbn.c.h, 1536, false, true, gfh.b.a().a(X).a(am).a(h).a(aq).a(aw).a(aB).a(false));
   private static final Function<akr, gfh> bG = ad.b(
      $$0 -> a("text_intensity_see_through", fbg.k, fbn.c.h, 1536, false, true, gfh.b.a().a(Y).a(new gfg.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gfh bH = a("lightning", fbg.f, fbn.c.h, 1536, false, true, gfh.b.a().a(Z).a(aA).a(e).a(aK).a(false));
   private static final gfh bI = a("dragon_rays", fbg.f, fbn.c.e, 1536, false, false, gfh.b.a().a(Z).a(aB).a(e).a(false));
   private static final gfh bJ = a("dragon_rays_depth", fbg.e, fbn.c.e, 1536, false, false, gfh.b.a().a(gfg.k).a(aC).a(false));
   private static final gfh bK = a("tripwire", fbg.b, fbn.c.h, 1536, true, true, S());
   private static final gfh bL = a(
      "end_portal", fbg.e, fbn.c.h, 1536, false, false, gfh.b.a().a(ab).a(gfg.i.d().a(ghs.a, false, false).a(ghs.b, false, false).a()).a(false)
   );
   private static final gfh bM = a(
      "end_gateway", fbg.e, fbn.c.h, 1536, false, false, gfh.b.a().a(ac).a(gfg.i.d().a(ghs.a, false, false).a(ghs.b, false, false).a()).a(false)
   );
   private static final gfh bN = a(false);
   private static final gfh bO = a(true);
   public static final gfh.a aT = a("lines", fbg.g, fbn.c.a, 1536, gfh.b.a().a(ae).a(new gfg.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false));
   public static final gfh.a aU = a(
      "line_strip", fbg.g, fbn.c.b, 1536, gfh.b.a().a(ae).a(new gfg.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false)
   );
   private static final Function<Double, gfh.a> bP = ad.b(
      $$0 -> a("debug_line_strip", fbg.f, fbn.c.d, 1536, gfh.b.a().a(n).a(new gfg.h(OptionalDouble.of($$0))).a(c).a(av).a(false))
   );
   private static final gfh.a bQ = a("debug_filled_box", fbg.f, fbn.c.f, 1536, false, true, gfh.b.a().a(n).a(aF).a(h).a(false));
   private static final gfh.a bR = a("debug_quads", fbg.f, fbn.c.h, 1536, false, true, gfh.b.a().a(n).a(h).a(av).a(false));
   private static final gfh.a bS = a("debug_structure_quads", fbg.f, fbn.c.h, 1536, false, true, gfh.b.a().a(n).a(h).a(av).a(ay).a(aB).a(false));
   private static final gfh.a bT = a("debug_section_quads", fbg.f, fbn.c.h, 1536, false, true, gfh.b.a().a(n).a(aF).a(h).a(au).a(false));
   private static final gfh.a bU = a("gui", fbg.f, fbn.c.h, 786432, gfh.b.a().a(af).a(h).a(ay).a(false));
   private static final gfh.a bV = a("gui_overlay", fbg.f, fbn.c.h, 1536, gfh.b.a().a(ag).a(h).a(aw).a(aB).a(false));
   private static final gfh.a bW = a("gui_text_highlight", fbg.f, fbn.c.h, 1536, gfh.b.a().a(ah).a(h).a(aw).a(aP).a(false));
   private static final gfh.a bX = a("gui_ghost_recipe_overlay", fbg.f, fbn.c.h, 1536, gfh.b.a().a(ai).a(h).a(az).a(aB).a(false));
   private static final ImmutableList<gfh> bY = ImmutableList.of(c(), d(), e(), f(), t());
   private final fbn bZ;
   private final fbn.c ca;
   private final int cb;
   private final boolean cc;
   private final boolean cd;

   public static gfh c() {
      return aW;
   }

   public static gfh d() {
      return aX;
   }

   public static gfh e() {
      return aY;
   }

   private static gfh.b a(gfg.m $$0) {
      return gfh.b.a().a(aq).a($$0).a(ak).a(h).a(aI).a(true);
   }

   public static gfh f() {
      return aZ;
   }

   private static gfh.b R() {
      return gfh.b.a().a(aq).a(s).a(ak).a(h).a(aM).a(true);
   }

   public static gfh g() {
      return ba;
   }

   private static gfh.a a(String $$0, akr $$1, boolean $$2) {
      gfh.b $$3 = gfh.b.a().a(t).a(new gfg.n($$1, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$2 ? ax : ay).a(true);
      return a($$0, fbg.c, fbn.c.h, 1536, true, false, $$3);
   }

   public static gfh a(akr $$0) {
      return bb.apply($$0);
   }

   public static gfh b(akr $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gfh c(akr $$0) {
      return bc.apply($$0);
   }

   public static gfh d(akr $$0) {
      return bd.apply($$0);
   }

   public static gfh a(akr $$0, boolean $$1) {
      return be.apply($$0, $$1);
   }

   public static gfh e(akr $$0) {
      return a($$0, true);
   }

   public static gfh b(akr $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static gfh f(akr $$0) {
      return b($$0, true);
   }

   public static gfh g(akr $$0) {
      return bg.apply($$0);
   }

   public static gfh h(akr $$0) {
      return bh.apply($$0);
   }

   public static gfh c(akr $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gfh i(akr $$0) {
      return c($$0, true);
   }

   public static gfh d(akr $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gfh j(akr $$0) {
      return d($$0, true);
   }

   public static gfh k(akr $$0) {
      return bk.apply($$0);
   }

   public static gfh e(akr $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gfh l(akr $$0) {
      return bm.apply($$0);
   }

   public static gfh m(akr $$0) {
      return bn.apply($$0);
   }

   public static gfh n(akr $$0) {
      return bo.apply($$0);
   }

   public static gfh o(akr $$0) {
      return bp.apply($$0);
   }

   public static gfh p(akr $$0) {
      return bq.apply($$0, d);
   }

   public static gfh q(akr $$0) {
      return bj.apply($$0, false);
   }

   public static gfh a(akr $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fbg.c,
         fbn.c.h,
         1536,
         false,
         true,
         gfh.b.a().a(aj).a(new gfg.n($$0, false, false)).a(new gfg.j($$1, $$2)).a(h).a(av).a(aq).a(at).a(false)
      );
   }

   public static gfh b(akr $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fbg.c,
         fbn.c.h,
         1536,
         false,
         true,
         gfh.b.a().a(J).a(new gfg.n($$0, false, false)).a(new gfg.j($$1, $$2)).a(d).a(av).a(aq).a(as).a(false)
      );
   }

   public static gfh h() {
      return br;
   }

   public static gfh i() {
      return bs;
   }

   public static gfh r(akr $$0) {
      return gfh.a.aV.apply($$0, av);
   }

   public static gfh j() {
      return bt;
   }

   public static gfh k() {
      return bu;
   }

   public static gfh l() {
      return bv;
   }

   public static gfh m() {
      return bw;
   }

   public static gfh n() {
      return bx;
   }

   public static gfh s(akr $$0) {
      return by.apply($$0);
   }

   public static gfh t(akr $$0) {
      return bz.apply($$0);
   }

   public static gfh o() {
      return bA;
   }

   public static gfh u(akr $$0) {
      return bB.apply($$0);
   }

   public static gfh v(akr $$0) {
      return bC.apply($$0);
   }

   public static gfh w(akr $$0) {
      return bD.apply($$0);
   }

   public static gfh x(akr $$0) {
      return bE.apply($$0);
   }

   public static gfh p() {
      return bF;
   }

   public static gfh y(akr $$0) {
      return bG.apply($$0);
   }

   public static gfh q() {
      return bH;
   }

   public static gfh r() {
      return bI;
   }

   public static gfh s() {
      return bJ;
   }

   private static gfh.b S() {
      return gfh.b.a().a(aq).a(aa).a(ak).a(h).a(aK).a(true);
   }

   public static gfh t() {
      return bK;
   }

   public static gfh u() {
      return bL;
   }

   public static gfh v() {
      return bM;
   }

   private static gfh.a a(boolean $$0) {
      return a("clouds", fbg.m, fbn.c.h, 786432, false, false, gfh.b.a().a(ad).a(new gfg.n(gex.c, false, false)).a(h).a(av).a($$0 ? aC : aA).a(aL).a(true));
   }

   public static gfh w() {
      return bN;
   }

   public static gfh x() {
      return bO;
   }

   public static gfh y() {
      return aT;
   }

   public static gfh z() {
      return aU;
   }

   public static gfh a(double $$0) {
      return bP.apply($$0);
   }

   public static gfh A() {
      return bQ;
   }

   public static gfh B() {
      return bR;
   }

   public static gfh C() {
      return bS;
   }

   public static gfh D() {
      return bT;
   }

   public static gfh E() {
      return bU;
   }

   public static gfh F() {
      return bV;
   }

   public static gfh G() {
      return bW;
   }

   public static gfh H() {
      return bX;
   }

   public gfh(String $$0, fbn $$1, fbn.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bZ = $$1;
      this.ca = $$2;
      this.cb = $$3;
      this.cc = $$4;
      this.cd = $$5;
   }

   static gfh.a a(String $$0, fbn $$1, fbn.c $$2, int $$3, gfh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gfh.a a(String $$0, fbn $$1, fbn.c $$2, int $$3, boolean $$4, boolean $$5, gfh.b $$6) {
      return new gfh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fbh $$0) {
      this.a();
      fbe.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gfh> I() {
      return bY;
   }

   public int J() {
      return this.cb;
   }

   public fbn K() {
      return this.bZ;
   }

   public fbn.c L() {
      return this.ca;
   }

   public Optional<gfh> M() {
      return Optional.empty();
   }

   public boolean N() {
      return false;
   }

   public boolean O() {
      return this.cc;
   }

   public boolean P() {
      return !this.ca.l;
   }

   public boolean Q() {
      return this.cd;
   }

   static final class a extends gfh {
      static final BiFunction<akr, gfg.c, gfh> aV = ad.a(
         ($$0, $$1) -> gfh.a("outline", fbg.j, fbn.c.h, 1536, gfh.b.a().a(M).a(new gfg.n($$0, false, false)).a($$1).a(aw).a(aH).a(gfh.c.b))
      );
      private final gfh.b aW;
      private final Optional<gfh> aX;
      private final boolean aY;

      a(String $$0, fbn $$1, fbn.c $$2, int $$3, boolean $$4, boolean $$5, gfh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gfg::a), () -> $$6.o.forEach(gfg::b));
         this.aW = $$6;
         this.aX = $$6.n == gfh.c.c ? $$6.a.c().map($$1x -> aV.apply($$1x, $$6.e)) : Optional.empty();
         this.aY = $$6.n == gfh.c.b;
      }

      @Override
      public Optional<gfh> M() {
         return this.aX;
      }

      @Override
      public boolean N() {
         return this.aY;
      }

      protected final gfh.b R() {
         return this.aW;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aW + "]";
      }
   }

   protected static final class b {
      final gfg.e a;
      private final gfg.m b;
      private final gfg.p c;
      private final gfg.d d;
      final gfg.c e;
      private final gfg.g f;
      private final gfg.l g;
      private final gfg.f h;
      private final gfg.k i;
      private final gfg.o j;
      private final gfg.q k;
      private final gfg.h l;
      private final gfg.b m;
      final gfh.c n;
      final ImmutableList<gfg> o;

      b(
         gfg.e $$0,
         gfg.m $$1,
         gfg.p $$2,
         gfg.d $$3,
         gfg.c $$4,
         gfg.g $$5,
         gfg.l $$6,
         gfg.f $$7,
         gfg.k $$8,
         gfg.o $$9,
         gfg.q $$10,
         gfg.h $$11,
         gfg.b $$12,
         gfh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gfg[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gfh.b.a a() {
         return new gfh.b.a();
      }

      public static class a {
         private gfg.e a = gfg.am;
         private gfg.m b = gfg.i;
         private gfg.p c;
         private gfg.d d;
         private gfg.c e;
         private gfg.g f;
         private gfg.l g;
         private gfg.f h;
         private gfg.k i;
         private gfg.o j;
         private gfg.q k;
         private gfg.h l;
         private gfg.b m;

         a() {
            this.c = gfg.c;
            this.d = gfg.ay;
            this.e = gfg.au;
            this.f = gfg.ar;
            this.g = gfg.at;
            this.h = gfg.aD;
            this.i = gfg.aG;
            this.j = gfg.an;
            this.k = gfg.aA;
            this.l = gfg.aN;
            this.m = gfg.aO;
         }

         public gfh.b.a a(gfg.e $$0) {
            this.a = $$0;
            return this;
         }

         public gfh.b.a a(gfg.m $$0) {
            this.b = $$0;
            return this;
         }

         public gfh.b.a a(gfg.p $$0) {
            this.c = $$0;
            return this;
         }

         public gfh.b.a a(gfg.d $$0) {
            this.d = $$0;
            return this;
         }

         public gfh.b.a a(gfg.c $$0) {
            this.e = $$0;
            return this;
         }

         public gfh.b.a a(gfg.g $$0) {
            this.f = $$0;
            return this;
         }

         public gfh.b.a a(gfg.l $$0) {
            this.g = $$0;
            return this;
         }

         public gfh.b.a a(gfg.f $$0) {
            this.h = $$0;
            return this;
         }

         public gfh.b.a a(gfg.k $$0) {
            this.i = $$0;
            return this;
         }

         public gfh.b.a a(gfg.o $$0) {
            this.j = $$0;
            return this;
         }

         public gfh.b.a a(gfg.q $$0) {
            this.k = $$0;
            return this;
         }

         public gfh.b.a a(gfg.h $$0) {
            this.l = $$0;
            return this;
         }

         public gfh.b.a a(gfg.b $$0) {
            this.m = $$0;
            return this;
         }

         public gfh.b a(boolean $$0) {
            return this.a($$0 ? gfh.c.c : gfh.c.a);
         }

         public gfh.b a(gfh.c $$0) {
            return new gfh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
