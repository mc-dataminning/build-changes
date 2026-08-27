import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class gdc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bpd<?>, gdb<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gkb.a, gdb<fwr>> c = Map.of(gkb.a.b, $$0 -> new gif($$0, false), gkb.a.a, $$0 -> new gif($$0, true));

   private static <T extends box> void a(bpd<? extends T> $$0, gdb<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bpd<?>, gda<?>> a(gdb.a $$0) {
      Builder<bpd<?>, gda<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + ki.g.b((bpd<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gkb.a, gda<? extends ciu>> b(gdb.a $$0) {
      Builder<gkb.a, gda<? extends ciu>> $$1 = ImmutableMap.builder();
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

      for (bpd<?> $$1 : ki.g) {
         if ($$1 != bpd.by && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", ki.g.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bpd.b, gbx::new);
      a(bpd.c, gej::new);
      a(bpd.d, gby::new);
      a(bpd.e, gbz::new);
      a(bpd.f, gfo::new);
      a(bpd.g, gcb::new);
      a(bpd.h, gcc::new);
      a(bpd.i, gcd::new);
      a(bpd.j, gce::new);
      a(bpd.k, gcq.a::new);
      a(bpd.l, $$0 -> new gcf($$0, false));
      a(bpd.m, gcg::new);
      a(bpd.n, gch::new);
      a(bpd.o, gfz::new);
      a(bpd.q, gcj::new);
      a(bpd.p, $$0 -> new gci($$0, fre.v));
      a(bpd.r, gck::new);
      a(bpd.s, $$0 -> new gcf($$0, true));
      a(bpd.t, $$0 -> new geg<>($$0, fre.y));
      a(bpd.u, gcm::new);
      a(bpd.v, gcn::new);
      a(bpd.w, $$0 -> new geg<>($$0, fre.B));
      a(bpd.x, gco::new);
      a(bpd.y, gcp::new);
      a(bpd.z, gcr::new);
      a(bpd.A, $$0 -> new gcl<>($$0, 0.87F, fre.N));
      a(bpd.B, gcs::new);
      a(bpd.C, gct::new);
      a(bpd.D, gfm::new);
      a(bpd.E, gcu::new);
      a(bpd.I, gcx::new);
      a(bpd.J, gcy::new);
      a(bpd.G, gcw::new);
      a(bpd.H, gfm::new);
      a(bpd.F, gcv::new);
      a(bpd.K, gde::new);
      a(bpd.L, gdd::new);
      a(bpd.M, gfm::new);
      a(bpd.N, gdf::new);
      a(bpd.O, $$0 -> new gfm<>($$0, 1.0F, true));
      a(bpd.P, gdg::new);
      a(bpd.ak, $$0 -> new gfm<>($$0, 3.0F, true));
      a(bpd.Q, gdh::new);
      a(bpd.bz, gdi::new);
      a(bpd.R, gdj::new);
      a(bpd.S, gdk::new);
      a(bpd.T, $$0 -> new geg<>($$0, fre.af));
      a(bpd.U, gdl::new);
      a(bpd.V, $$0 -> new gdm($$0, 6.0F));
      a(bpd.W, gdy::new);
      a(bpd.X, $$0 -> new gdn($$0, new fqh<>($$0.a(fre.ak))));
      a(bpd.Y, gdo::new);
      a(bpd.Z, gdp::new);
      a(bpd.aa, gdq::new);
      a(bpd.ab, $$0 -> new geg<>($$0, fre.ao));
      a(bpd.ac, gdr::new);
      a(bpd.ad, gdt::new);
      a(bpd.ae, gdv::new);
      a(bpd.af, gej::new);
      a(bpd.ag, gdw::new);
      a(bpd.ah, gdx::new);
      a(bpd.ai, gcq.b::new);
      a(bpd.aj, gdy::new);
      a(bpd.al, gea::new);
      a(bpd.am, geb::new);
      a(bpd.an, $$0 -> new ged($$0, fre.ax));
      a(bpd.ao, gee::new);
      a(bpd.ap, gef::new);
      a(bpd.aq, gej::new);
      a(bpd.ar, $$0 -> new geg<>($$0, fre.aB));
      a(bpd.as, gei::new);
      a(bpd.at, $$0 -> new gcl<>($$0, 0.92F, fre.aD));
      a(bpd.au, gek::new);
      a(bpd.av, gel::new);
      a(bpd.aw, gem::new);
      a(bpd.ax, gen::new);
      a(bpd.ay, geo::new);
      a(bpd.az, gep::new);
      a(bpd.aA, $$0 -> new geq($$0, fre.aJ, fre.aO, fre.aP, false));
      a(bpd.aB, $$0 -> new geq($$0, fre.aK, fre.aL, fre.aM, false));
      a(bpd.aC, ger::new);
      a(bpd.aD, ges::new);
      a(bpd.aE, gfm::new);
      a(bpd.aF, get::new);
      a(bpd.aG, geu::new);
      a(bpd.aH, gev::new);
      a(bpd.aI, gex::new);
      a(bpd.aJ, gey::new);
      a(bpd.aK, gfa::new);
      a(bpd.aL, gez::new);
      a(bpd.aM, gfb::new);
      a(bpd.aN, gfc::new);
      a(bpd.aO, $$0 -> new gft($$0, fre.bo));
      a(bpd.aP, gfd::new);
      a(bpd.aQ, $$0 -> new gfm<>($$0, 0.75F, true));
      a(bpd.aR, gfe::new);
      a(bpd.aT, gfm::new);
      a(bpd.aS, gff::new);
      a(bpd.aU, $$0 -> new geg<>($$0, fre.bw));
      a(bpd.aV, gfg::new);
      a(bpd.aW, gfh::new);
      a(bpd.aX, $$0 -> new gfi<>($$0, new fqh<>($$0.a(fre.by))));
      a(bpd.aY, gfj::new);
      a(bpd.aZ, gfk::new);
      a(bpd.ba, gfl::new);
      a(bpd.bb, gcq.c::new);
      a(bpd.bc, gfq::new);
      a(bpd.bd, gfp::new);
      a(bpd.be, $$0 -> new ged($$0, fre.bH));
      a(bpd.bf, gfn::new);
      a(bpd.bg, gfr::new);
      a(bpd.bh, gfs::new);
      a(bpd.bi, gfu::new);
      a(bpd.bj, gfv::new);
      a(bpd.bk, gfw::new);
      a(bpd.bm, gfy::new);
      a(bpd.bl, gfx::new);
      a(bpd.bn, gfz::new);
      a(bpd.bo, gga::new);
      a(bpd.bp, ggb::new);
      a(bpd.bq, ggc::new);
      a(bpd.br, ggd::new);
      a(bpd.bs, gge::new);
      a(bpd.bt, ggf::new);
      a(bpd.bu, ggg::new);
      a(bpd.bv, $$0 -> new gft($$0, fre.ch));
      a(bpd.bw, ggh::new);
      a(bpd.bx, $$0 -> new geq($$0, fre.cn, fre.co, fre.cp, true));
   }
}
