import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fzb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bmc<?>, fza<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gga.a, fza<fss>> c = Map.of(gga.a.b, $$0 -> new gee($$0, false), gga.a.a, $$0 -> new gee($$0, true));

   private static <T extends blw> void a(bmc<? extends T> $$0, fza<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bmc<?>, fyz<?>> a(fza.a $$0) {
      Builder<bmc<?>, fyz<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kd.g.b((bmc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gga.a, fyz<? extends cfq>> b(fza.a $$0) {
      Builder<gga.a, fyz<? extends cfq>> $$1 = ImmutableMap.builder();
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

      for (bmc<?> $$1 : kd.g) {
         if ($$1 != bmc.bw && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kd.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bmc.b, fxx::new);
      a(bmc.c, gai::new);
      a(bmc.d, fxy::new);
      a(bmc.e, fxz::new);
      a(bmc.f, gbn::new);
      a(bmc.g, fyb::new);
      a(bmc.h, fyc::new);
      a(bmc.i, fyd::new);
      a(bmc.j, fye::new);
      a(bmc.k, fyp.a::new);
      a(bmc.l, $$0 -> new fyf($$0, false));
      a(bmc.m, fyg::new);
      a(bmc.o, fyi::new);
      a(bmc.n, $$0 -> new fyh($$0, fni.r));
      a(bmc.p, fyj::new);
      a(bmc.q, $$0 -> new fyf($$0, true));
      a(bmc.r, $$0 -> new gaf<>($$0, fni.u));
      a(bmc.s, fyl::new);
      a(bmc.t, fym::new);
      a(bmc.u, $$0 -> new gaf<>($$0, fni.x));
      a(bmc.v, fyn::new);
      a(bmc.w, fyo::new);
      a(bmc.x, fyq::new);
      a(bmc.y, $$0 -> new fyk<>($$0, 0.87F, fni.J));
      a(bmc.z, fyr::new);
      a(bmc.A, fys::new);
      a(bmc.B, gbl::new);
      a(bmc.C, fyt::new);
      a(bmc.G, fyw::new);
      a(bmc.H, fyx::new);
      a(bmc.E, fyv::new);
      a(bmc.F, gbl::new);
      a(bmc.D, fyu::new);
      a(bmc.I, fzd::new);
      a(bmc.J, fzc::new);
      a(bmc.K, gbl::new);
      a(bmc.L, fze::new);
      a(bmc.M, $$0 -> new gbl<>($$0, 1.0F, true));
      a(bmc.N, fzf::new);
      a(bmc.ai, $$0 -> new gbl<>($$0, 3.0F, true));
      a(bmc.O, fzg::new);
      a(bmc.bx, fzh::new);
      a(bmc.P, fzi::new);
      a(bmc.Q, fzj::new);
      a(bmc.R, $$0 -> new gaf<>($$0, fni.ab));
      a(bmc.S, fzk::new);
      a(bmc.T, $$0 -> new fzl($$0, 6.0F));
      a(bmc.U, fzx::new);
      a(bmc.V, $$0 -> new fzm($$0, new fml<>($$0.a(fni.ag))));
      a(bmc.W, fzn::new);
      a(bmc.X, fzo::new);
      a(bmc.Y, fzp::new);
      a(bmc.Z, $$0 -> new gaf<>($$0, fni.ak));
      a(bmc.aa, fzq::new);
      a(bmc.ab, fzs::new);
      a(bmc.ac, fzu::new);
      a(bmc.ad, gai::new);
      a(bmc.ae, fzv::new);
      a(bmc.af, fzw::new);
      a(bmc.ag, fyp.b::new);
      a(bmc.ah, fzx::new);
      a(bmc.aj, fzz::new);
      a(bmc.ak, gaa::new);
      a(bmc.al, $$0 -> new gac($$0, fni.at));
      a(bmc.am, gad::new);
      a(bmc.an, gae::new);
      a(bmc.ao, gai::new);
      a(bmc.ap, $$0 -> new gaf<>($$0, fni.ax));
      a(bmc.aq, gah::new);
      a(bmc.ar, $$0 -> new fyk<>($$0, 0.92F, fni.az));
      a(bmc.as, gaj::new);
      a(bmc.at, gak::new);
      a(bmc.au, gal::new);
      a(bmc.av, gam::new);
      a(bmc.aw, gan::new);
      a(bmc.ax, gao::new);
      a(bmc.ay, $$0 -> new gap($$0, fni.aF, fni.aK, fni.aL, false));
      a(bmc.az, $$0 -> new gap($$0, fni.aG, fni.aH, fni.aI, false));
      a(bmc.aA, gaq::new);
      a(bmc.aB, gar::new);
      a(bmc.aC, gbl::new);
      a(bmc.aD, gas::new);
      a(bmc.aE, gat::new);
      a(bmc.aF, gau::new);
      a(bmc.aG, gaw::new);
      a(bmc.aH, gax::new);
      a(bmc.aI, gaz::new);
      a(bmc.aJ, gay::new);
      a(bmc.aK, gba::new);
      a(bmc.aL, gbb::new);
      a(bmc.aM, $$0 -> new gbs($$0, fni.bk));
      a(bmc.aN, gbc::new);
      a(bmc.aO, $$0 -> new gbl<>($$0, 0.75F, true));
      a(bmc.aP, gbd::new);
      a(bmc.aR, gbl::new);
      a(bmc.aQ, gbe::new);
      a(bmc.aS, $$0 -> new gaf<>($$0, fni.bs));
      a(bmc.aT, gbf::new);
      a(bmc.aU, gbg::new);
      a(bmc.aV, $$0 -> new gbh<>($$0, new fml<>($$0.a(fni.bu))));
      a(bmc.aW, gbi::new);
      a(bmc.aX, gbj::new);
      a(bmc.aY, gbk::new);
      a(bmc.aZ, fyp.c::new);
      a(bmc.ba, gbp::new);
      a(bmc.bb, gbo::new);
      a(bmc.bc, $$0 -> new gac($$0, fni.bD));
      a(bmc.bd, gbm::new);
      a(bmc.be, gbq::new);
      a(bmc.bf, gbr::new);
      a(bmc.bg, gbt::new);
      a(bmc.bh, gbu::new);
      a(bmc.bi, gbv::new);
      a(bmc.bk, gbx::new);
      a(bmc.bj, gbw::new);
      a(bmc.bl, gby::new);
      a(bmc.bm, gbz::new);
      a(bmc.bn, gca::new);
      a(bmc.bo, gcb::new);
      a(bmc.bp, gcc::new);
      a(bmc.bq, gcd::new);
      a(bmc.br, gce::new);
      a(bmc.bs, gcf::new);
      a(bmc.bt, $$0 -> new gbs($$0, fni.cd));
      a(bmc.bu, gcg::new);
      a(bmc.bv, $$0 -> new gap($$0, fni.cj, fni.ck, fni.cl, true));
   }
}
