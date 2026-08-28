import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gxw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxn<?>, gxv<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hls.a, gxv<gqj>> c = Map.of(hls.a.b, $$0 -> new hdc($$0, false), hls.a.a, $$0 -> new hdc($$0, true));

   private static <T extends bxe> void a(bxn<? extends T> $$0, gxv<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bxn<?>, gxu<?, ?>> a(gxv.a $$0) {
      Builder<bxn<?>, gxu<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mh.f.b((bxn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hls.a, gxu<? extends csi, ?>> b(gxv.a $$0) {
      Builder<hls.a, gxu<? extends csi, ?>> $$1 = ImmutableMap.builder();
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

      for (bxn<?> $$1 : mh.f) {
         if ($$1 != bxn.bT && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mh.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bxn.b, $$0 -> new gwy($$0, gkq.a));
      a(bxn.c, $$0 -> new gwy($$0, gkq.b));
      a(bxn.d, gwq::new);
      a(bxn.e, gzd::new);
      a(bxn.f, gwr::new);
      a(bxn.g, gws::new);
      a(bxn.h, hak::new);
      a(bxn.i, gwu::new);
      a(bxn.j, $$0 -> new gzq($$0, gkq.o));
      a(bxn.k, $$0 -> new gzq($$0, gkq.p));
      a(bxn.l, gwv::new);
      a(bxn.m, gww::new);
      a(bxn.n, $$0 -> new gwy($$0, gkq.B));
      a(bxn.o, $$0 -> new gwy($$0, gkq.C));
      a(bxn.p, gwx::new);
      a(bxn.q, gxj.a::new);
      a(bxn.r, gwz::new);
      a(bxn.s, gxa::new);
      a(bxn.t, hav::new);
      a(bxn.u, gxb::new);
      a(bxn.v, gxc::new);
      a(bxn.w, gxd::new);
      a(bxn.x, $$0 -> new gwy($$0, gkq.V));
      a(bxn.y, $$0 -> new gwy($$0, gkq.W));
      a(bxn.z, $$0 -> new gza($$0, gkq.Y));
      a(bxn.A, gxe::new);
      a(bxn.B, gxf::new);
      a(bxn.C, $$0 -> new gza($$0, gkq.ai));
      a(bxn.D, gxg::new);
      a(bxn.E, gxh::new);
      a(bxn.F, gxi::new);
      a(bxn.G, $$0 -> new gwy($$0, gkq.at));
      a(bxn.H, $$0 -> new gwy($$0, gkq.au));
      a(bxn.I, gxk::new);
      a(bxn.J, $$0 -> new gxl<>($$0, gxl.a.a));
      a(bxn.K, gxm::new);
      a(bxn.L, gxn::new);
      a(bxn.M, hai::new);
      a(bxn.N, gxo::new);
      a(bxn.O, gxr::new);
      a(bxn.P, gxs::new);
      a(bxn.Q, gxq::new);
      a(bxn.R, hai::new);
      a(bxn.S, gxp::new);
      a(bxn.T, gxy::new);
      a(bxn.U, gxx::new);
      a(bxn.V, hai::new);
      a(bxn.W, gxz::new);
      a(bxn.X, $$0 -> new hai<>($$0, 1.0F, true));
      a(bxn.Y, gya::new);
      a(bxn.Z, $$0 -> new hai<>($$0, 3.0F, true));
      a(bxn.aa, gyb::new);
      a(bxn.bU, gyc::new);
      a(bxn.ab, gyd::new);
      a(bxn.ac, gye::new);
      a(bxn.ad, $$0 -> new gza($$0, gkq.ba));
      a(bxn.ae, gyf::new);
      a(bxn.af, $$0 -> new gyg($$0, 6.0F));
      a(bxn.ag, gys::new);
      a(bxn.ah, $$0 -> new gyh($$0, new gjr($$0.a(gkq.bf)), new gjr($$0.a(gkq.bg))));
      a(bxn.ai, gyi::new);
      a(bxn.aj, gyj::new);
      a(bxn.ak, gyk::new);
      a(bxn.al, $$0 -> new gza($$0, gkq.bm));
      a(bxn.am, gyl::new);
      a(bxn.an, gyn::new);
      a(bxn.ao, gyp::new);
      a(bxn.ap, gzd::new);
      a(bxn.aq, gyq::new);
      a(bxn.ar, gyr::new);
      a(bxn.as, gxj.b::new);
      a(bxn.at, gys::new);
      a(bxn.au, $$0 -> new gwy($$0, gkq.bB));
      a(bxn.av, $$0 -> new gwy($$0, gkq.bC));
      a(bxn.aw, gyu::new);
      a(bxn.ax, gyv::new);
      a(bxn.aX, hai::new);
      a(bxn.ay, $$0 -> new gyx($$0, gkq.bE, gkq.bF));
      a(bxn.az, gyy::new);
      a(bxn.aA, gyz::new);
      a(bxn.aB, $$0 -> new gwy($$0, gkq.bK));
      a(bxn.aC, $$0 -> new gwy($$0, gkq.bL));
      a(bxn.aD, gzd::new);
      a(bxn.aE, $$0 -> new gza($$0, gkq.bM));
      a(bxn.aF, gzc::new);
      a(bxn.aG, $$0 -> new gxl<>($$0, gxl.a.b));
      a(bxn.aH, $$0 -> new gwy($$0, gkq.bT));
      a(bxn.aI, $$0 -> new gwy($$0, gkq.bU));
      a(bxn.aJ, gze::new);
      a(bxn.aK, gzf::new);
      a(bxn.aL, gzg::new);
      a(bxn.aM, $$0 -> new gwy($$0, gkq.bX));
      a(bxn.aN, $$0 -> new gwy($$0, gkq.bY));
      a(bxn.aO, gzh::new);
      a(bxn.aP, gzi::new);
      a(bxn.aQ, gzj::new);
      a(bxn.aR, gzk::new);
      a(bxn.aS, $$0 -> new gzl($$0, gkq.ce, gkq.cf, gkq.cm, gkq.cn, gkq.cg, gkq.ch));
      a(bxn.aT, $$0 -> new gzl($$0, gkq.ci, gkq.ci, gkq.cj, gkq.ck, gkq.cj, gkq.ck));
      a(bxn.aU, gzm::new);
      a(bxn.aV, gzn::new);
      a(bxn.aY, gzo::new);
      a(bxn.aZ, gzp::new);
      a(bxn.ba, gzr::new);
      a(bxn.bb, gzt::new);
      a(bxn.bc, gzu::new);
      a(bxn.bd, gzw::new);
      a(bxn.be, gzv::new);
      a(bxn.bf, gzx::new);
      a(bxn.bg, gzy::new);
      a(bxn.bh, $$0 -> new hap($$0, hap.a.a));
      a(bxn.bi, gzz::new);
      a(bxn.bj, $$0 -> new hai<>($$0, 0.75F, true));
      a(bxn.bk, haa::new);
      a(bxn.bl, hai::new);
      a(bxn.bm, hab::new);
      a(bxn.bn, $$0 -> new gza($$0, gkq.dl));
      a(bxn.bo, hac::new);
      a(bxn.bp, had::new);
      a(bxn.aW, hai::new);
      a(bxn.bq, $$0 -> new gwy($$0, gkq.dn));
      a(bxn.br, $$0 -> new gwy($$0, gkq.do));
      a(bxn.bs, $$0 -> new hae<>($$0, new gjr($$0.a(gkq.dp)), new gjr($$0.a(gkq.dq))));
      a(bxn.bt, haf::new);
      a(bxn.bu, hag::new);
      a(bxn.bv, hah::new);
      a(bxn.bw, gxj.c::new);
      a(bxn.bx, ham::new);
      a(bxn.by, hal::new);
      a(bxn.bz, $$0 -> new gyx($$0, gkq.dB, gkq.dC));
      a(bxn.bA, haj::new);
      a(bxn.bB, han::new);
      a(bxn.bC, hao::new);
      a(bxn.bD, haq::new);
      a(bxn.bE, har::new);
      a(bxn.bF, has::new);
      a(bxn.bG, hat::new);
      a(bxn.bH, hau::new);
      a(bxn.bI, hav::new);
      a(bxn.bJ, haw::new);
      a(bxn.bK, hax::new);
      a(bxn.bL, hay::new);
      a(bxn.bM, haz::new);
      a(bxn.bN, hba::new);
      a(bxn.bO, hbb::new);
      a(bxn.bP, hbc::new);
      a(bxn.bQ, $$0 -> new hap($$0, hap.a.b));
      a(bxn.bR, hbd::new);
      a(bxn.bS, $$0 -> new hbe($$0, gkq.ey, gkq.ez, gkq.eC, gkq.eD, gkq.eA, gkq.eB));
   }
}
