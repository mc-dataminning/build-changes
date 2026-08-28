import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gmt {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btq<?>, gms<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gxl.a, gms<gfp>> c = Map.of(gxl.a.b, $$0 -> new grx($$0, false), gxl.a.a, $$0 -> new grx($$0, true));

   private static <T extends btj> void a(btq<? extends T> $$0, gms<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<btq<?>, gmr<?, ?>> a(gms.a $$0) {
      Builder<btq<?>, gmr<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lu.f.b((btq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gxl.a, gmr<? extends cnp, ?>> b(gms.a $$0) {
      Builder<gxl.a, gmr<? extends cnp, ?>> $$1 = ImmutableMap.builder();
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

      for (btq<?> $$1 : lu.f) {
         if ($$1 != btq.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lu.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(btq.a, glo::new);
      a(btq.b, goa::new);
      a(btq.c, glp::new);
      a(btq.d, glq::new);
      a(btq.e, gpg::new);
      a(btq.f, gls::new);
      a(btq.g, glt::new);
      a(btq.h, glu::new);
      a(btq.i, glv::new);
      a(btq.j, gmg.a::new);
      a(btq.k, $$0 -> new glw($$0, false));
      a(btq.l, glx::new);
      a(btq.m, gly::new);
      a(btq.n, gpr::new);
      a(btq.p, gma::new);
      a(btq.o, glz::new);
      a(btq.q, gmb::new);
      a(btq.r, $$0 -> new glw($$0, true));
      a(btq.s, $$0 -> new gnx($$0, gaa.L));
      a(btq.t, gmc::new);
      a(btq.u, gmd::new);
      a(btq.v, $$0 -> new gnx($$0, gaa.P));
      a(btq.w, gme::new);
      a(btq.x, gmf::new);
      a(btq.y, gmh::new);
      a(btq.z, $$0 -> new gmi<>($$0, 0.87F, gaa.ad, gaa.ae, false));
      a(btq.A, gmj::new);
      a(btq.B, gmk::new);
      a(btq.C, gpe::new);
      a(btq.D, gml::new);
      a(btq.H, gmo::new);
      a(btq.I, gmp::new);
      a(btq.F, gmn::new);
      a(btq.G, gpe::new);
      a(btq.E, gmm::new);
      a(btq.J, gmv::new);
      a(btq.K, gmu::new);
      a(btq.L, gpe::new);
      a(btq.M, gmw::new);
      a(btq.N, $$0 -> new gpe<>($$0, 1.0F, true));
      a(btq.O, gmx::new);
      a(btq.ak, $$0 -> new gpe<>($$0, 3.0F, true));
      a(btq.P, gmy::new);
      a(btq.bz, gmz::new);
      a(btq.Q, gna::new);
      a(btq.R, gnb::new);
      a(btq.S, $$0 -> new gnx($$0, gaa.aC));
      a(btq.T, gnc::new);
      a(btq.U, $$0 -> new gnd($$0, 6.0F));
      a(btq.V, gnp::new);
      a(btq.W, $$0 -> new gne($$0, new fzc($$0.a(gaa.aH)), new fzc($$0.a(gaa.aI))));
      a(btq.X, gnf::new);
      a(btq.Y, gng::new);
      a(btq.Z, gnh::new);
      a(btq.aa, $$0 -> new gnx($$0, gaa.aO));
      a(btq.ab, gni::new);
      a(btq.ac, gnk::new);
      a(btq.ad, gnm::new);
      a(btq.ae, goa::new);
      a(btq.af, gnn::new);
      a(btq.ag, gno::new);
      a(btq.ah, gmg.b::new);
      a(btq.ai, gnp::new);
      a(btq.aj, goc::new);
      a(btq.al, gnr::new);
      a(btq.am, gns::new);
      a(btq.an, $$0 -> new gnu($$0, gaa.bc, gaa.bd));
      a(btq.ao, gnv::new);
      a(btq.ap, gnw::new);
      a(btq.aq, goa::new);
      a(btq.ar, $$0 -> new gnx($$0, gaa.bi));
      a(btq.as, gnz::new);
      a(btq.at, $$0 -> new gmi<>($$0, 0.92F, gaa.bk, gaa.bl, true));
      a(btq.au, gob::new);
      a(btq.av, god::new);
      a(btq.aw, goe::new);
      a(btq.ax, gof::new);
      a(btq.ay, gog::new);
      a(btq.az, goh::new);
      a(btq.aA, $$0 -> new goi($$0, gaa.bw, gaa.bD, gaa.bB, gaa.bC, gaa.bE, gaa.bF));
      a(btq.aB, $$0 -> new goi($$0, gaa.bx, gaa.bx, gaa.by, gaa.bz, gaa.by, gaa.bz));
      a(btq.aC, goj::new);
      a(btq.aD, gok::new);
      a(btq.aE, gpe::new);
      a(btq.aF, gol::new);
      a(btq.aG, gom::new);
      a(btq.aH, gon::new);
      a(btq.aI, gop::new);
      a(btq.aJ, goq::new);
      a(btq.aK, gos::new);
      a(btq.aL, gor::new);
      a(btq.aM, got::new);
      a(btq.aN, gou::new);
      a(btq.aO, $$0 -> new gpl($$0, gaa.cm, gaa.cn, true));
      a(btq.aP, gov::new);
      a(btq.aQ, $$0 -> new gpe<>($$0, 0.75F, true));
      a(btq.aR, gow::new);
      a(btq.aT, gpe::new);
      a(btq.aS, gox::new);
      a(btq.aU, $$0 -> new gnx($$0, gaa.cw));
      a(btq.aV, goy::new);
      a(btq.aW, goz::new);
      a(btq.aX, $$0 -> new gpa<>($$0, new fzc($$0.a(gaa.cy)), new fzc($$0.a(gaa.cz))));
      a(btq.aY, gpb::new);
      a(btq.aZ, gpc::new);
      a(btq.ba, gpd::new);
      a(btq.bb, gmg.c::new);
      a(btq.bc, gpi::new);
      a(btq.bd, gph::new);
      a(btq.be, $$0 -> new gnu($$0, gaa.cI, gaa.cJ));
      a(btq.bf, gpf::new);
      a(btq.bg, gpj::new);
      a(btq.bh, gpk::new);
      a(btq.bi, gpm::new);
      a(btq.bj, gpn::new);
      a(btq.bk, gpo::new);
      a(btq.bm, gpq::new);
      a(btq.bl, gpp::new);
      a(btq.bn, gpr::new);
      a(btq.bo, gps::new);
      a(btq.bp, gpt::new);
      a(btq.bq, gpu::new);
      a(btq.br, gpv::new);
      a(btq.bs, gpw::new);
      a(btq.bt, gpx::new);
      a(btq.bu, gpy::new);
      a(btq.bv, $$0 -> new gpl($$0, gaa.dn, gaa.do, false));
      a(btq.bw, gpz::new);
      a(btq.bx, $$0 -> new gqa($$0, gaa.dA, gaa.dD, gaa.dB, gaa.dC, gaa.dE, gaa.dF));
   }
}
