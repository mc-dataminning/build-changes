import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fyn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bly<?>, fym<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gfl.a, fym<fsf>> c = Map.of(gfl.a.b, $$0 -> new gdp($$0, false), gfl.a.a, $$0 -> new gdp($$0, true));

   private static <T extends blu> void a(bly<? extends T> $$0, fym<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bly<?>, fyl<?>> a(fym.a $$0) {
      Builder<bly<?>, fyl<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kd.g.b((bly<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gfl.a, fyl<? extends cfh>> b(fym.a $$0) {
      Builder<gfl.a, fyl<? extends cfh>> $$1 = ImmutableMap.builder();
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

      for (bly<?> $$1 : kd.g) {
         if ($$1 != bly.bv && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kd.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bly.b, fxk::new);
      a(bly.c, fzu::new);
      a(bly.d, fxl::new);
      a(bly.e, gaz::new);
      a(bly.f, fxn::new);
      a(bly.g, fxo::new);
      a(bly.h, fxp::new);
      a(bly.i, fxq::new);
      a(bly.j, fyb.a::new);
      a(bly.k, $$0 -> new fxr($$0, false));
      a(bly.l, fxs::new);
      a(bly.n, fxu::new);
      a(bly.m, $$0 -> new fxt($$0, fmv.s));
      a(bly.o, fxv::new);
      a(bly.p, $$0 -> new fxr($$0, true));
      a(bly.q, $$0 -> new fzr<>($$0, fmv.v));
      a(bly.r, fxx::new);
      a(bly.s, fxy::new);
      a(bly.t, $$0 -> new fzr<>($$0, fmv.y));
      a(bly.u, fxz::new);
      a(bly.v, fya::new);
      a(bly.w, fyc::new);
      a(bly.x, $$0 -> new fxw<>($$0, 0.87F, fmv.K));
      a(bly.y, fyd::new);
      a(bly.z, fye::new);
      a(bly.A, gax::new);
      a(bly.B, fyf::new);
      a(bly.F, fyi::new);
      a(bly.G, fyj::new);
      a(bly.D, fyh::new);
      a(bly.E, gax::new);
      a(bly.C, fyg::new);
      a(bly.H, fyp::new);
      a(bly.I, fyo::new);
      a(bly.J, gax::new);
      a(bly.K, fyq::new);
      a(bly.L, $$0 -> new gax<>($$0, 1.0F, true));
      a(bly.M, fyr::new);
      a(bly.ah, $$0 -> new gax<>($$0, 3.0F, true));
      a(bly.N, fys::new);
      a(bly.bw, fyt::new);
      a(bly.O, fyu::new);
      a(bly.P, fyv::new);
      a(bly.Q, $$0 -> new fzr<>($$0, fmv.ac));
      a(bly.R, fyw::new);
      a(bly.S, $$0 -> new fyx($$0, 6.0F));
      a(bly.T, fzj::new);
      a(bly.U, $$0 -> new fyy($$0, new fly<>($$0.a(fmv.ah))));
      a(bly.V, fyz::new);
      a(bly.W, fza::new);
      a(bly.X, fzb::new);
      a(bly.Y, $$0 -> new fzr<>($$0, fmv.al));
      a(bly.Z, fzc::new);
      a(bly.aa, fze::new);
      a(bly.ab, fzg::new);
      a(bly.ac, fzu::new);
      a(bly.ad, fzh::new);
      a(bly.ae, fzi::new);
      a(bly.af, fyb.b::new);
      a(bly.ag, fzj::new);
      a(bly.ai, fzl::new);
      a(bly.aj, fzm::new);
      a(bly.ak, $$0 -> new fzo($$0, fmv.au));
      a(bly.al, fzp::new);
      a(bly.am, fzq::new);
      a(bly.an, fzu::new);
      a(bly.ao, $$0 -> new fzr<>($$0, fmv.ay));
      a(bly.ap, fzt::new);
      a(bly.aq, $$0 -> new fxw<>($$0, 0.92F, fmv.aA));
      a(bly.ar, fzv::new);
      a(bly.as, fzw::new);
      a(bly.at, fzx::new);
      a(bly.au, fzy::new);
      a(bly.av, fzz::new);
      a(bly.aw, gaa::new);
      a(bly.ax, $$0 -> new gab($$0, fmv.aG, fmv.aL, fmv.aM, false));
      a(bly.ay, $$0 -> new gab($$0, fmv.aH, fmv.aI, fmv.aJ, false));
      a(bly.az, gac::new);
      a(bly.aA, gad::new);
      a(bly.aB, gax::new);
      a(bly.aC, gae::new);
      a(bly.aD, gaf::new);
      a(bly.aE, gag::new);
      a(bly.aF, gai::new);
      a(bly.aG, gaj::new);
      a(bly.aH, gal::new);
      a(bly.aI, gak::new);
      a(bly.aJ, gam::new);
      a(bly.aK, gan::new);
      a(bly.aL, $$0 -> new gbe($$0, fmv.bl));
      a(bly.aM, gao::new);
      a(bly.aN, $$0 -> new gax<>($$0, 0.75F, true));
      a(bly.aO, gap::new);
      a(bly.aQ, gax::new);
      a(bly.aP, gaq::new);
      a(bly.aR, $$0 -> new fzr<>($$0, fmv.bt));
      a(bly.aS, gar::new);
      a(bly.aT, gas::new);
      a(bly.aU, $$0 -> new gat<>($$0, new fly<>($$0.a(fmv.bv))));
      a(bly.aV, gau::new);
      a(bly.aW, gav::new);
      a(bly.aX, gaw::new);
      a(bly.aY, fyb.c::new);
      a(bly.aZ, gbb::new);
      a(bly.ba, gba::new);
      a(bly.bb, $$0 -> new fzo($$0, fmv.bE));
      a(bly.bc, gay::new);
      a(bly.bd, gbc::new);
      a(bly.be, gbd::new);
      a(bly.bf, gbf::new);
      a(bly.bg, gbg::new);
      a(bly.bh, gbh::new);
      a(bly.bj, gbj::new);
      a(bly.bi, gbi::new);
      a(bly.bk, gbk::new);
      a(bly.bl, gbl::new);
      a(bly.bm, gbm::new);
      a(bly.bn, gbn::new);
      a(bly.bo, gbo::new);
      a(bly.bp, gbp::new);
      a(bly.bq, gbq::new);
      a(bly.br, gbr::new);
      a(bly.bs, $$0 -> new gbe($$0, fmv.cd));
      a(bly.bt, gbs::new);
      a(bly.bu, $$0 -> new gab($$0, fmv.cj, fmv.ck, fmv.cl, true));
   }
}
