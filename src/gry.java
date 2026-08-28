import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gry extends grx {
   private static final int D = 1048576;
   public static final int x = 4194304;
   public static final int y = 786432;
   public static final int z = 1536;
   private static final gry E = a("solid", 4194304, true, false, grw.b, gry.b.a().a(j).a(c).a(true));
   private static final gry F = a("cutout_mipped", 4194304, true, false, grw.d, gry.b.a().a(j).a(c).a(true));
   private static final gry G = a("cutout", 786432, true, false, grw.e, gry.b.a().a(j).a(d).a(true));
   private static final gry H = a("translucent", 786432, true, true, grw.f, gry.b.a().a(j).a(c).a(s).a(true));
   private static final gry I = a("translucent_moving_block", 786432, false, true, grw.h, gry.b.a().a(j).a(c).a(v).a(true));
   private static final Function<alr, gry> J = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, grw.i, $$1);
   });
   private static final Function<alr, gry> K = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_translucent", 1536, true, true, grw.k, $$1);
   });
   private static final Function<alr, gry> L = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(true);
      return a("entity_solid", 1536, true, false, grw.l, $$1);
   });
   private static final Function<alr, gry> M = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(p).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, grw.m, $$1);
   });
   private static final Function<alr, gry> N = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(true);
      return a("entity_cutout", 1536, true, false, grw.n, $$1);
   });
   private static final BiFunction<alr, Boolean, gry> O = ag.a(($$0, $$1) -> {
      gry.b $$2 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, grw.o, $$2);
   });
   private static final BiFunction<alr, Boolean, gry> P = ag.a(($$0, $$1) -> {
      gry.b $$2 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(o).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, grw.p, $$2);
   });
   private static final Function<alr, gry> Q = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(v).a(j).a(l).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, grw.z, $$1);
   });
   private static final BiFunction<alr, Boolean, gry> R = ag.a(($$0, $$1) -> {
      gry.b $$2 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a($$1);
      return a("entity_translucent", 1536, true, true, grw.q, $$2);
   });
   private static final BiFunction<alr, Boolean, gry> S = ag.a(($$0, $$1) -> {
      gry.b $$2 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(l).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, grw.r, $$2);
   });
   private static final Function<alr, gry> T = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(true);
      return a("entity_smooth_cutout", 1536, grw.s, $$1);
   });
   private static final BiFunction<alr, Boolean, gry> U = ag.a(($$0, $$1) -> {
      gry.b $$2 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? grw.B : grw.A, $$2);
   });
   private static final Function<alr, gry> V = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(false);
      return a("entity_decal", 1536, grw.x, $$1);
   });
   private static final Function<alr, gry> W = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(false);
      return a("entity_no_outline", 1536, false, true, grw.t, $$1);
   });
   private static final Function<alr, gry> X = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(o).a(false);
      return a("entity_shadow", 1536, false, false, grw.y, $$1);
   });
   private static final Function<alr, gry> Y = ag.b($$0 -> {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(true);
      return a("entity_alpha", 1536, grw.C, $$1);
   });
   private static final Function<alr, gry> Z = ag.b($$0 -> {
      grx.j $$1 = new grx.j($$0, bbf.b, false);
      return a("eyes", 1536, false, true, grw.w, gry.b.a().a($$1).a(false));
   });
   private static final gry aa = a("leash", 1536, grw.D, gry.b.a().a(e).a(j).a(false));
   private static final gry ab = a("water_mask", 1536, grw.E, gry.b.a().a(e).a(false));
   private static final gry ac = a("armor_entity_glint", 1536, grw.F, gry.b.a().a(new grx.j(gyt.a, bbf.c, false)).a(i).a(o).a(false));
   private static final gry ad = a("glint_translucent", 1536, grw.F, gry.b.a().a(new grx.j(gyt.b, bbf.c, false)).a(g).a(v).a(false));
   private static final gry ae = a("glint", 1536, grw.F, gry.b.a().a(new grx.j(gyt.b, bbf.c, false)).a(g).a(false));
   private static final gry af = a("entity_glint", 1536, grw.F, gry.b.a().a(new grx.j(gyt.b, bbf.c, false)).a(h).a(false));
   private static final Function<alr, gry> ag = ag.b($$0 -> {
      grx.j $$1 = new grx.j($$0, bbf.b, false);
      return a("crumbling", 1536, false, true, grw.G, gry.b.a().a($$1).a(false));
   });
   private static final Function<alr, gry> ah = ag.b($$0 -> a("text", 786432, false, false, grw.H, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false)));
   private static final gry ai = a("text_background", 1536, false, true, grw.I, gry.b.a().a(e).a(j).a(false));
   private static final Function<alr, gry> aj = ag.b(
      $$0 -> a("text_intensity", 786432, false, false, grw.J, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final Function<alr, gry> ak = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, grw.K, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final Function<alr, gry> al = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, grw.J, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final Function<alr, gry> am = ag.b(
      $$0 -> a("text_see_through", 1536, false, false, grw.L, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final gry an = a("text_background_see_through", 1536, false, true, grw.M, gry.b.a().a(e).a(j).a(false));
   private static final Function<alr, gry> ao = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, grw.N, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final gry ap = a("lightning", 1536, false, true, grw.O, gry.b.a().a(u).a(false));
   private static final gry aq = a("dragon_rays", 1536, false, false, grw.P, gry.b.a().a(false));
   private static final gry ar = a("dragon_rays_depth", 1536, false, false, grw.Q, gry.b.a().a(false));
   private static final gry as = a("tripwire", 1536, true, true, grw.g, gry.b.a().a(j).a(c).a(u).a(true));
   private static final gry at = a("end_portal", 1536, false, false, grw.R, gry.b.a().a(grx.f.e().a(guu.a, false, false).a(guu.b, false, false).a()).a(false));
   private static final gry au = a("end_gateway", 1536, false, false, grw.S, gry.b.a().a(grx.f.e().a(guu.a, false, false).a(guu.b, false, false).a()).a(false));
   public static final gry.a A = a("lines", 1536, grw.W, gry.b.a().a(new grx.e(OptionalDouble.empty())).a(o).a(v).a(false));
   public static final gry.a B = a("secondary_block_outline", 1536, grw.X, gry.b.a().a(new grx.e(OptionalDouble.of(7.0))).a(o).a(v).a(false));
   public static final gry.a C = a("line_strip", 1536, grw.Y, gry.b.a().a(new grx.e(OptionalDouble.empty())).a(o).a(v).a(false));
   private static final Function<Double, gry.a> av = ag.b($$0 -> a("debug_line_strip", 1536, grw.Z, gry.b.a().a(new grx.e(OptionalDouble.of($$0))).a(false)));
   private static final Function<Double, gry.a> aw = ag.b($$0 -> a("debug_line", 1536, grw.W, gry.b.a().a(new grx.e(OptionalDouble.of($$0))).a(false)));
   private static final gry.a ax = a("debug_filled_box", 1536, false, true, grw.aa, gry.b.a().a(o).a(false));
   private static final gry.a ay = a("debug_quads", 1536, false, true, grw.ab, gry.b.a().a(false));
   private static final gry.a az = a("debug_triangle_fan", 1536, false, true, grw.ac, gry.b.a().a(false));
   private static final gry.a aA = a("debug_structure_quads", 1536, false, true, grw.ad, gry.b.a().a(false));
   private static final gry.a aB = a("debug_section_quads", 1536, false, true, grw.ae, gry.b.a().a(o).a(false));
   private static final Function<alr, gry> aC = ag.b(
      $$0 -> a("opaque_particle", 1536, false, false, grw.ag, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(false))
   );
   private static final Function<alr, gry> aD = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, grw.ah, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(t).a(j).a(false))
   );
   private static final Function<alr, gry> aE = a(grw.ai);
   private static final Function<alr, gry> aF = a(grw.aj);
   private static final gry aG = a("sunrise_sunset", 1536, false, false, grw.am, gry.b.a().a(false));
   private static final Function<alr, gry> aH = ag.b($$0 -> a("celestial", 1536, false, false, grw.ao, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false)));
   private static final Function<alr, gry> aI = ag.b(
      $$0 -> a("block_screen_effect", 1536, false, false, grw.av, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false))
   );
   private static final Function<alr, gry> aJ = ag.b(
      $$0 -> a("fire_screen_effect", 1536, false, false, grw.aw, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false))
   );
   private static final gry.a aK = a("gui", 786432, grw.ap, gry.b.a().a(false));
   private static final gry.a aL = a("gui_overlay", 1536, grw.aq, gry.b.a().a(false));
   private static final Function<alr, gry> aM = ag.b($$0 -> a("gui_textured_overlay", 1536, grw.au, gry.b.a().a(new grx.j($$0, bbf.c, false)).a(false)));
   private static final Function<alr, gry> aN = ag.b(
      $$0 -> a("gui_opaque_textured_background", 786432, grw.ax, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false))
   );
   private static final gry.a aO = a("gui_nausea_overlay", 1536, grw.ay, gry.b.a().a(new grx.j(ftj.a, bbf.c, false)).a(false));
   private static final gry.a aP = a("gui_text_highlight", 1536, grw.ar, gry.b.a().a(false));
   private static final gry.a aQ = a("gui_ghost_recipe_overlay", 1536, grw.as, gry.b.a().a(false));
   private static final Function<alr, gry> aR = ag.b($$0 -> a("gui_textured", 786432, grw.at, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false)));
   private static final Function<alr, gry> aS = ag.b($$0 -> a("vignette", 786432, grw.az, gry.b.a().a(new grx.j($$0, bbf.c, false)).a(false)));
   private static final Function<alr, gry> aT = ag.b($$0 -> a("crosshair", 786432, grw.aA, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(false)));
   private static final gry.a aU = a("mojang_logo", 786432, grw.aB, gry.b.a().a(new grx.j(fzg.a, bbf.c, false)).a(false));
   private static final ImmutableList<gry> aV = ImmutableList.of(d(), e(), f(), g(), t());
   private final int aW;
   private final boolean aX;
   private final boolean aY;

   public static gry d() {
      return E;
   }

   public static gry e() {
      return F;
   }

   public static gry f() {
      return G;
   }

   public static gry g() {
      return H;
   }

   public static gry h() {
      return I;
   }

   public static gry a(alr $$0) {
      return J.apply($$0);
   }

   public static gry b(alr $$0) {
      gry.b $$1 = gry.b.a().a(new grx.j($$0, bbf.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, grw.j, $$1);
   }

   public static gry c(alr $$0) {
      return K.apply($$0);
   }

   public static gry d(alr $$0) {
      return L.apply($$0);
   }

   public static gry e(alr $$0) {
      return M.apply($$0);
   }

   public static gry f(alr $$0) {
      return N.apply($$0);
   }

   public static gry a(alr $$0, boolean $$1) {
      return O.apply($$0, $$1);
   }

   public static gry g(alr $$0) {
      return a($$0, true);
   }

   public static gry b(alr $$0, boolean $$1) {
      return P.apply($$0, $$1);
   }

   public static gry h(alr $$0) {
      return b($$0, true);
   }

   public static gry i(alr $$0) {
      return Q.apply($$0);
   }

   public static gry c(alr $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static gry j(alr $$0) {
      return c($$0, true);
   }

   public static gry d(alr $$0, boolean $$1) {
      return S.apply($$0, $$1);
   }

   public static gry k(alr $$0) {
      return d($$0, true);
   }

   public static gry l(alr $$0) {
      return T.apply($$0);
   }

   public static gry e(alr $$0, boolean $$1) {
      return U.apply($$0, $$1);
   }

   public static gry m(alr $$0) {
      return V.apply($$0);
   }

   public static gry n(alr $$0) {
      return W.apply($$0);
   }

   public static gry o(alr $$0) {
      return X.apply($$0);
   }

   public static gry p(alr $$0) {
      return Y.apply($$0);
   }

   public static gry q(alr $$0) {
      return Z.apply($$0);
   }

   public static gry r(alr $$0) {
      return S.apply($$0, false);
   }

   public static gry a(alr $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, grw.u, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(new grx.g($$1, $$2)).a(j).a(m).a(false));
   }

   public static gry b(alr $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, grw.v, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(new grx.g($$1, $$2)).a(j).a(l).a(false));
   }

   public static gry i() {
      return aa;
   }

   public static gry j() {
      return ab;
   }

   public static gry s(alr $$0) {
      return gry.a.D.apply($$0, false);
   }

   public static gry k() {
      return ac;
   }

   public static gry l() {
      return ad;
   }

   public static gry m() {
      return ae;
   }

   public static gry n() {
      return af;
   }

   public static gry t(alr $$0) {
      return ag.apply($$0);
   }

   public static gry u(alr $$0) {
      return ah.apply($$0);
   }

   public static gry o() {
      return ai;
   }

   public static gry v(alr $$0) {
      return aj.apply($$0);
   }

   public static gry w(alr $$0) {
      return ak.apply($$0);
   }

   public static gry x(alr $$0) {
      return al.apply($$0);
   }

   public static gry y(alr $$0) {
      return am.apply($$0);
   }

   public static gry p() {
      return an;
   }

   public static gry z(alr $$0) {
      return ao.apply($$0);
   }

   public static gry q() {
      return ap;
   }

   public static gry r() {
      return aq;
   }

   public static gry s() {
      return ar;
   }

   public static gry t() {
      return as;
   }

   public static gry u() {
      return at;
   }

   public static gry v() {
      return au;
   }

   public static gry w() {
      return A;
   }

   public static gry x() {
      return B;
   }

   public static gry y() {
      return C;
   }

   public static gry a(double $$0) {
      return av.apply($$0);
   }

   public static gry b(double $$0) {
      return aw.apply($$0);
   }

   public static gry z() {
      return ax;
   }

   public static gry A() {
      return ay;
   }

   public static gry B() {
      return az;
   }

   public static gry C() {
      return aA;
   }

   public static gry D() {
      return aB;
   }

   public static gry A(alr $$0) {
      return aC.apply($$0);
   }

   public static gry B(alr $$0) {
      return aD.apply($$0);
   }

   private static Function<alr, gry> a(RenderPipeline $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, gry.b.a().a(new grx.j($$1, bbf.b, false)).a(u).a(j).a(false)));
   }

   public static gry f(alr $$0, boolean $$1) {
      return ($$1 ? aE : aF).apply($$0);
   }

   public static gry E() {
      return aG;
   }

   public static gry C(alr $$0) {
      return aH.apply($$0);
   }

   public static gry D(alr $$0) {
      return aI.apply($$0);
   }

   public static gry E(alr $$0) {
      return aJ.apply($$0);
   }

   public static gry F() {
      return aK;
   }

   public static gry G() {
      return aL;
   }

   public static gry F(alr $$0) {
      return aM.apply($$0);
   }

   public static gry G(alr $$0) {
      return aN.apply($$0);
   }

   public static gry H() {
      return aO;
   }

   public static gry I() {
      return aP;
   }

   public static gry J() {
      return aQ;
   }

   public static gry H(alr $$0) {
      return aR.apply($$0);
   }

   public static gry I(alr $$0) {
      return aS.apply($$0);
   }

   public static gry J(alr $$0) {
      return aT.apply($$0);
   }

   public static gry K() {
      return aU;
   }

   public gry(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.aW = $$1;
      this.aX = $$2;
      this.aY = $$3;
   }

   static gry.a a(String $$0, int $$1, RenderPipeline $$2, gry.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static gry.a a(String $$0, int $$1, boolean $$2, boolean $$3, RenderPipeline $$4, gry.b $$5) {
      return new gry.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public abstract void a(flc var1);

   public abstract fjr L();

   public abstract RenderPipeline M();

   public static List<gry> N() {
      return aV;
   }

   public int O() {
      return this.aW;
   }

   public abstract VertexFormat P();

   public abstract VertexFormat.b Q();

   public Optional<gry> R() {
      return Optional.empty();
   }

   public boolean S() {
      return false;
   }

   public boolean T() {
      return this.aX;
   }

   public boolean U() {
      return !this.Q().k;
   }

   public boolean V() {
      return this.aY;
   }

   static final class a extends gry {
      static final BiFunction<alr, Boolean, gry> D = ag.a(
         ($$0, $$1) -> gry.a("outline", 1536, $$1 ? grw.aF : grw.aG, gry.b.a().a(new grx.j($$0, bbf.b, false)).a(r).a(gry.c.b))
      );
      private final gry.b E;
      private final RenderPipeline F;
      private final Optional<gry> G;
      private final boolean H;

      a(String $$0, int $$1, boolean $$2, boolean $$3, RenderPipeline $$4, gry.b $$5) {
         super($$0, $$1, $$2, $$3, () -> $$5.d.forEach(grx::a), () -> $$5.d.forEach(grx::b));
         this.E = $$5;
         this.F = $$4;
         this.G = $$5.c == gry.c.c ? $$5.a.d().map($$1x -> D.apply($$1x, $$4.isCull())) : Optional.empty();
         this.H = $$5.c == gry.c.b;
      }

      @Override
      public Optional<gry> R() {
         return this.G;
      }

      @Override
      public boolean S() {
         return this.H;
      }

      @Override
      public RenderPipeline M() {
         return this.F;
      }

      @Override
      public VertexFormat P() {
         return this.F.getVertexFormat();
      }

      @Override
      public VertexFormat.b Q() {
         return this.F.getVertexFormatMode();
      }

      @Override
      public void a(flc $$0) {
         RenderPipeline $$1 = this.M();
         this.a();
         flc var3 = $$0;

         try {
            GpuBuffer $$2 = $$1.getVertexFormat().uploadImmediateVertexBuffer($$0.a());
            GpuBuffer $$4;
            VertexFormat.a $$5;
            if ($$0.b() == null) {
               RenderSystem.a $$3 = RenderSystem.getSequentialBuffer($$0.c().d());
               $$4 = $$3.b($$0.c().c());
               $$5 = $$3.a();
            } else {
               $$4 = $$1.getVertexFormat().uploadImmediateIndexBuffer($$0.b());
               $$5 = $$0.c().e();
            }

            fjr $$8 = this.E.b.d();

            try (RenderPass $$9 = RenderSystem.getDevice()
                  .createCommandEncoder()
                  .createRenderPass($$8.c(), OptionalInt.empty(), $$8.h ? $$8.d() : null, OptionalDouble.empty())) {
               $$9.setPipeline($$1);
               $$9.setVertexBuffer(0, $$2);
               if (RenderSystem.SCISSOR_STATE.isEnabled()) {
                  $$9.enableScissor(RenderSystem.SCISSOR_STATE);
               }

               for (int $$10 = 0; $$10 < 12; $$10++) {
                  GpuTexture $$11 = RenderSystem.getShaderTexture($$10);
                  if ($$11 != null) {
                     $$9.bindSampler("Sampler" + $$10, $$11);
                  }
               }

               $$9.setIndexBuffer($$4, $$5);
               $$9.drawIndexed(0, $$0.c().c());
            }
         } catch (Throwable var14) {
            if ($$0 != null) {
               try {
                  var3.close();
               } catch (Throwable var11) {
                  var14.addSuppressed(var11);
               }
            }

            throw var14;
         }

         if ($$0 != null) {
            $$0.close();
         }

         this.b();
      }

      @Override
      public fjr L() {
         return this.E.b.d();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.E + "]";
      }
   }

   protected static final class b {
      final grx.b a;
      final grx.h b;
      final gry.c c;
      final ImmutableList<grx> d;

      b(grx.b $$0, grx.d $$1, grx.i $$2, grx.c $$3, grx.h $$4, grx.k $$5, grx.e $$6, gry.c $$7) {
         this.a = $$0;
         this.b = $$4;
         this.c = $$7;
         this.d = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.d + ", outlineProperty=" + this.c + "]";
      }

      public static gry.b.a a() {
         return new gry.b.a();
      }

      public static class a {
         private grx.b a = grx.e;
         private grx.d b = grx.k;
         private grx.i c = grx.m;
         private grx.c d = grx.n;
         private grx.h e = grx.q;
         private grx.k f;
         private grx.e g;

         a() {
            this.f = grx.f;
            this.g = grx.w;
         }

         protected gry.b.a a(grx.b $$0) {
            this.a = $$0;
            return this;
         }

         protected gry.b.a a(grx.d $$0) {
            this.b = $$0;
            return this;
         }

         protected gry.b.a a(grx.i $$0) {
            this.c = $$0;
            return this;
         }

         protected gry.b.a a(grx.c $$0) {
            this.d = $$0;
            return this;
         }

         protected gry.b.a a(grx.h $$0) {
            this.e = $$0;
            return this;
         }

         protected gry.b.a a(grx.k $$0) {
            this.f = $$0;
            return this;
         }

         protected gry.b.a a(grx.e $$0) {
            this.g = $$0;
            return this;
         }

         protected gry.b a(boolean $$0) {
            return this.a($$0 ? gry.c.c : gry.c.a);
         }

         protected gry.b a(gry.c $$0) {
            return new gry.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
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
