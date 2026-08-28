import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gnt {
   private static final Map<dus<?>, gns<?>> a = Maps.newHashMap();

   private static <T extends duq> void a(dus<? extends T> $$0, gns<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dus<?>, gnr<?>> a(gns.a $$0) {
      Builder<dus<?>, gnr<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ma.j.b((dus<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dus.h, gof::new);
      a(dus.i, gob::new);
      a(dus.j, goh::new);
      a(dus.l, god::new);
      a(dus.b, gnx::new);
      a(dus.d, gnx::new);
      a(dus.c, gnx::new);
      a(dus.n, goa::new);
      a(dus.E, goc::new);
      a(dus.o, gok::new);
      a(dus.w, goj::new);
      a(dus.p, gnn::new);
      a(dus.q, gog::new);
      a(dus.u, gnm::new);
      a(dus.v, goi::new);
      a(dus.y, goe::new);
      a(dus.z, gno::new);
      a(dus.A, gny::new);
      a(dus.F, gnp::new);
      a(dus.H, gnw::new);
      a(dus.O, gnv::new);
      a(dus.P, gnz::new);
      a(dus.R, gol::new);
      a(dus.S, gom::new);
   }
}
