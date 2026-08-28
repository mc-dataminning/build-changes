import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gfb extends gfa {
   private static final int aV = 1048576;
   public static final int aQ = 4194304;
   public static final int aR = 786432;
   public static final int aS = 1536;
   private static final gfb aW = a("solid", fba.b, fbh.c.h, 4194304, true, false, gfb.b.a().a(aq).a(o).a(ak).a(true));
   private static final gfb aX = a("cutout_mipped", fba.b, fbh.c.h, 4194304, true, false, gfb.b.a().a(aq).a(p).a(ak).a(true));
   private static final gfb aY = a("cutout", fba.b, fbh.c.h, 786432, true, false, gfb.b.a().a(aq).a(q).a(al).a(true));
   private static final gfb aZ = a("translucent", fba.b, fbh.c.h, 786432, true, true, a(r));
   private static final gfb ba = a("translucent_moving_block", fba.b, fbh.c.h, 786432, false, true, O());
   private static final Function<akq, gfb> bb = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akq, gfb> bc = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(u).a(new gfa.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_solid", fba.c, fbh.c.h, 1536, true, false, $$1);
   });
   private static final Function<akq, gfb> bd = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(v).a(new gfa.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_cutout", fba.c, fbh.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akq, Boolean, gfb> be = ad.a(($$0, $$1) -> {
      gfb.b $$2 = gfb.b.a().a(w).a(new gfa.n($$0, false, false)).a(c).a(av).a(aq).a(as).a($$1);
      return a("entity_cutout_no_cull", fba.c, fbh.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akq, Boolean, gfb> bf = ad.a(($$0, $$1) -> {
      gfb.b $$2 = gfb.b.a().a(x).a(new gfa.n($$0, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$1);
      return a("entity_cutout_no_cull_z_offset", fba.c, fbh.c.h, 1536, true, false, $$2);
   });
   private static final Function<akq, gfb> bg = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(y).a(new gfa.n($$0, false, false)).a(h).a(aM).a(aq).a(as).a(gfa.aA).a(true);
      return a("item_entity_translucent_cull", fba.c, fbh.c.h, 1536, true, true, $$1);
   });
   private static final Function<akq, gfb> bh = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(z).a(new gfa.n($$0, false, false)).a(h).a(aq).a(as).a(true);
      return a("entity_translucent_cull", fba.c, fbh.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akq, Boolean, gfb> bi = ad.a(($$0, $$1) -> {
      gfb.b $$2 = gfb.b.a().a(A).a(new gfa.n($$0, false, false)).a(h).a(av).a(aq).a(as).a($$1);
      return a("entity_translucent", fba.c, fbh.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akq, Boolean, gfb> bj = ad.a(($$0, $$1) -> {
      gfb.b $$2 = gfb.b.a().a(B).a(new gfa.n($$0, false, false)).a(h).a(av).a(aB).a(as).a($$1);
      return a("entity_translucent_emissive", fba.c, fbh.c.h, 1536, true, true, $$2);
   });
   private static final Function<akq, gfb> bk = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(C).a(new gfa.n($$0, false, false)).a(av).a(aq).a(true);
      return a("entity_smooth_cutout", fba.c, fbh.c.h, 1536, $$1);
   });
   private static final BiFunction<akq, Boolean, gfb> bl = ad.a(($$0, $$1) -> {
      gfb.b $$2 = gfb.b.a().a(D).a(new gfa.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aB : aA).a(false);
      return a("beacon_beam", fba.b, fbh.c.h, 1536, false, true, $$2);
   });
   private static final Function<akq, gfb> bm = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(E).a(new gfa.n($$0, false, false)).a(ax).a(av).a(aq).a(as).a(false);
      return a("entity_decal", fba.c, fbh.c.h, 1536, $$1);
   });
   private static final Function<akq, gfb> bn = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(F).a(new gfa.n($$0, false, false)).a(h).a(av).a(aq).a(as).a(aB).a(false);
      return a("entity_no_outline", fba.c, fbh.c.h, 1536, false, true, $$1);
   });
   private static final Function<akq, gfb> bo = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(G).a(new gfa.n($$0, false, false)).a(h).a(au).a(aq).a(as).a(aB).a(ay).a(aF).a(false);
      return a("entity_shadow", fba.c, fbh.c.h, 1536, false, false, $$1);
   });
   private static final Function<akq, gfb> bp = ad.b($$0 -> {
      gfb.b $$1 = gfb.b.a().a(H).a(new gfa.n($$0, false, false)).a(av).a(true);
      return a("entity_alpha", fba.c, fbh.c.h, 1536, $$1);
   });
   private static final BiFunction<akq, gfa.p, gfb> bq = ad.a(($$0, $$1) -> {
      gfa.n $$2 = new gfa.n($$0, false, false);
      return a("eyes", fba.c, fbh.c.h, 1536, false, true, gfb.b.a().a(I).a($$2).a($$1).a(aB).a(false));
   });
   private static final gfb br = a("leash", fba.h, fbh.c.f, 1536, gfb.b.a().a(K).a(am).a(av).a(aq).a(false));
   private static final gfb bs = a("water_mask", fba.e, fbh.c.h, 1536, gfb.b.a().a(L).a(am).a(aC).a(false));
   private static final gfb bt = a(
      "armor_entity_glint", fba.i, fbh.c.h, 1536, gfb.b.a().a(N).a(new gfa.n(glb.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(aF).a(false)
   );
   private static final gfb bu = a(
      "glint_translucent", fba.i, fbh.c.h, 1536, gfb.b.a().a(O).a(new gfa.n(glb.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(aM).a(false)
   );
   private static final gfb bv = a("glint", fba.i, fbh.c.h, 1536, gfb.b.a().a(P).a(new gfa.n(glb.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(false));
   private static final gfb bw = a(
      "entity_glint", fba.i, fbh.c.h, 1536, gfb.b.a().a(Q).a(new gfa.n(glb.a, true, false)).a(aB).a(av).a(ax).a(f).a(aM).a(ap).a(false)
   );
   private static final gfb bx = a(
      "entity_glint_direct", fba.i, fbh.c.h, 1536, gfb.b.a().a(R).a(new gfa.n(glb.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(false)
   );
   private static final Function<akq, gfb> by = ad.b($$0 -> {
      gfa.n $$1 = new gfa.n($$0, false, false);
      return a("crumbling", fba.b, fbh.c.h, 1536, false, true, gfb.b.a().a(S).a($$1).a(g).a(aB).a(aE).a(false));
   });
   private static final Function<akq, gfb> bz = ad.b(
      $$0 -> a("text", fba.k, fbh.c.h, 786432, false, true, gfb.b.a().a(T).a(new gfa.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final gfb bA = a("text_background", fba.h, fbh.c.h, 1536, false, true, gfb.b.a().a(U).a(am).a(h).a(aq).a(false));
   private static final Function<akq, gfb> bB = ad.b(
      $$0 -> a("text_intensity", fba.k, fbh.c.h, 786432, false, true, gfb.b.a().a(V).a(new gfa.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final Function<akq, gfb> bC = ad.b(
      $$0 -> a("text_polygon_offset", fba.k, fbh.c.h, 1536, false, true, gfb.b.a().a(T).a(new gfa.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akq, gfb> bD = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fba.k, fbh.c.h, 1536, false, true, gfb.b.a().a(V).a(new gfa.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akq, gfb> bE = ad.b(
      $$0 -> a("text_see_through", fba.k, fbh.c.h, 1536, false, true, gfb.b.a().a(W).a(new gfa.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gfb bF = a("text_background_see_through", fba.h, fbh.c.h, 1536, false, true, gfb.b.a().a(X).a(am).a(h).a(aq).a(aw).a(aB).a(false));
   private static final Function<akq, gfb> bG = ad.b(
      $$0 -> a("text_intensity_see_through", fba.k, fbh.c.h, 1536, false, true, gfb.b.a().a(Y).a(new gfa.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gfb bH = a("lightning", fba.f, fbh.c.h, 1536, false, true, gfb.b.a().a(Z).a(aA).a(e).a(aK).a(false));
   private static final gfb bI = a("tripwire", fba.b, fbh.c.h, 1536, true, true, P());
   private static final gfb bJ = a(
      "end_portal", fba.e, fbh.c.h, 1536, false, false, gfb.b.a().a(ab).a(gfa.i.d().a(ghm.a, false, false).a(ghm.b, false, false).a()).a(false)
   );
   private static final gfb bK = a(
      "end_gateway", fba.e, fbh.c.h, 1536, false, false, gfb.b.a().a(ac).a(gfa.i.d().a(ghm.a, false, false).a(ghm.b, false, false).a()).a(false)
   );
   private static final gfb bL = a(false);
   private static final gfb bM = a(true);
   public static final gfb.a aT = a("lines", fba.g, fbh.c.a, 1536, gfb.b.a().a(ae).a(new gfa.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false));
   public static final gfb.a aU = a(
      "line_strip", fba.g, fbh.c.b, 1536, gfb.b.a().a(ae).a(new gfa.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false)
   );
   private static final Function<Double, gfb.a> bN = ad.b(
      $$0 -> a("debug_line_strip", fba.f, fbh.c.d, 1536, gfb.b.a().a(n).a(new gfa.h(OptionalDouble.of($$0))).a(c).a(av).a(false))
   );
   private static final gfb.a bO = a("debug_filled_box", fba.f, fbh.c.f, 1536, false, true, gfb.b.a().a(n).a(aF).a(h).a(false));
   private static final gfb.a bP = a("debug_quads", fba.f, fbh.c.h, 1536, false, true, gfb.b.a().a(n).a(h).a(av).a(false));
   private static final gfb.a bQ = a("debug_section_quads", fba.f, fbh.c.h, 1536, false, true, gfb.b.a().a(n).a(aF).a(h).a(au).a(false));
   private static final gfb.a bR = a("gui", fba.f, fbh.c.h, 786432, gfb.b.a().a(af).a(h).a(ay).a(false));
   private static final gfb.a bS = a("gui_overlay", fba.f, fbh.c.h, 1536, gfb.b.a().a(ag).a(h).a(aw).a(aB).a(false));
   private static final gfb.a bT = a("gui_text_highlight", fba.f, fbh.c.h, 1536, gfb.b.a().a(ah).a(h).a(aw).a(aP).a(false));
   private static final gfb.a bU = a("gui_ghost_recipe_overlay", fba.f, fbh.c.h, 1536, gfb.b.a().a(ai).a(h).a(az).a(aB).a(false));
   private static final ImmutableList<gfb> bV = ImmutableList.of(c(), d(), e(), f(), r());
   private final fbh bW;
   private final fbh.c bX;
   private final int bY;
   private final boolean bZ;
   private final boolean ca;

   public static gfb c() {
      return aW;
   }

   public static gfb d() {
      return aX;
   }

   public static gfb e() {
      return aY;
   }

   private static gfb.b a(gfa.m $$0) {
      return gfb.b.a().a(aq).a($$0).a(ak).a(h).a(aI).a(true);
   }

   public static gfb f() {
      return aZ;
   }

   private static gfb.b O() {
      return gfb.b.a().a(aq).a(s).a(ak).a(h).a(aM).a(true);
   }

   public static gfb g() {
      return ba;
   }

   private static gfb.a a(String $$0, akq $$1, boolean $$2) {
      gfb.b $$3 = gfb.b.a().a(t).a(new gfa.n($$1, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$2 ? ax : ay).a(true);
      return a($$0, fba.c, fbh.c.h, 1536, true, false, $$3);
   }

   public static gfb a(akq $$0) {
      return bb.apply($$0);
   }

   public static gfb b(akq $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gfb c(akq $$0) {
      return bc.apply($$0);
   }

   public static gfb d(akq $$0) {
      return bd.apply($$0);
   }

   public static gfb a(akq $$0, boolean $$1) {
      return be.apply($$0, $$1);
   }

   public static gfb e(akq $$0) {
      return a($$0, true);
   }

   public static gfb b(akq $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static gfb f(akq $$0) {
      return b($$0, true);
   }

   public static gfb g(akq $$0) {
      return bg.apply($$0);
   }

   public static gfb h(akq $$0) {
      return bh.apply($$0);
   }

   public static gfb c(akq $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gfb i(akq $$0) {
      return c($$0, true);
   }

   public static gfb d(akq $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gfb j(akq $$0) {
      return d($$0, true);
   }

   public static gfb k(akq $$0) {
      return bk.apply($$0);
   }

   public static gfb e(akq $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gfb l(akq $$0) {
      return bm.apply($$0);
   }

   public static gfb m(akq $$0) {
      return bn.apply($$0);
   }

   public static gfb n(akq $$0) {
      return bo.apply($$0);
   }

   public static gfb o(akq $$0) {
      return bp.apply($$0);
   }

   public static gfb p(akq $$0) {
      return bq.apply($$0, d);
   }

   public static gfb q(akq $$0) {
      return bj.apply($$0, false);
   }

   public static gfb a(akq $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fba.c,
         fbh.c.h,
         1536,
         false,
         true,
         gfb.b.a().a(aj).a(new gfa.n($$0, false, false)).a(new gfa.j($$1, $$2)).a(h).a(av).a(aq).a(at).a(false)
      );
   }

   public static gfb b(akq $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fba.c,
         fbh.c.h,
         1536,
         false,
         true,
         gfb.b.a().a(J).a(new gfa.n($$0, false, false)).a(new gfa.j($$1, $$2)).a(d).a(av).a(aq).a(as).a(false)
      );
   }

   public static gfb h() {
      return br;
   }

   public static gfb i() {
      return bs;
   }

   public static gfb r(akq $$0) {
      return gfb.a.aV.apply($$0, av);
   }

   public static gfb j() {
      return bt;
   }

   public static gfb k() {
      return bu;
   }

   public static gfb l() {
      return bv;
   }

   public static gfb m() {
      return bw;
   }

   public static gfb n() {
      return bx;
   }

   public static gfb s(akq $$0) {
      return by.apply($$0);
   }

   public static gfb t(akq $$0) {
      return bz.apply($$0);
   }

   public static gfb o() {
      return bA;
   }

   public static gfb u(akq $$0) {
      return bB.apply($$0);
   }

   public static gfb v(akq $$0) {
      return bC.apply($$0);
   }

   public static gfb w(akq $$0) {
      return bD.apply($$0);
   }

   public static gfb x(akq $$0) {
      return bE.apply($$0);
   }

   public static gfb p() {
      return bF;
   }

   public static gfb y(akq $$0) {
      return bG.apply($$0);
   }

   public static gfb q() {
      return bH;
   }

   private static gfb.b P() {
      return gfb.b.a().a(aq).a(aa).a(ak).a(h).a(aK).a(true);
   }

   public static gfb r() {
      return bI;
   }

   public static gfb s() {
      return bJ;
   }

   public static gfb t() {
      return bK;
   }

   private static gfb.a a(boolean $$0) {
      return a("clouds", fba.m, fbh.c.h, 786432, false, false, gfb.b.a().a(ad).a(new gfa.n(ger.c, false, false)).a(h).a(av).a($$0 ? aC : aA).a(aL).a(true));
   }

   public static gfb u() {
      return bL;
   }

   public static gfb v() {
      return bM;
   }

   public static gfb w() {
      return aT;
   }

   public static gfb x() {
      return aU;
   }

   public static gfb a(double $$0) {
      return bN.apply($$0);
   }

   public static gfb y() {
      return bO;
   }

   public static gfb z() {
      return bP;
   }

   public static gfb A() {
      return bQ;
   }

   public static gfb B() {
      return bR;
   }

   public static gfb C() {
      return bS;
   }

   public static gfb D() {
      return bT;
   }

   public static gfb E() {
      return bU;
   }

   public gfb(String $$0, fbh $$1, fbh.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bW = $$1;
      this.bX = $$2;
      this.bY = $$3;
      this.bZ = $$4;
      this.ca = $$5;
   }

   static gfb.a a(String $$0, fbh $$1, fbh.c $$2, int $$3, gfb.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gfb.a a(String $$0, fbh $$1, fbh.c $$2, int $$3, boolean $$4, boolean $$5, gfb.b $$6) {
      return new gfb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fbb $$0) {
      this.a();
      fay.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gfb> F() {
      return bV;
   }

   public int G() {
      return this.bY;
   }

   public fbh H() {
      return this.bW;
   }

   public fbh.c I() {
      return this.bX;
   }

   public Optional<gfb> J() {
      return Optional.empty();
   }

   public boolean K() {
      return false;
   }

   public boolean L() {
      return this.bZ;
   }

   public boolean M() {
      return !this.bX.l;
   }

   public boolean N() {
      return this.ca;
   }

   static final class a extends gfb {
      static final BiFunction<akq, gfa.c, gfb> aV = ad.a(
         ($$0, $$1) -> gfb.a("outline", fba.j, fbh.c.h, 1536, gfb.b.a().a(M).a(new gfa.n($$0, false, false)).a($$1).a(aw).a(aH).a(gfb.c.b))
      );
      private final gfb.b aW;
      private final Optional<gfb> aX;
      private final boolean aY;

      a(String $$0, fbh $$1, fbh.c $$2, int $$3, boolean $$4, boolean $$5, gfb.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gfa::a), () -> $$6.o.forEach(gfa::b));
         this.aW = $$6;
         this.aX = $$6.n == gfb.c.c ? $$6.a.c().map($$1x -> aV.apply($$1x, $$6.e)) : Optional.empty();
         this.aY = $$6.n == gfb.c.b;
      }

      @Override
      public Optional<gfb> J() {
         return this.aX;
      }

      @Override
      public boolean K() {
         return this.aY;
      }

      protected final gfb.b O() {
         return this.aW;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aW + "]";
      }
   }

   protected static final class b {
      final gfa.e a;
      private final gfa.m b;
      private final gfa.p c;
      private final gfa.d d;
      final gfa.c e;
      private final gfa.g f;
      private final gfa.l g;
      private final gfa.f h;
      private final gfa.k i;
      private final gfa.o j;
      private final gfa.q k;
      private final gfa.h l;
      private final gfa.b m;
      final gfb.c n;
      final ImmutableList<gfa> o;

      b(
         gfa.e $$0,
         gfa.m $$1,
         gfa.p $$2,
         gfa.d $$3,
         gfa.c $$4,
         gfa.g $$5,
         gfa.l $$6,
         gfa.f $$7,
         gfa.k $$8,
         gfa.o $$9,
         gfa.q $$10,
         gfa.h $$11,
         gfa.b $$12,
         gfb.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gfa[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gfb.b.a a() {
         return new gfb.b.a();
      }

      public static class a {
         private gfa.e a = gfa.am;
         private gfa.m b = gfa.i;
         private gfa.p c;
         private gfa.d d;
         private gfa.c e;
         private gfa.g f;
         private gfa.l g;
         private gfa.f h;
         private gfa.k i;
         private gfa.o j;
         private gfa.q k;
         private gfa.h l;
         private gfa.b m;

         a() {
            this.c = gfa.c;
            this.d = gfa.ay;
            this.e = gfa.au;
            this.f = gfa.ar;
            this.g = gfa.at;
            this.h = gfa.aD;
            this.i = gfa.aG;
            this.j = gfa.an;
            this.k = gfa.aA;
            this.l = gfa.aN;
            this.m = gfa.aO;
         }

         public gfb.b.a a(gfa.e $$0) {
            this.a = $$0;
            return this;
         }

         public gfb.b.a a(gfa.m $$0) {
            this.b = $$0;
            return this;
         }

         public gfb.b.a a(gfa.p $$0) {
            this.c = $$0;
            return this;
         }

         public gfb.b.a a(gfa.d $$0) {
            this.d = $$0;
            return this;
         }

         public gfb.b.a a(gfa.c $$0) {
            this.e = $$0;
            return this;
         }

         public gfb.b.a a(gfa.g $$0) {
            this.f = $$0;
            return this;
         }

         public gfb.b.a a(gfa.l $$0) {
            this.g = $$0;
            return this;
         }

         public gfb.b.a a(gfa.f $$0) {
            this.h = $$0;
            return this;
         }

         public gfb.b.a a(gfa.k $$0) {
            this.i = $$0;
            return this;
         }

         public gfb.b.a a(gfa.o $$0) {
            this.j = $$0;
            return this;
         }

         public gfb.b.a a(gfa.q $$0) {
            this.k = $$0;
            return this;
         }

         public gfb.b.a a(gfa.h $$0) {
            this.l = $$0;
            return this;
         }

         public gfb.b.a a(gfa.b $$0) {
            this.m = $$0;
            return this;
         }

         public gfb.b a(boolean $$0) {
            return this.a($$0 ? gfb.c.c : gfb.c.a);
         }

         public gfb.b a(gfb.c $$0) {
            return new gfb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
