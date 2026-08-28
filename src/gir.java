import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gir extends giq {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final gir ba = a("solid", fdz.b, feg.c.h, 4194304, true, false, gir.b.a().a(at).a(t).a(an).a(true));
   private static final gir bb = a("cutout_mipped", fdz.b, feg.c.h, 4194304, true, false, gir.b.a().a(at).a(u).a(an).a(true));
   private static final gir bc = a("cutout", fdz.b, feg.c.h, 786432, true, false, gir.b.a().a(at).a(v).a(ao).a(true));
   private static final gir bd = a("translucent", fdz.b, feg.c.h, 786432, true, true, a(w));
   private static final gir be = a("translucent_moving_block", fdz.b, feg.c.h, 786432, false, true, U());
   private static final Function<ali, gir> bf = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ali, gir> bg = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(z).a(new giq.n($$0, ban.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fdz.c, feg.c.h, 1536, true, false, $$1);
   });
   private static final Function<ali, gir> bh = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(z).a(new giq.n($$0, ban.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fdz.c, feg.c.h, 1536, true, false, $$1);
   });
   private static final Function<ali, gir> bi = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(A).a(new giq.n($$0, ban.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fdz.c, feg.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ali, Boolean, gir> bj = ae.a(($$0, $$1) -> {
      gir.b $$2 = gir.b.a().a(B).a(new giq.n($$0, ban.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fdz.c, feg.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ali, Boolean, gir> bk = ae.a(($$0, $$1) -> {
      gir.b $$2 = gir.b.a().a(C).a(new giq.n($$0, ban.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fdz.c, feg.c.h, 1536, true, false, $$2);
   });
   private static final Function<ali, gir> bl = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(D).a(new giq.n($$0, ban.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fdz.c, feg.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ali, Boolean, gir> bm = ae.a(($$0, $$1) -> {
      gir.b $$2 = gir.b.a().a(E).a(new giq.n($$0, ban.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fdz.c, feg.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ali, Boolean, gir> bn = ae.a(($$0, $$1) -> {
      gir.b $$2 = gir.b.a().a(F).a(new giq.n($$0, ban.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fdz.c, feg.c.h, 1536, true, true, $$2);
   });
   private static final Function<ali, gir> bo = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(G).a(new giq.n($$0, ban.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fdz.c, feg.c.h, 1536, $$1);
   });
   private static final BiFunction<ali, Boolean, gir> bp = ae.a(($$0, $$1) -> {
      gir.b $$2 = gir.b.a().a(H).a(new giq.n($$0, ban.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fdz.b, feg.c.h, 1536, false, true, $$2);
   });
   private static final Function<ali, gir> bq = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(I).a(new giq.n($$0, ban.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fdz.c, feg.c.h, 1536, $$1);
   });
   private static final Function<ali, gir> br = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(J).a(new giq.n($$0, ban.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fdz.c, feg.c.h, 1536, false, true, $$1);
   });
   private static final Function<ali, gir> bs = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(K).a(new giq.n($$0, ban.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fdz.c, feg.c.h, 1536, false, false, $$1);
   });
   private static final Function<ali, gir> bt = ae.b($$0 -> {
      gir.b $$1 = gir.b.a().a(L).a(new giq.n($$0, ban.b, false)).a(ay).a(true);
      return a("entity_alpha", fdz.c, feg.c.h, 1536, $$1);
   });
   private static final BiFunction<ali, giq.p, gir> bu = ae.a(($$0, $$1) -> {
      giq.n $$2 = new giq.n($$0, ban.b, false);
      return a("eyes", fdz.c, feg.c.h, 1536, false, true, gir.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final gir bv = a("leash", fdz.h, feg.c.f, 1536, gir.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final gir bw = a("water_mask", fdz.e, feg.c.h, 1536, gir.b.a().a(P).a(ap).a(aF).a(false));
   private static final gir bx = a(
      "armor_entity_glint", fdz.i, feg.c.h, 1536, gir.b.a().a(R).a(new giq.n(gpi.a, ban.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gir by = a(
      "glint_translucent", fdz.i, feg.c.h, 1536, gir.b.a().a(S).a(new giq.n(gpi.b, ban.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final gir bz = a("glint", fdz.i, feg.c.h, 1536, gir.b.a().a(T).a(new giq.n(gpi.b, ban.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gir bA = a(
      "entity_glint", fdz.i, feg.c.h, 1536, gir.b.a().a(U).a(new giq.n(gpi.a, ban.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<ali, gir> bB = ae.b($$0 -> {
      giq.n $$1 = new giq.n($$0, ban.b, false);
      return a("crumbling", fdz.b, feg.c.h, 1536, false, true, gir.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ali, gir> bC = ae.b(
      $$0 -> a("text", fdz.k, feg.c.h, 786432, false, false, gir.b.a().a(W).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(false))
   );
   private static final gir bD = a("text_background", fdz.h, feg.c.h, 1536, false, true, gir.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ali, gir> bE = ae.b(
      $$0 -> a("text_intensity", fdz.k, feg.c.h, 786432, false, true, gir.b.a().a(Y).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(false))
   );
   private static final Function<ali, gir> bF = ae.b(
      $$0 -> a("text_polygon_offset", fdz.k, feg.c.h, 1536, false, true, gir.b.a().a(W).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ali, gir> bG = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fdz.k, feg.c.h, 1536, false, true, gir.b.a().a(Y).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ali, gir> bH = ae.b(
      $$0 -> a("text_see_through", fdz.k, feg.c.h, 1536, false, true, gir.b.a().a(Z).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gir bI = a("text_background_see_through", fdz.h, feg.c.h, 1536, false, true, gir.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ali, gir> bJ = ae.b(
      $$0 -> a("text_intensity_see_through", fdz.k, feg.c.h, 1536, false, true, gir.b.a().a(ab).a(new giq.n($$0, ban.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gir bK = a("lightning", fdz.f, feg.c.h, 1536, false, true, gir.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final gir bL = a("dragon_rays", fdz.f, feg.c.e, 1536, false, false, gir.b.a().a(ac).a(aE).a(e).a(false));
   private static final gir bM = a("dragon_rays_depth", fdz.e, feg.c.e, 1536, false, false, gir.b.a().a(o).a(aF).a(false));
   private static final gir bN = a("tripwire", fdz.b, feg.c.h, 1536, true, true, V());
   private static final gir bO = a(
      "end_portal", fdz.e, feg.c.h, 1536, false, false, gir.b.a().a(ae).a(giq.i.d().a(gll.a, false, false).a(gll.b, false, false).a()).a(false)
   );
   private static final gir bP = a(
      "end_gateway", fdz.e, feg.c.h, 1536, false, false, gir.b.a().a(af).a(giq.i.d().a(gll.a, false, false).a(gll.b, false, false).a()).a(false)
   );
   private static final gir bQ = a(false, false);
   private static final gir bR = a(false, true);
   private static final gir bS = a(true, true);
   public static final gir.a aX = a("lines", fdz.g, feg.c.a, 1536, gir.b.a().a(ah).a(new giq.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final gir.a aY = a(
      "line_strip", fdz.g, feg.c.b, 1536, gir.b.a().a(ah).a(new giq.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gir.a> bT = ae.b(
      $$0 -> a("debug_line_strip", fdz.f, feg.c.d, 1536, gir.b.a().a(r).a(new giq.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gir.a bU = a("debug_filled_box", fdz.f, feg.c.f, 1536, false, true, gir.b.a().a(r).a(aI).a(h).a(false));
   private static final gir.a bV = a("debug_quads", fdz.f, feg.c.h, 1536, false, true, gir.b.a().a(r).a(h).a(ay).a(false));
   private static final gir.a bW = a("debug_triangle_fan", fdz.f, feg.c.g, 1536, false, true, gir.b.a().a(r).a(h).a(ay).a(false));
   private static final gir.a bX = a("debug_structure_quads", fdz.f, feg.c.h, 1536, false, true, gir.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final gir.a bY = a("debug_section_quads", fdz.f, feg.c.h, 1536, false, true, gir.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final gir.a bZ = a("gui", fdz.f, feg.c.h, 786432, gir.b.a().a(ai).a(h).a(aB).a(false));
   private static final gir.a ca = a("gui_overlay", fdz.f, feg.c.h, 1536, gir.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<ali, gir> cb = ae.b(
      $$0 -> a("gui_textured_overlay", fdz.j, feg.c.h, 1536, gir.b.a().a(new giq.n($$0, ban.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<ali, gir> cc = ae.b(
      $$0 -> a("gui_opaque_textured_background", fdz.j, feg.c.h, 786432, gir.b.a().a(new giq.n($$0, ban.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final gir.a cd = a("gui_nausea_overlay", fdz.j, feg.c.h, 1536, gir.b.a().a(new giq.n(fkt.a, ban.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final gir.a ce = a("gui_text_highlight", fdz.f, feg.c.h, 1536, gir.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final gir.a cf = a("gui_ghost_recipe_overlay", fdz.f, feg.c.h, 1536, gir.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<ali, gir> cg = ae.b(
      $$0 -> a("gui_textured", fdz.j, feg.c.h, 786432, gir.b.a().a(new giq.n($$0, ban.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<ali, gir> ch = ae.b(
      $$0 -> a("vignette", fdz.j, feg.c.h, 786432, gir.b.a().a(new giq.n($$0, ban.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<ali, gir> ci = ae.b(
      $$0 -> a("crosshair", fdz.j, feg.c.h, 786432, gir.b.a().a(new giq.n($$0, ban.b, false)).a(s).a(j).a(false))
   );
   private static final gir.a cj = a("mojang_logo", fdz.j, feg.c.h, 786432, gir.b.a().a(new giq.n(fqq.a, ban.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<gir> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final feg cl;
   private final feg.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static gir c() {
      return ba;
   }

   public static gir d() {
      return bb;
   }

   public static gir e() {
      return bc;
   }

   private static gir.b a(giq.m $$0) {
      return gir.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static gir f() {
      return bd;
   }

   private static gir.b U() {
      return gir.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static gir g() {
      return be;
   }

   private static gir.a a(String $$0, ali $$1, boolean $$2) {
      gir.b $$3 = gir.b.a().a(y).a(new giq.n($$1, ban.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fdz.c, feg.c.h, 1536, true, false, $$3);
   }

   public static gir a(ali $$0) {
      return bf.apply($$0);
   }

   public static gir b(ali $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gir c(ali $$0) {
      return bg.apply($$0);
   }

   public static gir d(ali $$0) {
      return bh.apply($$0);
   }

   public static gir e(ali $$0) {
      return bi.apply($$0);
   }

   public static gir a(ali $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gir f(ali $$0) {
      return a($$0, true);
   }

   public static gir b(ali $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static gir g(ali $$0) {
      return b($$0, true);
   }

   public static gir h(ali $$0) {
      return bl.apply($$0);
   }

   public static gir c(ali $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gir i(ali $$0) {
      return c($$0, true);
   }

   public static gir d(ali $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static gir j(ali $$0) {
      return d($$0, true);
   }

   public static gir k(ali $$0) {
      return bo.apply($$0);
   }

   public static gir e(ali $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gir l(ali $$0) {
      return bq.apply($$0);
   }

   public static gir m(ali $$0) {
      return br.apply($$0);
   }

   public static gir n(ali $$0) {
      return bs.apply($$0);
   }

   public static gir o(ali $$0) {
      return bt.apply($$0);
   }

   public static gir p(ali $$0) {
      return bu.apply($$0, d);
   }

   public static gir q(ali $$0) {
      return bn.apply($$0, false);
   }

   public static gir a(ali $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fdz.c,
         feg.c.h,
         1536,
         false,
         true,
         gir.b.a().a(am).a(new giq.n($$0, ban.b, false)).a(new giq.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gir b(ali $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fdz.c,
         feg.c.h,
         1536,
         false,
         true,
         gir.b.a().a(N).a(new giq.n($$0, ban.b, false)).a(new giq.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gir h() {
      return bv;
   }

   public static gir i() {
      return bw;
   }

   public static gir r(ali $$0) {
      return gir.a.aZ.apply($$0, ay);
   }

   public static gir j() {
      return bx;
   }

   public static gir k() {
      return by;
   }

   public static gir l() {
      return bz;
   }

   public static gir m() {
      return bA;
   }

   public static gir s(ali $$0) {
      return bB.apply($$0);
   }

   public static gir t(ali $$0) {
      return bC.apply($$0);
   }

   public static gir n() {
      return bD;
   }

   public static gir u(ali $$0) {
      return bE.apply($$0);
   }

   public static gir v(ali $$0) {
      return bF.apply($$0);
   }

   public static gir w(ali $$0) {
      return bG.apply($$0);
   }

   public static gir x(ali $$0) {
      return bH.apply($$0);
   }

   public static gir o() {
      return bI;
   }

   public static gir y(ali $$0) {
      return bJ.apply($$0);
   }

   public static gir p() {
      return bK;
   }

   public static gir q() {
      return bL;
   }

   public static gir r() {
      return bM;
   }

   private static gir.b V() {
      return gir.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static gir s() {
      return bN;
   }

   public static gir t() {
      return bO;
   }

   public static gir u() {
      return bP;
   }

   private static gir.a a(boolean $$0, boolean $$1) {
      return a("clouds", fdz.f, feg.c.h, 786432, false, false, gir.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static gir v() {
      return bQ;
   }

   public static gir w() {
      return bR;
   }

   public static gir x() {
      return bS;
   }

   public static gir y() {
      return aX;
   }

   public static gir z() {
      return aY;
   }

   public static gir a(double $$0) {
      return bT.apply($$0);
   }

   public static gir A() {
      return bU;
   }

   public static gir B() {
      return bV;
   }

   public static gir C() {
      return bW;
   }

   public static gir D() {
      return bX;
   }

   public static gir E() {
      return bY;
   }

   public static gir F() {
      return bZ;
   }

   public static gir G() {
      return ca;
   }

   public static gir z(ali $$0) {
      return cb.apply($$0);
   }

   public static gir A(ali $$0) {
      return cc.apply($$0);
   }

   public static gir H() {
      return cd;
   }

   public static gir I() {
      return ce;
   }

   public static gir J() {
      return cf;
   }

   public static gir B(ali $$0) {
      return cg.apply($$0);
   }

   public static gir C(ali $$0) {
      return ch.apply($$0);
   }

   public static gir D(ali $$0) {
      return ci.apply($$0);
   }

   public static gir K() {
      return cj;
   }

   public gir(String $$0, feg $$1, feg.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static gir.a a(String $$0, feg $$1, feg.c $$2, int $$3, gir.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gir.a a(String $$0, feg $$1, feg.c $$2, int $$3, boolean $$4, boolean $$5, gir.b $$6) {
      return new gir.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fea $$0) {
      this.a();
      fdx.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gir> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public feg N() {
      return this.cl;
   }

   public feg.c O() {
      return this.cm;
   }

   public Optional<gir> P() {
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

   static final class a extends gir {
      static final BiFunction<ali, giq.c, gir> aZ = ae.a(
         ($$0, $$1) -> gir.a("outline", fdz.j, feg.c.h, 1536, gir.b.a().a(Q).a(new giq.n($$0, ban.b, false)).a($$1).a(az).a(aL).a(gir.c.b))
      );
      private final gir.b ba;
      private final Optional<gir> bb;
      private final boolean bc;

      a(String $$0, feg $$1, feg.c $$2, int $$3, boolean $$4, boolean $$5, gir.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(giq::a), () -> $$6.o.forEach(giq::b));
         this.ba = $$6;
         this.bb = $$6.n == gir.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == gir.c.b;
      }

      @Override
      public Optional<gir> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final gir.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final giq.e a;
      private final giq.m b;
      private final giq.p c;
      private final giq.d d;
      final giq.c e;
      private final giq.g f;
      private final giq.l g;
      private final giq.f h;
      private final giq.k i;
      private final giq.o j;
      private final giq.q k;
      private final giq.h l;
      private final giq.b m;
      final gir.c n;
      final ImmutableList<giq> o;

      b(
         giq.e $$0,
         giq.m $$1,
         giq.p $$2,
         giq.d $$3,
         giq.c $$4,
         giq.g $$5,
         giq.l $$6,
         giq.f $$7,
         giq.k $$8,
         giq.o $$9,
         giq.q $$10,
         giq.h $$11,
         giq.b $$12,
         gir.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new giq[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gir.b.a a() {
         return new gir.b.a();
      }

      public static class a {
         private giq.e a = giq.ap;
         private giq.m b = giq.m;
         private giq.p c;
         private giq.d d;
         private giq.c e;
         private giq.g f;
         private giq.l g;
         private giq.f h;
         private giq.k i;
         private giq.o j;
         private giq.q k;
         private giq.h l;
         private giq.b m;

         a() {
            this.c = giq.c;
            this.d = giq.aB;
            this.e = giq.ax;
            this.f = giq.au;
            this.g = giq.aw;
            this.h = giq.aG;
            this.i = giq.aK;
            this.j = giq.aq;
            this.k = giq.aD;
            this.l = giq.aR;
            this.m = giq.aS;
         }

         public gir.b.a a(giq.e $$0) {
            this.a = $$0;
            return this;
         }

         public gir.b.a a(giq.m $$0) {
            this.b = $$0;
            return this;
         }

         public gir.b.a a(giq.p $$0) {
            this.c = $$0;
            return this;
         }

         public gir.b.a a(giq.d $$0) {
            this.d = $$0;
            return this;
         }

         public gir.b.a a(giq.c $$0) {
            this.e = $$0;
            return this;
         }

         public gir.b.a a(giq.g $$0) {
            this.f = $$0;
            return this;
         }

         public gir.b.a a(giq.l $$0) {
            this.g = $$0;
            return this;
         }

         public gir.b.a a(giq.f $$0) {
            this.h = $$0;
            return this;
         }

         public gir.b.a a(giq.k $$0) {
            this.i = $$0;
            return this;
         }

         public gir.b.a a(giq.o $$0) {
            this.j = $$0;
            return this;
         }

         public gir.b.a a(giq.q $$0) {
            this.k = $$0;
            return this;
         }

         public gir.b.a a(giq.h $$0) {
            this.l = $$0;
            return this;
         }

         public gir.b.a a(giq.b $$0) {
            this.m = $$0;
            return this;
         }

         public gir.b a(boolean $$0) {
            return this.a($$0 ? gir.c.c : gir.c.a);
         }

         public gir.b a(gir.c $$0) {
            return new gir.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
