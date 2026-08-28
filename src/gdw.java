import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdw extends gdv {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdw aZ = a("solid", ezw.j, fad.b.h, 4194304, true, false, gdw.b.a().a(at).a(p).a(an).a(true));
   private static final gdw ba = a("cutout_mipped", ezw.j, fad.b.h, 4194304, true, false, gdw.b.a().a(at).a(q).a(an).a(true));
   private static final gdw bb = a("cutout", ezw.j, fad.b.h, 786432, true, false, gdw.b.a().a(at).a(r).a(ao).a(true));
   private static final gdw bc = a("translucent", ezw.j, fad.b.h, 786432, true, true, a(s));
   private static final gdw bd = a("translucent_moving_block", ezw.j, fad.b.h, 786432, false, true, Q());
   private static final Function<alf, gdw> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alf, gdw> bf = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(v).a(new gdv.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezw.k, fad.b.h, 1536, true, false, $$1);
   });
   private static final Function<alf, gdw> bg = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(w).a(new gdv.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezw.k, fad.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alf, Boolean, gdw> bh = ac.a(($$0, $$1) -> {
      gdw.b $$2 = gdw.b.a().a(x).a(new gdv.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezw.k, fad.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alf, Boolean, gdw> bi = ac.a(($$0, $$1) -> {
      gdw.b $$2 = gdw.b.a().a(y).a(new gdv.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezw.k, fad.b.h, 1536, true, false, $$2);
   });
   private static final Function<alf, gdw> bj = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(z).a(new gdv.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdv.aD).a(true);
      return a("item_entity_translucent_cull", ezw.k, fad.b.h, 1536, true, true, $$1);
   });
   private static final Function<alf, gdw> bk = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(A).a(new gdv.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezw.k, fad.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alf, Boolean, gdw> bl = ac.a(($$0, $$1) -> {
      gdw.b $$2 = gdw.b.a().a(B).a(new gdv.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezw.k, fad.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alf, Boolean, gdw> bm = ac.a(($$0, $$1) -> {
      gdw.b $$2 = gdw.b.a().a(C).a(new gdv.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezw.k, fad.b.h, 1536, true, true, $$2);
   });
   private static final Function<alf, gdw> bn = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(D).a(new gdv.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezw.k, fad.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, Boolean, gdw> bo = ac.a(($$0, $$1) -> {
      gdw.b $$2 = gdw.b.a().a(E).a(new gdv.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezw.j, fad.b.h, 1536, false, true, $$2);
   });
   private static final Function<alf, gdw> bp = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(F).a(new gdv.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezw.k, fad.b.h, 1536, $$1);
   });
   private static final Function<alf, gdw> bq = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(G).a(new gdv.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezw.k, fad.b.h, 1536, false, true, $$1);
   });
   private static final Function<alf, gdw> br = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(H).a(new gdv.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezw.k, fad.b.h, 1536, false, false, $$1);
   });
   private static final Function<alf, gdw> bs = ac.b($$0 -> {
      gdw.b $$1 = gdw.b.a().a(I).a(new gdv.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezw.k, fad.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, gdv.p, gdw> bt = ac.a(($$0, $$1) -> {
      gdv.n $$2 = new gdv.n($$0, false, false);
      return a("eyes", ezw.k, fad.b.h, 1536, false, true, gdw.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdw bu = a("leash", ezw.p, fad.b.f, 1536, gdw.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdw bv = a("water_mask", ezw.m, fad.b.h, 1536, gdw.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdw bw = a(
      "armor_glint", ezw.q, fad.b.h, 1536, gdw.b.a().a(O).a(new gdv.n(gjv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdw bx = a(
      "armor_entity_glint", ezw.q, fad.b.h, 1536, gdw.b.a().a(P).a(new gdv.n(gjv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdw by = a(
      "glint_translucent", ezw.q, fad.b.h, 1536, gdw.b.a().a(Q).a(new gdv.n(gjv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdw bz = a("glint", ezw.q, fad.b.h, 1536, gdw.b.a().a(R).a(new gdv.n(gjv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdw bA = a("glint_direct", ezw.q, fad.b.h, 1536, gdw.b.a().a(S).a(new gdv.n(gjv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdw bB = a(
      "entity_glint", ezw.q, fad.b.h, 1536, gdw.b.a().a(T).a(new gdv.n(gjv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdw bC = a(
      "entity_glint_direct", ezw.q, fad.b.h, 1536, gdw.b.a().a(U).a(new gdv.n(gjv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<alf, gdw> bD = ac.b($$0 -> {
      gdv.n $$1 = new gdv.n($$0, false, false);
      return a("crumbling", ezw.j, fad.b.h, 1536, false, true, gdw.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alf, gdw> bE = ac.b(
      $$0 -> a("text", ezw.t, fad.b.h, 786432, false, true, gdw.b.a().a(W).a(new gdv.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdw bF = a("text_background", ezw.p, fad.b.h, 1536, false, true, gdw.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alf, gdw> bG = ac.b(
      $$0 -> a("text_intensity", ezw.t, fad.b.h, 786432, false, true, gdw.b.a().a(Y).a(new gdv.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<alf, gdw> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezw.t, fad.b.h, 1536, false, true, gdw.b.a().a(W).a(new gdv.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdw> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezw.t, fad.b.h, 1536, false, true, gdw.b.a().a(Y).a(new gdv.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdw> bJ = ac.b(
      $$0 -> a("text_see_through", ezw.t, fad.b.h, 1536, false, true, gdw.b.a().a(Z).a(new gdv.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdw bK = a("text_background_see_through", ezw.p, fad.b.h, 1536, false, true, gdw.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alf, gdw> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezw.t, fad.b.h, 1536, false, true, gdw.b.a().a(ab).a(new gdv.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdw bM = a("lightning", ezw.n, fad.b.h, 1536, false, true, gdw.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdw bN = a("tripwire", ezw.j, fad.b.h, 1536, true, true, R());
   private static final gdw bO = a(
      "end_portal", ezw.m, fad.b.h, 1536, false, false, gdw.b.a().a(ae).a(gdv.i.d().a(ggh.a, false, false).a(ggh.b, false, false).a()).a(false)
   );
   private static final gdw bP = a(
      "end_gateway", ezw.m, fad.b.h, 1536, false, false, gdw.b.a().a(af).a(gdv.i.d().a(ggh.a, false, false).a(ggh.b, false, false).a()).a(false)
   );
   private static final gdw bQ = a(false);
   private static final gdw bR = a(true);
   public static final gdw.a aW = a("lines", ezw.o, fad.b.a, 1536, gdw.b.a().a(ah).a(new gdv.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdw.a aX = a(
      "line_strip", ezw.o, fad.b.b, 1536, gdw.b.a().a(ah).a(new gdv.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdw.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezw.n, fad.b.d, 1536, gdw.b.a().a(o).a(new gdv.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdw.a bT = a("debug_filled_box", ezw.n, fad.b.f, 1536, false, true, gdw.b.a().a(o).a(aI).a(h).a(false));
   private static final gdw.a bU = a("debug_quads", ezw.n, fad.b.h, 1536, false, true, gdw.b.a().a(o).a(h).a(ay).a(false));
   private static final gdw.a bV = a("debug_section_quads", ezw.n, fad.b.h, 1536, false, true, gdw.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdw.a bW = a("gui", ezw.n, fad.b.h, 786432, gdw.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdw.a bX = a("gui_overlay", ezw.n, fad.b.h, 1536, gdw.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdw.a bY = a("gui_text_highlight", ezw.n, fad.b.h, 1536, gdw.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdw.a bZ = a("gui_ghost_recipe_overlay", ezw.n, fad.b.h, 1536, gdw.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdw> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fad cb;
   private final fad.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdw> cg;

   public static gdw c() {
      return aZ;
   }

   public static gdw d() {
      return ba;
   }

   public static gdw e() {
      return bb;
   }

   private static gdw.b a(gdv.m $$0) {
      return gdw.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdw f() {
      return bc;
   }

   private static gdw.b Q() {
      return gdw.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdw g() {
      return bd;
   }

   private static gdw.a a(String $$0, alf $$1, boolean $$2) {
      gdw.b $$3 = gdw.b.a().a(u).a(new gdv.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezw.k, fad.b.h, 1536, true, false, $$3);
   }

   public static gdw a(alf $$0) {
      return be.apply($$0);
   }

   public static gdw b(alf $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdw c(alf $$0) {
      return bf.apply($$0);
   }

   public static gdw d(alf $$0) {
      return bg.apply($$0);
   }

   public static gdw a(alf $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdw e(alf $$0) {
      return a($$0, true);
   }

   public static gdw b(alf $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdw f(alf $$0) {
      return b($$0, true);
   }

   public static gdw g(alf $$0) {
      return bj.apply($$0);
   }

   public static gdw h(alf $$0) {
      return bk.apply($$0);
   }

   public static gdw c(alf $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdw i(alf $$0) {
      return c($$0, true);
   }

   public static gdw d(alf $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdw j(alf $$0) {
      return d($$0, true);
   }

   public static gdw k(alf $$0) {
      return bn.apply($$0);
   }

   public static gdw e(alf $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdw l(alf $$0) {
      return bp.apply($$0);
   }

   public static gdw m(alf $$0) {
      return bq.apply($$0);
   }

   public static gdw n(alf $$0) {
      return br.apply($$0);
   }

   public static gdw o(alf $$0) {
      return bs.apply($$0);
   }

   public static gdw p(alf $$0) {
      return bt.apply($$0, d);
   }

   public static gdw q(alf $$0) {
      return bm.apply($$0, false);
   }

   public static gdw a(alf $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezw.k,
         fad.b.h,
         1536,
         false,
         true,
         gdw.b.a().a(am).a(new gdv.n($$0, false, false)).a(new gdv.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdw b(alf $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezw.k,
         fad.b.h,
         1536,
         false,
         true,
         gdw.b.a().a(K).a(new gdv.n($$0, false, false)).a(new gdv.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdw h() {
      return bu;
   }

   public static gdw i() {
      return bv;
   }

   public static gdw r(alf $$0) {
      return gdw.a.aY.apply($$0, ay);
   }

   public static gdw j() {
      return bw;
   }

   public static gdw k() {
      return bx;
   }

   public static gdw l() {
      return by;
   }

   public static gdw m() {
      return bz;
   }

   public static gdw n() {
      return bA;
   }

   public static gdw o() {
      return bB;
   }

   public static gdw p() {
      return bC;
   }

   public static gdw s(alf $$0) {
      return bD.apply($$0);
   }

   public static gdw t(alf $$0) {
      return bE.apply($$0);
   }

   public static gdw q() {
      return bF;
   }

   public static gdw u(alf $$0) {
      return bG.apply($$0);
   }

   public static gdw v(alf $$0) {
      return bH.apply($$0);
   }

   public static gdw w(alf $$0) {
      return bI.apply($$0);
   }

   public static gdw x(alf $$0) {
      return bJ.apply($$0);
   }

   public static gdw r() {
      return bK;
   }

   public static gdw y(alf $$0) {
      return bL.apply($$0);
   }

   public static gdw s() {
      return bM;
   }

   private static gdw.b R() {
      return gdw.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdw t() {
      return bN;
   }

   public static gdw u() {
      return bO;
   }

   public static gdw v() {
      return bP;
   }

   private static gdw.a a(boolean $$0) {
      return a("clouds", ezw.v, fad.b.h, 786432, false, false, gdw.b.a().a(ag).a(new gdv.n(gdm.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdw w() {
      return bQ;
   }

   public static gdw x() {
      return bR;
   }

   public static gdw y() {
      return aW;
   }

   public static gdw z() {
      return aX;
   }

   public static gdw a(double $$0) {
      return bS.apply($$0);
   }

   public static gdw A() {
      return bT;
   }

   public static gdw B() {
      return bU;
   }

   public static gdw C() {
      return bV;
   }

   public static gdw D() {
      return bW;
   }

   public static gdw E() {
      return bX;
   }

   public static gdw F() {
      return bY;
   }

   public static gdw G() {
      return bZ;
   }

   public gdw(String $$0, fad $$1, fad.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdw.a a(String $$0, fad $$1, fad.b $$2, int $$3, gdw.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdw.a a(String $$0, fad $$1, fad.b $$2, int $$3, boolean $$4, boolean $$5, gdw.b $$6) {
      return new gdw.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezt $$0, fag $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezt.b $$2 = $$0.d();
         this.a();
         ezu.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdw> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fad J() {
      return this.cb;
   }

   public fad.b K() {
      return this.cc;
   }

   public Optional<gdw> L() {
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

   public Optional<gdw> P() {
      return this.cg;
   }

   static final class a extends gdw {
      static final BiFunction<alf, gdv.c, gdw> aY = ac.a(
         ($$0, $$1) -> gdw.a("outline", ezw.r, fad.b.h, 1536, gdw.b.a().a(N).a(new gdv.n($$0, false, false)).a($$1).a(az).a(aK).a(gdw.c.b))
      );
      private final gdw.b aZ;
      private final Optional<gdw> ba;
      private final boolean bb;

      a(String $$0, fad $$1, fad.b $$2, int $$3, boolean $$4, boolean $$5, gdw.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdv::a), () -> $$6.o.forEach(gdv::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdw.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdw.c.b;
      }

      @Override
      public Optional<gdw> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdw.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdv.e a;
      private final gdv.m b;
      private final gdv.p c;
      private final gdv.d d;
      final gdv.c e;
      private final gdv.g f;
      private final gdv.l g;
      private final gdv.f h;
      private final gdv.k i;
      private final gdv.o j;
      private final gdv.q k;
      private final gdv.h l;
      private final gdv.b m;
      final gdw.c n;
      final ImmutableList<gdv> o;

      b(
         gdv.e $$0,
         gdv.m $$1,
         gdv.p $$2,
         gdv.d $$3,
         gdv.c $$4,
         gdv.g $$5,
         gdv.l $$6,
         gdv.f $$7,
         gdv.k $$8,
         gdv.o $$9,
         gdv.q $$10,
         gdv.h $$11,
         gdv.b $$12,
         gdw.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdv[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdw.b.a a() {
         return new gdw.b.a();
      }

      public static class a {
         private gdv.e a = gdv.ap;
         private gdv.m b = gdv.i;
         private gdv.p c;
         private gdv.d d;
         private gdv.c e;
         private gdv.g f;
         private gdv.l g;
         private gdv.f h;
         private gdv.k i;
         private gdv.o j;
         private gdv.q k;
         private gdv.h l;
         private gdv.b m;

         a() {
            this.c = gdv.c;
            this.d = gdv.aB;
            this.e = gdv.ax;
            this.f = gdv.au;
            this.g = gdv.aw;
            this.h = gdv.aG;
            this.i = gdv.aJ;
            this.j = gdv.aq;
            this.k = gdv.aD;
            this.l = gdv.aQ;
            this.m = gdv.aR;
         }

         public gdw.b.a a(gdv.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdw.b.a a(gdv.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdw.b.a a(gdv.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdw.b.a a(gdv.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdw.b.a a(gdv.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdw.b.a a(gdv.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdw.b.a a(gdv.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdw.b.a a(gdv.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdw.b.a a(gdv.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdw.b.a a(gdv.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdw.b.a a(gdv.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdw.b.a a(gdv.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdw.b.a a(gdv.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdw.b a(boolean $$0) {
            return this.a($$0 ? gdw.c.c : gdw.c.a);
         }

         public gdw.b a(gdw.c $$0) {
            return new gdw.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
