import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ghv extends ghu {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final ghv ba = a("solid", fdg.b, fdn.c.h, 4194304, true, false, ghv.b.a().a(at).a(t).a(an).a(true));
   private static final ghv bb = a("cutout_mipped", fdg.b, fdn.c.h, 4194304, true, false, ghv.b.a().a(at).a(u).a(an).a(true));
   private static final ghv bc = a("cutout", fdg.b, fdn.c.h, 786432, true, false, ghv.b.a().a(at).a(v).a(ao).a(true));
   private static final ghv bd = a("translucent", fdg.b, fdn.c.h, 786432, true, true, a(w));
   private static final ghv be = a("translucent_moving_block", fdg.b, fdn.c.h, 786432, false, true, U());
   private static final Function<ale, ghv> bf = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ale, ghv> bg = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(z).a(new ghu.n($$0, bai.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fdg.c, fdn.c.h, 1536, true, false, $$1);
   });
   private static final Function<ale, ghv> bh = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(z).a(new ghu.n($$0, bai.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fdg.c, fdn.c.h, 1536, true, false, $$1);
   });
   private static final Function<ale, ghv> bi = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(A).a(new ghu.n($$0, bai.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fdg.c, fdn.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ale, Boolean, ghv> bj = ad.a(($$0, $$1) -> {
      ghv.b $$2 = ghv.b.a().a(B).a(new ghu.n($$0, bai.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fdg.c, fdn.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ale, Boolean, ghv> bk = ad.a(($$0, $$1) -> {
      ghv.b $$2 = ghv.b.a().a(C).a(new ghu.n($$0, bai.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fdg.c, fdn.c.h, 1536, true, false, $$2);
   });
   private static final Function<ale, ghv> bl = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(D).a(new ghu.n($$0, bai.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fdg.c, fdn.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ale, Boolean, ghv> bm = ad.a(($$0, $$1) -> {
      ghv.b $$2 = ghv.b.a().a(E).a(new ghu.n($$0, bai.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fdg.c, fdn.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ale, Boolean, ghv> bn = ad.a(($$0, $$1) -> {
      ghv.b $$2 = ghv.b.a().a(F).a(new ghu.n($$0, bai.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fdg.c, fdn.c.h, 1536, true, true, $$2);
   });
   private static final Function<ale, ghv> bo = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(G).a(new ghu.n($$0, bai.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fdg.c, fdn.c.h, 1536, $$1);
   });
   private static final BiFunction<ale, Boolean, ghv> bp = ad.a(($$0, $$1) -> {
      ghv.b $$2 = ghv.b.a().a(H).a(new ghu.n($$0, bai.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fdg.b, fdn.c.h, 1536, false, true, $$2);
   });
   private static final Function<ale, ghv> bq = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(I).a(new ghu.n($$0, bai.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fdg.c, fdn.c.h, 1536, $$1);
   });
   private static final Function<ale, ghv> br = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(J).a(new ghu.n($$0, bai.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fdg.c, fdn.c.h, 1536, false, true, $$1);
   });
   private static final Function<ale, ghv> bs = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(K).a(new ghu.n($$0, bai.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fdg.c, fdn.c.h, 1536, false, false, $$1);
   });
   private static final Function<ale, ghv> bt = ad.b($$0 -> {
      ghv.b $$1 = ghv.b.a().a(L).a(new ghu.n($$0, bai.b, false)).a(ay).a(true);
      return a("entity_alpha", fdg.c, fdn.c.h, 1536, $$1);
   });
   private static final BiFunction<ale, ghu.p, ghv> bu = ad.a(($$0, $$1) -> {
      ghu.n $$2 = new ghu.n($$0, bai.b, false);
      return a("eyes", fdg.c, fdn.c.h, 1536, false, true, ghv.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final ghv bv = a("leash", fdg.h, fdn.c.f, 1536, ghv.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final ghv bw = a("water_mask", fdg.e, fdn.c.h, 1536, ghv.b.a().a(P).a(ap).a(aF).a(false));
   private static final ghv bx = a(
      "armor_entity_glint", fdg.i, fdn.c.h, 1536, ghv.b.a().a(R).a(new ghu.n(gom.a, bai.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final ghv by = a(
      "glint_translucent", fdg.i, fdn.c.h, 1536, ghv.b.a().a(S).a(new ghu.n(gom.b, bai.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final ghv bz = a("glint", fdg.i, fdn.c.h, 1536, ghv.b.a().a(T).a(new ghu.n(gom.b, bai.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final ghv bA = a(
      "entity_glint", fdg.i, fdn.c.h, 1536, ghv.b.a().a(U).a(new ghu.n(gom.a, bai.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<ale, ghv> bB = ad.b($$0 -> {
      ghu.n $$1 = new ghu.n($$0, bai.b, false);
      return a("crumbling", fdg.b, fdn.c.h, 1536, false, true, ghv.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ale, ghv> bC = ad.b(
      $$0 -> a("text", fdg.k, fdn.c.h, 786432, false, false, ghv.b.a().a(W).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(false))
   );
   private static final ghv bD = a("text_background", fdg.h, fdn.c.h, 1536, false, true, ghv.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ale, ghv> bE = ad.b(
      $$0 -> a("text_intensity", fdg.k, fdn.c.h, 786432, false, true, ghv.b.a().a(Y).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(false))
   );
   private static final Function<ale, ghv> bF = ad.b(
      $$0 -> a("text_polygon_offset", fdg.k, fdn.c.h, 1536, false, true, ghv.b.a().a(W).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, ghv> bG = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fdg.k, fdn.c.h, 1536, false, true, ghv.b.a().a(Y).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, ghv> bH = ad.b(
      $$0 -> a("text_see_through", fdg.k, fdn.c.h, 1536, false, true, ghv.b.a().a(Z).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final ghv bI = a("text_background_see_through", fdg.h, fdn.c.h, 1536, false, true, ghv.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ale, ghv> bJ = ad.b(
      $$0 -> a("text_intensity_see_through", fdg.k, fdn.c.h, 1536, false, true, ghv.b.a().a(ab).a(new ghu.n($$0, bai.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final ghv bK = a("lightning", fdg.f, fdn.c.h, 1536, false, true, ghv.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final ghv bL = a("dragon_rays", fdg.f, fdn.c.e, 1536, false, false, ghv.b.a().a(ac).a(aE).a(e).a(false));
   private static final ghv bM = a("dragon_rays_depth", fdg.e, fdn.c.e, 1536, false, false, ghv.b.a().a(o).a(aF).a(false));
   private static final ghv bN = a("tripwire", fdg.b, fdn.c.h, 1536, true, true, V());
   private static final ghv bO = a(
      "end_portal", fdg.e, fdn.c.h, 1536, false, false, ghv.b.a().a(ae).a(ghu.i.d().a(gkp.a, false, false).a(gkp.b, false, false).a()).a(false)
   );
   private static final ghv bP = a(
      "end_gateway", fdg.e, fdn.c.h, 1536, false, false, ghv.b.a().a(af).a(ghu.i.d().a(gkp.a, false, false).a(gkp.b, false, false).a()).a(false)
   );
   private static final ghv bQ = a(false, false);
   private static final ghv bR = a(false, true);
   private static final ghv bS = a(true, true);
   public static final ghv.a aX = a("lines", fdg.g, fdn.c.a, 1536, ghv.b.a().a(ah).a(new ghu.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final ghv.a aY = a(
      "line_strip", fdg.g, fdn.c.b, 1536, ghv.b.a().a(ah).a(new ghu.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, ghv.a> bT = ad.b(
      $$0 -> a("debug_line_strip", fdg.f, fdn.c.d, 1536, ghv.b.a().a(r).a(new ghu.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final ghv.a bU = a("debug_filled_box", fdg.f, fdn.c.f, 1536, false, true, ghv.b.a().a(r).a(aI).a(h).a(false));
   private static final ghv.a bV = a("debug_quads", fdg.f, fdn.c.h, 1536, false, true, ghv.b.a().a(r).a(h).a(ay).a(false));
   private static final ghv.a bW = a("debug_triangle_fan", fdg.f, fdn.c.g, 1536, false, true, ghv.b.a().a(r).a(h).a(ay).a(false));
   private static final ghv.a bX = a("debug_structure_quads", fdg.f, fdn.c.h, 1536, false, true, ghv.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final ghv.a bY = a("debug_section_quads", fdg.f, fdn.c.h, 1536, false, true, ghv.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final ghv.a bZ = a("gui", fdg.f, fdn.c.h, 786432, ghv.b.a().a(ai).a(h).a(aB).a(false));
   private static final ghv.a ca = a("gui_overlay", fdg.f, fdn.c.h, 1536, ghv.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<ale, ghv> cb = ad.b(
      $$0 -> a("gui_textured_overlay", fdg.j, fdn.c.h, 1536, ghv.b.a().a(new ghu.n($$0, bai.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<ale, ghv> cc = ad.b(
      $$0 -> a("gui_opaque_textured_background", fdg.j, fdn.c.h, 786432, ghv.b.a().a(new ghu.n($$0, bai.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final ghv.a cd = a("gui_nausea_overlay", fdg.j, fdn.c.h, 1536, ghv.b.a().a(new ghu.n(fka.a, bai.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final ghv.a ce = a("gui_text_highlight", fdg.f, fdn.c.h, 1536, ghv.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final ghv.a cf = a("gui_ghost_recipe_overlay", fdg.f, fdn.c.h, 1536, ghv.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<ale, ghv> cg = ad.b(
      $$0 -> a("gui_textured", fdg.j, fdn.c.h, 786432, ghv.b.a().a(new ghu.n($$0, bai.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<ale, ghv> ch = ad.b(
      $$0 -> a("vignette", fdg.j, fdn.c.h, 786432, ghv.b.a().a(new ghu.n($$0, bai.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<ale, ghv> ci = ad.b(
      $$0 -> a("crosshair", fdg.j, fdn.c.h, 786432, ghv.b.a().a(new ghu.n($$0, bai.b, false)).a(s).a(j).a(false))
   );
   private static final ghv.a cj = a("mojang_logo", fdg.j, fdn.c.h, 786432, ghv.b.a().a(new ghu.n(fpx.a, bai.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<ghv> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final fdn cl;
   private final fdn.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static ghv c() {
      return ba;
   }

   public static ghv d() {
      return bb;
   }

   public static ghv e() {
      return bc;
   }

   private static ghv.b a(ghu.m $$0) {
      return ghv.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static ghv f() {
      return bd;
   }

   private static ghv.b U() {
      return ghv.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static ghv g() {
      return be;
   }

   private static ghv.a a(String $$0, ale $$1, boolean $$2) {
      ghv.b $$3 = ghv.b.a().a(y).a(new ghu.n($$1, bai.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fdg.c, fdn.c.h, 1536, true, false, $$3);
   }

   public static ghv a(ale $$0) {
      return bf.apply($$0);
   }

   public static ghv b(ale $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static ghv c(ale $$0) {
      return bg.apply($$0);
   }

   public static ghv d(ale $$0) {
      return bh.apply($$0);
   }

   public static ghv e(ale $$0) {
      return bi.apply($$0);
   }

   public static ghv a(ale $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static ghv f(ale $$0) {
      return a($$0, true);
   }

   public static ghv b(ale $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static ghv g(ale $$0) {
      return b($$0, true);
   }

   public static ghv h(ale $$0) {
      return bl.apply($$0);
   }

   public static ghv c(ale $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static ghv i(ale $$0) {
      return c($$0, true);
   }

   public static ghv d(ale $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static ghv j(ale $$0) {
      return d($$0, true);
   }

   public static ghv k(ale $$0) {
      return bo.apply($$0);
   }

   public static ghv e(ale $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static ghv l(ale $$0) {
      return bq.apply($$0);
   }

   public static ghv m(ale $$0) {
      return br.apply($$0);
   }

   public static ghv n(ale $$0) {
      return bs.apply($$0);
   }

   public static ghv o(ale $$0) {
      return bt.apply($$0);
   }

   public static ghv p(ale $$0) {
      return bu.apply($$0, d);
   }

   public static ghv q(ale $$0) {
      return bn.apply($$0, false);
   }

   public static ghv a(ale $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fdg.c,
         fdn.c.h,
         1536,
         false,
         true,
         ghv.b.a().a(am).a(new ghu.n($$0, bai.b, false)).a(new ghu.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static ghv b(ale $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fdg.c,
         fdn.c.h,
         1536,
         false,
         true,
         ghv.b.a().a(N).a(new ghu.n($$0, bai.b, false)).a(new ghu.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static ghv h() {
      return bv;
   }

   public static ghv i() {
      return bw;
   }

   public static ghv r(ale $$0) {
      return ghv.a.aZ.apply($$0, ay);
   }

   public static ghv j() {
      return bx;
   }

   public static ghv k() {
      return by;
   }

   public static ghv l() {
      return bz;
   }

   public static ghv m() {
      return bA;
   }

   public static ghv s(ale $$0) {
      return bB.apply($$0);
   }

   public static ghv t(ale $$0) {
      return bC.apply($$0);
   }

   public static ghv n() {
      return bD;
   }

   public static ghv u(ale $$0) {
      return bE.apply($$0);
   }

   public static ghv v(ale $$0) {
      return bF.apply($$0);
   }

   public static ghv w(ale $$0) {
      return bG.apply($$0);
   }

   public static ghv x(ale $$0) {
      return bH.apply($$0);
   }

   public static ghv o() {
      return bI;
   }

   public static ghv y(ale $$0) {
      return bJ.apply($$0);
   }

   public static ghv p() {
      return bK;
   }

   public static ghv q() {
      return bL;
   }

   public static ghv r() {
      return bM;
   }

   private static ghv.b V() {
      return ghv.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static ghv s() {
      return bN;
   }

   public static ghv t() {
      return bO;
   }

   public static ghv u() {
      return bP;
   }

   private static ghv.a a(boolean $$0, boolean $$1) {
      return a("clouds", fdg.f, fdn.c.h, 786432, false, false, ghv.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static ghv v() {
      return bQ;
   }

   public static ghv w() {
      return bR;
   }

   public static ghv x() {
      return bS;
   }

   public static ghv y() {
      return aX;
   }

   public static ghv z() {
      return aY;
   }

   public static ghv a(double $$0) {
      return bT.apply($$0);
   }

   public static ghv A() {
      return bU;
   }

   public static ghv B() {
      return bV;
   }

   public static ghv C() {
      return bW;
   }

   public static ghv D() {
      return bX;
   }

   public static ghv E() {
      return bY;
   }

   public static ghv F() {
      return bZ;
   }

   public static ghv G() {
      return ca;
   }

   public static ghv z(ale $$0) {
      return cb.apply($$0);
   }

   public static ghv A(ale $$0) {
      return cc.apply($$0);
   }

   public static ghv H() {
      return cd;
   }

   public static ghv I() {
      return ce;
   }

   public static ghv J() {
      return cf;
   }

   public static ghv B(ale $$0) {
      return cg.apply($$0);
   }

   public static ghv C(ale $$0) {
      return ch.apply($$0);
   }

   public static ghv D(ale $$0) {
      return ci.apply($$0);
   }

   public static ghv K() {
      return cj;
   }

   public ghv(String $$0, fdn $$1, fdn.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static ghv.a a(String $$0, fdn $$1, fdn.c $$2, int $$3, ghv.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static ghv.a a(String $$0, fdn $$1, fdn.c $$2, int $$3, boolean $$4, boolean $$5, ghv.b $$6) {
      return new ghv.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fdh $$0) {
      this.a();
      fde.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<ghv> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public fdn N() {
      return this.cl;
   }

   public fdn.c O() {
      return this.cm;
   }

   public Optional<ghv> P() {
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

   static final class a extends ghv {
      static final BiFunction<ale, ghu.c, ghv> aZ = ad.a(
         ($$0, $$1) -> ghv.a("outline", fdg.j, fdn.c.h, 1536, ghv.b.a().a(Q).a(new ghu.n($$0, bai.b, false)).a($$1).a(az).a(aL).a(ghv.c.b))
      );
      private final ghv.b ba;
      private final Optional<ghv> bb;
      private final boolean bc;

      a(String $$0, fdn $$1, fdn.c $$2, int $$3, boolean $$4, boolean $$5, ghv.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ghu::a), () -> $$6.o.forEach(ghu::b));
         this.ba = $$6;
         this.bb = $$6.n == ghv.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == ghv.c.b;
      }

      @Override
      public Optional<ghv> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final ghv.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final ghu.e a;
      private final ghu.m b;
      private final ghu.p c;
      private final ghu.d d;
      final ghu.c e;
      private final ghu.g f;
      private final ghu.l g;
      private final ghu.f h;
      private final ghu.k i;
      private final ghu.o j;
      private final ghu.q k;
      private final ghu.h l;
      private final ghu.b m;
      final ghv.c n;
      final ImmutableList<ghu> o;

      b(
         ghu.e $$0,
         ghu.m $$1,
         ghu.p $$2,
         ghu.d $$3,
         ghu.c $$4,
         ghu.g $$5,
         ghu.l $$6,
         ghu.f $$7,
         ghu.k $$8,
         ghu.o $$9,
         ghu.q $$10,
         ghu.h $$11,
         ghu.b $$12,
         ghv.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ghu[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static ghv.b.a a() {
         return new ghv.b.a();
      }

      public static class a {
         private ghu.e a = ghu.ap;
         private ghu.m b = ghu.m;
         private ghu.p c;
         private ghu.d d;
         private ghu.c e;
         private ghu.g f;
         private ghu.l g;
         private ghu.f h;
         private ghu.k i;
         private ghu.o j;
         private ghu.q k;
         private ghu.h l;
         private ghu.b m;

         a() {
            this.c = ghu.c;
            this.d = ghu.aB;
            this.e = ghu.ax;
            this.f = ghu.au;
            this.g = ghu.aw;
            this.h = ghu.aG;
            this.i = ghu.aK;
            this.j = ghu.aq;
            this.k = ghu.aD;
            this.l = ghu.aR;
            this.m = ghu.aS;
         }

         public ghv.b.a a(ghu.e $$0) {
            this.a = $$0;
            return this;
         }

         public ghv.b.a a(ghu.m $$0) {
            this.b = $$0;
            return this;
         }

         public ghv.b.a a(ghu.p $$0) {
            this.c = $$0;
            return this;
         }

         public ghv.b.a a(ghu.d $$0) {
            this.d = $$0;
            return this;
         }

         public ghv.b.a a(ghu.c $$0) {
            this.e = $$0;
            return this;
         }

         public ghv.b.a a(ghu.g $$0) {
            this.f = $$0;
            return this;
         }

         public ghv.b.a a(ghu.l $$0) {
            this.g = $$0;
            return this;
         }

         public ghv.b.a a(ghu.f $$0) {
            this.h = $$0;
            return this;
         }

         public ghv.b.a a(ghu.k $$0) {
            this.i = $$0;
            return this;
         }

         public ghv.b.a a(ghu.o $$0) {
            this.j = $$0;
            return this;
         }

         public ghv.b.a a(ghu.q $$0) {
            this.k = $$0;
            return this;
         }

         public ghv.b.a a(ghu.h $$0) {
            this.l = $$0;
            return this;
         }

         public ghv.b.a a(ghu.b $$0) {
            this.m = $$0;
            return this;
         }

         public ghv.b a(boolean $$0) {
            return this.a($$0 ? ghv.c.c : ghv.c.a);
         }

         public ghv.b a(ghv.c $$0) {
            return new ghv.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
