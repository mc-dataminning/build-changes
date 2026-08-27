import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gat {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bnu<?>, gas<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<ghs.a, gas<fuk>> c = Map.of(ghs.a.b, $$0 -> new gfw($$0, false), ghs.a.a, $$0 -> new gfw($$0, true));

   private static <T extends bno> void a(bnu<? extends T> $$0, gas<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bnu<?>, gar<?>> a(gas.a $$0) {
      Builder<bnu<?>, gar<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kf.g.b((bnu<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<ghs.a, gar<? extends chh>> b(gas.a $$0) {
      Builder<ghs.a, gar<? extends chh>> $$1 = ImmutableMap.builder();
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

      for (bnu<?> $$1 : kf.g) {
         if ($$1 != bnu.bw && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kf.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bnu.b, fzp::new);
      a(bnu.c, gca::new);
      a(bnu.d, fzq::new);
      a(bnu.e, fzr::new);
      a(bnu.f, gdf::new);
      a(bnu.g, fzt::new);
      a(bnu.h, fzu::new);
      a(bnu.i, fzv::new);
      a(bnu.j, fzw::new);
      a(bnu.k, gah.a::new);
      a(bnu.l, $$0 -> new fzx($$0, false));
      a(bnu.m, fzy::new);
      a(bnu.o, gaa::new);
      a(bnu.n, $$0 -> new fzz($$0, fpb.r));
      a(bnu.p, gab::new);
      a(bnu.q, $$0 -> new fzx($$0, true));
      a(bnu.r, $$0 -> new gbx<>($$0, fpb.u));
      a(bnu.s, gad::new);
      a(bnu.t, gae::new);
      a(bnu.u, $$0 -> new gbx<>($$0, fpb.x));
      a(bnu.v, gaf::new);
      a(bnu.w, gag::new);
      a(bnu.x, gai::new);
      a(bnu.y, $$0 -> new gac<>($$0, 0.87F, fpb.J));
      a(bnu.z, gaj::new);
      a(bnu.A, gak::new);
      a(bnu.B, gdd::new);
      a(bnu.C, gal::new);
      a(bnu.G, gao::new);
      a(bnu.H, gap::new);
      a(bnu.E, gan::new);
      a(bnu.F, gdd::new);
      a(bnu.D, gam::new);
      a(bnu.I, gav::new);
      a(bnu.J, gau::new);
      a(bnu.K, gdd::new);
      a(bnu.L, gaw::new);
      a(bnu.M, $$0 -> new gdd<>($$0, 1.0F, true));
      a(bnu.N, gax::new);
      a(bnu.ai, $$0 -> new gdd<>($$0, 3.0F, true));
      a(bnu.O, gay::new);
      a(bnu.bx, gaz::new);
      a(bnu.P, gba::new);
      a(bnu.Q, gbb::new);
      a(bnu.R, $$0 -> new gbx<>($$0, fpb.ab));
      a(bnu.S, gbc::new);
      a(bnu.T, $$0 -> new gbd($$0, 6.0F));
      a(bnu.U, gbp::new);
      a(bnu.V, $$0 -> new gbe($$0, new fod<>($$0.a(fpb.ag))));
      a(bnu.W, gbf::new);
      a(bnu.X, gbg::new);
      a(bnu.Y, gbh::new);
      a(bnu.Z, $$0 -> new gbx<>($$0, fpb.ak));
      a(bnu.aa, gbi::new);
      a(bnu.ab, gbk::new);
      a(bnu.ac, gbm::new);
      a(bnu.ad, gca::new);
      a(bnu.ae, gbn::new);
      a(bnu.af, gbo::new);
      a(bnu.ag, gah.b::new);
      a(bnu.ah, gbp::new);
      a(bnu.aj, gbr::new);
      a(bnu.ak, gbs::new);
      a(bnu.al, $$0 -> new gbu($$0, fpb.at));
      a(bnu.am, gbv::new);
      a(bnu.an, gbw::new);
      a(bnu.ao, gca::new);
      a(bnu.ap, $$0 -> new gbx<>($$0, fpb.ax));
      a(bnu.aq, gbz::new);
      a(bnu.ar, $$0 -> new gac<>($$0, 0.92F, fpb.az));
      a(bnu.as, gcb::new);
      a(bnu.at, gcc::new);
      a(bnu.au, gcd::new);
      a(bnu.av, gce::new);
      a(bnu.aw, gcf::new);
      a(bnu.ax, gcg::new);
      a(bnu.ay, $$0 -> new gch($$0, fpb.aF, fpb.aK, fpb.aL, false));
      a(bnu.az, $$0 -> new gch($$0, fpb.aG, fpb.aH, fpb.aI, false));
      a(bnu.aA, gci::new);
      a(bnu.aB, gcj::new);
      a(bnu.aC, gdd::new);
      a(bnu.aD, gck::new);
      a(bnu.aE, gcl::new);
      a(bnu.aF, gcm::new);
      a(bnu.aG, gco::new);
      a(bnu.aH, gcp::new);
      a(bnu.aI, gcr::new);
      a(bnu.aJ, gcq::new);
      a(bnu.aK, gcs::new);
      a(bnu.aL, gct::new);
      a(bnu.aM, $$0 -> new gdk($$0, fpb.bk));
      a(bnu.aN, gcu::new);
      a(bnu.aO, $$0 -> new gdd<>($$0, 0.75F, true));
      a(bnu.aP, gcv::new);
      a(bnu.aR, gdd::new);
      a(bnu.aQ, gcw::new);
      a(bnu.aS, $$0 -> new gbx<>($$0, fpb.bs));
      a(bnu.aT, gcx::new);
      a(bnu.aU, gcy::new);
      a(bnu.aV, $$0 -> new gcz<>($$0, new fod<>($$0.a(fpb.bu))));
      a(bnu.aW, gda::new);
      a(bnu.aX, gdb::new);
      a(bnu.aY, gdc::new);
      a(bnu.aZ, gah.c::new);
      a(bnu.ba, gdh::new);
      a(bnu.bb, gdg::new);
      a(bnu.bc, $$0 -> new gbu($$0, fpb.bD));
      a(bnu.bd, gde::new);
      a(bnu.be, gdi::new);
      a(bnu.bf, gdj::new);
      a(bnu.bg, gdl::new);
      a(bnu.bh, gdm::new);
      a(bnu.bi, gdn::new);
      a(bnu.bk, gdp::new);
      a(bnu.bj, gdo::new);
      a(bnu.bl, gdq::new);
      a(bnu.bm, gdr::new);
      a(bnu.bn, gds::new);
      a(bnu.bo, gdt::new);
      a(bnu.bp, gdu::new);
      a(bnu.bq, gdv::new);
      a(bnu.br, gdw::new);
      a(bnu.bs, gdx::new);
      a(bnu.bt, $$0 -> new gdk($$0, fpb.cd));
      a(bnu.bu, gdy::new);
      a(bnu.bv, $$0 -> new gch($$0, fpb.cj, fpb.ck, fpb.cl, true));
   }
}
