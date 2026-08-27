import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fwb extends fwa {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fwb aY = a("solid", esf.j, esm.b.h, 4194304, true, false, fwb.b.a().a(as).a(p).a(am).a(true));
   private static final fwb aZ = a("cutout_mipped", esf.j, esm.b.h, 4194304, true, false, fwb.b.a().a(as).a(q).a(am).a(true));
   private static final fwb ba = a("cutout", esf.j, esm.b.h, 786432, true, false, fwb.b.a().a(as).a(r).a(an).a(true));
   private static final fwb bb = a("translucent", esf.j, esm.b.h, 786432, true, true, a(s));
   private static final fwb bc = a("translucent_moving_block", esf.j, esm.b.h, 786432, false, true, O());
   private static final Function<aiy, fwb> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aiy, fwb> be = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(v).a(new fwa.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", esf.k, esm.b.h, 1536, true, false, $$1);
   });
   private static final Function<aiy, fwb> bf = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(w).a(new fwa.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", esf.k, esm.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<aiy, Boolean, fwb> bg = ac.a(($$0, $$1) -> {
      fwb.b $$2 = fwb.b.a().a(x).a(new fwa.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", esf.k, esm.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<aiy, Boolean, fwb> bh = ac.a(($$0, $$1) -> {
      fwb.b $$2 = fwb.b.a().a(y).a(new fwa.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", esf.k, esm.b.h, 1536, true, false, $$2);
   });
   private static final Function<aiy, fwb> bi = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(z).a(new fwa.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fwa.aC).a(true);
      return a("item_entity_translucent_cull", esf.k, esm.b.h, 1536, true, true, $$1);
   });
   private static final Function<aiy, fwb> bj = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(A).a(new fwa.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", esf.k, esm.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<aiy, Boolean, fwb> bk = ac.a(($$0, $$1) -> {
      fwb.b $$2 = fwb.b.a().a(B).a(new fwa.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", esf.k, esm.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<aiy, Boolean, fwb> bl = ac.a(($$0, $$1) -> {
      fwb.b $$2 = fwb.b.a().a(C).a(new fwa.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", esf.k, esm.b.h, 1536, true, true, $$2);
   });
   private static final Function<aiy, fwb> bm = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(D).a(new fwa.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", esf.k, esm.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, Boolean, fwb> bn = ac.a(($$0, $$1) -> {
      fwb.b $$2 = fwb.b.a().a(E).a(new fwa.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", esf.j, esm.b.h, 1536, false, true, $$2);
   });
   private static final Function<aiy, fwb> bo = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(F).a(new fwa.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", esf.k, esm.b.h, 1536, $$1);
   });
   private static final Function<aiy, fwb> bp = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(G).a(new fwa.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", esf.k, esm.b.h, 1536, false, true, $$1);
   });
   private static final Function<aiy, fwb> bq = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(H).a(new fwa.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", esf.k, esm.b.h, 1536, false, false, $$1);
   });
   private static final Function<aiy, fwb> br = ac.b($$0 -> {
      fwb.b $$1 = fwb.b.a().a(I).a(new fwa.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", esf.k, esm.b.h, 1536, $$1);
   });
   private static final BiFunction<aiy, fwa.p, fwb> bs = ac.a(($$0, $$1) -> {
      fwa.n $$2 = new fwa.n($$0, false, false);
      return a("eyes", esf.k, esm.b.h, 1536, false, true, fwb.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fwb bt = a("leash", esf.p, esm.b.f, 1536, fwb.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fwb bu = a("water_mask", esf.m, esm.b.h, 1536, fwb.b.a().a(M).a(ao).a(aE).a(false));
   private static final fwb bv = a(
      "armor_glint", esf.q, esm.b.h, 1536, fwb.b.a().a(O).a(new fwa.n(gby.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fwb bw = a(
      "armor_entity_glint", esf.q, esm.b.h, 1536, fwb.b.a().a(P).a(new fwa.n(gby.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fwb bx = a(
      "glint_translucent", esf.q, esm.b.h, 1536, fwb.b.a().a(Q).a(new fwa.n(gby.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fwb by = a("glint", esf.q, esm.b.h, 1536, fwb.b.a().a(R).a(new fwa.n(gby.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fwb bz = a("glint_direct", esf.q, esm.b.h, 1536, fwb.b.a().a(S).a(new fwa.n(gby.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fwb bA = a(
      "entity_glint", esf.q, esm.b.h, 1536, fwb.b.a().a(T).a(new fwa.n(gby.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fwb bB = a(
      "entity_glint_direct", esf.q, esm.b.h, 1536, fwb.b.a().a(U).a(new fwa.n(gby.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aiy, fwb> bC = ac.b($$0 -> {
      fwa.n $$1 = new fwa.n($$0, false, false);
      return a("crumbling", esf.j, esm.b.h, 1536, false, true, fwb.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aiy, fwb> bD = ac.b(
      $$0 -> a("text", esf.t, esm.b.h, 786432, false, true, fwb.b.a().a(W).a(new fwa.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fwb bE = a("text_background", esf.p, esm.b.h, 1536, false, true, fwb.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<aiy, fwb> bF = ac.b(
      $$0 -> a("text_intensity", esf.t, esm.b.h, 786432, false, true, fwb.b.a().a(Y).a(new fwa.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aiy, fwb> bG = ac.b(
      $$0 -> a("text_polygon_offset", esf.t, esm.b.h, 1536, false, true, fwb.b.a().a(W).a(new fwa.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fwb> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", esf.t, esm.b.h, 1536, false, true, fwb.b.a().a(Y).a(new fwa.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aiy, fwb> bI = ac.b(
      $$0 -> a("text_see_through", esf.t, esm.b.h, 1536, false, true, fwb.b.a().a(Z).a(new fwa.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fwb bJ = a("text_background_see_through", esf.p, esm.b.h, 1536, false, true, fwb.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aiy, fwb> bK = ac.b(
      $$0 -> a("text_intensity_see_through", esf.t, esm.b.h, 1536, false, true, fwb.b.a().a(ab).a(new fwa.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fwb bL = a("lightning", esf.n, esm.b.h, 1536, false, true, fwb.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fwb bM = a("tripwire", esf.j, esm.b.h, 1536, true, true, P());
   private static final fwb bN = a(
      "end_portal", esf.m, esm.b.h, 1536, false, false, fwb.b.a().a(ae).a(fwa.i.d().a(fym.a, false, false).a(fym.b, false, false).a()).a(false)
   );
   private static final fwb bO = a(
      "end_gateway", esf.m, esm.b.h, 1536, false, false, fwb.b.a().a(af).a(fwa.i.d().a(fym.a, false, false).a(fym.b, false, false).a()).a(false)
   );
   public static final fwb.a aV = a("lines", esf.o, esm.b.a, 1536, fwb.b.a().a(ag).a(new fwa.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fwb.a aW = a(
      "line_strip", esf.o, esm.b.b, 1536, fwb.b.a().a(ag).a(new fwa.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fwb.a> bP = ac.b(
      $$0 -> a("debug_line_strip", esf.n, esm.b.d, 1536, fwb.b.a().a(o).a(new fwa.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fwb.a bQ = a("debug_filled_box", esf.n, esm.b.f, 1536, false, true, fwb.b.a().a(o).a(aH).a(h).a(false));
   private static final fwb.a bR = a("debug_quads", esf.n, esm.b.h, 1536, false, true, fwb.b.a().a(o).a(h).a(ax).a(false));
   private static final fwb.a bS = a("debug_section_quads", esf.n, esm.b.h, 1536, false, true, fwb.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fwb.a bT = a("gui", esf.n, esm.b.h, 786432, fwb.b.a().a(ah).a(h).a(aA).a(false));
   private static final fwb.a bU = a("gui_overlay", esf.n, esm.b.h, 1536, fwb.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fwb.a bV = a("gui_text_highlight", esf.n, esm.b.h, 1536, fwb.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fwb.a bW = a("gui_ghost_recipe_overlay", esf.n, esm.b.h, 1536, fwb.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fwb> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final esm bY;
   private final esm.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fwb> cd;

   public static fwb c() {
      return aY;
   }

   public static fwb d() {
      return aZ;
   }

   public static fwb e() {
      return ba;
   }

   private static fwb.b a(fwa.m $$0) {
      return fwb.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fwb f() {
      return bb;
   }

   private static fwb.b O() {
      return fwb.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fwb g() {
      return bc;
   }

   private static fwb.a a(String $$0, aiy $$1, boolean $$2) {
      fwb.b $$3 = fwb.b.a().a(u).a(new fwa.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, esf.k, esm.b.h, 1536, true, false, $$3);
   }

   public static fwb a(aiy $$0) {
      return bd.apply($$0);
   }

   public static fwb b(aiy $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fwb c(aiy $$0) {
      return be.apply($$0);
   }

   public static fwb d(aiy $$0) {
      return bf.apply($$0);
   }

   public static fwb a(aiy $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fwb e(aiy $$0) {
      return a($$0, true);
   }

   public static fwb b(aiy $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fwb f(aiy $$0) {
      return b($$0, true);
   }

   public static fwb g(aiy $$0) {
      return bi.apply($$0);
   }

   public static fwb h(aiy $$0) {
      return bj.apply($$0);
   }

   public static fwb c(aiy $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fwb i(aiy $$0) {
      return c($$0, true);
   }

   public static fwb d(aiy $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fwb j(aiy $$0) {
      return d($$0, true);
   }

   public static fwb k(aiy $$0) {
      return bm.apply($$0);
   }

   public static fwb e(aiy $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fwb l(aiy $$0) {
      return bo.apply($$0);
   }

   public static fwb m(aiy $$0) {
      return bp.apply($$0);
   }

   public static fwb n(aiy $$0) {
      return bq.apply($$0);
   }

   public static fwb o(aiy $$0) {
      return br.apply($$0);
   }

   public static fwb p(aiy $$0) {
      return bs.apply($$0, d);
   }

   public static fwb q(aiy $$0) {
      return bl.apply($$0, false);
   }

   public static fwb a(aiy $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         esf.k,
         esm.b.h,
         1536,
         false,
         true,
         fwb.b.a().a(al).a(new fwa.n($$0, false, false)).a(new fwa.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fwb b(aiy $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         esf.k,
         esm.b.h,
         1536,
         false,
         true,
         fwb.b.a().a(K).a(new fwa.n($$0, false, false)).a(new fwa.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fwb h() {
      return bt;
   }

   public static fwb i() {
      return bu;
   }

   public static fwb r(aiy $$0) {
      return fwb.a.aX.apply($$0, ax);
   }

   public static fwb j() {
      return bv;
   }

   public static fwb k() {
      return bw;
   }

   public static fwb l() {
      return bx;
   }

   public static fwb m() {
      return by;
   }

   public static fwb n() {
      return bz;
   }

   public static fwb o() {
      return bA;
   }

   public static fwb p() {
      return bB;
   }

   public static fwb s(aiy $$0) {
      return bC.apply($$0);
   }

   public static fwb t(aiy $$0) {
      return bD.apply($$0);
   }

   public static fwb q() {
      return bE;
   }

   public static fwb u(aiy $$0) {
      return bF.apply($$0);
   }

   public static fwb v(aiy $$0) {
      return bG.apply($$0);
   }

   public static fwb w(aiy $$0) {
      return bH.apply($$0);
   }

   public static fwb x(aiy $$0) {
      return bI.apply($$0);
   }

   public static fwb r() {
      return bJ;
   }

   public static fwb y(aiy $$0) {
      return bK.apply($$0);
   }

   public static fwb s() {
      return bL;
   }

   private static fwb.b P() {
      return fwb.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fwb t() {
      return bM;
   }

   public static fwb u() {
      return bN;
   }

   public static fwb v() {
      return bO;
   }

   public static fwb w() {
      return aV;
   }

   public static fwb x() {
      return aW;
   }

   public static fwb a(double $$0) {
      return bP.apply($$0);
   }

   public static fwb y() {
      return bQ;
   }

   public static fwb z() {
      return bR;
   }

   public static fwb A() {
      return bS;
   }

   public static fwb B() {
      return bT;
   }

   public static fwb C() {
      return bU;
   }

   public static fwb D() {
      return bV;
   }

   public static fwb E() {
      return bW;
   }

   public fwb(String $$0, esm $$1, esm.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fwb.a a(String $$0, esm $$1, esm.b $$2, int $$3, fwb.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fwb.a a(String $$0, esm $$1, esm.b $$2, int $$3, boolean $$4, boolean $$5, fwb.b $$6) {
      return new fwb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(esc $$0, esp $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         esc.b $$2 = $$0.d();
         this.a();
         esd.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fwb> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public esm H() {
      return this.bY;
   }

   public esm.b I() {
      return this.bZ;
   }

   public Optional<fwb> J() {
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

   public Optional<fwb> N() {
      return this.cd;
   }

   static final class a extends fwb {
      static final BiFunction<aiy, fwa.c, fwb> aX = ac.a(
         ($$0, $$1) -> fwb.a("outline", esf.r, esm.b.h, 1536, fwb.b.a().a(N).a(new fwa.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fwb.c.b))
      );
      private final fwb.b aY;
      private final Optional<fwb> aZ;
      private final boolean ba;

      a(String $$0, esm $$1, esm.b $$2, int $$3, boolean $$4, boolean $$5, fwb.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fwa::a), () -> $$6.o.forEach(fwa::b));
         this.aY = $$6;
         this.aZ = $$6.n == fwb.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fwb.c.b;
      }

      @Override
      public Optional<fwb> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fwb.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fwa.e a;
      private final fwa.m b;
      private final fwa.p c;
      private final fwa.d d;
      final fwa.c e;
      private final fwa.g f;
      private final fwa.l g;
      private final fwa.f h;
      private final fwa.k i;
      private final fwa.o j;
      private final fwa.q k;
      private final fwa.h l;
      private final fwa.b m;
      final fwb.c n;
      final ImmutableList<fwa> o;

      b(
         fwa.e $$0,
         fwa.m $$1,
         fwa.p $$2,
         fwa.d $$3,
         fwa.c $$4,
         fwa.g $$5,
         fwa.l $$6,
         fwa.f $$7,
         fwa.k $$8,
         fwa.o $$9,
         fwa.q $$10,
         fwa.h $$11,
         fwa.b $$12,
         fwb.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fwa[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fwb.b.a a() {
         return new fwb.b.a();
      }

      public static class a {
         private fwa.e a = fwa.ao;
         private fwa.m b = fwa.i;
         private fwa.p c;
         private fwa.d d;
         private fwa.c e;
         private fwa.g f;
         private fwa.l g;
         private fwa.f h;
         private fwa.k i;
         private fwa.o j;
         private fwa.q k;
         private fwa.h l;
         private fwa.b m;

         a() {
            this.c = fwa.c;
            this.d = fwa.aA;
            this.e = fwa.aw;
            this.f = fwa.at;
            this.g = fwa.av;
            this.h = fwa.aF;
            this.i = fwa.aI;
            this.j = fwa.ap;
            this.k = fwa.aC;
            this.l = fwa.aP;
            this.m = fwa.aQ;
         }

         public fwb.b.a a(fwa.e $$0) {
            this.a = $$0;
            return this;
         }

         public fwb.b.a a(fwa.m $$0) {
            this.b = $$0;
            return this;
         }

         public fwb.b.a a(fwa.p $$0) {
            this.c = $$0;
            return this;
         }

         public fwb.b.a a(fwa.d $$0) {
            this.d = $$0;
            return this;
         }

         public fwb.b.a a(fwa.c $$0) {
            this.e = $$0;
            return this;
         }

         public fwb.b.a a(fwa.g $$0) {
            this.f = $$0;
            return this;
         }

         public fwb.b.a a(fwa.l $$0) {
            this.g = $$0;
            return this;
         }

         public fwb.b.a a(fwa.f $$0) {
            this.h = $$0;
            return this;
         }

         public fwb.b.a a(fwa.k $$0) {
            this.i = $$0;
            return this;
         }

         public fwb.b.a a(fwa.o $$0) {
            this.j = $$0;
            return this;
         }

         public fwb.b.a a(fwa.q $$0) {
            this.k = $$0;
            return this;
         }

         public fwb.b.a a(fwa.h $$0) {
            this.l = $$0;
            return this;
         }

         public fwb.b.a a(fwa.b $$0) {
            this.m = $$0;
            return this;
         }

         public fwb.b a(boolean $$0) {
            return this.a($$0 ? fwb.c.c : fwb.c.a);
         }

         public fwb.b a(fwb.c $$0) {
            return new fwb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
