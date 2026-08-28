import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gsg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<but<?>, gsf<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hfv.a, gsf<gku>> c = Map.of(hfv.a.b, $$0 -> new gxm($$0, false), hfv.a.a, $$0 -> new gxm($$0, true));

   private static <T extends bum> void a(but<? extends T> $$0, gsf<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<but<?>, gse<?, ?>> a(gsf.a $$0) {
      Builder<but<?>, gse<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((but<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hfv.a, gse<? extends coy, ?>> b(gsf.a $$0) {
      Builder<hfv.a, gse<? extends coy, ?>> $$1 = ImmutableMap.builder();
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

      for (but<?> $$1 : mb.f) {
         if ($$1 != but.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(but.c, gra::new);
      a(but.d, gtn::new);
      a(but.e, grb::new);
      a(but.f, grc::new);
      a(but.g, guu::new);
      a(but.h, gre::new);
      a(but.k, grf::new);
      a(but.l, grg::new);
      a(but.o, grh::new);
      a(but.p, grt.a::new);
      a(but.aG, $$0 -> new gri($$0, gfd.bF));
      a(but.bo, $$0 -> new gri($$0, gfd.cV));
      a(but.m, $$0 -> new gri($$0, gfd.B));
      a(but.at, $$0 -> new gri($$0, gfd.bp));
      a(but.a, $$0 -> new gri($$0, gfd.a));
      a(but.w, $$0 -> new gri($$0, gfd.T));
      a(but.F, $$0 -> new gri($$0, gfd.al));
      a(but.aL, $$0 -> new gri($$0, gfd.bJ));
      a(but.aA, $$0 -> new gri($$0, gfd.by));
      a(but.j, $$0 -> new gua($$0, gfd.p));
      a(but.q, grj::new);
      a(but.r, grk::new);
      a(but.s, gvf::new);
      a(but.u, grm::new);
      a(but.t, grl::new);
      a(but.v, grn::new);
      a(but.aH, $$0 -> new gri($$0, gfd.bG));
      a(but.bp, $$0 -> new gri($$0, gfd.cW));
      a(but.n, $$0 -> new gri($$0, gfd.C));
      a(but.au, $$0 -> new gri($$0, gfd.bq));
      a(but.b, $$0 -> new gri($$0, gfd.b));
      a(but.x, $$0 -> new gri($$0, gfd.U));
      a(but.G, $$0 -> new gri($$0, gfd.am));
      a(but.aM, $$0 -> new gri($$0, gfd.bK));
      a(but.aB, $$0 -> new gri($$0, gfd.bz));
      a(but.i, $$0 -> new gua($$0, gfd.o));
      a(but.y, $$0 -> new gtk($$0, gfd.W));
      a(but.z, gro::new);
      a(but.A, grp::new);
      a(but.B, $$0 -> new gtk($$0, gfd.aa));
      a(but.C, grq::new);
      a(but.D, grr::new);
      a(but.E, grs::new);
      a(but.H, gru::new);
      a(but.I, $$0 -> new grv<>($$0, gfd.ar, gfd.as, false));
      a(but.J, grw::new);
      a(but.K, grx::new);
      a(but.L, gus::new);
      a(but.M, gry::new);
      a(but.N, gsb::new);
      a(but.O, gsc::new);
      a(but.P, gsa::new);
      a(but.Q, gus::new);
      a(but.R, grz::new);
      a(but.S, gsi::new);
      a(but.T, gsh::new);
      a(but.U, gus::new);
      a(but.V, gsj::new);
      a(but.W, $$0 -> new gus<>($$0, 1.0F, true));
      a(but.X, gsk::new);
      a(but.Y, $$0 -> new gus<>($$0, 3.0F, true));
      a(but.Z, gsl::new);
      a(but.bS, gsm::new);
      a(but.aa, gsn::new);
      a(but.ab, gso::new);
      a(but.ac, $$0 -> new gtk($$0, gfd.aQ));
      a(but.ad, gsp::new);
      a(but.ae, $$0 -> new gsq($$0, 6.0F));
      a(but.af, gtc::new);
      a(but.ag, $$0 -> new gsr($$0, new gef($$0.a(gfd.aV)), new gef($$0.a(gfd.aW))));
      a(but.ah, gss::new);
      a(but.ai, gst::new);
      a(but.aj, gsu::new);
      a(but.ak, $$0 -> new gtk($$0, gfd.bc));
      a(but.al, gsv::new);
      a(but.am, gsx::new);
      a(but.an, gsz::new);
      a(but.ao, gtn::new);
      a(but.ap, gta::new);
      a(but.aq, gtb::new);
      a(but.ar, grt.b::new);
      a(but.as, gtc::new);
      a(but.aJ, gtp::new);
      a(but.av, gte::new);
      a(but.aw, gtf::new);
      a(but.ax, $$0 -> new gth($$0, gfd.bs, gfd.bt));
      a(but.ay, gti::new);
      a(but.az, gtj::new);
      a(but.aC, gtn::new);
      a(but.aD, $$0 -> new gtk($$0, gfd.bA));
      a(but.aE, gtm::new);
      a(but.aF, $$0 -> new grv<>($$0, gfd.bD, gfd.bE, true));
      a(but.aI, gto::new);
      a(but.aK, gtq::new);
      a(but.aN, gtr::new);
      a(but.aO, gts::new);
      a(but.aP, gtt::new);
      a(but.aQ, gtu::new);
      a(but.aR, $$0 -> new gtv($$0, gfd.bQ, gfd.bR, gfd.bY, gfd.bZ, gfd.bS, gfd.bT));
      a(but.aS, $$0 -> new gtv($$0, gfd.bU, gfd.bU, gfd.bV, gfd.bW, gfd.bV, gfd.bW));
      a(but.aT, gtw::new);
      a(but.aU, gtx::new);
      a(but.aV, gus::new);
      a(but.aW, gty::new);
      a(but.aX, gtz::new);
      a(but.aY, gub::new);
      a(but.aZ, gud::new);
      a(but.ba, gue::new);
      a(but.bb, gug::new);
      a(but.bc, guf::new);
      a(but.bd, guh::new);
      a(but.be, gui::new);
      a(but.bf, $$0 -> new guz($$0, gfd.cJ, gfd.cK, true));
      a(but.bg, guj::new);
      a(but.bh, $$0 -> new gus<>($$0, 0.75F, true));
      a(but.bi, guk::new);
      a(but.bj, gus::new);
      a(but.bk, gul::new);
      a(but.bl, $$0 -> new gtk($$0, gfd.cT));
      a(but.bm, gum::new);
      a(but.bn, gun::new);
      a(but.bq, $$0 -> new guo<>($$0, new gef($$0.a(gfd.cX)), new gef($$0.a(gfd.cY))));
      a(but.br, gup::new);
      a(but.bs, guq::new);
      a(but.bt, gur::new);
      a(but.bu, grt.c::new);
      a(but.bv, guw::new);
      a(but.bw, guv::new);
      a(but.bx, $$0 -> new gth($$0, gfd.dj, gfd.dk));
      a(but.by, gut::new);
      a(but.bz, gux::new);
      a(but.bA, guy::new);
      a(but.bB, gva::new);
      a(but.bC, gvb::new);
      a(but.bD, gvc::new);
      a(but.bF, gve::new);
      a(but.bE, gvd::new);
      a(but.bG, gvf::new);
      a(but.bH, gvg::new);
      a(but.bI, gvh::new);
      a(but.bJ, gvi::new);
      a(but.bK, gvj::new);
      a(but.bL, gvk::new);
      a(but.bM, gvl::new);
      a(but.bN, gvm::new);
      a(but.bO, $$0 -> new guz($$0, gfd.dS, gfd.dT, false));
      a(but.bP, gvn::new);
      a(but.bQ, $$0 -> new gvo($$0, gfd.ec, gfd.ed, gfd.eg, gfd.eh, gfd.ee, gfd.ef));
   }
}
