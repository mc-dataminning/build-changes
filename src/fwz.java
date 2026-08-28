import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cvt<?>, fwz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cuk> void a(cvt<T> $$0, fof $$1, int $$2, ww $$3) {
      fwz.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mf.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cuk> fwz.a<T, ?> a(cvt<T> $$0) {
      return (fwz.a<T, ?>)b.get($$0);
   }

   private static <M extends cuk, U extends fxi & fzd<M>> void a(cvt<? extends M> $$0, fwz.a<M, U> $$1) {
      fwz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mf.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cvt<?> $$1 : mf.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mf.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cvt.a, fyj::new);
      a(cvt.b, fyj::new);
      a(cvt.c, fyj::new);
      a(cvt.d, fyj::new);
      a(cvt.e, fyj::new);
      a(cvt.f, fyj::new);
      a(cvt.g, fyp::new);
      a(cvt.h, fyk::new);
      a(cvt.i, fyb::new);
      a(cvt.j, fyc::new);
      a(cvt.k, fyd::new);
      a(cvt.l, fyg::new);
      a(cvt.m, fyl::new);
      a(cvt.n, fys::new);
      a(cvt.o, fyt::new);
      a(cvt.p, fyu::new);
      a(cvt.q, fyw::new);
      a(cvt.r, fzb::new);
      a(cvt.s, fzc::new);
      a(cvt.t, fze::new);
      a(cvt.u, fzh::new);
      a(cvt.v, fzj::new);
      a(cvt.w, fzk::new);
      a(cvt.x, fyh::new);
      a(cvt.y, fzl::new);
   }

   interface a<T extends cuk, U extends fxi & fzd<T>> {
      default void a(ww $$0, cvt<T> $$1, fof $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.bQ = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cqr var2, ww var3);
   }
}
