import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gja {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btc<?>, giz<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gqb.a, giz<gcp>> c = Map.of(gqb.a.b, $$0 -> new goe($$0, false), gqb.a.a, $$0 -> new goe($$0, true));

   private static <T extends bsw> void a(btc<? extends T> $$0, giz<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<btc<?>, giy<?>> a(giz.a $$0) {
      Builder<btc<?>, giy<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((btc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gqb.a, giy<? extends cmz>> b(giz.a $$0) {
      Builder<gqb.a, giy<? extends cmz>> $$1 = ImmutableMap.builder();
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

      for (btc<?> $$1 : lp.g) {
         if ($$1 != btc.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(btc.a, ghv::new);
      a(btc.b, gkh::new);
      a(btc.c, ghw::new);
      a(btc.d, ghx::new);
      a(btc.e, gln::new);
      a(btc.f, ghz::new);
      a(btc.g, gia::new);
      a(btc.h, gib::new);
      a(btc.i, gic::new);
      a(btc.j, gio.a::new);
      a(btc.k, $$0 -> new gid($$0, false));
      a(btc.l, gie::new);
      a(btc.m, gif::new);
      a(btc.n, gly::new);
      a(btc.p, gih::new);
      a(btc.o, $$0 -> new gig($$0, fxb.v));
      a(btc.q, gii::new);
      a(btc.r, $$0 -> new gid($$0, true));
      a(btc.s, $$0 -> new gke<>($$0, fxb.y));
      a(btc.t, gik::new);
      a(btc.u, gil::new);
      a(btc.v, $$0 -> new gke<>($$0, fxb.B));
      a(btc.w, gim::new);
      a(btc.x, gin::new);
      a(btc.y, gip::new);
      a(btc.z, $$0 -> new gij<>($$0, 0.87F, fxb.N));
      a(btc.A, giq::new);
      a(btc.B, gir::new);
      a(btc.C, gll::new);
      a(btc.D, gis::new);
      a(btc.H, giv::new);
      a(btc.I, giw::new);
      a(btc.F, giu::new);
      a(btc.G, gll::new);
      a(btc.E, git::new);
      a(btc.J, gjc::new);
      a(btc.K, gjb::new);
      a(btc.L, gll::new);
      a(btc.M, gjd::new);
      a(btc.N, $$0 -> new gll<>($$0, 1.0F, true));
      a(btc.O, gje::new);
      a(btc.ak, $$0 -> new gll<>($$0, 3.0F, true));
      a(btc.P, gjf::new);
      a(btc.bz, gjg::new);
      a(btc.Q, gjh::new);
      a(btc.R, gji::new);
      a(btc.S, $$0 -> new gke<>($$0, fxb.af));
      a(btc.T, gjj::new);
      a(btc.U, $$0 -> new gjk($$0, 6.0F));
      a(btc.V, gjw::new);
      a(btc.W, $$0 -> new gjl($$0, new fwe<>($$0.a(fxb.ak))));
      a(btc.X, gjm::new);
      a(btc.Y, gjn::new);
      a(btc.Z, gjo::new);
      a(btc.aa, $$0 -> new gke<>($$0, fxb.ao));
      a(btc.ab, gjp::new);
      a(btc.ac, gjr::new);
      a(btc.ad, gjt::new);
      a(btc.ae, gkh::new);
      a(btc.af, gju::new);
      a(btc.ag, gjv::new);
      a(btc.ah, gio.b::new);
      a(btc.ai, gjw::new);
      a(btc.aj, gkj::new);
      a(btc.al, gjy::new);
      a(btc.am, gjz::new);
      a(btc.an, $$0 -> new gkb($$0, fxb.ax));
      a(btc.ao, gkc::new);
      a(btc.ap, gkd::new);
      a(btc.aq, gkh::new);
      a(btc.ar, $$0 -> new gke<>($$0, fxb.aB));
      a(btc.as, gkg::new);
      a(btc.at, $$0 -> new gij<>($$0, 0.92F, fxb.aD));
      a(btc.au, gki::new);
      a(btc.av, gkk::new);
      a(btc.aw, gkl::new);
      a(btc.ax, gkm::new);
      a(btc.ay, gkn::new);
      a(btc.az, gko::new);
      a(btc.aA, $$0 -> new gkp($$0, fxb.aJ, fxb.aO, fxb.aP, false));
      a(btc.aB, $$0 -> new gkp($$0, fxb.aK, fxb.aL, fxb.aM, false));
      a(btc.aC, gkq::new);
      a(btc.aD, gkr::new);
      a(btc.aE, gll::new);
      a(btc.aF, gks::new);
      a(btc.aG, gkt::new);
      a(btc.aH, gku::new);
      a(btc.aI, gkw::new);
      a(btc.aJ, gkx::new);
      a(btc.aK, gkz::new);
      a(btc.aL, gky::new);
      a(btc.aM, gla::new);
      a(btc.aN, glb::new);
      a(btc.aO, $$0 -> new gls($$0, fxb.bo));
      a(btc.aP, glc::new);
      a(btc.aQ, $$0 -> new gll<>($$0, 0.75F, true));
      a(btc.aR, gld::new);
      a(btc.aT, gll::new);
      a(btc.aS, gle::new);
      a(btc.aU, $$0 -> new gke<>($$0, fxb.bw));
      a(btc.aV, glf::new);
      a(btc.aW, glg::new);
      a(btc.aX, $$0 -> new glh<>($$0, new fwe<>($$0.a(fxb.by))));
      a(btc.aY, gli::new);
      a(btc.aZ, glj::new);
      a(btc.ba, glk::new);
      a(btc.bb, gio.c::new);
      a(btc.bc, glp::new);
      a(btc.bd, glo::new);
      a(btc.be, $$0 -> new gkb($$0, fxb.bH));
      a(btc.bf, glm::new);
      a(btc.bg, glq::new);
      a(btc.bh, glr::new);
      a(btc.bi, glt::new);
      a(btc.bj, glu::new);
      a(btc.bk, glv::new);
      a(btc.bm, glx::new);
      a(btc.bl, glw::new);
      a(btc.bn, gly::new);
      a(btc.bo, glz::new);
      a(btc.bp, gma::new);
      a(btc.bq, gmb::new);
      a(btc.br, gmc::new);
      a(btc.bs, gmd::new);
      a(btc.bt, gme::new);
      a(btc.bu, gmf::new);
      a(btc.bv, $$0 -> new gls($$0, fxb.ch));
      a(btc.bw, gmg::new);
      a(btc.bx, $$0 -> new gkp($$0, fxb.cn, fxb.co, fxb.cp, true));
   }
}
