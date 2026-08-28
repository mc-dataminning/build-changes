import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class grr {
   private static final Map<dwp<?>, grq<?>> a = Maps.newHashMap();

   private static <T extends dwn> void a(dwp<? extends T> $$0, grq<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dwp<?>, grp<?>> a(grq.a $$0) {
      Builder<dwp<?>, grp<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mf.j.b((dwp<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dwp.h, gse::new);
      a(dwp.i, gsa::new);
      a(dwp.j, gsg::new);
      a(dwp.l, gsc::new);
      a(dwp.b, grw::new);
      a(dwp.d, grw::new);
      a(dwp.c, grw::new);
      a(dwp.n, grz::new);
      a(dwp.E, gsb::new);
      a(dwp.o, gsj::new);
      a(dwp.w, gsi::new);
      a(dwp.p, grl::new);
      a(dwp.q, gsf::new);
      a(dwp.u, grk::new);
      a(dwp.v, grs::new);
      a(dwp.U, gsh::new);
      a(dwp.y, gsd::new);
      a(dwp.z, grm::new);
      a(dwp.A, grx::new);
      a(dwp.F, grn::new);
      a(dwp.H, grv::new);
      a(dwp.O, gru::new);
      a(dwp.P, gry::new);
      a(dwp.R, gsk::new);
      a(dwp.S, gsl::new);
   }
}
