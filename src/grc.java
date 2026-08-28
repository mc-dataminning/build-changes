import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class grc extends grb {
   private static final int G = 1048576;
   public static final int A = 4194304;
   public static final int B = 786432;
   public static final int C = 1536;
   private static final grc H = a("solid", 4194304, true, false, gra.b, grc.b.a().a(i).a(c).a(true));
   private static final grc I = a("cutout_mipped", 4194304, true, false, gra.c, grc.b.a().a(i).a(c).a(true));
   private static final grc J = a("cutout", 786432, true, false, gra.d, grc.b.a().a(i).a(d).a(true));
   private static final grc K = a("translucent", 786432, true, true, gra.e, grc.b.a().a(i).a(c).a(u).a(true));
   private static final grc L = a("translucent_moving_block", 786432, false, true, gra.g, grc.b.a().a(i).a(c).a(y).a(true));
   private static final Function<alg, grc> M = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, gra.h, $$1);
   });
   private static final Function<alg, grc> N = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_translucent", 1536, true, true, gra.j, $$1);
   });
   private static final Function<alg, grc> O = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(true);
      return a("entity_solid", 1536, true, false, gra.k, $$1);
   });
   private static final Function<alg, grc> P = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(p).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, gra.l, $$1);
   });
   private static final Function<alg, grc> Q = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(true);
      return a("entity_cutout", 1536, true, false, gra.m, $$1);
   });
   private static final BiFunction<alg, Boolean, grc> R = ag.a(($$0, $$1) -> {
      grc.b $$2 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, gra.n, $$2);
   });
   private static final BiFunction<alg, Boolean, grc> S = ag.a(($$0, $$1) -> {
      grc.b $$2 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(o).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, gra.o, $$2);
   });
   private static final Function<alg, grc> T = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(y).a(i).a(k).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, gra.y, $$1);
   });
   private static final BiFunction<alg, Boolean, grc> U = ag.a(($$0, $$1) -> {
      grc.b $$2 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a($$1);
      return a("entity_translucent", 1536, true, true, gra.p, $$2);
   });
   private static final BiFunction<alg, Boolean, grc> V = ag.a(($$0, $$1) -> {
      grc.b $$2 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(k).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, gra.q, $$2);
   });
   private static final Function<alg, grc> W = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(true);
      return a("entity_smooth_cutout", 1536, gra.r, $$1);
   });
   private static final BiFunction<alg, Boolean, grc> X = ag.a(($$0, $$1) -> {
      grc.b $$2 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? gra.A : gra.z, $$2);
   });
   private static final Function<alg, grc> Y = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(false);
      return a("entity_decal", 1536, gra.w, $$1);
   });
   private static final Function<alg, grc> Z = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(false);
      return a("entity_no_outline", 1536, false, true, gra.s, $$1);
   });
   private static final Function<alg, grc> aa = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(o).a(false);
      return a("entity_shadow", 1536, false, false, gra.x, $$1);
   });
   private static final Function<alg, grc> ab = ag.b($$0 -> {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(true);
      return a("entity_alpha", 1536, gra.B, $$1);
   });
   private static final Function<alg, grc> ac = ag.b($$0 -> {
      grb.j $$1 = new grb.j($$0, bas.b, false);
      return a("eyes", 1536, false, true, gra.v, grc.b.a().a($$1).a(false));
   });
   private static final grc ad = a("leash", 1536, gra.C, grc.b.a().a(e).a(i).a(false));
   private static final grc ae = a("water_mask", 1536, gra.D, grc.b.a().a(e).a(false));
   private static final grc af = a("armor_entity_glint", 1536, gra.E, grc.b.a().a(new grb.j(gxw.a, bas.c, false)).a(h).a(o).a(false));
   private static final grc ag = a("glint_translucent", 1536, gra.E, grc.b.a().a(new grb.j(gxw.b, bas.c, false)).a(g).a(y).a(false));
   private static final grc ah = a("glint", 1536, gra.E, grc.b.a().a(new grb.j(gxw.b, bas.c, false)).a(g).a(false));
   private static final grc ai = a("entity_glint", 1536, gra.E, grc.b.a().a(new grb.j(gxw.a, bas.c, false)).a(h).a(false));
   private static final Function<alg, grc> aj = ag.b($$0 -> {
      grb.j $$1 = new grb.j($$0, bas.b, false);
      return a("crumbling", 1536, false, true, gra.F, grc.b.a().a($$1).a(n).a(false));
   });
   private static final Function<alg, grc> ak = ag.b($$0 -> a("text", 786432, false, false, gra.G, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(false)));
   private static final grc al = a("text_background", 1536, false, true, gra.H, grc.b.a().a(e).a(i).a(false));
   private static final Function<alg, grc> am = ag.b(
      $$0 -> a("text_intensity", 786432, false, false, gra.I, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final Function<alg, grc> an = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, gra.J, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(n).a(false))
   );
   private static final Function<alg, grc> ao = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, gra.I, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(n).a(false))
   );
   private static final Function<alg, grc> ap = ag.b(
      $$0 -> a("text_see_through", 1536, false, false, gra.K, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final grc aq = a("text_background_see_through", 1536, false, true, gra.L, grc.b.a().a(e).a(i).a(false));
   private static final Function<alg, grc> ar = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, gra.M, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final grc as = a("lightning", 1536, false, true, gra.N, grc.b.a().a(w).a(false));
   private static final grc at = a("dragon_rays", 1536, false, false, gra.O, grc.b.a().a(false));
   private static final grc au = a("dragon_rays_depth", 1536, false, false, gra.P, grc.b.a().a(false));
   private static final grc av = a("tripwire", 1536, true, true, gra.f, grc.b.a().a(i).a(c).a(w).a(true));
   private static final grc aw = a("end_portal", 1536, false, false, gra.Q, grc.b.a().a(grb.f.d().a(gtx.a, false, false).a(gtx.b, false, false).a()).a(false));
   private static final grc ax = a("end_gateway", 1536, false, false, gra.R, grc.b.a().a(grb.f.d().a(gtx.a, false, false).a(gtx.b, false, false).a()).a(false));
   private static final grc ay = a(gra.S);
   private static final grc az = a(gra.T);
   private static final grc aA = a(gra.U);
   public static final grc.a D = a("lines", 1536, gra.V, grc.b.a().a(new grb.e(OptionalDouble.empty())).a(o).a(y).a(false));
   public static final grc.a E = a("secondary_block_outline", 1536, gra.W, grc.b.a().a(new grb.e(OptionalDouble.of(7.0))).a(o).a(y).a(false));
   public static final grc.a F = a("line_strip", 1536, gra.X, grc.b.a().a(new grb.e(OptionalDouble.empty())).a(o).a(y).a(false));
   private static final Function<Double, grc.a> aB = ag.b($$0 -> a("debug_line_strip", 1536, gra.Y, grc.b.a().a(new grb.e(OptionalDouble.of($$0))).a(false)));
   private static final Function<Double, grc.a> aC = ag.b($$0 -> a("debug_line", 1536, gra.V, grc.b.a().a(new grb.e(OptionalDouble.of($$0))).a(false)));
   private static final grc.a aD = a("debug_filled_box", 1536, false, true, gra.Z, grc.b.a().a(o).a(false));
   private static final grc.a aE = a("debug_quads", 1536, false, true, gra.aa, grc.b.a().a(false));
   private static final grc.a aF = a("debug_triangle_fan", 1536, false, true, gra.ab, grc.b.a().a(false));
   private static final grc.a aG = a("debug_structure_quads", 1536, false, true, gra.ac, grc.b.a().a(false));
   private static final grc.a aH = a("debug_section_quads", 1536, false, true, gra.ad, grc.b.a().a(o).a(false));
   private static final grc aI = a("world_border", 1536, false, false, gra.ae, grc.b.a().a(new grb.j(grs.a, bas.b, false)).a(i).a(w).a(q).a(false));
   private static final Function<alg, grc> aJ = ag.b(
      $$0 -> a("opaque_particle", 1536, false, false, gra.af, grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final Function<alg, grc> aK = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, gra.ag, grc.b.a().a(new grb.j($$0, bas.b, false)).a(v).a(i).a(false))
   );
   private static final Function<alg, grc> aL = b(gra.ah);
   private static final Function<alg, grc> aM = b(gra.ai);
   private static final grc aN = a("sky", 1536, false, false, gra.aj, grc.b.a().a(false));
   private static final grc aO = a("end_sky", 1536, false, false, gra.ak, grc.b.a().a(new grb.j(grm.a, bas.b, false)).a(false));
   private static final grc aP = a("sunrise_sunset", 1536, false, false, gra.al, grc.b.a().a(false));
   private static final grc aQ = a("stars", 1536, false, false, gra.am, grc.b.a().a(false));
   private static final Function<alg, grc> aR = ag.b($$0 -> a("celestial", 1536, false, false, gra.an, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false)));
   private static final Function<alg, grc> aS = ag.b(
      $$0 -> a("block_screen_effect", 1536, false, false, gra.au, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false))
   );
   private static final Function<alg, grc> aT = ag.b(
      $$0 -> a("fire_screen_effect", 1536, false, false, gra.av, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false))
   );
   private static final grc.a aU = a("gui", 786432, gra.ao, grc.b.a().a(false));
   private static final grc.a aV = a("gui_overlay", 1536, gra.ap, grc.b.a().a(false));
   private static final Function<alg, grc> aW = ag.b($$0 -> a("gui_textured_overlay", 1536, gra.at, grc.b.a().a(new grb.j($$0, bas.c, false)).a(false)));
   private static final Function<alg, grc> aX = ag.b(
      $$0 -> a("gui_opaque_textured_background", 786432, gra.aw, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false))
   );
   private static final grc.a aY = a("gui_nausea_overlay", 1536, gra.ax, grc.b.a().a(new grb.j(fsl.a, bas.c, false)).a(false));
   private static final grc.a aZ = a("gui_text_highlight", 1536, gra.aq, grc.b.a().a(false));
   private static final grc.a ba = a("gui_ghost_recipe_overlay", 1536, gra.ar, grc.b.a().a(false));
   private static final Function<alg, grc> bb = ag.b($$0 -> a("gui_textured", 786432, gra.as, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false)));
   private static final grc.a bc = a("outline_blit", 1536, gra.aB, grc.b.a().a(false));
   private static final Function<alg, grc> bd = ag.b($$0 -> a("panorama", 786432, gra.aC, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false)));
   private static final Function<alg, grc> be = ag.b($$0 -> a("vignette", 786432, gra.ay, grc.b.a().a(new grb.j($$0, bas.c, false)).a(false)));
   private static final Function<alg, grc> bf = ag.b($$0 -> a("crosshair", 786432, gra.az, grc.b.a().a(new grb.j($$0, bas.b, false)).a(false)));
   private static final grc.a bg = a("mojang_logo", 786432, gra.aA, grc.b.a().a(new grb.j(fyi.a, bas.c, false)).a(false));
   private static final grc.a bh = a("LIGHTMAP", 786432, gra.aF, grc.b.a().a(grb.s).a(false));
   private static final ImmutableList<grc> bi = ImmutableList.of(c(), d(), e(), f(), s());
   private final int bj;
   private final boolean bk;
   private final boolean bl;

   public static grc c() {
      return H;
   }

   public static grc d() {
      return I;
   }

   public static grc e() {
      return J;
   }

   public static grc f() {
      return K;
   }

   public static grc g() {
      return L;
   }

   public static grc a(alg $$0) {
      return M.apply($$0);
   }

   public static grc b(alg $$0) {
      grc.b $$1 = grc.b.a().a(new grb.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, gra.i, $$1);
   }

   public static grc c(alg $$0) {
      return N.apply($$0);
   }

   public static grc d(alg $$0) {
      return O.apply($$0);
   }

   public static grc e(alg $$0) {
      return P.apply($$0);
   }

   public static grc f(alg $$0) {
      return Q.apply($$0);
   }

   public static grc a(alg $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static grc g(alg $$0) {
      return a($$0, true);
   }

   public static grc b(alg $$0, boolean $$1) {
      return S.apply($$0, $$1);
   }

   public static grc h(alg $$0) {
      return b($$0, true);
   }

   public static grc i(alg $$0) {
      return T.apply($$0);
   }

   public static grc c(alg $$0, boolean $$1) {
      return U.apply($$0, $$1);
   }

   public static grc j(alg $$0) {
      return c($$0, true);
   }

   public static grc d(alg $$0, boolean $$1) {
      return V.apply($$0, $$1);
   }

   public static grc k(alg $$0) {
      return d($$0, true);
   }

   public static grc l(alg $$0) {
      return W.apply($$0);
   }

   public static grc e(alg $$0, boolean $$1) {
      return X.apply($$0, $$1);
   }

   public static grc m(alg $$0) {
      return Y.apply($$0);
   }

   public static grc n(alg $$0) {
      return Z.apply($$0);
   }

   public static grc o(alg $$0) {
      return aa.apply($$0);
   }

   public static grc p(alg $$0) {
      return ab.apply($$0);
   }

   public static grc q(alg $$0) {
      return ac.apply($$0);
   }

   public static grc r(alg $$0) {
      return V.apply($$0, false);
   }

   public static grc a(alg $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, gra.t, grc.b.a().a(new grb.j($$0, bas.b, false)).a(new grb.g($$1, $$2)).a(i).a(l).a(false));
   }

   public static grc b(alg $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, gra.u, grc.b.a().a(new grb.j($$0, bas.b, false)).a(new grb.g($$1, $$2)).a(i).a(k).a(false));
   }

   public static grc h() {
      return ad;
   }

   public static grc i() {
      return ae;
   }

   public static grc s(alg $$0) {
      return grc.a.G.apply($$0, false);
   }

   public static grc j() {
      return af;
   }

   public static grc k() {
      return ag;
   }

   public static grc l() {
      return ah;
   }

   public static grc m() {
      return ai;
   }

   public static grc t(alg $$0) {
      return aj.apply($$0);
   }

   public static grc u(alg $$0) {
      return ak.apply($$0);
   }

   public static grc n() {
      return al;
   }

   public static grc v(alg $$0) {
      return am.apply($$0);
   }

   public static grc w(alg $$0) {
      return an.apply($$0);
   }

   public static grc x(alg $$0) {
      return ao.apply($$0);
   }

   public static grc y(alg $$0) {
      return ap.apply($$0);
   }

   public static grc o() {
      return aq;
   }

   public static grc z(alg $$0) {
      return ar.apply($$0);
   }

   public static grc p() {
      return as;
   }

   public static grc q() {
      return at;
   }

   public static grc r() {
      return au;
   }

   public static grc s() {
      return av;
   }

   public static grc t() {
      return aw;
   }

   public static grc u() {
      return ax;
   }

   private static grc.a a(fii $$0) {
      return a("clouds", 786432, false, false, $$0, grc.b.a().a(x).a(true));
   }

   public static grc v() {
      return ay;
   }

   public static grc w() {
      return az;
   }

   public static grc x() {
      return aA;
   }

   public static grc y() {
      return D;
   }

   public static grc z() {
      return E;
   }

   public static grc A() {
      return F;
   }

   public static grc a(double $$0) {
      return aB.apply($$0);
   }

   public static grc b(double $$0) {
      return aC.apply($$0);
   }

   public static grc B() {
      return aD;
   }

   public static grc C() {
      return aE;
   }

   public static grc D() {
      return aF;
   }

   public static grc E() {
      return aG;
   }

   public static grc F() {
      return aH;
   }

   public static grc G() {
      return aI;
   }

   public static grc A(alg $$0) {
      return aJ.apply($$0);
   }

   public static grc B(alg $$0) {
      return aK.apply($$0);
   }

   private static Function<alg, grc> b(fii $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, grc.b.a().a(new grb.j($$1, bas.b, false)).a(w).a(i).a(false)));
   }

   public static grc f(alg $$0, boolean $$1) {
      return ($$1 ? aL : aM).apply($$0);
   }

   public static grc H() {
      return aN;
   }

   public static grc I() {
      return aO;
   }

   public static grc J() {
      return aP;
   }

   public static grc K() {
      return aQ;
   }

   public static grc C(alg $$0) {
      return aR.apply($$0);
   }

   public static grc D(alg $$0) {
      return aS.apply($$0);
   }

   public static grc E(alg $$0) {
      return aT.apply($$0);
   }

   public static grc L() {
      return aU;
   }

   public static grc M() {
      return aV;
   }

   public static grc F(alg $$0) {
      return aW.apply($$0);
   }

   public static grc G(alg $$0) {
      return aX.apply($$0);
   }

   public static grc N() {
      return aY;
   }

   public static grc O() {
      return aZ;
   }

   public static grc P() {
      return ba;
   }

   public static grc H(alg $$0) {
      return bb.apply($$0);
   }

   public static grc Q() {
      return bc;
   }

   public static grc I(alg $$0) {
      return bd.apply($$0);
   }

   public static grc J(alg $$0) {
      return be.apply($$0);
   }

   public static grc K(alg $$0) {
      return bf.apply($$0);
   }

   public static grc R() {
      return bg;
   }

   public static grc S() {
      return bh;
   }

   public grc(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.bj = $$1;
      this.bk = $$2;
      this.bl = $$3;
   }

   static grc.a a(String $$0, int $$1, fii $$2, grc.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static grc.a a(String $$0, int $$1, boolean $$2, boolean $$3, fii $$4, grc.b $$5) {
      return new grc.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(fkc $$0) {
      this.a();
      fkg $$1 = $$0.c().a().i();
      $$1.a();
      $$1.a($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), this.T());
      this.b();
   }

   @Nullable
   public abstract gqa T();

   public static List<grc> U() {
      return bi;
   }

   public int V() {
      return this.bj;
   }

   public abstract fki W();

   public abstract fki.c X();

   public Optional<grc> Y() {
      return Optional.empty();
   }

   public boolean Z() {
      return false;
   }

   public boolean aa() {
      return this.bk;
   }

   public boolean ab() {
      return !this.X().l;
   }

   public boolean ac() {
      return this.bl;
   }

   static final class a extends grc {
      static final BiFunction<alg, Boolean, grc> G = ag.a(
         ($$0, $$1) -> grc.a("outline", 1536, $$1 ? gra.aD : gra.aE, grc.b.a().a(new grb.j($$0, bas.b, false)).a(t).a(grc.c.b))
      );
      private final grc.b H;
      private final fii I;
      private final Optional<grc> J;
      private final boolean K;

      a(String $$0, int $$1, boolean $$2, boolean $$3, fii $$4, grc.b $$5) {
         super($$0, $$1, $$2, $$3, () -> {
            $$5.c.forEach(grb::a);
            $$4.a();
         }, () -> {
            $$5.c.forEach(grb::b);
            $$4.c();
         });
         this.H = $$5;
         this.I = $$4;
         this.J = $$5.b == grc.c.c ? $$5.a.c().map($$1x -> G.apply($$1x, $$4.e())) : Optional.empty();
         this.K = $$5.b == grc.c.b;
      }

      @Override
      public Optional<grc> Y() {
         return this.J;
      }

      @Override
      public boolean Z() {
         return this.K;
      }

      @Override
      public void a(fkc $$0) {
         gqa $$1 = this.T();
         if ($$1 != null) {
            this.a();
            fkg $$2 = $$0.c().a().i();
            $$2.a();
            $$2.a($$0);
            $$2.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), $$1);
            this.b();
         }
      }

      @Nullable
      @Override
      public gqa T() {
         return this.I.b();
      }

      @Override
      public fki W() {
         return this.I.f();
      }

      @Override
      public fki.c X() {
         return this.I.g();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.H + "]";
      }
   }

   protected static final class b {
      final grb.b a;
      final grc.c b;
      final ImmutableList<grb> c;

      b(grb.b $$0, grb.d $$1, grb.i $$2, grb.c $$3, grb.h $$4, grb.k $$5, grb.e $$6, grc.c $$7) {
         this.a = $$0;
         this.b = $$7;
         this.c = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.c + ", outlineProperty=" + this.b + "]";
      }

      public static grc.b.a a() {
         return new grc.b.a();
      }

      public static class a {
         private grb.b a = grb.e;
         private grb.d b = grb.j;
         private grb.i c = grb.l;
         private grb.c d = grb.m;
         private grb.h e = grb.r;
         private grb.k f;
         private grb.e g;

         a() {
            this.f = grb.f;
            this.g = grb.z;
         }

         protected grc.b.a a(grb.b $$0) {
            this.a = $$0;
            return this;
         }

         protected grc.b.a a(grb.d $$0) {
            this.b = $$0;
            return this;
         }

         protected grc.b.a a(grb.i $$0) {
            this.c = $$0;
            return this;
         }

         protected grc.b.a a(grb.c $$0) {
            this.d = $$0;
            return this;
         }

         protected grc.b.a a(grb.h $$0) {
            this.e = $$0;
            return this;
         }

         protected grc.b.a a(grb.k $$0) {
            this.f = $$0;
            return this;
         }

         protected grc.b.a a(grb.e $$0) {
            this.g = $$0;
            return this;
         }

         protected grc.b a(boolean $$0) {
            return this.a($$0 ? grc.c.c : grc.c.a);
         }

         protected grc.b a(grc.c $$0) {
            return new grc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
         }
      }
   }

   protected static enum c {
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
