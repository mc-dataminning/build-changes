import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gpl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bus<?>, gpk<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<haf.a, gpk<ghz>> c = Map.of(haf.a.b, $$0 -> new gur($$0, false), haf.a.a, $$0 -> new gur($$0, true));

   private static <T extends bul> void a(bus<? extends T> $$0, gpk<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bus<?>, gpj<?, ?>> a(gpk.a $$0) {
      Builder<bus<?>, gpj<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lz.f.b((bus<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<haf.a, gpj<? extends cou, ?>> b(gpk.a $$0) {
      Builder<haf.a, gpj<? extends cou, ?>> $$1 = ImmutableMap.builder();
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

      for (bus<?> $$1 : lz.f) {
         if ($$1 != bus.bO && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lz.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bus.c, gog::new);
      a(bus.d, gqs::new);
      a(bus.e, goh::new);
      a(bus.f, goi::new);
      a(bus.g, grz::new);
      a(bus.h, gok::new);
      a(bus.k, gol::new);
      a(bus.l, gom::new);
      a(bus.o, gon::new);
      a(bus.p, goy.a::new);
      a(bus.aF, $$0 -> new goo($$0, gck.bB));
      a(bus.bl, $$0 -> new goo($$0, gck.cP));
      a(bus.m, $$0 -> new goo($$0, gck.y));
      a(bus.as, $$0 -> new goo($$0, gck.bl));
      a(bus.a, $$0 -> new goo($$0, gck.a));
      a(bus.w, $$0 -> new goo($$0, gck.Q));
      a(bus.E, $$0 -> new goo($$0, gck.ah));
      a(bus.az, $$0 -> new goo($$0, gck.bu));
      a(bus.j, $$0 -> new grf($$0, gck.p));
      a(bus.q, gop::new);
      a(bus.r, goq::new);
      a(bus.s, gsk::new);
      a(bus.u, gos::new);
      a(bus.t, gor::new);
      a(bus.v, got::new);
      a(bus.aG, $$0 -> new goo($$0, gck.bC));
      a(bus.bm, $$0 -> new goo($$0, gck.cQ));
      a(bus.n, $$0 -> new goo($$0, gck.z));
      a(bus.at, $$0 -> new goo($$0, gck.bm));
      a(bus.b, $$0 -> new goo($$0, gck.b));
      a(bus.x, $$0 -> new goo($$0, gck.R));
      a(bus.F, $$0 -> new goo($$0, gck.ai));
      a(bus.aA, $$0 -> new goo($$0, gck.bv));
      a(bus.i, $$0 -> new grf($$0, gck.o));
      a(bus.y, $$0 -> new gqp($$0, gck.T));
      a(bus.z, gou::new);
      a(bus.A, gov::new);
      a(bus.B, $$0 -> new gqp($$0, gck.X));
      a(bus.C, gow::new);
      a(bus.D, gox::new);
      a(bus.G, goz::new);
      a(bus.H, $$0 -> new gpa<>($$0, 0.87F, gck.an, gck.ao, false));
      a(bus.I, gpb::new);
      a(bus.J, gpc::new);
      a(bus.K, grx::new);
      a(bus.L, gpd::new);
      a(bus.M, gpg::new);
      a(bus.N, gph::new);
      a(bus.O, gpf::new);
      a(bus.P, grx::new);
      a(bus.Q, gpe::new);
      a(bus.R, gpn::new);
      a(bus.S, gpm::new);
      a(bus.T, grx::new);
      a(bus.U, gpo::new);
      a(bus.V, $$0 -> new grx<>($$0, 1.0F, true));
      a(bus.W, gpp::new);
      a(bus.X, $$0 -> new grx<>($$0, 3.0F, true));
      a(bus.Y, gpq::new);
      a(bus.bP, gpr::new);
      a(bus.Z, gps::new);
      a(bus.aa, gpt::new);
      a(bus.ab, $$0 -> new gqp($$0, gck.aM));
      a(bus.ac, gpu::new);
      a(bus.ad, $$0 -> new gpv($$0, 6.0F));
      a(bus.ae, gqh::new);
      a(bus.af, $$0 -> new gpw($$0, new gbm($$0.a(gck.aR)), new gbm($$0.a(gck.aS))));
      a(bus.ag, gpx::new);
      a(bus.ah, gpy::new);
      a(bus.ai, gpz::new);
      a(bus.aj, $$0 -> new gqp($$0, gck.aY));
      a(bus.ak, gqa::new);
      a(bus.al, gqc::new);
      a(bus.am, gqe::new);
      a(bus.an, gqs::new);
      a(bus.ao, gqf::new);
      a(bus.ap, gqg::new);
      a(bus.aq, goy.b::new);
      a(bus.ar, gqh::new);
      a(bus.aI, gqu::new);
      a(bus.au, gqj::new);
      a(bus.av, gqk::new);
      a(bus.aw, $$0 -> new gqm($$0, gck.bo, gck.bp));
      a(bus.ax, gqn::new);
      a(bus.ay, gqo::new);
      a(bus.aB, gqs::new);
      a(bus.aC, $$0 -> new gqp($$0, gck.bw));
      a(bus.aD, gqr::new);
      a(bus.aE, $$0 -> new gpa<>($$0, 0.92F, gck.bz, gck.bA, true));
      a(bus.aH, gqt::new);
      a(bus.aJ, gqv::new);
      a(bus.aK, gqw::new);
      a(bus.aL, gqx::new);
      a(bus.aM, gqy::new);
      a(bus.aN, gqz::new);
      a(bus.aO, $$0 -> new gra($$0, gck.bK, gck.bL, gck.bS, gck.bT, gck.bM, gck.bN));
      a(bus.aP, $$0 -> new gra($$0, gck.bO, gck.bO, gck.bP, gck.bQ, gck.bP, gck.bQ));
      a(bus.aQ, grb::new);
      a(bus.aR, grc::new);
      a(bus.aS, grx::new);
      a(bus.aT, grd::new);
      a(bus.aU, gre::new);
      a(bus.aV, grg::new);
      a(bus.aW, gri::new);
      a(bus.aX, grj::new);
      a(bus.aY, grl::new);
      a(bus.aZ, grk::new);
      a(bus.ba, grm::new);
      a(bus.bb, grn::new);
      a(bus.bc, $$0 -> new gse($$0, gck.cD, gck.cE, true));
      a(bus.bd, gro::new);
      a(bus.be, $$0 -> new grx<>($$0, 0.75F, true));
      a(bus.bf, grp::new);
      a(bus.bg, grx::new);
      a(bus.bh, grq::new);
      a(bus.bi, $$0 -> new gqp($$0, gck.cN));
      a(bus.bj, grr::new);
      a(bus.bk, grs::new);
      a(bus.bn, $$0 -> new grt<>($$0, new gbm($$0.a(gck.cR)), new gbm($$0.a(gck.cS))));
      a(bus.bo, gru::new);
      a(bus.bp, grv::new);
      a(bus.bq, grw::new);
      a(bus.br, goy.c::new);
      a(bus.bs, gsb::new);
      a(bus.bt, gsa::new);
      a(bus.bu, $$0 -> new gqm($$0, gck.db, gck.dc));
      a(bus.bv, gry::new);
      a(bus.bw, gsc::new);
      a(bus.bx, gsd::new);
      a(bus.by, gsf::new);
      a(bus.bz, gsg::new);
      a(bus.bA, gsh::new);
      a(bus.bC, gsj::new);
      a(bus.bB, gsi::new);
      a(bus.bD, gsk::new);
      a(bus.bE, gsl::new);
      a(bus.bF, gsm::new);
      a(bus.bG, gsn::new);
      a(bus.bH, gso::new);
      a(bus.bI, gsp::new);
      a(bus.bJ, gsq::new);
      a(bus.bK, gsr::new);
      a(bus.bL, $$0 -> new gse($$0, gck.dJ, gck.dK, false));
      a(bus.bM, gss::new);
      a(bus.bN, $$0 -> new gst($$0, gck.dT, gck.dU, gck.dX, gck.dY, gck.dV, gck.dW));
   }
}
