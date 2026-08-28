import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gmh extends gmg {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gmh bf = a("solid", ffr.b, ffy.c.h, 4194304, true, false, gmh.b.a().a(aw).a(v).a(aq).a(true));
   private static final gmh bg = a("cutout_mipped", ffr.b, ffy.c.h, 4194304, true, false, gmh.b.a().a(aw).a(w).a(aq).a(true));
   private static final gmh bh = a("cutout", ffr.b, ffy.c.h, 786432, true, false, gmh.b.a().a(aw).a(x).a(ar).a(true));
   private static final gmh bi = a("translucent", ffr.b, ffy.c.h, 786432, true, true, a(y));
   private static final gmh bj = a("translucent_moving_block", ffr.b, ffy.c.h, 786432, false, true, Z());
   private static final Function<akv, gmh> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akv, gmh> bl = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(B).a(new gmg.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", ffr.c, ffy.c.h, 1536, true, true, $$1);
   });
   private static final Function<akv, gmh> bm = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(C).a(new gmg.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", ffr.c, ffy.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmh> bn = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(C).a(new gmg.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", ffr.c, ffy.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmh> bo = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(D).a(new gmg.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", ffr.c, ffy.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akv, Boolean, gmh> bp = af.a(($$0, $$1) -> {
      gmh.b $$2 = gmh.b.a().a(E).a(new gmg.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", ffr.c, ffy.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akv, Boolean, gmh> bq = af.a(($$0, $$1) -> {
      gmh.b $$2 = gmh.b.a().a(F).a(new gmg.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", ffr.c, ffy.c.h, 1536, true, false, $$2);
   });
   private static final Function<akv, gmh> br = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(G).a(new gmg.n($$0, bad.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", ffr.c, ffy.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akv, Boolean, gmh> bs = af.a(($$0, $$1) -> {
      gmh.b $$2 = gmh.b.a().a(H).a(new gmg.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", ffr.c, ffy.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akv, Boolean, gmh> bt = af.a(($$0, $$1) -> {
      gmh.b $$2 = gmh.b.a().a(I).a(new gmg.n($$0, bad.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", ffr.c, ffy.c.h, 1536, true, true, $$2);
   });
   private static final Function<akv, gmh> bu = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(J).a(new gmg.n($$0, bad.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", ffr.c, ffy.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, Boolean, gmh> bv = af.a(($$0, $$1) -> {
      gmh.b $$2 = gmh.b.a().a(K).a(new gmg.n($$0, bad.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", ffr.b, ffy.c.h, 1536, false, true, $$2);
   });
   private static final Function<akv, gmh> bw = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(L).a(new gmg.n($$0, bad.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", ffr.c, ffy.c.h, 1536, $$1);
   });
   private static final Function<akv, gmh> bx = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(M).a(new gmg.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", ffr.c, ffy.c.h, 1536, false, true, $$1);
   });
   private static final Function<akv, gmh> by = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(N).a(new gmg.n($$0, bad.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", ffr.c, ffy.c.h, 1536, false, false, $$1);
   });
   private static final Function<akv, gmh> bz = af.b($$0 -> {
      gmh.b $$1 = gmh.b.a().a(O).a(new gmg.n($$0, bad.b, false)).a(aB).a(true);
      return a("entity_alpha", ffr.c, ffy.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, gmg.p, gmh> bA = af.a(($$0, $$1) -> {
      gmg.n $$2 = new gmg.n($$0, bad.b, false);
      return a("eyes", ffr.c, ffy.c.h, 1536, false, true, gmh.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gmh bB = a("leash", ffr.h, ffy.c.f, 1536, gmh.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gmh bC = a("water_mask", ffr.e, ffy.c.h, 1536, gmh.b.a().a(S).a(as).a(aI).a(false));
   private static final gmh bD = a(
      "armor_entity_glint", ffr.i, ffy.c.h, 1536, gmh.b.a().a(U).a(new gmg.n(gtb.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gmh bE = a(
      "glint_translucent", ffr.i, ffy.c.h, 1536, gmh.b.a().a(V).a(new gmg.n(gtb.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gmh bF = a("glint", ffr.i, ffy.c.h, 1536, gmh.b.a().a(W).a(new gmg.n(gtb.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gmh bG = a("entity_glint", ffr.i, ffy.c.h, 1536, gmh.b.a().a(X).a(new gmg.n(gtb.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<akv, gmh> bH = af.b($$0 -> {
      gmg.n $$1 = new gmg.n($$0, bad.b, false);
      return a("crumbling", ffr.b, ffy.c.h, 1536, false, true, gmh.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<akv, gmh> bI = af.b(
      $$0 -> a("text", ffr.k, ffy.c.h, 786432, false, false, gmh.b.a().a(Z).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final gmh bJ = a("text_background", ffr.h, ffy.c.h, 1536, false, true, gmh.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<akv, gmh> bK = af.b(
      $$0 -> a("text_intensity", ffr.k, ffy.c.h, 786432, false, false, gmh.b.a().a(ab).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<akv, gmh> bL = af.b(
      $$0 -> a("text_polygon_offset", ffr.k, ffy.c.h, 1536, false, true, gmh.b.a().a(Z).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmh> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", ffr.k, ffy.c.h, 1536, false, true, gmh.b.a().a(ab).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmh> bN = af.b(
      $$0 -> a("text_see_through", ffr.k, ffy.c.h, 1536, false, false, gmh.b.a().a(ac).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmh bO = a("text_background_see_through", ffr.h, ffy.c.h, 1536, false, true, gmh.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<akv, gmh> bP = af.b(
      $$0 -> a("text_intensity_see_through", ffr.k, ffy.c.h, 1536, false, true, gmh.b.a().a(ae).a(new gmg.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmh bQ = a("lightning", ffr.f, ffy.c.h, 1536, false, true, gmh.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gmh bR = a("dragon_rays", ffr.f, ffy.c.e, 1536, false, false, gmh.b.a().a(af).a(aH).a(e).a(false));
   private static final gmh bS = a("dragon_rays_depth", ffr.e, ffy.c.e, 1536, false, false, gmh.b.a().a(p).a(aI).a(false));
   private static final gmh bT = a("tripwire", ffr.b, ffy.c.h, 1536, true, true, aa());
   private static final gmh bU = a(
      "end_portal", ffr.e, ffy.c.h, 1536, false, false, gmh.b.a().a(ah).a(gmg.i.d().a(gpc.a, false, false).a(gpc.b, false, false).a()).a(false)
   );
   private static final gmh bV = a(
      "end_gateway", ffr.e, ffy.c.h, 1536, false, false, gmh.b.a().a(ai).a(gmg.i.d().a(gpc.a, false, false).a(gpc.b, false, false).a()).a(false)
   );
   private static final gmh bW = a(false, false);
   private static final gmh bX = a(false, true);
   private static final gmh bY = a(true, true);
   public static final gmh.a bb = a("lines", ffr.g, ffy.c.a, 1536, gmh.b.a().a(ak).a(new gmg.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gmh.a bc = a(
      "secondary_block_outline", ffr.g, ffy.c.a, 1536, gmh.b.a().a(ak).a(new gmg.h(OptionalDouble.of(7.0))).a(aL).a(gmg.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gmh.a bd = a(
      "line_strip", ffr.g, ffy.c.b, 1536, gmh.b.a().a(ak).a(new gmg.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gmh.a> bZ = af.b(
      $$0 -> a("debug_line_strip", ffr.f, ffy.c.d, 1536, gmh.b.a().a(s).a(new gmg.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gmh.a ca = a("debug_filled_box", ffr.f, ffy.c.f, 1536, false, true, gmh.b.a().a(s).a(aL).a(i).a(false));
   private static final gmh.a cb = a("debug_quads", ffr.f, ffy.c.h, 1536, false, true, gmh.b.a().a(s).a(i).a(aB).a(false));
   private static final gmh.a cc = a("debug_triangle_fan", ffr.f, ffy.c.g, 1536, false, true, gmh.b.a().a(s).a(i).a(aB).a(false));
   private static final gmh.a cd = a("debug_structure_quads", ffr.f, ffy.c.h, 1536, false, true, gmh.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gmh.a ce = a("debug_section_quads", ffr.f, ffy.c.h, 1536, false, true, gmh.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gmh cf = b(false);
   private static final gmh cg = b(true);
   private static final Function<akv, gmh> ch = af.b(
      $$0 -> a("opaque_particle", ffr.d, ffy.c.h, 1536, false, false, gmh.b.a().a(u).a(new gmg.n($$0, bad.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmh> ci = af.b(
      $$0 -> a("translucent_particle", ffr.d, ffy.c.h, 1536, false, false, gmh.b.a().a(u).a(new gmg.n($$0, bad.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmh> cj = c(true);
   private static final Function<akv, gmh> ck = c(false);
   private static final gmh cl = a("sky", ffr.e, ffy.c.h, 1536, false, false, gmh.b.a().a(p).a(aH).a(false));
   private static final gmh cm = a("end_sky", ffr.j, ffy.c.h, 1536, false, false, gmh.b.a().a(t).a(new gmg.n(gmt.a, bad.b, false)).a(i).a(aH).a(false));
   private static final gmh cn = a("sunrise_sunset", ffr.f, ffy.c.g, 1536, false, false, gmh.b.a().a(s).a(i).a(aH).a(false));
   private static final gmh co = a("stars", ffr.e, ffy.c.h, 1536, false, false, gmh.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<akv, gmh> cp = af.b(
      $$0 -> a("celestial", ffr.j, ffy.c.h, 1536, false, false, gmh.b.a().a(t).a(new gmg.n($$0, bad.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<akv, gmh> cq = af.b(
      $$0 -> a("block_screen_effect", ffr.j, ffy.c.h, 1536, false, false, gmh.b.a().a(t).a(new gmg.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<akv, gmh> cr = af.b(
      $$0 -> a("fire_screen_effect", ffr.j, ffy.c.h, 1536, false, false, gmh.b.a().a(t).a(new gmg.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gmh.a cs = a("gui", ffr.f, ffy.c.h, 786432, gmh.b.a().a(al).a(i).a(aE).a(false));
   private static final gmh.a ct = a("gui_overlay", ffr.f, ffy.c.h, 1536, gmh.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<akv, gmh> cu = af.b(
      $$0 -> a("gui_textured_overlay", ffr.j, ffy.c.h, 1536, gmh.b.a().a(new gmg.n($$0, bad.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmh> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", ffr.j, ffy.c.h, 786432, gmh.b.a().a(new gmg.n($$0, bad.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gmh.a cw = a("gui_nausea_overlay", ffr.j, ffy.c.h, 1536, gmh.b.a().a(new gmg.n(foc.a, bad.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gmh.a cx = a("gui_text_highlight", ffr.f, ffy.c.h, 1536, gmh.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gmh.a cy = a("gui_ghost_recipe_overlay", ffr.f, ffy.c.h, 1536, gmh.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<akv, gmh> cz = af.b(
      $$0 -> a("gui_textured", ffr.j, ffy.c.h, 786432, gmh.b.a().a(new gmg.n($$0, bad.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<akv, gmh> cA = af.b(
      $$0 -> a("vignette", ffr.j, ffy.c.h, 786432, gmh.b.a().a(new gmg.n($$0, bad.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmh> cB = af.b(
      $$0 -> a("crosshair", ffr.j, ffy.c.h, 786432, gmh.b.a().a(new gmg.n($$0, bad.b, false)).a(t).a(k).a(false))
   );
   private static final gmh.a cC = a("mojang_logo", ffr.j, ffy.c.h, 786432, gmh.b.a().a(new gmg.n(fua.a, bad.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gmh> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final ffy cE;
   private final ffy.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gmh c() {
      return bf;
   }

   public static gmh d() {
      return bg;
   }

   public static gmh e() {
      return bh;
   }

   private static gmh.b a(gmg.m $$0) {
      return gmh.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gmh f() {
      return bi;
   }

   private static gmh.b Z() {
      return gmh.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gmh g() {
      return bj;
   }

   private static gmh.a a(String $$0, akv $$1, boolean $$2) {
      gmh.b $$3 = gmh.b.a().a(A).a(new gmg.n($$1, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, ffr.c, ffy.c.h, 1536, true, false, $$3);
   }

   public static gmh a(akv $$0) {
      return bk.apply($$0);
   }

   public static gmh b(akv $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gmh c(akv $$0) {
      return bl.apply($$0);
   }

   public static gmh d(akv $$0) {
      return bm.apply($$0);
   }

   public static gmh e(akv $$0) {
      return bn.apply($$0);
   }

   public static gmh f(akv $$0) {
      return bo.apply($$0);
   }

   public static gmh a(akv $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gmh g(akv $$0) {
      return a($$0, true);
   }

   public static gmh b(akv $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gmh h(akv $$0) {
      return b($$0, true);
   }

   public static gmh i(akv $$0) {
      return br.apply($$0);
   }

   public static gmh c(akv $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gmh j(akv $$0) {
      return c($$0, true);
   }

   public static gmh d(akv $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gmh k(akv $$0) {
      return d($$0, true);
   }

   public static gmh l(akv $$0) {
      return bu.apply($$0);
   }

   public static gmh e(akv $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gmh m(akv $$0) {
      return bw.apply($$0);
   }

   public static gmh n(akv $$0) {
      return bx.apply($$0);
   }

   public static gmh o(akv $$0) {
      return by.apply($$0);
   }

   public static gmh p(akv $$0) {
      return bz.apply($$0);
   }

   public static gmh q(akv $$0) {
      return bA.apply($$0, i);
   }

   public static gmh r(akv $$0) {
      return bt.apply($$0, false);
   }

   public static gmh a(akv $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ffr.c,
         ffy.c.h,
         1536,
         false,
         true,
         gmh.b.a().a(ap).a(new gmg.n($$0, bad.b, false)).a(new gmg.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gmh b(akv $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ffr.c,
         ffy.c.h,
         1536,
         false,
         true,
         gmh.b.a().a(Q).a(new gmg.n($$0, bad.b, false)).a(new gmg.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gmh h() {
      return bB;
   }

   public static gmh i() {
      return bC;
   }

   public static gmh s(akv $$0) {
      return gmh.a.be.apply($$0, aB);
   }

   public static gmh j() {
      return bD;
   }

   public static gmh k() {
      return bE;
   }

   public static gmh l() {
      return bF;
   }

   public static gmh m() {
      return bG;
   }

   public static gmh t(akv $$0) {
      return bH.apply($$0);
   }

   public static gmh u(akv $$0) {
      return bI.apply($$0);
   }

   public static gmh n() {
      return bJ;
   }

   public static gmh v(akv $$0) {
      return bK.apply($$0);
   }

   public static gmh w(akv $$0) {
      return bL.apply($$0);
   }

   public static gmh x(akv $$0) {
      return bM.apply($$0);
   }

   public static gmh y(akv $$0) {
      return bN.apply($$0);
   }

   public static gmh o() {
      return bO;
   }

   public static gmh z(akv $$0) {
      return bP.apply($$0);
   }

   public static gmh p() {
      return bQ;
   }

   public static gmh q() {
      return bR;
   }

   public static gmh r() {
      return bS;
   }

   private static gmh.b aa() {
      return gmh.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gmh s() {
      return bT;
   }

   public static gmh t() {
      return bU;
   }

   public static gmh u() {
      return bV;
   }

   private static gmh.a a(boolean $$0, boolean $$1) {
      return a("clouds", ffr.f, ffy.c.h, 786432, false, false, gmh.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gmh v() {
      return bW;
   }

   public static gmh w() {
      return bX;
   }

   public static gmh x() {
      return bY;
   }

   public static gmh y() {
      return bb;
   }

   public static gmh z() {
      return bc;
   }

   public static gmh A() {
      return bd;
   }

   public static gmh a(double $$0) {
      return bZ.apply($$0);
   }

   public static gmh B() {
      return ca;
   }

   public static gmh C() {
      return cb;
   }

   public static gmh D() {
      return cc;
   }

   public static gmh E() {
      return cd;
   }

   public static gmh F() {
      return ce;
   }

   private static gmh b(boolean $$0) {
      return a(
         "world_border",
         ffr.i,
         ffy.c.h,
         1536,
         false,
         false,
         gmh.b.a().a(q).a(new gmg.n(gmz.a, bad.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gmh a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gmh A(akv $$0) {
      return ch.apply($$0);
   }

   public static gmh B(akv $$0) {
      return ci.apply($$0);
   }

   private static Function<akv, gmh> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", ffr.d, ffy.c.h, 1536, false, false, gmh.b.a().a(u).a(new gmg.n($$1, bad.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gmh f(akv $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gmh G() {
      return cl;
   }

   public static gmh H() {
      return cm;
   }

   public static gmh I() {
      return cn;
   }

   public static gmh J() {
      return co;
   }

   public static gmh C(akv $$0) {
      return cp.apply($$0);
   }

   public static gmh D(akv $$0) {
      return cq.apply($$0);
   }

   public static gmh E(akv $$0) {
      return cr.apply($$0);
   }

   public static gmh K() {
      return cs;
   }

   public static gmh L() {
      return ct;
   }

   public static gmh F(akv $$0) {
      return cu.apply($$0);
   }

   public static gmh G(akv $$0) {
      return cv.apply($$0);
   }

   public static gmh M() {
      return cw;
   }

   public static gmh N() {
      return cx;
   }

   public static gmh O() {
      return cy;
   }

   public static gmh H(akv $$0) {
      return cz.apply($$0);
   }

   public static gmh I(akv $$0) {
      return cA.apply($$0);
   }

   public static gmh J(akv $$0) {
      return cB.apply($$0);
   }

   public static gmh P() {
      return cC;
   }

   public gmh(String $$0, ffy $$1, ffy.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gmh.a a(String $$0, ffy $$1, ffy.c $$2, int $$3, gmh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gmh.a a(String $$0, ffy $$1, ffy.c $$2, int $$3, boolean $$4, boolean $$5, gmh.b $$6) {
      return new gmh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ffs $$0) {
      this.a();
      ffp.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gmh> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public ffy S() {
      return this.cE;
   }

   public ffy.c T() {
      return this.cF;
   }

   public Optional<gmh> U() {
      return Optional.empty();
   }

   public boolean V() {
      return false;
   }

   public boolean W() {
      return this.cH;
   }

   public boolean X() {
      return !this.cF.l;
   }

   public boolean Y() {
      return this.cI;
   }

   static final class a extends gmh {
      static final BiFunction<akv, gmg.c, gmh> be = af.a(
         ($$0, $$1) -> gmh.a("outline", ffr.j, ffy.c.h, 1536, gmh.b.a().a(T).a(new gmg.n($$0, bad.b, false)).a($$1).a(aC).a(aP).a(gmh.c.b))
      );
      private final gmh.b bf;
      private final Optional<gmh> bg;
      private final boolean bh;

      a(String $$0, ffy $$1, ffy.c $$2, int $$3, boolean $$4, boolean $$5, gmh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gmg::a), () -> $$6.o.forEach(gmg::b));
         this.bf = $$6;
         this.bg = $$6.n == gmh.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gmh.c.b;
      }

      @Override
      public Optional<gmh> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gmh.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gmg.e a;
      private final gmg.m b;
      private final gmg.p c;
      private final gmg.d d;
      final gmg.c e;
      private final gmg.g f;
      private final gmg.l g;
      private final gmg.f h;
      private final gmg.k i;
      private final gmg.o j;
      private final gmg.q k;
      private final gmg.h l;
      private final gmg.b m;
      final gmh.c n;
      final ImmutableList<gmg> o;

      b(
         gmg.e $$0,
         gmg.m $$1,
         gmg.p $$2,
         gmg.d $$3,
         gmg.c $$4,
         gmg.g $$5,
         gmg.l $$6,
         gmg.f $$7,
         gmg.k $$8,
         gmg.o $$9,
         gmg.q $$10,
         gmg.h $$11,
         gmg.b $$12,
         gmh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gmg[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gmh.b.a a() {
         return new gmh.b.a();
      }

      public static class a {
         private gmg.e a = gmg.as;
         private gmg.m b = gmg.n;
         private gmg.p c;
         private gmg.d d;
         private gmg.c e;
         private gmg.g f;
         private gmg.l g;
         private gmg.f h;
         private gmg.k i;
         private gmg.o j;
         private gmg.q k;
         private gmg.h l;
         private gmg.b m;

         a() {
            this.c = gmg.c;
            this.d = gmg.aE;
            this.e = gmg.aA;
            this.f = gmg.ax;
            this.g = gmg.az;
            this.h = gmg.aJ;
            this.i = gmg.aO;
            this.j = gmg.at;
            this.k = gmg.aG;
            this.l = gmg.aV;
            this.m = gmg.aW;
         }

         public gmh.b.a a(gmg.e $$0) {
            this.a = $$0;
            return this;
         }

         public gmh.b.a a(gmg.m $$0) {
            this.b = $$0;
            return this;
         }

         public gmh.b.a a(gmg.p $$0) {
            this.c = $$0;
            return this;
         }

         public gmh.b.a a(gmg.d $$0) {
            this.d = $$0;
            return this;
         }

         public gmh.b.a a(gmg.c $$0) {
            this.e = $$0;
            return this;
         }

         public gmh.b.a a(gmg.g $$0) {
            this.f = $$0;
            return this;
         }

         public gmh.b.a a(gmg.l $$0) {
            this.g = $$0;
            return this;
         }

         public gmh.b.a a(gmg.f $$0) {
            this.h = $$0;
            return this;
         }

         public gmh.b.a a(gmg.k $$0) {
            this.i = $$0;
            return this;
         }

         public gmh.b.a a(gmg.o $$0) {
            this.j = $$0;
            return this;
         }

         public gmh.b.a a(gmg.q $$0) {
            this.k = $$0;
            return this;
         }

         public gmh.b.a a(gmg.h $$0) {
            this.l = $$0;
            return this;
         }

         public gmh.b.a a(gmg.b $$0) {
            this.m = $$0;
            return this;
         }

         public gmh.b a(boolean $$0) {
            return this.a($$0 ? gmh.c.c : gmh.c.a);
         }

         public gmh.b a(gmh.c $$0) {
            return new gmh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
