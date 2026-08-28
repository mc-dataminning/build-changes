import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class glt extends gls {
   private static final int ba = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final glt bb = a("solid", fgo.b, fgv.c.h, 4194304, true, false, glt.b.a().a(at).a(t).a(an).a(true));
   private static final glt bc = a("cutout_mipped", fgo.b, fgv.c.h, 4194304, true, false, glt.b.a().a(at).a(u).a(an).a(true));
   private static final glt bd = a("cutout", fgo.b, fgv.c.h, 786432, true, false, glt.b.a().a(at).a(v).a(ao).a(true));
   private static final glt be = a("translucent", fgo.b, fgv.c.h, 786432, true, true, a(w));
   private static final glt bf = a("translucent_moving_block", fgo.b, fgv.c.h, 786432, false, true, V());
   private static final Function<alz, glt> bg = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alz, glt> bh = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(z).a(new gls.n($$0, bbi.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fgo.c, fgv.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glt> bi = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(z).a(new gls.n($$0, bbi.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fgo.c, fgv.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glt> bj = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(A).a(new gls.n($$0, bbi.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fgo.c, fgv.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alz, Boolean, glt> bk = ae.a(($$0, $$1) -> {
      glt.b $$2 = glt.b.a().a(B).a(new gls.n($$0, bbi.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fgo.c, fgv.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alz, Boolean, glt> bl = ae.a(($$0, $$1) -> {
      glt.b $$2 = glt.b.a().a(C).a(new gls.n($$0, bbi.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgo.c, fgv.c.h, 1536, true, false, $$2);
   });
   private static final Function<alz, glt> bm = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(D).a(new gls.n($$0, bbi.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fgo.c, fgv.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alz, Boolean, glt> bn = ae.a(($$0, $$1) -> {
      glt.b $$2 = glt.b.a().a(E).a(new gls.n($$0, bbi.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fgo.c, fgv.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alz, Boolean, glt> bo = ae.a(($$0, $$1) -> {
      glt.b $$2 = glt.b.a().a(F).a(new gls.n($$0, bbi.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fgo.c, fgv.c.h, 1536, true, true, $$2);
   });
   private static final Function<alz, glt> bp = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(G).a(new gls.n($$0, bbi.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fgo.c, fgv.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, Boolean, glt> bq = ae.a(($$0, $$1) -> {
      glt.b $$2 = glt.b.a().a(H).a(new gls.n($$0, bbi.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fgo.b, fgv.c.h, 1536, false, true, $$2);
   });
   private static final Function<alz, glt> br = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(I).a(new gls.n($$0, bbi.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fgo.c, fgv.c.h, 1536, $$1);
   });
   private static final Function<alz, glt> bs = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(J).a(new gls.n($$0, bbi.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fgo.c, fgv.c.h, 1536, false, true, $$1);
   });
   private static final Function<alz, glt> bt = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(K).a(new gls.n($$0, bbi.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fgo.c, fgv.c.h, 1536, false, false, $$1);
   });
   private static final Function<alz, glt> bu = ae.b($$0 -> {
      glt.b $$1 = glt.b.a().a(L).a(new gls.n($$0, bbi.b, false)).a(ay).a(true);
      return a("entity_alpha", fgo.c, fgv.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, gls.p, glt> bv = ae.a(($$0, $$1) -> {
      gls.n $$2 = new gls.n($$0, bbi.b, false);
      return a("eyes", fgo.c, fgv.c.h, 1536, false, true, glt.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final glt bw = a("leash", fgo.h, fgv.c.f, 1536, glt.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final glt bx = a("water_mask", fgo.e, fgv.c.h, 1536, glt.b.a().a(P).a(ap).a(aF).a(false));
   private static final glt by = a(
      "armor_entity_glint", fgo.i, fgv.c.h, 1536, glt.b.a().a(R).a(new gls.n(gsm.a, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final glt bz = a(
      "glint_translucent", fgo.i, fgv.c.h, 1536, glt.b.a().a(S).a(new gls.n(gsm.b, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final glt bA = a("glint", fgo.i, fgv.c.h, 1536, glt.b.a().a(T).a(new gls.n(gsm.b, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final glt bB = a("entity_glint", fgo.i, fgv.c.h, 1536, glt.b.a().a(U).a(new gls.n(gsm.a, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false));
   private static final Function<alz, glt> bC = ae.b($$0 -> {
      gls.n $$1 = new gls.n($$0, bbi.b, false);
      return a("crumbling", fgo.b, fgv.c.h, 1536, false, true, glt.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alz, glt> bD = ae.b(
      $$0 -> a("text", fgo.k, fgv.c.h, 786432, false, false, glt.b.a().a(W).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(false))
   );
   private static final glt bE = a("text_background", fgo.h, fgv.c.h, 1536, false, true, glt.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alz, glt> bF = ae.b(
      $$0 -> a("text_intensity", fgo.k, fgv.c.h, 786432, false, false, glt.b.a().a(Y).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(false))
   );
   private static final Function<alz, glt> bG = ae.b(
      $$0 -> a("text_polygon_offset", fgo.k, fgv.c.h, 1536, false, true, glt.b.a().a(W).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alz, glt> bH = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fgo.k, fgv.c.h, 1536, false, true, glt.b.a().a(Y).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alz, glt> bI = ae.b(
      $$0 -> a("text_see_through", fgo.k, fgv.c.h, 1536, false, false, glt.b.a().a(Z).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final glt bJ = a("text_background_see_through", fgo.h, fgv.c.h, 1536, false, true, glt.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alz, glt> bK = ae.b(
      $$0 -> a("text_intensity_see_through", fgo.k, fgv.c.h, 1536, false, true, glt.b.a().a(ab).a(new gls.n($$0, bbi.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final glt bL = a("lightning", fgo.f, fgv.c.h, 1536, false, true, glt.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final glt bM = a("dragon_rays", fgo.f, fgv.c.e, 1536, false, false, glt.b.a().a(ac).a(aE).a(e).a(false));
   private static final glt bN = a("dragon_rays_depth", fgo.e, fgv.c.e, 1536, false, false, glt.b.a().a(o).a(aF).a(false));
   private static final glt bO = a("tripwire", fgo.b, fgv.c.h, 1536, true, true, W());
   private static final glt bP = a(
      "end_portal", fgo.e, fgv.c.h, 1536, false, false, glt.b.a().a(ae).a(gls.i.d().a(gon.a, false, false).a(gon.b, false, false).a()).a(false)
   );
   private static final glt bQ = a(
      "end_gateway", fgo.e, fgv.c.h, 1536, false, false, glt.b.a().a(af).a(gls.i.d().a(gon.a, false, false).a(gon.b, false, false).a()).a(false)
   );
   private static final glt bR = a(false, false);
   private static final glt bS = a(false, true);
   private static final glt bT = a(true, true);
   public static final glt.a aX = a("lines", fgo.g, fgv.c.a, 1536, glt.b.a().a(ah).a(new gls.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final glt.a aY = a(
      "secondary_block_outline", fgo.g, fgv.c.a, 1536, glt.b.a().a(ah).a(new gls.h(OptionalDouble.of(7.0))).a(aI).a(gls.h).a(aQ).a(aE).a(ay).a(false)
   );
   public static final glt.a aZ = a(
      "line_strip", fgo.g, fgv.c.b, 1536, glt.b.a().a(ah).a(new gls.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, glt.a> bU = ae.b(
      $$0 -> a("debug_line_strip", fgo.f, fgv.c.d, 1536, glt.b.a().a(r).a(new gls.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final glt.a bV = a("debug_filled_box", fgo.f, fgv.c.f, 1536, false, true, glt.b.a().a(r).a(aI).a(h).a(false));
   private static final glt.a bW = a("debug_quads", fgo.f, fgv.c.h, 1536, false, true, glt.b.a().a(r).a(h).a(ay).a(false));
   private static final glt.a bX = a("debug_triangle_fan", fgo.f, fgv.c.g, 1536, false, true, glt.b.a().a(r).a(h).a(ay).a(false));
   private static final glt.a bY = a("debug_structure_quads", fgo.f, fgv.c.h, 1536, false, true, glt.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final glt.a bZ = a("debug_section_quads", fgo.f, fgv.c.h, 1536, false, true, glt.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final glt.a ca = a("gui", fgo.f, fgv.c.h, 786432, glt.b.a().a(ai).a(h).a(aB).a(false));
   private static final glt.a cb = a("gui_overlay", fgo.f, fgv.c.h, 1536, glt.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<alz, glt> cc = ae.b(
      $$0 -> a("gui_textured_overlay", fgo.j, fgv.c.h, 1536, glt.b.a().a(new gls.n($$0, bbi.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<alz, glt> cd = ae.b(
      $$0 -> a("gui_opaque_textured_background", fgo.j, fgv.c.h, 786432, glt.b.a().a(new gls.n($$0, bbi.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final glt.a ce = a("gui_nausea_overlay", fgo.j, fgv.c.h, 1536, glt.b.a().a(new gls.n(fnp.a, bbi.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final glt.a cf = a("gui_text_highlight", fgo.f, fgv.c.h, 1536, glt.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final glt.a cg = a("gui_ghost_recipe_overlay", fgo.f, fgv.c.h, 1536, glt.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<alz, glt> ch = ae.b(
      $$0 -> a("gui_textured", fgo.j, fgv.c.h, 786432, glt.b.a().a(new gls.n($$0, bbi.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<alz, glt> ci = ae.b(
      $$0 -> a("vignette", fgo.j, fgv.c.h, 786432, glt.b.a().a(new gls.n($$0, bbi.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<alz, glt> cj = ae.b(
      $$0 -> a("crosshair", fgo.j, fgv.c.h, 786432, glt.b.a().a(new gls.n($$0, bbi.b, false)).a(s).a(j).a(false))
   );
   private static final glt.a ck = a("mojang_logo", fgo.j, fgv.c.h, 786432, glt.b.a().a(new gls.n(ftm.a, bbi.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<glt> cl = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgv cm;
   private final fgv.c cn;
   private final int co;
   private final boolean cp;
   private final boolean cq;

   public static glt c() {
      return bb;
   }

   public static glt d() {
      return bc;
   }

   public static glt e() {
      return bd;
   }

   private static glt.b a(gls.m $$0) {
      return glt.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static glt f() {
      return be;
   }

   private static glt.b V() {
      return glt.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static glt g() {
      return bf;
   }

   private static glt.a a(String $$0, alz $$1, boolean $$2) {
      glt.b $$3 = glt.b.a().a(y).a(new gls.n($$1, bbi.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fgo.c, fgv.c.h, 1536, true, false, $$3);
   }

   public static glt a(alz $$0) {
      return bg.apply($$0);
   }

   public static glt b(alz $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static glt c(alz $$0) {
      return bh.apply($$0);
   }

   public static glt d(alz $$0) {
      return bi.apply($$0);
   }

   public static glt e(alz $$0) {
      return bj.apply($$0);
   }

   public static glt a(alz $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static glt f(alz $$0) {
      return a($$0, true);
   }

   public static glt b(alz $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static glt g(alz $$0) {
      return b($$0, true);
   }

   public static glt h(alz $$0) {
      return bm.apply($$0);
   }

   public static glt c(alz $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static glt i(alz $$0) {
      return c($$0, true);
   }

   public static glt d(alz $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static glt j(alz $$0) {
      return d($$0, true);
   }

   public static glt k(alz $$0) {
      return bp.apply($$0);
   }

   public static glt e(alz $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static glt l(alz $$0) {
      return br.apply($$0);
   }

   public static glt m(alz $$0) {
      return bs.apply($$0);
   }

   public static glt n(alz $$0) {
      return bt.apply($$0);
   }

   public static glt o(alz $$0) {
      return bu.apply($$0);
   }

   public static glt p(alz $$0) {
      return bv.apply($$0, h);
   }

   public static glt q(alz $$0) {
      return bo.apply($$0, false);
   }

   public static glt a(alz $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgo.c,
         fgv.c.h,
         1536,
         false,
         true,
         glt.b.a().a(am).a(new gls.n($$0, bbi.b, false)).a(new gls.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static glt b(alz $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgo.c,
         fgv.c.h,
         1536,
         false,
         true,
         glt.b.a().a(N).a(new gls.n($$0, bbi.b, false)).a(new gls.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static glt h() {
      return bw;
   }

   public static glt i() {
      return bx;
   }

   public static glt r(alz $$0) {
      return glt.a.ba.apply($$0, ay);
   }

   public static glt j() {
      return by;
   }

   public static glt k() {
      return bz;
   }

   public static glt l() {
      return bA;
   }

   public static glt m() {
      return bB;
   }

   public static glt s(alz $$0) {
      return bC.apply($$0);
   }

   public static glt t(alz $$0) {
      return bD.apply($$0);
   }

   public static glt n() {
      return bE;
   }

   public static glt u(alz $$0) {
      return bF.apply($$0);
   }

   public static glt v(alz $$0) {
      return bG.apply($$0);
   }

   public static glt w(alz $$0) {
      return bH.apply($$0);
   }

   public static glt x(alz $$0) {
      return bI.apply($$0);
   }

   public static glt o() {
      return bJ;
   }

   public static glt y(alz $$0) {
      return bK.apply($$0);
   }

   public static glt p() {
      return bL;
   }

   public static glt q() {
      return bM;
   }

   public static glt r() {
      return bN;
   }

   private static glt.b W() {
      return glt.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static glt s() {
      return bO;
   }

   public static glt t() {
      return bP;
   }

   public static glt u() {
      return bQ;
   }

   private static glt.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgo.f, fgv.c.h, 786432, false, false, glt.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static glt v() {
      return bR;
   }

   public static glt w() {
      return bS;
   }

   public static glt x() {
      return bT;
   }

   public static glt y() {
      return aX;
   }

   public static glt z() {
      return aY;
   }

   public static glt A() {
      return aZ;
   }

   public static glt a(double $$0) {
      return bU.apply($$0);
   }

   public static glt B() {
      return bV;
   }

   public static glt C() {
      return bW;
   }

   public static glt D() {
      return bX;
   }

   public static glt E() {
      return bY;
   }

   public static glt F() {
      return bZ;
   }

   public static glt G() {
      return ca;
   }

   public static glt H() {
      return cb;
   }

   public static glt z(alz $$0) {
      return cc.apply($$0);
   }

   public static glt A(alz $$0) {
      return cd.apply($$0);
   }

   public static glt I() {
      return ce;
   }

   public static glt J() {
      return cf;
   }

   public static glt K() {
      return cg;
   }

   public static glt B(alz $$0) {
      return ch.apply($$0);
   }

   public static glt C(alz $$0) {
      return ci.apply($$0);
   }

   public static glt D(alz $$0) {
      return cj.apply($$0);
   }

   public static glt L() {
      return ck;
   }

   public glt(String $$0, fgv $$1, fgv.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cm = $$1;
      this.cn = $$2;
      this.co = $$3;
      this.cp = $$4;
      this.cq = $$5;
   }

   static glt.a a(String $$0, fgv $$1, fgv.c $$2, int $$3, glt.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static glt.a a(String $$0, fgv $$1, fgv.c $$2, int $$3, boolean $$4, boolean $$5, glt.b $$6) {
      return new glt.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fgp $$0) {
      this.a();
      fgm.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<glt> M() {
      return cl;
   }

   public int N() {
      return this.co;
   }

   public fgv O() {
      return this.cm;
   }

   public fgv.c P() {
      return this.cn;
   }

   public Optional<glt> Q() {
      return Optional.empty();
   }

   public boolean R() {
      return false;
   }

   public boolean S() {
      return this.cp;
   }

   public boolean T() {
      return !this.cn.l;
   }

   public boolean U() {
      return this.cq;
   }

   static final class a extends glt {
      static final BiFunction<alz, gls.c, glt> ba = ae.a(
         ($$0, $$1) -> glt.a("outline", fgo.j, fgv.c.h, 1536, glt.b.a().a(Q).a(new gls.n($$0, bbi.b, false)).a($$1).a(az).a(aL).a(glt.c.b))
      );
      private final glt.b bb;
      private final Optional<glt> bc;
      private final boolean bd;

      a(String $$0, fgv $$1, fgv.c $$2, int $$3, boolean $$4, boolean $$5, glt.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gls::a), () -> $$6.o.forEach(gls::b));
         this.bb = $$6;
         this.bc = $$6.n == glt.c.c ? $$6.a.c().map($$1x -> ba.apply($$1x, $$6.e)) : Optional.empty();
         this.bd = $$6.n == glt.c.b;
      }

      @Override
      public Optional<glt> Q() {
         return this.bc;
      }

      @Override
      public boolean R() {
         return this.bd;
      }

      protected final glt.b V() {
         return this.bb;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bb + "]";
      }
   }

   protected static final class b {
      final gls.e a;
      private final gls.m b;
      private final gls.p c;
      private final gls.d d;
      final gls.c e;
      private final gls.g f;
      private final gls.l g;
      private final gls.f h;
      private final gls.k i;
      private final gls.o j;
      private final gls.q k;
      private final gls.h l;
      private final gls.b m;
      final glt.c n;
      final ImmutableList<gls> o;

      b(
         gls.e $$0,
         gls.m $$1,
         gls.p $$2,
         gls.d $$3,
         gls.c $$4,
         gls.g $$5,
         gls.l $$6,
         gls.f $$7,
         gls.k $$8,
         gls.o $$9,
         gls.q $$10,
         gls.h $$11,
         gls.b $$12,
         glt.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gls[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static glt.b.a a() {
         return new glt.b.a();
      }

      public static class a {
         private gls.e a = gls.ap;
         private gls.m b = gls.m;
         private gls.p c;
         private gls.d d;
         private gls.c e;
         private gls.g f;
         private gls.l g;
         private gls.f h;
         private gls.k i;
         private gls.o j;
         private gls.q k;
         private gls.h l;
         private gls.b m;

         a() {
            this.c = gls.c;
            this.d = gls.aB;
            this.e = gls.ax;
            this.f = gls.au;
            this.g = gls.aw;
            this.h = gls.aG;
            this.i = gls.aK;
            this.j = gls.aq;
            this.k = gls.aD;
            this.l = gls.aR;
            this.m = gls.aS;
         }

         public glt.b.a a(gls.e $$0) {
            this.a = $$0;
            return this;
         }

         public glt.b.a a(gls.m $$0) {
            this.b = $$0;
            return this;
         }

         public glt.b.a a(gls.p $$0) {
            this.c = $$0;
            return this;
         }

         public glt.b.a a(gls.d $$0) {
            this.d = $$0;
            return this;
         }

         public glt.b.a a(gls.c $$0) {
            this.e = $$0;
            return this;
         }

         public glt.b.a a(gls.g $$0) {
            this.f = $$0;
            return this;
         }

         public glt.b.a a(gls.l $$0) {
            this.g = $$0;
            return this;
         }

         public glt.b.a a(gls.f $$0) {
            this.h = $$0;
            return this;
         }

         public glt.b.a a(gls.k $$0) {
            this.i = $$0;
            return this;
         }

         public glt.b.a a(gls.o $$0) {
            this.j = $$0;
            return this;
         }

         public glt.b.a a(gls.q $$0) {
            this.k = $$0;
            return this;
         }

         public glt.b.a a(gls.h $$0) {
            this.l = $$0;
            return this;
         }

         public glt.b.a a(gls.b $$0) {
            this.m = $$0;
            return this;
         }

         public glt.b a(boolean $$0) {
            return this.a($$0 ? glt.c.c : glt.c.a);
         }

         public glt.b a(glt.c $$0) {
            return new glt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
