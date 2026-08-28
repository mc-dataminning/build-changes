import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzh {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cxk<?>, fzh.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cwb> void a(cxk<T> $$0, fqq $$1, int $$2, xg $$3) {
      fzh.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mh.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cwb> fzh.a<T, ?> a(cxk<T> $$0) {
      return (fzh.a<T, ?>)b.get($$0);
   }

   private static <M extends cwb, U extends fzq & gbl<M>> void a(cxk<? extends M> $$0, fzh.a<M, U> $$1) {
      fzh.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mh.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cxk<?> $$1 : mh.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mh.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cxk.a, gar::new);
      a(cxk.b, gar::new);
      a(cxk.c, gar::new);
      a(cxk.d, gar::new);
      a(cxk.e, gar::new);
      a(cxk.f, gar::new);
      a(cxk.g, gax::new);
      a(cxk.h, gas::new);
      a(cxk.i, gaj::new);
      a(cxk.j, gak::new);
      a(cxk.k, gal::new);
      a(cxk.l, gao::new);
      a(cxk.m, gat::new);
      a(cxk.n, gba::new);
      a(cxk.o, gbb::new);
      a(cxk.p, gbc::new);
      a(cxk.q, gbe::new);
      a(cxk.r, gbj::new);
      a(cxk.s, gbk::new);
      a(cxk.t, gbm::new);
      a(cxk.u, gbp::new);
      a(cxk.v, gbr::new);
      a(cxk.w, gbs::new);
      a(cxk.x, gap::new);
      a(cxk.y, gbt::new);
   }

   interface a<T extends cwb, U extends fzq & gbl<T>> {
      default void a(xg $$0, cxk<T> $$1, fqq $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gj()), $$2.t.gj(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, csh var2, xg var3);
   }
}
