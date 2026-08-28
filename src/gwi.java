import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gwi {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwo<?>, gwh<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hjy.a, gwh<gou>> c = Map.of(hjy.a.b, $$0 -> new hbn($$0, false), hjy.a.a, $$0 -> new hbn($$0, true));

   private static <T extends bwf> void a(bwo<? extends T> $$0, gwh<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwo<?>, gwg<?, ?>> a(gwh.a $$0) {
      Builder<bwo<?>, gwg<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mf.f.b((bwo<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hjy.a, gwg<? extends crc, ?>> b(gwh.a $$0) {
      Builder<hjy.a, gwg<? extends crc, ?>> $$1 = ImmutableMap.builder();
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

      for (bwo<?> $$1 : mf.f) {
         if ($$1 != bwo.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mf.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bwo.a, $$0 -> new gvk($$0, gjb.a));
      a(bwo.b, $$0 -> new gvk($$0, gjb.b));
      a(bwo.c, gvc::new);
      a(bwo.d, gxp::new);
      a(bwo.e, gvd::new);
      a(bwo.f, gve::new);
      a(bwo.g, gyw::new);
      a(bwo.h, gvg::new);
      a(bwo.i, $$0 -> new gyc($$0, gjb.o));
      a(bwo.j, $$0 -> new gyc($$0, gjb.p));
      a(bwo.k, gvh::new);
      a(bwo.l, gvi::new);
      a(bwo.m, $$0 -> new gvk($$0, gjb.B));
      a(bwo.n, $$0 -> new gvk($$0, gjb.C));
      a(bwo.o, gvj::new);
      a(bwo.p, gvv.a::new);
      a(bwo.q, gvl::new);
      a(bwo.r, gvm::new);
      a(bwo.s, gzh::new);
      a(bwo.t, gvn::new);
      a(bwo.u, gvo::new);
      a(bwo.v, gvp::new);
      a(bwo.w, $$0 -> new gvk($$0, gjb.V));
      a(bwo.x, $$0 -> new gvk($$0, gjb.W));
      a(bwo.y, $$0 -> new gxm($$0, gjb.Y));
      a(bwo.z, gvq::new);
      a(bwo.A, gvr::new);
      a(bwo.B, $$0 -> new gxm($$0, gjb.ai));
      a(bwo.C, gvs::new);
      a(bwo.D, gvt::new);
      a(bwo.E, gvu::new);
      a(bwo.F, $$0 -> new gvk($$0, gjb.at));
      a(bwo.G, $$0 -> new gvk($$0, gjb.au));
      a(bwo.H, gvw::new);
      a(bwo.I, $$0 -> new gvx<>($$0, gvx.a.a));
      a(bwo.J, gvy::new);
      a(bwo.K, gvz::new);
      a(bwo.L, gyu::new);
      a(bwo.M, gwa::new);
      a(bwo.N, gwd::new);
      a(bwo.O, gwe::new);
      a(bwo.P, gwc::new);
      a(bwo.Q, gyu::new);
      a(bwo.R, gwb::new);
      a(bwo.S, gwk::new);
      a(bwo.T, gwj::new);
      a(bwo.U, gyu::new);
      a(bwo.V, gwl::new);
      a(bwo.W, $$0 -> new gyu<>($$0, 1.0F, true));
      a(bwo.X, gwm::new);
      a(bwo.Y, $$0 -> new gyu<>($$0, 3.0F, true));
      a(bwo.Z, gwn::new);
      a(bwo.bT, gwo::new);
      a(bwo.aa, gwp::new);
      a(bwo.ab, gwq::new);
      a(bwo.ac, $$0 -> new gxm($$0, gjb.ba));
      a(bwo.ad, gwr::new);
      a(bwo.ae, $$0 -> new gws($$0, 6.0F));
      a(bwo.af, gxe::new);
      a(bwo.ag, $$0 -> new gwt($$0, new gic($$0.a(gjb.bf)), new gic($$0.a(gjb.bg))));
      a(bwo.ah, gwu::new);
      a(bwo.ai, gwv::new);
      a(bwo.aj, gww::new);
      a(bwo.ak, $$0 -> new gxm($$0, gjb.bm));
      a(bwo.al, gwx::new);
      a(bwo.am, gwz::new);
      a(bwo.an, gxb::new);
      a(bwo.ao, gxp::new);
      a(bwo.ap, gxc::new);
      a(bwo.aq, gxd::new);
      a(bwo.ar, gvv.b::new);
      a(bwo.as, gxe::new);
      a(bwo.at, $$0 -> new gvk($$0, gjb.bB));
      a(bwo.au, $$0 -> new gvk($$0, gjb.bC));
      a(bwo.av, gxg::new);
      a(bwo.aw, gxh::new);
      a(bwo.aW, gyu::new);
      a(bwo.ax, $$0 -> new gxj($$0, gjb.bE, gjb.bF));
      a(bwo.ay, gxk::new);
      a(bwo.az, gxl::new);
      a(bwo.aA, $$0 -> new gvk($$0, gjb.bK));
      a(bwo.aB, $$0 -> new gvk($$0, gjb.bL));
      a(bwo.aC, gxp::new);
      a(bwo.aD, $$0 -> new gxm($$0, gjb.bM));
      a(bwo.aE, gxo::new);
      a(bwo.aF, $$0 -> new gvx<>($$0, gvx.a.b));
      a(bwo.aG, $$0 -> new gvk($$0, gjb.bT));
      a(bwo.aH, $$0 -> new gvk($$0, gjb.bU));
      a(bwo.aI, gxq::new);
      a(bwo.aJ, gxr::new);
      a(bwo.aK, gxs::new);
      a(bwo.aL, $$0 -> new gvk($$0, gjb.bX));
      a(bwo.aM, $$0 -> new gvk($$0, gjb.bY));
      a(bwo.aN, gxt::new);
      a(bwo.aO, gxu::new);
      a(bwo.aP, gxv::new);
      a(bwo.aQ, gxw::new);
      a(bwo.aR, $$0 -> new gxx($$0, gjb.ce, gjb.cf, gjb.cm, gjb.cn, gjb.cg, gjb.ch));
      a(bwo.aS, $$0 -> new gxx($$0, gjb.ci, gjb.ci, gjb.cj, gjb.ck, gjb.cj, gjb.ck));
      a(bwo.aT, gxy::new);
      a(bwo.aU, gxz::new);
      a(bwo.aX, gya::new);
      a(bwo.aY, gyb::new);
      a(bwo.aZ, gyd::new);
      a(bwo.ba, gyf::new);
      a(bwo.bb, gyg::new);
      a(bwo.bc, gyi::new);
      a(bwo.bd, gyh::new);
      a(bwo.be, gyj::new);
      a(bwo.bf, gyk::new);
      a(bwo.bg, $$0 -> new gzb($$0, gzb.a.a));
      a(bwo.bh, gyl::new);
      a(bwo.bi, $$0 -> new gyu<>($$0, 0.75F, true));
      a(bwo.bj, gym::new);
      a(bwo.bk, gyu::new);
      a(bwo.bl, gyn::new);
      a(bwo.bm, $$0 -> new gxm($$0, gjb.dj));
      a(bwo.bn, gyo::new);
      a(bwo.bo, gyp::new);
      a(bwo.aV, gyu::new);
      a(bwo.bp, $$0 -> new gvk($$0, gjb.dl));
      a(bwo.bq, $$0 -> new gvk($$0, gjb.dm));
      a(bwo.br, $$0 -> new gyq<>($$0, new gic($$0.a(gjb.dn)), new gic($$0.a(gjb.do))));
      a(bwo.bs, gyr::new);
      a(bwo.bt, gys::new);
      a(bwo.bu, gyt::new);
      a(bwo.bv, gvv.c::new);
      a(bwo.bw, gyy::new);
      a(bwo.bx, gyx::new);
      a(bwo.by, $$0 -> new gxj($$0, gjb.dz, gjb.dA));
      a(bwo.bz, gyv::new);
      a(bwo.bA, gyz::new);
      a(bwo.bB, gza::new);
      a(bwo.bC, gzc::new);
      a(bwo.bD, gzd::new);
      a(bwo.bE, gze::new);
      a(bwo.bF, gzf::new);
      a(bwo.bG, gzg::new);
      a(bwo.bH, gzh::new);
      a(bwo.bI, gzi::new);
      a(bwo.bJ, gzj::new);
      a(bwo.bK, gzk::new);
      a(bwo.bL, gzl::new);
      a(bwo.bM, gzm::new);
      a(bwo.bN, gzn::new);
      a(bwo.bO, gzo::new);
      a(bwo.bP, $$0 -> new gzb($$0, gzb.a.b));
      a(bwo.bQ, gzp::new);
      a(bwo.bR, $$0 -> new gzq($$0, gjb.ew, gjb.ex, gjb.eA, gjb.eB, gjb.ey, gjb.ez));
   }
}
