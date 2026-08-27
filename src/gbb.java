import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gbb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bnw<?>, gba<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gia.a, gba<fus>> c = Map.of(gia.a.b, $$0 -> new gge($$0, false), gia.a.a, $$0 -> new gge($$0, true));

   private static <T extends bnq> void a(bnw<? extends T> $$0, gba<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bnw<?>, gaz<?>> a(gba.a $$0) {
      Builder<bnw<?>, gaz<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kf.g.b((bnw<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gia.a, gaz<? extends chl>> b(gba.a $$0) {
      Builder<gia.a, gaz<? extends chl>> $$1 = ImmutableMap.builder();
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

      for (bnw<?> $$1 : kf.g) {
         if ($$1 != bnw.bw && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kf.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bnw.b, fzx::new);
      a(bnw.c, gci::new);
      a(bnw.d, fzy::new);
      a(bnw.e, fzz::new);
      a(bnw.f, gdn::new);
      a(bnw.g, gab::new);
      a(bnw.h, gac::new);
      a(bnw.i, gad::new);
      a(bnw.j, gae::new);
      a(bnw.k, gap.a::new);
      a(bnw.l, $$0 -> new gaf($$0, false));
      a(bnw.m, gag::new);
      a(bnw.o, gai::new);
      a(bnw.n, $$0 -> new gah($$0, fpi.r));
      a(bnw.p, gaj::new);
      a(bnw.q, $$0 -> new gaf($$0, true));
      a(bnw.r, $$0 -> new gcf<>($$0, fpi.u));
      a(bnw.s, gal::new);
      a(bnw.t, gam::new);
      a(bnw.u, $$0 -> new gcf<>($$0, fpi.x));
      a(bnw.v, gan::new);
      a(bnw.w, gao::new);
      a(bnw.x, gaq::new);
      a(bnw.y, $$0 -> new gak<>($$0, 0.87F, fpi.J));
      a(bnw.z, gar::new);
      a(bnw.A, gas::new);
      a(bnw.B, gdl::new);
      a(bnw.C, gat::new);
      a(bnw.G, gaw::new);
      a(bnw.H, gax::new);
      a(bnw.E, gav::new);
      a(bnw.F, gdl::new);
      a(bnw.D, gau::new);
      a(bnw.I, gbd::new);
      a(bnw.J, gbc::new);
      a(bnw.K, gdl::new);
      a(bnw.L, gbe::new);
      a(bnw.M, $$0 -> new gdl<>($$0, 1.0F, true));
      a(bnw.N, gbf::new);
      a(bnw.ai, $$0 -> new gdl<>($$0, 3.0F, true));
      a(bnw.O, gbg::new);
      a(bnw.bx, gbh::new);
      a(bnw.P, gbi::new);
      a(bnw.Q, gbj::new);
      a(bnw.R, $$0 -> new gcf<>($$0, fpi.ab));
      a(bnw.S, gbk::new);
      a(bnw.T, $$0 -> new gbl($$0, 6.0F));
      a(bnw.U, gbx::new);
      a(bnw.V, $$0 -> new gbm($$0, new fok<>($$0.a(fpi.ag))));
      a(bnw.W, gbn::new);
      a(bnw.X, gbo::new);
      a(bnw.Y, gbp::new);
      a(bnw.Z, $$0 -> new gcf<>($$0, fpi.ak));
      a(bnw.aa, gbq::new);
      a(bnw.ab, gbs::new);
      a(bnw.ac, gbu::new);
      a(bnw.ad, gci::new);
      a(bnw.ae, gbv::new);
      a(bnw.af, gbw::new);
      a(bnw.ag, gap.b::new);
      a(bnw.ah, gbx::new);
      a(bnw.aj, gbz::new);
      a(bnw.ak, gca::new);
      a(bnw.al, $$0 -> new gcc($$0, fpi.at));
      a(bnw.am, gcd::new);
      a(bnw.an, gce::new);
      a(bnw.ao, gci::new);
      a(bnw.ap, $$0 -> new gcf<>($$0, fpi.ax));
      a(bnw.aq, gch::new);
      a(bnw.ar, $$0 -> new gak<>($$0, 0.92F, fpi.az));
      a(bnw.as, gcj::new);
      a(bnw.at, gck::new);
      a(bnw.au, gcl::new);
      a(bnw.av, gcm::new);
      a(bnw.aw, gcn::new);
      a(bnw.ax, gco::new);
      a(bnw.ay, $$0 -> new gcp($$0, fpi.aF, fpi.aK, fpi.aL, false));
      a(bnw.az, $$0 -> new gcp($$0, fpi.aG, fpi.aH, fpi.aI, false));
      a(bnw.aA, gcq::new);
      a(bnw.aB, gcr::new);
      a(bnw.aC, gdl::new);
      a(bnw.aD, gcs::new);
      a(bnw.aE, gct::new);
      a(bnw.aF, gcu::new);
      a(bnw.aG, gcw::new);
      a(bnw.aH, gcx::new);
      a(bnw.aI, gcz::new);
      a(bnw.aJ, gcy::new);
      a(bnw.aK, gda::new);
      a(bnw.aL, gdb::new);
      a(bnw.aM, $$0 -> new gds($$0, fpi.bk));
      a(bnw.aN, gdc::new);
      a(bnw.aO, $$0 -> new gdl<>($$0, 0.75F, true));
      a(bnw.aP, gdd::new);
      a(bnw.aR, gdl::new);
      a(bnw.aQ, gde::new);
      a(bnw.aS, $$0 -> new gcf<>($$0, fpi.bs));
      a(bnw.aT, gdf::new);
      a(bnw.aU, gdg::new);
      a(bnw.aV, $$0 -> new gdh<>($$0, new fok<>($$0.a(fpi.bu))));
      a(bnw.aW, gdi::new);
      a(bnw.aX, gdj::new);
      a(bnw.aY, gdk::new);
      a(bnw.aZ, gap.c::new);
      a(bnw.ba, gdp::new);
      a(bnw.bb, gdo::new);
      a(bnw.bc, $$0 -> new gcc($$0, fpi.bD));
      a(bnw.bd, gdm::new);
      a(bnw.be, gdq::new);
      a(bnw.bf, gdr::new);
      a(bnw.bg, gdt::new);
      a(bnw.bh, gdu::new);
      a(bnw.bi, gdv::new);
      a(bnw.bk, gdx::new);
      a(bnw.bj, gdw::new);
      a(bnw.bl, gdy::new);
      a(bnw.bm, gdz::new);
      a(bnw.bn, gea::new);
      a(bnw.bo, geb::new);
      a(bnw.bp, gec::new);
      a(bnw.bq, ged::new);
      a(bnw.br, gee::new);
      a(bnw.bs, gef::new);
      a(bnw.bt, $$0 -> new gds($$0, fpi.cd));
      a(bnw.bu, geg::new);
      a(bnw.bv, $$0 -> new gcp($$0, fpi.cj, fpi.ck, fpi.cl, true));
   }
}
