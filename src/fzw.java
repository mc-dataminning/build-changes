import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cxb<?>, fzw.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cvs> void a(cxb<T> $$0, frf $$1, int $$2, xc $$3) {
      fzw.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mh.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cvs> fzw.a<T, ?> a(cxb<T> $$0) {
      return (fzw.a<T, ?>)b.get($$0);
   }

   private static <M extends cvs, U extends gaf & gca<M>> void a(cxb<? extends M> $$0, fzw.a<M, U> $$1) {
      fzw.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mh.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cxb<?> $$1 : mh.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mh.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cxb.a, gbg::new);
      a(cxb.b, gbg::new);
      a(cxb.c, gbg::new);
      a(cxb.d, gbg::new);
      a(cxb.e, gbg::new);
      a(cxb.f, gbg::new);
      a(cxb.g, gbm::new);
      a(cxb.h, gbh::new);
      a(cxb.i, gay::new);
      a(cxb.j, gaz::new);
      a(cxb.k, gba::new);
      a(cxb.l, gbd::new);
      a(cxb.m, gbi::new);
      a(cxb.n, gbp::new);
      a(cxb.o, gbq::new);
      a(cxb.p, gbr::new);
      a(cxb.q, gbt::new);
      a(cxb.r, gby::new);
      a(cxb.s, gbz::new);
      a(cxb.t, gcb::new);
      a(cxb.u, gce::new);
      a(cxb.v, gcg::new);
      a(cxb.w, gch::new);
      a(cxb.x, gbe::new);
      a(cxb.y, gci::new);
   }

   interface a<T extends cvs, U extends gaf & gca<T>> {
      default void a(xc $$0, cxb<T> $$1, frf $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gj()), $$2.t.gj(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cry var2, xc var3);
   }
}
