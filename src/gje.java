import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gje {
   private static final Map<drg<?>, gjd<?>> a = Maps.newHashMap();

   private static <T extends dre> void a(drg<? extends T> $$0, gjd<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<drg<?>, gjc<?>> a(gjd.a $$0) {
      Builder<drg<?>, gjc<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lu.j.b((drg<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(drg.h, gjq::new);
      a(drg.i, gjm::new);
      a(drg.j, gjs::new);
      a(drg.k, gjo::new);
      a(drg.b, gji::new);
      a(drg.d, gji::new);
      a(drg.c, gji::new);
      a(drg.m, gjl::new);
      a(drg.D, gjn::new);
      a(drg.n, gjv::new);
      a(drg.v, gju::new);
      a(drg.o, giy::new);
      a(drg.p, gjr::new);
      a(drg.t, gix::new);
      a(drg.u, gjt::new);
      a(drg.x, gjp::new);
      a(drg.y, giz::new);
      a(drg.z, gjj::new);
      a(drg.E, gja::new);
      a(drg.G, gjh::new);
      a(drg.N, gjg::new);
      a(drg.O, gjk::new);
      a(drg.Q, gjw::new);
      a(drg.R, gjx::new);
   }
}
