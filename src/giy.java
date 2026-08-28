import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class giy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bta<?>, gix<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gpz.a, gix<gcn>> c = Map.of(gpz.a.b, $$0 -> new goc($$0, false), gpz.a.a, $$0 -> new goc($$0, true));

   private static <T extends bsu> void a(bta<? extends T> $$0, gix<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bta<?>, giw<?>> a(gix.a $$0) {
      Builder<bta<?>, giw<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((bta<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gpz.a, giw<? extends cmx>> b(gix.a $$0) {
      Builder<gpz.a, giw<? extends cmx>> $$1 = ImmutableMap.builder();
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

      for (bta<?> $$1 : lp.g) {
         if ($$1 != bta.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bta.a, ght::new);
      a(bta.b, gkf::new);
      a(bta.c, ghu::new);
      a(bta.d, ghv::new);
      a(bta.e, gll::new);
      a(bta.f, ghx::new);
      a(bta.g, ghy::new);
      a(bta.h, ghz::new);
      a(bta.i, gia::new);
      a(bta.j, gim.a::new);
      a(bta.k, $$0 -> new gib($$0, false));
      a(bta.l, gic::new);
      a(bta.m, gid::new);
      a(bta.n, glw::new);
      a(bta.p, gif::new);
      a(bta.o, $$0 -> new gie($$0, fwz.v));
      a(bta.q, gig::new);
      a(bta.r, $$0 -> new gib($$0, true));
      a(bta.s, $$0 -> new gkc<>($$0, fwz.y));
      a(bta.t, gii::new);
      a(bta.u, gij::new);
      a(bta.v, $$0 -> new gkc<>($$0, fwz.B));
      a(bta.w, gik::new);
      a(bta.x, gil::new);
      a(bta.y, gin::new);
      a(bta.z, $$0 -> new gih<>($$0, 0.87F, fwz.N));
      a(bta.A, gio::new);
      a(bta.B, gip::new);
      a(bta.C, glj::new);
      a(bta.D, giq::new);
      a(bta.H, git::new);
      a(bta.I, giu::new);
      a(bta.F, gis::new);
      a(bta.G, glj::new);
      a(bta.E, gir::new);
      a(bta.J, gja::new);
      a(bta.K, giz::new);
      a(bta.L, glj::new);
      a(bta.M, gjb::new);
      a(bta.N, $$0 -> new glj<>($$0, 1.0F, true));
      a(bta.O, gjc::new);
      a(bta.ak, $$0 -> new glj<>($$0, 3.0F, true));
      a(bta.P, gjd::new);
      a(bta.bz, gje::new);
      a(bta.Q, gjf::new);
      a(bta.R, gjg::new);
      a(bta.S, $$0 -> new gkc<>($$0, fwz.af));
      a(bta.T, gjh::new);
      a(bta.U, $$0 -> new gji($$0, 6.0F));
      a(bta.V, gju::new);
      a(bta.W, $$0 -> new gjj($$0, new fwc<>($$0.a(fwz.ak))));
      a(bta.X, gjk::new);
      a(bta.Y, gjl::new);
      a(bta.Z, gjm::new);
      a(bta.aa, $$0 -> new gkc<>($$0, fwz.ao));
      a(bta.ab, gjn::new);
      a(bta.ac, gjp::new);
      a(bta.ad, gjr::new);
      a(bta.ae, gkf::new);
      a(bta.af, gjs::new);
      a(bta.ag, gjt::new);
      a(bta.ah, gim.b::new);
      a(bta.ai, gju::new);
      a(bta.aj, gkh::new);
      a(bta.al, gjw::new);
      a(bta.am, gjx::new);
      a(bta.an, $$0 -> new gjz($$0, fwz.ax));
      a(bta.ao, gka::new);
      a(bta.ap, gkb::new);
      a(bta.aq, gkf::new);
      a(bta.ar, $$0 -> new gkc<>($$0, fwz.aB));
      a(bta.as, gke::new);
      a(bta.at, $$0 -> new gih<>($$0, 0.92F, fwz.aD));
      a(bta.au, gkg::new);
      a(bta.av, gki::new);
      a(bta.aw, gkj::new);
      a(bta.ax, gkk::new);
      a(bta.ay, gkl::new);
      a(bta.az, gkm::new);
      a(bta.aA, $$0 -> new gkn($$0, fwz.aJ, fwz.aO, fwz.aP, false));
      a(bta.aB, $$0 -> new gkn($$0, fwz.aK, fwz.aL, fwz.aM, false));
      a(bta.aC, gko::new);
      a(bta.aD, gkp::new);
      a(bta.aE, glj::new);
      a(bta.aF, gkq::new);
      a(bta.aG, gkr::new);
      a(bta.aH, gks::new);
      a(bta.aI, gku::new);
      a(bta.aJ, gkv::new);
      a(bta.aK, gkx::new);
      a(bta.aL, gkw::new);
      a(bta.aM, gky::new);
      a(bta.aN, gkz::new);
      a(bta.aO, $$0 -> new glq($$0, fwz.bo));
      a(bta.aP, gla::new);
      a(bta.aQ, $$0 -> new glj<>($$0, 0.75F, true));
      a(bta.aR, glb::new);
      a(bta.aT, glj::new);
      a(bta.aS, glc::new);
      a(bta.aU, $$0 -> new gkc<>($$0, fwz.bw));
      a(bta.aV, gld::new);
      a(bta.aW, gle::new);
      a(bta.aX, $$0 -> new glf<>($$0, new fwc<>($$0.a(fwz.by))));
      a(bta.aY, glg::new);
      a(bta.aZ, glh::new);
      a(bta.ba, gli::new);
      a(bta.bb, gim.c::new);
      a(bta.bc, gln::new);
      a(bta.bd, glm::new);
      a(bta.be, $$0 -> new gjz($$0, fwz.bH));
      a(bta.bf, glk::new);
      a(bta.bg, glo::new);
      a(bta.bh, glp::new);
      a(bta.bi, glr::new);
      a(bta.bj, gls::new);
      a(bta.bk, glt::new);
      a(bta.bm, glv::new);
      a(bta.bl, glu::new);
      a(bta.bn, glw::new);
      a(bta.bo, glx::new);
      a(bta.bp, gly::new);
      a(bta.bq, glz::new);
      a(bta.br, gma::new);
      a(bta.bs, gmb::new);
      a(bta.bt, gmc::new);
      a(bta.bu, gmd::new);
      a(bta.bv, $$0 -> new glq($$0, fwz.ch));
      a(bta.bw, gme::new);
      a(bta.bx, $$0 -> new gkn($$0, fwz.cn, fwz.co, fwz.cp, true));
   }
}
