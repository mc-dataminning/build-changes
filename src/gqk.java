import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gqk extends gqj {
   private static final int bf = 1048576;
   public static final int aZ = 4194304;
   public static final int ba = 786432;
   public static final int bb = 1536;
   private static final gqk bg = a("solid", fjh.b, fjo.c.h, 4194304, true, false, gqk.b.a().a(ax).a(v).a(ar).a(true));
   private static final gqk bh = a("cutout_mipped", fjh.b, fjo.c.h, 4194304, true, false, gqk.b.a().a(ax).a(w).a(ar).a(true));
   private static final gqk bi = a("cutout", fjh.b, fjo.c.h, 786432, true, false, gqk.b.a().a(ax).a(x).a(as).a(true));
   private static final gqk bj = a("translucent", fjh.b, fjo.c.h, 786432, true, true, a(y));
   private static final gqk bk = a("translucent_moving_block", fjh.b, fjo.c.h, 786432, false, true, aa());
   private static final Function<alg, gqk> bl = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alg, gqk> bm = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(B).a(new gqj.n($$0, bas.b, false)).a(i).a(aC).a(ax).a(az).a(aM).a(true);
      return a("armor_translucent", fjh.c, fjo.c.h, 1536, true, true, $$1);
   });
   private static final Function<alg, gqk> bn = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(C).a(new gqj.n($$0, bas.b, false)).a(c).a(ax).a(az).a(true);
      return a("entity_solid", fjh.c, fjo.c.h, 1536, true, false, $$1);
   });
   private static final Function<alg, gqk> bo = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(C).a(new gqj.n($$0, bas.b, false)).a(c).a(ax).a(az).a(aN).a(true);
      return a("entity_solid_z_offset_forward", fjh.c, fjo.c.h, 1536, true, false, $$1);
   });
   private static final Function<alg, gqk> bp = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(D).a(new gqj.n($$0, bas.b, false)).a(c).a(ax).a(az).a(true);
      return a("entity_cutout", fjh.c, fjo.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alg, Boolean, gqk> bq = af.a(($$0, $$1) -> {
      gqk.b $$2 = gqk.b.a().a(E).a(new gqj.n($$0, bas.b, false)).a(c).a(aC).a(ax).a(az).a($$1);
      return a("entity_cutout_no_cull", fjh.c, fjo.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alg, Boolean, gqk> br = af.a(($$0, $$1) -> {
      gqk.b $$2 = gqk.b.a().a(F).a(new gqj.n($$0, bas.b, false)).a(c).a(aC).a(ax).a(az).a(aM).a($$1);
      return a("entity_cutout_no_cull_z_offset", fjh.c, fjo.c.h, 1536, true, false, $$2);
   });
   private static final Function<alg, gqk> bs = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(G).a(new gqj.n($$0, bas.b, false)).a(i).a(aV).a(ax).a(az).a(aH).a(true);
      return a("item_entity_translucent_cull", fjh.c, fjo.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alg, Boolean, gqk> bt = af.a(($$0, $$1) -> {
      gqk.b $$2 = gqk.b.a().a(H).a(new gqj.n($$0, bas.b, false)).a(i).a(aC).a(ax).a(az).a($$1);
      return a("entity_translucent", fjh.c, fjo.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alg, Boolean, gqk> bu = af.a(($$0, $$1) -> {
      gqk.b $$2 = gqk.b.a().a(I).a(new gqj.n($$0, bas.b, false)).a(i).a(aC).a(aI).a(az).a($$1);
      return a("entity_translucent_emissive", fjh.c, fjo.c.h, 1536, true, true, $$2);
   });
   private static final Function<alg, gqk> bv = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(J).a(new gqj.n($$0, bas.b, false)).a(aC).a(ax).a(true);
      return a("entity_smooth_cutout", fjh.c, fjo.c.h, 1536, $$1);
   });
   private static final BiFunction<alg, Boolean, gqk> bw = af.a(($$0, $$1) -> {
      gqk.b $$2 = gqk.b.a().a(K).a(new gqj.n($$0, bas.b, false)).a($$1 ? i : c).a($$1 ? aI : aH).a(false);
      return a("beacon_beam", fjh.b, fjo.c.h, 1536, false, true, $$2);
   });
   private static final Function<alg, gqk> bx = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(L).a(new gqj.n($$0, bas.b, false)).a(aE).a(aC).a(ax).a(az).a(false);
      return a("entity_decal", fjh.c, fjo.c.h, 1536, $$1);
   });
   private static final Function<alg, gqk> by = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(M).a(new gqj.n($$0, bas.b, false)).a(i).a(aC).a(ax).a(az).a(aI).a(false);
      return a("entity_no_outline", fjh.c, fjo.c.h, 1536, false, true, $$1);
   });
   private static final Function<alg, gqk> bz = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(N).a(new gqj.n($$0, bas.b, false)).a(i).a(aB).a(ax).a(az).a(aI).a(aF).a(aM).a(false);
      return a("entity_shadow", fjh.c, fjo.c.h, 1536, false, false, $$1);
   });
   private static final Function<alg, gqk> bA = af.b($$0 -> {
      gqk.b $$1 = gqk.b.a().a(O).a(new gqj.n($$0, bas.b, false)).a(aC).a(true);
      return a("entity_alpha", fjh.c, fjo.c.h, 1536, $$1);
   });
   private static final BiFunction<alg, gqj.p, gqk> bB = af.a(($$0, $$1) -> {
      gqj.n $$2 = new gqj.n($$0, bas.b, false);
      return a("eyes", fjh.c, fjo.c.h, 1536, false, true, gqk.b.a().a(P).a($$2).a($$1).a(aI).a(false));
   });
   private static final gqk bC = a("leash", fjh.h, fjo.c.f, 1536, gqk.b.a().a(R).a(at).a(aC).a(ax).a(false));
   private static final gqk bD = a("water_mask", fjh.e, fjo.c.h, 1536, gqk.b.a().a(S).a(at).a(aJ).a(false));
   private static final gqk bE = a(
      "armor_entity_glint", fjh.i, fjo.c.h, 1536, gqk.b.a().a(U).a(new gqj.n(gxf.a, bas.c, false)).a(aI).a(aC).a(aE).a(f).a(aw).a(aM).a(false)
   );
   private static final gqk bF = a(
      "glint_translucent", fjh.i, fjo.c.h, 1536, gqk.b.a().a(V).a(new gqj.n(gxf.b, bas.c, false)).a(aI).a(aC).a(aE).a(f).a(av).a(aV).a(false)
   );
   private static final gqk bG = a("glint", fjh.i, fjo.c.h, 1536, gqk.b.a().a(W).a(new gqj.n(gxf.b, bas.c, false)).a(aI).a(aC).a(aE).a(f).a(av).a(false));
   private static final gqk bH = a("entity_glint", fjh.i, fjo.c.h, 1536, gqk.b.a().a(X).a(new gqj.n(gxf.a, bas.c, false)).a(aI).a(aC).a(aE).a(f).a(aw).a(false));
   private static final Function<alg, gqk> bI = af.b($$0 -> {
      gqj.n $$1 = new gqj.n($$0, bas.b, false);
      return a("crumbling", fjh.b, fjo.c.h, 1536, false, true, gqk.b.a().a(Y).a($$1).a(g).a(aI).a(aL).a(false));
   });
   private static final Function<alg, gqk> bJ = af.b(
      $$0 -> a("text", fjh.k, fjo.c.h, 786432, false, false, gqk.b.a().a(Z).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(false))
   );
   private static final gqk bK = a("text_background", fjh.h, fjo.c.h, 1536, false, true, gqk.b.a().a(aa).a(at).a(i).a(ax).a(false));
   private static final Function<alg, gqk> bL = af.b(
      $$0 -> a("text_intensity", fjh.k, fjo.c.h, 786432, false, false, gqk.b.a().a(ab).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(false))
   );
   private static final Function<alg, gqk> bM = af.b(
      $$0 -> a("text_polygon_offset", fjh.k, fjo.c.h, 1536, false, true, gqk.b.a().a(Z).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(aL).a(false))
   );
   private static final Function<alg, gqk> bN = af.b(
      $$0 -> a("text_intensity_polygon_offset", fjh.k, fjo.c.h, 1536, false, true, gqk.b.a().a(ab).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(aL).a(false))
   );
   private static final Function<alg, gqk> bO = af.b(
      $$0 -> a("text_see_through", fjh.k, fjo.c.h, 1536, false, false, gqk.b.a().a(ac).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(aD).a(aI).a(false))
   );
   private static final gqk bP = a("text_background_see_through", fjh.h, fjo.c.h, 1536, false, true, gqk.b.a().a(ad).a(at).a(i).a(ax).a(aD).a(aI).a(false));
   private static final Function<alg, gqk> bQ = af.b(
      $$0 -> a("text_intensity_see_through", fjh.k, fjo.c.h, 1536, false, true, gqk.b.a().a(ae).a(new gqj.n($$0, bas.b, false)).a(i).a(ax).a(aD).a(aI).a(false))
   );
   private static final gqk bR = a("lightning", fjh.f, fjo.c.h, 1536, false, true, gqk.b.a().a(af).a(aH).a(e).a(aT).a(false));
   private static final gqk bS = a("dragon_rays", fjh.f, fjo.c.e, 1536, false, false, gqk.b.a().a(af).a(aI).a(e).a(false));
   private static final gqk bT = a("dragon_rays_depth", fjh.e, fjo.c.e, 1536, false, false, gqk.b.a().a(p).a(aJ).a(false));
   private static final gqk bU = a("tripwire", fjh.b, fjo.c.h, 1536, true, true, ab());
   private static final gqk bV = a(
      "end_portal", fjh.e, fjo.c.h, 1536, false, false, gqk.b.a().a(ah).a(gqj.i.d().a(gtg.a, false, false).a(gtg.b, false, false).a()).a(false)
   );
   private static final gqk bW = a(
      "end_gateway", fjh.e, fjo.c.h, 1536, false, false, gqk.b.a().a(ai).a(gqj.i.d().a(gtg.a, false, false).a(gtg.b, false, false).a()).a(false)
   );
   private static final gqk bX = a(false, false);
   private static final gqk bY = a(false, true);
   private static final gqk bZ = a(true, true);
   public static final gqk.a bc = a("lines", fjh.g, fjo.c.a, 1536, gqk.b.a().a(al).a(new gqj.h(OptionalDouble.empty())).a(aM).a(i).a(aV).a(aH).a(aC).a(false));
   public static final gqk.a bd = a(
      "secondary_block_outline", fjh.g, fjo.c.a, 1536, gqk.b.a().a(al).a(new gqj.h(OptionalDouble.of(7.0))).a(aM).a(gqj.i).a(aV).a(aI).a(aC).a(false)
   );
   public static final gqk.a be = a(
      "line_strip", fjh.g, fjo.c.b, 1536, gqk.b.a().a(al).a(new gqj.h(OptionalDouble.empty())).a(aM).a(i).a(aV).a(aH).a(aC).a(false)
   );
   private static final Function<Double, gqk.a> ca = af.b(
      $$0 -> a("debug_line_strip", fjh.f, fjo.c.d, 1536, gqk.b.a().a(s).a(new gqj.h(OptionalDouble.of($$0))).a(c).a(aC).a(false))
   );
   private static final gqk.a cb = a("debug_filled_box", fjh.f, fjo.c.f, 1536, false, true, gqk.b.a().a(s).a(aM).a(i).a(false));
   private static final gqk.a cc = a("debug_quads", fjh.f, fjo.c.h, 1536, false, true, gqk.b.a().a(s).a(i).a(aC).a(false));
   private static final gqk.a cd = a("debug_triangle_fan", fjh.f, fjo.c.g, 1536, false, true, gqk.b.a().a(s).a(i).a(aC).a(false));
   private static final gqk.a ce = a("debug_structure_quads", fjh.f, fjo.c.h, 1536, false, true, gqk.b.a().a(s).a(i).a(aC).a(aF).a(aI).a(false));
   private static final gqk.a cf = a("debug_section_quads", fjh.f, fjo.c.h, 1536, false, true, gqk.b.a().a(s).a(aM).a(i).a(aB).a(false));
   private static final gqk cg = a(
      "world_border", fjh.i, fjo.c.h, 1536, false, false, gqk.b.a().a(aj).a(new gqj.n(grc.a, bas.b, false)).a(h).a(ax).a(aT).a(aH).a(aO).a(aC).a(false)
   );
   private static final Function<alg, gqk> ch = af.b(
      $$0 -> a("opaque_particle", fjh.d, fjo.c.h, 1536, false, false, gqk.b.a().a(u).a(new gqj.n($$0, bas.b, false)).a(ax).a(aH).a(false))
   );
   private static final Function<alg, gqk> ci = af.b(
      $$0 -> a("translucent_particle", fjh.d, fjo.c.h, 1536, false, false, gqk.b.a().a(u).a(new gqj.n($$0, bas.b, false)).a(i).a(aS).a(ax).a(aH).a(false))
   );
   private static final Function<alg, gqk> cj = a(true);
   private static final Function<alg, gqk> ck = a(false);
   private static final gqk cl = a("sky", fjh.e, fjo.c.h, 1536, false, false, gqk.b.a().a(p).a(aI).a(false));
   private static final gqk cm = a("end_sky", fjh.j, fjo.c.h, 1536, false, false, gqk.b.a().a(t).a(new gqj.n(gqw.a, bas.b, false)).a(i).a(aI).a(false));
   private static final gqk cn = a("sunrise_sunset", fjh.f, fjo.c.g, 1536, false, false, gqk.b.a().a(s).a(i).a(aI).a(false));
   private static final gqk co = a("stars", fjh.e, fjo.c.h, 1536, false, false, gqk.b.a().a(p).a(h).a(aI).a(false));
   private static final Function<alg, gqk> cp = af.b(
      $$0 -> a("celestial", fjh.j, fjo.c.h, 1536, false, false, gqk.b.a().a(t).a(new gqj.n($$0, bas.b, false)).a(h).a(aI).a(false))
   );
   private static final Function<alg, gqk> cq = af.b(
      $$0 -> a("block_screen_effect", fjh.j, fjo.c.h, 1536, false, false, gqk.b.a().a(t).a(new gqj.n($$0, bas.b, false)).a(aD).a(aI).a(i).a(false))
   );
   private static final Function<alg, gqk> cr = af.b(
      $$0 -> a("fire_screen_effect", fjh.j, fjo.c.h, 1536, false, false, gqk.b.a().a(t).a(new gqj.n($$0, bas.b, false)).a(aD).a(aI).a(i).a(false))
   );
   private static final gqk.a cs = a("gui", fjh.f, fjo.c.h, 786432, gqk.b.a().a(am).a(i).a(aF).a(false));
   private static final gqk.a ct = a("gui_overlay", fjh.f, fjo.c.h, 1536, gqk.b.a().a(an).a(i).a(aD).a(aI).a(false));
   private static final Function<alg, gqk> cu = af.b(
      $$0 -> a("gui_textured_overlay", fjh.j, fjo.c.h, 1536, gqk.b.a().a(new gqj.n($$0, bas.c, false)).a(t).a(i).a(aD).a(aI).a(false))
   );
   private static final Function<alg, gqk> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fjh.j, fjo.c.h, 786432, gqk.b.a().a(new gqj.n($$0, bas.b, false)).a(t).a(c).a(aF).a(false))
   );
   private static final gqk.a cw = a("gui_nausea_overlay", fjh.j, fjo.c.h, 1536, gqk.b.a().a(new gqj.n(fru.a, bas.c, false)).a(t).a(m).a(aD).a(aI).a(false));
   private static final gqk.a cx = a("gui_text_highlight", fjh.f, fjo.c.h, 1536, gqk.b.a().a(ao).a(i).a(aD).a(aY).a(false));
   private static final gqk.a cy = a("gui_ghost_recipe_overlay", fjh.f, fjo.c.h, 1536, gqk.b.a().a(ap).a(i).a(aG).a(aI).a(false));
   private static final Function<alg, gqk> cz = af.b(
      $$0 -> a("gui_textured", fjh.j, fjo.c.h, 786432, gqk.b.a().a(new gqj.n($$0, bas.b, false)).a(t).a(i).a(aF).a(false))
   );
   private static final Function<alg, gqk> cA = af.b(
      $$0 -> a("vignette", fjh.j, fjo.c.h, 786432, gqk.b.a().a(new gqj.n($$0, bas.c, false)).a(t).a(j).a(aD).a(aI).a(false))
   );
   private static final Function<alg, gqk> cB = af.b(
      $$0 -> a("crosshair", fjh.j, fjo.c.h, 786432, gqk.b.a().a(new gqj.n($$0, bas.b, false)).a(t).a(k).a(false))
   );
   private static final gqk.a cC = a("mojang_logo", fjh.j, fjo.c.h, 786432, gqk.b.a().a(new gqj.n(fxr.a, bas.c, false)).a(t).a(l).a(aD).a(aI).a(false));
   private static final ImmutableList<gqk> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fjo cE;
   private final fjo.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gqk c() {
      return bg;
   }

   public static gqk d() {
      return bh;
   }

   public static gqk e() {
      return bi;
   }

   private static gqk.b a(gqj.m $$0) {
      return gqk.b.a().a(ax).a($$0).a(ar).a(i).a(aR).a(true);
   }

   public static gqk f() {
      return bj;
   }

   private static gqk.b aa() {
      return gqk.b.a().a(ax).a(z).a(ar).a(i).a(aV).a(true);
   }

   public static gqk g() {
      return bk;
   }

   private static gqk.a a(String $$0, alg $$1, boolean $$2) {
      gqk.b $$3 = gqk.b.a().a(A).a(new gqj.n($$1, bas.b, false)).a(c).a(aC).a(ax).a(az).a(aM).a($$2 ? aE : aF).a(true);
      return a($$0, fjh.c, fjo.c.h, 1536, true, false, $$3);
   }

   public static gqk a(alg $$0) {
      return bl.apply($$0);
   }

   public static gqk b(alg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gqk c(alg $$0) {
      return bm.apply($$0);
   }

   public static gqk d(alg $$0) {
      return bn.apply($$0);
   }

   public static gqk e(alg $$0) {
      return bo.apply($$0);
   }

   public static gqk f(alg $$0) {
      return bp.apply($$0);
   }

   public static gqk a(alg $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gqk g(alg $$0) {
      return a($$0, true);
   }

   public static gqk b(alg $$0, boolean $$1) {
      return br.apply($$0, $$1);
   }

   public static gqk h(alg $$0) {
      return b($$0, true);
   }

   public static gqk i(alg $$0) {
      return bs.apply($$0);
   }

   public static gqk c(alg $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gqk j(alg $$0) {
      return c($$0, true);
   }

   public static gqk d(alg $$0, boolean $$1) {
      return bu.apply($$0, $$1);
   }

   public static gqk k(alg $$0) {
      return d($$0, true);
   }

   public static gqk l(alg $$0) {
      return bv.apply($$0);
   }

   public static gqk e(alg $$0, boolean $$1) {
      return bw.apply($$0, $$1);
   }

   public static gqk m(alg $$0) {
      return bx.apply($$0);
   }

   public static gqk n(alg $$0) {
      return by.apply($$0);
   }

   public static gqk o(alg $$0) {
      return bz.apply($$0);
   }

   public static gqk p(alg $$0) {
      return bA.apply($$0);
   }

   public static gqk q(alg $$0) {
      return bB.apply($$0, i);
   }

   public static gqk r(alg $$0) {
      return bu.apply($$0, false);
   }

   public static gqk a(alg $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fjh.c,
         fjo.c.h,
         1536,
         false,
         true,
         gqk.b.a().a(aq).a(new gqj.n($$0, bas.b, false)).a(new gqj.j($$1, $$2)).a(i).a(aC).a(ax).a(aA).a(false)
      );
   }

   public static gqk b(alg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fjh.c,
         fjo.c.h,
         1536,
         false,
         true,
         gqk.b.a().a(Q).a(new gqj.n($$0, bas.b, false)).a(new gqj.j($$1, $$2)).a(d).a(aC).a(ax).a(az).a(false)
      );
   }

   public static gqk h() {
      return bC;
   }

   public static gqk i() {
      return bD;
   }

   public static gqk s(alg $$0) {
      return gqk.a.bf.apply($$0, aC);
   }

   public static gqk j() {
      return bE;
   }

   public static gqk k() {
      return bF;
   }

   public static gqk l() {
      return bG;
   }

   public static gqk m() {
      return bH;
   }

   public static gqk t(alg $$0) {
      return bI.apply($$0);
   }

   public static gqk u(alg $$0) {
      return bJ.apply($$0);
   }

   public static gqk n() {
      return bK;
   }

   public static gqk v(alg $$0) {
      return bL.apply($$0);
   }

   public static gqk w(alg $$0) {
      return bM.apply($$0);
   }

   public static gqk x(alg $$0) {
      return bN.apply($$0);
   }

   public static gqk y(alg $$0) {
      return bO.apply($$0);
   }

   public static gqk o() {
      return bP;
   }

   public static gqk z(alg $$0) {
      return bQ.apply($$0);
   }

   public static gqk p() {
      return bR;
   }

   public static gqk q() {
      return bS;
   }

   public static gqk r() {
      return bT;
   }

   private static gqk.b ab() {
      return gqk.b.a().a(ax).a(ag).a(ar).a(i).a(aT).a(true);
   }

   public static gqk s() {
      return bU;
   }

   public static gqk t() {
      return bV;
   }

   public static gqk u() {
      return bW;
   }

   private static gqk.a a(boolean $$0, boolean $$1) {
      return a("clouds", fjh.f, fjo.c.h, 786432, false, false, gqk.b.a().a(ak).a(i).a($$1 ? aB : aC).a($$0 ? aJ : aH).a(aU).a(true));
   }

   public static gqk v() {
      return bX;
   }

   public static gqk w() {
      return bY;
   }

   public static gqk x() {
      return bZ;
   }

   public static gqk y() {
      return bc;
   }

   public static gqk z() {
      return bd;
   }

   public static gqk A() {
      return be;
   }

   public static gqk a(double $$0) {
      return ca.apply($$0);
   }

   public static gqk B() {
      return cb;
   }

   public static gqk C() {
      return cc;
   }

   public static gqk D() {
      return cd;
   }

   public static gqk E() {
      return ce;
   }

   public static gqk F() {
      return cf;
   }

   public static gqk G() {
      return cg;
   }

   public static gqk A(alg $$0) {
      return ch.apply($$0);
   }

   public static gqk B(alg $$0) {
      return ci.apply($$0);
   }

   private static Function<alg, gqk> a(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fjh.d, fjo.c.h, 1536, false, false, gqk.b.a().a(u).a(new gqj.n($$1, bas.b, false)).a(i).a(aT).a(ax).a($$0 ? aH : aI).a(aC).a(false)
            )
      );
   }

   public static gqk f(alg $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gqk H() {
      return cl;
   }

   public static gqk I() {
      return cm;
   }

   public static gqk J() {
      return cn;
   }

   public static gqk K() {
      return co;
   }

   public static gqk C(alg $$0) {
      return cp.apply($$0);
   }

   public static gqk D(alg $$0) {
      return cq.apply($$0);
   }

   public static gqk E(alg $$0) {
      return cr.apply($$0);
   }

   public static gqk L() {
      return cs;
   }

   public static gqk M() {
      return ct;
   }

   public static gqk F(alg $$0) {
      return cu.apply($$0);
   }

   public static gqk G(alg $$0) {
      return cv.apply($$0);
   }

   public static gqk N() {
      return cw;
   }

   public static gqk O() {
      return cx;
   }

   public static gqk P() {
      return cy;
   }

   public static gqk H(alg $$0) {
      return cz.apply($$0);
   }

   public static gqk I(alg $$0) {
      return cA.apply($$0);
   }

   public static gqk J(alg $$0) {
      return cB.apply($$0);
   }

   public static gqk Q() {
      return cC;
   }

   public gqk(String $$0, fjo $$1, fjo.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gqk.a a(String $$0, fjo $$1, fjo.c $$2, int $$3, gqk.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gqk.a a(String $$0, fjo $$1, fjo.c $$2, int $$3, boolean $$4, boolean $$5, gqk.b $$6) {
      return new gqk.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fji $$0) {
      this.a();
      fjm $$1 = $$0.c().a().i();
      $$1.a();
      $$1.a($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gqk> R() {
      return cD;
   }

   public int S() {
      return this.cG;
   }

   public fjo T() {
      return this.cE;
   }

   public fjo.c U() {
      return this.cF;
   }

   public Optional<gqk> V() {
      return Optional.empty();
   }

   public boolean W() {
      return false;
   }

   public boolean X() {
      return this.cH;
   }

   public boolean Y() {
      return !this.cF.l;
   }

   public boolean Z() {
      return this.cI;
   }

   static final class a extends gqk {
      static final BiFunction<alg, gqj.c, gqk> bf = af.a(
         ($$0, $$1) -> gqk.a("outline", fjh.j, fjo.c.h, 1536, gqk.b.a().a(T).a(new gqj.n($$0, bas.b, false)).a($$1).a(aD).a(aQ).a(gqk.c.b))
      );
      private final gqk.b bg;
      private final Optional<gqk> bh;
      private final boolean bi;

      a(String $$0, fjo $$1, fjo.c $$2, int $$3, boolean $$4, boolean $$5, gqk.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gqj::a), () -> $$6.o.forEach(gqj::b));
         this.bg = $$6;
         this.bh = $$6.n == gqk.c.c ? $$6.a.c().map($$1x -> bf.apply($$1x, $$6.e)) : Optional.empty();
         this.bi = $$6.n == gqk.c.b;
      }

      @Override
      public Optional<gqk> V() {
         return this.bh;
      }

      @Override
      public boolean W() {
         return this.bi;
      }

      protected final gqk.b aa() {
         return this.bg;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bg + "]";
      }
   }

   protected static final class b {
      final gqj.e a;
      private final gqj.m b;
      private final gqj.p c;
      private final gqj.d d;
      final gqj.c e;
      private final gqj.g f;
      private final gqj.l g;
      private final gqj.f h;
      private final gqj.k i;
      private final gqj.o j;
      private final gqj.q k;
      private final gqj.h l;
      private final gqj.b m;
      final gqk.c n;
      final ImmutableList<gqj> o;

      b(
         gqj.e $$0,
         gqj.m $$1,
         gqj.p $$2,
         gqj.d $$3,
         gqj.c $$4,
         gqj.g $$5,
         gqj.l $$6,
         gqj.f $$7,
         gqj.k $$8,
         gqj.o $$9,
         gqj.q $$10,
         gqj.h $$11,
         gqj.b $$12,
         gqk.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gqj[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gqk.b.a a() {
         return new gqk.b.a();
      }

      public static class a {
         private gqj.e a = gqj.at;
         private gqj.m b = gqj.n;
         private gqj.p c;
         private gqj.d d;
         private gqj.c e;
         private gqj.g f;
         private gqj.l g;
         private gqj.f h;
         private gqj.k i;
         private gqj.o j;
         private gqj.q k;
         private gqj.h l;
         private gqj.b m;

         a() {
            this.c = gqj.c;
            this.d = gqj.aF;
            this.e = gqj.aB;
            this.f = gqj.ay;
            this.g = gqj.aA;
            this.h = gqj.aK;
            this.i = gqj.aP;
            this.j = gqj.au;
            this.k = gqj.aH;
            this.l = gqj.aW;
            this.m = gqj.aX;
         }

         public gqk.b.a a(gqj.e $$0) {
            this.a = $$0;
            return this;
         }

         public gqk.b.a a(gqj.m $$0) {
            this.b = $$0;
            return this;
         }

         public gqk.b.a a(gqj.p $$0) {
            this.c = $$0;
            return this;
         }

         public gqk.b.a a(gqj.d $$0) {
            this.d = $$0;
            return this;
         }

         public gqk.b.a a(gqj.c $$0) {
            this.e = $$0;
            return this;
         }

         public gqk.b.a a(gqj.g $$0) {
            this.f = $$0;
            return this;
         }

         public gqk.b.a a(gqj.l $$0) {
            this.g = $$0;
            return this;
         }

         public gqk.b.a a(gqj.f $$0) {
            this.h = $$0;
            return this;
         }

         public gqk.b.a a(gqj.k $$0) {
            this.i = $$0;
            return this;
         }

         public gqk.b.a a(gqj.o $$0) {
            this.j = $$0;
            return this;
         }

         public gqk.b.a a(gqj.q $$0) {
            this.k = $$0;
            return this;
         }

         public gqk.b.a a(gqj.h $$0) {
            this.l = $$0;
            return this;
         }

         public gqk.b.a a(gqj.b $$0) {
            this.m = $$0;
            return this;
         }

         public gqk.b a(boolean $$0) {
            return this.a($$0 ? gqk.c.c : gqk.c.a);
         }

         public gqk.b a(gqk.c $$0) {
            return new gqk.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
