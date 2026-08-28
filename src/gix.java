import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gix {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsz<?>, giw<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gpy.a, giw<gcm>> c = Map.of(gpy.a.b, $$0 -> new gob($$0, false), gpy.a.a, $$0 -> new gob($$0, true));

   private static <T extends bst> void a(bsz<? extends T> $$0, giw<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsz<?>, giv<?>> a(giw.a $$0) {
      Builder<bsz<?>, giv<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((bsz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gpy.a, giv<? extends cmw>> b(giw.a $$0) {
      Builder<gpy.a, giv<? extends cmw>> $$1 = ImmutableMap.builder();
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

      for (bsz<?> $$1 : lp.g) {
         if ($$1 != bsz.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsz.a, ghs::new);
      a(bsz.b, gke::new);
      a(bsz.c, ght::new);
      a(bsz.d, ghu::new);
      a(bsz.e, glk::new);
      a(bsz.f, ghw::new);
      a(bsz.g, ghx::new);
      a(bsz.h, ghy::new);
      a(bsz.i, ghz::new);
      a(bsz.j, gil.a::new);
      a(bsz.k, $$0 -> new gia($$0, false));
      a(bsz.l, gib::new);
      a(bsz.m, gic::new);
      a(bsz.n, glv::new);
      a(bsz.p, gie::new);
      a(bsz.o, $$0 -> new gid($$0, fwy.v));
      a(bsz.q, gif::new);
      a(bsz.r, $$0 -> new gia($$0, true));
      a(bsz.s, $$0 -> new gkb<>($$0, fwy.y));
      a(bsz.t, gih::new);
      a(bsz.u, gii::new);
      a(bsz.v, $$0 -> new gkb<>($$0, fwy.B));
      a(bsz.w, gij::new);
      a(bsz.x, gik::new);
      a(bsz.y, gim::new);
      a(bsz.z, $$0 -> new gig<>($$0, 0.87F, fwy.N));
      a(bsz.A, gin::new);
      a(bsz.B, gio::new);
      a(bsz.C, gli::new);
      a(bsz.D, gip::new);
      a(bsz.H, gis::new);
      a(bsz.I, git::new);
      a(bsz.F, gir::new);
      a(bsz.G, gli::new);
      a(bsz.E, giq::new);
      a(bsz.J, giz::new);
      a(bsz.K, giy::new);
      a(bsz.L, gli::new);
      a(bsz.M, gja::new);
      a(bsz.N, $$0 -> new gli<>($$0, 1.0F, true));
      a(bsz.O, gjb::new);
      a(bsz.ak, $$0 -> new gli<>($$0, 3.0F, true));
      a(bsz.P, gjc::new);
      a(bsz.bz, gjd::new);
      a(bsz.Q, gje::new);
      a(bsz.R, gjf::new);
      a(bsz.S, $$0 -> new gkb<>($$0, fwy.af));
      a(bsz.T, gjg::new);
      a(bsz.U, $$0 -> new gjh($$0, 6.0F));
      a(bsz.V, gjt::new);
      a(bsz.W, $$0 -> new gji($$0, new fwb<>($$0.a(fwy.ak))));
      a(bsz.X, gjj::new);
      a(bsz.Y, gjk::new);
      a(bsz.Z, gjl::new);
      a(bsz.aa, $$0 -> new gkb<>($$0, fwy.ao));
      a(bsz.ab, gjm::new);
      a(bsz.ac, gjo::new);
      a(bsz.ad, gjq::new);
      a(bsz.ae, gke::new);
      a(bsz.af, gjr::new);
      a(bsz.ag, gjs::new);
      a(bsz.ah, gil.b::new);
      a(bsz.ai, gjt::new);
      a(bsz.aj, gkg::new);
      a(bsz.al, gjv::new);
      a(bsz.am, gjw::new);
      a(bsz.an, $$0 -> new gjy($$0, fwy.ax));
      a(bsz.ao, gjz::new);
      a(bsz.ap, gka::new);
      a(bsz.aq, gke::new);
      a(bsz.ar, $$0 -> new gkb<>($$0, fwy.aB));
      a(bsz.as, gkd::new);
      a(bsz.at, $$0 -> new gig<>($$0, 0.92F, fwy.aD));
      a(bsz.au, gkf::new);
      a(bsz.av, gkh::new);
      a(bsz.aw, gki::new);
      a(bsz.ax, gkj::new);
      a(bsz.ay, gkk::new);
      a(bsz.az, gkl::new);
      a(bsz.aA, $$0 -> new gkm($$0, fwy.aJ, fwy.aO, fwy.aP, false));
      a(bsz.aB, $$0 -> new gkm($$0, fwy.aK, fwy.aL, fwy.aM, false));
      a(bsz.aC, gkn::new);
      a(bsz.aD, gko::new);
      a(bsz.aE, gli::new);
      a(bsz.aF, gkp::new);
      a(bsz.aG, gkq::new);
      a(bsz.aH, gkr::new);
      a(bsz.aI, gkt::new);
      a(bsz.aJ, gku::new);
      a(bsz.aK, gkw::new);
      a(bsz.aL, gkv::new);
      a(bsz.aM, gkx::new);
      a(bsz.aN, gky::new);
      a(bsz.aO, $$0 -> new glp($$0, fwy.bo));
      a(bsz.aP, gkz::new);
      a(bsz.aQ, $$0 -> new gli<>($$0, 0.75F, true));
      a(bsz.aR, gla::new);
      a(bsz.aT, gli::new);
      a(bsz.aS, glb::new);
      a(bsz.aU, $$0 -> new gkb<>($$0, fwy.bw));
      a(bsz.aV, glc::new);
      a(bsz.aW, gld::new);
      a(bsz.aX, $$0 -> new gle<>($$0, new fwb<>($$0.a(fwy.by))));
      a(bsz.aY, glf::new);
      a(bsz.aZ, glg::new);
      a(bsz.ba, glh::new);
      a(bsz.bb, gil.c::new);
      a(bsz.bc, glm::new);
      a(bsz.bd, gll::new);
      a(bsz.be, $$0 -> new gjy($$0, fwy.bH));
      a(bsz.bf, glj::new);
      a(bsz.bg, gln::new);
      a(bsz.bh, glo::new);
      a(bsz.bi, glq::new);
      a(bsz.bj, glr::new);
      a(bsz.bk, gls::new);
      a(bsz.bm, glu::new);
      a(bsz.bl, glt::new);
      a(bsz.bn, glv::new);
      a(bsz.bo, glw::new);
      a(bsz.bp, glx::new);
      a(bsz.bq, gly::new);
      a(bsz.br, glz::new);
      a(bsz.bs, gma::new);
      a(bsz.bt, gmb::new);
      a(bsz.bu, gmc::new);
      a(bsz.bv, $$0 -> new glp($$0, fwy.ch));
      a(bsz.bw, gmd::new);
      a(bsz.bx, $$0 -> new gkm($$0, fwy.cn, fwy.co, fwy.cp, true));
   }
}
