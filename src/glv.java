import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class glv extends glu {
   private static final int bb = 1048576;
   public static final int aV = 4194304;
   public static final int aW = 786432;
   public static final int aX = 1536;
   private static final glv bc = a("solid", fgq.b, fgx.c.h, 4194304, true, false, glv.b.a().a(au).a(t).a(ao).a(true));
   private static final glv bd = a("cutout_mipped", fgq.b, fgx.c.h, 4194304, true, false, glv.b.a().a(au).a(u).a(ao).a(true));
   private static final glv be = a("cutout", fgq.b, fgx.c.h, 786432, true, false, glv.b.a().a(au).a(v).a(ap).a(true));
   private static final glv bf = a("translucent", fgq.b, fgx.c.h, 786432, true, true, a(w));
   private static final glv bg = a("translucent_moving_block", fgq.b, fgx.c.h, 786432, false, true, V());
   private static final Function<alz, glv> bh = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alz, glv> bi = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(z).a(new glu.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a(aJ).a(true);
      return a("armor_translucent", fgq.c, fgx.c.h, 1536, true, true, $$1);
   });
   private static final Function<alz, glv> bj = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(A).a(new glu.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(true);
      return a("entity_solid", fgq.c, fgx.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glv> bk = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(A).a(new glu.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(aK).a(true);
      return a("entity_solid_z_offset_forward", fgq.c, fgx.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glv> bl = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(B).a(new glu.n($$0, bbi.b, false)).a(c).a(au).a(aw).a(true);
      return a("entity_cutout", fgq.c, fgx.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alz, Boolean, glv> bm = ae.a(($$0, $$1) -> {
      glv.b $$2 = glv.b.a().a(C).a(new glu.n($$0, bbi.b, false)).a(c).a(az).a(au).a(aw).a($$1);
      return a("entity_cutout_no_cull", fgq.c, fgx.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alz, Boolean, glv> bn = ae.a(($$0, $$1) -> {
      glv.b $$2 = glv.b.a().a(D).a(new glu.n($$0, bbi.b, false)).a(c).a(az).a(au).a(aw).a(aJ).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgq.c, fgx.c.h, 1536, true, false, $$2);
   });
   private static final Function<alz, glv> bo = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(E).a(new glu.n($$0, bbi.b, false)).a(h).a(aR).a(au).a(aw).a(aE).a(true);
      return a("item_entity_translucent_cull", fgq.c, fgx.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alz, Boolean, glv> bp = ae.a(($$0, $$1) -> {
      glv.b $$2 = glv.b.a().a(F).a(new glu.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a($$1);
      return a("entity_translucent", fgq.c, fgx.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alz, Boolean, glv> bq = ae.a(($$0, $$1) -> {
      glv.b $$2 = glv.b.a().a(G).a(new glu.n($$0, bbi.b, false)).a(h).a(az).a(aF).a(aw).a($$1);
      return a("entity_translucent_emissive", fgq.c, fgx.c.h, 1536, true, true, $$2);
   });
   private static final Function<alz, glv> br = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(H).a(new glu.n($$0, bbi.b, false)).a(az).a(au).a(true);
      return a("entity_smooth_cutout", fgq.c, fgx.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, Boolean, glv> bs = ae.a(($$0, $$1) -> {
      glv.b $$2 = glv.b.a().a(I).a(new glu.n($$0, bbi.b, false)).a($$1 ? h : c).a($$1 ? aF : aE).a(false);
      return a("beacon_beam", fgq.b, fgx.c.h, 1536, false, true, $$2);
   });
   private static final Function<alz, glv> bt = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(J).a(new glu.n($$0, bbi.b, false)).a(aB).a(az).a(au).a(aw).a(false);
      return a("entity_decal", fgq.c, fgx.c.h, 1536, $$1);
   });
   private static final Function<alz, glv> bu = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(K).a(new glu.n($$0, bbi.b, false)).a(h).a(az).a(au).a(aw).a(aF).a(false);
      return a("entity_no_outline", fgq.c, fgx.c.h, 1536, false, true, $$1);
   });
   private static final Function<alz, glv> bv = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(L).a(new glu.n($$0, bbi.b, false)).a(h).a(ay).a(au).a(aw).a(aF).a(aC).a(aJ).a(false);
      return a("entity_shadow", fgq.c, fgx.c.h, 1536, false, false, $$1);
   });
   private static final Function<alz, glv> bw = ae.b($$0 -> {
      glv.b $$1 = glv.b.a().a(M).a(new glu.n($$0, bbi.b, false)).a(az).a(true);
      return a("entity_alpha", fgq.c, fgx.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, glu.p, glv> bx = ae.a(($$0, $$1) -> {
      glu.n $$2 = new glu.n($$0, bbi.b, false);
      return a("eyes", fgq.c, fgx.c.h, 1536, false, true, glv.b.a().a(N).a($$2).a($$1).a(aF).a(false));
   });
   private static final glv by = a("leash", fgq.h, fgx.c.f, 1536, glv.b.a().a(P).a(aq).a(az).a(au).a(false));
   private static final glv bz = a("water_mask", fgq.e, fgx.c.h, 1536, glv.b.a().a(Q).a(aq).a(aG).a(false));
   private static final glv bA = a(
      "armor_entity_glint", fgq.i, fgx.c.h, 1536, glv.b.a().a(S).a(new glu.n(gso.a, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(at).a(aJ).a(false)
   );
   private static final glv bB = a(
      "glint_translucent", fgq.i, fgx.c.h, 1536, glv.b.a().a(T).a(new glu.n(gso.b, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(as).a(aR).a(false)
   );
   private static final glv bC = a("glint", fgq.i, fgx.c.h, 1536, glv.b.a().a(U).a(new glu.n(gso.b, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(as).a(false));
   private static final glv bD = a("entity_glint", fgq.i, fgx.c.h, 1536, glv.b.a().a(V).a(new glu.n(gso.a, bbi.c, false)).a(aF).a(az).a(aB).a(f).a(at).a(false));
   private static final Function<alz, glv> bE = ae.b($$0 -> {
      glu.n $$1 = new glu.n($$0, bbi.b, false);
      return a("crumbling", fgq.b, fgx.c.h, 1536, false, true, glv.b.a().a(W).a($$1).a(g).a(aF).a(aI).a(false));
   });
   private static final Function<alz, glv> bF = ae.b(
      $$0 -> a("text", fgq.k, fgx.c.h, 786432, false, false, glv.b.a().a(X).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(false))
   );
   private static final glv bG = a("text_background", fgq.h, fgx.c.h, 1536, false, true, glv.b.a().a(Y).a(aq).a(h).a(au).a(false));
   private static final Function<alz, glv> bH = ae.b(
      $$0 -> a("text_intensity", fgq.k, fgx.c.h, 786432, false, false, glv.b.a().a(Z).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(false))
   );
   private static final Function<alz, glv> bI = ae.b(
      $$0 -> a("text_polygon_offset", fgq.k, fgx.c.h, 1536, false, true, glv.b.a().a(X).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(aI).a(false))
   );
   private static final Function<alz, glv> bJ = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fgq.k, fgx.c.h, 1536, false, true, glv.b.a().a(Z).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(aI).a(false))
   );
   private static final Function<alz, glv> bK = ae.b(
      $$0 -> a("text_see_through", fgq.k, fgx.c.h, 1536, false, false, glv.b.a().a(aa).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(aA).a(aF).a(false))
   );
   private static final glv bL = a("text_background_see_through", fgq.h, fgx.c.h, 1536, false, true, glv.b.a().a(ab).a(aq).a(h).a(au).a(aA).a(aF).a(false));
   private static final Function<alz, glv> bM = ae.b(
      $$0 -> a("text_intensity_see_through", fgq.k, fgx.c.h, 1536, false, true, glv.b.a().a(ac).a(new glu.n($$0, bbi.b, false)).a(h).a(au).a(aA).a(aF).a(false))
   );
   private static final glv bN = a("lightning", fgq.f, fgx.c.h, 1536, false, true, glv.b.a().a(ad).a(aE).a(e).a(aP).a(false));
   private static final glv bO = a("dragon_rays", fgq.f, fgx.c.e, 1536, false, false, glv.b.a().a(ad).a(aF).a(e).a(false));
   private static final glv bP = a("dragon_rays_depth", fgq.e, fgx.c.e, 1536, false, false, glv.b.a().a(o).a(aG).a(false));
   private static final glv bQ = a("tripwire", fgq.b, fgx.c.h, 1536, true, true, W());
   private static final glv bR = a(
      "end_portal", fgq.e, fgx.c.h, 1536, false, false, glv.b.a().a(af).a(glu.i.d().a(gop.a, false, false).a(gop.b, false, false).a()).a(false)
   );
   private static final glv bS = a(
      "end_gateway", fgq.e, fgx.c.h, 1536, false, false, glv.b.a().a(ag).a(glu.i.d().a(gop.a, false, false).a(gop.b, false, false).a()).a(false)
   );
   private static final glv bT = a(false, false);
   private static final glv bU = a(false, true);
   private static final glv bV = a(true, true);
   public static final glv.a aY = a("lines", fgq.g, fgx.c.a, 1536, glv.b.a().a(ai).a(new glu.h(OptionalDouble.empty())).a(aJ).a(h).a(aR).a(aE).a(az).a(false));
   public static final glv.a aZ = a(
      "secondary_block_outline", fgq.g, fgx.c.a, 1536, glv.b.a().a(ai).a(new glu.h(OptionalDouble.of(7.0))).a(aJ).a(glu.h).a(aR).a(aF).a(az).a(false)
   );
   public static final glv.a ba = a(
      "line_strip", fgq.g, fgx.c.b, 1536, glv.b.a().a(ai).a(new glu.h(OptionalDouble.empty())).a(aJ).a(h).a(aR).a(aE).a(az).a(false)
   );
   private static final Function<Double, glv.a> bW = ae.b(
      $$0 -> a("debug_line_strip", fgq.f, fgx.c.d, 1536, glv.b.a().a(r).a(new glu.h(OptionalDouble.of($$0))).a(c).a(az).a(false))
   );
   private static final glv.a bX = a("debug_filled_box", fgq.f, fgx.c.f, 1536, false, true, glv.b.a().a(r).a(aJ).a(h).a(false));
   private static final glv.a bY = a("debug_quads", fgq.f, fgx.c.h, 1536, false, true, glv.b.a().a(r).a(h).a(az).a(false));
   private static final glv.a bZ = a("debug_triangle_fan", fgq.f, fgx.c.g, 1536, false, true, glv.b.a().a(r).a(h).a(az).a(false));
   private static final glv.a ca = a("debug_structure_quads", fgq.f, fgx.c.h, 1536, false, true, glv.b.a().a(r).a(h).a(az).a(aC).a(aF).a(false));
   private static final glv.a cb = a("debug_section_quads", fgq.f, fgx.c.h, 1536, false, true, glv.b.a().a(r).a(aJ).a(h).a(ay).a(false));
   private static final glv.a cc = a("gui", fgq.f, fgx.c.h, 786432, glv.b.a().a(aj).a(h).a(aC).a(false));
   private static final glv.a cd = a("gui_overlay", fgq.f, fgx.c.h, 1536, glv.b.a().a(ak).a(h).a(aA).a(aF).a(false));
   private static final Function<alz, glv> ce = ae.b(
      $$0 -> a("gui_textured_overlay", fgq.j, fgx.c.h, 1536, glv.b.a().a(new glu.n($$0, bbi.c, false)).a(s).a(h).a(aA).a(aF).a(false))
   );
   private static final Function<alz, glv> cf = ae.b(
      $$0 -> a("gui_opaque_textured_background", fgq.j, fgx.c.h, 786432, glv.b.a().a(new glu.n($$0, bbi.b, false)).a(s).a(c).a(aC).a(false))
   );
   private static final glv.a cg = a("gui_nausea_overlay", fgq.j, fgx.c.h, 1536, glv.b.a().a(new glu.n(fnr.a, bbi.c, false)).a(s).a(l).a(aA).a(aF).a(false));
   private static final glv.a ch = a("gui_text_highlight", fgq.f, fgx.c.h, 1536, glv.b.a().a(al).a(h).a(aA).a(aU).a(false));
   private static final glv.a ci = a("gui_ghost_recipe_overlay", fgq.f, fgx.c.h, 1536, glv.b.a().a(am).a(h).a(aD).a(aF).a(false));
   private static final Function<alz, glv> cj = ae.b(
      $$0 -> a("gui_textured", fgq.j, fgx.c.h, 786432, glv.b.a().a(new glu.n($$0, bbi.b, false)).a(s).a(h).a(aC).a(false))
   );
   private static final Function<alz, glv> ck = ae.b(
      $$0 -> a("vignette", fgq.j, fgx.c.h, 786432, glv.b.a().a(new glu.n($$0, bbi.c, false)).a(s).a(i).a(aA).a(aF).a(false))
   );
   private static final Function<alz, glv> cl = ae.b(
      $$0 -> a("crosshair", fgq.j, fgx.c.h, 786432, glv.b.a().a(new glu.n($$0, bbi.b, false)).a(s).a(j).a(false))
   );
   private static final glv.a cm = a("mojang_logo", fgq.j, fgx.c.h, 786432, glv.b.a().a(new glu.n(fto.a, bbi.c, false)).a(s).a(k).a(aA).a(aF).a(false));
   private static final ImmutableList<glv> cn = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgx co;
   private final fgx.c cp;
   private final int cq;
   private final boolean cr;
   private final boolean cs;

   public static glv c() {
      return bc;
   }

   public static glv d() {
      return bd;
   }

   public static glv e() {
      return be;
   }

   private static glv.b a(glu.m $$0) {
      return glv.b.a().a(au).a($$0).a(ao).a(h).a(aN).a(true);
   }

   public static glv f() {
      return bf;
   }

   private static glv.b V() {
      return glv.b.a().a(au).a(x).a(ao).a(h).a(aR).a(true);
   }

   public static glv g() {
      return bg;
   }

   private static glv.a a(String $$0, alz $$1, boolean $$2) {
      glv.b $$3 = glv.b.a().a(y).a(new glu.n($$1, bbi.b, false)).a(c).a(az).a(au).a(aw).a(aJ).a($$2 ? aB : aC).a(true);
      return a($$0, fgq.c, fgx.c.h, 1536, true, false, $$3);
   }

   public static glv a(alz $$0) {
      return bh.apply($$0);
   }

   public static glv b(alz $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static glv c(alz $$0) {
      return bi.apply($$0);
   }

   public static glv d(alz $$0) {
      return bj.apply($$0);
   }

   public static glv e(alz $$0) {
      return bk.apply($$0);
   }

   public static glv f(alz $$0) {
      return bl.apply($$0);
   }

   public static glv a(alz $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static glv g(alz $$0) {
      return a($$0, true);
   }

   public static glv b(alz $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static glv h(alz $$0) {
      return b($$0, true);
   }

   public static glv i(alz $$0) {
      return bo.apply($$0);
   }

   public static glv c(alz $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static glv j(alz $$0) {
      return c($$0, true);
   }

   public static glv d(alz $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static glv k(alz $$0) {
      return d($$0, true);
   }

   public static glv l(alz $$0) {
      return br.apply($$0);
   }

   public static glv e(alz $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static glv m(alz $$0) {
      return bt.apply($$0);
   }

   public static glv n(alz $$0) {
      return bu.apply($$0);
   }

   public static glv o(alz $$0) {
      return bv.apply($$0);
   }

   public static glv p(alz $$0) {
      return bw.apply($$0);
   }

   public static glv q(alz $$0) {
      return bx.apply($$0, h);
   }

   public static glv r(alz $$0) {
      return bq.apply($$0, false);
   }

   public static glv a(alz $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgq.c,
         fgx.c.h,
         1536,
         false,
         true,
         glv.b.a().a(an).a(new glu.n($$0, bbi.b, false)).a(new glu.j($$1, $$2)).a(h).a(az).a(au).a(ax).a(false)
      );
   }

   public static glv b(alz $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgq.c,
         fgx.c.h,
         1536,
         false,
         true,
         glv.b.a().a(O).a(new glu.n($$0, bbi.b, false)).a(new glu.j($$1, $$2)).a(d).a(az).a(au).a(aw).a(false)
      );
   }

   public static glv h() {
      return by;
   }

   public static glv i() {
      return bz;
   }

   public static glv s(alz $$0) {
      return glv.a.bb.apply($$0, az);
   }

   public static glv j() {
      return bA;
   }

   public static glv k() {
      return bB;
   }

   public static glv l() {
      return bC;
   }

   public static glv m() {
      return bD;
   }

   public static glv t(alz $$0) {
      return bE.apply($$0);
   }

   public static glv u(alz $$0) {
      return bF.apply($$0);
   }

   public static glv n() {
      return bG;
   }

   public static glv v(alz $$0) {
      return bH.apply($$0);
   }

   public static glv w(alz $$0) {
      return bI.apply($$0);
   }

   public static glv x(alz $$0) {
      return bJ.apply($$0);
   }

   public static glv y(alz $$0) {
      return bK.apply($$0);
   }

   public static glv o() {
      return bL;
   }

   public static glv z(alz $$0) {
      return bM.apply($$0);
   }

   public static glv p() {
      return bN;
   }

   public static glv q() {
      return bO;
   }

   public static glv r() {
      return bP;
   }

   private static glv.b W() {
      return glv.b.a().a(au).a(ae).a(ao).a(h).a(aP).a(true);
   }

   public static glv s() {
      return bQ;
   }

   public static glv t() {
      return bR;
   }

   public static glv u() {
      return bS;
   }

   private static glv.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgq.f, fgx.c.h, 786432, false, false, glv.b.a().a(ah).a(h).a($$1 ? ay : az).a($$0 ? aG : aE).a(aQ).a(true));
   }

   public static glv v() {
      return bT;
   }

   public static glv w() {
      return bU;
   }

   public static glv x() {
      return bV;
   }

   public static glv y() {
      return aY;
   }

   public static glv z() {
      return aZ;
   }

   public static glv A() {
      return ba;
   }

   public static glv a(double $$0) {
      return bW.apply($$0);
   }

   public static glv B() {
      return bX;
   }

   public static glv C() {
      return bY;
   }

   public static glv D() {
      return bZ;
   }

   public static glv E() {
      return ca;
   }

   public static glv F() {
      return cb;
   }

   public static glv G() {
      return cc;
   }

   public static glv H() {
      return cd;
   }

   public static glv A(alz $$0) {
      return ce.apply($$0);
   }

   public static glv B(alz $$0) {
      return cf.apply($$0);
   }

   public static glv I() {
      return cg;
   }

   public static glv J() {
      return ch;
   }

   public static glv K() {
      return ci;
   }

   public static glv C(alz $$0) {
      return cj.apply($$0);
   }

   public static glv D(alz $$0) {
      return ck.apply($$0);
   }

   public static glv E(alz $$0) {
      return cl.apply($$0);
   }

   public static glv L() {
      return cm;
   }

   public glv(String $$0, fgx $$1, fgx.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.co = $$1;
      this.cp = $$2;
      this.cq = $$3;
      this.cr = $$4;
      this.cs = $$5;
   }

   static glv.a a(String $$0, fgx $$1, fgx.c $$2, int $$3, glv.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static glv.a a(String $$0, fgx $$1, fgx.c $$2, int $$3, boolean $$4, boolean $$5, glv.b $$6) {
      return new glv.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fgr $$0) {
      this.a();
      fgo.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<glv> M() {
      return cn;
   }

   public int N() {
      return this.cq;
   }

   public fgx O() {
      return this.co;
   }

   public fgx.c P() {
      return this.cp;
   }

   public Optional<glv> Q() {
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

   static final class a extends glv {
      static final BiFunction<alz, glu.c, glv> bb = ae.a(
         ($$0, $$1) -> glv.a("outline", fgq.j, fgx.c.h, 1536, glv.b.a().a(R).a(new glu.n($$0, bbi.b, false)).a($$1).a(aA).a(aM).a(glv.c.b))
      );
      private final glv.b bc;
      private final Optional<glv> bd;
      private final boolean be;

      a(String $$0, fgx $$1, fgx.c $$2, int $$3, boolean $$4, boolean $$5, glv.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(glu::a), () -> $$6.o.forEach(glu::b));
         this.bc = $$6;
         this.bd = $$6.n == glv.c.c ? $$6.a.c().map($$1x -> bb.apply($$1x, $$6.e)) : Optional.empty();
         this.be = $$6.n == glv.c.b;
      }

      @Override
      public Optional<glv> Q() {
         return this.bd;
      }

      @Override
      public boolean R() {
         return this.be;
      }

      protected final glv.b V() {
         return this.bc;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bc + "]";
      }
   }

   protected static final class b {
      final glu.e a;
      private final glu.m b;
      private final glu.p c;
      private final glu.d d;
      final glu.c e;
      private final glu.g f;
      private final glu.l g;
      private final glu.f h;
      private final glu.k i;
      private final glu.o j;
      private final glu.q k;
      private final glu.h l;
      private final glu.b m;
      final glv.c n;
      final ImmutableList<glu> o;

      b(
         glu.e $$0,
         glu.m $$1,
         glu.p $$2,
         glu.d $$3,
         glu.c $$4,
         glu.g $$5,
         glu.l $$6,
         glu.f $$7,
         glu.k $$8,
         glu.o $$9,
         glu.q $$10,
         glu.h $$11,
         glu.b $$12,
         glv.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new glu[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static glv.b.a a() {
         return new glv.b.a();
      }

      public static class a {
         private glu.e a = glu.aq;
         private glu.m b = glu.m;
         private glu.p c;
         private glu.d d;
         private glu.c e;
         private glu.g f;
         private glu.l g;
         private glu.f h;
         private glu.k i;
         private glu.o j;
         private glu.q k;
         private glu.h l;
         private glu.b m;

         a() {
            this.c = glu.c;
            this.d = glu.aC;
            this.e = glu.ay;
            this.f = glu.av;
            this.g = glu.ax;
            this.h = glu.aH;
            this.i = glu.aL;
            this.j = glu.ar;
            this.k = glu.aE;
            this.l = glu.aS;
            this.m = glu.aT;
         }

         public glv.b.a a(glu.e $$0) {
            this.a = $$0;
            return this;
         }

         public glv.b.a a(glu.m $$0) {
            this.b = $$0;
            return this;
         }

         public glv.b.a a(glu.p $$0) {
            this.c = $$0;
            return this;
         }

         public glv.b.a a(glu.d $$0) {
            this.d = $$0;
            return this;
         }

         public glv.b.a a(glu.c $$0) {
            this.e = $$0;
            return this;
         }

         public glv.b.a a(glu.g $$0) {
            this.f = $$0;
            return this;
         }

         public glv.b.a a(glu.l $$0) {
            this.g = $$0;
            return this;
         }

         public glv.b.a a(glu.f $$0) {
            this.h = $$0;
            return this;
         }

         public glv.b.a a(glu.k $$0) {
            this.i = $$0;
            return this;
         }

         public glv.b.a a(glu.o $$0) {
            this.j = $$0;
            return this;
         }

         public glv.b.a a(glu.q $$0) {
            this.k = $$0;
            return this;
         }

         public glv.b.a a(glu.h $$0) {
            this.l = $$0;
            return this;
         }

         public glv.b.a a(glu.b $$0) {
            this.m = $$0;
            return this;
         }

         public glv.b a(boolean $$0) {
            return this.a($$0 ? glv.c.c : glv.c.a);
         }

         public glv.b a(glv.c $$0) {
            return new glv.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
