import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fvy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bku<?>, fvx<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gcu.a, fvx<fpt>> c = Map.of(gcu.a.b, $$0 -> new gax($$0, false), gcu.a.a, $$0 -> new gax($$0, true));

   private static <T extends bkq> void a(bku<? extends T> $$0, fvx<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bku<?>, fvw<?>> a(fvx.a $$0) {
      Builder<bku<?>, fvw<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jy.h.b((bku<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gcu.a, fvw<? extends cdu>> b(fvx.a $$0) {
      Builder<gcu.a, fvw<? extends cdu>> $$1 = ImmutableMap.builder();
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

      for (bku<?> $$1 : jy.h) {
         if ($$1 != bku.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jy.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bku.b, fuw::new);
      a(bku.c, fxf::new);
      a(bku.d, fux::new);
      a(bku.e, fyk::new);
      a(bku.f, fuz::new);
      a(bku.g, fva::new);
      a(bku.h, fvb::new);
      a(bku.i, fvc::new);
      a(bku.j, fvm.a::new);
      a(bku.k, $$0 -> new fvd($$0, false));
      a(bku.m, fvf::new);
      a(bku.l, $$0 -> new fve($$0, fkn.p));
      a(bku.n, fvg::new);
      a(bku.o, $$0 -> new fvd($$0, true));
      a(bku.p, $$0 -> new fxc<>($$0, fkn.s));
      a(bku.q, fvi::new);
      a(bku.r, fvj::new);
      a(bku.s, $$0 -> new fxc<>($$0, fkn.v));
      a(bku.t, fvk::new);
      a(bku.u, fvl::new);
      a(bku.v, fvn::new);
      a(bku.w, $$0 -> new fvh<>($$0, 0.87F, fkn.H));
      a(bku.x, fvo::new);
      a(bku.y, fvp::new);
      a(bku.z, fyi::new);
      a(bku.A, fvq::new);
      a(bku.E, fvt::new);
      a(bku.F, fvu::new);
      a(bku.C, fvs::new);
      a(bku.D, fyi::new);
      a(bku.B, fvr::new);
      a(bku.G, fwa::new);
      a(bku.H, fvz::new);
      a(bku.I, fyi::new);
      a(bku.J, fwb::new);
      a(bku.K, $$0 -> new fyi<>($$0, 1.0F, true));
      a(bku.L, fwc::new);
      a(bku.ag, $$0 -> new fyi<>($$0, 3.0F, true));
      a(bku.M, fwd::new);
      a(bku.bu, fwe::new);
      a(bku.N, fwf::new);
      a(bku.O, fwg::new);
      a(bku.P, $$0 -> new fxc<>($$0, fkn.Z));
      a(bku.Q, fwh::new);
      a(bku.R, $$0 -> new fwi($$0, 6.0F));
      a(bku.S, fwu::new);
      a(bku.T, $$0 -> new fwj($$0, new fjr<>($$0.a(fkn.ae))));
      a(bku.U, fwk::new);
      a(bku.V, fwl::new);
      a(bku.W, fwm::new);
      a(bku.X, $$0 -> new fxc<>($$0, fkn.ai));
      a(bku.Y, fwn::new);
      a(bku.Z, fwp::new);
      a(bku.aa, fwr::new);
      a(bku.ab, fxf::new);
      a(bku.ac, fws::new);
      a(bku.ad, fwt::new);
      a(bku.ae, fvm.b::new);
      a(bku.af, fwu::new);
      a(bku.ah, fww::new);
      a(bku.ai, fwx::new);
      a(bku.aj, $$0 -> new fwz($$0, fkn.ar));
      a(bku.ak, fxa::new);
      a(bku.al, fxb::new);
      a(bku.am, fxf::new);
      a(bku.an, $$0 -> new fxc<>($$0, fkn.av));
      a(bku.ao, fxe::new);
      a(bku.ap, $$0 -> new fvh<>($$0, 0.92F, fkn.ax));
      a(bku.aq, fxg::new);
      a(bku.ar, fxh::new);
      a(bku.as, fxi::new);
      a(bku.at, fxj::new);
      a(bku.au, fxk::new);
      a(bku.av, fxl::new);
      a(bku.aw, $$0 -> new fxm($$0, fkn.aD, fkn.aI, fkn.aJ, false));
      a(bku.ax, $$0 -> new fxm($$0, fkn.aE, fkn.aF, fkn.aG, false));
      a(bku.ay, fxn::new);
      a(bku.az, fxo::new);
      a(bku.aA, fyi::new);
      a(bku.aB, fxp::new);
      a(bku.aC, fxq::new);
      a(bku.aD, fxr::new);
      a(bku.aE, fxt::new);
      a(bku.aF, fxu::new);
      a(bku.aG, fxw::new);
      a(bku.aH, fxv::new);
      a(bku.aI, fxx::new);
      a(bku.aJ, fxy::new);
      a(bku.aK, $$0 -> new fyp($$0, fkn.bi));
      a(bku.aL, fxz::new);
      a(bku.aM, $$0 -> new fyi<>($$0, 0.75F, true));
      a(bku.aN, fya::new);
      a(bku.aP, fyi::new);
      a(bku.aO, fyb::new);
      a(bku.aQ, $$0 -> new fxc<>($$0, fkn.bq));
      a(bku.aR, fyc::new);
      a(bku.aS, fyd::new);
      a(bku.aT, $$0 -> new fye<>($$0, new fjr<>($$0.a(fkn.bs))));
      a(bku.aU, fyf::new);
      a(bku.aV, fyg::new);
      a(bku.aW, fyh::new);
      a(bku.aX, fvm.c::new);
      a(bku.aY, fym::new);
      a(bku.aZ, fyl::new);
      a(bku.ba, $$0 -> new fwz($$0, fkn.bB));
      a(bku.bb, fyj::new);
      a(bku.bc, fyn::new);
      a(bku.bd, fyo::new);
      a(bku.be, fyq::new);
      a(bku.bf, fyr::new);
      a(bku.bg, fys::new);
      a(bku.bi, fyu::new);
      a(bku.bh, fyt::new);
      a(bku.bj, fyv::new);
      a(bku.bk, fyw::new);
      a(bku.bl, fyx::new);
      a(bku.bm, fyy::new);
      a(bku.bn, fyz::new);
      a(bku.bo, fza::new);
      a(bku.bp, fzb::new);
      a(bku.bq, $$0 -> new fyp($$0, fkn.bZ));
      a(bku.br, fzc::new);
      a(bku.bs, $$0 -> new fxm($$0, fkn.cf, fkn.cg, fkn.ch, true));
   }
}
