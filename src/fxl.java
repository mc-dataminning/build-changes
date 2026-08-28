import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cvz<?>, fxl.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cuq> void a(cvz<T> $$0, fos $$1, int $$2, wy $$3) {
      fxl.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mf.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cuq> fxl.a<T, ?> a(cvz<T> $$0) {
      return (fxl.a<T, ?>)b.get($$0);
   }

   private static <M extends cuq, U extends fxu & fzp<M>> void a(cvz<? extends M> $$0, fxl.a<M, U> $$1) {
      fxl.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mf.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cvz<?> $$1 : mf.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mf.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cvz.a, fyv::new);
      a(cvz.b, fyv::new);
      a(cvz.c, fyv::new);
      a(cvz.d, fyv::new);
      a(cvz.e, fyv::new);
      a(cvz.f, fyv::new);
      a(cvz.g, fzb::new);
      a(cvz.h, fyw::new);
      a(cvz.i, fyn::new);
      a(cvz.j, fyo::new);
      a(cvz.k, fyp::new);
      a(cvz.l, fys::new);
      a(cvz.m, fyx::new);
      a(cvz.n, fze::new);
      a(cvz.o, fzf::new);
      a(cvz.p, fzg::new);
      a(cvz.q, fzi::new);
      a(cvz.r, fzn::new);
      a(cvz.s, fzo::new);
      a(cvz.t, fzq::new);
      a(cvz.u, fzt::new);
      a(cvz.v, fzv::new);
      a(cvz.w, fzw::new);
      a(cvz.x, fyt::new);
      a(cvz.y, fzx::new);
   }

   interface a<T extends cuq, U extends fxu & fzp<T>> {
      default void a(wy $$0, cvz<T> $$1, fos $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.bQ = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cqx var2, wy var3);
   }
}
