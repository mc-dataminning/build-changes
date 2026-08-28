import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class grk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvm<?>, grj<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hcf.a, grj<gjx>> c = Map.of(hcf.a.b, $$0 -> new gwq($$0, false), hcf.a.a, $$0 -> new gwq($$0, true));

   private static <T extends bvf> void a(bvm<? extends T> $$0, grj<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvm<?>, gri<?, ?>> a(grj.a $$0) {
      Builder<bvm<?>, gri<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ma.f.b((bvm<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hcf.a, gri<? extends cps, ?>> b(grj.a $$0) {
      Builder<hcf.a, gri<? extends cps, ?>> $$1 = ImmutableMap.builder();
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

      for (bvm<?> $$1 : ma.f) {
         if ($$1 != bvm.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ma.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvm.c, gqe::new);
      a(bvm.d, gsr::new);
      a(bvm.e, gqf::new);
      a(bvm.f, gqg::new);
      a(bvm.g, gty::new);
      a(bvm.h, gqi::new);
      a(bvm.k, gqj::new);
      a(bvm.l, gqk::new);
      a(bvm.o, gql::new);
      a(bvm.p, gqx.a::new);
      a(bvm.aH, $$0 -> new gqm($$0, geg.bC));
      a(bvm.bp, $$0 -> new gqm($$0, geg.cS));
      a(bvm.m, $$0 -> new gqm($$0, geg.y));
      a(bvm.au, $$0 -> new gqm($$0, geg.bm));
      a(bvm.a, $$0 -> new gqm($$0, geg.a));
      a(bvm.w, $$0 -> new gqm($$0, geg.Q));
      a(bvm.G, $$0 -> new gqm($$0, geg.ai));
      a(bvm.aM, $$0 -> new gqm($$0, geg.bG));
      a(bvm.aB, $$0 -> new gqm($$0, geg.bv));
      a(bvm.j, $$0 -> new gte($$0, geg.p));
      a(bvm.q, gqn::new);
      a(bvm.r, gqo::new);
      a(bvm.s, guj::new);
      a(bvm.u, gqq::new);
      a(bvm.t, gqp::new);
      a(bvm.v, gqr::new);
      a(bvm.aI, $$0 -> new gqm($$0, geg.bD));
      a(bvm.bq, $$0 -> new gqm($$0, geg.cT));
      a(bvm.n, $$0 -> new gqm($$0, geg.z));
      a(bvm.av, $$0 -> new gqm($$0, geg.bn));
      a(bvm.b, $$0 -> new gqm($$0, geg.b));
      a(bvm.x, $$0 -> new gqm($$0, geg.R));
      a(bvm.H, $$0 -> new gqm($$0, geg.aj));
      a(bvm.aN, $$0 -> new gqm($$0, geg.bH));
      a(bvm.aC, $$0 -> new gqm($$0, geg.bw));
      a(bvm.i, $$0 -> new gte($$0, geg.o));
      a(bvm.y, $$0 -> new gso($$0, geg.T));
      a(bvm.z, gqs::new);
      a(bvm.A, gqt::new);
      a(bvm.B, $$0 -> new gso($$0, geg.X));
      a(bvm.C, gqu::new);
      a(bvm.D, gqv::new);
      a(bvm.E, gqv::new);
      a(bvm.F, gqw::new);
      a(bvm.I, gqy::new);
      a(bvm.J, $$0 -> new gqz<>($$0, 0.87F, geg.ao, geg.ap, false));
      a(bvm.K, gra::new);
      a(bvm.L, grb::new);
      a(bvm.M, gtw::new);
      a(bvm.N, grc::new);
      a(bvm.O, grf::new);
      a(bvm.P, grg::new);
      a(bvm.Q, gre::new);
      a(bvm.R, gtw::new);
      a(bvm.S, grd::new);
      a(bvm.T, grm::new);
      a(bvm.U, grl::new);
      a(bvm.V, gtw::new);
      a(bvm.W, grn::new);
      a(bvm.X, $$0 -> new gtw<>($$0, 1.0F, true));
      a(bvm.Y, gro::new);
      a(bvm.Z, $$0 -> new gtw<>($$0, 3.0F, true));
      a(bvm.aa, grp::new);
      a(bvm.bT, grq::new);
      a(bvm.ab, grr::new);
      a(bvm.ac, grs::new);
      a(bvm.ad, $$0 -> new gso($$0, geg.aN));
      a(bvm.ae, grt::new);
      a(bvm.af, $$0 -> new gru($$0, 6.0F));
      a(bvm.ag, gsg::new);
      a(bvm.ah, $$0 -> new grv($$0, new gdi($$0.a(geg.aS)), new gdi($$0.a(geg.aT))));
      a(bvm.ai, grw::new);
      a(bvm.aj, grx::new);
      a(bvm.ak, gry::new);
      a(bvm.al, $$0 -> new gso($$0, geg.aZ));
      a(bvm.am, grz::new);
      a(bvm.an, gsb::new);
      a(bvm.ao, gsd::new);
      a(bvm.ap, gsr::new);
      a(bvm.aq, gse::new);
      a(bvm.ar, gsf::new);
      a(bvm.as, gqx.b::new);
      a(bvm.at, gsg::new);
      a(bvm.aK, gst::new);
      a(bvm.aw, gsi::new);
      a(bvm.ax, gsj::new);
      a(bvm.ay, $$0 -> new gsl($$0, geg.bp, geg.bq));
      a(bvm.az, gsm::new);
      a(bvm.aA, gsn::new);
      a(bvm.aD, gsr::new);
      a(bvm.aE, $$0 -> new gso($$0, geg.bx));
      a(bvm.aF, gsq::new);
      a(bvm.aG, $$0 -> new gqz<>($$0, 0.92F, geg.bA, geg.bB, true));
      a(bvm.aJ, gss::new);
      a(bvm.aL, gsu::new);
      a(bvm.aO, gsv::new);
      a(bvm.aP, gsw::new);
      a(bvm.aQ, gsx::new);
      a(bvm.aR, gsy::new);
      a(bvm.aS, $$0 -> new gsz($$0, geg.bN, geg.bO, geg.bV, geg.bW, geg.bP, geg.bQ));
      a(bvm.aT, $$0 -> new gsz($$0, geg.bR, geg.bR, geg.bS, geg.bT, geg.bS, geg.bT));
      a(bvm.aU, gta::new);
      a(bvm.aV, gtb::new);
      a(bvm.aW, gtw::new);
      a(bvm.aX, gtc::new);
      a(bvm.aY, gtd::new);
      a(bvm.aZ, gtf::new);
      a(bvm.ba, gth::new);
      a(bvm.bb, gti::new);
      a(bvm.bc, gtk::new);
      a(bvm.bd, gtj::new);
      a(bvm.be, gtl::new);
      a(bvm.bf, gtm::new);
      a(bvm.bg, $$0 -> new gud($$0, geg.cG, geg.cH, true));
      a(bvm.bh, gtn::new);
      a(bvm.bi, $$0 -> new gtw<>($$0, 0.75F, true));
      a(bvm.bj, gto::new);
      a(bvm.bk, gtw::new);
      a(bvm.bl, gtp::new);
      a(bvm.bm, $$0 -> new gso($$0, geg.cQ));
      a(bvm.bn, gtq::new);
      a(bvm.bo, gtr::new);
      a(bvm.br, $$0 -> new gts<>($$0, new gdi($$0.a(geg.cU)), new gdi($$0.a(geg.cV))));
      a(bvm.bs, gtt::new);
      a(bvm.bt, gtu::new);
      a(bvm.bu, gtv::new);
      a(bvm.bv, gqx.c::new);
      a(bvm.bw, gua::new);
      a(bvm.bx, gtz::new);
      a(bvm.by, $$0 -> new gsl($$0, geg.de, geg.df));
      a(bvm.bz, gtx::new);
      a(bvm.bA, gub::new);
      a(bvm.bB, guc::new);
      a(bvm.bC, gue::new);
      a(bvm.bD, guf::new);
      a(bvm.bE, gug::new);
      a(bvm.bG, gui::new);
      a(bvm.bF, guh::new);
      a(bvm.bH, guj::new);
      a(bvm.bI, guk::new);
      a(bvm.bJ, gul::new);
      a(bvm.bK, gum::new);
      a(bvm.bL, gun::new);
      a(bvm.bM, guo::new);
      a(bvm.bN, gup::new);
      a(bvm.bO, guq::new);
      a(bvm.bP, $$0 -> new gud($$0, geg.dM, geg.dN, false));
      a(bvm.bQ, gur::new);
      a(bvm.bR, $$0 -> new gus($$0, geg.dW, geg.dX, geg.ea, geg.eb, geg.dY, geg.dZ));
   }
}
