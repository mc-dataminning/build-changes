import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fyg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blt<?>, fyf<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gff.a, fyf<fry>> c = Map.of(gff.a.b, $$0 -> new gdi($$0, false), gff.a.a, $$0 -> new gdi($$0, true));

   private static <T extends blp> void a(blt<? extends T> $$0, fyf<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<blt<?>, fye<?>> a(fyf.a $$0) {
      Builder<blt<?>, fye<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kd.g.b((blt<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gff.a, fye<? extends cfb>> b(fyf.a $$0) {
      Builder<gff.a, fye<? extends cfb>> $$1 = ImmutableMap.builder();
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

      for (blt<?> $$1 : kd.g) {
         if ($$1 != blt.bv && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kd.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(blt.b, fxd::new);
      a(blt.c, fzn::new);
      a(blt.d, fxe::new);
      a(blt.e, gas::new);
      a(blt.f, fxg::new);
      a(blt.g, fxh::new);
      a(blt.h, fxi::new);
      a(blt.i, fxj::new);
      a(blt.j, fxu.a::new);
      a(blt.k, $$0 -> new fxk($$0, false));
      a(blt.l, fxl::new);
      a(blt.n, fxn::new);
      a(blt.m, $$0 -> new fxm($$0, fmo.s));
      a(blt.o, fxo::new);
      a(blt.p, $$0 -> new fxk($$0, true));
      a(blt.q, $$0 -> new fzk<>($$0, fmo.v));
      a(blt.r, fxq::new);
      a(blt.s, fxr::new);
      a(blt.t, $$0 -> new fzk<>($$0, fmo.y));
      a(blt.u, fxs::new);
      a(blt.v, fxt::new);
      a(blt.w, fxv::new);
      a(blt.x, $$0 -> new fxp<>($$0, 0.87F, fmo.K));
      a(blt.y, fxw::new);
      a(blt.z, fxx::new);
      a(blt.A, gaq::new);
      a(blt.B, fxy::new);
      a(blt.F, fyb::new);
      a(blt.G, fyc::new);
      a(blt.D, fya::new);
      a(blt.E, gaq::new);
      a(blt.C, fxz::new);
      a(blt.H, fyi::new);
      a(blt.I, fyh::new);
      a(blt.J, gaq::new);
      a(blt.K, fyj::new);
      a(blt.L, $$0 -> new gaq<>($$0, 1.0F, true));
      a(blt.M, fyk::new);
      a(blt.ah, $$0 -> new gaq<>($$0, 3.0F, true));
      a(blt.N, fyl::new);
      a(blt.bw, fym::new);
      a(blt.O, fyn::new);
      a(blt.P, fyo::new);
      a(blt.Q, $$0 -> new fzk<>($$0, fmo.ac));
      a(blt.R, fyp::new);
      a(blt.S, $$0 -> new fyq($$0, 6.0F));
      a(blt.T, fzc::new);
      a(blt.U, $$0 -> new fyr($$0, new flr<>($$0.a(fmo.ah))));
      a(blt.V, fys::new);
      a(blt.W, fyt::new);
      a(blt.X, fyu::new);
      a(blt.Y, $$0 -> new fzk<>($$0, fmo.al));
      a(blt.Z, fyv::new);
      a(blt.aa, fyx::new);
      a(blt.ab, fyz::new);
      a(blt.ac, fzn::new);
      a(blt.ad, fza::new);
      a(blt.ae, fzb::new);
      a(blt.af, fxu.b::new);
      a(blt.ag, fzc::new);
      a(blt.ai, fze::new);
      a(blt.aj, fzf::new);
      a(blt.ak, $$0 -> new fzh($$0, fmo.au));
      a(blt.al, fzi::new);
      a(blt.am, fzj::new);
      a(blt.an, fzn::new);
      a(blt.ao, $$0 -> new fzk<>($$0, fmo.ay));
      a(blt.ap, fzm::new);
      a(blt.aq, $$0 -> new fxp<>($$0, 0.92F, fmo.aA));
      a(blt.ar, fzo::new);
      a(blt.as, fzp::new);
      a(blt.at, fzq::new);
      a(blt.au, fzr::new);
      a(blt.av, fzs::new);
      a(blt.aw, fzt::new);
      a(blt.ax, $$0 -> new fzu($$0, fmo.aG, fmo.aL, fmo.aM, false));
      a(blt.ay, $$0 -> new fzu($$0, fmo.aH, fmo.aI, fmo.aJ, false));
      a(blt.az, fzv::new);
      a(blt.aA, fzw::new);
      a(blt.aB, gaq::new);
      a(blt.aC, fzx::new);
      a(blt.aD, fzy::new);
      a(blt.aE, fzz::new);
      a(blt.aF, gab::new);
      a(blt.aG, gac::new);
      a(blt.aH, gae::new);
      a(blt.aI, gad::new);
      a(blt.aJ, gaf::new);
      a(blt.aK, gag::new);
      a(blt.aL, $$0 -> new gax($$0, fmo.bl));
      a(blt.aM, gah::new);
      a(blt.aN, $$0 -> new gaq<>($$0, 0.75F, true));
      a(blt.aO, gai::new);
      a(blt.aQ, gaq::new);
      a(blt.aP, gaj::new);
      a(blt.aR, $$0 -> new fzk<>($$0, fmo.bt));
      a(blt.aS, gak::new);
      a(blt.aT, gal::new);
      a(blt.aU, $$0 -> new gam<>($$0, new flr<>($$0.a(fmo.bv))));
      a(blt.aV, gan::new);
      a(blt.aW, gao::new);
      a(blt.aX, gap::new);
      a(blt.aY, fxu.c::new);
      a(blt.aZ, gau::new);
      a(blt.ba, gat::new);
      a(blt.bb, $$0 -> new fzh($$0, fmo.bE));
      a(blt.bc, gar::new);
      a(blt.bd, gav::new);
      a(blt.be, gaw::new);
      a(blt.bf, gay::new);
      a(blt.bg, gaz::new);
      a(blt.bh, gba::new);
      a(blt.bj, gbc::new);
      a(blt.bi, gbb::new);
      a(blt.bk, gbd::new);
      a(blt.bl, gbe::new);
      a(blt.bm, gbf::new);
      a(blt.bn, gbg::new);
      a(blt.bo, gbh::new);
      a(blt.bp, gbi::new);
      a(blt.bq, gbj::new);
      a(blt.br, gbk::new);
      a(blt.bs, $$0 -> new gax($$0, fmo.cd));
      a(blt.bt, gbl::new);
      a(blt.bu, $$0 -> new fzu($$0, fmo.cj, fmo.ck, fmo.cl, true));
   }
}
