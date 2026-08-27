import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gfj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqb<?>, gfi<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gmi.a, gfi<fyy>> c = Map.of(gmi.a.b, $$0 -> new gkm($$0, false), gmi.a.a, $$0 -> new gkm($$0, true));

   private static <T extends bpv> void a(bqb<? extends T> $$0, gfi<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bqb<?>, gfh<?>> a(gfi.a $$0) {
      Builder<bqb<?>, gfh<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kr.g.b((bqb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gmi.a, gfh<? extends cjt>> b(gfi.a $$0) {
      Builder<gmi.a, gfh<? extends cjt>> $$1 = ImmutableMap.builder();
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

      for (bqb<?> $$1 : kr.g) {
         if ($$1 != bqb.bx && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kr.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bqb.a, gee::new);
      a(bqb.b, ggq::new);
      a(bqb.c, gef::new);
      a(bqb.d, geg::new);
      a(bqb.e, ghv::new);
      a(bqb.f, gei::new);
      a(bqb.g, gej::new);
      a(bqb.h, gek::new);
      a(bqb.i, gel::new);
      a(bqb.j, gex.a::new);
      a(bqb.k, $$0 -> new gem($$0, false));
      a(bqb.l, gen::new);
      a(bqb.m, geo::new);
      a(bqb.n, gig::new);
      a(bqb.p, geq::new);
      a(bqb.o, $$0 -> new gep($$0, ftl.v));
      a(bqb.q, ger::new);
      a(bqb.r, $$0 -> new gem($$0, true));
      a(bqb.s, $$0 -> new ggn<>($$0, ftl.y));
      a(bqb.t, get::new);
      a(bqb.u, geu::new);
      a(bqb.v, $$0 -> new ggn<>($$0, ftl.B));
      a(bqb.w, gev::new);
      a(bqb.x, gew::new);
      a(bqb.y, gey::new);
      a(bqb.z, $$0 -> new ges<>($$0, 0.87F, ftl.N));
      a(bqb.A, gez::new);
      a(bqb.B, gfa::new);
      a(bqb.C, ght::new);
      a(bqb.D, gfb::new);
      a(bqb.H, gfe::new);
      a(bqb.I, gff::new);
      a(bqb.F, gfd::new);
      a(bqb.G, ght::new);
      a(bqb.E, gfc::new);
      a(bqb.J, gfl::new);
      a(bqb.K, gfk::new);
      a(bqb.L, ght::new);
      a(bqb.M, gfm::new);
      a(bqb.N, $$0 -> new ght<>($$0, 1.0F, true));
      a(bqb.O, gfn::new);
      a(bqb.aj, $$0 -> new ght<>($$0, 3.0F, true));
      a(bqb.P, gfo::new);
      a(bqb.by, gfp::new);
      a(bqb.Q, gfq::new);
      a(bqb.R, gfr::new);
      a(bqb.S, $$0 -> new ggn<>($$0, ftl.af));
      a(bqb.T, gfs::new);
      a(bqb.U, $$0 -> new gft($$0, 6.0F));
      a(bqb.V, ggf::new);
      a(bqb.W, $$0 -> new gfu($$0, new fso<>($$0.a(ftl.ak))));
      a(bqb.X, gfv::new);
      a(bqb.Y, gfw::new);
      a(bqb.Z, gfx::new);
      a(bqb.aa, $$0 -> new ggn<>($$0, ftl.ao));
      a(bqb.ab, gfy::new);
      a(bqb.ac, gga::new);
      a(bqb.ad, ggc::new);
      a(bqb.ae, ggq::new);
      a(bqb.af, ggd::new);
      a(bqb.ag, gge::new);
      a(bqb.ah, gex.b::new);
      a(bqb.ai, ggf::new);
      a(bqb.ak, ggh::new);
      a(bqb.al, ggi::new);
      a(bqb.am, $$0 -> new ggk($$0, ftl.ax));
      a(bqb.an, ggl::new);
      a(bqb.ao, ggm::new);
      a(bqb.ap, ggq::new);
      a(bqb.aq, $$0 -> new ggn<>($$0, ftl.aB));
      a(bqb.ar, ggp::new);
      a(bqb.as, $$0 -> new ges<>($$0, 0.92F, ftl.aD));
      a(bqb.at, ggr::new);
      a(bqb.au, ggs::new);
      a(bqb.av, ggt::new);
      a(bqb.aw, ggu::new);
      a(bqb.ax, ggv::new);
      a(bqb.ay, ggw::new);
      a(bqb.az, $$0 -> new ggx($$0, ftl.aJ, ftl.aO, ftl.aP, false));
      a(bqb.aA, $$0 -> new ggx($$0, ftl.aK, ftl.aL, ftl.aM, false));
      a(bqb.aB, ggy::new);
      a(bqb.aC, ggz::new);
      a(bqb.aD, ght::new);
      a(bqb.aE, gha::new);
      a(bqb.aF, ghb::new);
      a(bqb.aG, ghc::new);
      a(bqb.aH, ghe::new);
      a(bqb.aI, ghf::new);
      a(bqb.aJ, ghh::new);
      a(bqb.aK, ghg::new);
      a(bqb.aL, ghi::new);
      a(bqb.aM, ghj::new);
      a(bqb.aN, $$0 -> new gia($$0, ftl.bo));
      a(bqb.aO, ghk::new);
      a(bqb.aP, $$0 -> new ght<>($$0, 0.75F, true));
      a(bqb.aQ, ghl::new);
      a(bqb.aS, ght::new);
      a(bqb.aR, ghm::new);
      a(bqb.aT, $$0 -> new ggn<>($$0, ftl.bw));
      a(bqb.aU, ghn::new);
      a(bqb.aV, gho::new);
      a(bqb.aW, $$0 -> new ghp<>($$0, new fso<>($$0.a(ftl.by))));
      a(bqb.aX, ghq::new);
      a(bqb.aY, ghr::new);
      a(bqb.aZ, ghs::new);
      a(bqb.ba, gex.c::new);
      a(bqb.bb, ghx::new);
      a(bqb.bc, ghw::new);
      a(bqb.bd, $$0 -> new ggk($$0, ftl.bH));
      a(bqb.be, ghu::new);
      a(bqb.bf, ghy::new);
      a(bqb.bg, ghz::new);
      a(bqb.bh, gib::new);
      a(bqb.bi, gic::new);
      a(bqb.bj, gid::new);
      a(bqb.bl, gif::new);
      a(bqb.bk, gie::new);
      a(bqb.bm, gig::new);
      a(bqb.bn, gih::new);
      a(bqb.bo, gii::new);
      a(bqb.bp, gij::new);
      a(bqb.bq, gik::new);
      a(bqb.br, gil::new);
      a(bqb.bs, gim::new);
      a(bqb.bt, gin::new);
      a(bqb.bu, $$0 -> new gia($$0, ftl.ch));
      a(bqb.bv, gio::new);
      a(bqb.bw, $$0 -> new ggx($$0, ftl.cn, ftl.co, ftl.cp, true));
   }
}
