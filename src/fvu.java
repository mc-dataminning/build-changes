import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fvu extends fvt {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fvu aY = a("solid", ery.j, esf.b.h, 4194304, true, false, fvu.b.a().a(as).a(p).a(am).a(true));
   private static final fvu aZ = a("cutout_mipped", ery.j, esf.b.h, 4194304, true, false, fvu.b.a().a(as).a(q).a(am).a(true));
   private static final fvu ba = a("cutout", ery.j, esf.b.h, 786432, true, false, fvu.b.a().a(as).a(r).a(an).a(true));
   private static final fvu bb = a("translucent", ery.j, esf.b.h, 786432, true, true, a(s));
   private static final fvu bc = a("translucent_moving_block", ery.j, esf.b.h, 786432, false, true, O());
   private static final Function<aiy, fvu> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aiy, fvu> be = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(v).a(new fvt.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", ery.k, esf.b.h, 1536, true, false, $$1);
   });
   private static final Function<aiy, fvu> bf = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(w).a(new fvt.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", ery.k, esf.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvu> bg = ac.a(($$0, $$1) -> {
      fvu.b $$2 = fvu.b.a().a(x).a(new fvt.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", ery.k, esf.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<aiy, Boolean, fvu> bh = ac.a(($$0, $$1) -> {
      fvu.b $$2 = fvu.b.a().a(y).a(new fvt.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", ery.k, esf.b.h, 1536, true, false, $$2);
   });
   private static final Function<aiy, fvu> bi = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(z).a(new fvt.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fvt.aC).a(true);
      return a("item_entity_translucent_cull", ery.k, esf.b.h, 1536, true, true, $$1);
   });
   private static final Function<aiy, fvu> bj = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(A).a(new fvt.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", ery.k, esf.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvu> bk = ac.a(($$0, $$1) -> {
      fvu.b $$2 = fvu.b.a().a(B).a(new fvt.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", ery.k, esf.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<aiy, Boolean, fvu> bl = ac.a(($$0, $$1) -> {
      fvu.b $$2 = fvu.b.a().a(C).a(new fvt.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", ery.k, esf.b.h, 1536, true, true, $$2);
   });
   private static final Function<aiy, fvu> bm = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(D).a(new fvt.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", ery.k, esf.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, Boolean, fvu> bn = ac.a(($$0, $$1) -> {
      fvu.b $$2 = fvu.b.a().a(E).a(new fvt.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", ery.j, esf.b.h, 1536, false, true, $$2);
   });
   private static final Function<aiy, fvu> bo = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(F).a(new fvt.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", ery.k, esf.b.h, 1536, $$1);
   });
   private static final Function<aiy, fvu> bp = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(G).a(new fvt.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", ery.k, esf.b.h, 1536, false, true, $$1);
   });
   private static final Function<aiy, fvu> bq = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(H).a(new fvt.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", ery.k, esf.b.h, 1536, false, false, $$1);
   });
   private static final Function<aiy, fvu> br = ac.b($$0 -> {
      fvu.b $$1 = fvu.b.a().a(I).a(new fvt.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", ery.k, esf.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, fvt.p, fvu> bs = ac.a(($$0, $$1) -> {
      fvt.n $$2 = new fvt.n($$0, false, false);
      return a("eyes", ery.k, esf.b.h, 1536, false, true, fvu.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fvu bt = a("leash", ery.p, esf.b.f, 1536, fvu.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fvu bu = a("water_mask", ery.m, esf.b.h, 1536, fvu.b.a().a(M).a(ao).a(aE).a(false));
   private static final fvu bv = a(
      "armor_glint", ery.q, esf.b.h, 1536, fvu.b.a().a(O).a(new fvt.n(gbr.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fvu bw = a(
      "armor_entity_glint", ery.q, esf.b.h, 1536, fvu.b.a().a(P).a(new fvt.n(gbr.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fvu bx = a(
      "glint_translucent", ery.q, esf.b.h, 1536, fvu.b.a().a(Q).a(new fvt.n(gbr.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fvu by = a("glint", ery.q, esf.b.h, 1536, fvu.b.a().a(R).a(new fvt.n(gbr.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fvu bz = a("glint_direct", ery.q, esf.b.h, 1536, fvu.b.a().a(S).a(new fvt.n(gbr.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fvu bA = a(
      "entity_glint", ery.q, esf.b.h, 1536, fvu.b.a().a(T).a(new fvt.n(gbr.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fvu bB = a(
      "entity_glint_direct", ery.q, esf.b.h, 1536, fvu.b.a().a(U).a(new fvt.n(gbr.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aiy, fvu> bC = ac.b($$0 -> {
      fvt.n $$1 = new fvt.n($$0, false, false);
      return a("crumbling", ery.j, esf.b.h, 1536, false, true, fvu.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aiy, fvu> bD = ac.b(
      $$0 -> a("text", ery.t, esf.b.h, 786432, false, true, fvu.b.a().a(W).a(new fvt.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fvu bE = a("text_background", ery.p, esf.b.h, 1536, false, true, fvu.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<aiy, fvu> bF = ac.b(
      $$0 -> a("text_intensity", ery.t, esf.b.h, 786432, false, true, fvu.b.a().a(Y).a(new fvt.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aiy, fvu> bG = ac.b(
      $$0 -> a("text_polygon_offset", ery.t, esf.b.h, 1536, false, true, fvu.b.a().a(W).a(new fvt.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fvu> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ery.t, esf.b.h, 1536, false, true, fvu.b.a().a(Y).a(new fvt.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fvu> bI = ac.b(
      $$0 -> a("text_see_through", ery.t, esf.b.h, 1536, false, true, fvu.b.a().a(Z).a(new fvt.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fvu bJ = a("text_background_see_through", ery.p, esf.b.h, 1536, false, true, fvu.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aiy, fvu> bK = ac.b(
      $$0 -> a("text_intensity_see_through", ery.t, esf.b.h, 1536, false, true, fvu.b.a().a(ab).a(new fvt.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fvu bL = a("lightning", ery.n, esf.b.h, 1536, false, true, fvu.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fvu bM = a("tripwire", ery.j, esf.b.h, 1536, true, true, P());
   private static final fvu bN = a(
      "end_portal", ery.m, esf.b.h, 1536, false, false, fvu.b.a().a(ae).a(fvt.i.d().a(fyf.a, false, false).a(fyf.b, false, false).a()).a(false)
   );
   private static final fvu bO = a(
      "end_gateway", ery.m, esf.b.h, 1536, false, false, fvu.b.a().a(af).a(fvt.i.d().a(fyf.a, false, false).a(fyf.b, false, false).a()).a(false)
   );
   public static final fvu.a aV = a("lines", ery.o, esf.b.a, 1536, fvu.b.a().a(ag).a(new fvt.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fvu.a aW = a(
      "line_strip", ery.o, esf.b.b, 1536, fvu.b.a().a(ag).a(new fvt.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fvu.a> bP = ac.b(
      $$0 -> a("debug_line_strip", ery.n, esf.b.d, 1536, fvu.b.a().a(o).a(new fvt.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fvu.a bQ = a("debug_filled_box", ery.n, esf.b.f, 1536, false, true, fvu.b.a().a(o).a(aH).a(h).a(false));
   private static final fvu.a bR = a("debug_quads", ery.n, esf.b.h, 1536, false, true, fvu.b.a().a(o).a(h).a(ax).a(false));
   private static final fvu.a bS = a("debug_section_quads", ery.n, esf.b.h, 1536, false, true, fvu.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fvu.a bT = a("gui", ery.n, esf.b.h, 786432, fvu.b.a().a(ah).a(h).a(aA).a(false));
   private static final fvu.a bU = a("gui_overlay", ery.n, esf.b.h, 1536, fvu.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fvu.a bV = a("gui_text_highlight", ery.n, esf.b.h, 1536, fvu.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fvu.a bW = a("gui_ghost_recipe_overlay", ery.n, esf.b.h, 1536, fvu.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fvu> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final esf bY;
   private final esf.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fvu> cd;

   public static fvu c() {
      return aY;
   }

   public static fvu d() {
      return aZ;
   }

   public static fvu e() {
      return ba;
   }

   private static fvu.b a(fvt.m $$0) {
      return fvu.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fvu f() {
      return bb;
   }

   private static fvu.b O() {
      return fvu.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fvu g() {
      return bc;
   }

   private static fvu.a a(String $$0, aiy $$1, boolean $$2) {
      fvu.b $$3 = fvu.b.a().a(u).a(new fvt.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, ery.k, esf.b.h, 1536, true, false, $$3);
   }

   public static fvu a(aiy $$0) {
      return bd.apply($$0);
   }

   public static fvu b(aiy $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fvu c(aiy $$0) {
      return be.apply($$0);
   }

   public static fvu d(aiy $$0) {
      return bf.apply($$0);
   }

   public static fvu a(aiy $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fvu e(aiy $$0) {
      return a($$0, true);
   }

   public static fvu b(aiy $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fvu f(aiy $$0) {
      return b($$0, true);
   }

   public static fvu g(aiy $$0) {
      return bi.apply($$0);
   }

   public static fvu h(aiy $$0) {
      return bj.apply($$0);
   }

   public static fvu c(aiy $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fvu i(aiy $$0) {
      return c($$0, true);
   }

   public static fvu d(aiy $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fvu j(aiy $$0) {
      return d($$0, true);
   }

   public static fvu k(aiy $$0) {
      return bm.apply($$0);
   }

   public static fvu e(aiy $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fvu l(aiy $$0) {
      return bo.apply($$0);
   }

   public static fvu m(aiy $$0) {
      return bp.apply($$0);
   }

   public static fvu n(aiy $$0) {
      return bq.apply($$0);
   }

   public static fvu o(aiy $$0) {
      return br.apply($$0);
   }

   public static fvu p(aiy $$0) {
      return bs.apply($$0, d);
   }

   public static fvu q(aiy $$0) {
      return bl.apply($$0, false);
   }

   public static fvu a(aiy $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ery.k,
         esf.b.h,
         1536,
         false,
         true,
         fvu.b.a().a(al).a(new fvt.n($$0, false, false)).a(new fvt.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fvu b(aiy $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ery.k,
         esf.b.h,
         1536,
         false,
         true,
         fvu.b.a().a(K).a(new fvt.n($$0, false, false)).a(new fvt.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fvu h() {
      return bt;
   }

   public static fvu i() {
      return bu;
   }

   public static fvu r(aiy $$0) {
      return fvu.a.aX.apply($$0, ax);
   }

   public static fvu j() {
      return bv;
   }

   public static fvu k() {
      return bw;
   }

   public static fvu l() {
      return bx;
   }

   public static fvu m() {
      return by;
   }

   public static fvu n() {
      return bz;
   }

   public static fvu o() {
      return bA;
   }

   public static fvu p() {
      return bB;
   }

   public static fvu s(aiy $$0) {
      return bC.apply($$0);
   }

   public static fvu t(aiy $$0) {
      return bD.apply($$0);
   }

   public static fvu q() {
      return bE;
   }

   public static fvu u(aiy $$0) {
      return bF.apply($$0);
   }

   public static fvu v(aiy $$0) {
      return bG.apply($$0);
   }

   public static fvu w(aiy $$0) {
      return bH.apply($$0);
   }

   public static fvu x(aiy $$0) {
      return bI.apply($$0);
   }

   public static fvu r() {
      return bJ;
   }

   public static fvu y(aiy $$0) {
      return bK.apply($$0);
   }

   public static fvu s() {
      return bL;
   }

   private static fvu.b P() {
      return fvu.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fvu t() {
      return bM;
   }

   public static fvu u() {
      return bN;
   }

   public static fvu v() {
      return bO;
   }

   public static fvu w() {
      return aV;
   }

   public static fvu x() {
      return aW;
   }

   public static fvu a(double $$0) {
      return bP.apply($$0);
   }

   public static fvu y() {
      return bQ;
   }

   public static fvu z() {
      return bR;
   }

   public static fvu A() {
      return bS;
   }

   public static fvu B() {
      return bT;
   }

   public static fvu C() {
      return bU;
   }

   public static fvu D() {
      return bV;
   }

   public static fvu E() {
      return bW;
   }

   public fvu(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fvu.a a(String $$0, esf $$1, esf.b $$2, int $$3, fvu.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fvu.a a(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, fvu.b $$6) {
      return new fvu.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
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

   public static List<fvu> F() {
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

   public Optional<fvu> J() {
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

   public Optional<fvu> N() {
      return this.cd;
   }

   static final class a extends fvu {
      static final BiFunction<aiy, fvt.c, fvu> aX = ac.a(
         ($$0, $$1) -> fvu.a("outline", ery.r, esf.b.h, 1536, fvu.b.a().a(N).a(new fvt.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fvu.c.b))
      );
      private final fvu.b aY;
      private final Optional<fvu> aZ;
      private final boolean ba;

      a(String $$0, esf $$1, esf.b $$2, int $$3, boolean $$4, boolean $$5, fvu.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fvt::a), () -> $$6.o.forEach(fvt::b));
         this.aY = $$6;
         this.aZ = $$6.n == fvu.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fvu.c.b;
      }

      @Override
      public Optional<fvu> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fvu.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fvt.e a;
      private final fvt.m b;
      private final fvt.p c;
      private final fvt.d d;
      final fvt.c e;
      private final fvt.g f;
      private final fvt.l g;
      private final fvt.f h;
      private final fvt.k i;
      private final fvt.o j;
      private final fvt.q k;
      private final fvt.h l;
      private final fvt.b m;
      final fvu.c n;
      final ImmutableList<fvt> o;

      b(
         fvt.e $$0,
         fvt.m $$1,
         fvt.p $$2,
         fvt.d $$3,
         fvt.c $$4,
         fvt.g $$5,
         fvt.l $$6,
         fvt.f $$7,
         fvt.k $$8,
         fvt.o $$9,
         fvt.q $$10,
         fvt.h $$11,
         fvt.b $$12,
         fvu.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fvt[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fvu.b.a a() {
         return new fvu.b.a();
      }

      public static class a {
         private fvt.e a = fvt.ao;
         private fvt.m b = fvt.i;
         private fvt.p c;
         private fvt.d d;
         private fvt.c e;
         private fvt.g f;
         private fvt.l g;
         private fvt.f h;
         private fvt.k i;
         private fvt.o j;
         private fvt.q k;
         private fvt.h l;
         private fvt.b m;

         a() {
            this.c = fvt.c;
            this.d = fvt.aA;
            this.e = fvt.aw;
            this.f = fvt.at;
            this.g = fvt.av;
            this.h = fvt.aF;
            this.i = fvt.aI;
            this.j = fvt.ap;
            this.k = fvt.aC;
            this.l = fvt.aP;
            this.m = fvt.aQ;
         }

         public fvu.b.a a(fvt.e $$0) {
            this.a = $$0;
            return this;
         }

         public fvu.b.a a(fvt.m $$0) {
            this.b = $$0;
            return this;
         }

         public fvu.b.a a(fvt.p $$0) {
            this.c = $$0;
            return this;
         }

         public fvu.b.a a(fvt.d $$0) {
            this.d = $$0;
            return this;
         }

         public fvu.b.a a(fvt.c $$0) {
            this.e = $$0;
            return this;
         }

         public fvu.b.a a(fvt.g $$0) {
            this.f = $$0;
            return this;
         }

         public fvu.b.a a(fvt.l $$0) {
            this.g = $$0;
            return this;
         }

         public fvu.b.a a(fvt.f $$0) {
            this.h = $$0;
            return this;
         }

         public fvu.b.a a(fvt.k $$0) {
            this.i = $$0;
            return this;
         }

         public fvu.b.a a(fvt.o $$0) {
            this.j = $$0;
            return this;
         }

         public fvu.b.a a(fvt.q $$0) {
            this.k = $$0;
            return this;
         }

         public fvu.b.a a(fvt.h $$0) {
            this.l = $$0;
            return this;
         }

         public fvu.b.a a(fvt.b $$0) {
            this.m = $$0;
            return this;
         }

         public fvu.b a(boolean $$0) {
            return this.a($$0 ? fvu.c.c : fvu.c.a);
         }

         public fvu.b a(fvu.c $$0) {
            return new fvu.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
