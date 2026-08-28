import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gmi extends gmh {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gmi bf = a("solid", ffs.b, ffz.c.h, 4194304, true, false, gmi.b.a().a(aw).a(v).a(aq).a(true));
   private static final gmi bg = a("cutout_mipped", ffs.b, ffz.c.h, 4194304, true, false, gmi.b.a().a(aw).a(w).a(aq).a(true));
   private static final gmi bh = a("cutout", ffs.b, ffz.c.h, 786432, true, false, gmi.b.a().a(aw).a(x).a(ar).a(true));
   private static final gmi bi = a("translucent", ffs.b, ffz.c.h, 786432, true, true, a(y));
   private static final gmi bj = a("translucent_moving_block", ffs.b, ffz.c.h, 786432, false, true, Z());
   private static final Function<akv, gmi> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akv, gmi> bl = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(B).a(new gmh.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", ffs.c, ffz.c.h, 1536, true, true, $$1);
   });
   private static final Function<akv, gmi> bm = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(C).a(new gmh.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", ffs.c, ffz.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmi> bn = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(C).a(new gmh.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", ffs.c, ffz.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmi> bo = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(D).a(new gmh.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", ffs.c, ffz.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akv, Boolean, gmi> bp = af.a(($$0, $$1) -> {
      gmi.b $$2 = gmi.b.a().a(E).a(new gmh.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", ffs.c, ffz.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akv, Boolean, gmi> bq = af.a(($$0, $$1) -> {
      gmi.b $$2 = gmi.b.a().a(F).a(new gmh.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", ffs.c, ffz.c.h, 1536, true, false, $$2);
   });
   private static final Function<akv, gmi> br = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(G).a(new gmh.n($$0, bad.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", ffs.c, ffz.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akv, Boolean, gmi> bs = af.a(($$0, $$1) -> {
      gmi.b $$2 = gmi.b.a().a(H).a(new gmh.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", ffs.c, ffz.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akv, Boolean, gmi> bt = af.a(($$0, $$1) -> {
      gmi.b $$2 = gmi.b.a().a(I).a(new gmh.n($$0, bad.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", ffs.c, ffz.c.h, 1536, true, true, $$2);
   });
   private static final Function<akv, gmi> bu = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(J).a(new gmh.n($$0, bad.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", ffs.c, ffz.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, Boolean, gmi> bv = af.a(($$0, $$1) -> {
      gmi.b $$2 = gmi.b.a().a(K).a(new gmh.n($$0, bad.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", ffs.b, ffz.c.h, 1536, false, true, $$2);
   });
   private static final Function<akv, gmi> bw = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(L).a(new gmh.n($$0, bad.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", ffs.c, ffz.c.h, 1536, $$1);
   });
   private static final Function<akv, gmi> bx = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(M).a(new gmh.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", ffs.c, ffz.c.h, 1536, false, true, $$1);
   });
   private static final Function<akv, gmi> by = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(N).a(new gmh.n($$0, bad.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", ffs.c, ffz.c.h, 1536, false, false, $$1);
   });
   private static final Function<akv, gmi> bz = af.b($$0 -> {
      gmi.b $$1 = gmi.b.a().a(O).a(new gmh.n($$0, bad.b, false)).a(aB).a(true);
      return a("entity_alpha", ffs.c, ffz.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, gmh.p, gmi> bA = af.a(($$0, $$1) -> {
      gmh.n $$2 = new gmh.n($$0, bad.b, false);
      return a("eyes", ffs.c, ffz.c.h, 1536, false, true, gmi.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gmi bB = a("leash", ffs.h, ffz.c.f, 1536, gmi.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gmi bC = a("water_mask", ffs.e, ffz.c.h, 1536, gmi.b.a().a(S).a(as).a(aI).a(false));
   private static final gmi bD = a(
      "armor_entity_glint", ffs.i, ffz.c.h, 1536, gmi.b.a().a(U).a(new gmh.n(gtc.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gmi bE = a(
      "glint_translucent", ffs.i, ffz.c.h, 1536, gmi.b.a().a(V).a(new gmh.n(gtc.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gmi bF = a("glint", ffs.i, ffz.c.h, 1536, gmi.b.a().a(W).a(new gmh.n(gtc.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gmi bG = a("entity_glint", ffs.i, ffz.c.h, 1536, gmi.b.a().a(X).a(new gmh.n(gtc.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<akv, gmi> bH = af.b($$0 -> {
      gmh.n $$1 = new gmh.n($$0, bad.b, false);
      return a("crumbling", ffs.b, ffz.c.h, 1536, false, true, gmi.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<akv, gmi> bI = af.b(
      $$0 -> a("text", ffs.k, ffz.c.h, 786432, false, false, gmi.b.a().a(Z).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final gmi bJ = a("text_background", ffs.h, ffz.c.h, 1536, false, true, gmi.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<akv, gmi> bK = af.b(
      $$0 -> a("text_intensity", ffs.k, ffz.c.h, 786432, false, false, gmi.b.a().a(ab).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<akv, gmi> bL = af.b(
      $$0 -> a("text_polygon_offset", ffs.k, ffz.c.h, 1536, false, true, gmi.b.a().a(Z).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmi> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", ffs.k, ffz.c.h, 1536, false, true, gmi.b.a().a(ab).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmi> bN = af.b(
      $$0 -> a("text_see_through", ffs.k, ffz.c.h, 1536, false, false, gmi.b.a().a(ac).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmi bO = a("text_background_see_through", ffs.h, ffz.c.h, 1536, false, true, gmi.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<akv, gmi> bP = af.b(
      $$0 -> a("text_intensity_see_through", ffs.k, ffz.c.h, 1536, false, true, gmi.b.a().a(ae).a(new gmh.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmi bQ = a("lightning", ffs.f, ffz.c.h, 1536, false, true, gmi.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gmi bR = a("dragon_rays", ffs.f, ffz.c.e, 1536, false, false, gmi.b.a().a(af).a(aH).a(e).a(false));
   private static final gmi bS = a("dragon_rays_depth", ffs.e, ffz.c.e, 1536, false, false, gmi.b.a().a(p).a(aI).a(false));
   private static final gmi bT = a("tripwire", ffs.b, ffz.c.h, 1536, true, true, aa());
   private static final gmi bU = a(
      "end_portal", ffs.e, ffz.c.h, 1536, false, false, gmi.b.a().a(ah).a(gmh.i.d().a(gpd.a, false, false).a(gpd.b, false, false).a()).a(false)
   );
   private static final gmi bV = a(
      "end_gateway", ffs.e, ffz.c.h, 1536, false, false, gmi.b.a().a(ai).a(gmh.i.d().a(gpd.a, false, false).a(gpd.b, false, false).a()).a(false)
   );
   private static final gmi bW = a(false, false);
   private static final gmi bX = a(false, true);
   private static final gmi bY = a(true, true);
   public static final gmi.a bb = a("lines", ffs.g, ffz.c.a, 1536, gmi.b.a().a(ak).a(new gmh.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gmi.a bc = a(
      "secondary_block_outline", ffs.g, ffz.c.a, 1536, gmi.b.a().a(ak).a(new gmh.h(OptionalDouble.of(7.0))).a(aL).a(gmh.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gmi.a bd = a(
      "line_strip", ffs.g, ffz.c.b, 1536, gmi.b.a().a(ak).a(new gmh.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gmi.a> bZ = af.b(
      $$0 -> a("debug_line_strip", ffs.f, ffz.c.d, 1536, gmi.b.a().a(s).a(new gmh.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gmi.a ca = a("debug_filled_box", ffs.f, ffz.c.f, 1536, false, true, gmi.b.a().a(s).a(aL).a(i).a(false));
   private static final gmi.a cb = a("debug_quads", ffs.f, ffz.c.h, 1536, false, true, gmi.b.a().a(s).a(i).a(aB).a(false));
   private static final gmi.a cc = a("debug_triangle_fan", ffs.f, ffz.c.g, 1536, false, true, gmi.b.a().a(s).a(i).a(aB).a(false));
   private static final gmi.a cd = a("debug_structure_quads", ffs.f, ffz.c.h, 1536, false, true, gmi.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gmi.a ce = a("debug_section_quads", ffs.f, ffz.c.h, 1536, false, true, gmi.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gmi cf = b(false);
   private static final gmi cg = b(true);
   private static final Function<akv, gmi> ch = af.b(
      $$0 -> a("opaque_particle", ffs.d, ffz.c.h, 1536, false, false, gmi.b.a().a(u).a(new gmh.n($$0, bad.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmi> ci = af.b(
      $$0 -> a("translucent_particle", ffs.d, ffz.c.h, 1536, false, false, gmi.b.a().a(u).a(new gmh.n($$0, bad.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmi> cj = c(true);
   private static final Function<akv, gmi> ck = c(false);
   private static final gmi cl = a("sky", ffs.e, ffz.c.h, 1536, false, false, gmi.b.a().a(p).a(aH).a(false));
   private static final gmi cm = a("end_sky", ffs.j, ffz.c.h, 1536, false, false, gmi.b.a().a(t).a(new gmh.n(gmu.a, bad.b, false)).a(i).a(aH).a(false));
   private static final gmi cn = a("sunrise_sunset", ffs.f, ffz.c.g, 1536, false, false, gmi.b.a().a(s).a(i).a(aH).a(false));
   private static final gmi co = a("stars", ffs.e, ffz.c.h, 1536, false, false, gmi.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<akv, gmi> cp = af.b(
      $$0 -> a("celestial", ffs.j, ffz.c.h, 1536, false, false, gmi.b.a().a(t).a(new gmh.n($$0, bad.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<akv, gmi> cq = af.b(
      $$0 -> a("block_screen_effect", ffs.j, ffz.c.h, 1536, false, false, gmi.b.a().a(t).a(new gmh.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<akv, gmi> cr = af.b(
      $$0 -> a("fire_screen_effect", ffs.j, ffz.c.h, 1536, false, false, gmi.b.a().a(t).a(new gmh.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gmi.a cs = a("gui", ffs.f, ffz.c.h, 786432, gmi.b.a().a(al).a(i).a(aE).a(false));
   private static final gmi.a ct = a("gui_overlay", ffs.f, ffz.c.h, 1536, gmi.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<akv, gmi> cu = af.b(
      $$0 -> a("gui_textured_overlay", ffs.j, ffz.c.h, 1536, gmi.b.a().a(new gmh.n($$0, bad.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmi> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", ffs.j, ffz.c.h, 786432, gmi.b.a().a(new gmh.n($$0, bad.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gmi.a cw = a("gui_nausea_overlay", ffs.j, ffz.c.h, 1536, gmi.b.a().a(new gmh.n(fod.a, bad.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gmi.a cx = a("gui_text_highlight", ffs.f, ffz.c.h, 1536, gmi.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gmi.a cy = a("gui_ghost_recipe_overlay", ffs.f, ffz.c.h, 1536, gmi.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<akv, gmi> cz = af.b(
      $$0 -> a("gui_textured", ffs.j, ffz.c.h, 786432, gmi.b.a().a(new gmh.n($$0, bad.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<akv, gmi> cA = af.b(
      $$0 -> a("vignette", ffs.j, ffz.c.h, 786432, gmi.b.a().a(new gmh.n($$0, bad.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmi> cB = af.b(
      $$0 -> a("crosshair", ffs.j, ffz.c.h, 786432, gmi.b.a().a(new gmh.n($$0, bad.b, false)).a(t).a(k).a(false))
   );
   private static final gmi.a cC = a("mojang_logo", ffs.j, ffz.c.h, 786432, gmi.b.a().a(new gmh.n(fub.a, bad.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gmi> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final ffz cE;
   private final ffz.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gmi c() {
      return bf;
   }

   public static gmi d() {
      return bg;
   }

   public static gmi e() {
      return bh;
   }

   private static gmi.b a(gmh.m $$0) {
      return gmi.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gmi f() {
      return bi;
   }

   private static gmi.b Z() {
      return gmi.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gmi g() {
      return bj;
   }

   private static gmi.a a(String $$0, akv $$1, boolean $$2) {
      gmi.b $$3 = gmi.b.a().a(A).a(new gmh.n($$1, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, ffs.c, ffz.c.h, 1536, true, false, $$3);
   }

   public static gmi a(akv $$0) {
      return bk.apply($$0);
   }

   public static gmi b(akv $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gmi c(akv $$0) {
      return bl.apply($$0);
   }

   public static gmi d(akv $$0) {
      return bm.apply($$0);
   }

   public static gmi e(akv $$0) {
      return bn.apply($$0);
   }

   public static gmi f(akv $$0) {
      return bo.apply($$0);
   }

   public static gmi a(akv $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gmi g(akv $$0) {
      return a($$0, true);
   }

   public static gmi b(akv $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gmi h(akv $$0) {
      return b($$0, true);
   }

   public static gmi i(akv $$0) {
      return br.apply($$0);
   }

   public static gmi c(akv $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gmi j(akv $$0) {
      return c($$0, true);
   }

   public static gmi d(akv $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gmi k(akv $$0) {
      return d($$0, true);
   }

   public static gmi l(akv $$0) {
      return bu.apply($$0);
   }

   public static gmi e(akv $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gmi m(akv $$0) {
      return bw.apply($$0);
   }

   public static gmi n(akv $$0) {
      return bx.apply($$0);
   }

   public static gmi o(akv $$0) {
      return by.apply($$0);
   }

   public static gmi p(akv $$0) {
      return bz.apply($$0);
   }

   public static gmi q(akv $$0) {
      return bA.apply($$0, i);
   }

   public static gmi r(akv $$0) {
      return bt.apply($$0, false);
   }

   public static gmi a(akv $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ffs.c,
         ffz.c.h,
         1536,
         false,
         true,
         gmi.b.a().a(ap).a(new gmh.n($$0, bad.b, false)).a(new gmh.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gmi b(akv $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ffs.c,
         ffz.c.h,
         1536,
         false,
         true,
         gmi.b.a().a(Q).a(new gmh.n($$0, bad.b, false)).a(new gmh.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gmi h() {
      return bB;
   }

   public static gmi i() {
      return bC;
   }

   public static gmi s(akv $$0) {
      return gmi.a.be.apply($$0, aB);
   }

   public static gmi j() {
      return bD;
   }

   public static gmi k() {
      return bE;
   }

   public static gmi l() {
      return bF;
   }

   public static gmi m() {
      return bG;
   }

   public static gmi t(akv $$0) {
      return bH.apply($$0);
   }

   public static gmi u(akv $$0) {
      return bI.apply($$0);
   }

   public static gmi n() {
      return bJ;
   }

   public static gmi v(akv $$0) {
      return bK.apply($$0);
   }

   public static gmi w(akv $$0) {
      return bL.apply($$0);
   }

   public static gmi x(akv $$0) {
      return bM.apply($$0);
   }

   public static gmi y(akv $$0) {
      return bN.apply($$0);
   }

   public static gmi o() {
      return bO;
   }

   public static gmi z(akv $$0) {
      return bP.apply($$0);
   }

   public static gmi p() {
      return bQ;
   }

   public static gmi q() {
      return bR;
   }

   public static gmi r() {
      return bS;
   }

   private static gmi.b aa() {
      return gmi.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gmi s() {
      return bT;
   }

   public static gmi t() {
      return bU;
   }

   public static gmi u() {
      return bV;
   }

   private static gmi.a a(boolean $$0, boolean $$1) {
      return a("clouds", ffs.f, ffz.c.h, 786432, false, false, gmi.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gmi v() {
      return bW;
   }

   public static gmi w() {
      return bX;
   }

   public static gmi x() {
      return bY;
   }

   public static gmi y() {
      return bb;
   }

   public static gmi z() {
      return bc;
   }

   public static gmi A() {
      return bd;
   }

   public static gmi a(double $$0) {
      return bZ.apply($$0);
   }

   public static gmi B() {
      return ca;
   }

   public static gmi C() {
      return cb;
   }

   public static gmi D() {
      return cc;
   }

   public static gmi E() {
      return cd;
   }

   public static gmi F() {
      return ce;
   }

   private static gmi b(boolean $$0) {
      return a(
         "world_border",
         ffs.i,
         ffz.c.h,
         1536,
         false,
         false,
         gmi.b.a().a(q).a(new gmh.n(gna.a, bad.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gmi a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gmi A(akv $$0) {
      return ch.apply($$0);
   }

   public static gmi B(akv $$0) {
      return ci.apply($$0);
   }

   private static Function<akv, gmi> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", ffs.d, ffz.c.h, 1536, false, false, gmi.b.a().a(u).a(new gmh.n($$1, bad.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gmi f(akv $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gmi G() {
      return cl;
   }

   public static gmi H() {
      return cm;
   }

   public static gmi I() {
      return cn;
   }

   public static gmi J() {
      return co;
   }

   public static gmi C(akv $$0) {
      return cp.apply($$0);
   }

   public static gmi D(akv $$0) {
      return cq.apply($$0);
   }

   public static gmi E(akv $$0) {
      return cr.apply($$0);
   }

   public static gmi K() {
      return cs;
   }

   public static gmi L() {
      return ct;
   }

   public static gmi F(akv $$0) {
      return cu.apply($$0);
   }

   public static gmi G(akv $$0) {
      return cv.apply($$0);
   }

   public static gmi M() {
      return cw;
   }

   public static gmi N() {
      return cx;
   }

   public static gmi O() {
      return cy;
   }

   public static gmi H(akv $$0) {
      return cz.apply($$0);
   }

   public static gmi I(akv $$0) {
      return cA.apply($$0);
   }

   public static gmi J(akv $$0) {
      return cB.apply($$0);
   }

   public static gmi P() {
      return cC;
   }

   public gmi(String $$0, ffz $$1, ffz.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gmi.a a(String $$0, ffz $$1, ffz.c $$2, int $$3, gmi.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gmi.a a(String $$0, ffz $$1, ffz.c $$2, int $$3, boolean $$4, boolean $$5, gmi.b $$6) {
      return new gmi.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fft $$0) {
      this.a();
      ffq.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gmi> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public ffz S() {
      return this.cE;
   }

   public ffz.c T() {
      return this.cF;
   }

   public Optional<gmi> U() {
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

   static final class a extends gmi {
      static final BiFunction<akv, gmh.c, gmi> be = af.a(
         ($$0, $$1) -> gmi.a("outline", ffs.j, ffz.c.h, 1536, gmi.b.a().a(T).a(new gmh.n($$0, bad.b, false)).a($$1).a(aC).a(aP).a(gmi.c.b))
      );
      private final gmi.b bf;
      private final Optional<gmi> bg;
      private final boolean bh;

      a(String $$0, ffz $$1, ffz.c $$2, int $$3, boolean $$4, boolean $$5, gmi.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gmh::a), () -> $$6.o.forEach(gmh::b));
         this.bf = $$6;
         this.bg = $$6.n == gmi.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gmi.c.b;
      }

      @Override
      public Optional<gmi> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gmi.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gmh.e a;
      private final gmh.m b;
      private final gmh.p c;
      private final gmh.d d;
      final gmh.c e;
      private final gmh.g f;
      private final gmh.l g;
      private final gmh.f h;
      private final gmh.k i;
      private final gmh.o j;
      private final gmh.q k;
      private final gmh.h l;
      private final gmh.b m;
      final gmi.c n;
      final ImmutableList<gmh> o;

      b(
         gmh.e $$0,
         gmh.m $$1,
         gmh.p $$2,
         gmh.d $$3,
         gmh.c $$4,
         gmh.g $$5,
         gmh.l $$6,
         gmh.f $$7,
         gmh.k $$8,
         gmh.o $$9,
         gmh.q $$10,
         gmh.h $$11,
         gmh.b $$12,
         gmi.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gmh[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gmi.b.a a() {
         return new gmi.b.a();
      }

      public static class a {
         private gmh.e a = gmh.as;
         private gmh.m b = gmh.n;
         private gmh.p c;
         private gmh.d d;
         private gmh.c e;
         private gmh.g f;
         private gmh.l g;
         private gmh.f h;
         private gmh.k i;
         private gmh.o j;
         private gmh.q k;
         private gmh.h l;
         private gmh.b m;

         a() {
            this.c = gmh.c;
            this.d = gmh.aE;
            this.e = gmh.aA;
            this.f = gmh.ax;
            this.g = gmh.az;
            this.h = gmh.aJ;
            this.i = gmh.aO;
            this.j = gmh.at;
            this.k = gmh.aG;
            this.l = gmh.aV;
            this.m = gmh.aW;
         }

         public gmi.b.a a(gmh.e $$0) {
            this.a = $$0;
            return this;
         }

         public gmi.b.a a(gmh.m $$0) {
            this.b = $$0;
            return this;
         }

         public gmi.b.a a(gmh.p $$0) {
            this.c = $$0;
            return this;
         }

         public gmi.b.a a(gmh.d $$0) {
            this.d = $$0;
            return this;
         }

         public gmi.b.a a(gmh.c $$0) {
            this.e = $$0;
            return this;
         }

         public gmi.b.a a(gmh.g $$0) {
            this.f = $$0;
            return this;
         }

         public gmi.b.a a(gmh.l $$0) {
            this.g = $$0;
            return this;
         }

         public gmi.b.a a(gmh.f $$0) {
            this.h = $$0;
            return this;
         }

         public gmi.b.a a(gmh.k $$0) {
            this.i = $$0;
            return this;
         }

         public gmi.b.a a(gmh.o $$0) {
            this.j = $$0;
            return this;
         }

         public gmi.b.a a(gmh.q $$0) {
            this.k = $$0;
            return this;
         }

         public gmi.b.a a(gmh.h $$0) {
            this.l = $$0;
            return this;
         }

         public gmi.b.a a(gmh.b $$0) {
            this.m = $$0;
            return this;
         }

         public gmi.b a(boolean $$0) {
            return this.a($$0 ? gmi.c.c : gmi.c.a);
         }

         public gmi.b a(gmi.c $$0) {
            return new gmi.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
