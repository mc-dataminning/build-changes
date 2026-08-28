import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gse {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bur<?>, gsd<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hft.a, gsd<gks>> c = Map.of(hft.a.b, $$0 -> new gxk($$0, false), hft.a.a, $$0 -> new gxk($$0, true));

   private static <T extends buk> void a(bur<? extends T> $$0, gsd<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bur<?>, gsc<?, ?>> a(gsd.a $$0) {
      Builder<bur<?>, gsc<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((bur<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hft.a, gsc<? extends cow, ?>> b(gsd.a $$0) {
      Builder<hft.a, gsc<? extends cow, ?>> $$1 = ImmutableMap.builder();
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

      for (bur<?> $$1 : mb.f) {
         if ($$1 != bur.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bur.c, gqy::new);
      a(bur.d, gtl::new);
      a(bur.e, gqz::new);
      a(bur.f, gra::new);
      a(bur.g, gus::new);
      a(bur.h, grc::new);
      a(bur.k, grd::new);
      a(bur.l, gre::new);
      a(bur.o, grf::new);
      a(bur.p, grr.a::new);
      a(bur.aG, $$0 -> new grg($$0, gfb.bF));
      a(bur.bo, $$0 -> new grg($$0, gfb.cV));
      a(bur.m, $$0 -> new grg($$0, gfb.B));
      a(bur.at, $$0 -> new grg($$0, gfb.bp));
      a(bur.a, $$0 -> new grg($$0, gfb.a));
      a(bur.w, $$0 -> new grg($$0, gfb.T));
      a(bur.F, $$0 -> new grg($$0, gfb.al));
      a(bur.aL, $$0 -> new grg($$0, gfb.bJ));
      a(bur.aA, $$0 -> new grg($$0, gfb.by));
      a(bur.j, $$0 -> new gty($$0, gfb.p));
      a(bur.q, grh::new);
      a(bur.r, gri::new);
      a(bur.s, gvd::new);
      a(bur.u, grk::new);
      a(bur.t, grj::new);
      a(bur.v, grl::new);
      a(bur.aH, $$0 -> new grg($$0, gfb.bG));
      a(bur.bp, $$0 -> new grg($$0, gfb.cW));
      a(bur.n, $$0 -> new grg($$0, gfb.C));
      a(bur.au, $$0 -> new grg($$0, gfb.bq));
      a(bur.b, $$0 -> new grg($$0, gfb.b));
      a(bur.x, $$0 -> new grg($$0, gfb.U));
      a(bur.G, $$0 -> new grg($$0, gfb.am));
      a(bur.aM, $$0 -> new grg($$0, gfb.bK));
      a(bur.aB, $$0 -> new grg($$0, gfb.bz));
      a(bur.i, $$0 -> new gty($$0, gfb.o));
      a(bur.y, $$0 -> new gti($$0, gfb.W));
      a(bur.z, grm::new);
      a(bur.A, grn::new);
      a(bur.B, $$0 -> new gti($$0, gfb.aa));
      a(bur.C, gro::new);
      a(bur.D, grp::new);
      a(bur.E, grq::new);
      a(bur.H, grs::new);
      a(bur.I, $$0 -> new grt<>($$0, gfb.ar, gfb.as, false));
      a(bur.J, gru::new);
      a(bur.K, grv::new);
      a(bur.L, guq::new);
      a(bur.M, grw::new);
      a(bur.N, grz::new);
      a(bur.O, gsa::new);
      a(bur.P, gry::new);
      a(bur.Q, guq::new);
      a(bur.R, grx::new);
      a(bur.S, gsg::new);
      a(bur.T, gsf::new);
      a(bur.U, guq::new);
      a(bur.V, gsh::new);
      a(bur.W, $$0 -> new guq<>($$0, 1.0F, true));
      a(bur.X, gsi::new);
      a(bur.Y, $$0 -> new guq<>($$0, 3.0F, true));
      a(bur.Z, gsj::new);
      a(bur.bS, gsk::new);
      a(bur.aa, gsl::new);
      a(bur.ab, gsm::new);
      a(bur.ac, $$0 -> new gti($$0, gfb.aQ));
      a(bur.ad, gsn::new);
      a(bur.ae, $$0 -> new gso($$0, 6.0F));
      a(bur.af, gta::new);
      a(bur.ag, $$0 -> new gsp($$0, new ged($$0.a(gfb.aV)), new ged($$0.a(gfb.aW))));
      a(bur.ah, gsq::new);
      a(bur.ai, gsr::new);
      a(bur.aj, gss::new);
      a(bur.ak, $$0 -> new gti($$0, gfb.bc));
      a(bur.al, gst::new);
      a(bur.am, gsv::new);
      a(bur.an, gsx::new);
      a(bur.ao, gtl::new);
      a(bur.ap, gsy::new);
      a(bur.aq, gsz::new);
      a(bur.ar, grr.b::new);
      a(bur.as, gta::new);
      a(bur.aJ, gtn::new);
      a(bur.av, gtc::new);
      a(bur.aw, gtd::new);
      a(bur.ax, $$0 -> new gtf($$0, gfb.bs, gfb.bt));
      a(bur.ay, gtg::new);
      a(bur.az, gth::new);
      a(bur.aC, gtl::new);
      a(bur.aD, $$0 -> new gti($$0, gfb.bA));
      a(bur.aE, gtk::new);
      a(bur.aF, $$0 -> new grt<>($$0, gfb.bD, gfb.bE, true));
      a(bur.aI, gtm::new);
      a(bur.aK, gto::new);
      a(bur.aN, gtp::new);
      a(bur.aO, gtq::new);
      a(bur.aP, gtr::new);
      a(bur.aQ, gts::new);
      a(bur.aR, $$0 -> new gtt($$0, gfb.bQ, gfb.bR, gfb.bY, gfb.bZ, gfb.bS, gfb.bT));
      a(bur.aS, $$0 -> new gtt($$0, gfb.bU, gfb.bU, gfb.bV, gfb.bW, gfb.bV, gfb.bW));
      a(bur.aT, gtu::new);
      a(bur.aU, gtv::new);
      a(bur.aV, guq::new);
      a(bur.aW, gtw::new);
      a(bur.aX, gtx::new);
      a(bur.aY, gtz::new);
      a(bur.aZ, gub::new);
      a(bur.ba, guc::new);
      a(bur.bb, gue::new);
      a(bur.bc, gud::new);
      a(bur.bd, guf::new);
      a(bur.be, gug::new);
      a(bur.bf, $$0 -> new gux($$0, gfb.cJ, gfb.cK, true));
      a(bur.bg, guh::new);
      a(bur.bh, $$0 -> new guq<>($$0, 0.75F, true));
      a(bur.bi, gui::new);
      a(bur.bj, guq::new);
      a(bur.bk, guj::new);
      a(bur.bl, $$0 -> new gti($$0, gfb.cT));
      a(bur.bm, guk::new);
      a(bur.bn, gul::new);
      a(bur.bq, $$0 -> new gum<>($$0, new ged($$0.a(gfb.cX)), new ged($$0.a(gfb.cY))));
      a(bur.br, gun::new);
      a(bur.bs, guo::new);
      a(bur.bt, gup::new);
      a(bur.bu, grr.c::new);
      a(bur.bv, guu::new);
      a(bur.bw, gut::new);
      a(bur.bx, $$0 -> new gtf($$0, gfb.dj, gfb.dk));
      a(bur.by, gur::new);
      a(bur.bz, guv::new);
      a(bur.bA, guw::new);
      a(bur.bB, guy::new);
      a(bur.bC, guz::new);
      a(bur.bD, gva::new);
      a(bur.bF, gvc::new);
      a(bur.bE, gvb::new);
      a(bur.bG, gvd::new);
      a(bur.bH, gve::new);
      a(bur.bI, gvf::new);
      a(bur.bJ, gvg::new);
      a(bur.bK, gvh::new);
      a(bur.bL, gvi::new);
      a(bur.bM, gvj::new);
      a(bur.bN, gvk::new);
      a(bur.bO, $$0 -> new gux($$0, gfb.dS, gfb.dT, false));
      a(bur.bP, gvl::new);
      a(bur.bQ, $$0 -> new gvm($$0, gfb.ec, gfb.ed, gfb.eg, gfb.eh, gfb.ee, gfb.ef));
   }
}
