import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class grr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvr<?>, grq<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hcm.a, grq<gke>> c = Map.of(hcm.a.b, $$0 -> new gwx($$0, false), hcm.a.a, $$0 -> new gwx($$0, true));

   private static <T extends bvk> void a(bvr<? extends T> $$0, grq<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvr<?>, grp<?, ?>> a(grq.a $$0) {
      Builder<bvr<?>, grp<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ma.f.b((bvr<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hcm.a, grp<? extends cpx, ?>> b(grq.a $$0) {
      Builder<hcm.a, grp<? extends cpx, ?>> $$1 = ImmutableMap.builder();
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

      for (bvr<?> $$1 : ma.f) {
         if ($$1 != bvr.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ma.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvr.c, gql::new);
      a(bvr.d, gsy::new);
      a(bvr.e, gqm::new);
      a(bvr.f, gqn::new);
      a(bvr.g, guf::new);
      a(bvr.h, gqp::new);
      a(bvr.k, gqq::new);
      a(bvr.l, gqr::new);
      a(bvr.o, gqs::new);
      a(bvr.p, gre.a::new);
      a(bvr.aH, $$0 -> new gqt($$0, gen.bC));
      a(bvr.bp, $$0 -> new gqt($$0, gen.cS));
      a(bvr.m, $$0 -> new gqt($$0, gen.y));
      a(bvr.au, $$0 -> new gqt($$0, gen.bm));
      a(bvr.a, $$0 -> new gqt($$0, gen.a));
      a(bvr.w, $$0 -> new gqt($$0, gen.Q));
      a(bvr.G, $$0 -> new gqt($$0, gen.ai));
      a(bvr.aM, $$0 -> new gqt($$0, gen.bG));
      a(bvr.aB, $$0 -> new gqt($$0, gen.bv));
      a(bvr.j, $$0 -> new gtl($$0, gen.p));
      a(bvr.q, gqu::new);
      a(bvr.r, gqv::new);
      a(bvr.s, guq::new);
      a(bvr.u, gqx::new);
      a(bvr.t, gqw::new);
      a(bvr.v, gqy::new);
      a(bvr.aI, $$0 -> new gqt($$0, gen.bD));
      a(bvr.bq, $$0 -> new gqt($$0, gen.cT));
      a(bvr.n, $$0 -> new gqt($$0, gen.z));
      a(bvr.av, $$0 -> new gqt($$0, gen.bn));
      a(bvr.b, $$0 -> new gqt($$0, gen.b));
      a(bvr.x, $$0 -> new gqt($$0, gen.R));
      a(bvr.H, $$0 -> new gqt($$0, gen.aj));
      a(bvr.aN, $$0 -> new gqt($$0, gen.bH));
      a(bvr.aC, $$0 -> new gqt($$0, gen.bw));
      a(bvr.i, $$0 -> new gtl($$0, gen.o));
      a(bvr.y, $$0 -> new gsv($$0, gen.T));
      a(bvr.z, gqz::new);
      a(bvr.A, gra::new);
      a(bvr.B, $$0 -> new gsv($$0, gen.X));
      a(bvr.C, grb::new);
      a(bvr.D, grc::new);
      a(bvr.E, grc::new);
      a(bvr.F, grd::new);
      a(bvr.I, grf::new);
      a(bvr.J, $$0 -> new grg<>($$0, 0.87F, gen.ao, gen.ap, false));
      a(bvr.K, grh::new);
      a(bvr.L, gri::new);
      a(bvr.M, gud::new);
      a(bvr.N, grj::new);
      a(bvr.O, grm::new);
      a(bvr.P, grn::new);
      a(bvr.Q, grl::new);
      a(bvr.R, gud::new);
      a(bvr.S, grk::new);
      a(bvr.T, grt::new);
      a(bvr.U, grs::new);
      a(bvr.V, gud::new);
      a(bvr.W, gru::new);
      a(bvr.X, $$0 -> new gud<>($$0, 1.0F, true));
      a(bvr.Y, grv::new);
      a(bvr.Z, $$0 -> new gud<>($$0, 3.0F, true));
      a(bvr.aa, grw::new);
      a(bvr.bT, grx::new);
      a(bvr.ab, gry::new);
      a(bvr.ac, grz::new);
      a(bvr.ad, $$0 -> new gsv($$0, gen.aN));
      a(bvr.ae, gsa::new);
      a(bvr.af, $$0 -> new gsb($$0, 6.0F));
      a(bvr.ag, gsn::new);
      a(bvr.ah, $$0 -> new gsc($$0, new gdp($$0.a(gen.aS)), new gdp($$0.a(gen.aT))));
      a(bvr.ai, gsd::new);
      a(bvr.aj, gse::new);
      a(bvr.ak, gsf::new);
      a(bvr.al, $$0 -> new gsv($$0, gen.aZ));
      a(bvr.am, gsg::new);
      a(bvr.an, gsi::new);
      a(bvr.ao, gsk::new);
      a(bvr.ap, gsy::new);
      a(bvr.aq, gsl::new);
      a(bvr.ar, gsm::new);
      a(bvr.as, gre.b::new);
      a(bvr.at, gsn::new);
      a(bvr.aK, gta::new);
      a(bvr.aw, gsp::new);
      a(bvr.ax, gsq::new);
      a(bvr.ay, $$0 -> new gss($$0, gen.bp, gen.bq));
      a(bvr.az, gst::new);
      a(bvr.aA, gsu::new);
      a(bvr.aD, gsy::new);
      a(bvr.aE, $$0 -> new gsv($$0, gen.bx));
      a(bvr.aF, gsx::new);
      a(bvr.aG, $$0 -> new grg<>($$0, 0.92F, gen.bA, gen.bB, true));
      a(bvr.aJ, gsz::new);
      a(bvr.aL, gtb::new);
      a(bvr.aO, gtc::new);
      a(bvr.aP, gtd::new);
      a(bvr.aQ, gte::new);
      a(bvr.aR, gtf::new);
      a(bvr.aS, $$0 -> new gtg($$0, gen.bN, gen.bO, gen.bV, gen.bW, gen.bP, gen.bQ));
      a(bvr.aT, $$0 -> new gtg($$0, gen.bR, gen.bR, gen.bS, gen.bT, gen.bS, gen.bT));
      a(bvr.aU, gth::new);
      a(bvr.aV, gti::new);
      a(bvr.aW, gud::new);
      a(bvr.aX, gtj::new);
      a(bvr.aY, gtk::new);
      a(bvr.aZ, gtm::new);
      a(bvr.ba, gto::new);
      a(bvr.bb, gtp::new);
      a(bvr.bc, gtr::new);
      a(bvr.bd, gtq::new);
      a(bvr.be, gts::new);
      a(bvr.bf, gtt::new);
      a(bvr.bg, $$0 -> new guk($$0, gen.cG, gen.cH, true));
      a(bvr.bh, gtu::new);
      a(bvr.bi, $$0 -> new gud<>($$0, 0.75F, true));
      a(bvr.bj, gtv::new);
      a(bvr.bk, gud::new);
      a(bvr.bl, gtw::new);
      a(bvr.bm, $$0 -> new gsv($$0, gen.cQ));
      a(bvr.bn, gtx::new);
      a(bvr.bo, gty::new);
      a(bvr.br, $$0 -> new gtz<>($$0, new gdp($$0.a(gen.cU)), new gdp($$0.a(gen.cV))));
      a(bvr.bs, gua::new);
      a(bvr.bt, gub::new);
      a(bvr.bu, guc::new);
      a(bvr.bv, gre.c::new);
      a(bvr.bw, guh::new);
      a(bvr.bx, gug::new);
      a(bvr.by, $$0 -> new gss($$0, gen.de, gen.df));
      a(bvr.bz, gue::new);
      a(bvr.bA, gui::new);
      a(bvr.bB, guj::new);
      a(bvr.bC, gul::new);
      a(bvr.bD, gum::new);
      a(bvr.bE, gun::new);
      a(bvr.bG, gup::new);
      a(bvr.bF, guo::new);
      a(bvr.bH, guq::new);
      a(bvr.bI, gur::new);
      a(bvr.bJ, gus::new);
      a(bvr.bK, gut::new);
      a(bvr.bL, guu::new);
      a(bvr.bM, guv::new);
      a(bvr.bN, guw::new);
      a(bvr.bO, gux::new);
      a(bvr.bP, $$0 -> new guk($$0, gen.dM, gen.dN, false));
      a(bvr.bQ, guy::new);
      a(bvr.bR, $$0 -> new guz($$0, gen.dW, gen.dX, gen.ea, gen.eb, gen.dY, gen.dZ));
   }
}
