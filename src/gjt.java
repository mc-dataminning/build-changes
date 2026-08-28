import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gjt {
   private static final Map<dru<?>, gjs<?>> a = Maps.newHashMap();

   private static <T extends drs> void a(dru<? extends T> $$0, gjs<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dru<?>, gjr<?>> a(gjs.a $$0) {
      Builder<dru<?>, gjr<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lu.j.b((dru<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dru.h, gkf::new);
      a(dru.i, gkb::new);
      a(dru.j, gkh::new);
      a(dru.k, gkd::new);
      a(dru.b, gjx::new);
      a(dru.d, gjx::new);
      a(dru.c, gjx::new);
      a(dru.m, gka::new);
      a(dru.D, gkc::new);
      a(dru.n, gkk::new);
      a(dru.v, gkj::new);
      a(dru.o, gjn::new);
      a(dru.p, gkg::new);
      a(dru.t, gjm::new);
      a(dru.u, gki::new);
      a(dru.x, gke::new);
      a(dru.y, gjo::new);
      a(dru.z, gjy::new);
      a(dru.E, gjp::new);
      a(dru.G, gjw::new);
      a(dru.N, gjv::new);
      a(dru.O, gjz::new);
      a(dru.Q, gkl::new);
      a(dru.R, gkm::new);
   }
}
