import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class grp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvq<?>, gro<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<hck.a, gro<gkc>> c = Map.of(hck.a.b, $$0 -> new gwv($$0, false), hck.a.a, $$0 -> new gwv($$0, true));

   private static <T extends bvj> void a(bvq<? extends T> $$0, gro<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bvq<?>, grn<?, ?>> a(gro.a $$0) {
      Builder<bvq<?>, grn<?, ?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ma.f.b((bvq<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<hck.a, grn<? extends cpw, ?>> b(gro.a $$0) {
      Builder<hck.a, grn<? extends cpw, ?>> $$1 = ImmutableMap.builder();
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

      for (bvq<?> $$1 : ma.f) {
         if ($$1 != bvq.bS && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ma.f.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bvq.c, gqj::new);
      a(bvq.d, gsw::new);
      a(bvq.e, gqk::new);
      a(bvq.f, gql::new);
      a(bvq.g, gud::new);
      a(bvq.h, gqn::new);
      a(bvq.k, gqo::new);
      a(bvq.l, gqp::new);
      a(bvq.o, gqq::new);
      a(bvq.p, grc.a::new);
      a(bvq.aH, $$0 -> new gqr($$0, gel.bC));
      a(bvq.bp, $$0 -> new gqr($$0, gel.cS));
      a(bvq.m, $$0 -> new gqr($$0, gel.y));
      a(bvq.au, $$0 -> new gqr($$0, gel.bm));
      a(bvq.a, $$0 -> new gqr($$0, gel.a));
      a(bvq.w, $$0 -> new gqr($$0, gel.Q));
      a(bvq.G, $$0 -> new gqr($$0, gel.ai));
      a(bvq.aM, $$0 -> new gqr($$0, gel.bG));
      a(bvq.aB, $$0 -> new gqr($$0, gel.bv));
      a(bvq.j, $$0 -> new gtj($$0, gel.p));
      a(bvq.q, gqs::new);
      a(bvq.r, gqt::new);
      a(bvq.s, guo::new);
      a(bvq.u, gqv::new);
      a(bvq.t, gqu::new);
      a(bvq.v, gqw::new);
      a(bvq.aI, $$0 -> new gqr($$0, gel.bD));
      a(bvq.bq, $$0 -> new gqr($$0, gel.cT));
      a(bvq.n, $$0 -> new gqr($$0, gel.z));
      a(bvq.av, $$0 -> new gqr($$0, gel.bn));
      a(bvq.b, $$0 -> new gqr($$0, gel.b));
      a(bvq.x, $$0 -> new gqr($$0, gel.R));
      a(bvq.H, $$0 -> new gqr($$0, gel.aj));
      a(bvq.aN, $$0 -> new gqr($$0, gel.bH));
      a(bvq.aC, $$0 -> new gqr($$0, gel.bw));
      a(bvq.i, $$0 -> new gtj($$0, gel.o));
      a(bvq.y, $$0 -> new gst($$0, gel.T));
      a(bvq.z, gqx::new);
      a(bvq.A, gqy::new);
      a(bvq.B, $$0 -> new gst($$0, gel.X));
      a(bvq.C, gqz::new);
      a(bvq.D, gra::new);
      a(bvq.E, gra::new);
      a(bvq.F, grb::new);
      a(bvq.I, grd::new);
      a(bvq.J, $$0 -> new gre<>($$0, 0.87F, gel.ao, gel.ap, false));
      a(bvq.K, grf::new);
      a(bvq.L, grg::new);
      a(bvq.M, gub::new);
      a(bvq.N, grh::new);
      a(bvq.O, grk::new);
      a(bvq.P, grl::new);
      a(bvq.Q, grj::new);
      a(bvq.R, gub::new);
      a(bvq.S, gri::new);
      a(bvq.T, grr::new);
      a(bvq.U, grq::new);
      a(bvq.V, gub::new);
      a(bvq.W, grs::new);
      a(bvq.X, $$0 -> new gub<>($$0, 1.0F, true));
      a(bvq.Y, grt::new);
      a(bvq.Z, $$0 -> new gub<>($$0, 3.0F, true));
      a(bvq.aa, gru::new);
      a(bvq.bT, grv::new);
      a(bvq.ab, grw::new);
      a(bvq.ac, grx::new);
      a(bvq.ad, $$0 -> new gst($$0, gel.aN));
      a(bvq.ae, gry::new);
      a(bvq.af, $$0 -> new grz($$0, 6.0F));
      a(bvq.ag, gsl::new);
      a(bvq.ah, $$0 -> new gsa($$0, new gdn($$0.a(gel.aS)), new gdn($$0.a(gel.aT))));
      a(bvq.ai, gsb::new);
      a(bvq.aj, gsc::new);
      a(bvq.ak, gsd::new);
      a(bvq.al, $$0 -> new gst($$0, gel.aZ));
      a(bvq.am, gse::new);
      a(bvq.an, gsg::new);
      a(bvq.ao, gsi::new);
      a(bvq.ap, gsw::new);
      a(bvq.aq, gsj::new);
      a(bvq.ar, gsk::new);
      a(bvq.as, grc.b::new);
      a(bvq.at, gsl::new);
      a(bvq.aK, gsy::new);
      a(bvq.aw, gsn::new);
      a(bvq.ax, gso::new);
      a(bvq.ay, $$0 -> new gsq($$0, gel.bp, gel.bq));
      a(bvq.az, gsr::new);
      a(bvq.aA, gss::new);
      a(bvq.aD, gsw::new);
      a(bvq.aE, $$0 -> new gst($$0, gel.bx));
      a(bvq.aF, gsv::new);
      a(bvq.aG, $$0 -> new gre<>($$0, 0.92F, gel.bA, gel.bB, true));
      a(bvq.aJ, gsx::new);
      a(bvq.aL, gsz::new);
      a(bvq.aO, gta::new);
      a(bvq.aP, gtb::new);
      a(bvq.aQ, gtc::new);
      a(bvq.aR, gtd::new);
      a(bvq.aS, $$0 -> new gte($$0, gel.bN, gel.bO, gel.bV, gel.bW, gel.bP, gel.bQ));
      a(bvq.aT, $$0 -> new gte($$0, gel.bR, gel.bR, gel.bS, gel.bT, gel.bS, gel.bT));
      a(bvq.aU, gtf::new);
      a(bvq.aV, gtg::new);
      a(bvq.aW, gub::new);
      a(bvq.aX, gth::new);
      a(bvq.aY, gti::new);
      a(bvq.aZ, gtk::new);
      a(bvq.ba, gtm::new);
      a(bvq.bb, gtn::new);
      a(bvq.bc, gtp::new);
      a(bvq.bd, gto::new);
      a(bvq.be, gtq::new);
      a(bvq.bf, gtr::new);
      a(bvq.bg, $$0 -> new gui($$0, gel.cG, gel.cH, true));
      a(bvq.bh, gts::new);
      a(bvq.bi, $$0 -> new gub<>($$0, 0.75F, true));
      a(bvq.bj, gtt::new);
      a(bvq.bk, gub::new);
      a(bvq.bl, gtu::new);
      a(bvq.bm, $$0 -> new gst($$0, gel.cQ));
      a(bvq.bn, gtv::new);
      a(bvq.bo, gtw::new);
      a(bvq.br, $$0 -> new gtx<>($$0, new gdn($$0.a(gel.cU)), new gdn($$0.a(gel.cV))));
      a(bvq.bs, gty::new);
      a(bvq.bt, gtz::new);
      a(bvq.bu, gua::new);
      a(bvq.bv, grc.c::new);
      a(bvq.bw, guf::new);
      a(bvq.bx, gue::new);
      a(bvq.by, $$0 -> new gsq($$0, gel.de, gel.df));
      a(bvq.bz, guc::new);
      a(bvq.bA, gug::new);
      a(bvq.bB, guh::new);
      a(bvq.bC, guj::new);
      a(bvq.bD, guk::new);
      a(bvq.bE, gul::new);
      a(bvq.bG, gun::new);
      a(bvq.bF, gum::new);
      a(bvq.bH, guo::new);
      a(bvq.bI, gup::new);
      a(bvq.bJ, guq::new);
      a(bvq.bK, gur::new);
      a(bvq.bL, gus::new);
      a(bvq.bM, gut::new);
      a(bvq.bN, guu::new);
      a(bvq.bO, guv::new);
      a(bvq.bP, $$0 -> new gui($$0, gel.dM, gel.dN, false));
      a(bvq.bQ, guw::new);
      a(bvq.bR, $$0 -> new gux($$0, gel.dW, gel.dX, gel.ea, gel.eb, gel.dY, gel.dZ));
   }
}
