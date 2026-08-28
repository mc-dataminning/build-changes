import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdx extends gdw {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdx aZ = a("solid", ezx.j, fae.b.h, 4194304, true, false, gdx.b.a().a(at).a(p).a(an).a(true));
   private static final gdx ba = a("cutout_mipped", ezx.j, fae.b.h, 4194304, true, false, gdx.b.a().a(at).a(q).a(an).a(true));
   private static final gdx bb = a("cutout", ezx.j, fae.b.h, 786432, true, false, gdx.b.a().a(at).a(r).a(ao).a(true));
   private static final gdx bc = a("translucent", ezx.j, fae.b.h, 786432, true, true, a(s));
   private static final gdx bd = a("translucent_moving_block", ezx.j, fae.b.h, 786432, false, true, Q());
   private static final Function<alf, gdx> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alf, gdx> bf = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(v).a(new gdw.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezx.k, fae.b.h, 1536, true, false, $$1);
   });
   private static final Function<alf, gdx> bg = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(w).a(new gdw.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezx.k, fae.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alf, Boolean, gdx> bh = ac.a(($$0, $$1) -> {
      gdx.b $$2 = gdx.b.a().a(x).a(new gdw.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezx.k, fae.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alf, Boolean, gdx> bi = ac.a(($$0, $$1) -> {
      gdx.b $$2 = gdx.b.a().a(y).a(new gdw.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezx.k, fae.b.h, 1536, true, false, $$2);
   });
   private static final Function<alf, gdx> bj = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(z).a(new gdw.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdw.aD).a(true);
      return a("item_entity_translucent_cull", ezx.k, fae.b.h, 1536, true, true, $$1);
   });
   private static final Function<alf, gdx> bk = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(A).a(new gdw.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezx.k, fae.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alf, Boolean, gdx> bl = ac.a(($$0, $$1) -> {
      gdx.b $$2 = gdx.b.a().a(B).a(new gdw.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezx.k, fae.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alf, Boolean, gdx> bm = ac.a(($$0, $$1) -> {
      gdx.b $$2 = gdx.b.a().a(C).a(new gdw.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezx.k, fae.b.h, 1536, true, true, $$2);
   });
   private static final Function<alf, gdx> bn = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(D).a(new gdw.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezx.k, fae.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, Boolean, gdx> bo = ac.a(($$0, $$1) -> {
      gdx.b $$2 = gdx.b.a().a(E).a(new gdw.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezx.j, fae.b.h, 1536, false, true, $$2);
   });
   private static final Function<alf, gdx> bp = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(F).a(new gdw.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezx.k, fae.b.h, 1536, $$1);
   });
   private static final Function<alf, gdx> bq = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(G).a(new gdw.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezx.k, fae.b.h, 1536, false, true, $$1);
   });
   private static final Function<alf, gdx> br = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(H).a(new gdw.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezx.k, fae.b.h, 1536, false, false, $$1);
   });
   private static final Function<alf, gdx> bs = ac.b($$0 -> {
      gdx.b $$1 = gdx.b.a().a(I).a(new gdw.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezx.k, fae.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, gdw.p, gdx> bt = ac.a(($$0, $$1) -> {
      gdw.n $$2 = new gdw.n($$0, false, false);
      return a("eyes", ezx.k, fae.b.h, 1536, false, true, gdx.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdx bu = a("leash", ezx.p, fae.b.f, 1536, gdx.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdx bv = a("water_mask", ezx.m, fae.b.h, 1536, gdx.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdx bw = a(
      "armor_glint", ezx.q, fae.b.h, 1536, gdx.b.a().a(O).a(new gdw.n(gjw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdx bx = a(
      "armor_entity_glint", ezx.q, fae.b.h, 1536, gdx.b.a().a(P).a(new gdw.n(gjw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdx by = a(
      "glint_translucent", ezx.q, fae.b.h, 1536, gdx.b.a().a(Q).a(new gdw.n(gjw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdx bz = a("glint", ezx.q, fae.b.h, 1536, gdx.b.a().a(R).a(new gdw.n(gjw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdx bA = a("glint_direct", ezx.q, fae.b.h, 1536, gdx.b.a().a(S).a(new gdw.n(gjw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdx bB = a(
      "entity_glint", ezx.q, fae.b.h, 1536, gdx.b.a().a(T).a(new gdw.n(gjw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdx bC = a(
      "entity_glint_direct", ezx.q, fae.b.h, 1536, gdx.b.a().a(U).a(new gdw.n(gjw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<alf, gdx> bD = ac.b($$0 -> {
      gdw.n $$1 = new gdw.n($$0, false, false);
      return a("crumbling", ezx.j, fae.b.h, 1536, false, true, gdx.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alf, gdx> bE = ac.b(
      $$0 -> a("text", ezx.t, fae.b.h, 786432, false, true, gdx.b.a().a(W).a(new gdw.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdx bF = a("text_background", ezx.p, fae.b.h, 1536, false, true, gdx.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alf, gdx> bG = ac.b(
      $$0 -> a("text_intensity", ezx.t, fae.b.h, 786432, false, true, gdx.b.a().a(Y).a(new gdw.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<alf, gdx> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezx.t, fae.b.h, 1536, false, true, gdx.b.a().a(W).a(new gdw.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdx> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezx.t, fae.b.h, 1536, false, true, gdx.b.a().a(Y).a(new gdw.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdx> bJ = ac.b(
      $$0 -> a("text_see_through", ezx.t, fae.b.h, 1536, false, true, gdx.b.a().a(Z).a(new gdw.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdx bK = a("text_background_see_through", ezx.p, fae.b.h, 1536, false, true, gdx.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alf, gdx> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezx.t, fae.b.h, 1536, false, true, gdx.b.a().a(ab).a(new gdw.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdx bM = a("lightning", ezx.n, fae.b.h, 1536, false, true, gdx.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdx bN = a("tripwire", ezx.j, fae.b.h, 1536, true, true, R());
   private static final gdx bO = a(
      "end_portal", ezx.m, fae.b.h, 1536, false, false, gdx.b.a().a(ae).a(gdw.i.d().a(ggi.a, false, false).a(ggi.b, false, false).a()).a(false)
   );
   private static final gdx bP = a(
      "end_gateway", ezx.m, fae.b.h, 1536, false, false, gdx.b.a().a(af).a(gdw.i.d().a(ggi.a, false, false).a(ggi.b, false, false).a()).a(false)
   );
   private static final gdx bQ = a(false);
   private static final gdx bR = a(true);
   public static final gdx.a aW = a("lines", ezx.o, fae.b.a, 1536, gdx.b.a().a(ah).a(new gdw.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdx.a aX = a(
      "line_strip", ezx.o, fae.b.b, 1536, gdx.b.a().a(ah).a(new gdw.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdx.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezx.n, fae.b.d, 1536, gdx.b.a().a(o).a(new gdw.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdx.a bT = a("debug_filled_box", ezx.n, fae.b.f, 1536, false, true, gdx.b.a().a(o).a(aI).a(h).a(false));
   private static final gdx.a bU = a("debug_quads", ezx.n, fae.b.h, 1536, false, true, gdx.b.a().a(o).a(h).a(ay).a(false));
   private static final gdx.a bV = a("debug_section_quads", ezx.n, fae.b.h, 1536, false, true, gdx.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdx.a bW = a("gui", ezx.n, fae.b.h, 786432, gdx.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdx.a bX = a("gui_overlay", ezx.n, fae.b.h, 1536, gdx.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdx.a bY = a("gui_text_highlight", ezx.n, fae.b.h, 1536, gdx.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdx.a bZ = a("gui_ghost_recipe_overlay", ezx.n, fae.b.h, 1536, gdx.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdx> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fae cb;
   private final fae.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdx> cg;

   public static gdx c() {
      return aZ;
   }

   public static gdx d() {
      return ba;
   }

   public static gdx e() {
      return bb;
   }

   private static gdx.b a(gdw.m $$0) {
      return gdx.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdx f() {
      return bc;
   }

   private static gdx.b Q() {
      return gdx.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdx g() {
      return bd;
   }

   private static gdx.a a(String $$0, alf $$1, boolean $$2) {
      gdx.b $$3 = gdx.b.a().a(u).a(new gdw.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezx.k, fae.b.h, 1536, true, false, $$3);
   }

   public static gdx a(alf $$0) {
      return be.apply($$0);
   }

   public static gdx b(alf $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdx c(alf $$0) {
      return bf.apply($$0);
   }

   public static gdx d(alf $$0) {
      return bg.apply($$0);
   }

   public static gdx a(alf $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdx e(alf $$0) {
      return a($$0, true);
   }

   public static gdx b(alf $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdx f(alf $$0) {
      return b($$0, true);
   }

   public static gdx g(alf $$0) {
      return bj.apply($$0);
   }

   public static gdx h(alf $$0) {
      return bk.apply($$0);
   }

   public static gdx c(alf $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdx i(alf $$0) {
      return c($$0, true);
   }

   public static gdx d(alf $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdx j(alf $$0) {
      return d($$0, true);
   }

   public static gdx k(alf $$0) {
      return bn.apply($$0);
   }

   public static gdx e(alf $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdx l(alf $$0) {
      return bp.apply($$0);
   }

   public static gdx m(alf $$0) {
      return bq.apply($$0);
   }

   public static gdx n(alf $$0) {
      return br.apply($$0);
   }

   public static gdx o(alf $$0) {
      return bs.apply($$0);
   }

   public static gdx p(alf $$0) {
      return bt.apply($$0, d);
   }

   public static gdx q(alf $$0) {
      return bm.apply($$0, false);
   }

   public static gdx a(alf $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezx.k,
         fae.b.h,
         1536,
         false,
         true,
         gdx.b.a().a(am).a(new gdw.n($$0, false, false)).a(new gdw.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdx b(alf $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezx.k,
         fae.b.h,
         1536,
         false,
         true,
         gdx.b.a().a(K).a(new gdw.n($$0, false, false)).a(new gdw.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdx h() {
      return bu;
   }

   public static gdx i() {
      return bv;
   }

   public static gdx r(alf $$0) {
      return gdx.a.aY.apply($$0, ay);
   }

   public static gdx j() {
      return bw;
   }

   public static gdx k() {
      return bx;
   }

   public static gdx l() {
      return by;
   }

   public static gdx m() {
      return bz;
   }

   public static gdx n() {
      return bA;
   }

   public static gdx o() {
      return bB;
   }

   public static gdx p() {
      return bC;
   }

   public static gdx s(alf $$0) {
      return bD.apply($$0);
   }

   public static gdx t(alf $$0) {
      return bE.apply($$0);
   }

   public static gdx q() {
      return bF;
   }

   public static gdx u(alf $$0) {
      return bG.apply($$0);
   }

   public static gdx v(alf $$0) {
      return bH.apply($$0);
   }

   public static gdx w(alf $$0) {
      return bI.apply($$0);
   }

   public static gdx x(alf $$0) {
      return bJ.apply($$0);
   }

   public static gdx r() {
      return bK;
   }

   public static gdx y(alf $$0) {
      return bL.apply($$0);
   }

   public static gdx s() {
      return bM;
   }

   private static gdx.b R() {
      return gdx.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdx t() {
      return bN;
   }

   public static gdx u() {
      return bO;
   }

   public static gdx v() {
      return bP;
   }

   private static gdx.a a(boolean $$0) {
      return a("clouds", ezx.v, fae.b.h, 786432, false, false, gdx.b.a().a(ag).a(new gdw.n(gdn.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdx w() {
      return bQ;
   }

   public static gdx x() {
      return bR;
   }

   public static gdx y() {
      return aW;
   }

   public static gdx z() {
      return aX;
   }

   public static gdx a(double $$0) {
      return bS.apply($$0);
   }

   public static gdx A() {
      return bT;
   }

   public static gdx B() {
      return bU;
   }

   public static gdx C() {
      return bV;
   }

   public static gdx D() {
      return bW;
   }

   public static gdx E() {
      return bX;
   }

   public static gdx F() {
      return bY;
   }

   public static gdx G() {
      return bZ;
   }

   public gdx(String $$0, fae $$1, fae.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdx.a a(String $$0, fae $$1, fae.b $$2, int $$3, gdx.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdx.a a(String $$0, fae $$1, fae.b $$2, int $$3, boolean $$4, boolean $$5, gdx.b $$6) {
      return new gdx.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezu $$0, fah $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezu.b $$2 = $$0.d();
         this.a();
         ezv.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdx> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fae J() {
      return this.cb;
   }

   public fae.b K() {
      return this.cc;
   }

   public Optional<gdx> L() {
      return Optional.empty();
   }

   public boolean M() {
      return false;
   }

   public boolean N() {
      return this.ce;
   }

   public boolean O() {
      return !this.cc.l;
   }

   public Optional<gdx> P() {
      return this.cg;
   }

   static final class a extends gdx {
      static final BiFunction<alf, gdw.c, gdx> aY = ac.a(
         ($$0, $$1) -> gdx.a("outline", ezx.r, fae.b.h, 1536, gdx.b.a().a(N).a(new gdw.n($$0, false, false)).a($$1).a(az).a(aK).a(gdx.c.b))
      );
      private final gdx.b aZ;
      private final Optional<gdx> ba;
      private final boolean bb;

      a(String $$0, fae $$1, fae.b $$2, int $$3, boolean $$4, boolean $$5, gdx.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdw::a), () -> $$6.o.forEach(gdw::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdx.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdx.c.b;
      }

      @Override
      public Optional<gdx> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdx.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdw.e a;
      private final gdw.m b;
      private final gdw.p c;
      private final gdw.d d;
      final gdw.c e;
      private final gdw.g f;
      private final gdw.l g;
      private final gdw.f h;
      private final gdw.k i;
      private final gdw.o j;
      private final gdw.q k;
      private final gdw.h l;
      private final gdw.b m;
      final gdx.c n;
      final ImmutableList<gdw> o;

      b(
         gdw.e $$0,
         gdw.m $$1,
         gdw.p $$2,
         gdw.d $$3,
         gdw.c $$4,
         gdw.g $$5,
         gdw.l $$6,
         gdw.f $$7,
         gdw.k $$8,
         gdw.o $$9,
         gdw.q $$10,
         gdw.h $$11,
         gdw.b $$12,
         gdx.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdw[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdx.b.a a() {
         return new gdx.b.a();
      }

      public static class a {
         private gdw.e a = gdw.ap;
         private gdw.m b = gdw.i;
         private gdw.p c;
         private gdw.d d;
         private gdw.c e;
         private gdw.g f;
         private gdw.l g;
         private gdw.f h;
         private gdw.k i;
         private gdw.o j;
         private gdw.q k;
         private gdw.h l;
         private gdw.b m;

         a() {
            this.c = gdw.c;
            this.d = gdw.aB;
            this.e = gdw.ax;
            this.f = gdw.au;
            this.g = gdw.aw;
            this.h = gdw.aG;
            this.i = gdw.aJ;
            this.j = gdw.aq;
            this.k = gdw.aD;
            this.l = gdw.aQ;
            this.m = gdw.aR;
         }

         public gdx.b.a a(gdw.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdx.b.a a(gdw.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdx.b.a a(gdw.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdx.b.a a(gdw.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdx.b.a a(gdw.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdx.b.a a(gdw.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdx.b.a a(gdw.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdx.b.a a(gdw.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdx.b.a a(gdw.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdx.b.a a(gdw.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdx.b.a a(gdw.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdx.b.a a(gdw.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdx.b.a a(gdw.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdx.b a(boolean $$0) {
            return this.a($$0 ? gdx.c.c : gdx.c.a);
         }

         public gdx.b a(gdx.c $$0) {
            return new gdx.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
