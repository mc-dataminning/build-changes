import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gcz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bpc<?>, gcy<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gjy.a, gcy<fwp>> c = Map.of(gjy.a.b, $$0 -> new gic($$0, false), gjy.a.a, $$0 -> new gic($$0, true));

   private static <T extends bow> void a(bpc<? extends T> $$0, gcy<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bpc<?>, gcx<?>> a(gcy.a $$0) {
      Builder<bpc<?>, gcx<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ki.g.b((bpc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gjy.a, gcx<? extends cis>> b(gcy.a $$0) {
      Builder<gjy.a, gcx<? extends cis>> $$1 = ImmutableMap.builder();
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

      for (bpc<?> $$1 : ki.g) {
         if ($$1 != bpc.bx && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ki.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bpc.b, gbv::new);
      a(bpc.c, geg::new);
      a(bpc.d, gbw::new);
      a(bpc.e, gbx::new);
      a(bpc.f, gfl::new);
      a(bpc.g, gbz::new);
      a(bpc.h, gca::new);
      a(bpc.i, gcb::new);
      a(bpc.j, gcc::new);
      a(bpc.k, gcn.a::new);
      a(bpc.l, $$0 -> new gcd($$0, false));
      a(bpc.m, gce::new);
      a(bpc.n, gfw::new);
      a(bpc.p, gcg::new);
      a(bpc.o, $$0 -> new gcf($$0, frc.r));
      a(bpc.q, gch::new);
      a(bpc.r, $$0 -> new gcd($$0, true));
      a(bpc.s, $$0 -> new ged<>($$0, frc.u));
      a(bpc.t, gcj::new);
      a(bpc.u, gck::new);
      a(bpc.v, $$0 -> new ged<>($$0, frc.x));
      a(bpc.w, gcl::new);
      a(bpc.x, gcm::new);
      a(bpc.y, gco::new);
      a(bpc.z, $$0 -> new gci<>($$0, 0.87F, frc.J));
      a(bpc.A, gcp::new);
      a(bpc.B, gcq::new);
      a(bpc.C, gfj::new);
      a(bpc.D, gcr::new);
      a(bpc.H, gcu::new);
      a(bpc.I, gcv::new);
      a(bpc.F, gct::new);
      a(bpc.G, gfj::new);
      a(bpc.E, gcs::new);
      a(bpc.J, gdb::new);
      a(bpc.K, gda::new);
      a(bpc.L, gfj::new);
      a(bpc.M, gdc::new);
      a(bpc.N, $$0 -> new gfj<>($$0, 1.0F, true));
      a(bpc.O, gdd::new);
      a(bpc.aj, $$0 -> new gfj<>($$0, 3.0F, true));
      a(bpc.P, gde::new);
      a(bpc.by, gdf::new);
      a(bpc.Q, gdg::new);
      a(bpc.R, gdh::new);
      a(bpc.S, $$0 -> new ged<>($$0, frc.ab));
      a(bpc.T, gdi::new);
      a(bpc.U, $$0 -> new gdj($$0, 6.0F));
      a(bpc.V, gdv::new);
      a(bpc.W, $$0 -> new gdk($$0, new fqf<>($$0.a(frc.ag))));
      a(bpc.X, gdl::new);
      a(bpc.Y, gdm::new);
      a(bpc.Z, gdn::new);
      a(bpc.aa, $$0 -> new ged<>($$0, frc.ak));
      a(bpc.ab, gdo::new);
      a(bpc.ac, gdq::new);
      a(bpc.ad, gds::new);
      a(bpc.ae, geg::new);
      a(bpc.af, gdt::new);
      a(bpc.ag, gdu::new);
      a(bpc.ah, gcn.b::new);
      a(bpc.ai, gdv::new);
      a(bpc.ak, gdx::new);
      a(bpc.al, gdy::new);
      a(bpc.am, $$0 -> new gea($$0, frc.at));
      a(bpc.an, geb::new);
      a(bpc.ao, gec::new);
      a(bpc.ap, geg::new);
      a(bpc.aq, $$0 -> new ged<>($$0, frc.ax));
      a(bpc.ar, gef::new);
      a(bpc.as, $$0 -> new gci<>($$0, 0.92F, frc.az));
      a(bpc.at, geh::new);
      a(bpc.au, gei::new);
      a(bpc.av, gej::new);
      a(bpc.aw, gek::new);
      a(bpc.ax, gel::new);
      a(bpc.ay, gem::new);
      a(bpc.az, $$0 -> new gen($$0, frc.aF, frc.aK, frc.aL, false));
      a(bpc.aA, $$0 -> new gen($$0, frc.aG, frc.aH, frc.aI, false));
      a(bpc.aB, geo::new);
      a(bpc.aC, gep::new);
      a(bpc.aD, gfj::new);
      a(bpc.aE, geq::new);
      a(bpc.aF, ger::new);
      a(bpc.aG, ges::new);
      a(bpc.aH, geu::new);
      a(bpc.aI, gev::new);
      a(bpc.aJ, gex::new);
      a(bpc.aK, gew::new);
      a(bpc.aL, gey::new);
      a(bpc.aM, gez::new);
      a(bpc.aN, $$0 -> new gfq($$0, frc.bk));
      a(bpc.aO, gfa::new);
      a(bpc.aP, $$0 -> new gfj<>($$0, 0.75F, true));
      a(bpc.aQ, gfb::new);
      a(bpc.aS, gfj::new);
      a(bpc.aR, gfc::new);
      a(bpc.aT, $$0 -> new ged<>($$0, frc.bs));
      a(bpc.aU, gfd::new);
      a(bpc.aV, gfe::new);
      a(bpc.aW, $$0 -> new gff<>($$0, new fqf<>($$0.a(frc.bu))));
      a(bpc.aX, gfg::new);
      a(bpc.aY, gfh::new);
      a(bpc.aZ, gfi::new);
      a(bpc.ba, gcn.c::new);
      a(bpc.bb, gfn::new);
      a(bpc.bc, gfm::new);
      a(bpc.bd, $$0 -> new gea($$0, frc.bD));
      a(bpc.be, gfk::new);
      a(bpc.bf, gfo::new);
      a(bpc.bg, gfp::new);
      a(bpc.bh, gfr::new);
      a(bpc.bi, gfs::new);
      a(bpc.bj, gft::new);
      a(bpc.bl, gfv::new);
      a(bpc.bk, gfu::new);
      a(bpc.bm, gfw::new);
      a(bpc.bn, gfx::new);
      a(bpc.bo, gfy::new);
      a(bpc.bp, gfz::new);
      a(bpc.bq, gga::new);
      a(bpc.br, ggb::new);
      a(bpc.bs, ggc::new);
      a(bpc.bt, ggd::new);
      a(bpc.bu, $$0 -> new gfq($$0, frc.cd));
      a(bpc.bv, gge::new);
      a(bpc.bw, $$0 -> new gen($$0, frc.cj, frc.ck, frc.cl, true));
   }
}
