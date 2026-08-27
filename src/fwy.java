import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fwy extends fwx {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final fwy aZ = a("solid", etb.j, eti.b.h, 4194304, true, false, fwy.b.a().a(at).a(p).a(an).a(true));
   private static final fwy ba = a("cutout_mipped", etb.j, eti.b.h, 4194304, true, false, fwy.b.a().a(at).a(q).a(an).a(true));
   private static final fwy bb = a("cutout", etb.j, eti.b.h, 786432, true, false, fwy.b.a().a(at).a(r).a(ao).a(true));
   private static final fwy bc = a("translucent", etb.j, eti.b.h, 786432, true, true, a(s));
   private static final fwy bd = a("translucent_moving_block", etb.j, eti.b.h, 786432, false, true, Q());
   private static final Function<ajc, fwy> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ajc, fwy> bf = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(v).a(new fwx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", etb.k, eti.b.h, 1536, true, false, $$1);
   });
   private static final Function<ajc, fwy> bg = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(w).a(new fwx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", etb.k, eti.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ajc, Boolean, fwy> bh = ac.a(($$0, $$1) -> {
      fwy.b $$2 = fwy.b.a().a(x).a(new fwx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", etb.k, eti.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ajc, Boolean, fwy> bi = ac.a(($$0, $$1) -> {
      fwy.b $$2 = fwy.b.a().a(y).a(new fwx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", etb.k, eti.b.h, 1536, true, false, $$2);
   });
   private static final Function<ajc, fwy> bj = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(z).a(new fwx.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(fwx.aD).a(true);
      return a("item_entity_translucent_cull", etb.k, eti.b.h, 1536, true, true, $$1);
   });
   private static final Function<ajc, fwy> bk = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(A).a(new fwx.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", etb.k, eti.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ajc, Boolean, fwy> bl = ac.a(($$0, $$1) -> {
      fwy.b $$2 = fwy.b.a().a(B).a(new fwx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", etb.k, eti.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ajc, Boolean, fwy> bm = ac.a(($$0, $$1) -> {
      fwy.b $$2 = fwy.b.a().a(C).a(new fwx.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", etb.k, eti.b.h, 1536, true, true, $$2);
   });
   private static final Function<ajc, fwy> bn = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(D).a(new fwx.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", etb.k, eti.b.h, 1536, $$1);
   });
   private static final BiFunction<ajc, Boolean, fwy> bo = ac.a(($$0, $$1) -> {
      fwy.b $$2 = fwy.b.a().a(E).a(new fwx.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", etb.j, eti.b.h, 1536, false, true, $$2);
   });
   private static final Function<ajc, fwy> bp = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(F).a(new fwx.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", etb.k, eti.b.h, 1536, $$1);
   });
   private static final Function<ajc, fwy> bq = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(G).a(new fwx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", etb.k, eti.b.h, 1536, false, true, $$1);
   });
   private static final Function<ajc, fwy> br = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(H).a(new fwx.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", etb.k, eti.b.h, 1536, false, false, $$1);
   });
   private static final Function<ajc, fwy> bs = ac.b($$0 -> {
      fwy.b $$1 = fwy.b.a().a(I).a(new fwx.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", etb.k, eti.b.h, 1536, $$1);
   });
   private static final BiFunction<ajc, fwx.p, fwy> bt = ac.a(($$0, $$1) -> {
      fwx.n $$2 = new fwx.n($$0, false, false);
      return a("eyes", etb.k, eti.b.h, 1536, false, true, fwy.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final fwy bu = a("leash", etb.p, eti.b.f, 1536, fwy.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final fwy bv = a("water_mask", etb.m, eti.b.h, 1536, fwy.b.a().a(M).a(ap).a(aF).a(false));
   private static final fwy bw = a(
      "armor_glint", etb.q, eti.b.h, 1536, fwy.b.a().a(O).a(new fwx.n(gcw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final fwy bx = a(
      "armor_entity_glint", etb.q, eti.b.h, 1536, fwy.b.a().a(P).a(new fwx.n(gcw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final fwy by = a(
      "glint_translucent", etb.q, eti.b.h, 1536, fwy.b.a().a(Q).a(new fwx.n(gcw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final fwy bz = a("glint", etb.q, eti.b.h, 1536, fwy.b.a().a(R).a(new fwx.n(gcw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fwy bA = a("glint_direct", etb.q, eti.b.h, 1536, fwy.b.a().a(S).a(new fwx.n(gcw.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final fwy bB = a(
      "entity_glint", etb.q, eti.b.h, 1536, fwy.b.a().a(T).a(new fwx.n(gcw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final fwy bC = a(
      "entity_glint_direct", etb.q, eti.b.h, 1536, fwy.b.a().a(U).a(new fwx.n(gcw.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ajc, fwy> bD = ac.b($$0 -> {
      fwx.n $$1 = new fwx.n($$0, false, false);
      return a("crumbling", etb.j, eti.b.h, 1536, false, true, fwy.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ajc, fwy> bE = ac.b(
      $$0 -> a("text", etb.t, eti.b.h, 786432, false, true, fwy.b.a().a(W).a(new fwx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final fwy bF = a("text_background", etb.p, eti.b.h, 1536, false, true, fwy.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ajc, fwy> bG = ac.b(
      $$0 -> a("text_intensity", etb.t, eti.b.h, 786432, false, true, fwy.b.a().a(Y).a(new fwx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ajc, fwy> bH = ac.b(
      $$0 -> a("text_polygon_offset", etb.t, eti.b.h, 1536, false, true, fwy.b.a().a(W).a(new fwx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajc, fwy> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", etb.t, eti.b.h, 1536, false, true, fwy.b.a().a(Y).a(new fwx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajc, fwy> bJ = ac.b(
      $$0 -> a("text_see_through", etb.t, eti.b.h, 1536, false, true, fwy.b.a().a(Z).a(new fwx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fwy bK = a("text_background_see_through", etb.p, eti.b.h, 1536, false, true, fwy.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ajc, fwy> bL = ac.b(
      $$0 -> a("text_intensity_see_through", etb.t, eti.b.h, 1536, false, true, fwy.b.a().a(ab).a(new fwx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final fwy bM = a("lightning", etb.n, eti.b.h, 1536, false, true, fwy.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final fwy bN = a("tripwire", etb.j, eti.b.h, 1536, true, true, R());
   private static final fwy bO = a(
      "end_portal", etb.m, eti.b.h, 1536, false, false, fwy.b.a().a(ae).a(fwx.i.d().a(fzj.a, false, false).a(fzj.b, false, false).a()).a(false)
   );
   private static final fwy bP = a(
      "end_gateway", etb.m, eti.b.h, 1536, false, false, fwy.b.a().a(af).a(fwx.i.d().a(fzj.a, false, false).a(fzj.b, false, false).a()).a(false)
   );
   private static final fwy bQ = a(false);
   private static final fwy bR = a(true);
   public static final fwy.a aW = a("lines", etb.o, eti.b.a, 1536, fwy.b.a().a(ah).a(new fwx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final fwy.a aX = a(
      "line_strip", etb.o, eti.b.b, 1536, fwy.b.a().a(ah).a(new fwx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, fwy.a> bS = ac.b(
      $$0 -> a("debug_line_strip", etb.n, eti.b.d, 1536, fwy.b.a().a(o).a(new fwx.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final fwy.a bT = a("debug_filled_box", etb.n, eti.b.f, 1536, false, true, fwy.b.a().a(o).a(aI).a(h).a(false));
   private static final fwy.a bU = a("debug_quads", etb.n, eti.b.h, 1536, false, true, fwy.b.a().a(o).a(h).a(ay).a(false));
   private static final fwy.a bV = a("debug_section_quads", etb.n, eti.b.h, 1536, false, true, fwy.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final fwy.a bW = a("gui", etb.n, eti.b.h, 786432, fwy.b.a().a(ai).a(h).a(aB).a(false));
   private static final fwy.a bX = a("gui_overlay", etb.n, eti.b.h, 1536, fwy.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final fwy.a bY = a("gui_text_highlight", etb.n, eti.b.h, 1536, fwy.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final fwy.a bZ = a("gui_ghost_recipe_overlay", etb.n, eti.b.h, 1536, fwy.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<fwy> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eti cb;
   private final eti.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fwy> cg;

   public static fwy c() {
      return aZ;
   }

   public static fwy d() {
      return ba;
   }

   public static fwy e() {
      return bb;
   }

   private static fwy.b a(fwx.m $$0) {
      return fwy.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static fwy f() {
      return bc;
   }

   private static fwy.b Q() {
      return fwy.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static fwy g() {
      return bd;
   }

   private static fwy.a a(String $$0, ajc $$1, boolean $$2) {
      fwy.b $$3 = fwy.b.a().a(u).a(new fwx.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, etb.k, eti.b.h, 1536, true, false, $$3);
   }

   public static fwy a(ajc $$0) {
      return be.apply($$0);
   }

   public static fwy b(ajc $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fwy c(ajc $$0) {
      return bf.apply($$0);
   }

   public static fwy d(ajc $$0) {
      return bg.apply($$0);
   }

   public static fwy a(ajc $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fwy e(ajc $$0) {
      return a($$0, true);
   }

   public static fwy b(ajc $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static fwy f(ajc $$0) {
      return b($$0, true);
   }

   public static fwy g(ajc $$0) {
      return bj.apply($$0);
   }

   public static fwy h(ajc $$0) {
      return bk.apply($$0);
   }

   public static fwy c(ajc $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fwy i(ajc $$0) {
      return c($$0, true);
   }

   public static fwy d(ajc $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static fwy j(ajc $$0) {
      return d($$0, true);
   }

   public static fwy k(ajc $$0) {
      return bn.apply($$0);
   }

   public static fwy e(ajc $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fwy l(ajc $$0) {
      return bp.apply($$0);
   }

   public static fwy m(ajc $$0) {
      return bq.apply($$0);
   }

   public static fwy n(ajc $$0) {
      return br.apply($$0);
   }

   public static fwy o(ajc $$0) {
      return bs.apply($$0);
   }

   public static fwy p(ajc $$0) {
      return bt.apply($$0, d);
   }

   public static fwy q(ajc $$0) {
      return bm.apply($$0, false);
   }

   public static fwy a(ajc $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         etb.k,
         eti.b.h,
         1536,
         false,
         true,
         fwy.b.a().a(am).a(new fwx.n($$0, false, false)).a(new fwx.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static fwy b(ajc $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         etb.k,
         eti.b.h,
         1536,
         false,
         true,
         fwy.b.a().a(K).a(new fwx.n($$0, false, false)).a(new fwx.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static fwy h() {
      return bu;
   }

   public static fwy i() {
      return bv;
   }

   public static fwy r(ajc $$0) {
      return fwy.a.aY.apply($$0, ay);
   }

   public static fwy j() {
      return bw;
   }

   public static fwy k() {
      return bx;
   }

   public static fwy l() {
      return by;
   }

   public static fwy m() {
      return bz;
   }

   public static fwy n() {
      return bA;
   }

   public static fwy o() {
      return bB;
   }

   public static fwy p() {
      return bC;
   }

   public static fwy s(ajc $$0) {
      return bD.apply($$0);
   }

   public static fwy t(ajc $$0) {
      return bE.apply($$0);
   }

   public static fwy q() {
      return bF;
   }

   public static fwy u(ajc $$0) {
      return bG.apply($$0);
   }

   public static fwy v(ajc $$0) {
      return bH.apply($$0);
   }

   public static fwy w(ajc $$0) {
      return bI.apply($$0);
   }

   public static fwy x(ajc $$0) {
      return bJ.apply($$0);
   }

   public static fwy r() {
      return bK;
   }

   public static fwy y(ajc $$0) {
      return bL.apply($$0);
   }

   public static fwy s() {
      return bM;
   }

   private static fwy.b R() {
      return fwy.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static fwy t() {
      return bN;
   }

   public static fwy u() {
      return bO;
   }

   public static fwy v() {
      return bP;
   }

   private static fwy.a a(boolean $$0) {
      return a("clouds", etb.v, eti.b.h, 786432, false, false, fwy.b.a().a(ag).a(new fwx.n(fwo.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static fwy w() {
      return bQ;
   }

   public static fwy x() {
      return bR;
   }

   public static fwy y() {
      return aW;
   }

   public static fwy z() {
      return aX;
   }

   public static fwy a(double $$0) {
      return bS.apply($$0);
   }

   public static fwy A() {
      return bT;
   }

   public static fwy B() {
      return bU;
   }

   public static fwy C() {
      return bV;
   }

   public static fwy D() {
      return bW;
   }

   public static fwy E() {
      return bX;
   }

   public static fwy F() {
      return bY;
   }

   public static fwy G() {
      return bZ;
   }

   public fwy(String $$0, eti $$1, eti.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fwy.a a(String $$0, eti $$1, eti.b $$2, int $$3, fwy.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fwy.a a(String $$0, eti $$1, eti.b $$2, int $$3, boolean $$4, boolean $$5, fwy.b $$6) {
      return new fwy.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(esy $$0, etl $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         esy.b $$2 = $$0.d();
         this.a();
         esz.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fwy> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eti J() {
      return this.cb;
   }

   public eti.b K() {
      return this.cc;
   }

   public Optional<fwy> L() {
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

   public Optional<fwy> P() {
      return this.cg;
   }

   static final class a extends fwy {
      static final BiFunction<ajc, fwx.c, fwy> aY = ac.a(
         ($$0, $$1) -> fwy.a("outline", etb.r, eti.b.h, 1536, fwy.b.a().a(N).a(new fwx.n($$0, false, false)).a($$1).a(az).a(aK).a(fwy.c.b))
      );
      private final fwy.b aZ;
      private final Optional<fwy> ba;
      private final boolean bb;

      a(String $$0, eti $$1, eti.b $$2, int $$3, boolean $$4, boolean $$5, fwy.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fwx::a), () -> $$6.o.forEach(fwx::b));
         this.aZ = $$6;
         this.ba = $$6.n == fwy.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fwy.c.b;
      }

      @Override
      public Optional<fwy> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final fwy.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fwx.e a;
      private final fwx.m b;
      private final fwx.p c;
      private final fwx.d d;
      final fwx.c e;
      private final fwx.g f;
      private final fwx.l g;
      private final fwx.f h;
      private final fwx.k i;
      private final fwx.o j;
      private final fwx.q k;
      private final fwx.h l;
      private final fwx.b m;
      final fwy.c n;
      final ImmutableList<fwx> o;

      b(
         fwx.e $$0,
         fwx.m $$1,
         fwx.p $$2,
         fwx.d $$3,
         fwx.c $$4,
         fwx.g $$5,
         fwx.l $$6,
         fwx.f $$7,
         fwx.k $$8,
         fwx.o $$9,
         fwx.q $$10,
         fwx.h $$11,
         fwx.b $$12,
         fwy.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fwx[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fwy.b.a a() {
         return new fwy.b.a();
      }

      public static class a {
         private fwx.e a = fwx.ap;
         private fwx.m b = fwx.i;
         private fwx.p c;
         private fwx.d d;
         private fwx.c e;
         private fwx.g f;
         private fwx.l g;
         private fwx.f h;
         private fwx.k i;
         private fwx.o j;
         private fwx.q k;
         private fwx.h l;
         private fwx.b m;

         a() {
            this.c = fwx.c;
            this.d = fwx.aB;
            this.e = fwx.ax;
            this.f = fwx.au;
            this.g = fwx.aw;
            this.h = fwx.aG;
            this.i = fwx.aJ;
            this.j = fwx.aq;
            this.k = fwx.aD;
            this.l = fwx.aQ;
            this.m = fwx.aR;
         }

         public fwy.b.a a(fwx.e $$0) {
            this.a = $$0;
            return this;
         }

         public fwy.b.a a(fwx.m $$0) {
            this.b = $$0;
            return this;
         }

         public fwy.b.a a(fwx.p $$0) {
            this.c = $$0;
            return this;
         }

         public fwy.b.a a(fwx.d $$0) {
            this.d = $$0;
            return this;
         }

         public fwy.b.a a(fwx.c $$0) {
            this.e = $$0;
            return this;
         }

         public fwy.b.a a(fwx.g $$0) {
            this.f = $$0;
            return this;
         }

         public fwy.b.a a(fwx.l $$0) {
            this.g = $$0;
            return this;
         }

         public fwy.b.a a(fwx.f $$0) {
            this.h = $$0;
            return this;
         }

         public fwy.b.a a(fwx.k $$0) {
            this.i = $$0;
            return this;
         }

         public fwy.b.a a(fwx.o $$0) {
            this.j = $$0;
            return this;
         }

         public fwy.b.a a(fwx.q $$0) {
            this.k = $$0;
            return this;
         }

         public fwy.b.a a(fwx.h $$0) {
            this.l = $$0;
            return this;
         }

         public fwy.b.a a(fwx.b $$0) {
            this.m = $$0;
            return this;
         }

         public fwy.b a(boolean $$0) {
            return this.a($$0 ? fwy.c.c : fwy.c.a);
         }

         public fwy.b a(fwy.c $$0) {
            return new fwy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
