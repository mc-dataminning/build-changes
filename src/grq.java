import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class grq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvq<?>, grp<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hcl.a, grp<gkd>> c = Map.of(hcl.a.b, $$0 -> new gww($$0, false), hcl.a.a, $$0 -> new gww($$0, true));

   private static <T extends bvj> void a(bvq<? extends T> $$0, grp<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvq<?>, gro<?, ?>> a(grp.a $$0) {
      Builder<bvq<?>, gro<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ma.f.b((bvq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hcl.a, gro<? extends cpw, ?>> b(grp.a $$0) {
      Builder<hcl.a, gro<? extends cpw, ?>> $$1 = ImmutableMap.builder();
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

      for (bvq<?> $$1 : ma.f) {
         if ($$1 != bvq.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ma.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvq.c, gqk::new);
      a(bvq.d, gsx::new);
      a(bvq.e, gql::new);
      a(bvq.f, gqm::new);
      a(bvq.g, gue::new);
      a(bvq.h, gqo::new);
      a(bvq.k, gqp::new);
      a(bvq.l, gqq::new);
      a(bvq.o, gqr::new);
      a(bvq.p, grd.a::new);
      a(bvq.aH, $$0 -> new gqs($$0, gem.bC));
      a(bvq.bp, $$0 -> new gqs($$0, gem.cS));
      a(bvq.m, $$0 -> new gqs($$0, gem.y));
      a(bvq.au, $$0 -> new gqs($$0, gem.bm));
      a(bvq.a, $$0 -> new gqs($$0, gem.a));
      a(bvq.w, $$0 -> new gqs($$0, gem.Q));
      a(bvq.G, $$0 -> new gqs($$0, gem.ai));
      a(bvq.aM, $$0 -> new gqs($$0, gem.bG));
      a(bvq.aB, $$0 -> new gqs($$0, gem.bv));
      a(bvq.j, $$0 -> new gtk($$0, gem.p));
      a(bvq.q, gqt::new);
      a(bvq.r, gqu::new);
      a(bvq.s, gup::new);
      a(bvq.u, gqw::new);
      a(bvq.t, gqv::new);
      a(bvq.v, gqx::new);
      a(bvq.aI, $$0 -> new gqs($$0, gem.bD));
      a(bvq.bq, $$0 -> new gqs($$0, gem.cT));
      a(bvq.n, $$0 -> new gqs($$0, gem.z));
      a(bvq.av, $$0 -> new gqs($$0, gem.bn));
      a(bvq.b, $$0 -> new gqs($$0, gem.b));
      a(bvq.x, $$0 -> new gqs($$0, gem.R));
      a(bvq.H, $$0 -> new gqs($$0, gem.aj));
      a(bvq.aN, $$0 -> new gqs($$0, gem.bH));
      a(bvq.aC, $$0 -> new gqs($$0, gem.bw));
      a(bvq.i, $$0 -> new gtk($$0, gem.o));
      a(bvq.y, $$0 -> new gsu($$0, gem.T));
      a(bvq.z, gqy::new);
      a(bvq.A, gqz::new);
      a(bvq.B, $$0 -> new gsu($$0, gem.X));
      a(bvq.C, gra::new);
      a(bvq.D, grb::new);
      a(bvq.E, grb::new);
      a(bvq.F, grc::new);
      a(bvq.I, gre::new);
      a(bvq.J, $$0 -> new grf<>($$0, 0.87F, gem.ao, gem.ap, false));
      a(bvq.K, grg::new);
      a(bvq.L, grh::new);
      a(bvq.M, guc::new);
      a(bvq.N, gri::new);
      a(bvq.O, grl::new);
      a(bvq.P, grm::new);
      a(bvq.Q, grk::new);
      a(bvq.R, guc::new);
      a(bvq.S, grj::new);
      a(bvq.T, grs::new);
      a(bvq.U, grr::new);
      a(bvq.V, guc::new);
      a(bvq.W, grt::new);
      a(bvq.X, $$0 -> new guc<>($$0, 1.0F, true));
      a(bvq.Y, gru::new);
      a(bvq.Z, $$0 -> new guc<>($$0, 3.0F, true));
      a(bvq.aa, grv::new);
      a(bvq.bT, grw::new);
      a(bvq.ab, grx::new);
      a(bvq.ac, gry::new);
      a(bvq.ad, $$0 -> new gsu($$0, gem.aN));
      a(bvq.ae, grz::new);
      a(bvq.af, $$0 -> new gsa($$0, 6.0F));
      a(bvq.ag, gsm::new);
      a(bvq.ah, $$0 -> new gsb($$0, new gdo($$0.a(gem.aS)), new gdo($$0.a(gem.aT))));
      a(bvq.ai, gsc::new);
      a(bvq.aj, gsd::new);
      a(bvq.ak, gse::new);
      a(bvq.al, $$0 -> new gsu($$0, gem.aZ));
      a(bvq.am, gsf::new);
      a(bvq.an, gsh::new);
      a(bvq.ao, gsj::new);
      a(bvq.ap, gsx::new);
      a(bvq.aq, gsk::new);
      a(bvq.ar, gsl::new);
      a(bvq.as, grd.b::new);
      a(bvq.at, gsm::new);
      a(bvq.aK, gsz::new);
      a(bvq.aw, gso::new);
      a(bvq.ax, gsp::new);
      a(bvq.ay, $$0 -> new gsr($$0, gem.bp, gem.bq));
      a(bvq.az, gss::new);
      a(bvq.aA, gst::new);
      a(bvq.aD, gsx::new);
      a(bvq.aE, $$0 -> new gsu($$0, gem.bx));
      a(bvq.aF, gsw::new);
      a(bvq.aG, $$0 -> new grf<>($$0, 0.92F, gem.bA, gem.bB, true));
      a(bvq.aJ, gsy::new);
      a(bvq.aL, gta::new);
      a(bvq.aO, gtb::new);
      a(bvq.aP, gtc::new);
      a(bvq.aQ, gtd::new);
      a(bvq.aR, gte::new);
      a(bvq.aS, $$0 -> new gtf($$0, gem.bN, gem.bO, gem.bV, gem.bW, gem.bP, gem.bQ));
      a(bvq.aT, $$0 -> new gtf($$0, gem.bR, gem.bR, gem.bS, gem.bT, gem.bS, gem.bT));
      a(bvq.aU, gtg::new);
      a(bvq.aV, gth::new);
      a(bvq.aW, guc::new);
      a(bvq.aX, gti::new);
      a(bvq.aY, gtj::new);
      a(bvq.aZ, gtl::new);
      a(bvq.ba, gtn::new);
      a(bvq.bb, gto::new);
      a(bvq.bc, gtq::new);
      a(bvq.bd, gtp::new);
      a(bvq.be, gtr::new);
      a(bvq.bf, gts::new);
      a(bvq.bg, $$0 -> new guj($$0, gem.cG, gem.cH, true));
      a(bvq.bh, gtt::new);
      a(bvq.bi, $$0 -> new guc<>($$0, 0.75F, true));
      a(bvq.bj, gtu::new);
      a(bvq.bk, guc::new);
      a(bvq.bl, gtv::new);
      a(bvq.bm, $$0 -> new gsu($$0, gem.cQ));
      a(bvq.bn, gtw::new);
      a(bvq.bo, gtx::new);
      a(bvq.br, $$0 -> new gty<>($$0, new gdo($$0.a(gem.cU)), new gdo($$0.a(gem.cV))));
      a(bvq.bs, gtz::new);
      a(bvq.bt, gua::new);
      a(bvq.bu, gub::new);
      a(bvq.bv, grd.c::new);
      a(bvq.bw, gug::new);
      a(bvq.bx, guf::new);
      a(bvq.by, $$0 -> new gsr($$0, gem.de, gem.df));
      a(bvq.bz, gud::new);
      a(bvq.bA, guh::new);
      a(bvq.bB, gui::new);
      a(bvq.bC, guk::new);
      a(bvq.bD, gul::new);
      a(bvq.bE, gum::new);
      a(bvq.bG, guo::new);
      a(bvq.bF, gun::new);
      a(bvq.bH, gup::new);
      a(bvq.bI, guq::new);
      a(bvq.bJ, gur::new);
      a(bvq.bK, gus::new);
      a(bvq.bL, gut::new);
      a(bvq.bM, guu::new);
      a(bvq.bN, guv::new);
      a(bvq.bO, guw::new);
      a(bvq.bP, $$0 -> new guj($$0, gem.dM, gem.dN, false));
      a(bvq.bQ, gux::new);
      a(bvq.bR, $$0 -> new guy($$0, gem.dW, gem.dX, gem.ea, gem.eb, gem.dY, gem.dZ));
   }
}
