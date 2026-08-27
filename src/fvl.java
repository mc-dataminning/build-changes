import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fvl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bkm<?>, fvk<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gch.a, fvk<fpg>> c = Map.of(gch.a.b, $$0 -> new gak($$0, false), gch.a.a, $$0 -> new gak($$0, true));

   private static <T extends bki> void a(bkm<? extends T> $$0, fvk<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bkm<?>, fvj<?>> a(fvk.a $$0) {
      Builder<bkm<?>, fvj<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jy.h.b((bkm<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gch.a, fvj<? extends cdm>> b(fvk.a $$0) {
      Builder<gch.a, fvj<? extends cdm>> $$1 = ImmutableMap.builder();
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

      for (bkm<?> $$1 : jy.h) {
         if ($$1 != bkm.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jy.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bkm.b, fuj::new);
      a(bkm.c, fws::new);
      a(bkm.d, fuk::new);
      a(bkm.e, fxx::new);
      a(bkm.f, fum::new);
      a(bkm.g, fun::new);
      a(bkm.h, fuo::new);
      a(bkm.i, fup::new);
      a(bkm.j, fuz.a::new);
      a(bkm.k, $$0 -> new fuq($$0, false));
      a(bkm.m, fus::new);
      a(bkm.l, $$0 -> new fur($$0, fka.p));
      a(bkm.n, fut::new);
      a(bkm.o, $$0 -> new fuq($$0, true));
      a(bkm.p, $$0 -> new fwp<>($$0, fka.s));
      a(bkm.q, fuv::new);
      a(bkm.r, fuw::new);
      a(bkm.s, $$0 -> new fwp<>($$0, fka.v));
      a(bkm.t, fux::new);
      a(bkm.u, fuy::new);
      a(bkm.v, fva::new);
      a(bkm.w, $$0 -> new fuu<>($$0, 0.87F, fka.H));
      a(bkm.x, fvb::new);
      a(bkm.y, fvc::new);
      a(bkm.z, fxv::new);
      a(bkm.A, fvd::new);
      a(bkm.E, fvg::new);
      a(bkm.F, fvh::new);
      a(bkm.C, fvf::new);
      a(bkm.D, fxv::new);
      a(bkm.B, fve::new);
      a(bkm.G, fvn::new);
      a(bkm.H, fvm::new);
      a(bkm.I, fxv::new);
      a(bkm.J, fvo::new);
      a(bkm.K, $$0 -> new fxv<>($$0, 1.0F, true));
      a(bkm.L, fvp::new);
      a(bkm.ag, $$0 -> new fxv<>($$0, 3.0F, true));
      a(bkm.M, fvq::new);
      a(bkm.bu, fvr::new);
      a(bkm.N, fvs::new);
      a(bkm.O, fvt::new);
      a(bkm.P, $$0 -> new fwp<>($$0, fka.Z));
      a(bkm.Q, fvu::new);
      a(bkm.R, $$0 -> new fvv($$0, 6.0F));
      a(bkm.S, fwh::new);
      a(bkm.T, $$0 -> new fvw($$0, new fje<>($$0.a(fka.ae))));
      a(bkm.U, fvx::new);
      a(bkm.V, fvy::new);
      a(bkm.W, fvz::new);
      a(bkm.X, $$0 -> new fwp<>($$0, fka.ai));
      a(bkm.Y, fwa::new);
      a(bkm.Z, fwc::new);
      a(bkm.aa, fwe::new);
      a(bkm.ab, fws::new);
      a(bkm.ac, fwf::new);
      a(bkm.ad, fwg::new);
      a(bkm.ae, fuz.b::new);
      a(bkm.af, fwh::new);
      a(bkm.ah, fwj::new);
      a(bkm.ai, fwk::new);
      a(bkm.aj, $$0 -> new fwm($$0, fka.ar));
      a(bkm.ak, fwn::new);
      a(bkm.al, fwo::new);
      a(bkm.am, fws::new);
      a(bkm.an, $$0 -> new fwp<>($$0, fka.av));
      a(bkm.ao, fwr::new);
      a(bkm.ap, $$0 -> new fuu<>($$0, 0.92F, fka.ax));
      a(bkm.aq, fwt::new);
      a(bkm.ar, fwu::new);
      a(bkm.as, fwv::new);
      a(bkm.at, fww::new);
      a(bkm.au, fwx::new);
      a(bkm.av, fwy::new);
      a(bkm.aw, $$0 -> new fwz($$0, fka.aD, fka.aI, fka.aJ, false));
      a(bkm.ax, $$0 -> new fwz($$0, fka.aE, fka.aF, fka.aG, false));
      a(bkm.ay, fxa::new);
      a(bkm.az, fxb::new);
      a(bkm.aA, fxv::new);
      a(bkm.aB, fxc::new);
      a(bkm.aC, fxd::new);
      a(bkm.aD, fxe::new);
      a(bkm.aE, fxg::new);
      a(bkm.aF, fxh::new);
      a(bkm.aG, fxj::new);
      a(bkm.aH, fxi::new);
      a(bkm.aI, fxk::new);
      a(bkm.aJ, fxl::new);
      a(bkm.aK, $$0 -> new fyc($$0, fka.bi));
      a(bkm.aL, fxm::new);
      a(bkm.aM, $$0 -> new fxv<>($$0, 0.75F, true));
      a(bkm.aN, fxn::new);
      a(bkm.aP, fxv::new);
      a(bkm.aO, fxo::new);
      a(bkm.aQ, $$0 -> new fwp<>($$0, fka.bq));
      a(bkm.aR, fxp::new);
      a(bkm.aS, fxq::new);
      a(bkm.aT, $$0 -> new fxr<>($$0, new fje<>($$0.a(fka.bs))));
      a(bkm.aU, fxs::new);
      a(bkm.aV, fxt::new);
      a(bkm.aW, fxu::new);
      a(bkm.aX, fuz.c::new);
      a(bkm.aY, fxz::new);
      a(bkm.aZ, fxy::new);
      a(bkm.ba, $$0 -> new fwm($$0, fka.bB));
      a(bkm.bb, fxw::new);
      a(bkm.bc, fya::new);
      a(bkm.bd, fyb::new);
      a(bkm.be, fyd::new);
      a(bkm.bf, fye::new);
      a(bkm.bg, fyf::new);
      a(bkm.bi, fyh::new);
      a(bkm.bh, fyg::new);
      a(bkm.bj, fyi::new);
      a(bkm.bk, fyj::new);
      a(bkm.bl, fyk::new);
      a(bkm.bm, fyl::new);
      a(bkm.bn, fym::new);
      a(bkm.bo, fyn::new);
      a(bkm.bp, fyo::new);
      a(bkm.bq, $$0 -> new fyc($$0, fka.bZ));
      a(bkm.br, fyp::new);
      a(bkm.bs, $$0 -> new fwz($$0, fka.cf, fka.cg, fka.ch, true));
   }
}
