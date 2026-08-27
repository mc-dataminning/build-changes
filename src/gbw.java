import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gbw extends gbv {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gbw aZ = a("solid", exv.j, eyc.b.h, 4194304, true, false, gbw.b.a().a(at).a(p).a(an).a(true));
   private static final gbw ba = a("cutout_mipped", exv.j, eyc.b.h, 4194304, true, false, gbw.b.a().a(at).a(q).a(an).a(true));
   private static final gbw bb = a("cutout", exv.j, eyc.b.h, 786432, true, false, gbw.b.a().a(at).a(r).a(ao).a(true));
   private static final gbw bc = a("translucent", exv.j, eyc.b.h, 786432, true, true, a(s));
   private static final gbw bd = a("translucent_moving_block", exv.j, eyc.b.h, 786432, false, true, Q());
   private static final Function<akh, gbw> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akh, gbw> bf = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(v).a(new gbv.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", exv.k, eyc.b.h, 1536, true, false, $$1);
   });
   private static final Function<akh, gbw> bg = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(w).a(new gbv.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", exv.k, eyc.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akh, Boolean, gbw> bh = ac.a(($$0, $$1) -> {
      gbw.b $$2 = gbw.b.a().a(x).a(new gbv.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", exv.k, eyc.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akh, Boolean, gbw> bi = ac.a(($$0, $$1) -> {
      gbw.b $$2 = gbw.b.a().a(y).a(new gbv.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", exv.k, eyc.b.h, 1536, true, false, $$2);
   });
   private static final Function<akh, gbw> bj = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(z).a(new gbv.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gbv.aD).a(true);
      return a("item_entity_translucent_cull", exv.k, eyc.b.h, 1536, true, true, $$1);
   });
   private static final Function<akh, gbw> bk = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(A).a(new gbv.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", exv.k, eyc.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akh, Boolean, gbw> bl = ac.a(($$0, $$1) -> {
      gbw.b $$2 = gbw.b.a().a(B).a(new gbv.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", exv.k, eyc.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akh, Boolean, gbw> bm = ac.a(($$0, $$1) -> {
      gbw.b $$2 = gbw.b.a().a(C).a(new gbv.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", exv.k, eyc.b.h, 1536, true, true, $$2);
   });
   private static final Function<akh, gbw> bn = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(D).a(new gbv.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", exv.k, eyc.b.h, 1536, $$1);
   });
   private static final BiFunction<akh, Boolean, gbw> bo = ac.a(($$0, $$1) -> {
      gbw.b $$2 = gbw.b.a().a(E).a(new gbv.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", exv.j, eyc.b.h, 1536, false, true, $$2);
   });
   private static final Function<akh, gbw> bp = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(F).a(new gbv.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", exv.k, eyc.b.h, 1536, $$1);
   });
   private static final Function<akh, gbw> bq = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(G).a(new gbv.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", exv.k, eyc.b.h, 1536, false, true, $$1);
   });
   private static final Function<akh, gbw> br = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(H).a(new gbv.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", exv.k, eyc.b.h, 1536, false, false, $$1);
   });
   private static final Function<akh, gbw> bs = ac.b($$0 -> {
      gbw.b $$1 = gbw.b.a().a(I).a(new gbv.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", exv.k, eyc.b.h, 1536, $$1);
   });
   private static final BiFunction<akh, gbv.p, gbw> bt = ac.a(($$0, $$1) -> {
      gbv.n $$2 = new gbv.n($$0, false, false);
      return a("eyes", exv.k, eyc.b.h, 1536, false, true, gbw.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gbw bu = a("leash", exv.p, eyc.b.f, 1536, gbw.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gbw bv = a("water_mask", exv.m, eyc.b.h, 1536, gbw.b.a().a(M).a(ap).a(aF).a(false));
   private static final gbw bw = a(
      "armor_glint", exv.q, eyc.b.h, 1536, gbw.b.a().a(O).a(new gbv.n(ghv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gbw bx = a(
      "armor_entity_glint", exv.q, eyc.b.h, 1536, gbw.b.a().a(P).a(new gbv.n(ghv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gbw by = a(
      "glint_translucent", exv.q, eyc.b.h, 1536, gbw.b.a().a(Q).a(new gbv.n(ghv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gbw bz = a("glint", exv.q, eyc.b.h, 1536, gbw.b.a().a(R).a(new gbv.n(ghv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gbw bA = a("glint_direct", exv.q, eyc.b.h, 1536, gbw.b.a().a(S).a(new gbv.n(ghv.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gbw bB = a(
      "entity_glint", exv.q, eyc.b.h, 1536, gbw.b.a().a(T).a(new gbv.n(ghv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gbw bC = a(
      "entity_glint_direct", exv.q, eyc.b.h, 1536, gbw.b.a().a(U).a(new gbv.n(ghv.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akh, gbw> bD = ac.b($$0 -> {
      gbv.n $$1 = new gbv.n($$0, false, false);
      return a("crumbling", exv.j, eyc.b.h, 1536, false, true, gbw.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akh, gbw> bE = ac.b(
      $$0 -> a("text", exv.t, eyc.b.h, 786432, false, true, gbw.b.a().a(W).a(new gbv.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gbw bF = a("text_background", exv.p, eyc.b.h, 1536, false, true, gbw.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akh, gbw> bG = ac.b(
      $$0 -> a("text_intensity", exv.t, eyc.b.h, 786432, false, true, gbw.b.a().a(Y).a(new gbv.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akh, gbw> bH = ac.b(
      $$0 -> a("text_polygon_offset", exv.t, eyc.b.h, 1536, false, true, gbw.b.a().a(W).a(new gbv.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akh, gbw> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", exv.t, eyc.b.h, 1536, false, true, gbw.b.a().a(Y).a(new gbv.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akh, gbw> bJ = ac.b(
      $$0 -> a("text_see_through", exv.t, eyc.b.h, 1536, false, true, gbw.b.a().a(Z).a(new gbv.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gbw bK = a("text_background_see_through", exv.p, eyc.b.h, 1536, false, true, gbw.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akh, gbw> bL = ac.b(
      $$0 -> a("text_intensity_see_through", exv.t, eyc.b.h, 1536, false, true, gbw.b.a().a(ab).a(new gbv.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gbw bM = a("lightning", exv.n, eyc.b.h, 1536, false, true, gbw.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gbw bN = a("tripwire", exv.j, eyc.b.h, 1536, true, true, R());
   private static final gbw bO = a(
      "end_portal", exv.m, eyc.b.h, 1536, false, false, gbw.b.a().a(ae).a(gbv.i.d().a(geh.a, false, false).a(geh.b, false, false).a()).a(false)
   );
   private static final gbw bP = a(
      "end_gateway", exv.m, eyc.b.h, 1536, false, false, gbw.b.a().a(af).a(gbv.i.d().a(geh.a, false, false).a(geh.b, false, false).a()).a(false)
   );
   private static final gbw bQ = a(false);
   private static final gbw bR = a(true);
   public static final gbw.a aW = a("lines", exv.o, eyc.b.a, 1536, gbw.b.a().a(ah).a(new gbv.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gbw.a aX = a(
      "line_strip", exv.o, eyc.b.b, 1536, gbw.b.a().a(ah).a(new gbv.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gbw.a> bS = ac.b(
      $$0 -> a("debug_line_strip", exv.n, eyc.b.d, 1536, gbw.b.a().a(o).a(new gbv.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gbw.a bT = a("debug_filled_box", exv.n, eyc.b.f, 1536, false, true, gbw.b.a().a(o).a(aI).a(h).a(false));
   private static final gbw.a bU = a("debug_quads", exv.n, eyc.b.h, 1536, false, true, gbw.b.a().a(o).a(h).a(ay).a(false));
   private static final gbw.a bV = a("debug_section_quads", exv.n, eyc.b.h, 1536, false, true, gbw.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gbw.a bW = a("gui", exv.n, eyc.b.h, 786432, gbw.b.a().a(ai).a(h).a(aB).a(false));
   private static final gbw.a bX = a("gui_overlay", exv.n, eyc.b.h, 1536, gbw.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gbw.a bY = a("gui_text_highlight", exv.n, eyc.b.h, 1536, gbw.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gbw.a bZ = a("gui_ghost_recipe_overlay", exv.n, eyc.b.h, 1536, gbw.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gbw> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eyc cb;
   private final eyc.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gbw> cg;

   public static gbw c() {
      return aZ;
   }

   public static gbw d() {
      return ba;
   }

   public static gbw e() {
      return bb;
   }

   private static gbw.b a(gbv.m $$0) {
      return gbw.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gbw f() {
      return bc;
   }

   private static gbw.b Q() {
      return gbw.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gbw g() {
      return bd;
   }

   private static gbw.a a(String $$0, akh $$1, boolean $$2) {
      gbw.b $$3 = gbw.b.a().a(u).a(new gbv.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, exv.k, eyc.b.h, 1536, true, false, $$3);
   }

   public static gbw a(akh $$0) {
      return be.apply($$0);
   }

   public static gbw b(akh $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gbw c(akh $$0) {
      return bf.apply($$0);
   }

   public static gbw d(akh $$0) {
      return bg.apply($$0);
   }

   public static gbw a(akh $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gbw e(akh $$0) {
      return a($$0, true);
   }

   public static gbw b(akh $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gbw f(akh $$0) {
      return b($$0, true);
   }

   public static gbw g(akh $$0) {
      return bj.apply($$0);
   }

   public static gbw h(akh $$0) {
      return bk.apply($$0);
   }

   public static gbw c(akh $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gbw i(akh $$0) {
      return c($$0, true);
   }

   public static gbw d(akh $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gbw j(akh $$0) {
      return d($$0, true);
   }

   public static gbw k(akh $$0) {
      return bn.apply($$0);
   }

   public static gbw e(akh $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gbw l(akh $$0) {
      return bp.apply($$0);
   }

   public static gbw m(akh $$0) {
      return bq.apply($$0);
   }

   public static gbw n(akh $$0) {
      return br.apply($$0);
   }

   public static gbw o(akh $$0) {
      return bs.apply($$0);
   }

   public static gbw p(akh $$0) {
      return bt.apply($$0, d);
   }

   public static gbw q(akh $$0) {
      return bm.apply($$0, false);
   }

   public static gbw a(akh $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         exv.k,
         eyc.b.h,
         1536,
         false,
         true,
         gbw.b.a().a(am).a(new gbv.n($$0, false, false)).a(new gbv.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gbw b(akh $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         exv.k,
         eyc.b.h,
         1536,
         false,
         true,
         gbw.b.a().a(K).a(new gbv.n($$0, false, false)).a(new gbv.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gbw h() {
      return bu;
   }

   public static gbw i() {
      return bv;
   }

   public static gbw r(akh $$0) {
      return gbw.a.aY.apply($$0, ay);
   }

   public static gbw j() {
      return bw;
   }

   public static gbw k() {
      return bx;
   }

   public static gbw l() {
      return by;
   }

   public static gbw m() {
      return bz;
   }

   public static gbw n() {
      return bA;
   }

   public static gbw o() {
      return bB;
   }

   public static gbw p() {
      return bC;
   }

   public static gbw s(akh $$0) {
      return bD.apply($$0);
   }

   public static gbw t(akh $$0) {
      return bE.apply($$0);
   }

   public static gbw q() {
      return bF;
   }

   public static gbw u(akh $$0) {
      return bG.apply($$0);
   }

   public static gbw v(akh $$0) {
      return bH.apply($$0);
   }

   public static gbw w(akh $$0) {
      return bI.apply($$0);
   }

   public static gbw x(akh $$0) {
      return bJ.apply($$0);
   }

   public static gbw r() {
      return bK;
   }

   public static gbw y(akh $$0) {
      return bL.apply($$0);
   }

   public static gbw s() {
      return bM;
   }

   private static gbw.b R() {
      return gbw.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gbw t() {
      return bN;
   }

   public static gbw u() {
      return bO;
   }

   public static gbw v() {
      return bP;
   }

   private static gbw.a a(boolean $$0) {
      return a("clouds", exv.v, eyc.b.h, 786432, false, false, gbw.b.a().a(ag).a(new gbv.n(gbm.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gbw w() {
      return bQ;
   }

   public static gbw x() {
      return bR;
   }

   public static gbw y() {
      return aW;
   }

   public static gbw z() {
      return aX;
   }

   public static gbw a(double $$0) {
      return bS.apply($$0);
   }

   public static gbw A() {
      return bT;
   }

   public static gbw B() {
      return bU;
   }

   public static gbw C() {
      return bV;
   }

   public static gbw D() {
      return bW;
   }

   public static gbw E() {
      return bX;
   }

   public static gbw F() {
      return bY;
   }

   public static gbw G() {
      return bZ;
   }

   public gbw(String $$0, eyc $$1, eyc.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gbw.a a(String $$0, eyc $$1, eyc.b $$2, int $$3, gbw.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gbw.a a(String $$0, eyc $$1, eyc.b $$2, int $$3, boolean $$4, boolean $$5, gbw.b $$6) {
      return new gbw.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(exs $$0, eyf $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         exs.b $$2 = $$0.d();
         this.a();
         ext.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gbw> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eyc J() {
      return this.cb;
   }

   public eyc.b K() {
      return this.cc;
   }

   public Optional<gbw> L() {
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

   public Optional<gbw> P() {
      return this.cg;
   }

   static final class a extends gbw {
      static final BiFunction<akh, gbv.c, gbw> aY = ac.a(
         ($$0, $$1) -> gbw.a("outline", exv.r, eyc.b.h, 1536, gbw.b.a().a(N).a(new gbv.n($$0, false, false)).a($$1).a(az).a(aK).a(gbw.c.b))
      );
      private final gbw.b aZ;
      private final Optional<gbw> ba;
      private final boolean bb;

      a(String $$0, eyc $$1, eyc.b $$2, int $$3, boolean $$4, boolean $$5, gbw.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gbv::a), () -> $$6.o.forEach(gbv::b));
         this.aZ = $$6;
         this.ba = $$6.n == gbw.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gbw.c.b;
      }

      @Override
      public Optional<gbw> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gbw.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gbv.e a;
      private final gbv.m b;
      private final gbv.p c;
      private final gbv.d d;
      final gbv.c e;
      private final gbv.g f;
      private final gbv.l g;
      private final gbv.f h;
      private final gbv.k i;
      private final gbv.o j;
      private final gbv.q k;
      private final gbv.h l;
      private final gbv.b m;
      final gbw.c n;
      final ImmutableList<gbv> o;

      b(
         gbv.e $$0,
         gbv.m $$1,
         gbv.p $$2,
         gbv.d $$3,
         gbv.c $$4,
         gbv.g $$5,
         gbv.l $$6,
         gbv.f $$7,
         gbv.k $$8,
         gbv.o $$9,
         gbv.q $$10,
         gbv.h $$11,
         gbv.b $$12,
         gbw.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gbv[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gbw.b.a a() {
         return new gbw.b.a();
      }

      public static class a {
         private gbv.e a = gbv.ap;
         private gbv.m b = gbv.i;
         private gbv.p c;
         private gbv.d d;
         private gbv.c e;
         private gbv.g f;
         private gbv.l g;
         private gbv.f h;
         private gbv.k i;
         private gbv.o j;
         private gbv.q k;
         private gbv.h l;
         private gbv.b m;

         a() {
            this.c = gbv.c;
            this.d = gbv.aB;
            this.e = gbv.ax;
            this.f = gbv.au;
            this.g = gbv.aw;
            this.h = gbv.aG;
            this.i = gbv.aJ;
            this.j = gbv.aq;
            this.k = gbv.aD;
            this.l = gbv.aQ;
            this.m = gbv.aR;
         }

         public gbw.b.a a(gbv.e $$0) {
            this.a = $$0;
            return this;
         }

         public gbw.b.a a(gbv.m $$0) {
            this.b = $$0;
            return this;
         }

         public gbw.b.a a(gbv.p $$0) {
            this.c = $$0;
            return this;
         }

         public gbw.b.a a(gbv.d $$0) {
            this.d = $$0;
            return this;
         }

         public gbw.b.a a(gbv.c $$0) {
            this.e = $$0;
            return this;
         }

         public gbw.b.a a(gbv.g $$0) {
            this.f = $$0;
            return this;
         }

         public gbw.b.a a(gbv.l $$0) {
            this.g = $$0;
            return this;
         }

         public gbw.b.a a(gbv.f $$0) {
            this.h = $$0;
            return this;
         }

         public gbw.b.a a(gbv.k $$0) {
            this.i = $$0;
            return this;
         }

         public gbw.b.a a(gbv.o $$0) {
            this.j = $$0;
            return this;
         }

         public gbw.b.a a(gbv.q $$0) {
            this.k = $$0;
            return this;
         }

         public gbw.b.a a(gbv.h $$0) {
            this.l = $$0;
            return this;
         }

         public gbw.b.a a(gbv.b $$0) {
            this.m = $$0;
            return this;
         }

         public gbw.b a(boolean $$0) {
            return this.a($$0 ? gbw.c.c : gbw.c.a);
         }

         public gbw.b a(gbw.c $$0) {
            return new gbw.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
