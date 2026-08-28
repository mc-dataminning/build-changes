import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdu extends gdt {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdu aZ = a("solid", ezu.j, fab.b.h, 4194304, true, false, gdu.b.a().a(at).a(p).a(an).a(true));
   private static final gdu ba = a("cutout_mipped", ezu.j, fab.b.h, 4194304, true, false, gdu.b.a().a(at).a(q).a(an).a(true));
   private static final gdu bb = a("cutout", ezu.j, fab.b.h, 786432, true, false, gdu.b.a().a(at).a(r).a(ao).a(true));
   private static final gdu bc = a("translucent", ezu.j, fab.b.h, 786432, true, true, a(s));
   private static final gdu bd = a("translucent_moving_block", ezu.j, fab.b.h, 786432, false, true, Q());
   private static final Function<ale, gdu> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ale, gdu> bf = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(v).a(new gdt.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezu.k, fab.b.h, 1536, true, false, $$1);
   });
   private static final Function<ale, gdu> bg = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(w).a(new gdt.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezu.k, fab.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ale, Boolean, gdu> bh = ac.a(($$0, $$1) -> {
      gdu.b $$2 = gdu.b.a().a(x).a(new gdt.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezu.k, fab.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ale, Boolean, gdu> bi = ac.a(($$0, $$1) -> {
      gdu.b $$2 = gdu.b.a().a(y).a(new gdt.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezu.k, fab.b.h, 1536, true, false, $$2);
   });
   private static final Function<ale, gdu> bj = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(z).a(new gdt.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdt.aD).a(true);
      return a("item_entity_translucent_cull", ezu.k, fab.b.h, 1536, true, true, $$1);
   });
   private static final Function<ale, gdu> bk = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(A).a(new gdt.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezu.k, fab.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ale, Boolean, gdu> bl = ac.a(($$0, $$1) -> {
      gdu.b $$2 = gdu.b.a().a(B).a(new gdt.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezu.k, fab.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ale, Boolean, gdu> bm = ac.a(($$0, $$1) -> {
      gdu.b $$2 = gdu.b.a().a(C).a(new gdt.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezu.k, fab.b.h, 1536, true, true, $$2);
   });
   private static final Function<ale, gdu> bn = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(D).a(new gdt.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezu.k, fab.b.h, 1536, $$1);
   });
   private static final BiFunction<ale, Boolean, gdu> bo = ac.a(($$0, $$1) -> {
      gdu.b $$2 = gdu.b.a().a(E).a(new gdt.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezu.j, fab.b.h, 1536, false, true, $$2);
   });
   private static final Function<ale, gdu> bp = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(F).a(new gdt.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezu.k, fab.b.h, 1536, $$1);
   });
   private static final Function<ale, gdu> bq = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(G).a(new gdt.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezu.k, fab.b.h, 1536, false, true, $$1);
   });
   private static final Function<ale, gdu> br = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(H).a(new gdt.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezu.k, fab.b.h, 1536, false, false, $$1);
   });
   private static final Function<ale, gdu> bs = ac.b($$0 -> {
      gdu.b $$1 = gdu.b.a().a(I).a(new gdt.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezu.k, fab.b.h, 1536, $$1);
   });
   private static final BiFunction<ale, gdt.p, gdu> bt = ac.a(($$0, $$1) -> {
      gdt.n $$2 = new gdt.n($$0, false, false);
      return a("eyes", ezu.k, fab.b.h, 1536, false, true, gdu.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdu bu = a("leash", ezu.p, fab.b.f, 1536, gdu.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdu bv = a("water_mask", ezu.m, fab.b.h, 1536, gdu.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdu bw = a(
      "armor_glint", ezu.q, fab.b.h, 1536, gdu.b.a().a(O).a(new gdt.n(gjt.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdu bx = a(
      "armor_entity_glint", ezu.q, fab.b.h, 1536, gdu.b.a().a(P).a(new gdt.n(gjt.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdu by = a(
      "glint_translucent", ezu.q, fab.b.h, 1536, gdu.b.a().a(Q).a(new gdt.n(gjt.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdu bz = a("glint", ezu.q, fab.b.h, 1536, gdu.b.a().a(R).a(new gdt.n(gjt.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdu bA = a("glint_direct", ezu.q, fab.b.h, 1536, gdu.b.a().a(S).a(new gdt.n(gjt.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdu bB = a(
      "entity_glint", ezu.q, fab.b.h, 1536, gdu.b.a().a(T).a(new gdt.n(gjt.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdu bC = a(
      "entity_glint_direct", ezu.q, fab.b.h, 1536, gdu.b.a().a(U).a(new gdt.n(gjt.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<ale, gdu> bD = ac.b($$0 -> {
      gdt.n $$1 = new gdt.n($$0, false, false);
      return a("crumbling", ezu.j, fab.b.h, 1536, false, true, gdu.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<ale, gdu> bE = ac.b(
      $$0 -> a("text", ezu.t, fab.b.h, 786432, false, true, gdu.b.a().a(W).a(new gdt.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdu bF = a("text_background", ezu.p, fab.b.h, 1536, false, true, gdu.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<ale, gdu> bG = ac.b(
      $$0 -> a("text_intensity", ezu.t, fab.b.h, 786432, false, true, gdu.b.a().a(Y).a(new gdt.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<ale, gdu> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezu.t, fab.b.h, 1536, false, true, gdu.b.a().a(W).a(new gdt.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, gdu> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezu.t, fab.b.h, 1536, false, true, gdu.b.a().a(Y).a(new gdt.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<ale, gdu> bJ = ac.b(
      $$0 -> a("text_see_through", ezu.t, fab.b.h, 1536, false, true, gdu.b.a().a(Z).a(new gdt.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdu bK = a("text_background_see_through", ezu.p, fab.b.h, 1536, false, true, gdu.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<ale, gdu> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezu.t, fab.b.h, 1536, false, true, gdu.b.a().a(ab).a(new gdt.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdu bM = a("lightning", ezu.n, fab.b.h, 1536, false, true, gdu.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdu bN = a("tripwire", ezu.j, fab.b.h, 1536, true, true, R());
   private static final gdu bO = a(
      "end_portal", ezu.m, fab.b.h, 1536, false, false, gdu.b.a().a(ae).a(gdt.i.d().a(ggf.a, false, false).a(ggf.b, false, false).a()).a(false)
   );
   private static final gdu bP = a(
      "end_gateway", ezu.m, fab.b.h, 1536, false, false, gdu.b.a().a(af).a(gdt.i.d().a(ggf.a, false, false).a(ggf.b, false, false).a()).a(false)
   );
   private static final gdu bQ = a(false);
   private static final gdu bR = a(true);
   public static final gdu.a aW = a("lines", ezu.o, fab.b.a, 1536, gdu.b.a().a(ah).a(new gdt.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdu.a aX = a(
      "line_strip", ezu.o, fab.b.b, 1536, gdu.b.a().a(ah).a(new gdt.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdu.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezu.n, fab.b.d, 1536, gdu.b.a().a(o).a(new gdt.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdu.a bT = a("debug_filled_box", ezu.n, fab.b.f, 1536, false, true, gdu.b.a().a(o).a(aI).a(h).a(false));
   private static final gdu.a bU = a("debug_quads", ezu.n, fab.b.h, 1536, false, true, gdu.b.a().a(o).a(h).a(ay).a(false));
   private static final gdu.a bV = a("debug_section_quads", ezu.n, fab.b.h, 1536, false, true, gdu.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdu.a bW = a("gui", ezu.n, fab.b.h, 786432, gdu.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdu.a bX = a("gui_overlay", ezu.n, fab.b.h, 1536, gdu.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdu.a bY = a("gui_text_highlight", ezu.n, fab.b.h, 1536, gdu.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdu.a bZ = a("gui_ghost_recipe_overlay", ezu.n, fab.b.h, 1536, gdu.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdu> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fab cb;
   private final fab.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdu> cg;

   public static gdu c() {
      return aZ;
   }

   public static gdu d() {
      return ba;
   }

   public static gdu e() {
      return bb;
   }

   private static gdu.b a(gdt.m $$0) {
      return gdu.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdu f() {
      return bc;
   }

   private static gdu.b Q() {
      return gdu.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdu g() {
      return bd;
   }

   private static gdu.a a(String $$0, ale $$1, boolean $$2) {
      gdu.b $$3 = gdu.b.a().a(u).a(new gdt.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezu.k, fab.b.h, 1536, true, false, $$3);
   }

   public static gdu a(ale $$0) {
      return be.apply($$0);
   }

   public static gdu b(ale $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdu c(ale $$0) {
      return bf.apply($$0);
   }

   public static gdu d(ale $$0) {
      return bg.apply($$0);
   }

   public static gdu a(ale $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdu e(ale $$0) {
      return a($$0, true);
   }

   public static gdu b(ale $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdu f(ale $$0) {
      return b($$0, true);
   }

   public static gdu g(ale $$0) {
      return bj.apply($$0);
   }

   public static gdu h(ale $$0) {
      return bk.apply($$0);
   }

   public static gdu c(ale $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdu i(ale $$0) {
      return c($$0, true);
   }

   public static gdu d(ale $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdu j(ale $$0) {
      return d($$0, true);
   }

   public static gdu k(ale $$0) {
      return bn.apply($$0);
   }

   public static gdu e(ale $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdu l(ale $$0) {
      return bp.apply($$0);
   }

   public static gdu m(ale $$0) {
      return bq.apply($$0);
   }

   public static gdu n(ale $$0) {
      return br.apply($$0);
   }

   public static gdu o(ale $$0) {
      return bs.apply($$0);
   }

   public static gdu p(ale $$0) {
      return bt.apply($$0, d);
   }

   public static gdu q(ale $$0) {
      return bm.apply($$0, false);
   }

   public static gdu a(ale $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezu.k,
         fab.b.h,
         1536,
         false,
         true,
         gdu.b.a().a(am).a(new gdt.n($$0, false, false)).a(new gdt.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdu b(ale $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezu.k,
         fab.b.h,
         1536,
         false,
         true,
         gdu.b.a().a(K).a(new gdt.n($$0, false, false)).a(new gdt.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdu h() {
      return bu;
   }

   public static gdu i() {
      return bv;
   }

   public static gdu r(ale $$0) {
      return gdu.a.aY.apply($$0, ay);
   }

   public static gdu j() {
      return bw;
   }

   public static gdu k() {
      return bx;
   }

   public static gdu l() {
      return by;
   }

   public static gdu m() {
      return bz;
   }

   public static gdu n() {
      return bA;
   }

   public static gdu o() {
      return bB;
   }

   public static gdu p() {
      return bC;
   }

   public static gdu s(ale $$0) {
      return bD.apply($$0);
   }

   public static gdu t(ale $$0) {
      return bE.apply($$0);
   }

   public static gdu q() {
      return bF;
   }

   public static gdu u(ale $$0) {
      return bG.apply($$0);
   }

   public static gdu v(ale $$0) {
      return bH.apply($$0);
   }

   public static gdu w(ale $$0) {
      return bI.apply($$0);
   }

   public static gdu x(ale $$0) {
      return bJ.apply($$0);
   }

   public static gdu r() {
      return bK;
   }

   public static gdu y(ale $$0) {
      return bL.apply($$0);
   }

   public static gdu s() {
      return bM;
   }

   private static gdu.b R() {
      return gdu.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdu t() {
      return bN;
   }

   public static gdu u() {
      return bO;
   }

   public static gdu v() {
      return bP;
   }

   private static gdu.a a(boolean $$0) {
      return a("clouds", ezu.v, fab.b.h, 786432, false, false, gdu.b.a().a(ag).a(new gdt.n(gdk.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdu w() {
      return bQ;
   }

   public static gdu x() {
      return bR;
   }

   public static gdu y() {
      return aW;
   }

   public static gdu z() {
      return aX;
   }

   public static gdu a(double $$0) {
      return bS.apply($$0);
   }

   public static gdu A() {
      return bT;
   }

   public static gdu B() {
      return bU;
   }

   public static gdu C() {
      return bV;
   }

   public static gdu D() {
      return bW;
   }

   public static gdu E() {
      return bX;
   }

   public static gdu F() {
      return bY;
   }

   public static gdu G() {
      return bZ;
   }

   public gdu(String $$0, fab $$1, fab.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdu.a a(String $$0, fab $$1, fab.b $$2, int $$3, gdu.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdu.a a(String $$0, fab $$1, fab.b $$2, int $$3, boolean $$4, boolean $$5, gdu.b $$6) {
      return new gdu.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezr $$0, fae $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezr.b $$2 = $$0.d();
         this.a();
         ezs.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdu> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fab J() {
      return this.cb;
   }

   public fab.b K() {
      return this.cc;
   }

   public Optional<gdu> L() {
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

   public Optional<gdu> P() {
      return this.cg;
   }

   static final class a extends gdu {
      static final BiFunction<ale, gdt.c, gdu> aY = ac.a(
         ($$0, $$1) -> gdu.a("outline", ezu.r, fab.b.h, 1536, gdu.b.a().a(N).a(new gdt.n($$0, false, false)).a($$1).a(az).a(aK).a(gdu.c.b))
      );
      private final gdu.b aZ;
      private final Optional<gdu> ba;
      private final boolean bb;

      a(String $$0, fab $$1, fab.b $$2, int $$3, boolean $$4, boolean $$5, gdu.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdt::a), () -> $$6.o.forEach(gdt::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdu.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdu.c.b;
      }

      @Override
      public Optional<gdu> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdu.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdt.e a;
      private final gdt.m b;
      private final gdt.p c;
      private final gdt.d d;
      final gdt.c e;
      private final gdt.g f;
      private final gdt.l g;
      private final gdt.f h;
      private final gdt.k i;
      private final gdt.o j;
      private final gdt.q k;
      private final gdt.h l;
      private final gdt.b m;
      final gdu.c n;
      final ImmutableList<gdt> o;

      b(
         gdt.e $$0,
         gdt.m $$1,
         gdt.p $$2,
         gdt.d $$3,
         gdt.c $$4,
         gdt.g $$5,
         gdt.l $$6,
         gdt.f $$7,
         gdt.k $$8,
         gdt.o $$9,
         gdt.q $$10,
         gdt.h $$11,
         gdt.b $$12,
         gdu.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdt[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdu.b.a a() {
         return new gdu.b.a();
      }

      public static class a {
         private gdt.e a = gdt.ap;
         private gdt.m b = gdt.i;
         private gdt.p c;
         private gdt.d d;
         private gdt.c e;
         private gdt.g f;
         private gdt.l g;
         private gdt.f h;
         private gdt.k i;
         private gdt.o j;
         private gdt.q k;
         private gdt.h l;
         private gdt.b m;

         a() {
            this.c = gdt.c;
            this.d = gdt.aB;
            this.e = gdt.ax;
            this.f = gdt.au;
            this.g = gdt.aw;
            this.h = gdt.aG;
            this.i = gdt.aJ;
            this.j = gdt.aq;
            this.k = gdt.aD;
            this.l = gdt.aQ;
            this.m = gdt.aR;
         }

         public gdu.b.a a(gdt.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdu.b.a a(gdt.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdu.b.a a(gdt.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdu.b.a a(gdt.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdu.b.a a(gdt.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdu.b.a a(gdt.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdu.b.a a(gdt.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdu.b.a a(gdt.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdu.b.a a(gdt.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdu.b.a a(gdt.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdu.b.a a(gdt.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdu.b.a a(gdt.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdu.b.a a(gdt.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdu.b a(boolean $$0) {
            return this.a($$0 ? gdu.c.c : gdu.c.a);
         }

         public gdu.b a(gdu.c $$0) {
            return new gdu.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
