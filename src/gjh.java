import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gjh {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsj<?>, gjg<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gqi.a, gjg<gcw>> c = Map.of(gqi.a.b, $$0 -> new gol($$0, false), gqi.a.a, $$0 -> new gol($$0, true));

   private static <T extends bsd> void a(bsj<? extends T> $$0, gjg<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsj<?>, gjf<?>> a(gjg.a $$0) {
      Builder<bsj<?>, gjf<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lq.f.b((bsj<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gqi.a, gjf<? extends cmh>> b(gjg.a $$0) {
      Builder<gqi.a, gjf<? extends cmh>> $$1 = ImmutableMap.builder();
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

      for (bsj<?> $$1 : lq.f) {
         if ($$1 != bsj.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lq.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsj.a, gic::new);
      a(bsj.b, gko::new);
      a(bsj.c, gid::new);
      a(bsj.d, gie::new);
      a(bsj.e, glu::new);
      a(bsj.f, gig::new);
      a(bsj.g, gih::new);
      a(bsj.h, gii::new);
      a(bsj.i, gij::new);
      a(bsj.j, giv.a::new);
      a(bsj.k, $$0 -> new gik($$0, false));
      a(bsj.l, gil::new);
      a(bsj.m, gim::new);
      a(bsj.n, gmf::new);
      a(bsj.p, gio::new);
      a(bsj.o, $$0 -> new gin($$0, fxh.v));
      a(bsj.q, gip::new);
      a(bsj.r, $$0 -> new gik($$0, true));
      a(bsj.s, $$0 -> new gkl<>($$0, fxh.y));
      a(bsj.t, gir::new);
      a(bsj.u, gis::new);
      a(bsj.v, $$0 -> new gkl<>($$0, fxh.B));
      a(bsj.w, git::new);
      a(bsj.x, giu::new);
      a(bsj.y, giw::new);
      a(bsj.z, $$0 -> new giq<>($$0, 0.87F, fxh.N));
      a(bsj.A, gix::new);
      a(bsj.B, giy::new);
      a(bsj.C, gls::new);
      a(bsj.D, giz::new);
      a(bsj.H, gjc::new);
      a(bsj.I, gjd::new);
      a(bsj.F, gjb::new);
      a(bsj.G, gls::new);
      a(bsj.E, gja::new);
      a(bsj.J, gjj::new);
      a(bsj.K, gji::new);
      a(bsj.L, gls::new);
      a(bsj.M, gjk::new);
      a(bsj.N, $$0 -> new gls<>($$0, 1.0F, true));
      a(bsj.O, gjl::new);
      a(bsj.ak, $$0 -> new gls<>($$0, 3.0F, true));
      a(bsj.P, gjm::new);
      a(bsj.bz, gjn::new);
      a(bsj.Q, gjo::new);
      a(bsj.R, gjp::new);
      a(bsj.S, $$0 -> new gkl<>($$0, fxh.af));
      a(bsj.T, gjq::new);
      a(bsj.U, $$0 -> new gjr($$0, 6.0F));
      a(bsj.V, gkd::new);
      a(bsj.W, $$0 -> new gjs($$0, new fwk<>($$0.a(fxh.ak))));
      a(bsj.X, gjt::new);
      a(bsj.Y, gju::new);
      a(bsj.Z, gjv::new);
      a(bsj.aa, $$0 -> new gkl<>($$0, fxh.ao));
      a(bsj.ab, gjw::new);
      a(bsj.ac, gjy::new);
      a(bsj.ad, gka::new);
      a(bsj.ae, gko::new);
      a(bsj.af, gkb::new);
      a(bsj.ag, gkc::new);
      a(bsj.ah, giv.b::new);
      a(bsj.ai, gkd::new);
      a(bsj.aj, gkq::new);
      a(bsj.al, gkf::new);
      a(bsj.am, gkg::new);
      a(bsj.an, $$0 -> new gki($$0, fxh.ax));
      a(bsj.ao, gkj::new);
      a(bsj.ap, gkk::new);
      a(bsj.aq, gko::new);
      a(bsj.ar, $$0 -> new gkl<>($$0, fxh.aB));
      a(bsj.as, gkn::new);
      a(bsj.at, $$0 -> new giq<>($$0, 0.92F, fxh.aD));
      a(bsj.au, gkp::new);
      a(bsj.av, gkr::new);
      a(bsj.aw, gks::new);
      a(bsj.ax, gkt::new);
      a(bsj.ay, gku::new);
      a(bsj.az, gkv::new);
      a(bsj.aA, $$0 -> new gkw($$0, fxh.aJ, fxh.aO, fxh.aP, false));
      a(bsj.aB, $$0 -> new gkw($$0, fxh.aK, fxh.aL, fxh.aM, false));
      a(bsj.aC, gkx::new);
      a(bsj.aD, gky::new);
      a(bsj.aE, gls::new);
      a(bsj.aF, gkz::new);
      a(bsj.aG, gla::new);
      a(bsj.aH, glb::new);
      a(bsj.aI, gld::new);
      a(bsj.aJ, gle::new);
      a(bsj.aK, glg::new);
      a(bsj.aL, glf::new);
      a(bsj.aM, glh::new);
      a(bsj.aN, gli::new);
      a(bsj.aO, $$0 -> new glz($$0, fxh.bo));
      a(bsj.aP, glj::new);
      a(bsj.aQ, $$0 -> new gls<>($$0, 0.75F, true));
      a(bsj.aR, glk::new);
      a(bsj.aT, gls::new);
      a(bsj.aS, gll::new);
      a(bsj.aU, $$0 -> new gkl<>($$0, fxh.bw));
      a(bsj.aV, glm::new);
      a(bsj.aW, gln::new);
      a(bsj.aX, $$0 -> new glo<>($$0, new fwk<>($$0.a(fxh.by))));
      a(bsj.aY, glp::new);
      a(bsj.aZ, glq::new);
      a(bsj.ba, glr::new);
      a(bsj.bb, giv.c::new);
      a(bsj.bc, glw::new);
      a(bsj.bd, glv::new);
      a(bsj.be, $$0 -> new gki($$0, fxh.bH));
      a(bsj.bf, glt::new);
      a(bsj.bg, glx::new);
      a(bsj.bh, gly::new);
      a(bsj.bi, gma::new);
      a(bsj.bj, gmb::new);
      a(bsj.bk, gmc::new);
      a(bsj.bm, gme::new);
      a(bsj.bl, gmd::new);
      a(bsj.bn, gmf::new);
      a(bsj.bo, gmg::new);
      a(bsj.bp, gmh::new);
      a(bsj.bq, gmi::new);
      a(bsj.br, gmj::new);
      a(bsj.bs, gmk::new);
      a(bsj.bt, gml::new);
      a(bsj.bu, gmm::new);
      a(bsj.bv, $$0 -> new glz($$0, fxh.ch));
      a(bsj.bw, gmn::new);
      a(bsj.bx, $$0 -> new gkw($$0, fxh.cn, fxh.co, fxh.cp, true));
   }
}
