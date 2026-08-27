import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gfs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqg<?>, gfr<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gmr.a, gfr<fzh>> c = Map.of(gmr.a.b, $$0 -> new gkv($$0, false), gmr.a.a, $$0 -> new gkv($$0, true));

   private static <T extends bqa> void a(bqg<? extends T> $$0, gfr<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bqg<?>, gfq<?>> a(gfr.a $$0) {
      Builder<bqg<?>, gfq<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kt.g.b((bqg<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gmr.a, gfq<? extends cka>> b(gfr.a $$0) {
      Builder<gmr.a, gfq<? extends cka>> $$1 = ImmutableMap.builder();
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

      for (bqg<?> $$1 : kt.g) {
         if ($$1 != bqg.bx && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kt.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bqg.a, gen::new);
      a(bqg.b, ggz::new);
      a(bqg.c, geo::new);
      a(bqg.d, gep::new);
      a(bqg.e, gie::new);
      a(bqg.f, ger::new);
      a(bqg.g, ges::new);
      a(bqg.h, get::new);
      a(bqg.i, geu::new);
      a(bqg.j, gfg.a::new);
      a(bqg.k, $$0 -> new gev($$0, false));
      a(bqg.l, gew::new);
      a(bqg.m, gex::new);
      a(bqg.n, gip::new);
      a(bqg.p, gez::new);
      a(bqg.o, $$0 -> new gey($$0, ftu.v));
      a(bqg.q, gfa::new);
      a(bqg.r, $$0 -> new gev($$0, true));
      a(bqg.s, $$0 -> new ggw<>($$0, ftu.y));
      a(bqg.t, gfc::new);
      a(bqg.u, gfd::new);
      a(bqg.v, $$0 -> new ggw<>($$0, ftu.B));
      a(bqg.w, gfe::new);
      a(bqg.x, gff::new);
      a(bqg.y, gfh::new);
      a(bqg.z, $$0 -> new gfb<>($$0, 0.87F, ftu.N));
      a(bqg.A, gfi::new);
      a(bqg.B, gfj::new);
      a(bqg.C, gic::new);
      a(bqg.D, gfk::new);
      a(bqg.H, gfn::new);
      a(bqg.I, gfo::new);
      a(bqg.F, gfm::new);
      a(bqg.G, gic::new);
      a(bqg.E, gfl::new);
      a(bqg.J, gfu::new);
      a(bqg.K, gft::new);
      a(bqg.L, gic::new);
      a(bqg.M, gfv::new);
      a(bqg.N, $$0 -> new gic<>($$0, 1.0F, true));
      a(bqg.O, gfw::new);
      a(bqg.aj, $$0 -> new gic<>($$0, 3.0F, true));
      a(bqg.P, gfx::new);
      a(bqg.by, gfy::new);
      a(bqg.Q, gfz::new);
      a(bqg.R, gga::new);
      a(bqg.S, $$0 -> new ggw<>($$0, ftu.af));
      a(bqg.T, ggb::new);
      a(bqg.U, $$0 -> new ggc($$0, 6.0F));
      a(bqg.V, ggo::new);
      a(bqg.W, $$0 -> new ggd($$0, new fsx<>($$0.a(ftu.ak))));
      a(bqg.X, gge::new);
      a(bqg.Y, ggf::new);
      a(bqg.Z, ggg::new);
      a(bqg.aa, $$0 -> new ggw<>($$0, ftu.ao));
      a(bqg.ab, ggh::new);
      a(bqg.ac, ggj::new);
      a(bqg.ad, ggl::new);
      a(bqg.ae, ggz::new);
      a(bqg.af, ggm::new);
      a(bqg.ag, ggn::new);
      a(bqg.ah, gfg.b::new);
      a(bqg.ai, ggo::new);
      a(bqg.ak, ggq::new);
      a(bqg.al, ggr::new);
      a(bqg.am, $$0 -> new ggt($$0, ftu.ax));
      a(bqg.an, ggu::new);
      a(bqg.ao, ggv::new);
      a(bqg.ap, ggz::new);
      a(bqg.aq, $$0 -> new ggw<>($$0, ftu.aB));
      a(bqg.ar, ggy::new);
      a(bqg.as, $$0 -> new gfb<>($$0, 0.92F, ftu.aD));
      a(bqg.at, gha::new);
      a(bqg.au, ghb::new);
      a(bqg.av, ghc::new);
      a(bqg.aw, ghd::new);
      a(bqg.ax, ghe::new);
      a(bqg.ay, ghf::new);
      a(bqg.az, $$0 -> new ghg($$0, ftu.aJ, ftu.aO, ftu.aP, false));
      a(bqg.aA, $$0 -> new ghg($$0, ftu.aK, ftu.aL, ftu.aM, false));
      a(bqg.aB, ghh::new);
      a(bqg.aC, ghi::new);
      a(bqg.aD, gic::new);
      a(bqg.aE, ghj::new);
      a(bqg.aF, ghk::new);
      a(bqg.aG, ghl::new);
      a(bqg.aH, ghn::new);
      a(bqg.aI, gho::new);
      a(bqg.aJ, ghq::new);
      a(bqg.aK, ghp::new);
      a(bqg.aL, ghr::new);
      a(bqg.aM, ghs::new);
      a(bqg.aN, $$0 -> new gij($$0, ftu.bo));
      a(bqg.aO, ght::new);
      a(bqg.aP, $$0 -> new gic<>($$0, 0.75F, true));
      a(bqg.aQ, ghu::new);
      a(bqg.aS, gic::new);
      a(bqg.aR, ghv::new);
      a(bqg.aT, $$0 -> new ggw<>($$0, ftu.bw));
      a(bqg.aU, ghw::new);
      a(bqg.aV, ghx::new);
      a(bqg.aW, $$0 -> new ghy<>($$0, new fsx<>($$0.a(ftu.by))));
      a(bqg.aX, ghz::new);
      a(bqg.aY, gia::new);
      a(bqg.aZ, gib::new);
      a(bqg.ba, gfg.c::new);
      a(bqg.bb, gig::new);
      a(bqg.bc, gif::new);
      a(bqg.bd, $$0 -> new ggt($$0, ftu.bH));
      a(bqg.be, gid::new);
      a(bqg.bf, gih::new);
      a(bqg.bg, gii::new);
      a(bqg.bh, gik::new);
      a(bqg.bi, gil::new);
      a(bqg.bj, gim::new);
      a(bqg.bl, gio::new);
      a(bqg.bk, gin::new);
      a(bqg.bm, gip::new);
      a(bqg.bn, giq::new);
      a(bqg.bo, gir::new);
      a(bqg.bp, gis::new);
      a(bqg.bq, git::new);
      a(bqg.br, giu::new);
      a(bqg.bs, giv::new);
      a(bqg.bt, giw::new);
      a(bqg.bu, $$0 -> new gij($$0, ftu.ch));
      a(bqg.bv, gix::new);
      a(bqg.bw, $$0 -> new ghg($$0, ftu.cn, ftu.co, ftu.cp, true));
   }
}
