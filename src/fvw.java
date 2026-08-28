import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cuw<?>, fvw.a<?, ?>> b = Maps.newHashMap();

   public static <T extends ctn> void a(cuw<T> $$0, fnd $$1, int $$2, wv $$3) {
      fvw.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", md.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends ctn> fvw.a<T, ?> a(cuw<T> $$0) {
      return (fvw.a<T, ?>)b.get($$0);
   }

   private static <M extends ctn, U extends fwf & fya<M>> void a(cuw<? extends M> $$0, fvw.a<M, U> $$1) {
      fvw.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + md.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cuw<?> $$1 : md.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", md.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cuw.a, fxg::new);
      a(cuw.b, fxg::new);
      a(cuw.c, fxg::new);
      a(cuw.d, fxg::new);
      a(cuw.e, fxg::new);
      a(cuw.f, fxg::new);
      a(cuw.g, fxm::new);
      a(cuw.h, fxh::new);
      a(cuw.i, fwy::new);
      a(cuw.j, fwz::new);
      a(cuw.k, fxa::new);
      a(cuw.l, fxd::new);
      a(cuw.m, fxi::new);
      a(cuw.n, fxp::new);
      a(cuw.o, fxq::new);
      a(cuw.p, fxr::new);
      a(cuw.q, fxt::new);
      a(cuw.r, fxy::new);
      a(cuw.s, fxz::new);
      a(cuw.t, fyb::new);
      a(cuw.u, fye::new);
      a(cuw.v, fyg::new);
      a(cuw.w, fyh::new);
      a(cuw.x, fxe::new);
      a(cuw.y, fyi::new);
   }

   interface a<T extends ctn, U extends fwf & fya<T>> {
      default void a(wv $$0, cuw<T> $$1, fnd $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.bP = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cqh var2, wv var3);
   }
}
