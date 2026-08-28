import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfl {
   private static final Map<dpe<?>, gfk<?>> a = Maps.newHashMap();

   private static <T extends dpc> void a(dpe<? extends T> $$0, gfk<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dpe<?>, gfj<?>> a(gfk.a $$0) {
      Builder<dpe<?>, gfj<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dpe<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dpe.h, gfx::new);
      a(dpe.i, gft::new);
      a(dpe.j, gfz::new);
      a(dpe.k, gfv::new);
      a(dpe.b, gfp::new);
      a(dpe.d, gfp::new);
      a(dpe.c, gfp::new);
      a(dpe.m, gfs::new);
      a(dpe.D, gfu::new);
      a(dpe.n, ggc::new);
      a(dpe.v, ggb::new);
      a(dpe.o, gff::new);
      a(dpe.p, gfy::new);
      a(dpe.t, gfe::new);
      a(dpe.u, gga::new);
      a(dpe.x, gfw::new);
      a(dpe.y, gfg::new);
      a(dpe.z, gfq::new);
      a(dpe.E, gfh::new);
      a(dpe.G, gfo::new);
      a(dpe.N, gfn::new);
      a(dpe.O, gfr::new);
      a(dpe.Q, ggd::new);
      a(dpe.R, gge::new);
   }
}
