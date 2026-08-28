import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class glu extends glt {
   private static final int bb = 1048576;
   public static final int aV = 4194304;
   public static final int aW = 786432;
   public static final int aX = 1536;
   private static final glu bc = a("solid", fgp.b, fgw.c.h, 4194304, true, false, glu.b.a().a(au).a(t).a(ao).a(true));
   private static final glu bd = a("cutout_mipped", fgp.b, fgw.c.h, 4194304, true, false, glu.b.a().a(au).a(u).a(ao).a(true));
   private static final glu be = a("cutout", fgp.b, fgw.c.h, 786432, true, false, glu.b.a().a(au).a(v).a(ap).a(true));
   private static final glu bf = a("translucent", fgp.b, fgw.c.h, 786432, true, true, a(w));
   private static final glu bg = a("translucent_moving_block", fgp.b, fgw.c.h, 786432, false, true, V());
   private static final Function<alz, glu> bh = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alz, glu> bi = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(z).a(new glt.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a(aJ).a(true);
      return a("armor_translucent", fgp.c, fgw.c.h, 1536, true, true, $$1);
   });
   private static final Function<alz, glu> bj = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(A).a(new glt.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(true);
      return a("entity_solid", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glu> bk = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(A).a(new glt.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(aK).a(true);
      return a("entity_solid_z_offset_forward", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glu> bl = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(B).a(new glt.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(true);
      return a("entity_cutout", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alz, Boolean, glu> bm = ae.a(($$0, $$1) -> {
      glu.b $$2 = glu.b.a().a(C).a(new glt.n($$0, bbi.b, false)).a(c).a(az).a(au).a(aw).a($$1);
      return a("entity_cutout_no_cull", fgp.c, fgw.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alz, Boolean, glu> bn = ae.a(($$0, $$1) -> {
      glu.b $$2 = glu.b.a().a(D).a(new glt.n($$0, bbi.b, false)).a(c).a(az).a(au).a(aw).a(aJ).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgp.c, fgw.c.h, 1536, true, false, $$2);
   });
   private static final Function<alz, glu> bo = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(E).a(new glt.n($$0, bbi.b, false)).a(h).a(aR).a(au).a(aw).a(aE).a(true);
      return a("item_entity_translucent_cull", fgp.c, fgw.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alz, Boolean, glu> bp = ae.a(($$0, $$1) -> {
      glu.b $$2 = glu.b.a().a(F).a(new glt.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a($$1);
      return a("entity_translucent", fgp.c, fgw.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alz, Boolean, glu> bq = ae.a(($$0, $$1) -> {
      glu.b $$2 = glu.b.a().a(G).a(new glt.n($$0, bbi.b, false)).a(h).a(az).a(aF).a(aw).a($$1);
      return a("entity_translucent_emissive", fgp.c, fgw.c.h, 1536, true, true, $$2);
   });
   private static final Function<alz, glu> br = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(H).a(new glt.n($$0, bbi.b, false)).a(az).a(au).a(true);
      return a("entity_smooth_cutout", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, Boolean, glu> bs = ae.a(($$0, $$1) -> {
      glu.b $$2 = glu.b.a().a(I).a(new glt.n($$0, bbi.b, false)).a($$1 ? h : c).a($$1 ? aF : aE).a(false);
      return a("beacon_beam", fgp.b, fgw.c.h, 1536, false, true, $$2);
   });
   private static final Function<alz, glu> bt = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(J).a(new glt.n($$0, bbi.b, false)).a(aB).a(az).a(au).a(aw).a(false);
      return a("entity_decal", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final Function<alz, glu> bu = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(K).a(new glt.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a(aF).a(false);
      return a("entity_no_outline", fgp.c, fgw.c.h, 1536, false, true, $$1);
   });
   private static final Function<alz, glu> bv = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(L).a(new glt.n($$0, bbi.b, false)).a(h).a(ay).a(au).a(aw).a(aF).a(aC).a(aJ).a(false);
      return a("entity_shadow", fgp.c, fgw.c.h, 1536, false, false, $$1);
   });
   private static final Function<alz, glu> bw = ae.b($$0 -> {
      glu.b $$1 = glu.b.a().a(M).a(new glt.n($$0, bbi.b, false)).a(az).a(true);
      return a("entity_alpha", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, glt.p, glu> bx = ae.a(($$0, $$1) -> {
      glt.n $$2 = new glt.n($$0, bbi.b, false);
      return a("eyes", fgp.c, fgw.c.h, 1536, false, true, glu.b.a().a(N).a($$2).a($$1).a(aF).a(false));
   });
   private static final glu by = a("leash", fgp.h, fgw.c.f, 1536, glu.b.a().a(P).a(aq).a(az).a(au).a(false));
   private static final glu bz = a("water_mask", fgp.e, fgw.c.h, 1536, glu.b.a().a(Q).a(aq).a(aG).a(false));
   private static final glu bA = a(
      "armor_entity_glint", fgp.i, fgw.c.h, 1536, glu.b.a().a(S).a(new glt.n(gsn.a, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(at).a(aJ).a(false)
   );
   private static final glu bB = a(
      "glint_translucent", fgp.i, fgw.c.h, 1536, glu.b.a().a(T).a(new glt.n(gsn.b, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(as).a(aR).a(false)
   );
   private static final glu bC = a("glint", fgp.i, fgw.c.h, 1536, glu.b.a().a(U).a(new glt.n(gsn.b, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(as).a(false));
   private static final glu bD = a("entity_glint", fgp.i, fgw.c.h, 1536, glu.b.a().a(V).a(new glt.n(gsn.a, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(at).a(false));
   private static final Function<alz, glu> bE = ae.b($$0 -> {
      glt.n $$1 = new glt.n($$0, bbi.b, false);
      return a("crumbling", fgp.b, fgw.c.h, 1536, false, true, glu.b.a().a(W).a($$1).a(g).a(aF).a(aI).a(false));
   });
   private static final Function<alz, glu> bF = ae.b(
      $$0 -> a("text", fgp.k, fgw.c.h, 786432, false, false, glu.b.a().a(X).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(false))
   );
   private static final glu bG = a("text_background", fgp.h, fgw.c.h, 1536, false, true, glu.b.a().a(Y).a(aq).a(h).a(au).a(false));
   private static final Function<alz, glu> bH = ae.b(
      $$0 -> a("text_intensity", fgp.k, fgw.c.h, 786432, false, false, glu.b.a().a(Z).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(false))
   );
   private static final Function<alz, glu> bI = ae.b(
      $$0 -> a("text_polygon_offset", fgp.k, fgw.c.h, 1536, false, true, glu.b.a().a(X).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(aI).a(false))
   );
   private static final Function<alz, glu> bJ = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fgp.k, fgw.c.h, 1536, false, true, glu.b.a().a(Z).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(aI).a(false))
   );
   private static final Function<alz, glu> bK = ae.b(
      $$0 -> a("text_see_through", fgp.k, fgw.c.h, 1536, false, false, glu.b.a().a(aa).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(aA).a(aF).a(false))
   );
   private static final glu bL = a("text_background_see_through", fgp.h, fgw.c.h, 1536, false, true, glu.b.a().a(ab).a(aq).a(h).a(au).a(aA).a(aF).a(false));
   private static final Function<alz, glu> bM = ae.b(
      $$0 -> a("text_intensity_see_through", fgp.k, fgw.c.h, 1536, false, true, glu.b.a().a(ac).a(new glt.n($$0, bbi.b, false)).a(h).a(au).a(aA).a(aF).a(false))
   );
   private static final glu bN = a("lightning", fgp.f, fgw.c.h, 1536, false, true, glu.b.a().a(ad).a(aE).a(e).a(aP).a(false));
   private static final glu bO = a("dragon_rays", fgp.f, fgw.c.e, 1536, false, false, glu.b.a().a(ad).a(aF).a(e).a(false));
   private static final glu bP = a("dragon_rays_depth", fgp.e, fgw.c.e, 1536, false, false, glu.b.a().a(o).a(aG).a(false));
   private static final glu bQ = a("tripwire", fgp.b, fgw.c.h, 1536, true, true, W());
   private static final glu bR = a(
      "end_portal", fgp.e, fgw.c.h, 1536, false, false, glu.b.a().a(af).a(glt.i.d().a(goo.a, false, false).a(goo.b, false, false).a()).a(false)
   );
   private static final glu bS = a(
      "end_gateway", fgp.e, fgw.c.h, 1536, false, false, glu.b.a().a(ag).a(glt.i.d().a(goo.a, false, false).a(goo.b, false, false).a()).a(false)
   );
   private static final glu bT = a(false, false);
   private static final glu bU = a(false, true);
   private static final glu bV = a(true, true);
   public static final glu.a aY = a("lines", fgp.g, fgw.c.a, 1536, glu.b.a().a(ai).a(new glt.h(OptionalDouble.empty())).a(aJ).a(h).a(aR).a(aE).a(az).a(false));
   public static final glu.a aZ = a(
      "secondary_block_outline", fgp.g, fgw.c.a, 1536, glu.b.a().a(ai).a(new glt.h(OptionalDouble.of(7.0))).a(aJ).a(glt.h).a(aR).a(aF).a(az).a(false)
   );
   public static final glu.a ba = a(
      "line_strip", fgp.g, fgw.c.b, 1536, glu.b.a().a(ai).a(new glt.h(OptionalDouble.empty())).a(aJ).a(h).a(aR).a(aE).a(az).a(false)
   );
   private static final Function<Double, glu.a> bW = ae.b(
      $$0 -> a("debug_line_strip", fgp.f, fgw.c.d, 1536, glu.b.a().a(r).a(new glt.h(OptionalDouble.of($$0))).a(c).a(az).a(false))
   );
   private static final glu.a bX = a("debug_filled_box", fgp.f, fgw.c.f, 1536, false, true, glu.b.a().a(r).a(aJ).a(h).a(false));
   private static final glu.a bY = a("debug_quads", fgp.f, fgw.c.h, 1536, false, true, glu.b.a().a(r).a(h).a(az).a(false));
   private static final glu.a bZ = a("debug_triangle_fan", fgp.f, fgw.c.g, 1536, false, true, glu.b.a().a(r).a(h).a(az).a(false));
   private static final glu.a ca = a("debug_structure_quads", fgp.f, fgw.c.h, 1536, false, true, glu.b.a().a(r).a(h).a(az).a(aC).a(aF).a(false));
   private static final glu.a cb = a("debug_section_quads", fgp.f, fgw.c.h, 1536, false, true, glu.b.a().a(r).a(aJ).a(h).a(ay).a(false));
   private static final glu.a cc = a("gui", fgp.f, fgw.c.h, 786432, glu.b.a().a(aj).a(h).a(aC).a(false));
   private static final glu.a cd = a("gui_overlay", fgp.f, fgw.c.h, 1536, glu.b.a().a(ak).a(h).a(aA).a(aF).a(false));
   private static final Function<alz, glu> ce = ae.b(
      $$0 -> a("gui_textured_overlay", fgp.j, fgw.c.h, 1536, glu.b.a().a(new glt.n($$0, bbi.c, false)).a(s).a(h).a(aA).a(aF).a(false))
   );
   private static final Function<alz, glu> cf = ae.b(
      $$0 -> a("gui_opaque_textured_background", fgp.j, fgw.c.h, 786432, glu.b.a().a(new glt.n($$0, bbi.b, false)).a(s).a(c).a(aC).a(false))
   );
   private static final glu.a cg = a("gui_nausea_overlay", fgp.j, fgw.c.h, 1536, glu.b.a().a(new glt.n(fnq.a, bbi.c, false)).a(s).a(l).a(aA).a(aF).a(false));
   private static final glu.a ch = a("gui_text_highlight", fgp.f, fgw.c.h, 1536, glu.b.a().a(al).a(h).a(aA).a(aU).a(false));
   private static final glu.a ci = a("gui_ghost_recipe_overlay", fgp.f, fgw.c.h, 1536, glu.b.a().a(am).a(h).a(aD).a(aF).a(false));
   private static final Function<alz, glu> cj = ae.b(
      $$0 -> a("gui_textured", fgp.j, fgw.c.h, 786432, glu.b.a().a(new glt.n($$0, bbi.b, false)).a(s).a(h).a(aC).a(false))
   );
   private static final Function<alz, glu> ck = ae.b(
      $$0 -> a("vignette", fgp.j, fgw.c.h, 786432, glu.b.a().a(new glt.n($$0, bbi.c, false)).a(s).a(i).a(aA).a(aF).a(false))
   );
   private static final Function<alz, glu> cl = ae.b(
      $$0 -> a("crosshair", fgp.j, fgw.c.h, 786432, glu.b.a().a(new glt.n($$0, bbi.b, false)).a(s).a(j).a(false))
   );
   private static final glu.a cm = a("mojang_logo", fgp.j, fgw.c.h, 786432, glu.b.a().a(new glt.n(ftn.a, bbi.c, false)).a(s).a(k).a(aA).a(aF).a(false));
   private static final ImmutableList<glu> cn = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgw co;
   private final fgw.c cp;
   private final int cq;
   private final boolean cr;
   private final boolean cs;

   public static glu c() {
      return bc;
   }

   public static glu d() {
      return bd;
   }

   public static glu e() {
      return be;
   }

   private static glu.b a(glt.m $$0) {
      return glu.b.a().a(au).a($$0).a(ao).a(h).a(aN).a(true);
   }

   public static glu f() {
      return bf;
   }

   private static glu.b V() {
      return glu.b.a().a(au).a(x).a(ao).a(h).a(aR).a(true);
   }

   public static glu g() {
      return bg;
   }

   private static glu.a a(String $$0, alz $$1, boolean $$2) {
      glu.b $$3 = glu.b.a().a(y).a(new glt.n($$1, bbi.b, false)).a(c).a(az).a(au).a(aw).a(aJ).a($$2 ? aB : aC).a(true);
      return a($$0, fgp.c, fgw.c.h, 1536, true, false, $$3);
   }

   public static glu a(alz $$0) {
      return bh.apply($$0);
   }

   public static glu b(alz $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static glu c(alz $$0) {
      return bi.apply($$0);
   }

   public static glu d(alz $$0) {
      return bj.apply($$0);
   }

   public static glu e(alz $$0) {
      return bk.apply($$0);
   }

   public static glu f(alz $$0) {
      return bl.apply($$0);
   }

   public static glu a(alz $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static glu g(alz $$0) {
      return a($$0, true);
   }

   public static glu b(alz $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static glu h(alz $$0) {
      return b($$0, true);
   }

   public static glu i(alz $$0) {
      return bo.apply($$0);
   }

   public static glu c(alz $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static glu j(alz $$0) {
      return c($$0, true);
   }

   public static glu d(alz $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static glu k(alz $$0) {
      return d($$0, true);
   }

   public static glu l(alz $$0) {
      return br.apply($$0);
   }

   public static glu e(alz $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static glu m(alz $$0) {
      return bt.apply($$0);
   }

   public static glu n(alz $$0) {
      return bu.apply($$0);
   }

   public static glu o(alz $$0) {
      return bv.apply($$0);
   }

   public static glu p(alz $$0) {
      return bw.apply($$0);
   }

   public static glu q(alz $$0) {
      return bx.apply($$0, h);
   }

   public static glu r(alz $$0) {
      return bq.apply($$0, false);
   }

   public static glu a(alz $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgp.c,
         fgw.c.h,
         1536,
         false,
         true,
         glu.b.a().a(an).a(new glt.n($$0, bbi.b, false)).a(new glt.j($$1, $$2)).a(h).a(az).a(au).a(ax).a(false)
      );
   }

   public static glu b(alz $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgp.c,
         fgw.c.h,
         1536,
         false,
         true,
         glu.b.a().a(O).a(new glt.n($$0, bbi.b, false)).a(new glt.j($$1, $$2)).a(d).a(az).a(au).a(aw).a(false)
      );
   }

   public static glu h() {
      return by;
   }

   public static glu i() {
      return bz;
   }

   public static glu s(alz $$0) {
      return glu.a.bb.apply($$0, az);
   }

   public static glu j() {
      return bA;
   }

   public static glu k() {
      return bB;
   }

   public static glu l() {
      return bC;
   }

   public static glu m() {
      return bD;
   }

   public static glu t(alz $$0) {
      return bE.apply($$0);
   }

   public static glu u(alz $$0) {
      return bF.apply($$0);
   }

   public static glu n() {
      return bG;
   }

   public static glu v(alz $$0) {
      return bH.apply($$0);
   }

   public static glu w(alz $$0) {
      return bI.apply($$0);
   }

   public static glu x(alz $$0) {
      return bJ.apply($$0);
   }

   public static glu y(alz $$0) {
      return bK.apply($$0);
   }

   public static glu o() {
      return bL;
   }

   public static glu z(alz $$0) {
      return bM.apply($$0);
   }

   public static glu p() {
      return bN;
   }

   public static glu q() {
      return bO;
   }

   public static glu r() {
      return bP;
   }

   private static glu.b W() {
      return glu.b.a().a(au).a(ae).a(ao).a(h).a(aP).a(true);
   }

   public static glu s() {
      return bQ;
   }

   public static glu t() {
      return bR;
   }

   public static glu u() {
      return bS;
   }

   private static glu.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgp.f, fgw.c.h, 786432, false, false, glu.b.a().a(ah).a(h).a($$1 ? ay : az).a($$0 ? aG : aE).a(aQ).a(true));
   }

   public static glu v() {
      return bT;
   }

   public static glu w() {
      return bU;
   }

   public static glu x() {
      return bV;
   }

   public static glu y() {
      return aY;
   }

   public static glu z() {
      return aZ;
   }

   public static glu A() {
      return ba;
   }

   public static glu a(double $$0) {
      return bW.apply($$0);
   }

   public static glu B() {
      return bX;
   }

   public static glu C() {
      return bY;
   }

   public static glu D() {
      return bZ;
   }

   public static glu E() {
      return ca;
   }

   public static glu F() {
      return cb;
   }

   public static glu G() {
      return cc;
   }

   public static glu H() {
      return cd;
   }

   public static glu A(alz $$0) {
      return ce.apply($$0);
   }

   public static glu B(alz $$0) {
      return cf.apply($$0);
   }

   public static glu I() {
      return cg;
   }

   public static glu J() {
      return ch;
   }

   public static glu K() {
      return ci;
   }

   public static glu C(alz $$0) {
      return cj.apply($$0);
   }

   public static glu D(alz $$0) {
      return ck.apply($$0);
   }

   public static glu E(alz $$0) {
      return cl.apply($$0);
   }

   public static glu L() {
      return cm;
   }

   public glu(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.co = $$1;
      this.cp = $$2;
      this.cq = $$3;
      this.cr = $$4;
      this.cs = $$5;
   }

   static glu.a a(String $$0, fgw $$1, fgw.c $$2, int $$3, glu.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static glu.a a(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, glu.b $$6) {
      return new glu.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fgq $$0) {
      this.a();
      fgn.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<glu> M() {
      return cn;
   }

   public int N() {
      return this.cq;
   }

   public fgw O() {
      return this.co;
   }

   public fgw.c P() {
      return this.cp;
   }

   public Optional<glu> Q() {
      return Optional.empty();
   }

   public boolean R() {
      return false;
   }

   public boolean S() {
      return this.cr;
   }

   public boolean T() {
      return !this.cp.l;
   }

   public boolean U() {
      return this.cs;
   }

   static final class a extends glu {
      static final BiFunction<alz, glt.c, glu> bb = ae.a(
         ($$0, $$1) -> glu.a("outline", fgp.j, fgw.c.h, 1536, glu.b.a().a(R).a(new glt.n($$0, bbi.b, false)).a($$1).a(aA).a(aM).a(glu.c.b))
      );
      private final glu.b bc;
      private final Optional<glu> bd;
      private final boolean be;

      a(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, glu.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(glt::a), () -> $$6.o.forEach(glt::b));
         this.bc = $$6;
         this.bd = $$6.n == glu.c.c ? $$6.a.c().map($$1x -> bb.apply($$1x, $$6.e)) : Optional.empty();
         this.be = $$6.n == glu.c.b;
      }

      @Override
      public Optional<glu> Q() {
         return this.bd;
      }

      @Override
      public boolean R() {
         return this.be;
      }

      protected final glu.b V() {
         return this.bc;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bc + "]";
      }
   }

   protected static final class b {
      final glt.e a;
      private final glt.m b;
      private final glt.p c;
      private final glt.d d;
      final glt.c e;
      private final glt.g f;
      private final glt.l g;
      private final glt.f h;
      private final glt.k i;
      private final glt.o j;
      private final glt.q k;
      private final glt.h l;
      private final glt.b m;
      final glu.c n;
      final ImmutableList<glt> o;

      b(
         glt.e $$0,
         glt.m $$1,
         glt.p $$2,
         glt.d $$3,
         glt.c $$4,
         glt.g $$5,
         glt.l $$6,
         glt.f $$7,
         glt.k $$8,
         glt.o $$9,
         glt.q $$10,
         glt.h $$11,
         glt.b $$12,
         glu.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new glt[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static glu.b.a a() {
         return new glu.b.a();
      }

      public static class a {
         private glt.e a = glt.aq;
         private glt.m b = glt.m;
         private glt.p c;
         private glt.d d;
         private glt.c e;
         private glt.g f;
         private glt.l g;
         private glt.f h;
         private glt.k i;
         private glt.o j;
         private glt.q k;
         private glt.h l;
         private glt.b m;

         a() {
            this.c = glt.c;
            this.d = glt.aC;
            this.e = glt.ay;
            this.f = glt.av;
            this.g = glt.ax;
            this.h = glt.aH;
            this.i = glt.aL;
            this.j = glt.ar;
            this.k = glt.aE;
            this.l = glt.aS;
            this.m = glt.aT;
         }

         public glu.b.a a(glt.e $$0) {
            this.a = $$0;
            return this;
         }

         public glu.b.a a(glt.m $$0) {
            this.b = $$0;
            return this;
         }

         public glu.b.a a(glt.p $$0) {
            this.c = $$0;
            return this;
         }

         public glu.b.a a(glt.d $$0) {
            this.d = $$0;
            return this;
         }

         public glu.b.a a(glt.c $$0) {
            this.e = $$0;
            return this;
         }

         public glu.b.a a(glt.g $$0) {
            this.f = $$0;
            return this;
         }

         public glu.b.a a(glt.l $$0) {
            this.g = $$0;
            return this;
         }

         public glu.b.a a(glt.f $$0) {
            this.h = $$0;
            return this;
         }

         public glu.b.a a(glt.k $$0) {
            this.i = $$0;
            return this;
         }

         public glu.b.a a(glt.o $$0) {
            this.j = $$0;
            return this;
         }

         public glu.b.a a(glt.q $$0) {
            this.k = $$0;
            return this;
         }

         public glu.b.a a(glt.h $$0) {
            this.l = $$0;
            return this;
         }

         public glu.b.a a(glt.b $$0) {
            this.m = $$0;
            return this;
         }

         public glu.b a(boolean $$0) {
            return this.a($$0 ? glu.c.c : glu.c.a);
         }

         public glu.b a(glu.c $$0) {
            return new glu.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
