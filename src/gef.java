import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gef extends gee {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gef aZ = a("solid", fae.j, fal.b.h, 4194304, true, false, gef.b.a().a(at).a(p).a(an).a(true));
   private static final gef ba = a("cutout_mipped", fae.j, fal.b.h, 4194304, true, false, gef.b.a().a(at).a(q).a(an).a(true));
   private static final gef bb = a("cutout", fae.j, fal.b.h, 786432, true, false, gef.b.a().a(at).a(r).a(ao).a(true));
   private static final gef bc = a("translucent", fae.j, fal.b.h, 786432, true, true, a(s));
   private static final gef bd = a("translucent_moving_block", fae.j, fal.b.h, 786432, false, true, Q());
   private static final Function<akk, gef> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akk, gef> bf = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(v).a(new gee.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fae.k, fal.b.h, 1536, true, false, $$1);
   });
   private static final Function<akk, gef> bg = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(w).a(new gee.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fae.k, fal.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akk, Boolean, gef> bh = ac.a(($$0, $$1) -> {
      gef.b $$2 = gef.b.a().a(x).a(new gee.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fae.k, fal.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akk, Boolean, gef> bi = ac.a(($$0, $$1) -> {
      gef.b $$2 = gef.b.a().a(y).a(new gee.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fae.k, fal.b.h, 1536, true, false, $$2);
   });
   private static final Function<akk, gef> bj = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(z).a(new gee.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gee.aD).a(true);
      return a("item_entity_translucent_cull", fae.k, fal.b.h, 1536, true, true, $$1);
   });
   private static final Function<akk, gef> bk = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(A).a(new gee.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", fae.k, fal.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akk, Boolean, gef> bl = ac.a(($$0, $$1) -> {
      gef.b $$2 = gef.b.a().a(B).a(new gee.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fae.k, fal.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akk, Boolean, gef> bm = ac.a(($$0, $$1) -> {
      gef.b $$2 = gef.b.a().a(C).a(new gee.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fae.k, fal.b.h, 1536, true, true, $$2);
   });
   private static final Function<akk, gef> bn = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(D).a(new gee.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fae.k, fal.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, Boolean, gef> bo = ac.a(($$0, $$1) -> {
      gef.b $$2 = gef.b.a().a(E).a(new gee.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fae.j, fal.b.h, 1536, false, true, $$2);
   });
   private static final Function<akk, gef> bp = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(F).a(new gee.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fae.k, fal.b.h, 1536, $$1);
   });
   private static final Function<akk, gef> bq = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(G).a(new gee.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fae.k, fal.b.h, 1536, false, true, $$1);
   });
   private static final Function<akk, gef> br = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(H).a(new gee.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fae.k, fal.b.h, 1536, false, false, $$1);
   });
   private static final Function<akk, gef> bs = ac.b($$0 -> {
      gef.b $$1 = gef.b.a().a(I).a(new gee.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", fae.k, fal.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, gee.p, gef> bt = ac.a(($$0, $$1) -> {
      gee.n $$2 = new gee.n($$0, false, false);
      return a("eyes", fae.k, fal.b.h, 1536, false, true, gef.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gef bu = a("leash", fae.p, fal.b.f, 1536, gef.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gef bv = a("water_mask", fae.m, fal.b.h, 1536, gef.b.a().a(M).a(ap).a(aF).a(false));
   private static final gef bw = a(
      "armor_glint", fae.q, fal.b.h, 1536, gef.b.a().a(O).a(new gee.n(gke.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gef bx = a(
      "armor_entity_glint", fae.q, fal.b.h, 1536, gef.b.a().a(P).a(new gee.n(gke.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gef by = a(
      "glint_translucent", fae.q, fal.b.h, 1536, gef.b.a().a(Q).a(new gee.n(gke.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gef bz = a("glint", fae.q, fal.b.h, 1536, gef.b.a().a(R).a(new gee.n(gke.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gef bA = a("glint_direct", fae.q, fal.b.h, 1536, gef.b.a().a(S).a(new gee.n(gke.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gef bB = a(
      "entity_glint", fae.q, fal.b.h, 1536, gef.b.a().a(T).a(new gee.n(gke.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gef bC = a(
      "entity_glint_direct", fae.q, fal.b.h, 1536, gef.b.a().a(U).a(new gee.n(gke.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akk, gef> bD = ac.b($$0 -> {
      gee.n $$1 = new gee.n($$0, false, false);
      return a("crumbling", fae.j, fal.b.h, 1536, false, true, gef.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akk, gef> bE = ac.b(
      $$0 -> a("text", fae.t, fal.b.h, 786432, false, true, gef.b.a().a(W).a(new gee.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gef bF = a("text_background", fae.p, fal.b.h, 1536, false, true, gef.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akk, gef> bG = ac.b(
      $$0 -> a("text_intensity", fae.t, fal.b.h, 786432, false, true, gef.b.a().a(Y).a(new gee.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akk, gef> bH = ac.b(
      $$0 -> a("text_polygon_offset", fae.t, fal.b.h, 1536, false, true, gef.b.a().a(W).a(new gee.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gef> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", fae.t, fal.b.h, 1536, false, true, gef.b.a().a(Y).a(new gee.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gef> bJ = ac.b(
      $$0 -> a("text_see_through", fae.t, fal.b.h, 1536, false, true, gef.b.a().a(Z).a(new gee.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gef bK = a("text_background_see_through", fae.p, fal.b.h, 1536, false, true, gef.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akk, gef> bL = ac.b(
      $$0 -> a("text_intensity_see_through", fae.t, fal.b.h, 1536, false, true, gef.b.a().a(ab).a(new gee.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gef bM = a("lightning", fae.n, fal.b.h, 1536, false, true, gef.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gef bN = a("tripwire", fae.j, fal.b.h, 1536, true, true, R());
   private static final gef bO = a(
      "end_portal", fae.m, fal.b.h, 1536, false, false, gef.b.a().a(ae).a(gee.i.d().a(ggq.a, false, false).a(ggq.b, false, false).a()).a(false)
   );
   private static final gef bP = a(
      "end_gateway", fae.m, fal.b.h, 1536, false, false, gef.b.a().a(af).a(gee.i.d().a(ggq.a, false, false).a(ggq.b, false, false).a()).a(false)
   );
   private static final gef bQ = a(false);
   private static final gef bR = a(true);
   public static final gef.a aW = a("lines", fae.o, fal.b.a, 1536, gef.b.a().a(ah).a(new gee.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gef.a aX = a(
      "line_strip", fae.o, fal.b.b, 1536, gef.b.a().a(ah).a(new gee.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gef.a> bS = ac.b(
      $$0 -> a("debug_line_strip", fae.n, fal.b.d, 1536, gef.b.a().a(o).a(new gee.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gef.a bT = a("debug_filled_box", fae.n, fal.b.f, 1536, false, true, gef.b.a().a(o).a(aI).a(h).a(false));
   private static final gef.a bU = a("debug_quads", fae.n, fal.b.h, 1536, false, true, gef.b.a().a(o).a(h).a(ay).a(false));
   private static final gef.a bV = a("debug_section_quads", fae.n, fal.b.h, 1536, false, true, gef.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gef.a bW = a("gui", fae.n, fal.b.h, 786432, gef.b.a().a(ai).a(h).a(aB).a(false));
   private static final gef.a bX = a("gui_overlay", fae.n, fal.b.h, 1536, gef.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gef.a bY = a("gui_text_highlight", fae.n, fal.b.h, 1536, gef.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gef.a bZ = a("gui_ghost_recipe_overlay", fae.n, fal.b.h, 1536, gef.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gef> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fal cb;
   private final fal.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gef> cg;

   public static gef c() {
      return aZ;
   }

   public static gef d() {
      return ba;
   }

   public static gef e() {
      return bb;
   }

   private static gef.b a(gee.m $$0) {
      return gef.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gef f() {
      return bc;
   }

   private static gef.b Q() {
      return gef.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gef g() {
      return bd;
   }

   private static gef.a a(String $$0, akk $$1, boolean $$2) {
      gef.b $$3 = gef.b.a().a(u).a(new gee.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fae.k, fal.b.h, 1536, true, false, $$3);
   }

   public static gef a(akk $$0) {
      return be.apply($$0);
   }

   public static gef b(akk $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gef c(akk $$0) {
      return bf.apply($$0);
   }

   public static gef d(akk $$0) {
      return bg.apply($$0);
   }

   public static gef a(akk $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gef e(akk $$0) {
      return a($$0, true);
   }

   public static gef b(akk $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gef f(akk $$0) {
      return b($$0, true);
   }

   public static gef g(akk $$0) {
      return bj.apply($$0);
   }

   public static gef h(akk $$0) {
      return bk.apply($$0);
   }

   public static gef c(akk $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gef i(akk $$0) {
      return c($$0, true);
   }

   public static gef d(akk $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gef j(akk $$0) {
      return d($$0, true);
   }

   public static gef k(akk $$0) {
      return bn.apply($$0);
   }

   public static gef e(akk $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gef l(akk $$0) {
      return bp.apply($$0);
   }

   public static gef m(akk $$0) {
      return bq.apply($$0);
   }

   public static gef n(akk $$0) {
      return br.apply($$0);
   }

   public static gef o(akk $$0) {
      return bs.apply($$0);
   }

   public static gef p(akk $$0) {
      return bt.apply($$0, d);
   }

   public static gef q(akk $$0) {
      return bm.apply($$0, false);
   }

   public static gef a(akk $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fae.k,
         fal.b.h,
         1536,
         false,
         true,
         gef.b.a().a(am).a(new gee.n($$0, false, false)).a(new gee.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gef b(akk $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fae.k,
         fal.b.h,
         1536,
         false,
         true,
         gef.b.a().a(K).a(new gee.n($$0, false, false)).a(new gee.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gef h() {
      return bu;
   }

   public static gef i() {
      return bv;
   }

   public static gef r(akk $$0) {
      return gef.a.aY.apply($$0, ay);
   }

   public static gef j() {
      return bw;
   }

   public static gef k() {
      return bx;
   }

   public static gef l() {
      return by;
   }

   public static gef m() {
      return bz;
   }

   public static gef n() {
      return bA;
   }

   public static gef o() {
      return bB;
   }

   public static gef p() {
      return bC;
   }

   public static gef s(akk $$0) {
      return bD.apply($$0);
   }

   public static gef t(akk $$0) {
      return bE.apply($$0);
   }

   public static gef q() {
      return bF;
   }

   public static gef u(akk $$0) {
      return bG.apply($$0);
   }

   public static gef v(akk $$0) {
      return bH.apply($$0);
   }

   public static gef w(akk $$0) {
      return bI.apply($$0);
   }

   public static gef x(akk $$0) {
      return bJ.apply($$0);
   }

   public static gef r() {
      return bK;
   }

   public static gef y(akk $$0) {
      return bL.apply($$0);
   }

   public static gef s() {
      return bM;
   }

   private static gef.b R() {
      return gef.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gef t() {
      return bN;
   }

   public static gef u() {
      return bO;
   }

   public static gef v() {
      return bP;
   }

   private static gef.a a(boolean $$0) {
      return a("clouds", fae.v, fal.b.h, 786432, false, false, gef.b.a().a(ag).a(new gee.n(gdv.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gef w() {
      return bQ;
   }

   public static gef x() {
      return bR;
   }

   public static gef y() {
      return aW;
   }

   public static gef z() {
      return aX;
   }

   public static gef a(double $$0) {
      return bS.apply($$0);
   }

   public static gef A() {
      return bT;
   }

   public static gef B() {
      return bU;
   }

   public static gef C() {
      return bV;
   }

   public static gef D() {
      return bW;
   }

   public static gef E() {
      return bX;
   }

   public static gef F() {
      return bY;
   }

   public static gef G() {
      return bZ;
   }

   public gef(String $$0, fal $$1, fal.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gef.a a(String $$0, fal $$1, fal.b $$2, int $$3, gef.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gef.a a(String $$0, fal $$1, fal.b $$2, int $$3, boolean $$4, boolean $$5, gef.b $$6) {
      return new gef.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fab $$0, fao $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         fab.b $$2 = $$0.d();
         this.a();
         fac.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gef> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fal J() {
      return this.cb;
   }

   public fal.b K() {
      return this.cc;
   }

   public Optional<gef> L() {
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

   public Optional<gef> P() {
      return this.cg;
   }

   static final class a extends gef {
      static final BiFunction<akk, gee.c, gef> aY = ac.a(
         ($$0, $$1) -> gef.a("outline", fae.r, fal.b.h, 1536, gef.b.a().a(N).a(new gee.n($$0, false, false)).a($$1).a(az).a(aK).a(gef.c.b))
      );
      private final gef.b aZ;
      private final Optional<gef> ba;
      private final boolean bb;

      a(String $$0, fal $$1, fal.b $$2, int $$3, boolean $$4, boolean $$5, gef.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gee::a), () -> $$6.o.forEach(gee::b));
         this.aZ = $$6;
         this.ba = $$6.n == gef.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gef.c.b;
      }

      @Override
      public Optional<gef> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gef.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gee.e a;
      private final gee.m b;
      private final gee.p c;
      private final gee.d d;
      final gee.c e;
      private final gee.g f;
      private final gee.l g;
      private final gee.f h;
      private final gee.k i;
      private final gee.o j;
      private final gee.q k;
      private final gee.h l;
      private final gee.b m;
      final gef.c n;
      final ImmutableList<gee> o;

      b(
         gee.e $$0,
         gee.m $$1,
         gee.p $$2,
         gee.d $$3,
         gee.c $$4,
         gee.g $$5,
         gee.l $$6,
         gee.f $$7,
         gee.k $$8,
         gee.o $$9,
         gee.q $$10,
         gee.h $$11,
         gee.b $$12,
         gef.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gee[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gef.b.a a() {
         return new gef.b.a();
      }

      public static class a {
         private gee.e a = gee.ap;
         private gee.m b = gee.i;
         private gee.p c;
         private gee.d d;
         private gee.c e;
         private gee.g f;
         private gee.l g;
         private gee.f h;
         private gee.k i;
         private gee.o j;
         private gee.q k;
         private gee.h l;
         private gee.b m;

         a() {
            this.c = gee.c;
            this.d = gee.aB;
            this.e = gee.ax;
            this.f = gee.au;
            this.g = gee.aw;
            this.h = gee.aG;
            this.i = gee.aJ;
            this.j = gee.aq;
            this.k = gee.aD;
            this.l = gee.aQ;
            this.m = gee.aR;
         }

         public gef.b.a a(gee.e $$0) {
            this.a = $$0;
            return this;
         }

         public gef.b.a a(gee.m $$0) {
            this.b = $$0;
            return this;
         }

         public gef.b.a a(gee.p $$0) {
            this.c = $$0;
            return this;
         }

         public gef.b.a a(gee.d $$0) {
            this.d = $$0;
            return this;
         }

         public gef.b.a a(gee.c $$0) {
            this.e = $$0;
            return this;
         }

         public gef.b.a a(gee.g $$0) {
            this.f = $$0;
            return this;
         }

         public gef.b.a a(gee.l $$0) {
            this.g = $$0;
            return this;
         }

         public gef.b.a a(gee.f $$0) {
            this.h = $$0;
            return this;
         }

         public gef.b.a a(gee.k $$0) {
            this.i = $$0;
            return this;
         }

         public gef.b.a a(gee.o $$0) {
            this.j = $$0;
            return this;
         }

         public gef.b.a a(gee.q $$0) {
            this.k = $$0;
            return this;
         }

         public gef.b.a a(gee.h $$0) {
            this.l = $$0;
            return this;
         }

         public gef.b.a a(gee.b $$0) {
            this.m = $$0;
            return this;
         }

         public gef.b a(boolean $$0) {
            return this.a($$0 ? gef.c.c : gef.c.a);
         }

         public gef.b a(gef.c $$0) {
            return new gef.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
