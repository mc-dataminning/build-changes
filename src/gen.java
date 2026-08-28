import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gen extends gem {
   private static final int aY = 1048576;
   public static final int aT = 4194304;
   public static final int aU = 786432;
   public static final int aV = 1536;
   private static final gen aZ = a("solid", fam.j, fat.b.h, 4194304, true, false, gen.b.a().a(at).a(p).a(an).a(true));
   private static final gen ba = a("cutout_mipped", fam.j, fat.b.h, 4194304, true, false, gen.b.a().a(at).a(q).a(an).a(true));
   private static final gen bb = a("cutout", fam.j, fat.b.h, 786432, true, false, gen.b.a().a(at).a(r).a(ao).a(true));
   private static final gen bc = a("translucent", fam.j, fat.b.h, 786432, true, true, a(s));
   private static final gen bd = a("translucent_moving_block", fam.j, fat.b.h, 786432, false, true, Q());
   private static final Function<akk, gen> be = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akk, gen> bf = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(v).a(new gem.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fam.k, fat.b.h, 1536, true, false, $$1);
   });
   private static final Function<akk, gen> bg = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(w).a(new gem.n($$0, false, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fam.k, fat.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akk, Boolean, gen> bh = ac.a(($$0, $$1) -> {
      gen.b $$2 = gen.b.a().a(x).a(new gem.n($$0, false, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fam.k, fat.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akk, Boolean, gen> bi = ac.a(($$0, $$1) -> {
      gen.b $$2 = gen.b.a().a(y).a(new gem.n($$0, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fam.k, fat.b.h, 1536, true, false, $$2);
   });
   private static final Function<akk, gen> bj = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(z).a(new gem.n($$0, false, false)).a(h).a(aP).a(at).a(av).a(gem.aD).a(true);
      return a("item_entity_translucent_cull", fam.k, fat.b.h, 1536, true, true, $$1);
   });
   private static final Function<akk, gen> bk = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(A).a(new gem.n($$0, false, false)).a(h).a(at).a(av).a(true);
      return a("entity_translucent_cull", fam.k, fat.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akk, Boolean, gen> bl = ac.a(($$0, $$1) -> {
      gen.b $$2 = gen.b.a().a(B).a(new gem.n($$0, false, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fam.k, fat.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akk, Boolean, gen> bm = ac.a(($$0, $$1) -> {
      gen.b $$2 = gen.b.a().a(C).a(new gem.n($$0, false, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fam.k, fat.b.h, 1536, true, true, $$2);
   });
   private static final Function<akk, gen> bn = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(D).a(new gem.n($$0, false, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fam.k, fat.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, Boolean, gen> bo = ac.a(($$0, $$1) -> {
      gen.b $$2 = gen.b.a().a(E).a(new gem.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fam.j, fat.b.h, 1536, false, true, $$2);
   });
   private static final Function<akk, gen> bp = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(F).a(new gem.n($$0, false, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fam.k, fat.b.h, 1536, $$1);
   });
   private static final Function<akk, gen> bq = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(G).a(new gem.n($$0, false, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fam.k, fat.b.h, 1536, false, true, $$1);
   });
   private static final Function<akk, gen> br = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(H).a(new gem.n($$0, false, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fam.k, fat.b.h, 1536, false, false, $$1);
   });
   private static final Function<akk, gen> bs = ac.b($$0 -> {
      gen.b $$1 = gen.b.a().a(I).a(new gem.n($$0, false, false)).a(ay).a(true);
      return a("entity_alpha", fam.k, fat.b.h, 1536, $$1);
   });
   private static final BiFunction<akk, gem.p, gen> bt = ac.a(($$0, $$1) -> {
      gem.n $$2 = new gem.n($$0, false, false);
      return a("eyes", fam.k, fat.b.h, 1536, false, true, gen.b.a().a(J).a($$2).a($$1).a(aE).a(false));
   });
   private static final gen bu = a("leash", fam.p, fat.b.f, 1536, gen.b.a().a(L).a(ap).a(ay).a(at).a(false));
   private static final gen bv = a("water_mask", fam.m, fat.b.h, 1536, gen.b.a().a(M).a(ap).a(aF).a(false));
   private static final gen bw = a(
      "armor_glint", fam.q, fat.b.h, 1536, gen.b.a().a(O).a(new gem.n(gkm.a, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aI).a(false)
   );
   private static final gen bx = a(
      "armor_entity_glint", fam.q, fat.b.h, 1536, gen.b.a().a(P).a(new gem.n(gkm.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gen by = a(
      "glint_translucent", fam.q, fat.b.h, 1536, gen.b.a().a(Q).a(new gem.n(gkm.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aP).a(false)
   );
   private static final gen bz = a("glint", fam.q, fat.b.h, 1536, gen.b.a().a(R).a(new gem.n(gkm.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gen bA = a("glint_direct", fam.q, fat.b.h, 1536, gen.b.a().a(S).a(new gem.n(gkm.b, true, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gen bB = a(
      "entity_glint", fam.q, fat.b.h, 1536, gen.b.a().a(T).a(new gem.n(gkm.a, true, false)).a(aE).a(ay).a(aA).a(f).a(aP).a(as).a(false)
   );
   private static final gen bC = a(
      "entity_glint_direct", fam.q, fat.b.h, 1536, gen.b.a().a(U).a(new gem.n(gkm.a, true, false)).a(aE).a(ay).a(aA).a(f).a(as).a(false)
   );
   private static final Function<akk, gen> bD = ac.b($$0 -> {
      gem.n $$1 = new gem.n($$0, false, false);
      return a("crumbling", fam.j, fat.b.h, 1536, false, true, gen.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<akk, gen> bE = ac.b(
      $$0 -> a("text", fam.t, fat.b.h, 786432, false, true, gen.b.a().a(W).a(new gem.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final gen bF = a("text_background", fam.p, fat.b.h, 1536, false, true, gen.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<akk, gen> bG = ac.b(
      $$0 -> a("text_intensity", fam.t, fat.b.h, 786432, false, true, gen.b.a().a(Y).a(new gem.n($$0, false, false)).a(h).a(at).a(false))
   );
   private static final Function<akk, gen> bH = ac.b(
      $$0 -> a("text_polygon_offset", fam.t, fat.b.h, 1536, false, true, gen.b.a().a(W).a(new gem.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gen> bI = ac.b(
      $$0 -> a("text_intensity_polygon_offset", fam.t, fat.b.h, 1536, false, true, gen.b.a().a(Y).a(new gem.n($$0, false, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<akk, gen> bJ = ac.b(
      $$0 -> a("text_see_through", fam.t, fat.b.h, 1536, false, true, gen.b.a().a(Z).a(new gem.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gen bK = a("text_background_see_through", fam.p, fat.b.h, 1536, false, true, gen.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<akk, gen> bL = ac.b(
      $$0 -> a("text_intensity_see_through", fam.t, fat.b.h, 1536, false, true, gen.b.a().a(ab).a(new gem.n($$0, false, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gen bM = a("lightning", fam.n, fat.b.h, 1536, false, true, gen.b.a().a(ac).a(aD).a(e).a(aN).a(false));
   private static final gen bN = a("tripwire", fam.j, fat.b.h, 1536, true, true, R());
   private static final gen bO = a(
      "end_portal", fam.m, fat.b.h, 1536, false, false, gen.b.a().a(ae).a(gem.i.d().a(ggy.a, false, false).a(ggy.b, false, false).a()).a(false)
   );
   private static final gen bP = a(
      "end_gateway", fam.m, fat.b.h, 1536, false, false, gen.b.a().a(af).a(gem.i.d().a(ggy.a, false, false).a(ggy.b, false, false).a()).a(false)
   );
   private static final gen bQ = a(false);
   private static final gen bR = a(true);
   public static final gen.a aW = a("lines", fam.o, fat.b.a, 1536, gen.b.a().a(ah).a(new gem.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false));
   public static final gen.a aX = a(
      "line_strip", fam.o, fat.b.b, 1536, gen.b.a().a(ah).a(new gem.h(OptionalDouble.empty())).a(aI).a(h).a(aP).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gen.a> bS = ac.b(
      $$0 -> a("debug_line_strip", fam.n, fat.b.d, 1536, gen.b.a().a(o).a(new gem.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gen.a bT = a("debug_filled_box", fam.n, fat.b.f, 1536, false, true, gen.b.a().a(o).a(aI).a(h).a(false));
   private static final gen.a bU = a("debug_quads", fam.n, fat.b.h, 1536, false, true, gen.b.a().a(o).a(h).a(ay).a(false));
   private static final gen.a bV = a("debug_section_quads", fam.n, fat.b.h, 1536, false, true, gen.b.a().a(o).a(aI).a(h).a(ax).a(false));
   private static final gen.a bW = a("gui", fam.n, fat.b.h, 786432, gen.b.a().a(ai).a(h).a(aB).a(false));
   private static final gen.a bX = a("gui_overlay", fam.n, fat.b.h, 1536, gen.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final gen.a bY = a("gui_text_highlight", fam.n, fat.b.h, 1536, gen.b.a().a(ak).a(h).a(az).a(aS).a(false));
   private static final gen.a bZ = a("gui_ghost_recipe_overlay", fam.n, fat.b.h, 1536, gen.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final ImmutableList<gen> ca = ImmutableList.of(c(), d(), e(), f(), t());
   private final fat cb;
   private final fat.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<gen> cg;

   public static gen c() {
      return aZ;
   }

   public static gen d() {
      return ba;
   }

   public static gen e() {
      return bb;
   }

   private static gen.b a(gem.m $$0) {
      return gen.b.a().a(at).a($$0).a(an).a(h).a(aL).a(true);
   }

   public static gen f() {
      return bc;
   }

   private static gen.b Q() {
      return gen.b.a().a(at).a(t).a(an).a(h).a(aP).a(true);
   }

   public static gen g() {
      return bd;
   }

   private static gen.a a(String $$0, akk $$1, boolean $$2) {
      gen.b $$3 = gen.b.a().a(u).a(new gem.n($$1, false, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fam.k, fat.b.h, 1536, true, false, $$3);
   }

   public static gen a(akk $$0) {
      return be.apply($$0);
   }

   public static gen b(akk $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gen c(akk $$0) {
      return bf.apply($$0);
   }

   public static gen d(akk $$0) {
      return bg.apply($$0);
   }

   public static gen a(akk $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static gen e(akk $$0) {
      return a($$0, true);
   }

   public static gen b(akk $$0, boolean $$1) {
      return bi.apply($$0, $$1);
   }

   public static gen f(akk $$0) {
      return b($$0, true);
   }

   public static gen g(akk $$0) {
      return bj.apply($$0);
   }

   public static gen h(akk $$0) {
      return bk.apply($$0);
   }

   public static gen c(akk $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static gen i(akk $$0) {
      return c($$0, true);
   }

   public static gen d(akk $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gen j(akk $$0) {
      return d($$0, true);
   }

   public static gen k(akk $$0) {
      return bn.apply($$0);
   }

   public static gen e(akk $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static gen l(akk $$0) {
      return bp.apply($$0);
   }

   public static gen m(akk $$0) {
      return bq.apply($$0);
   }

   public static gen n(akk $$0) {
      return br.apply($$0);
   }

   public static gen o(akk $$0) {
      return bs.apply($$0);
   }

   public static gen p(akk $$0) {
      return bt.apply($$0, d);
   }

   public static gen q(akk $$0) {
      return bm.apply($$0, false);
   }

   public static gen a(akk $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fam.k,
         fat.b.h,
         1536,
         false,
         true,
         gen.b.a().a(am).a(new gem.n($$0, false, false)).a(new gem.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gen b(akk $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fam.k,
         fat.b.h,
         1536,
         false,
         true,
         gen.b.a().a(K).a(new gem.n($$0, false, false)).a(new gem.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gen h() {
      return bu;
   }

   public static gen i() {
      return bv;
   }

   public static gen r(akk $$0) {
      return gen.a.aY.apply($$0, ay);
   }

   public static gen j() {
      return bw;
   }

   public static gen k() {
      return bx;
   }

   public static gen l() {
      return by;
   }

   public static gen m() {
      return bz;
   }

   public static gen n() {
      return bA;
   }

   public static gen o() {
      return bB;
   }

   public static gen p() {
      return bC;
   }

   public static gen s(akk $$0) {
      return bD.apply($$0);
   }

   public static gen t(akk $$0) {
      return bE.apply($$0);
   }

   public static gen q() {
      return bF;
   }

   public static gen u(akk $$0) {
      return bG.apply($$0);
   }

   public static gen v(akk $$0) {
      return bH.apply($$0);
   }

   public static gen w(akk $$0) {
      return bI.apply($$0);
   }

   public static gen x(akk $$0) {
      return bJ.apply($$0);
   }

   public static gen r() {
      return bK;
   }

   public static gen y(akk $$0) {
      return bL.apply($$0);
   }

   public static gen s() {
      return bM;
   }

   private static gen.b R() {
      return gen.b.a().a(at).a(ad).a(an).a(h).a(aN).a(true);
   }

   public static gen t() {
      return bN;
   }

   public static gen u() {
      return bO;
   }

   public static gen v() {
      return bP;
   }

   private static gen.a a(boolean $$0) {
      return a("clouds", fam.v, fat.b.h, 786432, false, false, gen.b.a().a(ag).a(new gem.n(ged.c, false, false)).a(h).a(ay).a($$0 ? aF : aD).a(aO).a(true));
   }

   public static gen w() {
      return bQ;
   }

   public static gen x() {
      return bR;
   }

   public static gen y() {
      return aW;
   }

   public static gen z() {
      return aX;
   }

   public static gen a(double $$0) {
      return bS.apply($$0);
   }

   public static gen A() {
      return bT;
   }

   public static gen B() {
      return bU;
   }

   public static gen C() {
      return bV;
   }

   public static gen D() {
      return bW;
   }

   public static gen E() {
      return bX;
   }

   public static gen F() {
      return bY;
   }

   public static gen G() {
      return bZ;
   }

   public gen(String $$0, fat $$1, fat.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static gen.a a(String $$0, fat $$1, fat.b $$2, int $$3, gen.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gen.a a(String $$0, fat $$1, fat.b $$2, int $$3, boolean $$4, boolean $$5, gen.b $$6) {
      return new gen.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(faj $$0, faw $$1) {
      if ($$0.k()) {
         if (this.cf) {
            $$0.a($$1);
         }

         faj.b $$2 = $$0.d();
         this.a();
         fak.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gen> H() {
      return ca;
   }

   public int I() {
      return this.cd;
   }

   public fat J() {
      return this.cb;
   }

   public fat.b K() {
      return this.cc;
   }

   public Optional<gen> L() {
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

   public Optional<gen> P() {
      return this.cg;
   }

   static final class a extends gen {
      static final BiFunction<akk, gem.c, gen> aY = ac.a(
         ($$0, $$1) -> gen.a("outline", fam.r, fat.b.h, 1536, gen.b.a().a(N).a(new gem.n($$0, false, false)).a($$1).a(az).a(aK).a(gen.c.b))
      );
      private final gen.b aZ;
      private final Optional<gen> ba;
      private final boolean bb;

      a(String $$0, fat $$1, fat.b $$2, int $$3, boolean $$4, boolean $$5, gen.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gem::a), () -> $$6.o.forEach(gem::b));
         this.aZ = $$6;
         this.ba = $$6.n == gen.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == gen.c.b;
      }

      @Override
      public Optional<gen> L() {
         return this.ba;
      }

      @Override
      public boolean M() {
         return this.bb;
      }

      protected final gen.b Q() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final gem.e a;
      private final gem.m b;
      private final gem.p c;
      private final gem.d d;
      final gem.c e;
      private final gem.g f;
      private final gem.l g;
      private final gem.f h;
      private final gem.k i;
      private final gem.o j;
      private final gem.q k;
      private final gem.h l;
      private final gem.b m;
      final gen.c n;
      final ImmutableList<gem> o;

      b(
         gem.e $$0,
         gem.m $$1,
         gem.p $$2,
         gem.d $$3,
         gem.c $$4,
         gem.g $$5,
         gem.l $$6,
         gem.f $$7,
         gem.k $$8,
         gem.o $$9,
         gem.q $$10,
         gem.h $$11,
         gem.b $$12,
         gen.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gem[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gen.b.a a() {
         return new gen.b.a();
      }

      public static class a {
         private gem.e a = gem.ap;
         private gem.m b = gem.i;
         private gem.p c;
         private gem.d d;
         private gem.c e;
         private gem.g f;
         private gem.l g;
         private gem.f h;
         private gem.k i;
         private gem.o j;
         private gem.q k;
         private gem.h l;
         private gem.b m;

         a() {
            this.c = gem.c;
            this.d = gem.aB;
            this.e = gem.ax;
            this.f = gem.au;
            this.g = gem.aw;
            this.h = gem.aG;
            this.i = gem.aJ;
            this.j = gem.aq;
            this.k = gem.aD;
            this.l = gem.aQ;
            this.m = gem.aR;
         }

         public gen.b.a a(gem.e $$0) {
            this.a = $$0;
            return this;
         }

         public gen.b.a a(gem.m $$0) {
            this.b = $$0;
            return this;
         }

         public gen.b.a a(gem.p $$0) {
            this.c = $$0;
            return this;
         }

         public gen.b.a a(gem.d $$0) {
            this.d = $$0;
            return this;
         }

         public gen.b.a a(gem.c $$0) {
            this.e = $$0;
            return this;
         }

         public gen.b.a a(gem.g $$0) {
            this.f = $$0;
            return this;
         }

         public gen.b.a a(gem.l $$0) {
            this.g = $$0;
            return this;
         }

         public gen.b.a a(gem.f $$0) {
            this.h = $$0;
            return this;
         }

         public gen.b.a a(gem.k $$0) {
            this.i = $$0;
            return this;
         }

         public gen.b.a a(gem.o $$0) {
            this.j = $$0;
            return this;
         }

         public gen.b.a a(gem.q $$0) {
            this.k = $$0;
            return this;
         }

         public gen.b.a a(gem.h $$0) {
            this.l = $$0;
            return this;
         }

         public gen.b.a a(gem.b $$0) {
            this.m = $$0;
            return this;
         }

         public gen.b a(boolean $$0) {
            return this.a($$0 ? gen.c.c : gen.c.a);
         }

         public gen.b a(gen.c $$0) {
            return new gen.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
