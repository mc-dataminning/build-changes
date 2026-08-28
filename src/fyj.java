import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cwo<?>, fyj.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cvf> void a(cwo<T> $$0, fpt $$1, int $$2, wy $$3) {
      fyj.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mg.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cvf> fyj.a<T, ?> a(cwo<T> $$0) {
      return (fyj.a<T, ?>)b.get($$0);
   }

   private static <M extends cvf, U extends fys & gan<M>> void a(cwo<? extends M> $$0, fyj.a<M, U> $$1) {
      fyj.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mg.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cwo<?> $$1 : mg.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mg.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cwo.a, fzt::new);
      a(cwo.b, fzt::new);
      a(cwo.c, fzt::new);
      a(cwo.d, fzt::new);
      a(cwo.e, fzt::new);
      a(cwo.f, fzt::new);
      a(cwo.g, fzz::new);
      a(cwo.h, fzu::new);
      a(cwo.i, fzl::new);
      a(cwo.j, fzm::new);
      a(cwo.k, fzn::new);
      a(cwo.l, fzq::new);
      a(cwo.m, fzv::new);
      a(cwo.n, gac::new);
      a(cwo.o, gad::new);
      a(cwo.p, gae::new);
      a(cwo.q, gag::new);
      a(cwo.r, gal::new);
      a(cwo.s, gam::new);
      a(cwo.t, gao::new);
      a(cwo.u, gar::new);
      a(cwo.v, gat::new);
      a(cwo.w, gau::new);
      a(cwo.x, fzr::new);
      a(cwo.y, gav::new);
   }

   interface a<T extends cvf, U extends fys & gan<T>> {
      default void a(wy $$0, cwo<T> $$1, fpt $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, crl var2, wy var3);
   }
}
