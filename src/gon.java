import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gon {
   private static final Map<duc<?>, gom<?>> a = Maps.newHashMap();

   private static <T extends dua> void a(duc<? extends T> $$0, gom<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<duc<?>, gol<?>> a(gom.a $$0) {
      Builder<duc<?>, gol<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mb.j.b((duc<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(duc.h, goz::new);
      a(duc.i, gov::new);
      a(duc.j, gpb::new);
      a(duc.l, gox::new);
      a(duc.b, gor::new);
      a(duc.d, gor::new);
      a(duc.c, gor::new);
      a(duc.n, gou::new);
      a(duc.E, gow::new);
      a(duc.o, gpe::new);
      a(duc.w, gpd::new);
      a(duc.p, goh::new);
      a(duc.q, gpa::new);
      a(duc.u, gog::new);
      a(duc.v, gpc::new);
      a(duc.y, goy::new);
      a(duc.z, goi::new);
      a(duc.A, gos::new);
      a(duc.F, goj::new);
      a(duc.H, goq::new);
      a(duc.O, gop::new);
      a(duc.P, got::new);
      a(duc.R, gpf::new);
      a(duc.S, gpg::new);
   }
}
