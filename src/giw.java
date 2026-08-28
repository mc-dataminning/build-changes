import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class giw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsy<?>, giv<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gpx.a, giv<gcl>> c = Map.of(gpx.a.b, $$0 -> new goa($$0, false), gpx.a.a, $$0 -> new goa($$0, true));

   private static <T extends bss> void a(bsy<? extends T> $$0, giv<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsy<?>, giu<?>> a(giv.a $$0) {
      Builder<bsy<?>, giu<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lp.g.b((bsy<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gpx.a, giu<? extends cmv>> b(giv.a $$0) {
      Builder<gpx.a, giu<? extends cmv>> $$1 = ImmutableMap.builder();
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

      for (bsy<?> $$1 : lp.g) {
         if ($$1 != bsy.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lp.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsy.a, ghr::new);
      a(bsy.b, gkd::new);
      a(bsy.c, ghs::new);
      a(bsy.d, ght::new);
      a(bsy.e, glj::new);
      a(bsy.f, ghv::new);
      a(bsy.g, ghw::new);
      a(bsy.h, ghx::new);
      a(bsy.i, ghy::new);
      a(bsy.j, gik.a::new);
      a(bsy.k, $$0 -> new ghz($$0, false));
      a(bsy.l, gia::new);
      a(bsy.m, gib::new);
      a(bsy.n, glu::new);
      a(bsy.p, gid::new);
      a(bsy.o, $$0 -> new gic($$0, fwx.v));
      a(bsy.q, gie::new);
      a(bsy.r, $$0 -> new ghz($$0, true));
      a(bsy.s, $$0 -> new gka<>($$0, fwx.y));
      a(bsy.t, gig::new);
      a(bsy.u, gih::new);
      a(bsy.v, $$0 -> new gka<>($$0, fwx.B));
      a(bsy.w, gii::new);
      a(bsy.x, gij::new);
      a(bsy.y, gil::new);
      a(bsy.z, $$0 -> new gif<>($$0, 0.87F, fwx.N));
      a(bsy.A, gim::new);
      a(bsy.B, gin::new);
      a(bsy.C, glh::new);
      a(bsy.D, gio::new);
      a(bsy.H, gir::new);
      a(bsy.I, gis::new);
      a(bsy.F, giq::new);
      a(bsy.G, glh::new);
      a(bsy.E, gip::new);
      a(bsy.J, giy::new);
      a(bsy.K, gix::new);
      a(bsy.L, glh::new);
      a(bsy.M, giz::new);
      a(bsy.N, $$0 -> new glh<>($$0, 1.0F, true));
      a(bsy.O, gja::new);
      a(bsy.ak, $$0 -> new glh<>($$0, 3.0F, true));
      a(bsy.P, gjb::new);
      a(bsy.bz, gjc::new);
      a(bsy.Q, gjd::new);
      a(bsy.R, gje::new);
      a(bsy.S, $$0 -> new gka<>($$0, fwx.af));
      a(bsy.T, gjf::new);
      a(bsy.U, $$0 -> new gjg($$0, 6.0F));
      a(bsy.V, gjs::new);
      a(bsy.W, $$0 -> new gjh($$0, new fwa<>($$0.a(fwx.ak))));
      a(bsy.X, gji::new);
      a(bsy.Y, gjj::new);
      a(bsy.Z, gjk::new);
      a(bsy.aa, $$0 -> new gka<>($$0, fwx.ao));
      a(bsy.ab, gjl::new);
      a(bsy.ac, gjn::new);
      a(bsy.ad, gjp::new);
      a(bsy.ae, gkd::new);
      a(bsy.af, gjq::new);
      a(bsy.ag, gjr::new);
      a(bsy.ah, gik.b::new);
      a(bsy.ai, gjs::new);
      a(bsy.aj, gkf::new);
      a(bsy.al, gju::new);
      a(bsy.am, gjv::new);
      a(bsy.an, $$0 -> new gjx($$0, fwx.ax));
      a(bsy.ao, gjy::new);
      a(bsy.ap, gjz::new);
      a(bsy.aq, gkd::new);
      a(bsy.ar, $$0 -> new gka<>($$0, fwx.aB));
      a(bsy.as, gkc::new);
      a(bsy.at, $$0 -> new gif<>($$0, 0.92F, fwx.aD));
      a(bsy.au, gke::new);
      a(bsy.av, gkg::new);
      a(bsy.aw, gkh::new);
      a(bsy.ax, gki::new);
      a(bsy.ay, gkj::new);
      a(bsy.az, gkk::new);
      a(bsy.aA, $$0 -> new gkl($$0, fwx.aJ, fwx.aO, fwx.aP, false));
      a(bsy.aB, $$0 -> new gkl($$0, fwx.aK, fwx.aL, fwx.aM, false));
      a(bsy.aC, gkm::new);
      a(bsy.aD, gkn::new);
      a(bsy.aE, glh::new);
      a(bsy.aF, gko::new);
      a(bsy.aG, gkp::new);
      a(bsy.aH, gkq::new);
      a(bsy.aI, gks::new);
      a(bsy.aJ, gkt::new);
      a(bsy.aK, gkv::new);
      a(bsy.aL, gku::new);
      a(bsy.aM, gkw::new);
      a(bsy.aN, gkx::new);
      a(bsy.aO, $$0 -> new glo($$0, fwx.bo));
      a(bsy.aP, gky::new);
      a(bsy.aQ, $$0 -> new glh<>($$0, 0.75F, true));
      a(bsy.aR, gkz::new);
      a(bsy.aT, glh::new);
      a(bsy.aS, gla::new);
      a(bsy.aU, $$0 -> new gka<>($$0, fwx.bw));
      a(bsy.aV, glb::new);
      a(bsy.aW, glc::new);
      a(bsy.aX, $$0 -> new gld<>($$0, new fwa<>($$0.a(fwx.by))));
      a(bsy.aY, gle::new);
      a(bsy.aZ, glf::new);
      a(bsy.ba, glg::new);
      a(bsy.bb, gik.c::new);
      a(bsy.bc, gll::new);
      a(bsy.bd, glk::new);
      a(bsy.be, $$0 -> new gjx($$0, fwx.bH));
      a(bsy.bf, gli::new);
      a(bsy.bg, glm::new);
      a(bsy.bh, gln::new);
      a(bsy.bi, glp::new);
      a(bsy.bj, glq::new);
      a(bsy.bk, glr::new);
      a(bsy.bm, glt::new);
      a(bsy.bl, gls::new);
      a(bsy.bn, glu::new);
      a(bsy.bo, glv::new);
      a(bsy.bp, glw::new);
      a(bsy.bq, glx::new);
      a(bsy.br, gly::new);
      a(bsy.bs, glz::new);
      a(bsy.bt, gma::new);
      a(bsy.bu, gmb::new);
      a(bsy.bv, $$0 -> new glo($$0, fwx.ch));
      a(bsy.bw, gmc::new);
      a(bsy.bx, $$0 -> new gkl($$0, fwx.cn, fwx.co, fwx.cp, true));
   }
}
