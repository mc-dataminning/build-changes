import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gel extends gek {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gel aZ = a("solid", fak.j, far.b.h, 4194304, true, false, gel.b.a().a(at).a(p).a(an).a(true));
   private static final gel ba = a("cutout_mipped", fak.j, far.b.h, 4194304, true, false, gel.b.a().a(at).a(q).a(an).a(true));
   private static final gel bb = a("cutout", fak.j, far.b.h, 786432, true, false, gel.b.a().a(at).a(r).a(ao).a(true));
   private static final gel bc = a("translucent", fak.j, far.b.h, 786432, true, true, a(s));
   private static final gel bd = a("translucent_moving_block", fak.j, far.b.h, 786432, false, true, Q());
   private static final Function<akk, gel> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akk, gel> bf = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(v).a(new gek.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fak.k, far.b.h, 1536, true, false, $$1);
   });
   private static final Function<akk, gel> bg = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(w).a(new gek.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fak.k, far.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akk, Boolean, gel> bh = ac.a(($$0, $$1) -> {
      gel.b $$2 = gel.b.a().a(x).a(new gek.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fak.k, far.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akk, Boolean, gel> bi = ac.a(($$0, $$1) -> {
      gel.b $$2 = gel.b.a().a(y).a(new gek.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fak.k, far.b.h, 1536, true, false, $$2);
   });
   private static final Function<akk, gel> bj = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(z).a(new gek.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gek.aD).a(true);
      return a("item_entity_translucent_cull", fak.k, far.b.h, 1536, true, true, $$1);
   });
   private static final Function<akk, gel> bk = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(A).a(new gek.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", fak.k, far.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akk, Boolean, gel> bl = ac.a(($$0, $$1) -> {
      gel.b $$2 = gel.b.a().a(B).a(new gek.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fak.k, far.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akk, Boolean, gel> bm = ac.a(($$0, $$1) -> {
      gel.b $$2 = gel.b.a().a(C).a(new gek.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fak.k, far.b.h, 1536, true, true, $$2);
   });
   private static final Function<akk, gel> bn = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(D).a(new gek.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fak.k, far.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, Boolean, gel> bo = ac.a(($$0, $$1) -> {
      gel.b $$2 = gel.b.a().a(E).a(new gek.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fak.j, far.b.h, 1536, false, true, $$2);
   });
   private static final Function<akk, gel> bp = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(F).a(new gek.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fak.k, far.b.h, 1536, $$1);
   });
   private static final Function<akk, gel> bq = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(G).a(new gek.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fak.k, far.b.h, 1536, false, true, $$1);
   });
   private static final Function<akk, gel> br = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(H).a(new gek.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fak.k, far.b.h, 1536, false, false, $$1);
   });
   private static final Function<akk, gel> bs = ac.b($$0 -> {
      gel.b $$1 = gel.b.a().a(I).a(new gek.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", fak.k, far.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, gek.p, gel> bt = ac.a(($$0, $$1) -> {
      gek.n $$2 = new gek.n($$0, false, false);
      return a("eyes", fak.k, far.b.h, 1536, false, true, gel.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gel bu = a("leash", fak.p, far.b.f, 1536, gel.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gel bv = a("water_mask", fak.m, far.b.h, 1536, gel.b.a().a(M).a(ap).a(aF).a(false));
   private static final gel bw = a(
      "armor_glint", fak.q, far.b.h, 1536, gel.b.a().a(O).a(new gek.n(gkk.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gel bx = a(
      "armor_entity_glint", fak.q, far.b.h, 1536, gel.b.a().a(P).a(new gek.n(gkk.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gel by = a(
      "glint_translucent", fak.q, far.b.h, 1536, gel.b.a().a(Q).a(new gek.n(gkk.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gel bz = a("glint", fak.q, far.b.h, 1536, gel.b.a().a(R).a(new gek.n(gkk.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gel bA = a("glint_direct", fak.q, far.b.h, 1536, gel.b.a().a(S).a(new gek.n(gkk.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gel bB = a(
      "entity_glint", fak.q, far.b.h, 1536, gel.b.a().a(T).a(new gek.n(gkk.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gel bC = a(
      "entity_glint_direct", fak.q, far.b.h, 1536, gel.b.a().a(U).a(new gek.n(gkk.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akk, gel> bD = ac.b($$0 -> {
      gek.n $$1 = new gek.n($$0, false, false);
      return a("crumbling", fak.j, far.b.h, 1536, false, true, gel.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akk, gel> bE = ac.b(
      $$0 -> a("text", fak.t, far.b.h, 786432, false, true, gel.b.a().a(W).a(new gek.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gel bF = a("text_background", fak.p, far.b.h, 1536, false, true, gel.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akk, gel> bG = ac.b(
      $$0 -> a("text_intensity", fak.t, far.b.h, 786432, false, true, gel.b.a().a(Y).a(new gek.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akk, gel> bH = ac.b(
      $$0 -> a("text_polygon_offset", fak.t, far.b.h, 1536, false, true, gel.b.a().a(W).a(new gek.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gel> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", fak.t, far.b.h, 1536, false, true, gel.b.a().a(Y).a(new gek.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gel> bJ = ac.b(
      $$0 -> a("text_see_through", fak.t, far.b.h, 1536, false, true, gel.b.a().a(Z).a(new gek.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gel bK = a("text_background_see_through", fak.p, far.b.h, 1536, false, true, gel.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akk, gel> bL = ac.b(
      $$0 -> a("text_intensity_see_through", fak.t, far.b.h, 1536, false, true, gel.b.a().a(ab).a(new gek.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gel bM = a("lightning", fak.n, far.b.h, 1536, false, true, gel.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gel bN = a("tripwire", fak.j, far.b.h, 1536, true, true, R());
   private static final gel bO = a(
      "end_portal", fak.m, far.b.h, 1536, false, false, gel.b.a().a(ae).a(gek.i.d().a(ggw.a, false, false).a(ggw.b, false, false).a()).a(false)
   );
   private static final gel bP = a(
      "end_gateway", fak.m, far.b.h, 1536, false, false, gel.b.a().a(af).a(gek.i.d().a(ggw.a, false, false).a(ggw.b, false, false).a()).a(false)
   );
   private static final gel bQ = a(false);
   private static final gel bR = a(true);
   public static final gel.a aW = a("lines", fak.o, far.b.a, 1536, gel.b.a().a(ah).a(new gek.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gel.a aX = a(
      "line_strip", fak.o, far.b.b, 1536, gel.b.a().a(ah).a(new gek.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gel.a> bS = ac.b(
      $$0 -> a("debug_line_strip", fak.n, far.b.d, 1536, gel.b.a().a(o).a(new gek.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gel.a bT = a("debug_filled_box", fak.n, far.b.f, 1536, false, true, gel.b.a().a(o).a(aI).a(h).a(false));
   private static final gel.a bU = a("debug_quads", fak.n, far.b.h, 1536, false, true, gel.b.a().a(o).a(h).a(ay).a(false));
   private static final gel.a bV = a("debug_section_quads", fak.n, far.b.h, 1536, false, true, gel.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gel.a bW = a("gui", fak.n, far.b.h, 786432, gel.b.a().a(ai).a(h).a(aB).a(false));
   private static final gel.a bX = a("gui_overlay", fak.n, far.b.h, 1536, gel.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gel.a bY = a("gui_text_highlight", fak.n, far.b.h, 1536, gel.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gel.a bZ = a("gui_ghost_recipe_overlay", fak.n, far.b.h, 1536, gel.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gel> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final far cb;
   private final far.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gel> cg;

   public static gel c() {
      return aZ;
   }

   public static gel d() {
      return ba;
   }

   public static gel e() {
      return bb;
   }

   private static gel.b a(gek.m $$0) {
      return gel.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gel f() {
      return bc;
   }

   private static gel.b Q() {
      return gel.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gel g() {
      return bd;
   }

   private static gel.a a(String $$0, akk $$1, boolean $$2) {
      gel.b $$3 = gel.b.a().a(u).a(new gek.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fak.k, far.b.h, 1536, true, false, $$3);
   }

   public static gel a(akk $$0) {
      return be.apply($$0);
   }

   public static gel b(akk $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gel c(akk $$0) {
      return bf.apply($$0);
   }

   public static gel d(akk $$0) {
      return bg.apply($$0);
   }

   public static gel a(akk $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gel e(akk $$0) {
      return a($$0, true);
   }

   public static gel b(akk $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gel f(akk $$0) {
      return b($$0, true);
   }

   public static gel g(akk $$0) {
      return bj.apply($$0);
   }

   public static gel h(akk $$0) {
      return bk.apply($$0);
   }

   public static gel c(akk $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gel i(akk $$0) {
      return c($$0, true);
   }

   public static gel d(akk $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gel j(akk $$0) {
      return d($$0, true);
   }

   public static gel k(akk $$0) {
      return bn.apply($$0);
   }

   public static gel e(akk $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gel l(akk $$0) {
      return bp.apply($$0);
   }

   public static gel m(akk $$0) {
      return bq.apply($$0);
   }

   public static gel n(akk $$0) {
      return br.apply($$0);
   }

   public static gel o(akk $$0) {
      return bs.apply($$0);
   }

   public static gel p(akk $$0) {
      return bt.apply($$0, d);
   }

   public static gel q(akk $$0) {
      return bm.apply($$0, false);
   }

   public static gel a(akk $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fak.k,
         far.b.h,
         1536,
         false,
         true,
         gel.b.a().a(am).a(new gek.n($$0, false, false)).a(new gek.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gel b(akk $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fak.k,
         far.b.h,
         1536,
         false,
         true,
         gel.b.a().a(K).a(new gek.n($$0, false, false)).a(new gek.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gel h() {
      return bu;
   }

   public static gel i() {
      return bv;
   }

   public static gel r(akk $$0) {
      return gel.a.aY.apply($$0, ay);
   }

   public static gel j() {
      return bw;
   }

   public static gel k() {
      return bx;
   }

   public static gel l() {
      return by;
   }

   public static gel m() {
      return bz;
   }

   public static gel n() {
      return bA;
   }

   public static gel o() {
      return bB;
   }

   public static gel p() {
      return bC;
   }

   public static gel s(akk $$0) {
      return bD.apply($$0);
   }

   public static gel t(akk $$0) {
      return bE.apply($$0);
   }

   public static gel q() {
      return bF;
   }

   public static gel u(akk $$0) {
      return bG.apply($$0);
   }

   public static gel v(akk $$0) {
      return bH.apply($$0);
   }

   public static gel w(akk $$0) {
      return bI.apply($$0);
   }

   public static gel x(akk $$0) {
      return bJ.apply($$0);
   }

   public static gel r() {
      return bK;
   }

   public static gel y(akk $$0) {
      return bL.apply($$0);
   }

   public static gel s() {
      return bM;
   }

   private static gel.b R() {
      return gel.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gel t() {
      return bN;
   }

   public static gel u() {
      return bO;
   }

   public static gel v() {
      return bP;
   }

   private static gel.a a(boolean $$0) {
      return a("clouds", fak.v, far.b.h, 786432, false, false, gel.b.a().a(ag).a(new gek.n(geb.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gel w() {
      return bQ;
   }

   public static gel x() {
      return bR;
   }

   public static gel y() {
      return aW;
   }

   public static gel z() {
      return aX;
   }

   public static gel a(double $$0) {
      return bS.apply($$0);
   }

   public static gel A() {
      return bT;
   }

   public static gel B() {
      return bU;
   }

   public static gel C() {
      return bV;
   }

   public static gel D() {
      return bW;
   }

   public static gel E() {
      return bX;
   }

   public static gel F() {
      return bY;
   }

   public static gel G() {
      return bZ;
   }

   public gel(String $$0, far $$1, far.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gel.a a(String $$0, far $$1, far.b $$2, int $$3, gel.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gel.a a(String $$0, far $$1, far.b $$2, int $$3, boolean $$4, boolean $$5, gel.b $$6) {
      return new gel.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fah $$0, fau $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         fah.b $$2 = $$0.d();
         this.a();
         fai.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gel> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public far J() {
      return this.cb;
   }

   public far.b K() {
      return this.cc;
   }

   public Optional<gel> L() {
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

   public Optional<gel> P() {
      return this.cg;
   }

   static final class a extends gel {
      static final BiFunction<akk, gek.c, gel> aY = ac.a(
         ($$0, $$1) -> gel.a("outline", fak.r, far.b.h, 1536, gel.b.a().a(N).a(new gek.n($$0, false, false)).a($$1).a(az).a(aK).a(gel.c.b))
      );
      private final gel.b aZ;
      private final Optional<gel> ba;
      private final boolean bb;

      a(String $$0, far $$1, far.b $$2, int $$3, boolean $$4, boolean $$5, gel.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gek::a), () -> $$6.o.forEach(gek::b));
         this.aZ = $$6;
         this.ba = $$6.n == gel.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gel.c.b;
      }

      @Override
      public Optional<gel> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gel.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gek.e a;
      private final gek.m b;
      private final gek.p c;
      private final gek.d d;
      final gek.c e;
      private final gek.g f;
      private final gek.l g;
      private final gek.f h;
      private final gek.k i;
      private final gek.o j;
      private final gek.q k;
      private final gek.h l;
      private final gek.b m;
      final gel.c n;
      final ImmutableList<gek> o;

      b(
         gek.e $$0,
         gek.m $$1,
         gek.p $$2,
         gek.d $$3,
         gek.c $$4,
         gek.g $$5,
         gek.l $$6,
         gek.f $$7,
         gek.k $$8,
         gek.o $$9,
         gek.q $$10,
         gek.h $$11,
         gek.b $$12,
         gel.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gek[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gel.b.a a() {
         return new gel.b.a();
      }

      public static class a {
         private gek.e a = gek.ap;
         private gek.m b = gek.i;
         private gek.p c;
         private gek.d d;
         private gek.c e;
         private gek.g f;
         private gek.l g;
         private gek.f h;
         private gek.k i;
         private gek.o j;
         private gek.q k;
         private gek.h l;
         private gek.b m;

         a() {
            this.c = gek.c;
            this.d = gek.aB;
            this.e = gek.ax;
            this.f = gek.au;
            this.g = gek.aw;
            this.h = gek.aG;
            this.i = gek.aJ;
            this.j = gek.aq;
            this.k = gek.aD;
            this.l = gek.aQ;
            this.m = gek.aR;
         }

         public gel.b.a a(gek.e $$0) {
            this.a = $$0;
            return this;
         }

         public gel.b.a a(gek.m $$0) {
            this.b = $$0;
            return this;
         }

         public gel.b.a a(gek.p $$0) {
            this.c = $$0;
            return this;
         }

         public gel.b.a a(gek.d $$0) {
            this.d = $$0;
            return this;
         }

         public gel.b.a a(gek.c $$0) {
            this.e = $$0;
            return this;
         }

         public gel.b.a a(gek.g $$0) {
            this.f = $$0;
            return this;
         }

         public gel.b.a a(gek.l $$0) {
            this.g = $$0;
            return this;
         }

         public gel.b.a a(gek.f $$0) {
            this.h = $$0;
            return this;
         }

         public gel.b.a a(gek.k $$0) {
            this.i = $$0;
            return this;
         }

         public gel.b.a a(gek.o $$0) {
            this.j = $$0;
            return this;
         }

         public gel.b.a a(gek.q $$0) {
            this.k = $$0;
            return this;
         }

         public gel.b.a a(gek.h $$0) {
            this.l = $$0;
            return this;
         }

         public gel.b.a a(gek.b $$0) {
            this.m = $$0;
            return this;
         }

         public gel.b a(boolean $$0) {
            return this.a($$0 ? gel.c.c : gel.c.a);
         }

         public gel.b a(gel.c $$0) {
            return new gel.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
