import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gki {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsx<?>, gkh<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<grj.a, gkh<gdw>> c = Map.of(grj.a.b, $$0 -> new gpm($$0, false), grj.a.a, $$0 -> new gpm($$0, true));

   private static <T extends bsr> void a(bsx<? extends T> $$0, gkh<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsx<?>, gkg<?>> a(gkh.a $$0) {
      Builder<bsx<?>, gkg<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lt.f.b((bsx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<grj.a, gkg<? extends cmx>> b(gkh.a $$0) {
      Builder<grj.a, gkg<? extends cmx>> $$1 = ImmutableMap.builder();
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
      a(bsx.a, gjd::new);
      a(bsx.b, glp::new);
      a(bsx.c, gje::new);
      a(bsx.d, gjf::new);
      a(bsx.e, gmv::new);
      a(bsx.f, gjh::new);
      a(bsx.g, gji::new);
      a(bsx.h, gjj::new);
      a(bsx.i, gjk::new);
      a(bsx.j, gjw.a::new);
      a(bsx.k, $$0 -> new gjl($$0, false));
      a(bsx.l, gjm::new);
      a(bsx.m, gjn::new);
      a(bsx.n, gng::new);
      a(bsx.p, gjp::new);
      a(bsx.o, $$0 -> new gjo($$0, fyh.w));
      a(bsx.q, gjq::new);
      a(bsx.r, $$0 -> new gjl($$0, true));
      a(bsx.s, $$0 -> new glm<>($$0, fyh.z));
      a(bsx.t, gjs::new);
      a(bsx.u, gjt::new);
      a(bsx.v, $$0 -> new glm<>($$0, fyh.C));
      a(bsx.w, gju::new);
      a(bsx.x, gjv::new);
      a(bsx.y, gjx::new);
      a(bsx.z, $$0 -> new gjr<>($$0, 0.87F, fyh.O));
      a(bsx.A, gjy::new);
      a(bsx.B, gjz::new);
      a(bsx.C, gmt::new);
      a(bsx.D, gka::new);
      a(bsx.H, gkd::new);
      a(bsx.I, gke::new);
      a(bsx.F, gkc::new);
      a(bsx.G, gmt::new);
      a(bsx.E, gkb::new);
      a(bsx.J, gkk::new);
      a(bsx.K, gkj::new);
      a(bsx.L, gmt::new);
      a(bsx.M, gkl::new);
      a(bsx.N, $$0 -> new gmt<>($$0, 1.0F, true));
      a(bsx.O, gkm::new);
      a(bsx.ak, $$0 -> new gmt<>($$0, 3.0F, true));
      a(bsx.P, gkn::new);
      a(bsx.bz, gko::new);
      a(bsx.Q, gkp::new);
      a(bsx.R, gkq::new);
      a(bsx.S, $$0 -> new glm<>($$0, fyh.ag));
      a(bsx.T, gkr::new);
      a(bsx.U, $$0 -> new gks($$0, 6.0F));
      a(bsx.V, gle::new);
      a(bsx.W, $$0 -> new gkt($$0, new fxk<>($$0.a(fyh.al))));
      a(bsx.X, gku::new);
      a(bsx.Y, gkv::new);
      a(bsx.Z, gkw::new);
      a(bsx.aa, $$0 -> new glm<>($$0, fyh.ap));
      a(bsx.ab, gkx::new);
      a(bsx.ac, gkz::new);
      a(bsx.ad, glb::new);
      a(bsx.ae, glp::new);
      a(bsx.af, glc::new);
      a(bsx.ag, gld::new);
      a(bsx.ah, gjw.b::new);
      a(bsx.ai, gle::new);
      a(bsx.aj, glr::new);
      a(bsx.al, glg::new);
      a(bsx.am, glh::new);
      a(bsx.an, $$0 -> new glj($$0, fyh.ay));
      a(bsx.ao, glk::new);
      a(bsx.ap, gll::new);
      a(bsx.aq, glp::new);
      a(bsx.ar, $$0 -> new glm<>($$0, fyh.aC));
      a(bsx.as, glo::new);
      a(bsx.at, $$0 -> new gjr<>($$0, 0.92F, fyh.aE));
      a(bsx.au, glq::new);
      a(bsx.av, gls::new);
      a(bsx.aw, glt::new);
      a(bsx.ax, glu::new);
      a(bsx.ay, glv::new);
      a(bsx.az, glw::new);
      a(bsx.aA, $$0 -> new glx($$0, fyh.aK, fyh.aP, fyh.aQ, false));
      a(bsx.aB, $$0 -> new glx($$0, fyh.aL, fyh.aM, fyh.aN, false));
      a(bsx.aC, gly::new);
      a(bsx.aD, glz::new);
      a(bsx.aE, gmt::new);
      a(bsx.aF, gma::new);
      a(bsx.aG, gmb::new);
      a(bsx.aH, gmc::new);
      a(bsx.aI, gme::new);
      a(bsx.aJ, gmf::new);
      a(bsx.aK, gmh::new);
      a(bsx.aL, gmg::new);
      a(bsx.aM, gmi::new);
      a(bsx.aN, gmj::new);
      a(bsx.aO, $$0 -> new gna($$0, fyh.bp));
      a(bsx.aP, gmk::new);
      a(bsx.aQ, $$0 -> new gmt<>($$0, 0.75F, true));
      a(bsx.aR, gml::new);
      a(bsx.aT, gmt::new);
      a(bsx.aS, gmm::new);
      a(bsx.aU, $$0 -> new glm<>($$0, fyh.bx));
      a(bsx.aV, gmn::new);
      a(bsx.aW, gmo::new);
      a(bsx.aX, $$0 -> new gmp<>($$0, new fxk<>($$0.a(fyh.bz))));
      a(bsx.aY, gmq::new);
      a(bsx.aZ, gmr::new);
      a(bsx.ba, gms::new);
      a(bsx.bb, gjw.c::new);
      a(bsx.bc, gmx::new);
      a(bsx.bd, gmw::new);
      a(bsx.be, $$0 -> new glj($$0, fyh.bI));
      a(bsx.bf, gmu::new);
      a(bsx.bg, gmy::new);
      a(bsx.bh, gmz::new);
      a(bsx.bi, gnb::new);
      a(bsx.bj, gnc::new);
      a(bsx.bk, gnd::new);
      a(bsx.bm, gnf::new);
      a(bsx.bl, gne::new);
      a(bsx.bn, gng::new);
      a(bsx.bo, gnh::new);
      a(bsx.bp, gni::new);
      a(bsx.bq, gnj::new);
      a(bsx.br, gnk::new);
      a(bsx.bs, gnl::new);
      a(bsx.bt, gnm::new);
      a(bsx.bu, gnn::new);
      a(bsx.bv, $$0 -> new gna($$0, fyh.ci));
      a(bsx.bw, gno::new);
      a(bsx.bx, $$0 -> new glx($$0, fyh.co, fyh.cp, fyh.cq, true));
   }
}
