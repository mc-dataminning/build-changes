import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gsn extends gsm {
   private static final int D = 1048576;
   public static final int x = 4194304;
   public static final int y = 786432;
   public static final int z = 1536;
   private static final gsn E = a("solid", 4194304, true, false, gsl.b, gsn.b.a().a(j).a(c).a(true));
   private static final gsn F = a("cutout_mipped", 4194304, true, false, gsl.d, gsn.b.a().a(j).a(c).a(true));
   private static final gsn G = a("cutout", 786432, true, false, gsl.e, gsn.b.a().a(j).a(d).a(true));
   private static final gsn H = a("translucent", 786432, true, true, gsl.f, gsn.b.a().a(j).a(c).a(s).a(true));
   private static final gsn I = a("translucent_moving_block", 786432, false, true, gsl.h, gsn.b.a().a(j).a(c).a(v).a(true));
   private static final Function<alk, gsn> J = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, gsl.i, $$1);
   });
   private static final Function<alk, gsn> K = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_translucent", 1536, true, true, gsl.k, $$1);
   });
   private static final Function<alk, gsn> L = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(true);
      return a("entity_solid", 1536, true, false, gsl.l, $$1);
   });
   private static final Function<alk, gsn> M = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(p).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, gsl.m, $$1);
   });
   private static final Function<alk, gsn> N = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(true);
      return a("entity_cutout", 1536, true, false, gsl.n, $$1);
   });
   private static final BiFunction<alk, Boolean, gsn> O = ag.a(($$0, $$1) -> {
      gsn.b $$2 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, gsl.o, $$2);
   });
   private static final BiFunction<alk, Boolean, gsn> P = ag.a(($$0, $$1) -> {
      gsn.b $$2 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(o).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, gsl.p, $$2);
   });
   private static final Function<alk, gsn> Q = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(v).a(j).a(l).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, gsl.z, $$1);
   });
   private static final BiFunction<alk, Boolean, gsn> R = ag.a(($$0, $$1) -> {
      gsn.b $$2 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a($$1);
      return a("entity_translucent", 1536, true, true, gsl.q, $$2);
   });
   private static final BiFunction<alk, Boolean, gsn> S = ag.a(($$0, $$1) -> {
      gsn.b $$2 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(l).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, gsl.r, $$2);
   });
   private static final Function<alk, gsn> T = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(true);
      return a("entity_smooth_cutout", 1536, gsl.s, $$1);
   });
   private static final BiFunction<alk, Boolean, gsn> U = ag.a(($$0, $$1) -> {
      gsn.b $$2 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? gsl.B : gsl.A, $$2);
   });
   private static final Function<alk, gsn> V = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(false);
      return a("entity_decal", 1536, gsl.x, $$1);
   });
   private static final Function<alk, gsn> W = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(false);
      return a("entity_no_outline", 1536, false, true, gsl.t, $$1);
   });
   private static final Function<alk, gsn> X = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(o).a(false);
      return a("entity_shadow", 1536, false, false, gsl.y, $$1);
   });
   private static final Function<alk, gsn> Y = ag.b($$0 -> {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(true);
      return a("entity_alpha", 1536, gsl.C, $$1);
   });
   private static final Function<alk, gsn> Z = ag.b($$0 -> {
      gsm.j $$1 = new gsm.j($$0, baw.b, false);
      return a("eyes", 1536, false, true, gsl.w, gsn.b.a().a($$1).a(false));
   });
   private static final gsn aa = a("leash", 1536, gsl.D, gsn.b.a().a(e).a(j).a(false));
   private static final gsn ab = a("water_mask", 1536, gsl.E, gsn.b.a().a(e).a(false));
   private static final gsn ac = a("armor_entity_glint", 1536, gsl.F, gsn.b.a().a(new gsm.j(gzi.a, baw.c, false)).a(i).a(o).a(false));
   private static final gsn ad = a("glint_translucent", 1536, gsl.F, gsn.b.a().a(new gsm.j(gzi.b, baw.c, false)).a(g).a(v).a(false));
   private static final gsn ae = a("glint", 1536, gsl.F, gsn.b.a().a(new gsm.j(gzi.b, baw.c, false)).a(g).a(false));
   private static final gsn af = a("entity_glint", 1536, gsl.F, gsn.b.a().a(new gsm.j(gzi.b, baw.c, false)).a(h).a(false));
   private static final Function<alk, gsn> ag = ag.b($$0 -> {
      gsm.j $$1 = new gsm.j($$0, baw.b, false);
      return a("crumbling", 1536, false, true, gsl.G, gsn.b.a().a($$1).a(false));
   });
   private static final Function<alk, gsn> ah = ag.b($$0 -> a("text", 786432, false, false, gsl.H, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false)));
   private static final gsn ai = a("text_background", 1536, false, true, gsl.I, gsn.b.a().a(e).a(j).a(false));
   private static final Function<alk, gsn> aj = ag.b(
      $$0 -> a("text_intensity", 786432, false, false, gsl.J, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final Function<alk, gsn> ak = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, gsl.K, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final Function<alk, gsn> al = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, gsl.J, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final Function<alk, gsn> am = ag.b(
      $$0 -> a("text_see_through", 1536, false, false, gsl.L, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final gsn an = a("text_background_see_through", 1536, false, true, gsl.M, gsn.b.a().a(e).a(j).a(false));
   private static final Function<alk, gsn> ao = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, gsl.N, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final gsn ap = a("lightning", 1536, false, true, gsl.O, gsn.b.a().a(u).a(false));
   private static final gsn aq = a("dragon_rays", 1536, false, false, gsl.P, gsn.b.a().a(false));
   private static final gsn ar = a("dragon_rays_depth", 1536, false, false, gsl.Q, gsn.b.a().a(false));
   private static final gsn as = a("tripwire", 1536, true, true, gsl.g, gsn.b.a().a(j).a(c).a(u).a(true));
   private static final gsn at = a("end_portal", 1536, false, false, gsl.R, gsn.b.a().a(gsm.f.e().a(gvj.a, false, false).a(gvj.b, false, false).a()).a(false));
   private static final gsn au = a("end_gateway", 1536, false, false, gsl.S, gsn.b.a().a(gsm.f.e().a(gvj.a, false, false).a(gvj.b, false, false).a()).a(false));
   public static final gsn.a A = a("lines", 1536, gsl.W, gsn.b.a().a(new gsm.e(OptionalDouble.empty())).a(o).a(v).a(false));
   public static final gsn.a B = a("secondary_block_outline", 1536, gsl.X, gsn.b.a().a(new gsm.e(OptionalDouble.of(7.0))).a(o).a(v).a(false));
   public static final gsn.a C = a("line_strip", 1536, gsl.Y, gsn.b.a().a(new gsm.e(OptionalDouble.empty())).a(o).a(v).a(false));
   private static final Function<Double, gsn.a> av = ag.b($$0 -> a("debug_line_strip", 1536, gsl.Z, gsn.b.a().a(new gsm.e(OptionalDouble.of($$0))).a(false)));
   private static final Function<Double, gsn.a> aw = ag.b($$0 -> a("debug_line", 1536, gsl.W, gsn.b.a().a(new gsm.e(OptionalDouble.of($$0))).a(false)));
   private static final gsn.a ax = a("debug_filled_box", 1536, false, true, gsl.aa, gsn.b.a().a(o).a(false));
   private static final gsn.a ay = a("debug_quads", 1536, false, true, gsl.ab, gsn.b.a().a(false));
   private static final gsn.a az = a("debug_triangle_fan", 1536, false, true, gsl.ac, gsn.b.a().a(false));
   private static final gsn.a aA = a("debug_structure_quads", 1536, false, true, gsl.ad, gsn.b.a().a(false));
   private static final gsn.a aB = a("debug_section_quads", 1536, false, true, gsl.ae, gsn.b.a().a(o).a(false));
   private static final Function<alk, gsn> aC = ag.b(
      $$0 -> a("opaque_particle", 1536, false, false, gsl.ag, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(false))
   );
   private static final Function<alk, gsn> aD = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, gsl.ah, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(t).a(j).a(false))
   );
   private static final Function<alk, gsn> aE = a(gsl.ai);
   private static final Function<alk, gsn> aF = a(gsl.aj);
   private static final gsn aG = a("sunrise_sunset", 1536, false, false, gsl.am, gsn.b.a().a(false));
   private static final Function<alk, gsn> aH = ag.b($$0 -> a("celestial", 1536, false, false, gsl.ao, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false)));
   private static final Function<alk, gsn> aI = ag.b(
      $$0 -> a("block_screen_effect", 1536, false, false, gsl.av, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false))
   );
   private static final Function<alk, gsn> aJ = ag.b(
      $$0 -> a("fire_screen_effect", 1536, false, false, gsl.aw, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false))
   );
   private static final gsn.a aK = a("gui", 786432, gsl.ap, gsn.b.a().a(false));
   private static final gsn.a aL = a("gui_overlay", 1536, gsl.aq, gsn.b.a().a(false));
   private static final Function<alk, gsn> aM = ag.b($$0 -> a("gui_textured_overlay", 1536, gsl.au, gsn.b.a().a(new gsm.j($$0, baw.c, false)).a(false)));
   private static final Function<alk, gsn> aN = ag.b(
      $$0 -> a("gui_opaque_textured_background", 786432, gsl.ax, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false))
   );
   private static final gsn.a aO = a("gui_nausea_overlay", 1536, gsl.ay, gsn.b.a().a(new gsm.j(fty.a, baw.c, false)).a(false));
   private static final gsn.a aP = a("gui_text_highlight", 1536, gsl.ar, gsn.b.a().a(false));
   private static final gsn.a aQ = a("gui_ghost_recipe_overlay", 1536, gsl.as, gsn.b.a().a(false));
   private static final Function<alk, gsn> aR = ag.b($$0 -> a("gui_textured", 786432, gsl.at, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false)));
   private static final Function<alk, gsn> aS = ag.b($$0 -> a("vignette", 786432, gsl.az, gsn.b.a().a(new gsm.j($$0, baw.c, false)).a(false)));
   private static final Function<alk, gsn> aT = ag.b($$0 -> a("crosshair", 786432, gsl.aA, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(false)));
   private static final gsn.a aU = a("mojang_logo", 786432, gsl.aB, gsn.b.a().a(new gsm.j(fzv.a, baw.c, false)).a(false));
   private static final ImmutableList<gsn> aV = ImmutableList.of(d(), e(), f(), g(), t());
   private final int aW;
   private final boolean aX;
   private final boolean aY;

   public static gsn d() {
      return E;
   }

   public static gsn e() {
      return F;
   }

   public static gsn f() {
      return G;
   }

   public static gsn g() {
      return H;
   }

   public static gsn h() {
      return I;
   }

   public static gsn a(alk $$0) {
      return J.apply($$0);
   }

   public static gsn b(alk $$0) {
      gsn.b $$1 = gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(j).a(l).a(o).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, gsl.j, $$1);
   }

   public static gsn c(alk $$0) {
      return K.apply($$0);
   }

   public static gsn d(alk $$0) {
      return L.apply($$0);
   }

   public static gsn e(alk $$0) {
      return M.apply($$0);
   }

   public static gsn f(alk $$0) {
      return N.apply($$0);
   }

   public static gsn a(alk $$0, boolean $$1) {
      return O.apply($$0, $$1);
   }

   public static gsn g(alk $$0) {
      return a($$0, true);
   }

   public static gsn b(alk $$0, boolean $$1) {
      return P.apply($$0, $$1);
   }

   public static gsn h(alk $$0) {
      return b($$0, true);
   }

   public static gsn i(alk $$0) {
      return Q.apply($$0);
   }

   public static gsn c(alk $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static gsn j(alk $$0) {
      return c($$0, true);
   }

   public static gsn d(alk $$0, boolean $$1) {
      return S.apply($$0, $$1);
   }

   public static gsn k(alk $$0) {
      return d($$0, true);
   }

   public static gsn l(alk $$0) {
      return T.apply($$0);
   }

   public static gsn e(alk $$0, boolean $$1) {
      return U.apply($$0, $$1);
   }

   public static gsn m(alk $$0) {
      return V.apply($$0);
   }

   public static gsn n(alk $$0) {
      return W.apply($$0);
   }

   public static gsn o(alk $$0) {
      return X.apply($$0);
   }

   public static gsn p(alk $$0) {
      return Y.apply($$0);
   }

   public static gsn q(alk $$0) {
      return Z.apply($$0);
   }

   public static gsn r(alk $$0) {
      return S.apply($$0, false);
   }

   public static gsn a(alk $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, gsl.u, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(new gsm.g($$1, $$2)).a(j).a(m).a(false));
   }

   public static gsn b(alk $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, gsl.v, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(new gsm.g($$1, $$2)).a(j).a(l).a(false));
   }

   public static gsn i() {
      return aa;
   }

   public static gsn j() {
      return ab;
   }

   public static gsn s(alk $$0) {
      return gsn.a.D.apply($$0, false);
   }

   public static gsn k() {
      return ac;
   }

   public static gsn l() {
      return ad;
   }

   public static gsn m() {
      return ae;
   }

   public static gsn n() {
      return af;
   }

   public static gsn t(alk $$0) {
      return ag.apply($$0);
   }

   public static gsn u(alk $$0) {
      return ah.apply($$0);
   }

   public static gsn o() {
      return ai;
   }

   public static gsn v(alk $$0) {
      return aj.apply($$0);
   }

   public static gsn w(alk $$0) {
      return ak.apply($$0);
   }

   public static gsn x(alk $$0) {
      return al.apply($$0);
   }

   public static gsn y(alk $$0) {
      return am.apply($$0);
   }

   public static gsn p() {
      return an;
   }

   public static gsn z(alk $$0) {
      return ao.apply($$0);
   }

   public static gsn q() {
      return ap;
   }

   public static gsn r() {
      return aq;
   }

   public static gsn s() {
      return ar;
   }

   public static gsn t() {
      return as;
   }

   public static gsn u() {
      return at;
   }

   public static gsn v() {
      return au;
   }

   public static gsn w() {
      return A;
   }

   public static gsn x() {
      return B;
   }

   public static gsn y() {
      return C;
   }

   public static gsn a(double $$0) {
      return av.apply($$0);
   }

   public static gsn b(double $$0) {
      return aw.apply($$0);
   }

   public static gsn z() {
      return ax;
   }

   public static gsn A() {
      return ay;
   }

   public static gsn B() {
      return az;
   }

   public static gsn C() {
      return aA;
   }

   public static gsn D() {
      return aB;
   }

   public static gsn A(alk $$0) {
      return aC.apply($$0);
   }

   public static gsn B(alk $$0) {
      return aD.apply($$0);
   }

   private static Function<alk, gsn> a(fjr $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, gsn.b.a().a(new gsm.j($$1, baw.b, false)).a(u).a(j).a(false)));
   }

   public static gsn f(alk $$0, boolean $$1) {
      return ($$1 ? aE : aF).apply($$0);
   }

   public static gsn E() {
      return aG;
   }

   public static gsn C(alk $$0) {
      return aH.apply($$0);
   }

   public static gsn D(alk $$0) {
      return aI.apply($$0);
   }

   public static gsn E(alk $$0) {
      return aJ.apply($$0);
   }

   public static gsn F() {
      return aK;
   }

   public static gsn G() {
      return aL;
   }

   public static gsn F(alk $$0) {
      return aM.apply($$0);
   }

   public static gsn G(alk $$0) {
      return aN.apply($$0);
   }

   public static gsn H() {
      return aO;
   }

   public static gsn I() {
      return aP;
   }

   public static gsn J() {
      return aQ;
   }

   public static gsn H(alk $$0) {
      return aR.apply($$0);
   }

   public static gsn I(alk $$0) {
      return aS.apply($$0);
   }

   public static gsn J(alk $$0) {
      return aT.apply($$0);
   }

   public static gsn K() {
      return aU;
   }

   public gsn(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.aW = $$1;
      this.aX = $$2;
      this.aY = $$3;
   }

   static gsn.a a(String $$0, int $$1, fjr $$2, gsn.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static gsn.a a(String $$0, int $$1, boolean $$2, boolean $$3, fjr $$4, gsn.b $$5) {
      return new gsn.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public abstract void a(flp var1);

   public abstract fjs L();

   public abstract fjr M();

   public static List<gsn> N() {
      return aV;
   }

   public int O() {
      return this.aW;
   }

   public abstract flu P();

   public abstract flu.c Q();

   public Optional<gsn> R() {
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

   static final class a extends gsn {
      static final BiFunction<alk, Boolean, gsn> D = ag.a(
         ($$0, $$1) -> gsn.a("outline", 1536, $$1 ? gsl.aF : gsl.aG, gsn.b.a().a(new gsm.j($$0, baw.b, false)).a(r).a(gsn.c.b))
      );
      private final gsn.b E;
      private final fjr F;
      private final Optional<gsn> G;
      private final boolean H;

      a(String $$0, int $$1, boolean $$2, boolean $$3, fjr $$4, gsn.b $$5) {
         super($$0, $$1, $$2, $$3, () -> $$5.d.forEach(gsm::a), () -> $$5.d.forEach(gsm::b));
         this.E = $$5;
         this.F = $$4;
         this.G = $$5.c == gsn.c.c ? $$5.a.d().map($$1x -> D.apply($$1x, $$4.c())) : Optional.empty();
         this.H = $$5.c == gsn.c.b;
      }

      @Override
      public Optional<gsn> R() {
         return this.G;
      }

      @Override
      public boolean S() {
         return this.H;
      }

      @Override
      public fjr M() {
         return this.F;
      }

      @Override
      public flu P() {
         return this.F.l();
      }

      @Override
      public flu.c Q() {
         return this.F.m();
      }

      @Override
      public void a(flp $$0) {
         fjr $$1 = this.M();
         this.a();
         flp var3 = $$0;

         try {
            fii $$2 = $$1.l().a($$0.a());
            fii $$3 = $$0.b() == null ? null : $$1.l().b($$0.b());
            fjs $$4 = this.E.b.d();

            try (fld $$5 = RenderSystem.getDevice().b().a($$4.d(), OptionalInt.empty(), $$4.h ? $$4.e() : null, OptionalDouble.empty())) {
               $$5.a($$1);
               $$5.a(0, $$2);
               if (RenderSystem.SCISSOR_STATE.b()) {
                  $$5.a(RenderSystem.SCISSOR_STATE);
               }

               for (int $$6 = 0; $$6 < 12; $$6++) {
                  flj $$7 = RenderSystem.getShaderTexture($$6);
                  if ($$7 != null) {
                     $$5.a("Sampler" + $$6, $$7);
                  }
               }

               if ($$3 != null) {
                  $$5.a($$3, $$0.c().e());
               } else {
                  RenderSystem.a $$8 = RenderSystem.getSequentialBuffer($$0.c().d());
                  $$5.a($$8.b($$0.c().c()), $$8.a());
               }

               $$5.a(0, $$0.c().c());
            }
         } catch (Throwable var13) {
            if ($$0 != null) {
               try {
                  var3.close();
               } catch (Throwable var10) {
                  var13.addSuppressed(var10);
               }
            }

            throw var13;
         }

         if ($$0 != null) {
            $$0.close();
         }

         this.b();
      }

      @Override
      public fjs L() {
         return this.E.b.d();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.E + "]";
      }
   }

   protected static final class b {
      final gsm.b a;
      final gsm.h b;
      final gsn.c c;
      final ImmutableList<gsm> d;

      b(gsm.b $$0, gsm.d $$1, gsm.i $$2, gsm.c $$3, gsm.h $$4, gsm.k $$5, gsm.e $$6, gsn.c $$7) {
         this.a = $$0;
         this.b = $$4;
         this.c = $$7;
         this.d = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.d + ", outlineProperty=" + this.c + "]";
      }

      public static gsn.b.a a() {
         return new gsn.b.a();
      }

      public static class a {
         private gsm.b a = gsm.e;
         private gsm.d b = gsm.k;
         private gsm.i c = gsm.m;
         private gsm.c d = gsm.n;
         private gsm.h e = gsm.q;
         private gsm.k f;
         private gsm.e g;

         a() {
            this.f = gsm.f;
            this.g = gsm.w;
         }

         protected gsn.b.a a(gsm.b $$0) {
            this.a = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.d $$0) {
            this.b = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.i $$0) {
            this.c = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.c $$0) {
            this.d = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.h $$0) {
            this.e = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.k $$0) {
            this.f = $$0;
            return this;
         }

         protected gsn.b.a a(gsm.e $$0) {
            this.g = $$0;
            return this;
         }

         protected gsn.b a(boolean $$0) {
            return this.a($$0 ? gsn.c.c : gsn.c.a);
         }

         protected gsn.b a(gsn.c $$0) {
            return new gsn.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
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
