import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class goi extends goh {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final goi bf = a("solid", fhm.b, fht.c.h, 4194304, true, false, goi.b.a().a(aw).a(v).a(aq).a(true));
   private static final goi bg = a("cutout_mipped", fhm.b, fht.c.h, 4194304, true, false, goi.b.a().a(aw).a(w).a(aq).a(true));
   private static final goi bh = a("cutout", fhm.b, fht.c.h, 786432, true, false, goi.b.a().a(aw).a(x).a(ar).a(true));
   private static final goi bi = a("translucent", fhm.b, fht.c.h, 786432, true, true, a(y));
   private static final goi bj = a("translucent_moving_block", fhm.b, fht.c.h, 786432, false, true, Z());
   private static final Function<ald, goi> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ald, goi> bl = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(B).a(new goh.n($$0, bao.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fhm.c, fht.c.h, 1536, true, true, $$1);
   });
   private static final Function<ald, goi> bm = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(C).a(new goh.n($$0, bao.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fhm.c, fht.c.h, 1536, true, false, $$1);
   });
   private static final Function<ald, goi> bn = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(C).a(new goh.n($$0, bao.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fhm.c, fht.c.h, 1536, true, false, $$1);
   });
   private static final Function<ald, goi> bo = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(D).a(new goh.n($$0, bao.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fhm.c, fht.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ald, Boolean, goi> bp = af.a(($$0, $$1) -> {
      goi.b $$2 = goi.b.a().a(E).a(new goh.n($$0, bao.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fhm.c, fht.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ald, Boolean, goi> bq = af.a(($$0, $$1) -> {
      goi.b $$2 = goi.b.a().a(F).a(new goh.n($$0, bao.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fhm.c, fht.c.h, 1536, true, false, $$2);
   });
   private static final Function<ald, goi> br = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(G).a(new goh.n($$0, bao.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fhm.c, fht.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ald, Boolean, goi> bs = af.a(($$0, $$1) -> {
      goi.b $$2 = goi.b.a().a(H).a(new goh.n($$0, bao.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fhm.c, fht.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ald, Boolean, goi> bt = af.a(($$0, $$1) -> {
      goi.b $$2 = goi.b.a().a(I).a(new goh.n($$0, bao.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fhm.c, fht.c.h, 1536, true, true, $$2);
   });
   private static final Function<ald, goi> bu = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(J).a(new goh.n($$0, bao.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fhm.c, fht.c.h, 1536, $$1);
   });
   private static final BiFunction<ald, Boolean, goi> bv = af.a(($$0, $$1) -> {
      goi.b $$2 = goi.b.a().a(K).a(new goh.n($$0, bao.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fhm.b, fht.c.h, 1536, false, true, $$2);
   });
   private static final Function<ald, goi> bw = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(L).a(new goh.n($$0, bao.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fhm.c, fht.c.h, 1536, $$1);
   });
   private static final Function<ald, goi> bx = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(M).a(new goh.n($$0, bao.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fhm.c, fht.c.h, 1536, false, true, $$1);
   });
   private static final Function<ald, goi> by = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(N).a(new goh.n($$0, bao.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fhm.c, fht.c.h, 1536, false, false, $$1);
   });
   private static final Function<ald, goi> bz = af.b($$0 -> {
      goi.b $$1 = goi.b.a().a(O).a(new goh.n($$0, bao.b, false)).a(aB).a(true);
      return a("entity_alpha", fhm.c, fht.c.h, 1536, $$1);
   });
   private static final BiFunction<ald, goh.p, goi> bA = af.a(($$0, $$1) -> {
      goh.n $$2 = new goh.n($$0, bao.b, false);
      return a("eyes", fhm.c, fht.c.h, 1536, false, true, goi.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final goi bB = a("leash", fhm.h, fht.c.f, 1536, goi.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final goi bC = a("water_mask", fhm.e, fht.c.h, 1536, goi.b.a().a(S).a(as).a(aI).a(false));
   private static final goi bD = a(
      "armor_entity_glint", fhm.i, fht.c.h, 1536, goi.b.a().a(U).a(new goh.n(gvd.a, bao.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final goi bE = a(
      "glint_translucent", fhm.i, fht.c.h, 1536, goi.b.a().a(V).a(new goh.n(gvd.b, bao.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final goi bF = a("glint", fhm.i, fht.c.h, 1536, goi.b.a().a(W).a(new goh.n(gvd.b, bao.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final goi bG = a("entity_glint", fhm.i, fht.c.h, 1536, goi.b.a().a(X).a(new goh.n(gvd.a, bao.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<ald, goi> bH = af.b($$0 -> {
      goh.n $$1 = new goh.n($$0, bao.b, false);
      return a("crumbling", fhm.b, fht.c.h, 1536, false, true, goi.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<ald, goi> bI = af.b(
      $$0 -> a("text", fhm.k, fht.c.h, 786432, false, false, goi.b.a().a(Z).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(false))
   );
   private static final goi bJ = a("text_background", fhm.h, fht.c.h, 1536, false, true, goi.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<ald, goi> bK = af.b(
      $$0 -> a("text_intensity", fhm.k, fht.c.h, 786432, false, false, goi.b.a().a(ab).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<ald, goi> bL = af.b(
      $$0 -> a("text_polygon_offset", fhm.k, fht.c.h, 1536, false, true, goi.b.a().a(Z).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<ald, goi> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", fhm.k, fht.c.h, 1536, false, true, goi.b.a().a(ab).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<ald, goi> bN = af.b(
      $$0 -> a("text_see_through", fhm.k, fht.c.h, 1536, false, false, goi.b.a().a(ac).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final goi bO = a("text_background_see_through", fhm.h, fht.c.h, 1536, false, true, goi.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<ald, goi> bP = af.b(
      $$0 -> a("text_intensity_see_through", fhm.k, fht.c.h, 1536, false, true, goi.b.a().a(ae).a(new goh.n($$0, bao.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final goi bQ = a("lightning", fhm.f, fht.c.h, 1536, false, true, goi.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final goi bR = a("dragon_rays", fhm.f, fht.c.e, 1536, false, false, goi.b.a().a(af).a(aH).a(e).a(false));
   private static final goi bS = a("dragon_rays_depth", fhm.e, fht.c.e, 1536, false, false, goi.b.a().a(p).a(aI).a(false));
   private static final goi bT = a("tripwire", fhm.b, fht.c.h, 1536, true, true, aa());
   private static final goi bU = a(
      "end_portal", fhm.e, fht.c.h, 1536, false, false, goi.b.a().a(ah).a(goh.i.d().a(gre.a, false, false).a(gre.b, false, false).a()).a(false)
   );
   private static final goi bV = a(
      "end_gateway", fhm.e, fht.c.h, 1536, false, false, goi.b.a().a(ai).a(goh.i.d().a(gre.a, false, false).a(gre.b, false, false).a()).a(false)
   );
   private static final goi bW = a(false, false);
   private static final goi bX = a(false, true);
   private static final goi bY = a(true, true);
   public static final goi.a bb = a("lines", fhm.g, fht.c.a, 1536, goi.b.a().a(ak).a(new goh.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final goi.a bc = a(
      "secondary_block_outline", fhm.g, fht.c.a, 1536, goi.b.a().a(ak).a(new goh.h(OptionalDouble.of(7.0))).a(aL).a(goh.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final goi.a bd = a(
      "line_strip", fhm.g, fht.c.b, 1536, goi.b.a().a(ak).a(new goh.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, goi.a> bZ = af.b(
      $$0 -> a("debug_line_strip", fhm.f, fht.c.d, 1536, goi.b.a().a(s).a(new goh.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final goi.a ca = a("debug_filled_box", fhm.f, fht.c.f, 1536, false, true, goi.b.a().a(s).a(aL).a(i).a(false));
   private static final goi.a cb = a("debug_quads", fhm.f, fht.c.h, 1536, false, true, goi.b.a().a(s).a(i).a(aB).a(false));
   private static final goi.a cc = a("debug_triangle_fan", fhm.f, fht.c.g, 1536, false, true, goi.b.a().a(s).a(i).a(aB).a(false));
   private static final goi.a cd = a("debug_structure_quads", fhm.f, fht.c.h, 1536, false, true, goi.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final goi.a ce = a("debug_section_quads", fhm.f, fht.c.h, 1536, false, true, goi.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final goi cf = b(false);
   private static final goi cg = b(true);
   private static final Function<ald, goi> ch = af.b(
      $$0 -> a("opaque_particle", fhm.d, fht.c.h, 1536, false, false, goi.b.a().a(u).a(new goh.n($$0, bao.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<ald, goi> ci = af.b(
      $$0 -> a("translucent_particle", fhm.d, fht.c.h, 1536, false, false, goi.b.a().a(u).a(new goh.n($$0, bao.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<ald, goi> cj = c(true);
   private static final Function<ald, goi> ck = c(false);
   private static final goi cl = a("sky", fhm.e, fht.c.h, 1536, false, false, goi.b.a().a(p).a(aH).a(false));
   private static final goi cm = a("end_sky", fhm.j, fht.c.h, 1536, false, false, goi.b.a().a(t).a(new goh.n(gou.a, bao.b, false)).a(i).a(aH).a(false));
   private static final goi cn = a("sunrise_sunset", fhm.f, fht.c.g, 1536, false, false, goi.b.a().a(s).a(i).a(aH).a(false));
   private static final goi co = a("stars", fhm.e, fht.c.h, 1536, false, false, goi.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<ald, goi> cp = af.b(
      $$0 -> a("celestial", fhm.j, fht.c.h, 1536, false, false, goi.b.a().a(t).a(new goh.n($$0, bao.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<ald, goi> cq = af.b(
      $$0 -> a("block_screen_effect", fhm.j, fht.c.h, 1536, false, false, goi.b.a().a(t).a(new goh.n($$0, bao.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<ald, goi> cr = af.b(
      $$0 -> a("fire_screen_effect", fhm.j, fht.c.h, 1536, false, false, goi.b.a().a(t).a(new goh.n($$0, bao.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final goi.a cs = a("gui", fhm.f, fht.c.h, 786432, goi.b.a().a(al).a(i).a(aE).a(false));
   private static final goi.a ct = a("gui_overlay", fhm.f, fht.c.h, 1536, goi.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<ald, goi> cu = af.b(
      $$0 -> a("gui_textured_overlay", fhm.j, fht.c.h, 1536, goi.b.a().a(new goh.n($$0, bao.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<ald, goi> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fhm.j, fht.c.h, 786432, goi.b.a().a(new goh.n($$0, bao.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final goi.a cw = a("gui_nausea_overlay", fhm.j, fht.c.h, 1536, goi.b.a().a(new goh.n(fpy.a, bao.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final goi.a cx = a("gui_text_highlight", fhm.f, fht.c.h, 1536, goi.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final goi.a cy = a("gui_ghost_recipe_overlay", fhm.f, fht.c.h, 1536, goi.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<ald, goi> cz = af.b(
      $$0 -> a("gui_textured", fhm.j, fht.c.h, 786432, goi.b.a().a(new goh.n($$0, bao.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<ald, goi> cA = af.b(
      $$0 -> a("vignette", fhm.j, fht.c.h, 786432, goi.b.a().a(new goh.n($$0, bao.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<ald, goi> cB = af.b(
      $$0 -> a("crosshair", fhm.j, fht.c.h, 786432, goi.b.a().a(new goh.n($$0, bao.b, false)).a(t).a(k).a(false))
   );
   private static final goi.a cC = a("mojang_logo", fhm.j, fht.c.h, 786432, goi.b.a().a(new goh.n(fvv.a, bao.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<goi> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fht cE;
   private final fht.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static goi c() {
      return bf;
   }

   public static goi d() {
      return bg;
   }

   public static goi e() {
      return bh;
   }

   private static goi.b a(goh.m $$0) {
      return goi.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static goi f() {
      return bi;
   }

   private static goi.b Z() {
      return goi.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static goi g() {
      return bj;
   }

   private static goi.a a(String $$0, ald $$1, boolean $$2) {
      goi.b $$3 = goi.b.a().a(A).a(new goh.n($$1, bao.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fhm.c, fht.c.h, 1536, true, false, $$3);
   }

   public static goi a(ald $$0) {
      return bk.apply($$0);
   }

   public static goi b(ald $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static goi c(ald $$0) {
      return bl.apply($$0);
   }

   public static goi d(ald $$0) {
      return bm.apply($$0);
   }

   public static goi e(ald $$0) {
      return bn.apply($$0);
   }

   public static goi f(ald $$0) {
      return bo.apply($$0);
   }

   public static goi a(ald $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static goi g(ald $$0) {
      return a($$0, true);
   }

   public static goi b(ald $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static goi h(ald $$0) {
      return b($$0, true);
   }

   public static goi i(ald $$0) {
      return br.apply($$0);
   }

   public static goi c(ald $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static goi j(ald $$0) {
      return c($$0, true);
   }

   public static goi d(ald $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static goi k(ald $$0) {
      return d($$0, true);
   }

   public static goi l(ald $$0) {
      return bu.apply($$0);
   }

   public static goi e(ald $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static goi m(ald $$0) {
      return bw.apply($$0);
   }

   public static goi n(ald $$0) {
      return bx.apply($$0);
   }

   public static goi o(ald $$0) {
      return by.apply($$0);
   }

   public static goi p(ald $$0) {
      return bz.apply($$0);
   }

   public static goi q(ald $$0) {
      return bA.apply($$0, i);
   }

   public static goi r(ald $$0) {
      return bt.apply($$0, false);
   }

   public static goi a(ald $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fhm.c,
         fht.c.h,
         1536,
         false,
         true,
         goi.b.a().a(ap).a(new goh.n($$0, bao.b, false)).a(new goh.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static goi b(ald $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fhm.c,
         fht.c.h,
         1536,
         false,
         true,
         goi.b.a().a(Q).a(new goh.n($$0, bao.b, false)).a(new goh.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static goi h() {
      return bB;
   }

   public static goi i() {
      return bC;
   }

   public static goi s(ald $$0) {
      return goi.a.be.apply($$0, aB);
   }

   public static goi j() {
      return bD;
   }

   public static goi k() {
      return bE;
   }

   public static goi l() {
      return bF;
   }

   public static goi m() {
      return bG;
   }

   public static goi t(ald $$0) {
      return bH.apply($$0);
   }

   public static goi u(ald $$0) {
      return bI.apply($$0);
   }

   public static goi n() {
      return bJ;
   }

   public static goi v(ald $$0) {
      return bK.apply($$0);
   }

   public static goi w(ald $$0) {
      return bL.apply($$0);
   }

   public static goi x(ald $$0) {
      return bM.apply($$0);
   }

   public static goi y(ald $$0) {
      return bN.apply($$0);
   }

   public static goi o() {
      return bO;
   }

   public static goi z(ald $$0) {
      return bP.apply($$0);
   }

   public static goi p() {
      return bQ;
   }

   public static goi q() {
      return bR;
   }

   public static goi r() {
      return bS;
   }

   private static goi.b aa() {
      return goi.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static goi s() {
      return bT;
   }

   public static goi t() {
      return bU;
   }

   public static goi u() {
      return bV;
   }

   private static goi.a a(boolean $$0, boolean $$1) {
      return a("clouds", fhm.f, fht.c.h, 786432, false, false, goi.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static goi v() {
      return bW;
   }

   public static goi w() {
      return bX;
   }

   public static goi x() {
      return bY;
   }

   public static goi y() {
      return bb;
   }

   public static goi z() {
      return bc;
   }

   public static goi A() {
      return bd;
   }

   public static goi a(double $$0) {
      return bZ.apply($$0);
   }

   public static goi B() {
      return ca;
   }

   public static goi C() {
      return cb;
   }

   public static goi D() {
      return cc;
   }

   public static goi E() {
      return cd;
   }

   public static goi F() {
      return ce;
   }

   private static goi b(boolean $$0) {
      return a(
         "world_border",
         fhm.i,
         fht.c.h,
         1536,
         false,
         false,
         goi.b.a().a(q).a(new goh.n(gpa.a, bao.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static goi a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static goi A(ald $$0) {
      return ch.apply($$0);
   }

   public static goi B(ald $$0) {
      return ci.apply($$0);
   }

   private static Function<ald, goi> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fhm.d, fht.c.h, 1536, false, false, goi.b.a().a(u).a(new goh.n($$1, bao.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static goi f(ald $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static goi G() {
      return cl;
   }

   public static goi H() {
      return cm;
   }

   public static goi I() {
      return cn;
   }

   public static goi J() {
      return co;
   }

   public static goi C(ald $$0) {
      return cp.apply($$0);
   }

   public static goi D(ald $$0) {
      return cq.apply($$0);
   }

   public static goi E(ald $$0) {
      return cr.apply($$0);
   }

   public static goi K() {
      return cs;
   }

   public static goi L() {
      return ct;
   }

   public static goi F(ald $$0) {
      return cu.apply($$0);
   }

   public static goi G(ald $$0) {
      return cv.apply($$0);
   }

   public static goi M() {
      return cw;
   }

   public static goi N() {
      return cx;
   }

   public static goi O() {
      return cy;
   }

   public static goi H(ald $$0) {
      return cz.apply($$0);
   }

   public static goi I(ald $$0) {
      return cA.apply($$0);
   }

   public static goi J(ald $$0) {
      return cB.apply($$0);
   }

   public static goi P() {
      return cC;
   }

   public goi(String $$0, fht $$1, fht.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static goi.a a(String $$0, fht $$1, fht.c $$2, int $$3, goi.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static goi.a a(String $$0, fht $$1, fht.c $$2, int $$3, boolean $$4, boolean $$5, goi.b $$6) {
      return new goi.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fhn $$0) {
      this.a();
      fhk.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<goi> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fht S() {
      return this.cE;
   }

   public fht.c T() {
      return this.cF;
   }

   public Optional<goi> U() {
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

   static final class a extends goi {
      static final BiFunction<ald, goh.c, goi> be = af.a(
         ($$0, $$1) -> goi.a("outline", fhm.j, fht.c.h, 1536, goi.b.a().a(T).a(new goh.n($$0, bao.b, false)).a($$1).a(aC).a(aP).a(goi.c.b))
      );
      private final goi.b bf;
      private final Optional<goi> bg;
      private final boolean bh;

      a(String $$0, fht $$1, fht.c $$2, int $$3, boolean $$4, boolean $$5, goi.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(goh::a), () -> $$6.o.forEach(goh::b));
         this.bf = $$6;
         this.bg = $$6.n == goi.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == goi.c.b;
      }

      @Override
      public Optional<goi> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final goi.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final goh.e a;
      private final goh.m b;
      private final goh.p c;
      private final goh.d d;
      final goh.c e;
      private final goh.g f;
      private final goh.l g;
      private final goh.f h;
      private final goh.k i;
      private final goh.o j;
      private final goh.q k;
      private final goh.h l;
      private final goh.b m;
      final goi.c n;
      final ImmutableList<goh> o;

      b(
         goh.e $$0,
         goh.m $$1,
         goh.p $$2,
         goh.d $$3,
         goh.c $$4,
         goh.g $$5,
         goh.l $$6,
         goh.f $$7,
         goh.k $$8,
         goh.o $$9,
         goh.q $$10,
         goh.h $$11,
         goh.b $$12,
         goi.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new goh[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static goi.b.a a() {
         return new goi.b.a();
      }

      public static class a {
         private goh.e a = goh.as;
         private goh.m b = goh.n;
         private goh.p c;
         private goh.d d;
         private goh.c e;
         private goh.g f;
         private goh.l g;
         private goh.f h;
         private goh.k i;
         private goh.o j;
         private goh.q k;
         private goh.h l;
         private goh.b m;

         a() {
            this.c = goh.c;
            this.d = goh.aE;
            this.e = goh.aA;
            this.f = goh.ax;
            this.g = goh.az;
            this.h = goh.aJ;
            this.i = goh.aO;
            this.j = goh.at;
            this.k = goh.aG;
            this.l = goh.aV;
            this.m = goh.aW;
         }

         public goi.b.a a(goh.e $$0) {
            this.a = $$0;
            return this;
         }

         public goi.b.a a(goh.m $$0) {
            this.b = $$0;
            return this;
         }

         public goi.b.a a(goh.p $$0) {
            this.c = $$0;
            return this;
         }

         public goi.b.a a(goh.d $$0) {
            this.d = $$0;
            return this;
         }

         public goi.b.a a(goh.c $$0) {
            this.e = $$0;
            return this;
         }

         public goi.b.a a(goh.g $$0) {
            this.f = $$0;
            return this;
         }

         public goi.b.a a(goh.l $$0) {
            this.g = $$0;
            return this;
         }

         public goi.b.a a(goh.f $$0) {
            this.h = $$0;
            return this;
         }

         public goi.b.a a(goh.k $$0) {
            this.i = $$0;
            return this;
         }

         public goi.b.a a(goh.o $$0) {
            this.j = $$0;
            return this;
         }

         public goi.b.a a(goh.q $$0) {
            this.k = $$0;
            return this;
         }

         public goi.b.a a(goh.h $$0) {
            this.l = $$0;
            return this;
         }

         public goi.b.a a(goh.b $$0) {
            this.m = $$0;
            return this;
         }

         public goi.b a(boolean $$0) {
            return this.a($$0 ? goi.c.c : goi.c.a);
         }

         public goi.b a(goi.c $$0) {
            return new goi.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
