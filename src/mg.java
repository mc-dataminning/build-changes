import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mg extends lw {
   private static final ImmutableList<cpu> d = ImmutableList.of(cji.X, cji.Y);
   private static final ImmutableList<cpu> e = ImmutableList.of(cji.Z, cji.aa, cji.nP);
   private static final ImmutableList<cpu> f = ImmutableList.of(cji.ab, cji.ac, cji.nR);
   private static final ImmutableList<cpu> g = ImmutableList.of(cji.ad, cji.ae, cji.an, cji.nT);
   private static final ImmutableList<cpu> h = ImmutableList.of(cji.al, cji.am);
   private static final ImmutableList<cpu> i = ImmutableList.of(cji.aj, cji.ak);
   private static final ImmutableList<cpu> j = ImmutableList.of(cji.af, cji.ag);
   private static final ImmutableList<cpu> k = ImmutableList.of(cji.ah, cji.ai);

   public mg(jm $$0) {
      super($$0);
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      return CompletableFuture.allOf(super.a($$0), this.a($$0, ae.a.b().a("impossible", al.a.a(new by.a())).b(lt.a)));
   }

   @Override
   protected void a(lv $$0) {
      a($$0, cec.a(cee.a));
      a($$0, csw.r, aqb.v, 4);
      b($$0, csw.p, aqb.u, 4);
      b($$0, csw.oE, aqb.A, 4);
      a($$0, csw.t, aqb.s, 4);
      b($$0, csw.q, aqb.x, 4);
      b($$0, csw.n, aqb.t, 4);
      b($$0, csw.o, aqb.y, 4);
      b($$0, csw.oF, aqb.B, 4);
      b($$0, csw.u, aqb.z, 4);
      a($$0, csw.as, csw.Y);
      a($$0, csw.aq, csw.W);
      a($$0, csw.au, csw.aa);
      a($$0, csw.ar, csw.X);
      a($$0, csw.ao, csw.U);
      a($$0, csw.ap, csw.V);
      a($$0, csw.ou, csw.os);
      a($$0, csw.ol, csw.oj);
      a($$0, csw.av, csw.ab);
      a($$0, csw.aA, csw.ai);
      a($$0, csw.ay, csw.ag);
      a($$0, csw.aC, csw.ak);
      a($$0, csw.az, csw.ah);
      a($$0, csw.aw, csw.al);
      a($$0, csw.ax, csw.af);
      a($$0, csw.ov, csw.ot);
      a($$0, csw.om, csw.ok);
      a($$0, csw.aD, csw.am);
      b($$0, cji.nq, csw.r);
      b($$0, cji.nm, csw.p);
      b($$0, cji.nu, csw.t);
      b($$0, cji.no, csw.q);
      b($$0, cji.ni, csw.n);
      b($$0, cji.nk, csw.o);
      b($$0, cji.nw, csw.u);
      List<cja> $$1 = List.of(cji.qJ, cji.qF, cji.qG, cji.qD, cji.qB, cji.qH, cji.qx, cji.qC, cji.qz, cji.qw, cji.qv, cji.qA, cji.qE, cji.qI, cji.qy, cji.qu);
      List<cja> $$2 = List.of(cji.cN, cji.cJ, cji.cK, cji.cH, cji.cF, cji.cL, cji.cB, cji.cG, cji.cD, cji.cA, cji.cz, cji.cE, cji.cI, cji.cM, cji.cC, cji.cy);
      List<cja> $$3 = List.of(cji.rd, cji.qZ, cji.ra, cji.qX, cji.qV, cji.rb, cji.qR, cji.qW, cji.qT, cji.qQ, cji.qP, cji.qU, cji.qY, cji.rc, cji.qS, cji.qO);
      List<cja> $$4 = List.of(cji.hx, cji.ht, cji.hu, cji.hr, cji.hp, cji.hv, cji.hl, cji.hq, cji.hn, cji.hk, cji.hj, cji.ho, cji.hs, cji.hw, cji.hm, cji.hi);
      a($$0, $$1, $$2, "wool");
      a($$0, $$1, $$3, "bed");
      a($$0, $$1, $$4, "carpet");
      f($$0, csw.iz, csw.bP);
      g($$0, cji.rd, csw.bP);
      h($$0, cji.uk, csw.bP);
      f($$0, csw.iv, csw.bL);
      g($$0, cji.qZ, csw.bL);
      h($$0, cji.ug, csw.bL);
      f($$0, csw.iw, csw.bM);
      g($$0, cji.ra, csw.bM);
      h($$0, cji.uh, csw.bM);
      f($$0, csw.it, csw.bJ);
      g($$0, cji.qX, csw.bJ);
      h($$0, cji.ue, csw.bJ);
      f($$0, csw.ir, csw.bH);
      g($$0, cji.qV, csw.bH);
      h($$0, cji.uc, csw.bH);
      f($$0, csw.ix, csw.bN);
      g($$0, cji.rb, csw.bN);
      h($$0, cji.ui, csw.bN);
      f($$0, csw.in, csw.bD);
      g($$0, cji.qR, csw.bD);
      h($$0, cji.tY, csw.bD);
      f($$0, csw.is, csw.bI);
      g($$0, cji.qW, csw.bI);
      h($$0, cji.ud, csw.bI);
      f($$0, csw.ip, csw.bF);
      g($$0, cji.qT, csw.bF);
      h($$0, cji.ua, csw.bF);
      f($$0, csw.im, csw.bC);
      g($$0, cji.qQ, csw.bC);
      h($$0, cji.tX, csw.bC);
      f($$0, csw.il, csw.bB);
      g($$0, cji.qP, csw.bB);
      h($$0, cji.tW, csw.bB);
      f($$0, csw.iq, csw.bG);
      g($$0, cji.qU, csw.bG);
      h($$0, cji.ub, csw.bG);
      f($$0, csw.iu, csw.bK);
      g($$0, cji.qY, csw.bK);
      h($$0, cji.uf, csw.bK);
      f($$0, csw.iy, csw.bO);
      g($$0, cji.rc, csw.bO);
      h($$0, cji.uj, csw.bO);
      f($$0, csw.ik, csw.bA);
      g($$0, cji.qO, csw.bA);
      h($$0, cji.tV, csw.bA);
      f($$0, csw.io, csw.bE);
      g($$0, cji.qS, csw.bE);
      h($$0, cji.tZ, csw.bE);
      f($$0, csw.rz, csw.rB);
      i($$0, csw.ey, cji.qJ);
      j($$0, csw.hO, csw.ey);
      k($$0, csw.hO, cji.qJ);
      i($$0, csw.eu, cji.qF);
      j($$0, csw.hK, csw.eu);
      k($$0, csw.hK, cji.qF);
      i($$0, csw.ev, cji.qG);
      j($$0, csw.hL, csw.ev);
      k($$0, csw.hL, cji.qG);
      i($$0, csw.es, cji.qD);
      j($$0, csw.hI, csw.es);
      k($$0, csw.hI, cji.qD);
      i($$0, csw.eq, cji.qB);
      j($$0, csw.hG, csw.eq);
      k($$0, csw.hG, cji.qB);
      i($$0, csw.ew, cji.qH);
      j($$0, csw.hM, csw.ew);
      k($$0, csw.hM, cji.qH);
      i($$0, csw.em, cji.qx);
      j($$0, csw.hC, csw.em);
      k($$0, csw.hC, cji.qx);
      i($$0, csw.er, cji.qC);
      j($$0, csw.hH, csw.er);
      k($$0, csw.hH, cji.qC);
      i($$0, csw.eo, cji.qz);
      j($$0, csw.hE, csw.eo);
      k($$0, csw.hE, cji.qz);
      i($$0, csw.el, cji.qw);
      j($$0, csw.hB, csw.el);
      k($$0, csw.hB, cji.qw);
      i($$0, csw.ek, cji.qv);
      j($$0, csw.hA, csw.ek);
      k($$0, csw.hA, cji.qv);
      i($$0, csw.ep, cji.qA);
      j($$0, csw.hF, csw.ep);
      k($$0, csw.hF, cji.qA);
      i($$0, csw.et, cji.qE);
      j($$0, csw.hJ, csw.et);
      k($$0, csw.hJ, cji.qE);
      i($$0, csw.ex, cji.qI);
      j($$0, csw.hN, csw.ex);
      k($$0, csw.hN, cji.qI);
      i($$0, csw.ej, cji.qu);
      j($$0, csw.hz, csw.ej);
      k($$0, csw.hz, cji.qu);
      i($$0, csw.en, cji.qy);
      j($$0, csw.hD, csw.en);
      k($$0, csw.hD, cji.qy);
      l($$0, csw.hy, cji.qJ);
      l($$0, csw.hu, cji.qF);
      l($$0, csw.hv, cji.qG);
      l($$0, csw.hs, cji.qD);
      l($$0, csw.hq, cji.qB);
      l($$0, csw.hw, cji.qH);
      l($$0, csw.hm, cji.qx);
      l($$0, csw.hr, cji.qC);
      l($$0, csw.ho, cji.qz);
      l($$0, csw.hl, cji.qw);
      l($$0, csw.hk, cji.qv);
      l($$0, csw.hp, cji.qA);
      l($$0, csw.ht, cji.qE);
      l($$0, csw.hx, cji.qI);
      l($$0, csw.hj, cji.qu);
      l($$0, csw.hn, cji.qy);
      m($$0, csw.mb, cji.qJ);
      m($$0, csw.lX, cji.qF);
      m($$0, csw.lY, cji.qG);
      m($$0, csw.lV, cji.qD);
      m($$0, csw.lT, cji.qB);
      m($$0, csw.lZ, cji.qH);
      m($$0, csw.lP, cji.qx);
      m($$0, csw.lU, cji.qC);
      m($$0, csw.lR, cji.qz);
      m($$0, csw.lO, cji.qw);
      m($$0, csw.lN, cji.qv);
      m($$0, csw.lS, cji.qA);
      m($$0, csw.lW, cji.qE);
      m($$0, csw.ma, cji.qI);
      m($$0, csw.lM, cji.qu);
      m($$0, csw.lQ, cji.qy);
      lx.a(lu.b, cji.vU).a('S', cji.oE).a('H', cji.vA).b("S").b("H").b("has_string", a((cpu)cji.oE)).b("has_honeycomb", a((cpu)cji.vA)).a($$0);
      n($$0, csw.qb, cji.qJ);
      n($$0, csw.pX, cji.qF);
      n($$0, csw.pY, cji.qG);
      n($$0, csw.pV, cji.qD);
      n($$0, csw.pT, cji.qB);
      n($$0, csw.pZ, cji.qH);
      n($$0, csw.pP, cji.qx);
      n($$0, csw.pU, cji.qC);
      n($$0, csw.pR, cji.qz);
      n($$0, csw.pO, cji.qw);
      n($$0, csw.pN, cji.qv);
      n($$0, csw.pS, cji.qA);
      n($$0, csw.pW, cji.qE);
      n($$0, csw.qa, cji.qI);
      n($$0, csw.pM, cji.qu);
      n($$0, csw.pQ, cji.qy);
      ly.a(lu.a, csw.eM, 1).b(csw.rH).b(cji.oI).b("has_mud", a(csw.rH)).a($$0);
      lx.a(lu.a, csw.eN, 4).a('#', csw.eM).b("##").b("##").b("has_packed_mud", a(csw.eM)).a($$0);
      ly.a(lu.a, csw.ad, 1).b(csw.rH).b(cji.bo).b("has_mangrove_roots", a(csw.ac)).a($$0);
      lx.a(lu.d, csw.hh, 6).a('#', csw.dK).a('S', cji.oB).a('X', cji.nQ).b("XSX").b("X#X").b("XSX").b("has_rail", a(csw.cP)).a($$0);
      ly.a(lu.a, csw.g, 2).b(csw.e).b(csw.m).b("has_stone", a(csw.e)).a($$0);
      lx.a(lu.b, csw.gS).a('I', csw.ci).a('i', cji.nQ).b("III").b(" i ").b("iii").b("has_iron_block", a(csw.ci)).a($$0);
      lx.a(lu.b, cji.tL).a('/', cji.oB).a('_', csw.jE).b("///").b(" / ").b("/_/").b("has_stone_slab", a(csw.jE)).a($$0);
      lx.a(lu.f, cji.nH, 4)
         .a('#', cji.oB)
         .a('X', cji.pi)
         .a('Y', cji.oF)
         .b("X")
         .b("#")
         .b("Y")
         .b("has_feather", a((cpu)cji.oF))
         .b("has_flint", a((cpu)cji.pi))
         .a($$0);
      lx.a(lu.b, csw.nU, 1).a('P', aqb.b).a('S', aqb.j).b("PSP").b("P P").b("PSP").b("has_planks", a(aqb.b)).b("has_wood_slab", a(aqb.j)).a($$0);
      lx.a(lu.i, csw.fO).a('S', cji.ty).a('G', csw.aQ).a('O', csw.co).b("GGG").b("GSG").b("OOO").b("has_nether_star", a((cpu)cji.ty)).a($$0);
      lx.a(lu.b, csw.pf).a('P', aqb.b).a('H', cji.vA).b("PPP").b("HHH").b("PPP").b("has_honeycomb", a((cpu)cji.vA)).a($$0);
      ly.a(lu.g, cji.us).b(cji.oC).a(cji.uq, 6).b("has_beetroot", a((cpu)cji.uq)).a($$0);
      ly.a(lu.i, cji.qJ).b(cji.qr).b("black_dye").b("has_ink_sac", a((cpu)cji.qr)).a($$0);
      a($$0, cji.qJ, csw.cd, "black_dye");
      ly.a(lu.h, cji.rz, 2).b(cji.rr).b("has_blaze_rod", a((cpu)cji.rr)).a($$0);
      ly.a(lu.i, cji.qF).b(cji.nM).b("blue_dye").b("has_lapis_lazuli", a((cpu)cji.nM)).a($$0);
      a($$0, cji.qF, csw.cc, "blue_dye");
      b($$0, lu.a, csw.mW, csw.iC);
      ly.a(lu.i, cji.qK, 3).b(cji.qL).b("bonemeal").b("has_bone", a((cpu)cji.qL)).a($$0);
      b($$0, lu.i, cji.qK, lu.a, cji.iE, "bone_meal_from_bone_block", "bonemeal");
      ly.a(lu.i, cji.qb).a(cji.qa, 3).b(cji.pP).b("has_paper", a((cpu)cji.qa)).a($$0);
      lx.a(lu.a, csw.cl).a('#', aqb.b).a('X', cji.qb).b("###").b("XXX").b("###").b("has_book", a((cpu)cji.qb)).a($$0);
      lx.a(lu.f, cji.nG).a('#', cji.oB).a('X', cji.oE).b(" #X").b("# X").b(" #X").b("has_string", a((cpu)cji.oE)).a($$0);
      lx.a(lu.i, cji.oC, 4)
         .a('#', aqb.b)
         .b("# #")
         .b(" # ")
         .b("has_brown_mushroom", a(csw.cf))
         .b("has_red_mushroom", a(csw.cg))
         .b("has_mushroom_stew", a((cpu)cji.oD))
         .a($$0);
      lx.a(lu.g, cji.oJ).a('#', cji.oI).b("###").b("has_wheat", a((cpu)cji.oI)).a($$0);
      lx.a(lu.h, csw.fs).a('B', cji.rr).a('#', aqb.ay).b(" B ").b("###").b("has_blaze_rod", a((cpu)cji.rr)).a($$0);
      lx.a(lu.a, csw.cj).a('#', cji.pX).b("##").b("##").b("has_brick", a((cpu)cji.pX)).a($$0);
      ly.a(lu.i, cji.qG).b(cji.qt).b("brown_dye").b("has_cocoa_beans", a((cpu)cji.qt)).a($$0);
      lx.a(lu.i, cji.pK).a('#', cji.nQ).b("# #").b(" # ").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.g, csw.eh).a('A', cji.pQ).a('B', cji.qM).a('C', cji.oI).a('E', cji.qd).b("AAA").b("BEB").b("CCC").b("has_egg", a((cpu)cji.qd)).a($$0);
      lx.a(lu.b, csw.og).a('L', aqb.r).a('S', cji.oB).a('C', aqb.as).b(" S ").b("SCS").b("LLL").b("has_stick", a((cpu)cji.oB)).b("has_coal", a(aqb.as)).a($$0);
      lx.a(lu.d, cji.nf).a('#', cji.qh).a('X', cji.tl).b("# ").b(" X").b("has_carrot", a((cpu)cji.tl)).a($$0);
      lx.a(lu.d, cji.ng).a('#', cji.qh).a('X', cji.dh).b("# ").b(" X").b("has_warped_fungus", a((cpu)cji.dh)).a($$0);
      lx.a(lu.h, csw.ft).a('#', cji.nQ).b("# #").b("# #").b("###").b("has_water_bucket", a((cpu)cji.pL)).a($$0);
      lx.a(lu.b, csw.pc).a('#', aqb.j).b("# #").b("# #").b("###").b("has_wood_slab", a(aqb.j)).a($$0);
      lx.a(lu.b, csw.cv)
         .a('#', aqb.b)
         .b("###")
         .b("# #")
         .b("###")
         .b("has_lots_of_items", al.e.a(new bz.a(Optional.empty(), cl.d.b(10), cl.d.c, cl.d.c, List.of())))
         .a($$0);
      ly.a(lu.d, cji.nb).b(csw.cv).b(cji.na).b("has_minecart", a((cpu)cji.na)).a($$0);
      c($$0, cji.nr, cji.nq);
      c($$0, cji.nn, cji.nm);
      c($$0, cji.nv, cji.nu);
      c($$0, cji.np, cji.no);
      c($$0, cji.nj, cji.ni);
      c($$0, cji.nl, cji.nk);
      c($$0, cji.nx, cji.nw);
      b(lu.a, csw.he, cmg.a(csw.jN)).b("has_chiseled_quartz_block", a(csw.he)).b("has_quartz_block", a(csw.hd)).b("has_quartz_pillar", a(csw.hf)).a($$0);
      b(lu.a, csw.eL, cmg.a(csw.jK)).b("has_tag", a(aqb.c)).a($$0);
      a($$0, lu.a, csw.dR, cji.pY);
      lx.a(lu.e, cji.qi).a('#', cji.nU).a('X', cji.ll).b(" # ").b("#X#").b(" # ").b("has_redstone", a((cpu)cji.ll)).a($$0);
      a($$0, lu.i, cji.nI, lu.a, cji.aq);
      lx.a(lu.a, csw.k, 4).a('D', csw.j).a('G', csw.L).b("DG").b("GD").b("has_gravel", a(csw.L)).a($$0);
      lx.a(lu.c, csw.gY).a('#', csw.dK).a('X', cji.nN).a('I', csw.b).b(" # ").b("#X#").b("III").b("has_quartz", a((cpu)cji.nN)).a($$0);
      lx.a(lu.e, cji.qe).a('#', cji.nQ).a('X', cji.ll).b(" # ").b("#X#").b(" # ").b("has_redstone", a((cpu)cji.ll)).a($$0);
      lx.a(lu.g, cji.re, 8).a('#', cji.oI).a('X', cji.qt).b("#X#").b("has_cocoa", a((cpu)cji.qt)).a($$0);
      lx.a(lu.b, csw.cA).a('#', aqb.b).b("##").b("##").b("unlock_right_away", cs.a.f()).a(false).a($$0);
      lx.a(lu.f, cji.uZ)
         .a('~', cji.oE)
         .a('#', cji.oB)
         .a('&', cji.nQ)
         .a('$', csw.fH)
         .b("#&#")
         .b("~$~")
         .b(" # ")
         .b("has_string", a((cpu)cji.oE))
         .b("has_iron_ingot", a((cpu)cji.nQ))
         .b("has_tripwire_hook", a(csw.fH))
         .a($$0);
      lx.a(lu.b, csw.nT).a('#', aqb.b).a('@', cji.oE).b("@@").b("##").b("has_string", a((cpu)cji.oE)).a($$0);
      b(lu.a, csw.jq, cmg.a(csw.jO)).b("has_red_sandstone", a(csw.jp)).b("has_chiseled_red_sandstone", a(csw.jq)).b("has_cut_red_sandstone", a(csw.jr)).a($$0);
      g($$0, lu.a, csw.aW, csw.jF);
      b($$0, lu.i, cji.nS, lu.a, cji.ax, d(cji.nS), c(cji.nS));
      ly.a(lu.i, cji.nS, 9).b(csw.rb).b(c(cji.nS)).b(b(csw.rb), a(csw.rb)).a($$0, a(cji.nS, csw.rb));
      b($$0);
      ly.a(lu.i, cji.qD, 2).b(cji.qF).b(cji.qH).b("cyan_dye").b("has_green_dye", a((cpu)cji.qH)).b("has_blue_dye", a((cpu)cji.qF)).a($$0);
      lx.a(lu.a, csw.ib).a('S', cji.tE).a('I', cji.qJ).b("SSS").b("SIS").b("SSS").b("has_prismarine_shard", a((cpu)cji.tE)).a($$0);
      lx.a(lu.c, csw.gZ).a('Q', cji.nN).a('G', csw.aQ).a('W', cmg.a(aqb.j)).b("GGG").b("QQQ").b("WWW").b("has_quartz", a((cpu)cji.nN)).a($$0);
      lx.a(lu.a, csw.rV, 4).a('S', csw.rN).b("SS").b("SS").b("has_polished_deepslate", a(csw.rN)).a($$0);
      lx.a(lu.a, csw.rR, 4).a('S', csw.rV).b("SS").b("SS").b("has_deepslate_bricks", a(csw.rV)).a($$0);
      lx.a(lu.d, csw.bq, 6).a('R', cji.ll).a('#', csw.dx).a('X', cji.nQ).b("X X").b("X#X").b("XRX").b("has_rail", a(csw.cP)).a($$0);
      lx.a(lu.e, cji.ou).a('#', cji.oB).a('X', cji.nK).b("XX").b("X#").b(" #").b("has_diamond", a((cpu)cji.nK)).a($$0);
      a($$0, lu.i, cji.nK, lu.a, cji.az);
      lx.a(lu.f, cji.oZ).a('X', cji.nK).b("X X").b("X X").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.f, cji.oX).a('X', cji.nK).b("X X").b("XXX").b("XXX").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.f, cji.oW).a('X', cji.nK).b("XXX").b("X X").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.e, cji.ov).a('#', cji.oB).a('X', cji.nK).b("XX").b(" #").b(" #").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.f, cji.oY).a('X', cji.nK).b("XXX").b("X X").b("X X").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.e, cji.ot).a('#', cji.oB).a('X', cji.nK).b("XXX").b(" # ").b(" # ").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.e, cji.os).a('#', cji.oB).a('X', cji.nK).b("X").b("#").b("#").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.f, cji.or).a('#', cji.oB).a('X', cji.nK).b("X").b("X").b("#").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.a, csw.e, 2).a('Q', cji.nN).a('C', csw.m).b("CQ").b("QC").b("has_quartz", a((cpu)cji.nN)).a($$0);
      lx.a(lu.c, csw.aU).a('R', cji.ll).a('#', csw.m).a('X', cji.nG).b("###").b("#X#").b("#R#").b("has_bow", a((cpu)cji.nG)).a($$0);
      a($$0, lu.a, csw.rt, cji.wp);
      lx.a(lu.c, csw.hi).a('R', cji.ll).a('#', csw.m).b("###").b("# #").b("#R#").b("has_redstone", a((cpu)cji.ll)).a($$0);
      a($$0, lu.i, cji.nL, lu.a, cji.fW);
      lx.a(lu.b, csw.fr).a('B', cji.qb).a('#', csw.co).a('D', cji.nK).b(" B ").b("D#D").b("###").b("has_obsidian", a(csw.co)).a($$0);
      lx.a(lu.b, csw.fG).a('#', csw.co).a('E', cji.rD).b("###").b("#E#").b("###").b("has_ender_eye", a((cpu)cji.rD)).a($$0);
      ly.a(lu.i, cji.rD).b(cji.rq).b(cji.rz).b("has_blaze_powder", a((cpu)cji.rz)).a($$0);
      lx.a(lu.a, csw.kz, 4).a('#', csw.fz).b("##").b("##").b("has_end_stone", a(csw.fz)).a($$0);
      lx.a(lu.b, cji.ul).a('T', cji.rs).a('E', cji.rD).a('G', csw.aQ).b("GGG").b("GEG").b("GTG").b("has_ender_eye", a((cpu)cji.rD)).a($$0);
      lx.a(lu.b, csw.kt, 4).a('#', cji.un).a('/', cji.rr).b("/").b("#").b("has_chorus_fruit_popped", a((cpu)cji.un)).a($$0);
      ly.a(lu.h, cji.ry).b(cji.rx).b(csw.cf).b(cji.qM).b("has_spider_eye", a((cpu)cji.rx)).a($$0);
      ly.a(lu.i, cji.tf, 3).b(cji.oG).b(cji.rz).a(cmg.a(cji.nI, cji.nJ)).b("has_blaze_powder", a((cpu)cji.rz)).a($$0);
      ly.a(lu.i, cji.tA, 3).b(cji.oG).b(cji.qa).b("has_gunpowder", a((cpu)cji.oG)).a($$0, "firework_rocket_simple");
      lx.a(lu.e, cji.qh).a('#', cji.oB).a('X', cji.oE).b("  #").b(" #X").b("# X").b("has_string", a((cpu)cji.oE)).a($$0);
      ly.a(lu.e, cji.nE).b(cji.nQ).b(cji.pi).b("has_flint", a((cpu)cji.pi)).b("has_obsidian", a(csw.co)).a($$0);
      lx.a(lu.b, csw.fR).a('#', cji.pX).b("# #").b(" # ").b("has_brick", a((cpu)cji.pX)).a($$0);
      lx.a(lu.b, csw.cD).a('#', aqb.ay).b("###").b("# #").b("###").b("has_cobblestone", a(aqb.ay)).a($$0);
      ly.a(lu.d, cji.nc).b(csw.cD).b(cji.na).b("has_minecart", a((cpu)cji.na)).a($$0);
      lx.a(lu.h, cji.rw, 3).a('#', csw.aQ).b("# #").b(" # ").b("has_glass", a(csw.aQ)).a($$0);
      lx.a(lu.b, csw.eZ, 16).a('#', csw.aQ).b("###").b("###").b("has_glass", a(csw.aQ)).a($$0);
      a($$0, lu.a, csw.ed, cji.qk);
      ly.a(lu.b, cji.tj).b(cji.ti).b(cji.qs).b("has_item_frame", a((cpu)cji.ti)).b("has_glow_ink_sac", a((cpu)cji.qs)).a($$0);
      lx.a(lu.g, cji.pm).a('#', cji.nU).a('X', cji.nF).b("###").b("#X#").b("###").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.e, cji.ok).a('#', cji.oB).a('X', cji.nU).b("XX").b("X#").b(" #").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.f, cji.pd).a('X', cji.nU).b("X X").b("X X").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.h, cji.tq).a('#', cji.rt).a('X', cji.tl).b("###").b("#X#").b("###").b("has_gold_nugget", a((cpu)cji.rt)).a($$0);
      lx.a(lu.f, cji.pb).a('X', cji.nU).b("X X").b("XXX").b("XXX").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.f, cji.pa).a('X', cji.nU).b("XXX").b("X X").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.e, cji.ol).a('#', cji.oB).a('X', cji.nU).b("XX").b(" #").b(" #").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.f, cji.pc).a('X', cji.nU).b("XXX").b("X X").b("X X").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.e, cji.oj).a('#', cji.oB).a('X', cji.nU).b("XXX").b(" # ").b(" # ").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.d, csw.bp, 6).a('R', cji.ll).a('#', cji.oB).a('X', cji.nU).b("X X").b("X#X").b("XRX").b("has_rail", a(csw.cP)).a($$0);
      lx.a(lu.e, cji.oi).a('#', cji.oB).a('X', cji.nU).b("X").b("#").b("#").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      lx.a(lu.f, cji.oh).a('#', cji.oB).a('X', cji.nU).b("X").b("X").b("#").b("has_gold_ingot", a((cpu)cji.nU)).a($$0);
      b($$0, lu.i, cji.nU, lu.a, cji.ay, "gold_ingot_from_gold_block", "gold_ingot");
      a($$0, lu.i, cji.rt, lu.i, cji.nU, "gold_ingot_from_nuggets", "gold_ingot");
      ly.a(lu.a, csw.c).b(csw.e).b(cji.nN).b("has_quartz", a((cpu)cji.nN)).a($$0);
      ly.a(lu.i, cji.qB, 2).b(cji.qJ).b(cji.qu).b("has_white_dye", a((cpu)cji.qu)).b("has_black_dye", a((cpu)cji.qJ)).a($$0);
      b($$0, lu.a, csw.ij, cji.oI);
      d($$0, csw.gX, cji.nQ);
      ly.a(lu.g, cji.vD, 4).b(cji.lt).a(cji.rw, 4).b("has_honey_block", a(csw.pg)).a($$0);
      a($$0, lu.c, csw.pg, cji.vD);
      a($$0, lu.b, csw.ph, cji.vA);
      lx.a(lu.c, csw.hc).a('C', csw.cv).a('I', cji.nQ).b("I I").b("ICI").b(" I ").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      ly.a(lu.d, cji.ne).b(csw.hc).b(cji.na).b("has_minecart", a((cpu)cji.na)).a($$0);
      lx.a(lu.e, cji.op).a('#', cji.oB).a('X', cji.nQ).b("XX").b("X#").b(" #").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.b, csw.eX, 16).a('#', cji.nQ).b("###").b("###").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.f, cji.oV).a('X', cji.nQ).b("X X").b("X X").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.f, cji.oT).a('X', cji.nQ).b("X X").b("XXX").b("XXX").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      a(csw.dy, cmg.a(cji.nQ)).a(b(cji.nQ), a((cpu)cji.nQ)).a($$0);
      lx.a(lu.f, cji.oS).a('X', cji.nQ).b("XXX").b("X X").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.e, cji.oq).a('#', cji.oB).a('X', cji.nQ).b("XX").b(" #").b(" #").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      b($$0, lu.i, cji.nQ, lu.a, cji.aw, "iron_ingot_from_iron_block", "iron_ingot");
      a($$0, lu.i, cji.uB, lu.i, cji.nQ, "iron_ingot_from_nuggets", "iron_ingot");
      lx.a(lu.f, cji.oU).a('X', cji.nQ).b("XXX").b("X X").b("X X").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.e, cji.oo).a('#', cji.oB).a('X', cji.nQ).b("XXX").b(" # ").b(" # ").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.e, cji.on).a('#', cji.oB).a('X', cji.nQ).b("X").b("#").b("#").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.f, cji.om).a('#', cji.oB).a('X', cji.nQ).b("X").b("X").b("#").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      a($$0, lu.c, csw.hY, cji.nQ);
      lx.a(lu.b, cji.ti).a('#', cji.oB).a('X', cji.pP).b("###").b("#X#").b("###").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.b, csw.dT).a('#', aqb.b).a('X', cji.nK).b("###").b("#X#").b("###").b("has_diamond", a((cpu)cji.nK)).a($$0);
      lx.a(lu.b, csw.cO, 3).a('#', cji.oB).b("# #").b("###").b("# #").b("has_stick", a((cpu)cji.oB)).a($$0);
      a($$0, lu.i, cji.nM, lu.a, cji.cm);
      lx.a(lu.e, cji.tQ, 2).a('~', cji.oE).a('O', cji.qc).b("~~ ").b("~O ").b("  ~").b("has_slime_ball", a((cpu)cji.qc)).a($$0);
      a($$0, lu.i, cji.pP, cji.tK);
      lx.a(lu.f, cji.oN).a('X', cji.pP).b("X X").b("X X").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.f, cji.oL).a('X', cji.pP).b("X X").b("XXX").b("XXX").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.f, cji.oK).a('X', cji.pP).b("XXX").b("X X").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.f, cji.oM).a('X', cji.pP).b("XXX").b("X X").b("X X").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.i, cji.tP).a('X', cji.pP).b("X X").b("XXX").b("X X").b("has_leather", a((cpu)cji.pP)).a($$0);
      lx.a(lu.c, csw.oa).a('S', aqb.j).a('B', csw.cl).b("SSS").b(" B ").b(" S ").b("has_book", a((cpu)cji.qb)).a($$0);
      lx.a(lu.c, csw.dw).a('#', csw.m).a('X', cji.oB).b("X").b("#").b("has_cobblestone", a(csw.m)).a($$0);
      a($$0, cji.qx, csw.bU, "light_blue_dye");
      ly.a(lu.i, cji.qx, 2)
         .b(cji.qF)
         .b(cji.qu)
         .b("light_blue_dye")
         .b("has_blue_dye", a((cpu)cji.qF))
         .b("has_white_dye", a((cpu)cji.qu))
         .a($$0, "light_blue_dye_from_blue_white_dye");
      a($$0, cji.qC, csw.bW, "light_gray_dye");
      ly.a(lu.i, cji.qC, 2)
         .b(cji.qB)
         .b(cji.qu)
         .b("light_gray_dye")
         .b("has_gray_dye", a((cpu)cji.qB))
         .b("has_white_dye", a((cpu)cji.qu))
         .a($$0, "light_gray_dye_from_gray_white_dye");
      ly.a(lu.i, cji.qC, 3)
         .b(cji.qJ)
         .a(cji.qu, 2)
         .b("light_gray_dye")
         .b("has_white_dye", a((cpu)cji.qu))
         .b("has_black_dye", a((cpu)cji.qJ))
         .a($$0, "light_gray_dye_from_black_white_dye");
      a($$0, cji.qC, csw.cb, "light_gray_dye");
      a($$0, cji.qC, csw.bZ, "light_gray_dye");
      d($$0, csw.gW, cji.nU);
      lx.a(lu.c, csw.rr).a('#', cji.nS).b("#").b("#").b("#").b("has_copper_ingot", a((cpu)cji.nS)).a($$0);
      ly.a(lu.i, cji.qz, 2).b(cji.qH).b(cji.qu).b("has_green_dye", a((cpu)cji.qH)).b("has_white_dye", a((cpu)cji.qu)).a($$0);
      lx.a(lu.a, csw.eg).a('A', csw.ef).a('B', csw.cp).b("A").b("B").b("has_carved_pumpkin", a(csw.ef)).a($$0);
      a($$0, cji.qw, csw.bV, "magenta_dye");
      ly.a(lu.i, cji.qw, 4)
         .b(cji.qF)
         .a(cji.qI, 2)
         .b(cji.qu)
         .b("magenta_dye")
         .b("has_blue_dye", a((cpu)cji.qF))
         .b("has_rose_red", a((cpu)cji.qI))
         .b("has_white_dye", a((cpu)cji.qu))
         .a($$0, "magenta_dye_from_blue_red_white_dye");
      ly.a(lu.i, cji.qw, 3)
         .b(cji.qF)
         .b(cji.qI)
         .b(cji.qA)
         .b("magenta_dye")
         .b("has_pink_dye", a((cpu)cji.qA))
         .b("has_blue_dye", a((cpu)cji.qF))
         .b("has_red_dye", a((cpu)cji.qI))
         .a($$0, "magenta_dye_from_blue_red_pink");
      a($$0, cji.qw, csw.iE, "magenta_dye", 2);
      ly.a(lu.i, cji.qw, 2)
         .b(cji.qE)
         .b(cji.qA)
         .b("magenta_dye")
         .b("has_pink_dye", a((cpu)cji.qA))
         .b("has_purple_dye", a((cpu)cji.qE))
         .a($$0, "magenta_dye_from_purple_and_pink");
      a($$0, lu.a, csw.kJ, cji.rA);
      ly.a(lu.h, cji.rA).b(cji.rz).b(cji.qc).b("has_blaze_powder", a((cpu)cji.rz)).a($$0);
      lx.a(lu.i, cji.tp).a('#', cji.qa).a('X', cji.qe).b("###").b("#X#").b("###").b("has_compass", a((cpu)cji.qe)).a($$0);
      a($$0, lu.a, csw.fa, cji.rh, "has_melon");
      ly.a(lu.i, cji.rk).b(cji.rh).b("has_melon", a((cpu)cji.rh)).a($$0);
      lx.a(lu.d, cji.na).a('#', cji.nQ).b("# #").b("###").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      ly.a(lu.a, csw.cn).b(csw.m).b(csw.ff).b("mossy_cobblestone").b("has_vine", a(csw.ff)).a($$0, a(csw.cn, csw.ff));
      ly.a(lu.a, csw.eJ).b(csw.eI).b(csw.ff).b("mossy_stone_bricks").b("has_vine", a(csw.ff)).a($$0, a(csw.eJ, csw.ff));
      ly.a(lu.a, csw.cn).b(csw.m).b(csw.rB).b("mossy_cobblestone").b("has_moss_block", a(csw.rB)).a($$0, a(csw.cn, csw.rB));
      ly.a(lu.a, csw.eJ).b(csw.eI).b(csw.rB).b("mossy_stone_bricks").b("has_moss_block", a(csw.rB)).a($$0, a(csw.eJ, csw.rB));
      ly.a(lu.g, cji.oD)
         .b(csw.cf)
         .b(csw.cg)
         .b(cji.oC)
         .b("has_mushroom_stew", a((cpu)cji.oD))
         .b("has_bowl", a((cpu)cji.oC))
         .b("has_brown_mushroom", a(csw.cf))
         .b("has_red_mushroom", a(csw.cg))
         .a($$0);
      a($$0, lu.a, csw.fn, cji.tD);
      b($$0, lu.a, csw.kK, cji.ru);
      lx.a(lu.c, csw.aY).a('#', aqb.b).a('X', cji.ll).b("###").b("#X#").b("###").b("has_redstone", a((cpu)cji.ll)).a($$0);
      lx.a(lu.c, csw.kO).a('Q', cji.nN).a('R', cji.ll).a('#', csw.m).b("###").b("RRQ").b("###").b("has_quartz", a((cpu)cji.nN)).a($$0);
      a($$0, cji.qv, csw.bY, "orange_dye");
      ly.a(lu.i, cji.qv, 2)
         .b(cji.qI)
         .b(cji.qy)
         .b("orange_dye")
         .b("has_red_dye", a((cpu)cji.qI))
         .b("has_yellow_dye", a((cpu)cji.qy))
         .a($$0, "orange_dye_from_red_yellow");
      lx.a(lu.b, cji.pl).a('#', cji.oB).a('X', cmg.a(aqb.a)).b("###").b("#X#").b("###").b("has_wool", a(aqb.a)).a($$0);
      lx.a(lu.i, cji.qa, 3).a('#', csw.dS).b("###").b("has_reeds", a(csw.dS)).a($$0);
      lx.a(lu.a, csw.hf, 2)
         .a('#', csw.hd)
         .b("#")
         .b("#")
         .b("has_chiseled_quartz_block", a(csw.he))
         .b("has_quartz_block", a(csw.hd))
         .b("has_quartz_pillar", a(csw.hf))
         .a($$0);
      b($$0, lu.a, csw.iC, csw.dO);
      a($$0, cji.qA, csw.iG, "pink_dye", 2);
      a($$0, cji.qA, csw.ca, "pink_dye");
      ly.a(lu.i, cji.qA, 2)
         .b(cji.qI)
         .b(cji.qu)
         .b("pink_dye")
         .b("has_white_dye", a((cpu)cji.qu))
         .b("has_red_dye", a((cpu)cji.qI))
         .a($$0, "pink_dye_from_red_white_dye");
      lx.a(lu.c, csw.by).a('R', cji.ll).a('#', csw.m).a('T', aqb.b).a('X', cji.nQ).b("TTT").b("#X#").b("#R#").b("has_redstone", a((cpu)cji.ll)).a($$0);
      e($$0, lu.a, csw.ea, csw.dZ);
      a($$0, lu.a, csw.hZ, cji.tE);
      b($$0, lu.a, csw.ia, cji.tE);
      ly.a(lu.g, cji.tz).b(csw.dV).b(cji.qM).b(cji.qd).b("has_carved_pumpkin", a(csw.ef)).b("has_pumpkin", a(csw.dV)).a($$0);
      ly.a(lu.i, cji.rj, 4).b(csw.dV).b("has_pumpkin", a(csw.dV)).a($$0);
      ly.a(lu.i, cji.qE, 2).b(cji.qF).b(cji.qI).b("has_blue_dye", a((cpu)cji.qF)).b("has_red_dye", a((cpu)cji.qI)).a($$0);
      lx.a(lu.b, csw.kP).a('#', csw.cv).a('-', cji.uA).b("-").b("#").b("-").b("has_shulker_shell", a((cpu)cji.uA)).a($$0);
      lx.a(lu.a, csw.kw, 4).a('F', cji.un).b("FF").b("FF").b("has_chorus_fruit_popped", a((cpu)cji.un)).a($$0);
      lx.a(lu.a, csw.kx).a('#', csw.jQ).b("#").b("#").b("has_purpur_block", a(csw.kw)).a($$0);
      a(lu.a, csw.jQ, cmg.a(csw.kw, csw.kx)).a("has_purpur_block", a(csw.kw)).a($$0);
      b(csw.ky, cmg.a(csw.kw, csw.kx)).a("has_purpur_block", a(csw.kw)).a($$0);
      a($$0, lu.a, csw.hd, cji.nN);
      lx.a(lu.a, csw.pK, 4).a('#', csw.hd).b("##").b("##").b("has_quartz_block", a(csw.hd)).a($$0);
      a(lu.a, csw.jN, cmg.a(csw.he, csw.hd, csw.hf))
         .a("has_chiseled_quartz_block", a(csw.he))
         .a("has_quartz_block", a(csw.hd))
         .a("has_quartz_pillar", a(csw.hf))
         .a($$0);
      b(csw.hg, cmg.a(csw.he, csw.hd, csw.hf))
         .a("has_chiseled_quartz_block", a(csw.he))
         .a("has_quartz_block", a(csw.hd))
         .a("has_quartz_pillar", a(csw.hf))
         .a($$0);
      ly.a(lu.g, cji.tI).b(cji.tn).b(cji.tH).b(cji.oC).b(cji.tl).b(csw.cf).b("rabbit_stew").b("has_cooked_rabbit", a((cpu)cji.tH)).a($$0, a(cji.tI, cji.de));
      ly.a(lu.g, cji.tI).b(cji.tn).b(cji.tH).b(cji.oC).b(cji.tl).b(csw.cg).b("rabbit_stew").b("has_cooked_rabbit", a((cpu)cji.tH)).a($$0, a(cji.tI, cji.df));
      lx.a(lu.d, csw.cP, 16).a('#', cji.oB).a('X', cji.nQ).b("X X").b("X#X").b("X X").b("has_minecart", a((cpu)cji.na)).a($$0);
      a($$0, lu.c, cji.ll, lu.c, cji.ln);
      lx.a(lu.c, csw.fB).a('R', cji.ll).a('G', csw.ed).b(" R ").b("RGR").b(" R ").b("has_glowstone", a(csw.ed)).a($$0);
      lx.a(lu.c, csw.dK).a('#', cji.oB).a('X', cji.ll).b("X").b("#").b("has_redstone", a((cpu)cji.ll)).a($$0);
      a($$0, cji.qI, cji.uq, "red_dye");
      a($$0, cji.qI, csw.bT, "red_dye");
      a($$0, cji.qI, csw.iF, "red_dye", 2);
      ly.a(lu.i, cji.qI).b(csw.bX).b("red_dye").b("has_red_flower", a(csw.bX)).a($$0, "red_dye_from_tulip");
      lx.a(lu.a, csw.kL).a('W', cji.ru).a('N', cji.tD).b("NW").b("WN").b("has_nether_wart", a((cpu)cji.ru)).a($$0);
      lx.a(lu.a, csw.jp).a('#', csw.K).b("##").b("##").b("has_sand", a(csw.K)).a($$0);
      a(lu.a, csw.jO, cmg.a(csw.jp, csw.jq)).a("has_red_sandstone", a(csw.jp)).a("has_chiseled_red_sandstone", a(csw.jq)).a($$0);
      b(csw.js, cmg.a(csw.jp, csw.jq, csw.jr))
         .a("has_red_sandstone", a(csw.jp))
         .a("has_chiseled_red_sandstone", a(csw.jq))
         .a("has_cut_red_sandstone", a(csw.jr))
         .a($$0);
      lx.a(lu.c, csw.ei).a('#', csw.dK).a('X', cji.ll).a('I', csw.b).b("#X#").b("III").b("has_redstone_torch", a(csw.dK)).a($$0);
      a($$0, lu.a, csw.aV, csw.I);
      a(lu.a, csw.jF, cmg.a(csw.aV, csw.aW)).a("has_sandstone", a(csw.aV)).a("has_chiseled_sandstone", a(csw.aW)).a($$0);
      b(csw.fD, cmg.a(csw.aV, csw.aW, csw.aX)).a("has_sandstone", a(csw.aV)).a("has_chiseled_sandstone", a(csw.aW)).a("has_cut_sandstone", a(csw.aX)).a($$0);
      lx.a(lu.a, csw.ii).a('S', cji.tE).a('C', cji.tF).b("SCS").b("CCC").b("SCS").b("has_prismarine_crystals", a((cpu)cji.tF)).a($$0);
      lx.a(lu.e, cji.rg).a('#', cji.nQ).b(" #").b("# ").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.f, cji.uy).a('W', aqb.b).a('o', cji.nQ).b("WoW").b("WWW").b(" W ").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      a($$0, lu.i, cji.qc, lu.c, cji.ls);
      f($$0, lu.a, csw.jr, csw.jp);
      f($$0, lu.a, csw.aX, csw.aV);
      a($$0, lu.a, csw.dP, cji.pO);
      lx.a(lu.b, csw.dN, 6).a('#', csw.dP).b("###").b("has_snowball", a((cpu)cji.pO)).a($$0);
      lx.a(lu.b, csw.oh).a('L', aqb.r).a('S', cji.oB).a('#', aqb.ah).b(" S ").b("S#S").b("LLL").b("has_soul_sand", a(aqb.ah)).a($$0);
      lx.a(lu.h, cji.rE).a('#', cji.rt).a('X', cji.rh).b("###").b("#X#").b("###").b("has_melon", a((cpu)cji.rh)).a($$0);
      lx.a(lu.f, cji.uv, 2).a('#', cji.qk).a('X', cji.nH).b(" # ").b("#X#").b(" # ").b("has_glowstone_dust", a((cpu)cji.qk)).a($$0);
      lx.a(lu.e, cji.qj).a('#', cji.nO).a('X', cji.nS).b(" # ").b(" X ").b(" X ").b("has_amethyst_shard", a((cpu)cji.nO)).a($$0);
      lx.a(lu.i, cji.oB, 4).a('#', aqb.b).b("#").b("#").c("sticks").b("has_planks", a(aqb.b)).a($$0);
      lx.a(lu.i, cji.oB, 1).a('#', csw.mZ).b("#").b("#").c("sticks").b("has_bamboo", a(csw.mZ)).a($$0, "stick_from_bamboo_item");
      lx.a(lu.c, csw.br).a('P', csw.by).a('S', cji.qc).b("S").b("P").b("has_slime_ball", a((cpu)cji.qc)).a($$0);
      lx.a(lu.a, csw.eI, 4).a('#', csw.b).b("##").b("##").b("has_stone", a(csw.b)).a($$0);
      lx.a(lu.e, cji.of).a('#', cji.oB).a('X', aqb.ax).b("XX").b("X#").b(" #").b("has_cobblestone", a(aqb.ax)).a($$0);
      a(lu.a, csw.jK, cmg.a(csw.eI)).a("has_stone_bricks", a(aqb.c)).a($$0);
      b(csw.fj, cmg.a(csw.eI)).a("has_stone_bricks", a(aqb.c)).a($$0);
      lx.a(lu.e, cji.og).a('#', cji.oB).a('X', aqb.ax).b("XX").b(" #").b(" #").b("has_cobblestone", a(aqb.ax)).a($$0);
      lx.a(lu.e, cji.oe).a('#', cji.oB).a('X', aqb.ax).b("XXX").b(" # ").b(" # ").b("has_cobblestone", a(aqb.ax)).a($$0);
      lx.a(lu.e, cji.od).a('#', cji.oB).a('X', aqb.ax).b("X").b("#").b("#").b("has_cobblestone", a(aqb.ax)).a($$0);
      c($$0, lu.a, csw.jE, csw.jR);
      lx.a(lu.f, cji.oc).a('#', cji.oB).a('X', aqb.ax).b("X").b("X").b("#").b("has_cobblestone", a(aqb.ax)).a($$0);
      lx.a(lu.a, csw.bA).a('#', cji.oE).b("##").b("##").b("has_string", a((cpu)cji.oE)).a($$0, a(csw.bA, cji.oE));
      a($$0, cji.qM, csw.dS, "sugar");
      ly.a(lu.i, cji.qM, 3).b(cji.vD).b("sugar").b("has_honey_bottle", a((cpu)cji.vD)).a($$0, a(cji.qM, cji.vD));
      lx.a(lu.c, csw.pd).a('H', cji.hh).a('R', cji.ll).b(" R ").b("RHR").b(" R ").b("has_redstone", a((cpu)cji.ll)).b("has_hay_block", a(csw.ij)).a($$0);
      lx.a(lu.c, csw.ck).a('#', cmg.a(csw.I, csw.K)).a('X', cji.oG).b("X#X").b("#X#").b("X#X").b("has_gunpowder", a((cpu)cji.oG)).a($$0);
      ly.a(lu.d, cji.nd).b(csw.ck).b(cji.na).b("has_minecart", a((cpu)cji.na)).a($$0);
      lx.a(lu.b, csw.cp, 4).a('#', cji.oB).a('X', cmg.a(cji.nI, cji.nJ)).b("X").b("#").b("has_stone_pickaxe", a((cpu)cji.oe)).a($$0);
      lx.a(lu.b, csw.eb, 4).a('X', cmg.a(cji.nI, cji.nJ)).a('#', cji.oB).a('S', aqb.ah).b("X").b("#").b("S").b("has_soul_sand", a(aqb.ah)).a($$0);
      lx.a(lu.b, csw.oe)
         .a('#', cji.ej)
         .a('X', cji.uB)
         .b("XXX")
         .b("X#X")
         .b("XXX")
         .b("has_iron_nugget", a((cpu)cji.uB))
         .b("has_iron_ingot", a((cpu)cji.nQ))
         .a($$0);
      lx.a(lu.b, csw.of).a('#', cji.eX).a('X', cji.uB).b("XXX").b("X#X").b("XXX").b("has_soul_torch", a((cpu)cji.eX)).a($$0);
      ly.a(lu.c, csw.gV).b(csw.cv).b(csw.fH).b("has_tripwire_hook", a(csw.fH)).a($$0);
      lx.a(lu.c, csw.fH, 2).a('#', aqb.b).a('S', cji.oB).a('I', cji.nQ).b("I").b("S").b("#").b("has_string", a((cpu)cji.oE)).a($$0);
      lx.a(lu.f, cji.nC).a('X', cji.nD).b("XXX").b("X X").b("has_scute", a((cpu)cji.nD)).a($$0);
      ly.a(lu.i, cji.oI, 9).b(csw.ij).b("has_hay_block", a(csw.ij)).a($$0);
      ly.a(lu.i, cji.qu).b(cji.qK).b("white_dye").b("has_bone_meal", a((cpu)cji.qK)).a($$0);
      a($$0, cji.qu, csw.ce, "white_dye");
      lx.a(lu.e, cji.oa).a('#', cji.oB).a('X', aqb.b).b("XX").b("X#").b(" #").b("has_stick", a((cpu)cji.oB)).a($$0);
      lx.a(lu.e, cji.ob).a('#', cji.oB).a('X', aqb.b).b("XX").b(" #").b(" #").b("has_stick", a((cpu)cji.oB)).a($$0);
      lx.a(lu.e, cji.nZ).a('#', cji.oB).a('X', aqb.b).b("XXX").b(" # ").b(" # ").b("has_stick", a((cpu)cji.oB)).a($$0);
      lx.a(lu.e, cji.nY).a('#', cji.oB).a('X', aqb.b).b("X").b("#").b("#").b("has_stick", a((cpu)cji.oB)).a($$0);
      lx.a(lu.f, cji.nX).a('#', cji.oB).a('X', aqb.b).b("X").b("X").b("#").b("has_stick", a((cpu)cji.oB)).a($$0);
      ly.a(lu.i, cji.tg).b(cji.qb).b(cji.qr).b(cji.oF).b("has_book", a((cpu)cji.qb)).a($$0);
      a($$0, cji.qy, csw.bR, "yellow_dye");
      a($$0, cji.qy, csw.iD, "yellow_dye", 2);
      a($$0, lu.g, cji.ri, lu.a, cji.pZ);
      lx.a(lu.i, csw.mX)
         .a('#', cji.uX)
         .a('X', cji.uY)
         .b("###")
         .b("#X#")
         .b("###")
         .b("has_nautilus_core", a((cpu)cji.uY))
         .b("has_nautilus_shell", a((cpu)cji.uX))
         .a($$0);
      d($$0, lu.b, csw.nH, csw.jp);
      d($$0, lu.b, csw.nK, csw.eI);
      d($$0, lu.b, csw.nP, csw.aV);
      ly.a(lu.i, cji.vd).b(cji.qa).b(cji.tv).b("has_creeper_head", a((cpu)cji.tv)).a($$0);
      ly.a(lu.i, cji.ve).b(cji.qa).b(cji.ts).b("has_wither_skeleton_skull", a((cpu)cji.ts)).a($$0);
      ly.a(lu.i, cji.vc).b(cji.qa).b(csw.cb).b("has_oxeye_daisy", a(csw.cb)).a($$0);
      ly.a(lu.i, cji.vf).b(cji.qa).b(cji.pn).b("has_enchanted_golden_apple", a((cpu)cji.pn)).a($$0);
      lx.a(lu.b, csw.nS, 6).a('~', cji.oE).a('I', csw.mZ).b("I~I").b("I I").b("I I").b("has_bamboo", a(csw.mZ)).a($$0);
      lx.a(lu.b, csw.nZ).a('I', cji.oB).a('-', csw.jD).a('#', aqb.b).b("I-I").b("# #").b("has_stone_slab", a(csw.jD)).a($$0);
      lx.a(lu.b, csw.nW).a('#', csw.jR).a('X', csw.cD).a('I', cji.nQ).b("III").b("IXI").b("###").b("has_smooth_stone", a(csw.jR)).a($$0);
      lx.a(lu.b, csw.nV).a('#', aqb.r).a('X', csw.cD).b(" # ").b("#X#").b(" # ").b("has_furnace", a(csw.cD)).a($$0);
      lx.a(lu.b, csw.nX).a('#', aqb.b).a('@', cji.qa).b("@@").b("##").b("##").b("has_paper", a((cpu)cji.qa)).a($$0);
      lx.a(lu.b, csw.ob).a('#', aqb.b).a('@', cji.nQ).b("@@").b("##").b("##").b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.b, csw.nY).a('#', aqb.b).a('@', cji.pi).b("@@").b("##").b("##").b("has_flint", a((cpu)cji.pi)).a($$0);
      lx.a(lu.b, csw.oc).a('I', cji.nQ).a('#', csw.b).b(" I ").b("###").b("has_stone", a(csw.b)).a($$0);
      lx.a(lu.b, csw.pq).a('S', cji.fj).a('#', cji.nV).b("SSS").b("S#S").b("SSS").b("has_netherite_ingot", a((cpu)cji.nV)).a($$0);
      b($$0, lu.i, cji.nV, lu.a, cji.aA, "netherite_ingot_from_netherite_block", "netherite_ingot");
      ly.a(lu.i, cji.nV).a(cji.nW, 4).a(cji.nU, 4).b("netherite_ingot").b("has_netherite_scrap", a((cpu)cji.nW)).a($$0);
      lx.a(lu.b, csw.pl).a('O', csw.pk).a('G', csw.ed).b("OOO").b("GGG").b("OOO").b("has_obsidian", a(csw.pk)).a($$0);
      lx.a(lu.b, csw.eY).a('I', cji.nQ).a('N', cji.uB).b("N").b("I").b("N").b("has_iron_nugget", a((cpu)cji.uB)).b("has_iron_ingot", a((cpu)cji.nQ)).a($$0);
      lx.a(lu.a, csw.qB, 2).a('G', csw.aQ).a('S', cji.nO).b(" S ").b("SGS").b(" S ").b("has_amethyst_shard", a((cpu)cji.nO)).a($$0);
      a($$0, lu.a, csw.qt, cji.nO);
      lx.a(lu.e, cji.qf).a('C', cji.qe).a('S', cji.wu).b("SSS").b("SCS").b("SSS").b("has_echo_shard", a((cpu)cji.wu)).a($$0);
      lx.a(lu.c, cji.lE).a('#', cji.nO).a('X', cji.lD).b(" # ").b("#X#").b("has_amethyst_shard", a((cpu)cji.nO)).a($$0);
      b($$0, lu.i, cji.uS, cji.uU);
      md.a(cmm.c).a($$0, "armor_dye");
      md.a(cmm.k).a($$0, "banner_duplicate");
      md.a(cmm.d).a($$0, "book_cloning");
      md.a(cmm.g).a($$0, "firework_rocket");
      md.a(cmm.h).a($$0, "firework_star");
      md.a(cmm.i).a($$0, "firework_star_fade");
      md.a(cmm.e).a($$0, "map_cloning");
      md.a(cmm.f).a($$0, "map_extending");
      md.a(cmm.o).a($$0, "repair_item");
      md.a(cmm.l).a($$0, "shield_decoration");
      md.a(cmm.m).a($$0, "shulker_box_coloring");
      md.a(cmm.j).a($$0, "tipped_arrow");
      md.a(cmm.n).a($$0, "suspicious_stew");
      lz.c(cmg.a(cji.tm), lu.g, cji.tn, 0.35F, 200).b("has_potato", a((cpu)cji.tm)).a($$0);
      lz.c(cmg.a(cji.pY), lu.i, cji.pX, 0.3F, 200).b("has_clay_ball", a((cpu)cji.pY)).a($$0);
      lz.c(cmg.a(aqb.q), lu.i, cji.nJ, 0.15F, 200).b("has_log", a(aqb.q)).a($$0);
      lz.c(cmg.a(cji.um), lu.i, cji.un, 0.1F, 200).b("has_chorus_fruit", a((cpu)cji.um)).a($$0);
      lz.c(cmg.a(cji.rl), lu.g, cji.rm, 0.35F, 200).b("has_beef", a((cpu)cji.rl)).a($$0);
      lz.c(cmg.a(cji.rn), lu.g, cji.ro, 0.35F, 200).b("has_chicken", a((cpu)cji.rn)).a($$0);
      lz.c(cmg.a(cji.ql), lu.g, cji.qp, 0.35F, 200).b("has_cod", a((cpu)cji.ql)).a($$0);
      lz.c(cmg.a(csw.mc), lu.g, cji.ri, 0.1F, 200).b("has_kelp", a(csw.mc)).a($$0, e(cji.ri));
      lz.c(cmg.a(cji.qm), lu.g, cji.qq, 0.35F, 200).b("has_salmon", a((cpu)cji.qm)).a($$0);
      lz.c(cmg.a(cji.tT), lu.g, cji.tU, 0.35F, 200).b("has_mutton", a((cpu)cji.tT)).a($$0);
      lz.c(cmg.a(cji.pj), lu.g, cji.pk, 0.35F, 200).b("has_porkchop", a((cpu)cji.pj)).a($$0);
      lz.c(cmg.a(cji.tG), lu.g, cji.tH, 0.35F, 200).b("has_rabbit", a((cpu)cji.tG)).a($$0);
      a($$0, d, lu.i, cji.nI, 0.1F, 200, "coal");
      a($$0, e, lu.i, cji.nQ, 0.7F, 200, "iron_ingot");
      a($$0, f, lu.i, cji.nS, 0.7F, 200, "copper_ingot");
      a($$0, g, lu.i, cji.nU, 1.0F, 200, "gold_ingot");
      a($$0, h, lu.i, cji.nK, 1.0F, 200, "diamond");
      a($$0, i, lu.i, cji.nM, 0.2F, 200, "lapis_lazuli");
      a($$0, j, lu.c, cji.ll, 0.7F, 200, "redstone");
      a($$0, k, lu.i, cji.nL, 1.0F, 200, "emerald");
      a($$0, lu.i, cji.nP, lu.a, cji.ar);
      a($$0, lu.i, cji.nR, lu.a, cji.as);
      a($$0, lu.i, cji.nT, lu.a, cji.at);
      lz.c(cmg.a(aqb.G), lu.a, csw.aQ.k(), 0.1F, 200).b("has_smelts_to_glass", a(aqb.G)).a($$0);
      lz.c(cmg.a(csw.mV), lu.i, cji.qz, 0.1F, 200).b("has_sea_pickle", a(csw.mV)).a($$0, e(cji.qz));
      lz.c(cmg.a(csw.dQ.k()), lu.i, cji.qH, 1.0F, 200).b("has_cactus", a(csw.dQ)).a($$0);
      lz.c(cmg.a(cji.oj, cji.oi, cji.ok, cji.ol, cji.oh, cji.pa, cji.pb, cji.pc, cji.pd, cji.tN), lu.i, cji.rt, 0.1F, 200)
         .b("has_golden_pickaxe", a((cpu)cji.oj))
         .b("has_golden_shovel", a((cpu)cji.oi))
         .b("has_golden_axe", a((cpu)cji.ok))
         .b("has_golden_hoe", a((cpu)cji.ol))
         .b("has_golden_sword", a((cpu)cji.oh))
         .b("has_golden_helmet", a((cpu)cji.pa))
         .b("has_golden_chestplate", a((cpu)cji.pb))
         .b("has_golden_leggings", a((cpu)cji.pc))
         .b("has_golden_boots", a((cpu)cji.pd))
         .b("has_golden_horse_armor", a((cpu)cji.tN))
         .a($$0, e(cji.rt));
      lz.c(cmg.a(cji.oo, cji.on, cji.op, cji.oq, cji.om, cji.oS, cji.oT, cji.oU, cji.oV, cji.tM, cji.oO, cji.oP, cji.oQ, cji.oR), lu.i, cji.uB, 0.1F, 200)
         .b("has_iron_pickaxe", a((cpu)cji.oo))
         .b("has_iron_shovel", a((cpu)cji.on))
         .b("has_iron_axe", a((cpu)cji.op))
         .b("has_iron_hoe", a((cpu)cji.oq))
         .b("has_iron_sword", a((cpu)cji.om))
         .b("has_iron_helmet", a((cpu)cji.oS))
         .b("has_iron_chestplate", a((cpu)cji.oT))
         .b("has_iron_leggings", a((cpu)cji.oU))
         .b("has_iron_boots", a((cpu)cji.oV))
         .b("has_iron_horse_armor", a((cpu)cji.tM))
         .b("has_chainmail_helmet", a((cpu)cji.oO))
         .b("has_chainmail_chestplate", a((cpu)cji.oP))
         .b("has_chainmail_leggings", a((cpu)cji.oQ))
         .b("has_chainmail_boots", a((cpu)cji.oR))
         .a($$0, e(cji.uB));
      lz.c(cmg.a(csw.dR), lu.a, csw.iA.k(), 0.35F, 200).b("has_clay_block", a(csw.dR)).a($$0);
      lz.c(cmg.a(csw.dW), lu.i, cji.tD, 0.1F, 200).b("has_netherrack", a(csw.dW)).a($$0);
      lz.c(cmg.a(csw.hb), lu.i, cji.nN, 0.2F, 200).b("has_nether_quartz_ore", a(csw.hb)).a($$0);
      lz.c(cmg.a(csw.aP), lu.a, csw.aO.k(), 0.15F, 200).b("has_wet_sponge", a(csw.aP)).a($$0);
      lz.c(cmg.a(csw.m), lu.a, csw.b.k(), 0.1F, 200).b("has_cobblestone", a(csw.m)).a($$0);
      lz.c(cmg.a(csw.b), lu.a, csw.jR.k(), 0.1F, 200).b("has_stone", a(csw.b)).a($$0);
      lz.c(cmg.a(csw.aV), lu.a, csw.jS.k(), 0.1F, 200).b("has_sandstone", a(csw.aV)).a($$0);
      lz.c(cmg.a(csw.jp), lu.a, csw.jU.k(), 0.1F, 200).b("has_red_sandstone", a(csw.jp)).a($$0);
      lz.c(cmg.a(csw.hd), lu.a, csw.jT.k(), 0.1F, 200).b("has_quartz_block", a(csw.hd)).a($$0);
      lz.c(cmg.a(csw.eI), lu.a, csw.eK.k(), 0.1F, 200).b("has_stone_bricks", a(csw.eI)).a($$0);
      lz.c(cmg.a(csw.hy), lu.b, csw.lv.k(), 0.1F, 200).b("has_black_terracotta", a(csw.hy)).a($$0);
      lz.c(cmg.a(csw.hu), lu.b, csw.lr.k(), 0.1F, 200).b("has_blue_terracotta", a(csw.hu)).a($$0);
      lz.c(cmg.a(csw.hv), lu.b, csw.ls.k(), 0.1F, 200).b("has_brown_terracotta", a(csw.hv)).a($$0);
      lz.c(cmg.a(csw.hs), lu.b, csw.lp.k(), 0.1F, 200).b("has_cyan_terracotta", a(csw.hs)).a($$0);
      lz.c(cmg.a(csw.hq), lu.b, csw.ln.k(), 0.1F, 200).b("has_gray_terracotta", a(csw.hq)).a($$0);
      lz.c(cmg.a(csw.hw), lu.b, csw.lt.k(), 0.1F, 200).b("has_green_terracotta", a(csw.hw)).a($$0);
      lz.c(cmg.a(csw.hm), lu.b, csw.lj.k(), 0.1F, 200).b("has_light_blue_terracotta", a(csw.hm)).a($$0);
      lz.c(cmg.a(csw.hr), lu.b, csw.lo.k(), 0.1F, 200).b("has_light_gray_terracotta", a(csw.hr)).a($$0);
      lz.c(cmg.a(csw.ho), lu.b, csw.ll.k(), 0.1F, 200).b("has_lime_terracotta", a(csw.ho)).a($$0);
      lz.c(cmg.a(csw.hl), lu.b, csw.li.k(), 0.1F, 200).b("has_magenta_terracotta", a(csw.hl)).a($$0);
      lz.c(cmg.a(csw.hk), lu.b, csw.lh.k(), 0.1F, 200).b("has_orange_terracotta", a(csw.hk)).a($$0);
      lz.c(cmg.a(csw.hp), lu.b, csw.lm.k(), 0.1F, 200).b("has_pink_terracotta", a(csw.hp)).a($$0);
      lz.c(cmg.a(csw.ht), lu.b, csw.lq.k(), 0.1F, 200).b("has_purple_terracotta", a(csw.ht)).a($$0);
      lz.c(cmg.a(csw.hx), lu.b, csw.lu.k(), 0.1F, 200).b("has_red_terracotta", a(csw.hx)).a($$0);
      lz.c(cmg.a(csw.hj), lu.b, csw.lg.k(), 0.1F, 200).b("has_white_terracotta", a(csw.hj)).a($$0);
      lz.c(cmg.a(csw.hn), lu.b, csw.lk.k(), 0.1F, 200).b("has_yellow_terracotta", a(csw.hn)).a($$0);
      lz.c(cmg.a(csw.pj), lu.i, cji.nW, 2.0F, 200).b("has_ancient_debris", a(csw.pj)).a($$0);
      lz.c(cmg.a(csw.dZ), lu.a, csw.sd, 0.1F, 200).b("has_basalt", a(csw.dZ)).a($$0);
      lz.c(cmg.a(csw.rJ), lu.a, csw.rI, 0.1F, 200).b("has_cobbled_deepslate", a(csw.rJ)).a($$0);
      b($$0, d, lu.i, cji.nI, 0.1F, 100, "coal");
      b($$0, e, lu.i, cji.nQ, 0.7F, 100, "iron_ingot");
      b($$0, f, lu.i, cji.nS, 0.7F, 100, "copper_ingot");
      b($$0, g, lu.i, cji.nU, 1.0F, 100, "gold_ingot");
      b($$0, h, lu.i, cji.nK, 1.0F, 100, "diamond");
      b($$0, i, lu.i, cji.nM, 0.2F, 100, "lapis_lazuli");
      b($$0, j, lu.c, cji.ll, 0.7F, 100, "redstone");
      b($$0, k, lu.i, cji.nL, 1.0F, 100, "emerald");
      lz.b(cmg.a(csw.hb), lu.i, cji.nN, 0.2F, 100).b("has_nether_quartz_ore", a(csw.hb)).a($$0, f(cji.nN));
      lz.b(cmg.a(cji.oj, cji.oi, cji.ok, cji.ol, cji.oh, cji.pa, cji.pb, cji.pc, cji.pd, cji.tN), lu.i, cji.rt, 0.1F, 100)
         .b("has_golden_pickaxe", a((cpu)cji.oj))
         .b("has_golden_shovel", a((cpu)cji.oi))
         .b("has_golden_axe", a((cpu)cji.ok))
         .b("has_golden_hoe", a((cpu)cji.ol))
         .b("has_golden_sword", a((cpu)cji.oh))
         .b("has_golden_helmet", a((cpu)cji.pa))
         .b("has_golden_chestplate", a((cpu)cji.pb))
         .b("has_golden_leggings", a((cpu)cji.pc))
         .b("has_golden_boots", a((cpu)cji.pd))
         .b("has_golden_horse_armor", a((cpu)cji.tN))
         .a($$0, f(cji.rt));
      lz.b(cmg.a(cji.oo, cji.on, cji.op, cji.oq, cji.om, cji.oS, cji.oT, cji.oU, cji.oV, cji.tM, cji.oO, cji.oP, cji.oQ, cji.oR), lu.i, cji.uB, 0.1F, 100)
         .b("has_iron_pickaxe", a((cpu)cji.oo))
         .b("has_iron_shovel", a((cpu)cji.on))
         .b("has_iron_axe", a((cpu)cji.op))
         .b("has_iron_hoe", a((cpu)cji.oq))
         .b("has_iron_sword", a((cpu)cji.om))
         .b("has_iron_helmet", a((cpu)cji.oS))
         .b("has_iron_chestplate", a((cpu)cji.oT))
         .b("has_iron_leggings", a((cpu)cji.oU))
         .b("has_iron_boots", a((cpu)cji.oV))
         .b("has_iron_horse_armor", a((cpu)cji.tM))
         .b("has_chainmail_helmet", a((cpu)cji.oO))
         .b("has_chainmail_chestplate", a((cpu)cji.oP))
         .b("has_chainmail_leggings", a((cpu)cji.oQ))
         .b("has_chainmail_boots", a((cpu)cji.oR))
         .a($$0, f(cji.uB));
      lz.b(cmg.a(csw.pj), lu.i, cji.nW, 2.0F, 100).b("has_ancient_debris", a(csw.pj)).a($$0, f(cji.nW));
      a($$0, "smoking", cmm.r, 100);
      a($$0, "campfire_cooking", cmm.s, 600);
      a($$0, lu.a, csw.jD, csw.b, 2);
      i($$0, lu.a, csw.nk, csw.b);
      i($$0, lu.a, csw.eI, csw.b);
      a($$0, lu.a, csw.jK, csw.b, 2);
      i($$0, lu.a, csw.fj, csw.b);
      ma.a(cmg.a(csw.b), lu.a, csw.eL).b("has_stone", a(csw.b)).a($$0, "chiseled_stone_bricks_stone_from_stonecutting");
      ma.a(cmg.a(csw.b), lu.b, csw.nK).b("has_stone", a(csw.b)).a($$0, "stone_brick_walls_from_stone_stonecutting");
      i($$0, lu.a, csw.aX, csw.aV);
      a($$0, lu.a, csw.jF, csw.aV, 2);
      a($$0, lu.a, csw.jG, csw.aV, 2);
      a($$0, lu.a, csw.jG, csw.aX, 2);
      i($$0, lu.a, csw.fD, csw.aV);
      i($$0, lu.b, csw.nP, csw.aV);
      i($$0, lu.a, csw.aW, csw.aV);
      i($$0, lu.a, csw.jr, csw.jp);
      a($$0, lu.a, csw.jO, csw.jp, 2);
      a($$0, lu.a, csw.jP, csw.jp, 2);
      a($$0, lu.a, csw.jP, csw.jr, 2);
      i($$0, lu.a, csw.js, csw.jp);
      i($$0, lu.b, csw.nH, csw.jp);
      i($$0, lu.a, csw.jq, csw.jp);
      ma.a(cmg.a(csw.hd), lu.a, csw.jN, 2).b("has_quartz_block", a(csw.hd)).a($$0, "quartz_slab_from_stonecutting");
      i($$0, lu.a, csw.hg, csw.hd);
      i($$0, lu.a, csw.hf, csw.hd);
      i($$0, lu.a, csw.he, csw.hd);
      i($$0, lu.a, csw.pK, csw.hd);
      i($$0, lu.a, csw.cQ, csw.m);
      a($$0, lu.a, csw.jI, csw.m, 2);
      i($$0, lu.b, csw.fP, csw.m);
      a($$0, lu.a, csw.jK, csw.eI, 2);
      i($$0, lu.a, csw.fj, csw.eI);
      ma.a(cmg.a(csw.eI), lu.b, csw.nK).b("has_stone_bricks", a(csw.eI)).a($$0, "stone_brick_wall_from_stone_bricks_stonecutting");
      i($$0, lu.a, csw.eL, csw.eI);
      a($$0, lu.a, csw.jJ, csw.cj, 2);
      i($$0, lu.a, csw.fi, csw.cj);
      i($$0, lu.b, csw.nF, csw.cj);
      a($$0, lu.a, csw.jL, csw.eN, 2);
      i($$0, lu.a, csw.fk, csw.eN);
      i($$0, lu.b, csw.nL, csw.eN);
      a($$0, lu.a, csw.jM, csw.fn, 2);
      i($$0, lu.a, csw.fp, csw.fn);
      i($$0, lu.b, csw.nM, csw.fn);
      i($$0, lu.a, csw.pI, csw.fn);
      a($$0, lu.a, csw.nC, csw.kL, 2);
      i($$0, lu.a, csw.np, csw.kL);
      i($$0, lu.b, csw.nO, csw.kL);
      a($$0, lu.a, csw.jQ, csw.kw, 2);
      i($$0, lu.a, csw.ky, csw.kw);
      i($$0, lu.a, csw.kx, csw.kw);
      a($$0, lu.a, csw.if, csw.hZ, 2);
      i($$0, lu.a, csw.ic, csw.hZ);
      i($$0, lu.b, csw.nG, csw.hZ);
      ma.a(cmg.a(csw.ia), lu.a, csw.ig, 2).b("has_prismarine_brick", a(csw.ia)).a($$0, "prismarine_brick_slab_from_prismarine_stonecutting");
      ma.a(cmg.a(csw.ia), lu.a, csw.id).b("has_prismarine_brick", a(csw.ia)).a($$0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      a($$0, lu.a, csw.ih, csw.ib, 2);
      i($$0, lu.a, csw.ie, csw.ib);
      a($$0, lu.a, csw.nB, csw.g, 2);
      i($$0, lu.a, csw.no, csw.g);
      i($$0, lu.b, csw.nN, csw.g);
      i($$0, lu.a, csw.h, csw.g);
      a($$0, lu.a, csw.nD, csw.g, 2);
      i($$0, lu.a, csw.nq, csw.g);
      a($$0, lu.a, csw.nD, csw.h, 2);
      i($$0, lu.a, csw.nq, csw.h);
      i($$0, lu.a, csw.ea, csw.dZ);
      a($$0, lu.a, csw.nA, csw.c, 2);
      i($$0, lu.a, csw.nn, csw.c);
      i($$0, lu.b, csw.nJ, csw.c);
      i($$0, lu.a, csw.d, csw.c);
      a($$0, lu.a, csw.ns, csw.c, 2);
      i($$0, lu.a, csw.ne, csw.c);
      a($$0, lu.a, csw.ns, csw.d, 2);
      i($$0, lu.a, csw.ne, csw.d);
      a($$0, lu.a, csw.nE, csw.e, 2);
      i($$0, lu.a, csw.nr, csw.e);
      i($$0, lu.b, csw.nR, csw.e);
      i($$0, lu.a, csw.f, csw.e);
      a($$0, lu.a, csw.nv, csw.e, 2);
      i($$0, lu.a, csw.nh, csw.e);
      a($$0, lu.a, csw.nv, csw.f, 2);
      i($$0, lu.a, csw.nh, csw.f);
      ma.a(cmg.a(csw.eJ), lu.a, csw.nu, 2).b("has_mossy_stone_bricks", a(csw.eJ)).a($$0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      ma.a(cmg.a(csw.eJ), lu.a, csw.ng).b("has_mossy_stone_bricks", a(csw.eJ)).a($$0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      ma.a(cmg.a(csw.eJ), lu.b, csw.nI).b("has_mossy_stone_bricks", a(csw.eJ)).a($$0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      a($$0, lu.a, csw.nw, csw.cn, 2);
      i($$0, lu.a, csw.ni, csw.cn);
      i($$0, lu.b, csw.fQ, csw.cn);
      a($$0, lu.a, csw.ny, csw.jS, 2);
      i($$0, lu.a, csw.nl, csw.jS);
      a($$0, lu.a, csw.nt, csw.jU, 2);
      i($$0, lu.a, csw.nf, csw.jU);
      a($$0, lu.a, csw.nz, csw.jT, 2);
      i($$0, lu.a, csw.nm, csw.jT);
      ma.a(cmg.a(csw.kz), lu.a, csw.nx, 2).b("has_end_stone_brick", a(csw.kz)).a($$0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      ma.a(cmg.a(csw.kz), lu.a, csw.nj).b("has_end_stone_brick", a(csw.kz)).a($$0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      ma.a(cmg.a(csw.kz), lu.b, csw.nQ).b("has_end_stone_brick", a(csw.kz)).a($$0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      i($$0, lu.a, csw.kz, csw.fz);
      a($$0, lu.a, csw.nx, csw.fz, 2);
      i($$0, lu.a, csw.nj, csw.fz);
      i($$0, lu.b, csw.nQ, csw.fz);
      a($$0, lu.a, csw.jE, csw.jR, 2);
      a($$0, lu.a, csw.pu, csw.pr, 2);
      i($$0, lu.a, csw.ps, csw.pr);
      i($$0, lu.b, csw.pt, csw.pr);
      i($$0, lu.a, csw.pv, csw.pr);
      i($$0, lu.b, csw.pH, csw.pr);
      a($$0, lu.a, csw.pE, csw.pr, 2);
      i($$0, lu.a, csw.pD, csw.pr);
      i($$0, lu.a, csw.py, csw.pr);
      i($$0, lu.a, csw.pw, csw.pr);
      a($$0, lu.a, csw.pz, csw.pr, 2);
      i($$0, lu.a, csw.pA, csw.pr);
      i($$0, lu.b, csw.pB, csw.pr);
      a($$0, lu.a, csw.pE, csw.pv, 2);
      i($$0, lu.a, csw.pD, csw.pv);
      i($$0, lu.a, csw.pw, csw.pv);
      i($$0, lu.b, csw.pH, csw.pv);
      a($$0, lu.a, csw.pz, csw.pv, 2);
      i($$0, lu.a, csw.pA, csw.pv);
      i($$0, lu.b, csw.pB, csw.pv);
      i($$0, lu.a, csw.py, csw.pv);
      a($$0, lu.a, csw.pz, csw.pw, 2);
      i($$0, lu.a, csw.pA, csw.pw);
      i($$0, lu.b, csw.pB, csw.pw);
      a($$0, lu.a, csw.ra, csw.qS, 2);
      i($$0, lu.a, csw.qW, csw.qS);
      a($$0, lu.a, csw.qZ, csw.qR, 2);
      i($$0, lu.a, csw.qV, csw.qR);
      a($$0, lu.a, csw.qY, csw.qQ, 2);
      i($$0, lu.a, csw.qU, csw.qQ);
      a($$0, lu.a, csw.qX, csw.qP, 2);
      i($$0, lu.a, csw.qT, csw.qP);
      a($$0, lu.a, csw.rq, csw.ri, 2);
      i($$0, lu.a, csw.rm, csw.ri);
      a($$0, lu.a, csw.rp, csw.rh, 2);
      i($$0, lu.a, csw.rl, csw.rh);
      a($$0, lu.a, csw.ro, csw.rg, 2);
      i($$0, lu.a, csw.rk, csw.rg);
      a($$0, lu.a, csw.rn, csw.rf, 2);
      i($$0, lu.a, csw.rj, csw.rf);
      a($$0, lu.a, csw.qS, csw.qM, 4);
      a($$0, lu.a, csw.qW, csw.qM, 4);
      a($$0, lu.a, csw.ra, csw.qM, 8);
      a($$0, lu.a, csw.qR, csw.qL, 4);
      a($$0, lu.a, csw.qV, csw.qL, 4);
      a($$0, lu.a, csw.qZ, csw.qL, 8);
      a($$0, lu.a, csw.qQ, csw.qK, 4);
      a($$0, lu.a, csw.qU, csw.qK, 4);
      a($$0, lu.a, csw.qY, csw.qK, 8);
      a($$0, lu.a, csw.qP, csw.qJ, 4);
      a($$0, lu.a, csw.qT, csw.qJ, 4);
      a($$0, lu.a, csw.qX, csw.qJ, 8);
      a($$0, lu.a, csw.ri, csw.rb, 4);
      a($$0, lu.a, csw.rm, csw.rb, 4);
      a($$0, lu.a, csw.rq, csw.rb, 8);
      a($$0, lu.a, csw.rh, csw.rd, 4);
      a($$0, lu.a, csw.rl, csw.rd, 4);
      a($$0, lu.a, csw.rp, csw.rd, 8);
      a($$0, lu.a, csw.rg, csw.rc, 4);
      a($$0, lu.a, csw.rk, csw.rc, 4);
      a($$0, lu.a, csw.ro, csw.rc, 8);
      a($$0, lu.a, csw.rf, csw.re, 4);
      a($$0, lu.a, csw.rj, csw.re, 4);
      a($$0, lu.a, csw.rn, csw.re, 8);
      a($$0, lu.a, csw.rL, csw.rJ, 2);
      i($$0, lu.a, csw.rK, csw.rJ);
      i($$0, lu.b, csw.rM, csw.rJ);
      i($$0, lu.a, csw.rZ, csw.rJ);
      i($$0, lu.a, csw.rN, csw.rJ);
      a($$0, lu.a, csw.rP, csw.rJ, 2);
      i($$0, lu.a, csw.rO, csw.rJ);
      i($$0, lu.b, csw.rQ, csw.rJ);
      i($$0, lu.a, csw.rV, csw.rJ);
      a($$0, lu.a, csw.rX, csw.rJ, 2);
      i($$0, lu.a, csw.rW, csw.rJ);
      i($$0, lu.b, csw.rY, csw.rJ);
      i($$0, lu.a, csw.rR, csw.rJ);
      a($$0, lu.a, csw.rT, csw.rJ, 2);
      i($$0, lu.a, csw.rS, csw.rJ);
      i($$0, lu.b, csw.rU, csw.rJ);
      a($$0, lu.a, csw.rP, csw.rN, 2);
      i($$0, lu.a, csw.rO, csw.rN);
      i($$0, lu.b, csw.rQ, csw.rN);
      i($$0, lu.a, csw.rV, csw.rN);
      a($$0, lu.a, csw.rX, csw.rN, 2);
      i($$0, lu.a, csw.rW, csw.rN);
      i($$0, lu.b, csw.rY, csw.rN);
      i($$0, lu.a, csw.rR, csw.rN);
      a($$0, lu.a, csw.rT, csw.rN, 2);
      i($$0, lu.a, csw.rS, csw.rN);
      i($$0, lu.b, csw.rU, csw.rN);
      a($$0, lu.a, csw.rX, csw.rV, 2);
      i($$0, lu.a, csw.rW, csw.rV);
      i($$0, lu.b, csw.rY, csw.rV);
      i($$0, lu.a, csw.rR, csw.rV);
      a($$0, lu.a, csw.rT, csw.rV, 2);
      i($$0, lu.a, csw.rS, csw.rV);
      i($$0, lu.b, csw.rU, csw.rV);
      a($$0, lu.a, csw.rT, csw.rR, 2);
      i($$0, lu.a, csw.rS, csw.rR);
      i($$0, lu.b, csw.rU, csw.rR);
      b().forEach(($$1x, $$2x) -> a($$0, $$1x, $$2x));
      a($$0, cji.oX, lu.f, cji.pf);
      a($$0, cji.oY, lu.f, cji.pg);
      a($$0, cji.oW, lu.f, cji.pe);
      a($$0, cji.oZ, lu.f, cji.ph);
      a($$0, cji.or, lu.f, cji.ow);
      a($$0, cji.ou, lu.e, cji.oz);
      a($$0, cji.ot, lu.e, cji.oy);
      a($$0, cji.ov, lu.e, cji.oA);
      a($$0, cji.os, lu.e, cji.ox);
      o($$0, cji.ww, cji.eR);
      o($$0, cji.wx, cji.w);
      o($$0, cji.wy, cji.cn);
      o($$0, cji.wz, cji.w);
      o($$0, cji.wA, cji.eh);
      o($$0, cji.wB, cji.j);
      o($$0, cji.wC, cji.fR);
      o($$0, cji.wD, cji.w);
      o($$0, cji.wE, cji.in);
      o($$0, cji.wF, cji.vH);
      o($$0, cji.wG, cji.eR);
      o($$0, cji.wH, cji.en);
      o($$0, cji.wK, cji.j);
      o($$0, cji.wI, cji.hy);
      o($$0, cji.wJ, cji.hy);
      o($$0, cji.wL, cji.hy);
      o($$0, cji.wM, cji.hy);
      b($$0, lu.a, csw.ae, cji.dv);
      b($$0, csw.v, aqb.C, 2);
      h($$0, lu.b, csw.w, csw.jB);
      b($$0, cji.ny, csw.v);
      c($$0, cji.nz, cji.ny);
      e($$0, cji.pz, csw.al);
      e($$0, cji.pA, csw.af);
      e($$0, cji.pB, csw.ag);
      e($$0, cji.pC, csw.ah);
      e($$0, cji.pD, csw.ai);
      e($$0, cji.pE, csw.aj);
      e($$0, cji.pF, csw.ak);
      e($$0, cji.pG, csw.am);
      e($$0, cji.pH, cji.bN);
      e($$0, cji.pI, csw.ot);
      e($$0, cji.pJ, csw.ok);
      lx.a(lu.a, csw.cm).a('#', aqb.b).a('X', aqb.j).b("###").b("XXX").b("###").b("has_book", a((cpu)cji.qb)).a($$0);
      a($$0, cji.qv, csw.bS, "orange_dye");
      a($$0, cji.qD, csw.kC, "cyan_dye", 2);
      a($$0, csw.s, aqb.w, 4);
      a($$0, csw.at, csw.Z);
      a($$0, csw.aB, csw.aj);
      b($$0, cji.ns, csw.s);
      c($$0, cji.nt, cji.ns);
      a($$0, cji.qA, cji.dq, "pink_dye", 1);
      lx.a(lu.e, cji.wv).a('X', cji.oF).a('#', cji.nS).a('I', cji.oB).b("X").b("#").b("I").b("has_copper_ingot", a((cpu)cji.nS)).a($$0);
      lx.a(lu.b, cji.eg).a('#', cji.pX).b(" # ").b("# #").b(" # ").b("has_brick", a(aqb.aM)).a($$0, "decorated_pot_simple");
      md.a(cmm.w).a($$0, "decorated_pot");
   }

   public static Map<cja, aex> b() {
      return Stream.of(cji.wE, cji.wF, cji.wz, cji.wD, cji.wH, cji.wB, cji.wC, cji.wy, cji.wA, cji.wG, cji.wx, cji.wI, cji.wJ, cji.wK, cji.wL, cji.wM)
         .collect(Collectors.toMap(Function.identity(), $$0 -> new aex(c($$0) + "_smithing_trim")));
   }
}
