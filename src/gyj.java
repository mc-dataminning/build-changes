import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gyj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxc<?>, gyi<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hmc.a, gyi<gqw>> c = Map.of(hmc.a.b, $$0 -> new hdp($$0, false), hmc.a.a, $$0 -> new hdp($$0, true));

   private static <T extends bwt> void a(bxc<? extends T> $$0, gyi<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bxc<?>, gyh<?, ?>> a(gyi.a $$0) {
      Builder<bxc<?>, gyh<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mg.f.b((bxc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hmc.a, gyh<? extends crx, ?>> b(gyi.a $$0) {
      Builder<hmc.a, gyh<? extends crx, ?>> $$1 = ImmutableMap.builder();
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

      for (bxc<?> $$1 : mg.f) {
         if ($$1 != bxc.bT && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mg.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bxc.b, $$0 -> new gxl($$0, gld.a));
      a(bxc.c, $$0 -> new gxl($$0, gld.b));
      a(bxc.d, gxd::new);
      a(bxc.e, gzq::new);
      a(bxc.f, gxe::new);
      a(bxc.g, gxf::new);
      a(bxc.h, hax::new);
      a(bxc.i, gxh::new);
      a(bxc.j, $$0 -> new had($$0, gld.o));
      a(bxc.k, $$0 -> new had($$0, gld.p));
      a(bxc.l, gxi::new);
      a(bxc.m, gxj::new);
      a(bxc.n, $$0 -> new gxl($$0, gld.B));
      a(bxc.o, $$0 -> new gxl($$0, gld.C));
      a(bxc.p, gxk::new);
      a(bxc.q, gxw.a::new);
      a(bxc.r, gxm::new);
      a(bxc.s, gxn::new);
      a(bxc.t, hbi::new);
      a(bxc.u, gxo::new);
      a(bxc.v, gxp::new);
      a(bxc.w, gxq::new);
      a(bxc.x, $$0 -> new gxl($$0, gld.V));
      a(bxc.y, $$0 -> new gxl($$0, gld.W));
      a(bxc.z, $$0 -> new gzn($$0, gld.Y));
      a(bxc.A, gxr::new);
      a(bxc.B, gxs::new);
      a(bxc.C, $$0 -> new gzn($$0, gld.ai));
      a(bxc.D, gxt::new);
      a(bxc.E, gxu::new);
      a(bxc.F, gxv::new);
      a(bxc.G, $$0 -> new gxl($$0, gld.at));
      a(bxc.H, $$0 -> new gxl($$0, gld.au));
      a(bxc.I, gxx::new);
      a(bxc.J, $$0 -> new gxy<>($$0, gxy.a.a));
      a(bxc.K, gxz::new);
      a(bxc.L, gya::new);
      a(bxc.M, hav::new);
      a(bxc.N, gyb::new);
      a(bxc.O, gye::new);
      a(bxc.P, gyf::new);
      a(bxc.Q, gyd::new);
      a(bxc.R, hav::new);
      a(bxc.S, gyc::new);
      a(bxc.T, gyl::new);
      a(bxc.U, gyk::new);
      a(bxc.V, hav::new);
      a(bxc.W, gym::new);
      a(bxc.X, $$0 -> new hav<>($$0, 1.0F, true));
      a(bxc.Y, gyn::new);
      a(bxc.Z, $$0 -> new hav<>($$0, 3.0F, true));
      a(bxc.aa, gyo::new);
      a(bxc.bU, gyp::new);
      a(bxc.ab, gyq::new);
      a(bxc.ac, gyr::new);
      a(bxc.ad, $$0 -> new gzn($$0, gld.ba));
      a(bxc.ae, gys::new);
      a(bxc.af, $$0 -> new gyt($$0, 6.0F));
      a(bxc.ag, gzf::new);
      a(bxc.ah, $$0 -> new gyu($$0, new gke($$0.a(gld.bf)), new gke($$0.a(gld.bg))));
      a(bxc.ai, gyv::new);
      a(bxc.aj, gyw::new);
      a(bxc.ak, gyx::new);
      a(bxc.al, $$0 -> new gzn($$0, gld.bm));
      a(bxc.am, gyy::new);
      a(bxc.an, gza::new);
      a(bxc.ao, gzc::new);
      a(bxc.ap, gzq::new);
      a(bxc.aq, gzd::new);
      a(bxc.ar, gze::new);
      a(bxc.as, gxw.b::new);
      a(bxc.at, gzf::new);
      a(bxc.au, $$0 -> new gxl($$0, gld.bB));
      a(bxc.av, $$0 -> new gxl($$0, gld.bC));
      a(bxc.aw, gzh::new);
      a(bxc.ax, gzi::new);
      a(bxc.aX, hav::new);
      a(bxc.ay, $$0 -> new gzk($$0, gld.bE, gld.bF));
      a(bxc.az, gzl::new);
      a(bxc.aA, gzm::new);
      a(bxc.aB, $$0 -> new gxl($$0, gld.bK));
      a(bxc.aC, $$0 -> new gxl($$0, gld.bL));
      a(bxc.aD, gzq::new);
      a(bxc.aE, $$0 -> new gzn($$0, gld.bM));
      a(bxc.aF, gzp::new);
      a(bxc.aG, $$0 -> new gxy<>($$0, gxy.a.b));
      a(bxc.aH, $$0 -> new gxl($$0, gld.bT));
      a(bxc.aI, $$0 -> new gxl($$0, gld.bU));
      a(bxc.aJ, gzr::new);
      a(bxc.aK, gzs::new);
      a(bxc.aL, gzt::new);
      a(bxc.aM, $$0 -> new gxl($$0, gld.bX));
      a(bxc.aN, $$0 -> new gxl($$0, gld.bY));
      a(bxc.aO, gzu::new);
      a(bxc.aP, gzv::new);
      a(bxc.aQ, gzw::new);
      a(bxc.aR, gzx::new);
      a(bxc.aS, $$0 -> new gzy($$0, gld.ce, gld.cf, gld.cm, gld.cn, gld.cg, gld.ch));
      a(bxc.aT, $$0 -> new gzy($$0, gld.ci, gld.ci, gld.cj, gld.ck, gld.cj, gld.ck));
      a(bxc.aU, gzz::new);
      a(bxc.aV, haa::new);
      a(bxc.aY, hab::new);
      a(bxc.aZ, hac::new);
      a(bxc.ba, hae::new);
      a(bxc.bb, hag::new);
      a(bxc.bc, hah::new);
      a(bxc.bd, haj::new);
      a(bxc.be, hai::new);
      a(bxc.bf, hak::new);
      a(bxc.bg, hal::new);
      a(bxc.bh, $$0 -> new hbc($$0, hbc.a.a));
      a(bxc.bi, ham::new);
      a(bxc.bj, $$0 -> new hav<>($$0, 0.75F, true));
      a(bxc.bk, han::new);
      a(bxc.bl, hav::new);
      a(bxc.bm, hao::new);
      a(bxc.bn, $$0 -> new gzn($$0, gld.dl));
      a(bxc.bo, hap::new);
      a(bxc.bp, haq::new);
      a(bxc.aW, hav::new);
      a(bxc.bq, $$0 -> new gxl($$0, gld.dn));
      a(bxc.br, $$0 -> new gxl($$0, gld.do));
      a(bxc.bs, $$0 -> new har<>($$0, new gke($$0.a(gld.dp)), new gke($$0.a(gld.dq))));
      a(bxc.bt, has::new);
      a(bxc.bu, hat::new);
      a(bxc.bv, hau::new);
      a(bxc.bw, gxw.c::new);
      a(bxc.bx, haz::new);
      a(bxc.by, hay::new);
      a(bxc.bz, $$0 -> new gzk($$0, gld.dB, gld.dC));
      a(bxc.bA, haw::new);
      a(bxc.bB, hba::new);
      a(bxc.bC, hbb::new);
      a(bxc.bD, hbd::new);
      a(bxc.bE, hbe::new);
      a(bxc.bF, hbf::new);
      a(bxc.bG, hbg::new);
      a(bxc.bH, hbh::new);
      a(bxc.bI, hbi::new);
      a(bxc.bJ, hbj::new);
      a(bxc.bK, hbk::new);
      a(bxc.bL, hbl::new);
      a(bxc.bM, hbm::new);
      a(bxc.bN, hbn::new);
      a(bxc.bO, hbo::new);
      a(bxc.bP, hbp::new);
      a(bxc.bQ, $$0 -> new hbc($$0, hbc.a.b));
      a(bxc.bR, hbq::new);
      a(bxc.bS, $$0 -> new hbr($$0, gld.ey, gld.ez, gld.eC, gld.eD, gld.eA, gld.eB));
   }
}
