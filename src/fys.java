import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class fys {
   private static final Map<djn<?>, fyr<?>> a = Maps.newHashMap();

   private static <T extends djl> void a(djn<? extends T> $$0, fyr<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<djn<?>, fyq<?>> a(fyr.a $$0) {
      Builder<djn<?>, fyq<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + kh.k.b((djn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(djn.h, fze::new);
      a(djn.i, fza::new);
      a(djn.j, fzg::new);
      a(djn.k, fzc::new);
      a(djn.b, fyw::new);
      a(djn.d, fyw::new);
      a(djn.c, fyw::new);
      a(djn.m, fyz::new);
      a(djn.D, fzb::new);
      a(djn.n, fzj::new);
      a(djn.v, fzi::new);
      a(djn.o, fym::new);
      a(djn.p, fzf::new);
      a(djn.t, fyl::new);
      a(djn.u, fzh::new);
      a(djn.x, fzd::new);
      a(djn.y, fyn::new);
      a(djn.z, fyx::new);
      a(djn.E, fyo::new);
      a(djn.G, fyv::new);
      a(djn.N, fyu::new);
      a(djn.O, fyy::new);
      a(djn.Q, fzk::new);
      a(djn.R, fzl::new);
   }
}
