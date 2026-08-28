import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gvl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwj<?>, gvk<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hja.a, gvk<gnx>> c = Map.of(hja.a.b, $$0 -> new haq($$0, false), hja.a.a, $$0 -> new haq($$0, true));

   private static <T extends bwa> void a(bwj<? extends T> $$0, gvk<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwj<?>, gvj<?, ?>> a(gvk.a $$0) {
      Builder<bwj<?>, gvj<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + mf.f.b((bwj<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hja.a, gvj<? extends cqs, ?>> b(gvk.a $$0) {
      Builder<hja.a, gvj<? extends cqs, ?>> $$1 = ImmutableMap.builder();
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

      for (bwj<?> $$1 : mf.f) {
         if ($$1 != bwj.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", mf.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bwj.a, $$0 -> new gun($$0, gif.a));
      a(bwj.b, $$0 -> new gun($$0, gif.b));
      a(bwj.c, guf::new);
      a(bwj.d, gws::new);
      a(bwj.e, gug::new);
      a(bwj.f, guh::new);
      a(bwj.g, gxz::new);
      a(bwj.h, guj::new);
      a(bwj.i, $$0 -> new gxf($$0, gif.o));
      a(bwj.j, $$0 -> new gxf($$0, gif.p));
      a(bwj.k, guk::new);
      a(bwj.l, gul::new);
      a(bwj.m, $$0 -> new gun($$0, gif.B));
      a(bwj.n, $$0 -> new gun($$0, gif.C));
      a(bwj.o, gum::new);
      a(bwj.p, guy.a::new);
      a(bwj.q, guo::new);
      a(bwj.r, gup::new);
      a(bwj.s, gyk::new);
      a(bwj.t, guq::new);
      a(bwj.u, gur::new);
      a(bwj.v, gus::new);
      a(bwj.w, $$0 -> new gun($$0, gif.V));
      a(bwj.x, $$0 -> new gun($$0, gif.W));
      a(bwj.y, $$0 -> new gwp($$0, gif.Y));
      a(bwj.z, gut::new);
      a(bwj.A, guu::new);
      a(bwj.B, $$0 -> new gwp($$0, gif.ae));
      a(bwj.C, guv::new);
      a(bwj.D, guw::new);
      a(bwj.E, gux::new);
      a(bwj.F, $$0 -> new gun($$0, gif.ap));
      a(bwj.G, $$0 -> new gun($$0, gif.aq));
      a(bwj.H, guz::new);
      a(bwj.I, $$0 -> new gva<>($$0, gva.a.a));
      a(bwj.J, gvb::new);
      a(bwj.K, gvc::new);
      a(bwj.L, gxx::new);
      a(bwj.M, gvd::new);
      a(bwj.N, gvg::new);
      a(bwj.O, gvh::new);
      a(bwj.P, gvf::new);
      a(bwj.Q, gxx::new);
      a(bwj.R, gve::new);
      a(bwj.S, gvn::new);
      a(bwj.T, gvm::new);
      a(bwj.U, gxx::new);
      a(bwj.V, gvo::new);
      a(bwj.W, $$0 -> new gxx<>($$0, 1.0F, true));
      a(bwj.X, gvp::new);
      a(bwj.Y, $$0 -> new gxx<>($$0, 3.0F, true));
      a(bwj.Z, gvq::new);
      a(bwj.bT, gvr::new);
      a(bwj.aa, gvs::new);
      a(bwj.ab, gvt::new);
      a(bwj.ac, $$0 -> new gwp($$0, gif.aW));
      a(bwj.ad, gvu::new);
      a(bwj.ae, $$0 -> new gvv($$0, 6.0F));
      a(bwj.af, gwh::new);
      a(bwj.ag, $$0 -> new gvw($$0, new ghh($$0.a(gif.bb)), new ghh($$0.a(gif.bc))));
      a(bwj.ah, gvx::new);
      a(bwj.ai, gvy::new);
      a(bwj.aj, gvz::new);
      a(bwj.ak, $$0 -> new gwp($$0, gif.bi));
      a(bwj.al, gwa::new);
      a(bwj.am, gwc::new);
      a(bwj.an, gwe::new);
      a(bwj.ao, gws::new);
      a(bwj.ap, gwf::new);
      a(bwj.aq, gwg::new);
      a(bwj.ar, guy.b::new);
      a(bwj.as, gwh::new);
      a(bwj.at, $$0 -> new gun($$0, gif.bx));
      a(bwj.au, $$0 -> new gun($$0, gif.by));
      a(bwj.av, gwj::new);
      a(bwj.aw, gwk::new);
      a(bwj.aW, gxx::new);
      a(bwj.ax, $$0 -> new gwm($$0, gif.bA, gif.bB));
      a(bwj.ay, gwn::new);
      a(bwj.az, gwo::new);
      a(bwj.aA, $$0 -> new gun($$0, gif.bG));
      a(bwj.aB, $$0 -> new gun($$0, gif.bH));
      a(bwj.aC, gws::new);
      a(bwj.aD, $$0 -> new gwp($$0, gif.bI));
      a(bwj.aE, gwr::new);
      a(bwj.aF, $$0 -> new gva<>($$0, gva.a.b));
      a(bwj.aG, $$0 -> new gun($$0, gif.bP));
      a(bwj.aH, $$0 -> new gun($$0, gif.bQ));
      a(bwj.aI, gwt::new);
      a(bwj.aJ, gwu::new);
      a(bwj.aK, gwv::new);
      a(bwj.aL, $$0 -> new gun($$0, gif.bT));
      a(bwj.aM, $$0 -> new gun($$0, gif.bU));
      a(bwj.aN, gww::new);
      a(bwj.aO, gwx::new);
      a(bwj.aP, gwy::new);
      a(bwj.aQ, gwz::new);
      a(bwj.aR, $$0 -> new gxa($$0, gif.ca, gif.cb, gif.ci, gif.cj, gif.cc, gif.cd));
      a(bwj.aS, $$0 -> new gxa($$0, gif.ce, gif.ce, gif.cf, gif.cg, gif.cf, gif.cg));
      a(bwj.aT, gxb::new);
      a(bwj.aU, gxc::new);
      a(bwj.aX, gxd::new);
      a(bwj.aY, gxe::new);
      a(bwj.aZ, gxg::new);
      a(bwj.ba, gxi::new);
      a(bwj.bb, gxj::new);
      a(bwj.bc, gxl::new);
      a(bwj.bd, gxk::new);
      a(bwj.be, gxm::new);
      a(bwj.bf, gxn::new);
      a(bwj.bg, $$0 -> new gye($$0, gye.a.a));
      a(bwj.bh, gxo::new);
      a(bwj.bi, $$0 -> new gxx<>($$0, 0.75F, true));
      a(bwj.bj, gxp::new);
      a(bwj.bk, gxx::new);
      a(bwj.bl, gxq::new);
      a(bwj.bm, $$0 -> new gwp($$0, gif.df));
      a(bwj.bn, gxr::new);
      a(bwj.bo, gxs::new);
      a(bwj.aV, gxx::new);
      a(bwj.bp, $$0 -> new gun($$0, gif.dh));
      a(bwj.bq, $$0 -> new gun($$0, gif.di));
      a(bwj.br, $$0 -> new gxt<>($$0, new ghh($$0.a(gif.dj)), new ghh($$0.a(gif.dk))));
      a(bwj.bs, gxu::new);
      a(bwj.bt, gxv::new);
      a(bwj.bu, gxw::new);
      a(bwj.bv, guy.c::new);
      a(bwj.bw, gyb::new);
      a(bwj.bx, gya::new);
      a(bwj.by, $$0 -> new gwm($$0, gif.dv, gif.dw));
      a(bwj.bz, gxy::new);
      a(bwj.bA, gyc::new);
      a(bwj.bB, gyd::new);
      a(bwj.bC, gyf::new);
      a(bwj.bD, gyg::new);
      a(bwj.bE, gyh::new);
      a(bwj.bF, gyi::new);
      a(bwj.bG, gyj::new);
      a(bwj.bH, gyk::new);
      a(bwj.bI, gyl::new);
      a(bwj.bJ, gym::new);
      a(bwj.bK, gyn::new);
      a(bwj.bL, gyo::new);
      a(bwj.bM, gyp::new);
      a(bwj.bN, gyq::new);
      a(bwj.bO, gyr::new);
      a(bwj.bP, $$0 -> new gye($$0, gye.a.b));
      a(bwj.bQ, gys::new);
      a(bwj.bR, $$0 -> new gyt($$0, gif.eq, gif.er, gif.eu, gif.ev, gif.es, gif.et));
   }
}
