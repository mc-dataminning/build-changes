import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ls {
   private static final Map<dfa, lt> ap = Maps.newHashMap();
   private static final String aq = "wooden";
   private static final String ar = "has_planks";
   public static final lt a = a(dfc.r)
      .a(dfc.gz)
      .h(dfc.kg)
      .j(dfc.jY)
      .m(dfc.dD)
      .a(dfc.cH, dfc.cU)
      .k(dfc.jx)
      .l(dfc.hP)
      .f(dfc.ko)
      .o(dfc.eC)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt b = a(dfc.s)
      .a(dfc.gA)
      .h(dfc.kh)
      .j(dfc.jZ)
      .m(dfc.dE)
      .a(dfc.cI, dfc.cV)
      .k(dfc.jy)
      .l(dfc.hQ)
      .f(dfc.kp)
      .o(dfc.eD)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt c = a(dfc.p)
      .a(dfc.gx)
      .h(dfc.ke)
      .j(dfc.jW)
      .m(dfc.dB)
      .a(dfc.cG, dfc.cT)
      .k(dfc.jv)
      .l(dfc.fL)
      .f(dfc.km)
      .o(dfc.eA)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt d = a(dfc.oE)
      .a(dfc.oS)
      .h(dfc.oK)
      .j(dfc.oO)
      .m(dfc.oI)
      .a(dfc.oW, dfc.oY)
      .k(dfc.oG)
      .l(dfc.oQ)
      .f(dfc.oU)
      .o(dfc.oM)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt e = a(dfc.q)
      .a(dfc.gy)
      .h(dfc.kf)
      .j(dfc.jX)
      .m(dfc.dC)
      .a(dfc.cJ, dfc.cW)
      .k(dfc.jw)
      .l(dfc.fM)
      .f(dfc.kn)
      .o(dfc.eB)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt f = a(dfc.n)
      .a(dfc.gv)
      .h(dfc.dU)
      .j(dfc.fh)
      .m(dfc.dz)
      .a(dfc.cE, dfc.cR)
      .k(dfc.jt)
      .l(dfc.cu)
      .f(dfc.cN)
      .o(dfc.ey)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt g = a(dfc.t)
      .a(dfc.gB)
      .h(dfc.ki)
      .j(dfc.ka)
      .m(dfc.dF)
      .a(dfc.cK, dfc.cX)
      .k(dfc.jz)
      .l(dfc.hR)
      .f(dfc.kq)
      .o(dfc.eE)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt h = a(dfc.o)
      .a(dfc.gw)
      .h(dfc.kd)
      .j(dfc.jV)
      .m(dfc.dA)
      .a(dfc.cF, dfc.cS)
      .k(dfc.ju)
      .l(dfc.fK)
      .f(dfc.kl)
      .o(dfc.ez)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt i = a(dfc.oF)
      .a(dfc.oT)
      .h(dfc.oL)
      .j(dfc.oP)
      .m(dfc.oJ)
      .a(dfc.oX, dfc.oZ)
      .k(dfc.oH)
      .l(dfc.oR)
      .f(dfc.oV)
      .o(dfc.oN)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt j = a(dfc.u)
      .a(dfc.gC)
      .k(dfc.jA)
      .l(dfc.hS)
      .h(dfc.kj)
      .j(dfc.kb)
      .m(dfc.dG)
      .a(dfc.cL, dfc.cY)
      .f(dfc.kr)
      .o(dfc.eF)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt k = a(dfc.v)
      .a(dfc.gD)
      .k(dfc.jB)
      .l(dfc.hT)
      .g(dfc.kk)
      .i(dfc.kc)
      .m(dfc.dH)
      .a(dfc.cM, dfc.cZ)
      .f(dfc.ks)
      .o(dfc.eG)
      .c(dfc.w)
      .a("wooden")
      .b("has_planks")
      .a();
   public static final lt l = a(dfc.w).k(dfc.jC).l(dfc.hU).a();
   public static final lt m = a(dfc.eM).p(dfc.nL).l(dfc.fk).k(dfc.jL).a();
   public static final lt n = a(dfc.g).p(dfc.nN).l(dfc.no).k(dfc.nB).n(dfc.h).a();
   public static final lt o = a(dfc.h).l(dfc.nq).k(dfc.nD).a();
   public static final lt p = a(dfc.pr).p(dfc.pt).l(dfc.ps).k(dfc.pu).n(dfc.pv).a();
   public static final lt q = a(dfc.pv).p(dfc.pH).m(dfc.pF).a(dfc.pG).l(dfc.pD).k(dfc.pE).n(dfc.pw).b(dfc.py).a();
   public static final lt r = a(dfc.pw).p(dfc.pB).l(dfc.pA).k(dfc.pz).d(dfc.px).a();
   public static final lt s = a(dfc.cj).p(dfc.nF).l(dfc.fi).k(dfc.jJ).a();
   public static final lt t = a(dfc.kz).p(dfc.nQ).l(dfc.nj).k(dfc.nx).a();
   public static final lt u = a(dfc.eI).p(dfc.nI).l(dfc.ng).k(dfc.nu).a();
   public static final lt v = a(dfc.qW).e(dfc.rf).f(dfc.rM).o(dfc.rU).b().a();
   public static final lt w = a(dfc.rf).k(dfc.rv).l(dfc.rr).b(dfc.rj).b().a();
   public static final lt x = a(dfc.rw).e(dfc.rD).f(dfc.rQ).o(dfc.rY).a("waxed_cut_copper").b().a();
   public static final lt y = a(dfc.rD).k(dfc.rL).l(dfc.rH).b(dfc.rn).a("waxed_cut_copper").b().a();
   public static final lt z = a(dfc.qX).e(dfc.re).f(dfc.rN).o(dfc.rV).b().a();
   public static final lt A = a(dfc.re).k(dfc.ru).l(dfc.rq).b(dfc.ri).b().a();
   public static final lt B = a(dfc.ry).e(dfc.rC).f(dfc.rR).o(dfc.rZ).a("waxed_exposed_cut_copper").b().a();
   public static final lt C = a(dfc.rC).k(dfc.rK).l(dfc.rG).b(dfc.rm).a("waxed_exposed_cut_copper").b().a();
   public static final lt D = a(dfc.qY).e(dfc.rd).f(dfc.rP).o(dfc.rX).b().a();
   public static final lt E = a(dfc.rd).k(dfc.rt).l(dfc.rp).b(dfc.rh).b().a();
   public static final lt F = a(dfc.rx).e(dfc.rB).f(dfc.rT).o(dfc.sb).a("waxed_weathered_cut_copper").b().a();
   public static final lt G = a(dfc.rB).k(dfc.rJ).l(dfc.rF).b(dfc.rl).a("waxed_weathered_cut_copper").b().a();
   public static final lt H = a(dfc.qZ).e(dfc.rc).f(dfc.rO).o(dfc.rW).b().a();
   public static final lt I = a(dfc.rc).k(dfc.rs).l(dfc.ro).b(dfc.rg).b().a();
   public static final lt J = a(dfc.rz).e(dfc.rA).f(dfc.rS).o(dfc.sa).a("waxed_oxidized_cut_copper").b().a();
   public static final lt K = a(dfc.rA).k(dfc.rI).l(dfc.rE).b(dfc.rk).a("waxed_oxidized_cut_copper").b().a();
   public static final lt L = a(dfc.m).p(dfc.fP).l(dfc.cQ).k(dfc.jI).a();
   public static final lt M = a(dfc.cn).p(dfc.fQ).l(dfc.ni).k(dfc.nw).a();
   public static final lt N = a(dfc.e).p(dfc.nR).l(dfc.nr).k(dfc.nE).n(dfc.f).a();
   public static final lt O = a(dfc.f).l(dfc.nh).k(dfc.nv).a();
   public static final lt P = a(dfc.c).p(dfc.nJ).l(dfc.nn).k(dfc.nA).n(dfc.d).a();
   public static final lt Q = a(dfc.d).l(dfc.ne).k(dfc.ns).a();
   public static final lt R = a(dfc.qz).p(dfc.qC).l(dfc.qB).k(dfc.qA).b(dfc.qH).n(dfc.qD).a();
   public static final lt S = a(dfc.qD).p(dfc.qG).l(dfc.qF).k(dfc.qE).n(dfc.qI).a();
   public static final lt T = a(dfc.qI).p(dfc.qL).l(dfc.qK).k(dfc.qJ).b(dfc.qM).a();
   public static final lt U = a(dfc.fn).h(dfc.fo).p(dfc.nM).l(dfc.fp).k(dfc.jM).b(dfc.pI).d(dfc.pJ).a();
   public static final lt V = a(dfc.kL).k(dfc.nC).l(dfc.np).p(dfc.nO).a();
   public static final lt W = a(dfc.hZ).p(dfc.nG).l(dfc.ic).k(dfc.if).a();
   public static final lt X = a(dfc.kw).l(dfc.ky).k(dfc.jQ).c().a();
   public static final lt Y = a(dfc.ia).l(dfc.id).k(dfc.ig).a();
   public static final lt Z = a(dfc.ib).l(dfc.ie).k(dfc.ih).a();
   public static final lt aa = a(dfc.hd).l(dfc.hg).k(dfc.jN).b(dfc.he).c().a();
   public static final lt ab = a(dfc.jT).l(dfc.nm).k(dfc.nz).a();
   public static final lt ac = a(dfc.aV).p(dfc.nP).l(dfc.fD).k(dfc.jF).b(dfc.aW).e(dfc.aX).c().a();
   public static final lt ad = a(dfc.aX).k(dfc.jG).a();
   public static final lt ae = a(dfc.jS).k(dfc.ny).l(dfc.nl).a();
   public static final lt af = a(dfc.jp).p(dfc.nH).l(dfc.js).k(dfc.jO).b(dfc.jq).e(dfc.jr).c().a();
   public static final lt ag = a(dfc.jr).k(dfc.jP).a();
   public static final lt ah = a(dfc.jU).k(dfc.nt).l(dfc.nf).a();
   public static final lt ai = a(dfc.b).k(dfc.jD).m(dfc.dx).a(dfc.dM).l(dfc.nk).a();
   public static final lt aj = a(dfc.eH).p(dfc.nK).l(dfc.fj).k(dfc.jK).b(dfc.eK).d(dfc.eJ).c().a();
   public static final lt ak = a(dfc.sJ).a();
   public static final lt al = a(dfc.sK).k(dfc.sM).l(dfc.sL).p(dfc.sN).b(dfc.ta).n(dfc.sO).a();
   public static final lt am = a(dfc.sO).k(dfc.sQ).l(dfc.sP).p(dfc.sR).a();
   public static final lt an = a(dfc.sW).k(dfc.sY).l(dfc.sX).p(dfc.sZ).d(dfc.tb).a();
   public static final lt ao = a(dfc.sS).k(dfc.sU).l(dfc.sT).p(dfc.sV).d(dfc.tc).a();

   private static lt.a a(dfa $$0) {
      lt.a $$1 = new lt.a($$0);
      lt $$2 = ap.put($$0, $$1.a());
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate family definition for " + lp.e.b($$0));
      } else {
         return $$1;
      }
   }

   public static Stream<lt> a() {
      return ap.values().stream();
   }
}
