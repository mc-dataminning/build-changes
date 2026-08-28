import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gig extends gif {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final gig ba = a("solid", fdr.b, fdy.c.h, 4194304, true, false, gig.b.a().a(at).a(t).a(an).a(true));
   private static final gig bb = a("cutout_mipped", fdr.b, fdy.c.h, 4194304, true, false, gig.b.a().a(at).a(u).a(an).a(true));
   private static final gig bc = a("cutout", fdr.b, fdy.c.h, 786432, true, false, gig.b.a().a(at).a(v).a(ao).a(true));
   private static final gig bd = a("translucent", fdr.b, fdy.c.h, 786432, true, true, a(w));
   private static final gig be = a("translucent_moving_block", fdr.b, fdy.c.h, 786432, false, true, U());
   private static final Function<alh, gig> bf = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alh, gig> bg = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(z).a(new gif.n($$0, bam.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fdr.c, fdy.c.h, 1536, true, false, $$1);
   });
   private static final Function<alh, gig> bh = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(z).a(new gif.n($$0, bam.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fdr.c, fdy.c.h, 1536, true, false, $$1);
   });
   private static final Function<alh, gig> bi = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(A).a(new gif.n($$0, bam.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fdr.c, fdy.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alh, Boolean, gig> bj = ad.a(($$0, $$1) -> {
      gig.b $$2 = gig.b.a().a(B).a(new gif.n($$0, bam.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fdr.c, fdy.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alh, Boolean, gig> bk = ad.a(($$0, $$1) -> {
      gig.b $$2 = gig.b.a().a(C).a(new gif.n($$0, bam.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fdr.c, fdy.c.h, 1536, true, false, $$2);
   });
   private static final Function<alh, gig> bl = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(D).a(new gif.n($$0, bam.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fdr.c, fdy.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alh, Boolean, gig> bm = ad.a(($$0, $$1) -> {
      gig.b $$2 = gig.b.a().a(E).a(new gif.n($$0, bam.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fdr.c, fdy.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alh, Boolean, gig> bn = ad.a(($$0, $$1) -> {
      gig.b $$2 = gig.b.a().a(F).a(new gif.n($$0, bam.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fdr.c, fdy.c.h, 1536, true, true, $$2);
   });
   private static final Function<alh, gig> bo = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(G).a(new gif.n($$0, bam.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fdr.c, fdy.c.h, 1536, $$1);
   });
   private static final BiFunction<alh, Boolean, gig> bp = ad.a(($$0, $$1) -> {
      gig.b $$2 = gig.b.a().a(H).a(new gif.n($$0, bam.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fdr.b, fdy.c.h, 1536, false, true, $$2);
   });
   private static final Function<alh, gig> bq = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(I).a(new gif.n($$0, bam.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fdr.c, fdy.c.h, 1536, $$1);
   });
   private static final Function<alh, gig> br = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(J).a(new gif.n($$0, bam.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fdr.c, fdy.c.h, 1536, false, true, $$1);
   });
   private static final Function<alh, gig> bs = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(K).a(new gif.n($$0, bam.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fdr.c, fdy.c.h, 1536, false, false, $$1);
   });
   private static final Function<alh, gig> bt = ad.b($$0 -> {
      gig.b $$1 = gig.b.a().a(L).a(new gif.n($$0, bam.b, false)).a(ay).a(true);
      return a("entity_alpha", fdr.c, fdy.c.h, 1536, $$1);
   });
   private static final BiFunction<alh, gif.p, gig> bu = ad.a(($$0, $$1) -> {
      gif.n $$2 = new gif.n($$0, bam.b, false);
      return a("eyes", fdr.c, fdy.c.h, 1536, false, true, gig.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final gig bv = a("leash", fdr.h, fdy.c.f, 1536, gig.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final gig bw = a("water_mask", fdr.e, fdy.c.h, 1536, gig.b.a().a(P).a(ap).a(aF).a(false));
   private static final gig bx = a(
      "armor_entity_glint", fdr.i, fdy.c.h, 1536, gig.b.a().a(R).a(new gif.n(gox.a, bam.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gig by = a(
      "glint_translucent", fdr.i, fdy.c.h, 1536, gig.b.a().a(S).a(new gif.n(gox.b, bam.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final gig bz = a("glint", fdr.i, fdy.c.h, 1536, gig.b.a().a(T).a(new gif.n(gox.b, bam.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gig bA = a(
      "entity_glint", fdr.i, fdy.c.h, 1536, gig.b.a().a(U).a(new gif.n(gox.a, bam.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<alh, gig> bB = ad.b($$0 -> {
      gif.n $$1 = new gif.n($$0, bam.b, false);
      return a("crumbling", fdr.b, fdy.c.h, 1536, false, true, gig.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alh, gig> bC = ad.b(
      $$0 -> a("text", fdr.k, fdy.c.h, 786432, false, false, gig.b.a().a(W).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(false))
   );
   private static final gig bD = a("text_background", fdr.h, fdy.c.h, 1536, false, true, gig.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alh, gig> bE = ad.b(
      $$0 -> a("text_intensity", fdr.k, fdy.c.h, 786432, false, true, gig.b.a().a(Y).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(false))
   );
   private static final Function<alh, gig> bF = ad.b(
      $$0 -> a("text_polygon_offset", fdr.k, fdy.c.h, 1536, false, true, gig.b.a().a(W).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alh, gig> bG = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fdr.k, fdy.c.h, 1536, false, true, gig.b.a().a(Y).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alh, gig> bH = ad.b(
      $$0 -> a("text_see_through", fdr.k, fdy.c.h, 1536, false, true, gig.b.a().a(Z).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gig bI = a("text_background_see_through", fdr.h, fdy.c.h, 1536, false, true, gig.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alh, gig> bJ = ad.b(
      $$0 -> a("text_intensity_see_through", fdr.k, fdy.c.h, 1536, false, true, gig.b.a().a(ab).a(new gif.n($$0, bam.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gig bK = a("lightning", fdr.f, fdy.c.h, 1536, false, true, gig.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final gig bL = a("dragon_rays", fdr.f, fdy.c.e, 1536, false, false, gig.b.a().a(ac).a(aE).a(e).a(false));
   private static final gig bM = a("dragon_rays_depth", fdr.e, fdy.c.e, 1536, false, false, gig.b.a().a(o).a(aF).a(false));
   private static final gig bN = a("tripwire", fdr.b, fdy.c.h, 1536, true, true, V());
   private static final gig bO = a(
      "end_portal", fdr.e, fdy.c.h, 1536, false, false, gig.b.a().a(ae).a(gif.i.d().a(gla.a, false, false).a(gla.b, false, false).a()).a(false)
   );
   private static final gig bP = a(
      "end_gateway", fdr.e, fdy.c.h, 1536, false, false, gig.b.a().a(af).a(gif.i.d().a(gla.a, false, false).a(gla.b, false, false).a()).a(false)
   );
   private static final gig bQ = a(false, false);
   private static final gig bR = a(false, true);
   private static final gig bS = a(true, true);
   public static final gig.a aX = a("lines", fdr.g, fdy.c.a, 1536, gig.b.a().a(ah).a(new gif.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final gig.a aY = a(
      "line_strip", fdr.g, fdy.c.b, 1536, gig.b.a().a(ah).a(new gif.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gig.a> bT = ad.b(
      $$0 -> a("debug_line_strip", fdr.f, fdy.c.d, 1536, gig.b.a().a(r).a(new gif.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gig.a bU = a("debug_filled_box", fdr.f, fdy.c.f, 1536, false, true, gig.b.a().a(r).a(aI).a(h).a(false));
   private static final gig.a bV = a("debug_quads", fdr.f, fdy.c.h, 1536, false, true, gig.b.a().a(r).a(h).a(ay).a(false));
   private static final gig.a bW = a("debug_triangle_fan", fdr.f, fdy.c.g, 1536, false, true, gig.b.a().a(r).a(h).a(ay).a(false));
   private static final gig.a bX = a("debug_structure_quads", fdr.f, fdy.c.h, 1536, false, true, gig.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final gig.a bY = a("debug_section_quads", fdr.f, fdy.c.h, 1536, false, true, gig.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final gig.a bZ = a("gui", fdr.f, fdy.c.h, 786432, gig.b.a().a(ai).a(h).a(aB).a(false));
   private static final gig.a ca = a("gui_overlay", fdr.f, fdy.c.h, 1536, gig.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<alh, gig> cb = ad.b(
      $$0 -> a("gui_textured_overlay", fdr.j, fdy.c.h, 1536, gig.b.a().a(new gif.n($$0, bam.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<alh, gig> cc = ad.b(
      $$0 -> a("gui_opaque_textured_background", fdr.j, fdy.c.h, 786432, gig.b.a().a(new gif.n($$0, bam.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final gig.a cd = a("gui_nausea_overlay", fdr.j, fdy.c.h, 1536, gig.b.a().a(new gif.n(fkl.a, bam.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final gig.a ce = a("gui_text_highlight", fdr.f, fdy.c.h, 1536, gig.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final gig.a cf = a("gui_ghost_recipe_overlay", fdr.f, fdy.c.h, 1536, gig.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<alh, gig> cg = ad.b(
      $$0 -> a("gui_textured", fdr.j, fdy.c.h, 786432, gig.b.a().a(new gif.n($$0, bam.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<alh, gig> ch = ad.b(
      $$0 -> a("vignette", fdr.j, fdy.c.h, 786432, gig.b.a().a(new gif.n($$0, bam.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<alh, gig> ci = ad.b(
      $$0 -> a("crosshair", fdr.j, fdy.c.h, 786432, gig.b.a().a(new gif.n($$0, bam.b, false)).a(s).a(j).a(false))
   );
   private static final gig.a cj = a("mojang_logo", fdr.j, fdy.c.h, 786432, gig.b.a().a(new gif.n(fqi.a, bam.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<gig> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final fdy cl;
   private final fdy.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static gig c() {
      return ba;
   }

   public static gig d() {
      return bb;
   }

   public static gig e() {
      return bc;
   }

   private static gig.b a(gif.m $$0) {
      return gig.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static gig f() {
      return bd;
   }

   private static gig.b U() {
      return gig.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static gig g() {
      return be;
   }

   private static gig.a a(String $$0, alh $$1, boolean $$2) {
      gig.b $$3 = gig.b.a().a(y).a(new gif.n($$1, bam.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fdr.c, fdy.c.h, 1536, true, false, $$3);
   }

   public static gig a(alh $$0) {
      return bf.apply($$0);
   }

   public static gig b(alh $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gig c(alh $$0) {
      return bg.apply($$0);
   }

   public static gig d(alh $$0) {
      return bh.apply($$0);
   }

   public static gig e(alh $$0) {
      return bi.apply($$0);
   }

   public static gig a(alh $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gig f(alh $$0) {
      return a($$0, true);
   }

   public static gig b(alh $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static gig g(alh $$0) {
      return b($$0, true);
   }

   public static gig h(alh $$0) {
      return bl.apply($$0);
   }

   public static gig c(alh $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gig i(alh $$0) {
      return c($$0, true);
   }

   public static gig d(alh $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static gig j(alh $$0) {
      return d($$0, true);
   }

   public static gig k(alh $$0) {
      return bo.apply($$0);
   }

   public static gig e(alh $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gig l(alh $$0) {
      return bq.apply($$0);
   }

   public static gig m(alh $$0) {
      return br.apply($$0);
   }

   public static gig n(alh $$0) {
      return bs.apply($$0);
   }

   public static gig o(alh $$0) {
      return bt.apply($$0);
   }

   public static gig p(alh $$0) {
      return bu.apply($$0, d);
   }

   public static gig q(alh $$0) {
      return bn.apply($$0, false);
   }

   public static gig a(alh $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fdr.c,
         fdy.c.h,
         1536,
         false,
         true,
         gig.b.a().a(am).a(new gif.n($$0, bam.b, false)).a(new gif.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gig b(alh $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fdr.c,
         fdy.c.h,
         1536,
         false,
         true,
         gig.b.a().a(N).a(new gif.n($$0, bam.b, false)).a(new gif.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gig h() {
      return bv;
   }

   public static gig i() {
      return bw;
   }

   public static gig r(alh $$0) {
      return gig.a.aZ.apply($$0, ay);
   }

   public static gig j() {
      return bx;
   }

   public static gig k() {
      return by;
   }

   public static gig l() {
      return bz;
   }

   public static gig m() {
      return bA;
   }

   public static gig s(alh $$0) {
      return bB.apply($$0);
   }

   public static gig t(alh $$0) {
      return bC.apply($$0);
   }

   public static gig n() {
      return bD;
   }

   public static gig u(alh $$0) {
      return bE.apply($$0);
   }

   public static gig v(alh $$0) {
      return bF.apply($$0);
   }

   public static gig w(alh $$0) {
      return bG.apply($$0);
   }

   public static gig x(alh $$0) {
      return bH.apply($$0);
   }

   public static gig o() {
      return bI;
   }

   public static gig y(alh $$0) {
      return bJ.apply($$0);
   }

   public static gig p() {
      return bK;
   }

   public static gig q() {
      return bL;
   }

   public static gig r() {
      return bM;
   }

   private static gig.b V() {
      return gig.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static gig s() {
      return bN;
   }

   public static gig t() {
      return bO;
   }

   public static gig u() {
      return bP;
   }

   private static gig.a a(boolean $$0, boolean $$1) {
      return a("clouds", fdr.f, fdy.c.h, 786432, false, false, gig.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static gig v() {
      return bQ;
   }

   public static gig w() {
      return bR;
   }

   public static gig x() {
      return bS;
   }

   public static gig y() {
      return aX;
   }

   public static gig z() {
      return aY;
   }

   public static gig a(double $$0) {
      return bT.apply($$0);
   }

   public static gig A() {
      return bU;
   }

   public static gig B() {
      return bV;
   }

   public static gig C() {
      return bW;
   }

   public static gig D() {
      return bX;
   }

   public static gig E() {
      return bY;
   }

   public static gig F() {
      return bZ;
   }

   public static gig G() {
      return ca;
   }

   public static gig z(alh $$0) {
      return cb.apply($$0);
   }

   public static gig A(alh $$0) {
      return cc.apply($$0);
   }

   public static gig H() {
      return cd;
   }

   public static gig I() {
      return ce;
   }

   public static gig J() {
      return cf;
   }

   public static gig B(alh $$0) {
      return cg.apply($$0);
   }

   public static gig C(alh $$0) {
      return ch.apply($$0);
   }

   public static gig D(alh $$0) {
      return ci.apply($$0);
   }

   public static gig K() {
      return cj;
   }

   public gig(String $$0, fdy $$1, fdy.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static gig.a a(String $$0, fdy $$1, fdy.c $$2, int $$3, gig.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gig.a a(String $$0, fdy $$1, fdy.c $$2, int $$3, boolean $$4, boolean $$5, gig.b $$6) {
      return new gig.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fds $$0) {
      this.a();
      fdp.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gig> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public fdy N() {
      return this.cl;
   }

   public fdy.c O() {
      return this.cm;
   }

   public Optional<gig> P() {
      return Optional.empty();
   }

   public boolean Q() {
      return false;
   }

   public boolean R() {
      return this.co;
   }

   public boolean S() {
      return !this.cm.l;
   }

   public boolean T() {
      return this.cp;
   }

   static final class a extends gig {
      static final BiFunction<alh, gif.c, gig> aZ = ad.a(
         ($$0, $$1) -> gig.a("outline", fdr.j, fdy.c.h, 1536, gig.b.a().a(Q).a(new gif.n($$0, bam.b, false)).a($$1).a(az).a(aL).a(gig.c.b))
      );
      private final gig.b ba;
      private final Optional<gig> bb;
      private final boolean bc;

      a(String $$0, fdy $$1, fdy.c $$2, int $$3, boolean $$4, boolean $$5, gig.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gif::a), () -> $$6.o.forEach(gif::b));
         this.ba = $$6;
         this.bb = $$6.n == gig.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == gig.c.b;
      }

      @Override
      public Optional<gig> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final gig.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final gif.e a;
      private final gif.m b;
      private final gif.p c;
      private final gif.d d;
      final gif.c e;
      private final gif.g f;
      private final gif.l g;
      private final gif.f h;
      private final gif.k i;
      private final gif.o j;
      private final gif.q k;
      private final gif.h l;
      private final gif.b m;
      final gig.c n;
      final ImmutableList<gif> o;

      b(
         gif.e $$0,
         gif.m $$1,
         gif.p $$2,
         gif.d $$3,
         gif.c $$4,
         gif.g $$5,
         gif.l $$6,
         gif.f $$7,
         gif.k $$8,
         gif.o $$9,
         gif.q $$10,
         gif.h $$11,
         gif.b $$12,
         gig.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gif[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gig.b.a a() {
         return new gig.b.a();
      }

      public static class a {
         private gif.e a = gif.ap;
         private gif.m b = gif.m;
         private gif.p c;
         private gif.d d;
         private gif.c e;
         private gif.g f;
         private gif.l g;
         private gif.f h;
         private gif.k i;
         private gif.o j;
         private gif.q k;
         private gif.h l;
         private gif.b m;

         a() {
            this.c = gif.c;
            this.d = gif.aB;
            this.e = gif.ax;
            this.f = gif.au;
            this.g = gif.aw;
            this.h = gif.aG;
            this.i = gif.aK;
            this.j = gif.aq;
            this.k = gif.aD;
            this.l = gif.aR;
            this.m = gif.aS;
         }

         public gig.b.a a(gif.e $$0) {
            this.a = $$0;
            return this;
         }

         public gig.b.a a(gif.m $$0) {
            this.b = $$0;
            return this;
         }

         public gig.b.a a(gif.p $$0) {
            this.c = $$0;
            return this;
         }

         public gig.b.a a(gif.d $$0) {
            this.d = $$0;
            return this;
         }

         public gig.b.a a(gif.c $$0) {
            this.e = $$0;
            return this;
         }

         public gig.b.a a(gif.g $$0) {
            this.f = $$0;
            return this;
         }

         public gig.b.a a(gif.l $$0) {
            this.g = $$0;
            return this;
         }

         public gig.b.a a(gif.f $$0) {
            this.h = $$0;
            return this;
         }

         public gig.b.a a(gif.k $$0) {
            this.i = $$0;
            return this;
         }

         public gig.b.a a(gif.o $$0) {
            this.j = $$0;
            return this;
         }

         public gig.b.a a(gif.q $$0) {
            this.k = $$0;
            return this;
         }

         public gig.b.a a(gif.h $$0) {
            this.l = $$0;
            return this;
         }

         public gig.b.a a(gif.b $$0) {
            this.m = $$0;
            return this;
         }

         public gig.b a(boolean $$0) {
            return this.a($$0 ? gig.c.c : gig.c.a);
         }

         public gig.b a(gig.c $$0) {
            return new gig.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
