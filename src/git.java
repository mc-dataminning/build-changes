import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class git {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsv<?>, gis<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gpu.a, gis<gci>> c = Map.of(gpu.a.b, $$0 -> new gnx($$0, false), gpu.a.a, $$0 -> new gnx($$0, true));

   private static <T extends bsp> void a(bsv<? extends T> $$0, gis<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsv<?>, gir<?>> a(gis.a $$0) {
      Builder<bsv<?>, gir<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((bsv<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gpu.a, gir<? extends cms>> b(gis.a $$0) {
      Builder<gpu.a, gir<? extends cms>> $$1 = ImmutableMap.builder();
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

      for (bsv<?> $$1 : lp.g) {
         if ($$1 != bsv.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsv.a, gho::new);
      a(bsv.b, gka::new);
      a(bsv.c, ghp::new);
      a(bsv.d, ghq::new);
      a(bsv.e, glg::new);
      a(bsv.f, ghs::new);
      a(bsv.g, ght::new);
      a(bsv.h, ghu::new);
      a(bsv.i, ghv::new);
      a(bsv.j, gih.a::new);
      a(bsv.k, $$0 -> new ghw($$0, false));
      a(bsv.l, ghx::new);
      a(bsv.m, ghy::new);
      a(bsv.n, glr::new);
      a(bsv.p, gia::new);
      a(bsv.o, $$0 -> new ghz($$0, fwu.v));
      a(bsv.q, gib::new);
      a(bsv.r, $$0 -> new ghw($$0, true));
      a(bsv.s, $$0 -> new gjx<>($$0, fwu.y));
      a(bsv.t, gid::new);
      a(bsv.u, gie::new);
      a(bsv.v, $$0 -> new gjx<>($$0, fwu.B));
      a(bsv.w, gif::new);
      a(bsv.x, gig::new);
      a(bsv.y, gii::new);
      a(bsv.z, $$0 -> new gic<>($$0, 0.87F, fwu.N));
      a(bsv.A, gij::new);
      a(bsv.B, gik::new);
      a(bsv.C, gle::new);
      a(bsv.D, gil::new);
      a(bsv.H, gio::new);
      a(bsv.I, gip::new);
      a(bsv.F, gin::new);
      a(bsv.G, gle::new);
      a(bsv.E, gim::new);
      a(bsv.J, giv::new);
      a(bsv.K, giu::new);
      a(bsv.L, gle::new);
      a(bsv.M, giw::new);
      a(bsv.N, $$0 -> new gle<>($$0, 1.0F, true));
      a(bsv.O, gix::new);
      a(bsv.ak, $$0 -> new gle<>($$0, 3.0F, true));
      a(bsv.P, giy::new);
      a(bsv.bz, giz::new);
      a(bsv.Q, gja::new);
      a(bsv.R, gjb::new);
      a(bsv.S, $$0 -> new gjx<>($$0, fwu.af));
      a(bsv.T, gjc::new);
      a(bsv.U, $$0 -> new gjd($$0, 6.0F));
      a(bsv.V, gjp::new);
      a(bsv.W, $$0 -> new gje($$0, new fvx<>($$0.a(fwu.ak))));
      a(bsv.X, gjf::new);
      a(bsv.Y, gjg::new);
      a(bsv.Z, gjh::new);
      a(bsv.aa, $$0 -> new gjx<>($$0, fwu.ao));
      a(bsv.ab, gji::new);
      a(bsv.ac, gjk::new);
      a(bsv.ad, gjm::new);
      a(bsv.ae, gka::new);
      a(bsv.af, gjn::new);
      a(bsv.ag, gjo::new);
      a(bsv.ah, gih.b::new);
      a(bsv.ai, gjp::new);
      a(bsv.aj, gkc::new);
      a(bsv.al, gjr::new);
      a(bsv.am, gjs::new);
      a(bsv.an, $$0 -> new gju($$0, fwu.ax));
      a(bsv.ao, gjv::new);
      a(bsv.ap, gjw::new);
      a(bsv.aq, gka::new);
      a(bsv.ar, $$0 -> new gjx<>($$0, fwu.aB));
      a(bsv.as, gjz::new);
      a(bsv.at, $$0 -> new gic<>($$0, 0.92F, fwu.aD));
      a(bsv.au, gkb::new);
      a(bsv.av, gkd::new);
      a(bsv.aw, gke::new);
      a(bsv.ax, gkf::new);
      a(bsv.ay, gkg::new);
      a(bsv.az, gkh::new);
      a(bsv.aA, $$0 -> new gki($$0, fwu.aJ, fwu.aO, fwu.aP, false));
      a(bsv.aB, $$0 -> new gki($$0, fwu.aK, fwu.aL, fwu.aM, false));
      a(bsv.aC, gkj::new);
      a(bsv.aD, gkk::new);
      a(bsv.aE, gle::new);
      a(bsv.aF, gkl::new);
      a(bsv.aG, gkm::new);
      a(bsv.aH, gkn::new);
      a(bsv.aI, gkp::new);
      a(bsv.aJ, gkq::new);
      a(bsv.aK, gks::new);
      a(bsv.aL, gkr::new);
      a(bsv.aM, gkt::new);
      a(bsv.aN, gku::new);
      a(bsv.aO, $$0 -> new gll($$0, fwu.bo));
      a(bsv.aP, gkv::new);
      a(bsv.aQ, $$0 -> new gle<>($$0, 0.75F, true));
      a(bsv.aR, gkw::new);
      a(bsv.aT, gle::new);
      a(bsv.aS, gkx::new);
      a(bsv.aU, $$0 -> new gjx<>($$0, fwu.bw));
      a(bsv.aV, gky::new);
      a(bsv.aW, gkz::new);
      a(bsv.aX, $$0 -> new gla<>($$0, new fvx<>($$0.a(fwu.by))));
      a(bsv.aY, glb::new);
      a(bsv.aZ, glc::new);
      a(bsv.ba, gld::new);
      a(bsv.bb, gih.c::new);
      a(bsv.bc, gli::new);
      a(bsv.bd, glh::new);
      a(bsv.be, $$0 -> new gju($$0, fwu.bH));
      a(bsv.bf, glf::new);
      a(bsv.bg, glj::new);
      a(bsv.bh, glk::new);
      a(bsv.bi, glm::new);
      a(bsv.bj, gln::new);
      a(bsv.bk, glo::new);
      a(bsv.bm, glq::new);
      a(bsv.bl, glp::new);
      a(bsv.bn, glr::new);
      a(bsv.bo, gls::new);
      a(bsv.bp, glt::new);
      a(bsv.bq, glu::new);
      a(bsv.br, glv::new);
      a(bsv.bs, glw::new);
      a(bsv.bt, glx::new);
      a(bsv.bu, gly::new);
      a(bsv.bv, $$0 -> new gll($$0, fwu.ch));
      a(bsv.bw, glz::new);
      a(bsv.bx, $$0 -> new gki($$0, fwu.cn, fwu.co, fwu.cp, true));
   }
}
