import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class gdq {
   private static final Map<dno<?>, gdp<?>> a = Maps.newHashMap();

   private static <T extends dnm> void a(dno<? extends T> $$0, gdp<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<dno<?>, gdo<?>> a(gdp.a $$0) {
      Builder<dno<?>, gdo<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + ld.k.b((dno<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(dno.h, gec::new);
      a(dno.i, gdy::new);
      a(dno.j, gee::new);
      a(dno.k, gea::new);
      a(dno.b, gdu::new);
      a(dno.d, gdu::new);
      a(dno.c, gdu::new);
      a(dno.m, gdx::new);
      a(dno.D, gdz::new);
      a(dno.n, geh::new);
      a(dno.v, geg::new);
      a(dno.o, gdk::new);
      a(dno.p, ged::new);
      a(dno.t, gdj::new);
      a(dno.u, gef::new);
      a(dno.x, geb::new);
      a(dno.y, gdl::new);
      a(dno.z, gdv::new);
      a(dno.E, gdm::new);
      a(dno.G, gdt::new);
      a(dno.N, gds::new);
      a(dno.O, gdw::new);
      a(dno.Q, gei::new);
      a(dno.R, gej::new);
   }
}
