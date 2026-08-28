import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gmj extends gmi {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gmj bf = a("solid", fft.b, fga.c.h, 4194304, true, false, gmj.b.a().a(aw).a(v).a(aq).a(true));
   private static final gmj bg = a("cutout_mipped", fft.b, fga.c.h, 4194304, true, false, gmj.b.a().a(aw).a(w).a(aq).a(true));
   private static final gmj bh = a("cutout", fft.b, fga.c.h, 786432, true, false, gmj.b.a().a(aw).a(x).a(ar).a(true));
   private static final gmj bi = a("translucent", fft.b, fga.c.h, 786432, true, true, a(y));
   private static final gmj bj = a("translucent_moving_block", fft.b, fga.c.h, 786432, false, true, Z());
   private static final Function<akv, gmj> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<akv, gmj> bl = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(B).a(new gmi.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fft.c, fga.c.h, 1536, true, true, $$1);
   });
   private static final Function<akv, gmj> bm = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(C).a(new gmi.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fft.c, fga.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmj> bn = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(C).a(new gmi.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fft.c, fga.c.h, 1536, true, false, $$1);
   });
   private static final Function<akv, gmj> bo = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(D).a(new gmi.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fft.c, fga.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<akv, Boolean, gmj> bp = af.a(($$0, $$1) -> {
      gmj.b $$2 = gmj.b.a().a(E).a(new gmi.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fft.c, fga.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<akv, Boolean, gmj> bq = af.a(($$0, $$1) -> {
      gmj.b $$2 = gmj.b.a().a(F).a(new gmi.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fft.c, fga.c.h, 1536, true, false, $$2);
   });
   private static final Function<akv, gmj> br = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(G).a(new gmi.n($$0, bad.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fft.c, fga.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<akv, Boolean, gmj> bs = af.a(($$0, $$1) -> {
      gmj.b $$2 = gmj.b.a().a(H).a(new gmi.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fft.c, fga.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<akv, Boolean, gmj> bt = af.a(($$0, $$1) -> {
      gmj.b $$2 = gmj.b.a().a(I).a(new gmi.n($$0, bad.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fft.c, fga.c.h, 1536, true, true, $$2);
   });
   private static final Function<akv, gmj> bu = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(J).a(new gmi.n($$0, bad.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fft.c, fga.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, Boolean, gmj> bv = af.a(($$0, $$1) -> {
      gmj.b $$2 = gmj.b.a().a(K).a(new gmi.n($$0, bad.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fft.b, fga.c.h, 1536, false, true, $$2);
   });
   private static final Function<akv, gmj> bw = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(L).a(new gmi.n($$0, bad.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fft.c, fga.c.h, 1536, $$1);
   });
   private static final Function<akv, gmj> bx = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(M).a(new gmi.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fft.c, fga.c.h, 1536, false, true, $$1);
   });
   private static final Function<akv, gmj> by = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(N).a(new gmi.n($$0, bad.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fft.c, fga.c.h, 1536, false, false, $$1);
   });
   private static final Function<akv, gmj> bz = af.b($$0 -> {
      gmj.b $$1 = gmj.b.a().a(O).a(new gmi.n($$0, bad.b, false)).a(aB).a(true);
      return a("entity_alpha", fft.c, fga.c.h, 1536, $$1);
   });
   private static final BiFunction<akv, gmi.p, gmj> bA = af.a(($$0, $$1) -> {
      gmi.n $$2 = new gmi.n($$0, bad.b, false);
      return a("eyes", fft.c, fga.c.h, 1536, false, true, gmj.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gmj bB = a("leash", fft.h, fga.c.f, 1536, gmj.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gmj bC = a("water_mask", fft.e, fga.c.h, 1536, gmj.b.a().a(S).a(as).a(aI).a(false));
   private static final gmj bD = a(
      "armor_entity_glint", fft.i, fga.c.h, 1536, gmj.b.a().a(U).a(new gmi.n(gtd.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gmj bE = a(
      "glint_translucent", fft.i, fga.c.h, 1536, gmj.b.a().a(V).a(new gmi.n(gtd.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gmj bF = a("glint", fft.i, fga.c.h, 1536, gmj.b.a().a(W).a(new gmi.n(gtd.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gmj bG = a("entity_glint", fft.i, fga.c.h, 1536, gmj.b.a().a(X).a(new gmi.n(gtd.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<akv, gmj> bH = af.b($$0 -> {
      gmi.n $$1 = new gmi.n($$0, bad.b, false);
      return a("crumbling", fft.b, fga.c.h, 1536, false, true, gmj.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<akv, gmj> bI = af.b(
      $$0 -> a("text", fft.k, fga.c.h, 786432, false, false, gmj.b.a().a(Z).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final gmj bJ = a("text_background", fft.h, fga.c.h, 1536, false, true, gmj.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<akv, gmj> bK = af.b(
      $$0 -> a("text_intensity", fft.k, fga.c.h, 786432, false, false, gmj.b.a().a(ab).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<akv, gmj> bL = af.b(
      $$0 -> a("text_polygon_offset", fft.k, fga.c.h, 1536, false, true, gmj.b.a().a(Z).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmj> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", fft.k, fga.c.h, 1536, false, true, gmj.b.a().a(ab).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<akv, gmj> bN = af.b(
      $$0 -> a("text_see_through", fft.k, fga.c.h, 1536, false, false, gmj.b.a().a(ac).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmj bO = a("text_background_see_through", fft.h, fga.c.h, 1536, false, true, gmj.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<akv, gmj> bP = af.b(
      $$0 -> a("text_intensity_see_through", fft.k, fga.c.h, 1536, false, true, gmj.b.a().a(ae).a(new gmi.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmj bQ = a("lightning", fft.f, fga.c.h, 1536, false, true, gmj.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gmj bR = a("dragon_rays", fft.f, fga.c.e, 1536, false, false, gmj.b.a().a(af).a(aH).a(e).a(false));
   private static final gmj bS = a("dragon_rays_depth", fft.e, fga.c.e, 1536, false, false, gmj.b.a().a(p).a(aI).a(false));
   private static final gmj bT = a("tripwire", fft.b, fga.c.h, 1536, true, true, aa());
   private static final gmj bU = a(
      "end_portal", fft.e, fga.c.h, 1536, false, false, gmj.b.a().a(ah).a(gmi.i.d().a(gpe.a, false, false).a(gpe.b, false, false).a()).a(false)
   );
   private static final gmj bV = a(
      "end_gateway", fft.e, fga.c.h, 1536, false, false, gmj.b.a().a(ai).a(gmi.i.d().a(gpe.a, false, false).a(gpe.b, false, false).a()).a(false)
   );
   private static final gmj bW = a(false, false);
   private static final gmj bX = a(false, true);
   private static final gmj bY = a(true, true);
   public static final gmj.a bb = a("lines", fft.g, fga.c.a, 1536, gmj.b.a().a(ak).a(new gmi.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gmj.a bc = a(
      "secondary_block_outline", fft.g, fga.c.a, 1536, gmj.b.a().a(ak).a(new gmi.h(OptionalDouble.of(7.0))).a(aL).a(gmi.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gmj.a bd = a(
      "line_strip", fft.g, fga.c.b, 1536, gmj.b.a().a(ak).a(new gmi.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gmj.a> bZ = af.b(
      $$0 -> a("debug_line_strip", fft.f, fga.c.d, 1536, gmj.b.a().a(s).a(new gmi.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gmj.a ca = a("debug_filled_box", fft.f, fga.c.f, 1536, false, true, gmj.b.a().a(s).a(aL).a(i).a(false));
   private static final gmj.a cb = a("debug_quads", fft.f, fga.c.h, 1536, false, true, gmj.b.a().a(s).a(i).a(aB).a(false));
   private static final gmj.a cc = a("debug_triangle_fan", fft.f, fga.c.g, 1536, false, true, gmj.b.a().a(s).a(i).a(aB).a(false));
   private static final gmj.a cd = a("debug_structure_quads", fft.f, fga.c.h, 1536, false, true, gmj.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gmj.a ce = a("debug_section_quads", fft.f, fga.c.h, 1536, false, true, gmj.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gmj cf = b(false);
   private static final gmj cg = b(true);
   private static final Function<akv, gmj> ch = af.b(
      $$0 -> a("opaque_particle", fft.d, fga.c.h, 1536, false, false, gmj.b.a().a(u).a(new gmi.n($$0, bad.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmj> ci = af.b(
      $$0 -> a("translucent_particle", fft.d, fga.c.h, 1536, false, false, gmj.b.a().a(u).a(new gmi.n($$0, bad.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<akv, gmj> cj = c(true);
   private static final Function<akv, gmj> ck = c(false);
   private static final gmj cl = a("sky", fft.e, fga.c.h, 1536, false, false, gmj.b.a().a(p).a(aH).a(false));
   private static final gmj cm = a("end_sky", fft.j, fga.c.h, 1536, false, false, gmj.b.a().a(t).a(new gmi.n(gmv.a, bad.b, false)).a(i).a(aH).a(false));
   private static final gmj cn = a("sunrise_sunset", fft.f, fga.c.g, 1536, false, false, gmj.b.a().a(s).a(i).a(aH).a(false));
   private static final gmj co = a("stars", fft.e, fga.c.h, 1536, false, false, gmj.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<akv, gmj> cp = af.b(
      $$0 -> a("celestial", fft.j, fga.c.h, 1536, false, false, gmj.b.a().a(t).a(new gmi.n($$0, bad.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<akv, gmj> cq = af.b(
      $$0 -> a("block_screen_effect", fft.j, fga.c.h, 1536, false, false, gmj.b.a().a(t).a(new gmi.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<akv, gmj> cr = af.b(
      $$0 -> a("fire_screen_effect", fft.j, fga.c.h, 1536, false, false, gmj.b.a().a(t).a(new gmi.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gmj.a cs = a("gui", fft.f, fga.c.h, 786432, gmj.b.a().a(al).a(i).a(aE).a(false));
   private static final gmj.a ct = a("gui_overlay", fft.f, fga.c.h, 1536, gmj.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<akv, gmj> cu = af.b(
      $$0 -> a("gui_textured_overlay", fft.j, fga.c.h, 1536, gmj.b.a().a(new gmi.n($$0, bad.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmj> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fft.j, fga.c.h, 786432, gmj.b.a().a(new gmi.n($$0, bad.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gmj.a cw = a("gui_nausea_overlay", fft.j, fga.c.h, 1536, gmj.b.a().a(new gmi.n(foe.a, bad.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gmj.a cx = a("gui_text_highlight", fft.f, fga.c.h, 1536, gmj.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gmj.a cy = a("gui_ghost_recipe_overlay", fft.f, fga.c.h, 1536, gmj.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<akv, gmj> cz = af.b(
      $$0 -> a("gui_textured", fft.j, fga.c.h, 786432, gmj.b.a().a(new gmi.n($$0, bad.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<akv, gmj> cA = af.b(
      $$0 -> a("vignette", fft.j, fga.c.h, 786432, gmj.b.a().a(new gmi.n($$0, bad.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<akv, gmj> cB = af.b(
      $$0 -> a("crosshair", fft.j, fga.c.h, 786432, gmj.b.a().a(new gmi.n($$0, bad.b, false)).a(t).a(k).a(false))
   );
   private static final gmj.a cC = a("mojang_logo", fft.j, fga.c.h, 786432, gmj.b.a().a(new gmi.n(fuc.a, bad.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gmj> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fga cE;
   private final fga.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gmj c() {
      return bf;
   }

   public static gmj d() {
      return bg;
   }

   public static gmj e() {
      return bh;
   }

   private static gmj.b a(gmi.m $$0) {
      return gmj.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gmj f() {
      return bi;
   }

   private static gmj.b Z() {
      return gmj.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gmj g() {
      return bj;
   }

   private static gmj.a a(String $$0, akv $$1, boolean $$2) {
      gmj.b $$3 = gmj.b.a().a(A).a(new gmi.n($$1, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fft.c, fga.c.h, 1536, true, false, $$3);
   }

   public static gmj a(akv $$0) {
      return bk.apply($$0);
   }

   public static gmj b(akv $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gmj c(akv $$0) {
      return bl.apply($$0);
   }

   public static gmj d(akv $$0) {
      return bm.apply($$0);
   }

   public static gmj e(akv $$0) {
      return bn.apply($$0);
   }

   public static gmj f(akv $$0) {
      return bo.apply($$0);
   }

   public static gmj a(akv $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gmj g(akv $$0) {
      return a($$0, true);
   }

   public static gmj b(akv $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gmj h(akv $$0) {
      return b($$0, true);
   }

   public static gmj i(akv $$0) {
      return br.apply($$0);
   }

   public static gmj c(akv $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gmj j(akv $$0) {
      return c($$0, true);
   }

   public static gmj d(akv $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gmj k(akv $$0) {
      return d($$0, true);
   }

   public static gmj l(akv $$0) {
      return bu.apply($$0);
   }

   public static gmj e(akv $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gmj m(akv $$0) {
      return bw.apply($$0);
   }

   public static gmj n(akv $$0) {
      return bx.apply($$0);
   }

   public static gmj o(akv $$0) {
      return by.apply($$0);
   }

   public static gmj p(akv $$0) {
      return bz.apply($$0);
   }

   public static gmj q(akv $$0) {
      return bA.apply($$0, i);
   }

   public static gmj r(akv $$0) {
      return bt.apply($$0, false);
   }

   public static gmj a(akv $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fft.c,
         fga.c.h,
         1536,
         false,
         true,
         gmj.b.a().a(ap).a(new gmi.n($$0, bad.b, false)).a(new gmi.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gmj b(akv $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fft.c,
         fga.c.h,
         1536,
         false,
         true,
         gmj.b.a().a(Q).a(new gmi.n($$0, bad.b, false)).a(new gmi.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gmj h() {
      return bB;
   }

   public static gmj i() {
      return bC;
   }

   public static gmj s(akv $$0) {
      return gmj.a.be.apply($$0, aB);
   }

   public static gmj j() {
      return bD;
   }

   public static gmj k() {
      return bE;
   }

   public static gmj l() {
      return bF;
   }

   public static gmj m() {
      return bG;
   }

   public static gmj t(akv $$0) {
      return bH.apply($$0);
   }

   public static gmj u(akv $$0) {
      return bI.apply($$0);
   }

   public static gmj n() {
      return bJ;
   }

   public static gmj v(akv $$0) {
      return bK.apply($$0);
   }

   public static gmj w(akv $$0) {
      return bL.apply($$0);
   }

   public static gmj x(akv $$0) {
      return bM.apply($$0);
   }

   public static gmj y(akv $$0) {
      return bN.apply($$0);
   }

   public static gmj o() {
      return bO;
   }

   public static gmj z(akv $$0) {
      return bP.apply($$0);
   }

   public static gmj p() {
      return bQ;
   }

   public static gmj q() {
      return bR;
   }

   public static gmj r() {
      return bS;
   }

   private static gmj.b aa() {
      return gmj.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gmj s() {
      return bT;
   }

   public static gmj t() {
      return bU;
   }

   public static gmj u() {
      return bV;
   }

   private static gmj.a a(boolean $$0, boolean $$1) {
      return a("clouds", fft.f, fga.c.h, 786432, false, false, gmj.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gmj v() {
      return bW;
   }

   public static gmj w() {
      return bX;
   }

   public static gmj x() {
      return bY;
   }

   public static gmj y() {
      return bb;
   }

   public static gmj z() {
      return bc;
   }

   public static gmj A() {
      return bd;
   }

   public static gmj a(double $$0) {
      return bZ.apply($$0);
   }

   public static gmj B() {
      return ca;
   }

   public static gmj C() {
      return cb;
   }

   public static gmj D() {
      return cc;
   }

   public static gmj E() {
      return cd;
   }

   public static gmj F() {
      return ce;
   }

   private static gmj b(boolean $$0) {
      return a(
         "world_border",
         fft.i,
         fga.c.h,
         1536,
         false,
         false,
         gmj.b.a().a(q).a(new gmi.n(gnb.a, bad.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gmj a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gmj A(akv $$0) {
      return ch.apply($$0);
   }

   public static gmj B(akv $$0) {
      return ci.apply($$0);
   }

   private static Function<akv, gmj> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fft.d, fga.c.h, 1536, false, false, gmj.b.a().a(u).a(new gmi.n($$1, bad.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gmj f(akv $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gmj G() {
      return cl;
   }

   public static gmj H() {
      return cm;
   }

   public static gmj I() {
      return cn;
   }

   public static gmj J() {
      return co;
   }

   public static gmj C(akv $$0) {
      return cp.apply($$0);
   }

   public static gmj D(akv $$0) {
      return cq.apply($$0);
   }

   public static gmj E(akv $$0) {
      return cr.apply($$0);
   }

   public static gmj K() {
      return cs;
   }

   public static gmj L() {
      return ct;
   }

   public static gmj F(akv $$0) {
      return cu.apply($$0);
   }

   public static gmj G(akv $$0) {
      return cv.apply($$0);
   }

   public static gmj M() {
      return cw;
   }

   public static gmj N() {
      return cx;
   }

   public static gmj O() {
      return cy;
   }

   public static gmj H(akv $$0) {
      return cz.apply($$0);
   }

   public static gmj I(akv $$0) {
      return cA.apply($$0);
   }

   public static gmj J(akv $$0) {
      return cB.apply($$0);
   }

   public static gmj P() {
      return cC;
   }

   public gmj(String $$0, fga $$1, fga.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gmj.a a(String $$0, fga $$1, fga.c $$2, int $$3, gmj.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gmj.a a(String $$0, fga $$1, fga.c $$2, int $$3, boolean $$4, boolean $$5, gmj.b $$6) {
      return new gmj.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ffu $$0) {
      this.a();
      ffr.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gmj> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fga S() {
      return this.cE;
   }

   public fga.c T() {
      return this.cF;
   }

   public Optional<gmj> U() {
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

   static final class a extends gmj {
      static final BiFunction<akv, gmi.c, gmj> be = af.a(
         ($$0, $$1) -> gmj.a("outline", fft.j, fga.c.h, 1536, gmj.b.a().a(T).a(new gmi.n($$0, bad.b, false)).a($$1).a(aC).a(aP).a(gmj.c.b))
      );
      private final gmj.b bf;
      private final Optional<gmj> bg;
      private final boolean bh;

      a(String $$0, fga $$1, fga.c $$2, int $$3, boolean $$4, boolean $$5, gmj.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gmi::a), () -> $$6.o.forEach(gmi::b));
         this.bf = $$6;
         this.bg = $$6.n == gmj.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gmj.c.b;
      }

      @Override
      public Optional<gmj> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gmj.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gmi.e a;
      private final gmi.m b;
      private final gmi.p c;
      private final gmi.d d;
      final gmi.c e;
      private final gmi.g f;
      private final gmi.l g;
      private final gmi.f h;
      private final gmi.k i;
      private final gmi.o j;
      private final gmi.q k;
      private final gmi.h l;
      private final gmi.b m;
      final gmj.c n;
      final ImmutableList<gmi> o;

      b(
         gmi.e $$0,
         gmi.m $$1,
         gmi.p $$2,
         gmi.d $$3,
         gmi.c $$4,
         gmi.g $$5,
         gmi.l $$6,
         gmi.f $$7,
         gmi.k $$8,
         gmi.o $$9,
         gmi.q $$10,
         gmi.h $$11,
         gmi.b $$12,
         gmj.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gmi[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gmj.b.a a() {
         return new gmj.b.a();
      }

      public static class a {
         private gmi.e a = gmi.as;
         private gmi.m b = gmi.n;
         private gmi.p c;
         private gmi.d d;
         private gmi.c e;
         private gmi.g f;
         private gmi.l g;
         private gmi.f h;
         private gmi.k i;
         private gmi.o j;
         private gmi.q k;
         private gmi.h l;
         private gmi.b m;

         a() {
            this.c = gmi.c;
            this.d = gmi.aE;
            this.e = gmi.aA;
            this.f = gmi.ax;
            this.g = gmi.az;
            this.h = gmi.aJ;
            this.i = gmi.aO;
            this.j = gmi.at;
            this.k = gmi.aG;
            this.l = gmi.aV;
            this.m = gmi.aW;
         }

         public gmj.b.a a(gmi.e $$0) {
            this.a = $$0;
            return this;
         }

         public gmj.b.a a(gmi.m $$0) {
            this.b = $$0;
            return this;
         }

         public gmj.b.a a(gmi.p $$0) {
            this.c = $$0;
            return this;
         }

         public gmj.b.a a(gmi.d $$0) {
            this.d = $$0;
            return this;
         }

         public gmj.b.a a(gmi.c $$0) {
            this.e = $$0;
            return this;
         }

         public gmj.b.a a(gmi.g $$0) {
            this.f = $$0;
            return this;
         }

         public gmj.b.a a(gmi.l $$0) {
            this.g = $$0;
            return this;
         }

         public gmj.b.a a(gmi.f $$0) {
            this.h = $$0;
            return this;
         }

         public gmj.b.a a(gmi.k $$0) {
            this.i = $$0;
            return this;
         }

         public gmj.b.a a(gmi.o $$0) {
            this.j = $$0;
            return this;
         }

         public gmj.b.a a(gmi.q $$0) {
            this.k = $$0;
            return this;
         }

         public gmj.b.a a(gmi.h $$0) {
            this.l = $$0;
            return this;
         }

         public gmj.b.a a(gmi.b $$0) {
            this.m = $$0;
            return this;
         }

         public gmj.b a(boolean $$0) {
            return this.a($$0 ? gmj.c.c : gmj.c.a);
         }

         public gmj.b a(gmj.c $$0) {
            return new gmj.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
