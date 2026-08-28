import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gqc extends gqb {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gqc bf = a("solid", fja.b, fjh.c.h, 4194304, true, false, gqc.b.a().a(aw).a(v).a(aq).a(true));
   private static final gqc bg = a("cutout_mipped", fja.b, fjh.c.h, 4194304, true, false, gqc.b.a().a(aw).a(w).a(aq).a(true));
   private static final gqc bh = a("cutout", fja.b, fjh.c.h, 786432, true, false, gqc.b.a().a(aw).a(x).a(ar).a(true));
   private static final gqc bi = a("translucent", fja.b, fjh.c.h, 786432, true, true, a(y));
   private static final gqc bj = a("translucent_moving_block", fja.b, fjh.c.h, 786432, false, true, Z());
   private static final Function<alg, gqc> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alg, gqc> bl = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(B).a(new gqb.n($$0, bas.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fja.c, fjh.c.h, 1536, true, true, $$1);
   });
   private static final Function<alg, gqc> bm = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(C).a(new gqb.n($$0, bas.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fja.c, fjh.c.h, 1536, true, false, $$1);
   });
   private static final Function<alg, gqc> bn = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(C).a(new gqb.n($$0, bas.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fja.c, fjh.c.h, 1536, true, false, $$1);
   });
   private static final Function<alg, gqc> bo = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(D).a(new gqb.n($$0, bas.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fja.c, fjh.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alg, Boolean, gqc> bp = af.a(($$0, $$1) -> {
      gqc.b $$2 = gqc.b.a().a(E).a(new gqb.n($$0, bas.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fja.c, fjh.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alg, Boolean, gqc> bq = af.a(($$0, $$1) -> {
      gqc.b $$2 = gqc.b.a().a(F).a(new gqb.n($$0, bas.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fja.c, fjh.c.h, 1536, true, false, $$2);
   });
   private static final Function<alg, gqc> br = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(G).a(new gqb.n($$0, bas.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fja.c, fjh.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alg, Boolean, gqc> bs = af.a(($$0, $$1) -> {
      gqc.b $$2 = gqc.b.a().a(H).a(new gqb.n($$0, bas.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fja.c, fjh.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alg, Boolean, gqc> bt = af.a(($$0, $$1) -> {
      gqc.b $$2 = gqc.b.a().a(I).a(new gqb.n($$0, bas.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fja.c, fjh.c.h, 1536, true, true, $$2);
   });
   private static final Function<alg, gqc> bu = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(J).a(new gqb.n($$0, bas.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fja.c, fjh.c.h, 1536, $$1);
   });
   private static final BiFunction<alg, Boolean, gqc> bv = af.a(($$0, $$1) -> {
      gqc.b $$2 = gqc.b.a().a(K).a(new gqb.n($$0, bas.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fja.b, fjh.c.h, 1536, false, true, $$2);
   });
   private static final Function<alg, gqc> bw = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(L).a(new gqb.n($$0, bas.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fja.c, fjh.c.h, 1536, $$1);
   });
   private static final Function<alg, gqc> bx = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(M).a(new gqb.n($$0, bas.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fja.c, fjh.c.h, 1536, false, true, $$1);
   });
   private static final Function<alg, gqc> by = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(N).a(new gqb.n($$0, bas.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fja.c, fjh.c.h, 1536, false, false, $$1);
   });
   private static final Function<alg, gqc> bz = af.b($$0 -> {
      gqc.b $$1 = gqc.b.a().a(O).a(new gqb.n($$0, bas.b, false)).a(aB).a(true);
      return a("entity_alpha", fja.c, fjh.c.h, 1536, $$1);
   });
   private static final BiFunction<alg, gqb.p, gqc> bA = af.a(($$0, $$1) -> {
      gqb.n $$2 = new gqb.n($$0, bas.b, false);
      return a("eyes", fja.c, fjh.c.h, 1536, false, true, gqc.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gqc bB = a("leash", fja.h, fjh.c.f, 1536, gqc.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gqc bC = a("water_mask", fja.e, fjh.c.h, 1536, gqc.b.a().a(S).a(as).a(aI).a(false));
   private static final gqc bD = a(
      "armor_entity_glint", fja.i, fjh.c.h, 1536, gqc.b.a().a(U).a(new gqb.n(gwx.a, bas.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gqc bE = a(
      "glint_translucent", fja.i, fjh.c.h, 1536, gqc.b.a().a(V).a(new gqb.n(gwx.b, bas.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gqc bF = a("glint", fja.i, fjh.c.h, 1536, gqc.b.a().a(W).a(new gqb.n(gwx.b, bas.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gqc bG = a("entity_glint", fja.i, fjh.c.h, 1536, gqc.b.a().a(X).a(new gqb.n(gwx.a, bas.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<alg, gqc> bH = af.b($$0 -> {
      gqb.n $$1 = new gqb.n($$0, bas.b, false);
      return a("crumbling", fja.b, fjh.c.h, 1536, false, true, gqc.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<alg, gqc> bI = af.b(
      $$0 -> a("text", fja.k, fjh.c.h, 786432, false, false, gqc.b.a().a(Z).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(false))
   );
   private static final gqc bJ = a("text_background", fja.h, fjh.c.h, 1536, false, true, gqc.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<alg, gqc> bK = af.b(
      $$0 -> a("text_intensity", fja.k, fjh.c.h, 786432, false, false, gqc.b.a().a(ab).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<alg, gqc> bL = af.b(
      $$0 -> a("text_polygon_offset", fja.k, fjh.c.h, 1536, false, true, gqc.b.a().a(Z).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<alg, gqc> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", fja.k, fjh.c.h, 1536, false, true, gqc.b.a().a(ab).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<alg, gqc> bN = af.b(
      $$0 -> a("text_see_through", fja.k, fjh.c.h, 1536, false, false, gqc.b.a().a(ac).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gqc bO = a("text_background_see_through", fja.h, fjh.c.h, 1536, false, true, gqc.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<alg, gqc> bP = af.b(
      $$0 -> a("text_intensity_see_through", fja.k, fjh.c.h, 1536, false, true, gqc.b.a().a(ae).a(new gqb.n($$0, bas.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gqc bQ = a("lightning", fja.f, fjh.c.h, 1536, false, true, gqc.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gqc bR = a("dragon_rays", fja.f, fjh.c.e, 1536, false, false, gqc.b.a().a(af).a(aH).a(e).a(false));
   private static final gqc bS = a("dragon_rays_depth", fja.e, fjh.c.e, 1536, false, false, gqc.b.a().a(p).a(aI).a(false));
   private static final gqc bT = a("tripwire", fja.b, fjh.c.h, 1536, true, true, aa());
   private static final gqc bU = a(
      "end_portal", fja.e, fjh.c.h, 1536, false, false, gqc.b.a().a(ah).a(gqb.i.d().a(gsy.a, false, false).a(gsy.b, false, false).a()).a(false)
   );
   private static final gqc bV = a(
      "end_gateway", fja.e, fjh.c.h, 1536, false, false, gqc.b.a().a(ai).a(gqb.i.d().a(gsy.a, false, false).a(gsy.b, false, false).a()).a(false)
   );
   private static final gqc bW = a(false, false);
   private static final gqc bX = a(false, true);
   private static final gqc bY = a(true, true);
   public static final gqc.a bb = a("lines", fja.g, fjh.c.a, 1536, gqc.b.a().a(ak).a(new gqb.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gqc.a bc = a(
      "secondary_block_outline", fja.g, fjh.c.a, 1536, gqc.b.a().a(ak).a(new gqb.h(OptionalDouble.of(7.0))).a(aL).a(gqb.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gqc.a bd = a(
      "line_strip", fja.g, fjh.c.b, 1536, gqc.b.a().a(ak).a(new gqb.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gqc.a> bZ = af.b(
      $$0 -> a("debug_line_strip", fja.f, fjh.c.d, 1536, gqc.b.a().a(s).a(new gqb.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gqc.a ca = a("debug_filled_box", fja.f, fjh.c.f, 1536, false, true, gqc.b.a().a(s).a(aL).a(i).a(false));
   private static final gqc.a cb = a("debug_quads", fja.f, fjh.c.h, 1536, false, true, gqc.b.a().a(s).a(i).a(aB).a(false));
   private static final gqc.a cc = a("debug_triangle_fan", fja.f, fjh.c.g, 1536, false, true, gqc.b.a().a(s).a(i).a(aB).a(false));
   private static final gqc.a cd = a("debug_structure_quads", fja.f, fjh.c.h, 1536, false, true, gqc.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gqc.a ce = a("debug_section_quads", fja.f, fjh.c.h, 1536, false, true, gqc.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gqc cf = b(false);
   private static final gqc cg = b(true);
   private static final Function<alg, gqc> ch = af.b(
      $$0 -> a("opaque_particle", fja.d, fjh.c.h, 1536, false, false, gqc.b.a().a(u).a(new gqb.n($$0, bas.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<alg, gqc> ci = af.b(
      $$0 -> a("translucent_particle", fja.d, fjh.c.h, 1536, false, false, gqc.b.a().a(u).a(new gqb.n($$0, bas.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<alg, gqc> cj = c(true);
   private static final Function<alg, gqc> ck = c(false);
   private static final gqc cl = a("sky", fja.e, fjh.c.h, 1536, false, false, gqc.b.a().a(p).a(aH).a(false));
   private static final gqc cm = a("end_sky", fja.j, fjh.c.h, 1536, false, false, gqc.b.a().a(t).a(new gqb.n(gqo.a, bas.b, false)).a(i).a(aH).a(false));
   private static final gqc cn = a("sunrise_sunset", fja.f, fjh.c.g, 1536, false, false, gqc.b.a().a(s).a(i).a(aH).a(false));
   private static final gqc co = a("stars", fja.e, fjh.c.h, 1536, false, false, gqc.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<alg, gqc> cp = af.b(
      $$0 -> a("celestial", fja.j, fjh.c.h, 1536, false, false, gqc.b.a().a(t).a(new gqb.n($$0, bas.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<alg, gqc> cq = af.b(
      $$0 -> a("block_screen_effect", fja.j, fjh.c.h, 1536, false, false, gqc.b.a().a(t).a(new gqb.n($$0, bas.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<alg, gqc> cr = af.b(
      $$0 -> a("fire_screen_effect", fja.j, fjh.c.h, 1536, false, false, gqc.b.a().a(t).a(new gqb.n($$0, bas.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gqc.a cs = a("gui", fja.f, fjh.c.h, 786432, gqc.b.a().a(al).a(i).a(aE).a(false));
   private static final gqc.a ct = a("gui_overlay", fja.f, fjh.c.h, 1536, gqc.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<alg, gqc> cu = af.b(
      $$0 -> a("gui_textured_overlay", fja.j, fjh.c.h, 1536, gqc.b.a().a(new gqb.n($$0, bas.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<alg, gqc> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fja.j, fjh.c.h, 786432, gqc.b.a().a(new gqb.n($$0, bas.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gqc.a cw = a("gui_nausea_overlay", fja.j, fjh.c.h, 1536, gqc.b.a().a(new gqb.n(frn.a, bas.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gqc.a cx = a("gui_text_highlight", fja.f, fjh.c.h, 1536, gqc.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gqc.a cy = a("gui_ghost_recipe_overlay", fja.f, fjh.c.h, 1536, gqc.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<alg, gqc> cz = af.b(
      $$0 -> a("gui_textured", fja.j, fjh.c.h, 786432, gqc.b.a().a(new gqb.n($$0, bas.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<alg, gqc> cA = af.b(
      $$0 -> a("vignette", fja.j, fjh.c.h, 786432, gqc.b.a().a(new gqb.n($$0, bas.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<alg, gqc> cB = af.b(
      $$0 -> a("crosshair", fja.j, fjh.c.h, 786432, gqc.b.a().a(new gqb.n($$0, bas.b, false)).a(t).a(k).a(false))
   );
   private static final gqc.a cC = a("mojang_logo", fja.j, fjh.c.h, 786432, gqc.b.a().a(new gqb.n(fxk.a, bas.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gqc> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fjh cE;
   private final fjh.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gqc c() {
      return bf;
   }

   public static gqc d() {
      return bg;
   }

   public static gqc e() {
      return bh;
   }

   private static gqc.b a(gqb.m $$0) {
      return gqc.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gqc f() {
      return bi;
   }

   private static gqc.b Z() {
      return gqc.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gqc g() {
      return bj;
   }

   private static gqc.a a(String $$0, alg $$1, boolean $$2) {
      gqc.b $$3 = gqc.b.a().a(A).a(new gqb.n($$1, bas.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fja.c, fjh.c.h, 1536, true, false, $$3);
   }

   public static gqc a(alg $$0) {
      return bk.apply($$0);
   }

   public static gqc b(alg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gqc c(alg $$0) {
      return bl.apply($$0);
   }

   public static gqc d(alg $$0) {
      return bm.apply($$0);
   }

   public static gqc e(alg $$0) {
      return bn.apply($$0);
   }

   public static gqc f(alg $$0) {
      return bo.apply($$0);
   }

   public static gqc a(alg $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gqc g(alg $$0) {
      return a($$0, true);
   }

   public static gqc b(alg $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gqc h(alg $$0) {
      return b($$0, true);
   }

   public static gqc i(alg $$0) {
      return br.apply($$0);
   }

   public static gqc c(alg $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gqc j(alg $$0) {
      return c($$0, true);
   }

   public static gqc d(alg $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gqc k(alg $$0) {
      return d($$0, true);
   }

   public static gqc l(alg $$0) {
      return bu.apply($$0);
   }

   public static gqc e(alg $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gqc m(alg $$0) {
      return bw.apply($$0);
   }

   public static gqc n(alg $$0) {
      return bx.apply($$0);
   }

   public static gqc o(alg $$0) {
      return by.apply($$0);
   }

   public static gqc p(alg $$0) {
      return bz.apply($$0);
   }

   public static gqc q(alg $$0) {
      return bA.apply($$0, i);
   }

   public static gqc r(alg $$0) {
      return bt.apply($$0, false);
   }

   public static gqc a(alg $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fja.c,
         fjh.c.h,
         1536,
         false,
         true,
         gqc.b.a().a(ap).a(new gqb.n($$0, bas.b, false)).a(new gqb.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gqc b(alg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fja.c,
         fjh.c.h,
         1536,
         false,
         true,
         gqc.b.a().a(Q).a(new gqb.n($$0, bas.b, false)).a(new gqb.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gqc h() {
      return bB;
   }

   public static gqc i() {
      return bC;
   }

   public static gqc s(alg $$0) {
      return gqc.a.be.apply($$0, aB);
   }

   public static gqc j() {
      return bD;
   }

   public static gqc k() {
      return bE;
   }

   public static gqc l() {
      return bF;
   }

   public static gqc m() {
      return bG;
   }

   public static gqc t(alg $$0) {
      return bH.apply($$0);
   }

   public static gqc u(alg $$0) {
      return bI.apply($$0);
   }

   public static gqc n() {
      return bJ;
   }

   public static gqc v(alg $$0) {
      return bK.apply($$0);
   }

   public static gqc w(alg $$0) {
      return bL.apply($$0);
   }

   public static gqc x(alg $$0) {
      return bM.apply($$0);
   }

   public static gqc y(alg $$0) {
      return bN.apply($$0);
   }

   public static gqc o() {
      return bO;
   }

   public static gqc z(alg $$0) {
      return bP.apply($$0);
   }

   public static gqc p() {
      return bQ;
   }

   public static gqc q() {
      return bR;
   }

   public static gqc r() {
      return bS;
   }

   private static gqc.b aa() {
      return gqc.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gqc s() {
      return bT;
   }

   public static gqc t() {
      return bU;
   }

   public static gqc u() {
      return bV;
   }

   private static gqc.a a(boolean $$0, boolean $$1) {
      return a("clouds", fja.f, fjh.c.h, 786432, false, false, gqc.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gqc v() {
      return bW;
   }

   public static gqc w() {
      return bX;
   }

   public static gqc x() {
      return bY;
   }

   public static gqc y() {
      return bb;
   }

   public static gqc z() {
      return bc;
   }

   public static gqc A() {
      return bd;
   }

   public static gqc a(double $$0) {
      return bZ.apply($$0);
   }

   public static gqc B() {
      return ca;
   }

   public static gqc C() {
      return cb;
   }

   public static gqc D() {
      return cc;
   }

   public static gqc E() {
      return cd;
   }

   public static gqc F() {
      return ce;
   }

   private static gqc b(boolean $$0) {
      return a(
         "world_border",
         fja.i,
         fjh.c.h,
         1536,
         false,
         false,
         gqc.b.a().a(q).a(new gqb.n(gqu.a, bas.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gqc a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gqc A(alg $$0) {
      return ch.apply($$0);
   }

   public static gqc B(alg $$0) {
      return ci.apply($$0);
   }

   private static Function<alg, gqc> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fja.d, fjh.c.h, 1536, false, false, gqc.b.a().a(u).a(new gqb.n($$1, bas.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gqc f(alg $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gqc G() {
      return cl;
   }

   public static gqc H() {
      return cm;
   }

   public static gqc I() {
      return cn;
   }

   public static gqc J() {
      return co;
   }

   public static gqc C(alg $$0) {
      return cp.apply($$0);
   }

   public static gqc D(alg $$0) {
      return cq.apply($$0);
   }

   public static gqc E(alg $$0) {
      return cr.apply($$0);
   }

   public static gqc K() {
      return cs;
   }

   public static gqc L() {
      return ct;
   }

   public static gqc F(alg $$0) {
      return cu.apply($$0);
   }

   public static gqc G(alg $$0) {
      return cv.apply($$0);
   }

   public static gqc M() {
      return cw;
   }

   public static gqc N() {
      return cx;
   }

   public static gqc O() {
      return cy;
   }

   public static gqc H(alg $$0) {
      return cz.apply($$0);
   }

   public static gqc I(alg $$0) {
      return cA.apply($$0);
   }

   public static gqc J(alg $$0) {
      return cB.apply($$0);
   }

   public static gqc P() {
      return cC;
   }

   public gqc(String $$0, fjh $$1, fjh.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gqc.a a(String $$0, fjh $$1, fjh.c $$2, int $$3, gqc.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gqc.a a(String $$0, fjh $$1, fjh.c $$2, int $$3, boolean $$4, boolean $$5, gqc.b $$6) {
      return new gqc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fjb $$0) {
      this.a();
      fiy.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gqc> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fjh S() {
      return this.cE;
   }

   public fjh.c T() {
      return this.cF;
   }

   public Optional<gqc> U() {
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

   static final class a extends gqc {
      static final BiFunction<alg, gqb.c, gqc> be = af.a(
         ($$0, $$1) -> gqc.a("outline", fja.j, fjh.c.h, 1536, gqc.b.a().a(T).a(new gqb.n($$0, bas.b, false)).a($$1).a(aC).a(aP).a(gqc.c.b))
      );
      private final gqc.b bf;
      private final Optional<gqc> bg;
      private final boolean bh;

      a(String $$0, fjh $$1, fjh.c $$2, int $$3, boolean $$4, boolean $$5, gqc.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gqb::a), () -> $$6.o.forEach(gqb::b));
         this.bf = $$6;
         this.bg = $$6.n == gqc.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gqc.c.b;
      }

      @Override
      public Optional<gqc> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gqc.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gqb.e a;
      private final gqb.m b;
      private final gqb.p c;
      private final gqb.d d;
      final gqb.c e;
      private final gqb.g f;
      private final gqb.l g;
      private final gqb.f h;
      private final gqb.k i;
      private final gqb.o j;
      private final gqb.q k;
      private final gqb.h l;
      private final gqb.b m;
      final gqc.c n;
      final ImmutableList<gqb> o;

      b(
         gqb.e $$0,
         gqb.m $$1,
         gqb.p $$2,
         gqb.d $$3,
         gqb.c $$4,
         gqb.g $$5,
         gqb.l $$6,
         gqb.f $$7,
         gqb.k $$8,
         gqb.o $$9,
         gqb.q $$10,
         gqb.h $$11,
         gqb.b $$12,
         gqc.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gqb[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gqc.b.a a() {
         return new gqc.b.a();
      }

      public static class a {
         private gqb.e a = gqb.as;
         private gqb.m b = gqb.n;
         private gqb.p c;
         private gqb.d d;
         private gqb.c e;
         private gqb.g f;
         private gqb.l g;
         private gqb.f h;
         private gqb.k i;
         private gqb.o j;
         private gqb.q k;
         private gqb.h l;
         private gqb.b m;

         a() {
            this.c = gqb.c;
            this.d = gqb.aE;
            this.e = gqb.aA;
            this.f = gqb.ax;
            this.g = gqb.az;
            this.h = gqb.aJ;
            this.i = gqb.aO;
            this.j = gqb.at;
            this.k = gqb.aG;
            this.l = gqb.aV;
            this.m = gqb.aW;
         }

         public gqc.b.a a(gqb.e $$0) {
            this.a = $$0;
            return this;
         }

         public gqc.b.a a(gqb.m $$0) {
            this.b = $$0;
            return this;
         }

         public gqc.b.a a(gqb.p $$0) {
            this.c = $$0;
            return this;
         }

         public gqc.b.a a(gqb.d $$0) {
            this.d = $$0;
            return this;
         }

         public gqc.b.a a(gqb.c $$0) {
            this.e = $$0;
            return this;
         }

         public gqc.b.a a(gqb.g $$0) {
            this.f = $$0;
            return this;
         }

         public gqc.b.a a(gqb.l $$0) {
            this.g = $$0;
            return this;
         }

         public gqc.b.a a(gqb.f $$0) {
            this.h = $$0;
            return this;
         }

         public gqc.b.a a(gqb.k $$0) {
            this.i = $$0;
            return this;
         }

         public gqc.b.a a(gqb.o $$0) {
            this.j = $$0;
            return this;
         }

         public gqc.b.a a(gqb.q $$0) {
            this.k = $$0;
            return this;
         }

         public gqc.b.a a(gqb.h $$0) {
            this.l = $$0;
            return this;
         }

         public gqc.b.a a(gqb.b $$0) {
            this.m = $$0;
            return this;
         }

         public gqc.b a(boolean $$0) {
            return this.a($$0 ? gqc.c.c : gqc.c.a);
         }

         public gqc.b a(gqc.c $$0) {
            return new gqc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
