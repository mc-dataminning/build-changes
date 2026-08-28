import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gke {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsw<?>, gkd<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<grf.a, gkd<gds>> c = Map.of(grf.a.b, $$0 -> new gpi($$0, false), grf.a.a, $$0 -> new gpi($$0, true));

   private static <T extends bsq> void a(bsw<? extends T> $$0, gkd<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsw<?>, gkc<?>> a(gkd.a $$0) {
      Builder<bsw<?>, gkc<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lt.f.b((bsw<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<grf.a, gkc<? extends cmv>> b(gkd.a $$0) {
      Builder<grf.a, gkc<? extends cmv>> $$1 = ImmutableMap.builder();
      c.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create player model for " + $$2, var5);
         }
      });
      return $$1.build();
   }

   public static boolean a() {
      boolean $$0 = true;

      for (bsw<?> $$1 : lt.f) {
         if ($$1 != bsw.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lt.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsw.a, giz::new);
      a(bsw.b, gll::new);
      a(bsw.c, gja::new);
      a(bsw.d, gjb::new);
      a(bsw.e, gmr::new);
      a(bsw.f, gjd::new);
      a(bsw.g, gje::new);
      a(bsw.h, gjf::new);
      a(bsw.i, gjg::new);
      a(bsw.j, gjs.a::new);
      a(bsw.k, $$0 -> new gjh($$0, false));
      a(bsw.l, gji::new);
      a(bsw.m, gjj::new);
      a(bsw.n, gnc::new);
      a(bsw.p, gjl::new);
      a(bsw.o, $$0 -> new gjk($$0, fyd.w));
      a(bsw.q, gjm::new);
      a(bsw.r, $$0 -> new gjh($$0, true));
      a(bsw.s, $$0 -> new gli<>($$0, fyd.z));
      a(bsw.t, gjo::new);
      a(bsw.u, gjp::new);
      a(bsw.v, $$0 -> new gli<>($$0, fyd.C));
      a(bsw.w, gjq::new);
      a(bsw.x, gjr::new);
      a(bsw.y, gjt::new);
      a(bsw.z, $$0 -> new gjn<>($$0, 0.87F, fyd.O));
      a(bsw.A, gju::new);
      a(bsw.B, gjv::new);
      a(bsw.C, gmp::new);
      a(bsw.D, gjw::new);
      a(bsw.H, gjz::new);
      a(bsw.I, gka::new);
      a(bsw.F, gjy::new);
      a(bsw.G, gmp::new);
      a(bsw.E, gjx::new);
      a(bsw.J, gkg::new);
      a(bsw.K, gkf::new);
      a(bsw.L, gmp::new);
      a(bsw.M, gkh::new);
      a(bsw.N, $$0 -> new gmp<>($$0, 1.0F, true));
      a(bsw.O, gki::new);
      a(bsw.ak, $$0 -> new gmp<>($$0, 3.0F, true));
      a(bsw.P, gkj::new);
      a(bsw.bz, gkk::new);
      a(bsw.Q, gkl::new);
      a(bsw.R, gkm::new);
      a(bsw.S, $$0 -> new gli<>($$0, fyd.ag));
      a(bsw.T, gkn::new);
      a(bsw.U, $$0 -> new gko($$0, 6.0F));
      a(bsw.V, gla::new);
      a(bsw.W, $$0 -> new gkp($$0, new fxg<>($$0.a(fyd.al))));
      a(bsw.X, gkq::new);
      a(bsw.Y, gkr::new);
      a(bsw.Z, gks::new);
      a(bsw.aa, $$0 -> new gli<>($$0, fyd.ap));
      a(bsw.ab, gkt::new);
      a(bsw.ac, gkv::new);
      a(bsw.ad, gkx::new);
      a(bsw.ae, gll::new);
      a(bsw.af, gky::new);
      a(bsw.ag, gkz::new);
      a(bsw.ah, gjs.b::new);
      a(bsw.ai, gla::new);
      a(bsw.aj, gln::new);
      a(bsw.al, glc::new);
      a(bsw.am, gld::new);
      a(bsw.an, $$0 -> new glf($$0, fyd.ay));
      a(bsw.ao, glg::new);
      a(bsw.ap, glh::new);
      a(bsw.aq, gll::new);
      a(bsw.ar, $$0 -> new gli<>($$0, fyd.aC));
      a(bsw.as, glk::new);
      a(bsw.at, $$0 -> new gjn<>($$0, 0.92F, fyd.aE));
      a(bsw.au, glm::new);
      a(bsw.av, glo::new);
      a(bsw.aw, glp::new);
      a(bsw.ax, glq::new);
      a(bsw.ay, glr::new);
      a(bsw.az, gls::new);
      a(bsw.aA, $$0 -> new glt($$0, fyd.aK, fyd.aP, fyd.aQ, false));
      a(bsw.aB, $$0 -> new glt($$0, fyd.aL, fyd.aM, fyd.aN, false));
      a(bsw.aC, glu::new);
      a(bsw.aD, glv::new);
      a(bsw.aE, gmp::new);
      a(bsw.aF, glw::new);
      a(bsw.aG, glx::new);
      a(bsw.aH, gly::new);
      a(bsw.aI, gma::new);
      a(bsw.aJ, gmb::new);
      a(bsw.aK, gmd::new);
      a(bsw.aL, gmc::new);
      a(bsw.aM, gme::new);
      a(bsw.aN, gmf::new);
      a(bsw.aO, $$0 -> new gmw($$0, fyd.bp));
      a(bsw.aP, gmg::new);
      a(bsw.aQ, $$0 -> new gmp<>($$0, 0.75F, true));
      a(bsw.aR, gmh::new);
      a(bsw.aT, gmp::new);
      a(bsw.aS, gmi::new);
      a(bsw.aU, $$0 -> new gli<>($$0, fyd.bx));
      a(bsw.aV, gmj::new);
      a(bsw.aW, gmk::new);
      a(bsw.aX, $$0 -> new gml<>($$0, new fxg<>($$0.a(fyd.bz))));
      a(bsw.aY, gmm::new);
      a(bsw.aZ, gmn::new);
      a(bsw.ba, gmo::new);
      a(bsw.bb, gjs.c::new);
      a(bsw.bc, gmt::new);
      a(bsw.bd, gms::new);
      a(bsw.be, $$0 -> new glf($$0, fyd.bI));
      a(bsw.bf, gmq::new);
      a(bsw.bg, gmu::new);
      a(bsw.bh, gmv::new);
      a(bsw.bi, gmx::new);
      a(bsw.bj, gmy::new);
      a(bsw.bk, gmz::new);
      a(bsw.bm, gnb::new);
      a(bsw.bl, gna::new);
      a(bsw.bn, gnc::new);
      a(bsw.bo, gnd::new);
      a(bsw.bp, gne::new);
      a(bsw.bq, gnf::new);
      a(bsw.br, gng::new);
      a(bsw.bs, gnh::new);
      a(bsw.bt, gni::new);
      a(bsw.bu, gnj::new);
      a(bsw.bv, $$0 -> new gmw($$0, fyd.ci));
      a(bsw.bw, gnk::new);
      a(bsw.bx, $$0 -> new glt($$0, fyd.co, fyd.cp, fyd.cq, true));
   }
}
