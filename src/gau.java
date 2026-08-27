import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gau {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bnu<?>, gat<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<ght.a, gat<ful>> c = Map.of(ght.a.b, $$0 -> new gfx($$0, false), ght.a.a, $$0 -> new gfx($$0, true));

   private static <T extends bno> void a(bnu<? extends T> $$0, gat<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bnu<?>, gas<?>> a(gat.a $$0) {
      Builder<bnu<?>, gas<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kf.g.b((bnu<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<ght.a, gas<? extends chh>> b(gat.a $$0) {
      Builder<ght.a, gas<? extends chh>> $$1 = ImmutableMap.builder();
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
      a(bnu.b, fzq::new);
      a(bnu.c, gcb::new);
      a(bnu.d, fzr::new);
      a(bnu.e, fzs::new);
      a(bnu.f, gdg::new);
      a(bnu.g, fzu::new);
      a(bnu.h, fzv::new);
      a(bnu.i, fzw::new);
      a(bnu.j, fzx::new);
      a(bnu.k, gai.a::new);
      a(bnu.l, $$0 -> new fzy($$0, false));
      a(bnu.m, fzz::new);
      a(bnu.o, gab::new);
      a(bnu.n, $$0 -> new gaa($$0, fpb.r));
      a(bnu.p, gac::new);
      a(bnu.q, $$0 -> new fzy($$0, true));
      a(bnu.r, $$0 -> new gby<>($$0, fpb.u));
      a(bnu.s, gae::new);
      a(bnu.t, gaf::new);
      a(bnu.u, $$0 -> new gby<>($$0, fpb.x));
      a(bnu.v, gag::new);
      a(bnu.w, gah::new);
      a(bnu.x, gaj::new);
      a(bnu.y, $$0 -> new gad<>($$0, 0.87F, fpb.J));
      a(bnu.z, gak::new);
      a(bnu.A, gal::new);
      a(bnu.B, gde::new);
      a(bnu.C, gam::new);
      a(bnu.G, gap::new);
      a(bnu.H, gaq::new);
      a(bnu.E, gao::new);
      a(bnu.F, gde::new);
      a(bnu.D, gan::new);
      a(bnu.I, gaw::new);
      a(bnu.J, gav::new);
      a(bnu.K, gde::new);
      a(bnu.L, gax::new);
      a(bnu.M, $$0 -> new gde<>($$0, 1.0F, true));
      a(bnu.N, gay::new);
      a(bnu.ai, $$0 -> new gde<>($$0, 3.0F, true));
      a(bnu.O, gaz::new);
      a(bnu.bx, gba::new);
      a(bnu.P, gbb::new);
      a(bnu.Q, gbc::new);
      a(bnu.R, $$0 -> new gby<>($$0, fpb.ab));
      a(bnu.S, gbd::new);
      a(bnu.T, $$0 -> new gbe($$0, 6.0F));
      a(bnu.U, gbq::new);
      a(bnu.V, $$0 -> new gbf($$0, new fod<>($$0.a(fpb.ag))));
      a(bnu.W, gbg::new);
      a(bnu.X, gbh::new);
      a(bnu.Y, gbi::new);
      a(bnu.Z, $$0 -> new gby<>($$0, fpb.ak));
      a(bnu.aa, gbj::new);
      a(bnu.ab, gbl::new);
      a(bnu.ac, gbn::new);
      a(bnu.ad, gcb::new);
      a(bnu.ae, gbo::new);
      a(bnu.af, gbp::new);
      a(bnu.ag, gai.b::new);
      a(bnu.ah, gbq::new);
      a(bnu.aj, gbs::new);
      a(bnu.ak, gbt::new);
      a(bnu.al, $$0 -> new gbv($$0, fpb.at));
      a(bnu.am, gbw::new);
      a(bnu.an, gbx::new);
      a(bnu.ao, gcb::new);
      a(bnu.ap, $$0 -> new gby<>($$0, fpb.ax));
      a(bnu.aq, gca::new);
      a(bnu.ar, $$0 -> new gad<>($$0, 0.92F, fpb.az));
      a(bnu.as, gcc::new);
      a(bnu.at, gcd::new);
      a(bnu.au, gce::new);
      a(bnu.av, gcf::new);
      a(bnu.aw, gcg::new);
      a(bnu.ax, gch::new);
      a(bnu.ay, $$0 -> new gci($$0, fpb.aF, fpb.aK, fpb.aL, false));
      a(bnu.az, $$0 -> new gci($$0, fpb.aG, fpb.aH, fpb.aI, false));
      a(bnu.aA, gcj::new);
      a(bnu.aB, gck::new);
      a(bnu.aC, gde::new);
      a(bnu.aD, gcl::new);
      a(bnu.aE, gcm::new);
      a(bnu.aF, gcn::new);
      a(bnu.aG, gcp::new);
      a(bnu.aH, gcq::new);
      a(bnu.aI, gcs::new);
      a(bnu.aJ, gcr::new);
      a(bnu.aK, gct::new);
      a(bnu.aL, gcu::new);
      a(bnu.aM, $$0 -> new gdl($$0, fpb.bk));
      a(bnu.aN, gcv::new);
      a(bnu.aO, $$0 -> new gde<>($$0, 0.75F, true));
      a(bnu.aP, gcw::new);
      a(bnu.aR, gde::new);
      a(bnu.aQ, gcx::new);
      a(bnu.aS, $$0 -> new gby<>($$0, fpb.bs));
      a(bnu.aT, gcy::new);
      a(bnu.aU, gcz::new);
      a(bnu.aV, $$0 -> new gda<>($$0, new fod<>($$0.a(fpb.bu))));
      a(bnu.aW, gdb::new);
      a(bnu.aX, gdc::new);
      a(bnu.aY, gdd::new);
      a(bnu.aZ, gai.c::new);
      a(bnu.ba, gdi::new);
      a(bnu.bb, gdh::new);
      a(bnu.bc, $$0 -> new gbv($$0, fpb.bD));
      a(bnu.bd, gdf::new);
      a(bnu.be, gdj::new);
      a(bnu.bf, gdk::new);
      a(bnu.bg, gdm::new);
      a(bnu.bh, gdn::new);
      a(bnu.bi, gdo::new);
      a(bnu.bk, gdq::new);
      a(bnu.bj, gdp::new);
      a(bnu.bl, gdr::new);
      a(bnu.bm, gds::new);
      a(bnu.bn, gdt::new);
      a(bnu.bo, gdu::new);
      a(bnu.bp, gdv::new);
      a(bnu.bq, gdw::new);
      a(bnu.br, gdx::new);
      a(bnu.bs, gdy::new);
      a(bnu.bt, $$0 -> new gdl($$0, fpb.cd));
      a(bnu.bu, gdz::new);
      a(bnu.bv, $$0 -> new gci($$0, fpb.cj, fpb.ck, fpb.cl, true));
   }
}
