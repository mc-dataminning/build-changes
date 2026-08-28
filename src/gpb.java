import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gpb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bup<?>, gpa<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gzu.a, gpa<ghq>> c = Map.of(gzu.a.b, $$0 -> new gug($$0, false), gzu.a.a, $$0 -> new gug($$0, true));

   private static <T extends bui> void a(bup<? extends T> $$0, gpa<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bup<?>, goz<?, ?>> a(gpa.a $$0) {
      Builder<bup<?>, goz<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lz.f.b((bup<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gzu.a, goz<? extends cor, ?>> b(gpa.a $$0) {
      Builder<gzu.a, goz<? extends cor, ?>> $$1 = ImmutableMap.builder();
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

      for (bup<?> $$1 : lz.f) {
         if ($$1 != bup.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lz.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bup.a, gnw::new);
      a(bup.b, gqi::new);
      a(bup.c, gnx::new);
      a(bup.d, gny::new);
      a(bup.e, gro::new);
      a(bup.f, goa::new);
      a(bup.g, gob::new);
      a(bup.h, goc::new);
      a(bup.i, god::new);
      a(bup.j, goo.a::new);
      a(bup.k, $$0 -> new goe($$0, false));
      a(bup.l, gof::new);
      a(bup.m, gog::new);
      a(bup.n, grz::new);
      a(bup.p, goi::new);
      a(bup.o, goh::new);
      a(bup.q, goj::new);
      a(bup.r, $$0 -> new goe($$0, true));
      a(bup.s, $$0 -> new gqf($$0, gcb.L));
      a(bup.t, gok::new);
      a(bup.u, gol::new);
      a(bup.v, $$0 -> new gqf($$0, gcb.P));
      a(bup.w, gom::new);
      a(bup.x, gon::new);
      a(bup.y, gop::new);
      a(bup.z, $$0 -> new goq<>($$0, 0.87F, gcb.ad, gcb.ae, false));
      a(bup.A, gor::new);
      a(bup.B, gos::new);
      a(bup.C, grm::new);
      a(bup.D, got::new);
      a(bup.H, gow::new);
      a(bup.I, gox::new);
      a(bup.F, gov::new);
      a(bup.G, grm::new);
      a(bup.E, gou::new);
      a(bup.J, gpd::new);
      a(bup.K, gpc::new);
      a(bup.L, grm::new);
      a(bup.M, gpe::new);
      a(bup.N, $$0 -> new grm<>($$0, 1.0F, true));
      a(bup.O, gpf::new);
      a(bup.ak, $$0 -> new grm<>($$0, 3.0F, true));
      a(bup.P, gpg::new);
      a(bup.bz, gph::new);
      a(bup.Q, gpi::new);
      a(bup.R, gpj::new);
      a(bup.S, $$0 -> new gqf($$0, gcb.aC));
      a(bup.T, gpk::new);
      a(bup.U, $$0 -> new gpl($$0, 6.0F));
      a(bup.V, gpx::new);
      a(bup.W, $$0 -> new gpm($$0, new gbd($$0.a(gcb.aH)), new gbd($$0.a(gcb.aI))));
      a(bup.X, gpn::new);
      a(bup.Y, gpo::new);
      a(bup.Z, gpp::new);
      a(bup.aa, $$0 -> new gqf($$0, gcb.aO));
      a(bup.ab, gpq::new);
      a(bup.ac, gps::new);
      a(bup.ad, gpu::new);
      a(bup.ae, gqi::new);
      a(bup.af, gpv::new);
      a(bup.ag, gpw::new);
      a(bup.ah, goo.b::new);
      a(bup.ai, gpx::new);
      a(bup.aj, gqk::new);
      a(bup.al, gpz::new);
      a(bup.am, gqa::new);
      a(bup.an, $$0 -> new gqc($$0, gcb.bc, gcb.bd));
      a(bup.ao, gqd::new);
      a(bup.ap, gqe::new);
      a(bup.aq, gqi::new);
      a(bup.ar, $$0 -> new gqf($$0, gcb.bi));
      a(bup.as, gqh::new);
      a(bup.at, $$0 -> new goq<>($$0, 0.92F, gcb.bl, gcb.bm, true));
      a(bup.au, gqj::new);
      a(bup.av, gql::new);
      a(bup.aw, gqm::new);
      a(bup.ax, gqn::new);
      a(bup.ay, gqo::new);
      a(bup.az, gqp::new);
      a(bup.aA, $$0 -> new gqq($$0, gcb.bx, gcb.bE, gcb.bC, gcb.bD, gcb.bF, gcb.bG));
      a(bup.aB, $$0 -> new gqq($$0, gcb.by, gcb.by, gcb.bz, gcb.bA, gcb.bz, gcb.bA));
      a(bup.aC, gqr::new);
      a(bup.aD, gqs::new);
      a(bup.aE, grm::new);
      a(bup.aF, gqt::new);
      a(bup.aG, gqu::new);
      a(bup.aH, gqv::new);
      a(bup.aI, gqx::new);
      a(bup.aJ, gqy::new);
      a(bup.aK, gra::new);
      a(bup.aL, gqz::new);
      a(bup.aM, grb::new);
      a(bup.aN, grc::new);
      a(bup.aO, $$0 -> new grt($$0, gcb.cn, gcb.co, true));
      a(bup.aP, grd::new);
      a(bup.aQ, $$0 -> new grm<>($$0, 0.75F, true));
      a(bup.aR, gre::new);
      a(bup.aT, grm::new);
      a(bup.aS, grf::new);
      a(bup.aU, $$0 -> new gqf($$0, gcb.cx));
      a(bup.aV, grg::new);
      a(bup.aW, grh::new);
      a(bup.aX, $$0 -> new gri<>($$0, new gbd($$0.a(gcb.cz)), new gbd($$0.a(gcb.cA))));
      a(bup.aY, grj::new);
      a(bup.aZ, grk::new);
      a(bup.ba, grl::new);
      a(bup.bb, goo.c::new);
      a(bup.bc, grq::new);
      a(bup.bd, grp::new);
      a(bup.be, $$0 -> new gqc($$0, gcb.cJ, gcb.cK));
      a(bup.bf, grn::new);
      a(bup.bg, grr::new);
      a(bup.bh, grs::new);
      a(bup.bi, gru::new);
      a(bup.bj, grv::new);
      a(bup.bk, grw::new);
      a(bup.bm, gry::new);
      a(bup.bl, grx::new);
      a(bup.bn, grz::new);
      a(bup.bo, gsa::new);
      a(bup.bp, gsb::new);
      a(bup.bq, gsc::new);
      a(bup.br, gsd::new);
      a(bup.bs, gse::new);
      a(bup.bt, gsf::new);
      a(bup.bu, gsg::new);
      a(bup.bv, $$0 -> new grt($$0, gcb.do, gcb.dp, false));
      a(bup.bw, gsh::new);
      a(bup.bx, $$0 -> new gsi($$0, gcb.dB, gcb.dE, gcb.dC, gcb.dD, gcb.dF, gcb.dG));
   }
}
