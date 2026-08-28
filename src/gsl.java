import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gsl extends gsk {
   private static final int C = 1048576;
   public static final int w = 4194304;
   public static final int x = 786432;
   public static final int y = 1536;
   private static final gsl D = a("solid", 4194304, true, false, gsj.b, gsl.b.a().a(i).a(c).a(true));
   private static final gsl E = a("cutout_mipped", 4194304, true, false, gsj.d, gsl.b.a().a(i).a(c).a(true));
   private static final gsl F = a("cutout", 786432, true, false, gsj.e, gsl.b.a().a(i).a(d).a(true));
   private static final gsl G = a("translucent", 786432, true, true, gsj.f, gsl.b.a().a(i).a(c).a(r).a(true));
   private static final gsl H = a("translucent_moving_block", 786432, false, true, gsj.h, gsl.b.a().a(i).a(c).a(u).a(true));
   private static final Function<ali, gsl> I = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(n).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, gsj.i, $$1);
   });
   private static final Function<ali, gsl> J = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(n).a(true);
      return a("armor_translucent", 1536, true, true, gsj.k, $$1);
   });
   private static final Function<ali, gsl> K = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(true);
      return a("entity_solid", 1536, true, false, gsj.l, $$1);
   });
   private static final Function<ali, gsl> L = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(o).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, gsj.m, $$1);
   });
   private static final Function<ali, gsl> M = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(true);
      return a("entity_cutout", 1536, true, false, gsj.n, $$1);
   });
   private static final BiFunction<ali, Boolean, gsl> N = ag.a(($$0, $$1) -> {
      gsl.b $$2 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, gsj.o, $$2);
   });
   private static final BiFunction<ali, Boolean, gsl> O = ag.a(($$0, $$1) -> {
      gsl.b $$2 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(n).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, gsj.p, $$2);
   });
   private static final Function<ali, gsl> P = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(u).a(i).a(k).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, gsj.z, $$1);
   });
   private static final BiFunction<ali, Boolean, gsl> Q = ag.a(($$0, $$1) -> {
      gsl.b $$2 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a($$1);
      return a("entity_translucent", 1536, true, true, gsj.q, $$2);
   });
   private static final BiFunction<ali, Boolean, gsl> R = ag.a(($$0, $$1) -> {
      gsl.b $$2 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(k).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, gsj.r, $$2);
   });
   private static final Function<ali, gsl> S = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(true);
      return a("entity_smooth_cutout", 1536, gsj.s, $$1);
   });
   private static final BiFunction<ali, Boolean, gsl> T = ag.a(($$0, $$1) -> {
      gsl.b $$2 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? gsj.B : gsj.A, $$2);
   });
   private static final Function<ali, gsl> U = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(false);
      return a("entity_decal", 1536, gsj.x, $$1);
   });
   private static final Function<ali, gsl> V = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(false);
      return a("entity_no_outline", 1536, false, true, gsj.t, $$1);
   });
   private static final Function<ali, gsl> W = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(n).a(false);
      return a("entity_shadow", 1536, false, false, gsj.y, $$1);
   });
   private static final Function<ali, gsl> X = ag.b($$0 -> {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(true);
      return a("entity_alpha", 1536, gsj.C, $$1);
   });
   private static final Function<ali, gsl> Y = ag.b($$0 -> {
      gsk.j $$1 = new gsk.j($$0, bau.b, false);
      return a("eyes", 1536, false, true, gsj.w, gsl.b.a().a($$1).a(false));
   });
   private static final gsl Z = a("leash", 1536, gsj.D, gsl.b.a().a(e).a(i).a(false));
   private static final gsl aa = a("water_mask", 1536, gsj.E, gsl.b.a().a(e).a(false));
   private static final gsl ab = a("armor_entity_glint", 1536, gsj.F, gsl.b.a().a(new gsk.j(gzg.a, bau.c, false)).a(h).a(n).a(false));
   private static final gsl ac = a("glint_translucent", 1536, gsj.F, gsl.b.a().a(new gsk.j(gzg.b, bau.c, false)).a(g).a(u).a(false));
   private static final gsl ad = a("glint", 1536, gsj.F, gsl.b.a().a(new gsk.j(gzg.b, bau.c, false)).a(g).a(false));
   private static final gsl ae = a("entity_glint", 1536, gsj.F, gsl.b.a().a(new gsk.j(gzg.a, bau.c, false)).a(h).a(false));
   private static final Function<ali, gsl> af = ag.b($$0 -> {
      gsk.j $$1 = new gsk.j($$0, bau.b, false);
      return a("crumbling", 1536, false, true, gsj.G, gsl.b.a().a($$1).a(false));
   });
   private static final Function<ali, gsl> ag = ag.b($$0 -> a("text", 786432, false, false, gsj.H, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false)));
   private static final gsl ah = a("text_background", 1536, false, true, gsj.I, gsl.b.a().a(e).a(i).a(false));
   private static final Function<ali, gsl> ai = ag.b(
      $$0 -> a("text_intensity", 786432, false, false, gsj.J, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final Function<ali, gsl> aj = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, gsj.K, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final Function<ali, gsl> ak = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, gsj.J, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final Function<ali, gsl> al = ag.b(
      $$0 -> a("text_see_through", 1536, false, false, gsj.L, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final gsl am = a("text_background_see_through", 1536, false, true, gsj.M, gsl.b.a().a(e).a(i).a(false));
   private static final Function<ali, gsl> an = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, gsj.N, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final gsl ao = a("lightning", 1536, false, true, gsj.O, gsl.b.a().a(t).a(false));
   private static final gsl ap = a("dragon_rays", 1536, false, false, gsj.P, gsl.b.a().a(false));
   private static final gsl aq = a("dragon_rays_depth", 1536, false, false, gsj.Q, gsl.b.a().a(false));
   private static final gsl ar = a("tripwire", 1536, true, true, gsj.g, gsl.b.a().a(i).a(c).a(t).a(true));
   private static final gsl as = a("end_portal", 1536, false, false, gsj.R, gsl.b.a().a(gsk.f.e().a(gvh.a, false, false).a(gvh.b, false, false).a()).a(false));
   private static final gsl at = a("end_gateway", 1536, false, false, gsj.S, gsl.b.a().a(gsk.f.e().a(gvh.a, false, false).a(gvh.b, false, false).a()).a(false));
   public static final gsl.a z = a("lines", 1536, gsj.W, gsl.b.a().a(new gsk.e(OptionalDouble.empty())).a(n).a(u).a(false));
   public static final gsl.a A = a("secondary_block_outline", 1536, gsj.X, gsl.b.a().a(new gsk.e(OptionalDouble.of(7.0))).a(n).a(u).a(false));
   public static final gsl.a B = a("line_strip", 1536, gsj.Y, gsl.b.a().a(new gsk.e(OptionalDouble.empty())).a(n).a(u).a(false));
   private static final Function<Double, gsl.a> au = ag.b($$0 -> a("debug_line_strip", 1536, gsj.Z, gsl.b.a().a(new gsk.e(OptionalDouble.of($$0))).a(false)));
   private static final Function<Double, gsl.a> av = ag.b($$0 -> a("debug_line", 1536, gsj.W, gsl.b.a().a(new gsk.e(OptionalDouble.of($$0))).a(false)));
   private static final gsl.a aw = a("debug_filled_box", 1536, false, true, gsj.aa, gsl.b.a().a(n).a(false));
   private static final gsl.a ax = a("debug_quads", 1536, false, true, gsj.ab, gsl.b.a().a(false));
   private static final gsl.a ay = a("debug_triangle_fan", 1536, false, true, gsj.ac, gsl.b.a().a(false));
   private static final gsl.a az = a("debug_structure_quads", 1536, false, true, gsj.ad, gsl.b.a().a(false));
   private static final gsl.a aA = a("debug_section_quads", 1536, false, true, gsj.ae, gsl.b.a().a(n).a(false));
   private static final Function<ali, gsl> aB = ag.b(
      $$0 -> a("opaque_particle", 1536, false, false, gsj.ag, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(false))
   );
   private static final Function<ali, gsl> aC = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, gsj.ah, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(s).a(i).a(false))
   );
   private static final Function<ali, gsl> aD = a(gsj.ai);
   private static final Function<ali, gsl> aE = a(gsj.aj);
   private static final gsl aF = a("sunrise_sunset", 1536, false, false, gsj.am, gsl.b.a().a(false));
   private static final Function<ali, gsl> aG = ag.b($$0 -> a("celestial", 1536, false, false, gsj.ao, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false)));
   private static final Function<ali, gsl> aH = ag.b(
      $$0 -> a("block_screen_effect", 1536, false, false, gsj.av, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false))
   );
   private static final Function<ali, gsl> aI = ag.b(
      $$0 -> a("fire_screen_effect", 1536, false, false, gsj.aw, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false))
   );
   private static final gsl.a aJ = a("gui", 786432, gsj.ap, gsl.b.a().a(false));
   private static final gsl.a aK = a("gui_overlay", 1536, gsj.aq, gsl.b.a().a(false));
   private static final Function<ali, gsl> aL = ag.b($$0 -> a("gui_textured_overlay", 1536, gsj.au, gsl.b.a().a(new gsk.j($$0, bau.c, false)).a(false)));
   private static final Function<ali, gsl> aM = ag.b(
      $$0 -> a("gui_opaque_textured_background", 786432, gsj.ax, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false))
   );
   private static final gsl.a aN = a("gui_nausea_overlay", 1536, gsj.ay, gsl.b.a().a(new gsk.j(ftw.a, bau.c, false)).a(false));
   private static final gsl.a aO = a("gui_text_highlight", 1536, gsj.ar, gsl.b.a().a(false));
   private static final gsl.a aP = a("gui_ghost_recipe_overlay", 1536, gsj.as, gsl.b.a().a(false));
   private static final Function<ali, gsl> aQ = ag.b($$0 -> a("gui_textured", 786432, gsj.at, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false)));
   private static final Function<ali, gsl> aR = ag.b($$0 -> a("vignette", 786432, gsj.az, gsl.b.a().a(new gsk.j($$0, bau.c, false)).a(false)));
   private static final Function<ali, gsl> aS = ag.b($$0 -> a("crosshair", 786432, gsj.aA, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(false)));
   private static final gsl.a aT = a("mojang_logo", 786432, gsj.aB, gsl.b.a().a(new gsk.j(fzt.a, bau.c, false)).a(false));
   private static final ImmutableList<gsl> aU = ImmutableList.of(d(), e(), f(), g(), t());
   private final int aV;
   private final boolean aW;
   private final boolean aX;

   public static gsl d() {
      return D;
   }

   public static gsl e() {
      return E;
   }

   public static gsl f() {
      return F;
   }

   public static gsl g() {
      return G;
   }

   public static gsl h() {
      return H;
   }

   public static gsl a(ali $$0) {
      return I.apply($$0);
   }

   public static gsl b(ali $$0) {
      gsl.b $$1 = gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(i).a(k).a(n).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, gsj.j, $$1);
   }

   public static gsl c(ali $$0) {
      return J.apply($$0);
   }

   public static gsl d(ali $$0) {
      return K.apply($$0);
   }

   public static gsl e(ali $$0) {
      return L.apply($$0);
   }

   public static gsl f(ali $$0) {
      return M.apply($$0);
   }

   public static gsl a(ali $$0, boolean $$1) {
      return N.apply($$0, $$1);
   }

   public static gsl g(ali $$0) {
      return a($$0, true);
   }

   public static gsl b(ali $$0, boolean $$1) {
      return O.apply($$0, $$1);
   }

   public static gsl h(ali $$0) {
      return b($$0, true);
   }

   public static gsl i(ali $$0) {
      return P.apply($$0);
   }

   public static gsl c(ali $$0, boolean $$1) {
      return Q.apply($$0, $$1);
   }

   public static gsl j(ali $$0) {
      return c($$0, true);
   }

   public static gsl d(ali $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static gsl k(ali $$0) {
      return d($$0, true);
   }

   public static gsl l(ali $$0) {
      return S.apply($$0);
   }

   public static gsl e(ali $$0, boolean $$1) {
      return T.apply($$0, $$1);
   }

   public static gsl m(ali $$0) {
      return U.apply($$0);
   }

   public static gsl n(ali $$0) {
      return V.apply($$0);
   }

   public static gsl o(ali $$0) {
      return W.apply($$0);
   }

   public static gsl p(ali $$0) {
      return X.apply($$0);
   }

   public static gsl q(ali $$0) {
      return Y.apply($$0);
   }

   public static gsl r(ali $$0) {
      return R.apply($$0, false);
   }

   public static gsl a(ali $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, gsj.u, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(new gsk.g($$1, $$2)).a(i).a(l).a(false));
   }

   public static gsl b(ali $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, gsj.v, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(new gsk.g($$1, $$2)).a(i).a(k).a(false));
   }

   public static gsl i() {
      return Z;
   }

   public static gsl j() {
      return aa;
   }

   public static gsl s(ali $$0) {
      return gsl.a.C.apply($$0, false);
   }

   public static gsl k() {
      return ab;
   }

   public static gsl l() {
      return ac;
   }

   public static gsl m() {
      return ad;
   }

   public static gsl n() {
      return ae;
   }

   public static gsl t(ali $$0) {
      return af.apply($$0);
   }

   public static gsl u(ali $$0) {
      return ag.apply($$0);
   }

   public static gsl o() {
      return ah;
   }

   public static gsl v(ali $$0) {
      return ai.apply($$0);
   }

   public static gsl w(ali $$0) {
      return aj.apply($$0);
   }

   public static gsl x(ali $$0) {
      return ak.apply($$0);
   }

   public static gsl y(ali $$0) {
      return al.apply($$0);
   }

   public static gsl p() {
      return am;
   }

   public static gsl z(ali $$0) {
      return an.apply($$0);
   }

   public static gsl q() {
      return ao;
   }

   public static gsl r() {
      return ap;
   }

   public static gsl s() {
      return aq;
   }

   public static gsl t() {
      return ar;
   }

   public static gsl u() {
      return as;
   }

   public static gsl v() {
      return at;
   }

   public static gsl w() {
      return z;
   }

   public static gsl x() {
      return A;
   }

   public static gsl y() {
      return B;
   }

   public static gsl a(double $$0) {
      return au.apply($$0);
   }

   public static gsl b(double $$0) {
      return av.apply($$0);
   }

   public static gsl z() {
      return aw;
   }

   public static gsl A() {
      return ax;
   }

   public static gsl B() {
      return ay;
   }

   public static gsl C() {
      return az;
   }

   public static gsl D() {
      return aA;
   }

   public static gsl A(ali $$0) {
      return aB.apply($$0);
   }

   public static gsl B(ali $$0) {
      return aC.apply($$0);
   }

   private static Function<ali, gsl> a(fjp $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, gsl.b.a().a(new gsk.j($$1, bau.b, false)).a(t).a(i).a(false)));
   }

   public static gsl f(ali $$0, boolean $$1) {
      return ($$1 ? aD : aE).apply($$0);
   }

   public static gsl E() {
      return aF;
   }

   public static gsl C(ali $$0) {
      return aG.apply($$0);
   }

   public static gsl D(ali $$0) {
      return aH.apply($$0);
   }

   public static gsl E(ali $$0) {
      return aI.apply($$0);
   }

   public static gsl F() {
      return aJ;
   }

   public static gsl G() {
      return aK;
   }

   public static gsl F(ali $$0) {
      return aL.apply($$0);
   }

   public static gsl G(ali $$0) {
      return aM.apply($$0);
   }

   public static gsl H() {
      return aN;
   }

   public static gsl I() {
      return aO;
   }

   public static gsl J() {
      return aP;
   }

   public static gsl H(ali $$0) {
      return aQ.apply($$0);
   }

   public static gsl I(ali $$0) {
      return aR.apply($$0);
   }

   public static gsl J(ali $$0) {
      return aS.apply($$0);
   }

   public static gsl K() {
      return aT;
   }

   public gsl(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.aV = $$1;
      this.aW = $$2;
      this.aX = $$3;
   }

   static gsl.a a(String $$0, int $$1, fjp $$2, gsl.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static gsl.a a(String $$0, int $$1, boolean $$2, boolean $$3, fjp $$4, gsl.b $$5) {
      return new gsl.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public abstract void a(fln var1);

   public abstract fjq L();

   public abstract fjp M();

   public static List<gsl> N() {
      return aU;
   }

   public int O() {
      return this.aV;
   }

   public abstract fls P();

   public abstract fls.c Q();

   public Optional<gsl> R() {
      return Optional.empty();
   }

   public boolean S() {
      return false;
   }

   public boolean T() {
      return this.aW;
   }

   public boolean U() {
      return !this.Q().k;
   }

   public boolean V() {
      return this.aX;
   }

   static final class a extends gsl {
      static final BiFunction<ali, Boolean, gsl> C = ag.a(
         ($$0, $$1) -> gsl.a("outline", 1536, $$1 ? gsj.aF : gsj.aG, gsl.b.a().a(new gsk.j($$0, bau.b, false)).a(q).a(gsl.c.b))
      );
      private final gsl.b D;
      private final fjp E;
      private final Optional<gsl> F;
      private final boolean G;

      a(String $$0, int $$1, boolean $$2, boolean $$3, fjp $$4, gsl.b $$5) {
         super($$0, $$1, $$2, $$3, () -> $$5.d.forEach(gsk::a), () -> $$5.d.forEach(gsk::b));
         this.D = $$5;
         this.E = $$4;
         this.F = $$5.c == gsl.c.c ? $$5.a.d().map($$1x -> C.apply($$1x, $$4.c())) : Optional.empty();
         this.G = $$5.c == gsl.c.b;
      }

      @Override
      public Optional<gsl> R() {
         return this.F;
      }

      @Override
      public boolean S() {
         return this.G;
      }

      @Override
      public fjp M() {
         return this.E;
      }

      @Override
      public fls P() {
         return this.E.l();
      }

      @Override
      public fls.c Q() {
         return this.E.m();
      }

      @Override
      public void a(fln $$0) {
         fjp $$1 = this.M();
         this.a();
         fln var3 = $$0;

         try {
            fig $$2 = $$1.l().a($$0.a());
            fig $$3 = $$0.b() == null ? null : $$1.l().b($$0.b());
            fjq $$4 = this.D.b.d();

            try (flb $$5 = RenderSystem.getDevice().b().a($$4.d(), OptionalInt.empty(), $$4.h ? $$4.e() : null, OptionalDouble.empty())) {
               $$5.a($$1);
               $$5.a(0, $$2);
               if (RenderSystem.SCISSOR_STATE.b()) {
                  $$5.a(RenderSystem.SCISSOR_STATE);
               }

               for (int $$6 = 0; $$6 < 12; $$6++) {
                  flh $$7 = RenderSystem.getShaderTexture($$6);
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
      public fjq L() {
         return this.D.b.d();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.D + "]";
      }
   }

   protected static final class b {
      final gsk.b a;
      final gsk.h b;
      final gsl.c c;
      final ImmutableList<gsk> d;

      b(gsk.b $$0, gsk.d $$1, gsk.i $$2, gsk.c $$3, gsk.h $$4, gsk.k $$5, gsk.e $$6, gsl.c $$7) {
         this.a = $$0;
         this.b = $$4;
         this.c = $$7;
         this.d = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.d + ", outlineProperty=" + this.c + "]";
      }

      public static gsl.b.a a() {
         return new gsl.b.a();
      }

      public static class a {
         private gsk.b a = gsk.e;
         private gsk.d b = gsk.j;
         private gsk.i c = gsk.l;
         private gsk.c d = gsk.m;
         private gsk.h e = gsk.p;
         private gsk.k f;
         private gsk.e g;

         a() {
            this.f = gsk.f;
            this.g = gsk.v;
         }

         protected gsl.b.a a(gsk.b $$0) {
            this.a = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.d $$0) {
            this.b = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.i $$0) {
            this.c = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.c $$0) {
            this.d = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.h $$0) {
            this.e = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.k $$0) {
            this.f = $$0;
            return this;
         }

         protected gsl.b.a a(gsk.e $$0) {
            this.g = $$0;
            return this;
         }

         protected gsl.b a(boolean $$0) {
            return this.a($$0 ? gsl.c.c : gsl.c.a);
         }

         protected gsl.b a(gsl.c $$0) {
            return new gsl.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
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
