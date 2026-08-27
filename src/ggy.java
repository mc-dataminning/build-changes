import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ggy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<brn<?>, ggx<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gny.a, ggx<gan>> c = Map.of(gny.a.b, $$0 -> new gmb($$0, false), gny.a.a, $$0 -> new gmb($$0, true));

   private static <T extends brh> void a(brn<? extends T> $$0, ggx<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<brn<?>, ggw<?>> a(ggx.a $$0) {
      Builder<brn<?>, ggw<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ld.g.b((brn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gny.a, ggw<? extends clh>> b(ggx.a $$0) {
      Builder<gny.a, ggw<? extends clh>> $$1 = ImmutableMap.builder();
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

      for (brn<?> $$1 : ld.g) {
         if ($$1 != brn.bx && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ld.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(brn.a, gft::new);
      a(brn.b, gif::new);
      a(brn.c, gfu::new);
      a(brn.d, gfv::new);
      a(brn.e, gjk::new);
      a(brn.f, gfx::new);
      a(brn.g, gfy::new);
      a(brn.h, gfz::new);
      a(brn.i, gga::new);
      a(brn.j, ggm.a::new);
      a(brn.k, $$0 -> new ggb($$0, false));
      a(brn.l, ggc::new);
      a(brn.m, ggd::new);
      a(brn.n, gjv::new);
      a(brn.p, ggf::new);
      a(brn.o, $$0 -> new gge($$0, fva.v));
      a(brn.q, ggg::new);
      a(brn.r, $$0 -> new ggb($$0, true));
      a(brn.s, $$0 -> new gic<>($$0, fva.y));
      a(brn.t, ggi::new);
      a(brn.u, ggj::new);
      a(brn.v, $$0 -> new gic<>($$0, fva.B));
      a(brn.w, ggk::new);
      a(brn.x, ggl::new);
      a(brn.y, ggn::new);
      a(brn.z, $$0 -> new ggh<>($$0, 0.87F, fva.N));
      a(brn.A, ggo::new);
      a(brn.B, ggp::new);
      a(brn.C, gji::new);
      a(brn.D, ggq::new);
      a(brn.H, ggt::new);
      a(brn.I, ggu::new);
      a(brn.F, ggs::new);
      a(brn.G, gji::new);
      a(brn.E, ggr::new);
      a(brn.J, gha::new);
      a(brn.K, ggz::new);
      a(brn.L, gji::new);
      a(brn.M, ghb::new);
      a(brn.N, $$0 -> new gji<>($$0, 1.0F, true));
      a(brn.O, ghc::new);
      a(brn.aj, $$0 -> new gji<>($$0, 3.0F, true));
      a(brn.P, ghd::new);
      a(brn.by, ghe::new);
      a(brn.Q, ghf::new);
      a(brn.R, ghg::new);
      a(brn.S, $$0 -> new gic<>($$0, fva.af));
      a(brn.T, ghh::new);
      a(brn.U, $$0 -> new ghi($$0, 6.0F));
      a(brn.V, ghu::new);
      a(brn.W, $$0 -> new ghj($$0, new fud<>($$0.a(fva.ak))));
      a(brn.X, ghk::new);
      a(brn.Y, ghl::new);
      a(brn.Z, ghm::new);
      a(brn.aa, $$0 -> new gic<>($$0, fva.ao));
      a(brn.ab, ghn::new);
      a(brn.ac, ghp::new);
      a(brn.ad, ghr::new);
      a(brn.ae, gif::new);
      a(brn.af, ghs::new);
      a(brn.ag, ght::new);
      a(brn.ah, ggm.b::new);
      a(brn.ai, ghu::new);
      a(brn.ak, ghw::new);
      a(brn.al, ghx::new);
      a(brn.am, $$0 -> new ghz($$0, fva.ax));
      a(brn.an, gia::new);
      a(brn.ao, gib::new);
      a(brn.ap, gif::new);
      a(brn.aq, $$0 -> new gic<>($$0, fva.aB));
      a(brn.ar, gie::new);
      a(brn.as, $$0 -> new ggh<>($$0, 0.92F, fva.aD));
      a(brn.at, gig::new);
      a(brn.au, gih::new);
      a(brn.av, gii::new);
      a(brn.aw, gij::new);
      a(brn.ax, gik::new);
      a(brn.ay, gil::new);
      a(brn.az, $$0 -> new gim($$0, fva.aJ, fva.aO, fva.aP, false));
      a(brn.aA, $$0 -> new gim($$0, fva.aK, fva.aL, fva.aM, false));
      a(brn.aB, gin::new);
      a(brn.aC, gio::new);
      a(brn.aD, gji::new);
      a(brn.aE, gip::new);
      a(brn.aF, giq::new);
      a(brn.aG, gir::new);
      a(brn.aH, git::new);
      a(brn.aI, giu::new);
      a(brn.aJ, giw::new);
      a(brn.aK, giv::new);
      a(brn.aL, gix::new);
      a(brn.aM, giy::new);
      a(brn.aN, $$0 -> new gjp($$0, fva.bo));
      a(brn.aO, giz::new);
      a(brn.aP, $$0 -> new gji<>($$0, 0.75F, true));
      a(brn.aQ, gja::new);
      a(brn.aS, gji::new);
      a(brn.aR, gjb::new);
      a(brn.aT, $$0 -> new gic<>($$0, fva.bw));
      a(brn.aU, gjc::new);
      a(brn.aV, gjd::new);
      a(brn.aW, $$0 -> new gje<>($$0, new fud<>($$0.a(fva.by))));
      a(brn.aX, gjf::new);
      a(brn.aY, gjg::new);
      a(brn.aZ, gjh::new);
      a(brn.ba, ggm.c::new);
      a(brn.bb, gjm::new);
      a(brn.bc, gjl::new);
      a(brn.bd, $$0 -> new ghz($$0, fva.bH));
      a(brn.be, gjj::new);
      a(brn.bf, gjn::new);
      a(brn.bg, gjo::new);
      a(brn.bh, gjq::new);
      a(brn.bi, gjr::new);
      a(brn.bj, gjs::new);
      a(brn.bl, gju::new);
      a(brn.bk, gjt::new);
      a(brn.bm, gjv::new);
      a(brn.bn, gjw::new);
      a(brn.bo, gjx::new);
      a(brn.bp, gjy::new);
      a(brn.bq, gjz::new);
      a(brn.br, gka::new);
      a(brn.bs, gkb::new);
      a(brn.bt, gkc::new);
      a(brn.bu, $$0 -> new gjp($$0, fva.ch));
      a(brn.bv, gkd::new);
      a(brn.bw, $$0 -> new gim($$0, fva.cn, fva.co, fva.cp, true));
   }
}
