import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gwa {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwm<?>, gvz<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hjq.a, gvz<gom>> c = Map.of(hjq.a.b, $$0 -> new hbf($$0, false), hjq.a.a, $$0 -> new hbf($$0, true));

   private static <T extends bwd> void a(bwm<? extends T> $$0, gvz<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwm<?>, gvy<?, ?>> a(gvz.a $$0) {
      Builder<bwm<?>, gvy<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mf.f.b((bwm<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hjq.a, gvy<? extends cqy, ?>> b(gvz.a $$0) {
      Builder<hjq.a, gvy<? extends cqy, ?>> $$1 = ImmutableMap.builder();
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

      for (bwm<?> $$1 : mf.f) {
         if ($$1 != bwm.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mf.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bwm.a, $$0 -> new gvc($$0, git.a));
      a(bwm.b, $$0 -> new gvc($$0, git.b));
      a(bwm.c, guu::new);
      a(bwm.d, gxh::new);
      a(bwm.e, guv::new);
      a(bwm.f, guw::new);
      a(bwm.g, gyo::new);
      a(bwm.h, guy::new);
      a(bwm.i, $$0 -> new gxu($$0, git.o));
      a(bwm.j, $$0 -> new gxu($$0, git.p));
      a(bwm.k, guz::new);
      a(bwm.l, gva::new);
      a(bwm.m, $$0 -> new gvc($$0, git.B));
      a(bwm.n, $$0 -> new gvc($$0, git.C));
      a(bwm.o, gvb::new);
      a(bwm.p, gvn.a::new);
      a(bwm.q, gvd::new);
      a(bwm.r, gve::new);
      a(bwm.s, gyz::new);
      a(bwm.t, gvf::new);
      a(bwm.u, gvg::new);
      a(bwm.v, gvh::new);
      a(bwm.w, $$0 -> new gvc($$0, git.V));
      a(bwm.x, $$0 -> new gvc($$0, git.W));
      a(bwm.y, $$0 -> new gxe($$0, git.Y));
      a(bwm.z, gvi::new);
      a(bwm.A, gvj::new);
      a(bwm.B, $$0 -> new gxe($$0, git.ag));
      a(bwm.C, gvk::new);
      a(bwm.D, gvl::new);
      a(bwm.E, gvm::new);
      a(bwm.F, $$0 -> new gvc($$0, git.ar));
      a(bwm.G, $$0 -> new gvc($$0, git.as));
      a(bwm.H, gvo::new);
      a(bwm.I, $$0 -> new gvp<>($$0, gvp.a.a));
      a(bwm.J, gvq::new);
      a(bwm.K, gvr::new);
      a(bwm.L, gym::new);
      a(bwm.M, gvs::new);
      a(bwm.N, gvv::new);
      a(bwm.O, gvw::new);
      a(bwm.P, gvu::new);
      a(bwm.Q, gym::new);
      a(bwm.R, gvt::new);
      a(bwm.S, gwc::new);
      a(bwm.T, gwb::new);
      a(bwm.U, gym::new);
      a(bwm.V, gwd::new);
      a(bwm.W, $$0 -> new gym<>($$0, 1.0F, true));
      a(bwm.X, gwe::new);
      a(bwm.Y, $$0 -> new gym<>($$0, 3.0F, true));
      a(bwm.Z, gwf::new);
      a(bwm.bT, gwg::new);
      a(bwm.aa, gwh::new);
      a(bwm.ab, gwi::new);
      a(bwm.ac, $$0 -> new gxe($$0, git.aY));
      a(bwm.ad, gwj::new);
      a(bwm.ae, $$0 -> new gwk($$0, 6.0F));
      a(bwm.af, gww::new);
      a(bwm.ag, $$0 -> new gwl($$0, new ghu($$0.a(git.bd)), new ghu($$0.a(git.be))));
      a(bwm.ah, gwm::new);
      a(bwm.ai, gwn::new);
      a(bwm.aj, gwo::new);
      a(bwm.ak, $$0 -> new gxe($$0, git.bk));
      a(bwm.al, gwp::new);
      a(bwm.am, gwr::new);
      a(bwm.an, gwt::new);
      a(bwm.ao, gxh::new);
      a(bwm.ap, gwu::new);
      a(bwm.aq, gwv::new);
      a(bwm.ar, gvn.b::new);
      a(bwm.as, gww::new);
      a(bwm.at, $$0 -> new gvc($$0, git.bz));
      a(bwm.au, $$0 -> new gvc($$0, git.bA));
      a(bwm.av, gwy::new);
      a(bwm.aw, gwz::new);
      a(bwm.aW, gym::new);
      a(bwm.ax, $$0 -> new gxb($$0, git.bC, git.bD));
      a(bwm.ay, gxc::new);
      a(bwm.az, gxd::new);
      a(bwm.aA, $$0 -> new gvc($$0, git.bI));
      a(bwm.aB, $$0 -> new gvc($$0, git.bJ));
      a(bwm.aC, gxh::new);
      a(bwm.aD, $$0 -> new gxe($$0, git.bK));
      a(bwm.aE, gxg::new);
      a(bwm.aF, $$0 -> new gvp<>($$0, gvp.a.b));
      a(bwm.aG, $$0 -> new gvc($$0, git.bR));
      a(bwm.aH, $$0 -> new gvc($$0, git.bS));
      a(bwm.aI, gxi::new);
      a(bwm.aJ, gxj::new);
      a(bwm.aK, gxk::new);
      a(bwm.aL, $$0 -> new gvc($$0, git.bV));
      a(bwm.aM, $$0 -> new gvc($$0, git.bW));
      a(bwm.aN, gxl::new);
      a(bwm.aO, gxm::new);
      a(bwm.aP, gxn::new);
      a(bwm.aQ, gxo::new);
      a(bwm.aR, $$0 -> new gxp($$0, git.cc, git.cd, git.ck, git.cl, git.ce, git.cf));
      a(bwm.aS, $$0 -> new gxp($$0, git.cg, git.cg, git.ch, git.ci, git.ch, git.ci));
      a(bwm.aT, gxq::new);
      a(bwm.aU, gxr::new);
      a(bwm.aX, gxs::new);
      a(bwm.aY, gxt::new);
      a(bwm.aZ, gxv::new);
      a(bwm.ba, gxx::new);
      a(bwm.bb, gxy::new);
      a(bwm.bc, gya::new);
      a(bwm.bd, gxz::new);
      a(bwm.be, gyb::new);
      a(bwm.bf, gyc::new);
      a(bwm.bg, $$0 -> new gyt($$0, gyt.a.a));
      a(bwm.bh, gyd::new);
      a(bwm.bi, $$0 -> new gym<>($$0, 0.75F, true));
      a(bwm.bj, gye::new);
      a(bwm.bk, gym::new);
      a(bwm.bl, gyf::new);
      a(bwm.bm, $$0 -> new gxe($$0, git.dh));
      a(bwm.bn, gyg::new);
      a(bwm.bo, gyh::new);
      a(bwm.aV, gym::new);
      a(bwm.bp, $$0 -> new gvc($$0, git.dj));
      a(bwm.bq, $$0 -> new gvc($$0, git.dk));
      a(bwm.br, $$0 -> new gyi<>($$0, new ghu($$0.a(git.dl)), new ghu($$0.a(git.dm))));
      a(bwm.bs, gyj::new);
      a(bwm.bt, gyk::new);
      a(bwm.bu, gyl::new);
      a(bwm.bv, gvn.c::new);
      a(bwm.bw, gyq::new);
      a(bwm.bx, gyp::new);
      a(bwm.by, $$0 -> new gxb($$0, git.dx, git.dy));
      a(bwm.bz, gyn::new);
      a(bwm.bA, gyr::new);
      a(bwm.bB, gys::new);
      a(bwm.bC, gyu::new);
      a(bwm.bD, gyv::new);
      a(bwm.bE, gyw::new);
      a(bwm.bF, gyx::new);
      a(bwm.bG, gyy::new);
      a(bwm.bH, gyz::new);
      a(bwm.bI, gza::new);
      a(bwm.bJ, gzb::new);
      a(bwm.bK, gzc::new);
      a(bwm.bL, gzd::new);
      a(bwm.bM, gze::new);
      a(bwm.bN, gzf::new);
      a(bwm.bO, gzg::new);
      a(bwm.bP, $$0 -> new gyt($$0, gyt.a.b));
      a(bwm.bQ, gzh::new);
      a(bwm.bR, $$0 -> new gzi($$0, git.eu, git.ev, git.ey, git.ez, git.ew, git.ex));
   }
}
