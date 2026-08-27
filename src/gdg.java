import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gdg {
   private static final Map<dnf<?>, gdf<?>> a = Maps.newHashMap();

   private static <T extends dnd> void a(dnf<? extends T> $$0, gdf<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dnf<?>, gde<?>> a(gdf.a $$0) {
      Builder<dnf<?>, gde<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + lc.k.b((dnf<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dnf.h, gds::new);
      a(dnf.i, gdo::new);
      a(dnf.j, gdu::new);
      a(dnf.k, gdq::new);
      a(dnf.b, gdk::new);
      a(dnf.d, gdk::new);
      a(dnf.c, gdk::new);
      a(dnf.m, gdn::new);
      a(dnf.D, gdp::new);
      a(dnf.n, gdx::new);
      a(dnf.v, gdw::new);
      a(dnf.o, gda::new);
      a(dnf.p, gdt::new);
      a(dnf.t, gcz::new);
      a(dnf.u, gdv::new);
      a(dnf.x, gdr::new);
      a(dnf.y, gdb::new);
      a(dnf.z, gdl::new);
      a(dnf.E, gdc::new);
      a(dnf.G, gdj::new);
      a(dnf.N, gdi::new);
      a(dnf.O, gdm::new);
      a(dnf.Q, gdy::new);
      a(dnf.R, gdz::new);
   }
}
