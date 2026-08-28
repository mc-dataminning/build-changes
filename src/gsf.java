import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gsf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bus<?>, gse<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hfu.a, gse<gkt>> c = Map.of(hfu.a.b, $$0 -> new gxl($$0, false), hfu.a.a, $$0 -> new gxl($$0, true));

   private static <T extends bul> void a(bus<? extends T> $$0, gse<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bus<?>, gsd<?, ?>> a(gse.a $$0) {
      Builder<bus<?>, gsd<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((bus<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hfu.a, gsd<? extends cox, ?>> b(gse.a $$0) {
      Builder<hfu.a, gsd<? extends cox, ?>> $$1 = ImmutableMap.builder();
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

      for (bus<?> $$1 : mb.f) {
         if ($$1 != bus.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bus.c, gqz::new);
      a(bus.d, gtm::new);
      a(bus.e, gra::new);
      a(bus.f, grb::new);
      a(bus.g, gut::new);
      a(bus.h, grd::new);
      a(bus.k, gre::new);
      a(bus.l, grf::new);
      a(bus.o, grg::new);
      a(bus.p, grs.a::new);
      a(bus.aG, $$0 -> new grh($$0, gfc.bF));
      a(bus.bo, $$0 -> new grh($$0, gfc.cV));
      a(bus.m, $$0 -> new grh($$0, gfc.B));
      a(bus.at, $$0 -> new grh($$0, gfc.bp));
      a(bus.a, $$0 -> new grh($$0, gfc.a));
      a(bus.w, $$0 -> new grh($$0, gfc.T));
      a(bus.F, $$0 -> new grh($$0, gfc.al));
      a(bus.aL, $$0 -> new grh($$0, gfc.bJ));
      a(bus.aA, $$0 -> new grh($$0, gfc.by));
      a(bus.j, $$0 -> new gtz($$0, gfc.p));
      a(bus.q, gri::new);
      a(bus.r, grj::new);
      a(bus.s, gve::new);
      a(bus.u, grl::new);
      a(bus.t, grk::new);
      a(bus.v, grm::new);
      a(bus.aH, $$0 -> new grh($$0, gfc.bG));
      a(bus.bp, $$0 -> new grh($$0, gfc.cW));
      a(bus.n, $$0 -> new grh($$0, gfc.C));
      a(bus.au, $$0 -> new grh($$0, gfc.bq));
      a(bus.b, $$0 -> new grh($$0, gfc.b));
      a(bus.x, $$0 -> new grh($$0, gfc.U));
      a(bus.G, $$0 -> new grh($$0, gfc.am));
      a(bus.aM, $$0 -> new grh($$0, gfc.bK));
      a(bus.aB, $$0 -> new grh($$0, gfc.bz));
      a(bus.i, $$0 -> new gtz($$0, gfc.o));
      a(bus.y, $$0 -> new gtj($$0, gfc.W));
      a(bus.z, grn::new);
      a(bus.A, gro::new);
      a(bus.B, $$0 -> new gtj($$0, gfc.aa));
      a(bus.C, grp::new);
      a(bus.D, grq::new);
      a(bus.E, grr::new);
      a(bus.H, grt::new);
      a(bus.I, $$0 -> new gru<>($$0, gfc.ar, gfc.as, false));
      a(bus.J, grv::new);
      a(bus.K, grw::new);
      a(bus.L, gur::new);
      a(bus.M, grx::new);
      a(bus.N, gsa::new);
      a(bus.O, gsb::new);
      a(bus.P, grz::new);
      a(bus.Q, gur::new);
      a(bus.R, gry::new);
      a(bus.S, gsh::new);
      a(bus.T, gsg::new);
      a(bus.U, gur::new);
      a(bus.V, gsi::new);
      a(bus.W, $$0 -> new gur<>($$0, 1.0F, true));
      a(bus.X, gsj::new);
      a(bus.Y, $$0 -> new gur<>($$0, 3.0F, true));
      a(bus.Z, gsk::new);
      a(bus.bS, gsl::new);
      a(bus.aa, gsm::new);
      a(bus.ab, gsn::new);
      a(bus.ac, $$0 -> new gtj($$0, gfc.aQ));
      a(bus.ad, gso::new);
      a(bus.ae, $$0 -> new gsp($$0, 6.0F));
      a(bus.af, gtb::new);
      a(bus.ag, $$0 -> new gsq($$0, new gee($$0.a(gfc.aV)), new gee($$0.a(gfc.aW))));
      a(bus.ah, gsr::new);
      a(bus.ai, gss::new);
      a(bus.aj, gst::new);
      a(bus.ak, $$0 -> new gtj($$0, gfc.bc));
      a(bus.al, gsu::new);
      a(bus.am, gsw::new);
      a(bus.an, gsy::new);
      a(bus.ao, gtm::new);
      a(bus.ap, gsz::new);
      a(bus.aq, gta::new);
      a(bus.ar, grs.b::new);
      a(bus.as, gtb::new);
      a(bus.aJ, gto::new);
      a(bus.av, gtd::new);
      a(bus.aw, gte::new);
      a(bus.ax, $$0 -> new gtg($$0, gfc.bs, gfc.bt));
      a(bus.ay, gth::new);
      a(bus.az, gti::new);
      a(bus.aC, gtm::new);
      a(bus.aD, $$0 -> new gtj($$0, gfc.bA));
      a(bus.aE, gtl::new);
      a(bus.aF, $$0 -> new gru<>($$0, gfc.bD, gfc.bE, true));
      a(bus.aI, gtn::new);
      a(bus.aK, gtp::new);
      a(bus.aN, gtq::new);
      a(bus.aO, gtr::new);
      a(bus.aP, gts::new);
      a(bus.aQ, gtt::new);
      a(bus.aR, $$0 -> new gtu($$0, gfc.bQ, gfc.bR, gfc.bY, gfc.bZ, gfc.bS, gfc.bT));
      a(bus.aS, $$0 -> new gtu($$0, gfc.bU, gfc.bU, gfc.bV, gfc.bW, gfc.bV, gfc.bW));
      a(bus.aT, gtv::new);
      a(bus.aU, gtw::new);
      a(bus.aV, gur::new);
      a(bus.aW, gtx::new);
      a(bus.aX, gty::new);
      a(bus.aY, gua::new);
      a(bus.aZ, guc::new);
      a(bus.ba, gud::new);
      a(bus.bb, guf::new);
      a(bus.bc, gue::new);
      a(bus.bd, gug::new);
      a(bus.be, guh::new);
      a(bus.bf, $$0 -> new guy($$0, gfc.cJ, gfc.cK, true));
      a(bus.bg, gui::new);
      a(bus.bh, $$0 -> new gur<>($$0, 0.75F, true));
      a(bus.bi, guj::new);
      a(bus.bj, gur::new);
      a(bus.bk, guk::new);
      a(bus.bl, $$0 -> new gtj($$0, gfc.cT));
      a(bus.bm, gul::new);
      a(bus.bn, gum::new);
      a(bus.bq, $$0 -> new gun<>($$0, new gee($$0.a(gfc.cX)), new gee($$0.a(gfc.cY))));
      a(bus.br, guo::new);
      a(bus.bs, gup::new);
      a(bus.bt, guq::new);
      a(bus.bu, grs.c::new);
      a(bus.bv, guv::new);
      a(bus.bw, guu::new);
      a(bus.bx, $$0 -> new gtg($$0, gfc.dj, gfc.dk));
      a(bus.by, gus::new);
      a(bus.bz, guw::new);
      a(bus.bA, gux::new);
      a(bus.bB, guz::new);
      a(bus.bC, gva::new);
      a(bus.bD, gvb::new);
      a(bus.bF, gvd::new);
      a(bus.bE, gvc::new);
      a(bus.bG, gve::new);
      a(bus.bH, gvf::new);
      a(bus.bI, gvg::new);
      a(bus.bJ, gvh::new);
      a(bus.bK, gvi::new);
      a(bus.bL, gvj::new);
      a(bus.bM, gvk::new);
      a(bus.bN, gvl::new);
      a(bus.bO, $$0 -> new guy($$0, gfc.dS, gfc.dT, false));
      a(bus.bP, gvm::new);
      a(bus.bQ, $$0 -> new gvn($$0, gfc.ec, gfc.ed, gfc.eg, gfc.eh, gfc.ee, gfc.ef));
   }
}
