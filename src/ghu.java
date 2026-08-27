import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ghu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsc<?>, ght<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gov.a, ght<gbj>> c = Map.of(gov.a.b, $$0 -> new gmy($$0, false), gov.a.a, $$0 -> new gmy($$0, true));

   private static <T extends brw> void a(bsc<? extends T> $$0, ght<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsc<?>, ghs<?>> a(ght.a $$0) {
      Builder<bsc<?>, ghs<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + le.g.b((bsc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gov.a, ghs<? extends cly>> b(ght.a $$0) {
      Builder<gov.a, ghs<? extends cly>> $$1 = ImmutableMap.builder();
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

      for (bsc<?> $$1 : le.g) {
         if ($$1 != bsc.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", le.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsc.a, ggp::new);
      a(bsc.b, gjb::new);
      a(bsc.c, ggq::new);
      a(bsc.d, ggr::new);
      a(bsc.e, gkh::new);
      a(bsc.f, ggt::new);
      a(bsc.g, ggu::new);
      a(bsc.h, ggv::new);
      a(bsc.i, ggw::new);
      a(bsc.j, ghi.a::new);
      a(bsc.k, $$0 -> new ggx($$0, false));
      a(bsc.l, ggy::new);
      a(bsc.m, ggz::new);
      a(bsc.n, gks::new);
      a(bsc.p, ghb::new);
      a(bsc.o, $$0 -> new gha($$0, fvv.v));
      a(bsc.q, ghc::new);
      a(bsc.r, $$0 -> new ggx($$0, true));
      a(bsc.s, $$0 -> new giy<>($$0, fvv.y));
      a(bsc.t, ghe::new);
      a(bsc.u, ghf::new);
      a(bsc.v, $$0 -> new giy<>($$0, fvv.B));
      a(bsc.w, ghg::new);
      a(bsc.x, ghh::new);
      a(bsc.y, ghj::new);
      a(bsc.z, $$0 -> new ghd<>($$0, 0.87F, fvv.N));
      a(bsc.A, ghk::new);
      a(bsc.B, ghl::new);
      a(bsc.C, gkf::new);
      a(bsc.D, ghm::new);
      a(bsc.H, ghp::new);
      a(bsc.I, ghq::new);
      a(bsc.F, gho::new);
      a(bsc.G, gkf::new);
      a(bsc.E, ghn::new);
      a(bsc.J, ghw::new);
      a(bsc.K, ghv::new);
      a(bsc.L, gkf::new);
      a(bsc.M, ghx::new);
      a(bsc.N, $$0 -> new gkf<>($$0, 1.0F, true));
      a(bsc.O, ghy::new);
      a(bsc.ak, $$0 -> new gkf<>($$0, 3.0F, true));
      a(bsc.P, ghz::new);
      a(bsc.bz, gia::new);
      a(bsc.Q, gib::new);
      a(bsc.R, gic::new);
      a(bsc.S, $$0 -> new giy<>($$0, fvv.af));
      a(bsc.T, gid::new);
      a(bsc.U, $$0 -> new gie($$0, 6.0F));
      a(bsc.V, giq::new);
      a(bsc.W, $$0 -> new gif($$0, new fuy<>($$0.a(fvv.ak))));
      a(bsc.X, gig::new);
      a(bsc.Y, gih::new);
      a(bsc.Z, gii::new);
      a(bsc.aa, $$0 -> new giy<>($$0, fvv.ao));
      a(bsc.ab, gij::new);
      a(bsc.ac, gil::new);
      a(bsc.ad, gin::new);
      a(bsc.ae, gjb::new);
      a(bsc.af, gio::new);
      a(bsc.ag, gip::new);
      a(bsc.ah, ghi.b::new);
      a(bsc.ai, giq::new);
      a(bsc.aj, gjd::new);
      a(bsc.al, gis::new);
      a(bsc.am, git::new);
      a(bsc.an, $$0 -> new giv($$0, fvv.ax));
      a(bsc.ao, giw::new);
      a(bsc.ap, gix::new);
      a(bsc.aq, gjb::new);
      a(bsc.ar, $$0 -> new giy<>($$0, fvv.aB));
      a(bsc.as, gja::new);
      a(bsc.at, $$0 -> new ghd<>($$0, 0.92F, fvv.aD));
      a(bsc.au, gjc::new);
      a(bsc.av, gje::new);
      a(bsc.aw, gjf::new);
      a(bsc.ax, gjg::new);
      a(bsc.ay, gjh::new);
      a(bsc.az, gji::new);
      a(bsc.aA, $$0 -> new gjj($$0, fvv.aJ, fvv.aO, fvv.aP, false));
      a(bsc.aB, $$0 -> new gjj($$0, fvv.aK, fvv.aL, fvv.aM, false));
      a(bsc.aC, gjk::new);
      a(bsc.aD, gjl::new);
      a(bsc.aE, gkf::new);
      a(bsc.aF, gjm::new);
      a(bsc.aG, gjn::new);
      a(bsc.aH, gjo::new);
      a(bsc.aI, gjq::new);
      a(bsc.aJ, gjr::new);
      a(bsc.aK, gjt::new);
      a(bsc.aL, gjs::new);
      a(bsc.aM, gju::new);
      a(bsc.aN, gjv::new);
      a(bsc.aO, $$0 -> new gkm($$0, fvv.bo));
      a(bsc.aP, gjw::new);
      a(bsc.aQ, $$0 -> new gkf<>($$0, 0.75F, true));
      a(bsc.aR, gjx::new);
      a(bsc.aT, gkf::new);
      a(bsc.aS, gjy::new);
      a(bsc.aU, $$0 -> new giy<>($$0, fvv.bw));
      a(bsc.aV, gjz::new);
      a(bsc.aW, gka::new);
      a(bsc.aX, $$0 -> new gkb<>($$0, new fuy<>($$0.a(fvv.by))));
      a(bsc.aY, gkc::new);
      a(bsc.aZ, gkd::new);
      a(bsc.ba, gke::new);
      a(bsc.bb, ghi.c::new);
      a(bsc.bc, gkj::new);
      a(bsc.bd, gki::new);
      a(bsc.be, $$0 -> new giv($$0, fvv.bH));
      a(bsc.bf, gkg::new);
      a(bsc.bg, gkk::new);
      a(bsc.bh, gkl::new);
      a(bsc.bi, gkn::new);
      a(bsc.bj, gko::new);
      a(bsc.bk, gkp::new);
      a(bsc.bm, gkr::new);
      a(bsc.bl, gkq::new);
      a(bsc.bn, gks::new);
      a(bsc.bo, gkt::new);
      a(bsc.bp, gku::new);
      a(bsc.bq, gkv::new);
      a(bsc.br, gkw::new);
      a(bsc.bs, gkx::new);
      a(bsc.bt, gky::new);
      a(bsc.bu, gkz::new);
      a(bsc.bv, $$0 -> new gkm($$0, fvv.ch));
      a(bsc.bw, gla::new);
      a(bsc.bx, $$0 -> new gjj($$0, fvv.cn, fvv.co, fvv.cp, true));
   }
}
