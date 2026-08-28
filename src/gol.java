import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gol {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bul<?>, gok<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gze.a, gok<gha>> c = Map.of(gze.a.b, $$0 -> new gtq($$0, false), gze.a.a, $$0 -> new gtq($$0, true));

   private static <T extends bue> void a(bul<? extends T> $$0, gok<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bul<?>, goj<?, ?>> a(gok.a $$0) {
      Builder<bul<?>, goj<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ly.f.b((bul<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gze.a, goj<? extends com, ?>> b(gok.a $$0) {
      Builder<gze.a, goj<? extends com, ?>> $$1 = ImmutableMap.builder();
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

      for (bul<?> $$1 : ly.f) {
         if ($$1 != bul.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ly.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bul.a, gng::new);
      a(bul.b, gps::new);
      a(bul.c, gnh::new);
      a(bul.d, gni::new);
      a(bul.e, gqy::new);
      a(bul.f, gnk::new);
      a(bul.g, gnl::new);
      a(bul.h, gnm::new);
      a(bul.i, gnn::new);
      a(bul.j, gny.a::new);
      a(bul.k, $$0 -> new gno($$0, false));
      a(bul.l, gnp::new);
      a(bul.m, gnq::new);
      a(bul.n, grj::new);
      a(bul.p, gns::new);
      a(bul.o, gnr::new);
      a(bul.q, gnt::new);
      a(bul.r, $$0 -> new gno($$0, true));
      a(bul.s, $$0 -> new gpp($$0, gbl.L));
      a(bul.t, gnu::new);
      a(bul.u, gnv::new);
      a(bul.v, $$0 -> new gpp($$0, gbl.P));
      a(bul.w, gnw::new);
      a(bul.x, gnx::new);
      a(bul.y, gnz::new);
      a(bul.z, $$0 -> new goa<>($$0, 0.87F, gbl.ad, gbl.ae, false));
      a(bul.A, gob::new);
      a(bul.B, goc::new);
      a(bul.C, gqw::new);
      a(bul.D, god::new);
      a(bul.H, gog::new);
      a(bul.I, goh::new);
      a(bul.F, gof::new);
      a(bul.G, gqw::new);
      a(bul.E, goe::new);
      a(bul.J, gon::new);
      a(bul.K, gom::new);
      a(bul.L, gqw::new);
      a(bul.M, goo::new);
      a(bul.N, $$0 -> new gqw<>($$0, 1.0F, true));
      a(bul.O, gop::new);
      a(bul.ak, $$0 -> new gqw<>($$0, 3.0F, true));
      a(bul.P, goq::new);
      a(bul.bz, gor::new);
      a(bul.Q, gos::new);
      a(bul.R, got::new);
      a(bul.S, $$0 -> new gpp($$0, gbl.aC));
      a(bul.T, gou::new);
      a(bul.U, $$0 -> new gov($$0, 6.0F));
      a(bul.V, gph::new);
      a(bul.W, $$0 -> new gow($$0, new gan($$0.a(gbl.aH)), new gan($$0.a(gbl.aI))));
      a(bul.X, gox::new);
      a(bul.Y, goy::new);
      a(bul.Z, goz::new);
      a(bul.aa, $$0 -> new gpp($$0, gbl.aO));
      a(bul.ab, gpa::new);
      a(bul.ac, gpc::new);
      a(bul.ad, gpe::new);
      a(bul.ae, gps::new);
      a(bul.af, gpf::new);
      a(bul.ag, gpg::new);
      a(bul.ah, gny.b::new);
      a(bul.ai, gph::new);
      a(bul.aj, gpu::new);
      a(bul.al, gpj::new);
      a(bul.am, gpk::new);
      a(bul.an, $$0 -> new gpm($$0, gbl.bc, gbl.bd));
      a(bul.ao, gpn::new);
      a(bul.ap, gpo::new);
      a(bul.aq, gps::new);
      a(bul.ar, $$0 -> new gpp($$0, gbl.bi));
      a(bul.as, gpr::new);
      a(bul.at, $$0 -> new goa<>($$0, 0.92F, gbl.bl, gbl.bm, true));
      a(bul.au, gpt::new);
      a(bul.av, gpv::new);
      a(bul.aw, gpw::new);
      a(bul.ax, gpx::new);
      a(bul.ay, gpy::new);
      a(bul.az, gpz::new);
      a(bul.aA, $$0 -> new gqa($$0, gbl.bx, gbl.bE, gbl.bC, gbl.bD, gbl.bF, gbl.bG));
      a(bul.aB, $$0 -> new gqa($$0, gbl.by, gbl.by, gbl.bz, gbl.bA, gbl.bz, gbl.bA));
      a(bul.aC, gqb::new);
      a(bul.aD, gqc::new);
      a(bul.aE, gqw::new);
      a(bul.aF, gqd::new);
      a(bul.aG, gqe::new);
      a(bul.aH, gqf::new);
      a(bul.aI, gqh::new);
      a(bul.aJ, gqi::new);
      a(bul.aK, gqk::new);
      a(bul.aL, gqj::new);
      a(bul.aM, gql::new);
      a(bul.aN, gqm::new);
      a(bul.aO, $$0 -> new grd($$0, gbl.cn, gbl.co, true));
      a(bul.aP, gqn::new);
      a(bul.aQ, $$0 -> new gqw<>($$0, 0.75F, true));
      a(bul.aR, gqo::new);
      a(bul.aT, gqw::new);
      a(bul.aS, gqp::new);
      a(bul.aU, $$0 -> new gpp($$0, gbl.cx));
      a(bul.aV, gqq::new);
      a(bul.aW, gqr::new);
      a(bul.aX, $$0 -> new gqs<>($$0, new gan($$0.a(gbl.cz)), new gan($$0.a(gbl.cA))));
      a(bul.aY, gqt::new);
      a(bul.aZ, gqu::new);
      a(bul.ba, gqv::new);
      a(bul.bb, gny.c::new);
      a(bul.bc, gra::new);
      a(bul.bd, gqz::new);
      a(bul.be, $$0 -> new gpm($$0, gbl.cJ, gbl.cK));
      a(bul.bf, gqx::new);
      a(bul.bg, grb::new);
      a(bul.bh, grc::new);
      a(bul.bi, gre::new);
      a(bul.bj, grf::new);
      a(bul.bk, grg::new);
      a(bul.bm, gri::new);
      a(bul.bl, grh::new);
      a(bul.bn, grj::new);
      a(bul.bo, grk::new);
      a(bul.bp, grl::new);
      a(bul.bq, grm::new);
      a(bul.br, grn::new);
      a(bul.bs, gro::new);
      a(bul.bt, grp::new);
      a(bul.bu, grq::new);
      a(bul.bv, $$0 -> new grd($$0, gbl.do, gbl.dp, false));
      a(bul.bw, grr::new);
      a(bul.bx, $$0 -> new grs($$0, gbl.dB, gbl.dE, gbl.dC, gbl.dD, gbl.dF, gbl.dG));
   }
}
