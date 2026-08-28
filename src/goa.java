import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class goa {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bug<?>, gnz<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gyt.a, gnz<ggp>> c = Map.of(gyt.a.b, $$0 -> new gtf($$0, false), gyt.a.a, $$0 -> new gtf($$0, true));

   private static <T extends btz> void a(bug<? extends T> $$0, gnz<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bug<?>, gny<?, ?>> a(gnz.a $$0) {
      Builder<bug<?>, gny<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lx.f.b((bug<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gyt.a, gny<? extends coh, ?>> b(gnz.a $$0) {
      Builder<gyt.a, gny<? extends coh, ?>> $$1 = ImmutableMap.builder();
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

      for (bug<?> $$1 : lx.f) {
         if ($$1 != bug.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lx.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bug.a, gmv::new);
      a(bug.b, gph::new);
      a(bug.c, gmw::new);
      a(bug.d, gmx::new);
      a(bug.e, gqn::new);
      a(bug.f, gmz::new);
      a(bug.g, gna::new);
      a(bug.h, gnb::new);
      a(bug.i, gnc::new);
      a(bug.j, gnn.a::new);
      a(bug.k, $$0 -> new gnd($$0, false));
      a(bug.l, gne::new);
      a(bug.m, gnf::new);
      a(bug.n, gqy::new);
      a(bug.p, gnh::new);
      a(bug.o, gng::new);
      a(bug.q, gni::new);
      a(bug.r, $$0 -> new gnd($$0, true));
      a(bug.s, $$0 -> new gpe($$0, gba.L));
      a(bug.t, gnj::new);
      a(bug.u, gnk::new);
      a(bug.v, $$0 -> new gpe($$0, gba.P));
      a(bug.w, gnl::new);
      a(bug.x, gnm::new);
      a(bug.y, gno::new);
      a(bug.z, $$0 -> new gnp<>($$0, 0.87F, gba.ad, gba.ae, false));
      a(bug.A, gnq::new);
      a(bug.B, gnr::new);
      a(bug.C, gql::new);
      a(bug.D, gns::new);
      a(bug.H, gnv::new);
      a(bug.I, gnw::new);
      a(bug.F, gnu::new);
      a(bug.G, gql::new);
      a(bug.E, gnt::new);
      a(bug.J, goc::new);
      a(bug.K, gob::new);
      a(bug.L, gql::new);
      a(bug.M, god::new);
      a(bug.N, $$0 -> new gql<>($$0, 1.0F, true));
      a(bug.O, goe::new);
      a(bug.ak, $$0 -> new gql<>($$0, 3.0F, true));
      a(bug.P, gof::new);
      a(bug.bz, gog::new);
      a(bug.Q, goh::new);
      a(bug.R, goi::new);
      a(bug.S, $$0 -> new gpe($$0, gba.aC));
      a(bug.T, goj::new);
      a(bug.U, $$0 -> new gok($$0, 6.0F));
      a(bug.V, gow::new);
      a(bug.W, $$0 -> new gol($$0, new gac($$0.a(gba.aH)), new gac($$0.a(gba.aI))));
      a(bug.X, gom::new);
      a(bug.Y, gon::new);
      a(bug.Z, goo::new);
      a(bug.aa, $$0 -> new gpe($$0, gba.aO));
      a(bug.ab, gop::new);
      a(bug.ac, gor::new);
      a(bug.ad, got::new);
      a(bug.ae, gph::new);
      a(bug.af, gou::new);
      a(bug.ag, gov::new);
      a(bug.ah, gnn.b::new);
      a(bug.ai, gow::new);
      a(bug.aj, gpj::new);
      a(bug.al, goy::new);
      a(bug.am, goz::new);
      a(bug.an, $$0 -> new gpb($$0, gba.bc, gba.bd));
      a(bug.ao, gpc::new);
      a(bug.ap, gpd::new);
      a(bug.aq, gph::new);
      a(bug.ar, $$0 -> new gpe($$0, gba.bi));
      a(bug.as, gpg::new);
      a(bug.at, $$0 -> new gnp<>($$0, 0.92F, gba.bl, gba.bm, true));
      a(bug.au, gpi::new);
      a(bug.av, gpk::new);
      a(bug.aw, gpl::new);
      a(bug.ax, gpm::new);
      a(bug.ay, gpn::new);
      a(bug.az, gpo::new);
      a(bug.aA, $$0 -> new gpp($$0, gba.bx, gba.bE, gba.bC, gba.bD, gba.bF, gba.bG));
      a(bug.aB, $$0 -> new gpp($$0, gba.by, gba.by, gba.bz, gba.bA, gba.bz, gba.bA));
      a(bug.aC, gpq::new);
      a(bug.aD, gpr::new);
      a(bug.aE, gql::new);
      a(bug.aF, gps::new);
      a(bug.aG, gpt::new);
      a(bug.aH, gpu::new);
      a(bug.aI, gpw::new);
      a(bug.aJ, gpx::new);
      a(bug.aK, gpz::new);
      a(bug.aL, gpy::new);
      a(bug.aM, gqa::new);
      a(bug.aN, gqb::new);
      a(bug.aO, $$0 -> new gqs($$0, gba.cn, gba.co, true));
      a(bug.aP, gqc::new);
      a(bug.aQ, $$0 -> new gql<>($$0, 0.75F, true));
      a(bug.aR, gqd::new);
      a(bug.aT, gql::new);
      a(bug.aS, gqe::new);
      a(bug.aU, $$0 -> new gpe($$0, gba.cx));
      a(bug.aV, gqf::new);
      a(bug.aW, gqg::new);
      a(bug.aX, $$0 -> new gqh<>($$0, new gac($$0.a(gba.cz)), new gac($$0.a(gba.cA))));
      a(bug.aY, gqi::new);
      a(bug.aZ, gqj::new);
      a(bug.ba, gqk::new);
      a(bug.bb, gnn.c::new);
      a(bug.bc, gqp::new);
      a(bug.bd, gqo::new);
      a(bug.be, $$0 -> new gpb($$0, gba.cJ, gba.cK));
      a(bug.bf, gqm::new);
      a(bug.bg, gqq::new);
      a(bug.bh, gqr::new);
      a(bug.bi, gqt::new);
      a(bug.bj, gqu::new);
      a(bug.bk, gqv::new);
      a(bug.bm, gqx::new);
      a(bug.bl, gqw::new);
      a(bug.bn, gqy::new);
      a(bug.bo, gqz::new);
      a(bug.bp, gra::new);
      a(bug.bq, grb::new);
      a(bug.br, grc::new);
      a(bug.bs, grd::new);
      a(bug.bt, gre::new);
      a(bug.bu, grf::new);
      a(bug.bv, $$0 -> new gqs($$0, gba.do, gba.dp, false));
      a(bug.bw, grg::new);
      a(bug.bx, $$0 -> new grh($$0, gba.dB, gba.dE, gba.dC, gba.dD, gba.dF, gba.dG));
   }
}
