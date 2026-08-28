import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class glo extends gln {
   private static final int ba = 1048576;
   public static final int aU = 4194304;
   public static final int aV = 786432;
   public static final int aW = 1536;
   private static final glo bb = a("solid", fgj.b, fgq.c.h, 4194304, true, false, glo.b.a().a(at).a(t).a(an).a(true));
   private static final glo bc = a("cutout_mipped", fgj.b, fgq.c.h, 4194304, true, false, glo.b.a().a(at).a(u).a(an).a(true));
   private static final glo bd = a("cutout", fgj.b, fgq.c.h, 786432, true, false, glo.b.a().a(at).a(v).a(ao).a(true));
   private static final glo be = a("translucent", fgj.b, fgq.c.h, 786432, true, true, a(w));
   private static final glo bf = a("translucent_moving_block", fgj.b, fgq.c.h, 786432, false, true, V());
   private static final Function<alz, glo> bg = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alz, glo> bh = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(z).a(new gln.n($$0, bbi.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_solid", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glo> bi = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(z).a(new gln.n($$0, bbi.b, false)).a(c).a(at).a(av).a(aJ).a(true);
      return a("entity_solid_z_offset_forward", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final Function<alz, glo> bj = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(A).a(new gln.n($$0, bbi.b, false)).a(c).a(at).a(av).a(true);
      return a("entity_cutout", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alz, Boolean, glo> bk = ae.a(($$0, $$1) -> {
      glo.b $$2 = glo.b.a().a(B).a(new gln.n($$0, bbi.b, false)).a(c).a(ay).a(at).a(av).a($$1);
      return a("entity_cutout_no_cull", fgj.c, fgq.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alz, Boolean, glo> bl = ae.a(($$0, $$1) -> {
      glo.b $$2 = glo.b.a().a(C).a(new gln.n($$0, bbi.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgj.c, fgq.c.h, 1536, true, false, $$2);
   });
   private static final Function<alz, glo> bm = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(D).a(new gln.n($$0, bbi.b, false)).a(h).a(aQ).a(at).a(av).a(aD).a(true);
      return a("item_entity_translucent_cull", fgj.c, fgq.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alz, Boolean, glo> bn = ae.a(($$0, $$1) -> {
      glo.b $$2 = glo.b.a().a(E).a(new gln.n($$0, bbi.b, false)).a(h).a(ay).a(at).a(av).a($$1);
      return a("entity_translucent", fgj.c, fgq.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alz, Boolean, glo> bo = ae.a(($$0, $$1) -> {
      glo.b $$2 = glo.b.a().a(F).a(new gln.n($$0, bbi.b, false)).a(h).a(ay).a(aE).a(av).a($$1);
      return a("entity_translucent_emissive", fgj.c, fgq.c.h, 1536, true, true, $$2);
   });
   private static final Function<alz, glo> bp = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(G).a(new gln.n($$0, bbi.b, false)).a(ay).a(at).a(true);
      return a("entity_smooth_cutout", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, Boolean, glo> bq = ae.a(($$0, $$1) -> {
      glo.b $$2 = glo.b.a().a(H).a(new gln.n($$0, bbi.b, false)).a($$1 ? h : c).a($$1 ? aE : aD).a(false);
      return a("beacon_beam", fgj.b, fgq.c.h, 1536, false, true, $$2);
   });
   private static final Function<alz, glo> br = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(I).a(new gln.n($$0, bbi.b, false)).a(aA).a(ay).a(at).a(av).a(false);
      return a("entity_decal", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final Function<alz, glo> bs = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(J).a(new gln.n($$0, bbi.b, false)).a(h).a(ay).a(at).a(av).a(aE).a(false);
      return a("entity_no_outline", fgj.c, fgq.c.h, 1536, false, true, $$1);
   });
   private static final Function<alz, glo> bt = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(K).a(new gln.n($$0, bbi.b, false)).a(h).a(ax).a(at).a(av).a(aE).a(aB).a(aI).a(false);
      return a("entity_shadow", fgj.c, fgq.c.h, 1536, false, false, $$1);
   });
   private static final Function<alz, glo> bu = ae.b($$0 -> {
      glo.b $$1 = glo.b.a().a(L).a(new gln.n($$0, bbi.b, false)).a(ay).a(true);
      return a("entity_alpha", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final BiFunction<alz, gln.p, glo> bv = ae.a(($$0, $$1) -> {
      gln.n $$2 = new gln.n($$0, bbi.b, false);
      return a("eyes", fgj.c, fgq.c.h, 1536, false, true, glo.b.a().a(M).a($$2).a($$1).a(aE).a(false));
   });
   private static final glo bw = a("leash", fgj.h, fgq.c.f, 1536, glo.b.a().a(O).a(ap).a(ay).a(at).a(false));
   private static final glo bx = a("water_mask", fgj.e, fgq.c.h, 1536, glo.b.a().a(P).a(ap).a(aF).a(false));
   private static final glo by = a(
      "armor_entity_glint", fgj.i, fgq.c.h, 1536, glo.b.a().a(R).a(new gln.n(gsh.a, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(as).a(aI).a(false)
   );
   private static final glo bz = a(
      "glint_translucent", fgj.i, fgq.c.h, 1536, glo.b.a().a(S).a(new gln.n(gsh.b, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(aQ).a(false)
   );
   private static final glo bA = a("glint", fgj.i, fgq.c.h, 1536, glo.b.a().a(T).a(new gln.n(gsh.b, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(ar).a(false));
   private static final glo bB = a(
      "entity_glint", fgj.i, fgq.c.h, 1536, glo.b.a().a(U).a(new gln.n(gsh.a, bbi.c, false)).a(aE).a(ay).a(aA).a(f).a(aQ).a(as).a(false)
   );
   private static final Function<alz, glo> bC = ae.b($$0 -> {
      gln.n $$1 = new gln.n($$0, bbi.b, false);
      return a("crumbling", fgj.b, fgq.c.h, 1536, false, true, glo.b.a().a(V).a($$1).a(g).a(aE).a(aH).a(false));
   });
   private static final Function<alz, glo> bD = ae.b(
      $$0 -> a("text", fgj.k, fgq.c.h, 786432, false, false, glo.b.a().a(W).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(false))
   );
   private static final glo bE = a("text_background", fgj.h, fgq.c.h, 1536, false, true, glo.b.a().a(X).a(ap).a(h).a(at).a(false));
   private static final Function<alz, glo> bF = ae.b(
      $$0 -> a("text_intensity", fgj.k, fgq.c.h, 786432, false, false, glo.b.a().a(Y).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(false))
   );
   private static final Function<alz, glo> bG = ae.b(
      $$0 -> a("text_polygon_offset", fgj.k, fgq.c.h, 1536, false, true, glo.b.a().a(W).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alz, glo> bH = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fgj.k, fgq.c.h, 1536, false, true, glo.b.a().a(Y).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(aH).a(false))
   );
   private static final Function<alz, glo> bI = ae.b(
      $$0 -> a("text_see_through", fgj.k, fgq.c.h, 1536, false, false, glo.b.a().a(Z).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final glo bJ = a("text_background_see_through", fgj.h, fgq.c.h, 1536, false, true, glo.b.a().a(aa).a(ap).a(h).a(at).a(az).a(aE).a(false));
   private static final Function<alz, glo> bK = ae.b(
      $$0 -> a("text_intensity_see_through", fgj.k, fgq.c.h, 1536, false, true, glo.b.a().a(ab).a(new gln.n($$0, bbi.b, false)).a(h).a(at).a(az).a(aE).a(false))
   );
   private static final glo bL = a("lightning", fgj.f, fgq.c.h, 1536, false, true, glo.b.a().a(ac).a(aD).a(e).a(aO).a(false));
   private static final glo bM = a("dragon_rays", fgj.f, fgq.c.e, 1536, false, false, glo.b.a().a(ac).a(aE).a(e).a(false));
   private static final glo bN = a("dragon_rays_depth", fgj.e, fgq.c.e, 1536, false, false, glo.b.a().a(o).a(aF).a(false));
   private static final glo bO = a("tripwire", fgj.b, fgq.c.h, 1536, true, true, W());
   private static final glo bP = a(
      "end_portal", fgj.e, fgq.c.h, 1536, false, false, glo.b.a().a(ae).a(gln.i.d().a(goi.a, false, false).a(goi.b, false, false).a()).a(false)
   );
   private static final glo bQ = a(
      "end_gateway", fgj.e, fgq.c.h, 1536, false, false, glo.b.a().a(af).a(gln.i.d().a(goi.a, false, false).a(goi.b, false, false).a()).a(false)
   );
   private static final glo bR = a(false, false);
   private static final glo bS = a(false, true);
   private static final glo bT = a(true, true);
   public static final glo.a aX = a("lines", fgj.g, fgq.c.a, 1536, glo.b.a().a(ah).a(new gln.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false));
   public static final glo.a aY = a(
      "secondary_block_outline", fgj.g, fgq.c.a, 1536, glo.b.a().a(ah).a(new gln.h(OptionalDouble.of(7.0))).a(aI).a(gln.h).a(aQ).a(aE).a(ay).a(false)
   );
   public static final glo.a aZ = a(
      "line_strip", fgj.g, fgq.c.b, 1536, glo.b.a().a(ah).a(new gln.h(OptionalDouble.empty())).a(aI).a(h).a(aQ).a(aD).a(ay).a(false)
   );
   private static final Function<Double, glo.a> bU = ae.b(
      $$0 -> a("debug_line_strip", fgj.f, fgq.c.d, 1536, glo.b.a().a(r).a(new gln.h(OptionalDouble.of($$0))).a(c).a(ay).a(false))
   );
   private static final glo.a bV = a("debug_filled_box", fgj.f, fgq.c.f, 1536, false, true, glo.b.a().a(r).a(aI).a(h).a(false));
   private static final glo.a bW = a("debug_quads", fgj.f, fgq.c.h, 1536, false, true, glo.b.a().a(r).a(h).a(ay).a(false));
   private static final glo.a bX = a("debug_triangle_fan", fgj.f, fgq.c.g, 1536, false, true, glo.b.a().a(r).a(h).a(ay).a(false));
   private static final glo.a bY = a("debug_structure_quads", fgj.f, fgq.c.h, 1536, false, true, glo.b.a().a(r).a(h).a(ay).a(aB).a(aE).a(false));
   private static final glo.a bZ = a("debug_section_quads", fgj.f, fgq.c.h, 1536, false, true, glo.b.a().a(r).a(aI).a(h).a(ax).a(false));
   private static final glo.a ca = a("gui", fgj.f, fgq.c.h, 786432, glo.b.a().a(ai).a(h).a(aB).a(false));
   private static final glo.a cb = a("gui_overlay", fgj.f, fgq.c.h, 1536, glo.b.a().a(aj).a(h).a(az).a(aE).a(false));
   private static final Function<alz, glo> cc = ae.b(
      $$0 -> a("gui_textured_overlay", fgj.j, fgq.c.h, 1536, glo.b.a().a(new gln.n($$0, bbi.c, false)).a(s).a(h).a(az).a(aE).a(false))
   );
   private static final Function<alz, glo> cd = ae.b(
      $$0 -> a("gui_opaque_textured_background", fgj.j, fgq.c.h, 786432, glo.b.a().a(new gln.n($$0, bbi.b, false)).a(s).a(c).a(aB).a(false))
   );
   private static final glo.a ce = a("gui_nausea_overlay", fgj.j, fgq.c.h, 1536, glo.b.a().a(new gln.n(fnk.a, bbi.c, false)).a(s).a(l).a(az).a(aE).a(false));
   private static final glo.a cf = a("gui_text_highlight", fgj.f, fgq.c.h, 1536, glo.b.a().a(ak).a(h).a(az).a(aT).a(false));
   private static final glo.a cg = a("gui_ghost_recipe_overlay", fgj.f, fgq.c.h, 1536, glo.b.a().a(al).a(h).a(aC).a(aE).a(false));
   private static final Function<alz, glo> ch = ae.b(
      $$0 -> a("gui_textured", fgj.j, fgq.c.h, 786432, glo.b.a().a(new gln.n($$0, bbi.b, false)).a(s).a(h).a(aB).a(false))
   );
   private static final Function<alz, glo> ci = ae.b(
      $$0 -> a("vignette", fgj.j, fgq.c.h, 786432, glo.b.a().a(new gln.n($$0, bbi.c, false)).a(s).a(i).a(az).a(aE).a(false))
   );
   private static final Function<alz, glo> cj = ae.b(
      $$0 -> a("crosshair", fgj.j, fgq.c.h, 786432, glo.b.a().a(new gln.n($$0, bbi.b, false)).a(s).a(j).a(false))
   );
   private static final glo.a ck = a("mojang_logo", fgj.j, fgq.c.h, 786432, glo.b.a().a(new gln.n(fth.a, bbi.c, false)).a(s).a(k).a(az).a(aE).a(false));
   private static final ImmutableList<glo> cl = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgq cm;
   private final fgq.c cn;
   private final int co;
   private final boolean cp;
   private final boolean cq;

   public static glo c() {
      return bb;
   }

   public static glo d() {
      return bc;
   }

   public static glo e() {
      return bd;
   }

   private static glo.b a(gln.m $$0) {
      return glo.b.a().a(at).a($$0).a(an).a(h).a(aM).a(true);
   }

   public static glo f() {
      return be;
   }

   private static glo.b V() {
      return glo.b.a().a(at).a(x).a(an).a(h).a(aQ).a(true);
   }

   public static glo g() {
      return bf;
   }

   private static glo.a a(String $$0, alz $$1, boolean $$2) {
      glo.b $$3 = glo.b.a().a(y).a(new gln.n($$1, bbi.b, false)).a(c).a(ay).a(at).a(av).a(aI).a($$2 ? aA : aB).a(true);
      return a($$0, fgj.c, fgq.c.h, 1536, true, false, $$3);
   }

   public static glo a(alz $$0) {
      return bg.apply($$0);
   }

   public static glo b(alz $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static glo c(alz $$0) {
      return bh.apply($$0);
   }

   public static glo d(alz $$0) {
      return bi.apply($$0);
   }

   public static glo e(alz $$0) {
      return bj.apply($$0);
   }

   public static glo a(alz $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static glo f(alz $$0) {
      return a($$0, true);
   }

   public static glo b(alz $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static glo g(alz $$0) {
      return b($$0, true);
   }

   public static glo h(alz $$0) {
      return bm.apply($$0);
   }

   public static glo c(alz $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static glo i(alz $$0) {
      return c($$0, true);
   }

   public static glo d(alz $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static glo j(alz $$0) {
      return d($$0, true);
   }

   public static glo k(alz $$0) {
      return bp.apply($$0);
   }

   public static glo e(alz $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static glo l(alz $$0) {
      return br.apply($$0);
   }

   public static glo m(alz $$0) {
      return bs.apply($$0);
   }

   public static glo n(alz $$0) {
      return bt.apply($$0);
   }

   public static glo o(alz $$0) {
      return bu.apply($$0);
   }

   public static glo p(alz $$0) {
      return bv.apply($$0, h);
   }

   public static glo q(alz $$0) {
      return bo.apply($$0, false);
   }

   public static glo a(alz $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgj.c,
         fgq.c.h,
         1536,
         false,
         true,
         glo.b.a().a(am).a(new gln.n($$0, bbi.b, false)).a(new gln.j($$1, $$2)).a(h).a(ay).a(at).a(aw).a(false)
      );
   }

   public static glo b(alz $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgj.c,
         fgq.c.h,
         1536,
         false,
         true,
         glo.b.a().a(N).a(new gln.n($$0, bbi.b, false)).a(new gln.j($$1, $$2)).a(d).a(ay).a(at).a(av).a(false)
      );
   }

   public static glo h() {
      return bw;
   }

   public static glo i() {
      return bx;
   }

   public static glo r(alz $$0) {
      return glo.a.ba.apply($$0, ay);
   }

   public static glo j() {
      return by;
   }

   public static glo k() {
      return bz;
   }

   public static glo l() {
      return bA;
   }

   public static glo m() {
      return bB;
   }

   public static glo s(alz $$0) {
      return bC.apply($$0);
   }

   public static glo t(alz $$0) {
      return bD.apply($$0);
   }

   public static glo n() {
      return bE;
   }

   public static glo u(alz $$0) {
      return bF.apply($$0);
   }

   public static glo v(alz $$0) {
      return bG.apply($$0);
   }

   public static glo w(alz $$0) {
      return bH.apply($$0);
   }

   public static glo x(alz $$0) {
      return bI.apply($$0);
   }

   public static glo o() {
      return bJ;
   }

   public static glo y(alz $$0) {
      return bK.apply($$0);
   }

   public static glo p() {
      return bL;
   }

   public static glo q() {
      return bM;
   }

   public static glo r() {
      return bN;
   }

   private static glo.b W() {
      return glo.b.a().a(at).a(ad).a(an).a(h).a(aO).a(true);
   }

   public static glo s() {
      return bO;
   }

   public static glo t() {
      return bP;
   }

   public static glo u() {
      return bQ;
   }

   private static glo.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgj.f, fgq.c.h, 786432, false, false, glo.b.a().a(ag).a(h).a($$1 ? ax : ay).a($$0 ? aF : aD).a(aP).a(true));
   }

   public static glo v() {
      return bR;
   }

   public static glo w() {
      return bS;
   }

   public static glo x() {
      return bT;
   }

   public static glo y() {
      return aX;
   }

   public static glo z() {
      return aY;
   }

   public static glo A() {
      return aZ;
   }

   public static glo a(double $$0) {
      return bU.apply($$0);
   }

   public static glo B() {
      return bV;
   }

   public static glo C() {
      return bW;
   }

   public static glo D() {
      return bX;
   }

   public static glo E() {
      return bY;
   }

   public static glo F() {
      return bZ;
   }

   public static glo G() {
      return ca;
   }

   public static glo H() {
      return cb;
   }

   public static glo z(alz $$0) {
      return cc.apply($$0);
   }

   public static glo A(alz $$0) {
      return cd.apply($$0);
   }

   public static glo I() {
      return ce;
   }

   public static glo J() {
      return cf;
   }

   public static glo K() {
      return cg;
   }

   public static glo B(alz $$0) {
      return ch.apply($$0);
   }

   public static glo C(alz $$0) {
      return ci.apply($$0);
   }

   public static glo D(alz $$0) {
      return cj.apply($$0);
   }

   public static glo L() {
      return ck;
   }

   public glo(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cm = $$1;
      this.cn = $$2;
      this.co = $$3;
      this.cp = $$4;
      this.cq = $$5;
   }

   static glo.a a(String $$0, fgq $$1, fgq.c $$2, int $$3, glo.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static glo.a a(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, glo.b $$6) {
      return new glo.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fgk $$0) {
      this.a();
      fgh.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<glo> M() {
      return cl;
   }

   public int N() {
      return this.co;
   }

   public fgq O() {
      return this.cm;
   }

   public fgq.c P() {
      return this.cn;
   }

   public Optional<glo> Q() {
      return Optional.empty();
   }

   public boolean R() {
      return false;
   }

   public boolean S() {
      return this.cp;
   }

   public boolean T() {
      return !this.cn.l;
   }

   public boolean U() {
      return this.cq;
   }

   static final class a extends glo {
      static final BiFunction<alz, gln.c, glo> ba = ae.a(
         ($$0, $$1) -> glo.a("outline", fgj.j, fgq.c.h, 1536, glo.b.a().a(Q).a(new gln.n($$0, bbi.b, false)).a($$1).a(az).a(aL).a(glo.c.b))
      );
      private final glo.b bb;
      private final Optional<glo> bc;
      private final boolean bd;

      a(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, glo.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gln::a), () -> $$6.o.forEach(gln::b));
         this.bb = $$6;
         this.bc = $$6.n == glo.c.c ? $$6.a.c().map($$1x -> ba.apply($$1x, $$6.e)) : Optional.empty();
         this.bd = $$6.n == glo.c.b;
      }

      @Override
      public Optional<glo> Q() {
         return this.bc;
      }

      @Override
      public boolean R() {
         return this.bd;
      }

      protected final glo.b V() {
         return this.bb;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bb + "]";
      }
   }

   protected static final class b {
      final gln.e a;
      private final gln.m b;
      private final gln.p c;
      private final gln.d d;
      final gln.c e;
      private final gln.g f;
      private final gln.l g;
      private final gln.f h;
      private final gln.k i;
      private final gln.o j;
      private final gln.q k;
      private final gln.h l;
      private final gln.b m;
      final glo.c n;
      final ImmutableList<gln> o;

      b(
         gln.e $$0,
         gln.m $$1,
         gln.p $$2,
         gln.d $$3,
         gln.c $$4,
         gln.g $$5,
         gln.l $$6,
         gln.f $$7,
         gln.k $$8,
         gln.o $$9,
         gln.q $$10,
         gln.h $$11,
         gln.b $$12,
         glo.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gln[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static glo.b.a a() {
         return new glo.b.a();
      }

      public static class a {
         private gln.e a = gln.ap;
         private gln.m b = gln.m;
         private gln.p c;
         private gln.d d;
         private gln.c e;
         private gln.g f;
         private gln.l g;
         private gln.f h;
         private gln.k i;
         private gln.o j;
         private gln.q k;
         private gln.h l;
         private gln.b m;

         a() {
            this.c = gln.c;
            this.d = gln.aB;
            this.e = gln.ax;
            this.f = gln.au;
            this.g = gln.aw;
            this.h = gln.aG;
            this.i = gln.aK;
            this.j = gln.aq;
            this.k = gln.aD;
            this.l = gln.aR;
            this.m = gln.aS;
         }

         public glo.b.a a(gln.e $$0) {
            this.a = $$0;
            return this;
         }

         public glo.b.a a(gln.m $$0) {
            this.b = $$0;
            return this;
         }

         public glo.b.a a(gln.p $$0) {
            this.c = $$0;
            return this;
         }

         public glo.b.a a(gln.d $$0) {
            this.d = $$0;
            return this;
         }

         public glo.b.a a(gln.c $$0) {
            this.e = $$0;
            return this;
         }

         public glo.b.a a(gln.g $$0) {
            this.f = $$0;
            return this;
         }

         public glo.b.a a(gln.l $$0) {
            this.g = $$0;
            return this;
         }

         public glo.b.a a(gln.f $$0) {
            this.h = $$0;
            return this;
         }

         public glo.b.a a(gln.k $$0) {
            this.i = $$0;
            return this;
         }

         public glo.b.a a(gln.o $$0) {
            this.j = $$0;
            return this;
         }

         public glo.b.a a(gln.q $$0) {
            this.k = $$0;
            return this;
         }

         public glo.b.a a(gln.h $$0) {
            this.l = $$0;
            return this;
         }

         public glo.b.a a(gln.b $$0) {
            this.m = $$0;
            return this;
         }

         public glo.b a(boolean $$0) {
            return this.a($$0 ? glo.c.c : glo.c.a);
         }

         public glo.b a(glo.c $$0) {
            return new glo.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
