import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class giz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btb<?>, giy<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gqa.a, giy<gco>> c = Map.of(gqa.a.b, $$0 -> new god($$0, false), gqa.a.a, $$0 -> new god($$0, true));

   private static <T extends bsv> void a(btb<? extends T> $$0, giy<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<btb<?>, gix<?>> a(giy.a $$0) {
      Builder<btb<?>, gix<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((btb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gqa.a, gix<? extends cmy>> b(giy.a $$0) {
      Builder<gqa.a, gix<? extends cmy>> $$1 = ImmutableMap.builder();
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

      for (btb<?> $$1 : lp.g) {
         if ($$1 != btb.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(btb.a, ghu::new);
      a(btb.b, gkg::new);
      a(btb.c, ghv::new);
      a(btb.d, ghw::new);
      a(btb.e, glm::new);
      a(btb.f, ghy::new);
      a(btb.g, ghz::new);
      a(btb.h, gia::new);
      a(btb.i, gib::new);
      a(btb.j, gin.a::new);
      a(btb.k, $$0 -> new gic($$0, false));
      a(btb.l, gid::new);
      a(btb.m, gie::new);
      a(btb.n, glx::new);
      a(btb.p, gig::new);
      a(btb.o, $$0 -> new gif($$0, fxa.v));
      a(btb.q, gih::new);
      a(btb.r, $$0 -> new gic($$0, true));
      a(btb.s, $$0 -> new gkd<>($$0, fxa.y));
      a(btb.t, gij::new);
      a(btb.u, gik::new);
      a(btb.v, $$0 -> new gkd<>($$0, fxa.B));
      a(btb.w, gil::new);
      a(btb.x, gim::new);
      a(btb.y, gio::new);
      a(btb.z, $$0 -> new gii<>($$0, 0.87F, fxa.N));
      a(btb.A, gip::new);
      a(btb.B, giq::new);
      a(btb.C, glk::new);
      a(btb.D, gir::new);
      a(btb.H, giu::new);
      a(btb.I, giv::new);
      a(btb.F, git::new);
      a(btb.G, glk::new);
      a(btb.E, gis::new);
      a(btb.J, gjb::new);
      a(btb.K, gja::new);
      a(btb.L, glk::new);
      a(btb.M, gjc::new);
      a(btb.N, $$0 -> new glk<>($$0, 1.0F, true));
      a(btb.O, gjd::new);
      a(btb.ak, $$0 -> new glk<>($$0, 3.0F, true));
      a(btb.P, gje::new);
      a(btb.bz, gjf::new);
      a(btb.Q, gjg::new);
      a(btb.R, gjh::new);
      a(btb.S, $$0 -> new gkd<>($$0, fxa.af));
      a(btb.T, gji::new);
      a(btb.U, $$0 -> new gjj($$0, 6.0F));
      a(btb.V, gjv::new);
      a(btb.W, $$0 -> new gjk($$0, new fwd<>($$0.a(fxa.ak))));
      a(btb.X, gjl::new);
      a(btb.Y, gjm::new);
      a(btb.Z, gjn::new);
      a(btb.aa, $$0 -> new gkd<>($$0, fxa.ao));
      a(btb.ab, gjo::new);
      a(btb.ac, gjq::new);
      a(btb.ad, gjs::new);
      a(btb.ae, gkg::new);
      a(btb.af, gjt::new);
      a(btb.ag, gju::new);
      a(btb.ah, gin.b::new);
      a(btb.ai, gjv::new);
      a(btb.aj, gki::new);
      a(btb.al, gjx::new);
      a(btb.am, gjy::new);
      a(btb.an, $$0 -> new gka($$0, fxa.ax));
      a(btb.ao, gkb::new);
      a(btb.ap, gkc::new);
      a(btb.aq, gkg::new);
      a(btb.ar, $$0 -> new gkd<>($$0, fxa.aB));
      a(btb.as, gkf::new);
      a(btb.at, $$0 -> new gii<>($$0, 0.92F, fxa.aD));
      a(btb.au, gkh::new);
      a(btb.av, gkj::new);
      a(btb.aw, gkk::new);
      a(btb.ax, gkl::new);
      a(btb.ay, gkm::new);
      a(btb.az, gkn::new);
      a(btb.aA, $$0 -> new gko($$0, fxa.aJ, fxa.aO, fxa.aP, false));
      a(btb.aB, $$0 -> new gko($$0, fxa.aK, fxa.aL, fxa.aM, false));
      a(btb.aC, gkp::new);
      a(btb.aD, gkq::new);
      a(btb.aE, glk::new);
      a(btb.aF, gkr::new);
      a(btb.aG, gks::new);
      a(btb.aH, gkt::new);
      a(btb.aI, gkv::new);
      a(btb.aJ, gkw::new);
      a(btb.aK, gky::new);
      a(btb.aL, gkx::new);
      a(btb.aM, gkz::new);
      a(btb.aN, gla::new);
      a(btb.aO, $$0 -> new glr($$0, fxa.bo));
      a(btb.aP, glb::new);
      a(btb.aQ, $$0 -> new glk<>($$0, 0.75F, true));
      a(btb.aR, glc::new);
      a(btb.aT, glk::new);
      a(btb.aS, gld::new);
      a(btb.aU, $$0 -> new gkd<>($$0, fxa.bw));
      a(btb.aV, gle::new);
      a(btb.aW, glf::new);
      a(btb.aX, $$0 -> new glg<>($$0, new fwd<>($$0.a(fxa.by))));
      a(btb.aY, glh::new);
      a(btb.aZ, gli::new);
      a(btb.ba, glj::new);
      a(btb.bb, gin.c::new);
      a(btb.bc, glo::new);
      a(btb.bd, gln::new);
      a(btb.be, $$0 -> new gka($$0, fxa.bH));
      a(btb.bf, gll::new);
      a(btb.bg, glp::new);
      a(btb.bh, glq::new);
      a(btb.bi, gls::new);
      a(btb.bj, glt::new);
      a(btb.bk, glu::new);
      a(btb.bm, glw::new);
      a(btb.bl, glv::new);
      a(btb.bn, glx::new);
      a(btb.bo, gly::new);
      a(btb.bp, glz::new);
      a(btb.bq, gma::new);
      a(btb.br, gmb::new);
      a(btb.bs, gmc::new);
      a(btb.bt, gmd::new);
      a(btb.bu, gme::new);
      a(btb.bv, $$0 -> new glr($$0, fxa.ch));
      a(btb.bw, gmf::new);
      a(btb.bx, $$0 -> new gko($$0, fxa.cn, fxa.co, fxa.cp, true));
   }
}
