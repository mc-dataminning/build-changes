import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzu {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cwz<?>, fzu.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cvq> void a(cwz<T> $$0, frd $$1, int $$2, xa $$3) {
      fzu.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mg.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cvq> fzu.a<T, ?> a(cwz<T> $$0) {
      return (fzu.a<T, ?>)b.get($$0);
   }

   private static <M extends cvq, U extends gad & gby<M>> void a(cwz<? extends M> $$0, fzu.a<M, U> $$1) {
      fzu.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mg.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cwz<?> $$1 : mg.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mg.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cwz.a, gbe::new);
      a(cwz.b, gbe::new);
      a(cwz.c, gbe::new);
      a(cwz.d, gbe::new);
      a(cwz.e, gbe::new);
      a(cwz.f, gbe::new);
      a(cwz.g, gbk::new);
      a(cwz.h, gbf::new);
      a(cwz.i, gaw::new);
      a(cwz.j, gax::new);
      a(cwz.k, gay::new);
      a(cwz.l, gbb::new);
      a(cwz.m, gbg::new);
      a(cwz.n, gbn::new);
      a(cwz.o, gbo::new);
      a(cwz.p, gbp::new);
      a(cwz.q, gbr::new);
      a(cwz.r, gbw::new);
      a(cwz.s, gbx::new);
      a(cwz.t, gbz::new);
      a(cwz.u, gcc::new);
      a(cwz.v, gce::new);
      a(cwz.w, gcf::new);
      a(cwz.x, gbc::new);
      a(cwz.y, gcg::new);
   }

   interface a<T extends cvq, U extends gad & gby<T>> {
      default void a(xa $$0, cwz<T> $$1, frd $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gj()), $$2.t.gj(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, crw var2, xa var3);
   }
}
