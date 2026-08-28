import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gfo {
   private static final Map<dph<?>, gfn<?>> a = Maps.newHashMap();

   private static <T extends dpf> void a(dph<? extends T> $$0, gfn<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dph<?>, gfm<?>> a(gfn.a $$0) {
      Builder<dph<?>, gfm<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lp.k.b((dph<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dph.h, gga::new);
      a(dph.i, gfw::new);
      a(dph.j, ggc::new);
      a(dph.k, gfy::new);
      a(dph.b, gfs::new);
      a(dph.d, gfs::new);
      a(dph.c, gfs::new);
      a(dph.m, gfv::new);
      a(dph.D, gfx::new);
      a(dph.n, ggf::new);
      a(dph.v, gge::new);
      a(dph.o, gfi::new);
      a(dph.p, ggb::new);
      a(dph.t, gfh::new);
      a(dph.u, ggd::new);
      a(dph.x, gfz::new);
      a(dph.y, gfj::new);
      a(dph.z, gft::new);
      a(dph.E, gfk::new);
      a(dph.G, gfr::new);
      a(dph.N, gfq::new);
      a(dph.O, gfu::new);
      a(dph.Q, ggg::new);
      a(dph.R, ggh::new);
   }
}
