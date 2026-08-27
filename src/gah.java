import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gah extends gag {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gah aZ = a("solid", ewg.j, ewn.b.h, 4194304, true, false, gah.b.a().a(at).a(p).a(an).a(true));
   private static final gah ba = a("cutout_mipped", ewg.j, ewn.b.h, 4194304, true, false, gah.b.a().a(at).a(q).a(an).a(true));
   private static final gah bb = a("cutout", ewg.j, ewn.b.h, 786432, true, false, gah.b.a().a(at).a(r).a(ao).a(true));
   private static final gah bc = a("translucent", ewg.j, ewn.b.h, 786432, true, true, a(s));
   private static final gah bd = a("translucent_moving_block", ewg.j, ewn.b.h, 786432, false, true, Q());
   private static final Function<ajt, gah> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ajt, gah> bf = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(v).a(new gag.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ewg.k, ewn.b.h, 1536, true, false, $$1);
   });
   private static final Function<ajt, gah> bg = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(w).a(new gag.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ewg.k, ewn.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ajt, Boolean, gah> bh = ac.a(($$0, $$1) -> {
      gah.b $$2 = gah.b.a().a(x).a(new gag.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ewg.k, ewn.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ajt, Boolean, gah> bi = ac.a(($$0, $$1) -> {
      gah.b $$2 = gah.b.a().a(y).a(new gag.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ewg.k, ewn.b.h, 1536, true, false, $$2);
   });
   private static final Function<ajt, gah> bj = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(z).a(new gag.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gag.aD).a(true);
      return a("item_entity_translucent_cull", ewg.k, ewn.b.h, 1536, true, true, $$1);
   });
   private static final Function<ajt, gah> bk = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(A).a(new gag.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ewg.k, ewn.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ajt, Boolean, gah> bl = ac.a(($$0, $$1) -> {
      gah.b $$2 = gah.b.a().a(B).a(new gag.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ewg.k, ewn.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ajt, Boolean, gah> bm = ac.a(($$0, $$1) -> {
      gah.b $$2 = gah.b.a().a(C).a(new gag.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ewg.k, ewn.b.h, 1536, true, true, $$2);
   });
   private static final Function<ajt, gah> bn = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(D).a(new gag.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ewg.k, ewn.b.h, 1536, $$1);
   });
   private static final BiFunction<ajt, Boolean, gah> bo = ac.a(($$0, $$1) -> {
      gah.b $$2 = gah.b.a().a(E).a(new gag.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ewg.j, ewn.b.h, 1536, false, true, $$2);
   });
   private static final Function<ajt, gah> bp = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(F).a(new gag.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ewg.k, ewn.b.h, 1536, $$1);
   });
   private static final Function<ajt, gah> bq = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(G).a(new gag.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ewg.k, ewn.b.h, 1536, false, true, $$1);
   });
   private static final Function<ajt, gah> br = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(H).a(new gag.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ewg.k, ewn.b.h, 1536, false, false, $$1);
   });
   private static final Function<ajt, gah> bs = ac.b($$0 -> {
      gah.b $$1 = gah.b.a().a(I).a(new gag.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ewg.k, ewn.b.h, 1536, $$1);
   });
   private static final BiFunction<ajt, gag.p, gah> bt = ac.a(($$0, $$1) -> {
      gag.n $$2 = new gag.n($$0, false, false);
      return a("eyes", ewg.k, ewn.b.h, 1536, false, true, gah.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gah bu = a("leash", ewg.p, ewn.b.f, 1536, gah.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gah bv = a("water_mask", ewg.m, ewn.b.h, 1536, gah.b.a().a(M).a(ap).a(aF).a(false));
   private static final gah bw = a(
      "armor_glint", ewg.q, ewn.b.h, 1536, gah.b.a().a(O).a(new gag.n(ggg.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gah bx = a(
      "armor_entity_glint", ewg.q, ewn.b.h, 1536, gah.b.a().a(P).a(new gag.n(ggg.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gah by = a(
      "glint_translucent", ewg.q, ewn.b.h, 1536, gah.b.a().a(Q).a(new gag.n(ggg.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gah bz = a("glint", ewg.q, ewn.b.h, 1536, gah.b.a().a(R).a(new gag.n(ggg.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gah bA = a("glint_direct", ewg.q, ewn.b.h, 1536, gah.b.a().a(S).a(new gag.n(ggg.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gah bB = a(
      "entity_glint", ewg.q, ewn.b.h, 1536, gah.b.a().a(T).a(new gag.n(ggg.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gah bC = a(
      "entity_glint_direct", ewg.q, ewn.b.h, 1536, gah.b.a().a(U).a(new gag.n(ggg.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ajt, gah> bD = ac.b($$0 -> {
      gag.n $$1 = new gag.n($$0, false, false);
      return a("crumbling", ewg.j, ewn.b.h, 1536, false, true, gah.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ajt, gah> bE = ac.b(
      $$0 -> a("text", ewg.t, ewn.b.h, 786432, false, true, gah.b.a().a(W).a(new gag.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gah bF = a("text_background", ewg.p, ewn.b.h, 1536, false, true, gah.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ajt, gah> bG = ac.b(
      $$0 -> a("text_intensity", ewg.t, ewn.b.h, 786432, false, true, gah.b.a().a(Y).a(new gag.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ajt, gah> bH = ac.b(
      $$0 -> a("text_polygon_offset", ewg.t, ewn.b.h, 1536, false, true, gah.b.a().a(W).a(new gag.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajt, gah> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ewg.t, ewn.b.h, 1536, false, true, gah.b.a().a(Y).a(new gag.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajt, gah> bJ = ac.b(
      $$0 -> a("text_see_through", ewg.t, ewn.b.h, 1536, false, true, gah.b.a().a(Z).a(new gag.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gah bK = a("text_background_see_through", ewg.p, ewn.b.h, 1536, false, true, gah.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ajt, gah> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ewg.t, ewn.b.h, 1536, false, true, gah.b.a().a(ab).a(new gag.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gah bM = a("lightning", ewg.n, ewn.b.h, 1536, false, true, gah.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gah bN = a("tripwire", ewg.j, ewn.b.h, 1536, true, true, R());
   private static final gah bO = a(
      "end_portal", ewg.m, ewn.b.h, 1536, false, false, gah.b.a().a(ae).a(gag.i.d().a(gcs.a, false, false).a(gcs.b, false, false).a()).a(false)
   );
   private static final gah bP = a(
      "end_gateway", ewg.m, ewn.b.h, 1536, false, false, gah.b.a().a(af).a(gag.i.d().a(gcs.a, false, false).a(gcs.b, false, false).a()).a(false)
   );
   private static final gah bQ = a(false);
   private static final gah bR = a(true);
   public static final gah.a aW = a("lines", ewg.o, ewn.b.a, 1536, gah.b.a().a(ah).a(new gag.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gah.a aX = a(
      "line_strip", ewg.o, ewn.b.b, 1536, gah.b.a().a(ah).a(new gag.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gah.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ewg.n, ewn.b.d, 1536, gah.b.a().a(o).a(new gag.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gah.a bT = a("debug_filled_box", ewg.n, ewn.b.f, 1536, false, true, gah.b.a().a(o).a(aI).a(h).a(false));
   private static final gah.a bU = a("debug_quads", ewg.n, ewn.b.h, 1536, false, true, gah.b.a().a(o).a(h).a(ay).a(false));
   private static final gah.a bV = a("debug_section_quads", ewg.n, ewn.b.h, 1536, false, true, gah.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gah.a bW = a("gui", ewg.n, ewn.b.h, 786432, gah.b.a().a(ai).a(h).a(aB).a(false));
   private static final gah.a bX = a("gui_overlay", ewg.n, ewn.b.h, 1536, gah.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gah.a bY = a("gui_text_highlight", ewg.n, ewn.b.h, 1536, gah.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gah.a bZ = a("gui_ghost_recipe_overlay", ewg.n, ewn.b.h, 1536, gah.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gah> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final ewn cb;
   private final ewn.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gah> cg;

   public static gah c() {
      return aZ;
   }

   public static gah d() {
      return ba;
   }

   public static gah e() {
      return bb;
   }

   private static gah.b a(gag.m $$0) {
      return gah.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gah f() {
      return bc;
   }

   private static gah.b Q() {
      return gah.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gah g() {
      return bd;
   }

   private static gah.a a(String $$0, ajt $$1, boolean $$2) {
      gah.b $$3 = gah.b.a().a(u).a(new gag.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ewg.k, ewn.b.h, 1536, true, false, $$3);
   }

   public static gah a(ajt $$0) {
      return be.apply($$0);
   }

   public static gah b(ajt $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gah c(ajt $$0) {
      return bf.apply($$0);
   }

   public static gah d(ajt $$0) {
      return bg.apply($$0);
   }

   public static gah a(ajt $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gah e(ajt $$0) {
      return a($$0, true);
   }

   public static gah b(ajt $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gah f(ajt $$0) {
      return b($$0, true);
   }

   public static gah g(ajt $$0) {
      return bj.apply($$0);
   }

   public static gah h(ajt $$0) {
      return bk.apply($$0);
   }

   public static gah c(ajt $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gah i(ajt $$0) {
      return c($$0, true);
   }

   public static gah d(ajt $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gah j(ajt $$0) {
      return d($$0, true);
   }

   public static gah k(ajt $$0) {
      return bn.apply($$0);
   }

   public static gah e(ajt $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gah l(ajt $$0) {
      return bp.apply($$0);
   }

   public static gah m(ajt $$0) {
      return bq.apply($$0);
   }

   public static gah n(ajt $$0) {
      return br.apply($$0);
   }

   public static gah o(ajt $$0) {
      return bs.apply($$0);
   }

   public static gah p(ajt $$0) {
      return bt.apply($$0, d);
   }

   public static gah q(ajt $$0) {
      return bm.apply($$0, false);
   }

   public static gah a(ajt $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ewg.k,
         ewn.b.h,
         1536,
         false,
         true,
         gah.b.a().a(am).a(new gag.n($$0, false, false)).a(new gag.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gah b(ajt $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ewg.k,
         ewn.b.h,
         1536,
         false,
         true,
         gah.b.a().a(K).a(new gag.n($$0, false, false)).a(new gag.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gah h() {
      return bu;
   }

   public static gah i() {
      return bv;
   }

   public static gah r(ajt $$0) {
      return gah.a.aY.apply($$0, ay);
   }

   public static gah j() {
      return bw;
   }

   public static gah k() {
      return bx;
   }

   public static gah l() {
      return by;
   }

   public static gah m() {
      return bz;
   }

   public static gah n() {
      return bA;
   }

   public static gah o() {
      return bB;
   }

   public static gah p() {
      return bC;
   }

   public static gah s(ajt $$0) {
      return bD.apply($$0);
   }

   public static gah t(ajt $$0) {
      return bE.apply($$0);
   }

   public static gah q() {
      return bF;
   }

   public static gah u(ajt $$0) {
      return bG.apply($$0);
   }

   public static gah v(ajt $$0) {
      return bH.apply($$0);
   }

   public static gah w(ajt $$0) {
      return bI.apply($$0);
   }

   public static gah x(ajt $$0) {
      return bJ.apply($$0);
   }

   public static gah r() {
      return bK;
   }

   public static gah y(ajt $$0) {
      return bL.apply($$0);
   }

   public static gah s() {
      return bM;
   }

   private static gah.b R() {
      return gah.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gah t() {
      return bN;
   }

   public static gah u() {
      return bO;
   }

   public static gah v() {
      return bP;
   }

   private static gah.a a(boolean $$0) {
      return a("clouds", ewg.v, ewn.b.h, 786432, false, false, gah.b.a().a(ag).a(new gag.n(fzx.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gah w() {
      return bQ;
   }

   public static gah x() {
      return bR;
   }

   public static gah y() {
      return aW;
   }

   public static gah z() {
      return aX;
   }

   public static gah a(double $$0) {
      return bS.apply($$0);
   }

   public static gah A() {
      return bT;
   }

   public static gah B() {
      return bU;
   }

   public static gah C() {
      return bV;
   }

   public static gah D() {
      return bW;
   }

   public static gah E() {
      return bX;
   }

   public static gah F() {
      return bY;
   }

   public static gah G() {
      return bZ;
   }

   public gah(String $$0, ewn $$1, ewn.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gah.a a(String $$0, ewn $$1, ewn.b $$2, int $$3, gah.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gah.a a(String $$0, ewn $$1, ewn.b $$2, int $$3, boolean $$4, boolean $$5, gah.b $$6) {
      return new gah.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ewd $$0, ewq $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ewd.b $$2 = $$0.d();
         this.a();
         ewe.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gah> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public ewn J() {
      return this.cb;
   }

   public ewn.b K() {
      return this.cc;
   }

   public Optional<gah> L() {
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

   public Optional<gah> P() {
      return this.cg;
   }

   static final class a extends gah {
      static final BiFunction<ajt, gag.c, gah> aY = ac.a(
         ($$0, $$1) -> gah.a("outline", ewg.r, ewn.b.h, 1536, gah.b.a().a(N).a(new gag.n($$0, false, false)).a($$1).a(az).a(aK).a(gah.c.b))
      );
      private final gah.b aZ;
      private final Optional<gah> ba;
      private final boolean bb;

      a(String $$0, ewn $$1, ewn.b $$2, int $$3, boolean $$4, boolean $$5, gah.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gag::a), () -> $$6.o.forEach(gag::b));
         this.aZ = $$6;
         this.ba = $$6.n == gah.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gah.c.b;
      }

      @Override
      public Optional<gah> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gah.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gag.e a;
      private final gag.m b;
      private final gag.p c;
      private final gag.d d;
      final gag.c e;
      private final gag.g f;
      private final gag.l g;
      private final gag.f h;
      private final gag.k i;
      private final gag.o j;
      private final gag.q k;
      private final gag.h l;
      private final gag.b m;
      final gah.c n;
      final ImmutableList<gag> o;

      b(
         gag.e $$0,
         gag.m $$1,
         gag.p $$2,
         gag.d $$3,
         gag.c $$4,
         gag.g $$5,
         gag.l $$6,
         gag.f $$7,
         gag.k $$8,
         gag.o $$9,
         gag.q $$10,
         gag.h $$11,
         gag.b $$12,
         gah.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gag[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gah.b.a a() {
         return new gah.b.a();
      }

      public static class a {
         private gag.e a = gag.ap;
         private gag.m b = gag.i;
         private gag.p c;
         private gag.d d;
         private gag.c e;
         private gag.g f;
         private gag.l g;
         private gag.f h;
         private gag.k i;
         private gag.o j;
         private gag.q k;
         private gag.h l;
         private gag.b m;

         a() {
            this.c = gag.c;
            this.d = gag.aB;
            this.e = gag.ax;
            this.f = gag.au;
            this.g = gag.aw;
            this.h = gag.aG;
            this.i = gag.aJ;
            this.j = gag.aq;
            this.k = gag.aD;
            this.l = gag.aQ;
            this.m = gag.aR;
         }

         public gah.b.a a(gag.e $$0) {
            this.a = $$0;
            return this;
         }

         public gah.b.a a(gag.m $$0) {
            this.b = $$0;
            return this;
         }

         public gah.b.a a(gag.p $$0) {
            this.c = $$0;
            return this;
         }

         public gah.b.a a(gag.d $$0) {
            this.d = $$0;
            return this;
         }

         public gah.b.a a(gag.c $$0) {
            this.e = $$0;
            return this;
         }

         public gah.b.a a(gag.g $$0) {
            this.f = $$0;
            return this;
         }

         public gah.b.a a(gag.l $$0) {
            this.g = $$0;
            return this;
         }

         public gah.b.a a(gag.f $$0) {
            this.h = $$0;
            return this;
         }

         public gah.b.a a(gag.k $$0) {
            this.i = $$0;
            return this;
         }

         public gah.b.a a(gag.o $$0) {
            this.j = $$0;
            return this;
         }

         public gah.b.a a(gag.q $$0) {
            this.k = $$0;
            return this;
         }

         public gah.b.a a(gag.h $$0) {
            this.l = $$0;
            return this;
         }

         public gah.b.a a(gag.b $$0) {
            this.m = $$0;
            return this;
         }

         public gah.b a(boolean $$0) {
            return this.a($$0 ? gah.c.c : gah.c.a);
         }

         public gah.b a(gah.c $$0) {
            return new gah.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
         }
      }
   }

   static enum c {
      a("none"),
      b("is_outline"),
      c("affects_outline");

      private final String d;

      private c(String $$0) {
         this.d = $$0;
      }

      @Override
      public String toString() {
         return this.d;
      }
   }
}
