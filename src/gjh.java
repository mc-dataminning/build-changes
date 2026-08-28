import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gjh extends gjg {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final gjh ba = a("solid", fei.b, fep.c.h, 4194304, true, false, gjh.b.a().a(at).a(t).a(an).a(true));
   private static final gjh bb = a("cutout_mipped", fei.b, fep.c.h, 4194304, true, false, gjh.b.a().a(at).a(u).a(an).a(true));
   private static final gjh bc = a("cutout", fei.b, fep.c.h, 786432, true, false, gjh.b.a().a(at).a(v).a(ao).a(true));
   private static final gjh bd = a("translucent", fei.b, fep.c.h, 786432, true, true, a(w));
   private static final gjh be = a("translucent_moving_block", fei.b, fep.c.h, 786432, false, true, U());
   private static final Function<all, gjh> bf = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<all, gjh> bg = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(z).a(new gjg.n($$0, bar.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fei.c, fep.c.h, 1536, true, false, $$1);
   });
   private static final Function<all, gjh> bh = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(z).a(new gjg.n($$0, bar.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fei.c, fep.c.h, 1536, true, false, $$1);
   });
   private static final Function<all, gjh> bi = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(A).a(new gjg.n($$0, bar.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fei.c, fep.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<all, Boolean, gjh> bj = ae.a(($$0, $$1) -> {
      gjh.b $$2 = gjh.b.a().a(B).a(new gjg.n($$0, bar.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fei.c, fep.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<all, Boolean, gjh> bk = ae.a(($$0, $$1) -> {
      gjh.b $$2 = gjh.b.a().a(C).a(new gjg.n($$0, bar.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fei.c, fep.c.h, 1536, true, false, $$2);
   });
   private static final Function<all, gjh> bl = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(D).a(new gjg.n($$0, bar.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fei.c, fep.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<all, Boolean, gjh> bm = ae.a(($$0, $$1) -> {
      gjh.b $$2 = gjh.b.a().a(E).a(new gjg.n($$0, bar.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fei.c, fep.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<all, Boolean, gjh> bn = ae.a(($$0, $$1) -> {
      gjh.b $$2 = gjh.b.a().a(F).a(new gjg.n($$0, bar.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fei.c, fep.c.h, 1536, true, true, $$2);
   });
   private static final Function<all, gjh> bo = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(G).a(new gjg.n($$0, bar.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fei.c, fep.c.h, 1536, $$1);
   });
   private static final BiFunction<all, Boolean, gjh> bp = ae.a(($$0, $$1) -> {
      gjh.b $$2 = gjh.b.a().a(H).a(new gjg.n($$0, bar.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fei.b, fep.c.h, 1536, false, true, $$2);
   });
   private static final Function<all, gjh> bq = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(I).a(new gjg.n($$0, bar.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fei.c, fep.c.h, 1536, $$1);
   });
   private static final Function<all, gjh> br = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(J).a(new gjg.n($$0, bar.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fei.c, fep.c.h, 1536, false, true, $$1);
   });
   private static final Function<all, gjh> bs = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(K).a(new gjg.n($$0, bar.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fei.c, fep.c.h, 1536, false, false, $$1);
   });
   private static final Function<all, gjh> bt = ae.b($$0 -> {
      gjh.b $$1 = gjh.b.a().a(L).a(new gjg.n($$0, bar.b, false)).a(ay).a(true);
      return a("entity_alpha", fei.c, fep.c.h, 1536, $$1);
   });
   private static final BiFunction<all, gjg.p, gjh> bu = ae.a(($$0, $$1) -> {
      gjg.n $$2 = new gjg.n($$0, bar.b, false);
      return a("eyes", fei.c, fep.c.h, 1536, false, true, gjh.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final gjh bv = a("leash", fei.h, fep.c.f, 1536, gjh.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final gjh bw = a("water_mask", fei.e, fep.c.h, 1536, gjh.b.a().a(P).a(ap).a(aF).a(false));
   private static final gjh bx = a(
      "armor_entity_glint", fei.i, fep.c.h, 1536, gjh.b.a().a(R).a(new gjg.n(gpy.a, bar.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gjh by = a(
      "glint_translucent", fei.i, fep.c.h, 1536, gjh.b.a().a(S).a(new gjg.n(gpy.b, bar.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final gjh bz = a("glint", fei.i, fep.c.h, 1536, gjh.b.a().a(T).a(new gjg.n(gpy.b, bar.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gjh bA = a(
      "entity_glint", fei.i, fep.c.h, 1536, gjh.b.a().a(U).a(new gjg.n(gpy.a, bar.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<all, gjh> bB = ae.b($$0 -> {
      gjg.n $$1 = new gjg.n($$0, bar.b, false);
      return a("crumbling", fei.b, fep.c.h, 1536, false, true, gjh.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<all, gjh> bC = ae.b(
      $$0 -> a("text", fei.k, fep.c.h, 786432, false, false, gjh.b.a().a(W).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(false))
   );
   private static final gjh bD = a("text_background", fei.h, fep.c.h, 1536, false, true, gjh.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<all, gjh> bE = ae.b(
      $$0 -> a("text_intensity", fei.k, fep.c.h, 786432, false, false, gjh.b.a().a(Y).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(false))
   );
   private static final Function<all, gjh> bF = ae.b(
      $$0 -> a("text_polygon_offset", fei.k, fep.c.h, 1536, false, true, gjh.b.a().a(W).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<all, gjh> bG = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fei.k, fep.c.h, 1536, false, true, gjh.b.a().a(Y).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<all, gjh> bH = ae.b(
      $$0 -> a("text_see_through", fei.k, fep.c.h, 1536, false, false, gjh.b.a().a(Z).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gjh bI = a("text_background_see_through", fei.h, fep.c.h, 1536, false, true, gjh.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<all, gjh> bJ = ae.b(
      $$0 -> a("text_intensity_see_through", fei.k, fep.c.h, 1536, false, true, gjh.b.a().a(ab).a(new gjg.n($$0, bar.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gjh bK = a("lightning", fei.f, fep.c.h, 1536, false, true, gjh.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final gjh bL = a("dragon_rays", fei.f, fep.c.e, 1536, false, false, gjh.b.a().a(ac).a(aE).a(e).a(false));
   private static final gjh bM = a("dragon_rays_depth", fei.e, fep.c.e, 1536, false, false, gjh.b.a().a(o).a(aF).a(false));
   private static final gjh bN = a("tripwire", fei.b, fep.c.h, 1536, true, true, V());
   private static final gjh bO = a(
      "end_portal", fei.e, fep.c.h, 1536, false, false, gjh.b.a().a(ae).a(gjg.i.d().a(gmb.a, false, false).a(gmb.b, false, false).a()).a(false)
   );
   private static final gjh bP = a(
      "end_gateway", fei.e, fep.c.h, 1536, false, false, gjh.b.a().a(af).a(gjg.i.d().a(gmb.a, false, false).a(gmb.b, false, false).a()).a(false)
   );
   private static final gjh bQ = a(false, false);
   private static final gjh bR = a(false, true);
   private static final gjh bS = a(true, true);
   public static final gjh.a aX = a("lines", fei.g, fep.c.a, 1536, gjh.b.a().a(ah).a(new gjg.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final gjh.a aY = a(
      "line_strip", fei.g, fep.c.b, 1536, gjh.b.a().a(ah).a(new gjg.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gjh.a> bT = ae.b(
      $$0 -> a("debug_line_strip", fei.f, fep.c.d, 1536, gjh.b.a().a(r).a(new gjg.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gjh.a bU = a("debug_filled_box", fei.f, fep.c.f, 1536, false, true, gjh.b.a().a(r).a(aI).a(h).a(false));
   private static final gjh.a bV = a("debug_quads", fei.f, fep.c.h, 1536, false, true, gjh.b.a().a(r).a(h).a(ay).a(false));
   private static final gjh.a bW = a("debug_triangle_fan", fei.f, fep.c.g, 1536, false, true, gjh.b.a().a(r).a(h).a(ay).a(false));
   private static final gjh.a bX = a("debug_structure_quads", fei.f, fep.c.h, 1536, false, true, gjh.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final gjh.a bY = a("debug_section_quads", fei.f, fep.c.h, 1536, false, true, gjh.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final gjh.a bZ = a("gui", fei.f, fep.c.h, 786432, gjh.b.a().a(ai).a(h).a(aB).a(false));
   private static final gjh.a ca = a("gui_overlay", fei.f, fep.c.h, 1536, gjh.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<all, gjh> cb = ae.b(
      $$0 -> a("gui_textured_overlay", fei.j, fep.c.h, 1536, gjh.b.a().a(new gjg.n($$0, bar.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<all, gjh> cc = ae.b(
      $$0 -> a("gui_opaque_textured_background", fei.j, fep.c.h, 786432, gjh.b.a().a(new gjg.n($$0, bar.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final gjh.a cd = a("gui_nausea_overlay", fei.j, fep.c.h, 1536, gjh.b.a().a(new gjg.n(fli.a, bar.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final gjh.a ce = a("gui_text_highlight", fei.f, fep.c.h, 1536, gjh.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final gjh.a cf = a("gui_ghost_recipe_overlay", fei.f, fep.c.h, 1536, gjh.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<all, gjh> cg = ae.b(
      $$0 -> a("gui_textured", fei.j, fep.c.h, 786432, gjh.b.a().a(new gjg.n($$0, bar.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<all, gjh> ch = ae.b(
      $$0 -> a("vignette", fei.j, fep.c.h, 786432, gjh.b.a().a(new gjg.n($$0, bar.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<all, gjh> ci = ae.b(
      $$0 -> a("crosshair", fei.j, fep.c.h, 786432, gjh.b.a().a(new gjg.n($$0, bar.b, false)).a(s).a(j).a(false))
   );
   private static final gjh.a cj = a("mojang_logo", fei.j, fep.c.h, 786432, gjh.b.a().a(new gjg.n(frf.a, bar.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<gjh> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final fep cl;
   private final fep.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static gjh c() {
      return ba;
   }

   public static gjh d() {
      return bb;
   }

   public static gjh e() {
      return bc;
   }

   private static gjh.b a(gjg.m $$0) {
      return gjh.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static gjh f() {
      return bd;
   }

   private static gjh.b U() {
      return gjh.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static gjh g() {
      return be;
   }

   private static gjh.a a(String $$0, all $$1, boolean $$2) {
      gjh.b $$3 = gjh.b.a().a(y).a(new gjg.n($$1, bar.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fei.c, fep.c.h, 1536, true, false, $$3);
   }

   public static gjh a(all $$0) {
      return bf.apply($$0);
   }

   public static gjh b(all $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gjh c(all $$0) {
      return bg.apply($$0);
   }

   public static gjh d(all $$0) {
      return bh.apply($$0);
   }

   public static gjh e(all $$0) {
      return bi.apply($$0);
   }

   public static gjh a(all $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gjh f(all $$0) {
      return a($$0, true);
   }

   public static gjh b(all $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static gjh g(all $$0) {
      return b($$0, true);
   }

   public static gjh h(all $$0) {
      return bl.apply($$0);
   }

   public static gjh c(all $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gjh i(all $$0) {
      return c($$0, true);
   }

   public static gjh d(all $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static gjh j(all $$0) {
      return d($$0, true);
   }

   public static gjh k(all $$0) {
      return bo.apply($$0);
   }

   public static gjh e(all $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gjh l(all $$0) {
      return bq.apply($$0);
   }

   public static gjh m(all $$0) {
      return br.apply($$0);
   }

   public static gjh n(all $$0) {
      return bs.apply($$0);
   }

   public static gjh o(all $$0) {
      return bt.apply($$0);
   }

   public static gjh p(all $$0) {
      return bu.apply($$0, d);
   }

   public static gjh q(all $$0) {
      return bn.apply($$0, false);
   }

   public static gjh a(all $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fei.c,
         fep.c.h,
         1536,
         false,
         true,
         gjh.b.a().a(am).a(new gjg.n($$0, bar.b, false)).a(new gjg.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gjh b(all $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fei.c,
         fep.c.h,
         1536,
         false,
         true,
         gjh.b.a().a(N).a(new gjg.n($$0, bar.b, false)).a(new gjg.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gjh h() {
      return bv;
   }

   public static gjh i() {
      return bw;
   }

   public static gjh r(all $$0) {
      return gjh.a.aZ.apply($$0, ay);
   }

   public static gjh j() {
      return bx;
   }

   public static gjh k() {
      return by;
   }

   public static gjh l() {
      return bz;
   }

   public static gjh m() {
      return bA;
   }

   public static gjh s(all $$0) {
      return bB.apply($$0);
   }

   public static gjh t(all $$0) {
      return bC.apply($$0);
   }

   public static gjh n() {
      return bD;
   }

   public static gjh u(all $$0) {
      return bE.apply($$0);
   }

   public static gjh v(all $$0) {
      return bF.apply($$0);
   }

   public static gjh w(all $$0) {
      return bG.apply($$0);
   }

   public static gjh x(all $$0) {
      return bH.apply($$0);
   }

   public static gjh o() {
      return bI;
   }

   public static gjh y(all $$0) {
      return bJ.apply($$0);
   }

   public static gjh p() {
      return bK;
   }

   public static gjh q() {
      return bL;
   }

   public static gjh r() {
      return bM;
   }

   private static gjh.b V() {
      return gjh.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static gjh s() {
      return bN;
   }

   public static gjh t() {
      return bO;
   }

   public static gjh u() {
      return bP;
   }

   private static gjh.a a(boolean $$0, boolean $$1) {
      return a("clouds", fei.f, fep.c.h, 786432, false, false, gjh.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static gjh v() {
      return bQ;
   }

   public static gjh w() {
      return bR;
   }

   public static gjh x() {
      return bS;
   }

   public static gjh y() {
      return aX;
   }

   public static gjh z() {
      return aY;
   }

   public static gjh a(double $$0) {
      return bT.apply($$0);
   }

   public static gjh A() {
      return bU;
   }

   public static gjh B() {
      return bV;
   }

   public static gjh C() {
      return bW;
   }

   public static gjh D() {
      return bX;
   }

   public static gjh E() {
      return bY;
   }

   public static gjh F() {
      return bZ;
   }

   public static gjh G() {
      return ca;
   }

   public static gjh z(all $$0) {
      return cb.apply($$0);
   }

   public static gjh A(all $$0) {
      return cc.apply($$0);
   }

   public static gjh H() {
      return cd;
   }

   public static gjh I() {
      return ce;
   }

   public static gjh J() {
      return cf;
   }

   public static gjh B(all $$0) {
      return cg.apply($$0);
   }

   public static gjh C(all $$0) {
      return ch.apply($$0);
   }

   public static gjh D(all $$0) {
      return ci.apply($$0);
   }

   public static gjh K() {
      return cj;
   }

   public gjh(String $$0, fep $$1, fep.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static gjh.a a(String $$0, fep $$1, fep.c $$2, int $$3, gjh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gjh.a a(String $$0, fep $$1, fep.c $$2, int $$3, boolean $$4, boolean $$5, gjh.b $$6) {
      return new gjh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fej $$0) {
      this.a();
      feg.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gjh> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public fep N() {
      return this.cl;
   }

   public fep.c O() {
      return this.cm;
   }

   public Optional<gjh> P() {
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

   static final class a extends gjh {
      static final BiFunction<all, gjg.c, gjh> aZ = ae.a(
         ($$0, $$1) -> gjh.a("outline", fei.j, fep.c.h, 1536, gjh.b.a().a(Q).a(new gjg.n($$0, bar.b, false)).a($$1).a(az).a(aL).a(gjh.c.b))
      );
      private final gjh.b ba;
      private final Optional<gjh> bb;
      private final boolean bc;

      a(String $$0, fep $$1, fep.c $$2, int $$3, boolean $$4, boolean $$5, gjh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gjg::a), () -> $$6.o.forEach(gjg::b));
         this.ba = $$6;
         this.bb = $$6.n == gjh.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == gjh.c.b;
      }

      @Override
      public Optional<gjh> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final gjh.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final gjg.e a;
      private final gjg.m b;
      private final gjg.p c;
      private final gjg.d d;
      final gjg.c e;
      private final gjg.g f;
      private final gjg.l g;
      private final gjg.f h;
      private final gjg.k i;
      private final gjg.o j;
      private final gjg.q k;
      private final gjg.h l;
      private final gjg.b m;
      final gjh.c n;
      final ImmutableList<gjg> o;

      b(
         gjg.e $$0,
         gjg.m $$1,
         gjg.p $$2,
         gjg.d $$3,
         gjg.c $$4,
         gjg.g $$5,
         gjg.l $$6,
         gjg.f $$7,
         gjg.k $$8,
         gjg.o $$9,
         gjg.q $$10,
         gjg.h $$11,
         gjg.b $$12,
         gjh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gjg[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gjh.b.a a() {
         return new gjh.b.a();
      }

      public static class a {
         private gjg.e a = gjg.ap;
         private gjg.m b = gjg.m;
         private gjg.p c;
         private gjg.d d;
         private gjg.c e;
         private gjg.g f;
         private gjg.l g;
         private gjg.f h;
         private gjg.k i;
         private gjg.o j;
         private gjg.q k;
         private gjg.h l;
         private gjg.b m;

         a() {
            this.c = gjg.c;
            this.d = gjg.aB;
            this.e = gjg.ax;
            this.f = gjg.au;
            this.g = gjg.aw;
            this.h = gjg.aG;
            this.i = gjg.aK;
            this.j = gjg.aq;
            this.k = gjg.aD;
            this.l = gjg.aR;
            this.m = gjg.aS;
         }

         public gjh.b.a a(gjg.e $$0) {
            this.a = $$0;
            return this;
         }

         public gjh.b.a a(gjg.m $$0) {
            this.b = $$0;
            return this;
         }

         public gjh.b.a a(gjg.p $$0) {
            this.c = $$0;
            return this;
         }

         public gjh.b.a a(gjg.d $$0) {
            this.d = $$0;
            return this;
         }

         public gjh.b.a a(gjg.c $$0) {
            this.e = $$0;
            return this;
         }

         public gjh.b.a a(gjg.g $$0) {
            this.f = $$0;
            return this;
         }

         public gjh.b.a a(gjg.l $$0) {
            this.g = $$0;
            return this;
         }

         public gjh.b.a a(gjg.f $$0) {
            this.h = $$0;
            return this;
         }

         public gjh.b.a a(gjg.k $$0) {
            this.i = $$0;
            return this;
         }

         public gjh.b.a a(gjg.o $$0) {
            this.j = $$0;
            return this;
         }

         public gjh.b.a a(gjg.q $$0) {
            this.k = $$0;
            return this;
         }

         public gjh.b.a a(gjg.h $$0) {
            this.l = $$0;
            return this;
         }

         public gjh.b.a a(gjg.b $$0) {
            this.m = $$0;
            return this;
         }

         public gjh.b a(boolean $$0) {
            return this.a($$0 ? gjh.c.c : gjh.c.a);
         }

         public gjh.b a(gjh.c $$0) {
            return new gjh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
