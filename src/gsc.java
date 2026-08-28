import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gsc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<buq<?>, gsb<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hfo.a, gsb<gkq>> c = Map.of(hfo.a.b, $$0 -> new gxi($$0, false), hfo.a.a, $$0 -> new gxi($$0, true));

   private static <T extends buj> void a(buq<? extends T> $$0, gsb<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<buq<?>, gsa<?, ?>> a(gsb.a $$0) {
      Builder<buq<?>, gsa<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mb.f.b((buq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hfo.a, gsa<? extends cov, ?>> b(gsb.a $$0) {
      Builder<hfo.a, gsa<? extends cov, ?>> $$1 = ImmutableMap.builder();
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

      for (buq<?> $$1 : mb.f) {
         if ($$1 != buq.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mb.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(buq.c, gqw::new);
      a(buq.d, gtj::new);
      a(buq.e, gqx::new);
      a(buq.f, gqy::new);
      a(buq.g, guq::new);
      a(buq.h, gra::new);
      a(buq.k, grb::new);
      a(buq.l, grc::new);
      a(buq.o, grd::new);
      a(buq.p, grp.a::new);
      a(buq.aG, $$0 -> new gre($$0, gez.bF));
      a(buq.bo, $$0 -> new gre($$0, gez.cV));
      a(buq.m, $$0 -> new gre($$0, gez.B));
      a(buq.at, $$0 -> new gre($$0, gez.bp));
      a(buq.a, $$0 -> new gre($$0, gez.a));
      a(buq.w, $$0 -> new gre($$0, gez.T));
      a(buq.F, $$0 -> new gre($$0, gez.al));
      a(buq.aL, $$0 -> new gre($$0, gez.bJ));
      a(buq.aA, $$0 -> new gre($$0, gez.by));
      a(buq.j, $$0 -> new gtw($$0, gez.p));
      a(buq.q, grf::new);
      a(buq.r, grg::new);
      a(buq.s, gvb::new);
      a(buq.u, gri::new);
      a(buq.t, grh::new);
      a(buq.v, grj::new);
      a(buq.aH, $$0 -> new gre($$0, gez.bG));
      a(buq.bp, $$0 -> new gre($$0, gez.cW));
      a(buq.n, $$0 -> new gre($$0, gez.C));
      a(buq.au, $$0 -> new gre($$0, gez.bq));
      a(buq.b, $$0 -> new gre($$0, gez.b));
      a(buq.x, $$0 -> new gre($$0, gez.U));
      a(buq.G, $$0 -> new gre($$0, gez.am));
      a(buq.aM, $$0 -> new gre($$0, gez.bK));
      a(buq.aB, $$0 -> new gre($$0, gez.bz));
      a(buq.i, $$0 -> new gtw($$0, gez.o));
      a(buq.y, $$0 -> new gtg($$0, gez.W));
      a(buq.z, grk::new);
      a(buq.A, grl::new);
      a(buq.B, $$0 -> new gtg($$0, gez.aa));
      a(buq.C, grm::new);
      a(buq.D, grn::new);
      a(buq.E, gro::new);
      a(buq.H, grq::new);
      a(buq.I, $$0 -> new grr<>($$0, gez.ar, gez.as, false));
      a(buq.J, grs::new);
      a(buq.K, grt::new);
      a(buq.L, guo::new);
      a(buq.M, gru::new);
      a(buq.N, grx::new);
      a(buq.O, gry::new);
      a(buq.P, grw::new);
      a(buq.Q, guo::new);
      a(buq.R, grv::new);
      a(buq.S, gse::new);
      a(buq.T, gsd::new);
      a(buq.U, guo::new);
      a(buq.V, gsf::new);
      a(buq.W, $$0 -> new guo<>($$0, 1.0F, true));
      a(buq.X, gsg::new);
      a(buq.Y, $$0 -> new guo<>($$0, 3.0F, true));
      a(buq.Z, gsh::new);
      a(buq.bS, gsi::new);
      a(buq.aa, gsj::new);
      a(buq.ab, gsk::new);
      a(buq.ac, $$0 -> new gtg($$0, gez.aQ));
      a(buq.ad, gsl::new);
      a(buq.ae, $$0 -> new gsm($$0, 6.0F));
      a(buq.af, gsy::new);
      a(buq.ag, $$0 -> new gsn($$0, new geb($$0.a(gez.aV)), new geb($$0.a(gez.aW))));
      a(buq.ah, gso::new);
      a(buq.ai, gsp::new);
      a(buq.aj, gsq::new);
      a(buq.ak, $$0 -> new gtg($$0, gez.bc));
      a(buq.al, gsr::new);
      a(buq.am, gst::new);
      a(buq.an, gsv::new);
      a(buq.ao, gtj::new);
      a(buq.ap, gsw::new);
      a(buq.aq, gsx::new);
      a(buq.ar, grp.b::new);
      a(buq.as, gsy::new);
      a(buq.aJ, gtl::new);
      a(buq.av, gta::new);
      a(buq.aw, gtb::new);
      a(buq.ax, $$0 -> new gtd($$0, gez.bs, gez.bt));
      a(buq.ay, gte::new);
      a(buq.az, gtf::new);
      a(buq.aC, gtj::new);
      a(buq.aD, $$0 -> new gtg($$0, gez.bA));
      a(buq.aE, gti::new);
      a(buq.aF, $$0 -> new grr<>($$0, gez.bD, gez.bE, true));
      a(buq.aI, gtk::new);
      a(buq.aK, gtm::new);
      a(buq.aN, gtn::new);
      a(buq.aO, gto::new);
      a(buq.aP, gtp::new);
      a(buq.aQ, gtq::new);
      a(buq.aR, $$0 -> new gtr($$0, gez.bQ, gez.bR, gez.bY, gez.bZ, gez.bS, gez.bT));
      a(buq.aS, $$0 -> new gtr($$0, gez.bU, gez.bU, gez.bV, gez.bW, gez.bV, gez.bW));
      a(buq.aT, gts::new);
      a(buq.aU, gtt::new);
      a(buq.aV, guo::new);
      a(buq.aW, gtu::new);
      a(buq.aX, gtv::new);
      a(buq.aY, gtx::new);
      a(buq.aZ, gtz::new);
      a(buq.ba, gua::new);
      a(buq.bb, guc::new);
      a(buq.bc, gub::new);
      a(buq.bd, gud::new);
      a(buq.be, gue::new);
      a(buq.bf, $$0 -> new guv($$0, gez.cJ, gez.cK, true));
      a(buq.bg, guf::new);
      a(buq.bh, $$0 -> new guo<>($$0, 0.75F, true));
      a(buq.bi, gug::new);
      a(buq.bj, guo::new);
      a(buq.bk, guh::new);
      a(buq.bl, $$0 -> new gtg($$0, gez.cT));
      a(buq.bm, gui::new);
      a(buq.bn, guj::new);
      a(buq.bq, $$0 -> new guk<>($$0, new geb($$0.a(gez.cX)), new geb($$0.a(gez.cY))));
      a(buq.br, gul::new);
      a(buq.bs, gum::new);
      a(buq.bt, gun::new);
      a(buq.bu, grp.c::new);
      a(buq.bv, gus::new);
      a(buq.bw, gur::new);
      a(buq.bx, $$0 -> new gtd($$0, gez.dj, gez.dk));
      a(buq.by, gup::new);
      a(buq.bz, gut::new);
      a(buq.bA, guu::new);
      a(buq.bB, guw::new);
      a(buq.bC, gux::new);
      a(buq.bD, guy::new);
      a(buq.bF, gva::new);
      a(buq.bE, guz::new);
      a(buq.bG, gvb::new);
      a(buq.bH, gvc::new);
      a(buq.bI, gvd::new);
      a(buq.bJ, gve::new);
      a(buq.bK, gvf::new);
      a(buq.bL, gvg::new);
      a(buq.bM, gvh::new);
      a(buq.bN, gvi::new);
      a(buq.bO, $$0 -> new guv($$0, gez.dS, gez.dT, false));
      a(buq.bP, gvj::new);
      a(buq.bQ, $$0 -> new gvk($$0, gez.ec, gez.ed, gez.eg, gez.eh, gez.ee, gez.ef));
   }
}
