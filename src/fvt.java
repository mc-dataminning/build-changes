import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fvt extends fvs {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fvt aY = a("solid", ery.j, esf.b.h, 4194304, true, false, fvt.b.a().a(as).a(p).a(am).a(true));
   private static final fvt aZ = a("cutout_mipped", ery.j, esf.b.h, 4194304, true, false, fvt.b.a().a(as).a(q).a(am).a(true));
   private static final fvt ba = a("cutout", ery.j, esf.b.h, 786432, true, false, fvt.b.a().a(as).a(r).a(an).a(true));
   private static final fvt bb = a("translucent", ery.j, esf.b.h, 786432, true, true, a(s));
   private static final fvt bc = a("translucent_moving_block", ery.j, esf.b.h, 786432, false, true, O());
   private static final Function<aiy, fvt> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aiy, fvt> be = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(v).a(new fvs.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", ery.k, esf.b.h, 1536, true, false, $$1);
   });
   private static final Function<aiy, fvt> bf = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(w).a(new fvs.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", ery.k, esf.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvt> bg = ac.a(($$0, $$1) -> {
      fvt.b $$2 = fvt.b.a().a(x).a(new fvs.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", ery.k, esf.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<aiy, Boolean, fvt> bh = ac.a(($$0, $$1) -> {
      fvt.b $$2 = fvt.b.a().a(y).a(new fvs.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", ery.k, esf.b.h, 1536, true, false, $$2);
   });
   private static final Function<aiy, fvt> bi = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(z).a(new fvs.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fvs.aC).a(true);
      return a("item_entity_translucent_cull", ery.k, esf.b.h, 1536, true, true, $$1);
   });
   private static final Function<aiy, fvt> bj = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(A).a(new fvs.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", ery.k, esf.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvt> bk = ac.a(($$0, $$1) -> {
      fvt.b $$2 = fvt.b.a().a(B).a(new fvs.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", ery.k, esf.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<aiy, Boolean, fvt> bl = ac.a(($$0, $$1) -> {
      fvt.b $$2 = fvt.b.a().a(C).a(new fvs.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", ery.k, esf.b.h, 1536, true, true, $$2);
   });
   private static final Function<aiy, fvt> bm = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(D).a(new fvs.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", ery.k, esf.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvt> bn = ac.a(($$0, $$1) -> {
      fvt.b $$2 = fvt.b.a().a(E).a(new fvs.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", ery.j, esf.b.h, 1536, false, true, $$2);
   });
   private static final Function<aiy, fvt> bo = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(F).a(new fvs.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", ery.k, esf.b.h, 1536, $$1);
   });
   private static final Function<aiy, fvt> bp = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(G).a(new fvs.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", ery.k, esf.b.h, 1536, false, true, $$1);
   });
   private static final Function<aiy, fvt> bq = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(H).a(new fvs.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", ery.k, esf.b.h, 1536, false, false, $$1);
   });
   private static final Function<aiy, fvt> br = ac.b($$0 -> {
      fvt.b $$1 = fvt.b.a().a(I).a(new fvs.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", ery.k, esf.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, fvs.p, fvt> bs = ac.a(($$0, $$1) -> {
      fvs.n $$2 = new fvs.n($$0, false, false);
      return a("eyes", ery.k, esf.b.h, 1536, false, true, fvt.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fvt bt = a("leash", ery.p, esf.b.f, 1536, fvt.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fvt bu = a("water_mask", ery.m, esf.b.h, 1536, fvt.b.a().a(M).a(ao).a(aE).a(false));
   private static final fvt bv = a(
      "armor_glint", ery.q, esf.b.h, 1536, fvt.b.a().a(O).a(new fvs.n(gbq.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fvt bw = a(
      "armor_entity_glint", ery.q, esf.b.h, 1536, fvt.b.a().a(P).a(new fvs.n(gbq.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fvt bx = a(
      "glint_translucent", ery.q, esf.b.h, 1536, fvt.b.a().a(Q).a(new fvs.n(gbq.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fvt by = a("glint", ery.q, esf.b.h, 1536, fvt.b.a().a(R).a(new fvs.n(gbq.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fvt bz = a("glint_direct", ery.q, esf.b.h, 1536, fvt.b.a().a(S).a(new fvs.n(gbq.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fvt bA = a(
      "entity_glint", ery.q, esf.b.h, 1536, fvt.b.a().a(T).a(new fvs.n(gbq.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fvt bB = a(
      "entity_glint_direct", ery.q, esf.b.h, 1536, fvt.b.a().a(U).a(new fvs.n(gbq.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aiy, fvt> bC = ac.b($$0 -> {
      fvs.n $$1 = new fvs.n($$0, false, false);
      return a("crumbling", ery.j, esf.b.h, 1536, false, true, fvt.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aiy, fvt> bD = ac.b(
      $$0 -> a("text", ery.t, esf.b.h, 786432, false, true, fvt.b.a().a(W).a(new fvs.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fvt bE = a("text_background", ery.p, esf.b.h, 1536, false, true, fvt.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<aiy, fvt> bF = ac.b(
      $$0 -> a("text_intensity", ery.t, esf.b.h, 786432, false, true, fvt.b.a().a(Y).a(new fvs.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aiy, fvt> bG = ac.b(
      $$0 -> a("text_polygon_offset", ery.t, esf.b.h, 1536, false, true, fvt.b.a().a(W).a(new fvs.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fvt> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ery.t, esf.b.h, 1536, false, true, fvt.b.a().a(Y).a(new fvs.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fvt> bI = ac.b(
      $$0 -> a("text_see_through", ery.t, esf.b.h, 1536, false, true, fvt.b.a().a(Z).a(new fvs.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fvt bJ = a("text_background_see_through", ery.p, esf.b.h, 1536, false, true, fvt.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aiy, fvt> bK = ac.b(
      $$0 -> a("text_intensity_see_through", ery.t, esf.b.h, 1536, false, true, fvt.b.a().a(ab).a(new fvs.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fvt bL = a("lightning", ery.n, esf.b.h, 1536, false, true, fvt.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fvt bM = a("tripwire", ery.j, esf.b.h, 1536, true, true, P());
   private static final fvt bN = a(
      "end_portal", ery.m, esf.b.h, 1536, false, false, fvt.b.a().a(ae).a(fvs.i.d().a(fye.a, false, false).a(fye.b, false, false).a()).a(false)
   );
   private static final fvt bO = a(
      "end_gateway", ery.m, esf.b.h, 1536, false, false, fvt.b.a().a(af).a(fvs.i.d().a(fye.a, false, false).a(fye.b, false, false).a()).a(false)
   );
   public static final fvt.a aV = a("lines", ery.o, esf.b.a, 1536, fvt.b.a().a(ag).a(new fvs.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fvt.a aW = a(
      "line_strip", ery.o, esf.b.b, 1536, fvt.b.a().a(ag).a(new fvs.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fvt.a> bP = ac.b(
      $$0 -> a("debug_line_strip", ery.n, esf.b.d, 1536, fvt.b.a().a(o).a(new fvs.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fvt.a bQ = a("debug_filled_box", ery.n, esf.b.f, 1536, false, true, fvt.b.a().a(o).a(aH).a(h).a(false));
   private static final fvt.a bR = a("debug_quads", ery.n, esf.b.h, 1536, false, true, fvt.b.a().a(o).a(h).a(ax).a(false));
   private static final fvt.a bS = a("debug_section_quads", ery.n, esf.b.h, 1536, false, true, fvt.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fvt.a bT = a("gui", ery.n, esf.b.h, 786432, fvt.b.a().a(ah).a(h).a(aA).a(false));
   private static final fvt.a bU = a("gui_overlay", ery.n, esf.b.h, 1536, fvt.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fvt.a bV = a("gui_text_highlight", ery.n, esf.b.h, 1536, fvt.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fvt.a bW = a("gui_ghost_recipe_overlay", ery.n, esf.b.h, 1536, fvt.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fvt> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final esf bY;
   private final esf.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fvt> cd;

   public static fvt c() {
      return aY;
   }

   public static fvt d() {
      return aZ;
   }

   public static fvt e() {
      return ba;
   }

   private static fvt.b a(fvs.m $$0) {
      return fvt.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fvt f() {
      return bb;
   }

   private static fvt.b O() {
      return fvt.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fvt g() {
      return bc;
   }

   private static fvt.a a(String $$0, aiy $$1, boolean $$2) {
      fvt.b $$3 = fvt.b.a().a(u).a(new fvs.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, ery.k, esf.b.h, 1536, true, false, $$3);
   }

   public static fvt a(aiy $$0) {
      return bd.apply($$0);
   }

   public static fvt b(aiy $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fvt c(aiy $$0) {
      return be.apply($$0);
   }

   public static fvt d(aiy $$0) {
      return bf.apply($$0);
   }

   public static fvt a(aiy $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fvt e(aiy $$0) {
      return a($$0, true);
   }

   public static fvt b(aiy $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fvt f(aiy $$0) {
      return b($$0, true);
   }

   public static fvt g(aiy $$0) {
      return bi.apply($$0);
   }

   public static fvt h(aiy $$0) {
      return bj.apply($$0);
   }

   public static fvt c(aiy $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fvt i(aiy $$0) {
      return c($$0, true);
   }

   public static fvt d(aiy $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fvt j(aiy $$0) {
      return d($$0, true);
   }

   public static fvt k(aiy $$0) {
      return bm.apply($$0);
   }

   public static fvt e(aiy $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fvt l(aiy $$0) {
      return bo.apply($$0);
   }

   public static fvt m(aiy $$0) {
      return bp.apply($$0);
   }

   public static fvt n(aiy $$0) {
      return bq.apply($$0);
   }

   public static fvt o(aiy $$0) {
      return br.apply($$0);
   }

   public static fvt p(aiy $$0) {
      return bs.apply($$0, d);
   }

   public static fvt q(aiy $$0) {
      return bl.apply($$0, false);
   }

   public static fvt a(aiy $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ery.k,
         esf.b.h,
         1536,
         false,
         true,
         fvt.b.a().a(al).a(new fvs.n($$0, false, false)).a(new fvs.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fvt b(aiy $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ery.k,
         esf.b.h,
         1536,
         false,
         true,
         fvt.b.a().a(K).a(new fvs.n($$0, false, false)).a(new fvs.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fvt h() {
      return bt;
   }

   public static fvt i() {
      return bu;
   }

   public static fvt r(aiy $$0) {
      return fvt.a.aX.apply($$0, ax);
   }

   public static fvt j() {
      return bv;
   }

   public static fvt k() {
      return bw;
   }

   public static fvt l() {
      return bx;
   }

   public static fvt m() {
      return by;
   }

   public static fvt n() {
      return bz;
   }

   public static fvt o() {
      return bA;
   }

   public static fvt p() {
      return bB;
   }

   public static fvt s(aiy $$0) {
      return bC.apply($$0);
   }

   public static fvt t(aiy $$0) {
      return bD.apply($$0);
   }

   public static fvt q() {
      return bE;
   }

   public static fvt u(aiy $$0) {
      return bF.apply($$0);
   }

   public static fvt v(aiy $$0) {
      return bG.apply($$0);
   }

   public static fvt w(aiy $$0) {
      return bH.apply($$0);
   }

   public static fvt x(aiy $$0) {
      return bI.apply($$0);
   }

   public static fvt r() {
      return bJ;
   }

   public static fvt y(aiy $$0) {
      return bK.apply($$0);
   }

   public static fvt s() {
      return bL;
   }

   private static fvt.b P() {
      return fvt.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fvt t() {
      return bM;
   }

   public static fvt u() {
      return bN;
   }

   public static fvt v() {
      return bO;
   }

   public static fvt w() {
      return aV;
   }

   public static fvt x() {
      return aW;
   }

   public static fvt a(double $$0) {
      return bP.apply($$0);
   }

   public static fvt y() {
      return bQ;
   }

   public static fvt z() {
      return bR;
   }

   public static fvt A() {
      return bS;
   }

   public static fvt B() {
      return bT;
   }

   public static fvt C() {
      return bU;
   }

   public static fvt D() {
      return bV;
   }

   public static fvt E() {
      return bW;
   }

   public fvt(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fvt.a a(String $$0, esf $$1, esf.b $$2, int $$3, fvt.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fvt.a a(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, fvt.b $$6) {
      return new fvt.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(erv $$0, esi $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         erv.b $$2 = $$0.d();
         this.a();
         erw.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fvt> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public esf H() {
      return this.bY;
   }

   public esf.b I() {
      return this.bZ;
   }

   public Optional<fvt> J() {
      return Optional.empty();
   }

   public boolean K() {
      return false;
   }

   public boolean L() {
      return this.cb;
   }

   public boolean M() {
      return !this.bZ.l;
   }

   public Optional<fvt> N() {
      return this.cd;
   }

   static final class a extends fvt {
      static final BiFunction<aiy, fvs.c, fvt> aX = ac.a(
         ($$0, $$1) -> fvt.a("outline", ery.r, esf.b.h, 1536, fvt.b.a().a(N).a(new fvs.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fvt.c.b))
      );
      private final fvt.b aY;
      private final Optional<fvt> aZ;
      private final boolean ba;

      a(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, fvt.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fvs::a), () -> $$6.o.forEach(fvs::b));
         this.aY = $$6;
         this.aZ = $$6.n == fvt.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fvt.c.b;
      }

      @Override
      public Optional<fvt> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fvt.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fvs.e a;
      private final fvs.m b;
      private final fvs.p c;
      private final fvs.d d;
      final fvs.c e;
      private final fvs.g f;
      private final fvs.l g;
      private final fvs.f h;
      private final fvs.k i;
      private final fvs.o j;
      private final fvs.q k;
      private final fvs.h l;
      private final fvs.b m;
      final fvt.c n;
      final ImmutableList<fvs> o;

      b(
         fvs.e $$0,
         fvs.m $$1,
         fvs.p $$2,
         fvs.d $$3,
         fvs.c $$4,
         fvs.g $$5,
         fvs.l $$6,
         fvs.f $$7,
         fvs.k $$8,
         fvs.o $$9,
         fvs.q $$10,
         fvs.h $$11,
         fvs.b $$12,
         fvt.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fvs[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fvt.b.a a() {
         return new fvt.b.a();
      }

      public static class a {
         private fvs.e a = fvs.ao;
         private fvs.m b = fvs.i;
         private fvs.p c;
         private fvs.d d;
         private fvs.c e;
         private fvs.g f;
         private fvs.l g;
         private fvs.f h;
         private fvs.k i;
         private fvs.o j;
         private fvs.q k;
         private fvs.h l;
         private fvs.b m;

         a() {
            this.c = fvs.c;
            this.d = fvs.aA;
            this.e = fvs.aw;
            this.f = fvs.at;
            this.g = fvs.av;
            this.h = fvs.aF;
            this.i = fvs.aI;
            this.j = fvs.ap;
            this.k = fvs.aC;
            this.l = fvs.aP;
            this.m = fvs.aQ;
         }

         public fvt.b.a a(fvs.e $$0) {
            this.a = $$0;
            return this;
         }

         public fvt.b.a a(fvs.m $$0) {
            this.b = $$0;
            return this;
         }

         public fvt.b.a a(fvs.p $$0) {
            this.c = $$0;
            return this;
         }

         public fvt.b.a a(fvs.d $$0) {
            this.d = $$0;
            return this;
         }

         public fvt.b.a a(fvs.c $$0) {
            this.e = $$0;
            return this;
         }

         public fvt.b.a a(fvs.g $$0) {
            this.f = $$0;
            return this;
         }

         public fvt.b.a a(fvs.l $$0) {
            this.g = $$0;
            return this;
         }

         public fvt.b.a a(fvs.f $$0) {
            this.h = $$0;
            return this;
         }

         public fvt.b.a a(fvs.k $$0) {
            this.i = $$0;
            return this;
         }

         public fvt.b.a a(fvs.o $$0) {
            this.j = $$0;
            return this;
         }

         public fvt.b.a a(fvs.q $$0) {
            this.k = $$0;
            return this;
         }

         public fvt.b.a a(fvs.h $$0) {
            this.l = $$0;
            return this;
         }

         public fvt.b.a a(fvs.b $$0) {
            this.m = $$0;
            return this;
         }

         public fvt.b a(boolean $$0) {
            return this.a($$0 ? fvt.c.c : fvt.c.a);
         }

         public fvt.b a(fvt.c $$0) {
            return new fvt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
