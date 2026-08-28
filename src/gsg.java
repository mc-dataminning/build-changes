import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gsg {
   private static final Map<dwz<?>, gsf<?>> a = Maps.newHashMap();

   private static <T extends dwx> void a(dwz<? extends T> $$0, gsf<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dwz<?>, gse<?>> a(gsf.a $$0) {
      Builder<dwz<?>, gse<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mf.j.b((dwz<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dwz.h, gst::new);
      a(dwz.i, gsp::new);
      a(dwz.j, gsv::new);
      a(dwz.l, gsr::new);
      a(dwz.b, gsl::new);
      a(dwz.d, gsl::new);
      a(dwz.c, gsl::new);
      a(dwz.n, gso::new);
      a(dwz.E, gsq::new);
      a(dwz.o, gsy::new);
      a(dwz.w, gsx::new);
      a(dwz.p, gsa::new);
      a(dwz.q, gsu::new);
      a(dwz.u, grz::new);
      a(dwz.v, gsh::new);
      a(dwz.U, gsw::new);
      a(dwz.y, gss::new);
      a(dwz.z, gsb::new);
      a(dwz.A, gsm::new);
      a(dwz.F, gsc::new);
      a(dwz.H, gsk::new);
      a(dwz.O, gsj::new);
      a(dwz.P, gsn::new);
      a(dwz.R, gsz::new);
      a(dwz.S, gta::new);
   }
}
