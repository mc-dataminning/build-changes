import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gwu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwr<?>, gwt<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hkl.a, gwt<gpg>> c = Map.of(hkl.a.b, $$0 -> new hbz($$0, false), hkl.a.a, $$0 -> new hbz($$0, true));

   private static <T extends bwi> void a(bwr<? extends T> $$0, gwt<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwr<?>, gws<?, ?>> a(gwt.a $$0) {
      Builder<bwr<?>, gws<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mg.f.b((bwr<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hkl.a, gws<? extends crj, ?>> b(gwt.a $$0) {
      Builder<hkl.a, gws<? extends crj, ?>> $$1 = ImmutableMap.builder();
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
      a(bwr.a, $$0 -> new gvw($$0, gjn.a));
      a(bwr.b, $$0 -> new gvw($$0, gjn.b));
      a(bwr.c, gvo::new);
      a(bwr.d, gyb::new);
      a(bwr.e, gvp::new);
      a(bwr.f, gvq::new);
      a(bwr.g, gzi::new);
      a(bwr.h, gvs::new);
      a(bwr.i, $$0 -> new gyo($$0, gjn.o));
      a(bwr.j, $$0 -> new gyo($$0, gjn.p));
      a(bwr.k, gvt::new);
      a(bwr.l, gvu::new);
      a(bwr.m, $$0 -> new gvw($$0, gjn.B));
      a(bwr.n, $$0 -> new gvw($$0, gjn.C));
      a(bwr.o, gvv::new);
      a(bwr.p, gwh.a::new);
      a(bwr.q, gvx::new);
      a(bwr.r, gvy::new);
      a(bwr.s, gzt::new);
      a(bwr.t, gvz::new);
      a(bwr.u, gwa::new);
      a(bwr.v, gwb::new);
      a(bwr.w, $$0 -> new gvw($$0, gjn.V));
      a(bwr.x, $$0 -> new gvw($$0, gjn.W));
      a(bwr.y, $$0 -> new gxy($$0, gjn.Y));
      a(bwr.z, gwc::new);
      a(bwr.A, gwd::new);
      a(bwr.B, $$0 -> new gxy($$0, gjn.ai));
      a(bwr.C, gwe::new);
      a(bwr.D, gwf::new);
      a(bwr.E, gwg::new);
      a(bwr.F, $$0 -> new gvw($$0, gjn.at));
      a(bwr.G, $$0 -> new gvw($$0, gjn.au));
      a(bwr.H, gwi::new);
      a(bwr.I, $$0 -> new gwj<>($$0, gwj.a.a));
      a(bwr.J, gwk::new);
      a(bwr.K, gwl::new);
      a(bwr.L, gzg::new);
      a(bwr.M, gwm::new);
      a(bwr.N, gwp::new);
      a(bwr.O, gwq::new);
      a(bwr.P, gwo::new);
      a(bwr.Q, gzg::new);
      a(bwr.R, gwn::new);
      a(bwr.S, gww::new);
      a(bwr.T, gwv::new);
      a(bwr.U, gzg::new);
      a(bwr.V, gwx::new);
      a(bwr.W, $$0 -> new gzg<>($$0, 1.0F, true));
      a(bwr.X, gwy::new);
      a(bwr.Y, $$0 -> new gzg<>($$0, 3.0F, true));
      a(bwr.Z, gwz::new);
      a(bwr.bT, gxa::new);
      a(bwr.aa, gxb::new);
      a(bwr.ab, gxc::new);
      a(bwr.ac, $$0 -> new gxy($$0, gjn.ba));
      a(bwr.ad, gxd::new);
      a(bwr.ae, $$0 -> new gxe($$0, 6.0F));
      a(bwr.af, gxq::new);
      a(bwr.ag, $$0 -> new gxf($$0, new gio($$0.a(gjn.bf)), new gio($$0.a(gjn.bg))));
      a(bwr.ah, gxg::new);
      a(bwr.ai, gxh::new);
      a(bwr.aj, gxi::new);
      a(bwr.ak, $$0 -> new gxy($$0, gjn.bm));
      a(bwr.al, gxj::new);
      a(bwr.am, gxl::new);
      a(bwr.an, gxn::new);
      a(bwr.ao, gyb::new);
      a(bwr.ap, gxo::new);
      a(bwr.aq, gxp::new);
      a(bwr.ar, gwh.b::new);
      a(bwr.as, gxq::new);
      a(bwr.at, $$0 -> new gvw($$0, gjn.bB));
      a(bwr.au, $$0 -> new gvw($$0, gjn.bC));
      a(bwr.av, gxs::new);
      a(bwr.aw, gxt::new);
      a(bwr.aW, gzg::new);
      a(bwr.ax, $$0 -> new gxv($$0, gjn.bE, gjn.bF));
      a(bwr.ay, gxw::new);
      a(bwr.az, gxx::new);
      a(bwr.aA, $$0 -> new gvw($$0, gjn.bK));
      a(bwr.aB, $$0 -> new gvw($$0, gjn.bL));
      a(bwr.aC, gyb::new);
      a(bwr.aD, $$0 -> new gxy($$0, gjn.bM));
      a(bwr.aE, gya::new);
      a(bwr.aF, $$0 -> new gwj<>($$0, gwj.a.b));
      a(bwr.aG, $$0 -> new gvw($$0, gjn.bT));
      a(bwr.aH, $$0 -> new gvw($$0, gjn.bU));
      a(bwr.aI, gyc::new);
      a(bwr.aJ, gyd::new);
      a(bwr.aK, gye::new);
      a(bwr.aL, $$0 -> new gvw($$0, gjn.bX));
      a(bwr.aM, $$0 -> new gvw($$0, gjn.bY));
      a(bwr.aN, gyf::new);
      a(bwr.aO, gyg::new);
      a(bwr.aP, gyh::new);
      a(bwr.aQ, gyi::new);
      a(bwr.aR, $$0 -> new gyj($$0, gjn.ce, gjn.cf, gjn.cm, gjn.cn, gjn.cg, gjn.ch));
      a(bwr.aS, $$0 -> new gyj($$0, gjn.ci, gjn.ci, gjn.cj, gjn.ck, gjn.cj, gjn.ck));
      a(bwr.aT, gyk::new);
      a(bwr.aU, gyl::new);
      a(bwr.aX, gym::new);
      a(bwr.aY, gyn::new);
      a(bwr.aZ, gyp::new);
      a(bwr.ba, gyr::new);
      a(bwr.bb, gys::new);
      a(bwr.bc, gyu::new);
      a(bwr.bd, gyt::new);
      a(bwr.be, gyv::new);
      a(bwr.bf, gyw::new);
      a(bwr.bg, $$0 -> new gzn($$0, gzn.a.a));
      a(bwr.bh, gyx::new);
      a(bwr.bi, $$0 -> new gzg<>($$0, 0.75F, true));
      a(bwr.bj, gyy::new);
      a(bwr.bk, gzg::new);
      a(bwr.bl, gyz::new);
      a(bwr.bm, $$0 -> new gxy($$0, gjn.dj));
      a(bwr.bn, gza::new);
      a(bwr.bo, gzb::new);
      a(bwr.aV, gzg::new);
      a(bwr.bp, $$0 -> new gvw($$0, gjn.dl));
      a(bwr.bq, $$0 -> new gvw($$0, gjn.dm));
      a(bwr.br, $$0 -> new gzc<>($$0, new gio($$0.a(gjn.dn)), new gio($$0.a(gjn.do))));
      a(bwr.bs, gzd::new);
      a(bwr.bt, gze::new);
      a(bwr.bu, gzf::new);
      a(bwr.bv, gwh.c::new);
      a(bwr.bw, gzk::new);
      a(bwr.bx, gzj::new);
      a(bwr.by, $$0 -> new gxv($$0, gjn.dz, gjn.dA));
      a(bwr.bz, gzh::new);
      a(bwr.bA, gzl::new);
      a(bwr.bB, gzm::new);
      a(bwr.bC, gzo::new);
      a(bwr.bD, gzp::new);
      a(bwr.bE, gzq::new);
      a(bwr.bF, gzr::new);
      a(bwr.bG, gzs::new);
      a(bwr.bH, gzt::new);
      a(bwr.bI, gzu::new);
      a(bwr.bJ, gzv::new);
      a(bwr.bK, gzw::new);
      a(bwr.bL, gzx::new);
      a(bwr.bM, gzy::new);
      a(bwr.bN, gzz::new);
      a(bwr.bO, haa::new);
      a(bwr.bP, $$0 -> new gzn($$0, gzn.a.b));
      a(bwr.bQ, hab::new);
      a(bwr.bR, $$0 -> new hac($$0, gjn.ew, gjn.ex, gjn.eA, gjn.eB, gjn.ey, gjn.ez));
   }
}
