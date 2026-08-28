import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class glq extends glp {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final glq bf = a("solid", fgj.b, fgq.c.h, 4194304, true, false, glq.b.a().a(aw).a(v).a(aq).a(true));
   private static final glq bg = a("cutout_mipped", fgj.b, fgq.c.h, 4194304, true, false, glq.b.a().a(aw).a(w).a(aq).a(true));
   private static final glq bh = a("cutout", fgj.b, fgq.c.h, 786432, true, false, glq.b.a().a(aw).a(x).a(ar).a(true));
   private static final glq bi = a("translucent", fgj.b, fgq.c.h, 786432, true, true, a(y));
   private static final glq bj = a("translucent_moving_block", fgj.b, fgq.c.h, 786432, false, true, Z());
   private static final Function<alp, glq> bk = ae.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<alp, glq> bl = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(B).a(new glp.n($$0, bay.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fgj.c, fgq.c.h, 1536, true, true, $$1);
   });
   private static final Function<alp, glq> bm = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(C).a(new glp.n($$0, bay.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final Function<alp, glq> bn = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(C).a(new glp.n($$0, bay.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final Function<alp, glq> bo = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(D).a(new glp.n($$0, bay.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fgj.c, fgq.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<alp, Boolean, glq> bp = ae.a(($$0, $$1) -> {
      glq.b $$2 = glq.b.a().a(E).a(new glp.n($$0, bay.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fgj.c, fgq.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<alp, Boolean, glq> bq = ae.a(($$0, $$1) -> {
      glq.b $$2 = glq.b.a().a(F).a(new glp.n($$0, bay.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fgj.c, fgq.c.h, 1536, true, false, $$2);
   });
   private static final Function<alp, glq> br = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(G).a(new glp.n($$0, bay.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fgj.c, fgq.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<alp, Boolean, glq> bs = ae.a(($$0, $$1) -> {
      glq.b $$2 = glq.b.a().a(H).a(new glp.n($$0, bay.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fgj.c, fgq.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<alp, Boolean, glq> bt = ae.a(($$0, $$1) -> {
      glq.b $$2 = glq.b.a().a(I).a(new glp.n($$0, bay.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fgj.c, fgq.c.h, 1536, true, true, $$2);
   });
   private static final Function<alp, glq> bu = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(J).a(new glp.n($$0, bay.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final BiFunction<alp, Boolean, glq> bv = ae.a(($$0, $$1) -> {
      glq.b $$2 = glq.b.a().a(K).a(new glp.n($$0, bay.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fgj.b, fgq.c.h, 1536, false, true, $$2);
   });
   private static final Function<alp, glq> bw = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(L).a(new glp.n($$0, bay.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final Function<alp, glq> bx = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(M).a(new glp.n($$0, bay.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fgj.c, fgq.c.h, 1536, false, true, $$1);
   });
   private static final Function<alp, glq> by = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(N).a(new glp.n($$0, bay.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fgj.c, fgq.c.h, 1536, false, false, $$1);
   });
   private static final Function<alp, glq> bz = ae.b($$0 -> {
      glq.b $$1 = glq.b.a().a(O).a(new glp.n($$0, bay.b, false)).a(aB).a(true);
      return a("entity_alpha", fgj.c, fgq.c.h, 1536, $$1);
   });
   private static final BiFunction<alp, glp.p, glq> bA = ae.a(($$0, $$1) -> {
      glp.n $$2 = new glp.n($$0, bay.b, false);
      return a("eyes", fgj.c, fgq.c.h, 1536, false, true, glq.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final glq bB = a("leash", fgj.h, fgq.c.f, 1536, glq.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final glq bC = a("water_mask", fgj.e, fgq.c.h, 1536, glq.b.a().a(S).a(as).a(aI).a(false));
   private static final glq bD = a(
      "armor_entity_glint", fgj.i, fgq.c.h, 1536, glq.b.a().a(U).a(new glp.n(gsj.a, bay.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final glq bE = a(
      "glint_translucent", fgj.i, fgq.c.h, 1536, glq.b.a().a(V).a(new glp.n(gsj.b, bay.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final glq bF = a("glint", fgj.i, fgq.c.h, 1536, glq.b.a().a(W).a(new glp.n(gsj.b, bay.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final glq bG = a("entity_glint", fgj.i, fgq.c.h, 1536, glq.b.a().a(X).a(new glp.n(gsj.a, bay.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<alp, glq> bH = ae.b($$0 -> {
      glp.n $$1 = new glp.n($$0, bay.b, false);
      return a("crumbling", fgj.b, fgq.c.h, 1536, false, true, glq.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<alp, glq> bI = ae.b(
      $$0 -> a("text", fgj.k, fgq.c.h, 786432, false, false, glq.b.a().a(Z).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(false))
   );
   private static final glq bJ = a("text_background", fgj.h, fgq.c.h, 1536, false, true, glq.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<alp, glq> bK = ae.b(
      $$0 -> a("text_intensity", fgj.k, fgq.c.h, 786432, false, false, glq.b.a().a(ab).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<alp, glq> bL = ae.b(
      $$0 -> a("text_polygon_offset", fgj.k, fgq.c.h, 1536, false, true, glq.b.a().a(Z).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<alp, glq> bM = ae.b(
      $$0 -> a("text_intensity_polygon_offset", fgj.k, fgq.c.h, 1536, false, true, glq.b.a().a(ab).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<alp, glq> bN = ae.b(
      $$0 -> a("text_see_through", fgj.k, fgq.c.h, 1536, false, false, glq.b.a().a(ac).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final glq bO = a("text_background_see_through", fgj.h, fgq.c.h, 1536, false, true, glq.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<alp, glq> bP = ae.b(
      $$0 -> a("text_intensity_see_through", fgj.k, fgq.c.h, 1536, false, true, glq.b.a().a(ae).a(new glp.n($$0, bay.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final glq bQ = a("lightning", fgj.f, fgq.c.h, 1536, false, true, glq.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final glq bR = a("dragon_rays", fgj.f, fgq.c.e, 1536, false, false, glq.b.a().a(af).a(aH).a(e).a(false));
   private static final glq bS = a("dragon_rays_depth", fgj.e, fgq.c.e, 1536, false, false, glq.b.a().a(p).a(aI).a(false));
   private static final glq bT = a("tripwire", fgj.b, fgq.c.h, 1536, true, true, aa());
   private static final glq bU = a(
      "end_portal", fgj.e, fgq.c.h, 1536, false, false, glq.b.a().a(ah).a(glp.i.d().a(gok.a, false, false).a(gok.b, false, false).a()).a(false)
   );
   private static final glq bV = a(
      "end_gateway", fgj.e, fgq.c.h, 1536, false, false, glq.b.a().a(ai).a(glp.i.d().a(gok.a, false, false).a(gok.b, false, false).a()).a(false)
   );
   private static final glq bW = a(false, false);
   private static final glq bX = a(false, true);
   private static final glq bY = a(true, true);
   public static final glq.a bb = a("lines", fgj.g, fgq.c.a, 1536, glq.b.a().a(ak).a(new glp.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final glq.a bc = a(
      "secondary_block_outline", fgj.g, fgq.c.a, 1536, glq.b.a().a(ak).a(new glp.h(OptionalDouble.of(7.0))).a(aL).a(glp.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final glq.a bd = a(
      "line_strip", fgj.g, fgq.c.b, 1536, glq.b.a().a(ak).a(new glp.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, glq.a> bZ = ae.b(
      $$0 -> a("debug_line_strip", fgj.f, fgq.c.d, 1536, glq.b.a().a(s).a(new glp.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final glq.a ca = a("debug_filled_box", fgj.f, fgq.c.f, 1536, false, true, glq.b.a().a(s).a(aL).a(i).a(false));
   private static final glq.a cb = a("debug_quads", fgj.f, fgq.c.h, 1536, false, true, glq.b.a().a(s).a(i).a(aB).a(false));
   private static final glq.a cc = a("debug_triangle_fan", fgj.f, fgq.c.g, 1536, false, true, glq.b.a().a(s).a(i).a(aB).a(false));
   private static final glq.a cd = a("debug_structure_quads", fgj.f, fgq.c.h, 1536, false, true, glq.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final glq.a ce = a("debug_section_quads", fgj.f, fgq.c.h, 1536, false, true, glq.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final glq cf = b(false);
   private static final glq cg = b(true);
   private static final Function<alp, glq> ch = ae.b(
      $$0 -> a("opaque_particle", fgj.d, fgq.c.h, 1536, false, false, glq.b.a().a(u).a(new glp.n($$0, bay.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<alp, glq> ci = ae.b(
      $$0 -> a("translucent_particle", fgj.d, fgq.c.h, 1536, false, false, glq.b.a().a(u).a(new glp.n($$0, bay.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<alp, glq> cj = c(true);
   private static final Function<alp, glq> ck = c(false);
   private static final glq cl = a("sky", fgj.e, fgq.c.h, 1536, false, false, glq.b.a().a(p).a(aH).a(false));
   private static final glq cm = a("end_sky", fgj.j, fgq.c.h, 1536, false, false, glq.b.a().a(t).a(new glp.n(gmc.a, bay.b, false)).a(i).a(aH).a(false));
   private static final glq cn = a("sunrise_sunset", fgj.f, fgq.c.g, 1536, false, false, glq.b.a().a(s).a(i).a(aH).a(false));
   private static final glq co = a("stars", fgj.e, fgq.c.h, 1536, false, false, glq.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<alp, glq> cp = ae.b(
      $$0 -> a("celestial", fgj.j, fgq.c.h, 1536, false, false, glq.b.a().a(t).a(new glp.n($$0, bay.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<alp, glq> cq = ae.b(
      $$0 -> a("block_screen_effect", fgj.j, fgq.c.h, 1536, false, false, glq.b.a().a(t).a(new glp.n($$0, bay.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<alp, glq> cr = ae.b(
      $$0 -> a("fire_screen_effect", fgj.j, fgq.c.h, 1536, false, false, glq.b.a().a(t).a(new glp.n($$0, bay.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final glq.a cs = a("gui", fgj.f, fgq.c.h, 786432, glq.b.a().a(al).a(i).a(aE).a(false));
   private static final glq.a ct = a("gui_overlay", fgj.f, fgq.c.h, 1536, glq.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<alp, glq> cu = ae.b(
      $$0 -> a("gui_textured_overlay", fgj.j, fgq.c.h, 1536, glq.b.a().a(new glp.n($$0, bay.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<alp, glq> cv = ae.b(
      $$0 -> a("gui_opaque_textured_background", fgj.j, fgq.c.h, 786432, glq.b.a().a(new glp.n($$0, bay.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final glq.a cw = a("gui_nausea_overlay", fgj.j, fgq.c.h, 1536, glq.b.a().a(new glp.n(fnk.a, bay.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final glq.a cx = a("gui_text_highlight", fgj.f, fgq.c.h, 1536, glq.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final glq.a cy = a("gui_ghost_recipe_overlay", fgj.f, fgq.c.h, 1536, glq.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<alp, glq> cz = ae.b(
      $$0 -> a("gui_textured", fgj.j, fgq.c.h, 786432, glq.b.a().a(new glp.n($$0, bay.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<alp, glq> cA = ae.b(
      $$0 -> a("vignette", fgj.j, fgq.c.h, 786432, glq.b.a().a(new glp.n($$0, bay.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<alp, glq> cB = ae.b(
      $$0 -> a("crosshair", fgj.j, fgq.c.h, 786432, glq.b.a().a(new glp.n($$0, bay.b, false)).a(t).a(k).a(false))
   );
   private static final glq.a cC = a("mojang_logo", fgj.j, fgq.c.h, 786432, glq.b.a().a(new glp.n(fth.a, bay.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<glq> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fgq cE;
   private final fgq.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static glq c() {
      return bf;
   }

   public static glq d() {
      return bg;
   }

   public static glq e() {
      return bh;
   }

   private static glq.b a(glp.m $$0) {
      return glq.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static glq f() {
      return bi;
   }

   private static glq.b Z() {
      return glq.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static glq g() {
      return bj;
   }

   private static glq.a a(String $$0, alp $$1, boolean $$2) {
      glq.b $$3 = glq.b.a().a(A).a(new glp.n($$1, bay.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fgj.c, fgq.c.h, 1536, true, false, $$3);
   }

   public static glq a(alp $$0) {
      return bk.apply($$0);
   }

   public static glq b(alp $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static glq c(alp $$0) {
      return bl.apply($$0);
   }

   public static glq d(alp $$0) {
      return bm.apply($$0);
   }

   public static glq e(alp $$0) {
      return bn.apply($$0);
   }

   public static glq f(alp $$0) {
      return bo.apply($$0);
   }

   public static glq a(alp $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static glq g(alp $$0) {
      return a($$0, true);
   }

   public static glq b(alp $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static glq h(alp $$0) {
      return b($$0, true);
   }

   public static glq i(alp $$0) {
      return br.apply($$0);
   }

   public static glq c(alp $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static glq j(alp $$0) {
      return c($$0, true);
   }

   public static glq d(alp $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static glq k(alp $$0) {
      return d($$0, true);
   }

   public static glq l(alp $$0) {
      return bu.apply($$0);
   }

   public static glq e(alp $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static glq m(alp $$0) {
      return bw.apply($$0);
   }

   public static glq n(alp $$0) {
      return bx.apply($$0);
   }

   public static glq o(alp $$0) {
      return by.apply($$0);
   }

   public static glq p(alp $$0) {
      return bz.apply($$0);
   }

   public static glq q(alp $$0) {
      return bA.apply($$0, i);
   }

   public static glq r(alp $$0) {
      return bt.apply($$0, false);
   }

   public static glq a(alp $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fgj.c,
         fgq.c.h,
         1536,
         false,
         true,
         glq.b.a().a(ap).a(new glp.n($$0, bay.b, false)).a(new glp.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static glq b(alp $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fgj.c,
         fgq.c.h,
         1536,
         false,
         true,
         glq.b.a().a(Q).a(new glp.n($$0, bay.b, false)).a(new glp.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static glq h() {
      return bB;
   }

   public static glq i() {
      return bC;
   }

   public static glq s(alp $$0) {
      return glq.a.be.apply($$0, aB);
   }

   public static glq j() {
      return bD;
   }

   public static glq k() {
      return bE;
   }

   public static glq l() {
      return bF;
   }

   public static glq m() {
      return bG;
   }

   public static glq t(alp $$0) {
      return bH.apply($$0);
   }

   public static glq u(alp $$0) {
      return bI.apply($$0);
   }

   public static glq n() {
      return bJ;
   }

   public static glq v(alp $$0) {
      return bK.apply($$0);
   }

   public static glq w(alp $$0) {
      return bL.apply($$0);
   }

   public static glq x(alp $$0) {
      return bM.apply($$0);
   }

   public static glq y(alp $$0) {
      return bN.apply($$0);
   }

   public static glq o() {
      return bO;
   }

   public static glq z(alp $$0) {
      return bP.apply($$0);
   }

   public static glq p() {
      return bQ;
   }

   public static glq q() {
      return bR;
   }

   public static glq r() {
      return bS;
   }

   private static glq.b aa() {
      return glq.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static glq s() {
      return bT;
   }

   public static glq t() {
      return bU;
   }

   public static glq u() {
      return bV;
   }

   private static glq.a a(boolean $$0, boolean $$1) {
      return a("clouds", fgj.f, fgq.c.h, 786432, false, false, glq.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static glq v() {
      return bW;
   }

   public static glq w() {
      return bX;
   }

   public static glq x() {
      return bY;
   }

   public static glq y() {
      return bb;
   }

   public static glq z() {
      return bc;
   }

   public static glq A() {
      return bd;
   }

   public static glq a(double $$0) {
      return bZ.apply($$0);
   }

   public static glq B() {
      return ca;
   }

   public static glq C() {
      return cb;
   }

   public static glq D() {
      return cc;
   }

   public static glq E() {
      return cd;
   }

   public static glq F() {
      return ce;
   }

   private static glq b(boolean $$0) {
      return a(
         "world_border",
         fgj.i,
         fgq.c.h,
         1536,
         false,
         false,
         glq.b.a().a(q).a(new glp.n(gmh.a, bay.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static glq a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static glq A(alp $$0) {
      return ch.apply($$0);
   }

   public static glq B(alp $$0) {
      return ci.apply($$0);
   }

   private static Function<alp, glq> c(boolean $$0) {
      return ae.b(
         $$1 -> a(
               "weather", fgj.d, fgq.c.h, 1536, false, false, glq.b.a().a(u).a(new glp.n($$1, bay.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static glq f(alp $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static glq G() {
      return cl;
   }

   public static glq H() {
      return cm;
   }

   public static glq I() {
      return cn;
   }

   public static glq J() {
      return co;
   }

   public static glq C(alp $$0) {
      return cp.apply($$0);
   }

   public static glq D(alp $$0) {
      return cq.apply($$0);
   }

   public static glq E(alp $$0) {
      return cr.apply($$0);
   }

   public static glq K() {
      return cs;
   }

   public static glq L() {
      return ct;
   }

   public static glq F(alp $$0) {
      return cu.apply($$0);
   }

   public static glq G(alp $$0) {
      return cv.apply($$0);
   }

   public static glq M() {
      return cw;
   }

   public static glq N() {
      return cx;
   }

   public static glq O() {
      return cy;
   }

   public static glq H(alp $$0) {
      return cz.apply($$0);
   }

   public static glq I(alp $$0) {
      return cA.apply($$0);
   }

   public static glq J(alp $$0) {
      return cB.apply($$0);
   }

   public static glq P() {
      return cC;
   }

   public glq(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static glq.a a(String $$0, fgq $$1, fgq.c $$2, int $$3, glq.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static glq.a a(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, glq.b $$6) {
      return new glq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
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

   public static List<glq> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fgq S() {
      return this.cE;
   }

   public fgq.c T() {
      return this.cF;
   }

   public Optional<glq> U() {
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

   static final class a extends glq {
      static final BiFunction<alp, glp.c, glq> be = ae.a(
         ($$0, $$1) -> glq.a("outline", fgj.j, fgq.c.h, 1536, glq.b.a().a(T).a(new glp.n($$0, bay.b, false)).a($$1).a(aC).a(aP).a(glq.c.b))
      );
      private final glq.b bf;
      private final Optional<glq> bg;
      private final boolean bh;

      a(String $$0, fgq $$1, fgq.c $$2, int $$3, boolean $$4, boolean $$5, glq.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(glp::a), () -> $$6.o.forEach(glp::b));
         this.bf = $$6;
         this.bg = $$6.n == glq.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == glq.c.b;
      }

      @Override
      public Optional<glq> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final glq.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final glp.e a;
      private final glp.m b;
      private final glp.p c;
      private final glp.d d;
      final glp.c e;
      private final glp.g f;
      private final glp.l g;
      private final glp.f h;
      private final glp.k i;
      private final glp.o j;
      private final glp.q k;
      private final glp.h l;
      private final glp.b m;
      final glq.c n;
      final ImmutableList<glp> o;

      b(
         glp.e $$0,
         glp.m $$1,
         glp.p $$2,
         glp.d $$3,
         glp.c $$4,
         glp.g $$5,
         glp.l $$6,
         glp.f $$7,
         glp.k $$8,
         glp.o $$9,
         glp.q $$10,
         glp.h $$11,
         glp.b $$12,
         glq.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new glp[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static glq.b.a a() {
         return new glq.b.a();
      }

      public static class a {
         private glp.e a = glp.as;
         private glp.m b = glp.n;
         private glp.p c;
         private glp.d d;
         private glp.c e;
         private glp.g f;
         private glp.l g;
         private glp.f h;
         private glp.k i;
         private glp.o j;
         private glp.q k;
         private glp.h l;
         private glp.b m;

         a() {
            this.c = glp.c;
            this.d = glp.aE;
            this.e = glp.aA;
            this.f = glp.ax;
            this.g = glp.az;
            this.h = glp.aJ;
            this.i = glp.aO;
            this.j = glp.at;
            this.k = glp.aG;
            this.l = glp.aV;
            this.m = glp.aW;
         }

         public glq.b.a a(glp.e $$0) {
            this.a = $$0;
            return this;
         }

         public glq.b.a a(glp.m $$0) {
            this.b = $$0;
            return this;
         }

         public glq.b.a a(glp.p $$0) {
            this.c = $$0;
            return this;
         }

         public glq.b.a a(glp.d $$0) {
            this.d = $$0;
            return this;
         }

         public glq.b.a a(glp.c $$0) {
            this.e = $$0;
            return this;
         }

         public glq.b.a a(glp.g $$0) {
            this.f = $$0;
            return this;
         }

         public glq.b.a a(glp.l $$0) {
            this.g = $$0;
            return this;
         }

         public glq.b.a a(glp.f $$0) {
            this.h = $$0;
            return this;
         }

         public glq.b.a a(glp.k $$0) {
            this.i = $$0;
            return this;
         }

         public glq.b.a a(glp.o $$0) {
            this.j = $$0;
            return this;
         }

         public glq.b.a a(glp.q $$0) {
            this.k = $$0;
            return this;
         }

         public glq.b.a a(glp.h $$0) {
            this.l = $$0;
            return this;
         }

         public glq.b.a a(glp.b $$0) {
            this.m = $$0;
            return this;
         }

         public glq.b a(boolean $$0) {
            return this.a($$0 ? glq.c.c : glq.c.a);
         }

         public glq.b a(glq.c $$0) {
            return new glq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
