import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gmf extends gme {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gmf bf = a("solid", ffq.b, ffx.c.h, 4194304, true, false, gmf.b.a().a(aw).a(v).a(aq).a(true));
   private static final gmf bg = a("cutout_mipped", ffq.b, ffx.c.h, 4194304, true, false, gmf.b.a().a(aw).a(w).a(aq).a(true));
   private static final gmf bh = a("cutout", ffq.b, ffx.c.h, 786432, true, false, gmf.b.a().a(aw).a(x).a(ar).a(true));
   private static final gmf bi = a("translucent", ffq.b, ffx.c.h, 786432, true, true, a(y));
   private static final gmf bj = a("translucent_moving_block", ffq.b, ffx.c.h, 786432, false, true, Z());
   private static final Function<aku, gmf> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aku, gmf> bl = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(B).a(new gme.n($$0, bac.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", ffq.c, ffx.c.h, 1536, true, true, $$1);
   });
   private static final Function<aku, gmf> bm = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(C).a(new gme.n($$0, bac.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", ffq.c, ffx.c.h, 1536, true, false, $$1);
   });
   private static final Function<aku, gmf> bn = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(C).a(new gme.n($$0, bac.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", ffq.c, ffx.c.h, 1536, true, false, $$1);
   });
   private static final Function<aku, gmf> bo = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(D).a(new gme.n($$0, bac.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", ffq.c, ffx.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<aku, Boolean, gmf> bp = af.a(($$0, $$1) -> {
      gmf.b $$2 = gmf.b.a().a(E).a(new gme.n($$0, bac.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", ffq.c, ffx.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<aku, Boolean, gmf> bq = af.a(($$0, $$1) -> {
      gmf.b $$2 = gmf.b.a().a(F).a(new gme.n($$0, bac.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", ffq.c, ffx.c.h, 1536, true, false, $$2);
   });
   private static final Function<aku, gmf> br = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(G).a(new gme.n($$0, bac.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", ffq.c, ffx.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<aku, Boolean, gmf> bs = af.a(($$0, $$1) -> {
      gmf.b $$2 = gmf.b.a().a(H).a(new gme.n($$0, bac.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", ffq.c, ffx.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<aku, Boolean, gmf> bt = af.a(($$0, $$1) -> {
      gmf.b $$2 = gmf.b.a().a(I).a(new gme.n($$0, bac.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", ffq.c, ffx.c.h, 1536, true, true, $$2);
   });
   private static final Function<aku, gmf> bu = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(J).a(new gme.n($$0, bac.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", ffq.c, ffx.c.h, 1536, $$1);
   });
   private static final BiFunction<aku, Boolean, gmf> bv = af.a(($$0, $$1) -> {
      gmf.b $$2 = gmf.b.a().a(K).a(new gme.n($$0, bac.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", ffq.b, ffx.c.h, 1536, false, true, $$2);
   });
   private static final Function<aku, gmf> bw = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(L).a(new gme.n($$0, bac.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", ffq.c, ffx.c.h, 1536, $$1);
   });
   private static final Function<aku, gmf> bx = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(M).a(new gme.n($$0, bac.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", ffq.c, ffx.c.h, 1536, false, true, $$1);
   });
   private static final Function<aku, gmf> by = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(N).a(new gme.n($$0, bac.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", ffq.c, ffx.c.h, 1536, false, false, $$1);
   });
   private static final Function<aku, gmf> bz = af.b($$0 -> {
      gmf.b $$1 = gmf.b.a().a(O).a(new gme.n($$0, bac.b, false)).a(aB).a(true);
      return a("entity_alpha", ffq.c, ffx.c.h, 1536, $$1);
   });
   private static final BiFunction<aku, gme.p, gmf> bA = af.a(($$0, $$1) -> {
      gme.n $$2 = new gme.n($$0, bac.b, false);
      return a("eyes", ffq.c, ffx.c.h, 1536, false, true, gmf.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gmf bB = a("leash", ffq.h, ffx.c.f, 1536, gmf.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gmf bC = a("water_mask", ffq.e, ffx.c.h, 1536, gmf.b.a().a(S).a(as).a(aI).a(false));
   private static final gmf bD = a(
      "armor_entity_glint", ffq.i, ffx.c.h, 1536, gmf.b.a().a(U).a(new gme.n(gsz.a, bac.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gmf bE = a(
      "glint_translucent", ffq.i, ffx.c.h, 1536, gmf.b.a().a(V).a(new gme.n(gsz.b, bac.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gmf bF = a("glint", ffq.i, ffx.c.h, 1536, gmf.b.a().a(W).a(new gme.n(gsz.b, bac.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gmf bG = a("entity_glint", ffq.i, ffx.c.h, 1536, gmf.b.a().a(X).a(new gme.n(gsz.a, bac.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<aku, gmf> bH = af.b($$0 -> {
      gme.n $$1 = new gme.n($$0, bac.b, false);
      return a("crumbling", ffq.b, ffx.c.h, 1536, false, true, gmf.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<aku, gmf> bI = af.b(
      $$0 -> a("text", ffq.k, ffx.c.h, 786432, false, false, gmf.b.a().a(Z).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(false))
   );
   private static final gmf bJ = a("text_background", ffq.h, ffx.c.h, 1536, false, true, gmf.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<aku, gmf> bK = af.b(
      $$0 -> a("text_intensity", ffq.k, ffx.c.h, 786432, false, false, gmf.b.a().a(ab).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<aku, gmf> bL = af.b(
      $$0 -> a("text_polygon_offset", ffq.k, ffx.c.h, 1536, false, true, gmf.b.a().a(Z).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<aku, gmf> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", ffq.k, ffx.c.h, 1536, false, true, gmf.b.a().a(ab).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<aku, gmf> bN = af.b(
      $$0 -> a("text_see_through", ffq.k, ffx.c.h, 1536, false, false, gmf.b.a().a(ac).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmf bO = a("text_background_see_through", ffq.h, ffx.c.h, 1536, false, true, gmf.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<aku, gmf> bP = af.b(
      $$0 -> a("text_intensity_see_through", ffq.k, ffx.c.h, 1536, false, true, gmf.b.a().a(ae).a(new gme.n($$0, bac.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gmf bQ = a("lightning", ffq.f, ffx.c.h, 1536, false, true, gmf.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gmf bR = a("dragon_rays", ffq.f, ffx.c.e, 1536, false, false, gmf.b.a().a(af).a(aH).a(e).a(false));
   private static final gmf bS = a("dragon_rays_depth", ffq.e, ffx.c.e, 1536, false, false, gmf.b.a().a(p).a(aI).a(false));
   private static final gmf bT = a("tripwire", ffq.b, ffx.c.h, 1536, true, true, aa());
   private static final gmf bU = a(
      "end_portal", ffq.e, ffx.c.h, 1536, false, false, gmf.b.a().a(ah).a(gme.i.d().a(gpa.a, false, false).a(gpa.b, false, false).a()).a(false)
   );
   private static final gmf bV = a(
      "end_gateway", ffq.e, ffx.c.h, 1536, false, false, gmf.b.a().a(ai).a(gme.i.d().a(gpa.a, false, false).a(gpa.b, false, false).a()).a(false)
   );
   private static final gmf bW = a(false, false);
   private static final gmf bX = a(false, true);
   private static final gmf bY = a(true, true);
   public static final gmf.a bb = a("lines", ffq.g, ffx.c.a, 1536, gmf.b.a().a(ak).a(new gme.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gmf.a bc = a(
      "secondary_block_outline", ffq.g, ffx.c.a, 1536, gmf.b.a().a(ak).a(new gme.h(OptionalDouble.of(7.0))).a(aL).a(gme.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gmf.a bd = a(
      "line_strip", ffq.g, ffx.c.b, 1536, gmf.b.a().a(ak).a(new gme.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gmf.a> bZ = af.b(
      $$0 -> a("debug_line_strip", ffq.f, ffx.c.d, 1536, gmf.b.a().a(s).a(new gme.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gmf.a ca = a("debug_filled_box", ffq.f, ffx.c.f, 1536, false, true, gmf.b.a().a(s).a(aL).a(i).a(false));
   private static final gmf.a cb = a("debug_quads", ffq.f, ffx.c.h, 1536, false, true, gmf.b.a().a(s).a(i).a(aB).a(false));
   private static final gmf.a cc = a("debug_triangle_fan", ffq.f, ffx.c.g, 1536, false, true, gmf.b.a().a(s).a(i).a(aB).a(false));
   private static final gmf.a cd = a("debug_structure_quads", ffq.f, ffx.c.h, 1536, false, true, gmf.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gmf.a ce = a("debug_section_quads", ffq.f, ffx.c.h, 1536, false, true, gmf.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gmf cf = b(false);
   private static final gmf cg = b(true);
   private static final Function<aku, gmf> ch = af.b(
      $$0 -> a("opaque_particle", ffq.d, ffx.c.h, 1536, false, false, gmf.b.a().a(u).a(new gme.n($$0, bac.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<aku, gmf> ci = af.b(
      $$0 -> a("translucent_particle", ffq.d, ffx.c.h, 1536, false, false, gmf.b.a().a(u).a(new gme.n($$0, bac.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<aku, gmf> cj = c(true);
   private static final Function<aku, gmf> ck = c(false);
   private static final gmf cl = a("sky", ffq.e, ffx.c.h, 1536, false, false, gmf.b.a().a(p).a(aH).a(false));
   private static final gmf cm = a("end_sky", ffq.j, ffx.c.h, 1536, false, false, gmf.b.a().a(t).a(new gme.n(gmr.a, bac.b, false)).a(i).a(aH).a(false));
   private static final gmf cn = a("sunrise_sunset", ffq.f, ffx.c.g, 1536, false, false, gmf.b.a().a(s).a(i).a(aH).a(false));
   private static final gmf co = a("stars", ffq.e, ffx.c.h, 1536, false, false, gmf.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<aku, gmf> cp = af.b(
      $$0 -> a("celestial", ffq.j, ffx.c.h, 1536, false, false, gmf.b.a().a(t).a(new gme.n($$0, bac.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<aku, gmf> cq = af.b(
      $$0 -> a("block_screen_effect", ffq.j, ffx.c.h, 1536, false, false, gmf.b.a().a(t).a(new gme.n($$0, bac.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<aku, gmf> cr = af.b(
      $$0 -> a("fire_screen_effect", ffq.j, ffx.c.h, 1536, false, false, gmf.b.a().a(t).a(new gme.n($$0, bac.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gmf.a cs = a("gui", ffq.f, ffx.c.h, 786432, gmf.b.a().a(al).a(i).a(aE).a(false));
   private static final gmf.a ct = a("gui_overlay", ffq.f, ffx.c.h, 1536, gmf.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<aku, gmf> cu = af.b(
      $$0 -> a("gui_textured_overlay", ffq.j, ffx.c.h, 1536, gmf.b.a().a(new gme.n($$0, bac.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<aku, gmf> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", ffq.j, ffx.c.h, 786432, gmf.b.a().a(new gme.n($$0, bac.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gmf.a cw = a("gui_nausea_overlay", ffq.j, ffx.c.h, 1536, gmf.b.a().a(new gme.n(foa.a, bac.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gmf.a cx = a("gui_text_highlight", ffq.f, ffx.c.h, 1536, gmf.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gmf.a cy = a("gui_ghost_recipe_overlay", ffq.f, ffx.c.h, 1536, gmf.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<aku, gmf> cz = af.b(
      $$0 -> a("gui_textured", ffq.j, ffx.c.h, 786432, gmf.b.a().a(new gme.n($$0, bac.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<aku, gmf> cA = af.b(
      $$0 -> a("vignette", ffq.j, ffx.c.h, 786432, gmf.b.a().a(new gme.n($$0, bac.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<aku, gmf> cB = af.b(
      $$0 -> a("crosshair", ffq.j, ffx.c.h, 786432, gmf.b.a().a(new gme.n($$0, bac.b, false)).a(t).a(k).a(false))
   );
   private static final gmf.a cC = a("mojang_logo", ffq.j, ffx.c.h, 786432, gmf.b.a().a(new gme.n(fty.a, bac.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gmf> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final ffx cE;
   private final ffx.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gmf c() {
      return bf;
   }

   public static gmf d() {
      return bg;
   }

   public static gmf e() {
      return bh;
   }

   private static gmf.b a(gme.m $$0) {
      return gmf.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gmf f() {
      return bi;
   }

   private static gmf.b Z() {
      return gmf.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gmf g() {
      return bj;
   }

   private static gmf.a a(String $$0, aku $$1, boolean $$2) {
      gmf.b $$3 = gmf.b.a().a(A).a(new gme.n($$1, bac.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, ffq.c, ffx.c.h, 1536, true, false, $$3);
   }

   public static gmf a(aku $$0) {
      return bk.apply($$0);
   }

   public static gmf b(aku $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gmf c(aku $$0) {
      return bl.apply($$0);
   }

   public static gmf d(aku $$0) {
      return bm.apply($$0);
   }

   public static gmf e(aku $$0) {
      return bn.apply($$0);
   }

   public static gmf f(aku $$0) {
      return bo.apply($$0);
   }

   public static gmf a(aku $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gmf g(aku $$0) {
      return a($$0, true);
   }

   public static gmf b(aku $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gmf h(aku $$0) {
      return b($$0, true);
   }

   public static gmf i(aku $$0) {
      return br.apply($$0);
   }

   public static gmf c(aku $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gmf j(aku $$0) {
      return c($$0, true);
   }

   public static gmf d(aku $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gmf k(aku $$0) {
      return d($$0, true);
   }

   public static gmf l(aku $$0) {
      return bu.apply($$0);
   }

   public static gmf e(aku $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gmf m(aku $$0) {
      return bw.apply($$0);
   }

   public static gmf n(aku $$0) {
      return bx.apply($$0);
   }

   public static gmf o(aku $$0) {
      return by.apply($$0);
   }

   public static gmf p(aku $$0) {
      return bz.apply($$0);
   }

   public static gmf q(aku $$0) {
      return bA.apply($$0, i);
   }

   public static gmf r(aku $$0) {
      return bt.apply($$0, false);
   }

   public static gmf a(aku $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         ffq.c,
         ffx.c.h,
         1536,
         false,
         true,
         gmf.b.a().a(ap).a(new gme.n($$0, bac.b, false)).a(new gme.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gmf b(aku $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ffq.c,
         ffx.c.h,
         1536,
         false,
         true,
         gmf.b.a().a(Q).a(new gme.n($$0, bac.b, false)).a(new gme.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gmf h() {
      return bB;
   }

   public static gmf i() {
      return bC;
   }

   public static gmf s(aku $$0) {
      return gmf.a.be.apply($$0, aB);
   }

   public static gmf j() {
      return bD;
   }

   public static gmf k() {
      return bE;
   }

   public static gmf l() {
      return bF;
   }

   public static gmf m() {
      return bG;
   }

   public static gmf t(aku $$0) {
      return bH.apply($$0);
   }

   public static gmf u(aku $$0) {
      return bI.apply($$0);
   }

   public static gmf n() {
      return bJ;
   }

   public static gmf v(aku $$0) {
      return bK.apply($$0);
   }

   public static gmf w(aku $$0) {
      return bL.apply($$0);
   }

   public static gmf x(aku $$0) {
      return bM.apply($$0);
   }

   public static gmf y(aku $$0) {
      return bN.apply($$0);
   }

   public static gmf o() {
      return bO;
   }

   public static gmf z(aku $$0) {
      return bP.apply($$0);
   }

   public static gmf p() {
      return bQ;
   }

   public static gmf q() {
      return bR;
   }

   public static gmf r() {
      return bS;
   }

   private static gmf.b aa() {
      return gmf.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gmf s() {
      return bT;
   }

   public static gmf t() {
      return bU;
   }

   public static gmf u() {
      return bV;
   }

   private static gmf.a a(boolean $$0, boolean $$1) {
      return a("clouds", ffq.f, ffx.c.h, 786432, false, false, gmf.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gmf v() {
      return bW;
   }

   public static gmf w() {
      return bX;
   }

   public static gmf x() {
      return bY;
   }

   public static gmf y() {
      return bb;
   }

   public static gmf z() {
      return bc;
   }

   public static gmf A() {
      return bd;
   }

   public static gmf a(double $$0) {
      return bZ.apply($$0);
   }

   public static gmf B() {
      return ca;
   }

   public static gmf C() {
      return cb;
   }

   public static gmf D() {
      return cc;
   }

   public static gmf E() {
      return cd;
   }

   public static gmf F() {
      return ce;
   }

   private static gmf b(boolean $$0) {
      return a(
         "world_border",
         ffq.i,
         ffx.c.h,
         1536,
         false,
         false,
         gmf.b.a().a(q).a(new gme.n(gmx.a, bac.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gmf a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gmf A(aku $$0) {
      return ch.apply($$0);
   }

   public static gmf B(aku $$0) {
      return ci.apply($$0);
   }

   private static Function<aku, gmf> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", ffq.d, ffx.c.h, 1536, false, false, gmf.b.a().a(u).a(new gme.n($$1, bac.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gmf f(aku $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gmf G() {
      return cl;
   }

   public static gmf H() {
      return cm;
   }

   public static gmf I() {
      return cn;
   }

   public static gmf J() {
      return co;
   }

   public static gmf C(aku $$0) {
      return cp.apply($$0);
   }

   public static gmf D(aku $$0) {
      return cq.apply($$0);
   }

   public static gmf E(aku $$0) {
      return cr.apply($$0);
   }

   public static gmf K() {
      return cs;
   }

   public static gmf L() {
      return ct;
   }

   public static gmf F(aku $$0) {
      return cu.apply($$0);
   }

   public static gmf G(aku $$0) {
      return cv.apply($$0);
   }

   public static gmf M() {
      return cw;
   }

   public static gmf N() {
      return cx;
   }

   public static gmf O() {
      return cy;
   }

   public static gmf H(aku $$0) {
      return cz.apply($$0);
   }

   public static gmf I(aku $$0) {
      return cA.apply($$0);
   }

   public static gmf J(aku $$0) {
      return cB.apply($$0);
   }

   public static gmf P() {
      return cC;
   }

   public gmf(String $$0, ffx $$1, ffx.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gmf.a a(String $$0, ffx $$1, ffx.c $$2, int $$3, gmf.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gmf.a a(String $$0, ffx $$1, ffx.c $$2, int $$3, boolean $$4, boolean $$5, gmf.b $$6) {
      return new gmf.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ffr $$0) {
      this.a();
      ffo.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gmf> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public ffx S() {
      return this.cE;
   }

   public ffx.c T() {
      return this.cF;
   }

   public Optional<gmf> U() {
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

   static final class a extends gmf {
      static final BiFunction<aku, gme.c, gmf> be = af.a(
         ($$0, $$1) -> gmf.a("outline", ffq.j, ffx.c.h, 1536, gmf.b.a().a(T).a(new gme.n($$0, bac.b, false)).a($$1).a(aC).a(aP).a(gmf.c.b))
      );
      private final gmf.b bf;
      private final Optional<gmf> bg;
      private final boolean bh;

      a(String $$0, ffx $$1, ffx.c $$2, int $$3, boolean $$4, boolean $$5, gmf.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gme::a), () -> $$6.o.forEach(gme::b));
         this.bf = $$6;
         this.bg = $$6.n == gmf.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gmf.c.b;
      }

      @Override
      public Optional<gmf> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gmf.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gme.e a;
      private final gme.m b;
      private final gme.p c;
      private final gme.d d;
      final gme.c e;
      private final gme.g f;
      private final gme.l g;
      private final gme.f h;
      private final gme.k i;
      private final gme.o j;
      private final gme.q k;
      private final gme.h l;
      private final gme.b m;
      final gmf.c n;
      final ImmutableList<gme> o;

      b(
         gme.e $$0,
         gme.m $$1,
         gme.p $$2,
         gme.d $$3,
         gme.c $$4,
         gme.g $$5,
         gme.l $$6,
         gme.f $$7,
         gme.k $$8,
         gme.o $$9,
         gme.q $$10,
         gme.h $$11,
         gme.b $$12,
         gmf.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gme[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gmf.b.a a() {
         return new gmf.b.a();
      }

      public static class a {
         private gme.e a = gme.as;
         private gme.m b = gme.n;
         private gme.p c;
         private gme.d d;
         private gme.c e;
         private gme.g f;
         private gme.l g;
         private gme.f h;
         private gme.k i;
         private gme.o j;
         private gme.q k;
         private gme.h l;
         private gme.b m;

         a() {
            this.c = gme.c;
            this.d = gme.aE;
            this.e = gme.aA;
            this.f = gme.ax;
            this.g = gme.az;
            this.h = gme.aJ;
            this.i = gme.aO;
            this.j = gme.at;
            this.k = gme.aG;
            this.l = gme.aV;
            this.m = gme.aW;
         }

         public gmf.b.a a(gme.e $$0) {
            this.a = $$0;
            return this;
         }

         public gmf.b.a a(gme.m $$0) {
            this.b = $$0;
            return this;
         }

         public gmf.b.a a(gme.p $$0) {
            this.c = $$0;
            return this;
         }

         public gmf.b.a a(gme.d $$0) {
            this.d = $$0;
            return this;
         }

         public gmf.b.a a(gme.c $$0) {
            this.e = $$0;
            return this;
         }

         public gmf.b.a a(gme.g $$0) {
            this.f = $$0;
            return this;
         }

         public gmf.b.a a(gme.l $$0) {
            this.g = $$0;
            return this;
         }

         public gmf.b.a a(gme.f $$0) {
            this.h = $$0;
            return this;
         }

         public gmf.b.a a(gme.k $$0) {
            this.i = $$0;
            return this;
         }

         public gmf.b.a a(gme.o $$0) {
            this.j = $$0;
            return this;
         }

         public gmf.b.a a(gme.q $$0) {
            this.k = $$0;
            return this;
         }

         public gmf.b.a a(gme.h $$0) {
            this.l = $$0;
            return this;
         }

         public gmf.b.a a(gme.b $$0) {
            this.m = $$0;
            return this;
         }

         public gmf.b a(boolean $$0) {
            return this.a($$0 ? gmf.c.c : gmf.c.a);
         }

         public gmf.b a(gmf.c $$0) {
            return new gmf.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
