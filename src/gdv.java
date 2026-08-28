import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdv extends gdu {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdv aZ = a("solid", ezv.j, fac.b.h, 4194304, true, false, gdv.b.a().a(at).a(p).a(an).a(true));
   private static final gdv ba = a("cutout_mipped", ezv.j, fac.b.h, 4194304, true, false, gdv.b.a().a(at).a(q).a(an).a(true));
   private static final gdv bb = a("cutout", ezv.j, fac.b.h, 786432, true, false, gdv.b.a().a(at).a(r).a(ao).a(true));
   private static final gdv bc = a("translucent", ezv.j, fac.b.h, 786432, true, true, a(s));
   private static final gdv bd = a("translucent_moving_block", ezv.j, fac.b.h, 786432, false, true, Q());
   private static final Function<ale, gdv> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ale, gdv> bf = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(v).a(new gdu.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezv.k, fac.b.h, 1536, true, false, $$1);
   });
   private static final Function<ale, gdv> bg = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(w).a(new gdu.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezv.k, fac.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ale, Boolean, gdv> bh = ac.a(($$0, $$1) -> {
      gdv.b $$2 = gdv.b.a().a(x).a(new gdu.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezv.k, fac.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ale, Boolean, gdv> bi = ac.a(($$0, $$1) -> {
      gdv.b $$2 = gdv.b.a().a(y).a(new gdu.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezv.k, fac.b.h, 1536, true, false, $$2);
   });
   private static final Function<ale, gdv> bj = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(z).a(new gdu.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdu.aD).a(true);
      return a("item_entity_translucent_cull", ezv.k, fac.b.h, 1536, true, true, $$1);
   });
   private static final Function<ale, gdv> bk = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(A).a(new gdu.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezv.k, fac.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ale, Boolean, gdv> bl = ac.a(($$0, $$1) -> {
      gdv.b $$2 = gdv.b.a().a(B).a(new gdu.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezv.k, fac.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ale, Boolean, gdv> bm = ac.a(($$0, $$1) -> {
      gdv.b $$2 = gdv.b.a().a(C).a(new gdu.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezv.k, fac.b.h, 1536, true, true, $$2);
   });
   private static final Function<ale, gdv> bn = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(D).a(new gdu.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezv.k, fac.b.h, 1536, $$1);
   });
   private static final BiFunction<ale, Boolean, gdv> bo = ac.a(($$0, $$1) -> {
      gdv.b $$2 = gdv.b.a().a(E).a(new gdu.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezv.j, fac.b.h, 1536, false, true, $$2);
   });
   private static final Function<ale, gdv> bp = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(F).a(new gdu.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezv.k, fac.b.h, 1536, $$1);
   });
   private static final Function<ale, gdv> bq = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(G).a(new gdu.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezv.k, fac.b.h, 1536, false, true, $$1);
   });
   private static final Function<ale, gdv> br = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(H).a(new gdu.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezv.k, fac.b.h, 1536, false, false, $$1);
   });
   private static final Function<ale, gdv> bs = ac.b($$0 -> {
      gdv.b $$1 = gdv.b.a().a(I).a(new gdu.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezv.k, fac.b.h, 1536, $$1);
   });
   private static final BiFunction<ale, gdu.p, gdv> bt = ac.a(($$0, $$1) -> {
      gdu.n $$2 = new gdu.n($$0, false, false);
      return a("eyes", ezv.k, fac.b.h, 1536, false, true, gdv.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdv bu = a("leash", ezv.p, fac.b.f, 1536, gdv.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdv bv = a("water_mask", ezv.m, fac.b.h, 1536, gdv.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdv bw = a(
      "armor_glint", ezv.q, fac.b.h, 1536, gdv.b.a().a(O).a(new gdu.n(gju.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdv bx = a(
      "armor_entity_glint", ezv.q, fac.b.h, 1536, gdv.b.a().a(P).a(new gdu.n(gju.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdv by = a(
      "glint_translucent", ezv.q, fac.b.h, 1536, gdv.b.a().a(Q).a(new gdu.n(gju.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdv bz = a("glint", ezv.q, fac.b.h, 1536, gdv.b.a().a(R).a(new gdu.n(gju.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdv bA = a("glint_direct", ezv.q, fac.b.h, 1536, gdv.b.a().a(S).a(new gdu.n(gju.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdv bB = a(
      "entity_glint", ezv.q, fac.b.h, 1536, gdv.b.a().a(T).a(new gdu.n(gju.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdv bC = a(
      "entity_glint_direct", ezv.q, fac.b.h, 1536, gdv.b.a().a(U).a(new gdu.n(gju.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ale, gdv> bD = ac.b($$0 -> {
      gdu.n $$1 = new gdu.n($$0, false, false);
      return a("crumbling", ezv.j, fac.b.h, 1536, false, true, gdv.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ale, gdv> bE = ac.b(
      $$0 -> a("text", ezv.t, fac.b.h, 786432, false, true, gdv.b.a().a(W).a(new gdu.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdv bF = a("text_background", ezv.p, fac.b.h, 1536, false, true, gdv.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ale, gdv> bG = ac.b(
      $$0 -> a("text_intensity", ezv.t, fac.b.h, 786432, false, true, gdv.b.a().a(Y).a(new gdu.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ale, gdv> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezv.t, fac.b.h, 1536, false, true, gdv.b.a().a(W).a(new gdu.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, gdv> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezv.t, fac.b.h, 1536, false, true, gdv.b.a().a(Y).a(new gdu.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, gdv> bJ = ac.b(
      $$0 -> a("text_see_through", ezv.t, fac.b.h, 1536, false, true, gdv.b.a().a(Z).a(new gdu.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdv bK = a("text_background_see_through", ezv.p, fac.b.h, 1536, false, true, gdv.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ale, gdv> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezv.t, fac.b.h, 1536, false, true, gdv.b.a().a(ab).a(new gdu.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdv bM = a("lightning", ezv.n, fac.b.h, 1536, false, true, gdv.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdv bN = a("tripwire", ezv.j, fac.b.h, 1536, true, true, R());
   private static final gdv bO = a(
      "end_portal", ezv.m, fac.b.h, 1536, false, false, gdv.b.a().a(ae).a(gdu.i.d().a(ggg.a, false, false).a(ggg.b, false, false).a()).a(false)
   );
   private static final gdv bP = a(
      "end_gateway", ezv.m, fac.b.h, 1536, false, false, gdv.b.a().a(af).a(gdu.i.d().a(ggg.a, false, false).a(ggg.b, false, false).a()).a(false)
   );
   private static final gdv bQ = a(false);
   private static final gdv bR = a(true);
   public static final gdv.a aW = a("lines", ezv.o, fac.b.a, 1536, gdv.b.a().a(ah).a(new gdu.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdv.a aX = a(
      "line_strip", ezv.o, fac.b.b, 1536, gdv.b.a().a(ah).a(new gdu.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdv.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezv.n, fac.b.d, 1536, gdv.b.a().a(o).a(new gdu.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdv.a bT = a("debug_filled_box", ezv.n, fac.b.f, 1536, false, true, gdv.b.a().a(o).a(aI).a(h).a(false));
   private static final gdv.a bU = a("debug_quads", ezv.n, fac.b.h, 1536, false, true, gdv.b.a().a(o).a(h).a(ay).a(false));
   private static final gdv.a bV = a("debug_section_quads", ezv.n, fac.b.h, 1536, false, true, gdv.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdv.a bW = a("gui", ezv.n, fac.b.h, 786432, gdv.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdv.a bX = a("gui_overlay", ezv.n, fac.b.h, 1536, gdv.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdv.a bY = a("gui_text_highlight", ezv.n, fac.b.h, 1536, gdv.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdv.a bZ = a("gui_ghost_recipe_overlay", ezv.n, fac.b.h, 1536, gdv.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdv> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fac cb;
   private final fac.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdv> cg;

   public static gdv c() {
      return aZ;
   }

   public static gdv d() {
      return ba;
   }

   public static gdv e() {
      return bb;
   }

   private static gdv.b a(gdu.m $$0) {
      return gdv.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdv f() {
      return bc;
   }

   private static gdv.b Q() {
      return gdv.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdv g() {
      return bd;
   }

   private static gdv.a a(String $$0, ale $$1, boolean $$2) {
      gdv.b $$3 = gdv.b.a().a(u).a(new gdu.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezv.k, fac.b.h, 1536, true, false, $$3);
   }

   public static gdv a(ale $$0) {
      return be.apply($$0);
   }

   public static gdv b(ale $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdv c(ale $$0) {
      return bf.apply($$0);
   }

   public static gdv d(ale $$0) {
      return bg.apply($$0);
   }

   public static gdv a(ale $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdv e(ale $$0) {
      return a($$0, true);
   }

   public static gdv b(ale $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdv f(ale $$0) {
      return b($$0, true);
   }

   public static gdv g(ale $$0) {
      return bj.apply($$0);
   }

   public static gdv h(ale $$0) {
      return bk.apply($$0);
   }

   public static gdv c(ale $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdv i(ale $$0) {
      return c($$0, true);
   }

   public static gdv d(ale $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdv j(ale $$0) {
      return d($$0, true);
   }

   public static gdv k(ale $$0) {
      return bn.apply($$0);
   }

   public static gdv e(ale $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdv l(ale $$0) {
      return bp.apply($$0);
   }

   public static gdv m(ale $$0) {
      return bq.apply($$0);
   }

   public static gdv n(ale $$0) {
      return br.apply($$0);
   }

   public static gdv o(ale $$0) {
      return bs.apply($$0);
   }

   public static gdv p(ale $$0) {
      return bt.apply($$0, d);
   }

   public static gdv q(ale $$0) {
      return bm.apply($$0, false);
   }

   public static gdv a(ale $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezv.k,
         fac.b.h,
         1536,
         false,
         true,
         gdv.b.a().a(am).a(new gdu.n($$0, false, false)).a(new gdu.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdv b(ale $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezv.k,
         fac.b.h,
         1536,
         false,
         true,
         gdv.b.a().a(K).a(new gdu.n($$0, false, false)).a(new gdu.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdv h() {
      return bu;
   }

   public static gdv i() {
      return bv;
   }

   public static gdv r(ale $$0) {
      return gdv.a.aY.apply($$0, ay);
   }

   public static gdv j() {
      return bw;
   }

   public static gdv k() {
      return bx;
   }

   public static gdv l() {
      return by;
   }

   public static gdv m() {
      return bz;
   }

   public static gdv n() {
      return bA;
   }

   public static gdv o() {
      return bB;
   }

   public static gdv p() {
      return bC;
   }

   public static gdv s(ale $$0) {
      return bD.apply($$0);
   }

   public static gdv t(ale $$0) {
      return bE.apply($$0);
   }

   public static gdv q() {
      return bF;
   }

   public static gdv u(ale $$0) {
      return bG.apply($$0);
   }

   public static gdv v(ale $$0) {
      return bH.apply($$0);
   }

   public static gdv w(ale $$0) {
      return bI.apply($$0);
   }

   public static gdv x(ale $$0) {
      return bJ.apply($$0);
   }

   public static gdv r() {
      return bK;
   }

   public static gdv y(ale $$0) {
      return bL.apply($$0);
   }

   public static gdv s() {
      return bM;
   }

   private static gdv.b R() {
      return gdv.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdv t() {
      return bN;
   }

   public static gdv u() {
      return bO;
   }

   public static gdv v() {
      return bP;
   }

   private static gdv.a a(boolean $$0) {
      return a("clouds", ezv.v, fac.b.h, 786432, false, false, gdv.b.a().a(ag).a(new gdu.n(gdl.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdv w() {
      return bQ;
   }

   public static gdv x() {
      return bR;
   }

   public static gdv y() {
      return aW;
   }

   public static gdv z() {
      return aX;
   }

   public static gdv a(double $$0) {
      return bS.apply($$0);
   }

   public static gdv A() {
      return bT;
   }

   public static gdv B() {
      return bU;
   }

   public static gdv C() {
      return bV;
   }

   public static gdv D() {
      return bW;
   }

   public static gdv E() {
      return bX;
   }

   public static gdv F() {
      return bY;
   }

   public static gdv G() {
      return bZ;
   }

   public gdv(String $$0, fac $$1, fac.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdv.a a(String $$0, fac $$1, fac.b $$2, int $$3, gdv.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdv.a a(String $$0, fac $$1, fac.b $$2, int $$3, boolean $$4, boolean $$5, gdv.b $$6) {
      return new gdv.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezs $$0, faf $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezs.b $$2 = $$0.d();
         this.a();
         ezt.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdv> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fac J() {
      return this.cb;
   }

   public fac.b K() {
      return this.cc;
   }

   public Optional<gdv> L() {
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

   public Optional<gdv> P() {
      return this.cg;
   }

   static final class a extends gdv {
      static final BiFunction<ale, gdu.c, gdv> aY = ac.a(
         ($$0, $$1) -> gdv.a("outline", ezv.r, fac.b.h, 1536, gdv.b.a().a(N).a(new gdu.n($$0, false, false)).a($$1).a(az).a(aK).a(gdv.c.b))
      );
      private final gdv.b aZ;
      private final Optional<gdv> ba;
      private final boolean bb;

      a(String $$0, fac $$1, fac.b $$2, int $$3, boolean $$4, boolean $$5, gdv.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdu::a), () -> $$6.o.forEach(gdu::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdv.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdv.c.b;
      }

      @Override
      public Optional<gdv> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdv.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdu.e a;
      private final gdu.m b;
      private final gdu.p c;
      private final gdu.d d;
      final gdu.c e;
      private final gdu.g f;
      private final gdu.l g;
      private final gdu.f h;
      private final gdu.k i;
      private final gdu.o j;
      private final gdu.q k;
      private final gdu.h l;
      private final gdu.b m;
      final gdv.c n;
      final ImmutableList<gdu> o;

      b(
         gdu.e $$0,
         gdu.m $$1,
         gdu.p $$2,
         gdu.d $$3,
         gdu.c $$4,
         gdu.g $$5,
         gdu.l $$6,
         gdu.f $$7,
         gdu.k $$8,
         gdu.o $$9,
         gdu.q $$10,
         gdu.h $$11,
         gdu.b $$12,
         gdv.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdu[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdv.b.a a() {
         return new gdv.b.a();
      }

      public static class a {
         private gdu.e a = gdu.ap;
         private gdu.m b = gdu.i;
         private gdu.p c;
         private gdu.d d;
         private gdu.c e;
         private gdu.g f;
         private gdu.l g;
         private gdu.f h;
         private gdu.k i;
         private gdu.o j;
         private gdu.q k;
         private gdu.h l;
         private gdu.b m;

         a() {
            this.c = gdu.c;
            this.d = gdu.aB;
            this.e = gdu.ax;
            this.f = gdu.au;
            this.g = gdu.aw;
            this.h = gdu.aG;
            this.i = gdu.aJ;
            this.j = gdu.aq;
            this.k = gdu.aD;
            this.l = gdu.aQ;
            this.m = gdu.aR;
         }

         public gdv.b.a a(gdu.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdv.b.a a(gdu.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdv.b.a a(gdu.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdv.b.a a(gdu.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdv.b.a a(gdu.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdv.b.a a(gdu.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdv.b.a a(gdu.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdv.b.a a(gdu.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdv.b.a a(gdu.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdv.b.a a(gdu.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdv.b.a a(gdu.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdv.b.a a(gdu.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdv.b.a a(gdu.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdv.b a(boolean $$0) {
            return this.a($$0 ? gdv.c.c : gdv.c.a);
         }

         public gdv.b a(gdv.c $$0) {
            return new gdv.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
