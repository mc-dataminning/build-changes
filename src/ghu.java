import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ghu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsa<?>, ght<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gov.a, ght<gbj>> c = Map.of(gov.a.b, $$0 -> new gmy($$0, false), gov.a.a, $$0 -> new gmy($$0, true));

   private static <T extends bru> void a(bsa<? extends T> $$0, ght<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bsa<?>, ghs<?>> a(ght.a $$0) {
      Builder<bsa<?>, ghs<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + le.g.b((bsa<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gov.a, ghs<? extends clw>> b(ght.a $$0) {
      Builder<gov.a, ghs<? extends clw>> $$1 = ImmutableMap.builder();
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

      for (bsa<?> $$1 : le.g) {
         if ($$1 != bsa.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", le.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bsa.a, ggp::new);
      a(bsa.b, gjb::new);
      a(bsa.c, ggq::new);
      a(bsa.d, ggr::new);
      a(bsa.e, gkh::new);
      a(bsa.f, ggt::new);
      a(bsa.g, ggu::new);
      a(bsa.h, ggv::new);
      a(bsa.i, ggw::new);
      a(bsa.j, ghi.a::new);
      a(bsa.k, $$0 -> new ggx($$0, false));
      a(bsa.l, ggy::new);
      a(bsa.m, ggz::new);
      a(bsa.n, gks::new);
      a(bsa.p, ghb::new);
      a(bsa.o, $$0 -> new gha($$0, fvv.v));
      a(bsa.q, ghc::new);
      a(bsa.r, $$0 -> new ggx($$0, true));
      a(bsa.s, $$0 -> new giy<>($$0, fvv.y));
      a(bsa.t, ghe::new);
      a(bsa.u, ghf::new);
      a(bsa.v, $$0 -> new giy<>($$0, fvv.B));
      a(bsa.w, ghg::new);
      a(bsa.x, ghh::new);
      a(bsa.y, ghj::new);
      a(bsa.z, $$0 -> new ghd<>($$0, 0.87F, fvv.N));
      a(bsa.A, ghk::new);
      a(bsa.B, ghl::new);
      a(bsa.C, gkf::new);
      a(bsa.D, ghm::new);
      a(bsa.H, ghp::new);
      a(bsa.I, ghq::new);
      a(bsa.F, gho::new);
      a(bsa.G, gkf::new);
      a(bsa.E, ghn::new);
      a(bsa.J, ghw::new);
      a(bsa.K, ghv::new);
      a(bsa.L, gkf::new);
      a(bsa.M, ghx::new);
      a(bsa.N, $$0 -> new gkf<>($$0, 1.0F, true));
      a(bsa.O, ghy::new);
      a(bsa.ak, $$0 -> new gkf<>($$0, 3.0F, true));
      a(bsa.P, ghz::new);
      a(bsa.bz, gia::new);
      a(bsa.Q, gib::new);
      a(bsa.R, gic::new);
      a(bsa.S, $$0 -> new giy<>($$0, fvv.af));
      a(bsa.T, gid::new);
      a(bsa.U, $$0 -> new gie($$0, 6.0F));
      a(bsa.V, giq::new);
      a(bsa.W, $$0 -> new gif($$0, new fuy<>($$0.a(fvv.ak))));
      a(bsa.X, gig::new);
      a(bsa.Y, gih::new);
      a(bsa.Z, gii::new);
      a(bsa.aa, $$0 -> new giy<>($$0, fvv.ao));
      a(bsa.ab, gij::new);
      a(bsa.ac, gil::new);
      a(bsa.ad, gin::new);
      a(bsa.ae, gjb::new);
      a(bsa.af, gio::new);
      a(bsa.ag, gip::new);
      a(bsa.ah, ghi.b::new);
      a(bsa.ai, giq::new);
      a(bsa.aj, gjd::new);
      a(bsa.al, gis::new);
      a(bsa.am, git::new);
      a(bsa.an, $$0 -> new giv($$0, fvv.ax));
      a(bsa.ao, giw::new);
      a(bsa.ap, gix::new);
      a(bsa.aq, gjb::new);
      a(bsa.ar, $$0 -> new giy<>($$0, fvv.aB));
      a(bsa.as, gja::new);
      a(bsa.at, $$0 -> new ghd<>($$0, 0.92F, fvv.aD));
      a(bsa.au, gjc::new);
      a(bsa.av, gje::new);
      a(bsa.aw, gjf::new);
      a(bsa.ax, gjg::new);
      a(bsa.ay, gjh::new);
      a(bsa.az, gji::new);
      a(bsa.aA, $$0 -> new gjj($$0, fvv.aJ, fvv.aO, fvv.aP, false));
      a(bsa.aB, $$0 -> new gjj($$0, fvv.aK, fvv.aL, fvv.aM, false));
      a(bsa.aC, gjk::new);
      a(bsa.aD, gjl::new);
      a(bsa.aE, gkf::new);
      a(bsa.aF, gjm::new);
      a(bsa.aG, gjn::new);
      a(bsa.aH, gjo::new);
      a(bsa.aI, gjq::new);
      a(bsa.aJ, gjr::new);
      a(bsa.aK, gjt::new);
      a(bsa.aL, gjs::new);
      a(bsa.aM, gju::new);
      a(bsa.aN, gjv::new);
      a(bsa.aO, $$0 -> new gkm($$0, fvv.bo));
      a(bsa.aP, gjw::new);
      a(bsa.aQ, $$0 -> new gkf<>($$0, 0.75F, true));
      a(bsa.aR, gjx::new);
      a(bsa.aT, gkf::new);
      a(bsa.aS, gjy::new);
      a(bsa.aU, $$0 -> new giy<>($$0, fvv.bw));
      a(bsa.aV, gjz::new);
      a(bsa.aW, gka::new);
      a(bsa.aX, $$0 -> new gkb<>($$0, new fuy<>($$0.a(fvv.by))));
      a(bsa.aY, gkc::new);
      a(bsa.aZ, gkd::new);
      a(bsa.ba, gke::new);
      a(bsa.bb, ghi.c::new);
      a(bsa.bc, gkj::new);
      a(bsa.bd, gki::new);
      a(bsa.be, $$0 -> new giv($$0, fvv.bH));
      a(bsa.bf, gkg::new);
      a(bsa.bg, gkk::new);
      a(bsa.bh, gkl::new);
      a(bsa.bi, gkn::new);
      a(bsa.bj, gko::new);
      a(bsa.bk, gkp::new);
      a(bsa.bm, gkr::new);
      a(bsa.bl, gkq::new);
      a(bsa.bn, gks::new);
      a(bsa.bo, gkt::new);
      a(bsa.bp, gku::new);
      a(bsa.bq, gkv::new);
      a(bsa.br, gkw::new);
      a(bsa.bs, gkx::new);
      a(bsa.bt, gky::new);
      a(bsa.bu, gkz::new);
      a(bsa.bv, $$0 -> new gkm($$0, fvv.ch));
      a(bsa.bw, gla::new);
      a(bsa.bx, $$0 -> new gjj($$0, fvv.cn, fvv.co, fvv.cp, true));
   }
}
