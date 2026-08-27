import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gaq extends gap {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gaq aZ = a("solid", ewp.j, eww.b.h, 4194304, true, false, gaq.b.a().a(at).a(p).a(an).a(true));
   private static final gaq ba = a("cutout_mipped", ewp.j, eww.b.h, 4194304, true, false, gaq.b.a().a(at).a(q).a(an).a(true));
   private static final gaq bb = a("cutout", ewp.j, eww.b.h, 786432, true, false, gaq.b.a().a(at).a(r).a(ao).a(true));
   private static final gaq bc = a("translucent", ewp.j, eww.b.h, 786432, true, true, a(s));
   private static final gaq bd = a("translucent_moving_block", ewp.j, eww.b.h, 786432, false, true, Q());
   private static final Function<ajv, gaq> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ajv, gaq> bf = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(v).a(new gap.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ewp.k, eww.b.h, 1536, true, false, $$1);
   });
   private static final Function<ajv, gaq> bg = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(w).a(new gap.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ewp.k, eww.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ajv, Boolean, gaq> bh = ac.a(($$0, $$1) -> {
      gaq.b $$2 = gaq.b.a().a(x).a(new gap.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ewp.k, eww.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ajv, Boolean, gaq> bi = ac.a(($$0, $$1) -> {
      gaq.b $$2 = gaq.b.a().a(y).a(new gap.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ewp.k, eww.b.h, 1536, true, false, $$2);
   });
   private static final Function<ajv, gaq> bj = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(z).a(new gap.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gap.aD).a(true);
      return a("item_entity_translucent_cull", ewp.k, eww.b.h, 1536, true, true, $$1);
   });
   private static final Function<ajv, gaq> bk = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(A).a(new gap.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ewp.k, eww.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ajv, Boolean, gaq> bl = ac.a(($$0, $$1) -> {
      gaq.b $$2 = gaq.b.a().a(B).a(new gap.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ewp.k, eww.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ajv, Boolean, gaq> bm = ac.a(($$0, $$1) -> {
      gaq.b $$2 = gaq.b.a().a(C).a(new gap.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ewp.k, eww.b.h, 1536, true, true, $$2);
   });
   private static final Function<ajv, gaq> bn = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(D).a(new gap.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ewp.k, eww.b.h, 1536, $$1);
   });
   private static final BiFunction<ajv, Boolean, gaq> bo = ac.a(($$0, $$1) -> {
      gaq.b $$2 = gaq.b.a().a(E).a(new gap.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ewp.j, eww.b.h, 1536, false, true, $$2);
   });
   private static final Function<ajv, gaq> bp = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(F).a(new gap.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ewp.k, eww.b.h, 1536, $$1);
   });
   private static final Function<ajv, gaq> bq = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(G).a(new gap.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ewp.k, eww.b.h, 1536, false, true, $$1);
   });
   private static final Function<ajv, gaq> br = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(H).a(new gap.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ewp.k, eww.b.h, 1536, false, false, $$1);
   });
   private static final Function<ajv, gaq> bs = ac.b($$0 -> {
      gaq.b $$1 = gaq.b.a().a(I).a(new gap.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ewp.k, eww.b.h, 1536, $$1);
   });
   private static final BiFunction<ajv, gap.p, gaq> bt = ac.a(($$0, $$1) -> {
      gap.n $$2 = new gap.n($$0, false, false);
      return a("eyes", ewp.k, eww.b.h, 1536, false, true, gaq.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gaq bu = a("leash", ewp.p, eww.b.f, 1536, gaq.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gaq bv = a("water_mask", ewp.m, eww.b.h, 1536, gaq.b.a().a(M).a(ap).a(aF).a(false));
   private static final gaq bw = a(
      "armor_glint", ewp.q, eww.b.h, 1536, gaq.b.a().a(O).a(new gap.n(ggp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gaq bx = a(
      "armor_entity_glint", ewp.q, eww.b.h, 1536, gaq.b.a().a(P).a(new gap.n(ggp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gaq by = a(
      "glint_translucent", ewp.q, eww.b.h, 1536, gaq.b.a().a(Q).a(new gap.n(ggp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gaq bz = a("glint", ewp.q, eww.b.h, 1536, gaq.b.a().a(R).a(new gap.n(ggp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gaq bA = a("glint_direct", ewp.q, eww.b.h, 1536, gaq.b.a().a(S).a(new gap.n(ggp.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gaq bB = a(
      "entity_glint", ewp.q, eww.b.h, 1536, gaq.b.a().a(T).a(new gap.n(ggp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gaq bC = a(
      "entity_glint_direct", ewp.q, eww.b.h, 1536, gaq.b.a().a(U).a(new gap.n(ggp.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ajv, gaq> bD = ac.b($$0 -> {
      gap.n $$1 = new gap.n($$0, false, false);
      return a("crumbling", ewp.j, eww.b.h, 1536, false, true, gaq.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ajv, gaq> bE = ac.b(
      $$0 -> a("text", ewp.t, eww.b.h, 786432, false, true, gaq.b.a().a(W).a(new gap.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gaq bF = a("text_background", ewp.p, eww.b.h, 1536, false, true, gaq.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ajv, gaq> bG = ac.b(
      $$0 -> a("text_intensity", ewp.t, eww.b.h, 786432, false, true, gaq.b.a().a(Y).a(new gap.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ajv, gaq> bH = ac.b(
      $$0 -> a("text_polygon_offset", ewp.t, eww.b.h, 1536, false, true, gaq.b.a().a(W).a(new gap.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajv, gaq> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ewp.t, eww.b.h, 1536, false, true, gaq.b.a().a(Y).a(new gap.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ajv, gaq> bJ = ac.b(
      $$0 -> a("text_see_through", ewp.t, eww.b.h, 1536, false, true, gaq.b.a().a(Z).a(new gap.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gaq bK = a("text_background_see_through", ewp.p, eww.b.h, 1536, false, true, gaq.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ajv, gaq> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ewp.t, eww.b.h, 1536, false, true, gaq.b.a().a(ab).a(new gap.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gaq bM = a("lightning", ewp.n, eww.b.h, 1536, false, true, gaq.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gaq bN = a("tripwire", ewp.j, eww.b.h, 1536, true, true, R());
   private static final gaq bO = a(
      "end_portal", ewp.m, eww.b.h, 1536, false, false, gaq.b.a().a(ae).a(gap.i.d().a(gdb.a, false, false).a(gdb.b, false, false).a()).a(false)
   );
   private static final gaq bP = a(
      "end_gateway", ewp.m, eww.b.h, 1536, false, false, gaq.b.a().a(af).a(gap.i.d().a(gdb.a, false, false).a(gdb.b, false, false).a()).a(false)
   );
   private static final gaq bQ = a(false);
   private static final gaq bR = a(true);
   public static final gaq.a aW = a("lines", ewp.o, eww.b.a, 1536, gaq.b.a().a(ah).a(new gap.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gaq.a aX = a(
      "line_strip", ewp.o, eww.b.b, 1536, gaq.b.a().a(ah).a(new gap.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gaq.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ewp.n, eww.b.d, 1536, gaq.b.a().a(o).a(new gap.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gaq.a bT = a("debug_filled_box", ewp.n, eww.b.f, 1536, false, true, gaq.b.a().a(o).a(aI).a(h).a(false));
   private static final gaq.a bU = a("debug_quads", ewp.n, eww.b.h, 1536, false, true, gaq.b.a().a(o).a(h).a(ay).a(false));
   private static final gaq.a bV = a("debug_section_quads", ewp.n, eww.b.h, 1536, false, true, gaq.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gaq.a bW = a("gui", ewp.n, eww.b.h, 786432, gaq.b.a().a(ai).a(h).a(aB).a(false));
   private static final gaq.a bX = a("gui_overlay", ewp.n, eww.b.h, 1536, gaq.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gaq.a bY = a("gui_text_highlight", ewp.n, eww.b.h, 1536, gaq.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gaq.a bZ = a("gui_ghost_recipe_overlay", ewp.n, eww.b.h, 1536, gaq.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gaq> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final eww cb;
   private final eww.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gaq> cg;

   public static gaq c() {
      return aZ;
   }

   public static gaq d() {
      return ba;
   }

   public static gaq e() {
      return bb;
   }

   private static gaq.b a(gap.m $$0) {
      return gaq.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gaq f() {
      return bc;
   }

   private static gaq.b Q() {
      return gaq.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gaq g() {
      return bd;
   }

   private static gaq.a a(String $$0, ajv $$1, boolean $$2) {
      gaq.b $$3 = gaq.b.a().a(u).a(new gap.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ewp.k, eww.b.h, 1536, true, false, $$3);
   }

   public static gaq a(ajv $$0) {
      return be.apply($$0);
   }

   public static gaq b(ajv $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gaq c(ajv $$0) {
      return bf.apply($$0);
   }

   public static gaq d(ajv $$0) {
      return bg.apply($$0);
   }

   public static gaq a(ajv $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gaq e(ajv $$0) {
      return a($$0, true);
   }

   public static gaq b(ajv $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gaq f(ajv $$0) {
      return b($$0, true);
   }

   public static gaq g(ajv $$0) {
      return bj.apply($$0);
   }

   public static gaq h(ajv $$0) {
      return bk.apply($$0);
   }

   public static gaq c(ajv $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gaq i(ajv $$0) {
      return c($$0, true);
   }

   public static gaq d(ajv $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gaq j(ajv $$0) {
      return d($$0, true);
   }

   public static gaq k(ajv $$0) {
      return bn.apply($$0);
   }

   public static gaq e(ajv $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gaq l(ajv $$0) {
      return bp.apply($$0);
   }

   public static gaq m(ajv $$0) {
      return bq.apply($$0);
   }

   public static gaq n(ajv $$0) {
      return br.apply($$0);
   }

   public static gaq o(ajv $$0) {
      return bs.apply($$0);
   }

   public static gaq p(ajv $$0) {
      return bt.apply($$0, d);
   }

   public static gaq q(ajv $$0) {
      return bm.apply($$0, false);
   }

   public static gaq a(ajv $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ewp.k,
         eww.b.h,
         1536,
         false,
         true,
         gaq.b.a().a(am).a(new gap.n($$0, false, false)).a(new gap.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gaq b(ajv $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ewp.k,
         eww.b.h,
         1536,
         false,
         true,
         gaq.b.a().a(K).a(new gap.n($$0, false, false)).a(new gap.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gaq h() {
      return bu;
   }

   public static gaq i() {
      return bv;
   }

   public static gaq r(ajv $$0) {
      return gaq.a.aY.apply($$0, ay);
   }

   public static gaq j() {
      return bw;
   }

   public static gaq k() {
      return bx;
   }

   public static gaq l() {
      return by;
   }

   public static gaq m() {
      return bz;
   }

   public static gaq n() {
      return bA;
   }

   public static gaq o() {
      return bB;
   }

   public static gaq p() {
      return bC;
   }

   public static gaq s(ajv $$0) {
      return bD.apply($$0);
   }

   public static gaq t(ajv $$0) {
      return bE.apply($$0);
   }

   public static gaq q() {
      return bF;
   }

   public static gaq u(ajv $$0) {
      return bG.apply($$0);
   }

   public static gaq v(ajv $$0) {
      return bH.apply($$0);
   }

   public static gaq w(ajv $$0) {
      return bI.apply($$0);
   }

   public static gaq x(ajv $$0) {
      return bJ.apply($$0);
   }

   public static gaq r() {
      return bK;
   }

   public static gaq y(ajv $$0) {
      return bL.apply($$0);
   }

   public static gaq s() {
      return bM;
   }

   private static gaq.b R() {
      return gaq.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gaq t() {
      return bN;
   }

   public static gaq u() {
      return bO;
   }

   public static gaq v() {
      return bP;
   }

   private static gaq.a a(boolean $$0) {
      return a("clouds", ewp.v, eww.b.h, 786432, false, false, gaq.b.a().a(ag).a(new gap.n(gag.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gaq w() {
      return bQ;
   }

   public static gaq x() {
      return bR;
   }

   public static gaq y() {
      return aW;
   }

   public static gaq z() {
      return aX;
   }

   public static gaq a(double $$0) {
      return bS.apply($$0);
   }

   public static gaq A() {
      return bT;
   }

   public static gaq B() {
      return bU;
   }

   public static gaq C() {
      return bV;
   }

   public static gaq D() {
      return bW;
   }

   public static gaq E() {
      return bX;
   }

   public static gaq F() {
      return bY;
   }

   public static gaq G() {
      return bZ;
   }

   public gaq(String $$0, eww $$1, eww.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gaq.a a(String $$0, eww $$1, eww.b $$2, int $$3, gaq.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gaq.a a(String $$0, eww $$1, eww.b $$2, int $$3, boolean $$4, boolean $$5, gaq.b $$6) {
      return new gaq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ewm $$0, ewz $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ewm.b $$2 = $$0.d();
         this.a();
         ewn.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gaq> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public eww J() {
      return this.cb;
   }

   public eww.b K() {
      return this.cc;
   }

   public Optional<gaq> L() {
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

   public Optional<gaq> P() {
      return this.cg;
   }

   static final class a extends gaq {
      static final BiFunction<ajv, gap.c, gaq> aY = ac.a(
         ($$0, $$1) -> gaq.a("outline", ewp.r, eww.b.h, 1536, gaq.b.a().a(N).a(new gap.n($$0, false, false)).a($$1).a(az).a(aK).a(gaq.c.b))
      );
      private final gaq.b aZ;
      private final Optional<gaq> ba;
      private final boolean bb;

      a(String $$0, eww $$1, eww.b $$2, int $$3, boolean $$4, boolean $$5, gaq.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gap::a), () -> $$6.o.forEach(gap::b));
         this.aZ = $$6;
         this.ba = $$6.n == gaq.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gaq.c.b;
      }

      @Override
      public Optional<gaq> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gaq.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gap.e a;
      private final gap.m b;
      private final gap.p c;
      private final gap.d d;
      final gap.c e;
      private final gap.g f;
      private final gap.l g;
      private final gap.f h;
      private final gap.k i;
      private final gap.o j;
      private final gap.q k;
      private final gap.h l;
      private final gap.b m;
      final gaq.c n;
      final ImmutableList<gap> o;

      b(
         gap.e $$0,
         gap.m $$1,
         gap.p $$2,
         gap.d $$3,
         gap.c $$4,
         gap.g $$5,
         gap.l $$6,
         gap.f $$7,
         gap.k $$8,
         gap.o $$9,
         gap.q $$10,
         gap.h $$11,
         gap.b $$12,
         gaq.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gap[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gaq.b.a a() {
         return new gaq.b.a();
      }

      public static class a {
         private gap.e a = gap.ap;
         private gap.m b = gap.i;
         private gap.p c;
         private gap.d d;
         private gap.c e;
         private gap.g f;
         private gap.l g;
         private gap.f h;
         private gap.k i;
         private gap.o j;
         private gap.q k;
         private gap.h l;
         private gap.b m;

         a() {
            this.c = gap.c;
            this.d = gap.aB;
            this.e = gap.ax;
            this.f = gap.au;
            this.g = gap.aw;
            this.h = gap.aG;
            this.i = gap.aJ;
            this.j = gap.aq;
            this.k = gap.aD;
            this.l = gap.aQ;
            this.m = gap.aR;
         }

         public gaq.b.a a(gap.e $$0) {
            this.a = $$0;
            return this;
         }

         public gaq.b.a a(gap.m $$0) {
            this.b = $$0;
            return this;
         }

         public gaq.b.a a(gap.p $$0) {
            this.c = $$0;
            return this;
         }

         public gaq.b.a a(gap.d $$0) {
            this.d = $$0;
            return this;
         }

         public gaq.b.a a(gap.c $$0) {
            this.e = $$0;
            return this;
         }

         public gaq.b.a a(gap.g $$0) {
            this.f = $$0;
            return this;
         }

         public gaq.b.a a(gap.l $$0) {
            this.g = $$0;
            return this;
         }

         public gaq.b.a a(gap.f $$0) {
            this.h = $$0;
            return this;
         }

         public gaq.b.a a(gap.k $$0) {
            this.i = $$0;
            return this;
         }

         public gaq.b.a a(gap.o $$0) {
            this.j = $$0;
            return this;
         }

         public gaq.b.a a(gap.q $$0) {
            this.k = $$0;
            return this;
         }

         public gaq.b.a a(gap.h $$0) {
            this.l = $$0;
            return this;
         }

         public gaq.b.a a(gap.b $$0) {
            this.m = $$0;
            return this;
         }

         public gaq.b a(boolean $$0) {
            return this.a($$0 ? gaq.c.c : gaq.c.a);
         }

         public gaq.b a(gaq.c $$0) {
            return new gaq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
