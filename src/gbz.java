import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gbz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bol<?>, gby<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<giy.a, gby<fvp>> c = Map.of(giy.a.b, $$0 -> new ghc($$0, false), giy.a.a, $$0 -> new ghc($$0, true));

   private static <T extends bof> void a(bol<? extends T> $$0, gby<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bol<?>, gbx<?>> a(gby.a $$0) {
      Builder<bol<?>, gbx<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + kh.g.b((bol<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<giy.a, gbx<? extends cia>> b(gby.a $$0) {
      Builder<giy.a, gbx<? extends cia>> $$1 = ImmutableMap.builder();
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

      for (bol<?> $$1 : kh.g) {
         if ($$1 != bol.bw && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", kh.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bol.b, gav::new);
      a(bol.c, gdg::new);
      a(bol.d, gaw::new);
      a(bol.e, gax::new);
      a(bol.f, gel::new);
      a(bol.g, gaz::new);
      a(bol.h, gba::new);
      a(bol.i, gbb::new);
      a(bol.j, gbc::new);
      a(bol.k, gbn.a::new);
      a(bol.l, $$0 -> new gbd($$0, false));
      a(bol.m, gbe::new);
      a(bol.o, gbg::new);
      a(bol.n, $$0 -> new gbf($$0, fqe.r));
      a(bol.p, gbh::new);
      a(bol.q, $$0 -> new gbd($$0, true));
      a(bol.r, $$0 -> new gdd<>($$0, fqe.u));
      a(bol.s, gbj::new);
      a(bol.t, gbk::new);
      a(bol.u, $$0 -> new gdd<>($$0, fqe.x));
      a(bol.v, gbl::new);
      a(bol.w, gbm::new);
      a(bol.x, gbo::new);
      a(bol.y, $$0 -> new gbi<>($$0, 0.87F, fqe.J));
      a(bol.z, gbp::new);
      a(bol.A, gbq::new);
      a(bol.B, gej::new);
      a(bol.C, gbr::new);
      a(bol.G, gbu::new);
      a(bol.H, gbv::new);
      a(bol.E, gbt::new);
      a(bol.F, gej::new);
      a(bol.D, gbs::new);
      a(bol.I, gcb::new);
      a(bol.J, gca::new);
      a(bol.K, gej::new);
      a(bol.L, gcc::new);
      a(bol.M, $$0 -> new gej<>($$0, 1.0F, true));
      a(bol.N, gcd::new);
      a(bol.ai, $$0 -> new gej<>($$0, 3.0F, true));
      a(bol.O, gce::new);
      a(bol.bx, gcf::new);
      a(bol.P, gcg::new);
      a(bol.Q, gch::new);
      a(bol.R, $$0 -> new gdd<>($$0, fqe.ab));
      a(bol.S, gci::new);
      a(bol.T, $$0 -> new gcj($$0, 6.0F));
      a(bol.U, gcv::new);
      a(bol.V, $$0 -> new gck($$0, new fph<>($$0.a(fqe.ag))));
      a(bol.W, gcl::new);
      a(bol.X, gcm::new);
      a(bol.Y, gcn::new);
      a(bol.Z, $$0 -> new gdd<>($$0, fqe.ak));
      a(bol.aa, gco::new);
      a(bol.ab, gcq::new);
      a(bol.ac, gcs::new);
      a(bol.ad, gdg::new);
      a(bol.ae, gct::new);
      a(bol.af, gcu::new);
      a(bol.ag, gbn.b::new);
      a(bol.ah, gcv::new);
      a(bol.aj, gcx::new);
      a(bol.ak, gcy::new);
      a(bol.al, $$0 -> new gda($$0, fqe.at));
      a(bol.am, gdb::new);
      a(bol.an, gdc::new);
      a(bol.ao, gdg::new);
      a(bol.ap, $$0 -> new gdd<>($$0, fqe.ax));
      a(bol.aq, gdf::new);
      a(bol.ar, $$0 -> new gbi<>($$0, 0.92F, fqe.az));
      a(bol.as, gdh::new);
      a(bol.at, gdi::new);
      a(bol.au, gdj::new);
      a(bol.av, gdk::new);
      a(bol.aw, gdl::new);
      a(bol.ax, gdm::new);
      a(bol.ay, $$0 -> new gdn($$0, fqe.aF, fqe.aK, fqe.aL, false));
      a(bol.az, $$0 -> new gdn($$0, fqe.aG, fqe.aH, fqe.aI, false));
      a(bol.aA, gdo::new);
      a(bol.aB, gdp::new);
      a(bol.aC, gej::new);
      a(bol.aD, gdq::new);
      a(bol.aE, gdr::new);
      a(bol.aF, gds::new);
      a(bol.aG, gdu::new);
      a(bol.aH, gdv::new);
      a(bol.aI, gdx::new);
      a(bol.aJ, gdw::new);
      a(bol.aK, gdy::new);
      a(bol.aL, gdz::new);
      a(bol.aM, $$0 -> new geq($$0, fqe.bk));
      a(bol.aN, gea::new);
      a(bol.aO, $$0 -> new gej<>($$0, 0.75F, true));
      a(bol.aP, geb::new);
      a(bol.aR, gej::new);
      a(bol.aQ, gec::new);
      a(bol.aS, $$0 -> new gdd<>($$0, fqe.bs));
      a(bol.aT, ged::new);
      a(bol.aU, gee::new);
      a(bol.aV, $$0 -> new gef<>($$0, new fph<>($$0.a(fqe.bu))));
      a(bol.aW, geg::new);
      a(bol.aX, geh::new);
      a(bol.aY, gei::new);
      a(bol.aZ, gbn.c::new);
      a(bol.ba, gen::new);
      a(bol.bb, gem::new);
      a(bol.bc, $$0 -> new gda($$0, fqe.bD));
      a(bol.bd, gek::new);
      a(bol.be, geo::new);
      a(bol.bf, gep::new);
      a(bol.bg, ger::new);
      a(bol.bh, ges::new);
      a(bol.bi, get::new);
      a(bol.bk, gev::new);
      a(bol.bj, geu::new);
      a(bol.bl, gew::new);
      a(bol.bm, gex::new);
      a(bol.bn, gey::new);
      a(bol.bo, gez::new);
      a(bol.bp, gfa::new);
      a(bol.bq, gfb::new);
      a(bol.br, gfc::new);
      a(bol.bs, gfd::new);
      a(bol.bt, $$0 -> new geq($$0, fqe.cd));
      a(bol.bu, gfe::new);
      a(bol.bv, $$0 -> new gdn($$0, fqe.cj, fqe.ck, fqe.cl, true));
   }
}
