import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fwd {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bkz<?>, fwc<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gcz.a, fwc<fpy>> c = Map.of(gcz.a.b, $$0 -> new gbc($$0, false), gcz.a.a, $$0 -> new gbc($$0, true));

   private static <T extends bkv> void a(bkz<? extends T> $$0, fwc<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bkz<?>, fwb<?>> a(fwc.a $$0) {
      Builder<bkz<?>, fwb<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kc.h.b((bkz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gcz.a, fwb<? extends cdz>> b(fwc.a $$0) {
      Builder<gcz.a, fwb<? extends cdz>> $$1 = ImmutableMap.builder();
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

      for (bkz<?> $$1 : kc.h) {
         if ($$1 != bkz.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kc.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bkz.b, fvb::new);
      a(bkz.c, fxk::new);
      a(bkz.d, fvc::new);
      a(bkz.e, fyp::new);
      a(bkz.f, fve::new);
      a(bkz.g, fvf::new);
      a(bkz.h, fvg::new);
      a(bkz.i, fvh::new);
      a(bkz.j, fvr.a::new);
      a(bkz.k, $$0 -> new fvi($$0, false));
      a(bkz.m, fvk::new);
      a(bkz.l, $$0 -> new fvj($$0, fks.p));
      a(bkz.n, fvl::new);
      a(bkz.o, $$0 -> new fvi($$0, true));
      a(bkz.p, $$0 -> new fxh<>($$0, fks.s));
      a(bkz.q, fvn::new);
      a(bkz.r, fvo::new);
      a(bkz.s, $$0 -> new fxh<>($$0, fks.v));
      a(bkz.t, fvp::new);
      a(bkz.u, fvq::new);
      a(bkz.v, fvs::new);
      a(bkz.w, $$0 -> new fvm<>($$0, 0.87F, fks.H));
      a(bkz.x, fvt::new);
      a(bkz.y, fvu::new);
      a(bkz.z, fyn::new);
      a(bkz.A, fvv::new);
      a(bkz.E, fvy::new);
      a(bkz.F, fvz::new);
      a(bkz.C, fvx::new);
      a(bkz.D, fyn::new);
      a(bkz.B, fvw::new);
      a(bkz.G, fwf::new);
      a(bkz.H, fwe::new);
      a(bkz.I, fyn::new);
      a(bkz.J, fwg::new);
      a(bkz.K, $$0 -> new fyn<>($$0, 1.0F, true));
      a(bkz.L, fwh::new);
      a(bkz.ag, $$0 -> new fyn<>($$0, 3.0F, true));
      a(bkz.M, fwi::new);
      a(bkz.bu, fwj::new);
      a(bkz.N, fwk::new);
      a(bkz.O, fwl::new);
      a(bkz.P, $$0 -> new fxh<>($$0, fks.Z));
      a(bkz.Q, fwm::new);
      a(bkz.R, $$0 -> new fwn($$0, 6.0F));
      a(bkz.S, fwz::new);
      a(bkz.T, $$0 -> new fwo($$0, new fjw<>($$0.a(fks.ae))));
      a(bkz.U, fwp::new);
      a(bkz.V, fwq::new);
      a(bkz.W, fwr::new);
      a(bkz.X, $$0 -> new fxh<>($$0, fks.ai));
      a(bkz.Y, fws::new);
      a(bkz.Z, fwu::new);
      a(bkz.aa, fww::new);
      a(bkz.ab, fxk::new);
      a(bkz.ac, fwx::new);
      a(bkz.ad, fwy::new);
      a(bkz.ae, fvr.b::new);
      a(bkz.af, fwz::new);
      a(bkz.ah, fxb::new);
      a(bkz.ai, fxc::new);
      a(bkz.aj, $$0 -> new fxe($$0, fks.ar));
      a(bkz.ak, fxf::new);
      a(bkz.al, fxg::new);
      a(bkz.am, fxk::new);
      a(bkz.an, $$0 -> new fxh<>($$0, fks.av));
      a(bkz.ao, fxj::new);
      a(bkz.ap, $$0 -> new fvm<>($$0, 0.92F, fks.ax));
      a(bkz.aq, fxl::new);
      a(bkz.ar, fxm::new);
      a(bkz.as, fxn::new);
      a(bkz.at, fxo::new);
      a(bkz.au, fxp::new);
      a(bkz.av, fxq::new);
      a(bkz.aw, $$0 -> new fxr($$0, fks.aD, fks.aI, fks.aJ, false));
      a(bkz.ax, $$0 -> new fxr($$0, fks.aE, fks.aF, fks.aG, false));
      a(bkz.ay, fxs::new);
      a(bkz.az, fxt::new);
      a(bkz.aA, fyn::new);
      a(bkz.aB, fxu::new);
      a(bkz.aC, fxv::new);
      a(bkz.aD, fxw::new);
      a(bkz.aE, fxy::new);
      a(bkz.aF, fxz::new);
      a(bkz.aG, fyb::new);
      a(bkz.aH, fya::new);
      a(bkz.aI, fyc::new);
      a(bkz.aJ, fyd::new);
      a(bkz.aK, $$0 -> new fyu($$0, fks.bi));
      a(bkz.aL, fye::new);
      a(bkz.aM, $$0 -> new fyn<>($$0, 0.75F, true));
      a(bkz.aN, fyf::new);
      a(bkz.aP, fyn::new);
      a(bkz.aO, fyg::new);
      a(bkz.aQ, $$0 -> new fxh<>($$0, fks.bq));
      a(bkz.aR, fyh::new);
      a(bkz.aS, fyi::new);
      a(bkz.aT, $$0 -> new fyj<>($$0, new fjw<>($$0.a(fks.bs))));
      a(bkz.aU, fyk::new);
      a(bkz.aV, fyl::new);
      a(bkz.aW, fym::new);
      a(bkz.aX, fvr.c::new);
      a(bkz.aY, fyr::new);
      a(bkz.aZ, fyq::new);
      a(bkz.ba, $$0 -> new fxe($$0, fks.bB));
      a(bkz.bb, fyo::new);
      a(bkz.bc, fys::new);
      a(bkz.bd, fyt::new);
      a(bkz.be, fyv::new);
      a(bkz.bf, fyw::new);
      a(bkz.bg, fyx::new);
      a(bkz.bi, fyz::new);
      a(bkz.bh, fyy::new);
      a(bkz.bj, fza::new);
      a(bkz.bk, fzb::new);
      a(bkz.bl, fzc::new);
      a(bkz.bm, fzd::new);
      a(bkz.bn, fze::new);
      a(bkz.bo, fzf::new);
      a(bkz.bp, fzg::new);
      a(bkz.bq, $$0 -> new fyu($$0, fks.bZ));
      a(bkz.br, fzh::new);
      a(bkz.bs, $$0 -> new fxr($$0, fks.cf, fks.cg, fks.ch, true));
   }
}
