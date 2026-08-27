import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fym {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bly<?>, fyl<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gfk.a, fyl<fse>> c = Map.of(gfk.a.b, $$0 -> new gdo($$0, false), gfk.a.a, $$0 -> new gdo($$0, true));

   private static <T extends blu> void a(bly<? extends T> $$0, fyl<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bly<?>, fyk<?>> a(fyl.a $$0) {
      Builder<bly<?>, fyk<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kd.g.b((bly<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gfk.a, fyk<? extends cfh>> b(fyl.a $$0) {
      Builder<gfk.a, fyk<? extends cfh>> $$1 = ImmutableMap.builder();
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

      for (bly<?> $$1 : kd.g) {
         if ($$1 != bly.bv && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kd.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bly.b, fxj::new);
      a(bly.c, fzt::new);
      a(bly.d, fxk::new);
      a(bly.e, gay::new);
      a(bly.f, fxm::new);
      a(bly.g, fxn::new);
      a(bly.h, fxo::new);
      a(bly.i, fxp::new);
      a(bly.j, fya.a::new);
      a(bly.k, $$0 -> new fxq($$0, false));
      a(bly.l, fxr::new);
      a(bly.n, fxt::new);
      a(bly.m, $$0 -> new fxs($$0, fmu.s));
      a(bly.o, fxu::new);
      a(bly.p, $$0 -> new fxq($$0, true));
      a(bly.q, $$0 -> new fzq<>($$0, fmu.v));
      a(bly.r, fxw::new);
      a(bly.s, fxx::new);
      a(bly.t, $$0 -> new fzq<>($$0, fmu.y));
      a(bly.u, fxy::new);
      a(bly.v, fxz::new);
      a(bly.w, fyb::new);
      a(bly.x, $$0 -> new fxv<>($$0, 0.87F, fmu.K));
      a(bly.y, fyc::new);
      a(bly.z, fyd::new);
      a(bly.A, gaw::new);
      a(bly.B, fye::new);
      a(bly.F, fyh::new);
      a(bly.G, fyi::new);
      a(bly.D, fyg::new);
      a(bly.E, gaw::new);
      a(bly.C, fyf::new);
      a(bly.H, fyo::new);
      a(bly.I, fyn::new);
      a(bly.J, gaw::new);
      a(bly.K, fyp::new);
      a(bly.L, $$0 -> new gaw<>($$0, 1.0F, true));
      a(bly.M, fyq::new);
      a(bly.ah, $$0 -> new gaw<>($$0, 3.0F, true));
      a(bly.N, fyr::new);
      a(bly.bw, fys::new);
      a(bly.O, fyt::new);
      a(bly.P, fyu::new);
      a(bly.Q, $$0 -> new fzq<>($$0, fmu.ac));
      a(bly.R, fyv::new);
      a(bly.S, $$0 -> new fyw($$0, 6.0F));
      a(bly.T, fzi::new);
      a(bly.U, $$0 -> new fyx($$0, new flx<>($$0.a(fmu.ah))));
      a(bly.V, fyy::new);
      a(bly.W, fyz::new);
      a(bly.X, fza::new);
      a(bly.Y, $$0 -> new fzq<>($$0, fmu.al));
      a(bly.Z, fzb::new);
      a(bly.aa, fzd::new);
      a(bly.ab, fzf::new);
      a(bly.ac, fzt::new);
      a(bly.ad, fzg::new);
      a(bly.ae, fzh::new);
      a(bly.af, fya.b::new);
      a(bly.ag, fzi::new);
      a(bly.ai, fzk::new);
      a(bly.aj, fzl::new);
      a(bly.ak, $$0 -> new fzn($$0, fmu.au));
      a(bly.al, fzo::new);
      a(bly.am, fzp::new);
      a(bly.an, fzt::new);
      a(bly.ao, $$0 -> new fzq<>($$0, fmu.ay));
      a(bly.ap, fzs::new);
      a(bly.aq, $$0 -> new fxv<>($$0, 0.92F, fmu.aA));
      a(bly.ar, fzu::new);
      a(bly.as, fzv::new);
      a(bly.at, fzw::new);
      a(bly.au, fzx::new);
      a(bly.av, fzy::new);
      a(bly.aw, fzz::new);
      a(bly.ax, $$0 -> new gaa($$0, fmu.aG, fmu.aL, fmu.aM, false));
      a(bly.ay, $$0 -> new gaa($$0, fmu.aH, fmu.aI, fmu.aJ, false));
      a(bly.az, gab::new);
      a(bly.aA, gac::new);
      a(bly.aB, gaw::new);
      a(bly.aC, gad::new);
      a(bly.aD, gae::new);
      a(bly.aE, gaf::new);
      a(bly.aF, gah::new);
      a(bly.aG, gai::new);
      a(bly.aH, gak::new);
      a(bly.aI, gaj::new);
      a(bly.aJ, gal::new);
      a(bly.aK, gam::new);
      a(bly.aL, $$0 -> new gbd($$0, fmu.bl));
      a(bly.aM, gan::new);
      a(bly.aN, $$0 -> new gaw<>($$0, 0.75F, true));
      a(bly.aO, gao::new);
      a(bly.aQ, gaw::new);
      a(bly.aP, gap::new);
      a(bly.aR, $$0 -> new fzq<>($$0, fmu.bt));
      a(bly.aS, gaq::new);
      a(bly.aT, gar::new);
      a(bly.aU, $$0 -> new gas<>($$0, new flx<>($$0.a(fmu.bv))));
      a(bly.aV, gat::new);
      a(bly.aW, gau::new);
      a(bly.aX, gav::new);
      a(bly.aY, fya.c::new);
      a(bly.aZ, gba::new);
      a(bly.ba, gaz::new);
      a(bly.bb, $$0 -> new fzn($$0, fmu.bE));
      a(bly.bc, gax::new);
      a(bly.bd, gbb::new);
      a(bly.be, gbc::new);
      a(bly.bf, gbe::new);
      a(bly.bg, gbf::new);
      a(bly.bh, gbg::new);
      a(bly.bj, gbi::new);
      a(bly.bi, gbh::new);
      a(bly.bk, gbj::new);
      a(bly.bl, gbk::new);
      a(bly.bm, gbl::new);
      a(bly.bn, gbm::new);
      a(bly.bo, gbn::new);
      a(bly.bp, gbo::new);
      a(bly.bq, gbp::new);
      a(bly.br, gbq::new);
      a(bly.bs, $$0 -> new gbd($$0, fmu.cd));
      a(bly.bt, gbr::new);
      a(bly.bu, $$0 -> new gaa($$0, fmu.cj, fmu.ck, fmu.cl, true));
   }
}
