import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class grm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvi<?>, grl<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hch.a, grl<gjz>> c = Map.of(hch.a.b, $$0 -> new gws($$0, false), hch.a.a, $$0 -> new gws($$0, true));

   private static <T extends bvb> void a(bvi<? extends T> $$0, grl<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvi<?>, grk<?, ?>> a(grl.a $$0) {
      Builder<bvi<?>, grk<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ma.f.b((bvi<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hch.a, grk<? extends cpo, ?>> b(grl.a $$0) {
      Builder<hch.a, grk<? extends cpo, ?>> $$1 = ImmutableMap.builder();
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

      for (bvi<?> $$1 : ma.f) {
         if ($$1 != bvi.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ma.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvi.c, gqg::new);
      a(bvi.d, gst::new);
      a(bvi.e, gqh::new);
      a(bvi.f, gqi::new);
      a(bvi.g, gua::new);
      a(bvi.h, gqk::new);
      a(bvi.k, gql::new);
      a(bvi.l, gqm::new);
      a(bvi.o, gqn::new);
      a(bvi.p, gqz.a::new);
      a(bvi.aH, $$0 -> new gqo($$0, gei.bF));
      a(bvi.bp, $$0 -> new gqo($$0, gei.cV));
      a(bvi.m, $$0 -> new gqo($$0, gei.B));
      a(bvi.au, $$0 -> new gqo($$0, gei.bp));
      a(bvi.a, $$0 -> new gqo($$0, gei.a));
      a(bvi.w, $$0 -> new gqo($$0, gei.T));
      a(bvi.G, $$0 -> new gqo($$0, gei.al));
      a(bvi.aM, $$0 -> new gqo($$0, gei.bJ));
      a(bvi.aB, $$0 -> new gqo($$0, gei.by));
      a(bvi.j, $$0 -> new gtg($$0, gei.p));
      a(bvi.q, gqp::new);
      a(bvi.r, gqq::new);
      a(bvi.s, gul::new);
      a(bvi.u, gqs::new);
      a(bvi.t, gqr::new);
      a(bvi.v, gqt::new);
      a(bvi.aI, $$0 -> new gqo($$0, gei.bG));
      a(bvi.bq, $$0 -> new gqo($$0, gei.cW));
      a(bvi.n, $$0 -> new gqo($$0, gei.C));
      a(bvi.av, $$0 -> new gqo($$0, gei.bq));
      a(bvi.b, $$0 -> new gqo($$0, gei.b));
      a(bvi.x, $$0 -> new gqo($$0, gei.U));
      a(bvi.H, $$0 -> new gqo($$0, gei.am));
      a(bvi.aN, $$0 -> new gqo($$0, gei.bK));
      a(bvi.aC, $$0 -> new gqo($$0, gei.bz));
      a(bvi.i, $$0 -> new gtg($$0, gei.o));
      a(bvi.y, $$0 -> new gsq($$0, gei.W));
      a(bvi.z, gqu::new);
      a(bvi.A, gqv::new);
      a(bvi.B, $$0 -> new gsq($$0, gei.aa));
      a(bvi.C, gqw::new);
      a(bvi.D, gqx::new);
      a(bvi.E, gqx::new);
      a(bvi.F, gqy::new);
      a(bvi.I, gra::new);
      a(bvi.J, $$0 -> new grb<>($$0, gei.ar, gei.as, false));
      a(bvi.K, grc::new);
      a(bvi.L, grd::new);
      a(bvi.M, gty::new);
      a(bvi.N, gre::new);
      a(bvi.O, grh::new);
      a(bvi.P, gri::new);
      a(bvi.Q, grg::new);
      a(bvi.R, gty::new);
      a(bvi.S, grf::new);
      a(bvi.T, gro::new);
      a(bvi.U, grn::new);
      a(bvi.V, gty::new);
      a(bvi.W, grp::new);
      a(bvi.X, $$0 -> new gty<>($$0, 1.0F, true));
      a(bvi.Y, grq::new);
      a(bvi.Z, $$0 -> new gty<>($$0, 3.0F, true));
      a(bvi.aa, grr::new);
      a(bvi.bT, grs::new);
      a(bvi.ab, grt::new);
      a(bvi.ac, gru::new);
      a(bvi.ad, $$0 -> new gsq($$0, gei.aQ));
      a(bvi.ae, grv::new);
      a(bvi.af, $$0 -> new grw($$0, 6.0F));
      a(bvi.ag, gsi::new);
      a(bvi.ah, $$0 -> new grx($$0, new gdk($$0.a(gei.aV)), new gdk($$0.a(gei.aW))));
      a(bvi.ai, gry::new);
      a(bvi.aj, grz::new);
      a(bvi.ak, gsa::new);
      a(bvi.al, $$0 -> new gsq($$0, gei.bc));
      a(bvi.am, gsb::new);
      a(bvi.an, gsd::new);
      a(bvi.ao, gsf::new);
      a(bvi.ap, gst::new);
      a(bvi.aq, gsg::new);
      a(bvi.ar, gsh::new);
      a(bvi.as, gqz.b::new);
      a(bvi.at, gsi::new);
      a(bvi.aK, gsv::new);
      a(bvi.aw, gsk::new);
      a(bvi.ax, gsl::new);
      a(bvi.ay, $$0 -> new gsn($$0, gei.bs, gei.bt));
      a(bvi.az, gso::new);
      a(bvi.aA, gsp::new);
      a(bvi.aD, gst::new);
      a(bvi.aE, $$0 -> new gsq($$0, gei.bA));
      a(bvi.aF, gss::new);
      a(bvi.aG, $$0 -> new grb<>($$0, gei.bD, gei.bE, true));
      a(bvi.aJ, gsu::new);
      a(bvi.aL, gsw::new);
      a(bvi.aO, gsx::new);
      a(bvi.aP, gsy::new);
      a(bvi.aQ, gsz::new);
      a(bvi.aR, gta::new);
      a(bvi.aS, $$0 -> new gtb($$0, gei.bQ, gei.bR, gei.bY, gei.bZ, gei.bS, gei.bT));
      a(bvi.aT, $$0 -> new gtb($$0, gei.bU, gei.bU, gei.bV, gei.bW, gei.bV, gei.bW));
      a(bvi.aU, gtc::new);
      a(bvi.aV, gtd::new);
      a(bvi.aW, gty::new);
      a(bvi.aX, gte::new);
      a(bvi.aY, gtf::new);
      a(bvi.aZ, gth::new);
      a(bvi.ba, gtj::new);
      a(bvi.bb, gtk::new);
      a(bvi.bc, gtm::new);
      a(bvi.bd, gtl::new);
      a(bvi.be, gtn::new);
      a(bvi.bf, gto::new);
      a(bvi.bg, $$0 -> new guf($$0, gei.cJ, gei.cK, true));
      a(bvi.bh, gtp::new);
      a(bvi.bi, $$0 -> new gty<>($$0, 0.75F, true));
      a(bvi.bj, gtq::new);
      a(bvi.bk, gty::new);
      a(bvi.bl, gtr::new);
      a(bvi.bm, $$0 -> new gsq($$0, gei.cT));
      a(bvi.bn, gts::new);
      a(bvi.bo, gtt::new);
      a(bvi.br, $$0 -> new gtu<>($$0, new gdk($$0.a(gei.cX)), new gdk($$0.a(gei.cY))));
      a(bvi.bs, gtv::new);
      a(bvi.bt, gtw::new);
      a(bvi.bu, gtx::new);
      a(bvi.bv, gqz.c::new);
      a(bvi.bw, guc::new);
      a(bvi.bx, gub::new);
      a(bvi.by, $$0 -> new gsn($$0, gei.dj, gei.dk));
      a(bvi.bz, gtz::new);
      a(bvi.bA, gud::new);
      a(bvi.bB, gue::new);
      a(bvi.bC, gug::new);
      a(bvi.bD, guh::new);
      a(bvi.bE, gui::new);
      a(bvi.bG, guk::new);
      a(bvi.bF, guj::new);
      a(bvi.bH, gul::new);
      a(bvi.bI, gum::new);
      a(bvi.bJ, gun::new);
      a(bvi.bK, guo::new);
      a(bvi.bL, gup::new);
      a(bvi.bM, guq::new);
      a(bvi.bN, gur::new);
      a(bvi.bO, gus::new);
      a(bvi.bP, $$0 -> new guf($$0, gei.dS, gei.dT, false));
      a(bvi.bQ, gut::new);
      a(bvi.bR, $$0 -> new guu($$0, gei.ec, gei.ed, gei.eg, gei.eh, gei.ee, gei.ef));
   }
}
