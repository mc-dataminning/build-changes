import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gjp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsn<?>, gjo<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gqq.a, gjo<gde>> c = Map.of(gqq.a.b, $$0 -> new got($$0, false), gqq.a.a, $$0 -> new got($$0, true));

   private static <T extends bsh> void a(bsn<? extends T> $$0, gjo<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsn<?>, gjn<?>> a(gjo.a $$0) {
      Builder<bsn<?>, gjn<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lq.f.b((bsn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gqq.a, gjn<? extends cml>> b(gjo.a $$0) {
      Builder<gqq.a, gjn<? extends cml>> $$1 = ImmutableMap.builder();
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

      for (bsn<?> $$1 : lq.f) {
         if ($$1 != bsn.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lq.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsn.a, gik::new);
      a(bsn.b, gkw::new);
      a(bsn.c, gil::new);
      a(bsn.d, gim::new);
      a(bsn.e, gmc::new);
      a(bsn.f, gio::new);
      a(bsn.g, gip::new);
      a(bsn.h, giq::new);
      a(bsn.i, gir::new);
      a(bsn.j, gjd.a::new);
      a(bsn.k, $$0 -> new gis($$0, false));
      a(bsn.l, git::new);
      a(bsn.m, giu::new);
      a(bsn.n, gmn::new);
      a(bsn.p, giw::new);
      a(bsn.o, $$0 -> new giv($$0, fxp.v));
      a(bsn.q, gix::new);
      a(bsn.r, $$0 -> new gis($$0, true));
      a(bsn.s, $$0 -> new gkt<>($$0, fxp.y));
      a(bsn.t, giz::new);
      a(bsn.u, gja::new);
      a(bsn.v, $$0 -> new gkt<>($$0, fxp.B));
      a(bsn.w, gjb::new);
      a(bsn.x, gjc::new);
      a(bsn.y, gje::new);
      a(bsn.z, $$0 -> new giy<>($$0, 0.87F, fxp.N));
      a(bsn.A, gjf::new);
      a(bsn.B, gjg::new);
      a(bsn.C, gma::new);
      a(bsn.D, gjh::new);
      a(bsn.H, gjk::new);
      a(bsn.I, gjl::new);
      a(bsn.F, gjj::new);
      a(bsn.G, gma::new);
      a(bsn.E, gji::new);
      a(bsn.J, gjr::new);
      a(bsn.K, gjq::new);
      a(bsn.L, gma::new);
      a(bsn.M, gjs::new);
      a(bsn.N, $$0 -> new gma<>($$0, 1.0F, true));
      a(bsn.O, gjt::new);
      a(bsn.ak, $$0 -> new gma<>($$0, 3.0F, true));
      a(bsn.P, gju::new);
      a(bsn.bz, gjv::new);
      a(bsn.Q, gjw::new);
      a(bsn.R, gjx::new);
      a(bsn.S, $$0 -> new gkt<>($$0, fxp.af));
      a(bsn.T, gjy::new);
      a(bsn.U, $$0 -> new gjz($$0, 6.0F));
      a(bsn.V, gkl::new);
      a(bsn.W, $$0 -> new gka($$0, new fws<>($$0.a(fxp.ak))));
      a(bsn.X, gkb::new);
      a(bsn.Y, gkc::new);
      a(bsn.Z, gkd::new);
      a(bsn.aa, $$0 -> new gkt<>($$0, fxp.ao));
      a(bsn.ab, gke::new);
      a(bsn.ac, gkg::new);
      a(bsn.ad, gki::new);
      a(bsn.ae, gkw::new);
      a(bsn.af, gkj::new);
      a(bsn.ag, gkk::new);
      a(bsn.ah, gjd.b::new);
      a(bsn.ai, gkl::new);
      a(bsn.aj, gky::new);
      a(bsn.al, gkn::new);
      a(bsn.am, gko::new);
      a(bsn.an, $$0 -> new gkq($$0, fxp.ax));
      a(bsn.ao, gkr::new);
      a(bsn.ap, gks::new);
      a(bsn.aq, gkw::new);
      a(bsn.ar, $$0 -> new gkt<>($$0, fxp.aB));
      a(bsn.as, gkv::new);
      a(bsn.at, $$0 -> new giy<>($$0, 0.92F, fxp.aD));
      a(bsn.au, gkx::new);
      a(bsn.av, gkz::new);
      a(bsn.aw, gla::new);
      a(bsn.ax, glb::new);
      a(bsn.ay, glc::new);
      a(bsn.az, gld::new);
      a(bsn.aA, $$0 -> new gle($$0, fxp.aJ, fxp.aO, fxp.aP, false));
      a(bsn.aB, $$0 -> new gle($$0, fxp.aK, fxp.aL, fxp.aM, false));
      a(bsn.aC, glf::new);
      a(bsn.aD, glg::new);
      a(bsn.aE, gma::new);
      a(bsn.aF, glh::new);
      a(bsn.aG, gli::new);
      a(bsn.aH, glj::new);
      a(bsn.aI, gll::new);
      a(bsn.aJ, glm::new);
      a(bsn.aK, glo::new);
      a(bsn.aL, gln::new);
      a(bsn.aM, glp::new);
      a(bsn.aN, glq::new);
      a(bsn.aO, $$0 -> new gmh($$0, fxp.bo));
      a(bsn.aP, glr::new);
      a(bsn.aQ, $$0 -> new gma<>($$0, 0.75F, true));
      a(bsn.aR, gls::new);
      a(bsn.aT, gma::new);
      a(bsn.aS, glt::new);
      a(bsn.aU, $$0 -> new gkt<>($$0, fxp.bw));
      a(bsn.aV, glu::new);
      a(bsn.aW, glv::new);
      a(bsn.aX, $$0 -> new glw<>($$0, new fws<>($$0.a(fxp.by))));
      a(bsn.aY, glx::new);
      a(bsn.aZ, gly::new);
      a(bsn.ba, glz::new);
      a(bsn.bb, gjd.c::new);
      a(bsn.bc, gme::new);
      a(bsn.bd, gmd::new);
      a(bsn.be, $$0 -> new gkq($$0, fxp.bH));
      a(bsn.bf, gmb::new);
      a(bsn.bg, gmf::new);
      a(bsn.bh, gmg::new);
      a(bsn.bi, gmi::new);
      a(bsn.bj, gmj::new);
      a(bsn.bk, gmk::new);
      a(bsn.bm, gmm::new);
      a(bsn.bl, gml::new);
      a(bsn.bn, gmn::new);
      a(bsn.bo, gmo::new);
      a(bsn.bp, gmp::new);
      a(bsn.bq, gmq::new);
      a(bsn.br, gmr::new);
      a(bsn.bs, gms::new);
      a(bsn.bt, gmt::new);
      a(bsn.bu, gmu::new);
      a(bsn.bv, $$0 -> new gmh($$0, fxp.ch));
      a(bsn.bw, gmv::new);
      a(bsn.bx, $$0 -> new gle($$0, fxp.cn, fxp.co, fxp.cp, true));
   }
}
