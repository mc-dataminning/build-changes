import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gqm {
   private static final Map<dvn<?>, gql<?>> a = Maps.newHashMap();

   private static <T extends dvl> void a(dvn<? extends T> $$0, gql<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dvn<?>, gqk<?>> a(gql.a $$0) {
      Builder<dvn<?>, gqk<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + md.j.b((dvn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dvn.h, gqz::new);
      a(dvn.i, gqv::new);
      a(dvn.j, grb::new);
      a(dvn.l, gqx::new);
      a(dvn.b, gqr::new);
      a(dvn.d, gqr::new);
      a(dvn.c, gqr::new);
      a(dvn.n, gqu::new);
      a(dvn.E, gqw::new);
      a(dvn.o, gre::new);
      a(dvn.w, grd::new);
      a(dvn.p, gqg::new);
      a(dvn.q, gra::new);
      a(dvn.u, gqf::new);
      a(dvn.v, gqn::new);
      a(dvn.U, grc::new);
      a(dvn.y, gqy::new);
      a(dvn.z, gqh::new);
      a(dvn.A, gqs::new);
      a(dvn.F, gqi::new);
      a(dvn.H, gqq::new);
      a(dvn.O, gqp::new);
      a(dvn.P, gqt::new);
      a(dvn.R, grf::new);
      a(dvn.S, grg::new);
   }
}
