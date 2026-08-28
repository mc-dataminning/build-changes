import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gnk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btv<?>, gnj<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gyc.a, gnj<gfz>> c = Map.of(gyc.a.b, $$0 -> new gso($$0, false), gyc.a.a, $$0 -> new gso($$0, true));

   private static <T extends bto> void a(btv<? extends T> $$0, gnj<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<btv<?>, gni<?, ?>> a(gnj.a $$0) {
      Builder<btv<?>, gni<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lu.f.b((btv<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gyc.a, gni<? extends cnu, ?>> b(gnj.a $$0) {
      Builder<gyc.a, gni<? extends cnu, ?>> $$1 = ImmutableMap.builder();
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

      for (btv<?> $$1 : lu.f) {
         if ($$1 != btv.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lu.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(btv.a, gmf::new);
      a(btv.b, gor::new);
      a(btv.c, gmg::new);
      a(btv.d, gmh::new);
      a(btv.e, gpx::new);
      a(btv.f, gmj::new);
      a(btv.g, gmk::new);
      a(btv.h, gml::new);
      a(btv.i, gmm::new);
      a(btv.j, gmx.a::new);
      a(btv.k, $$0 -> new gmn($$0, false));
      a(btv.l, gmo::new);
      a(btv.m, gmp::new);
      a(btv.n, gqi::new);
      a(btv.p, gmr::new);
      a(btv.o, gmq::new);
      a(btv.q, gms::new);
      a(btv.r, $$0 -> new gmn($$0, true));
      a(btv.s, $$0 -> new goo($$0, gak.L));
      a(btv.t, gmt::new);
      a(btv.u, gmu::new);
      a(btv.v, $$0 -> new goo($$0, gak.P));
      a(btv.w, gmv::new);
      a(btv.x, gmw::new);
      a(btv.y, gmy::new);
      a(btv.z, $$0 -> new gmz<>($$0, 0.87F, gak.ad, gak.ae, false));
      a(btv.A, gna::new);
      a(btv.B, gnb::new);
      a(btv.C, gpv::new);
      a(btv.D, gnc::new);
      a(btv.H, gnf::new);
      a(btv.I, gng::new);
      a(btv.F, gne::new);
      a(btv.G, gpv::new);
      a(btv.E, gnd::new);
      a(btv.J, gnm::new);
      a(btv.K, gnl::new);
      a(btv.L, gpv::new);
      a(btv.M, gnn::new);
      a(btv.N, $$0 -> new gpv<>($$0, 1.0F, true));
      a(btv.O, gno::new);
      a(btv.ak, $$0 -> new gpv<>($$0, 3.0F, true));
      a(btv.P, gnp::new);
      a(btv.bz, gnq::new);
      a(btv.Q, gnr::new);
      a(btv.R, gns::new);
      a(btv.S, $$0 -> new goo($$0, gak.aC));
      a(btv.T, gnt::new);
      a(btv.U, $$0 -> new gnu($$0, 6.0F));
      a(btv.V, gog::new);
      a(btv.W, $$0 -> new gnv($$0, new fzm($$0.a(gak.aH)), new fzm($$0.a(gak.aI))));
      a(btv.X, gnw::new);
      a(btv.Y, gnx::new);
      a(btv.Z, gny::new);
      a(btv.aa, $$0 -> new goo($$0, gak.aO));
      a(btv.ab, gnz::new);
      a(btv.ac, gob::new);
      a(btv.ad, god::new);
      a(btv.ae, gor::new);
      a(btv.af, goe::new);
      a(btv.ag, gof::new);
      a(btv.ah, gmx.b::new);
      a(btv.ai, gog::new);
      a(btv.aj, got::new);
      a(btv.al, goi::new);
      a(btv.am, goj::new);
      a(btv.an, $$0 -> new gol($$0, gak.bc, gak.bd));
      a(btv.ao, gom::new);
      a(btv.ap, gon::new);
      a(btv.aq, gor::new);
      a(btv.ar, $$0 -> new goo($$0, gak.bi));
      a(btv.as, goq::new);
      a(btv.at, $$0 -> new gmz<>($$0, 0.92F, gak.bl, gak.bm, true));
      a(btv.au, gos::new);
      a(btv.av, gou::new);
      a(btv.aw, gov::new);
      a(btv.ax, gow::new);
      a(btv.ay, gox::new);
      a(btv.az, goy::new);
      a(btv.aA, $$0 -> new goz($$0, gak.bx, gak.bE, gak.bC, gak.bD, gak.bF, gak.bG));
      a(btv.aB, $$0 -> new goz($$0, gak.by, gak.by, gak.bz, gak.bA, gak.bz, gak.bA));
      a(btv.aC, gpa::new);
      a(btv.aD, gpb::new);
      a(btv.aE, gpv::new);
      a(btv.aF, gpc::new);
      a(btv.aG, gpd::new);
      a(btv.aH, gpe::new);
      a(btv.aI, gpg::new);
      a(btv.aJ, gph::new);
      a(btv.aK, gpj::new);
      a(btv.aL, gpi::new);
      a(btv.aM, gpk::new);
      a(btv.aN, gpl::new);
      a(btv.aO, $$0 -> new gqc($$0, gak.cn, gak.co, true));
      a(btv.aP, gpm::new);
      a(btv.aQ, $$0 -> new gpv<>($$0, 0.75F, true));
      a(btv.aR, gpn::new);
      a(btv.aT, gpv::new);
      a(btv.aS, gpo::new);
      a(btv.aU, $$0 -> new goo($$0, gak.cx));
      a(btv.aV, gpp::new);
      a(btv.aW, gpq::new);
      a(btv.aX, $$0 -> new gpr<>($$0, new fzm($$0.a(gak.cz)), new fzm($$0.a(gak.cA))));
      a(btv.aY, gps::new);
      a(btv.aZ, gpt::new);
      a(btv.ba, gpu::new);
      a(btv.bb, gmx.c::new);
      a(btv.bc, gpz::new);
      a(btv.bd, gpy::new);
      a(btv.be, $$0 -> new gol($$0, gak.cJ, gak.cK));
      a(btv.bf, gpw::new);
      a(btv.bg, gqa::new);
      a(btv.bh, gqb::new);
      a(btv.bi, gqd::new);
      a(btv.bj, gqe::new);
      a(btv.bk, gqf::new);
      a(btv.bm, gqh::new);
      a(btv.bl, gqg::new);
      a(btv.bn, gqi::new);
      a(btv.bo, gqj::new);
      a(btv.bp, gqk::new);
      a(btv.bq, gql::new);
      a(btv.br, gqm::new);
      a(btv.bs, gqn::new);
      a(btv.bt, gqo::new);
      a(btv.bu, gqp::new);
      a(btv.bv, $$0 -> new gqc($$0, gak.do, gak.dp, false));
      a(btv.bw, gqq::new);
      a(btv.bx, $$0 -> new gqr($$0, gak.dB, gak.dE, gak.dC, gak.dD, gak.dF, gak.dG));
   }
}
