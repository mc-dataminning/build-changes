import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fxp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blj<?>, fxo<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<geo.a, fxo<frh>> c = Map.of(geo.a.b, $$0 -> new gcr($$0, false), geo.a.a, $$0 -> new gcr($$0, true));

   private static <T extends blf> void a(blj<? extends T> $$0, fxo<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<blj<?>, fxn<?>> a(fxo.a $$0) {
      Builder<blj<?>, fxn<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kb.g.b((blj<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<geo.a, fxn<? extends cer>> b(fxo.a $$0) {
      Builder<geo.a, fxn<? extends cer>> $$1 = ImmutableMap.builder();
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

      for (blj<?> $$1 : kb.g) {
         if ($$1 != blj.bv && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kb.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(blj.b, fwm::new);
      a(blj.c, fyw::new);
      a(blj.d, fwn::new);
      a(blj.e, gab::new);
      a(blj.f, fwp::new);
      a(blj.g, fwq::new);
      a(blj.h, fwr::new);
      a(blj.i, fws::new);
      a(blj.j, fxd.a::new);
      a(blj.k, $$0 -> new fwt($$0, false));
      a(blj.l, fwu::new);
      a(blj.n, fww::new);
      a(blj.m, $$0 -> new fwv($$0, flx.s));
      a(blj.o, fwx::new);
      a(blj.p, $$0 -> new fwt($$0, true));
      a(blj.q, $$0 -> new fyt<>($$0, flx.v));
      a(blj.r, fwz::new);
      a(blj.s, fxa::new);
      a(blj.t, $$0 -> new fyt<>($$0, flx.y));
      a(blj.u, fxb::new);
      a(blj.v, fxc::new);
      a(blj.w, fxe::new);
      a(blj.x, $$0 -> new fwy<>($$0, 0.87F, flx.K));
      a(blj.y, fxf::new);
      a(blj.z, fxg::new);
      a(blj.A, fzz::new);
      a(blj.B, fxh::new);
      a(blj.F, fxk::new);
      a(blj.G, fxl::new);
      a(blj.D, fxj::new);
      a(blj.E, fzz::new);
      a(blj.C, fxi::new);
      a(blj.H, fxr::new);
      a(blj.I, fxq::new);
      a(blj.J, fzz::new);
      a(blj.K, fxs::new);
      a(blj.L, $$0 -> new fzz<>($$0, 1.0F, true));
      a(blj.M, fxt::new);
      a(blj.ah, $$0 -> new fzz<>($$0, 3.0F, true));
      a(blj.N, fxu::new);
      a(blj.bw, fxv::new);
      a(blj.O, fxw::new);
      a(blj.P, fxx::new);
      a(blj.Q, $$0 -> new fyt<>($$0, flx.ac));
      a(blj.R, fxy::new);
      a(blj.S, $$0 -> new fxz($$0, 6.0F));
      a(blj.T, fyl::new);
      a(blj.U, $$0 -> new fya($$0, new fla<>($$0.a(flx.ah))));
      a(blj.V, fyb::new);
      a(blj.W, fyc::new);
      a(blj.X, fyd::new);
      a(blj.Y, $$0 -> new fyt<>($$0, flx.al));
      a(blj.Z, fye::new);
      a(blj.aa, fyg::new);
      a(blj.ab, fyi::new);
      a(blj.ac, fyw::new);
      a(blj.ad, fyj::new);
      a(blj.ae, fyk::new);
      a(blj.af, fxd.b::new);
      a(blj.ag, fyl::new);
      a(blj.ai, fyn::new);
      a(blj.aj, fyo::new);
      a(blj.ak, $$0 -> new fyq($$0, flx.au));
      a(blj.al, fyr::new);
      a(blj.am, fys::new);
      a(blj.an, fyw::new);
      a(blj.ao, $$0 -> new fyt<>($$0, flx.ay));
      a(blj.ap, fyv::new);
      a(blj.aq, $$0 -> new fwy<>($$0, 0.92F, flx.aA));
      a(blj.ar, fyx::new);
      a(blj.as, fyy::new);
      a(blj.at, fyz::new);
      a(blj.au, fza::new);
      a(blj.av, fzb::new);
      a(blj.aw, fzc::new);
      a(blj.ax, $$0 -> new fzd($$0, flx.aG, flx.aL, flx.aM, false));
      a(blj.ay, $$0 -> new fzd($$0, flx.aH, flx.aI, flx.aJ, false));
      a(blj.az, fze::new);
      a(blj.aA, fzf::new);
      a(blj.aB, fzz::new);
      a(blj.aC, fzg::new);
      a(blj.aD, fzh::new);
      a(blj.aE, fzi::new);
      a(blj.aF, fzk::new);
      a(blj.aG, fzl::new);
      a(blj.aH, fzn::new);
      a(blj.aI, fzm::new);
      a(blj.aJ, fzo::new);
      a(blj.aK, fzp::new);
      a(blj.aL, $$0 -> new gag($$0, flx.bl));
      a(blj.aM, fzq::new);
      a(blj.aN, $$0 -> new fzz<>($$0, 0.75F, true));
      a(blj.aO, fzr::new);
      a(blj.aQ, fzz::new);
      a(blj.aP, fzs::new);
      a(blj.aR, $$0 -> new fyt<>($$0, flx.bt));
      a(blj.aS, fzt::new);
      a(blj.aT, fzu::new);
      a(blj.aU, $$0 -> new fzv<>($$0, new fla<>($$0.a(flx.bv))));
      a(blj.aV, fzw::new);
      a(blj.aW, fzx::new);
      a(blj.aX, fzy::new);
      a(blj.aY, fxd.c::new);
      a(blj.aZ, gad::new);
      a(blj.ba, gac::new);
      a(blj.bb, $$0 -> new fyq($$0, flx.bE));
      a(blj.bc, gaa::new);
      a(blj.bd, gae::new);
      a(blj.be, gaf::new);
      a(blj.bf, gah::new);
      a(blj.bg, gai::new);
      a(blj.bh, gaj::new);
      a(blj.bj, gal::new);
      a(blj.bi, gak::new);
      a(blj.bk, gam::new);
      a(blj.bl, gan::new);
      a(blj.bm, gao::new);
      a(blj.bn, gap::new);
      a(blj.bo, gaq::new);
      a(blj.bp, gar::new);
      a(blj.bq, gas::new);
      a(blj.br, gat::new);
      a(blj.bs, $$0 -> new gag($$0, flx.cd));
      a(blj.bt, gau::new);
      a(blj.bu, $$0 -> new fzd($$0, flx.cj, flx.ck, flx.cl, true));
   }
}
