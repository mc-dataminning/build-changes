import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fxy extends fxx {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final fxy aZ = a("solid", etx.j, eue.b.h, 4194304, true, false, fxy.b.a().a(at).a(p).a(an).a(true));
   private static final fxy ba = a("cutout_mipped", etx.j, eue.b.h, 4194304, true, false, fxy.b.a().a(at).a(q).a(an).a(true));
   private static final fxy bb = a("cutout", etx.j, eue.b.h, 786432, true, false, fxy.b.a().a(at).a(r).a(ao).a(true));
   private static final fxy bc = a("translucent", etx.j, eue.b.h, 786432, true, true, a(s));
   private static final fxy bd = a("translucent_moving_block", etx.j, eue.b.h, 786432, false, true, Q());
   private static final Function<ajh, fxy> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ajh, fxy> bf = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(v).a(new fxx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", etx.k, eue.b.h, 1536, true, false, $$1);
   });
   private static final Function<ajh, fxy> bg = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(w).a(new fxx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", etx.k, eue.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ajh, Boolean, fxy> bh = ac.a(($$0, $$1) -> {
      fxy.b $$2 = fxy.b.a().a(x).a(new fxx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", etx.k, eue.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ajh, Boolean, fxy> bi = ac.a(($$0, $$1) -> {
      fxy.b $$2 = fxy.b.a().a(y).a(new fxx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", etx.k, eue.b.h, 1536, true, false, $$2);
   });
   private static final Function<ajh, fxy> bj = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(z).a(new fxx.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(fxx.aD).a(true);
      return a("item_entity_translucent_cull", etx.k, eue.b.h, 1536, true, true, $$1);
   });
   private static final Function<ajh, fxy> bk = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(A).a(new fxx.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", etx.k, eue.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ajh, Boolean, fxy> bl = ac.a(($$0, $$1) -> {
      fxy.b $$2 = fxy.b.a().a(B).a(new fxx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", etx.k, eue.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ajh, Boolean, fxy> bm = ac.a(($$0, $$1) -> {
      fxy.b $$2 = fxy.b.a().a(C).a(new fxx.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", etx.k, eue.b.h, 1536, true, true, $$2);
   });
   private static final Function<ajh, fxy> bn = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(D).a(new fxx.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", etx.k, eue.b.h, 1536, $$1);
   });
   private static final BiFunction<ajh, Boolean, fxy> bo = ac.a(($$0, $$1) -> {
      fxy.b $$2 = fxy.b.a().a(E).a(new fxx.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", etx.j, eue.b.h, 1536, false, true, $$2);
   });
   private static final Function<ajh, fxy> bp = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(F).a(new fxx.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", etx.k, eue.b.h, 1536, $$1);
   });
   private static final Function<ajh, fxy> bq = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(G).a(new fxx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", etx.k, eue.b.h, 1536, false, true, $$1);
   });
   private static final Function<ajh, fxy> br = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(H).a(new fxx.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", etx.k, eue.b.h, 1536, false, false, $$1);
   });
   private static final Function<ajh, fxy> bs = ac.b($$0 -> {
      fxy.b $$1 = fxy.b.a().a(I).a(new fxx.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", etx.k, eue.b.h, 1536, $$1);
   });
   private static final BiFunction<ajh, fxx.p, fxy> bt = ac.a(($$0, $$1) -> {
      fxx.n $$2 = new fxx.n($$0, false, false);
      return a("eyes", etx.k, eue.b.h, 1536, false, true, fxy.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final fxy bu = a("leash", etx.p, eue.b.f, 1536, fxy.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final fxy bv = a("water_mask", etx.m, eue.b.h, 1536, fxy.b.a().a(M).a(ap).a(aF).a(false));
   private static final fxy bw = a(
      "armor_glint", etx.q, eue.b.h, 1536, fxy.b.a().a(O).a(new fxx.n(gdw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final fxy bx = a(
      "armor_entity_glint", etx.q, eue.b.h, 1536, fxy.b.a().a(P).a(new fxx.n(gdw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final fxy by = a(
      "glint_translucent", etx.q, eue.b.h, 1536, fxy.b.a().a(Q).a(new fxx.n(gdw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final fxy bz = a("glint", etx.q, eue.b.h, 1536, fxy.b.a().a(R).a(new fxx.n(gdw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fxy bA = a("glint_direct", etx.q, eue.b.h, 1536, fxy.b.a().a(S).a(new fxx.n(gdw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fxy bB = a(
      "entity_glint", etx.q, eue.b.h, 1536, fxy.b.a().a(T).a(new fxx.n(gdw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final fxy bC = a(
      "entity_glint_direct", etx.q, eue.b.h, 1536, fxy.b.a().a(U).a(new fxx.n(gdw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ajh, fxy> bD = ac.b($$0 -> {
      fxx.n $$1 = new fxx.n($$0, false, false);
      return a("crumbling", etx.j, eue.b.h, 1536, false, true, fxy.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ajh, fxy> bE = ac.b(
      $$0 -> a("text", etx.t, eue.b.h, 786432, false, true, fxy.b.a().a(W).a(new fxx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final fxy bF = a("text_background", etx.p, eue.b.h, 1536, false, true, fxy.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ajh, fxy> bG = ac.b(
      $$0 -> a("text_intensity", etx.t, eue.b.h, 786432, false, true, fxy.b.a().a(Y).a(new fxx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ajh, fxy> bH = ac.b(
      $$0 -> a("text_polygon_offset", etx.t, eue.b.h, 1536, false, true, fxy.b.a().a(W).a(new fxx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajh, fxy> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", etx.t, eue.b.h, 1536, false, true, fxy.b.a().a(Y).a(new fxx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajh, fxy> bJ = ac.b(
      $$0 -> a("text_see_through", etx.t, eue.b.h, 1536, false, true, fxy.b.a().a(Z).a(new fxx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fxy bK = a("text_background_see_through", etx.p, eue.b.h, 1536, false, true, fxy.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ajh, fxy> bL = ac.b(
      $$0 -> a("text_intensity_see_through", etx.t, eue.b.h, 1536, false, true, fxy.b.a().a(ab).a(new fxx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fxy bM = a("lightning", etx.n, eue.b.h, 1536, false, true, fxy.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final fxy bN = a("tripwire", etx.j, eue.b.h, 1536, true, true, R());
   private static final fxy bO = a(
      "end_portal", etx.m, eue.b.h, 1536, false, false, fxy.b.a().a(ae).a(fxx.i.d().a(gaj.a, false, false).a(gaj.b, false, false).a()).a(false)
   );
   private static final fxy bP = a(
      "end_gateway", etx.m, eue.b.h, 1536, false, false, fxy.b.a().a(af).a(fxx.i.d().a(gaj.a, false, false).a(gaj.b, false, false).a()).a(false)
   );
   private static final fxy bQ = a(false);
   private static final fxy bR = a(true);
   public static final fxy.a aW = a("lines", etx.o, eue.b.a, 1536, fxy.b.a().a(ah).a(new fxx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final fxy.a aX = a(
      "line_strip", etx.o, eue.b.b, 1536, fxy.b.a().a(ah).a(new fxx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, fxy.a> bS = ac.b(
      $$0 -> a("debug_line_strip", etx.n, eue.b.d, 1536, fxy.b.a().a(o).a(new fxx.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final fxy.a bT = a("debug_filled_box", etx.n, eue.b.f, 1536, false, true, fxy.b.a().a(o).a(aI).a(h).a(false));
   private static final fxy.a bU = a("debug_quads", etx.n, eue.b.h, 1536, false, true, fxy.b.a().a(o).a(h).a(ay).a(false));
   private static final fxy.a bV = a("debug_section_quads", etx.n, eue.b.h, 1536, false, true, fxy.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final fxy.a bW = a("gui", etx.n, eue.b.h, 786432, fxy.b.a().a(ai).a(h).a(aB).a(false));
   private static final fxy.a bX = a("gui_overlay", etx.n, eue.b.h, 1536, fxy.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final fxy.a bY = a("gui_text_highlight", etx.n, eue.b.h, 1536, fxy.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final fxy.a bZ = a("gui_ghost_recipe_overlay", etx.n, eue.b.h, 1536, fxy.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<fxy> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eue cb;
   private final eue.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fxy> cg;

   public static fxy c() {
      return aZ;
   }

   public static fxy d() {
      return ba;
   }

   public static fxy e() {
      return bb;
   }

   private static fxy.b a(fxx.m $$0) {
      return fxy.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static fxy f() {
      return bc;
   }

   private static fxy.b Q() {
      return fxy.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static fxy g() {
      return bd;
   }

   private static fxy.a a(String $$0, ajh $$1, boolean $$2) {
      fxy.b $$3 = fxy.b.a().a(u).a(new fxx.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, etx.k, eue.b.h, 1536, true, false, $$3);
   }

   public static fxy a(ajh $$0) {
      return be.apply($$0);
   }

   public static fxy b(ajh $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fxy c(ajh $$0) {
      return bf.apply($$0);
   }

   public static fxy d(ajh $$0) {
      return bg.apply($$0);
   }

   public static fxy a(ajh $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fxy e(ajh $$0) {
      return a($$0, true);
   }

   public static fxy b(ajh $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static fxy f(ajh $$0) {
      return b($$0, true);
   }

   public static fxy g(ajh $$0) {
      return bj.apply($$0);
   }

   public static fxy h(ajh $$0) {
      return bk.apply($$0);
   }

   public static fxy c(ajh $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fxy i(ajh $$0) {
      return c($$0, true);
   }

   public static fxy d(ajh $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static fxy j(ajh $$0) {
      return d($$0, true);
   }

   public static fxy k(ajh $$0) {
      return bn.apply($$0);
   }

   public static fxy e(ajh $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fxy l(ajh $$0) {
      return bp.apply($$0);
   }

   public static fxy m(ajh $$0) {
      return bq.apply($$0);
   }

   public static fxy n(ajh $$0) {
      return br.apply($$0);
   }

   public static fxy o(ajh $$0) {
      return bs.apply($$0);
   }

   public static fxy p(ajh $$0) {
      return bt.apply($$0, d);
   }

   public static fxy q(ajh $$0) {
      return bm.apply($$0, false);
   }

   public static fxy a(ajh $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         etx.k,
         eue.b.h,
         1536,
         false,
         true,
         fxy.b.a().a(am).a(new fxx.n($$0, false, false)).a(new fxx.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static fxy b(ajh $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         etx.k,
         eue.b.h,
         1536,
         false,
         true,
         fxy.b.a().a(K).a(new fxx.n($$0, false, false)).a(new fxx.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static fxy h() {
      return bu;
   }

   public static fxy i() {
      return bv;
   }

   public static fxy r(ajh $$0) {
      return fxy.a.aY.apply($$0, ay);
   }

   public static fxy j() {
      return bw;
   }

   public static fxy k() {
      return bx;
   }

   public static fxy l() {
      return by;
   }

   public static fxy m() {
      return bz;
   }

   public static fxy n() {
      return bA;
   }

   public static fxy o() {
      return bB;
   }

   public static fxy p() {
      return bC;
   }

   public static fxy s(ajh $$0) {
      return bD.apply($$0);
   }

   public static fxy t(ajh $$0) {
      return bE.apply($$0);
   }

   public static fxy q() {
      return bF;
   }

   public static fxy u(ajh $$0) {
      return bG.apply($$0);
   }

   public static fxy v(ajh $$0) {
      return bH.apply($$0);
   }

   public static fxy w(ajh $$0) {
      return bI.apply($$0);
   }

   public static fxy x(ajh $$0) {
      return bJ.apply($$0);
   }

   public static fxy r() {
      return bK;
   }

   public static fxy y(ajh $$0) {
      return bL.apply($$0);
   }

   public static fxy s() {
      return bM;
   }

   private static fxy.b R() {
      return fxy.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static fxy t() {
      return bN;
   }

   public static fxy u() {
      return bO;
   }

   public static fxy v() {
      return bP;
   }

   private static fxy.a a(boolean $$0) {
      return a("clouds", etx.v, eue.b.h, 786432, false, false, fxy.b.a().a(ag).a(new fxx.n(fxo.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static fxy w() {
      return bQ;
   }

   public static fxy x() {
      return bR;
   }

   public static fxy y() {
      return aW;
   }

   public static fxy z() {
      return aX;
   }

   public static fxy a(double $$0) {
      return bS.apply($$0);
   }

   public static fxy A() {
      return bT;
   }

   public static fxy B() {
      return bU;
   }

   public static fxy C() {
      return bV;
   }

   public static fxy D() {
      return bW;
   }

   public static fxy E() {
      return bX;
   }

   public static fxy F() {
      return bY;
   }

   public static fxy G() {
      return bZ;
   }

   public fxy(String $$0, eue $$1, eue.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fxy.a a(String $$0, eue $$1, eue.b $$2, int $$3, fxy.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fxy.a a(String $$0, eue $$1, eue.b $$2, int $$3, boolean $$4, boolean $$5, fxy.b $$6) {
      return new fxy.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(etu $$0, euh $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         etu.b $$2 = $$0.d();
         this.a();
         etv.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fxy> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eue J() {
      return this.cb;
   }

   public eue.b K() {
      return this.cc;
   }

   public Optional<fxy> L() {
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

   public Optional<fxy> P() {
      return this.cg;
   }

   static final class a extends fxy {
      static final BiFunction<ajh, fxx.c, fxy> aY = ac.a(
         ($$0, $$1) -> fxy.a("outline", etx.r, eue.b.h, 1536, fxy.b.a().a(N).a(new fxx.n($$0, false, false)).a($$1).a(az).a(aK).a(fxy.c.b))
      );
      private final fxy.b aZ;
      private final Optional<fxy> ba;
      private final boolean bb;

      a(String $$0, eue $$1, eue.b $$2, int $$3, boolean $$4, boolean $$5, fxy.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fxx::a), () -> $$6.o.forEach(fxx::b));
         this.aZ = $$6;
         this.ba = $$6.n == fxy.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fxy.c.b;
      }

      @Override
      public Optional<fxy> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final fxy.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fxx.e a;
      private final fxx.m b;
      private final fxx.p c;
      private final fxx.d d;
      final fxx.c e;
      private final fxx.g f;
      private final fxx.l g;
      private final fxx.f h;
      private final fxx.k i;
      private final fxx.o j;
      private final fxx.q k;
      private final fxx.h l;
      private final fxx.b m;
      final fxy.c n;
      final ImmutableList<fxx> o;

      b(
         fxx.e $$0,
         fxx.m $$1,
         fxx.p $$2,
         fxx.d $$3,
         fxx.c $$4,
         fxx.g $$5,
         fxx.l $$6,
         fxx.f $$7,
         fxx.k $$8,
         fxx.o $$9,
         fxx.q $$10,
         fxx.h $$11,
         fxx.b $$12,
         fxy.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fxx[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fxy.b.a a() {
         return new fxy.b.a();
      }

      public static class a {
         private fxx.e a = fxx.ap;
         private fxx.m b = fxx.i;
         private fxx.p c;
         private fxx.d d;
         private fxx.c e;
         private fxx.g f;
         private fxx.l g;
         private fxx.f h;
         private fxx.k i;
         private fxx.o j;
         private fxx.q k;
         private fxx.h l;
         private fxx.b m;

         a() {
            this.c = fxx.c;
            this.d = fxx.aB;
            this.e = fxx.ax;
            this.f = fxx.au;
            this.g = fxx.aw;
            this.h = fxx.aG;
            this.i = fxx.aJ;
            this.j = fxx.aq;
            this.k = fxx.aD;
            this.l = fxx.aQ;
            this.m = fxx.aR;
         }

         public fxy.b.a a(fxx.e $$0) {
            this.a = $$0;
            return this;
         }

         public fxy.b.a a(fxx.m $$0) {
            this.b = $$0;
            return this;
         }

         public fxy.b.a a(fxx.p $$0) {
            this.c = $$0;
            return this;
         }

         public fxy.b.a a(fxx.d $$0) {
            this.d = $$0;
            return this;
         }

         public fxy.b.a a(fxx.c $$0) {
            this.e = $$0;
            return this;
         }

         public fxy.b.a a(fxx.g $$0) {
            this.f = $$0;
            return this;
         }

         public fxy.b.a a(fxx.l $$0) {
            this.g = $$0;
            return this;
         }

         public fxy.b.a a(fxx.f $$0) {
            this.h = $$0;
            return this;
         }

         public fxy.b.a a(fxx.k $$0) {
            this.i = $$0;
            return this;
         }

         public fxy.b.a a(fxx.o $$0) {
            this.j = $$0;
            return this;
         }

         public fxy.b.a a(fxx.q $$0) {
            this.k = $$0;
            return this;
         }

         public fxy.b.a a(fxx.h $$0) {
            this.l = $$0;
            return this;
         }

         public fxy.b.a a(fxx.b $$0) {
            this.m = $$0;
            return this;
         }

         public fxy.b a(boolean $$0) {
            return this.a($$0 ? fxy.c.c : fxy.c.a);
         }

         public fxy.b a(fxy.c $$0) {
            return new fxy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
