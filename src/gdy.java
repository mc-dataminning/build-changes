import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gdy extends gdx {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gdy aZ = a("solid", ezy.j, faf.b.h, 4194304, true, false, gdy.b.a().a(at).a(p).a(an).a(true));
   private static final gdy ba = a("cutout_mipped", ezy.j, faf.b.h, 4194304, true, false, gdy.b.a().a(at).a(q).a(an).a(true));
   private static final gdy bb = a("cutout", ezy.j, faf.b.h, 786432, true, false, gdy.b.a().a(at).a(r).a(ao).a(true));
   private static final gdy bc = a("translucent", ezy.j, faf.b.h, 786432, true, true, a(s));
   private static final gdy bd = a("translucent_moving_block", ezy.j, faf.b.h, 786432, false, true, Q());
   private static final Function<alf, gdy> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alf, gdy> bf = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(v).a(new gdx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", ezy.k, faf.b.h, 1536, true, false, $$1);
   });
   private static final Function<alf, gdy> bg = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(w).a(new gdx.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", ezy.k, faf.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alf, Boolean, gdy> bh = ac.a(($$0, $$1) -> {
      gdy.b $$2 = gdy.b.a().a(x).a(new gdx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", ezy.k, faf.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alf, Boolean, gdy> bi = ac.a(($$0, $$1) -> {
      gdy.b $$2 = gdy.b.a().a(y).a(new gdx.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", ezy.k, faf.b.h, 1536, true, false, $$2);
   });
   private static final Function<alf, gdy> bj = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(z).a(new gdx.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gdx.aD).a(true);
      return a("item_entity_translucent_cull", ezy.k, faf.b.h, 1536, true, true, $$1);
   });
   private static final Function<alf, gdy> bk = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(A).a(new gdx.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", ezy.k, faf.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alf, Boolean, gdy> bl = ac.a(($$0, $$1) -> {
      gdy.b $$2 = gdy.b.a().a(B).a(new gdx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", ezy.k, faf.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alf, Boolean, gdy> bm = ac.a(($$0, $$1) -> {
      gdy.b $$2 = gdy.b.a().a(C).a(new gdx.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", ezy.k, faf.b.h, 1536, true, true, $$2);
   });
   private static final Function<alf, gdy> bn = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(D).a(new gdx.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", ezy.k, faf.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, Boolean, gdy> bo = ac.a(($$0, $$1) -> {
      gdy.b $$2 = gdy.b.a().a(E).a(new gdx.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", ezy.j, faf.b.h, 1536, false, true, $$2);
   });
   private static final Function<alf, gdy> bp = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(F).a(new gdx.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", ezy.k, faf.b.h, 1536, $$1);
   });
   private static final Function<alf, gdy> bq = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(G).a(new gdx.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", ezy.k, faf.b.h, 1536, false, true, $$1);
   });
   private static final Function<alf, gdy> br = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(H).a(new gdx.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", ezy.k, faf.b.h, 1536, false, false, $$1);
   });
   private static final Function<alf, gdy> bs = ac.b($$0 -> {
      gdy.b $$1 = gdy.b.a().a(I).a(new gdx.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", ezy.k, faf.b.h, 1536, $$1);
   });
   private static final BiFunction<alf, gdx.p, gdy> bt = ac.a(($$0, $$1) -> {
      gdx.n $$2 = new gdx.n($$0, false, false);
      return a("eyes", ezy.k, faf.b.h, 1536, false, true, gdy.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gdy bu = a("leash", ezy.p, faf.b.f, 1536, gdy.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gdy bv = a("water_mask", ezy.m, faf.b.h, 1536, gdy.b.a().a(M).a(ap).a(aF).a(false));
   private static final gdy bw = a(
      "armor_glint", ezy.q, faf.b.h, 1536, gdy.b.a().a(O).a(new gdx.n(gjx.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gdy bx = a(
      "armor_entity_glint", ezy.q, faf.b.h, 1536, gdy.b.a().a(P).a(new gdx.n(gjx.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gdy by = a(
      "glint_translucent", ezy.q, faf.b.h, 1536, gdy.b.a().a(Q).a(new gdx.n(gjx.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gdy bz = a("glint", ezy.q, faf.b.h, 1536, gdy.b.a().a(R).a(new gdx.n(gjx.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdy bA = a("glint_direct", ezy.q, faf.b.h, 1536, gdy.b.a().a(S).a(new gdx.n(gjx.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gdy bB = a(
      "entity_glint", ezy.q, faf.b.h, 1536, gdy.b.a().a(T).a(new gdx.n(gjx.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gdy bC = a(
      "entity_glint_direct", ezy.q, faf.b.h, 1536, gdy.b.a().a(U).a(new gdx.n(gjx.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<alf, gdy> bD = ac.b($$0 -> {
      gdx.n $$1 = new gdx.n($$0, false, false);
      return a("crumbling", ezy.j, faf.b.h, 1536, false, true, gdy.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alf, gdy> bE = ac.b(
      $$0 -> a("text", ezy.t, faf.b.h, 786432, false, true, gdy.b.a().a(W).a(new gdx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gdy bF = a("text_background", ezy.p, faf.b.h, 1536, false, true, gdy.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alf, gdy> bG = ac.b(
      $$0 -> a("text_intensity", ezy.t, faf.b.h, 786432, false, true, gdy.b.a().a(Y).a(new gdx.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<alf, gdy> bH = ac.b(
      $$0 -> a("text_polygon_offset", ezy.t, faf.b.h, 1536, false, true, gdy.b.a().a(W).a(new gdx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdy> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ezy.t, faf.b.h, 1536, false, true, gdy.b.a().a(Y).a(new gdx.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alf, gdy> bJ = ac.b(
      $$0 -> a("text_see_through", ezy.t, faf.b.h, 1536, false, true, gdy.b.a().a(Z).a(new gdx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdy bK = a("text_background_see_through", ezy.p, faf.b.h, 1536, false, true, gdy.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alf, gdy> bL = ac.b(
      $$0 -> a("text_intensity_see_through", ezy.t, faf.b.h, 1536, false, true, gdy.b.a().a(ab).a(new gdx.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gdy bM = a("lightning", ezy.n, faf.b.h, 1536, false, true, gdy.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gdy bN = a("tripwire", ezy.j, faf.b.h, 1536, true, true, R());
   private static final gdy bO = a(
      "end_portal", ezy.m, faf.b.h, 1536, false, false, gdy.b.a().a(ae).a(gdx.i.d().a(ggj.a, false, false).a(ggj.b, false, false).a()).a(false)
   );
   private static final gdy bP = a(
      "end_gateway", ezy.m, faf.b.h, 1536, false, false, gdy.b.a().a(af).a(gdx.i.d().a(ggj.a, false, false).a(ggj.b, false, false).a()).a(false)
   );
   private static final gdy bQ = a(false);
   private static final gdy bR = a(true);
   public static final gdy.a aW = a("lines", ezy.o, faf.b.a, 1536, gdy.b.a().a(ah).a(new gdx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gdy.a aX = a(
      "line_strip", ezy.o, faf.b.b, 1536, gdy.b.a().a(ah).a(new gdx.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gdy.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ezy.n, faf.b.d, 1536, gdy.b.a().a(o).a(new gdx.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gdy.a bT = a("debug_filled_box", ezy.n, faf.b.f, 1536, false, true, gdy.b.a().a(o).a(aI).a(h).a(false));
   private static final gdy.a bU = a("debug_quads", ezy.n, faf.b.h, 1536, false, true, gdy.b.a().a(o).a(h).a(ay).a(false));
   private static final gdy.a bV = a("debug_section_quads", ezy.n, faf.b.h, 1536, false, true, gdy.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gdy.a bW = a("gui", ezy.n, faf.b.h, 786432, gdy.b.a().a(ai).a(h).a(aB).a(false));
   private static final gdy.a bX = a("gui_overlay", ezy.n, faf.b.h, 1536, gdy.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gdy.a bY = a("gui_text_highlight", ezy.n, faf.b.h, 1536, gdy.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gdy.a bZ = a("gui_ghost_recipe_overlay", ezy.n, faf.b.h, 1536, gdy.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gdy> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final faf cb;
   private final faf.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gdy> cg;

   public static gdy c() {
      return aZ;
   }

   public static gdy d() {
      return ba;
   }

   public static gdy e() {
      return bb;
   }

   private static gdy.b a(gdx.m $$0) {
      return gdy.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gdy f() {
      return bc;
   }

   private static gdy.b Q() {
      return gdy.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gdy g() {
      return bd;
   }

   private static gdy.a a(String $$0, alf $$1, boolean $$2) {
      gdy.b $$3 = gdy.b.a().a(u).a(new gdx.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, ezy.k, faf.b.h, 1536, true, false, $$3);
   }

   public static gdy a(alf $$0) {
      return be.apply($$0);
   }

   public static gdy b(alf $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gdy c(alf $$0) {
      return bf.apply($$0);
   }

   public static gdy d(alf $$0) {
      return bg.apply($$0);
   }

   public static gdy a(alf $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gdy e(alf $$0) {
      return a($$0, true);
   }

   public static gdy b(alf $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gdy f(alf $$0) {
      return b($$0, true);
   }

   public static gdy g(alf $$0) {
      return bj.apply($$0);
   }

   public static gdy h(alf $$0) {
      return bk.apply($$0);
   }

   public static gdy c(alf $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gdy i(alf $$0) {
      return c($$0, true);
   }

   public static gdy d(alf $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gdy j(alf $$0) {
      return d($$0, true);
   }

   public static gdy k(alf $$0) {
      return bn.apply($$0);
   }

   public static gdy e(alf $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gdy l(alf $$0) {
      return bp.apply($$0);
   }

   public static gdy m(alf $$0) {
      return bq.apply($$0);
   }

   public static gdy n(alf $$0) {
      return br.apply($$0);
   }

   public static gdy o(alf $$0) {
      return bs.apply($$0);
   }

   public static gdy p(alf $$0) {
      return bt.apply($$0, d);
   }

   public static gdy q(alf $$0) {
      return bm.apply($$0, false);
   }

   public static gdy a(alf $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ezy.k,
         faf.b.h,
         1536,
         false,
         true,
         gdy.b.a().a(am).a(new gdx.n($$0, false, false)).a(new gdx.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gdy b(alf $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ezy.k,
         faf.b.h,
         1536,
         false,
         true,
         gdy.b.a().a(K).a(new gdx.n($$0, false, false)).a(new gdx.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gdy h() {
      return bu;
   }

   public static gdy i() {
      return bv;
   }

   public static gdy r(alf $$0) {
      return gdy.a.aY.apply($$0, ay);
   }

   public static gdy j() {
      return bw;
   }

   public static gdy k() {
      return bx;
   }

   public static gdy l() {
      return by;
   }

   public static gdy m() {
      return bz;
   }

   public static gdy n() {
      return bA;
   }

   public static gdy o() {
      return bB;
   }

   public static gdy p() {
      return bC;
   }

   public static gdy s(alf $$0) {
      return bD.apply($$0);
   }

   public static gdy t(alf $$0) {
      return bE.apply($$0);
   }

   public static gdy q() {
      return bF;
   }

   public static gdy u(alf $$0) {
      return bG.apply($$0);
   }

   public static gdy v(alf $$0) {
      return bH.apply($$0);
   }

   public static gdy w(alf $$0) {
      return bI.apply($$0);
   }

   public static gdy x(alf $$0) {
      return bJ.apply($$0);
   }

   public static gdy r() {
      return bK;
   }

   public static gdy y(alf $$0) {
      return bL.apply($$0);
   }

   public static gdy s() {
      return bM;
   }

   private static gdy.b R() {
      return gdy.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gdy t() {
      return bN;
   }

   public static gdy u() {
      return bO;
   }

   public static gdy v() {
      return bP;
   }

   private static gdy.a a(boolean $$0) {
      return a("clouds", ezy.v, faf.b.h, 786432, false, false, gdy.b.a().a(ag).a(new gdx.n(gdo.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gdy w() {
      return bQ;
   }

   public static gdy x() {
      return bR;
   }

   public static gdy y() {
      return aW;
   }

   public static gdy z() {
      return aX;
   }

   public static gdy a(double $$0) {
      return bS.apply($$0);
   }

   public static gdy A() {
      return bT;
   }

   public static gdy B() {
      return bU;
   }

   public static gdy C() {
      return bV;
   }

   public static gdy D() {
      return bW;
   }

   public static gdy E() {
      return bX;
   }

   public static gdy F() {
      return bY;
   }

   public static gdy G() {
      return bZ;
   }

   public gdy(String $$0, faf $$1, faf.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gdy.a a(String $$0, faf $$1, faf.b $$2, int $$3, gdy.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gdy.a a(String $$0, faf $$1, faf.b $$2, int $$3, boolean $$4, boolean $$5, gdy.b $$6) {
      return new gdy.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ezv $$0, fai $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ezv.b $$2 = $$0.d();
         this.a();
         ezw.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gdy> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public faf J() {
      return this.cb;
   }

   public faf.b K() {
      return this.cc;
   }

   public Optional<gdy> L() {
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

   public Optional<gdy> P() {
      return this.cg;
   }

   static final class a extends gdy {
      static final BiFunction<alf, gdx.c, gdy> aY = ac.a(
         ($$0, $$1) -> gdy.a("outline", ezy.r, faf.b.h, 1536, gdy.b.a().a(N).a(new gdx.n($$0, false, false)).a($$1).a(az).a(aK).a(gdy.c.b))
      );
      private final gdy.b aZ;
      private final Optional<gdy> ba;
      private final boolean bb;

      a(String $$0, faf $$1, faf.b $$2, int $$3, boolean $$4, boolean $$5, gdy.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gdx::a), () -> $$6.o.forEach(gdx::b));
         this.aZ = $$6;
         this.ba = $$6.n == gdy.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gdy.c.b;
      }

      @Override
      public Optional<gdy> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gdy.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gdx.e a;
      private final gdx.m b;
      private final gdx.p c;
      private final gdx.d d;
      final gdx.c e;
      private final gdx.g f;
      private final gdx.l g;
      private final gdx.f h;
      private final gdx.k i;
      private final gdx.o j;
      private final gdx.q k;
      private final gdx.h l;
      private final gdx.b m;
      final gdy.c n;
      final ImmutableList<gdx> o;

      b(
         gdx.e $$0,
         gdx.m $$1,
         gdx.p $$2,
         gdx.d $$3,
         gdx.c $$4,
         gdx.g $$5,
         gdx.l $$6,
         gdx.f $$7,
         gdx.k $$8,
         gdx.o $$9,
         gdx.q $$10,
         gdx.h $$11,
         gdx.b $$12,
         gdy.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gdx[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gdy.b.a a() {
         return new gdy.b.a();
      }

      public static class a {
         private gdx.e a = gdx.ap;
         private gdx.m b = gdx.i;
         private gdx.p c;
         private gdx.d d;
         private gdx.c e;
         private gdx.g f;
         private gdx.l g;
         private gdx.f h;
         private gdx.k i;
         private gdx.o j;
         private gdx.q k;
         private gdx.h l;
         private gdx.b m;

         a() {
            this.c = gdx.c;
            this.d = gdx.aB;
            this.e = gdx.ax;
            this.f = gdx.au;
            this.g = gdx.aw;
            this.h = gdx.aG;
            this.i = gdx.aJ;
            this.j = gdx.aq;
            this.k = gdx.aD;
            this.l = gdx.aQ;
            this.m = gdx.aR;
         }

         public gdy.b.a a(gdx.e $$0) {
            this.a = $$0;
            return this;
         }

         public gdy.b.a a(gdx.m $$0) {
            this.b = $$0;
            return this;
         }

         public gdy.b.a a(gdx.p $$0) {
            this.c = $$0;
            return this;
         }

         public gdy.b.a a(gdx.d $$0) {
            this.d = $$0;
            return this;
         }

         public gdy.b.a a(gdx.c $$0) {
            this.e = $$0;
            return this;
         }

         public gdy.b.a a(gdx.g $$0) {
            this.f = $$0;
            return this;
         }

         public gdy.b.a a(gdx.l $$0) {
            this.g = $$0;
            return this;
         }

         public gdy.b.a a(gdx.f $$0) {
            this.h = $$0;
            return this;
         }

         public gdy.b.a a(gdx.k $$0) {
            this.i = $$0;
            return this;
         }

         public gdy.b.a a(gdx.o $$0) {
            this.j = $$0;
            return this;
         }

         public gdy.b.a a(gdx.q $$0) {
            this.k = $$0;
            return this;
         }

         public gdy.b.a a(gdx.h $$0) {
            this.l = $$0;
            return this;
         }

         public gdy.b.a a(gdx.b $$0) {
            this.m = $$0;
            return this;
         }

         public gdy.b a(boolean $$0) {
            return this.a($$0 ? gdy.c.c : gdy.c.a);
         }

         public gdy.b a(gdy.c $$0) {
            return new gdy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
