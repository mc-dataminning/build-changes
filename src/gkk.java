import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gkk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsx<?>, gkj<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<grl.a, gkj<gdy>> c = Map.of(grl.a.b, $$0 -> new gpo($$0, false), grl.a.a, $$0 -> new gpo($$0, true));

   private static <T extends bsr> void a(bsx<? extends T> $$0, gkj<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsx<?>, gki<?>> a(gkj.a $$0) {
      Builder<bsx<?>, gki<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lt.f.b((bsx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<grl.a, gki<? extends cmx>> b(gkj.a $$0) {
      Builder<grl.a, gki<? extends cmx>> $$1 = ImmutableMap.builder();
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

      for (bsx<?> $$1 : lt.f) {
         if ($$1 != bsx.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lt.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsx.a, gjf::new);
      a(bsx.b, glr::new);
      a(bsx.c, gjg::new);
      a(bsx.d, gjh::new);
      a(bsx.e, gmx::new);
      a(bsx.f, gjj::new);
      a(bsx.g, gjk::new);
      a(bsx.h, gjl::new);
      a(bsx.i, gjm::new);
      a(bsx.j, gjy.a::new);
      a(bsx.k, $$0 -> new gjn($$0, false));
      a(bsx.l, gjo::new);
      a(bsx.m, gjp::new);
      a(bsx.n, gni::new);
      a(bsx.p, gjr::new);
      a(bsx.o, $$0 -> new gjq($$0, fyj.w));
      a(bsx.q, gjs::new);
      a(bsx.r, $$0 -> new gjn($$0, true));
      a(bsx.s, $$0 -> new glo<>($$0, fyj.z));
      a(bsx.t, gju::new);
      a(bsx.u, gjv::new);
      a(bsx.v, $$0 -> new glo<>($$0, fyj.C));
      a(bsx.w, gjw::new);
      a(bsx.x, gjx::new);
      a(bsx.y, gjz::new);
      a(bsx.z, $$0 -> new gjt<>($$0, 0.87F, fyj.O));
      a(bsx.A, gka::new);
      a(bsx.B, gkb::new);
      a(bsx.C, gmv::new);
      a(bsx.D, gkc::new);
      a(bsx.H, gkf::new);
      a(bsx.I, gkg::new);
      a(bsx.F, gke::new);
      a(bsx.G, gmv::new);
      a(bsx.E, gkd::new);
      a(bsx.J, gkm::new);
      a(bsx.K, gkl::new);
      a(bsx.L, gmv::new);
      a(bsx.M, gkn::new);
      a(bsx.N, $$0 -> new gmv<>($$0, 1.0F, true));
      a(bsx.O, gko::new);
      a(bsx.ak, $$0 -> new gmv<>($$0, 3.0F, true));
      a(bsx.P, gkp::new);
      a(bsx.bz, gkq::new);
      a(bsx.Q, gkr::new);
      a(bsx.R, gks::new);
      a(bsx.S, $$0 -> new glo<>($$0, fyj.ag));
      a(bsx.T, gkt::new);
      a(bsx.U, $$0 -> new gku($$0, 6.0F));
      a(bsx.V, glg::new);
      a(bsx.W, $$0 -> new gkv($$0, new fxm<>($$0.a(fyj.al))));
      a(bsx.X, gkw::new);
      a(bsx.Y, gkx::new);
      a(bsx.Z, gky::new);
      a(bsx.aa, $$0 -> new glo<>($$0, fyj.ap));
      a(bsx.ab, gkz::new);
      a(bsx.ac, glb::new);
      a(bsx.ad, gld::new);
      a(bsx.ae, glr::new);
      a(bsx.af, gle::new);
      a(bsx.ag, glf::new);
      a(bsx.ah, gjy.b::new);
      a(bsx.ai, glg::new);
      a(bsx.aj, glt::new);
      a(bsx.al, gli::new);
      a(bsx.am, glj::new);
      a(bsx.an, $$0 -> new gll($$0, fyj.ay));
      a(bsx.ao, glm::new);
      a(bsx.ap, gln::new);
      a(bsx.aq, glr::new);
      a(bsx.ar, $$0 -> new glo<>($$0, fyj.aC));
      a(bsx.as, glq::new);
      a(bsx.at, $$0 -> new gjt<>($$0, 0.92F, fyj.aE));
      a(bsx.au, gls::new);
      a(bsx.av, glu::new);
      a(bsx.aw, glv::new);
      a(bsx.ax, glw::new);
      a(bsx.ay, glx::new);
      a(bsx.az, gly::new);
      a(bsx.aA, $$0 -> new glz($$0, fyj.aK, fyj.aP, fyj.aQ, false));
      a(bsx.aB, $$0 -> new glz($$0, fyj.aL, fyj.aM, fyj.aN, false));
      a(bsx.aC, gma::new);
      a(bsx.aD, gmb::new);
      a(bsx.aE, gmv::new);
      a(bsx.aF, gmc::new);
      a(bsx.aG, gmd::new);
      a(bsx.aH, gme::new);
      a(bsx.aI, gmg::new);
      a(bsx.aJ, gmh::new);
      a(bsx.aK, gmj::new);
      a(bsx.aL, gmi::new);
      a(bsx.aM, gmk::new);
      a(bsx.aN, gml::new);
      a(bsx.aO, $$0 -> new gnc($$0, fyj.bp));
      a(bsx.aP, gmm::new);
      a(bsx.aQ, $$0 -> new gmv<>($$0, 0.75F, true));
      a(bsx.aR, gmn::new);
      a(bsx.aT, gmv::new);
      a(bsx.aS, gmo::new);
      a(bsx.aU, $$0 -> new glo<>($$0, fyj.bx));
      a(bsx.aV, gmp::new);
      a(bsx.aW, gmq::new);
      a(bsx.aX, $$0 -> new gmr<>($$0, new fxm<>($$0.a(fyj.bz))));
      a(bsx.aY, gms::new);
      a(bsx.aZ, gmt::new);
      a(bsx.ba, gmu::new);
      a(bsx.bb, gjy.c::new);
      a(bsx.bc, gmz::new);
      a(bsx.bd, gmy::new);
      a(bsx.be, $$0 -> new gll($$0, fyj.bI));
      a(bsx.bf, gmw::new);
      a(bsx.bg, gna::new);
      a(bsx.bh, gnb::new);
      a(bsx.bi, gnd::new);
      a(bsx.bj, gne::new);
      a(bsx.bk, gnf::new);
      a(bsx.bm, gnh::new);
      a(bsx.bl, gng::new);
      a(bsx.bn, gni::new);
      a(bsx.bo, gnj::new);
      a(bsx.bp, gnk::new);
      a(bsx.bq, gnl::new);
      a(bsx.br, gnm::new);
      a(bsx.bs, gnn::new);
      a(bsx.bt, gno::new);
      a(bsx.bu, gnp::new);
      a(bsx.bv, $$0 -> new gnc($$0, fyj.ci));
      a(bsx.bw, gnq::new);
      a(bsx.bx, $$0 -> new glz($$0, fyj.co, fyj.cp, fyj.cq, true));
   }
}
