import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gsd {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bur<?>, gsc<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hfk.a, gsc<gks>> c = Map.of(hfk.a.b, $$0 -> new gxj($$0, false), hfk.a.a, $$0 -> new gxj($$0, true));

   private static <T extends buk> void a(bur<? extends T> $$0, gsc<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bur<?>, gsb<?, ?>> a(gsc.a $$0) {
      Builder<bur<?>, gsb<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((bur<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hfk.a, gsb<? extends cox, ?>> b(gsc.a $$0) {
      Builder<hfk.a, gsb<? extends cox, ?>> $$1 = ImmutableMap.builder();
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
         if ($$1 != bur.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bur.c, gqx::new);
      a(bur.d, gtk::new);
      a(bur.e, gqy::new);
      a(bur.f, gqz::new);
      a(bur.g, gur::new);
      a(bur.h, grb::new);
      a(bur.k, grc::new);
      a(bur.l, grd::new);
      a(bur.o, gre::new);
      a(bur.p, grq.a::new);
      a(bur.aH, $$0 -> new grf($$0, gfb.bF));
      a(bur.bp, $$0 -> new grf($$0, gfb.cV));
      a(bur.m, $$0 -> new grf($$0, gfb.B));
      a(bur.au, $$0 -> new grf($$0, gfb.bp));
      a(bur.a, $$0 -> new grf($$0, gfb.a));
      a(bur.w, $$0 -> new grf($$0, gfb.T));
      a(bur.G, $$0 -> new grf($$0, gfb.al));
      a(bur.aM, $$0 -> new grf($$0, gfb.bJ));
      a(bur.aB, $$0 -> new grf($$0, gfb.by));
      a(bur.j, $$0 -> new gtx($$0, gfb.p));
      a(bur.q, grg::new);
      a(bur.r, grh::new);
      a(bur.s, gvc::new);
      a(bur.u, grj::new);
      a(bur.t, gri::new);
      a(bur.v, grk::new);
      a(bur.aI, $$0 -> new grf($$0, gfb.bG));
      a(bur.bq, $$0 -> new grf($$0, gfb.cW));
      a(bur.n, $$0 -> new grf($$0, gfb.C));
      a(bur.av, $$0 -> new grf($$0, gfb.bq));
      a(bur.b, $$0 -> new grf($$0, gfb.b));
      a(bur.x, $$0 -> new grf($$0, gfb.U));
      a(bur.H, $$0 -> new grf($$0, gfb.am));
      a(bur.aN, $$0 -> new grf($$0, gfb.bK));
      a(bur.aC, $$0 -> new grf($$0, gfb.bz));
      a(bur.i, $$0 -> new gtx($$0, gfb.o));
      a(bur.y, $$0 -> new gth($$0, gfb.W));
      a(bur.z, grl::new);
      a(bur.A, grm::new);
      a(bur.B, $$0 -> new gth($$0, gfb.aa));
      a(bur.C, grn::new);
      a(bur.D, gro::new);
      a(bur.E, gro::new);
      a(bur.F, grp::new);
      a(bur.I, grr::new);
      a(bur.J, $$0 -> new grs<>($$0, gfb.ar, gfb.as, false));
      a(bur.K, grt::new);
      a(bur.L, gru::new);
      a(bur.M, gup::new);
      a(bur.N, grv::new);
      a(bur.O, gry::new);
      a(bur.P, grz::new);
      a(bur.Q, grx::new);
      a(bur.R, gup::new);
      a(bur.S, grw::new);
      a(bur.T, gsf::new);
      a(bur.U, gse::new);
      a(bur.V, gup::new);
      a(bur.W, gsg::new);
      a(bur.X, $$0 -> new gup<>($$0, 1.0F, true));
      a(bur.Y, gsh::new);
      a(bur.Z, $$0 -> new gup<>($$0, 3.0F, true));
      a(bur.aa, gsi::new);
      a(bur.bT, gsj::new);
      a(bur.ab, gsk::new);
      a(bur.ac, gsl::new);
      a(bur.ad, $$0 -> new gth($$0, gfb.aQ));
      a(bur.ae, gsm::new);
      a(bur.af, $$0 -> new gsn($$0, 6.0F));
      a(bur.ag, gsz::new);
      a(bur.ah, $$0 -> new gso($$0, new ged($$0.a(gfb.aV)), new ged($$0.a(gfb.aW))));
      a(bur.ai, gsp::new);
      a(bur.aj, gsq::new);
      a(bur.ak, gsr::new);
      a(bur.al, $$0 -> new gth($$0, gfb.bc));
      a(bur.am, gss::new);
      a(bur.an, gsu::new);
      a(bur.ao, gsw::new);
      a(bur.ap, gtk::new);
      a(bur.aq, gsx::new);
      a(bur.ar, gsy::new);
      a(bur.as, grq.b::new);
      a(bur.at, gsz::new);
      a(bur.aK, gtm::new);
      a(bur.aw, gtb::new);
      a(bur.ax, gtc::new);
      a(bur.ay, $$0 -> new gte($$0, gfb.bs, gfb.bt));
      a(bur.az, gtf::new);
      a(bur.aA, gtg::new);
      a(bur.aD, gtk::new);
      a(bur.aE, $$0 -> new gth($$0, gfb.bA));
      a(bur.aF, gtj::new);
      a(bur.aG, $$0 -> new grs<>($$0, gfb.bD, gfb.bE, true));
      a(bur.aJ, gtl::new);
      a(bur.aL, gtn::new);
      a(bur.aO, gto::new);
      a(bur.aP, gtp::new);
      a(bur.aQ, gtq::new);
      a(bur.aR, gtr::new);
      a(bur.aS, $$0 -> new gts($$0, gfb.bQ, gfb.bR, gfb.bY, gfb.bZ, gfb.bS, gfb.bT));
      a(bur.aT, $$0 -> new gts($$0, gfb.bU, gfb.bU, gfb.bV, gfb.bW, gfb.bV, gfb.bW));
      a(bur.aU, gtt::new);
      a(bur.aV, gtu::new);
      a(bur.aW, gup::new);
      a(bur.aX, gtv::new);
      a(bur.aY, gtw::new);
      a(bur.aZ, gty::new);
      a(bur.ba, gua::new);
      a(bur.bb, gub::new);
      a(bur.bc, gud::new);
      a(bur.bd, guc::new);
      a(bur.be, gue::new);
      a(bur.bf, guf::new);
      a(bur.bg, $$0 -> new guw($$0, gfb.cJ, gfb.cK, true));
      a(bur.bh, gug::new);
      a(bur.bi, $$0 -> new gup<>($$0, 0.75F, true));
      a(bur.bj, guh::new);
      a(bur.bk, gup::new);
      a(bur.bl, gui::new);
      a(bur.bm, $$0 -> new gth($$0, gfb.cT));
      a(bur.bn, guj::new);
      a(bur.bo, guk::new);
      a(bur.br, $$0 -> new gul<>($$0, new ged($$0.a(gfb.cX)), new ged($$0.a(gfb.cY))));
      a(bur.bs, gum::new);
      a(bur.bt, gun::new);
      a(bur.bu, guo::new);
      a(bur.bv, grq.c::new);
      a(bur.bw, gut::new);
      a(bur.bx, gus::new);
      a(bur.by, $$0 -> new gte($$0, gfb.dj, gfb.dk));
      a(bur.bz, guq::new);
      a(bur.bA, guu::new);
      a(bur.bB, guv::new);
      a(bur.bC, gux::new);
      a(bur.bD, guy::new);
      a(bur.bE, guz::new);
      a(bur.bG, gvb::new);
      a(bur.bF, gva::new);
      a(bur.bH, gvc::new);
      a(bur.bI, gvd::new);
      a(bur.bJ, gve::new);
      a(bur.bK, gvf::new);
      a(bur.bL, gvg::new);
      a(bur.bM, gvh::new);
      a(bur.bN, gvi::new);
      a(bur.bO, gvj::new);
      a(bur.bP, $$0 -> new guw($$0, gfb.dS, gfb.dT, false));
      a(bur.bQ, gvk::new);
      a(bur.bR, $$0 -> new gvl($$0, gfb.ec, gfb.ed, gfb.eg, gfb.eh, gfb.ee, gfb.ef));
   }
}
