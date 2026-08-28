import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gte {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvi<?>, gtd<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hgt.a, gtd<gls>> c = Map.of(hgt.a.b, $$0 -> new gyk($$0, false), hgt.a.a, $$0 -> new gyk($$0, true));

   private static <T extends bva> void a(bvi<? extends T> $$0, gtd<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvi<?>, gtc<?, ?>> a(gtd.a $$0) {
      Builder<bvi<?>, gtc<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((bvi<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hgt.a, gtc<? extends cpr, ?>> b(gtd.a $$0) {
      Builder<hgt.a, gtc<? extends cpr, ?>> $$1 = ImmutableMap.builder();
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

      for (bvi<?> $$1 : mb.f) {
         if ($$1 != bvi.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvi.c, gry::new);
      a(bvi.d, gul::new);
      a(bvi.e, grz::new);
      a(bvi.f, gsa::new);
      a(bvi.g, gvs::new);
      a(bvi.h, gsc::new);
      a(bvi.k, gsd::new);
      a(bvi.l, gse::new);
      a(bvi.o, gsf::new);
      a(bvi.p, gsr.a::new);
      a(bvi.aG, $$0 -> new gsg($$0, ggb.bH));
      a(bvi.bo, $$0 -> new gsg($$0, ggb.cX));
      a(bvi.m, $$0 -> new gsg($$0, ggb.B));
      a(bvi.at, $$0 -> new gsg($$0, ggb.br));
      a(bvi.a, $$0 -> new gsg($$0, ggb.a));
      a(bvi.w, $$0 -> new gsg($$0, ggb.T));
      a(bvi.F, $$0 -> new gsg($$0, ggb.an));
      a(bvi.aL, $$0 -> new gsg($$0, ggb.bL));
      a(bvi.aA, $$0 -> new gsg($$0, ggb.bA));
      a(bvi.j, $$0 -> new guy($$0, ggb.p));
      a(bvi.q, gsh::new);
      a(bvi.r, gsi::new);
      a(bvi.s, gwd::new);
      a(bvi.u, gsk::new);
      a(bvi.t, gsj::new);
      a(bvi.v, gsl::new);
      a(bvi.aH, $$0 -> new gsg($$0, ggb.bI));
      a(bvi.bp, $$0 -> new gsg($$0, ggb.cY));
      a(bvi.n, $$0 -> new gsg($$0, ggb.C));
      a(bvi.au, $$0 -> new gsg($$0, ggb.bs));
      a(bvi.b, $$0 -> new gsg($$0, ggb.b));
      a(bvi.x, $$0 -> new gsg($$0, ggb.U));
      a(bvi.G, $$0 -> new gsg($$0, ggb.ao));
      a(bvi.aM, $$0 -> new gsg($$0, ggb.bM));
      a(bvi.aB, $$0 -> new gsg($$0, ggb.bB));
      a(bvi.i, $$0 -> new guy($$0, ggb.o));
      a(bvi.y, $$0 -> new gui($$0, ggb.W));
      a(bvi.z, gsm::new);
      a(bvi.A, gsn::new);
      a(bvi.B, $$0 -> new gui($$0, ggb.ac));
      a(bvi.C, gso::new);
      a(bvi.D, gsp::new);
      a(bvi.E, gsq::new);
      a(bvi.H, gss::new);
      a(bvi.I, $$0 -> new gst<>($$0, ggb.at, ggb.au, false));
      a(bvi.J, gsu::new);
      a(bvi.K, gsv::new);
      a(bvi.L, gvq::new);
      a(bvi.M, gsw::new);
      a(bvi.N, gsz::new);
      a(bvi.O, gta::new);
      a(bvi.P, gsy::new);
      a(bvi.Q, gvq::new);
      a(bvi.R, gsx::new);
      a(bvi.S, gtg::new);
      a(bvi.T, gtf::new);
      a(bvi.U, gvq::new);
      a(bvi.V, gth::new);
      a(bvi.W, $$0 -> new gvq<>($$0, 1.0F, true));
      a(bvi.X, gti::new);
      a(bvi.Y, $$0 -> new gvq<>($$0, 3.0F, true));
      a(bvi.Z, gtj::new);
      a(bvi.bS, gtk::new);
      a(bvi.aa, gtl::new);
      a(bvi.ab, gtm::new);
      a(bvi.ac, $$0 -> new gui($$0, ggb.aS));
      a(bvi.ad, gtn::new);
      a(bvi.ae, $$0 -> new gto($$0, 6.0F));
      a(bvi.af, gua::new);
      a(bvi.ag, $$0 -> new gtp($$0, new gfd($$0.a(ggb.aX)), new gfd($$0.a(ggb.aY))));
      a(bvi.ah, gtq::new);
      a(bvi.ai, gtr::new);
      a(bvi.aj, gts::new);
      a(bvi.ak, $$0 -> new gui($$0, ggb.be));
      a(bvi.al, gtt::new);
      a(bvi.am, gtv::new);
      a(bvi.an, gtx::new);
      a(bvi.ao, gul::new);
      a(bvi.ap, gty::new);
      a(bvi.aq, gtz::new);
      a(bvi.ar, gsr.b::new);
      a(bvi.as, gua::new);
      a(bvi.aJ, gun::new);
      a(bvi.av, guc::new);
      a(bvi.aw, gud::new);
      a(bvi.ax, $$0 -> new guf($$0, ggb.bu, ggb.bv));
      a(bvi.ay, gug::new);
      a(bvi.az, guh::new);
      a(bvi.aC, gul::new);
      a(bvi.aD, $$0 -> new gui($$0, ggb.bC));
      a(bvi.aE, guk::new);
      a(bvi.aF, $$0 -> new gst<>($$0, ggb.bF, ggb.bG, true));
      a(bvi.aI, gum::new);
      a(bvi.aK, guo::new);
      a(bvi.aN, gup::new);
      a(bvi.aO, guq::new);
      a(bvi.aP, gur::new);
      a(bvi.aQ, gus::new);
      a(bvi.aR, $$0 -> new gut($$0, ggb.bS, ggb.bT, ggb.ca, ggb.cb, ggb.bU, ggb.bV));
      a(bvi.aS, $$0 -> new gut($$0, ggb.bW, ggb.bW, ggb.bX, ggb.bY, ggb.bX, ggb.bY));
      a(bvi.aT, guu::new);
      a(bvi.aU, guv::new);
      a(bvi.aV, gvq::new);
      a(bvi.aW, guw::new);
      a(bvi.aX, gux::new);
      a(bvi.aY, guz::new);
      a(bvi.aZ, gvb::new);
      a(bvi.ba, gvc::new);
      a(bvi.bb, gve::new);
      a(bvi.bc, gvd::new);
      a(bvi.bd, gvf::new);
      a(bvi.be, gvg::new);
      a(bvi.bf, $$0 -> new gvx($$0, ggb.cL, ggb.cM, true));
      a(bvi.bg, gvh::new);
      a(bvi.bh, $$0 -> new gvq<>($$0, 0.75F, true));
      a(bvi.bi, gvi::new);
      a(bvi.bj, gvq::new);
      a(bvi.bk, gvj::new);
      a(bvi.bl, $$0 -> new gui($$0, ggb.cV));
      a(bvi.bm, gvk::new);
      a(bvi.bn, gvl::new);
      a(bvi.bq, $$0 -> new gvm<>($$0, new gfd($$0.a(ggb.cZ)), new gfd($$0.a(ggb.da))));
      a(bvi.br, gvn::new);
      a(bvi.bs, gvo::new);
      a(bvi.bt, gvp::new);
      a(bvi.bu, gsr.c::new);
      a(bvi.bv, gvu::new);
      a(bvi.bw, gvt::new);
      a(bvi.bx, $$0 -> new guf($$0, ggb.dl, ggb.dm));
      a(bvi.by, gvr::new);
      a(bvi.bz, gvv::new);
      a(bvi.bA, gvw::new);
      a(bvi.bB, gvy::new);
      a(bvi.bC, gvz::new);
      a(bvi.bD, gwa::new);
      a(bvi.bF, gwc::new);
      a(bvi.bE, gwb::new);
      a(bvi.bG, gwd::new);
      a(bvi.bH, gwe::new);
      a(bvi.bI, gwf::new);
      a(bvi.bJ, gwg::new);
      a(bvi.bK, gwh::new);
      a(bvi.bL, gwi::new);
      a(bvi.bM, gwj::new);
      a(bvi.bN, gwk::new);
      a(bvi.bO, $$0 -> new gvx($$0, ggb.dU, ggb.dV, false));
      a(bvi.bP, gwl::new);
      a(bvi.bQ, $$0 -> new gwm($$0, ggb.ee, ggb.ef, ggb.ei, ggb.ej, ggb.eg, ggb.eh));
   }
}
