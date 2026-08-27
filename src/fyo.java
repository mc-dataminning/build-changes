import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fyo {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blz<?>, fyn<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gfm.a, fyn<fsg>> c = Map.of(gfm.a.b, $$0 -> new gdq($$0, false), gfm.a.a, $$0 -> new gdq($$0, true));

   private static <T extends blv> void a(blz<? extends T> $$0, fyn<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<blz<?>, fym<?>> a(fyn.a $$0) {
      Builder<blz<?>, fym<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kd.g.b((blz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gfm.a, fym<? extends cfi>> b(fyn.a $$0) {
      Builder<gfm.a, fym<? extends cfi>> $$1 = ImmutableMap.builder();
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

      for (blz<?> $$1 : kd.g) {
         if ($$1 != blz.bv && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kd.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(blz.b, fxl::new);
      a(blz.c, fzv::new);
      a(blz.d, fxm::new);
      a(blz.e, gba::new);
      a(blz.f, fxo::new);
      a(blz.g, fxp::new);
      a(blz.h, fxq::new);
      a(blz.i, fxr::new);
      a(blz.j, fyc.a::new);
      a(blz.k, $$0 -> new fxs($$0, false));
      a(blz.l, fxt::new);
      a(blz.n, fxv::new);
      a(blz.m, $$0 -> new fxu($$0, fmw.s));
      a(blz.o, fxw::new);
      a(blz.p, $$0 -> new fxs($$0, true));
      a(blz.q, $$0 -> new fzs<>($$0, fmw.v));
      a(blz.r, fxy::new);
      a(blz.s, fxz::new);
      a(blz.t, $$0 -> new fzs<>($$0, fmw.y));
      a(blz.u, fya::new);
      a(blz.v, fyb::new);
      a(blz.w, fyd::new);
      a(blz.x, $$0 -> new fxx<>($$0, 0.87F, fmw.K));
      a(blz.y, fye::new);
      a(blz.z, fyf::new);
      a(blz.A, gay::new);
      a(blz.B, fyg::new);
      a(blz.F, fyj::new);
      a(blz.G, fyk::new);
      a(blz.D, fyi::new);
      a(blz.E, gay::new);
      a(blz.C, fyh::new);
      a(blz.H, fyq::new);
      a(blz.I, fyp::new);
      a(blz.J, gay::new);
      a(blz.K, fyr::new);
      a(blz.L, $$0 -> new gay<>($$0, 1.0F, true));
      a(blz.M, fys::new);
      a(blz.ah, $$0 -> new gay<>($$0, 3.0F, true));
      a(blz.N, fyt::new);
      a(blz.bw, fyu::new);
      a(blz.O, fyv::new);
      a(blz.P, fyw::new);
      a(blz.Q, $$0 -> new fzs<>($$0, fmw.ac));
      a(blz.R, fyx::new);
      a(blz.S, $$0 -> new fyy($$0, 6.0F));
      a(blz.T, fzk::new);
      a(blz.U, $$0 -> new fyz($$0, new flz<>($$0.a(fmw.ah))));
      a(blz.V, fza::new);
      a(blz.W, fzb::new);
      a(blz.X, fzc::new);
      a(blz.Y, $$0 -> new fzs<>($$0, fmw.al));
      a(blz.Z, fzd::new);
      a(blz.aa, fzf::new);
      a(blz.ab, fzh::new);
      a(blz.ac, fzv::new);
      a(blz.ad, fzi::new);
      a(blz.ae, fzj::new);
      a(blz.af, fyc.b::new);
      a(blz.ag, fzk::new);
      a(blz.ai, fzm::new);
      a(blz.aj, fzn::new);
      a(blz.ak, $$0 -> new fzp($$0, fmw.au));
      a(blz.al, fzq::new);
      a(blz.am, fzr::new);
      a(blz.an, fzv::new);
      a(blz.ao, $$0 -> new fzs<>($$0, fmw.ay));
      a(blz.ap, fzu::new);
      a(blz.aq, $$0 -> new fxx<>($$0, 0.92F, fmw.aA));
      a(blz.ar, fzw::new);
      a(blz.as, fzx::new);
      a(blz.at, fzy::new);
      a(blz.au, fzz::new);
      a(blz.av, gaa::new);
      a(blz.aw, gab::new);
      a(blz.ax, $$0 -> new gac($$0, fmw.aG, fmw.aL, fmw.aM, false));
      a(blz.ay, $$0 -> new gac($$0, fmw.aH, fmw.aI, fmw.aJ, false));
      a(blz.az, gad::new);
      a(blz.aA, gae::new);
      a(blz.aB, gay::new);
      a(blz.aC, gaf::new);
      a(blz.aD, gag::new);
      a(blz.aE, gah::new);
      a(blz.aF, gaj::new);
      a(blz.aG, gak::new);
      a(blz.aH, gam::new);
      a(blz.aI, gal::new);
      a(blz.aJ, gan::new);
      a(blz.aK, gao::new);
      a(blz.aL, $$0 -> new gbf($$0, fmw.bl));
      a(blz.aM, gap::new);
      a(blz.aN, $$0 -> new gay<>($$0, 0.75F, true));
      a(blz.aO, gaq::new);
      a(blz.aQ, gay::new);
      a(blz.aP, gar::new);
      a(blz.aR, $$0 -> new fzs<>($$0, fmw.bt));
      a(blz.aS, gas::new);
      a(blz.aT, gat::new);
      a(blz.aU, $$0 -> new gau<>($$0, new flz<>($$0.a(fmw.bv))));
      a(blz.aV, gav::new);
      a(blz.aW, gaw::new);
      a(blz.aX, gax::new);
      a(blz.aY, fyc.c::new);
      a(blz.aZ, gbc::new);
      a(blz.ba, gbb::new);
      a(blz.bb, $$0 -> new fzp($$0, fmw.bE));
      a(blz.bc, gaz::new);
      a(blz.bd, gbd::new);
      a(blz.be, gbe::new);
      a(blz.bf, gbg::new);
      a(blz.bg, gbh::new);
      a(blz.bh, gbi::new);
      a(blz.bj, gbk::new);
      a(blz.bi, gbj::new);
      a(blz.bk, gbl::new);
      a(blz.bl, gbm::new);
      a(blz.bm, gbn::new);
      a(blz.bn, gbo::new);
      a(blz.bo, gbp::new);
      a(blz.bp, gbq::new);
      a(blz.bq, gbr::new);
      a(blz.br, gbs::new);
      a(blz.bs, $$0 -> new gbf($$0, fmw.cd));
      a(blz.bt, gbt::new);
      a(blz.bu, $$0 -> new gac($$0, fmw.cj, fmw.ck, fmw.cl, true));
   }
}
