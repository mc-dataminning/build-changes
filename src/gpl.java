import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gpl {
   private static final Map<duu<?>, gpk<?>> a = Maps.newHashMap();

   private static <T extends dus> void a(duu<? extends T> $$0, gpk<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<duu<?>, gpj<?>> a(gpk.a $$0) {
      Builder<duu<?>, gpj<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mb.j.b((duu<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(duu.h, gpx::new);
      a(duu.i, gpt::new);
      a(duu.j, gpz::new);
      a(duu.l, gpv::new);
      a(duu.b, gpp::new);
      a(duu.d, gpp::new);
      a(duu.c, gpp::new);
      a(duu.n, gps::new);
      a(duu.E, gpu::new);
      a(duu.o, gqc::new);
      a(duu.w, gqb::new);
      a(duu.p, gpf::new);
      a(duu.q, gpy::new);
      a(duu.u, gpe::new);
      a(duu.v, gqa::new);
      a(duu.y, gpw::new);
      a(duu.z, gpg::new);
      a(duu.A, gpq::new);
      a(duu.F, gph::new);
      a(duu.H, gpo::new);
      a(duu.O, gpn::new);
      a(duu.P, gpr::new);
      a(duu.R, gqd::new);
      a(duu.S, gqe::new);
   }
}
