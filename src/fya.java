import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fya extends fxz {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final fya aZ = a("solid", etz.j, eug.b.h, 4194304, true, false, fya.b.a().a(at).a(p).a(an).a(true));
   private static final fya ba = a("cutout_mipped", etz.j, eug.b.h, 4194304, true, false, fya.b.a().a(at).a(q).a(an).a(true));
   private static final fya bb = a("cutout", etz.j, eug.b.h, 786432, true, false, fya.b.a().a(at).a(r).a(ao).a(true));
   private static final fya bc = a("translucent", etz.j, eug.b.h, 786432, true, true, a(s));
   private static final fya bd = a("translucent_moving_block", etz.j, eug.b.h, 786432, false, true, Q());
   private static final Function<ajh, fya> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ajh, fya> bf = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(v).a(new fxz.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", etz.k, eug.b.h, 1536, true, false, $$1);
   });
   private static final Function<ajh, fya> bg = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(w).a(new fxz.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", etz.k, eug.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ajh, Boolean, fya> bh = ac.a(($$0, $$1) -> {
      fya.b $$2 = fya.b.a().a(x).a(new fxz.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", etz.k, eug.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ajh, Boolean, fya> bi = ac.a(($$0, $$1) -> {
      fya.b $$2 = fya.b.a().a(y).a(new fxz.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", etz.k, eug.b.h, 1536, true, false, $$2);
   });
   private static final Function<ajh, fya> bj = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(z).a(new fxz.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(fxz.aD).a(true);
      return a("item_entity_translucent_cull", etz.k, eug.b.h, 1536, true, true, $$1);
   });
   private static final Function<ajh, fya> bk = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(A).a(new fxz.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", etz.k, eug.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ajh, Boolean, fya> bl = ac.a(($$0, $$1) -> {
      fya.b $$2 = fya.b.a().a(B).a(new fxz.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", etz.k, eug.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ajh, Boolean, fya> bm = ac.a(($$0, $$1) -> {
      fya.b $$2 = fya.b.a().a(C).a(new fxz.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", etz.k, eug.b.h, 1536, true, true, $$2);
   });
   private static final Function<ajh, fya> bn = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(D).a(new fxz.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", etz.k, eug.b.h, 1536, $$1);
   });
   private static final BiFunction<ajh, Boolean, fya> bo = ac.a(($$0, $$1) -> {
      fya.b $$2 = fya.b.a().a(E).a(new fxz.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", etz.j, eug.b.h, 1536, false, true, $$2);
   });
   private static final Function<ajh, fya> bp = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(F).a(new fxz.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", etz.k, eug.b.h, 1536, $$1);
   });
   private static final Function<ajh, fya> bq = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(G).a(new fxz.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", etz.k, eug.b.h, 1536, false, true, $$1);
   });
   private static final Function<ajh, fya> br = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(H).a(new fxz.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", etz.k, eug.b.h, 1536, false, false, $$1);
   });
   private static final Function<ajh, fya> bs = ac.b($$0 -> {
      fya.b $$1 = fya.b.a().a(I).a(new fxz.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", etz.k, eug.b.h, 1536, $$1);
   });
   private static final BiFunction<ajh, fxz.p, fya> bt = ac.a(($$0, $$1) -> {
      fxz.n $$2 = new fxz.n($$0, false, false);
      return a("eyes", etz.k, eug.b.h, 1536, false, true, fya.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final fya bu = a("leash", etz.p, eug.b.f, 1536, fya.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final fya bv = a("water_mask", etz.m, eug.b.h, 1536, fya.b.a().a(M).a(ap).a(aF).a(false));
   private static final fya bw = a(
      "armor_glint", etz.q, eug.b.h, 1536, fya.b.a().a(O).a(new fxz.n(gdz.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final fya bx = a(
      "armor_entity_glint", etz.q, eug.b.h, 1536, fya.b.a().a(P).a(new fxz.n(gdz.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final fya by = a(
      "glint_translucent", etz.q, eug.b.h, 1536, fya.b.a().a(Q).a(new fxz.n(gdz.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final fya bz = a("glint", etz.q, eug.b.h, 1536, fya.b.a().a(R).a(new fxz.n(gdz.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fya bA = a("glint_direct", etz.q, eug.b.h, 1536, fya.b.a().a(S).a(new fxz.n(gdz.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fya bB = a(
      "entity_glint", etz.q, eug.b.h, 1536, fya.b.a().a(T).a(new fxz.n(gdz.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final fya bC = a(
      "entity_glint_direct", etz.q, eug.b.h, 1536, fya.b.a().a(U).a(new fxz.n(gdz.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ajh, fya> bD = ac.b($$0 -> {
      fxz.n $$1 = new fxz.n($$0, false, false);
      return a("crumbling", etz.j, eug.b.h, 1536, false, true, fya.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ajh, fya> bE = ac.b(
      $$0 -> a("text", etz.t, eug.b.h, 786432, false, true, fya.b.a().a(W).a(new fxz.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final fya bF = a("text_background", etz.p, eug.b.h, 1536, false, true, fya.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ajh, fya> bG = ac.b(
      $$0 -> a("text_intensity", etz.t, eug.b.h, 786432, false, true, fya.b.a().a(Y).a(new fxz.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ajh, fya> bH = ac.b(
      $$0 -> a("text_polygon_offset", etz.t, eug.b.h, 1536, false, true, fya.b.a().a(W).a(new fxz.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajh, fya> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", etz.t, eug.b.h, 1536, false, true, fya.b.a().a(Y).a(new fxz.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajh, fya> bJ = ac.b(
      $$0 -> a("text_see_through", etz.t, eug.b.h, 1536, false, true, fya.b.a().a(Z).a(new fxz.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fya bK = a("text_background_see_through", etz.p, eug.b.h, 1536, false, true, fya.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ajh, fya> bL = ac.b(
      $$0 -> a("text_intensity_see_through", etz.t, eug.b.h, 1536, false, true, fya.b.a().a(ab).a(new fxz.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fya bM = a("lightning", etz.n, eug.b.h, 1536, false, true, fya.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final fya bN = a("tripwire", etz.j, eug.b.h, 1536, true, true, R());
   private static final fya bO = a(
      "end_portal", etz.m, eug.b.h, 1536, false, false, fya.b.a().a(ae).a(fxz.i.d().a(gal.a, false, false).a(gal.b, false, false).a()).a(false)
   );
   private static final fya bP = a(
      "end_gateway", etz.m, eug.b.h, 1536, false, false, fya.b.a().a(af).a(fxz.i.d().a(gal.a, false, false).a(gal.b, false, false).a()).a(false)
   );
   private static final fya bQ = a(false);
   private static final fya bR = a(true);
   public static final fya.a aW = a("lines", etz.o, eug.b.a, 1536, fya.b.a().a(ah).a(new fxz.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final fya.a aX = a(
      "line_strip", etz.o, eug.b.b, 1536, fya.b.a().a(ah).a(new fxz.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, fya.a> bS = ac.b(
      $$0 -> a("debug_line_strip", etz.n, eug.b.d, 1536, fya.b.a().a(o).a(new fxz.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final fya.a bT = a("debug_filled_box", etz.n, eug.b.f, 1536, false, true, fya.b.a().a(o).a(aI).a(h).a(false));
   private static final fya.a bU = a("debug_quads", etz.n, eug.b.h, 1536, false, true, fya.b.a().a(o).a(h).a(ay).a(false));
   private static final fya.a bV = a("debug_section_quads", etz.n, eug.b.h, 1536, false, true, fya.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final fya.a bW = a("gui", etz.n, eug.b.h, 786432, fya.b.a().a(ai).a(h).a(aB).a(false));
   private static final fya.a bX = a("gui_overlay", etz.n, eug.b.h, 1536, fya.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final fya.a bY = a("gui_text_highlight", etz.n, eug.b.h, 1536, fya.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final fya.a bZ = a("gui_ghost_recipe_overlay", etz.n, eug.b.h, 1536, fya.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<fya> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eug cb;
   private final eug.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fya> cg;

   public static fya c() {
      return aZ;
   }

   public static fya d() {
      return ba;
   }

   public static fya e() {
      return bb;
   }

   private static fya.b a(fxz.m $$0) {
      return fya.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static fya f() {
      return bc;
   }

   private static fya.b Q() {
      return fya.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static fya g() {
      return bd;
   }

   private static fya.a a(String $$0, ajh $$1, boolean $$2) {
      fya.b $$3 = fya.b.a().a(u).a(new fxz.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, etz.k, eug.b.h, 1536, true, false, $$3);
   }

   public static fya a(ajh $$0) {
      return be.apply($$0);
   }

   public static fya b(ajh $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fya c(ajh $$0) {
      return bf.apply($$0);
   }

   public static fya d(ajh $$0) {
      return bg.apply($$0);
   }

   public static fya a(ajh $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fya e(ajh $$0) {
      return a($$0, true);
   }

   public static fya b(ajh $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static fya f(ajh $$0) {
      return b($$0, true);
   }

   public static fya g(ajh $$0) {
      return bj.apply($$0);
   }

   public static fya h(ajh $$0) {
      return bk.apply($$0);
   }

   public static fya c(ajh $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fya i(ajh $$0) {
      return c($$0, true);
   }

   public static fya d(ajh $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static fya j(ajh $$0) {
      return d($$0, true);
   }

   public static fya k(ajh $$0) {
      return bn.apply($$0);
   }

   public static fya e(ajh $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fya l(ajh $$0) {
      return bp.apply($$0);
   }

   public static fya m(ajh $$0) {
      return bq.apply($$0);
   }

   public static fya n(ajh $$0) {
      return br.apply($$0);
   }

   public static fya o(ajh $$0) {
      return bs.apply($$0);
   }

   public static fya p(ajh $$0) {
      return bt.apply($$0, d);
   }

   public static fya q(ajh $$0) {
      return bm.apply($$0, false);
   }

   public static fya a(ajh $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         etz.k,
         eug.b.h,
         1536,
         false,
         true,
         fya.b.a().a(am).a(new fxz.n($$0, false, false)).a(new fxz.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static fya b(ajh $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         etz.k,
         eug.b.h,
         1536,
         false,
         true,
         fya.b.a().a(K).a(new fxz.n($$0, false, false)).a(new fxz.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static fya h() {
      return bu;
   }

   public static fya i() {
      return bv;
   }

   public static fya r(ajh $$0) {
      return fya.a.aY.apply($$0, ay);
   }

   public static fya j() {
      return bw;
   }

   public static fya k() {
      return bx;
   }

   public static fya l() {
      return by;
   }

   public static fya m() {
      return bz;
   }

   public static fya n() {
      return bA;
   }

   public static fya o() {
      return bB;
   }

   public static fya p() {
      return bC;
   }

   public static fya s(ajh $$0) {
      return bD.apply($$0);
   }

   public static fya t(ajh $$0) {
      return bE.apply($$0);
   }

   public static fya q() {
      return bF;
   }

   public static fya u(ajh $$0) {
      return bG.apply($$0);
   }

   public static fya v(ajh $$0) {
      return bH.apply($$0);
   }

   public static fya w(ajh $$0) {
      return bI.apply($$0);
   }

   public static fya x(ajh $$0) {
      return bJ.apply($$0);
   }

   public static fya r() {
      return bK;
   }

   public static fya y(ajh $$0) {
      return bL.apply($$0);
   }

   public static fya s() {
      return bM;
   }

   private static fya.b R() {
      return fya.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static fya t() {
      return bN;
   }

   public static fya u() {
      return bO;
   }

   public static fya v() {
      return bP;
   }

   private static fya.a a(boolean $$0) {
      return a("clouds", etz.v, eug.b.h, 786432, false, false, fya.b.a().a(ag).a(new fxz.n(fxq.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static fya w() {
      return bQ;
   }

   public static fya x() {
      return bR;
   }

   public static fya y() {
      return aW;
   }

   public static fya z() {
      return aX;
   }

   public static fya a(double $$0) {
      return bS.apply($$0);
   }

   public static fya A() {
      return bT;
   }

   public static fya B() {
      return bU;
   }

   public static fya C() {
      return bV;
   }

   public static fya D() {
      return bW;
   }

   public static fya E() {
      return bX;
   }

   public static fya F() {
      return bY;
   }

   public static fya G() {
      return bZ;
   }

   public fya(String $$0, eug $$1, eug.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fya.a a(String $$0, eug $$1, eug.b $$2, int $$3, fya.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fya.a a(String $$0, eug $$1, eug.b $$2, int $$3, boolean $$4, boolean $$5, fya.b $$6) {
      return new fya.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(etw $$0, euj $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         etw.b $$2 = $$0.d();
         this.a();
         etx.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fya> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eug J() {
      return this.cb;
   }

   public eug.b K() {
      return this.cc;
   }

   public Optional<fya> L() {
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

   public Optional<fya> P() {
      return this.cg;
   }

   static final class a extends fya {
      static final BiFunction<ajh, fxz.c, fya> aY = ac.a(
         ($$0, $$1) -> fya.a("outline", etz.r, eug.b.h, 1536, fya.b.a().a(N).a(new fxz.n($$0, false, false)).a($$1).a(az).a(aK).a(fya.c.b))
      );
      private final fya.b aZ;
      private final Optional<fya> ba;
      private final boolean bb;

      a(String $$0, eug $$1, eug.b $$2, int $$3, boolean $$4, boolean $$5, fya.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fxz::a), () -> $$6.o.forEach(fxz::b));
         this.aZ = $$6;
         this.ba = $$6.n == fya.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fya.c.b;
      }

      @Override
      public Optional<fya> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final fya.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fxz.e a;
      private final fxz.m b;
      private final fxz.p c;
      private final fxz.d d;
      final fxz.c e;
      private final fxz.g f;
      private final fxz.l g;
      private final fxz.f h;
      private final fxz.k i;
      private final fxz.o j;
      private final fxz.q k;
      private final fxz.h l;
      private final fxz.b m;
      final fya.c n;
      final ImmutableList<fxz> o;

      b(
         fxz.e $$0,
         fxz.m $$1,
         fxz.p $$2,
         fxz.d $$3,
         fxz.c $$4,
         fxz.g $$5,
         fxz.l $$6,
         fxz.f $$7,
         fxz.k $$8,
         fxz.o $$9,
         fxz.q $$10,
         fxz.h $$11,
         fxz.b $$12,
         fya.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fxz[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fya.b.a a() {
         return new fya.b.a();
      }

      public static class a {
         private fxz.e a = fxz.ap;
         private fxz.m b = fxz.i;
         private fxz.p c;
         private fxz.d d;
         private fxz.c e;
         private fxz.g f;
         private fxz.l g;
         private fxz.f h;
         private fxz.k i;
         private fxz.o j;
         private fxz.q k;
         private fxz.h l;
         private fxz.b m;

         a() {
            this.c = fxz.c;
            this.d = fxz.aB;
            this.e = fxz.ax;
            this.f = fxz.au;
            this.g = fxz.aw;
            this.h = fxz.aG;
            this.i = fxz.aJ;
            this.j = fxz.aq;
            this.k = fxz.aD;
            this.l = fxz.aQ;
            this.m = fxz.aR;
         }

         public fya.b.a a(fxz.e $$0) {
            this.a = $$0;
            return this;
         }

         public fya.b.a a(fxz.m $$0) {
            this.b = $$0;
            return this;
         }

         public fya.b.a a(fxz.p $$0) {
            this.c = $$0;
            return this;
         }

         public fya.b.a a(fxz.d $$0) {
            this.d = $$0;
            return this;
         }

         public fya.b.a a(fxz.c $$0) {
            this.e = $$0;
            return this;
         }

         public fya.b.a a(fxz.g $$0) {
            this.f = $$0;
            return this;
         }

         public fya.b.a a(fxz.l $$0) {
            this.g = $$0;
            return this;
         }

         public fya.b.a a(fxz.f $$0) {
            this.h = $$0;
            return this;
         }

         public fya.b.a a(fxz.k $$0) {
            this.i = $$0;
            return this;
         }

         public fya.b.a a(fxz.o $$0) {
            this.j = $$0;
            return this;
         }

         public fya.b.a a(fxz.q $$0) {
            this.k = $$0;
            return this;
         }

         public fya.b.a a(fxz.h $$0) {
            this.l = $$0;
            return this;
         }

         public fya.b.a a(fxz.b $$0) {
            this.m = $$0;
            return this;
         }

         public fya.b a(boolean $$0) {
            return this.a($$0 ? fya.c.c : fya.c.a);
         }

         public fya.b a(fya.c $$0) {
            return new fya.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
