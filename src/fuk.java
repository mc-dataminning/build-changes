import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fuk {
   private static final Map<dgf<?>, fuj<?>> a = Maps.newHashMap();

   private static <T extends dgd> void a(dgf<? extends T> $$0, fuj<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dgf<?>, fui<?>> a(fuj.a $$0) {
      Builder<dgf<?>, fui<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kb.k.b((dgf<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dgf.h, fuw::new);
      a(dgf.i, fus::new);
      a(dgf.j, fuy::new);
      a(dgf.k, fuu::new);
      a(dgf.b, fuo::new);
      a(dgf.d, fuo::new);
      a(dgf.c, fuo::new);
      a(dgf.m, fur::new);
      a(dgf.D, fut::new);
      a(dgf.n, fvb::new);
      a(dgf.v, fva::new);
      a(dgf.o, fue::new);
      a(dgf.p, fux::new);
      a(dgf.t, fud::new);
      a(dgf.u, fuz::new);
      a(dgf.x, fuv::new);
      a(dgf.y, fuf::new);
      a(dgf.z, fup::new);
      a(dgf.E, fug::new);
      a(dgf.G, fun::new);
      a(dgf.N, fum::new);
      a(dgf.O, fuq::new);
      a(dgf.Q, fvc::new);
   }
}
