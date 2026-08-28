import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gjn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsm<?>, gjm<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gqo.a, gjm<gdc>> c = Map.of(gqo.a.b, $$0 -> new gor($$0, false), gqo.a.a, $$0 -> new gor($$0, true));

   private static <T extends bsg> void a(bsm<? extends T> $$0, gjm<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsm<?>, gjl<?>> a(gjm.a $$0) {
      Builder<bsm<?>, gjl<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lq.f.b((bsm<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gqo.a, gjl<? extends cmk>> b(gjm.a $$0) {
      Builder<gqo.a, gjl<? extends cmk>> $$1 = ImmutableMap.builder();
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

      for (bsm<?> $$1 : lq.f) {
         if ($$1 != bsm.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lq.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsm.a, gii::new);
      a(bsm.b, gku::new);
      a(bsm.c, gij::new);
      a(bsm.d, gik::new);
      a(bsm.e, gma::new);
      a(bsm.f, gim::new);
      a(bsm.g, gin::new);
      a(bsm.h, gio::new);
      a(bsm.i, gip::new);
      a(bsm.j, gjb.a::new);
      a(bsm.k, $$0 -> new giq($$0, false));
      a(bsm.l, gir::new);
      a(bsm.m, gis::new);
      a(bsm.n, gml::new);
      a(bsm.p, giu::new);
      a(bsm.o, $$0 -> new git($$0, fxn.v));
      a(bsm.q, giv::new);
      a(bsm.r, $$0 -> new giq($$0, true));
      a(bsm.s, $$0 -> new gkr<>($$0, fxn.y));
      a(bsm.t, gix::new);
      a(bsm.u, giy::new);
      a(bsm.v, $$0 -> new gkr<>($$0, fxn.B));
      a(bsm.w, giz::new);
      a(bsm.x, gja::new);
      a(bsm.y, gjc::new);
      a(bsm.z, $$0 -> new giw<>($$0, 0.87F, fxn.N));
      a(bsm.A, gjd::new);
      a(bsm.B, gje::new);
      a(bsm.C, gly::new);
      a(bsm.D, gjf::new);
      a(bsm.H, gji::new);
      a(bsm.I, gjj::new);
      a(bsm.F, gjh::new);
      a(bsm.G, gly::new);
      a(bsm.E, gjg::new);
      a(bsm.J, gjp::new);
      a(bsm.K, gjo::new);
      a(bsm.L, gly::new);
      a(bsm.M, gjq::new);
      a(bsm.N, $$0 -> new gly<>($$0, 1.0F, true));
      a(bsm.O, gjr::new);
      a(bsm.ak, $$0 -> new gly<>($$0, 3.0F, true));
      a(bsm.P, gjs::new);
      a(bsm.bz, gjt::new);
      a(bsm.Q, gju::new);
      a(bsm.R, gjv::new);
      a(bsm.S, $$0 -> new gkr<>($$0, fxn.af));
      a(bsm.T, gjw::new);
      a(bsm.U, $$0 -> new gjx($$0, 6.0F));
      a(bsm.V, gkj::new);
      a(bsm.W, $$0 -> new gjy($$0, new fwq<>($$0.a(fxn.ak))));
      a(bsm.X, gjz::new);
      a(bsm.Y, gka::new);
      a(bsm.Z, gkb::new);
      a(bsm.aa, $$0 -> new gkr<>($$0, fxn.ao));
      a(bsm.ab, gkc::new);
      a(bsm.ac, gke::new);
      a(bsm.ad, gkg::new);
      a(bsm.ae, gku::new);
      a(bsm.af, gkh::new);
      a(bsm.ag, gki::new);
      a(bsm.ah, gjb.b::new);
      a(bsm.ai, gkj::new);
      a(bsm.aj, gkw::new);
      a(bsm.al, gkl::new);
      a(bsm.am, gkm::new);
      a(bsm.an, $$0 -> new gko($$0, fxn.ax));
      a(bsm.ao, gkp::new);
      a(bsm.ap, gkq::new);
      a(bsm.aq, gku::new);
      a(bsm.ar, $$0 -> new gkr<>($$0, fxn.aB));
      a(bsm.as, gkt::new);
      a(bsm.at, $$0 -> new giw<>($$0, 0.92F, fxn.aD));
      a(bsm.au, gkv::new);
      a(bsm.av, gkx::new);
      a(bsm.aw, gky::new);
      a(bsm.ax, gkz::new);
      a(bsm.ay, gla::new);
      a(bsm.az, glb::new);
      a(bsm.aA, $$0 -> new glc($$0, fxn.aJ, fxn.aO, fxn.aP, false));
      a(bsm.aB, $$0 -> new glc($$0, fxn.aK, fxn.aL, fxn.aM, false));
      a(bsm.aC, gld::new);
      a(bsm.aD, gle::new);
      a(bsm.aE, gly::new);
      a(bsm.aF, glf::new);
      a(bsm.aG, glg::new);
      a(bsm.aH, glh::new);
      a(bsm.aI, glj::new);
      a(bsm.aJ, glk::new);
      a(bsm.aK, glm::new);
      a(bsm.aL, gll::new);
      a(bsm.aM, gln::new);
      a(bsm.aN, glo::new);
      a(bsm.aO, $$0 -> new gmf($$0, fxn.bo));
      a(bsm.aP, glp::new);
      a(bsm.aQ, $$0 -> new gly<>($$0, 0.75F, true));
      a(bsm.aR, glq::new);
      a(bsm.aT, gly::new);
      a(bsm.aS, glr::new);
      a(bsm.aU, $$0 -> new gkr<>($$0, fxn.bw));
      a(bsm.aV, gls::new);
      a(bsm.aW, glt::new);
      a(bsm.aX, $$0 -> new glu<>($$0, new fwq<>($$0.a(fxn.by))));
      a(bsm.aY, glv::new);
      a(bsm.aZ, glw::new);
      a(bsm.ba, glx::new);
      a(bsm.bb, gjb.c::new);
      a(bsm.bc, gmc::new);
      a(bsm.bd, gmb::new);
      a(bsm.be, $$0 -> new gko($$0, fxn.bH));
      a(bsm.bf, glz::new);
      a(bsm.bg, gmd::new);
      a(bsm.bh, gme::new);
      a(bsm.bi, gmg::new);
      a(bsm.bj, gmh::new);
      a(bsm.bk, gmi::new);
      a(bsm.bm, gmk::new);
      a(bsm.bl, gmj::new);
      a(bsm.bn, gml::new);
      a(bsm.bo, gmm::new);
      a(bsm.bp, gmn::new);
      a(bsm.bq, gmo::new);
      a(bsm.br, gmp::new);
      a(bsm.bs, gmq::new);
      a(bsm.bt, gmr::new);
      a(bsm.bu, gms::new);
      a(bsm.bv, $$0 -> new gmf($$0, fxn.ch));
      a(bsm.bw, gmt::new);
      a(bsm.bx, $$0 -> new glc($$0, fxn.cn, fxn.co, fxn.cp, true));
   }
}
