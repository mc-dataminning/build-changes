import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gfo extends gfn {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gfo aZ = a("solid", fba.j, fbh.b.h, 4194304, true, false, gfo.b.a().a(at).a(p).a(an).a(true));
   private static final gfo ba = a("cutout_mipped", fba.j, fbh.b.h, 4194304, true, false, gfo.b.a().a(at).a(q).a(an).a(true));
   private static final gfo bb = a("cutout", fba.j, fbh.b.h, 786432, true, false, gfo.b.a().a(at).a(r).a(ao).a(true));
   private static final gfo bc = a("translucent", fba.j, fbh.b.h, 786432, true, true, a(s));
   private static final gfo bd = a("translucent_moving_block", fba.j, fbh.b.h, 786432, false, true, R());
   private static final Function<akt, gfo> be = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akt, gfo> bf = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(v).a(new gfn.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fba.k, fbh.b.h, 1536, true, false, $$1);
   });
   private static final Function<akt, gfo> bg = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(w).a(new gfn.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fba.k, fbh.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akt, Boolean, gfo> bh = ad.a(($$0, $$1) -> {
      gfo.b $$2 = gfo.b.a().a(x).a(new gfn.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fba.k, fbh.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akt, Boolean, gfo> bi = ad.a(($$0, $$1) -> {
      gfo.b $$2 = gfo.b.a().a(y).a(new gfn.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fba.k, fbh.b.h, 1536, true, false, $$2);
   });
   private static final Function<akt, gfo> bj = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(z).a(new gfn.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gfn.aD).a(true);
      return a("item_entity_translucent_cull", fba.k, fbh.b.h, 1536, true, true, $$1);
   });
   private static final Function<akt, gfo> bk = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(A).a(new gfn.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", fba.k, fbh.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akt, Boolean, gfo> bl = ad.a(($$0, $$1) -> {
      gfo.b $$2 = gfo.b.a().a(B).a(new gfn.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fba.k, fbh.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akt, Boolean, gfo> bm = ad.a(($$0, $$1) -> {
      gfo.b $$2 = gfo.b.a().a(C).a(new gfn.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fba.k, fbh.b.h, 1536, true, true, $$2);
   });
   private static final Function<akt, gfo> bn = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(D).a(new gfn.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fba.k, fbh.b.h, 1536, $$1);
   });
   private static final BiFunction<akt, Boolean, gfo> bo = ad.a(($$0, $$1) -> {
      gfo.b $$2 = gfo.b.a().a(E).a(new gfn.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fba.j, fbh.b.h, 1536, false, true, $$2);
   });
   private static final Function<akt, gfo> bp = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(F).a(new gfn.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fba.k, fbh.b.h, 1536, $$1);
   });
   private static final Function<akt, gfo> bq = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(G).a(new gfn.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fba.k, fbh.b.h, 1536, false, true, $$1);
   });
   private static final Function<akt, gfo> br = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(H).a(new gfn.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fba.k, fbh.b.h, 1536, false, false, $$1);
   });
   private static final Function<akt, gfo> bs = ad.b($$0 -> {
      gfo.b $$1 = gfo.b.a().a(I).a(new gfn.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", fba.k, fbh.b.h, 1536, $$1);
   });
   private static final BiFunction<akt, gfn.p, gfo> bt = ad.a(($$0, $$1) -> {
      gfn.n $$2 = new gfn.n($$0, false, false);
      return a("eyes", fba.k, fbh.b.h, 1536, false, true, gfo.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gfo bu = a("leash", fba.p, fbh.b.f, 1536, gfo.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gfo bv = a("water_mask", fba.m, fbh.b.h, 1536, gfo.b.a().a(M).a(ap).a(aF).a(false));
   private static final gfo bw = a(
      "armor_glint", fba.q, fbh.b.h, 1536, gfo.b.a().a(O).a(new gfn.n(glp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gfo bx = a(
      "armor_entity_glint", fba.q, fbh.b.h, 1536, gfo.b.a().a(P).a(new gfn.n(glp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gfo by = a(
      "glint_translucent", fba.q, fbh.b.h, 1536, gfo.b.a().a(Q).a(new gfn.n(glp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gfo bz = a("glint", fba.q, fbh.b.h, 1536, gfo.b.a().a(R).a(new gfn.n(glp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gfo bA = a("glint_direct", fba.q, fbh.b.h, 1536, gfo.b.a().a(S).a(new gfn.n(glp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gfo bB = a(
      "entity_glint", fba.q, fbh.b.h, 1536, gfo.b.a().a(T).a(new gfn.n(glp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gfo bC = a(
      "entity_glint_direct", fba.q, fbh.b.h, 1536, gfo.b.a().a(U).a(new gfn.n(glp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akt, gfo> bD = ad.b($$0 -> {
      gfn.n $$1 = new gfn.n($$0, false, false);
      return a("crumbling", fba.j, fbh.b.h, 1536, false, true, gfo.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akt, gfo> bE = ad.b(
      $$0 -> a("text", fba.t, fbh.b.h, 786432, false, true, gfo.b.a().a(W).a(new gfn.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gfo bF = a("text_background", fba.p, fbh.b.h, 1536, false, true, gfo.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akt, gfo> bG = ad.b(
      $$0 -> a("text_intensity", fba.t, fbh.b.h, 786432, false, true, gfo.b.a().a(Y).a(new gfn.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akt, gfo> bH = ad.b(
      $$0 -> a("text_polygon_offset", fba.t, fbh.b.h, 1536, false, true, gfo.b.a().a(W).a(new gfn.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akt, gfo> bI = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fba.t, fbh.b.h, 1536, false, true, gfo.b.a().a(Y).a(new gfn.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akt, gfo> bJ = ad.b(
      $$0 -> a("text_see_through", fba.t, fbh.b.h, 1536, false, true, gfo.b.a().a(Z).a(new gfn.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gfo bK = a("text_background_see_through", fba.p, fbh.b.h, 1536, false, true, gfo.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akt, gfo> bL = ad.b(
      $$0 -> a("text_intensity_see_through", fba.t, fbh.b.h, 1536, false, true, gfo.b.a().a(ab).a(new gfn.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gfo bM = a("lightning", fba.n, fbh.b.h, 1536, false, true, gfo.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gfo bN = a("tripwire", fba.j, fbh.b.h, 1536, true, true, S());
   private static final gfo bO = a(
      "end_portal", fba.m, fbh.b.h, 1536, false, false, gfo.b.a().a(ae).a(gfn.i.d().a(ghz.a, false, false).a(ghz.b, false, false).a()).a(false)
   );
   private static final gfo bP = a(
      "poisonous_potato",
      fba.m,
      fbh.b.h,
      1536,
      false,
      false,
      gfo.b.a()
         .a(ae)
         .a(
            gfn.i.d()
               .a(new akt("textures/item/poisonous_potato.png"), false, false)
               .a(new akt("nothingtoseeheremovealong", "gui/menu_background.png"), false, false)
               .a()
         )
         .a(false)
   );
   private static final gfo bQ = a(
      "end_gateway", fba.m, fbh.b.h, 1536, false, false, gfo.b.a().a(af).a(gfn.i.d().a(ghz.a, false, false).a(ghz.b, false, false).a()).a(false)
   );
   private static final gfo bR = a(false);
   private static final gfo bS = a(true);
   public static final gfo.a aW = a("lines", fba.o, fbh.b.a, 1536, gfo.b.a().a(ah).a(new gfn.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gfo.a aX = a(
      "line_strip", fba.o, fbh.b.b, 1536, gfo.b.a().a(ah).a(new gfn.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gfo.a> bT = ad.b(
      $$0 -> a("debug_line_strip", fba.n, fbh.b.d, 1536, gfo.b.a().a(o).a(new gfn.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gfo.a bU = a("debug_filled_box", fba.n, fbh.b.f, 1536, false, true, gfo.b.a().a(o).a(aI).a(h).a(false));
   private static final gfo.a bV = a("debug_quads", fba.n, fbh.b.h, 1536, false, true, gfo.b.a().a(o).a(h).a(ay).a(false));
   private static final gfo.a bW = a("debug_section_quads", fba.n, fbh.b.h, 1536, false, true, gfo.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gfo.a bX = a("gui", fba.n, fbh.b.h, 786432, gfo.b.a().a(ai).a(h).a(aB).a(false));
   private static final gfo.a bY = a("gui_overlay", fba.n, fbh.b.h, 1536, gfo.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gfo.a bZ = a("gui_text_highlight", fba.n, fbh.b.h, 1536, gfo.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gfo.a ca = a("gui_ghost_recipe_overlay", fba.n, fbh.b.h, 1536, gfo.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gfo> cb = ImmutableList.of(c(), d(), e(), f(), t());
   private final fbh cc;
   private final fbh.b cd;
   private final int ce;
   private final boolean cf;
   private final boolean cg;
   private final Optional<gfo> ch;

   public static gfo c() {
      return aZ;
   }

   public static gfo d() {
      return ba;
   }

   public static gfo e() {
      return bb;
   }

   private static gfo.b a(gfn.m $$0) {
      return gfo.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gfo f() {
      return bc;
   }

   private static gfo.b R() {
      return gfo.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gfo g() {
      return bd;
   }

   private static gfo.a a(String $$0, akt $$1, boolean $$2) {
      gfo.b $$3 = gfo.b.a().a(u).a(new gfn.n($$1, false, false)).a(gfn.h).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fba.k, fbh.b.h, 1536, true, false, $$3);
   }

   public static gfo a(akt $$0) {
      return be.apply($$0);
   }

   public static gfo b(akt $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gfo c(akt $$0) {
      return bf.apply($$0);
   }

   public static gfo d(akt $$0) {
      return bg.apply($$0);
   }

   public static gfo a(akt $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gfo e(akt $$0) {
      return a($$0, true);
   }

   public static gfo b(akt $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gfo f(akt $$0) {
      return b($$0, true);
   }

   public static gfo g(akt $$0) {
      return bj.apply($$0);
   }

   public static gfo h(akt $$0) {
      return bk.apply($$0);
   }

   public static gfo c(akt $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gfo i(akt $$0) {
      return c($$0, true);
   }

   public static gfo d(akt $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gfo j(akt $$0) {
      return d($$0, true);
   }

   public static gfo k(akt $$0) {
      return bn.apply($$0);
   }

   public static gfo e(akt $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gfo l(akt $$0) {
      return bp.apply($$0);
   }

   public static gfo m(akt $$0) {
      return bq.apply($$0);
   }

   public static gfo n(akt $$0) {
      return br.apply($$0);
   }

   public static gfo o(akt $$0) {
      return bs.apply($$0);
   }

   public static gfo p(akt $$0) {
      return bt.apply($$0, d);
   }

   public static gfo q(akt $$0) {
      return bm.apply($$0, false);
   }

   public static gfo a(akt $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fba.k,
         fbh.b.h,
         1536,
         false,
         true,
         gfo.b.a().a(am).a(new gfn.n($$0, false, false)).a(new gfn.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gfo b(akt $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fba.k,
         fbh.b.h,
         1536,
         false,
         true,
         gfo.b.a().a(K).a(new gfn.n($$0, false, false)).a(new gfn.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gfo h() {
      return bu;
   }

   public static gfo i() {
      return bv;
   }

   public static gfo r(akt $$0) {
      return gfo.a.aY.apply($$0, ay);
   }

   public static gfo j() {
      return bw;
   }

   public static gfo k() {
      return bx;
   }

   public static gfo l() {
      return by;
   }

   public static gfo m() {
      return bz;
   }

   public static gfo n() {
      return bA;
   }

   public static gfo o() {
      return bB;
   }

   public static gfo p() {
      return bC;
   }

   public static gfo s(akt $$0) {
      return bD.apply($$0);
   }

   public static gfo t(akt $$0) {
      return bE.apply($$0);
   }

   public static gfo q() {
      return bF;
   }

   public static gfo u(akt $$0) {
      return bG.apply($$0);
   }

   public static gfo v(akt $$0) {
      return bH.apply($$0);
   }

   public static gfo w(akt $$0) {
      return bI.apply($$0);
   }

   public static gfo x(akt $$0) {
      return bJ.apply($$0);
   }

   public static gfo r() {
      return bK;
   }

   public static gfo y(akt $$0) {
      return bL.apply($$0);
   }

   public static gfo s() {
      return bM;
   }

   private static gfo.b S() {
      return gfo.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gfo t() {
      return bN;
   }

   public static gfo u() {
      return bO;
   }

   public static gfo v() {
      return bP;
   }

   public static gfo w() {
      return bQ;
   }

   private static gfo.a a(boolean $$0) {
      return a("clouds", fba.v, fbh.b.h, 786432, false, false, gfo.b.a().a(ag).a(new gfn.n(gfe.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gfo x() {
      return bR;
   }

   public static gfo y() {
      return bS;
   }

   public static gfo z() {
      return aW;
   }

   public static gfo A() {
      return aX;
   }

   public static gfo a(double $$0) {
      return bT.apply($$0);
   }

   public static gfo B() {
      return bU;
   }

   public static gfo C() {
      return bV;
   }

   public static gfo D() {
      return bW;
   }

   public static gfo E() {
      return bX;
   }

   public static gfo F() {
      return bY;
   }

   public static gfo G() {
      return bZ;
   }

   public static gfo H() {
      return ca;
   }

   public gfo(String $$0, fbh $$1, fbh.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cc = $$1;
      this.cd = $$2;
      this.ce = $$3;
      this.cf = $$4;
      this.cg = $$5;
      this.ch = Optional.of(this);
   }

   static gfo.a a(String $$0, fbh $$1, fbh.b $$2, int $$3, gfo.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gfo.a a(String $$0, fbh $$1, fbh.b $$2, int $$3, boolean $$4, boolean $$5, gfo.b $$6) {
      return new gfo.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fax $$0, fbk $$1) {
      if ($$0.k()) {
         if (this.cg) {
            $$0.a($$1);
         }

         fax.b $$2 = $$0.d();
         this.a();
         fay.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gfo> I() {
      return cb;
   }

   public int J() {
      return this.ce;
   }

   public fbh K() {
      return this.cc;
   }

   public fbh.b L() {
      return this.cd;
   }

   public Optional<gfo> M() {
      return Optional.empty();
   }

   public boolean N() {
      return false;
   }

   public boolean O() {
      return this.cf;
   }

   public boolean P() {
      return !this.cd.l;
   }

   public Optional<gfo> Q() {
      return this.ch;
   }

   static final class a extends gfo {
      static final BiFunction<akt, gfn.c, gfo> aY = ad.a(
         ($$0, $$1) -> gfo.a("outline", fba.r, fbh.b.h, 1536, gfo.b.a().a(N).a(new gfn.n($$0, false, false)).a($$1).a(az).a(aK).a(gfo.c.b))
      );
      private final gfo.b aZ;
      private final Optional<gfo> ba;
      private final boolean bb;

      a(String $$0, fbh $$1, fbh.b $$2, int $$3, boolean $$4, boolean $$5, gfo.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gfn::a), () -> $$6.o.forEach(gfn::b));
         this.aZ = $$6;
         this.ba = $$6.n == gfo.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gfo.c.b;
      }

      @Override
      public Optional<gfo> M() {
         return this.ba;
      }

      @Override
      public boolean N() {
         return this.bb;
      }

      protected final gfo.b R() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gfn.e a;
      private final gfn.m b;
      private final gfn.p c;
      private final gfn.d d;
      final gfn.c e;
      private final gfn.g f;
      private final gfn.l g;
      private final gfn.f h;
      private final gfn.k i;
      private final gfn.o j;
      private final gfn.q k;
      private final gfn.h l;
      private final gfn.b m;
      final gfo.c n;
      final ImmutableList<gfn> o;

      b(
         gfn.e $$0,
         gfn.m $$1,
         gfn.p $$2,
         gfn.d $$3,
         gfn.c $$4,
         gfn.g $$5,
         gfn.l $$6,
         gfn.f $$7,
         gfn.k $$8,
         gfn.o $$9,
         gfn.q $$10,
         gfn.h $$11,
         gfn.b $$12,
         gfo.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gfn[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gfo.b.a a() {
         return new gfo.b.a();
      }

      public static class a {
         private gfn.e a = gfn.ap;
         private gfn.m b = gfn.i;
         private gfn.p c;
         private gfn.d d;
         private gfn.c e;
         private gfn.g f;
         private gfn.l g;
         private gfn.f h;
         private gfn.k i;
         private gfn.o j;
         private gfn.q k;
         private gfn.h l;
         private gfn.b m;

         a() {
            this.c = gfn.c;
            this.d = gfn.aB;
            this.e = gfn.ax;
            this.f = gfn.au;
            this.g = gfn.aw;
            this.h = gfn.aG;
            this.i = gfn.aJ;
            this.j = gfn.aq;
            this.k = gfn.aD;
            this.l = gfn.aQ;
            this.m = gfn.aR;
         }

         public gfo.b.a a(gfn.e $$0) {
            this.a = $$0;
            return this;
         }

         public gfo.b.a a(gfn.m $$0) {
            this.b = $$0;
            return this;
         }

         public gfo.b.a a(gfn.p $$0) {
            this.c = $$0;
            return this;
         }

         public gfo.b.a a(gfn.d $$0) {
            this.d = $$0;
            return this;
         }

         public gfo.b.a a(gfn.c $$0) {
            this.e = $$0;
            return this;
         }

         public gfo.b.a a(gfn.g $$0) {
            this.f = $$0;
            return this;
         }

         public gfo.b.a a(gfn.l $$0) {
            this.g = $$0;
            return this;
         }

         public gfo.b.a a(gfn.f $$0) {
            this.h = $$0;
            return this;
         }

         public gfo.b.a a(gfn.k $$0) {
            this.i = $$0;
            return this;
         }

         public gfo.b.a a(gfn.o $$0) {
            this.j = $$0;
            return this;
         }

         public gfo.b.a a(gfn.q $$0) {
            this.k = $$0;
            return this;
         }

         public gfo.b.a a(gfn.h $$0) {
            this.l = $$0;
            return this;
         }

         public gfo.b.a a(gfn.b $$0) {
            this.m = $$0;
            return this;
         }

         public gfo.b a(boolean $$0) {
            return this.a($$0 ? gfo.c.c : gfo.c.a);
         }

         public gfo.b a(gfo.c $$0) {
            return new gfo.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
