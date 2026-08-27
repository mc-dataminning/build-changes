import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gkr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsb<?>, gkq<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gry.a, gkq<gef>> c = Map.of(gry.a.b, $$0 -> new gqb($$0, false), gry.a.a, $$0 -> new gqb($$0, true));

   private static <T extends brv> void a(bsb<? extends T> $$0, gkq<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsb<?>, gkp<?>> a(gkq.a $$0) {
      Builder<bsb<?>, gkp<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lh.g.b((bsb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gry.a, gkp<? extends cly>> b(gkq.a $$0) {
      Builder<gry.a, gkp<? extends cly>> $$1 = ImmutableMap.builder();
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

      for (bsb<?> $$1 : lh.g) {
         if ($$1 != bsb.bE && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lh.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsb.a, gjl::new);
      a(bsb.b, gmb::new);
      a(bsb.c, gjm::new);
      a(bsb.d, gjn::new);
      a(bsb.e, gnh::new);
      a(bsb.f, gmb::new);
      a(bsb.g, gjp::new);
      a(bsb.h, gjq::new);
      a(bsb.i, gjr::new);
      a(bsb.j, gjs::new);
      a(bsb.k, gjt::new);
      a(bsb.l, gkf.a::new);
      a(bsb.m, $$0 -> new gju($$0, false));
      a(bsb.n, gjv::new);
      a(bsb.o, gjw::new);
      a(bsb.p, gns::new);
      a(bsb.r, gjy::new);
      a(bsb.q, $$0 -> new gjx($$0, fyr.w));
      a(bsb.s, gjz::new);
      a(bsb.t, $$0 -> new gju($$0, true));
      a(bsb.u, $$0 -> new gly<>($$0, fyr.z));
      a(bsb.v, gkb::new);
      a(bsb.w, gkc::new);
      a(bsb.x, $$0 -> new gly<>($$0, fyr.C));
      a(bsb.y, gkd::new);
      a(bsb.z, gke::new);
      a(bsb.A, gkg::new);
      a(bsb.B, $$0 -> new gka<>($$0, 0.87F, fyr.O));
      a(bsb.C, gkh::new);
      a(bsb.D, gki::new);
      a(bsb.E, gnf::new);
      a(bsb.F, $$0 -> new gkj($$0, fyr.W));
      a(bsb.J, gkm::new);
      a(bsb.K, gkn::new);
      a(bsb.H, gkl::new);
      a(bsb.I, gnf::new);
      a(bsb.G, gkk::new);
      a(bsb.L, gkt::new);
      a(bsb.M, gks::new);
      a(bsb.N, gnf::new);
      a(bsb.O, gku::new);
      a(bsb.P, $$0 -> new gnf<>($$0, 1.0F, true));
      a(bsb.Q, gkv::new);
      a(bsb.al, $$0 -> new gnf<>($$0, 3.0F, true));
      a(bsb.R, gkw::new);
      a(bsb.bF, gkx::new);
      a(bsb.bG, glq::new);
      a(bsb.S, gky::new);
      a(bsb.T, gkz::new);
      a(bsb.U, $$0 -> new gly<>($$0, fyr.ai));
      a(bsb.V, gla::new);
      a(bsb.W, $$0 -> new glb($$0, 6.0F));
      a(bsb.X, glo::new);
      a(bsb.Y, $$0 -> new glc($$0, new fxu<>($$0.a(fyr.an))));
      a(bsb.Z, gld::new);
      a(bsb.aa, $$0 -> new glf($$0, fyr.ap));
      a(bsb.ab, glg::new);
      a(bsb.ac, $$0 -> new gly<>($$0, fyr.as));
      a(bsb.ad, glh::new);
      a(bsb.ae, glj::new);
      a(bsb.af, gll::new);
      a(bsb.ag, gmb::new);
      a(bsb.ah, glm::new);
      a(bsb.ai, gln::new);
      a(bsb.aj, gkf.b::new);
      a(bsb.ak, glo::new);
      a(bsb.am, glr::new);
      a(bsb.an, gls::new);
      a(bsb.ao, $$0 -> new glu($$0, fyr.aB));
      a(bsb.ap, glv::new);
      a(bsb.aq, glw::new);
      a(bsb.ar, gmb::new);
      a(bsb.as, $$0 -> new gly<>($$0, fyr.aF));
      a(bsb.at, gma::new);
      a(bsb.au, $$0 -> new gka<>($$0, 0.92F, fyr.aH));
      a(bsb.av, gmc::new);
      a(bsb.aw, gmd::new);
      a(bsb.ax, gme::new);
      a(bsb.ay, gmf::new);
      a(bsb.az, gmg::new);
      a(bsb.aA, gmh::new);
      a(bsb.aB, $$0 -> new gmi($$0, fyr.aN, fyr.aS, fyr.aT, false));
      a(bsb.aC, $$0 -> new gmi($$0, fyr.aO, fyr.aP, fyr.aQ, false));
      a(bsb.aD, gmj::new);
      a(bsb.aE, $$0 -> new gkj($$0, fyr.X));
      a(bsb.aF, gml::new);
      a(bsb.aG, gnf::new);
      a(bsb.aH, gmm::new);
      a(bsb.aI, gmn::new);
      a(bsb.aJ, gmo::new);
      a(bsb.aK, gmq::new);
      a(bsb.aL, gmr::new);
      a(bsb.aM, gmt::new);
      a(bsb.aN, gms::new);
      a(bsb.aO, gmu::new);
      a(bsb.aP, gmv::new);
      a(bsb.aQ, $$0 -> new gnm($$0, fyr.bs));
      a(bsb.aR, gmw::new);
      a(bsb.aS, glx::new);
      a(bsb.aT, $$0 -> new gnf<>($$0, 0.75F, true));
      a(bsb.aU, gmx::new);
      a(bsb.aW, gnf::new);
      a(bsb.aV, gmy::new);
      a(bsb.aX, $$0 -> new gly<>($$0, fyr.bC));
      a(bsb.aY, gmz::new);
      a(bsb.aZ, gna::new);
      a(bsb.ba, $$0 -> new gnb<>($$0, new fxu<>($$0.a(fyr.bE))));
      a(bsb.bb, gnc::new);
      a(bsb.bc, gnd::new);
      a(bsb.bd, gne::new);
      a(bsb.be, gkf.c::new);
      a(bsb.bf, gnj::new);
      a(bsb.bg, gni::new);
      a(bsb.bh, $$0 -> new glf($$0, fyr.aq));
      a(bsb.bi, $$0 -> new glu($$0, fyr.bN));
      a(bsb.bj, gng::new);
      a(bsb.bk, gnk::new);
      a(bsb.bl, gnl::new);
      a(bsb.bm, gnn::new);
      a(bsb.bn, gno::new);
      a(bsb.bo, gnp::new);
      a(bsb.bq, gnr::new);
      a(bsb.bp, gnq::new);
      a(bsb.br, gns::new);
      a(bsb.bs, gnt::new);
      a(bsb.bt, gnu::new);
      a(bsb.bu, gnv::new);
      a(bsb.bv, gnw::new);
      a(bsb.bw, gnx::new);
      a(bsb.bx, gny::new);
      a(bsb.by, gnz::new);
      a(bsb.bz, gmk::new);
      a(bsb.bA, $$0 -> new gnm($$0, fyr.cn));
      a(bsb.bB, goa::new);
      a(bsb.bC, $$0 -> new gmi($$0, fyr.ct, fyr.cu, fyr.cv, true));
      a(bsb.bH, gle::new);
      a(bsb.bD, $$0 -> new gnf<>($$0, 1.0F, true));
   }
}
