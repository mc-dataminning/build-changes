import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ggo {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqr<?>, ggn<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gnn.a, ggn<gad>> c = Map.of(gnn.a.b, $$0 -> new glr($$0, false), gnn.a.a, $$0 -> new glr($$0, true));

   private static <T extends bql> void a(bqr<? extends T> $$0, ggn<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bqr<?>, ggm<?>> a(ggn.a $$0) {
      Builder<bqr<?>, ggm<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + lc.g.b((bqr<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gnn.a, ggm<? extends ckl>> b(ggn.a $$0) {
      Builder<gnn.a, ggm<? extends ckl>> $$1 = ImmutableMap.builder();
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

      for (bqr<?> $$1 : lc.g) {
         if ($$1 != bqr.bx && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", lc.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bqr.a, gfj::new);
      a(bqr.b, ghv::new);
      a(bqr.c, gfk::new);
      a(bqr.d, gfl::new);
      a(bqr.e, gja::new);
      a(bqr.f, gfn::new);
      a(bqr.g, gfo::new);
      a(bqr.h, gfp::new);
      a(bqr.i, gfq::new);
      a(bqr.j, ggc.a::new);
      a(bqr.k, $$0 -> new gfr($$0, false));
      a(bqr.l, gfs::new);
      a(bqr.m, gft::new);
      a(bqr.n, gjl::new);
      a(bqr.p, gfv::new);
      a(bqr.o, $$0 -> new gfu($$0, fuq.v));
      a(bqr.q, gfw::new);
      a(bqr.r, $$0 -> new gfr($$0, true));
      a(bqr.s, $$0 -> new ghs<>($$0, fuq.y));
      a(bqr.t, gfy::new);
      a(bqr.u, gfz::new);
      a(bqr.v, $$0 -> new ghs<>($$0, fuq.B));
      a(bqr.w, gga::new);
      a(bqr.x, ggb::new);
      a(bqr.y, ggd::new);
      a(bqr.z, $$0 -> new gfx<>($$0, 0.87F, fuq.N));
      a(bqr.A, gge::new);
      a(bqr.B, ggf::new);
      a(bqr.C, giy::new);
      a(bqr.D, ggg::new);
      a(bqr.H, ggj::new);
      a(bqr.I, ggk::new);
      a(bqr.F, ggi::new);
      a(bqr.G, giy::new);
      a(bqr.E, ggh::new);
      a(bqr.J, ggq::new);
      a(bqr.K, ggp::new);
      a(bqr.L, giy::new);
      a(bqr.M, ggr::new);
      a(bqr.N, $$0 -> new giy<>($$0, 1.0F, true));
      a(bqr.O, ggs::new);
      a(bqr.aj, $$0 -> new giy<>($$0, 3.0F, true));
      a(bqr.P, ggt::new);
      a(bqr.by, ggu::new);
      a(bqr.Q, ggv::new);
      a(bqr.R, ggw::new);
      a(bqr.S, $$0 -> new ghs<>($$0, fuq.af));
      a(bqr.T, ggx::new);
      a(bqr.U, $$0 -> new ggy($$0, 6.0F));
      a(bqr.V, ghk::new);
      a(bqr.W, $$0 -> new ggz($$0, new ftt<>($$0.a(fuq.ak))));
      a(bqr.X, gha::new);
      a(bqr.Y, ghb::new);
      a(bqr.Z, ghc::new);
      a(bqr.aa, $$0 -> new ghs<>($$0, fuq.ao));
      a(bqr.ab, ghd::new);
      a(bqr.ac, ghf::new);
      a(bqr.ad, ghh::new);
      a(bqr.ae, ghv::new);
      a(bqr.af, ghi::new);
      a(bqr.ag, ghj::new);
      a(bqr.ah, ggc.b::new);
      a(bqr.ai, ghk::new);
      a(bqr.ak, ghm::new);
      a(bqr.al, ghn::new);
      a(bqr.am, $$0 -> new ghp($$0, fuq.ax));
      a(bqr.an, ghq::new);
      a(bqr.ao, ghr::new);
      a(bqr.ap, ghv::new);
      a(bqr.aq, $$0 -> new ghs<>($$0, fuq.aB));
      a(bqr.ar, ghu::new);
      a(bqr.as, $$0 -> new gfx<>($$0, 0.92F, fuq.aD));
      a(bqr.at, ghw::new);
      a(bqr.au, ghx::new);
      a(bqr.av, ghy::new);
      a(bqr.aw, ghz::new);
      a(bqr.ax, gia::new);
      a(bqr.ay, gib::new);
      a(bqr.az, $$0 -> new gic($$0, fuq.aJ, fuq.aO, fuq.aP, false));
      a(bqr.aA, $$0 -> new gic($$0, fuq.aK, fuq.aL, fuq.aM, false));
      a(bqr.aB, gid::new);
      a(bqr.aC, gie::new);
      a(bqr.aD, giy::new);
      a(bqr.aE, gif::new);
      a(bqr.aF, gig::new);
      a(bqr.aG, gih::new);
      a(bqr.aH, gij::new);
      a(bqr.aI, gik::new);
      a(bqr.aJ, gim::new);
      a(bqr.aK, gil::new);
      a(bqr.aL, gin::new);
      a(bqr.aM, gio::new);
      a(bqr.aN, $$0 -> new gjf($$0, fuq.bo));
      a(bqr.aO, gip::new);
      a(bqr.aP, $$0 -> new giy<>($$0, 0.75F, true));
      a(bqr.aQ, giq::new);
      a(bqr.aS, giy::new);
      a(bqr.aR, gir::new);
      a(bqr.aT, $$0 -> new ghs<>($$0, fuq.bw));
      a(bqr.aU, gis::new);
      a(bqr.aV, git::new);
      a(bqr.aW, $$0 -> new giu<>($$0, new ftt<>($$0.a(fuq.by))));
      a(bqr.aX, giv::new);
      a(bqr.aY, giw::new);
      a(bqr.aZ, gix::new);
      a(bqr.ba, ggc.c::new);
      a(bqr.bb, gjc::new);
      a(bqr.bc, gjb::new);
      a(bqr.bd, $$0 -> new ghp($$0, fuq.bH));
      a(bqr.be, giz::new);
      a(bqr.bf, gjd::new);
      a(bqr.bg, gje::new);
      a(bqr.bh, gjg::new);
      a(bqr.bi, gjh::new);
      a(bqr.bj, gji::new);
      a(bqr.bl, gjk::new);
      a(bqr.bk, gjj::new);
      a(bqr.bm, gjl::new);
      a(bqr.bn, gjm::new);
      a(bqr.bo, gjn::new);
      a(bqr.bp, gjo::new);
      a(bqr.bq, gjp::new);
      a(bqr.br, gjq::new);
      a(bqr.bs, gjr::new);
      a(bqr.bt, gjs::new);
      a(bqr.bu, $$0 -> new gjf($$0, fuq.ch));
      a(bqr.bv, gjt::new);
      a(bqr.bw, $$0 -> new gic($$0, fuq.cn, fuq.co, fuq.cp, true));
   }
}
