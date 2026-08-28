import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gnp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bty<?>, gno<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gyh.a, gno<gge>> c = Map.of(gyh.a.b, $$0 -> new gst($$0, false), gyh.a.a, $$0 -> new gst($$0, true));

   private static <T extends btr> void a(bty<? extends T> $$0, gno<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bty<?>, gnn<?, ?>> a(gno.a $$0) {
      Builder<bty<?>, gnn<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lv.f.b((bty<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gyh.a, gnn<? extends cnx, ?>> b(gno.a $$0) {
      Builder<gyh.a, gnn<? extends cnx, ?>> $$1 = ImmutableMap.builder();
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

      for (bty<?> $$1 : lv.f) {
         if ($$1 != bty.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lv.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bty.a, gmk::new);
      a(bty.b, gow::new);
      a(bty.c, gml::new);
      a(bty.d, gmm::new);
      a(bty.e, gqc::new);
      a(bty.f, gmo::new);
      a(bty.g, gmp::new);
      a(bty.h, gmq::new);
      a(bty.i, gmr::new);
      a(bty.j, gnc.a::new);
      a(bty.k, $$0 -> new gms($$0, false));
      a(bty.l, gmt::new);
      a(bty.m, gmu::new);
      a(bty.n, gqn::new);
      a(bty.p, gmw::new);
      a(bty.o, gmv::new);
      a(bty.q, gmx::new);
      a(bty.r, $$0 -> new gms($$0, true));
      a(bty.s, $$0 -> new got($$0, gap.L));
      a(bty.t, gmy::new);
      a(bty.u, gmz::new);
      a(bty.v, $$0 -> new got($$0, gap.P));
      a(bty.w, gna::new);
      a(bty.x, gnb::new);
      a(bty.y, gnd::new);
      a(bty.z, $$0 -> new gne<>($$0, 0.87F, gap.ad, gap.ae, false));
      a(bty.A, gnf::new);
      a(bty.B, gng::new);
      a(bty.C, gqa::new);
      a(bty.D, gnh::new);
      a(bty.H, gnk::new);
      a(bty.I, gnl::new);
      a(bty.F, gnj::new);
      a(bty.G, gqa::new);
      a(bty.E, gni::new);
      a(bty.J, gnr::new);
      a(bty.K, gnq::new);
      a(bty.L, gqa::new);
      a(bty.M, gns::new);
      a(bty.N, $$0 -> new gqa<>($$0, 1.0F, true));
      a(bty.O, gnt::new);
      a(bty.ak, $$0 -> new gqa<>($$0, 3.0F, true));
      a(bty.P, gnu::new);
      a(bty.bz, gnv::new);
      a(bty.Q, gnw::new);
      a(bty.R, gnx::new);
      a(bty.S, $$0 -> new got($$0, gap.aC));
      a(bty.T, gny::new);
      a(bty.U, $$0 -> new gnz($$0, 6.0F));
      a(bty.V, gol::new);
      a(bty.W, $$0 -> new goa($$0, new fzr($$0.a(gap.aH)), new fzr($$0.a(gap.aI))));
      a(bty.X, gob::new);
      a(bty.Y, goc::new);
      a(bty.Z, god::new);
      a(bty.aa, $$0 -> new got($$0, gap.aO));
      a(bty.ab, goe::new);
      a(bty.ac, gog::new);
      a(bty.ad, goi::new);
      a(bty.ae, gow::new);
      a(bty.af, goj::new);
      a(bty.ag, gok::new);
      a(bty.ah, gnc.b::new);
      a(bty.ai, gol::new);
      a(bty.aj, goy::new);
      a(bty.al, gon::new);
      a(bty.am, goo::new);
      a(bty.an, $$0 -> new goq($$0, gap.bc, gap.bd));
      a(bty.ao, gor::new);
      a(bty.ap, gos::new);
      a(bty.aq, gow::new);
      a(bty.ar, $$0 -> new got($$0, gap.bi));
      a(bty.as, gov::new);
      a(bty.at, $$0 -> new gne<>($$0, 0.92F, gap.bl, gap.bm, true));
      a(bty.au, gox::new);
      a(bty.av, goz::new);
      a(bty.aw, gpa::new);
      a(bty.ax, gpb::new);
      a(bty.ay, gpc::new);
      a(bty.az, gpd::new);
      a(bty.aA, $$0 -> new gpe($$0, gap.bx, gap.bE, gap.bC, gap.bD, gap.bF, gap.bG));
      a(bty.aB, $$0 -> new gpe($$0, gap.by, gap.by, gap.bz, gap.bA, gap.bz, gap.bA));
      a(bty.aC, gpf::new);
      a(bty.aD, gpg::new);
      a(bty.aE, gqa::new);
      a(bty.aF, gph::new);
      a(bty.aG, gpi::new);
      a(bty.aH, gpj::new);
      a(bty.aI, gpl::new);
      a(bty.aJ, gpm::new);
      a(bty.aK, gpo::new);
      a(bty.aL, gpn::new);
      a(bty.aM, gpp::new);
      a(bty.aN, gpq::new);
      a(bty.aO, $$0 -> new gqh($$0, gap.cn, gap.co, true));
      a(bty.aP, gpr::new);
      a(bty.aQ, $$0 -> new gqa<>($$0, 0.75F, true));
      a(bty.aR, gps::new);
      a(bty.aT, gqa::new);
      a(bty.aS, gpt::new);
      a(bty.aU, $$0 -> new got($$0, gap.cx));
      a(bty.aV, gpu::new);
      a(bty.aW, gpv::new);
      a(bty.aX, $$0 -> new gpw<>($$0, new fzr($$0.a(gap.cz)), new fzr($$0.a(gap.cA))));
      a(bty.aY, gpx::new);
      a(bty.aZ, gpy::new);
      a(bty.ba, gpz::new);
      a(bty.bb, gnc.c::new);
      a(bty.bc, gqe::new);
      a(bty.bd, gqd::new);
      a(bty.be, $$0 -> new goq($$0, gap.cJ, gap.cK));
      a(bty.bf, gqb::new);
      a(bty.bg, gqf::new);
      a(bty.bh, gqg::new);
      a(bty.bi, gqi::new);
      a(bty.bj, gqj::new);
      a(bty.bk, gqk::new);
      a(bty.bm, gqm::new);
      a(bty.bl, gql::new);
      a(bty.bn, gqn::new);
      a(bty.bo, gqo::new);
      a(bty.bp, gqp::new);
      a(bty.bq, gqq::new);
      a(bty.br, gqr::new);
      a(bty.bs, gqs::new);
      a(bty.bt, gqt::new);
      a(bty.bu, gqu::new);
      a(bty.bv, $$0 -> new gqh($$0, gap.do, gap.dp, false));
      a(bty.bw, gqv::new);
      a(bty.bx, $$0 -> new gqw($$0, gap.dB, gap.dE, gap.dC, gap.dD, gap.dF, gap.dG));
   }
}
