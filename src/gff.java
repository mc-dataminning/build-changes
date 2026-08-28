import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gff extends gfe {
   private static final int aV = 1048576;
   public static final int aQ = 4194304;
   public static final int aR = 786432;
   public static final int aS = 1536;
   private static final gff aW = a("solid", fbe.b, fbl.c.h, 4194304, true, false, gff.b.a().a(aq).a(o).a(ak).a(true));
   private static final gff aX = a("cutout_mipped", fbe.b, fbl.c.h, 4194304, true, false, gff.b.a().a(aq).a(p).a(ak).a(true));
   private static final gff aY = a("cutout", fbe.b, fbl.c.h, 786432, true, false, gff.b.a().a(aq).a(q).a(al).a(true));
   private static final gff aZ = a("translucent", fbe.b, fbl.c.h, 786432, true, true, a(r));
   private static final gff ba = a("translucent_moving_block", fbe.b, fbl.c.h, 786432, false, true, Q());
   private static final Function<akr, gff> bb = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akr, gff> bc = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(u).a(new gfe.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_solid", fbe.c, fbl.c.h, 1536, true, false, $$1);
   });
   private static final Function<akr, gff> bd = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(v).a(new gfe.n($$0, false, false)).a(c).a(aq).a(as).a(true);
      return a("entity_cutout", fbe.c, fbl.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akr, Boolean, gff> be = ad.a(($$0, $$1) -> {
      gff.b $$2 = gff.b.a().a(w).a(new gfe.n($$0, false, false)).a(c).a(av).a(aq).a(as).a($$1);
      return a("entity_cutout_no_cull", fbe.c, fbl.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akr, Boolean, gff> bf = ad.a(($$0, $$1) -> {
      gff.b $$2 = gff.b.a().a(x).a(new gfe.n($$0, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$1);
      return a("entity_cutout_no_cull_z_offset", fbe.c, fbl.c.h, 1536, true, false, $$2);
   });
   private static final Function<akr, gff> bg = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(y).a(new gfe.n($$0, false, false)).a(h).a(aM).a(aq).a(as).a(gfe.aA).a(true);
      return a("item_entity_translucent_cull", fbe.c, fbl.c.h, 1536, true, true, $$1);
   });
   private static final Function<akr, gff> bh = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(z).a(new gfe.n($$0, false, false)).a(h).a(aq).a(as).a(true);
      return a("entity_translucent_cull", fbe.c, fbl.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akr, Boolean, gff> bi = ad.a(($$0, $$1) -> {
      gff.b $$2 = gff.b.a().a(A).a(new gfe.n($$0, false, false)).a(h).a(av).a(aq).a(as).a($$1);
      return a("entity_translucent", fbe.c, fbl.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akr, Boolean, gff> bj = ad.a(($$0, $$1) -> {
      gff.b $$2 = gff.b.a().a(B).a(new gfe.n($$0, false, false)).a(h).a(av).a(aB).a(as).a($$1);
      return a("entity_translucent_emissive", fbe.c, fbl.c.h, 1536, true, true, $$2);
   });
   private static final Function<akr, gff> bk = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(C).a(new gfe.n($$0, false, false)).a(av).a(aq).a(true);
      return a("entity_smooth_cutout", fbe.c, fbl.c.h, 1536, $$1);
   });
   private static final BiFunction<akr, Boolean, gff> bl = ad.a(($$0, $$1) -> {
      gff.b $$2 = gff.b.a().a(D).a(new gfe.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aB : aA).a(false);
      return a("beacon_beam", fbe.b, fbl.c.h, 1536, false, true, $$2);
   });
   private static final Function<akr, gff> bm = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(E).a(new gfe.n($$0, false, false)).a(ax).a(av).a(aq).a(as).a(false);
      return a("entity_decal", fbe.c, fbl.c.h, 1536, $$1);
   });
   private static final Function<akr, gff> bn = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(F).a(new gfe.n($$0, false, false)).a(h).a(av).a(aq).a(as).a(aB).a(false);
      return a("entity_no_outline", fbe.c, fbl.c.h, 1536, false, true, $$1);
   });
   private static final Function<akr, gff> bo = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(G).a(new gfe.n($$0, false, false)).a(h).a(au).a(aq).a(as).a(aB).a(ay).a(aF).a(false);
      return a("entity_shadow", fbe.c, fbl.c.h, 1536, false, false, $$1);
   });
   private static final Function<akr, gff> bp = ad.b($$0 -> {
      gff.b $$1 = gff.b.a().a(H).a(new gfe.n($$0, false, false)).a(av).a(true);
      return a("entity_alpha", fbe.c, fbl.c.h, 1536, $$1);
   });
   private static final BiFunction<akr, gfe.p, gff> bq = ad.a(($$0, $$1) -> {
      gfe.n $$2 = new gfe.n($$0, false, false);
      return a("eyes", fbe.c, fbl.c.h, 1536, false, true, gff.b.a().a(I).a($$2).a($$1).a(aB).a(false));
   });
   private static final gff br = a("leash", fbe.h, fbl.c.f, 1536, gff.b.a().a(K).a(am).a(av).a(aq).a(false));
   private static final gff bs = a("water_mask", fbe.e, fbl.c.h, 1536, gff.b.a().a(L).a(am).a(aC).a(false));
   private static final gff bt = a(
      "armor_entity_glint", fbe.i, fbl.c.h, 1536, gff.b.a().a(N).a(new gfe.n(glf.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(aF).a(false)
   );
   private static final gff bu = a(
      "glint_translucent", fbe.i, fbl.c.h, 1536, gff.b.a().a(O).a(new gfe.n(glf.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(aM).a(false)
   );
   private static final gff bv = a("glint", fbe.i, fbl.c.h, 1536, gff.b.a().a(P).a(new gfe.n(glf.b, true, false)).a(aB).a(av).a(ax).a(f).a(ao).a(false));
   private static final gff bw = a(
      "entity_glint", fbe.i, fbl.c.h, 1536, gff.b.a().a(Q).a(new gfe.n(glf.a, true, false)).a(aB).a(av).a(ax).a(f).a(aM).a(ap).a(false)
   );
   private static final gff bx = a(
      "entity_glint_direct", fbe.i, fbl.c.h, 1536, gff.b.a().a(R).a(new gfe.n(glf.a, true, false)).a(aB).a(av).a(ax).a(f).a(ap).a(false)
   );
   private static final Function<akr, gff> by = ad.b($$0 -> {
      gfe.n $$1 = new gfe.n($$0, false, false);
      return a("crumbling", fbe.b, fbl.c.h, 1536, false, true, gff.b.a().a(S).a($$1).a(g).a(aB).a(aE).a(false));
   });
   private static final Function<akr, gff> bz = ad.b(
      $$0 -> a("text", fbe.k, fbl.c.h, 786432, false, true, gff.b.a().a(T).a(new gfe.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final gff bA = a("text_background", fbe.h, fbl.c.h, 1536, false, true, gff.b.a().a(U).a(am).a(h).a(aq).a(false));
   private static final Function<akr, gff> bB = ad.b(
      $$0 -> a("text_intensity", fbe.k, fbl.c.h, 786432, false, true, gff.b.a().a(V).a(new gfe.n($$0, false, false)).a(h).a(aq).a(false))
   );
   private static final Function<akr, gff> bC = ad.b(
      $$0 -> a("text_polygon_offset", fbe.k, fbl.c.h, 1536, false, true, gff.b.a().a(T).a(new gfe.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akr, gff> bD = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fbe.k, fbl.c.h, 1536, false, true, gff.b.a().a(V).a(new gfe.n($$0, false, false)).a(h).a(aq).a(aE).a(false))
   );
   private static final Function<akr, gff> bE = ad.b(
      $$0 -> a("text_see_through", fbe.k, fbl.c.h, 1536, false, true, gff.b.a().a(W).a(new gfe.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gff bF = a("text_background_see_through", fbe.h, fbl.c.h, 1536, false, true, gff.b.a().a(X).a(am).a(h).a(aq).a(aw).a(aB).a(false));
   private static final Function<akr, gff> bG = ad.b(
      $$0 -> a("text_intensity_see_through", fbe.k, fbl.c.h, 1536, false, true, gff.b.a().a(Y).a(new gfe.n($$0, false, false)).a(h).a(aq).a(aw).a(aB).a(false))
   );
   private static final gff bH = a("lightning", fbe.f, fbl.c.h, 1536, false, true, gff.b.a().a(Z).a(aA).a(e).a(aK).a(false));
   private static final gff bI = a("dragon_rays", fbe.f, fbl.c.e, 1536, false, false, gff.b.a().a(Z).a(aB).a(e).a(aK).a(false));
   private static final gff bJ = a("tripwire", fbe.b, fbl.c.h, 1536, true, true, R());
   private static final gff bK = a(
      "end_portal", fbe.e, fbl.c.h, 1536, false, false, gff.b.a().a(ab).a(gfe.i.d().a(ghq.a, false, false).a(ghq.b, false, false).a()).a(false)
   );
   private static final gff bL = a(
      "end_gateway", fbe.e, fbl.c.h, 1536, false, false, gff.b.a().a(ac).a(gfe.i.d().a(ghq.a, false, false).a(ghq.b, false, false).a()).a(false)
   );
   private static final gff bM = a(false);
   private static final gff bN = a(true);
   public static final gff.a aT = a("lines", fbe.g, fbl.c.a, 1536, gff.b.a().a(ae).a(new gfe.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false));
   public static final gff.a aU = a(
      "line_strip", fbe.g, fbl.c.b, 1536, gff.b.a().a(ae).a(new gfe.h(OptionalDouble.empty())).a(aF).a(h).a(aM).a(aA).a(av).a(false)
   );
   private static final Function<Double, gff.a> bO = ad.b(
      $$0 -> a("debug_line_strip", fbe.f, fbl.c.d, 1536, gff.b.a().a(n).a(new gfe.h(OptionalDouble.of($$0))).a(c).a(av).a(false))
   );
   private static final gff.a bP = a("debug_filled_box", fbe.f, fbl.c.f, 1536, false, true, gff.b.a().a(n).a(aF).a(h).a(false));
   private static final gff.a bQ = a("debug_quads", fbe.f, fbl.c.h, 1536, false, true, gff.b.a().a(n).a(h).a(av).a(false));
   private static final gff.a bR = a("debug_structure_quads", fbe.f, fbl.c.h, 1536, false, true, gff.b.a().a(n).a(h).a(av).a(ay).a(aB).a(false));
   private static final gff.a bS = a("debug_section_quads", fbe.f, fbl.c.h, 1536, false, true, gff.b.a().a(n).a(aF).a(h).a(au).a(false));
   private static final gff.a bT = a("gui", fbe.f, fbl.c.h, 786432, gff.b.a().a(af).a(h).a(ay).a(false));
   private static final gff.a bU = a("gui_overlay", fbe.f, fbl.c.h, 1536, gff.b.a().a(ag).a(h).a(aw).a(aB).a(false));
   private static final gff.a bV = a("gui_text_highlight", fbe.f, fbl.c.h, 1536, gff.b.a().a(ah).a(h).a(aw).a(aP).a(false));
   private static final gff.a bW = a("gui_ghost_recipe_overlay", fbe.f, fbl.c.h, 1536, gff.b.a().a(ai).a(h).a(az).a(aB).a(false));
   private static final ImmutableList<gff> bX = ImmutableList.of(c(), d(), e(), f(), s());
   private final fbl bY;
   private final fbl.c bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;

   public static gff c() {
      return aW;
   }

   public static gff d() {
      return aX;
   }

   public static gff e() {
      return aY;
   }

   private static gff.b a(gfe.m $$0) {
      return gff.b.a().a(aq).a($$0).a(ak).a(h).a(aI).a(true);
   }

   public static gff f() {
      return aZ;
   }

   private static gff.b Q() {
      return gff.b.a().a(aq).a(s).a(ak).a(h).a(aM).a(true);
   }

   public static gff g() {
      return ba;
   }

   private static gff.a a(String $$0, akr $$1, boolean $$2) {
      gff.b $$3 = gff.b.a().a(t).a(new gfe.n($$1, false, false)).a(c).a(av).a(aq).a(as).a(aF).a($$2 ? ax : ay).a(true);
      return a($$0, fbe.c, fbl.c.h, 1536, true, false, $$3);
   }

   public static gff a(akr $$0) {
      return bb.apply($$0);
   }

   public static gff b(akr $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gff c(akr $$0) {
      return bc.apply($$0);
   }

   public static gff d(akr $$0) {
      return bd.apply($$0);
   }

   public static gff a(akr $$0, boolean $$1) {
      return be.apply($$0, $$1);
   }

   public static gff e(akr $$0) {
      return a($$0, true);
   }

   public static gff b(akr $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static gff f(akr $$0) {
      return b($$0, true);
   }

   public static gff g(akr $$0) {
      return bg.apply($$0);
   }

   public static gff h(akr $$0) {
      return bh.apply($$0);
   }

   public static gff c(akr $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gff i(akr $$0) {
      return c($$0, true);
   }

   public static gff d(akr $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gff j(akr $$0) {
      return d($$0, true);
   }

   public static gff k(akr $$0) {
      return bk.apply($$0);
   }

   public static gff e(akr $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gff l(akr $$0) {
      return bm.apply($$0);
   }

   public static gff m(akr $$0) {
      return bn.apply($$0);
   }

   public static gff n(akr $$0) {
      return bo.apply($$0);
   }

   public static gff o(akr $$0) {
      return bp.apply($$0);
   }

   public static gff p(akr $$0) {
      return bq.apply($$0, d);
   }

   public static gff q(akr $$0) {
      return bj.apply($$0, false);
   }

   public static gff a(akr $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fbe.c,
         fbl.c.h,
         1536,
         false,
         true,
         gff.b.a().a(aj).a(new gfe.n($$0, false, false)).a(new gfe.j($$1, $$2)).a(h).a(av).a(aq).a(at).a(false)
      );
   }

   public static gff b(akr $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fbe.c,
         fbl.c.h,
         1536,
         false,
         true,
         gff.b.a().a(J).a(new gfe.n($$0, false, false)).a(new gfe.j($$1, $$2)).a(d).a(av).a(aq).a(as).a(false)
      );
   }

   public static gff h() {
      return br;
   }

   public static gff i() {
      return bs;
   }

   public static gff r(akr $$0) {
      return gff.a.aV.apply($$0, av);
   }

   public static gff j() {
      return bt;
   }

   public static gff k() {
      return bu;
   }

   public static gff l() {
      return bv;
   }

   public static gff m() {
      return bw;
   }

   public static gff n() {
      return bx;
   }

   public static gff s(akr $$0) {
      return by.apply($$0);
   }

   public static gff t(akr $$0) {
      return bz.apply($$0);
   }

   public static gff o() {
      return bA;
   }

   public static gff u(akr $$0) {
      return bB.apply($$0);
   }

   public static gff v(akr $$0) {
      return bC.apply($$0);
   }

   public static gff w(akr $$0) {
      return bD.apply($$0);
   }

   public static gff x(akr $$0) {
      return bE.apply($$0);
   }

   public static gff p() {
      return bF;
   }

   public static gff y(akr $$0) {
      return bG.apply($$0);
   }

   public static gff q() {
      return bH;
   }

   public static gff r() {
      return bI;
   }

   private static gff.b R() {
      return gff.b.a().a(aq).a(aa).a(ak).a(h).a(aK).a(true);
   }

   public static gff s() {
      return bJ;
   }

   public static gff t() {
      return bK;
   }

   public static gff u() {
      return bL;
   }

   private static gff.a a(boolean $$0) {
      return a("clouds", fbe.m, fbl.c.h, 786432, false, false, gff.b.a().a(ad).a(new gfe.n(gev.c, false, false)).a(h).a(av).a($$0 ? aC : aA).a(aL).a(true));
   }

   public static gff v() {
      return bM;
   }

   public static gff w() {
      return bN;
   }

   public static gff x() {
      return aT;
   }

   public static gff y() {
      return aU;
   }

   public static gff a(double $$0) {
      return bO.apply($$0);
   }

   public static gff z() {
      return bP;
   }

   public static gff A() {
      return bQ;
   }

   public static gff B() {
      return bR;
   }

   public static gff C() {
      return bS;
   }

   public static gff D() {
      return bT;
   }

   public static gff E() {
      return bU;
   }

   public static gff F() {
      return bV;
   }

   public static gff G() {
      return bW;
   }

   public gff(String $$0, fbl $$1, fbl.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
   }

   static gff.a a(String $$0, fbl $$1, fbl.c $$2, int $$3, gff.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gff.a a(String $$0, fbl $$1, fbl.c $$2, int $$3, boolean $$4, boolean $$5, gff.b $$6) {
      return new gff.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fbf $$0) {
      this.a();
      fbc.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gff> H() {
      return bX;
   }

   public int I() {
      return this.ca;
   }

   public fbl J() {
      return this.bY;
   }

   public fbl.c K() {
      return this.bZ;
   }

   public Optional<gff> L() {
      return Optional.empty();
   }

   public boolean M() {
      return false;
   }

   public boolean N() {
      return this.cb;
   }

   public boolean O() {
      return !this.bZ.l;
   }

   public boolean P() {
      return this.cc;
   }

   static final class a extends gff {
      static final BiFunction<akr, gfe.c, gff> aV = ad.a(
         ($$0, $$1) -> gff.a("outline", fbe.j, fbl.c.h, 1536, gff.b.a().a(M).a(new gfe.n($$0, false, false)).a($$1).a(aw).a(aH).a(gff.c.b))
      );
      private final gff.b aW;
      private final Optional<gff> aX;
      private final boolean aY;

      a(String $$0, fbl $$1, fbl.c $$2, int $$3, boolean $$4, boolean $$5, gff.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gfe::a), () -> $$6.o.forEach(gfe::b));
         this.aW = $$6;
         this.aX = $$6.n == gff.c.c ? $$6.a.c().map($$1x -> aV.apply($$1x, $$6.e)) : Optional.empty();
         this.aY = $$6.n == gff.c.b;
      }

      @Override
      public Optional<gff> L() {
         return this.aX;
      }

      @Override
      public boolean M() {
         return this.aY;
      }

      protected final gff.b Q() {
         return this.aW;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aW + "]";
      }
   }

   protected static final class b {
      final gfe.e a;
      private final gfe.m b;
      private final gfe.p c;
      private final gfe.d d;
      final gfe.c e;
      private final gfe.g f;
      private final gfe.l g;
      private final gfe.f h;
      private final gfe.k i;
      private final gfe.o j;
      private final gfe.q k;
      private final gfe.h l;
      private final gfe.b m;
      final gff.c n;
      final ImmutableList<gfe> o;

      b(
         gfe.e $$0,
         gfe.m $$1,
         gfe.p $$2,
         gfe.d $$3,
         gfe.c $$4,
         gfe.g $$5,
         gfe.l $$6,
         gfe.f $$7,
         gfe.k $$8,
         gfe.o $$9,
         gfe.q $$10,
         gfe.h $$11,
         gfe.b $$12,
         gff.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gfe[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gff.b.a a() {
         return new gff.b.a();
      }

      public static class a {
         private gfe.e a = gfe.am;
         private gfe.m b = gfe.i;
         private gfe.p c;
         private gfe.d d;
         private gfe.c e;
         private gfe.g f;
         private gfe.l g;
         private gfe.f h;
         private gfe.k i;
         private gfe.o j;
         private gfe.q k;
         private gfe.h l;
         private gfe.b m;

         a() {
            this.c = gfe.c;
            this.d = gfe.ay;
            this.e = gfe.au;
            this.f = gfe.ar;
            this.g = gfe.at;
            this.h = gfe.aD;
            this.i = gfe.aG;
            this.j = gfe.an;
            this.k = gfe.aA;
            this.l = gfe.aN;
            this.m = gfe.aO;
         }

         public gff.b.a a(gfe.e $$0) {
            this.a = $$0;
            return this;
         }

         public gff.b.a a(gfe.m $$0) {
            this.b = $$0;
            return this;
         }

         public gff.b.a a(gfe.p $$0) {
            this.c = $$0;
            return this;
         }

         public gff.b.a a(gfe.d $$0) {
            this.d = $$0;
            return this;
         }

         public gff.b.a a(gfe.c $$0) {
            this.e = $$0;
            return this;
         }

         public gff.b.a a(gfe.g $$0) {
            this.f = $$0;
            return this;
         }

         public gff.b.a a(gfe.l $$0) {
            this.g = $$0;
            return this;
         }

         public gff.b.a a(gfe.f $$0) {
            this.h = $$0;
            return this;
         }

         public gff.b.a a(gfe.k $$0) {
            this.i = $$0;
            return this;
         }

         public gff.b.a a(gfe.o $$0) {
            this.j = $$0;
            return this;
         }

         public gff.b.a a(gfe.q $$0) {
            this.k = $$0;
            return this;
         }

         public gff.b.a a(gfe.h $$0) {
            this.l = $$0;
            return this;
         }

         public gff.b.a a(gfe.b $$0) {
            this.m = $$0;
            return this;
         }

         public gff.b a(boolean $$0) {
            return this.a($$0 ? gff.c.c : gff.c.a);
         }

         public gff.b a(gff.c $$0) {
            return new gff.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
