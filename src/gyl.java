import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gyl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxe<?>, gyk<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hme.a, gyk<gqy>> c = Map.of(hme.a.b, $$0 -> new hdr($$0, false), hme.a.a, $$0 -> new hdr($$0, true));

   private static <T extends bwv> void a(bxe<? extends T> $$0, gyk<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bxe<?>, gyj<?, ?>> a(gyk.a $$0) {
      Builder<bxe<?>, gyj<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mh.f.b((bxe<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hme.a, gyj<? extends crz, ?>> b(gyk.a $$0) {
      Builder<hme.a, gyj<? extends crz, ?>> $$1 = ImmutableMap.builder();
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

      for (bxe<?> $$1 : mh.f) {
         if ($$1 != bxe.bT && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mh.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bxe.b, $$0 -> new gxn($$0, glf.a));
      a(bxe.c, $$0 -> new gxn($$0, glf.b));
      a(bxe.d, gxf::new);
      a(bxe.e, gzs::new);
      a(bxe.f, gxg::new);
      a(bxe.g, gxh::new);
      a(bxe.h, haz::new);
      a(bxe.i, gxj::new);
      a(bxe.j, $$0 -> new haf($$0, glf.o));
      a(bxe.k, $$0 -> new haf($$0, glf.p));
      a(bxe.l, gxk::new);
      a(bxe.m, gxl::new);
      a(bxe.n, $$0 -> new gxn($$0, glf.B));
      a(bxe.o, $$0 -> new gxn($$0, glf.C));
      a(bxe.p, gxm::new);
      a(bxe.q, gxy.a::new);
      a(bxe.r, gxo::new);
      a(bxe.s, gxp::new);
      a(bxe.t, hbk::new);
      a(bxe.u, gxq::new);
      a(bxe.v, gxr::new);
      a(bxe.w, gxs::new);
      a(bxe.x, $$0 -> new gxn($$0, glf.V));
      a(bxe.y, $$0 -> new gxn($$0, glf.W));
      a(bxe.z, $$0 -> new gzp($$0, glf.Y));
      a(bxe.A, gxt::new);
      a(bxe.B, gxu::new);
      a(bxe.C, $$0 -> new gzp($$0, glf.ai));
      a(bxe.D, gxv::new);
      a(bxe.E, gxw::new);
      a(bxe.F, gxx::new);
      a(bxe.G, $$0 -> new gxn($$0, glf.at));
      a(bxe.H, $$0 -> new gxn($$0, glf.au));
      a(bxe.I, gxz::new);
      a(bxe.J, $$0 -> new gya<>($$0, gya.a.a));
      a(bxe.K, gyb::new);
      a(bxe.L, gyc::new);
      a(bxe.M, hax::new);
      a(bxe.N, gyd::new);
      a(bxe.O, gyg::new);
      a(bxe.P, gyh::new);
      a(bxe.Q, gyf::new);
      a(bxe.R, hax::new);
      a(bxe.S, gye::new);
      a(bxe.T, gyn::new);
      a(bxe.U, gym::new);
      a(bxe.V, hax::new);
      a(bxe.W, gyo::new);
      a(bxe.X, $$0 -> new hax<>($$0, 1.0F, true));
      a(bxe.Y, gyp::new);
      a(bxe.Z, $$0 -> new hax<>($$0, 3.0F, true));
      a(bxe.aa, gyq::new);
      a(bxe.bU, gyr::new);
      a(bxe.ab, gys::new);
      a(bxe.ac, gyt::new);
      a(bxe.ad, $$0 -> new gzp($$0, glf.ba));
      a(bxe.ae, gyu::new);
      a(bxe.af, $$0 -> new gyv($$0, 6.0F));
      a(bxe.ag, gzh::new);
      a(bxe.ah, $$0 -> new gyw($$0, new gkg($$0.a(glf.bf)), new gkg($$0.a(glf.bg))));
      a(bxe.ai, gyx::new);
      a(bxe.aj, gyy::new);
      a(bxe.ak, gyz::new);
      a(bxe.al, $$0 -> new gzp($$0, glf.bm));
      a(bxe.am, gza::new);
      a(bxe.an, gzc::new);
      a(bxe.ao, gze::new);
      a(bxe.ap, gzs::new);
      a(bxe.aq, gzf::new);
      a(bxe.ar, gzg::new);
      a(bxe.as, gxy.b::new);
      a(bxe.at, gzh::new);
      a(bxe.au, $$0 -> new gxn($$0, glf.bB));
      a(bxe.av, $$0 -> new gxn($$0, glf.bC));
      a(bxe.aw, gzj::new);
      a(bxe.ax, gzk::new);
      a(bxe.aX, hax::new);
      a(bxe.ay, $$0 -> new gzm($$0, glf.bE, glf.bF));
      a(bxe.az, gzn::new);
      a(bxe.aA, gzo::new);
      a(bxe.aB, $$0 -> new gxn($$0, glf.bK));
      a(bxe.aC, $$0 -> new gxn($$0, glf.bL));
      a(bxe.aD, gzs::new);
      a(bxe.aE, $$0 -> new gzp($$0, glf.bM));
      a(bxe.aF, gzr::new);
      a(bxe.aG, $$0 -> new gya<>($$0, gya.a.b));
      a(bxe.aH, $$0 -> new gxn($$0, glf.bT));
      a(bxe.aI, $$0 -> new gxn($$0, glf.bU));
      a(bxe.aJ, gzt::new);
      a(bxe.aK, gzu::new);
      a(bxe.aL, gzv::new);
      a(bxe.aM, $$0 -> new gxn($$0, glf.bX));
      a(bxe.aN, $$0 -> new gxn($$0, glf.bY));
      a(bxe.aO, gzw::new);
      a(bxe.aP, gzx::new);
      a(bxe.aQ, gzy::new);
      a(bxe.aR, gzz::new);
      a(bxe.aS, $$0 -> new haa($$0, glf.ce, glf.cf, glf.cm, glf.cn, glf.cg, glf.ch));
      a(bxe.aT, $$0 -> new haa($$0, glf.ci, glf.ci, glf.cj, glf.ck, glf.cj, glf.ck));
      a(bxe.aU, hab::new);
      a(bxe.aV, hac::new);
      a(bxe.aY, had::new);
      a(bxe.aZ, hae::new);
      a(bxe.ba, hag::new);
      a(bxe.bb, hai::new);
      a(bxe.bc, haj::new);
      a(bxe.bd, hal::new);
      a(bxe.be, hak::new);
      a(bxe.bf, ham::new);
      a(bxe.bg, han::new);
      a(bxe.bh, $$0 -> new hbe($$0, hbe.a.a));
      a(bxe.bi, hao::new);
      a(bxe.bj, $$0 -> new hax<>($$0, 0.75F, true));
      a(bxe.bk, hap::new);
      a(bxe.bl, hax::new);
      a(bxe.bm, haq::new);
      a(bxe.bn, $$0 -> new gzp($$0, glf.dl));
      a(bxe.bo, har::new);
      a(bxe.bp, has::new);
      a(bxe.aW, hax::new);
      a(bxe.bq, $$0 -> new gxn($$0, glf.dn));
      a(bxe.br, $$0 -> new gxn($$0, glf.do));
      a(bxe.bs, $$0 -> new hat<>($$0, new gkg($$0.a(glf.dp)), new gkg($$0.a(glf.dq))));
      a(bxe.bt, hau::new);
      a(bxe.bu, hav::new);
      a(bxe.bv, haw::new);
      a(bxe.bw, gxy.c::new);
      a(bxe.bx, hbb::new);
      a(bxe.by, hba::new);
      a(bxe.bz, $$0 -> new gzm($$0, glf.dB, glf.dC));
      a(bxe.bA, hay::new);
      a(bxe.bB, hbc::new);
      a(bxe.bC, hbd::new);
      a(bxe.bD, hbf::new);
      a(bxe.bE, hbg::new);
      a(bxe.bF, hbh::new);
      a(bxe.bG, hbi::new);
      a(bxe.bH, hbj::new);
      a(bxe.bI, hbk::new);
      a(bxe.bJ, hbl::new);
      a(bxe.bK, hbm::new);
      a(bxe.bL, hbn::new);
      a(bxe.bM, hbo::new);
      a(bxe.bN, hbp::new);
      a(bxe.bO, hbq::new);
      a(bxe.bP, hbr::new);
      a(bxe.bQ, $$0 -> new hbe($$0, hbe.a.b));
      a(bxe.bR, hbs::new);
      a(bxe.bS, $$0 -> new hbt($$0, glf.ey, glf.ez, glf.eC, glf.eD, glf.eA, glf.eB));
   }
}
