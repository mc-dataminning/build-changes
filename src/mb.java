import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mb extends lr {
   private static final ImmutableList<cpk> d = ImmutableList.of(cja.X, cja.Y);
   private static final ImmutableList<cpk> e = ImmutableList.of(cja.Z, cja.aa, cja.nP);
   private static final ImmutableList<cpk> f = ImmutableList.of(cja.ab, cja.ac, cja.nR);
   private static final ImmutableList<cpk> g = ImmutableList.of(cja.ad, cja.ae, cja.an, cja.nT);
   private static final ImmutableList<cpk> h = ImmutableList.of(cja.al, cja.am);
   private static final ImmutableList<cpk> i = ImmutableList.of(cja.aj, cja.ak);
   private static final ImmutableList<cpk> j = ImmutableList.of(cja.af, cja.ag);
   private static final ImmutableList<cpk> k = ImmutableList.of(cja.ah, cja.ai);

   public mb(jk $$0) {
      super($$0);
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      return CompletableFuture.allOf(super.a($$0), this.a($$0, lp.a, ae.a.b().a("impossible", new bw.a())));
   }

   @Override
   protected void a(Consumer<lo> $$0) {
      a($$0, cdu.a(cdw.a));
      a($$0, csm.r, apt.v, 4);
      b($$0, csm.p, apt.u, 4);
      b($$0, csm.oE, apt.A, 4);
      a($$0, csm.t, apt.s, 4);
      b($$0, csm.q, apt.x, 4);
      b($$0, csm.n, apt.t, 4);
      b($$0, csm.o, apt.y, 4);
      b($$0, csm.oF, apt.B, 4);
      b($$0, csm.u, apt.z, 4);
      a($$0, csm.as, csm.Y);
      a($$0, csm.aq, csm.W);
      a($$0, csm.au, csm.aa);
      a($$0, csm.ar, csm.X);
      a($$0, csm.ao, csm.U);
      a($$0, csm.ap, csm.V);
      a($$0, csm.ou, csm.os);
      a($$0, csm.ol, csm.oj);
      a($$0, csm.av, csm.ab);
      a($$0, csm.aA, csm.ai);
      a($$0, csm.ay, csm.ag);
      a($$0, csm.aC, csm.ak);
      a($$0, csm.az, csm.ah);
      a($$0, csm.aw, csm.al);
      a($$0, csm.ax, csm.af);
      a($$0, csm.ov, csm.ot);
      a($$0, csm.om, csm.ok);
      a($$0, csm.aD, csm.am);
      b($$0, cja.nq, csm.r);
      b($$0, cja.nm, csm.p);
      b($$0, cja.nu, csm.t);
      b($$0, cja.no, csm.q);
      b($$0, cja.ni, csm.n);
      b($$0, cja.nk, csm.o);
      b($$0, cja.nw, csm.u);
      List<cis> $$1 = List.of(cja.qJ, cja.qF, cja.qG, cja.qD, cja.qB, cja.qH, cja.qx, cja.qC, cja.qz, cja.qw, cja.qv, cja.qA, cja.qE, cja.qI, cja.qy, cja.qu);
      List<cis> $$2 = List.of(cja.cN, cja.cJ, cja.cK, cja.cH, cja.cF, cja.cL, cja.cB, cja.cG, cja.cD, cja.cA, cja.cz, cja.cE, cja.cI, cja.cM, cja.cC, cja.cy);
      List<cis> $$3 = List.of(cja.rd, cja.qZ, cja.ra, cja.qX, cja.qV, cja.rb, cja.qR, cja.qW, cja.qT, cja.qQ, cja.qP, cja.qU, cja.qY, cja.rc, cja.qS, cja.qO);
      List<cis> $$4 = List.of(cja.hx, cja.ht, cja.hu, cja.hr, cja.hp, cja.hv, cja.hl, cja.hq, cja.hn, cja.hk, cja.hj, cja.ho, cja.hs, cja.hw, cja.hm, cja.hi);
      a($$0, $$1, $$2, "wool");
      a($$0, $$1, $$3, "bed");
      a($$0, $$1, $$4, "carpet");
      f($$0, csm.iz, csm.bP);
      g($$0, cja.rd, csm.bP);
      h($$0, cja.uk, csm.bP);
      f($$0, csm.iv, csm.bL);
      g($$0, cja.qZ, csm.bL);
      h($$0, cja.ug, csm.bL);
      f($$0, csm.iw, csm.bM);
      g($$0, cja.ra, csm.bM);
      h($$0, cja.uh, csm.bM);
      f($$0, csm.it, csm.bJ);
      g($$0, cja.qX, csm.bJ);
      h($$0, cja.ue, csm.bJ);
      f($$0, csm.ir, csm.bH);
      g($$0, cja.qV, csm.bH);
      h($$0, cja.uc, csm.bH);
      f($$0, csm.ix, csm.bN);
      g($$0, cja.rb, csm.bN);
      h($$0, cja.ui, csm.bN);
      f($$0, csm.in, csm.bD);
      g($$0, cja.qR, csm.bD);
      h($$0, cja.tY, csm.bD);
      f($$0, csm.is, csm.bI);
      g($$0, cja.qW, csm.bI);
      h($$0, cja.ud, csm.bI);
      f($$0, csm.ip, csm.bF);
      g($$0, cja.qT, csm.bF);
      h($$0, cja.ua, csm.bF);
      f($$0, csm.im, csm.bC);
      g($$0, cja.qQ, csm.bC);
      h($$0, cja.tX, csm.bC);
      f($$0, csm.il, csm.bB);
      g($$0, cja.qP, csm.bB);
      h($$0, cja.tW, csm.bB);
      f($$0, csm.iq, csm.bG);
      g($$0, cja.qU, csm.bG);
      h($$0, cja.ub, csm.bG);
      f($$0, csm.iu, csm.bK);
      g($$0, cja.qY, csm.bK);
      h($$0, cja.uf, csm.bK);
      f($$0, csm.iy, csm.bO);
      g($$0, cja.rc, csm.bO);
      h($$0, cja.uj, csm.bO);
      f($$0, csm.ik, csm.bA);
      g($$0, cja.qO, csm.bA);
      h($$0, cja.tV, csm.bA);
      f($$0, csm.io, csm.bE);
      g($$0, cja.qS, csm.bE);
      h($$0, cja.tZ, csm.bE);
      f($$0, csm.rz, csm.rB);
      i($$0, csm.ey, cja.qJ);
      j($$0, csm.hO, csm.ey);
      k($$0, csm.hO, cja.qJ);
      i($$0, csm.eu, cja.qF);
      j($$0, csm.hK, csm.eu);
      k($$0, csm.hK, cja.qF);
      i($$0, csm.ev, cja.qG);
      j($$0, csm.hL, csm.ev);
      k($$0, csm.hL, cja.qG);
      i($$0, csm.es, cja.qD);
      j($$0, csm.hI, csm.es);
      k($$0, csm.hI, cja.qD);
      i($$0, csm.eq, cja.qB);
      j($$0, csm.hG, csm.eq);
      k($$0, csm.hG, cja.qB);
      i($$0, csm.ew, cja.qH);
      j($$0, csm.hM, csm.ew);
      k($$0, csm.hM, cja.qH);
      i($$0, csm.em, cja.qx);
      j($$0, csm.hC, csm.em);
      k($$0, csm.hC, cja.qx);
      i($$0, csm.er, cja.qC);
      j($$0, csm.hH, csm.er);
      k($$0, csm.hH, cja.qC);
      i($$0, csm.eo, cja.qz);
      j($$0, csm.hE, csm.eo);
      k($$0, csm.hE, cja.qz);
      i($$0, csm.el, cja.qw);
      j($$0, csm.hB, csm.el);
      k($$0, csm.hB, cja.qw);
      i($$0, csm.ek, cja.qv);
      j($$0, csm.hA, csm.ek);
      k($$0, csm.hA, cja.qv);
      i($$0, csm.ep, cja.qA);
      j($$0, csm.hF, csm.ep);
      k($$0, csm.hF, cja.qA);
      i($$0, csm.et, cja.qE);
      j($$0, csm.hJ, csm.et);
      k($$0, csm.hJ, cja.qE);
      i($$0, csm.ex, cja.qI);
      j($$0, csm.hN, csm.ex);
      k($$0, csm.hN, cja.qI);
      i($$0, csm.ej, cja.qu);
      j($$0, csm.hz, csm.ej);
      k($$0, csm.hz, cja.qu);
      i($$0, csm.en, cja.qy);
      j($$0, csm.hD, csm.en);
      k($$0, csm.hD, cja.qy);
      l($$0, csm.hy, cja.qJ);
      l($$0, csm.hu, cja.qF);
      l($$0, csm.hv, cja.qG);
      l($$0, csm.hs, cja.qD);
      l($$0, csm.hq, cja.qB);
      l($$0, csm.hw, cja.qH);
      l($$0, csm.hm, cja.qx);
      l($$0, csm.hr, cja.qC);
      l($$0, csm.ho, cja.qz);
      l($$0, csm.hl, cja.qw);
      l($$0, csm.hk, cja.qv);
      l($$0, csm.hp, cja.qA);
      l($$0, csm.ht, cja.qE);
      l($$0, csm.hx, cja.qI);
      l($$0, csm.hj, cja.qu);
      l($$0, csm.hn, cja.qy);
      m($$0, csm.mb, cja.qJ);
      m($$0, csm.lX, cja.qF);
      m($$0, csm.lY, cja.qG);
      m($$0, csm.lV, cja.qD);
      m($$0, csm.lT, cja.qB);
      m($$0, csm.lZ, cja.qH);
      m($$0, csm.lP, cja.qx);
      m($$0, csm.lU, cja.qC);
      m($$0, csm.lR, cja.qz);
      m($$0, csm.lO, cja.qw);
      m($$0, csm.lN, cja.qv);
      m($$0, csm.lS, cja.qA);
      m($$0, csm.lW, cja.qE);
      m($$0, csm.ma, cja.qI);
      m($$0, csm.lM, cja.qu);
      m($$0, csm.lQ, cja.qy);
      ls.a(lq.b, cja.vU).a('S', cja.oE).a('H', cja.vA).b("S").b("H").b("has_string", a((cpk)cja.oE)).b("has_honeycomb", a((cpk)cja.vA)).a($$0);
      n($$0, csm.qb, cja.qJ);
      n($$0, csm.pX, cja.qF);
      n($$0, csm.pY, cja.qG);
      n($$0, csm.pV, cja.qD);
      n($$0, csm.pT, cja.qB);
      n($$0, csm.pZ, cja.qH);
      n($$0, csm.pP, cja.qx);
      n($$0, csm.pU, cja.qC);
      n($$0, csm.pR, cja.qz);
      n($$0, csm.pO, cja.qw);
      n($$0, csm.pN, cja.qv);
      n($$0, csm.pS, cja.qA);
      n($$0, csm.pW, cja.qE);
      n($$0, csm.qa, cja.qI);
      n($$0, csm.pM, cja.qu);
      n($$0, csm.pQ, cja.qy);
      lt.a(lq.a, csm.eM, 1).b(csm.rH).b(cja.oI).b("has_mud", a(csm.rH)).a($$0);
      ls.a(lq.a, csm.eN, 4).a('#', csm.eM).b("##").b("##").b("has_packed_mud", a(csm.eM)).a($$0);
      lt.a(lq.a, csm.ad, 1).b(csm.rH).b(cja.bo).b("has_mangrove_roots", a(csm.ac)).a($$0);
      ls.a(lq.d, csm.hh, 6).a('#', csm.dK).a('S', cja.oB).a('X', cja.nQ).b("XSX").b("X#X").b("XSX").b("has_rail", a(csm.cP)).a($$0);
      lt.a(lq.a, csm.g, 2).b(csm.e).b(csm.m).b("has_stone", a(csm.e)).a($$0);
      ls.a(lq.b, csm.gS).a('I', csm.ci).a('i', cja.nQ).b("III").b(" i ").b("iii").b("has_iron_block", a(csm.ci)).a($$0);
      ls.a(lq.b, cja.tL).a('/', cja.oB).a('_', csm.jE).b("///").b(" / ").b("/_/").b("has_stone_slab", a(csm.jE)).a($$0);
      ls.a(lq.f, cja.nH, 4)
         .a('#', cja.oB)
         .a('X', cja.pi)
         .a('Y', cja.oF)
         .b("X")
         .b("#")
         .b("Y")
         .b("has_feather", a((cpk)cja.oF))
         .b("has_flint", a((cpk)cja.pi))
         .a($$0);
      ls.a(lq.b, csm.nU, 1).a('P', apt.b).a('S', apt.j).b("PSP").b("P P").b("PSP").b("has_planks", a(apt.b)).b("has_wood_slab", a(apt.j)).a($$0);
      ls.a(lq.i, csm.fO).a('S', cja.ty).a('G', csm.aQ).a('O', csm.co).b("GGG").b("GSG").b("OOO").b("has_nether_star", a((cpk)cja.ty)).a($$0);
      ls.a(lq.b, csm.pf).a('P', apt.b).a('H', cja.vA).b("PPP").b("HHH").b("PPP").b("has_honeycomb", a((cpk)cja.vA)).a($$0);
      lt.a(lq.g, cja.us).b(cja.oC).a(cja.uq, 6).b("has_beetroot", a((cpk)cja.uq)).a($$0);
      lt.a(lq.i, cja.qJ).b(cja.qr).b("black_dye").b("has_ink_sac", a((cpk)cja.qr)).a($$0);
      a($$0, cja.qJ, csm.cd, "black_dye");
      lt.a(lq.h, cja.rz, 2).b(cja.rr).b("has_blaze_rod", a((cpk)cja.rr)).a($$0);
      lt.a(lq.i, cja.qF).b(cja.nM).b("blue_dye").b("has_lapis_lazuli", a((cpk)cja.nM)).a($$0);
      a($$0, cja.qF, csm.cc, "blue_dye");
      b($$0, lq.a, csm.mW, csm.iC);
      lt.a(lq.i, cja.qK, 3).b(cja.qL).b("bonemeal").b("has_bone", a((cpk)cja.qL)).a($$0);
      b($$0, lq.i, cja.qK, lq.a, cja.iE, "bone_meal_from_bone_block", "bonemeal");
      lt.a(lq.i, cja.qb).a(cja.qa, 3).b(cja.pP).b("has_paper", a((cpk)cja.qa)).a($$0);
      ls.a(lq.a, csm.cl).a('#', apt.b).a('X', cja.qb).b("###").b("XXX").b("###").b("has_book", a((cpk)cja.qb)).a($$0);
      ls.a(lq.f, cja.nG).a('#', cja.oB).a('X', cja.oE).b(" #X").b("# X").b(" #X").b("has_string", a((cpk)cja.oE)).a($$0);
      ls.a(lq.i, cja.oC, 4)
         .a('#', apt.b)
         .b("# #")
         .b(" # ")
         .b("has_brown_mushroom", a(csm.cf))
         .b("has_red_mushroom", a(csm.cg))
         .b("has_mushroom_stew", a((cpk)cja.oD))
         .a($$0);
      ls.a(lq.g, cja.oJ).a('#', cja.oI).b("###").b("has_wheat", a((cpk)cja.oI)).a($$0);
      ls.a(lq.h, csm.fs).a('B', cja.rr).a('#', apt.ay).b(" B ").b("###").b("has_blaze_rod", a((cpk)cja.rr)).a($$0);
      ls.a(lq.a, csm.cj).a('#', cja.pX).b("##").b("##").b("has_brick", a((cpk)cja.pX)).a($$0);
      lt.a(lq.i, cja.qG).b(cja.qt).b("brown_dye").b("has_cocoa_beans", a((cpk)cja.qt)).a($$0);
      ls.a(lq.i, cja.pK).a('#', cja.nQ).b("# #").b(" # ").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.g, csm.eh).a('A', cja.pQ).a('B', cja.qM).a('C', cja.oI).a('E', cja.qd).b("AAA").b("BEB").b("CCC").b("has_egg", a((cpk)cja.qd)).a($$0);
      ls.a(lq.b, csm.og).a('L', apt.r).a('S', cja.oB).a('C', apt.as).b(" S ").b("SCS").b("LLL").b("has_stick", a((cpk)cja.oB)).b("has_coal", a(apt.as)).a($$0);
      ls.a(lq.d, cja.nf).a('#', cja.qh).a('X', cja.tl).b("# ").b(" X").b("has_carrot", a((cpk)cja.tl)).a($$0);
      ls.a(lq.d, cja.ng).a('#', cja.qh).a('X', cja.dh).b("# ").b(" X").b("has_warped_fungus", a((cpk)cja.dh)).a($$0);
      ls.a(lq.h, csm.ft).a('#', cja.nQ).b("# #").b("# #").b("###").b("has_water_bucket", a((cpk)cja.pL)).a($$0);
      ls.a(lq.b, csm.pc).a('#', apt.j).b("# #").b("# #").b("###").b("has_wood_slab", a(apt.j)).a($$0);
      ls.a(lq.b, csm.cv)
         .a('#', apt.b)
         .b("###")
         .b("# #")
         .b("###")
         .b("has_lots_of_items", new bx.a(Optional.empty(), cj.d.b(10), cj.d.c, cj.d.c, List.of()))
         .a($$0);
      lt.a(lq.d, cja.nb).b(csm.cv).b(cja.na).b("has_minecart", a((cpk)cja.na)).a($$0);
      c($$0, cja.nr, cja.nq);
      c($$0, cja.nn, cja.nm);
      c($$0, cja.nv, cja.nu);
      c($$0, cja.np, cja.no);
      c($$0, cja.nj, cja.ni);
      c($$0, cja.nl, cja.nk);
      c($$0, cja.nx, cja.nw);
      b(lq.a, csm.he, clx.a(csm.jN)).b("has_chiseled_quartz_block", a(csm.he)).b("has_quartz_block", a(csm.hd)).b("has_quartz_pillar", a(csm.hf)).a($$0);
      b(lq.a, csm.eL, clx.a(csm.jK)).b("has_tag", a(apt.c)).a($$0);
      a($$0, lq.a, csm.dR, cja.pY);
      ls.a(lq.e, cja.qi).a('#', cja.nU).a('X', cja.ll).b(" # ").b("#X#").b(" # ").b("has_redstone", a((cpk)cja.ll)).a($$0);
      a($$0, lq.i, cja.nI, lq.a, cja.aq);
      ls.a(lq.a, csm.k, 4).a('D', csm.j).a('G', csm.L).b("DG").b("GD").b("has_gravel", a(csm.L)).a($$0);
      ls.a(lq.c, csm.gY).a('#', csm.dK).a('X', cja.nN).a('I', csm.b).b(" # ").b("#X#").b("III").b("has_quartz", a((cpk)cja.nN)).a($$0);
      ls.a(lq.e, cja.qe).a('#', cja.nQ).a('X', cja.ll).b(" # ").b("#X#").b(" # ").b("has_redstone", a((cpk)cja.ll)).a($$0);
      ls.a(lq.g, cja.re, 8).a('#', cja.oI).a('X', cja.qt).b("#X#").b("has_cocoa", a((cpk)cja.qt)).a($$0);
      ls.a(lq.b, csm.cA).a('#', apt.b).b("##").b("##").b("unlock_right_away", cq.a.g()).a(false).a($$0);
      ls.a(lq.f, cja.uZ)
         .a('~', cja.oE)
         .a('#', cja.oB)
         .a('&', cja.nQ)
         .a('$', csm.fH)
         .b("#&#")
         .b("~$~")
         .b(" # ")
         .b("has_string", a((cpk)cja.oE))
         .b("has_iron_ingot", a((cpk)cja.nQ))
         .b("has_tripwire_hook", a(csm.fH))
         .a($$0);
      ls.a(lq.b, csm.nT).a('#', apt.b).a('@', cja.oE).b("@@").b("##").b("has_string", a((cpk)cja.oE)).a($$0);
      b(lq.a, csm.jq, clx.a(csm.jO)).b("has_red_sandstone", a(csm.jp)).b("has_chiseled_red_sandstone", a(csm.jq)).b("has_cut_red_sandstone", a(csm.jr)).a($$0);
      g($$0, lq.a, csm.aW, csm.jF);
      b($$0, lq.i, cja.nS, lq.a, cja.ax, d(cja.nS), c(cja.nS));
      lt.a(lq.i, cja.nS, 9).b(csm.rb).b(c(cja.nS)).b(b(csm.rb), a(csm.rb)).a($$0, a(cja.nS, csm.rb));
      b($$0);
      lt.a(lq.i, cja.qD, 2).b(cja.qF).b(cja.qH).b("cyan_dye").b("has_green_dye", a((cpk)cja.qH)).b("has_blue_dye", a((cpk)cja.qF)).a($$0);
      ls.a(lq.a, csm.ib).a('S', cja.tE).a('I', cja.qJ).b("SSS").b("SIS").b("SSS").b("has_prismarine_shard", a((cpk)cja.tE)).a($$0);
      ls.a(lq.c, csm.gZ).a('Q', cja.nN).a('G', csm.aQ).a('W', clx.a(apt.j)).b("GGG").b("QQQ").b("WWW").b("has_quartz", a((cpk)cja.nN)).a($$0);
      ls.a(lq.a, csm.rV, 4).a('S', csm.rN).b("SS").b("SS").b("has_polished_deepslate", a(csm.rN)).a($$0);
      ls.a(lq.a, csm.rR, 4).a('S', csm.rV).b("SS").b("SS").b("has_deepslate_bricks", a(csm.rV)).a($$0);
      ls.a(lq.d, csm.bq, 6).a('R', cja.ll).a('#', csm.dx).a('X', cja.nQ).b("X X").b("X#X").b("XRX").b("has_rail", a(csm.cP)).a($$0);
      ls.a(lq.e, cja.ou).a('#', cja.oB).a('X', cja.nK).b("XX").b("X#").b(" #").b("has_diamond", a((cpk)cja.nK)).a($$0);
      a($$0, lq.i, cja.nK, lq.a, cja.az);
      ls.a(lq.f, cja.oZ).a('X', cja.nK).b("X X").b("X X").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.f, cja.oX).a('X', cja.nK).b("X X").b("XXX").b("XXX").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.f, cja.oW).a('X', cja.nK).b("XXX").b("X X").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.e, cja.ov).a('#', cja.oB).a('X', cja.nK).b("XX").b(" #").b(" #").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.f, cja.oY).a('X', cja.nK).b("XXX").b("X X").b("X X").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.e, cja.ot).a('#', cja.oB).a('X', cja.nK).b("XXX").b(" # ").b(" # ").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.e, cja.os).a('#', cja.oB).a('X', cja.nK).b("X").b("#").b("#").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.f, cja.or).a('#', cja.oB).a('X', cja.nK).b("X").b("X").b("#").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.a, csm.e, 2).a('Q', cja.nN).a('C', csm.m).b("CQ").b("QC").b("has_quartz", a((cpk)cja.nN)).a($$0);
      ls.a(lq.c, csm.aU).a('R', cja.ll).a('#', csm.m).a('X', cja.nG).b("###").b("#X#").b("#R#").b("has_bow", a((cpk)cja.nG)).a($$0);
      a($$0, lq.a, csm.rt, cja.wp);
      ls.a(lq.c, csm.hi).a('R', cja.ll).a('#', csm.m).b("###").b("# #").b("#R#").b("has_redstone", a((cpk)cja.ll)).a($$0);
      a($$0, lq.i, cja.nL, lq.a, cja.fW);
      ls.a(lq.b, csm.fr).a('B', cja.qb).a('#', csm.co).a('D', cja.nK).b(" B ").b("D#D").b("###").b("has_obsidian", a(csm.co)).a($$0);
      ls.a(lq.b, csm.fG).a('#', csm.co).a('E', cja.rD).b("###").b("#E#").b("###").b("has_ender_eye", a((cpk)cja.rD)).a($$0);
      lt.a(lq.i, cja.rD).b(cja.rq).b(cja.rz).b("has_blaze_powder", a((cpk)cja.rz)).a($$0);
      ls.a(lq.a, csm.kz, 4).a('#', csm.fz).b("##").b("##").b("has_end_stone", a(csm.fz)).a($$0);
      ls.a(lq.b, cja.ul).a('T', cja.rs).a('E', cja.rD).a('G', csm.aQ).b("GGG").b("GEG").b("GTG").b("has_ender_eye", a((cpk)cja.rD)).a($$0);
      ls.a(lq.b, csm.kt, 4).a('#', cja.un).a('/', cja.rr).b("/").b("#").b("has_chorus_fruit_popped", a((cpk)cja.un)).a($$0);
      lt.a(lq.h, cja.ry).b(cja.rx).b(csm.cf).b(cja.qM).b("has_spider_eye", a((cpk)cja.rx)).a($$0);
      lt.a(lq.i, cja.tf, 3).b(cja.oG).b(cja.rz).a(clx.a(cja.nI, cja.nJ)).b("has_blaze_powder", a((cpk)cja.rz)).a($$0);
      lt.a(lq.i, cja.tA, 3).b(cja.oG).b(cja.qa).b("has_gunpowder", a((cpk)cja.oG)).a($$0, "firework_rocket_simple");
      ls.a(lq.e, cja.qh).a('#', cja.oB).a('X', cja.oE).b("  #").b(" #X").b("# X").b("has_string", a((cpk)cja.oE)).a($$0);
      lt.a(lq.e, cja.nE).b(cja.nQ).b(cja.pi).b("has_flint", a((cpk)cja.pi)).b("has_obsidian", a(csm.co)).a($$0);
      ls.a(lq.b, csm.fR).a('#', cja.pX).b("# #").b(" # ").b("has_brick", a((cpk)cja.pX)).a($$0);
      ls.a(lq.b, csm.cD).a('#', apt.ay).b("###").b("# #").b("###").b("has_cobblestone", a(apt.ay)).a($$0);
      lt.a(lq.d, cja.nc).b(csm.cD).b(cja.na).b("has_minecart", a((cpk)cja.na)).a($$0);
      ls.a(lq.h, cja.rw, 3).a('#', csm.aQ).b("# #").b(" # ").b("has_glass", a(csm.aQ)).a($$0);
      ls.a(lq.b, csm.eZ, 16).a('#', csm.aQ).b("###").b("###").b("has_glass", a(csm.aQ)).a($$0);
      a($$0, lq.a, csm.ed, cja.qk);
      lt.a(lq.b, cja.tj).b(cja.ti).b(cja.qs).b("has_item_frame", a((cpk)cja.ti)).b("has_glow_ink_sac", a((cpk)cja.qs)).a($$0);
      ls.a(lq.g, cja.pm).a('#', cja.nU).a('X', cja.nF).b("###").b("#X#").b("###").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.e, cja.ok).a('#', cja.oB).a('X', cja.nU).b("XX").b("X#").b(" #").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.f, cja.pd).a('X', cja.nU).b("X X").b("X X").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.h, cja.tq).a('#', cja.rt).a('X', cja.tl).b("###").b("#X#").b("###").b("has_gold_nugget", a((cpk)cja.rt)).a($$0);
      ls.a(lq.f, cja.pb).a('X', cja.nU).b("X X").b("XXX").b("XXX").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.f, cja.pa).a('X', cja.nU).b("XXX").b("X X").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.e, cja.ol).a('#', cja.oB).a('X', cja.nU).b("XX").b(" #").b(" #").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.f, cja.pc).a('X', cja.nU).b("XXX").b("X X").b("X X").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.e, cja.oj).a('#', cja.oB).a('X', cja.nU).b("XXX").b(" # ").b(" # ").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.d, csm.bp, 6).a('R', cja.ll).a('#', cja.oB).a('X', cja.nU).b("X X").b("X#X").b("XRX").b("has_rail", a(csm.cP)).a($$0);
      ls.a(lq.e, cja.oi).a('#', cja.oB).a('X', cja.nU).b("X").b("#").b("#").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      ls.a(lq.f, cja.oh).a('#', cja.oB).a('X', cja.nU).b("X").b("X").b("#").b("has_gold_ingot", a((cpk)cja.nU)).a($$0);
      b($$0, lq.i, cja.nU, lq.a, cja.ay, "gold_ingot_from_gold_block", "gold_ingot");
      a($$0, lq.i, cja.rt, lq.i, cja.nU, "gold_ingot_from_nuggets", "gold_ingot");
      lt.a(lq.a, csm.c).b(csm.e).b(cja.nN).b("has_quartz", a((cpk)cja.nN)).a($$0);
      lt.a(lq.i, cja.qB, 2).b(cja.qJ).b(cja.qu).b("has_white_dye", a((cpk)cja.qu)).b("has_black_dye", a((cpk)cja.qJ)).a($$0);
      b($$0, lq.a, csm.ij, cja.oI);
      d($$0, csm.gX, cja.nQ);
      lt.a(lq.g, cja.vD, 4).b(cja.lt).a(cja.rw, 4).b("has_honey_block", a(csm.pg)).a($$0);
      a($$0, lq.c, csm.pg, cja.vD);
      a($$0, lq.b, csm.ph, cja.vA);
      ls.a(lq.c, csm.hc).a('C', csm.cv).a('I', cja.nQ).b("I I").b("ICI").b(" I ").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      lt.a(lq.d, cja.ne).b(csm.hc).b(cja.na).b("has_minecart", a((cpk)cja.na)).a($$0);
      ls.a(lq.e, cja.op).a('#', cja.oB).a('X', cja.nQ).b("XX").b("X#").b(" #").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.b, csm.eX, 16).a('#', cja.nQ).b("###").b("###").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.f, cja.oV).a('X', cja.nQ).b("X X").b("X X").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.f, cja.oT).a('X', cja.nQ).b("X X").b("XXX").b("XXX").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      a(csm.dy, clx.a(cja.nQ)).a(b(cja.nQ), a((cpk)cja.nQ)).a($$0);
      ls.a(lq.f, cja.oS).a('X', cja.nQ).b("XXX").b("X X").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.e, cja.oq).a('#', cja.oB).a('X', cja.nQ).b("XX").b(" #").b(" #").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      b($$0, lq.i, cja.nQ, lq.a, cja.aw, "iron_ingot_from_iron_block", "iron_ingot");
      a($$0, lq.i, cja.uB, lq.i, cja.nQ, "iron_ingot_from_nuggets", "iron_ingot");
      ls.a(lq.f, cja.oU).a('X', cja.nQ).b("XXX").b("X X").b("X X").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.e, cja.oo).a('#', cja.oB).a('X', cja.nQ).b("XXX").b(" # ").b(" # ").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.e, cja.on).a('#', cja.oB).a('X', cja.nQ).b("X").b("#").b("#").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.f, cja.om).a('#', cja.oB).a('X', cja.nQ).b("X").b("X").b("#").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      a($$0, lq.c, csm.hY, cja.nQ);
      ls.a(lq.b, cja.ti).a('#', cja.oB).a('X', cja.pP).b("###").b("#X#").b("###").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.b, csm.dT).a('#', apt.b).a('X', cja.nK).b("###").b("#X#").b("###").b("has_diamond", a((cpk)cja.nK)).a($$0);
      ls.a(lq.b, csm.cO, 3).a('#', cja.oB).b("# #").b("###").b("# #").b("has_stick", a((cpk)cja.oB)).a($$0);
      a($$0, lq.i, cja.nM, lq.a, cja.cm);
      ls.a(lq.e, cja.tQ, 2).a('~', cja.oE).a('O', cja.qc).b("~~ ").b("~O ").b("  ~").b("has_slime_ball", a((cpk)cja.qc)).a($$0);
      a($$0, lq.i, cja.pP, cja.tK);
      ls.a(lq.f, cja.oN).a('X', cja.pP).b("X X").b("X X").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.f, cja.oL).a('X', cja.pP).b("X X").b("XXX").b("XXX").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.f, cja.oK).a('X', cja.pP).b("XXX").b("X X").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.f, cja.oM).a('X', cja.pP).b("XXX").b("X X").b("X X").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.i, cja.tP).a('X', cja.pP).b("X X").b("XXX").b("X X").b("has_leather", a((cpk)cja.pP)).a($$0);
      ls.a(lq.c, csm.oa).a('S', apt.j).a('B', csm.cl).b("SSS").b(" B ").b(" S ").b("has_book", a((cpk)cja.qb)).a($$0);
      ls.a(lq.c, csm.dw).a('#', csm.m).a('X', cja.oB).b("X").b("#").b("has_cobblestone", a(csm.m)).a($$0);
      a($$0, cja.qx, csm.bU, "light_blue_dye");
      lt.a(lq.i, cja.qx, 2)
         .b(cja.qF)
         .b(cja.qu)
         .b("light_blue_dye")
         .b("has_blue_dye", a((cpk)cja.qF))
         .b("has_white_dye", a((cpk)cja.qu))
         .a($$0, "light_blue_dye_from_blue_white_dye");
      a($$0, cja.qC, csm.bW, "light_gray_dye");
      lt.a(lq.i, cja.qC, 2)
         .b(cja.qB)
         .b(cja.qu)
         .b("light_gray_dye")
         .b("has_gray_dye", a((cpk)cja.qB))
         .b("has_white_dye", a((cpk)cja.qu))
         .a($$0, "light_gray_dye_from_gray_white_dye");
      lt.a(lq.i, cja.qC, 3)
         .b(cja.qJ)
         .a(cja.qu, 2)
         .b("light_gray_dye")
         .b("has_white_dye", a((cpk)cja.qu))
         .b("has_black_dye", a((cpk)cja.qJ))
         .a($$0, "light_gray_dye_from_black_white_dye");
      a($$0, cja.qC, csm.cb, "light_gray_dye");
      a($$0, cja.qC, csm.bZ, "light_gray_dye");
      d($$0, csm.gW, cja.nU);
      ls.a(lq.c, csm.rr).a('#', cja.nS).b("#").b("#").b("#").b("has_copper_ingot", a((cpk)cja.nS)).a($$0);
      lt.a(lq.i, cja.qz, 2).b(cja.qH).b(cja.qu).b("has_green_dye", a((cpk)cja.qH)).b("has_white_dye", a((cpk)cja.qu)).a($$0);
      ls.a(lq.a, csm.eg).a('A', csm.ef).a('B', csm.cp).b("A").b("B").b("has_carved_pumpkin", a(csm.ef)).a($$0);
      a($$0, cja.qw, csm.bV, "magenta_dye");
      lt.a(lq.i, cja.qw, 4)
         .b(cja.qF)
         .a(cja.qI, 2)
         .b(cja.qu)
         .b("magenta_dye")
         .b("has_blue_dye", a((cpk)cja.qF))
         .b("has_rose_red", a((cpk)cja.qI))
         .b("has_white_dye", a((cpk)cja.qu))
         .a($$0, "magenta_dye_from_blue_red_white_dye");
      lt.a(lq.i, cja.qw, 3)
         .b(cja.qF)
         .b(cja.qI)
         .b(cja.qA)
         .b("magenta_dye")
         .b("has_pink_dye", a((cpk)cja.qA))
         .b("has_blue_dye", a((cpk)cja.qF))
         .b("has_red_dye", a((cpk)cja.qI))
         .a($$0, "magenta_dye_from_blue_red_pink");
      a($$0, cja.qw, csm.iE, "magenta_dye", 2);
      lt.a(lq.i, cja.qw, 2)
         .b(cja.qE)
         .b(cja.qA)
         .b("magenta_dye")
         .b("has_pink_dye", a((cpk)cja.qA))
         .b("has_purple_dye", a((cpk)cja.qE))
         .a($$0, "magenta_dye_from_purple_and_pink");
      a($$0, lq.a, csm.kJ, cja.rA);
      lt.a(lq.h, cja.rA).b(cja.rz).b(cja.qc).b("has_blaze_powder", a((cpk)cja.rz)).a($$0);
      ls.a(lq.i, cja.tp).a('#', cja.qa).a('X', cja.qe).b("###").b("#X#").b("###").b("has_compass", a((cpk)cja.qe)).a($$0);
      a($$0, lq.a, csm.fa, cja.rh, "has_melon");
      lt.a(lq.i, cja.rk).b(cja.rh).b("has_melon", a((cpk)cja.rh)).a($$0);
      ls.a(lq.d, cja.na).a('#', cja.nQ).b("# #").b("###").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      lt.a(lq.a, csm.cn).b(csm.m).b(csm.ff).b("mossy_cobblestone").b("has_vine", a(csm.ff)).a($$0, a(csm.cn, csm.ff));
      lt.a(lq.a, csm.eJ).b(csm.eI).b(csm.ff).b("mossy_stone_bricks").b("has_vine", a(csm.ff)).a($$0, a(csm.eJ, csm.ff));
      lt.a(lq.a, csm.cn).b(csm.m).b(csm.rB).b("mossy_cobblestone").b("has_moss_block", a(csm.rB)).a($$0, a(csm.cn, csm.rB));
      lt.a(lq.a, csm.eJ).b(csm.eI).b(csm.rB).b("mossy_stone_bricks").b("has_moss_block", a(csm.rB)).a($$0, a(csm.eJ, csm.rB));
      lt.a(lq.g, cja.oD)
         .b(csm.cf)
         .b(csm.cg)
         .b(cja.oC)
         .b("has_mushroom_stew", a((cpk)cja.oD))
         .b("has_bowl", a((cpk)cja.oC))
         .b("has_brown_mushroom", a(csm.cf))
         .b("has_red_mushroom", a(csm.cg))
         .a($$0);
      a($$0, lq.a, csm.fn, cja.tD);
      b($$0, lq.a, csm.kK, cja.ru);
      ls.a(lq.c, csm.aY).a('#', apt.b).a('X', cja.ll).b("###").b("#X#").b("###").b("has_redstone", a((cpk)cja.ll)).a($$0);
      ls.a(lq.c, csm.kO).a('Q', cja.nN).a('R', cja.ll).a('#', csm.m).b("###").b("RRQ").b("###").b("has_quartz", a((cpk)cja.nN)).a($$0);
      a($$0, cja.qv, csm.bY, "orange_dye");
      lt.a(lq.i, cja.qv, 2)
         .b(cja.qI)
         .b(cja.qy)
         .b("orange_dye")
         .b("has_red_dye", a((cpk)cja.qI))
         .b("has_yellow_dye", a((cpk)cja.qy))
         .a($$0, "orange_dye_from_red_yellow");
      ls.a(lq.b, cja.pl).a('#', cja.oB).a('X', clx.a(apt.a)).b("###").b("#X#").b("###").b("has_wool", a(apt.a)).a($$0);
      ls.a(lq.i, cja.qa, 3).a('#', csm.dS).b("###").b("has_reeds", a(csm.dS)).a($$0);
      ls.a(lq.a, csm.hf, 2)
         .a('#', csm.hd)
         .b("#")
         .b("#")
         .b("has_chiseled_quartz_block", a(csm.he))
         .b("has_quartz_block", a(csm.hd))
         .b("has_quartz_pillar", a(csm.hf))
         .a($$0);
      b($$0, lq.a, csm.iC, csm.dO);
      a($$0, cja.qA, csm.iG, "pink_dye", 2);
      a($$0, cja.qA, csm.ca, "pink_dye");
      lt.a(lq.i, cja.qA, 2)
         .b(cja.qI)
         .b(cja.qu)
         .b("pink_dye")
         .b("has_white_dye", a((cpk)cja.qu))
         .b("has_red_dye", a((cpk)cja.qI))
         .a($$0, "pink_dye_from_red_white_dye");
      ls.a(lq.c, csm.by).a('R', cja.ll).a('#', csm.m).a('T', apt.b).a('X', cja.nQ).b("TTT").b("#X#").b("#R#").b("has_redstone", a((cpk)cja.ll)).a($$0);
      e($$0, lq.a, csm.ea, csm.dZ);
      a($$0, lq.a, csm.hZ, cja.tE);
      b($$0, lq.a, csm.ia, cja.tE);
      lt.a(lq.g, cja.tz).b(csm.dV).b(cja.qM).b(cja.qd).b("has_carved_pumpkin", a(csm.ef)).b("has_pumpkin", a(csm.dV)).a($$0);
      lt.a(lq.i, cja.rj, 4).b(csm.dV).b("has_pumpkin", a(csm.dV)).a($$0);
      lt.a(lq.i, cja.qE, 2).b(cja.qF).b(cja.qI).b("has_blue_dye", a((cpk)cja.qF)).b("has_red_dye", a((cpk)cja.qI)).a($$0);
      ls.a(lq.b, csm.kP).a('#', csm.cv).a('-', cja.uA).b("-").b("#").b("-").b("has_shulker_shell", a((cpk)cja.uA)).a($$0);
      ls.a(lq.a, csm.kw, 4).a('F', cja.un).b("FF").b("FF").b("has_chorus_fruit_popped", a((cpk)cja.un)).a($$0);
      ls.a(lq.a, csm.kx).a('#', csm.jQ).b("#").b("#").b("has_purpur_block", a(csm.kw)).a($$0);
      a(lq.a, csm.jQ, clx.a(csm.kw, csm.kx)).a("has_purpur_block", a(csm.kw)).a($$0);
      b(csm.ky, clx.a(csm.kw, csm.kx)).a("has_purpur_block", a(csm.kw)).a($$0);
      a($$0, lq.a, csm.hd, cja.nN);
      ls.a(lq.a, csm.pK, 4).a('#', csm.hd).b("##").b("##").b("has_quartz_block", a(csm.hd)).a($$0);
      a(lq.a, csm.jN, clx.a(csm.he, csm.hd, csm.hf))
         .a("has_chiseled_quartz_block", a(csm.he))
         .a("has_quartz_block", a(csm.hd))
         .a("has_quartz_pillar", a(csm.hf))
         .a($$0);
      b(csm.hg, clx.a(csm.he, csm.hd, csm.hf))
         .a("has_chiseled_quartz_block", a(csm.he))
         .a("has_quartz_block", a(csm.hd))
         .a("has_quartz_pillar", a(csm.hf))
         .a($$0);
      lt.a(lq.g, cja.tI).b(cja.tn).b(cja.tH).b(cja.oC).b(cja.tl).b(csm.cf).b("rabbit_stew").b("has_cooked_rabbit", a((cpk)cja.tH)).a($$0, a(cja.tI, cja.de));
      lt.a(lq.g, cja.tI).b(cja.tn).b(cja.tH).b(cja.oC).b(cja.tl).b(csm.cg).b("rabbit_stew").b("has_cooked_rabbit", a((cpk)cja.tH)).a($$0, a(cja.tI, cja.df));
      ls.a(lq.d, csm.cP, 16).a('#', cja.oB).a('X', cja.nQ).b("X X").b("X#X").b("X X").b("has_minecart", a((cpk)cja.na)).a($$0);
      a($$0, lq.c, cja.ll, lq.c, cja.ln);
      ls.a(lq.c, csm.fB).a('R', cja.ll).a('G', csm.ed).b(" R ").b("RGR").b(" R ").b("has_glowstone", a(csm.ed)).a($$0);
      ls.a(lq.c, csm.dK).a('#', cja.oB).a('X', cja.ll).b("X").b("#").b("has_redstone", a((cpk)cja.ll)).a($$0);
      a($$0, cja.qI, cja.uq, "red_dye");
      a($$0, cja.qI, csm.bT, "red_dye");
      a($$0, cja.qI, csm.iF, "red_dye", 2);
      lt.a(lq.i, cja.qI).b(csm.bX).b("red_dye").b("has_red_flower", a(csm.bX)).a($$0, "red_dye_from_tulip");
      ls.a(lq.a, csm.kL).a('W', cja.ru).a('N', cja.tD).b("NW").b("WN").b("has_nether_wart", a((cpk)cja.ru)).a($$0);
      ls.a(lq.a, csm.jp).a('#', csm.K).b("##").b("##").b("has_sand", a(csm.K)).a($$0);
      a(lq.a, csm.jO, clx.a(csm.jp, csm.jq)).a("has_red_sandstone", a(csm.jp)).a("has_chiseled_red_sandstone", a(csm.jq)).a($$0);
      b(csm.js, clx.a(csm.jp, csm.jq, csm.jr))
         .a("has_red_sandstone", a(csm.jp))
         .a("has_chiseled_red_sandstone", a(csm.jq))
         .a("has_cut_red_sandstone", a(csm.jr))
         .a($$0);
      ls.a(lq.c, csm.ei).a('#', csm.dK).a('X', cja.ll).a('I', csm.b).b("#X#").b("III").b("has_redstone_torch", a(csm.dK)).a($$0);
      a($$0, lq.a, csm.aV, csm.I);
      a(lq.a, csm.jF, clx.a(csm.aV, csm.aW)).a("has_sandstone", a(csm.aV)).a("has_chiseled_sandstone", a(csm.aW)).a($$0);
      b(csm.fD, clx.a(csm.aV, csm.aW, csm.aX)).a("has_sandstone", a(csm.aV)).a("has_chiseled_sandstone", a(csm.aW)).a("has_cut_sandstone", a(csm.aX)).a($$0);
      ls.a(lq.a, csm.ii).a('S', cja.tE).a('C', cja.tF).b("SCS").b("CCC").b("SCS").b("has_prismarine_crystals", a((cpk)cja.tF)).a($$0);
      ls.a(lq.e, cja.rg).a('#', cja.nQ).b(" #").b("# ").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.f, cja.uy).a('W', apt.b).a('o', cja.nQ).b("WoW").b("WWW").b(" W ").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      a($$0, lq.i, cja.qc, lq.c, cja.ls);
      f($$0, lq.a, csm.jr, csm.jp);
      f($$0, lq.a, csm.aX, csm.aV);
      a($$0, lq.a, csm.dP, cja.pO);
      ls.a(lq.b, csm.dN, 6).a('#', csm.dP).b("###").b("has_snowball", a((cpk)cja.pO)).a($$0);
      ls.a(lq.b, csm.oh).a('L', apt.r).a('S', cja.oB).a('#', apt.ah).b(" S ").b("S#S").b("LLL").b("has_soul_sand", a(apt.ah)).a($$0);
      ls.a(lq.h, cja.rE).a('#', cja.rt).a('X', cja.rh).b("###").b("#X#").b("###").b("has_melon", a((cpk)cja.rh)).a($$0);
      ls.a(lq.f, cja.uv, 2).a('#', cja.qk).a('X', cja.nH).b(" # ").b("#X#").b(" # ").b("has_glowstone_dust", a((cpk)cja.qk)).a($$0);
      ls.a(lq.e, cja.qj).a('#', cja.nO).a('X', cja.nS).b(" # ").b(" X ").b(" X ").b("has_amethyst_shard", a((cpk)cja.nO)).a($$0);
      ls.a(lq.i, cja.oB, 4).a('#', apt.b).b("#").b("#").c("sticks").b("has_planks", a(apt.b)).a($$0);
      ls.a(lq.i, cja.oB, 1).a('#', csm.mZ).b("#").b("#").c("sticks").b("has_bamboo", a(csm.mZ)).a($$0, "stick_from_bamboo_item");
      ls.a(lq.c, csm.br).a('P', csm.by).a('S', cja.qc).b("S").b("P").b("has_slime_ball", a((cpk)cja.qc)).a($$0);
      ls.a(lq.a, csm.eI, 4).a('#', csm.b).b("##").b("##").b("has_stone", a(csm.b)).a($$0);
      ls.a(lq.e, cja.of).a('#', cja.oB).a('X', apt.ax).b("XX").b("X#").b(" #").b("has_cobblestone", a(apt.ax)).a($$0);
      a(lq.a, csm.jK, clx.a(csm.eI)).a("has_stone_bricks", a(apt.c)).a($$0);
      b(csm.fj, clx.a(csm.eI)).a("has_stone_bricks", a(apt.c)).a($$0);
      ls.a(lq.e, cja.og).a('#', cja.oB).a('X', apt.ax).b("XX").b(" #").b(" #").b("has_cobblestone", a(apt.ax)).a($$0);
      ls.a(lq.e, cja.oe).a('#', cja.oB).a('X', apt.ax).b("XXX").b(" # ").b(" # ").b("has_cobblestone", a(apt.ax)).a($$0);
      ls.a(lq.e, cja.od).a('#', cja.oB).a('X', apt.ax).b("X").b("#").b("#").b("has_cobblestone", a(apt.ax)).a($$0);
      c($$0, lq.a, csm.jE, csm.jR);
      ls.a(lq.f, cja.oc).a('#', cja.oB).a('X', apt.ax).b("X").b("X").b("#").b("has_cobblestone", a(apt.ax)).a($$0);
      ls.a(lq.a, csm.bA).a('#', cja.oE).b("##").b("##").b("has_string", a((cpk)cja.oE)).a($$0, a(csm.bA, cja.oE));
      a($$0, cja.qM, csm.dS, "sugar");
      lt.a(lq.i, cja.qM, 3).b(cja.vD).b("sugar").b("has_honey_bottle", a((cpk)cja.vD)).a($$0, a(cja.qM, cja.vD));
      ls.a(lq.c, csm.pd).a('H', cja.hh).a('R', cja.ll).b(" R ").b("RHR").b(" R ").b("has_redstone", a((cpk)cja.ll)).b("has_hay_block", a(csm.ij)).a($$0);
      ls.a(lq.c, csm.ck).a('#', clx.a(csm.I, csm.K)).a('X', cja.oG).b("X#X").b("#X#").b("X#X").b("has_gunpowder", a((cpk)cja.oG)).a($$0);
      lt.a(lq.d, cja.nd).b(csm.ck).b(cja.na).b("has_minecart", a((cpk)cja.na)).a($$0);
      ls.a(lq.b, csm.cp, 4).a('#', cja.oB).a('X', clx.a(cja.nI, cja.nJ)).b("X").b("#").b("has_stone_pickaxe", a((cpk)cja.oe)).a($$0);
      ls.a(lq.b, csm.eb, 4).a('X', clx.a(cja.nI, cja.nJ)).a('#', cja.oB).a('S', apt.ah).b("X").b("#").b("S").b("has_soul_sand", a(apt.ah)).a($$0);
      ls.a(lq.b, csm.oe)
         .a('#', cja.ej)
         .a('X', cja.uB)
         .b("XXX")
         .b("X#X")
         .b("XXX")
         .b("has_iron_nugget", a((cpk)cja.uB))
         .b("has_iron_ingot", a((cpk)cja.nQ))
         .a($$0);
      ls.a(lq.b, csm.of).a('#', cja.eX).a('X', cja.uB).b("XXX").b("X#X").b("XXX").b("has_soul_torch", a((cpk)cja.eX)).a($$0);
      lt.a(lq.c, csm.gV).b(csm.cv).b(csm.fH).b("has_tripwire_hook", a(csm.fH)).a($$0);
      ls.a(lq.c, csm.fH, 2).a('#', apt.b).a('S', cja.oB).a('I', cja.nQ).b("I").b("S").b("#").b("has_string", a((cpk)cja.oE)).a($$0);
      ls.a(lq.f, cja.nC).a('X', cja.nD).b("XXX").b("X X").b("has_scute", a((cpk)cja.nD)).a($$0);
      lt.a(lq.i, cja.oI, 9).b(csm.ij).b("has_hay_block", a(csm.ij)).a($$0);
      lt.a(lq.i, cja.qu).b(cja.qK).b("white_dye").b("has_bone_meal", a((cpk)cja.qK)).a($$0);
      a($$0, cja.qu, csm.ce, "white_dye");
      ls.a(lq.e, cja.oa).a('#', cja.oB).a('X', apt.b).b("XX").b("X#").b(" #").b("has_stick", a((cpk)cja.oB)).a($$0);
      ls.a(lq.e, cja.ob).a('#', cja.oB).a('X', apt.b).b("XX").b(" #").b(" #").b("has_stick", a((cpk)cja.oB)).a($$0);
      ls.a(lq.e, cja.nZ).a('#', cja.oB).a('X', apt.b).b("XXX").b(" # ").b(" # ").b("has_stick", a((cpk)cja.oB)).a($$0);
      ls.a(lq.e, cja.nY).a('#', cja.oB).a('X', apt.b).b("X").b("#").b("#").b("has_stick", a((cpk)cja.oB)).a($$0);
      ls.a(lq.f, cja.nX).a('#', cja.oB).a('X', apt.b).b("X").b("X").b("#").b("has_stick", a((cpk)cja.oB)).a($$0);
      lt.a(lq.i, cja.tg).b(cja.qb).b(cja.qr).b(cja.oF).b("has_book", a((cpk)cja.qb)).a($$0);
      a($$0, cja.qy, csm.bR, "yellow_dye");
      a($$0, cja.qy, csm.iD, "yellow_dye", 2);
      a($$0, lq.g, cja.ri, lq.a, cja.pZ);
      ls.a(lq.i, csm.mX)
         .a('#', cja.uX)
         .a('X', cja.uY)
         .b("###")
         .b("#X#")
         .b("###")
         .b("has_nautilus_core", a((cpk)cja.uY))
         .b("has_nautilus_shell", a((cpk)cja.uX))
         .a($$0);
      d($$0, lq.b, csm.nH, csm.jp);
      d($$0, lq.b, csm.nK, csm.eI);
      d($$0, lq.b, csm.nP, csm.aV);
      lt.a(lq.i, cja.vd).b(cja.qa).b(cja.tv).b("has_creeper_head", a((cpk)cja.tv)).a($$0);
      lt.a(lq.i, cja.ve).b(cja.qa).b(cja.ts).b("has_wither_skeleton_skull", a((cpk)cja.ts)).a($$0);
      lt.a(lq.i, cja.vc).b(cja.qa).b(csm.cb).b("has_oxeye_daisy", a(csm.cb)).a($$0);
      lt.a(lq.i, cja.vf).b(cja.qa).b(cja.pn).b("has_enchanted_golden_apple", a((cpk)cja.pn)).a($$0);
      ls.a(lq.b, csm.nS, 6).a('~', cja.oE).a('I', csm.mZ).b("I~I").b("I I").b("I I").b("has_bamboo", a(csm.mZ)).a($$0);
      ls.a(lq.b, csm.nZ).a('I', cja.oB).a('-', csm.jD).a('#', apt.b).b("I-I").b("# #").b("has_stone_slab", a(csm.jD)).a($$0);
      ls.a(lq.b, csm.nW).a('#', csm.jR).a('X', csm.cD).a('I', cja.nQ).b("III").b("IXI").b("###").b("has_smooth_stone", a(csm.jR)).a($$0);
      ls.a(lq.b, csm.nV).a('#', apt.r).a('X', csm.cD).b(" # ").b("#X#").b(" # ").b("has_furnace", a(csm.cD)).a($$0);
      ls.a(lq.b, csm.nX).a('#', apt.b).a('@', cja.qa).b("@@").b("##").b("##").b("has_paper", a((cpk)cja.qa)).a($$0);
      ls.a(lq.b, csm.ob).a('#', apt.b).a('@', cja.nQ).b("@@").b("##").b("##").b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.b, csm.nY).a('#', apt.b).a('@', cja.pi).b("@@").b("##").b("##").b("has_flint", a((cpk)cja.pi)).a($$0);
      ls.a(lq.b, csm.oc).a('I', cja.nQ).a('#', csm.b).b(" I ").b("###").b("has_stone", a(csm.b)).a($$0);
      ls.a(lq.b, csm.pq).a('S', cja.fj).a('#', cja.nV).b("SSS").b("S#S").b("SSS").b("has_netherite_ingot", a((cpk)cja.nV)).a($$0);
      b($$0, lq.i, cja.nV, lq.a, cja.aA, "netherite_ingot_from_netherite_block", "netherite_ingot");
      lt.a(lq.i, cja.nV).a(cja.nW, 4).a(cja.nU, 4).b("netherite_ingot").b("has_netherite_scrap", a((cpk)cja.nW)).a($$0);
      ls.a(lq.b, csm.pl).a('O', csm.pk).a('G', csm.ed).b("OOO").b("GGG").b("OOO").b("has_obsidian", a(csm.pk)).a($$0);
      ls.a(lq.b, csm.eY).a('I', cja.nQ).a('N', cja.uB).b("N").b("I").b("N").b("has_iron_nugget", a((cpk)cja.uB)).b("has_iron_ingot", a((cpk)cja.nQ)).a($$0);
      ls.a(lq.a, csm.qB, 2).a('G', csm.aQ).a('S', cja.nO).b(" S ").b("SGS").b(" S ").b("has_amethyst_shard", a((cpk)cja.nO)).a($$0);
      a($$0, lq.a, csm.qt, cja.nO);
      ls.a(lq.e, cja.qf).a('C', cja.qe).a('S', cja.wu).b("SSS").b("SCS").b("SSS").b("has_echo_shard", a((cpk)cja.wu)).a($$0);
      ls.a(lq.c, cja.lE).a('#', cja.nO).a('X', cja.lD).b(" # ").b("#X#").b("has_amethyst_shard", a((cpk)cja.nO)).a($$0);
      b($$0, lq.i, cja.uS, cja.uU);
      ly.a(cmc.c).a($$0, "armor_dye");
      ly.a(cmc.k).a($$0, "banner_duplicate");
      ly.a(cmc.d).a($$0, "book_cloning");
      ly.a(cmc.g).a($$0, "firework_rocket");
      ly.a(cmc.h).a($$0, "firework_star");
      ly.a(cmc.i).a($$0, "firework_star_fade");
      ly.a(cmc.e).a($$0, "map_cloning");
      ly.a(cmc.f).a($$0, "map_extending");
      ly.a(cmc.o).a($$0, "repair_item");
      ly.a(cmc.l).a($$0, "shield_decoration");
      ly.a(cmc.m).a($$0, "shulker_box_coloring");
      ly.a(cmc.j).a($$0, "tipped_arrow");
      ly.a(cmc.n).a($$0, "suspicious_stew");
      lu.c(clx.a(cja.tm), lq.g, cja.tn, 0.35F, 200).b("has_potato", a((cpk)cja.tm)).a($$0);
      lu.c(clx.a(cja.pY), lq.i, cja.pX, 0.3F, 200).b("has_clay_ball", a((cpk)cja.pY)).a($$0);
      lu.c(clx.a(apt.q), lq.i, cja.nJ, 0.15F, 200).b("has_log", a(apt.q)).a($$0);
      lu.c(clx.a(cja.um), lq.i, cja.un, 0.1F, 200).b("has_chorus_fruit", a((cpk)cja.um)).a($$0);
      lu.c(clx.a(cja.rl), lq.g, cja.rm, 0.35F, 200).b("has_beef", a((cpk)cja.rl)).a($$0);
      lu.c(clx.a(cja.rn), lq.g, cja.ro, 0.35F, 200).b("has_chicken", a((cpk)cja.rn)).a($$0);
      lu.c(clx.a(cja.ql), lq.g, cja.qp, 0.35F, 200).b("has_cod", a((cpk)cja.ql)).a($$0);
      lu.c(clx.a(csm.mc), lq.g, cja.ri, 0.1F, 200).b("has_kelp", a(csm.mc)).a($$0, e(cja.ri));
      lu.c(clx.a(cja.qm), lq.g, cja.qq, 0.35F, 200).b("has_salmon", a((cpk)cja.qm)).a($$0);
      lu.c(clx.a(cja.tT), lq.g, cja.tU, 0.35F, 200).b("has_mutton", a((cpk)cja.tT)).a($$0);
      lu.c(clx.a(cja.pj), lq.g, cja.pk, 0.35F, 200).b("has_porkchop", a((cpk)cja.pj)).a($$0);
      lu.c(clx.a(cja.tG), lq.g, cja.tH, 0.35F, 200).b("has_rabbit", a((cpk)cja.tG)).a($$0);
      a($$0, d, lq.i, cja.nI, 0.1F, 200, "coal");
      a($$0, e, lq.i, cja.nQ, 0.7F, 200, "iron_ingot");
      a($$0, f, lq.i, cja.nS, 0.7F, 200, "copper_ingot");
      a($$0, g, lq.i, cja.nU, 1.0F, 200, "gold_ingot");
      a($$0, h, lq.i, cja.nK, 1.0F, 200, "diamond");
      a($$0, i, lq.i, cja.nM, 0.2F, 200, "lapis_lazuli");
      a($$0, j, lq.c, cja.ll, 0.7F, 200, "redstone");
      a($$0, k, lq.i, cja.nL, 1.0F, 200, "emerald");
      a($$0, lq.i, cja.nP, lq.a, cja.ar);
      a($$0, lq.i, cja.nR, lq.a, cja.as);
      a($$0, lq.i, cja.nT, lq.a, cja.at);
      lu.c(clx.a(apt.G), lq.a, csm.aQ.k(), 0.1F, 200).b("has_smelts_to_glass", a(apt.G)).a($$0);
      lu.c(clx.a(csm.mV), lq.i, cja.qz, 0.1F, 200).b("has_sea_pickle", a(csm.mV)).a($$0, e(cja.qz));
      lu.c(clx.a(csm.dQ.k()), lq.i, cja.qH, 1.0F, 200).b("has_cactus", a(csm.dQ)).a($$0);
      lu.c(clx.a(cja.oj, cja.oi, cja.ok, cja.ol, cja.oh, cja.pa, cja.pb, cja.pc, cja.pd, cja.tN), lq.i, cja.rt, 0.1F, 200)
         .b("has_golden_pickaxe", a((cpk)cja.oj))
         .b("has_golden_shovel", a((cpk)cja.oi))
         .b("has_golden_axe", a((cpk)cja.ok))
         .b("has_golden_hoe", a((cpk)cja.ol))
         .b("has_golden_sword", a((cpk)cja.oh))
         .b("has_golden_helmet", a((cpk)cja.pa))
         .b("has_golden_chestplate", a((cpk)cja.pb))
         .b("has_golden_leggings", a((cpk)cja.pc))
         .b("has_golden_boots", a((cpk)cja.pd))
         .b("has_golden_horse_armor", a((cpk)cja.tN))
         .a($$0, e(cja.rt));
      lu.c(clx.a(cja.oo, cja.on, cja.op, cja.oq, cja.om, cja.oS, cja.oT, cja.oU, cja.oV, cja.tM, cja.oO, cja.oP, cja.oQ, cja.oR), lq.i, cja.uB, 0.1F, 200)
         .b("has_iron_pickaxe", a((cpk)cja.oo))
         .b("has_iron_shovel", a((cpk)cja.on))
         .b("has_iron_axe", a((cpk)cja.op))
         .b("has_iron_hoe", a((cpk)cja.oq))
         .b("has_iron_sword", a((cpk)cja.om))
         .b("has_iron_helmet", a((cpk)cja.oS))
         .b("has_iron_chestplate", a((cpk)cja.oT))
         .b("has_iron_leggings", a((cpk)cja.oU))
         .b("has_iron_boots", a((cpk)cja.oV))
         .b("has_iron_horse_armor", a((cpk)cja.tM))
         .b("has_chainmail_helmet", a((cpk)cja.oO))
         .b("has_chainmail_chestplate", a((cpk)cja.oP))
         .b("has_chainmail_leggings", a((cpk)cja.oQ))
         .b("has_chainmail_boots", a((cpk)cja.oR))
         .a($$0, e(cja.uB));
      lu.c(clx.a(csm.dR), lq.a, csm.iA.k(), 0.35F, 200).b("has_clay_block", a(csm.dR)).a($$0);
      lu.c(clx.a(csm.dW), lq.i, cja.tD, 0.1F, 200).b("has_netherrack", a(csm.dW)).a($$0);
      lu.c(clx.a(csm.hb), lq.i, cja.nN, 0.2F, 200).b("has_nether_quartz_ore", a(csm.hb)).a($$0);
      lu.c(clx.a(csm.aP), lq.a, csm.aO.k(), 0.15F, 200).b("has_wet_sponge", a(csm.aP)).a($$0);
      lu.c(clx.a(csm.m), lq.a, csm.b.k(), 0.1F, 200).b("has_cobblestone", a(csm.m)).a($$0);
      lu.c(clx.a(csm.b), lq.a, csm.jR.k(), 0.1F, 200).b("has_stone", a(csm.b)).a($$0);
      lu.c(clx.a(csm.aV), lq.a, csm.jS.k(), 0.1F, 200).b("has_sandstone", a(csm.aV)).a($$0);
      lu.c(clx.a(csm.jp), lq.a, csm.jU.k(), 0.1F, 200).b("has_red_sandstone", a(csm.jp)).a($$0);
      lu.c(clx.a(csm.hd), lq.a, csm.jT.k(), 0.1F, 200).b("has_quartz_block", a(csm.hd)).a($$0);
      lu.c(clx.a(csm.eI), lq.a, csm.eK.k(), 0.1F, 200).b("has_stone_bricks", a(csm.eI)).a($$0);
      lu.c(clx.a(csm.hy), lq.b, csm.lv.k(), 0.1F, 200).b("has_black_terracotta", a(csm.hy)).a($$0);
      lu.c(clx.a(csm.hu), lq.b, csm.lr.k(), 0.1F, 200).b("has_blue_terracotta", a(csm.hu)).a($$0);
      lu.c(clx.a(csm.hv), lq.b, csm.ls.k(), 0.1F, 200).b("has_brown_terracotta", a(csm.hv)).a($$0);
      lu.c(clx.a(csm.hs), lq.b, csm.lp.k(), 0.1F, 200).b("has_cyan_terracotta", a(csm.hs)).a($$0);
      lu.c(clx.a(csm.hq), lq.b, csm.ln.k(), 0.1F, 200).b("has_gray_terracotta", a(csm.hq)).a($$0);
      lu.c(clx.a(csm.hw), lq.b, csm.lt.k(), 0.1F, 200).b("has_green_terracotta", a(csm.hw)).a($$0);
      lu.c(clx.a(csm.hm), lq.b, csm.lj.k(), 0.1F, 200).b("has_light_blue_terracotta", a(csm.hm)).a($$0);
      lu.c(clx.a(csm.hr), lq.b, csm.lo.k(), 0.1F, 200).b("has_light_gray_terracotta", a(csm.hr)).a($$0);
      lu.c(clx.a(csm.ho), lq.b, csm.ll.k(), 0.1F, 200).b("has_lime_terracotta", a(csm.ho)).a($$0);
      lu.c(clx.a(csm.hl), lq.b, csm.li.k(), 0.1F, 200).b("has_magenta_terracotta", a(csm.hl)).a($$0);
      lu.c(clx.a(csm.hk), lq.b, csm.lh.k(), 0.1F, 200).b("has_orange_terracotta", a(csm.hk)).a($$0);
      lu.c(clx.a(csm.hp), lq.b, csm.lm.k(), 0.1F, 200).b("has_pink_terracotta", a(csm.hp)).a($$0);
      lu.c(clx.a(csm.ht), lq.b, csm.lq.k(), 0.1F, 200).b("has_purple_terracotta", a(csm.ht)).a($$0);
      lu.c(clx.a(csm.hx), lq.b, csm.lu.k(), 0.1F, 200).b("has_red_terracotta", a(csm.hx)).a($$0);
      lu.c(clx.a(csm.hj), lq.b, csm.lg.k(), 0.1F, 200).b("has_white_terracotta", a(csm.hj)).a($$0);
      lu.c(clx.a(csm.hn), lq.b, csm.lk.k(), 0.1F, 200).b("has_yellow_terracotta", a(csm.hn)).a($$0);
      lu.c(clx.a(csm.pj), lq.i, cja.nW, 2.0F, 200).b("has_ancient_debris", a(csm.pj)).a($$0);
      lu.c(clx.a(csm.dZ), lq.a, csm.sd, 0.1F, 200).b("has_basalt", a(csm.dZ)).a($$0);
      lu.c(clx.a(csm.rJ), lq.a, csm.rI, 0.1F, 200).b("has_cobbled_deepslate", a(csm.rJ)).a($$0);
      b($$0, d, lq.i, cja.nI, 0.1F, 100, "coal");
      b($$0, e, lq.i, cja.nQ, 0.7F, 100, "iron_ingot");
      b($$0, f, lq.i, cja.nS, 0.7F, 100, "copper_ingot");
      b($$0, g, lq.i, cja.nU, 1.0F, 100, "gold_ingot");
      b($$0, h, lq.i, cja.nK, 1.0F, 100, "diamond");
      b($$0, i, lq.i, cja.nM, 0.2F, 100, "lapis_lazuli");
      b($$0, j, lq.c, cja.ll, 0.7F, 100, "redstone");
      b($$0, k, lq.i, cja.nL, 1.0F, 100, "emerald");
      lu.b(clx.a(csm.hb), lq.i, cja.nN, 0.2F, 100).b("has_nether_quartz_ore", a(csm.hb)).a($$0, f(cja.nN));
      lu.b(clx.a(cja.oj, cja.oi, cja.ok, cja.ol, cja.oh, cja.pa, cja.pb, cja.pc, cja.pd, cja.tN), lq.i, cja.rt, 0.1F, 100)
         .b("has_golden_pickaxe", a((cpk)cja.oj))
         .b("has_golden_shovel", a((cpk)cja.oi))
         .b("has_golden_axe", a((cpk)cja.ok))
         .b("has_golden_hoe", a((cpk)cja.ol))
         .b("has_golden_sword", a((cpk)cja.oh))
         .b("has_golden_helmet", a((cpk)cja.pa))
         .b("has_golden_chestplate", a((cpk)cja.pb))
         .b("has_golden_leggings", a((cpk)cja.pc))
         .b("has_golden_boots", a((cpk)cja.pd))
         .b("has_golden_horse_armor", a((cpk)cja.tN))
         .a($$0, f(cja.rt));
      lu.b(clx.a(cja.oo, cja.on, cja.op, cja.oq, cja.om, cja.oS, cja.oT, cja.oU, cja.oV, cja.tM, cja.oO, cja.oP, cja.oQ, cja.oR), lq.i, cja.uB, 0.1F, 100)
         .b("has_iron_pickaxe", a((cpk)cja.oo))
         .b("has_iron_shovel", a((cpk)cja.on))
         .b("has_iron_axe", a((cpk)cja.op))
         .b("has_iron_hoe", a((cpk)cja.oq))
         .b("has_iron_sword", a((cpk)cja.om))
         .b("has_iron_helmet", a((cpk)cja.oS))
         .b("has_iron_chestplate", a((cpk)cja.oT))
         .b("has_iron_leggings", a((cpk)cja.oU))
         .b("has_iron_boots", a((cpk)cja.oV))
         .b("has_iron_horse_armor", a((cpk)cja.tM))
         .b("has_chainmail_helmet", a((cpk)cja.oO))
         .b("has_chainmail_chestplate", a((cpk)cja.oP))
         .b("has_chainmail_leggings", a((cpk)cja.oQ))
         .b("has_chainmail_boots", a((cpk)cja.oR))
         .a($$0, f(cja.uB));
      lu.b(clx.a(csm.pj), lq.i, cja.nW, 2.0F, 100).b("has_ancient_debris", a(csm.pj)).a($$0, f(cja.nW));
      a($$0, "smoking", cmc.r, 100);
      a($$0, "campfire_cooking", cmc.s, 600);
      a($$0, lq.a, csm.jD, csm.b, 2);
      i($$0, lq.a, csm.nk, csm.b);
      i($$0, lq.a, csm.eI, csm.b);
      a($$0, lq.a, csm.jK, csm.b, 2);
      i($$0, lq.a, csm.fj, csm.b);
      lv.a(clx.a(csm.b), lq.a, csm.eL).b("has_stone", a(csm.b)).a($$0, "chiseled_stone_bricks_stone_from_stonecutting");
      lv.a(clx.a(csm.b), lq.b, csm.nK).b("has_stone", a(csm.b)).a($$0, "stone_brick_walls_from_stone_stonecutting");
      i($$0, lq.a, csm.aX, csm.aV);
      a($$0, lq.a, csm.jF, csm.aV, 2);
      a($$0, lq.a, csm.jG, csm.aV, 2);
      a($$0, lq.a, csm.jG, csm.aX, 2);
      i($$0, lq.a, csm.fD, csm.aV);
      i($$0, lq.b, csm.nP, csm.aV);
      i($$0, lq.a, csm.aW, csm.aV);
      i($$0, lq.a, csm.jr, csm.jp);
      a($$0, lq.a, csm.jO, csm.jp, 2);
      a($$0, lq.a, csm.jP, csm.jp, 2);
      a($$0, lq.a, csm.jP, csm.jr, 2);
      i($$0, lq.a, csm.js, csm.jp);
      i($$0, lq.b, csm.nH, csm.jp);
      i($$0, lq.a, csm.jq, csm.jp);
      lv.a(clx.a(csm.hd), lq.a, csm.jN, 2).b("has_quartz_block", a(csm.hd)).a($$0, "quartz_slab_from_stonecutting");
      i($$0, lq.a, csm.hg, csm.hd);
      i($$0, lq.a, csm.hf, csm.hd);
      i($$0, lq.a, csm.he, csm.hd);
      i($$0, lq.a, csm.pK, csm.hd);
      i($$0, lq.a, csm.cQ, csm.m);
      a($$0, lq.a, csm.jI, csm.m, 2);
      i($$0, lq.b, csm.fP, csm.m);
      a($$0, lq.a, csm.jK, csm.eI, 2);
      i($$0, lq.a, csm.fj, csm.eI);
      lv.a(clx.a(csm.eI), lq.b, csm.nK).b("has_stone_bricks", a(csm.eI)).a($$0, "stone_brick_wall_from_stone_bricks_stonecutting");
      i($$0, lq.a, csm.eL, csm.eI);
      a($$0, lq.a, csm.jJ, csm.cj, 2);
      i($$0, lq.a, csm.fi, csm.cj);
      i($$0, lq.b, csm.nF, csm.cj);
      a($$0, lq.a, csm.jL, csm.eN, 2);
      i($$0, lq.a, csm.fk, csm.eN);
      i($$0, lq.b, csm.nL, csm.eN);
      a($$0, lq.a, csm.jM, csm.fn, 2);
      i($$0, lq.a, csm.fp, csm.fn);
      i($$0, lq.b, csm.nM, csm.fn);
      i($$0, lq.a, csm.pI, csm.fn);
      a($$0, lq.a, csm.nC, csm.kL, 2);
      i($$0, lq.a, csm.np, csm.kL);
      i($$0, lq.b, csm.nO, csm.kL);
      a($$0, lq.a, csm.jQ, csm.kw, 2);
      i($$0, lq.a, csm.ky, csm.kw);
      i($$0, lq.a, csm.kx, csm.kw);
      a($$0, lq.a, csm.if, csm.hZ, 2);
      i($$0, lq.a, csm.ic, csm.hZ);
      i($$0, lq.b, csm.nG, csm.hZ);
      lv.a(clx.a(csm.ia), lq.a, csm.ig, 2).b("has_prismarine_brick", a(csm.ia)).a($$0, "prismarine_brick_slab_from_prismarine_stonecutting");
      lv.a(clx.a(csm.ia), lq.a, csm.id).b("has_prismarine_brick", a(csm.ia)).a($$0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      a($$0, lq.a, csm.ih, csm.ib, 2);
      i($$0, lq.a, csm.ie, csm.ib);
      a($$0, lq.a, csm.nB, csm.g, 2);
      i($$0, lq.a, csm.no, csm.g);
      i($$0, lq.b, csm.nN, csm.g);
      i($$0, lq.a, csm.h, csm.g);
      a($$0, lq.a, csm.nD, csm.g, 2);
      i($$0, lq.a, csm.nq, csm.g);
      a($$0, lq.a, csm.nD, csm.h, 2);
      i($$0, lq.a, csm.nq, csm.h);
      i($$0, lq.a, csm.ea, csm.dZ);
      a($$0, lq.a, csm.nA, csm.c, 2);
      i($$0, lq.a, csm.nn, csm.c);
      i($$0, lq.b, csm.nJ, csm.c);
      i($$0, lq.a, csm.d, csm.c);
      a($$0, lq.a, csm.ns, csm.c, 2);
      i($$0, lq.a, csm.ne, csm.c);
      a($$0, lq.a, csm.ns, csm.d, 2);
      i($$0, lq.a, csm.ne, csm.d);
      a($$0, lq.a, csm.nE, csm.e, 2);
      i($$0, lq.a, csm.nr, csm.e);
      i($$0, lq.b, csm.nR, csm.e);
      i($$0, lq.a, csm.f, csm.e);
      a($$0, lq.a, csm.nv, csm.e, 2);
      i($$0, lq.a, csm.nh, csm.e);
      a($$0, lq.a, csm.nv, csm.f, 2);
      i($$0, lq.a, csm.nh, csm.f);
      lv.a(clx.a(csm.eJ), lq.a, csm.nu, 2).b("has_mossy_stone_bricks", a(csm.eJ)).a($$0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      lv.a(clx.a(csm.eJ), lq.a, csm.ng).b("has_mossy_stone_bricks", a(csm.eJ)).a($$0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      lv.a(clx.a(csm.eJ), lq.b, csm.nI).b("has_mossy_stone_bricks", a(csm.eJ)).a($$0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      a($$0, lq.a, csm.nw, csm.cn, 2);
      i($$0, lq.a, csm.ni, csm.cn);
      i($$0, lq.b, csm.fQ, csm.cn);
      a($$0, lq.a, csm.ny, csm.jS, 2);
      i($$0, lq.a, csm.nl, csm.jS);
      a($$0, lq.a, csm.nt, csm.jU, 2);
      i($$0, lq.a, csm.nf, csm.jU);
      a($$0, lq.a, csm.nz, csm.jT, 2);
      i($$0, lq.a, csm.nm, csm.jT);
      lv.a(clx.a(csm.kz), lq.a, csm.nx, 2).b("has_end_stone_brick", a(csm.kz)).a($$0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      lv.a(clx.a(csm.kz), lq.a, csm.nj).b("has_end_stone_brick", a(csm.kz)).a($$0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      lv.a(clx.a(csm.kz), lq.b, csm.nQ).b("has_end_stone_brick", a(csm.kz)).a($$0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      i($$0, lq.a, csm.kz, csm.fz);
      a($$0, lq.a, csm.nx, csm.fz, 2);
      i($$0, lq.a, csm.nj, csm.fz);
      i($$0, lq.b, csm.nQ, csm.fz);
      a($$0, lq.a, csm.jE, csm.jR, 2);
      a($$0, lq.a, csm.pu, csm.pr, 2);
      i($$0, lq.a, csm.ps, csm.pr);
      i($$0, lq.b, csm.pt, csm.pr);
      i($$0, lq.a, csm.pv, csm.pr);
      i($$0, lq.b, csm.pH, csm.pr);
      a($$0, lq.a, csm.pE, csm.pr, 2);
      i($$0, lq.a, csm.pD, csm.pr);
      i($$0, lq.a, csm.py, csm.pr);
      i($$0, lq.a, csm.pw, csm.pr);
      a($$0, lq.a, csm.pz, csm.pr, 2);
      i($$0, lq.a, csm.pA, csm.pr);
      i($$0, lq.b, csm.pB, csm.pr);
      a($$0, lq.a, csm.pE, csm.pv, 2);
      i($$0, lq.a, csm.pD, csm.pv);
      i($$0, lq.a, csm.pw, csm.pv);
      i($$0, lq.b, csm.pH, csm.pv);
      a($$0, lq.a, csm.pz, csm.pv, 2);
      i($$0, lq.a, csm.pA, csm.pv);
      i($$0, lq.b, csm.pB, csm.pv);
      i($$0, lq.a, csm.py, csm.pv);
      a($$0, lq.a, csm.pz, csm.pw, 2);
      i($$0, lq.a, csm.pA, csm.pw);
      i($$0, lq.b, csm.pB, csm.pw);
      a($$0, lq.a, csm.ra, csm.qS, 2);
      i($$0, lq.a, csm.qW, csm.qS);
      a($$0, lq.a, csm.qZ, csm.qR, 2);
      i($$0, lq.a, csm.qV, csm.qR);
      a($$0, lq.a, csm.qY, csm.qQ, 2);
      i($$0, lq.a, csm.qU, csm.qQ);
      a($$0, lq.a, csm.qX, csm.qP, 2);
      i($$0, lq.a, csm.qT, csm.qP);
      a($$0, lq.a, csm.rq, csm.ri, 2);
      i($$0, lq.a, csm.rm, csm.ri);
      a($$0, lq.a, csm.rp, csm.rh, 2);
      i($$0, lq.a, csm.rl, csm.rh);
      a($$0, lq.a, csm.ro, csm.rg, 2);
      i($$0, lq.a, csm.rk, csm.rg);
      a($$0, lq.a, csm.rn, csm.rf, 2);
      i($$0, lq.a, csm.rj, csm.rf);
      a($$0, lq.a, csm.qS, csm.qM, 4);
      a($$0, lq.a, csm.qW, csm.qM, 4);
      a($$0, lq.a, csm.ra, csm.qM, 8);
      a($$0, lq.a, csm.qR, csm.qL, 4);
      a($$0, lq.a, csm.qV, csm.qL, 4);
      a($$0, lq.a, csm.qZ, csm.qL, 8);
      a($$0, lq.a, csm.qQ, csm.qK, 4);
      a($$0, lq.a, csm.qU, csm.qK, 4);
      a($$0, lq.a, csm.qY, csm.qK, 8);
      a($$0, lq.a, csm.qP, csm.qJ, 4);
      a($$0, lq.a, csm.qT, csm.qJ, 4);
      a($$0, lq.a, csm.qX, csm.qJ, 8);
      a($$0, lq.a, csm.ri, csm.rb, 4);
      a($$0, lq.a, csm.rm, csm.rb, 4);
      a($$0, lq.a, csm.rq, csm.rb, 8);
      a($$0, lq.a, csm.rh, csm.rd, 4);
      a($$0, lq.a, csm.rl, csm.rd, 4);
      a($$0, lq.a, csm.rp, csm.rd, 8);
      a($$0, lq.a, csm.rg, csm.rc, 4);
      a($$0, lq.a, csm.rk, csm.rc, 4);
      a($$0, lq.a, csm.ro, csm.rc, 8);
      a($$0, lq.a, csm.rf, csm.re, 4);
      a($$0, lq.a, csm.rj, csm.re, 4);
      a($$0, lq.a, csm.rn, csm.re, 8);
      a($$0, lq.a, csm.rL, csm.rJ, 2);
      i($$0, lq.a, csm.rK, csm.rJ);
      i($$0, lq.b, csm.rM, csm.rJ);
      i($$0, lq.a, csm.rZ, csm.rJ);
      i($$0, lq.a, csm.rN, csm.rJ);
      a($$0, lq.a, csm.rP, csm.rJ, 2);
      i($$0, lq.a, csm.rO, csm.rJ);
      i($$0, lq.b, csm.rQ, csm.rJ);
      i($$0, lq.a, csm.rV, csm.rJ);
      a($$0, lq.a, csm.rX, csm.rJ, 2);
      i($$0, lq.a, csm.rW, csm.rJ);
      i($$0, lq.b, csm.rY, csm.rJ);
      i($$0, lq.a, csm.rR, csm.rJ);
      a($$0, lq.a, csm.rT, csm.rJ, 2);
      i($$0, lq.a, csm.rS, csm.rJ);
      i($$0, lq.b, csm.rU, csm.rJ);
      a($$0, lq.a, csm.rP, csm.rN, 2);
      i($$0, lq.a, csm.rO, csm.rN);
      i($$0, lq.b, csm.rQ, csm.rN);
      i($$0, lq.a, csm.rV, csm.rN);
      a($$0, lq.a, csm.rX, csm.rN, 2);
      i($$0, lq.a, csm.rW, csm.rN);
      i($$0, lq.b, csm.rY, csm.rN);
      i($$0, lq.a, csm.rR, csm.rN);
      a($$0, lq.a, csm.rT, csm.rN, 2);
      i($$0, lq.a, csm.rS, csm.rN);
      i($$0, lq.b, csm.rU, csm.rN);
      a($$0, lq.a, csm.rX, csm.rV, 2);
      i($$0, lq.a, csm.rW, csm.rV);
      i($$0, lq.b, csm.rY, csm.rV);
      i($$0, lq.a, csm.rR, csm.rV);
      a($$0, lq.a, csm.rT, csm.rV, 2);
      i($$0, lq.a, csm.rS, csm.rV);
      i($$0, lq.b, csm.rU, csm.rV);
      a($$0, lq.a, csm.rT, csm.rR, 2);
      i($$0, lq.a, csm.rS, csm.rR);
      i($$0, lq.b, csm.rU, csm.rR);
      b().forEach(($$1x, $$2x) -> a($$0, $$1x, $$2x));
      a($$0, cja.oX, lq.f, cja.pf);
      a($$0, cja.oY, lq.f, cja.pg);
      a($$0, cja.oW, lq.f, cja.pe);
      a($$0, cja.oZ, lq.f, cja.ph);
      a($$0, cja.or, lq.f, cja.ow);
      a($$0, cja.ou, lq.e, cja.oz);
      a($$0, cja.ot, lq.e, cja.oy);
      a($$0, cja.ov, lq.e, cja.oA);
      a($$0, cja.os, lq.e, cja.ox);
      o($$0, cja.ww, cja.eR);
      o($$0, cja.wx, cja.w);
      o($$0, cja.wy, cja.cn);
      o($$0, cja.wz, cja.w);
      o($$0, cja.wA, cja.eh);
      o($$0, cja.wB, cja.j);
      o($$0, cja.wC, cja.fR);
      o($$0, cja.wD, cja.w);
      o($$0, cja.wE, cja.in);
      o($$0, cja.wF, cja.vH);
      o($$0, cja.wG, cja.eR);
      o($$0, cja.wH, cja.en);
      o($$0, cja.wK, cja.j);
      o($$0, cja.wI, cja.hy);
      o($$0, cja.wJ, cja.hy);
      o($$0, cja.wL, cja.hy);
      o($$0, cja.wM, cja.hy);
      b($$0, lq.a, csm.ae, cja.dv);
      b($$0, csm.v, apt.C, 2);
      h($$0, lq.b, csm.w, csm.jB);
      b($$0, cja.ny, csm.v);
      c($$0, cja.nz, cja.ny);
      e($$0, cja.pz, csm.al);
      e($$0, cja.pA, csm.af);
      e($$0, cja.pB, csm.ag);
      e($$0, cja.pC, csm.ah);
      e($$0, cja.pD, csm.ai);
      e($$0, cja.pE, csm.aj);
      e($$0, cja.pF, csm.ak);
      e($$0, cja.pG, csm.am);
      e($$0, cja.pH, cja.bN);
      e($$0, cja.pI, csm.ot);
      e($$0, cja.pJ, csm.ok);
      ls.a(lq.a, csm.cm).a('#', apt.b).a('X', apt.j).b("###").b("XXX").b("###").b("has_book", a((cpk)cja.qb)).a($$0);
      a($$0, cja.qv, csm.bS, "orange_dye");
      a($$0, cja.qD, csm.kC, "cyan_dye", 2);
      a($$0, csm.s, apt.w, 4);
      a($$0, csm.at, csm.Z);
      a($$0, csm.aB, csm.aj);
      b($$0, cja.ns, csm.s);
      c($$0, cja.nt, cja.ns);
      a($$0, cja.qA, cja.dq, "pink_dye", 1);
      ls.a(lq.e, cja.wv).a('X', cja.oF).a('#', cja.nS).a('I', cja.oB).b("X").b("#").b("I").b("has_copper_ingot", a((cpk)cja.nS)).a($$0);
      ls.a(lq.b, cja.eg).a('#', cja.pX).b(" # ").b("# #").b(" # ").b("has_brick", a(apt.aM)).a($$0, "decorated_pot_simple");
      ly.a(cmc.w).a($$0, "decorated_pot");
   }

   public static Map<cis, aer> b() {
      return Stream.of(cja.wE, cja.wF, cja.wz, cja.wD, cja.wH, cja.wB, cja.wC, cja.wy, cja.wA, cja.wG, cja.wx, cja.wI, cja.wJ, cja.wK, cja.wL, cja.wM)
         .collect(Collectors.toMap(Function.identity(), $$0 -> new aer(c($$0) + "_smithing_trim")));
   }
}
