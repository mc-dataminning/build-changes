import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ghe extends ghd {
   private static final int bb = 1048576;
   public static final int aW = 4194304;
   public static final int aX = 786432;
   public static final int aY = 1536;
   private static final ghe bc = a("solid", fcs.b, fcz.c.h, 4194304, true, false, ghe.b.a().a(av).a(t).a(ap).a(true));
   private static final ghe bd = a("cutout_mipped", fcs.b, fcz.c.h, 4194304, true, false, ghe.b.a().a(av).a(u).a(ap).a(true));
   private static final ghe be = a("cutout", fcs.b, fcz.c.h, 786432, true, false, ghe.b.a().a(av).a(v).a(aq).a(true));
   private static final ghe bf = a("translucent", fcs.b, fcz.c.h, 786432, true, true, a(w));
   private static final ghe bg = a("translucent_moving_block", fcs.b, fcz.c.h, 786432, false, true, V());
   private static final Function<alb, ghe> bh = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alb, ghe> bi = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(z).a(new ghd.n($$0, baf.b, false)).a(c).a(av).a(ax).a(true);
      return a("entity_solid", fcs.c, fcz.c.h, 1536, true, false, $$1);
   });
   private static final Function<alb, ghe> bj = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(z).a(new ghd.n($$0, baf.b, false)).a(c).a(av).a(ax).a(aL).a(true);
      return a("entity_solid_z_offset_forward", fcs.c, fcz.c.h, 1536, true, false, $$1);
   });
   private static final Function<alb, ghe> bk = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(A).a(new ghd.n($$0, baf.b, false)).a(c).a(av).a(ax).a(true);
      return a("entity_cutout", fcs.c, fcz.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alb, Boolean, ghe> bl = ad.a(($$0, $$1) -> {
      ghe.b $$2 = ghe.b.a().a(B).a(new ghd.n($$0, baf.b, false)).a(c).a(aA).a(av).a(ax).a($$1);
      return a("entity_cutout_no_cull", fcs.c, fcz.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alb, Boolean, ghe> bm = ad.a(($$0, $$1) -> {
      ghe.b $$2 = ghe.b.a().a(C).a(new ghd.n($$0, baf.b, false)).a(c).a(aA).a(av).a(ax).a(aK).a($$1);
      return a("entity_cutout_no_cull_z_offset", fcs.c, fcz.c.h, 1536, true, false, $$2);
   });
   private static final Function<alb, ghe> bn = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(D).a(new ghd.n($$0, baf.b, false)).a(h).a(aS).a(av).a(ax).a(aF).a(true);
      return a("item_entity_translucent_cull", fcs.c, fcz.c.h, 1536, true, true, $$1);
   });
   private static final Function<alb, ghe> bo = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(E).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(ax).a(true);
      return a("entity_translucent_cull", fcs.c, fcz.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alb, Boolean, ghe> bp = ad.a(($$0, $$1) -> {
      ghe.b $$2 = ghe.b.a().a(F).a(new ghd.n($$0, baf.b, false)).a(h).a(aA).a(av).a(ax).a($$1);
      return a("entity_translucent", fcs.c, fcz.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alb, Boolean, ghe> bq = ad.a(($$0, $$1) -> {
      ghe.b $$2 = ghe.b.a().a(G).a(new ghd.n($$0, baf.b, false)).a(h).a(aA).a(aG).a(ax).a($$1);
      return a("entity_translucent_emissive", fcs.c, fcz.c.h, 1536, true, true, $$2);
   });
   private static final Function<alb, ghe> br = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(H).a(new ghd.n($$0, baf.b, false)).a(aA).a(av).a(true);
      return a("entity_smooth_cutout", fcs.c, fcz.c.h, 1536, $$1);
   });
   private static final BiFunction<alb, Boolean, ghe> bs = ad.a(($$0, $$1) -> {
      ghe.b $$2 = ghe.b.a().a(I).a(new ghd.n($$0, baf.b, false)).a($$1 ? h : c).a($$1 ? aG : aF).a(false);
      return a("beacon_beam", fcs.b, fcz.c.h, 1536, false, true, $$2);
   });
   private static final Function<alb, ghe> bt = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(J).a(new ghd.n($$0, baf.b, false)).a(aC).a(aA).a(av).a(ax).a(false);
      return a("entity_decal", fcs.c, fcz.c.h, 1536, $$1);
   });
   private static final Function<alb, ghe> bu = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(K).a(new ghd.n($$0, baf.b, false)).a(h).a(aA).a(av).a(ax).a(aG).a(false);
      return a("entity_no_outline", fcs.c, fcz.c.h, 1536, false, true, $$1);
   });
   private static final Function<alb, ghe> bv = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(L).a(new ghd.n($$0, baf.b, false)).a(h).a(az).a(av).a(ax).a(aG).a(aD).a(aK).a(false);
      return a("entity_shadow", fcs.c, fcz.c.h, 1536, false, false, $$1);
   });
   private static final Function<alb, ghe> bw = ad.b($$0 -> {
      ghe.b $$1 = ghe.b.a().a(M).a(new ghd.n($$0, baf.b, false)).a(aA).a(true);
      return a("entity_alpha", fcs.c, fcz.c.h, 1536, $$1);
   });
   private static final BiFunction<alb, ghd.p, ghe> bx = ad.a(($$0, $$1) -> {
      ghd.n $$2 = new ghd.n($$0, baf.b, false);
      return a("eyes", fcs.c, fcz.c.h, 1536, false, true, ghe.b.a().a(N).a($$2).a($$1).a(aG).a(false));
   });
   private static final ghe by = a("leash", fcs.h, fcz.c.f, 1536, ghe.b.a().a(P).a(ar).a(aA).a(av).a(false));
   private static final ghe bz = a("water_mask", fcs.e, fcz.c.h, 1536, ghe.b.a().a(Q).a(ar).a(aH).a(false));
   private static final ghe bA = a(
      "armor_entity_glint", fcs.i, fcz.c.h, 1536, ghe.b.a().a(S).a(new ghd.n(gnq.a, baf.c, false)).a(aG).a(aA).a(aC).a(f).a(au).a(aK).a(false)
   );
   private static final ghe bB = a(
      "glint_translucent", fcs.i, fcz.c.h, 1536, ghe.b.a().a(T).a(new ghd.n(gnq.b, baf.c, false)).a(aG).a(aA).a(aC).a(f).a(at).a(aS).a(false)
   );
   private static final ghe bC = a("glint", fcs.i, fcz.c.h, 1536, ghe.b.a().a(U).a(new ghd.n(gnq.b, baf.c, false)).a(aG).a(aA).a(aC).a(f).a(at).a(false));
   private static final ghe bD = a(
      "entity_glint", fcs.i, fcz.c.h, 1536, ghe.b.a().a(V).a(new ghd.n(gnq.a, baf.c, false)).a(aG).a(aA).a(aC).a(f).a(aS).a(au).a(false)
   );
   private static final ghe bE = a(
      "entity_glint_direct", fcs.i, fcz.c.h, 1536, ghe.b.a().a(W).a(new ghd.n(gnq.a, baf.c, false)).a(aG).a(aA).a(aC).a(f).a(au).a(false)
   );
   private static final Function<alb, ghe> bF = ad.b($$0 -> {
      ghd.n $$1 = new ghd.n($$0, baf.b, false);
      return a("crumbling", fcs.b, fcz.c.h, 1536, false, true, ghe.b.a().a(X).a($$1).a(g).a(aG).a(aJ).a(false));
   });
   private static final Function<alb, ghe> bG = ad.b(
      $$0 -> a("text", fcs.k, fcz.c.h, 786432, false, false, ghe.b.a().a(Y).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(false))
   );
   private static final ghe bH = a("text_background", fcs.h, fcz.c.h, 1536, false, true, ghe.b.a().a(Z).a(ar).a(h).a(av).a(false));
   private static final Function<alb, ghe> bI = ad.b(
      $$0 -> a("text_intensity", fcs.k, fcz.c.h, 786432, false, true, ghe.b.a().a(aa).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(false))
   );
   private static final Function<alb, ghe> bJ = ad.b(
      $$0 -> a("text_polygon_offset", fcs.k, fcz.c.h, 1536, false, true, ghe.b.a().a(Y).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(aJ).a(false))
   );
   private static final Function<alb, ghe> bK = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fcs.k, fcz.c.h, 1536, false, true, ghe.b.a().a(aa).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(aJ).a(false))
   );
   private static final Function<alb, ghe> bL = ad.b(
      $$0 -> a("text_see_through", fcs.k, fcz.c.h, 1536, false, true, ghe.b.a().a(ab).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(aB).a(aG).a(false))
   );
   private static final ghe bM = a("text_background_see_through", fcs.h, fcz.c.h, 1536, false, true, ghe.b.a().a(ac).a(ar).a(h).a(av).a(aB).a(aG).a(false));
   private static final Function<alb, ghe> bN = ad.b(
      $$0 -> a("text_intensity_see_through", fcs.k, fcz.c.h, 1536, false, true, ghe.b.a().a(ad).a(new ghd.n($$0, baf.b, false)).a(h).a(av).a(aB).a(aG).a(false))
   );
   private static final ghe bO = a("lightning", fcs.f, fcz.c.h, 1536, false, true, ghe.b.a().a(ae).a(aF).a(e).a(aQ).a(false));
   private static final ghe bP = a("dragon_rays", fcs.f, fcz.c.e, 1536, false, false, ghe.b.a().a(ae).a(aG).a(e).a(false));
   private static final ghe bQ = a("dragon_rays_depth", fcs.e, fcz.c.e, 1536, false, false, ghe.b.a().a(o).a(aH).a(false));
   private static final ghe bR = a("tripwire", fcs.b, fcz.c.h, 1536, true, true, W());
   private static final ghe bS = a(
      "end_portal", fcs.e, fcz.c.h, 1536, false, false, ghe.b.a().a(ag).a(ghd.i.d().a(gjv.a, false, false).a(gjv.b, false, false).a()).a(false)
   );
   private static final ghe bT = a(
      "end_gateway", fcs.e, fcz.c.h, 1536, false, false, ghe.b.a().a(ah).a(ghd.i.d().a(gjv.a, false, false).a(gjv.b, false, false).a()).a(false)
   );
   private static final ghe bU = a(false, false);
   private static final ghe bV = a(false, true);
   private static final ghe bW = a(true, true);
   public static final ghe.a aZ = a("lines", fcs.g, fcz.c.a, 1536, ghe.b.a().a(aj).a(new ghd.h(OptionalDouble.empty())).a(aK).a(h).a(aS).a(aF).a(aA).a(false));
   public static final ghe.a ba = a(
      "line_strip", fcs.g, fcz.c.b, 1536, ghe.b.a().a(aj).a(new ghd.h(OptionalDouble.empty())).a(aK).a(h).a(aS).a(aF).a(aA).a(false)
   );
   private static final Function<Double, ghe.a> bX = ad.b(
      $$0 -> a("debug_line_strip", fcs.f, fcz.c.d, 1536, ghe.b.a().a(r).a(new ghd.h(OptionalDouble.of($$0))).a(c).a(aA).a(false))
   );
   private static final ghe.a bY = a("debug_filled_box", fcs.f, fcz.c.f, 1536, false, true, ghe.b.a().a(r).a(aK).a(h).a(false));
   private static final ghe.a bZ = a("debug_quads", fcs.f, fcz.c.h, 1536, false, true, ghe.b.a().a(r).a(h).a(aA).a(false));
   private static final ghe.a ca = a("debug_triangle_fan", fcs.f, fcz.c.g, 1536, false, true, ghe.b.a().a(r).a(h).a(aA).a(false));
   private static final ghe.a cb = a("debug_structure_quads", fcs.f, fcz.c.h, 1536, false, true, ghe.b.a().a(r).a(h).a(aA).a(aD).a(aG).a(false));
   private static final ghe.a cc = a("debug_section_quads", fcs.f, fcz.c.h, 1536, false, true, ghe.b.a().a(r).a(aK).a(h).a(az).a(false));
   private static final ghe.a cd = a("gui", fcs.f, fcz.c.h, 786432, ghe.b.a().a(ak).a(h).a(aD).a(false));
   private static final ghe.a ce = a("gui_overlay", fcs.f, fcz.c.h, 1536, ghe.b.a().a(al).a(h).a(aB).a(aG).a(false));
   private static final Function<alb, ghe> cf = ad.b(
      $$0 -> a("gui_textured_overlay", fcs.j, fcz.c.h, 1536, ghe.b.a().a(new ghd.n($$0, baf.c, false)).a(s).a(h).a(aB).a(aG).a(false))
   );
   private static final Function<alb, ghe> cg = ad.b(
      $$0 -> a("gui_opaque_textured_background", fcs.j, fcz.c.h, 786432, ghe.b.a().a(new ghd.n($$0, baf.b, false)).a(s).a(c).a(aD).a(false))
   );
   private static final ghe.a ch = a("gui_nausea_overlay", fcs.j, fcz.c.h, 1536, ghe.b.a().a(new ghd.n(fjm.a, baf.c, false)).a(s).a(l).a(aB).a(aG).a(false));
   private static final ghe.a ci = a("gui_text_highlight", fcs.f, fcz.c.h, 1536, ghe.b.a().a(am).a(h).a(aB).a(aV).a(false));
   private static final ghe.a cj = a("gui_ghost_recipe_overlay", fcs.f, fcz.c.h, 1536, ghe.b.a().a(an).a(h).a(aE).a(aG).a(false));
   private static final Function<alb, ghe> ck = ad.b(
      $$0 -> a("gui_textured", fcs.j, fcz.c.h, 786432, ghe.b.a().a(new ghd.n($$0, baf.b, false)).a(s).a(h).a(aD).a(false))
   );
   private static final Function<alb, ghe> cl = ad.b(
      $$0 -> a("vignette", fcs.j, fcz.c.h, 786432, ghe.b.a().a(new ghd.n($$0, baf.c, false)).a(s).a(i).a(aB).a(aG).a(false))
   );
   private static final Function<alb, ghe> cm = ad.b(
      $$0 -> a("crosshair", fcs.j, fcz.c.h, 786432, ghe.b.a().a(new ghd.n($$0, baf.b, false)).a(s).a(j).a(false))
   );
   private static final ghe.a cn = a("mojang_logo", fcs.j, fcz.c.h, 786432, ghe.b.a().a(new ghd.n(fpj.a, baf.c, false)).a(s).a(k).a(aB).a(aG).a(false));
   private static final ImmutableList<ghe> co = ImmutableList.of(c(), d(), e(), f(), t());
   private final fcz cp;
   private final fcz.c cq;
   private final int cr;
   private final boolean cs;
   private final boolean ct;

   public static ghe c() {
      return bc;
   }

   public static ghe d() {
      return bd;
   }

   public static ghe e() {
      return be;
   }

   private static ghe.b a(ghd.m $$0) {
      return ghe.b.a().a(av).a($$0).a(ap).a(h).a(aO).a(true);
   }

   public static ghe f() {
      return bf;
   }

   private static ghe.b V() {
      return ghe.b.a().a(av).a(x).a(ap).a(h).a(aS).a(true);
   }

   public static ghe g() {
      return bg;
   }

   private static ghe.a a(String $$0, alb $$1, boolean $$2) {
      ghe.b $$3 = ghe.b.a().a(y).a(new ghd.n($$1, baf.b, false)).a(c).a(aA).a(av).a(ax).a(aK).a($$2 ? aC : aD).a(true);
      return a($$0, fcs.c, fcz.c.h, 1536, true, false, $$3);
   }

   public static ghe a(alb $$0) {
      return bh.apply($$0);
   }

   public static ghe b(alb $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static ghe c(alb $$0) {
      return bi.apply($$0);
   }

   public static ghe d(alb $$0) {
      return bj.apply($$0);
   }

   public static ghe e(alb $$0) {
      return bk.apply($$0);
   }

   public static ghe a(alb $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static ghe f(alb $$0) {
      return a($$0, true);
   }

   public static ghe b(alb $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static ghe g(alb $$0) {
      return b($$0, true);
   }

   public static ghe h(alb $$0) {
      return bn.apply($$0);
   }

   public static ghe i(alb $$0) {
      return bo.apply($$0);
   }

   public static ghe c(alb $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static ghe j(alb $$0) {
      return c($$0, true);
   }

   public static ghe d(alb $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static ghe k(alb $$0) {
      return d($$0, true);
   }

   public static ghe l(alb $$0) {
      return br.apply($$0);
   }

   public static ghe e(alb $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static ghe m(alb $$0) {
      return bt.apply($$0);
   }

   public static ghe n(alb $$0) {
      return bu.apply($$0);
   }

   public static ghe o(alb $$0) {
      return bv.apply($$0);
   }

   public static ghe p(alb $$0) {
      return bw.apply($$0);
   }

   public static ghe q(alb $$0) {
      return bx.apply($$0, d);
   }

   public static ghe r(alb $$0) {
      return bq.apply($$0, false);
   }

   public static ghe a(alb $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fcs.c,
         fcz.c.h,
         1536,
         false,
         true,
         ghe.b.a().a(ao).a(new ghd.n($$0, baf.b, false)).a(new ghd.j($$1, $$2)).a(h).a(aA).a(av).a(ay).a(false)
      );
   }

   public static ghe b(alb $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fcs.c,
         fcz.c.h,
         1536,
         false,
         true,
         ghe.b.a().a(O).a(new ghd.n($$0, baf.b, false)).a(new ghd.j($$1, $$2)).a(d).a(aA).a(av).a(ax).a(false)
      );
   }

   public static ghe h() {
      return by;
   }

   public static ghe i() {
      return bz;
   }

   public static ghe s(alb $$0) {
      return ghe.a.bb.apply($$0, aA);
   }

   public static ghe j() {
      return bA;
   }

   public static ghe k() {
      return bB;
   }

   public static ghe l() {
      return bC;
   }

   public static ghe m() {
      return bD;
   }

   public static ghe n() {
      return bE;
   }

   public static ghe t(alb $$0) {
      return bF.apply($$0);
   }

   public static ghe u(alb $$0) {
      return bG.apply($$0);
   }

   public static ghe o() {
      return bH;
   }

   public static ghe v(alb $$0) {
      return bI.apply($$0);
   }

   public static ghe w(alb $$0) {
      return bJ.apply($$0);
   }

   public static ghe x(alb $$0) {
      return bK.apply($$0);
   }

   public static ghe y(alb $$0) {
      return bL.apply($$0);
   }

   public static ghe p() {
      return bM;
   }

   public static ghe z(alb $$0) {
      return bN.apply($$0);
   }

   public static ghe q() {
      return bO;
   }

   public static ghe r() {
      return bP;
   }

   public static ghe s() {
      return bQ;
   }

   private static ghe.b W() {
      return ghe.b.a().a(av).a(af).a(ap).a(h).a(aQ).a(true);
   }

   public static ghe t() {
      return bR;
   }

   public static ghe u() {
      return bS;
   }

   public static ghe v() {
      return bT;
   }

   private static ghe.a a(boolean $$0, boolean $$1) {
      return a("clouds", fcs.f, fcz.c.h, 786432, false, false, ghe.b.a().a(ai).a(h).a($$1 ? az : aA).a($$0 ? aH : aF).a(aR).a(true));
   }

   public static ghe w() {
      return bU;
   }

   public static ghe x() {
      return bV;
   }

   public static ghe y() {
      return bW;
   }

   public static ghe z() {
      return aZ;
   }

   public static ghe A() {
      return ba;
   }

   public static ghe a(double $$0) {
      return bX.apply($$0);
   }

   public static ghe B() {
      return bY;
   }

   public static ghe C() {
      return bZ;
   }

   public static ghe D() {
      return ca;
   }

   public static ghe E() {
      return cb;
   }

   public static ghe F() {
      return cc;
   }

   public static ghe G() {
      return cd;
   }

   public static ghe H() {
      return ce;
   }

   public static ghe A(alb $$0) {
      return cf.apply($$0);
   }

   public static ghe B(alb $$0) {
      return cg.apply($$0);
   }

   public static ghe I() {
      return ch;
   }

   public static ghe J() {
      return ci;
   }

   public static ghe K() {
      return cj;
   }

   public static ghe C(alb $$0) {
      return ck.apply($$0);
   }

   public static ghe D(alb $$0) {
      return cl.apply($$0);
   }

   public static ghe E(alb $$0) {
      return cm.apply($$0);
   }

   public static ghe L() {
      return cn;
   }

   public ghe(String $$0, fcz $$1, fcz.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cp = $$1;
      this.cq = $$2;
      this.cr = $$3;
      this.cs = $$4;
      this.ct = $$5;
   }

   static ghe.a a(String $$0, fcz $$1, fcz.c $$2, int $$3, ghe.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static ghe.a a(String $$0, fcz $$1, fcz.c $$2, int $$3, boolean $$4, boolean $$5, ghe.b $$6) {
      return new ghe.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fct $$0) {
      this.a();
      fcq.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<ghe> M() {
      return co;
   }

   public int N() {
      return this.cr;
   }

   public fcz O() {
      return this.cp;
   }

   public fcz.c P() {
      return this.cq;
   }

   public Optional<ghe> Q() {
      return Optional.empty();
   }

   public boolean R() {
      return false;
   }

   public boolean S() {
      return this.cs;
   }

   public boolean T() {
      return !this.cq.l;
   }

   public boolean U() {
      return this.ct;
   }

   static final class a extends ghe {
      static final BiFunction<alb, ghd.c, ghe> bb = ad.a(
         ($$0, $$1) -> ghe.a("outline", fcs.j, fcz.c.h, 1536, ghe.b.a().a(R).a(new ghd.n($$0, baf.b, false)).a($$1).a(aB).a(aN).a(ghe.c.b))
      );
      private final ghe.b bc;
      private final Optional<ghe> bd;
      private final boolean be;

      a(String $$0, fcz $$1, fcz.c $$2, int $$3, boolean $$4, boolean $$5, ghe.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ghd::a), () -> $$6.o.forEach(ghd::b));
         this.bc = $$6;
         this.bd = $$6.n == ghe.c.c ? $$6.a.c().map($$1x -> bb.apply($$1x, $$6.e)) : Optional.empty();
         this.be = $$6.n == ghe.c.b;
      }

      @Override
      public Optional<ghe> Q() {
         return this.bd;
      }

      @Override
      public boolean R() {
         return this.be;
      }

      protected final ghe.b V() {
         return this.bc;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bc + "]";
      }
   }

   protected static final class b {
      final ghd.e a;
      private final ghd.m b;
      private final ghd.p c;
      private final ghd.d d;
      final ghd.c e;
      private final ghd.g f;
      private final ghd.l g;
      private final ghd.f h;
      private final ghd.k i;
      private final ghd.o j;
      private final ghd.q k;
      private final ghd.h l;
      private final ghd.b m;
      final ghe.c n;
      final ImmutableList<ghd> o;

      b(
         ghd.e $$0,
         ghd.m $$1,
         ghd.p $$2,
         ghd.d $$3,
         ghd.c $$4,
         ghd.g $$5,
         ghd.l $$6,
         ghd.f $$7,
         ghd.k $$8,
         ghd.o $$9,
         ghd.q $$10,
         ghd.h $$11,
         ghd.b $$12,
         ghe.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ghd[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static ghe.b.a a() {
         return new ghe.b.a();
      }

      public static class a {
         private ghd.e a = ghd.ar;
         private ghd.m b = ghd.m;
         private ghd.p c;
         private ghd.d d;
         private ghd.c e;
         private ghd.g f;
         private ghd.l g;
         private ghd.f h;
         private ghd.k i;
         private ghd.o j;
         private ghd.q k;
         private ghd.h l;
         private ghd.b m;

         a() {
            this.c = ghd.c;
            this.d = ghd.aD;
            this.e = ghd.az;
            this.f = ghd.aw;
            this.g = ghd.ay;
            this.h = ghd.aI;
            this.i = ghd.aM;
            this.j = ghd.as;
            this.k = ghd.aF;
            this.l = ghd.aT;
            this.m = ghd.aU;
         }

         public ghe.b.a a(ghd.e $$0) {
            this.a = $$0;
            return this;
         }

         public ghe.b.a a(ghd.m $$0) {
            this.b = $$0;
            return this;
         }

         public ghe.b.a a(ghd.p $$0) {
            this.c = $$0;
            return this;
         }

         public ghe.b.a a(ghd.d $$0) {
            this.d = $$0;
            return this;
         }

         public ghe.b.a a(ghd.c $$0) {
            this.e = $$0;
            return this;
         }

         public ghe.b.a a(ghd.g $$0) {
            this.f = $$0;
            return this;
         }

         public ghe.b.a a(ghd.l $$0) {
            this.g = $$0;
            return this;
         }

         public ghe.b.a a(ghd.f $$0) {
            this.h = $$0;
            return this;
         }

         public ghe.b.a a(ghd.k $$0) {
            this.i = $$0;
            return this;
         }

         public ghe.b.a a(ghd.o $$0) {
            this.j = $$0;
            return this;
         }

         public ghe.b.a a(ghd.q $$0) {
            this.k = $$0;
            return this;
         }

         public ghe.b.a a(ghd.h $$0) {
            this.l = $$0;
            return this;
         }

         public ghe.b.a a(ghd.b $$0) {
            this.m = $$0;
            return this;
         }

         public ghe.b a(boolean $$0) {
            return this.a($$0 ? ghe.c.c : ghe.c.a);
         }

         public ghe.b a(ghe.c $$0) {
            return new ghe.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
