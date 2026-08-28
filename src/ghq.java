import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ghq extends ghp {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final ghq ba = a("solid", fdc.b, fdj.c.h, 4194304, true, false, ghq.b.a().a(at).a(t).a(an).a(true));
   private static final ghq bb = a("cutout_mipped", fdc.b, fdj.c.h, 4194304, true, false, ghq.b.a().a(at).a(u).a(an).a(true));
   private static final ghq bc = a("cutout", fdc.b, fdj.c.h, 786432, true, false, ghq.b.a().a(at).a(v).a(ao).a(true));
   private static final ghq bd = a("translucent", fdc.b, fdj.c.h, 786432, true, true, a(w));
   private static final ghq be = a("translucent_moving_block", fdc.b, fdj.c.h, 786432, false, true, U());
   private static final Function<alc, ghq> bf = ad.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alc, ghq> bg = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(z).a(new ghp.n($$0, bag.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fdc.c, fdj.c.h, 1536, true, false, $$1);
   });
   private static final Function<alc, ghq> bh = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(z).a(new ghp.n($$0, bag.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fdc.c, fdj.c.h, 1536, true, false, $$1);
   });
   private static final Function<alc, ghq> bi = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(A).a(new ghp.n($$0, bag.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fdc.c, fdj.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alc, Boolean, ghq> bj = ad.a(($$0, $$1) -> {
      ghq.b $$2 = ghq.b.a().a(B).a(new ghp.n($$0, bag.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fdc.c, fdj.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alc, Boolean, ghq> bk = ad.a(($$0, $$1) -> {
      ghq.b $$2 = ghq.b.a().a(C).a(new ghp.n($$0, bag.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fdc.c, fdj.c.h, 1536, true, false, $$2);
   });
   private static final Function<alc, ghq> bl = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(D).a(new ghp.n($$0, bag.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fdc.c, fdj.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alc, Boolean, ghq> bm = ad.a(($$0, $$1) -> {
      ghq.b $$2 = ghq.b.a().a(E).a(new ghp.n($$0, bag.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fdc.c, fdj.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alc, Boolean, ghq> bn = ad.a(($$0, $$1) -> {
      ghq.b $$2 = ghq.b.a().a(F).a(new ghp.n($$0, bag.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fdc.c, fdj.c.h, 1536, true, true, $$2);
   });
   private static final Function<alc, ghq> bo = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(G).a(new ghp.n($$0, bag.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fdc.c, fdj.c.h, 1536, $$1);
   });
   private static final BiFunction<alc, Boolean, ghq> bp = ad.a(($$0, $$1) -> {
      ghq.b $$2 = ghq.b.a().a(H).a(new ghp.n($$0, bag.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fdc.b, fdj.c.h, 1536, false, true, $$2);
   });
   private static final Function<alc, ghq> bq = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(I).a(new ghp.n($$0, bag.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fdc.c, fdj.c.h, 1536, $$1);
   });
   private static final Function<alc, ghq> br = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(J).a(new ghp.n($$0, bag.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fdc.c, fdj.c.h, 1536, false, true, $$1);
   });
   private static final Function<alc, ghq> bs = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(K).a(new ghp.n($$0, bag.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fdc.c, fdj.c.h, 1536, false, false, $$1);
   });
   private static final Function<alc, ghq> bt = ad.b($$0 -> {
      ghq.b $$1 = ghq.b.a().a(L).a(new ghp.n($$0, bag.b, false)).a(ay).a(true);
      return a("entity_alpha", fdc.c, fdj.c.h, 1536, $$1);
   });
   private static final BiFunction<alc, ghp.p, ghq> bu = ad.a(($$0, $$1) -> {
      ghp.n $$2 = new ghp.n($$0, bag.b, false);
      return a("eyes", fdc.c, fdj.c.h, 1536, false, true, ghq.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final ghq bv = a("leash", fdc.h, fdj.c.f, 1536, ghq.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final ghq bw = a("water_mask", fdc.e, fdj.c.h, 1536, ghq.b.a().a(P).a(ap).a(aF).a(false));
   private static final ghq bx = a(
      "armor_entity_glint", fdc.i, fdj.c.h, 1536, ghq.b.a().a(R).a(new ghp.n(goh.a, bag.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final ghq by = a(
      "glint_translucent", fdc.i, fdj.c.h, 1536, ghq.b.a().a(S).a(new ghp.n(goh.b, bag.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final ghq bz = a("glint", fdc.i, fdj.c.h, 1536, ghq.b.a().a(T).a(new ghp.n(goh.b, bag.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final ghq bA = a(
      "entity_glint", fdc.i, fdj.c.h, 1536, ghq.b.a().a(U).a(new ghp.n(goh.a, bag.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<alc, ghq> bB = ad.b($$0 -> {
      ghp.n $$1 = new ghp.n($$0, bag.b, false);
      return a("crumbling", fdc.b, fdj.c.h, 1536, false, true, ghq.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alc, ghq> bC = ad.b(
      $$0 -> a("text", fdc.k, fdj.c.h, 786432, false, false, ghq.b.a().a(W).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(false))
   );
   private static final ghq bD = a("text_background", fdc.h, fdj.c.h, 1536, false, true, ghq.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alc, ghq> bE = ad.b(
      $$0 -> a("text_intensity", fdc.k, fdj.c.h, 786432, false, true, ghq.b.a().a(Y).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(false))
   );
   private static final Function<alc, ghq> bF = ad.b(
      $$0 -> a("text_polygon_offset", fdc.k, fdj.c.h, 1536, false, true, ghq.b.a().a(W).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alc, ghq> bG = ad.b(
      $$0 -> a("text_intensity_polygon_offset", fdc.k, fdj.c.h, 1536, false, true, ghq.b.a().a(Y).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alc, ghq> bH = ad.b(
      $$0 -> a("text_see_through", fdc.k, fdj.c.h, 1536, false, true, ghq.b.a().a(Z).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final ghq bI = a("text_background_see_through", fdc.h, fdj.c.h, 1536, false, true, ghq.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alc, ghq> bJ = ad.b(
      $$0 -> a("text_intensity_see_through", fdc.k, fdj.c.h, 1536, false, true, ghq.b.a().a(ab).a(new ghp.n($$0, bag.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final ghq bK = a("lightning", fdc.f, fdj.c.h, 1536, false, true, ghq.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final ghq bL = a("dragon_rays", fdc.f, fdj.c.e, 1536, false, false, ghq.b.a().a(ac).a(aE).a(e).a(false));
   private static final ghq bM = a("dragon_rays_depth", fdc.e, fdj.c.e, 1536, false, false, ghq.b.a().a(o).a(aF).a(false));
   private static final ghq bN = a("tripwire", fdc.b, fdj.c.h, 1536, true, true, V());
   private static final ghq bO = a(
      "end_portal", fdc.e, fdj.c.h, 1536, false, false, ghq.b.a().a(ae).a(ghp.i.d().a(gkk.a, false, false).a(gkk.b, false, false).a()).a(false)
   );
   private static final ghq bP = a(
      "end_gateway", fdc.e, fdj.c.h, 1536, false, false, ghq.b.a().a(af).a(ghp.i.d().a(gkk.a, false, false).a(gkk.b, false, false).a()).a(false)
   );
   private static final ghq bQ = a(false, false);
   private static final ghq bR = a(false, true);
   private static final ghq bS = a(true, true);
   public static final ghq.a aX = a("lines", fdc.g, fdj.c.a, 1536, ghq.b.a().a(ah).a(new ghp.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final ghq.a aY = a(
      "line_strip", fdc.g, fdj.c.b, 1536, ghq.b.a().a(ah).a(new ghp.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, ghq.a> bT = ad.b(
      $$0 -> a("debug_line_strip", fdc.f, fdj.c.d, 1536, ghq.b.a().a(r).a(new ghp.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final ghq.a bU = a("debug_filled_box", fdc.f, fdj.c.f, 1536, false, true, ghq.b.a().a(r).a(aI).a(h).a(false));
   private static final ghq.a bV = a("debug_quads", fdc.f, fdj.c.h, 1536, false, true, ghq.b.a().a(r).a(h).a(ay).a(false));
   private static final ghq.a bW = a("debug_triangle_fan", fdc.f, fdj.c.g, 1536, false, true, ghq.b.a().a(r).a(h).a(ay).a(false));
   private static final ghq.a bX = a("debug_structure_quads", fdc.f, fdj.c.h, 1536, false, true, ghq.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final ghq.a bY = a("debug_section_quads", fdc.f, fdj.c.h, 1536, false, true, ghq.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final ghq.a bZ = a("gui", fdc.f, fdj.c.h, 786432, ghq.b.a().a(ai).a(h).a(aB).a(false));
   private static final ghq.a ca = a("gui_overlay", fdc.f, fdj.c.h, 1536, ghq.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<alc, ghq> cb = ad.b(
      $$0 -> a("gui_textured_overlay", fdc.j, fdj.c.h, 1536, ghq.b.a().a(new ghp.n($$0, bag.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<alc, ghq> cc = ad.b(
      $$0 -> a("gui_opaque_textured_background", fdc.j, fdj.c.h, 786432, ghq.b.a().a(new ghp.n($$0, bag.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final ghq.a cd = a("gui_nausea_overlay", fdc.j, fdj.c.h, 1536, ghq.b.a().a(new ghp.n(fjw.a, bag.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final ghq.a ce = a("gui_text_highlight", fdc.f, fdj.c.h, 1536, ghq.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final ghq.a cf = a("gui_ghost_recipe_overlay", fdc.f, fdj.c.h, 1536, ghq.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<alc, ghq> cg = ad.b(
      $$0 -> a("gui_textured", fdc.j, fdj.c.h, 786432, ghq.b.a().a(new ghp.n($$0, bag.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<alc, ghq> ch = ad.b(
      $$0 -> a("vignette", fdc.j, fdj.c.h, 786432, ghq.b.a().a(new ghp.n($$0, bag.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<alc, ghq> ci = ad.b(
      $$0 -> a("crosshair", fdc.j, fdj.c.h, 786432, ghq.b.a().a(new ghp.n($$0, bag.b, false)).a(s).a(j).a(false))
   );
   private static final ghq.a cj = a("mojang_logo", fdc.j, fdj.c.h, 786432, ghq.b.a().a(new ghp.n(fpt.a, bag.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<ghq> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final fdj cl;
   private final fdj.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static ghq c() {
      return ba;
   }

   public static ghq d() {
      return bb;
   }

   public static ghq e() {
      return bc;
   }

   private static ghq.b a(ghp.m $$0) {
      return ghq.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static ghq f() {
      return bd;
   }

   private static ghq.b U() {
      return ghq.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static ghq g() {
      return be;
   }

   private static ghq.a a(String $$0, alc $$1, boolean $$2) {
      ghq.b $$3 = ghq.b.a().a(y).a(new ghp.n($$1, bag.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fdc.c, fdj.c.h, 1536, true, false, $$3);
   }

   public static ghq a(alc $$0) {
      return bf.apply($$0);
   }

   public static ghq b(alc $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static ghq c(alc $$0) {
      return bg.apply($$0);
   }

   public static ghq d(alc $$0) {
      return bh.apply($$0);
   }

   public static ghq e(alc $$0) {
      return bi.apply($$0);
   }

   public static ghq a(alc $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static ghq f(alc $$0) {
      return a($$0, true);
   }

   public static ghq b(alc $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static ghq g(alc $$0) {
      return b($$0, true);
   }

   public static ghq h(alc $$0) {
      return bl.apply($$0);
   }

   public static ghq c(alc $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static ghq i(alc $$0) {
      return c($$0, true);
   }

   public static ghq d(alc $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static ghq j(alc $$0) {
      return d($$0, true);
   }

   public static ghq k(alc $$0) {
      return bo.apply($$0);
   }

   public static ghq e(alc $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static ghq l(alc $$0) {
      return bq.apply($$0);
   }

   public static ghq m(alc $$0) {
      return br.apply($$0);
   }

   public static ghq n(alc $$0) {
      return bs.apply($$0);
   }

   public static ghq o(alc $$0) {
      return bt.apply($$0);
   }

   public static ghq p(alc $$0) {
      return bu.apply($$0, d);
   }

   public static ghq q(alc $$0) {
      return bn.apply($$0, false);
   }

   public static ghq a(alc $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fdc.c,
         fdj.c.h,
         1536,
         false,
         true,
         ghq.b.a().a(am).a(new ghp.n($$0, bag.b, false)).a(new ghp.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static ghq b(alc $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fdc.c,
         fdj.c.h,
         1536,
         false,
         true,
         ghq.b.a().a(N).a(new ghp.n($$0, bag.b, false)).a(new ghp.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static ghq h() {
      return bv;
   }

   public static ghq i() {
      return bw;
   }

   public static ghq r(alc $$0) {
      return ghq.a.aZ.apply($$0, ay);
   }

   public static ghq j() {
      return bx;
   }

   public static ghq k() {
      return by;
   }

   public static ghq l() {
      return bz;
   }

   public static ghq m() {
      return bA;
   }

   public static ghq s(alc $$0) {
      return bB.apply($$0);
   }

   public static ghq t(alc $$0) {
      return bC.apply($$0);
   }

   public static ghq n() {
      return bD;
   }

   public static ghq u(alc $$0) {
      return bE.apply($$0);
   }

   public static ghq v(alc $$0) {
      return bF.apply($$0);
   }

   public static ghq w(alc $$0) {
      return bG.apply($$0);
   }

   public static ghq x(alc $$0) {
      return bH.apply($$0);
   }

   public static ghq o() {
      return bI;
   }

   public static ghq y(alc $$0) {
      return bJ.apply($$0);
   }

   public static ghq p() {
      return bK;
   }

   public static ghq q() {
      return bL;
   }

   public static ghq r() {
      return bM;
   }

   private static ghq.b V() {
      return ghq.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static ghq s() {
      return bN;
   }

   public static ghq t() {
      return bO;
   }

   public static ghq u() {
      return bP;
   }

   private static ghq.a a(boolean $$0, boolean $$1) {
      return a("clouds", fdc.f, fdj.c.h, 786432, false, false, ghq.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static ghq v() {
      return bQ;
   }

   public static ghq w() {
      return bR;
   }

   public static ghq x() {
      return bS;
   }

   public static ghq y() {
      return aX;
   }

   public static ghq z() {
      return aY;
   }

   public static ghq a(double $$0) {
      return bT.apply($$0);
   }

   public static ghq A() {
      return bU;
   }

   public static ghq B() {
      return bV;
   }

   public static ghq C() {
      return bW;
   }

   public static ghq D() {
      return bX;
   }

   public static ghq E() {
      return bY;
   }

   public static ghq F() {
      return bZ;
   }

   public static ghq G() {
      return ca;
   }

   public static ghq z(alc $$0) {
      return cb.apply($$0);
   }

   public static ghq A(alc $$0) {
      return cc.apply($$0);
   }

   public static ghq H() {
      return cd;
   }

   public static ghq I() {
      return ce;
   }

   public static ghq J() {
      return cf;
   }

   public static ghq B(alc $$0) {
      return cg.apply($$0);
   }

   public static ghq C(alc $$0) {
      return ch.apply($$0);
   }

   public static ghq D(alc $$0) {
      return ci.apply($$0);
   }

   public static ghq K() {
      return cj;
   }

   public ghq(String $$0, fdj $$1, fdj.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static ghq.a a(String $$0, fdj $$1, fdj.c $$2, int $$3, ghq.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static ghq.a a(String $$0, fdj $$1, fdj.c $$2, int $$3, boolean $$4, boolean $$5, ghq.b $$6) {
      return new ghq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fdd $$0) {
      this.a();
      fda.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<ghq> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public fdj N() {
      return this.cl;
   }

   public fdj.c O() {
      return this.cm;
   }

   public Optional<ghq> P() {
      return Optional.empty();
   }

   public boolean Q() {
      return false;
   }

   public boolean R() {
      return this.co;
   }

   public boolean S() {
      return !this.cm.l;
   }

   public boolean T() {
      return this.cp;
   }

   static final class a extends ghq {
      static final BiFunction<alc, ghp.c, ghq> aZ = ad.a(
         ($$0, $$1) -> ghq.a("outline", fdc.j, fdj.c.h, 1536, ghq.b.a().a(Q).a(new ghp.n($$0, bag.b, false)).a($$1).a(az).a(aL).a(ghq.c.b))
      );
      private final ghq.b ba;
      private final Optional<ghq> bb;
      private final boolean bc;

      a(String $$0, fdj $$1, fdj.c $$2, int $$3, boolean $$4, boolean $$5, ghq.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ghp::a), () -> $$6.o.forEach(ghp::b));
         this.ba = $$6;
         this.bb = $$6.n == ghq.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == ghq.c.b;
      }

      @Override
      public Optional<ghq> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final ghq.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final ghp.e a;
      private final ghp.m b;
      private final ghp.p c;
      private final ghp.d d;
      final ghp.c e;
      private final ghp.g f;
      private final ghp.l g;
      private final ghp.f h;
      private final ghp.k i;
      private final ghp.o j;
      private final ghp.q k;
      private final ghp.h l;
      private final ghp.b m;
      final ghq.c n;
      final ImmutableList<ghp> o;

      b(
         ghp.e $$0,
         ghp.m $$1,
         ghp.p $$2,
         ghp.d $$3,
         ghp.c $$4,
         ghp.g $$5,
         ghp.l $$6,
         ghp.f $$7,
         ghp.k $$8,
         ghp.o $$9,
         ghp.q $$10,
         ghp.h $$11,
         ghp.b $$12,
         ghq.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ghp[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static ghq.b.a a() {
         return new ghq.b.a();
      }

      public static class a {
         private ghp.e a = ghp.ap;
         private ghp.m b = ghp.m;
         private ghp.p c;
         private ghp.d d;
         private ghp.c e;
         private ghp.g f;
         private ghp.l g;
         private ghp.f h;
         private ghp.k i;
         private ghp.o j;
         private ghp.q k;
         private ghp.h l;
         private ghp.b m;

         a() {
            this.c = ghp.c;
            this.d = ghp.aB;
            this.e = ghp.ax;
            this.f = ghp.au;
            this.g = ghp.aw;
            this.h = ghp.aG;
            this.i = ghp.aK;
            this.j = ghp.aq;
            this.k = ghp.aD;
            this.l = ghp.aR;
            this.m = ghp.aS;
         }

         public ghq.b.a a(ghp.e $$0) {
            this.a = $$0;
            return this;
         }

         public ghq.b.a a(ghp.m $$0) {
            this.b = $$0;
            return this;
         }

         public ghq.b.a a(ghp.p $$0) {
            this.c = $$0;
            return this;
         }

         public ghq.b.a a(ghp.d $$0) {
            this.d = $$0;
            return this;
         }

         public ghq.b.a a(ghp.c $$0) {
            this.e = $$0;
            return this;
         }

         public ghq.b.a a(ghp.g $$0) {
            this.f = $$0;
            return this;
         }

         public ghq.b.a a(ghp.l $$0) {
            this.g = $$0;
            return this;
         }

         public ghq.b.a a(ghp.f $$0) {
            this.h = $$0;
            return this;
         }

         public ghq.b.a a(ghp.k $$0) {
            this.i = $$0;
            return this;
         }

         public ghq.b.a a(ghp.o $$0) {
            this.j = $$0;
            return this;
         }

         public ghq.b.a a(ghp.q $$0) {
            this.k = $$0;
            return this;
         }

         public ghq.b.a a(ghp.h $$0) {
            this.l = $$0;
            return this;
         }

         public ghq.b.a a(ghp.b $$0) {
            this.m = $$0;
            return this;
         }

         public ghq.b a(boolean $$0) {
            return this.a($$0 ? ghq.c.c : ghq.c.a);
         }

         public ghq.b a(ghq.c $$0) {
            return new ghq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
