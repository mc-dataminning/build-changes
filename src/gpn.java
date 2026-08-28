import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class gpn extends gpm {
   private static final int be = 1048576;
   public static final int aY = 4194304;
   public static final int aZ = 786432;
   public static final int ba = 1536;
   private static final gpn bf = a("solid", fio.b, fiv.c.h, 4194304, true, false, gpn.b.a().a(aw).a(v).a(aq).a(true));
   private static final gpn bg = a("cutout_mipped", fio.b, fiv.c.h, 4194304, true, false, gpn.b.a().a(aw).a(w).a(aq).a(true));
   private static final gpn bh = a("cutout", fio.b, fiv.c.h, 786432, true, false, gpn.b.a().a(aw).a(x).a(ar).a(true));
   private static final gpn bi = a("translucent", fio.b, fiv.c.h, 786432, true, true, a(y));
   private static final gpn bj = a("translucent_moving_block", fio.b, fiv.c.h, 786432, false, true, Z());
   private static final Function<ale, gpn> bk = af.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ale, gpn> bl = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(B).a(new gpm.n($$0, baq.b, false)).a(i).a(aB).a(aw).a(ay).a(aL).a(true);
      return a("armor_translucent", fio.c, fiv.c.h, 1536, true, true, $$1);
   });
   private static final Function<ale, gpn> bm = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(C).a(new gpm.n($$0, baq.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_solid", fio.c, fiv.c.h, 1536, true, false, $$1);
   });
   private static final Function<ale, gpn> bn = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(C).a(new gpm.n($$0, baq.b, false)).a(c).a(aw).a(ay).a(aM).a(true);
      return a("entity_solid_z_offset_forward", fio.c, fiv.c.h, 1536, true, false, $$1);
   });
   private static final Function<ale, gpn> bo = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(D).a(new gpm.n($$0, baq.b, false)).a(c).a(aw).a(ay).a(true);
      return a("entity_cutout", fio.c, fiv.c.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ale, Boolean, gpn> bp = af.a(($$0, $$1) -> {
      gpn.b $$2 = gpn.b.a().a(E).a(new gpm.n($$0, baq.b, false)).a(c).a(aB).a(aw).a(ay).a($$1);
      return a("entity_cutout_no_cull", fio.c, fiv.c.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ale, Boolean, gpn> bq = af.a(($$0, $$1) -> {
      gpn.b $$2 = gpn.b.a().a(F).a(new gpm.n($$0, baq.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$1);
      return a("entity_cutout_no_cull_z_offset", fio.c, fiv.c.h, 1536, true, false, $$2);
   });
   private static final Function<ale, gpn> br = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(G).a(new gpm.n($$0, baq.b, false)).a(i).a(aU).a(aw).a(ay).a(aG).a(true);
      return a("item_entity_translucent_cull", fio.c, fiv.c.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ale, Boolean, gpn> bs = af.a(($$0, $$1) -> {
      gpn.b $$2 = gpn.b.a().a(H).a(new gpm.n($$0, baq.b, false)).a(i).a(aB).a(aw).a(ay).a($$1);
      return a("entity_translucent", fio.c, fiv.c.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ale, Boolean, gpn> bt = af.a(($$0, $$1) -> {
      gpn.b $$2 = gpn.b.a().a(I).a(new gpm.n($$0, baq.b, false)).a(i).a(aB).a(aH).a(ay).a($$1);
      return a("entity_translucent_emissive", fio.c, fiv.c.h, 1536, true, true, $$2);
   });
   private static final Function<ale, gpn> bu = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(J).a(new gpm.n($$0, baq.b, false)).a(aB).a(aw).a(true);
      return a("entity_smooth_cutout", fio.c, fiv.c.h, 1536, $$1);
   });
   private static final BiFunction<ale, Boolean, gpn> bv = af.a(($$0, $$1) -> {
      gpn.b $$2 = gpn.b.a().a(K).a(new gpm.n($$0, baq.b, false)).a($$1 ? i : c).a($$1 ? aH : aG).a(false);
      return a("beacon_beam", fio.b, fiv.c.h, 1536, false, true, $$2);
   });
   private static final Function<ale, gpn> bw = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(L).a(new gpm.n($$0, baq.b, false)).a(aD).a(aB).a(aw).a(ay).a(false);
      return a("entity_decal", fio.c, fiv.c.h, 1536, $$1);
   });
   private static final Function<ale, gpn> bx = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(M).a(new gpm.n($$0, baq.b, false)).a(i).a(aB).a(aw).a(ay).a(aH).a(false);
      return a("entity_no_outline", fio.c, fiv.c.h, 1536, false, true, $$1);
   });
   private static final Function<ale, gpn> by = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(N).a(new gpm.n($$0, baq.b, false)).a(i).a(aA).a(aw).a(ay).a(aH).a(aE).a(aL).a(false);
      return a("entity_shadow", fio.c, fiv.c.h, 1536, false, false, $$1);
   });
   private static final Function<ale, gpn> bz = af.b($$0 -> {
      gpn.b $$1 = gpn.b.a().a(O).a(new gpm.n($$0, baq.b, false)).a(aB).a(true);
      return a("entity_alpha", fio.c, fiv.c.h, 1536, $$1);
   });
   private static final BiFunction<ale, gpm.p, gpn> bA = af.a(($$0, $$1) -> {
      gpm.n $$2 = new gpm.n($$0, baq.b, false);
      return a("eyes", fio.c, fiv.c.h, 1536, false, true, gpn.b.a().a(P).a($$2).a($$1).a(aH).a(false));
   });
   private static final gpn bB = a("leash", fio.h, fiv.c.f, 1536, gpn.b.a().a(R).a(as).a(aB).a(aw).a(false));
   private static final gpn bC = a("water_mask", fio.e, fiv.c.h, 1536, gpn.b.a().a(S).a(as).a(aI).a(false));
   private static final gpn bD = a(
      "armor_entity_glint", fio.i, fiv.c.h, 1536, gpn.b.a().a(U).a(new gpm.n(gwi.a, baq.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(aL).a(false)
   );
   private static final gpn bE = a(
      "glint_translucent", fio.i, fiv.c.h, 1536, gpn.b.a().a(V).a(new gpm.n(gwi.b, baq.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(aU).a(false)
   );
   private static final gpn bF = a("glint", fio.i, fiv.c.h, 1536, gpn.b.a().a(W).a(new gpm.n(gwi.b, baq.c, false)).a(aH).a(aB).a(aD).a(f).a(au).a(false));
   private static final gpn bG = a("entity_glint", fio.i, fiv.c.h, 1536, gpn.b.a().a(X).a(new gpm.n(gwi.a, baq.c, false)).a(aH).a(aB).a(aD).a(f).a(av).a(false));
   private static final Function<ale, gpn> bH = af.b($$0 -> {
      gpm.n $$1 = new gpm.n($$0, baq.b, false);
      return a("crumbling", fio.b, fiv.c.h, 1536, false, true, gpn.b.a().a(Y).a($$1).a(g).a(aH).a(aK).a(false));
   });
   private static final Function<ale, gpn> bI = af.b(
      $$0 -> a("text", fio.k, fiv.c.h, 786432, false, false, gpn.b.a().a(Z).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(false))
   );
   private static final gpn bJ = a("text_background", fio.h, fiv.c.h, 1536, false, true, gpn.b.a().a(aa).a(as).a(i).a(aw).a(false));
   private static final Function<ale, gpn> bK = af.b(
      $$0 -> a("text_intensity", fio.k, fiv.c.h, 786432, false, false, gpn.b.a().a(ab).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(false))
   );
   private static final Function<ale, gpn> bL = af.b(
      $$0 -> a("text_polygon_offset", fio.k, fiv.c.h, 1536, false, true, gpn.b.a().a(Z).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<ale, gpn> bM = af.b(
      $$0 -> a("text_intensity_polygon_offset", fio.k, fiv.c.h, 1536, false, true, gpn.b.a().a(ab).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(aK).a(false))
   );
   private static final Function<ale, gpn> bN = af.b(
      $$0 -> a("text_see_through", fio.k, fiv.c.h, 1536, false, false, gpn.b.a().a(ac).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gpn bO = a("text_background_see_through", fio.h, fiv.c.h, 1536, false, true, gpn.b.a().a(ad).a(as).a(i).a(aw).a(aC).a(aH).a(false));
   private static final Function<ale, gpn> bP = af.b(
      $$0 -> a("text_intensity_see_through", fio.k, fiv.c.h, 1536, false, true, gpn.b.a().a(ae).a(new gpm.n($$0, baq.b, false)).a(i).a(aw).a(aC).a(aH).a(false))
   );
   private static final gpn bQ = a("lightning", fio.f, fiv.c.h, 1536, false, true, gpn.b.a().a(af).a(aG).a(e).a(aS).a(false));
   private static final gpn bR = a("dragon_rays", fio.f, fiv.c.e, 1536, false, false, gpn.b.a().a(af).a(aH).a(e).a(false));
   private static final gpn bS = a("dragon_rays_depth", fio.e, fiv.c.e, 1536, false, false, gpn.b.a().a(p).a(aI).a(false));
   private static final gpn bT = a("tripwire", fio.b, fiv.c.h, 1536, true, true, aa());
   private static final gpn bU = a(
      "end_portal", fio.e, fiv.c.h, 1536, false, false, gpn.b.a().a(ah).a(gpm.i.d().a(gsj.a, false, false).a(gsj.b, false, false).a()).a(false)
   );
   private static final gpn bV = a(
      "end_gateway", fio.e, fiv.c.h, 1536, false, false, gpn.b.a().a(ai).a(gpm.i.d().a(gsj.a, false, false).a(gsj.b, false, false).a()).a(false)
   );
   private static final gpn bW = a(false, false);
   private static final gpn bX = a(false, true);
   private static final gpn bY = a(true, true);
   public static final gpn.a bb = a("lines", fio.g, fiv.c.a, 1536, gpn.b.a().a(ak).a(new gpm.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false));
   public static final gpn.a bc = a(
      "secondary_block_outline", fio.g, fiv.c.a, 1536, gpn.b.a().a(ak).a(new gpm.h(OptionalDouble.of(7.0))).a(aL).a(gpm.i).a(aU).a(aH).a(aB).a(false)
   );
   public static final gpn.a bd = a(
      "line_strip", fio.g, fiv.c.b, 1536, gpn.b.a().a(ak).a(new gpm.h(OptionalDouble.empty())).a(aL).a(i).a(aU).a(aG).a(aB).a(false)
   );
   private static final Function<Double, gpn.a> bZ = af.b(
      $$0 -> a("debug_line_strip", fio.f, fiv.c.d, 1536, gpn.b.a().a(s).a(new gpm.h(OptionalDouble.of($$0))).a(c).a(aB).a(false))
   );
   private static final gpn.a ca = a("debug_filled_box", fio.f, fiv.c.f, 1536, false, true, gpn.b.a().a(s).a(aL).a(i).a(false));
   private static final gpn.a cb = a("debug_quads", fio.f, fiv.c.h, 1536, false, true, gpn.b.a().a(s).a(i).a(aB).a(false));
   private static final gpn.a cc = a("debug_triangle_fan", fio.f, fiv.c.g, 1536, false, true, gpn.b.a().a(s).a(i).a(aB).a(false));
   private static final gpn.a cd = a("debug_structure_quads", fio.f, fiv.c.h, 1536, false, true, gpn.b.a().a(s).a(i).a(aB).a(aE).a(aH).a(false));
   private static final gpn.a ce = a("debug_section_quads", fio.f, fiv.c.h, 1536, false, true, gpn.b.a().a(s).a(aL).a(i).a(aA).a(false));
   private static final gpn cf = b(false);
   private static final gpn cg = b(true);
   private static final Function<ale, gpn> ch = af.b(
      $$0 -> a("opaque_particle", fio.d, fiv.c.h, 1536, false, false, gpn.b.a().a(u).a(new gpm.n($$0, baq.b, false)).a(aw).a(aG).a(false))
   );
   private static final Function<ale, gpn> ci = af.b(
      $$0 -> a("translucent_particle", fio.d, fiv.c.h, 1536, false, false, gpn.b.a().a(u).a(new gpm.n($$0, baq.b, false)).a(i).a(aR).a(aw).a(aG).a(false))
   );
   private static final Function<ale, gpn> cj = c(true);
   private static final Function<ale, gpn> ck = c(false);
   private static final gpn cl = a("sky", fio.e, fiv.c.h, 1536, false, false, gpn.b.a().a(p).a(aH).a(false));
   private static final gpn cm = a("end_sky", fio.j, fiv.c.h, 1536, false, false, gpn.b.a().a(t).a(new gpm.n(gpz.a, baq.b, false)).a(i).a(aH).a(false));
   private static final gpn cn = a("sunrise_sunset", fio.f, fiv.c.g, 1536, false, false, gpn.b.a().a(s).a(i).a(aH).a(false));
   private static final gpn co = a("stars", fio.e, fiv.c.h, 1536, false, false, gpn.b.a().a(p).a(h).a(aH).a(false));
   private static final Function<ale, gpn> cp = af.b(
      $$0 -> a("celestial", fio.j, fiv.c.h, 1536, false, false, gpn.b.a().a(t).a(new gpm.n($$0, baq.b, false)).a(h).a(aH).a(false))
   );
   private static final Function<ale, gpn> cq = af.b(
      $$0 -> a("block_screen_effect", fio.j, fiv.c.h, 1536, false, false, gpn.b.a().a(t).a(new gpm.n($$0, baq.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final Function<ale, gpn> cr = af.b(
      $$0 -> a("fire_screen_effect", fio.j, fiv.c.h, 1536, false, false, gpn.b.a().a(t).a(new gpm.n($$0, baq.b, false)).a(aC).a(aH).a(i).a(false))
   );
   private static final gpn.a cs = a("gui", fio.f, fiv.c.h, 786432, gpn.b.a().a(al).a(i).a(aE).a(false));
   private static final gpn.a ct = a("gui_overlay", fio.f, fiv.c.h, 1536, gpn.b.a().a(am).a(i).a(aC).a(aH).a(false));
   private static final Function<ale, gpn> cu = af.b(
      $$0 -> a("gui_textured_overlay", fio.j, fiv.c.h, 1536, gpn.b.a().a(new gpm.n($$0, baq.c, false)).a(t).a(i).a(aC).a(aH).a(false))
   );
   private static final Function<ale, gpn> cv = af.b(
      $$0 -> a("gui_opaque_textured_background", fio.j, fiv.c.h, 786432, gpn.b.a().a(new gpm.n($$0, baq.b, false)).a(t).a(c).a(aE).a(false))
   );
   private static final gpn.a cw = a("gui_nausea_overlay", fio.j, fiv.c.h, 1536, gpn.b.a().a(new gpm.n(frb.a, baq.c, false)).a(t).a(m).a(aC).a(aH).a(false));
   private static final gpn.a cx = a("gui_text_highlight", fio.f, fiv.c.h, 1536, gpn.b.a().a(an).a(i).a(aC).a(aX).a(false));
   private static final gpn.a cy = a("gui_ghost_recipe_overlay", fio.f, fiv.c.h, 1536, gpn.b.a().a(ao).a(i).a(aF).a(aH).a(false));
   private static final Function<ale, gpn> cz = af.b(
      $$0 -> a("gui_textured", fio.j, fiv.c.h, 786432, gpn.b.a().a(new gpm.n($$0, baq.b, false)).a(t).a(i).a(aE).a(false))
   );
   private static final Function<ale, gpn> cA = af.b(
      $$0 -> a("vignette", fio.j, fiv.c.h, 786432, gpn.b.a().a(new gpm.n($$0, baq.c, false)).a(t).a(j).a(aC).a(aH).a(false))
   );
   private static final Function<ale, gpn> cB = af.b(
      $$0 -> a("crosshair", fio.j, fiv.c.h, 786432, gpn.b.a().a(new gpm.n($$0, baq.b, false)).a(t).a(k).a(false))
   );
   private static final gpn.a cC = a("mojang_logo", fio.j, fiv.c.h, 786432, gpn.b.a().a(new gpm.n(fwy.a, baq.c, false)).a(t).a(l).a(aC).a(aH).a(false));
   private static final ImmutableList<gpn> cD = ImmutableList.of(c(), d(), e(), f(), s());
   private final fiv cE;
   private final fiv.c cF;
   private final int cG;
   private final boolean cH;
   private final boolean cI;

   public static gpn c() {
      return bf;
   }

   public static gpn d() {
      return bg;
   }

   public static gpn e() {
      return bh;
   }

   private static gpn.b a(gpm.m $$0) {
      return gpn.b.a().a(aw).a($$0).a(aq).a(i).a(aQ).a(true);
   }

   public static gpn f() {
      return bi;
   }

   private static gpn.b Z() {
      return gpn.b.a().a(aw).a(z).a(aq).a(i).a(aU).a(true);
   }

   public static gpn g() {
      return bj;
   }

   private static gpn.a a(String $$0, ale $$1, boolean $$2) {
      gpn.b $$3 = gpn.b.a().a(A).a(new gpm.n($$1, baq.b, false)).a(c).a(aB).a(aw).a(ay).a(aL).a($$2 ? aD : aE).a(true);
      return a($$0, fio.c, fiv.c.h, 1536, true, false, $$3);
   }

   public static gpn a(ale $$0) {
      return bk.apply($$0);
   }

   public static gpn b(ale $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static gpn c(ale $$0) {
      return bl.apply($$0);
   }

   public static gpn d(ale $$0) {
      return bm.apply($$0);
   }

   public static gpn e(ale $$0) {
      return bn.apply($$0);
   }

   public static gpn f(ale $$0) {
      return bo.apply($$0);
   }

   public static gpn a(ale $$0, boolean $$1) {
      return bp.apply($$0, $$1);
   }

   public static gpn g(ale $$0) {
      return a($$0, true);
   }

   public static gpn b(ale $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static gpn h(ale $$0) {
      return b($$0, true);
   }

   public static gpn i(ale $$0) {
      return br.apply($$0);
   }

   public static gpn c(ale $$0, boolean $$1) {
      return bs.apply($$0, $$1);
   }

   public static gpn j(ale $$0) {
      return c($$0, true);
   }

   public static gpn d(ale $$0, boolean $$1) {
      return bt.apply($$0, $$1);
   }

   public static gpn k(ale $$0) {
      return d($$0, true);
   }

   public static gpn l(ale $$0) {
      return bu.apply($$0);
   }

   public static gpn e(ale $$0, boolean $$1) {
      return bv.apply($$0, $$1);
   }

   public static gpn m(ale $$0) {
      return bw.apply($$0);
   }

   public static gpn n(ale $$0) {
      return bx.apply($$0);
   }

   public static gpn o(ale $$0) {
      return by.apply($$0);
   }

   public static gpn p(ale $$0) {
      return bz.apply($$0);
   }

   public static gpn q(ale $$0) {
      return bA.apply($$0, i);
   }

   public static gpn r(ale $$0) {
      return bt.apply($$0, false);
   }

   public static gpn a(ale $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         fio.c,
         fiv.c.h,
         1536,
         false,
         true,
         gpn.b.a().a(ap).a(new gpm.n($$0, baq.b, false)).a(new gpm.j($$1, $$2)).a(i).a(aB).a(aw).a(az).a(false)
      );
   }

   public static gpn b(ale $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         fio.c,
         fiv.c.h,
         1536,
         false,
         true,
         gpn.b.a().a(Q).a(new gpm.n($$0, baq.b, false)).a(new gpm.j($$1, $$2)).a(d).a(aB).a(aw).a(ay).a(false)
      );
   }

   public static gpn h() {
      return bB;
   }

   public static gpn i() {
      return bC;
   }

   public static gpn s(ale $$0) {
      return gpn.a.be.apply($$0, aB);
   }

   public static gpn j() {
      return bD;
   }

   public static gpn k() {
      return bE;
   }

   public static gpn l() {
      return bF;
   }

   public static gpn m() {
      return bG;
   }

   public static gpn t(ale $$0) {
      return bH.apply($$0);
   }

   public static gpn u(ale $$0) {
      return bI.apply($$0);
   }

   public static gpn n() {
      return bJ;
   }

   public static gpn v(ale $$0) {
      return bK.apply($$0);
   }

   public static gpn w(ale $$0) {
      return bL.apply($$0);
   }

   public static gpn x(ale $$0) {
      return bM.apply($$0);
   }

   public static gpn y(ale $$0) {
      return bN.apply($$0);
   }

   public static gpn o() {
      return bO;
   }

   public static gpn z(ale $$0) {
      return bP.apply($$0);
   }

   public static gpn p() {
      return bQ;
   }

   public static gpn q() {
      return bR;
   }

   public static gpn r() {
      return bS;
   }

   private static gpn.b aa() {
      return gpn.b.a().a(aw).a(ag).a(aq).a(i).a(aS).a(true);
   }

   public static gpn s() {
      return bT;
   }

   public static gpn t() {
      return bU;
   }

   public static gpn u() {
      return bV;
   }

   private static gpn.a a(boolean $$0, boolean $$1) {
      return a("clouds", fio.f, fiv.c.h, 786432, false, false, gpn.b.a().a(aj).a(i).a($$1 ? aA : aB).a($$0 ? aI : aG).a(aT).a(true));
   }

   public static gpn v() {
      return bW;
   }

   public static gpn w() {
      return bX;
   }

   public static gpn x() {
      return bY;
   }

   public static gpn y() {
      return bb;
   }

   public static gpn z() {
      return bc;
   }

   public static gpn A() {
      return bd;
   }

   public static gpn a(double $$0) {
      return bZ.apply($$0);
   }

   public static gpn B() {
      return ca;
   }

   public static gpn C() {
      return cb;
   }

   public static gpn D() {
      return cc;
   }

   public static gpn E() {
      return cd;
   }

   public static gpn F() {
      return ce;
   }

   private static gpn b(boolean $$0) {
      return a(
         "world_border",
         fio.i,
         fiv.c.h,
         1536,
         false,
         false,
         gpn.b.a().a(q).a(new gpm.n(gqf.a, baq.b, false)).a(h).a(aw).a(aS).a($$0 ? aG : aH).a(aN).a(aB).a(false)
      );
   }

   public static gpn a(boolean $$0) {
      return $$0 ? cg : cf;
   }

   public static gpn A(ale $$0) {
      return ch.apply($$0);
   }

   public static gpn B(ale $$0) {
      return ci.apply($$0);
   }

   private static Function<ale, gpn> c(boolean $$0) {
      return af.b(
         $$1 -> a(
               "weather", fio.d, fiv.c.h, 1536, false, false, gpn.b.a().a(u).a(new gpm.n($$1, baq.b, false)).a(i).a(aS).a(aw).a($$0 ? aG : aH).a(aB).a(false)
            )
      );
   }

   public static gpn f(ale $$0, boolean $$1) {
      return ($$1 ? cj : ck).apply($$0);
   }

   public static gpn G() {
      return cl;
   }

   public static gpn H() {
      return cm;
   }

   public static gpn I() {
      return cn;
   }

   public static gpn J() {
      return co;
   }

   public static gpn C(ale $$0) {
      return cp.apply($$0);
   }

   public static gpn D(ale $$0) {
      return cq.apply($$0);
   }

   public static gpn E(ale $$0) {
      return cr.apply($$0);
   }

   public static gpn K() {
      return cs;
   }

   public static gpn L() {
      return ct;
   }

   public static gpn F(ale $$0) {
      return cu.apply($$0);
   }

   public static gpn G(ale $$0) {
      return cv.apply($$0);
   }

   public static gpn M() {
      return cw;
   }

   public static gpn N() {
      return cx;
   }

   public static gpn O() {
      return cy;
   }

   public static gpn H(ale $$0) {
      return cz.apply($$0);
   }

   public static gpn I(ale $$0) {
      return cA.apply($$0);
   }

   public static gpn J(ale $$0) {
      return cB.apply($$0);
   }

   public static gpn P() {
      return cC;
   }

   public gpn(String $$0, fiv $$1, fiv.c $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cE = $$1;
      this.cF = $$2;
      this.cG = $$3;
      this.cH = $$4;
      this.cI = $$5;
   }

   static gpn.a a(String $$0, fiv $$1, fiv.c $$2, int $$3, gpn.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static gpn.a a(String $$0, fiv $$1, fiv.c $$2, int $$3, boolean $$4, boolean $$5, gpn.b $$6) {
      return new gpn.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fip $$0) {
      this.a();
      fim.a($$0);
      this.b();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<gpn> Q() {
      return cD;
   }

   public int R() {
      return this.cG;
   }

   public fiv S() {
      return this.cE;
   }

   public fiv.c T() {
      return this.cF;
   }

   public Optional<gpn> U() {
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

   static final class a extends gpn {
      static final BiFunction<ale, gpm.c, gpn> be = af.a(
         ($$0, $$1) -> gpn.a("outline", fio.j, fiv.c.h, 1536, gpn.b.a().a(T).a(new gpm.n($$0, baq.b, false)).a($$1).a(aC).a(aP).a(gpn.c.b))
      );
      private final gpn.b bf;
      private final Optional<gpn> bg;
      private final boolean bh;

      a(String $$0, fiv $$1, fiv.c $$2, int $$3, boolean $$4, boolean $$5, gpn.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(gpm::a), () -> $$6.o.forEach(gpm::b));
         this.bf = $$6;
         this.bg = $$6.n == gpn.c.c ? $$6.a.c().map($$1x -> be.apply($$1x, $$6.e)) : Optional.empty();
         this.bh = $$6.n == gpn.c.b;
      }

      @Override
      public Optional<gpn> U() {
         return this.bg;
      }

      @Override
      public boolean V() {
         return this.bh;
      }

      protected final gpn.b Z() {
         return this.bf;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.bf + "]";
      }
   }

   protected static final class b {
      final gpm.e a;
      private final gpm.m b;
      private final gpm.p c;
      private final gpm.d d;
      final gpm.c e;
      private final gpm.g f;
      private final gpm.l g;
      private final gpm.f h;
      private final gpm.k i;
      private final gpm.o j;
      private final gpm.q k;
      private final gpm.h l;
      private final gpm.b m;
      final gpn.c n;
      final ImmutableList<gpm> o;

      b(
         gpm.e $$0,
         gpm.m $$1,
         gpm.p $$2,
         gpm.d $$3,
         gpm.c $$4,
         gpm.g $$5,
         gpm.l $$6,
         gpm.f $$7,
         gpm.k $$8,
         gpm.o $$9,
         gpm.q $$10,
         gpm.h $$11,
         gpm.b $$12,
         gpn.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new gpm[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static gpn.b.a a() {
         return new gpn.b.a();
      }

      public static class a {
         private gpm.e a = gpm.as;
         private gpm.m b = gpm.n;
         private gpm.p c;
         private gpm.d d;
         private gpm.c e;
         private gpm.g f;
         private gpm.l g;
         private gpm.f h;
         private gpm.k i;
         private gpm.o j;
         private gpm.q k;
         private gpm.h l;
         private gpm.b m;

         a() {
            this.c = gpm.c;
            this.d = gpm.aE;
            this.e = gpm.aA;
            this.f = gpm.ax;
            this.g = gpm.az;
            this.h = gpm.aJ;
            this.i = gpm.aO;
            this.j = gpm.at;
            this.k = gpm.aG;
            this.l = gpm.aV;
            this.m = gpm.aW;
         }

         public gpn.b.a a(gpm.e $$0) {
            this.a = $$0;
            return this;
         }

         public gpn.b.a a(gpm.m $$0) {
            this.b = $$0;
            return this;
         }

         public gpn.b.a a(gpm.p $$0) {
            this.c = $$0;
            return this;
         }

         public gpn.b.a a(gpm.d $$0) {
            this.d = $$0;
            return this;
         }

         public gpn.b.a a(gpm.c $$0) {
            this.e = $$0;
            return this;
         }

         public gpn.b.a a(gpm.g $$0) {
            this.f = $$0;
            return this;
         }

         public gpn.b.a a(gpm.l $$0) {
            this.g = $$0;
            return this;
         }

         public gpn.b.a a(gpm.f $$0) {
            this.h = $$0;
            return this;
         }

         public gpn.b.a a(gpm.k $$0) {
            this.i = $$0;
            return this;
         }

         public gpn.b.a a(gpm.o $$0) {
            this.j = $$0;
            return this;
         }

         public gpn.b.a a(gpm.q $$0) {
            this.k = $$0;
            return this;
         }

         public gpn.b.a a(gpm.h $$0) {
            this.l = $$0;
            return this;
         }

         public gpn.b.a a(gpm.b $$0) {
            this.m = $$0;
            return this;
         }

         public gpn.b a(boolean $$0) {
            return this.a($$0 ? gpn.c.c : gpn.c.a);
         }

         public gpn.b a(gpn.c $$0) {
            return new gpn.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
