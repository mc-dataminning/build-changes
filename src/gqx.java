import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class gqx extends gqw {
   private static final int G = 1048576;
   public static final int A = 4194304;
   public static final int B = 786432;
   public static final int C = 1536;
   private static final gqx H = a("solid", 4194304, true, false, gqv.b, gqx.b.a().a(i).a(c).a(true));
   private static final gqx I = a("cutout_mipped", 4194304, true, false, gqv.c, gqx.b.a().a(i).a(c).a(true));
   private static final gqx J = a("cutout", 786432, true, false, gqv.d, gqx.b.a().a(i).a(d).a(true));
   private static final gqx K = a("translucent", 786432, true, true, gqv.e, gqx.b.a().a(i).a(c).a(u).a(true));
   private static final gqx L = a("translucent_moving_block", 786432, false, true, gqv.g, gqx.b.a().a(i).a(c).a(y).a(true));
   private static final Function<alg, gqx> M = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, gqv.h, $$1);
   });
   private static final Function<alg, gqx> N = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_translucent", 1536, true, true, gqv.j, $$1);
   });
   private static final Function<alg, gqx> O = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(true);
      return a("entity_solid", 1536, true, false, gqv.k, $$1);
   });
   private static final Function<alg, gqx> P = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(p).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, gqv.l, $$1);
   });
   private static final Function<alg, gqx> Q = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(true);
      return a("entity_cutout", 1536, true, false, gqv.m, $$1);
   });
   private static final BiFunction<alg, Boolean, gqx> R = ag.a(($$0, $$1) -> {
      gqx.b $$2 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, gqv.n, $$2);
   });
   private static final BiFunction<alg, Boolean, gqx> S = ag.a(($$0, $$1) -> {
      gqx.b $$2 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(o).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, gqv.o, $$2);
   });
   private static final Function<alg, gqx> T = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(y).a(i).a(k).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, gqv.y, $$1);
   });
   private static final BiFunction<alg, Boolean, gqx> U = ag.a(($$0, $$1) -> {
      gqx.b $$2 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a($$1);
      return a("entity_translucent", 1536, true, true, gqv.p, $$2);
   });
   private static final BiFunction<alg, Boolean, gqx> V = ag.a(($$0, $$1) -> {
      gqx.b $$2 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(k).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, gqv.q, $$2);
   });
   private static final Function<alg, gqx> W = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(true);
      return a("entity_smooth_cutout", 1536, gqv.r, $$1);
   });
   private static final BiFunction<alg, Boolean, gqx> X = ag.a(($$0, $$1) -> {
      gqx.b $$2 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? gqv.A : gqv.z, $$2);
   });
   private static final Function<alg, gqx> Y = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(false);
      return a("entity_decal", 1536, gqv.w, $$1);
   });
   private static final Function<alg, gqx> Z = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(false);
      return a("entity_no_outline", 1536, false, true, gqv.s, $$1);
   });
   private static final Function<alg, gqx> aa = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(o).a(false);
      return a("entity_shadow", 1536, false, false, gqv.x, $$1);
   });
   private static final Function<alg, gqx> ab = ag.b($$0 -> {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(true);
      return a("entity_alpha", 1536, gqv.B, $$1);
   });
   private static final Function<alg, gqx> ac = ag.b($$0 -> {
      gqw.j $$1 = new gqw.j($$0, bas.b, false);
      return a("eyes", 1536, false, true, gqv.v, gqx.b.a().a($$1).a(false));
   });
   private static final gqx ad = a("leash", 1536, gqv.C, gqx.b.a().a(e).a(i).a(false));
   private static final gqx ae = a("water_mask", 1536, gqv.D, gqx.b.a().a(e).a(false));
   private static final gqx af = a("armor_entity_glint", 1536, gqv.E, gqx.b.a().a(new gqw.j(gxr.a, bas.c, false)).a(h).a(o).a(false));
   private static final gqx ag = a("glint_translucent", 1536, gqv.E, gqx.b.a().a(new gqw.j(gxr.b, bas.c, false)).a(g).a(y).a(false));
   private static final gqx ah = a("glint", 1536, gqv.E, gqx.b.a().a(new gqw.j(gxr.b, bas.c, false)).a(g).a(false));
   private static final gqx ai = a("entity_glint", 1536, gqv.E, gqx.b.a().a(new gqw.j(gxr.a, bas.c, false)).a(h).a(false));
   private static final Function<alg, gqx> aj = ag.b($$0 -> {
      gqw.j $$1 = new gqw.j($$0, bas.b, false);
      return a("crumbling", 1536, false, true, gqv.F, gqx.b.a().a($$1).a(n).a(false));
   });
   private static final Function<alg, gqx> ak = ag.b($$0 -> a("text", 786432, false, false, gqv.G, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(false)));
   private static final gqx al = a("text_background", 1536, false, true, gqv.H, gqx.b.a().a(e).a(i).a(false));
   private static final Function<alg, gqx> am = ag.b(
      $$0 -> a("text_intensity", 786432, false, false, gqv.I, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final Function<alg, gqx> an = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, gqv.J, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(n).a(false))
   );
   private static final Function<alg, gqx> ao = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, gqv.I, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(n).a(false))
   );
   private static final Function<alg, gqx> ap = ag.b(
      $$0 -> a("text_see_through", 1536, false, false, gqv.K, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final gqx aq = a("text_background_see_through", 1536, false, true, gqv.L, gqx.b.a().a(e).a(i).a(false));
   private static final Function<alg, gqx> ar = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, gqv.M, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final gqx as = a("lightning", 1536, false, true, gqv.N, gqx.b.a().a(w).a(false));
   private static final gqx at = a("dragon_rays", 1536, false, false, gqv.O, gqx.b.a().a(false));
   private static final gqx au = a("dragon_rays_depth", 1536, false, false, gqv.P, gqx.b.a().a(false));
   private static final gqx av = a("tripwire", 1536, true, true, gqv.f, gqx.b.a().a(i).a(c).a(w).a(true));
   private static final gqx aw = a("end_portal", 1536, false, false, gqv.Q, gqx.b.a().a(gqw.f.d().a(gts.a, false, false).a(gts.b, false, false).a()).a(false));
   private static final gqx ax = a("end_gateway", 1536, false, false, gqv.R, gqx.b.a().a(gqw.f.d().a(gts.a, false, false).a(gts.b, false, false).a()).a(false));
   private static final gqx ay = a(gqv.S);
   private static final gqx az = a(gqv.T);
   private static final gqx aA = a(gqv.U);
   public static final gqx.a D = a("lines", 1536, gqv.V, gqx.b.a().a(new gqw.e(OptionalDouble.empty())).a(o).a(y).a(false));
   public static final gqx.a E = a("secondary_block_outline", 1536, gqv.W, gqx.b.a().a(new gqw.e(OptionalDouble.of(7.0))).a(o).a(y).a(false));
   public static final gqx.a F = a("line_strip", 1536, gqv.X, gqx.b.a().a(new gqw.e(OptionalDouble.empty())).a(o).a(y).a(false));
   private static final Function<Double, gqx.a> aB = ag.b($$0 -> a("debug_line_strip", 1536, gqv.Y, gqx.b.a().a(new gqw.e(OptionalDouble.of($$0))).a(false)));
   private static final Function<Double, gqx.a> aC = ag.b($$0 -> a("debug_line", 1536, gqv.V, gqx.b.a().a(new gqw.e(OptionalDouble.of($$0))).a(false)));
   private static final gqx.a aD = a("debug_filled_box", 1536, false, true, gqv.Z, gqx.b.a().a(o).a(false));
   private static final gqx.a aE = a("debug_quads", 1536, false, true, gqv.aa, gqx.b.a().a(false));
   private static final gqx.a aF = a("debug_triangle_fan", 1536, false, true, gqv.ab, gqx.b.a().a(false));
   private static final gqx.a aG = a("debug_structure_quads", 1536, false, true, gqv.ac, gqx.b.a().a(false));
   private static final gqx.a aH = a("debug_section_quads", 1536, false, true, gqv.ad, gqx.b.a().a(o).a(false));
   private static final gqx aI = a("world_border", 1536, false, false, gqv.ae, gqx.b.a().a(new gqw.j(grn.a, bas.b, false)).a(i).a(w).a(q).a(false));
   private static final Function<alg, gqx> aJ = ag.b(
      $$0 -> a("opaque_particle", 1536, false, false, gqv.af, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(false))
   );
   private static final Function<alg, gqx> aK = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, gqv.ag, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(v).a(i).a(false))
   );
   private static final Function<alg, gqx> aL = b(gqv.ah);
   private static final Function<alg, gqx> aM = b(gqv.ai);
   private static final gqx aN = a("sky", 1536, false, false, gqv.aj, gqx.b.a().a(false));
   private static final gqx aO = a("end_sky", 1536, false, false, gqv.ak, gqx.b.a().a(new gqw.j(grh.a, bas.b, false)).a(false));
   private static final gqx aP = a("sunrise_sunset", 1536, false, false, gqv.al, gqx.b.a().a(false));
   private static final gqx aQ = a("stars", 1536, false, false, gqv.am, gqx.b.a().a(false));
   private static final Function<alg, gqx> aR = ag.b($$0 -> a("celestial", 1536, false, false, gqv.an, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false)));
   private static final Function<alg, gqx> aS = ag.b(
      $$0 -> a("block_screen_effect", 1536, false, false, gqv.au, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false))
   );
   private static final Function<alg, gqx> aT = ag.b(
      $$0 -> a("fire_screen_effect", 1536, false, false, gqv.av, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false))
   );
   private static final gqx.a aU = a("gui", 786432, gqv.ao, gqx.b.a().a(false));
   private static final gqx.a aV = a("gui_overlay", 1536, gqv.ap, gqx.b.a().a(false));
   private static final Function<alg, gqx> aW = ag.b($$0 -> a("gui_textured_overlay", 1536, gqv.at, gqx.b.a().a(new gqw.j($$0, bas.c, false)).a(false)));
   private static final Function<alg, gqx> aX = ag.b(
      $$0 -> a("gui_opaque_textured_background", 786432, gqv.aw, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false))
   );
   private static final gqx.a aY = a("gui_nausea_overlay", 1536, gqv.ax, gqx.b.a().a(new gqw.j(fsg.a, bas.c, false)).a(false));
   private static final gqx.a aZ = a("gui_text_highlight", 1536, gqv.aq, gqx.b.a().a(false));
   private static final gqx.a ba = a("gui_ghost_recipe_overlay", 1536, gqv.ar, gqx.b.a().a(false));
   private static final Function<alg, gqx> bb = ag.b($$0 -> a("gui_textured", 786432, gqv.as, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false)));
   private static final gqx.a bc = a("outline_blit", 1536, gqv.aB, gqx.b.a().a(false));
   private static final Function<alg, gqx> bd = ag.b($$0 -> a("panorama", 786432, gqv.aC, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false)));
   private static final Function<alg, gqx> be = ag.b($$0 -> a("vignette", 786432, gqv.ay, gqx.b.a().a(new gqw.j($$0, bas.c, false)).a(false)));
   private static final Function<alg, gqx> bf = ag.b($$0 -> a("crosshair", 786432, gqv.az, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(false)));
   private static final gqx.a bg = a("mojang_logo", 786432, gqv.aA, gqx.b.a().a(new gqw.j(fyd.a, bas.c, false)).a(false));
   private static final gqx.a bh = a("LIGHTMAP", 786432, gqv.aF, gqx.b.a().a(gqw.s).a(false));
   private static final ImmutableList<gqx> bi = ImmutableList.of(c(), d(), e(), f(), s());
   private final int bj;
   private final boolean bk;
   private final boolean bl;

   public static gqx c() {
      return H;
   }

   public static gqx d() {
      return I;
   }

   public static gqx e() {
      return J;
   }

   public static gqx f() {
      return K;
   }

   public static gqx g() {
      return L;
   }

   public static gqx a(alg $$0) {
      return M.apply($$0);
   }

   public static gqx b(alg $$0) {
      gqx.b $$1 = gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(i).a(k).a(o).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, gqv.i, $$1);
   }

   public static gqx c(alg $$0) {
      return N.apply($$0);
   }

   public static gqx d(alg $$0) {
      return O.apply($$0);
   }

   public static gqx e(alg $$0) {
      return P.apply($$0);
   }

   public static gqx f(alg $$0) {
      return Q.apply($$0);
   }

   public static gqx a(alg $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static gqx g(alg $$0) {
      return a($$0, true);
   }

   public static gqx b(alg $$0, boolean $$1) {
      return S.apply($$0, $$1);
   }

   public static gqx h(alg $$0) {
      return b($$0, true);
   }

   public static gqx i(alg $$0) {
      return T.apply($$0);
   }

   public static gqx c(alg $$0, boolean $$1) {
      return U.apply($$0, $$1);
   }

   public static gqx j(alg $$0) {
      return c($$0, true);
   }

   public static gqx d(alg $$0, boolean $$1) {
      return V.apply($$0, $$1);
   }

   public static gqx k(alg $$0) {
      return d($$0, true);
   }

   public static gqx l(alg $$0) {
      return W.apply($$0);
   }

   public static gqx e(alg $$0, boolean $$1) {
      return X.apply($$0, $$1);
   }

   public static gqx m(alg $$0) {
      return Y.apply($$0);
   }

   public static gqx n(alg $$0) {
      return Z.apply($$0);
   }

   public static gqx o(alg $$0) {
      return aa.apply($$0);
   }

   public static gqx p(alg $$0) {
      return ab.apply($$0);
   }

   public static gqx q(alg $$0) {
      return ac.apply($$0);
   }

   public static gqx r(alg $$0) {
      return V.apply($$0, false);
   }

   public static gqx a(alg $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, gqv.t, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(new gqw.g($$1, $$2)).a(i).a(l).a(false));
   }

   public static gqx b(alg $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, gqv.u, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(new gqw.g($$1, $$2)).a(i).a(k).a(false));
   }

   public static gqx h() {
      return ad;
   }

   public static gqx i() {
      return ae;
   }

   public static gqx s(alg $$0) {
      return gqx.a.G.apply($$0, false);
   }

   public static gqx j() {
      return af;
   }

   public static gqx k() {
      return ag;
   }

   public static gqx l() {
      return ah;
   }

   public static gqx m() {
      return ai;
   }

   public static gqx t(alg $$0) {
      return aj.apply($$0);
   }

   public static gqx u(alg $$0) {
      return ak.apply($$0);
   }

   public static gqx n() {
      return al;
   }

   public static gqx v(alg $$0) {
      return am.apply($$0);
   }

   public static gqx w(alg $$0) {
      return an.apply($$0);
   }

   public static gqx x(alg $$0) {
      return ao.apply($$0);
   }

   public static gqx y(alg $$0) {
      return ap.apply($$0);
   }

   public static gqx o() {
      return aq;
   }

   public static gqx z(alg $$0) {
      return ar.apply($$0);
   }

   public static gqx p() {
      return as;
   }

   public static gqx q() {
      return at;
   }

   public static gqx r() {
      return au;
   }

   public static gqx s() {
      return av;
   }

   public static gqx t() {
      return aw;
   }

   public static gqx u() {
      return ax;
   }

   private static gqx.a a(fid $$0) {
      return a("clouds", 786432, false, false, $$0, gqx.b.a().a(x).a(true));
   }

   public static gqx v() {
      return ay;
   }

   public static gqx w() {
      return az;
   }

   public static gqx x() {
      return aA;
   }

   public static gqx y() {
      return D;
   }

   public static gqx z() {
      return E;
   }

   public static gqx A() {
      return F;
   }

   public static gqx a(double $$0) {
      return aB.apply($$0);
   }

   public static gqx b(double $$0) {
      return aC.apply($$0);
   }

   public static gqx B() {
      return aD;
   }

   public static gqx C() {
      return aE;
   }

   public static gqx D() {
      return aF;
   }

   public static gqx E() {
      return aG;
   }

   public static gqx F() {
      return aH;
   }

   public static gqx G() {
      return aI;
   }

   public static gqx A(alg $$0) {
      return aJ.apply($$0);
   }

   public static gqx B(alg $$0) {
      return aK.apply($$0);
   }

   private static Function<alg, gqx> b(fid $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, gqx.b.a().a(new gqw.j($$1, bas.b, false)).a(w).a(i).a(false)));
   }

   public static gqx f(alg $$0, boolean $$1) {
      return ($$1 ? aL : aM).apply($$0);
   }

   public static gqx H() {
      return aN;
   }

   public static gqx I() {
      return aO;
   }

   public static gqx J() {
      return aP;
   }

   public static gqx K() {
      return aQ;
   }

   public static gqx C(alg $$0) {
      return aR.apply($$0);
   }

   public static gqx D(alg $$0) {
      return aS.apply($$0);
   }

   public static gqx E(alg $$0) {
      return aT.apply($$0);
   }

   public static gqx L() {
      return aU;
   }

   public static gqx M() {
      return aV;
   }

   public static gqx F(alg $$0) {
      return aW.apply($$0);
   }

   public static gqx G(alg $$0) {
      return aX.apply($$0);
   }

   public static gqx N() {
      return aY;
   }

   public static gqx O() {
      return aZ;
   }

   public static gqx P() {
      return ba;
   }

   public static gqx H(alg $$0) {
      return bb.apply($$0);
   }

   public static gqx Q() {
      return bc;
   }

   public static gqx I(alg $$0) {
      return bd.apply($$0);
   }

   public static gqx J(alg $$0) {
      return be.apply($$0);
   }

   public static gqx K(alg $$0) {
      return bf.apply($$0);
   }

   public static gqx R() {
      return bg;
   }

   public static gqx S() {
      return bh;
   }

   public gqx(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.bj = $$1;
      this.bk = $$2;
      this.bl = $$3;
   }

   static gqx.a a(String $$0, int $$1, fid $$2, gqx.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static gqx.a a(String $$0, int $$1, boolean $$2, boolean $$3, fid $$4, gqx.b $$5) {
      return new gqx.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(fjx $$0) {
      this.a();
      fkb $$1 = $$0.c().a().i();
      $$1.a();
      $$1.a($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), this.T());
      this.b();
   }

   @Nullable
   public abstract gpv T();

   public static List<gqx> U() {
      return bi;
   }

   public int V() {
      return this.bj;
   }

   public abstract fkd W();

   public abstract fkd.c X();

   public Optional<gqx> Y() {
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

   static final class a extends gqx {
      static final BiFunction<alg, Boolean, gqx> G = ag.a(
         ($$0, $$1) -> gqx.a("outline", 1536, $$1 ? gqv.aD : gqv.aE, gqx.b.a().a(new gqw.j($$0, bas.b, false)).a(t).a(gqx.c.b))
      );
      private final gqx.b H;
      private final fid I;
      private final Optional<gqx> J;
      private final boolean K;

      a(String $$0, int $$1, boolean $$2, boolean $$3, fid $$4, gqx.b $$5) {
         super($$0, $$1, $$2, $$3, () -> {
            $$5.c.forEach(gqw::a);
            $$4.a();
         }, () -> {
            $$5.c.forEach(gqw::b);
            $$4.c();
         });
         this.H = $$5;
         this.I = $$4;
         this.J = $$5.b == gqx.c.c ? $$5.a.c().map($$1x -> G.apply($$1x, $$4.e())) : Optional.empty();
         this.K = $$5.b == gqx.c.b;
      }

      @Override
      public Optional<gqx> Y() {
         return this.J;
      }

      @Override
      public boolean Z() {
         return this.K;
      }

      @Override
      public void a(fjx $$0) {
         gpv $$1 = this.T();
         if ($$1 != null) {
            this.a();
            fkb $$2 = $$0.c().a().i();
            $$2.a();
            $$2.a($$0);
            $$2.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), $$1);
            this.b();
         }
      }

      @Nullable
      @Override
      public gpv T() {
         return this.I.b();
      }

      @Override
      public fkd W() {
         return this.I.f();
      }

      @Override
      public fkd.c X() {
         return this.I.g();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.H + "]";
      }
   }

   protected static final class b {
      final gqw.b a;
      final gqx.c b;
      final ImmutableList<gqw> c;

      b(gqw.b $$0, gqw.d $$1, gqw.i $$2, gqw.c $$3, gqw.h $$4, gqw.k $$5, gqw.e $$6, gqx.c $$7) {
         this.a = $$0;
         this.b = $$7;
         this.c = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.c + ", outlineProperty=" + this.b + "]";
      }

      public static gqx.b.a a() {
         return new gqx.b.a();
      }

      public static class a {
         private gqw.b a = gqw.e;
         private gqw.d b = gqw.j;
         private gqw.i c = gqw.l;
         private gqw.c d = gqw.m;
         private gqw.h e = gqw.r;
         private gqw.k f;
         private gqw.e g;

         a() {
            this.f = gqw.f;
            this.g = gqw.z;
         }

         protected gqx.b.a a(gqw.b $$0) {
            this.a = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.d $$0) {
            this.b = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.i $$0) {
            this.c = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.c $$0) {
            this.d = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.h $$0) {
            this.e = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.k $$0) {
            this.f = $$0;
            return this;
         }

         protected gqx.b.a a(gqw.e $$0) {
            this.g = $$0;
            return this;
         }

         protected gqx.b a(boolean $$0) {
            return this.a($$0 ? gqx.c.c : gqx.c.a);
         }

         protected gqx.b a(gqx.c $$0) {
            return new gqx.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
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
