import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gjq extends gjp {
   private static final int aZ = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final gjq ba = a("solid", fep.b, few.c.h, 4194304, true, false, gjq.b.a().a(at).a(t).a(an).a(true));
   private static final gjq bb = a("cutout_mipped", fep.b, few.c.h, 4194304, true, false, gjq.b.a().a(at).a(u).a(an).a(true));
   private static final gjq bc = a("cutout", fep.b, few.c.h, 786432, true, false, gjq.b.a().a(at).a(v).a(ao).a(true));
   private static final gjq bd = a("translucent", fep.b, few.c.h, 786432, true, true, a(w));
   private static final gjq be = a("translucent_moving_block", fep.b, few.c.h, 786432, false, true, U());
   private static final Function<alj, gjq> bf = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alj, gjq> bg = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(z).a(new gjp.n($$0, baq.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fep.c, few.c.h, 1536, true, false, $$1);
   });
   private static final Function<alj, gjq> bh = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(z).a(new gjp.n($$0, baq.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fep.c, few.c.h, 1536, true, false, $$1);
   });
   private static final Function<alj, gjq> bi = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(A).a(new gjp.n($$0, baq.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fep.c, few.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alj, Boolean, gjq> bj = ae.a(($$0, $$1) -> {
      gjq.b $$2 = gjq.b.a().a(B).a(new gjp.n($$0, baq.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fep.c, few.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alj, Boolean, gjq> bk = ae.a(($$0, $$1) -> {
      gjq.b $$2 = gjq.b.a().a(C).a(new gjp.n($$0, baq.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fep.c, few.c.h, 1536, true, false, $$2);
   });
   private static final Function<alj, gjq> bl = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(D).a(new gjp.n($$0, baq.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fep.c, few.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alj, Boolean, gjq> bm = ae.a(($$0, $$1) -> {
      gjq.b $$2 = gjq.b.a().a(E).a(new gjp.n($$0, baq.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fep.c, few.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alj, Boolean, gjq> bn = ae.a(($$0, $$1) -> {
      gjq.b $$2 = gjq.b.a().a(F).a(new gjp.n($$0, baq.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fep.c, few.c.h, 1536, true, true, $$2);
   });
   private static final Function<alj, gjq> bo = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(G).a(new gjp.n($$0, baq.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fep.c, few.c.h, 1536, $$1);
   });
   private static final BiFunction<alj, Boolean, gjq> bp = ae.a(($$0, $$1) -> {
      gjq.b $$2 = gjq.b.a().a(H).a(new gjp.n($$0, baq.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fep.b, few.c.h, 1536, false, true, $$2);
   });
   private static final Function<alj, gjq> bq = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(I).a(new gjp.n($$0, baq.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fep.c, few.c.h, 1536, $$1);
   });
   private static final Function<alj, gjq> br = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(J).a(new gjp.n($$0, baq.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fep.c, few.c.h, 1536, false, true, $$1);
   });
   private static final Function<alj, gjq> bs = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(K).a(new gjp.n($$0, baq.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fep.c, few.c.h, 1536, false, false, $$1);
   });
   private static final Function<alj, gjq> bt = ae.b($$0 -> {
      gjq.b $$1 = gjq.b.a().a(L).a(new gjp.n($$0, baq.b, false)).a(ay).a(true);
      return a("entity_alpha", fep.c, few.c.h, 1536, $$1);
   });
   private static final BiFunction<alj, gjp.p, gjq> bu = ae.a(($$0, $$1) -> {
      gjp.n $$2 = new gjp.n($$0, baq.b, false);
      return a("eyes", fep.c, few.c.h, 1536, false, true, gjq.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final gjq bv = a("leash", fep.h, few.c.f, 1536, gjq.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final gjq bw = a("water_mask", fep.e, few.c.h, 1536, gjq.b.a().a(P).a(ap).a(aF).a(false));
   private static final gjq bx = a(
      "armor_entity_glint", fep.i, few.c.h, 1536, gjq.b.a().a(R).a(new gjp.n(gqi.a, baq.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final gjq by = a(
      "glint_translucent", fep.i, few.c.h, 1536, gjq.b.a().a(S).a(new gjp.n(gqi.b, baq.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final gjq bz = a("glint", fep.i, few.c.h, 1536, gjq.b.a().a(T).a(new gjp.n(gqi.b, baq.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final gjq bA = a(
      "entity_glint", fep.i, few.c.h, 1536, gjq.b.a().a(U).a(new gjp.n(gqi.a, baq.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<alj, gjq> bB = ae.b($$0 -> {
      gjp.n $$1 = new gjp.n($$0, baq.b, false);
      return a("crumbling", fep.b, few.c.h, 1536, false, true, gjq.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alj, gjq> bC = ae.b(
      $$0 -> a("text", fep.k, few.c.h, 786432, false, false, gjq.b.a().a(W).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(false))
   );
   private static final gjq bD = a("text_background", fep.h, few.c.h, 1536, false, true, gjq.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alj, gjq> bE = ae.b(
      $$0 -> a("text_intensity", fep.k, few.c.h, 786432, false, false, gjq.b.a().a(Y).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(false))
   );
   private static final Function<alj, gjq> bF = ae.b(
      $$0 -> a("text_polygon_offset", fep.k, few.c.h, 1536, false, true, gjq.b.a().a(W).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alj, gjq> bG = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fep.k, few.c.h, 1536, false, true, gjq.b.a().a(Y).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alj, gjq> bH = ae.b(
      $$0 -> a("text_see_through", fep.k, few.c.h, 1536, false, false, gjq.b.a().a(Z).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gjq bI = a("text_background_see_through", fep.h, few.c.h, 1536, false, true, gjq.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alj, gjq> bJ = ae.b(
      $$0 -> a("text_intensity_see_through", fep.k, few.c.h, 1536, false, true, gjq.b.a().a(ab).a(new gjp.n($$0, baq.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final gjq bK = a("lightning", fep.f, few.c.h, 1536, false, true, gjq.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final gjq bL = a("dragon_rays", fep.f, few.c.e, 1536, false, false, gjq.b.a().a(ac).a(aE).a(e).a(false));
   private static final gjq bM = a("dragon_rays_depth", fep.e, few.c.e, 1536, false, false, gjq.b.a().a(o).a(aF).a(false));
   private static final gjq bN = a("tripwire", fep.b, few.c.h, 1536, true, true, V());
   private static final gjq bO = a(
      "end_portal", fep.e, few.c.h, 1536, false, false, gjq.b.a().a(ae).a(gjp.i.d().a(gmk.a, false, false).a(gmk.b, false, false).a()).a(false)
   );
   private static final gjq bP = a(
      "end_gateway", fep.e, few.c.h, 1536, false, false, gjq.b.a().a(af).a(gjp.i.d().a(gmk.a, false, false).a(gmk.b, false, false).a()).a(false)
   );
   private static final gjq bQ = a(false, false);
   private static final gjq bR = a(false, true);
   private static final gjq bS = a(true, true);
   public static final gjq.a aX = a("lines", fep.g, few.c.a, 1536, gjq.b.a().a(ah).a(new gjp.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final gjq.a aY = a(
      "line_strip", fep.g, few.c.b, 1536, gjq.b.a().a(ah).a(new gjp.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, gjq.a> bT = ae.b(
      $$0 -> a("debug_line_strip", fep.f, few.c.d, 1536, gjq.b.a().a(r).a(new gjp.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final gjq.a bU = a("debug_filled_box", fep.f, few.c.f, 1536, false, true, gjq.b.a().a(r).a(aI).a(h).a(false));
   private static final gjq.a bV = a("debug_quads", fep.f, few.c.h, 1536, false, true, gjq.b.a().a(r).a(h).a(ay).a(false));
   private static final gjq.a bW = a("debug_triangle_fan", fep.f, few.c.g, 1536, false, true, gjq.b.a().a(r).a(h).a(ay).a(false));
   private static final gjq.a bX = a("debug_structure_quads", fep.f, few.c.h, 1536, false, true, gjq.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final gjq.a bY = a("debug_section_quads", fep.f, few.c.h, 1536, false, true, gjq.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final gjq.a bZ = a("gui", fep.f, few.c.h, 786432, gjq.b.a().a(ai).a(h).a(aB).a(false));
   private static final gjq.a ca = a("gui_overlay", fep.f, few.c.h, 1536, gjq.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<alj, gjq> cb = ae.b(
      $$0 -> a("gui_textured_overlay", fep.j, few.c.h, 1536, gjq.b.a().a(new gjp.n($$0, baq.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<alj, gjq> cc = ae.b(
      $$0 -> a("gui_opaque_textured_background", fep.j, few.c.h, 786432, gjq.b.a().a(new gjp.n($$0, baq.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final gjq.a cd = a("gui_nausea_overlay", fep.j, few.c.h, 1536, gjq.b.a().a(new gjp.n(flp.a, baq.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final gjq.a ce = a("gui_text_highlight", fep.f, few.c.h, 1536, gjq.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final gjq.a cf = a("gui_ghost_recipe_overlay", fep.f, few.c.h, 1536, gjq.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<alj, gjq> cg = ae.b(
      $$0 -> a("gui_textured", fep.j, few.c.h, 786432, gjq.b.a().a(new gjp.n($$0, baq.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<alj, gjq> ch = ae.b(
      $$0 -> a("vignette", fep.j, few.c.h, 786432, gjq.b.a().a(new gjp.n($$0, baq.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<alj, gjq> ci = ae.b(
      $$0 -> a("crosshair", fep.j, few.c.h, 786432, gjq.b.a().a(new gjp.n($$0, baq.b, false)).a(s).a(j).a(false))
   );
   private static final gjq.a cj = a("mojang_logo", fep.j, few.c.h, 786432, gjq.b.a().a(new gjp.n(frm.a, baq.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<gjq> ck = ImmutableList.of(c(), d(), e(), f(), s());
   private final few cl;
   private final few.c cm;
   private final int cn;
   private final boolean co;
   private final boolean cp;

   public static gjq c() {
      return ba;
   }

   public static gjq d() {
      return bb;
   }

   public static gjq e() {
      return bc;
   }

   private static gjq.b a(gjp.m $$0) {
      return gjq.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static gjq f() {
      return bd;
   }

   private static gjq.b U() {
      return gjq.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static gjq g() {
      return be;
   }

   private static gjq.a a(String $$0, alj $$1, boolean $$2) {
      gjq.b $$3 = gjq.b.a().a(y).a(new gjp.n($$1, baq.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fep.c, few.c.h, 1536, true, false, $$3);
   }

   public static gjq a(alj $$0) {
      return bf.apply($$0);
   }

   public static gjq b(alj $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gjq c(alj $$0) {
      return bg.apply($$0);
   }

   public static gjq d(alj $$0) {
      return bh.apply($$0);
   }

   public static gjq e(alj $$0) {
      return bi.apply($$0);
   }

   public static gjq a(alj $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static gjq f(alj $$0) {
      return a($$0, true);
   }

   public static gjq b(alj $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static gjq g(alj $$0) {
      return b($$0, true);
   }

   public static gjq h(alj $$0) {
      return bl.apply($$0);
   }

   public static gjq c(alj $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static gjq i(alj $$0) {
      return c($$0, true);
   }

   public static gjq d(alj $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static gjq j(alj $$0) {
      return d($$0, true);
   }

   public static gjq k(alj $$0) {
      return bo.apply($$0);
   }

   public static gjq e(alj $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gjq l(alj $$0) {
      return bq.apply($$0);
   }

   public static gjq m(alj $$0) {
      return br.apply($$0);
   }

   public static gjq n(alj $$0) {
      return bs.apply($$0);
   }

   public static gjq o(alj $$0) {
      return bt.apply($$0);
   }

   public static gjq p(alj $$0) {
      return bu.apply($$0, h);
   }

   public static gjq q(alj $$0) {
      return bn.apply($$0, false);
   }

   public static gjq a(alj $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fep.c,
         few.c.h,
         1536,
         false,
         true,
         gjq.b.a().a(am).a(new gjp.n($$0, baq.b, false)).a(new gjp.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static gjq b(alj $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fep.c,
         few.c.h,
         1536,
         false,
         true,
         gjq.b.a().a(N).a(new gjp.n($$0, baq.b, false)).a(new gjp.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static gjq h() {
      return bv;
   }

   public static gjq i() {
      return bw;
   }

   public static gjq r(alj $$0) {
      return gjq.a.aZ.apply($$0, ay);
   }

   public static gjq j() {
      return bx;
   }

   public static gjq k() {
      return by;
   }

   public static gjq l() {
      return bz;
   }

   public static gjq m() {
      return bA;
   }

   public static gjq s(alj $$0) {
      return bB.apply($$0);
   }

   public static gjq t(alj $$0) {
      return bC.apply($$0);
   }

   public static gjq n() {
      return bD;
   }

   public static gjq u(alj $$0) {
      return bE.apply($$0);
   }

   public static gjq v(alj $$0) {
      return bF.apply($$0);
   }

   public static gjq w(alj $$0) {
      return bG.apply($$0);
   }

   public static gjq x(alj $$0) {
      return bH.apply($$0);
   }

   public static gjq o() {
      return bI;
   }

   public static gjq y(alj $$0) {
      return bJ.apply($$0);
   }

   public static gjq p() {
      return bK;
   }

   public static gjq q() {
      return bL;
   }

   public static gjq r() {
      return bM;
   }

   private static gjq.b V() {
      return gjq.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static gjq s() {
      return bN;
   }

   public static gjq t() {
      return bO;
   }

   public static gjq u() {
      return bP;
   }

   private static gjq.a a(boolean $$0, boolean $$1) {
      return a("clouds", fep.f, few.c.h, 786432, false, false, gjq.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static gjq v() {
      return bQ;
   }

   public static gjq w() {
      return bR;
   }

   public static gjq x() {
      return bS;
   }

   public static gjq y() {
      return aX;
   }

   public static gjq z() {
      return aY;
   }

   public static gjq a(double $$0) {
      return bT.apply($$0);
   }

   public static gjq A() {
      return bU;
   }

   public static gjq B() {
      return bV;
   }

   public static gjq C() {
      return bW;
   }

   public static gjq D() {
      return bX;
   }

   public static gjq E() {
      return bY;
   }

   public static gjq F() {
      return bZ;
   }

   public static gjq G() {
      return ca;
   }

   public static gjq z(alj $$0) {
      return cb.apply($$0);
   }

   public static gjq A(alj $$0) {
      return cc.apply($$0);
   }

   public static gjq H() {
      return cd;
   }

   public static gjq I() {
      return ce;
   }

   public static gjq J() {
      return cf;
   }

   public static gjq B(alj $$0) {
      return cg.apply($$0);
   }

   public static gjq C(alj $$0) {
      return ch.apply($$0);
   }

   public static gjq D(alj $$0) {
      return ci.apply($$0);
   }

   public static gjq K() {
      return cj;
   }

   public gjq(String $$0, few $$1, few.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cl = $$1;
      this.cm = $$2;
      this.cn = $$3;
      this.co = $$4;
      this.cp = $$5;
   }

   static gjq.a a(String $$0, few $$1, few.c $$2, int $$3, gjq.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gjq.a a(String $$0, few $$1, few.c $$2, int $$3, boolean $$4, boolean $$5, gjq.b $$6) {
      return new gjq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(feq $$0) {
      this.a();
      fen.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gjq> L() {
      return ck;
   }

   public int M() {
      return this.cn;
   }

   public few N() {
      return this.cl;
   }

   public few.c O() {
      return this.cm;
   }

   public Optional<gjq> P() {
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

   static final class a extends gjq {
      static final BiFunction<alj, gjp.c, gjq> aZ = ae.a(
         ($$0, $$1) -> gjq.a("outline", fep.j, few.c.h, 1536, gjq.b.a().a(Q).a(new gjp.n($$0, baq.b, false)).a($$1).a(az).a(aL).a(gjq.c.b))
      );
      private final gjq.b ba;
      private final Optional<gjq> bb;
      private final boolean bc;

      a(String $$0, few $$1, few.c $$2, int $$3, boolean $$4, boolean $$5, gjq.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gjp::a), () -> $$6.o.forEach(gjp::b));
         this.ba = $$6;
         this.bb = $$6.n == gjq.c.c ? $$6.a.c().map($$1x -> aZ.apply($$1x, $$6.e)) : Optional.empty();
         this.bc = $$6.n == gjq.c.b;
      }

      @Override
      public Optional<gjq> P() {
         return this.bb;
      }

      @Override
      public boolean Q() {
         return this.bc;
      }

      protected final gjq.b U() {
         return this.ba;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.ba + "]";
      }
   }

   protected static final class b {
      final gjp.e a;
      private final gjp.m b;
      private final gjp.p c;
      private final gjp.d d;
      final gjp.c e;
      private final gjp.g f;
      private final gjp.l g;
      private final gjp.f h;
      private final gjp.k i;
      private final gjp.o j;
      private final gjp.q k;
      private final gjp.h l;
      private final gjp.b m;
      final gjq.c n;
      final ImmutableList<gjp> o;

      b(
         gjp.e $$0,
         gjp.m $$1,
         gjp.p $$2,
         gjp.d $$3,
         gjp.c $$4,
         gjp.g $$5,
         gjp.l $$6,
         gjp.f $$7,
         gjp.k $$8,
         gjp.o $$9,
         gjp.q $$10,
         gjp.h $$11,
         gjp.b $$12,
         gjq.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gjp[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gjq.b.a a() {
         return new gjq.b.a();
      }

      public static class a {
         private gjp.e a = gjp.ap;
         private gjp.m b = gjp.m;
         private gjp.p c;
         private gjp.d d;
         private gjp.c e;
         private gjp.g f;
         private gjp.l g;
         private gjp.f h;
         private gjp.k i;
         private gjp.o j;
         private gjp.q k;
         private gjp.h l;
         private gjp.b m;

         a() {
            this.c = gjp.c;
            this.d = gjp.aB;
            this.e = gjp.ax;
            this.f = gjp.au;
            this.g = gjp.aw;
            this.h = gjp.aG;
            this.i = gjp.aK;
            this.j = gjp.aq;
            this.k = gjp.aD;
            this.l = gjp.aR;
            this.m = gjp.aS;
         }

         public gjq.b.a a(gjp.e $$0) {
            this.a = $$0;
            return this;
         }

         public gjq.b.a a(gjp.m $$0) {
            this.b = $$0;
            return this;
         }

         public gjq.b.a a(gjp.p $$0) {
            this.c = $$0;
            return this;
         }

         public gjq.b.a a(gjp.d $$0) {
            this.d = $$0;
            return this;
         }

         public gjq.b.a a(gjp.c $$0) {
            this.e = $$0;
            return this;
         }

         public gjq.b.a a(gjp.g $$0) {
            this.f = $$0;
            return this;
         }

         public gjq.b.a a(gjp.l $$0) {
            this.g = $$0;
            return this;
         }

         public gjq.b.a a(gjp.f $$0) {
            this.h = $$0;
            return this;
         }

         public gjq.b.a a(gjp.k $$0) {
            this.i = $$0;
            return this;
         }

         public gjq.b.a a(gjp.o $$0) {
            this.j = $$0;
            return this;
         }

         public gjq.b.a a(gjp.q $$0) {
            this.k = $$0;
            return this;
         }

         public gjq.b.a a(gjp.h $$0) {
            this.l = $$0;
            return this;
         }

         public gjq.b.a a(gjp.b $$0) {
            this.m = $$0;
            return this;
         }

         public gjq.b a(boolean $$0) {
            return this.a($$0 ? gjq.c.c : gjq.c.a);
         }

         public gjq.b a(gjq.c $$0) {
            return new gjq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
