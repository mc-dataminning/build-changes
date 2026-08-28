import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gug {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwb<?>, guf<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hhu.a, guf<gmt>> c = Map.of(hhu.a.b, $$0 -> new gzl($$0, false), hhu.a.a, $$0 -> new gzl($$0, true));

   private static <T extends bvs> void a(bwb<? extends T> $$0, guf<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bwb<?>, gue<?, ?>> a(guf.a $$0) {
      Builder<bwb<?>, gue<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + md.f.b((bwb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hhu.a, gue<? extends cqi, ?>> b(guf.a $$0) {
      Builder<hhu.a, gue<? extends cqi, ?>> $$1 = ImmutableMap.builder();
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

      for (bwb<?> $$1 : md.f) {
         if ($$1 != bwb.bR && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", md.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bwb.c, gta::new);
      a(bwb.d, gvn::new);
      a(bwb.e, gtb::new);
      a(bwb.f, gtc::new);
      a(bwb.g, gwu::new);
      a(bwb.h, gte::new);
      a(bwb.k, gtf::new);
      a(bwb.l, gtg::new);
      a(bwb.o, gth::new);
      a(bwb.p, gtt.a::new);
      a(bwb.aG, $$0 -> new gti($$0, ghc.bP));
      a(bwb.bo, $$0 -> new gti($$0, ghc.dh));
      a(bwb.m, $$0 -> new gti($$0, ghc.B));
      a(bwb.at, $$0 -> new gti($$0, ghc.bx));
      a(bwb.a, $$0 -> new gti($$0, ghc.a));
      a(bwb.w, $$0 -> new gti($$0, ghc.V));
      a(bwb.F, $$0 -> new gti($$0, ghc.ap));
      a(bwb.aL, $$0 -> new gti($$0, ghc.bT));
      a(bwb.aA, $$0 -> new gti($$0, ghc.bG));
      a(bwb.j, $$0 -> new gwa($$0, ghc.p));
      a(bwb.q, gtj::new);
      a(bwb.r, gtk::new);
      a(bwb.s, gxf::new);
      a(bwb.u, gtm::new);
      a(bwb.t, gtl::new);
      a(bwb.v, gtn::new);
      a(bwb.aH, $$0 -> new gti($$0, ghc.bQ));
      a(bwb.bp, $$0 -> new gti($$0, ghc.di));
      a(bwb.n, $$0 -> new gti($$0, ghc.C));
      a(bwb.au, $$0 -> new gti($$0, ghc.by));
      a(bwb.b, $$0 -> new gti($$0, ghc.b));
      a(bwb.x, $$0 -> new gti($$0, ghc.W));
      a(bwb.G, $$0 -> new gti($$0, ghc.aq));
      a(bwb.aM, $$0 -> new gti($$0, ghc.bU));
      a(bwb.aB, $$0 -> new gti($$0, ghc.bH));
      a(bwb.i, $$0 -> new gwa($$0, ghc.o));
      a(bwb.y, $$0 -> new gvk($$0, ghc.Y));
      a(bwb.z, gto::new);
      a(bwb.A, gtp::new);
      a(bwb.B, $$0 -> new gvk($$0, ghc.ae));
      a(bwb.C, gtq::new);
      a(bwb.D, gtr::new);
      a(bwb.E, gts::new);
      a(bwb.H, gtu::new);
      a(bwb.I, $$0 -> new gtv<>($$0, gtv.a.a));
      a(bwb.J, gtw::new);
      a(bwb.K, gtx::new);
      a(bwb.L, gws::new);
      a(bwb.M, gty::new);
      a(bwb.N, gub::new);
      a(bwb.O, guc::new);
      a(bwb.P, gua::new);
      a(bwb.Q, gws::new);
      a(bwb.R, gtz::new);
      a(bwb.S, gui::new);
      a(bwb.T, guh::new);
      a(bwb.U, gws::new);
      a(bwb.V, guj::new);
      a(bwb.W, $$0 -> new gws<>($$0, 1.0F, true));
      a(bwb.X, guk::new);
      a(bwb.Y, $$0 -> new gws<>($$0, 3.0F, true));
      a(bwb.Z, gul::new);
      a(bwb.bS, gum::new);
      a(bwb.aa, gun::new);
      a(bwb.ab, guo::new);
      a(bwb.ac, $$0 -> new gvk($$0, ghc.aW));
      a(bwb.ad, gup::new);
      a(bwb.ae, $$0 -> new guq($$0, 6.0F));
      a(bwb.af, gvc::new);
      a(bwb.ag, $$0 -> new gur($$0, new gge($$0.a(ghc.bb)), new gge($$0.a(ghc.bc))));
      a(bwb.ah, gus::new);
      a(bwb.ai, gut::new);
      a(bwb.aj, guu::new);
      a(bwb.ak, $$0 -> new gvk($$0, ghc.bi));
      a(bwb.al, guv::new);
      a(bwb.am, gux::new);
      a(bwb.an, guz::new);
      a(bwb.ao, gvn::new);
      a(bwb.ap, gva::new);
      a(bwb.aq, gvb::new);
      a(bwb.ar, gtt.b::new);
      a(bwb.as, gvc::new);
      a(bwb.aJ, gvp::new);
      a(bwb.av, gve::new);
      a(bwb.aw, gvf::new);
      a(bwb.ax, $$0 -> new gvh($$0, ghc.bA, ghc.bB));
      a(bwb.ay, gvi::new);
      a(bwb.az, gvj::new);
      a(bwb.aC, gvn::new);
      a(bwb.aD, $$0 -> new gvk($$0, ghc.bI));
      a(bwb.aE, gvm::new);
      a(bwb.aF, $$0 -> new gtv<>($$0, gtv.a.b));
      a(bwb.aI, gvo::new);
      a(bwb.aK, gvq::new);
      a(bwb.aN, gvr::new);
      a(bwb.aO, gvs::new);
      a(bwb.aP, gvt::new);
      a(bwb.aQ, gvu::new);
      a(bwb.aR, $$0 -> new gvv($$0, ghc.ca, ghc.cb, ghc.ci, ghc.cj, ghc.cc, ghc.cd));
      a(bwb.aS, $$0 -> new gvv($$0, ghc.ce, ghc.ce, ghc.cf, ghc.cg, ghc.cf, ghc.cg));
      a(bwb.aT, gvw::new);
      a(bwb.aU, gvx::new);
      a(bwb.aV, gws::new);
      a(bwb.aW, gvy::new);
      a(bwb.aX, gvz::new);
      a(bwb.aY, gwb::new);
      a(bwb.aZ, gwd::new);
      a(bwb.ba, gwe::new);
      a(bwb.bb, gwg::new);
      a(bwb.bc, gwf::new);
      a(bwb.bd, gwh::new);
      a(bwb.be, gwi::new);
      a(bwb.bf, $$0 -> new gwz($$0, gwz.a.a));
      a(bwb.bg, gwj::new);
      a(bwb.bh, $$0 -> new gws<>($$0, 0.75F, true));
      a(bwb.bi, gwk::new);
      a(bwb.bj, gws::new);
      a(bwb.bk, gwl::new);
      a(bwb.bl, $$0 -> new gvk($$0, ghc.df));
      a(bwb.bm, gwm::new);
      a(bwb.bn, gwn::new);
      a(bwb.bq, $$0 -> new gwo<>($$0, new gge($$0.a(ghc.dj)), new gge($$0.a(ghc.dk))));
      a(bwb.br, gwp::new);
      a(bwb.bs, gwq::new);
      a(bwb.bt, gwr::new);
      a(bwb.bu, gtt.c::new);
      a(bwb.bv, gww::new);
      a(bwb.bw, gwv::new);
      a(bwb.bx, $$0 -> new gvh($$0, ghc.dv, ghc.dw));
      a(bwb.by, gwt::new);
      a(bwb.bz, gwx::new);
      a(bwb.bA, gwy::new);
      a(bwb.bB, gxa::new);
      a(bwb.bC, gxb::new);
      a(bwb.bD, gxc::new);
      a(bwb.bF, gxe::new);
      a(bwb.bE, gxd::new);
      a(bwb.bG, gxf::new);
      a(bwb.bH, gxg::new);
      a(bwb.bI, gxh::new);
      a(bwb.bJ, gxi::new);
      a(bwb.bK, gxj::new);
      a(bwb.bL, gxk::new);
      a(bwb.bM, gxl::new);
      a(bwb.bN, gxm::new);
      a(bwb.bO, $$0 -> new gwz($$0, gwz.a.b));
      a(bwb.bP, gxn::new);
      a(bwb.bQ, $$0 -> new gxo($$0, ghc.eq, ghc.er, ghc.eu, ghc.ev, ghc.es, ghc.et));
   }
}
