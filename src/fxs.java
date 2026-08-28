import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cwe<?>, fxs.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cuv> void a(cwe<T> $$0, foz $$1, int $$2, wy $$3) {
      fxs.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mf.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cuv> fxs.a<T, ?> a(cwe<T> $$0) {
      return (fxs.a<T, ?>)b.get($$0);
   }

   private static <M extends cuv, U extends fyb & fzw<M>> void a(cwe<? extends M> $$0, fxs.a<M, U> $$1) {
      fxs.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mf.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cwe<?> $$1 : mf.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mf.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cwe.a, fzc::new);
      a(cwe.b, fzc::new);
      a(cwe.c, fzc::new);
      a(cwe.d, fzc::new);
      a(cwe.e, fzc::new);
      a(cwe.f, fzc::new);
      a(cwe.g, fzi::new);
      a(cwe.h, fzd::new);
      a(cwe.i, fyu::new);
      a(cwe.j, fyv::new);
      a(cwe.k, fyw::new);
      a(cwe.l, fyz::new);
      a(cwe.m, fze::new);
      a(cwe.n, fzl::new);
      a(cwe.o, fzm::new);
      a(cwe.p, fzn::new);
      a(cwe.q, fzp::new);
      a(cwe.r, fzu::new);
      a(cwe.s, fzv::new);
      a(cwe.t, fzx::new);
      a(cwe.u, gaa::new);
      a(cwe.v, gac::new);
      a(cwe.w, gad::new);
      a(cwe.x, fza::new);
      a(cwe.y, gae::new);
   }

   interface a<T extends cuv, U extends fyb & fzw<T>> {
      default void a(wy $$0, cwe<T> $$1, foz $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gj()), $$2.t.gj(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, crb var2, wy var3);
   }
}
