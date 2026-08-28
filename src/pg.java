import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class pg extends ow {
   private static final ImmutableList<dfa> c = ImmutableList.of(cwf.ak, cwf.al);
   private static final ImmutableList<dfa> d = ImmutableList.of(cwf.am, cwf.an, cwf.oF);
   private static final ImmutableList<dfa> e = ImmutableList.of(cwf.ao, cwf.ap, cwf.oH);
   private static final ImmutableList<dfa> f = ImmutableList.of(cwf.aq, cwf.ar, cwf.aA, cwf.oJ);
   private static final ImmutableList<dfa> g = ImmutableList.of(cwf.ay, cwf.az);
   private static final ImmutableList<dfa> h = ImmutableList.of(cwf.aw, cwf.ax);
   private static final ImmutableList<dfa> i = ImmutableList.of(cwf.as, cwf.at);
   private static final ImmutableList<dfa> j = ImmutableList.of(cwf.au, cwf.av);

   pg(js.a $$0, ov $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.b.b();
      this.a(crf.a(crh.a));
      this.a(dig.r, axj.v, 4);
      this.b(dig.p, axj.u, 4);
      this.b(dig.oE, axj.A, 4);
      this.a(dig.t, axj.s, 4);
      this.b(dig.q, axj.x, 4);
      this.b(dig.n, axj.t, 4);
      this.b(dig.o, axj.y, 4);
      this.b(dig.oF, axj.B, 4);
      this.b(dig.u, axj.z, 4);
      this.a((dfa)dig.as, (dfa)dig.Y);
      this.a((dfa)dig.aq, (dfa)dig.W);
      this.a((dfa)dig.au, (dfa)dig.aa);
      this.a((dfa)dig.ar, (dfa)dig.X);
      this.a((dfa)dig.ao, (dfa)dig.U);
      this.a((dfa)dig.ap, (dfa)dig.V);
      this.a((dfa)dig.ou, (dfa)dig.os);
      this.a((dfa)dig.ol, (dfa)dig.oj);
      this.a((dfa)dig.av, (dfa)dig.ab);
      this.a((dfa)dig.aA, (dfa)dig.ai);
      this.a((dfa)dig.ay, (dfa)dig.ag);
      this.a((dfa)dig.aC, (dfa)dig.ak);
      this.a((dfa)dig.az, (dfa)dig.ah);
      this.a((dfa)dig.aw, (dfa)dig.al);
      this.a((dfa)dig.ax, (dfa)dig.af);
      this.a((dfa)dig.ov, (dfa)dig.ot);
      this.a((dfa)dig.om, (dfa)dig.ok);
      this.a((dfa)dig.aD, (dfa)dig.am);
      this.b(cwf.od, dig.r);
      this.b(cwf.nZ, dig.p);
      this.b(cwf.oh, dig.t);
      this.b(cwf.ob, dig.q);
      this.b(cwf.nV, dig.n);
      this.b(cwf.nX, dig.o);
      this.b(cwf.oj, dig.u);
      List<cvx> $$0 = List.of(cwf.ry, cwf.ru, cwf.rv, cwf.rs, cwf.rq, cwf.rw, cwf.rm, cwf.rr, cwf.ro, cwf.rl, cwf.rk, cwf.rp, cwf.rt, cwf.rx, cwf.rn, cwf.rj);
      List<cvx> $$1 = List.of(cwf.dj, cwf.df, cwf.dg, cwf.dd, cwf.db, cwf.dh, cwf.cX, cwf.dc, cwf.cZ, cwf.cW, cwf.cV, cwf.da, cwf.de, cwf.di, cwf.cY, cwf.cU);
      List<cvx> $$2 = List.of(cwf.rS, cwf.rO, cwf.rP, cwf.rM, cwf.rK, cwf.rQ, cwf.rG, cwf.rL, cwf.rI, cwf.rF, cwf.rE, cwf.rJ, cwf.rN, cwf.rR, cwf.rH, cwf.rD);
      List<cvx> $$3 = List.of(cwf.hT, cwf.hP, cwf.hQ, cwf.hN, cwf.hL, cwf.hR, cwf.hH, cwf.hM, cwf.hJ, cwf.hG, cwf.hF, cwf.hK, cwf.hO, cwf.hS, cwf.hI, cwf.hE);
      this.a($$0, $$1, "wool");
      this.a($$0, $$2, "bed");
      this.a($$0, $$3, "carpet");
      this.f(dig.iz, dig.bP);
      this.g(cwf.rS, dig.bP);
      this.h(cwf.vg, dig.bP);
      this.f(dig.iv, dig.bL);
      this.g(cwf.rO, dig.bL);
      this.h(cwf.vc, dig.bL);
      this.f(dig.iw, dig.bM);
      this.g(cwf.rP, dig.bM);
      this.h(cwf.vd, dig.bM);
      this.f(dig.it, dig.bJ);
      this.g(cwf.rM, dig.bJ);
      this.h(cwf.va, dig.bJ);
      this.f(dig.ir, dig.bH);
      this.g(cwf.rK, dig.bH);
      this.h(cwf.uY, dig.bH);
      this.f(dig.ix, dig.bN);
      this.g(cwf.rQ, dig.bN);
      this.h(cwf.ve, dig.bN);
      this.f(dig.in, dig.bD);
      this.g(cwf.rG, dig.bD);
      this.h(cwf.uU, dig.bD);
      this.f(dig.is, dig.bI);
      this.g(cwf.rL, dig.bI);
      this.h(cwf.uZ, dig.bI);
      this.f(dig.ip, dig.bF);
      this.g(cwf.rI, dig.bF);
      this.h(cwf.uW, dig.bF);
      this.f(dig.im, dig.bC);
      this.g(cwf.rF, dig.bC);
      this.h(cwf.uT, dig.bC);
      this.f(dig.il, dig.bB);
      this.g(cwf.rE, dig.bB);
      this.h(cwf.uS, dig.bB);
      this.f(dig.iq, dig.bG);
      this.g(cwf.rJ, dig.bG);
      this.h(cwf.uX, dig.bG);
      this.f(dig.iu, dig.bK);
      this.g(cwf.rN, dig.bK);
      this.h(cwf.vb, dig.bK);
      this.f(dig.iy, dig.bO);
      this.g(cwf.rR, dig.bO);
      this.h(cwf.vf, dig.bO);
      this.f(dig.ik, dig.bA);
      this.g(cwf.rD, dig.bA);
      this.h(cwf.uR, dig.bA);
      this.f(dig.io, dig.bE);
      this.g(cwf.rH, dig.bE);
      this.h(cwf.uV, dig.bE);
      this.f(dig.sA, dig.sC);
      this.i(dig.ex, cwf.ry);
      this.j(dig.hO, dig.ex);
      this.k(dig.hO, cwf.ry);
      this.i(dig.et, cwf.ru);
      this.j(dig.hK, dig.et);
      this.k(dig.hK, cwf.ru);
      this.i(dig.eu, cwf.rv);
      this.j(dig.hL, dig.eu);
      this.k(dig.hL, cwf.rv);
      this.i(dig.er, cwf.rs);
      this.j(dig.hI, dig.er);
      this.k(dig.hI, cwf.rs);
      this.i(dig.ep, cwf.rq);
      this.j(dig.hG, dig.ep);
      this.k(dig.hG, cwf.rq);
      this.i(dig.ev, cwf.rw);
      this.j(dig.hM, dig.ev);
      this.k(dig.hM, cwf.rw);
      this.i(dig.el, cwf.rm);
      this.j(dig.hC, dig.el);
      this.k(dig.hC, cwf.rm);
      this.i(dig.eq, cwf.rr);
      this.j(dig.hH, dig.eq);
      this.k(dig.hH, cwf.rr);
      this.i(dig.en, cwf.ro);
      this.j(dig.hE, dig.en);
      this.k(dig.hE, cwf.ro);
      this.i(dig.ek, cwf.rl);
      this.j(dig.hB, dig.ek);
      this.k(dig.hB, cwf.rl);
      this.i(dig.ej, cwf.rk);
      this.j(dig.hA, dig.ej);
      this.k(dig.hA, cwf.rk);
      this.i(dig.eo, cwf.rp);
      this.j(dig.hF, dig.eo);
      this.k(dig.hF, cwf.rp);
      this.i(dig.es, cwf.rt);
      this.j(dig.hJ, dig.es);
      this.k(dig.hJ, cwf.rt);
      this.i(dig.ew, cwf.rx);
      this.j(dig.hN, dig.ew);
      this.k(dig.hN, cwf.rx);
      this.i(dig.ei, cwf.rj);
      this.j(dig.hz, dig.ei);
      this.k(dig.hz, cwf.rj);
      this.i(dig.em, cwf.rn);
      this.j(dig.hD, dig.em);
      this.k(dig.hD, cwf.rn);
      this.l(dig.hy, cwf.ry);
      this.l(dig.hu, cwf.ru);
      this.l(dig.hv, cwf.rv);
      this.l(dig.hs, cwf.rs);
      this.l(dig.hq, cwf.rq);
      this.l(dig.hw, cwf.rw);
      this.l(dig.hm, cwf.rm);
      this.l(dig.hr, cwf.rr);
      this.l(dig.ho, cwf.ro);
      this.l(dig.hl, cwf.rl);
      this.l(dig.hk, cwf.rk);
      this.l(dig.hp, cwf.rp);
      this.l(dig.ht, cwf.rt);
      this.l(dig.hx, cwf.rx);
      this.l(dig.hj, cwf.rj);
      this.l(dig.hn, cwf.rn);
      this.m(dig.mb, cwf.ry);
      this.m(dig.lX, cwf.ru);
      this.m(dig.lY, cwf.rv);
      this.m(dig.lV, cwf.rs);
      this.m(dig.lT, cwf.rq);
      this.m(dig.lZ, cwf.rw);
      this.m(dig.lP, cwf.rm);
      this.m(dig.lU, cwf.rr);
      this.m(dig.lR, cwf.ro);
      this.m(dig.lO, cwf.rl);
      this.m(dig.lN, cwf.rk);
      this.m(dig.lS, cwf.rp);
      this.m(dig.lW, cwf.rt);
      this.m(dig.ma, cwf.rx);
      this.m(dig.lM, cwf.rj);
      this.m(dig.lQ, cwf.rn);
      this.a(ou.b, cwf.wW).a('S', cwf.pt).a('H', cwf.wC).b("S").b("H").b("has_string", this.a((dfa)cwf.pt)).b("has_honeycomb", this.a((dfa)cwf.wC)).a(this.b);
      this.n(dig.qb, cwf.ry);
      this.n(dig.pX, cwf.ru);
      this.n(dig.pY, cwf.rv);
      this.n(dig.pV, cwf.rs);
      this.n(dig.pT, cwf.rq);
      this.n(dig.pZ, cwf.rw);
      this.n(dig.pP, cwf.rm);
      this.n(dig.pU, cwf.rr);
      this.n(dig.pR, cwf.ro);
      this.n(dig.pO, cwf.rl);
      this.n(dig.pN, cwf.rk);
      this.n(dig.pS, cwf.rp);
      this.n(dig.pW, cwf.rt);
      this.n(dig.qa, cwf.rx);
      this.n(dig.pM, cwf.rj);
      this.n(dig.pQ, cwf.rn);
      this.b(ou.a, dig.eL, 1).b(dig.sI).b(cwf.px).b("has_mud", this.a(dig.sI)).a(this.b);
      this.a(ou.a, dig.eM, 4).a('#', dig.eL).b("##").b("##").b("has_packed_mud", this.a(dig.eL)).a(this.b);
      this.b(ou.a, dig.ad, 1).b(dig.sI).b(cwf.bK).b("has_mangrove_roots", this.a(dig.ac)).a(this.b);
      this.a(ou.d, dig.hh, 6).a('#', dig.dK).a('S', cwf.pr).a('X', cwf.oG).b("XSX").b("X#X").b("XSX").b("has_rail", this.a(dig.cP)).a(this.b);
      this.b(ou.a, dig.g, 2).b(dig.e).b(dig.m).b("has_stone", this.a(dig.e)).a(this.b);
      this.a(ou.b, dig.gS).a('I', dig.ci).a('i', cwf.oG).b("III").b(" i ").b("iii").b("has_iron_block", this.a(dig.ci)).a(this.b);
      this.a(ou.b, cwf.uH).a('/', cwf.pr).a('_', dig.jE).b("///").b(" / ").b("/_/").b("has_stone_slab", this.a(dig.jE)).a(this.b);
      this.a(ou.f, cwf.ox, 4)
         .a('#', cwf.pr)
         .a('X', cwf.pX)
         .a('Y', cwf.pu)
         .b("X")
         .b("#")
         .b("Y")
         .b("has_feather", this.a((dfa)cwf.pu))
         .b("has_flint", this.a((dfa)cwf.pX))
         .a(this.b);
      this.a(ou.b, dig.nU, 1).a('P', axj.b).a('S', axj.j).b("PSP").b("P P").b("PSP").b("has_planks", this.a(axj.b)).b("has_wood_slab", this.a(axj.j)).a(this.b);
      this.a(ou.i, dig.fO).a('S', cwf.uu).a('G', dig.aQ).a('O', dig.co).b("GGG").b("GSG").b("OOO").b("has_nether_star", this.a((dfa)cwf.uu)).a(this.b);
      this.a(ou.b, dig.pf).a('P', axj.b).a('H', cwf.wC).b("PPP").b("HHH").b("PPP").b("has_honeycomb", this.a((dfa)cwf.wC)).a(this.b);
      this.b(ou.g, cwf.vo).b(cwf.ou).a(cwf.vm, 6).b("has_beetroot", this.a((dfa)cwf.vm)).a(this.b);
      this.b(ou.i, cwf.ry).b(cwf.rg).b("black_dye").b("has_ink_sac", this.a((dfa)cwf.rg)).a(this.b);
      this.a(cwf.ry, dig.cd, "black_dye");
      this.b(ou.h, cwf.sp, 2).b(cwf.sh).b("has_blaze_rod", this.a((dfa)cwf.sh)).a(this.b);
      this.b(ou.i, cwf.ru).b(cwf.oC).b("blue_dye").b("has_lapis_lazuli", this.a((dfa)cwf.oC)).a(this.b);
      this.a(cwf.ru, dig.cc, "blue_dye");
      this.b(ou.a, dig.mW, dig.iC);
      this.b(ou.i, cwf.rz, 3).b(cwf.rA).b("bonemeal").b("has_bone", this.a((dfa)cwf.rA)).a(this.b);
      this.b(ou.i, cwf.rz, ou.a, cwf.ja, "bone_meal_from_bone_block", "bonemeal");
      this.b(ou.i, cwf.qQ).a(cwf.qP, 3).b(cwf.qE).b("has_paper", this.a((dfa)cwf.qP)).a(this.b);
      this.a(ou.a, dig.cl).a('#', axj.b).a('X', cwf.qQ).b("###").b("XXX").b("###").b("has_book", this.a((dfa)cwf.qQ)).a(this.b);
      this.a(ou.f, cwf.ow).a('#', cwf.pr).a('X', cwf.pt).b(" #X").b("# X").b(" #X").b("has_string", this.a((dfa)cwf.pt)).a(this.b);
      this.a(ou.i, cwf.ou, 4)
         .a('#', axj.b)
         .b("# #")
         .b(" # ")
         .b("has_brown_mushroom", this.a(dig.cf))
         .b("has_red_mushroom", this.a(dig.cg))
         .b("has_mushroom_stew", this.a((dfa)cwf.ps))
         .a(this.b);
      this.a(ou.g, cwf.py).a('#', cwf.px).b("###").b("has_wheat", this.a((dfa)cwf.px)).a(this.b);
      this.a(ou.h, dig.fs).a('B', cwf.sh).a('#', axj.bp).b(" B ").b("###").b("has_blaze_rod", this.a((dfa)cwf.sh)).a(this.b);
      this.a(ou.a, dig.cj).a('#', cwf.qM).b("##").b("##").b("has_brick", this.a((dfa)cwf.qM)).a(this.b);
      this.b(ou.i, cwf.rv).b(cwf.ri).b("brown_dye").b("has_cocoa_beans", this.a((dfa)cwf.ri)).a(this.b);
      this.a(ou.i, cwf.qz).a('#', cwf.oG).b("# #").b(" # ").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.g, dig.eg).a('A', cwf.qF).a('B', cwf.rB).a('C', cwf.px).a('E', cwf.qS).b("AAA").b("BEB").b("CCC").b("has_egg", this.a((dfa)cwf.qS)).a(this.b);
      this.a(ou.b, dig.og)
         .a('L', axj.r)
         .a('S', cwf.pr)
         .a('C', axj.aW)
         .b(" S ")
         .b("SCS")
         .b("LLL")
         .b("has_stick", this.a((dfa)cwf.pr))
         .b("has_coal", this.a(axj.aW))
         .a(this.b);
      this.a(ou.d, cwf.nR).a('#', cwf.qW).a('X', cwf.uh).b("# ").b(" X").b("has_carrot", this.a((dfa)cwf.uh)).a(this.b);
      this.a(ou.d, cwf.nS).a('#', cwf.qW).a('X', cwf.dD).b("# ").b(" X").b("has_warped_fungus", this.a((dfa)cwf.dD)).a(this.b);
      this.a(ou.h, dig.ft).a('#', cwf.oG).b("# #").b("# #").b("###").b("has_water_bucket", this.a((dfa)cwf.qA)).a(this.b);
      this.a(ou.b, dig.pc).a('#', axj.j).b("# #").b("# #").b("###").b("has_wood_slab", this.a(axj.j)).a(this.b);
      this.a(ou.b, dig.cv)
         .a('#', axj.b)
         .b("###")
         .b("# #")
         .b("###")
         .b("has_lots_of_items", ao.f.a(new ci.a(Optional.empty(), new ci.a.a(dj.d.b(10), dj.d.c, dj.d.c), List.of())))
         .a(this.b);
      this.b(ou.d, cwf.nN).b(dig.cv).b(cwf.nM).b("has_minecart", this.a((dfa)cwf.nM)).a(this.b);
      this.c(cwf.oe, cwf.od);
      this.c(cwf.oa, cwf.nZ);
      this.c(cwf.oi, cwf.oh);
      this.c(cwf.oc, cwf.ob);
      this.c(cwf.nW, cwf.nV);
      this.c(cwf.nY, cwf.nX);
      this.c(cwf.ok, cwf.oj);
      this.b(ou.a, dig.he, dal.a(dig.jN))
         .b("has_chiseled_quartz_block", this.a(dig.he))
         .b("has_quartz_block", this.a(dig.hd))
         .b("has_quartz_pillar", this.a(dig.hf))
         .a(this.b);
      this.b(ou.a, dig.eK, dal.a(dig.jK)).b("has_tag", this.a(axj.c)).a(this.b);
      this.a(ou.a, dig.dR, cwf.qN);
      this.a(ou.e, cwf.qX).a('#', cwf.oK).a('X', cwf.lH).b(" # ").b("#X#").b(" # ").b("has_redstone", this.a((dfa)cwf.lH)).a(this.b);
      this.a(ou.i, cwf.oy, ou.a, cwf.aD);
      this.a(ou.a, dig.k, 4).a('D', dig.j).a('G', dig.L).b("DG").b("GD").b("has_gravel", this.a(dig.L)).a(this.b);
      this.a(ou.c, dig.gY).a('#', dig.dK).a('X', cwf.oD).a('I', dig.b).b(" # ").b("#X#").b("III").b("has_quartz", this.a((dfa)cwf.oD)).a(this.b);
      this.a(ou.e, cwf.qT).a('#', cwf.oG).a('X', cwf.lH).b(" # ").b("#X#").b(" # ").b("has_redstone", this.a((dfa)cwf.lH)).a(this.b);
      this.a(ou.g, cwf.rT, 8).a('#', cwf.px).a('X', cwf.ri).b("#X#").b("has_cocoa", this.a((dfa)cwf.ri)).a(this.b);
      this.a(ou.b, dig.cA).a('#', axj.b).b("##").b("##").b("unlock_right_away", ds.a.e()).a(false).a(this.b);
      this.a(ou.f, cwf.vX)
         .a('~', cwf.pt)
         .a('#', cwf.pr)
         .a('&', cwf.oG)
         .a('$', dig.fH)
         .b("#&#")
         .b("~$~")
         .b(" # ")
         .b("has_string", this.a((dfa)cwf.pt))
         .b("has_iron_ingot", this.a((dfa)cwf.oG))
         .b("has_tripwire_hook", this.a(dig.fH))
         .a(this.b);
      this.a(ou.b, dig.nT).a('#', axj.b).a('@', cwf.pt).b("@@").b("##").b("has_string", this.a((dfa)cwf.pt)).a(this.b);
      this.b(ou.a, dig.jq, dal.a(dig.jO))
         .b("has_red_sandstone", this.a(dig.jp))
         .b("has_chiseled_red_sandstone", this.a(dig.jq))
         .b("has_cut_red_sandstone", this.a(dig.jr))
         .a(this.b);
      this.g(ou.a, dig.aW, dig.jF);
      this.b(ou.i, cwf.oI, ou.a, cwf.aL, d(cwf.oI), c(cwf.oI));
      this.b(ou.i, cwf.oI, 9).b(dig.rw).b(c(cwf.oI)).b(b(dig.rw), this.a(dig.rw)).a(this.b, p(cwf.oI, dig.rw));
      this.b(crf.a(crh.a));
      this.b(ou.i, cwf.rs, 2).b(cwf.ru).b(cwf.rw).b("cyan_dye").b("has_green_dye", this.a((dfa)cwf.rw)).b("has_blue_dye", this.a((dfa)cwf.ru)).a(this.b);
      this.a(ou.a, dig.ib).a('S', cwf.uA).a('I', cwf.ry).b("SSS").b("SIS").b("SSS").b("has_prismarine_shard", this.a((dfa)cwf.uA)).a(this.b);
      this.a(ou.c, dig.gZ).a('Q', cwf.oD).a('G', dig.aQ).a('W', axj.j).b("GGG").b("QQQ").b("WWW").b("has_quartz", this.a((dfa)cwf.oD)).a(this.b);
      this.a(ou.a, dig.sW, 4).a('S', dig.sO).b("SS").b("SS").b("has_polished_deepslate", this.a(dig.sO)).a(this.b);
      this.a(ou.a, dig.sS, 4).a('S', dig.sW).b("SS").b("SS").b("has_deepslate_bricks", this.a(dig.sW)).a(this.b);
      this.a(ou.d, dig.bq, 6).a('R', cwf.lH).a('#', dig.dx).a('X', cwf.oG).b("X X").b("X#X").b("XRX").b("has_rail", this.a(dig.cP)).a(this.b);
      this.a(ou.e, cwf.pk).a('#', cwf.pr).a('X', axj.bf).b("XX").b("X#").b(" #").b("has_diamond", this.a(axj.bf)).a(this.b);
      this.a(ou.i, cwf.oA, ou.a, cwf.aN);
      this.a(ou.f, cwf.pO).a('X', cwf.oA).b("X X").b("X X").b("has_diamond", this.a((dfa)cwf.oA)).a(this.b);
      this.a(ou.f, cwf.pM).a('X', cwf.oA).b("X X").b("XXX").b("XXX").b("has_diamond", this.a((dfa)cwf.oA)).a(this.b);
      this.a(ou.f, cwf.pL).a('X', cwf.oA).b("XXX").b("X X").b("has_diamond", this.a((dfa)cwf.oA)).a(this.b);
      this.a(ou.e, cwf.pl).a('#', cwf.pr).a('X', axj.bf).b("XX").b(" #").b(" #").b("has_diamond", this.a(axj.bf)).a(this.b);
      this.a(ou.f, cwf.pN).a('X', cwf.oA).b("XXX").b("X X").b("X X").b("has_diamond", this.a((dfa)cwf.oA)).a(this.b);
      this.a(ou.e, cwf.pj).a('#', cwf.pr).a('X', axj.bf).b("XXX").b(" # ").b(" # ").b("has_diamond", this.a(axj.bf)).a(this.b);
      this.a(ou.e, cwf.pi).a('#', cwf.pr).a('X', axj.bf).b("X").b("#").b("#").b("has_diamond", this.a(axj.bf)).a(this.b);
      this.a(ou.f, cwf.ph).a('#', cwf.pr).a('X', axj.bf).b("X").b("X").b("#").b("has_diamond", this.a(axj.bf)).a(this.b);
      this.a(ou.a, dig.e, 2).a('Q', cwf.oD).a('C', dig.m).b("CQ").b("QC").b("has_quartz", this.a((dfa)cwf.oD)).a(this.b);
      this.a(ou.c, dig.aU).a('R', cwf.lH).a('#', dig.m).a('X', cwf.ow).b("###").b("#X#").b("#R#").b("has_bow", this.a((dfa)cwf.ow)).a(this.b);
      this.a(ou.a, dig.su, cwf.xr);
      this.a(ou.c, dig.hi).a('R', cwf.lH).a('#', dig.m).b("###").b("# #").b("#R#").b("has_redstone", this.a((dfa)cwf.lH)).a(this.b);
      this.a(ou.i, cwf.oB, ou.a, cwf.gs);
      this.a(ou.b, dig.fr).a('B', cwf.qQ).a('#', dig.co).a('D', cwf.oA).b(" B ").b("D#D").b("###").b("has_obsidian", this.a(dig.co)).a(this.b);
      this.a(ou.b, dig.fG).a('#', dig.co).a('E', cwf.st).b("###").b("#E#").b("###").b("has_ender_eye", this.a((dfa)cwf.st)).a(this.b);
      this.b(ou.i, cwf.st).b(cwf.sg).b(cwf.sp).b("has_blaze_powder", this.a((dfa)cwf.sp)).a(this.b);
      this.a(ou.a, dig.kz, 4).a('#', dig.fz).b("##").b("##").b("has_end_stone", this.a(dig.fz)).a(this.b);
      this.a(ou.b, cwf.vh).a('T', cwf.si).a('E', cwf.st).a('G', dig.aQ).b("GGG").b("GEG").b("GTG").b("has_ender_eye", this.a((dfa)cwf.st)).a(this.b);
      this.a(ou.b, dig.kt, 4).a('#', cwf.vj).a('/', cwf.sh).b("/").b("#").b("has_chorus_fruit_popped", this.a((dfa)cwf.vj)).a(this.b);
      this.b(ou.h, cwf.so).b(cwf.sn).b(dig.cf).b(cwf.rB).b("has_spider_eye", this.a((dfa)cwf.sn)).a(this.b);
      this.b(ou.i, cwf.tY, 3).b(cwf.pv).b(cwf.sp).a(dal.a(cwf.oy, cwf.oz)).b("has_blaze_powder", this.a((dfa)cwf.sp)).a(this.b);
      this.b(ou.i, cwf.uw, 3).b(cwf.pv).b(cwf.qP).b("has_gunpowder", this.a((dfa)cwf.pv)).a(this.b, "firework_rocket_simple");
      this.a(ou.e, cwf.qW).a('#', cwf.pr).a('X', cwf.pt).b("  #").b(" #X").b("# X").b("has_string", this.a((dfa)cwf.pt)).a(this.b);
      this.b(ou.e, cwf.ot).b(cwf.oG).b(cwf.pX).b("has_flint", this.a((dfa)cwf.pX)).b("has_obsidian", this.a(dig.co)).a(this.b);
      this.a(ou.b, dig.fR).a('#', cwf.qM).b("# #").b(" # ").b("has_brick", this.a((dfa)cwf.qM)).a(this.b);
      this.a(ou.b, dig.cD).a('#', axj.bp).b("###").b("# #").b("###").b("has_cobblestone", this.a(axj.bp)).a(this.b);
      this.b(ou.d, cwf.nO).b(dig.cD).b(cwf.nM).b("has_minecart", this.a((dfa)cwf.nM)).a(this.b);
      this.a(ou.h, cwf.sl, 3).a('#', dig.aQ).b("# #").b(" # ").b("has_glass", this.a(dig.aQ)).a(this.b);
      this.a(ou.b, dig.eY, 16).a('#', dig.aQ).b("###").b("###").b("has_glass", this.a(dig.aQ)).a(this.b);
      this.a(ou.a, dig.ec, cwf.qZ);
      this.b(ou.b, cwf.uf).b(cwf.ue).b(cwf.rh).b("has_item_frame", this.a((dfa)cwf.ue)).b("has_glow_ink_sac", this.a((dfa)cwf.rh)).a(this.b);
      this.a(ou.g, cwf.qb).a('#', cwf.oK).a('X', cwf.ov).b("###").b("#X#").b("###").b("has_gold_ingot", this.a((dfa)cwf.oK)).a(this.b);
      this.a(ou.e, cwf.pa).a('#', cwf.pr).a('X', axj.be).b("XX").b("X#").b(" #").b("has_gold_ingot", this.a(axj.be)).a(this.b);
      this.a(ou.f, cwf.pS).a('X', cwf.oK).b("X X").b("X X").b("has_gold_ingot", this.a((dfa)cwf.oK)).a(this.b);
      this.a(ou.h, cwf.um).a('#', cwf.sj).a('X', cwf.uh).b("###").b("#X#").b("###").b("has_gold_nugget", this.a((dfa)cwf.sj)).a(this.b);
      this.a(ou.f, cwf.pQ).a('X', cwf.oK).b("X X").b("XXX").b("XXX").b("has_gold_ingot", this.a((dfa)cwf.oK)).a(this.b);
      this.a(ou.f, cwf.pP).a('X', cwf.oK).b("XXX").b("X X").b("has_gold_ingot", this.a((dfa)cwf.oK)).a(this.b);
      this.a(ou.e, cwf.pb).a('#', cwf.pr).a('X', axj.be).b("XX").b(" #").b(" #").b("has_gold_ingot", this.a(axj.be)).a(this.b);
      this.a(ou.f, cwf.pR).a('X', cwf.oK).b("XXX").b("X X").b("X X").b("has_gold_ingot", this.a((dfa)cwf.oK)).a(this.b);
      this.a(ou.e, cwf.oZ).a('#', cwf.pr).a('X', axj.be).b("XXX").b(" # ").b(" # ").b("has_gold_ingot", this.a(axj.be)).a(this.b);
      this.a(ou.d, dig.bp, 6).a('R', cwf.lH).a('#', cwf.pr).a('X', cwf.oK).b("X X").b("X#X").b("XRX").b("has_rail", this.a(dig.cP)).a(this.b);
      this.a(ou.e, cwf.oY).a('#', cwf.pr).a('X', axj.be).b("X").b("#").b("#").b("has_gold_ingot", this.a(axj.be)).a(this.b);
      this.a(ou.f, cwf.oX).a('#', cwf.pr).a('X', axj.be).b("X").b("X").b("#").b("has_gold_ingot", this.a(axj.be)).a(this.b);
      this.b(ou.i, cwf.oK, ou.a, cwf.aM, "gold_ingot_from_gold_block", "gold_ingot");
      this.a(ou.i, cwf.sj, ou.i, cwf.oK, "gold_ingot_from_nuggets", "gold_ingot");
      this.b(ou.a, dig.c).b(dig.e).b(cwf.oD).b("has_quartz", this.a((dfa)cwf.oD)).a(this.b);
      this.b(ou.i, cwf.rq, 2).b(cwf.ry).b(cwf.rj).b("has_white_dye", this.a((dfa)cwf.rj)).b("has_black_dye", this.a((dfa)cwf.ry)).a(this.b);
      this.b(ou.a, dig.ij, cwf.px);
      this.d(dig.gX, cwf.oG);
      this.b(ou.g, cwf.wF, 4).b(cwf.lP).a(cwf.sl, 4).b("has_honey_block", this.a(dig.pg)).a(this.b);
      this.a(ou.c, dig.pg, cwf.wF);
      this.a(ou.b, dig.ph, cwf.wC);
      this.a(ou.c, dig.hc).a('C', dig.cv).a('I', cwf.oG).b("I I").b("ICI").b(" I ").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.b(ou.d, cwf.nQ).b(dig.hc).b(cwf.nM).b("has_minecart", this.a((dfa)cwf.nM)).a(this.b);
      this.a(ou.e, cwf.pf).a('#', cwf.pr).a('X', axj.bd).b("XX").b("X#").b(" #").b("has_iron_ingot", this.a(axj.bd)).a(this.b);
      this.a(ou.b, dig.eW, 16).a('#', cwf.oG).b("###").b("###").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.f, cwf.pK).a('X', cwf.oG).b("X X").b("X X").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.f, cwf.pI).a('X', cwf.oG).b("X X").b("XXX").b("XXX").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(dig.dy, dal.a(cwf.oG)).a(b(cwf.oG), this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.f, cwf.pH).a('X', cwf.oG).b("XXX").b("X X").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.e, cwf.pg).a('#', cwf.pr).a('X', axj.bd).b("XX").b(" #").b(" #").b("has_iron_ingot", this.a(axj.bd)).a(this.b);
      this.b(ou.i, cwf.oG, ou.a, cwf.aK, "iron_ingot_from_iron_block", "iron_ingot");
      this.a(ou.i, cwf.vx, ou.i, cwf.oG, "iron_ingot_from_nuggets", "iron_ingot");
      this.a(ou.f, cwf.pJ).a('X', cwf.oG).b("XXX").b("X X").b("X X").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.e, cwf.pe).a('#', cwf.pr).a('X', axj.bd).b("XXX").b(" # ").b(" # ").b("has_iron_ingot", this.a(axj.bd)).a(this.b);
      this.a(ou.e, cwf.pd).a('#', cwf.pr).a('X', axj.bd).b("X").b("#").b("#").b("has_iron_ingot", this.a(axj.bd)).a(this.b);
      this.a(ou.f, cwf.pc).a('#', cwf.pr).a('X', axj.bd).b("X").b("X").b("#").b("has_iron_ingot", this.a(axj.bd)).a(this.b);
      this.a(ou.c, dig.hY, cwf.oG);
      this.a(ou.b, cwf.ue).a('#', cwf.pr).a('X', cwf.qE).b("###").b("#X#").b("###").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.b, dig.dT).a('#', axj.b).a('X', cwf.oA).b("###").b("#X#").b("###").b("has_diamond", this.a((dfa)cwf.oA)).a(this.b);
      this.a(ou.b, dig.cO, 3).a('#', cwf.pr).b("# #").b("###").b("# #").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.a(ou.i, cwf.oC, ou.a, cwf.cI);
      this.a(ou.e, cwf.uM, 2).a('~', cwf.pt).a('O', cwf.qR).b("~~ ").b("~O ").b("  ~").b("has_slime_ball", this.a((dfa)cwf.qR)).a(this.b);
      this.a(ou.i, cwf.qE, cwf.uG);
      this.a(ou.f, cwf.pC).a('X', cwf.qE).b("X X").b("X X").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.f, cwf.pA).a('X', cwf.qE).b("X X").b("XXX").b("XXX").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.f, cwf.pz).a('X', cwf.qE).b("XXX").b("X X").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.f, cwf.pB).a('X', cwf.qE).b("XXX").b("X X").b("X X").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.i, cwf.uL).a('X', cwf.qE).b("X X").b("XXX").b("X X").b("has_leather", this.a((dfa)cwf.qE)).a(this.b);
      this.a(ou.c, dig.oa).a('S', axj.j).a('B', dig.cl).b("SSS").b(" B ").b(" S ").b("has_book", this.a((dfa)cwf.qQ)).a(this.b);
      this.a(ou.c, dig.dw).a('#', dig.m).a('X', cwf.pr).b("X").b("#").b("has_cobblestone", this.a(dig.m)).a(this.b);
      this.a(cwf.rm, dig.bU, "light_blue_dye");
      this.b(ou.i, cwf.rm, 2)
         .b(cwf.ru)
         .b(cwf.rj)
         .b("light_blue_dye")
         .b("has_blue_dye", this.a((dfa)cwf.ru))
         .b("has_white_dye", this.a((dfa)cwf.rj))
         .a(this.b, "light_blue_dye_from_blue_white_dye");
      this.a(cwf.rr, dig.bW, "light_gray_dye");
      this.b(ou.i, cwf.rr, 2)
         .b(cwf.rq)
         .b(cwf.rj)
         .b("light_gray_dye")
         .b("has_gray_dye", this.a((dfa)cwf.rq))
         .b("has_white_dye", this.a((dfa)cwf.rj))
         .a(this.b, "light_gray_dye_from_gray_white_dye");
      this.b(ou.i, cwf.rr, 3)
         .b(cwf.ry)
         .a(cwf.rj, 2)
         .b("light_gray_dye")
         .b("has_white_dye", this.a((dfa)cwf.rj))
         .b("has_black_dye", this.a((dfa)cwf.ry))
         .a(this.b, "light_gray_dye_from_black_white_dye");
      this.a(cwf.rr, dig.cb, "light_gray_dye");
      this.a(cwf.rr, dig.bZ, "light_gray_dye");
      this.d(dig.gW, cwf.oK);
      this.a(ou.c, dig.ss).a('#', cwf.oI).b("#").b("#").b("#").b("has_copper_ingot", this.a((dfa)cwf.oI)).a(this.b);
      this.b(ou.i, cwf.ro, 2).b(cwf.rw).b(cwf.rj).b("has_green_dye", this.a((dfa)cwf.rw)).b("has_white_dye", this.a((dfa)cwf.rj)).a(this.b);
      this.a(ou.a, dig.ef).a('A', dig.ee).a('B', dig.cp).b("A").b("B").b("has_carved_pumpkin", this.a(dig.ee)).a(this.b);
      this.a(cwf.rl, dig.bV, "magenta_dye");
      this.b(ou.i, cwf.rl, 4)
         .b(cwf.ru)
         .a(cwf.rx, 2)
         .b(cwf.rj)
         .b("magenta_dye")
         .b("has_blue_dye", this.a((dfa)cwf.ru))
         .b("has_rose_red", this.a((dfa)cwf.rx))
         .b("has_white_dye", this.a((dfa)cwf.rj))
         .a(this.b, "magenta_dye_from_blue_red_white_dye");
      this.b(ou.i, cwf.rl, 3)
         .b(cwf.ru)
         .b(cwf.rx)
         .b(cwf.rp)
         .b("magenta_dye")
         .b("has_pink_dye", this.a((dfa)cwf.rp))
         .b("has_blue_dye", this.a((dfa)cwf.ru))
         .b("has_red_dye", this.a((dfa)cwf.rx))
         .a(this.b, "magenta_dye_from_blue_red_pink");
      this.a(cwf.rl, dig.iE, "magenta_dye", 2);
      this.b(ou.i, cwf.rl, 2)
         .b(cwf.rt)
         .b(cwf.rp)
         .b("magenta_dye")
         .b("has_pink_dye", this.a((dfa)cwf.rp))
         .b("has_purple_dye", this.a((dfa)cwf.rt))
         .a(this.b, "magenta_dye_from_purple_and_pink");
      this.a(ou.a, dig.kJ, cwf.sq);
      this.b(ou.h, cwf.sq).b(cwf.sp).b(cwf.qR).b("has_blaze_powder", this.a((dfa)cwf.sp)).a(this.b);
      this.a(ou.i, cwf.ul).a('#', cwf.qP).a('X', cwf.qT).b("###").b("#X#").b("###").b("has_compass", this.a((dfa)cwf.qT)).a(this.b);
      this.a(ou.a, dig.fa, cwf.rX, "has_melon");
      this.b(ou.i, cwf.sa).b(cwf.rX).b("has_melon", this.a((dfa)cwf.rX)).a(this.b);
      this.a(ou.d, cwf.nM).a('#', cwf.oG).b("# #").b("###").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.b(ou.a, dig.cn).b(dig.m).b(dig.ff).b("mossy_cobblestone").b("has_vine", this.a(dig.ff)).a(this.b, p(dig.cn, dig.ff));
      this.b(ou.a, dig.eI).b(dig.eH).b(dig.ff).b("mossy_stone_bricks").b("has_vine", this.a(dig.ff)).a(this.b, p(dig.eI, dig.ff));
      this.b(ou.a, dig.cn).b(dig.m).b(dig.sC).b("mossy_cobblestone").b("has_moss_block", this.a(dig.sC)).a(this.b, p(dig.cn, dig.sC));
      this.b(ou.a, dig.eI).b(dig.eH).b(dig.sC).b("mossy_stone_bricks").b("has_moss_block", this.a(dig.sC)).a(this.b, p(dig.eI, dig.sC));
      this.b(ou.g, cwf.ps)
         .b(dig.cf)
         .b(dig.cg)
         .b(cwf.ou)
         .b("has_mushroom_stew", this.a((dfa)cwf.ps))
         .b("has_bowl", this.a((dfa)cwf.ou))
         .b("has_brown_mushroom", this.a(dig.cf))
         .b("has_red_mushroom", this.a(dig.cg))
         .a(this.b);
      ly.g.s().forEach($$0x -> {
         dqg $$1x = dqg.a($$0x);
         if ($$1x != null) {
            this.a($$0x, $$1x);
         }
      });
      this.a(ou.a, dig.fn, cwf.uz);
      this.b(ou.a, dig.kK, cwf.sk);
      this.a(ou.c, dig.aY).a('#', axj.b).a('X', cwf.lH).b("###").b("#X#").b("###").b("has_redstone", this.a((dfa)cwf.lH)).a(this.b);
      this.a(ou.c, dig.kO).a('Q', cwf.oD).a('R', cwf.lH).a('#', dig.m).b("###").b("RRQ").b("###").b("has_quartz", this.a((dfa)cwf.oD)).a(this.b);
      this.a(cwf.rk, dig.bY, "orange_dye");
      this.b(ou.i, cwf.rk, 2)
         .b(cwf.rx)
         .b(cwf.rn)
         .b("orange_dye")
         .b("has_red_dye", this.a((dfa)cwf.rx))
         .b("has_yellow_dye", this.a((dfa)cwf.rn))
         .a(this.b, "orange_dye_from_red_yellow");
      this.a(ou.b, cwf.qa).a('#', cwf.pr).a('X', axj.a).b("###").b("#X#").b("###").b("has_wool", this.a(axj.a)).a(this.b);
      this.a(ou.i, cwf.qP, 3).a('#', dig.dS).b("###").b("has_reeds", this.a(dig.dS)).a(this.b);
      this.a(ou.a, dig.hf, 2)
         .a('#', dig.hd)
         .b("#")
         .b("#")
         .b("has_chiseled_quartz_block", this.a(dig.he))
         .b("has_quartz_block", this.a(dig.hd))
         .b("has_quartz_pillar", this.a(dig.hf))
         .a(this.b);
      this.b(ou.a, dig.iC, dig.dO);
      this.a(cwf.rp, dig.iG, "pink_dye", 2);
      this.a(cwf.rp, dig.ca, "pink_dye");
      this.b(ou.i, cwf.rp, 2)
         .b(cwf.rx)
         .b(cwf.rj)
         .b("pink_dye")
         .b("has_white_dye", this.a((dfa)cwf.rj))
         .b("has_red_dye", this.a((dfa)cwf.rx))
         .a(this.b, "pink_dye_from_red_white_dye");
      this.a(ou.c, dig.by)
         .a('R', cwf.lH)
         .a('#', dig.m)
         .a('T', axj.b)
         .a('X', cwf.oG)
         .b("TTT")
         .b("#X#")
         .b("#R#")
         .b("has_redstone", this.a((dfa)cwf.lH))
         .a(this.b);
      this.e(ou.a, dig.dZ, dig.dY);
      this.a(ou.a, dig.hZ, cwf.uA);
      this.b(ou.a, dig.ia, cwf.uA);
      this.b(ou.g, cwf.uv).b(dig.eZ).b(cwf.rB).b(cwf.qS).b("has_carved_pumpkin", this.a(dig.ee)).b("has_pumpkin", this.a(dig.eZ)).a(this.b);
      this.b(ou.i, cwf.rZ, 4).b(dig.eZ).b("has_pumpkin", this.a(dig.eZ)).a(this.b);
      this.b(ou.i, cwf.rt, 2).b(cwf.ru).b(cwf.rx).b("has_blue_dye", this.a((dfa)cwf.ru)).b("has_red_dye", this.a((dfa)cwf.rx)).a(this.b);
      this.a(ou.b, dig.kP).a('#', dig.cv).a('-', cwf.vw).b("-").b("#").b("-").b("has_shulker_shell", this.a((dfa)cwf.vw)).a(this.b);
      this.a(ou.a, dig.kw, 4).a('F', cwf.vj).b("FF").b("FF").b("has_chorus_fruit_popped", this.a((dfa)cwf.vj)).a(this.b);
      this.a(ou.a, dig.kx).a('#', dig.jQ).b("#").b("#").b("has_purpur_block", this.a(dig.kw)).a(this.b);
      this.a(ou.a, dig.jQ, dal.a(dig.kw, dig.kx)).a("has_purpur_block", this.a(dig.kw)).a(this.b);
      this.b(dig.ky, dal.a(dig.kw, dig.kx)).a("has_purpur_block", this.a(dig.kw)).a(this.b);
      this.a(ou.a, dig.hd, cwf.oD);
      this.a(ou.a, dig.pK, 4).a('#', dig.hd).b("##").b("##").b("has_quartz_block", this.a(dig.hd)).a(this.b);
      this.a(ou.a, dig.jN, dal.a(dig.he, dig.hd, dig.hf))
         .a("has_chiseled_quartz_block", this.a(dig.he))
         .a("has_quartz_block", this.a(dig.hd))
         .a("has_quartz_pillar", this.a(dig.hf))
         .a(this.b);
      this.b(dig.hg, dal.a(dig.he, dig.hd, dig.hf))
         .a("has_chiseled_quartz_block", this.a(dig.he))
         .a("has_quartz_block", this.a(dig.hd))
         .a("has_quartz_pillar", this.a(dig.hf))
         .a(this.b);
      this.b(ou.g, cwf.uE)
         .b(cwf.uj)
         .b(cwf.uD)
         .b(cwf.ou)
         .b(cwf.uh)
         .b(dig.cf)
         .b("rabbit_stew")
         .b("has_cooked_rabbit", this.a((dfa)cwf.uD))
         .a(this.b, p(cwf.uE, cwf.dA));
      this.b(ou.g, cwf.uE)
         .b(cwf.uj)
         .b(cwf.uD)
         .b(cwf.ou)
         .b(cwf.uh)
         .b(dig.cg)
         .b("rabbit_stew")
         .b("has_cooked_rabbit", this.a((dfa)cwf.uD))
         .a(this.b, p(cwf.uE, cwf.dB));
      this.a(ou.d, dig.cP, 16).a('#', cwf.pr).a('X', cwf.oG).b("X X").b("X#X").b("X X").b("has_minecart", this.a((dfa)cwf.nM)).a(this.b);
      this.a(ou.c, cwf.lH, ou.c, cwf.lJ);
      this.a(ou.c, dig.fB).a('R', cwf.lH).a('G', dig.ec).b(" R ").b("RGR").b(" R ").b("has_glowstone", this.a(dig.ec)).a(this.b);
      this.a(ou.c, dig.dK).a('#', cwf.pr).a('X', cwf.lH).b("X").b("#").b("has_redstone", this.a((dfa)cwf.lH)).a(this.b);
      this.a(cwf.rx, cwf.vm, "red_dye");
      this.a(cwf.rx, dig.bT, "red_dye");
      this.a(cwf.rx, dig.iF, "red_dye", 2);
      this.b(ou.i, cwf.rx).b(dig.bX).b("red_dye").b("has_red_flower", this.a(dig.bX)).a(this.b, "red_dye_from_tulip");
      this.a(ou.a, dig.kL).a('W', cwf.sk).a('N', cwf.uz).b("NW").b("WN").b("has_nether_wart", this.a((dfa)cwf.sk)).a(this.b);
      this.a(ou.a, dig.jp).a('#', dig.K).b("##").b("##").b("has_sand", this.a(dig.K)).a(this.b);
      this.a(ou.a, dig.jO, dal.a(dig.jp, dig.jq)).a("has_red_sandstone", this.a(dig.jp)).a("has_chiseled_red_sandstone", this.a(dig.jq)).a(this.b);
      this.b(dig.js, dal.a(dig.jp, dig.jq, dig.jr))
         .a("has_red_sandstone", this.a(dig.jp))
         .a("has_chiseled_red_sandstone", this.a(dig.jq))
         .a("has_cut_red_sandstone", this.a(dig.jr))
         .a(this.b);
      this.a(ou.c, dig.eh).a('#', dig.dK).a('X', cwf.lH).a('I', dig.b).b("#X#").b("III").b("has_redstone_torch", this.a(dig.dK)).a(this.b);
      this.a(ou.a, dig.aV, dig.I);
      this.a(ou.a, dig.jF, dal.a(dig.aV, dig.aW)).a("has_sandstone", this.a(dig.aV)).a("has_chiseled_sandstone", this.a(dig.aW)).a(this.b);
      this.b(dig.fD, dal.a(dig.aV, dig.aW, dig.aX))
         .a("has_sandstone", this.a(dig.aV))
         .a("has_chiseled_sandstone", this.a(dig.aW))
         .a("has_cut_sandstone", this.a(dig.aX))
         .a(this.b);
      this.a(ou.a, dig.ii).a('S', cwf.uA).a('C', cwf.uB).b("SCS").b("CCC").b("SCS").b("has_prismarine_crystals", this.a((dfa)cwf.uB)).a(this.b);
      this.a(ou.e, cwf.rW).a('#', cwf.oG).b(" #").b("# ").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.f, cwf.vu).a('W', axj.bb).a('o', cwf.oG).b("WoW").b("WWW").b(" W ").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.i, cwf.qR, ou.c, cwf.lO);
      this.f(ou.a, dig.jr, dig.jp);
      this.f(ou.a, dig.aX, dig.aV);
      this.a(ou.a, dig.dP, cwf.qD);
      this.a(ou.b, dig.dN, 6).a('#', dig.dP).b("###").b("has_snowball", this.a((dfa)cwf.qD)).a(this.b);
      this.a(ou.b, dig.oh).a('L', axj.r).a('S', cwf.pr).a('#', axj.aM).b(" S ").b("S#S").b("LLL").b("has_soul_sand", this.a(axj.aM)).a(this.b);
      this.a(ou.h, cwf.su).a('#', cwf.sj).a('X', cwf.rX).b("###").b("#X#").b("###").b("has_melon", this.a((dfa)cwf.rX)).a(this.b);
      this.a(ou.f, cwf.vr, 2).a('#', cwf.qZ).a('X', cwf.ox).b(" # ").b("#X#").b(" # ").b("has_glowstone_dust", this.a((dfa)cwf.qZ)).a(this.b);
      this.a(ou.e, cwf.qY).a('#', cwf.oE).a('X', cwf.oI).b(" # ").b(" X ").b(" X ").b("has_amethyst_shard", this.a((dfa)cwf.oE)).a(this.b);
      this.a(ou.i, cwf.pr, 4).a('#', axj.b).b("#").b("#").c("sticks").b("has_planks", this.a(axj.b)).a(this.b);
      this.a(ou.i, cwf.pr, 1).a('#', dig.mZ).b("#").b("#").c("sticks").b("has_bamboo", this.a(dig.mZ)).a(this.b, "stick_from_bamboo_item");
      this.a(ou.c, dig.br).a('P', dig.by).a('S', cwf.qR).b("S").b("P").b("has_slime_ball", this.a((dfa)cwf.qR)).a(this.b);
      this.a(ou.a, dig.eH, 4).a('#', dig.b).b("##").b("##").b("has_stone", this.a(dig.b)).a(this.b);
      this.a(ou.e, cwf.oV).a('#', cwf.pr).a('X', axj.bc).b("XX").b("X#").b(" #").b("has_cobblestone", this.a(axj.bc)).a(this.b);
      this.a(ou.a, dig.jK, dal.a(dig.eH)).a("has_stone_bricks", this.a(axj.c)).a(this.b);
      this.b(dig.fj, dal.a(dig.eH)).a("has_stone_bricks", this.a(axj.c)).a(this.b);
      this.a(ou.e, cwf.oW).a('#', cwf.pr).a('X', axj.bc).b("XX").b(" #").b(" #").b("has_cobblestone", this.a(axj.bc)).a(this.b);
      this.a(ou.e, cwf.oU).a('#', cwf.pr).a('X', axj.bc).b("XXX").b(" # ").b(" # ").b("has_cobblestone", this.a(axj.bc)).a(this.b);
      this.a(ou.e, cwf.oT).a('#', cwf.pr).a('X', axj.bc).b("X").b("#").b("#").b("has_cobblestone", this.a(axj.bc)).a(this.b);
      this.c(ou.a, dig.jE, dig.jR);
      this.a(ou.f, cwf.oS).a('#', cwf.pr).a('X', axj.bc).b("X").b("X").b("#").b("has_cobblestone", this.a(axj.bc)).a(this.b);
      this.a(ou.a, dig.bA).a('#', cwf.pt).b("##").b("##").b("has_string", this.a((dfa)cwf.pt)).a(this.b, p(dig.bA, cwf.pt));
      this.a(cwf.rB, dig.dS, "sugar");
      this.b(ou.i, cwf.rB, 3).b(cwf.wF).b("sugar").b("has_honey_bottle", this.a((dfa)cwf.wF)).a(this.b, p(cwf.rB, cwf.wF));
      this.a(ou.c, dig.pd)
         .a('H', cwf.hD)
         .a('R', cwf.lH)
         .b(" R ")
         .b("RHR")
         .b(" R ")
         .b("has_redstone", this.a((dfa)cwf.lH))
         .b("has_hay_block", this.a(dig.ij))
         .a(this.b);
      this.a(ou.c, dig.ck).a('#', dal.a(dig.I, dig.K)).a('X', cwf.pv).b("X#X").b("#X#").b("X#X").b("has_gunpowder", this.a((dfa)cwf.pv)).a(this.b);
      this.b(ou.d, cwf.nP).b(dig.ck).b(cwf.nM).b("has_minecart", this.a((dfa)cwf.nM)).a(this.b);
      this.a(ou.b, dig.cp, 4).a('#', cwf.pr).a('X', dal.a(cwf.oy, cwf.oz)).b("X").b("#").b("has_stone_pickaxe", this.a((dfa)cwf.oU)).a(this.b);
      this.a(ou.b, dig.ea, 4).a('X', dal.a(cwf.oy, cwf.oz)).a('#', cwf.pr).a('S', axj.aM).b("X").b("#").b("S").b("has_soul_sand", this.a(axj.aM)).a(this.b);
      this.a(ou.b, dig.oe)
         .a('#', cwf.eF)
         .a('X', cwf.vx)
         .b("XXX")
         .b("X#X")
         .b("XXX")
         .b("has_iron_nugget", this.a((dfa)cwf.vx))
         .b("has_iron_ingot", this.a((dfa)cwf.oG))
         .a(this.b);
      this.a(ou.b, dig.of).a('#', cwf.ft).a('X', cwf.vx).b("XXX").b("X#X").b("XXX").b("has_soul_torch", this.a((dfa)cwf.ft)).a(this.b);
      this.b(ou.c, dig.gV).b(dig.cv).b(dig.fH).b("has_tripwire_hook", this.a(dig.fH)).a(this.b);
      this.a(ou.c, dig.fH, 2).a('#', axj.b).a('S', cwf.pr).a('I', cwf.oG).b("I").b("S").b("#").b("has_string", this.a((dfa)cwf.pt)).a(this.b);
      this.a(ou.f, cwf.op).a('X', cwf.oq).b("XXX").b("X X").b("has_turtle_scute", this.a((dfa)cwf.oq)).a(this.b);
      this.a(ou.f, cwf.os).a('X', cwf.or).b("X  ").b("XXX").b("X X").b("has_armadillo_scute", this.a((dfa)cwf.or)).a(this.b);
      this.b(ou.i, cwf.px, 9).b(dig.ij).b("has_hay_block", this.a(dig.ij)).a(this.b);
      this.b(ou.i, cwf.rj).b(cwf.rz).b("white_dye").b("has_bone_meal", this.a((dfa)cwf.rz)).a(this.b);
      this.a(cwf.rj, dig.ce, "white_dye");
      this.a(ou.e, cwf.oQ).a('#', cwf.pr).a('X', axj.bb).b("XX").b("X#").b(" #").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.a(ou.e, cwf.oR).a('#', cwf.pr).a('X', axj.bb).b("XX").b(" #").b(" #").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.a(ou.e, cwf.oP).a('#', cwf.pr).a('X', axj.bb).b("XXX").b(" # ").b(" # ").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.a(ou.e, cwf.oO).a('#', cwf.pr).a('X', axj.bb).b("X").b("#").b("#").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.a(ou.f, cwf.oN).a('#', cwf.pr).a('X', axj.bb).b("X").b("X").b("#").b("has_stick", this.a((dfa)cwf.pr)).a(this.b);
      this.b(ou.i, cwf.ua).b(cwf.qQ).b(cwf.rg).b(cwf.pu).b("has_book", this.a((dfa)cwf.qQ)).a(this.b);
      this.a(cwf.rn, dig.bR, "yellow_dye");
      this.a(cwf.rn, dig.iD, "yellow_dye", 2);
      this.a(ou.g, cwf.rY, ou.a, cwf.qO);
      this.a(ou.i, dig.mX)
         .a('#', cwf.vV)
         .a('X', cwf.vW)
         .b("###")
         .b("#X#")
         .b("###")
         .b("has_nautilus_core", this.a((dfa)cwf.vW))
         .b("has_nautilus_shell", this.a((dfa)cwf.vV))
         .a(this.b);
      this.d(ou.b, dig.nH, dig.jp);
      this.d(ou.b, dig.nK, dig.eH);
      this.d(ou.b, dig.nP, dig.aV);
      this.b(ou.i, cwf.wi).b(cwf.qP).b(dig.cj).b("has_bricks", this.a(dig.cj)).a(this.b);
      this.b(ou.i, cwf.wj).b(cwf.qP).b(dig.ff).b("has_vines", this.a(dig.ff)).a(this.b);
      this.b(ou.i, cwf.wb).b(cwf.qP).b(cwf.ur).b("has_creeper_head", this.a((dfa)cwf.ur)).a(this.b);
      this.b(ou.i, cwf.wc).b(cwf.qP).b(cwf.uo).b("has_wither_skeleton_skull", this.a((dfa)cwf.uo)).a(this.b);
      this.b(ou.i, cwf.wa).b(cwf.qP).b(dig.cb).b("has_oxeye_daisy", this.a(dig.cb)).a(this.b);
      this.b(ou.i, cwf.wd).b(cwf.qP).b(cwf.qc).b("has_enchanted_golden_apple", this.a((dfa)cwf.qc)).a(this.b);
      this.a(ou.b, dig.nS, 6).a('~', cwf.pt).a('I', dig.mZ).b("I~I").b("I I").b("I I").b("has_bamboo", this.a(dig.mZ)).a(this.b);
      this.a(ou.b, dig.nZ).a('I', cwf.pr).a('-', dig.jD).a('#', axj.b).b("I-I").b("# #").b("has_stone_slab", this.a(dig.jD)).a(this.b);
      this.a(ou.b, dig.nW).a('#', dig.jR).a('X', dig.cD).a('I', cwf.oG).b("III").b("IXI").b("###").b("has_smooth_stone", this.a(dig.jR)).a(this.b);
      this.a(ou.b, dig.nV).a('#', axj.r).a('X', dig.cD).b(" # ").b("#X#").b(" # ").b("has_furnace", this.a(dig.cD)).a(this.b);
      this.a(ou.b, dig.nX).a('#', axj.b).a('@', cwf.qP).b("@@").b("##").b("##").b("has_paper", this.a((dfa)cwf.qP)).a(this.b);
      this.a(ou.b, dig.ob).a('#', axj.b).a('@', cwf.oG).b("@@").b("##").b("##").b("has_iron_ingot", this.a((dfa)cwf.oG)).a(this.b);
      this.a(ou.b, dig.nY).a('#', axj.b).a('@', cwf.pX).b("@@").b("##").b("##").b("has_flint", this.a((dfa)cwf.pX)).a(this.b);
      this.a(ou.b, dig.oc).a('I', cwf.oG).a('#', dig.b).b(" I ").b("###").b("has_stone", this.a(dig.b)).a(this.b);
      this.a(ou.b, dig.pq).a('S', cwf.fF).a('#', cwf.oL).b("SSS").b("S#S").b("SSS").b("has_netherite_ingot", this.a((dfa)cwf.oL)).a(this.b);
      this.b(ou.i, cwf.oL, ou.a, cwf.aO, "netherite_ingot_from_netherite_block", "netherite_ingot");
      this.b(ou.i, cwf.oL).a(cwf.oM, 4).a(cwf.oK, 4).b("netherite_ingot").b("has_netherite_scrap", this.a((dfa)cwf.oM)).a(this.b);
      this.a(ou.b, dig.pl).a('O', dig.pk).a('G', dig.ec).b("OOO").b("GGG").b("OOO").b("has_obsidian", this.a(dig.pk)).a(this.b);
      this.a(ou.b, dig.eX)
         .a('I', cwf.oG)
         .a('N', cwf.vx)
         .b("N")
         .b("I")
         .b("N")
         .b("has_iron_nugget", this.a((dfa)cwf.vx))
         .b("has_iron_ingot", this.a((dfa)cwf.oG))
         .a(this.b);
      this.a(ou.a, dig.qO, 2).a('G', dig.aQ).a('S', cwf.oE).b(" S ").b("SGS").b(" S ").b("has_amethyst_shard", this.a((dfa)cwf.oE)).a(this.b);
      this.a(ou.a, dig.qt, cwf.oE);
      this.a(ou.e, cwf.qU).a('C', cwf.qT).a('S', cwf.xw).b("SSS").b("SCS").b("SSS").b("has_echo_shard", this.a((dfa)cwf.xw)).a(this.b);
      this.a(ou.c, cwf.ma).a('#', cwf.oE).a('X', cwf.lZ).b(" # ").b("#X#").b("has_amethyst_shard", this.a((dfa)cwf.oE)).a(this.b);
      this.b(ou.i, cwf.vQ, cwf.vT);
      pd.a(czx::new).a(this.b, "armor_dye");
      pd.a(czy::new).a(this.b, "banner_duplicate");
      pd.a(daa::new).a(this.b, "book_cloning");
      pd.a(dai::new).a(this.b, "firework_rocket");
      pd.a(dak::new).a(this.b, "firework_star");
      pd.a(daj::new).a(this.b, "firework_star_fade");
      pd.a(dam::new).a(this.b, "map_cloning");
      pd.a(dan::new).a(this.b, "map_extending");
      pd.a(daw::new).a(this.b, "repair_item");
      pd.a(dba::new).a(this.b, "shield_decoration");
      pd.a(dbb::new).a(this.b, "shulker_box_coloring");
      pd.a(dbn::new).a(this.b, "tipped_arrow");
      oz.c(dal.a(cwf.ui), ou.g, cwf.uj, 0.35F, 200).b("has_potato", this.a((dfa)cwf.ui)).a(this.b);
      oz.c(dal.a(cwf.qN), ou.i, cwf.qM, 0.3F, 200).b("has_clay_ball", this.a((dfa)cwf.qN)).a(this.b);
      oz.c(this.b(axj.q), ou.i, cwf.oz, 0.15F, 200).b("has_log", this.a(axj.q)).a(this.b);
      oz.c(dal.a(cwf.vi), ou.i, cwf.vj, 0.1F, 200).b("has_chorus_fruit", this.a((dfa)cwf.vi)).a(this.b);
      oz.c(dal.a(cwf.sb), ou.g, cwf.sc, 0.35F, 200).b("has_beef", this.a((dfa)cwf.sb)).a(this.b);
      oz.c(dal.a(cwf.sd), ou.g, cwf.se, 0.35F, 200).b("has_chicken", this.a((dfa)cwf.sd)).a(this.b);
      oz.c(dal.a(cwf.ra), ou.g, cwf.re, 0.35F, 200).b("has_cod", this.a((dfa)cwf.ra)).a(this.b);
      oz.c(dal.a(dig.mc), ou.g, cwf.rY, 0.1F, 200).b("has_kelp", this.a(dig.mc)).a(this.b, e(cwf.rY));
      oz.c(dal.a(cwf.rb), ou.g, cwf.rf, 0.35F, 200).b("has_salmon", this.a((dfa)cwf.rb)).a(this.b);
      oz.c(dal.a(cwf.uP), ou.g, cwf.uQ, 0.35F, 200).b("has_mutton", this.a((dfa)cwf.uP)).a(this.b);
      oz.c(dal.a(cwf.pY), ou.g, cwf.pZ, 0.35F, 200).b("has_porkchop", this.a((dfa)cwf.pY)).a(this.b);
      oz.c(dal.a(cwf.uC), ou.g, cwf.uD, 0.35F, 200).b("has_rabbit", this.a((dfa)cwf.uC)).a(this.b);
      this.a(c, ou.i, cwf.oy, 0.1F, 200, "coal");
      this.a(d, ou.i, cwf.oG, 0.7F, 200, "iron_ingot");
      this.a(e, ou.i, cwf.oI, 0.7F, 200, "copper_ingot");
      this.a(f, ou.i, cwf.oK, 1.0F, 200, "gold_ingot");
      this.a(g, ou.i, cwf.oA, 1.0F, 200, "diamond");
      this.a(h, ou.i, cwf.oC, 0.2F, 200, "lapis_lazuli");
      this.a(i, ou.c, cwf.lH, 0.7F, 200, "redstone");
      this.a(j, ou.i, cwf.oB, 1.0F, 200, "emerald");
      this.a(ou.i, cwf.oF, ou.a, cwf.aE);
      this.a(ou.i, cwf.oH, ou.a, cwf.aF);
      this.a(ou.i, cwf.oJ, ou.a, cwf.aG);
      oz.c(this.b(axj.G), ou.a, dig.aQ.j(), 0.1F, 200).b("has_smelts_to_glass", this.a(axj.G)).a(this.b);
      oz.c(dal.a(dig.mV), ou.i, cwf.ro, 0.1F, 200).b("has_sea_pickle", this.a(dig.mV)).a(this.b, e(cwf.ro));
      oz.c(dal.a(dig.dQ.j()), ou.i, cwf.rw, 1.0F, 200).b("has_cactus", this.a(dig.dQ)).a(this.b);
      oz.c(dal.a(cwf.oZ, cwf.oY, cwf.pa, cwf.pb, cwf.oX, cwf.pP, cwf.pQ, cwf.pR, cwf.pS, cwf.uJ), ou.i, cwf.sj, 0.1F, 200)
         .b("has_golden_pickaxe", this.a((dfa)cwf.oZ))
         .b("has_golden_shovel", this.a((dfa)cwf.oY))
         .b("has_golden_axe", this.a((dfa)cwf.pa))
         .b("has_golden_hoe", this.a((dfa)cwf.pb))
         .b("has_golden_sword", this.a((dfa)cwf.oX))
         .b("has_golden_helmet", this.a((dfa)cwf.pP))
         .b("has_golden_chestplate", this.a((dfa)cwf.pQ))
         .b("has_golden_leggings", this.a((dfa)cwf.pR))
         .b("has_golden_boots", this.a((dfa)cwf.pS))
         .b("has_golden_horse_armor", this.a((dfa)cwf.uJ))
         .a(this.b, e(cwf.sj));
      oz.c(dal.a(cwf.pe, cwf.pd, cwf.pf, cwf.pg, cwf.pc, cwf.pH, cwf.pI, cwf.pJ, cwf.pK, cwf.uI, cwf.pD, cwf.pE, cwf.pF, cwf.pG), ou.i, cwf.vx, 0.1F, 200)
         .b("has_iron_pickaxe", this.a((dfa)cwf.pe))
         .b("has_iron_shovel", this.a((dfa)cwf.pd))
         .b("has_iron_axe", this.a((dfa)cwf.pf))
         .b("has_iron_hoe", this.a((dfa)cwf.pg))
         .b("has_iron_sword", this.a((dfa)cwf.pc))
         .b("has_iron_helmet", this.a((dfa)cwf.pH))
         .b("has_iron_chestplate", this.a((dfa)cwf.pI))
         .b("has_iron_leggings", this.a((dfa)cwf.pJ))
         .b("has_iron_boots", this.a((dfa)cwf.pK))
         .b("has_iron_horse_armor", this.a((dfa)cwf.uI))
         .b("has_chainmail_helmet", this.a((dfa)cwf.pD))
         .b("has_chainmail_chestplate", this.a((dfa)cwf.pE))
         .b("has_chainmail_leggings", this.a((dfa)cwf.pF))
         .b("has_chainmail_boots", this.a((dfa)cwf.pG))
         .a(this.b, e(cwf.vx));
      oz.c(dal.a(dig.dR), ou.a, dig.iA.j(), 0.35F, 200).b("has_clay_block", this.a(dig.dR)).a(this.b);
      oz.c(dal.a(dig.dV), ou.i, cwf.uz, 0.1F, 200).b("has_netherrack", this.a(dig.dV)).a(this.b);
      oz.c(dal.a(dig.hb), ou.i, cwf.oD, 0.2F, 200).b("has_nether_quartz_ore", this.a(dig.hb)).a(this.b);
      oz.c(dal.a(dig.aP), ou.a, dig.aO.j(), 0.15F, 200).b("has_wet_sponge", this.a(dig.aP)).a(this.b);
      oz.c(dal.a(dig.m), ou.a, dig.b.j(), 0.1F, 200).b("has_cobblestone", this.a(dig.m)).a(this.b);
      oz.c(dal.a(dig.b), ou.a, dig.jR.j(), 0.1F, 200).b("has_stone", this.a(dig.b)).a(this.b);
      oz.c(dal.a(dig.aV), ou.a, dig.jS.j(), 0.1F, 200).b("has_sandstone", this.a(dig.aV)).a(this.b);
      oz.c(dal.a(dig.jp), ou.a, dig.jU.j(), 0.1F, 200).b("has_red_sandstone", this.a(dig.jp)).a(this.b);
      oz.c(dal.a(dig.hd), ou.a, dig.jT.j(), 0.1F, 200).b("has_quartz_block", this.a(dig.hd)).a(this.b);
      oz.c(dal.a(dig.eH), ou.a, dig.eJ.j(), 0.1F, 200).b("has_stone_bricks", this.a(dig.eH)).a(this.b);
      oz.c(dal.a(dig.hy), ou.b, dig.lv.j(), 0.1F, 200).b("has_black_terracotta", this.a(dig.hy)).a(this.b);
      oz.c(dal.a(dig.hu), ou.b, dig.lr.j(), 0.1F, 200).b("has_blue_terracotta", this.a(dig.hu)).a(this.b);
      oz.c(dal.a(dig.hv), ou.b, dig.ls.j(), 0.1F, 200).b("has_brown_terracotta", this.a(dig.hv)).a(this.b);
      oz.c(dal.a(dig.hs), ou.b, dig.lp.j(), 0.1F, 200).b("has_cyan_terracotta", this.a(dig.hs)).a(this.b);
      oz.c(dal.a(dig.hq), ou.b, dig.ln.j(), 0.1F, 200).b("has_gray_terracotta", this.a(dig.hq)).a(this.b);
      oz.c(dal.a(dig.hw), ou.b, dig.lt.j(), 0.1F, 200).b("has_green_terracotta", this.a(dig.hw)).a(this.b);
      oz.c(dal.a(dig.hm), ou.b, dig.lj.j(), 0.1F, 200).b("has_light_blue_terracotta", this.a(dig.hm)).a(this.b);
      oz.c(dal.a(dig.hr), ou.b, dig.lo.j(), 0.1F, 200).b("has_light_gray_terracotta", this.a(dig.hr)).a(this.b);
      oz.c(dal.a(dig.ho), ou.b, dig.ll.j(), 0.1F, 200).b("has_lime_terracotta", this.a(dig.ho)).a(this.b);
      oz.c(dal.a(dig.hl), ou.b, dig.li.j(), 0.1F, 200).b("has_magenta_terracotta", this.a(dig.hl)).a(this.b);
      oz.c(dal.a(dig.hk), ou.b, dig.lh.j(), 0.1F, 200).b("has_orange_terracotta", this.a(dig.hk)).a(this.b);
      oz.c(dal.a(dig.hp), ou.b, dig.lm.j(), 0.1F, 200).b("has_pink_terracotta", this.a(dig.hp)).a(this.b);
      oz.c(dal.a(dig.ht), ou.b, dig.lq.j(), 0.1F, 200).b("has_purple_terracotta", this.a(dig.ht)).a(this.b);
      oz.c(dal.a(dig.hx), ou.b, dig.lu.j(), 0.1F, 200).b("has_red_terracotta", this.a(dig.hx)).a(this.b);
      oz.c(dal.a(dig.hj), ou.b, dig.lg.j(), 0.1F, 200).b("has_white_terracotta", this.a(dig.hj)).a(this.b);
      oz.c(dal.a(dig.hn), ou.b, dig.lk.j(), 0.1F, 200).b("has_yellow_terracotta", this.a(dig.hn)).a(this.b);
      oz.c(dal.a(dig.pj), ou.i, cwf.oM, 2.0F, 200).b("has_ancient_debris", this.a(dig.pj)).a(this.b);
      oz.c(dal.a(dig.dY), ou.a, dig.te, 0.1F, 200).b("has_basalt", this.a(dig.dY)).a(this.b);
      oz.c(dal.a(dig.sK), ou.a, dig.sJ, 0.1F, 200).b("has_cobbled_deepslate", this.a(dig.sK)).a(this.b);
      this.b(c, ou.i, cwf.oy, 0.1F, 100, "coal");
      this.b(d, ou.i, cwf.oG, 0.7F, 100, "iron_ingot");
      this.b(e, ou.i, cwf.oI, 0.7F, 100, "copper_ingot");
      this.b(f, ou.i, cwf.oK, 1.0F, 100, "gold_ingot");
      this.b(g, ou.i, cwf.oA, 1.0F, 100, "diamond");
      this.b(h, ou.i, cwf.oC, 0.2F, 100, "lapis_lazuli");
      this.b(i, ou.c, cwf.lH, 0.7F, 100, "redstone");
      this.b(j, ou.i, cwf.oB, 1.0F, 100, "emerald");
      oz.b(dal.a(dig.hb), ou.i, cwf.oD, 0.2F, 100).b("has_nether_quartz_ore", this.a(dig.hb)).a(this.b, f(cwf.oD));
      oz.b(dal.a(cwf.oZ, cwf.oY, cwf.pa, cwf.pb, cwf.oX, cwf.pP, cwf.pQ, cwf.pR, cwf.pS, cwf.uJ), ou.i, cwf.sj, 0.1F, 100)
         .b("has_golden_pickaxe", this.a((dfa)cwf.oZ))
         .b("has_golden_shovel", this.a((dfa)cwf.oY))
         .b("has_golden_axe", this.a((dfa)cwf.pa))
         .b("has_golden_hoe", this.a((dfa)cwf.pb))
         .b("has_golden_sword", this.a((dfa)cwf.oX))
         .b("has_golden_helmet", this.a((dfa)cwf.pP))
         .b("has_golden_chestplate", this.a((dfa)cwf.pQ))
         .b("has_golden_leggings", this.a((dfa)cwf.pR))
         .b("has_golden_boots", this.a((dfa)cwf.pS))
         .b("has_golden_horse_armor", this.a((dfa)cwf.uJ))
         .a(this.b, f(cwf.sj));
      oz.b(dal.a(cwf.pe, cwf.pd, cwf.pf, cwf.pg, cwf.pc, cwf.pH, cwf.pI, cwf.pJ, cwf.pK, cwf.uI, cwf.pD, cwf.pE, cwf.pF, cwf.pG), ou.i, cwf.vx, 0.1F, 100)
         .b("has_iron_pickaxe", this.a((dfa)cwf.pe))
         .b("has_iron_shovel", this.a((dfa)cwf.pd))
         .b("has_iron_axe", this.a((dfa)cwf.pf))
         .b("has_iron_hoe", this.a((dfa)cwf.pg))
         .b("has_iron_sword", this.a((dfa)cwf.pc))
         .b("has_iron_helmet", this.a((dfa)cwf.pH))
         .b("has_iron_chestplate", this.a((dfa)cwf.pI))
         .b("has_iron_leggings", this.a((dfa)cwf.pJ))
         .b("has_iron_boots", this.a((dfa)cwf.pK))
         .b("has_iron_horse_armor", this.a((dfa)cwf.uI))
         .b("has_chainmail_helmet", this.a((dfa)cwf.pD))
         .b("has_chainmail_chestplate", this.a((dfa)cwf.pE))
         .b("has_chainmail_leggings", this.a((dfa)cwf.pF))
         .b("has_chainmail_boots", this.a((dfa)cwf.pG))
         .a(this.b, f(cwf.vx));
      oz.b(dal.a(dig.pj), ou.i, cwf.oM, 2.0F, 100).b("has_ancient_debris", this.a(dig.pj)).a(this.b, f(cwf.oM));
      this.a("smoking", dau.q, dbl::new, 100);
      this.a("campfire_cooking", dau.r, dab::new, 600);
      this.a(ou.a, dig.jD, dig.b, 2);
      this.i(ou.a, dig.nk, dig.b);
      this.i(ou.a, dig.eH, dig.b);
      this.a(ou.a, dig.jK, dig.b, 2);
      this.i(ou.a, dig.fj, dig.b);
      pa.a(dal.a(dig.b), ou.a, dig.eK).b("has_stone", this.a(dig.b)).a(this.b, "chiseled_stone_bricks_stone_from_stonecutting");
      pa.a(dal.a(dig.b), ou.b, dig.nK).b("has_stone", this.a(dig.b)).a(this.b, "stone_brick_walls_from_stone_stonecutting");
      this.i(ou.a, dig.aX, dig.aV);
      this.a(ou.a, dig.jF, dig.aV, 2);
      this.a(ou.a, dig.jG, dig.aV, 2);
      this.a(ou.a, dig.jG, dig.aX, 2);
      this.i(ou.a, dig.fD, dig.aV);
      this.i(ou.b, dig.nP, dig.aV);
      this.i(ou.a, dig.aW, dig.aV);
      this.i(ou.a, dig.jr, dig.jp);
      this.a(ou.a, dig.jO, dig.jp, 2);
      this.a(ou.a, dig.jP, dig.jp, 2);
      this.a(ou.a, dig.jP, dig.jr, 2);
      this.i(ou.a, dig.js, dig.jp);
      this.i(ou.b, dig.nH, dig.jp);
      this.i(ou.a, dig.jq, dig.jp);
      pa.a(dal.a(dig.hd), ou.a, dig.jN, 2).b("has_quartz_block", this.a(dig.hd)).a(this.b, "quartz_slab_from_stonecutting");
      this.i(ou.a, dig.hg, dig.hd);
      this.i(ou.a, dig.hf, dig.hd);
      this.i(ou.a, dig.he, dig.hd);
      this.i(ou.a, dig.pK, dig.hd);
      this.i(ou.a, dig.cQ, dig.m);
      this.a(ou.a, dig.jI, dig.m, 2);
      this.i(ou.b, dig.fP, dig.m);
      this.a(ou.a, dig.jK, dig.eH, 2);
      this.i(ou.a, dig.fj, dig.eH);
      pa.a(dal.a(dig.eH), ou.b, dig.nK).b("has_stone_bricks", this.a(dig.eH)).a(this.b, "stone_brick_wall_from_stone_bricks_stonecutting");
      this.i(ou.a, dig.eK, dig.eH);
      this.a(ou.a, dig.jJ, dig.cj, 2);
      this.i(ou.a, dig.fi, dig.cj);
      this.i(ou.b, dig.nF, dig.cj);
      this.a(ou.a, dig.jL, dig.eM, 2);
      this.i(ou.a, dig.fk, dig.eM);
      this.i(ou.b, dig.nL, dig.eM);
      this.a(ou.a, dig.jM, dig.fn, 2);
      this.i(ou.a, dig.fp, dig.fn);
      this.i(ou.b, dig.nM, dig.fn);
      this.i(ou.a, dig.pI, dig.fn);
      this.a(ou.a, dig.nC, dig.kL, 2);
      this.i(ou.a, dig.np, dig.kL);
      this.i(ou.b, dig.nO, dig.kL);
      this.a(ou.a, dig.jQ, dig.kw, 2);
      this.i(ou.a, dig.ky, dig.kw);
      this.i(ou.a, dig.kx, dig.kw);
      this.a(ou.a, dig.if, dig.hZ, 2);
      this.i(ou.a, dig.ic, dig.hZ);
      this.i(ou.b, dig.nG, dig.hZ);
      pa.a(dal.a(dig.ia), ou.a, dig.ig, 2).b("has_prismarine_brick", this.a(dig.ia)).a(this.b, "prismarine_brick_slab_from_prismarine_stonecutting");
      pa.a(dal.a(dig.ia), ou.a, dig.id).b("has_prismarine_brick", this.a(dig.ia)).a(this.b, "prismarine_brick_stairs_from_prismarine_stonecutting");
      this.a(ou.a, dig.ih, dig.ib, 2);
      this.i(ou.a, dig.ie, dig.ib);
      this.a(ou.a, dig.nB, dig.g, 2);
      this.i(ou.a, dig.no, dig.g);
      this.i(ou.b, dig.nN, dig.g);
      this.i(ou.a, dig.h, dig.g);
      this.a(ou.a, dig.nD, dig.g, 2);
      this.i(ou.a, dig.nq, dig.g);
      this.a(ou.a, dig.nD, dig.h, 2);
      this.i(ou.a, dig.nq, dig.h);
      this.i(ou.a, dig.dZ, dig.dY);
      this.a(ou.a, dig.nA, dig.c, 2);
      this.i(ou.a, dig.nn, dig.c);
      this.i(ou.b, dig.nJ, dig.c);
      this.i(ou.a, dig.d, dig.c);
      this.a(ou.a, dig.ns, dig.c, 2);
      this.i(ou.a, dig.ne, dig.c);
      this.a(ou.a, dig.ns, dig.d, 2);
      this.i(ou.a, dig.ne, dig.d);
      this.a(ou.a, dig.nE, dig.e, 2);
      this.i(ou.a, dig.nr, dig.e);
      this.i(ou.b, dig.nR, dig.e);
      this.i(ou.a, dig.f, dig.e);
      this.a(ou.a, dig.nv, dig.e, 2);
      this.i(ou.a, dig.nh, dig.e);
      this.a(ou.a, dig.nv, dig.f, 2);
      this.i(ou.a, dig.nh, dig.f);
      pa.a(dal.a(dig.eI), ou.a, dig.nu, 2).b("has_mossy_stone_bricks", this.a(dig.eI)).a(this.b, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      pa.a(dal.a(dig.eI), ou.a, dig.ng).b("has_mossy_stone_bricks", this.a(dig.eI)).a(this.b, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      pa.a(dal.a(dig.eI), ou.b, dig.nI).b("has_mossy_stone_bricks", this.a(dig.eI)).a(this.b, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      this.a(ou.a, dig.nw, dig.cn, 2);
      this.i(ou.a, dig.ni, dig.cn);
      this.i(ou.b, dig.fQ, dig.cn);
      this.a(ou.a, dig.ny, dig.jS, 2);
      this.i(ou.a, dig.nl, dig.jS);
      this.a(ou.a, dig.nt, dig.jU, 2);
      this.i(ou.a, dig.nf, dig.jU);
      this.a(ou.a, dig.nz, dig.jT, 2);
      this.i(ou.a, dig.nm, dig.jT);
      pa.a(dal.a(dig.kz), ou.a, dig.nx, 2).b("has_end_stone_brick", this.a(dig.kz)).a(this.b, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      pa.a(dal.a(dig.kz), ou.a, dig.nj).b("has_end_stone_brick", this.a(dig.kz)).a(this.b, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      pa.a(dal.a(dig.kz), ou.b, dig.nQ).b("has_end_stone_brick", this.a(dig.kz)).a(this.b, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      this.i(ou.a, dig.kz, dig.fz);
      this.a(ou.a, dig.nx, dig.fz, 2);
      this.i(ou.a, dig.nj, dig.fz);
      this.i(ou.b, dig.nQ, dig.fz);
      this.a(ou.a, dig.jE, dig.jR, 2);
      this.a(ou.a, dig.pu, dig.pr, 2);
      this.i(ou.a, dig.ps, dig.pr);
      this.i(ou.b, dig.pt, dig.pr);
      this.i(ou.a, dig.pv, dig.pr);
      this.i(ou.b, dig.pH, dig.pr);
      this.a(ou.a, dig.pE, dig.pr, 2);
      this.i(ou.a, dig.pD, dig.pr);
      this.i(ou.a, dig.py, dig.pr);
      this.i(ou.a, dig.pw, dig.pr);
      this.a(ou.a, dig.pz, dig.pr, 2);
      this.i(ou.a, dig.pA, dig.pr);
      this.i(ou.b, dig.pB, dig.pr);
      this.a(ou.a, dig.pE, dig.pv, 2);
      this.i(ou.a, dig.pD, dig.pv);
      this.i(ou.a, dig.pw, dig.pv);
      this.i(ou.b, dig.pH, dig.pv);
      this.a(ou.a, dig.pz, dig.pv, 2);
      this.i(ou.a, dig.pA, dig.pv);
      this.i(ou.b, dig.pB, dig.pv);
      this.i(ou.a, dig.py, dig.pv);
      this.a(ou.a, dig.pz, dig.pw, 2);
      this.i(ou.a, dig.pA, dig.pw);
      this.i(ou.b, dig.pB, dig.pw);
      this.a(ou.a, dig.rv, dig.rf, 2);
      this.i(ou.a, dig.rr, dig.rf);
      this.a(ou.a, dig.ru, dig.re, 2);
      this.i(ou.a, dig.rq, dig.re);
      this.a(ou.a, dig.rt, dig.rd, 2);
      this.i(ou.a, dig.rp, dig.rd);
      this.a(ou.a, dig.rs, dig.rc, 2);
      this.i(ou.a, dig.ro, dig.rc);
      this.a(ou.a, dig.rL, dig.rD, 2);
      this.i(ou.a, dig.rH, dig.rD);
      this.a(ou.a, dig.rK, dig.rC, 2);
      this.i(ou.a, dig.rG, dig.rC);
      this.a(ou.a, dig.rJ, dig.rB, 2);
      this.i(ou.a, dig.rF, dig.rB);
      this.a(ou.a, dig.rI, dig.rA, 2);
      this.i(ou.a, dig.rE, dig.rA);
      this.a(ou.a, dig.rf, dig.qW, 4);
      this.a(ou.a, dig.rr, dig.qW, 4);
      this.a(ou.a, dig.rv, dig.qW, 8);
      this.a(ou.a, dig.re, dig.qX, 4);
      this.a(ou.a, dig.rq, dig.qX, 4);
      this.a(ou.a, dig.ru, dig.qX, 8);
      this.a(ou.a, dig.rd, dig.qY, 4);
      this.a(ou.a, dig.rp, dig.qY, 4);
      this.a(ou.a, dig.rt, dig.qY, 8);
      this.a(ou.a, dig.rc, dig.qZ, 4);
      this.a(ou.a, dig.ro, dig.qZ, 4);
      this.a(ou.a, dig.rs, dig.qZ, 8);
      this.a(ou.a, dig.rD, dig.rw, 4);
      this.a(ou.a, dig.rH, dig.rw, 4);
      this.a(ou.a, dig.rL, dig.rw, 8);
      this.a(ou.a, dig.rC, dig.ry, 4);
      this.a(ou.a, dig.rG, dig.ry, 4);
      this.a(ou.a, dig.rK, dig.ry, 8);
      this.a(ou.a, dig.rB, dig.rx, 4);
      this.a(ou.a, dig.rF, dig.rx, 4);
      this.a(ou.a, dig.rJ, dig.rx, 8);
      this.a(ou.a, dig.rA, dig.rz, 4);
      this.a(ou.a, dig.rE, dig.rz, 4);
      this.a(ou.a, dig.rI, dig.rz, 8);
      this.a(ou.a, dig.sM, dig.sK, 2);
      this.i(ou.a, dig.sL, dig.sK);
      this.i(ou.b, dig.sN, dig.sK);
      this.i(ou.a, dig.ta, dig.sK);
      this.i(ou.a, dig.sO, dig.sK);
      this.a(ou.a, dig.sQ, dig.sK, 2);
      this.i(ou.a, dig.sP, dig.sK);
      this.i(ou.b, dig.sR, dig.sK);
      this.i(ou.a, dig.sW, dig.sK);
      this.a(ou.a, dig.sY, dig.sK, 2);
      this.i(ou.a, dig.sX, dig.sK);
      this.i(ou.b, dig.sZ, dig.sK);
      this.i(ou.a, dig.sS, dig.sK);
      this.a(ou.a, dig.sU, dig.sK, 2);
      this.i(ou.a, dig.sT, dig.sK);
      this.i(ou.b, dig.sV, dig.sK);
      this.a(ou.a, dig.sQ, dig.sO, 2);
      this.i(ou.a, dig.sP, dig.sO);
      this.i(ou.b, dig.sR, dig.sO);
      this.i(ou.a, dig.sW, dig.sO);
      this.a(ou.a, dig.sY, dig.sO, 2);
      this.i(ou.a, dig.sX, dig.sO);
      this.i(ou.b, dig.sZ, dig.sO);
      this.i(ou.a, dig.sS, dig.sO);
      this.a(ou.a, dig.sU, dig.sO, 2);
      this.i(ou.a, dig.sT, dig.sO);
      this.i(ou.b, dig.sV, dig.sO);
      this.a(ou.a, dig.sY, dig.sW, 2);
      this.i(ou.a, dig.sX, dig.sW);
      this.i(ou.b, dig.sZ, dig.sW);
      this.i(ou.a, dig.sS, dig.sW);
      this.a(ou.a, dig.sU, dig.sW, 2);
      this.i(ou.a, dig.sT, dig.sW);
      this.i(ou.b, dig.sV, dig.sW);
      this.a(ou.a, dig.sU, dig.sS, 2);
      this.i(ou.a, dig.sT, dig.sS);
      this.i(ou.b, dig.sV, dig.sS);
      b().forEach($$0x -> this.a($$0x.a(), $$0x.b()));
      this.a(cwf.pM, ou.f, cwf.pU);
      this.a(cwf.pN, ou.f, cwf.pV);
      this.a(cwf.pL, ou.f, cwf.pT);
      this.a(cwf.pO, ou.f, cwf.pW);
      this.a(cwf.ph, ou.f, cwf.pm);
      this.a(cwf.pk, ou.e, cwf.pp);
      this.a(cwf.pj, ou.e, cwf.po);
      this.a(cwf.pl, ou.e, cwf.pq);
      this.a(cwf.pi, ou.e, cwf.pn);
      this.o(cwf.xy, cwf.fn);
      this.o(cwf.xz, cwf.J);
      this.o(cwf.xA, cwf.cJ);
      this.o(cwf.xB, cwf.J);
      this.o(cwf.xC, cwf.eD);
      this.o(cwf.xD, cwf.j);
      this.o(cwf.xE, cwf.gn);
      this.o(cwf.xF, cwf.J);
      this.o(cwf.xG, cwf.iJ);
      this.o(cwf.xH, cwf.wJ);
      this.o(cwf.xI, cwf.fn);
      this.o(cwf.xJ, cwf.eJ);
      this.o(cwf.xM, cwf.j);
      this.o(cwf.xK, cwf.hU);
      this.o(cwf.xL, cwf.hU);
      this.o(cwf.xN, cwf.hU);
      this.o(cwf.xO, cwf.hU);
      this.o(cwf.xP, cwf.uc);
      this.d(cwf.xQ, dal.a(cwf.aL, cwf.bi));
      this.b(ou.a, dig.ae, cwf.dR);
      this.b(dig.v, axj.C, 2);
      this.h(ou.b, dig.w, dig.jB);
      this.b(cwf.ol, dig.v);
      this.c(cwf.om, cwf.ol);
      this.e(cwf.qo, dig.al);
      this.e(cwf.qp, dig.af);
      this.e(cwf.qq, dig.ag);
      this.e(cwf.qr, dig.ah);
      this.e(cwf.qs, dig.ai);
      this.e(cwf.qt, dig.aj);
      this.e(cwf.qu, dig.ak);
      this.e(cwf.qv, dig.am);
      this.e(cwf.qw, cwf.cj);
      this.e(cwf.qx, dig.ot);
      this.e(cwf.qy, dig.ok);
      this.a(ou.a, dig.cm).a('#', axj.b).a('X', axj.j).b("###").b("XXX").b("###").b("has_book", this.a((dfa)cwf.qQ)).a(this.b);
      this.a(cwf.rk, dig.bS, "orange_dye");
      this.a(cwf.rs, dig.kC, "cyan_dye", 2);
      this.a(dig.s, axj.w, 4);
      this.a((dfa)dig.at, (dfa)dig.Z);
      this.a((dfa)dig.aB, (dfa)dig.aj);
      this.b(cwf.of, dig.s);
      this.c(cwf.og, cwf.of);
      this.a(cwf.rp, cwf.dM, "pink_dye", 1);
      this.a(ou.e, cwf.xx).a('X', cwf.pu).a('#', cwf.oI).a('I', cwf.pr).b("X").b("#").b("I").b("has_copper_ingot", this.a((dfa)cwf.oI)).a(this.b);
      this.a(ou.b, cwf.eC).a('#', cwf.qM).b(" # ").b("# #").b(" # ").b("has_brick", this.a(axj.bG)).a(this.b, "decorated_pot_simple");
      pd.a(dah::new).a(this.b, "decorated_pot");
      this.a(ou.c, dig.tq)
         .a('#', cwf.oG)
         .a('C', cwf.eO)
         .a('R', cwf.lH)
         .a('D', cwf.lT)
         .b("###")
         .b("#C#")
         .b("RDR")
         .b("has_dropper", this.a((dfa)cwf.lT))
         .a(this.b);
      this.a(ou.a, dig.qA, dig.qz, 2);
      this.i(ou.a, dig.qB, dig.qz);
      this.i(ou.b, dig.qC, dig.qz);
      this.i(ou.a, dig.qH, dig.qz);
      this.i(ou.a, dig.qD, dig.qz);
      this.a(ou.a, dig.qE, dig.qz, 2);
      this.i(ou.a, dig.qF, dig.qz);
      this.i(ou.b, dig.qG, dig.qz);
      this.i(ou.a, dig.qI, dig.qz);
      this.a(ou.a, dig.qJ, dig.qz, 2);
      this.i(ou.a, dig.qK, dig.qz);
      this.i(ou.b, dig.qL, dig.qz);
      this.i(ou.a, dig.qM, dig.qz);
      this.a(ou.a, dig.qE, dig.qD, 2);
      this.i(ou.a, dig.qF, dig.qD);
      this.i(ou.b, dig.qG, dig.qD);
      this.i(ou.a, dig.qI, dig.qD);
      this.a(ou.a, dig.qJ, dig.qD, 2);
      this.i(ou.a, dig.qK, dig.qD);
      this.i(ou.b, dig.qL, dig.qD);
      this.i(ou.a, dig.qM, dig.qD);
      this.a(ou.a, dig.qJ, dig.qI, 2);
      this.i(ou.a, dig.qK, dig.qI);
      this.i(ou.b, dig.qL, dig.qI);
      this.i(ou.a, dig.qM, dig.qI);
      this.a(ou.a, dig.rj, dig.qW, 4);
      this.a(ou.a, dig.ri, dig.qX, 4);
      this.a(ou.a, dig.rh, dig.qY, 4);
      this.a(ou.a, dig.rg, dig.qZ, 4);
      this.a(ou.a, dig.rn, dig.rw, 4);
      this.a(ou.a, dig.rm, dig.ry, 4);
      this.a(ou.a, dig.rl, dig.rx, 4);
      this.a(ou.a, dig.rk, dig.rz, 4);
      this.a(ou.a, dig.rj, dig.rf, 1);
      this.a(ou.a, dig.ri, dig.re, 1);
      this.a(ou.a, dig.rh, dig.rd, 1);
      this.a(ou.a, dig.rg, dig.rc, 1);
      this.a(ou.a, dig.rn, dig.rD, 1);
      this.a(ou.a, dig.rm, dig.rC, 1);
      this.a(ou.a, dig.rl, dig.rB, 1);
      this.a(ou.a, dig.rk, dig.rA, 1);
      this.a(dig.sc, dig.qW);
      this.a(dig.sd, dig.qX);
      this.a(dig.se, dig.qY);
      this.a(dig.sf, dig.qZ);
      this.a(dig.sg, dig.rw);
      this.a(dig.sh, dig.ry);
      this.a(dig.si, dig.rx);
      this.a(dig.sj, dig.rz);
      this.b(dig.sk, dig.qW);
      this.b(dig.sl, dig.qX);
      this.b(dig.sm, dig.qY);
      this.b(dig.sn, dig.qZ);
      this.b(dig.so, dig.rw);
      this.b(dig.sp, dig.ry);
      this.b(dig.sq, dig.rx);
      this.b(dig.sr, dig.rz);
      this.a(ou.a, dig.sc, dig.qW, 4);
      this.a(ou.a, dig.sd, dig.qX, 4);
      this.a(ou.a, dig.se, dig.qY, 4);
      this.a(ou.a, dig.sf, dig.qZ, 4);
      this.a(ou.a, dig.sg, dig.rw, 4);
      this.a(ou.a, dig.sh, dig.ry, 4);
      this.a(ou.a, dig.si, dig.rx, 4);
      this.a(ou.a, dig.sj, dig.rz, 4);
      this.b(ou.i, cwf.tZ, 4).b(cwf.uc).b("has_breeze_rod", this.a((dfa)cwf.uc)).a(this.b);
      this.a(ou.f, cwf.ud, 1)
         .a('I', cwf.uc)
         .a('#', dig.tt)
         .b(" # ")
         .b(" I ")
         .b("has_breeze_rod", this.a((dfa)cwf.uc))
         .b("has_heavy_core", this.a(dig.tt))
         .a(this.b);
      this.a(dig.rM, dal.a(cwf.oI)).a(b(cwf.oI), this.a((dfa)cwf.oI)).a(this.b);
      this.c(dig.rU, dal.a(cwf.oI)).a(b(cwf.oI), this.a((dfa)cwf.oI)).a(this.b);
   }

   public static Stream<pg.b> b() {
      return Stream.of(
            cwf.xQ, cwf.xB, cwf.xA, cwf.xE, cwf.xP, cwf.xO, cwf.xN, cwf.xI, cwf.xz, cwf.xL, cwf.xM, cwf.xH, cwf.xJ, cwf.xG, cwf.xF, cwf.xD, cwf.xK, cwf.xC
         )
         .map($$0 -> new pg.b($$0, ali.b(c($$0) + "_smithing_trim")));
   }

   public static class a extends ow.b {
      public a(mh $$0, CompletableFuture<js.a> $$1) {
         super($$0, $$1);
      }

      @Override
      protected ow a(js.a $$0, ov $$1) {
         return new pg($$0, $$1);
      }

      @Override
      public String a() {
         return "Vanilla Recipes";
      }
   }

   public static record b(cvx a, ali b) {
   }
}
