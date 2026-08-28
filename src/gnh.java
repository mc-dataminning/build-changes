import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gnh extends gng {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gnh bf = a("solid", fgp.b, fgw.c.h, 4194304, true, false, gnh.b.a().a(aw).a(v).a(aq).a(true));
   private static final gnh bg = a("cutout_mipped", fgp.b, fgw.c.h, 4194304, true, false, gnh.b.a().a(aw).a(w).a(aq).a(true));
   private static final gnh bh = a("cutout", fgp.b, fgw.c.h, 786432, true, false, gnh.b.a().a(aw).a(x).a(ar).a(true));
   private static final gnh bi = a("translucent", fgp.b, fgw.c.h, 786432, true, true, a(y));
   private static final gnh bj = a("translucent_moving_block", fgp.b, fgw.c.h, 786432, false, true, Z());
   private static final Function<aku, gnh> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aku, gnh> bl = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(B).a(new gng.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fgp.c, fgw.c.h, 1536, true, true, $$1);
   });
   private static final Function<aku, gnh> bm = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(C).a(new gng.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final Function<aku, gnh> bn = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(C).a(new gng.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final Function<aku, gnh> bo = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(D).a(new gng.n($$0, bad.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fgp.c, fgw.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<aku, Boolean, gnh> bp = af.a(($$0, $$1) -> {
      gnh.b $$2 = gnh.b.a().a(E).a(new gng.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fgp.c, fgw.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<aku, Boolean, gnh> bq = af.a(($$0, $$1) -> {
      gnh.b $$2 = gnh.b.a().a(F).a(new gng.n($$0, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgp.c, fgw.c.h, 1536, true, false, $$2);
   });
   private static final Function<aku, gnh> br = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(G).a(new gng.n($$0, bad.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fgp.c, fgw.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<aku, Boolean, gnh> bs = af.a(($$0, $$1) -> {
      gnh.b $$2 = gnh.b.a().a(H).a(new gng.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fgp.c, fgw.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<aku, Boolean, gnh> bt = af.a(($$0, $$1) -> {
      gnh.b $$2 = gnh.b.a().a(I).a(new gng.n($$0, bad.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fgp.c, fgw.c.h, 1536, true, true, $$2);
   });
   private static final Function<aku, gnh> bu = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(J).a(new gng.n($$0, bad.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final BiFunction<aku, Boolean, gnh> bv = af.a(($$0, $$1) -> {
      gnh.b $$2 = gnh.b.a().a(K).a(new gng.n($$0, bad.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fgp.b, fgw.c.h, 1536, false, true, $$2);
   });
   private static final Function<aku, gnh> bw = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(L).a(new gng.n($$0, bad.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final Function<aku, gnh> bx = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(M).a(new gng.n($$0, bad.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fgp.c, fgw.c.h, 1536, false, true, $$1);
   });
   private static final Function<aku, gnh> by = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(N).a(new gng.n($$0, bad.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fgp.c, fgw.c.h, 1536, false, false, $$1);
   });
   private static final Function<aku, gnh> bz = af.b($$0 -> {
      gnh.b $$1 = gnh.b.a().a(O).a(new gng.n($$0, bad.b, false)).a(aB).a(true);
      return a("entity_alpha", fgp.c, fgw.c.h, 1536, $$1);
   });
   private static final BiFunction<aku, gng.p, gnh> bA = af.a(($$0, $$1) -> {
      gng.n $$2 = new gng.n($$0, bad.b, false);
      return a("eyes", fgp.c, fgw.c.h, 1536, false, true, gnh.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gnh bB = a("leash", fgp.h, fgw.c.f, 1536, gnh.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gnh bC = a("water_mask", fgp.e, fgw.c.h, 1536, gnh.b.a().a(S).a(as).a(aI).a(false));
   private static final gnh bD = a(
      "armor_entity_glint", fgp.i, fgw.c.h, 1536, gnh.b.a().a(U).a(new gng.n(gub.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gnh bE = a(
      "glint_translucent", fgp.i, fgw.c.h, 1536, gnh.b.a().a(V).a(new gng.n(gub.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gnh bF = a("glint", fgp.i, fgw.c.h, 1536, gnh.b.a().a(W).a(new gng.n(gub.b, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gnh bG = a("entity_glint", fgp.i, fgw.c.h, 1536, gnh.b.a().a(X).a(new gng.n(gub.a, bad.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<aku, gnh> bH = af.b($$0 -> {
      gng.n $$1 = new gng.n($$0, bad.b, false);
      return a("crumbling", fgp.b, fgw.c.h, 1536, false, true, gnh.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<aku, gnh> bI = af.b(
      $$0 -> a("text", fgp.k, fgw.c.h, 786432, false, false, gnh.b.a().a(Z).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final gnh bJ = a("text_background", fgp.h, fgw.c.h, 1536, false, true, gnh.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<aku, gnh> bK = af.b(
      $$0 -> a("text_intensity", fgp.k, fgw.c.h, 786432, false, false, gnh.b.a().a(ab).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<aku, gnh> bL = af.b(
      $$0 -> a("text_polygon_offset", fgp.k, fgw.c.h, 1536, false, true, gnh.b.a().a(Z).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<aku, gnh> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", fgp.k, fgw.c.h, 1536, false, true, gnh.b.a().a(ab).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<aku, gnh> bN = af.b(
      $$0 -> a("text_see_through", fgp.k, fgw.c.h, 1536, false, false, gnh.b.a().a(ac).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gnh bO = a("text_background_see_through", fgp.h, fgw.c.h, 1536, false, true, gnh.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<aku, gnh> bP = af.b(
      $$0 -> a("text_intensity_see_through", fgp.k, fgw.c.h, 1536, false, true, gnh.b.a().a(ae).a(new gng.n($$0, bad.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gnh bQ = a("lightning", fgp.f, fgw.c.h, 1536, false, true, gnh.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gnh bR = a("dragon_rays", fgp.f, fgw.c.e, 1536, false, false, gnh.b.a().a(af).a(aH).a(e).a(false));
   private static final gnh bS = a("dragon_rays_depth", fgp.e, fgw.c.e, 1536, false, false, gnh.b.a().a(p).a(aI).a(false));
   private static final gnh bT = a("tripwire", fgp.b, fgw.c.h, 1536, true, true, aa());
   private static final gnh bU = a(
      "end_portal", fgp.e, fgw.c.h, 1536, false, false, gnh.b.a().a(ah).a(gng.i.d().a(gqc.a, false, false).a(gqc.b, false, false).a()).a(false)
   );
   private static final gnh bV = a(
      "end_gateway", fgp.e, fgw.c.h, 1536, false, false, gnh.b.a().a(ai).a(gng.i.d().a(gqc.a, false, false).a(gqc.b, false, false).a()).a(false)
   );
   private static final gnh bW = a(false, false);
   private static final gnh bX = a(false, true);
   private static final gnh bY = a(true, true);
   public static final gnh.a bb = a("lines", fgp.g, fgw.c.a, 1536, gnh.b.a().a(ak).a(new gng.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gnh.a bc = a(
      "secondary_block_outline", fgp.g, fgw.c.a, 1536, gnh.b.a().a(ak).a(new gng.h(OptionalDouble.of(7.0))).a(aL).a(gng.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gnh.a bd = a(
      "line_strip", fgp.g, fgw.c.b, 1536, gnh.b.a().a(ak).a(new gng.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gnh.a> bZ = af.b(
      $$0 -> a("debug_line_strip", fgp.f, fgw.c.d, 1536, gnh.b.a().a(s).a(new gng.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gnh.a ca = a("debug_filled_box", fgp.f, fgw.c.f, 1536, false, true, gnh.b.a().a(s).a(aL).a(i).a(false));
   private static final gnh.a cb = a("debug_quads", fgp.f, fgw.c.h, 1536, false, true, gnh.b.a().a(s).a(i).a(aB).a(false));
   private static final gnh.a cc = a("debug_triangle_fan", fgp.f, fgw.c.g, 1536, false, true, gnh.b.a().a(s).a(i).a(aB).a(false));
   private static final gnh.a cd = a("debug_structure_quads", fgp.f, fgw.c.h, 1536, false, true, gnh.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gnh.a ce = a("debug_section_quads", fgp.f, fgw.c.h, 1536, false, true, gnh.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gnh cf = b(false);
   private static final gnh cg = b(true);
   private static final Function<aku, gnh> ch = af.b(
      $$0 -> a("opaque_particle", fgp.d, fgw.c.h, 1536, false, false, gnh.b.a().a(u).a(new gng.n($$0, bad.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<aku, gnh> ci = af.b(
      $$0 -> a("translucent_particle", fgp.d, fgw.c.h, 1536, false, false, gnh.b.a().a(u).a(new gng.n($$0, bad.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<aku, gnh> cj = c(true);
   private static final Function<aku, gnh> ck = c(false);
   private static final gnh cl = a("sky", fgp.e, fgw.c.h, 1536, false, false, gnh.b.a().a(p).a(aH).a(false));
   private static final gnh cm = a("end_sky", fgp.j, fgw.c.h, 1536, false, false, gnh.b.a().a(t).a(new gng.n(gnt.a, bad.b, false)).a(i).a(aH).a(false));
   private static final gnh cn = a("sunrise_sunset", fgp.f, fgw.c.g, 1536, false, false, gnh.b.a().a(s).a(i).a(aH).a(false));
   private static final gnh co = a("stars", fgp.e, fgw.c.h, 1536, false, false, gnh.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<aku, gnh> cp = af.b(
      $$0 -> a("celestial", fgp.j, fgw.c.h, 1536, false, false, gnh.b.a().a(t).a(new gng.n($$0, bad.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<aku, gnh> cq = af.b(
      $$0 -> a("block_screen_effect", fgp.j, fgw.c.h, 1536, false, false, gnh.b.a().a(t).a(new gng.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<aku, gnh> cr = af.b(
      $$0 -> a("fire_screen_effect", fgp.j, fgw.c.h, 1536, false, false, gnh.b.a().a(t).a(new gng.n($$0, bad.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gnh.a cs = a("gui", fgp.f, fgw.c.h, 786432, gnh.b.a().a(al).a(i).a(aE).a(false));
   private static final gnh.a ct = a("gui_overlay", fgp.f, fgw.c.h, 1536, gnh.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<aku, gnh> cu = af.b(
      $$0 -> a("gui_textured_overlay", fgp.j, fgw.c.h, 1536, gnh.b.a().a(new gng.n($$0, bad.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<aku, gnh> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fgp.j, fgw.c.h, 786432, gnh.b.a().a(new gng.n($$0, bad.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gnh.a cw = a("gui_nausea_overlay", fgp.j, fgw.c.h, 1536, gnh.b.a().a(new gng.n(fpb.a, bad.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gnh.a cx = a("gui_text_highlight", fgp.f, fgw.c.h, 1536, gnh.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gnh.a cy = a("gui_ghost_recipe_overlay", fgp.f, fgw.c.h, 1536, gnh.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<aku, gnh> cz = af.b(
      $$0 -> a("gui_textured", fgp.j, fgw.c.h, 786432, gnh.b.a().a(new gng.n($$0, bad.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<aku, gnh> cA = af.b(
      $$0 -> a("vignette", fgp.j, fgw.c.h, 786432, gnh.b.a().a(new gng.n($$0, bad.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<aku, gnh> cB = af.b(
      $$0 -> a("crosshair", fgp.j, fgw.c.h, 786432, gnh.b.a().a(new gng.n($$0, bad.b, false)).a(t).a(k).a(false))
   );
   private static final gnh.a cC = a("mojang_logo", fgp.j, fgw.c.h, 786432, gnh.b.a().a(new gng.n(fuy.a, bad.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gnh> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgw cE;
   private final fgw.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gnh c() {
      return bf;
   }

   public static gnh d() {
      return bg;
   }

   public static gnh e() {
      return bh;
   }

   private static gnh.b a(gng.m $$0) {
      return gnh.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gnh f() {
      return bi;
   }

   private static gnh.b Z() {
      return gnh.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gnh g() {
      return bj;
   }

   private static gnh.a a(String $$0, aku $$1, boolean $$2) {
      gnh.b $$3 = gnh.b.a().a(A).a(new gng.n($$1, bad.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fgp.c, fgw.c.h, 1536, true, false, $$3);
   }

   public static gnh a(aku $$0) {
      return bk.apply($$0);
   }

   public static gnh b(aku $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gnh c(aku $$0) {
      return bl.apply($$0);
   }

   public static gnh d(aku $$0) {
      return bm.apply($$0);
   }

   public static gnh e(aku $$0) {
      return bn.apply($$0);
   }

   public static gnh f(aku $$0) {
      return bo.apply($$0);
   }

   public static gnh a(aku $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gnh g(aku $$0) {
      return a($$0, true);
   }

   public static gnh b(aku $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gnh h(aku $$0) {
      return b($$0, true);
   }

   public static gnh i(aku $$0) {
      return br.apply($$0);
   }

   public static gnh c(aku $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gnh j(aku $$0) {
      return c($$0, true);
   }

   public static gnh d(aku $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gnh k(aku $$0) {
      return d($$0, true);
   }

   public static gnh l(aku $$0) {
      return bu.apply($$0);
   }

   public static gnh e(aku $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gnh m(aku $$0) {
      return bw.apply($$0);
   }

   public static gnh n(aku $$0) {
      return bx.apply($$0);
   }

   public static gnh o(aku $$0) {
      return by.apply($$0);
   }

   public static gnh p(aku $$0) {
      return bz.apply($$0);
   }

   public static gnh q(aku $$0) {
      return bA.apply($$0, i);
   }

   public static gnh r(aku $$0) {
      return bt.apply($$0, false);
   }

   public static gnh a(aku $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgp.c,
         fgw.c.h,
         1536,
         false,
         true,
         gnh.b.a().a(ap).a(new gng.n($$0, bad.b, false)).a(new gng.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gnh b(aku $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgp.c,
         fgw.c.h,
         1536,
         false,
         true,
         gnh.b.a().a(Q).a(new gng.n($$0, bad.b, false)).a(new gng.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gnh h() {
      return bB;
   }

   public static gnh i() {
      return bC;
   }

   public static gnh s(aku $$0) {
      return gnh.a.be.apply($$0, aB);
   }

   public static gnh j() {
      return bD;
   }

   public static gnh k() {
      return bE;
   }

   public static gnh l() {
      return bF;
   }

   public static gnh m() {
      return bG;
   }

   public static gnh t(aku $$0) {
      return bH.apply($$0);
   }

   public static gnh u(aku $$0) {
      return bI.apply($$0);
   }

   public static gnh n() {
      return bJ;
   }

   public static gnh v(aku $$0) {
      return bK.apply($$0);
   }

   public static gnh w(aku $$0) {
      return bL.apply($$0);
   }

   public static gnh x(aku $$0) {
      return bM.apply($$0);
   }

   public static gnh y(aku $$0) {
      return bN.apply($$0);
   }

   public static gnh o() {
      return bO;
   }

   public static gnh z(aku $$0) {
      return bP.apply($$0);
   }

   public static gnh p() {
      return bQ;
   }

   public static gnh q() {
      return bR;
   }

   public static gnh r() {
      return bS;
   }

   private static gnh.b aa() {
      return gnh.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gnh s() {
      return bT;
   }

   public static gnh t() {
      return bU;
   }

   public static gnh u() {
      return bV;
   }

   private static gnh.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgp.f, fgw.c.h, 786432, false, false, gnh.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gnh v() {
      return bW;
   }

   public static gnh w() {
      return bX;
   }

   public static gnh x() {
      return bY;
   }

   public static gnh y() {
      return bb;
   }

   public static gnh z() {
      return bc;
   }

   public static gnh A() {
      return bd;
   }

   public static gnh a(double $$0) {
      return bZ.apply($$0);
   }

   public static gnh B() {
      return ca;
   }

   public static gnh C() {
      return cb;
   }

   public static gnh D() {
      return cc;
   }

   public static gnh E() {
      return cd;
   }

   public static gnh F() {
      return ce;
   }

   private static gnh b(boolean $$0) {
      return a(
         "world_border",
         fgp.i,
         fgw.c.h,
         1536,
         false,
         false,
         gnh.b.a().a(q).a(new gng.n(gnz.a, bad.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gnh a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gnh A(aku $$0) {
      return ch.apply($$0);
   }

   public static gnh B(aku $$0) {
      return ci.apply($$0);
   }

   private static Function<aku, gnh> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fgp.d, fgw.c.h, 1536, false, false, gnh.b.a().a(u).a(new gng.n($$1, bad.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gnh f(aku $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gnh G() {
      return cl;
   }

   public static gnh H() {
      return cm;
   }

   public static gnh I() {
      return cn;
   }

   public static gnh J() {
      return co;
   }

   public static gnh C(aku $$0) {
      return cp.apply($$0);
   }

   public static gnh D(aku $$0) {
      return cq.apply($$0);
   }

   public static gnh E(aku $$0) {
      return cr.apply($$0);
   }

   public static gnh K() {
      return cs;
   }

   public static gnh L() {
      return ct;
   }

   public static gnh F(aku $$0) {
      return cu.apply($$0);
   }

   public static gnh G(aku $$0) {
      return cv.apply($$0);
   }

   public static gnh M() {
      return cw;
   }

   public static gnh N() {
      return cx;
   }

   public static gnh O() {
      return cy;
   }

   public static gnh H(aku $$0) {
      return cz.apply($$0);
   }

   public static gnh I(aku $$0) {
      return cA.apply($$0);
   }

   public static gnh J(aku $$0) {
      return cB.apply($$0);
   }

   public static gnh P() {
      return cC;
   }

   public gnh(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gnh.a a(String $$0, fgw $$1, fgw.c $$2, int $$3, gnh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gnh.a a(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, gnh.b $$6) {
      return new gnh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fgq $$0) {
      this.a();
      fgn.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gnh> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fgw S() {
      return this.cE;
   }

   public fgw.c T() {
      return this.cF;
   }

   public Optional<gnh> U() {
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

   static final class a extends gnh {
      static final BiFunction<aku, gng.c, gnh> be = af.a(
         ($$0, $$1) -> gnh.a("outline", fgp.j, fgw.c.h, 1536, gnh.b.a().a(T).a(new gng.n($$0, bad.b, false)).a($$1).a(aC).a(aP).a(gnh.c.b))
      );
      private final gnh.b bf;
      private final Optional<gnh> bg;
      private final boolean bh;

      a(String $$0, fgw $$1, fgw.c $$2, int $$3, boolean $$4, boolean $$5, gnh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gng::a), () -> $$6.o.forEach(gng::b));
         this.bf = $$6;
         this.bg = $$6.n == gnh.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gnh.c.b;
      }

      @Override
      public Optional<gnh> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gnh.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gng.e a;
      private final gng.m b;
      private final gng.p c;
      private final gng.d d;
      final gng.c e;
      private final gng.g f;
      private final gng.l g;
      private final gng.f h;
      private final gng.k i;
      private final gng.o j;
      private final gng.q k;
      private final gng.h l;
      private final gng.b m;
      final gnh.c n;
      final ImmutableList<gng> o;

      b(
         gng.e $$0,
         gng.m $$1,
         gng.p $$2,
         gng.d $$3,
         gng.c $$4,
         gng.g $$5,
         gng.l $$6,
         gng.f $$7,
         gng.k $$8,
         gng.o $$9,
         gng.q $$10,
         gng.h $$11,
         gng.b $$12,
         gnh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gng[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gnh.b.a a() {
         return new gnh.b.a();
      }

      public static class a {
         private gng.e a = gng.as;
         private gng.m b = gng.n;
         private gng.p c;
         private gng.d d;
         private gng.c e;
         private gng.g f;
         private gng.l g;
         private gng.f h;
         private gng.k i;
         private gng.o j;
         private gng.q k;
         private gng.h l;
         private gng.b m;

         a() {
            this.c = gng.c;
            this.d = gng.aE;
            this.e = gng.aA;
            this.f = gng.ax;
            this.g = gng.az;
            this.h = gng.aJ;
            this.i = gng.aO;
            this.j = gng.at;
            this.k = gng.aG;
            this.l = gng.aV;
            this.m = gng.aW;
         }

         public gnh.b.a a(gng.e $$0) {
            this.a = $$0;
            return this;
         }

         public gnh.b.a a(gng.m $$0) {
            this.b = $$0;
            return this;
         }

         public gnh.b.a a(gng.p $$0) {
            this.c = $$0;
            return this;
         }

         public gnh.b.a a(gng.d $$0) {
            this.d = $$0;
            return this;
         }

         public gnh.b.a a(gng.c $$0) {
            this.e = $$0;
            return this;
         }

         public gnh.b.a a(gng.g $$0) {
            this.f = $$0;
            return this;
         }

         public gnh.b.a a(gng.l $$0) {
            this.g = $$0;
            return this;
         }

         public gnh.b.a a(gng.f $$0) {
            this.h = $$0;
            return this;
         }

         public gnh.b.a a(gng.k $$0) {
            this.i = $$0;
            return this;
         }

         public gnh.b.a a(gng.o $$0) {
            this.j = $$0;
            return this;
         }

         public gnh.b.a a(gng.q $$0) {
            this.k = $$0;
            return this;
         }

         public gnh.b.a a(gng.h $$0) {
            this.l = $$0;
            return this;
         }

         public gnh.b.a a(gng.b $$0) {
            this.m = $$0;
            return this;
         }

         public gnh.b a(boolean $$0) {
            return this.a($$0 ? gnh.c.c : gnh.c.a);
         }

         public gnh.b a(gnh.c $$0) {
            return new gnh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
