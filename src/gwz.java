import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gwz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwr<?>, gwy<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hks.a, gwy<gpl>> c = Map.of(hks.a.b, $$0 -> new hcf($$0, false), hks.a.a, $$0 -> new hcf($$0, true));

   private static <T extends bwi> void a(bwr<? extends T> $$0, gwy<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwr<?>, gwx<?, ?>> a(gwy.a $$0) {
      Builder<bwr<?>, gwx<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mg.f.b((bwr<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hks.a, gwx<? extends crm, ?>> b(gwy.a $$0) {
      Builder<hks.a, gwx<? extends crm, ?>> $$1 = ImmutableMap.builder();
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

      for (bwr<?> $$1 : mg.f) {
         if ($$1 != bwr.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mg.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bwr.a, $$0 -> new gwb($$0, gjs.a));
      a(bwr.b, $$0 -> new gwb($$0, gjs.b));
      a(bwr.c, gvt::new);
      a(bwr.d, gyg::new);
      a(bwr.e, gvu::new);
      a(bwr.f, gvv::new);
      a(bwr.g, gzn::new);
      a(bwr.h, gvx::new);
      a(bwr.i, $$0 -> new gyt($$0, gjs.o));
      a(bwr.j, $$0 -> new gyt($$0, gjs.p));
      a(bwr.k, gvy::new);
      a(bwr.l, gvz::new);
      a(bwr.m, $$0 -> new gwb($$0, gjs.B));
      a(bwr.n, $$0 -> new gwb($$0, gjs.C));
      a(bwr.o, gwa::new);
      a(bwr.p, gwm.a::new);
      a(bwr.q, gwc::new);
      a(bwr.r, gwd::new);
      a(bwr.s, gzy::new);
      a(bwr.t, gwe::new);
      a(bwr.u, gwf::new);
      a(bwr.v, gwg::new);
      a(bwr.w, $$0 -> new gwb($$0, gjs.V));
      a(bwr.x, $$0 -> new gwb($$0, gjs.W));
      a(bwr.y, $$0 -> new gyd($$0, gjs.Y));
      a(bwr.z, gwh::new);
      a(bwr.A, gwi::new);
      a(bwr.B, $$0 -> new gyd($$0, gjs.ai));
      a(bwr.C, gwj::new);
      a(bwr.D, gwk::new);
      a(bwr.E, gwl::new);
      a(bwr.F, $$0 -> new gwb($$0, gjs.at));
      a(bwr.G, $$0 -> new gwb($$0, gjs.au));
      a(bwr.H, gwn::new);
      a(bwr.I, $$0 -> new gwo<>($$0, gwo.a.a));
      a(bwr.J, gwp::new);
      a(bwr.K, gwq::new);
      a(bwr.L, gzl::new);
      a(bwr.M, gwr::new);
      a(bwr.N, gwu::new);
      a(bwr.O, gwv::new);
      a(bwr.P, gwt::new);
      a(bwr.Q, gzl::new);
      a(bwr.R, gws::new);
      a(bwr.S, gxb::new);
      a(bwr.T, gxa::new);
      a(bwr.U, gzl::new);
      a(bwr.V, gxc::new);
      a(bwr.W, $$0 -> new gzl<>($$0, 1.0F, true));
      a(bwr.X, gxd::new);
      a(bwr.Y, $$0 -> new gzl<>($$0, 3.0F, true));
      a(bwr.Z, gxe::new);
      a(bwr.bT, gxf::new);
      a(bwr.aa, gxg::new);
      a(bwr.ab, gxh::new);
      a(bwr.ac, $$0 -> new gyd($$0, gjs.ba));
      a(bwr.ad, gxi::new);
      a(bwr.ae, $$0 -> new gxj($$0, 6.0F));
      a(bwr.af, gxv::new);
      a(bwr.ag, $$0 -> new gxk($$0, new git($$0.a(gjs.bf)), new git($$0.a(gjs.bg))));
      a(bwr.ah, gxl::new);
      a(bwr.ai, gxm::new);
      a(bwr.aj, gxn::new);
      a(bwr.ak, $$0 -> new gyd($$0, gjs.bm));
      a(bwr.al, gxo::new);
      a(bwr.am, gxq::new);
      a(bwr.an, gxs::new);
      a(bwr.ao, gyg::new);
      a(bwr.ap, gxt::new);
      a(bwr.aq, gxu::new);
      a(bwr.ar, gwm.b::new);
      a(bwr.as, gxv::new);
      a(bwr.at, $$0 -> new gwb($$0, gjs.bB));
      a(bwr.au, $$0 -> new gwb($$0, gjs.bC));
      a(bwr.av, gxx::new);
      a(bwr.aw, gxy::new);
      a(bwr.aW, gzl::new);
      a(bwr.ax, $$0 -> new gya($$0, gjs.bE, gjs.bF));
      a(bwr.ay, gyb::new);
      a(bwr.az, gyc::new);
      a(bwr.aA, $$0 -> new gwb($$0, gjs.bK));
      a(bwr.aB, $$0 -> new gwb($$0, gjs.bL));
      a(bwr.aC, gyg::new);
      a(bwr.aD, $$0 -> new gyd($$0, gjs.bM));
      a(bwr.aE, gyf::new);
      a(bwr.aF, $$0 -> new gwo<>($$0, gwo.a.b));
      a(bwr.aG, $$0 -> new gwb($$0, gjs.bT));
      a(bwr.aH, $$0 -> new gwb($$0, gjs.bU));
      a(bwr.aI, gyh::new);
      a(bwr.aJ, gyi::new);
      a(bwr.aK, gyj::new);
      a(bwr.aL, $$0 -> new gwb($$0, gjs.bX));
      a(bwr.aM, $$0 -> new gwb($$0, gjs.bY));
      a(bwr.aN, gyk::new);
      a(bwr.aO, gyl::new);
      a(bwr.aP, gym::new);
      a(bwr.aQ, gyn::new);
      a(bwr.aR, $$0 -> new gyo($$0, gjs.ce, gjs.cf, gjs.cm, gjs.cn, gjs.cg, gjs.ch));
      a(bwr.aS, $$0 -> new gyo($$0, gjs.ci, gjs.ci, gjs.cj, gjs.ck, gjs.cj, gjs.ck));
      a(bwr.aT, gyp::new);
      a(bwr.aU, gyq::new);
      a(bwr.aX, gyr::new);
      a(bwr.aY, gys::new);
      a(bwr.aZ, gyu::new);
      a(bwr.ba, gyw::new);
      a(bwr.bb, gyx::new);
      a(bwr.bc, gyz::new);
      a(bwr.bd, gyy::new);
      a(bwr.be, gza::new);
      a(bwr.bf, gzb::new);
      a(bwr.bg, $$0 -> new gzs($$0, gzs.a.a));
      a(bwr.bh, gzc::new);
      a(bwr.bi, $$0 -> new gzl<>($$0, 0.75F, true));
      a(bwr.bj, gzd::new);
      a(bwr.bk, gzl::new);
      a(bwr.bl, gze::new);
      a(bwr.bm, $$0 -> new gyd($$0, gjs.dl));
      a(bwr.bn, gzf::new);
      a(bwr.bo, gzg::new);
      a(bwr.aV, gzl::new);
      a(bwr.bp, $$0 -> new gwb($$0, gjs.dn));
      a(bwr.bq, $$0 -> new gwb($$0, gjs.do));
      a(bwr.br, $$0 -> new gzh<>($$0, new git($$0.a(gjs.dp)), new git($$0.a(gjs.dq))));
      a(bwr.bs, gzi::new);
      a(bwr.bt, gzj::new);
      a(bwr.bu, gzk::new);
      a(bwr.bv, gwm.c::new);
      a(bwr.bw, gzp::new);
      a(bwr.bx, gzo::new);
      a(bwr.by, $$0 -> new gya($$0, gjs.dB, gjs.dC));
      a(bwr.bz, gzm::new);
      a(bwr.bA, gzq::new);
      a(bwr.bB, gzr::new);
      a(bwr.bC, gzt::new);
      a(bwr.bD, gzu::new);
      a(bwr.bE, gzv::new);
      a(bwr.bF, gzw::new);
      a(bwr.bG, gzx::new);
      a(bwr.bH, gzy::new);
      a(bwr.bI, gzz::new);
      a(bwr.bJ, haa::new);
      a(bwr.bK, hab::new);
      a(bwr.bL, hac::new);
      a(bwr.bM, had::new);
      a(bwr.bN, hae::new);
      a(bwr.bO, haf::new);
      a(bwr.bP, $$0 -> new gzs($$0, gzs.a.b));
      a(bwr.bQ, hag::new);
      a(bwr.bR, $$0 -> new hah($$0, gjs.ey, gjs.ez, gjs.eC, gjs.eD, gjs.eA, gjs.eB));
   }
}
