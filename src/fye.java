import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fye {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cwl<?>, fye.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cvc> void a(cwl<T> $$0, fpo $$1, int $$2, wy $$3) {
      fye.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mg.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cvc> fye.a<T, ?> a(cwl<T> $$0) {
      return (fye.a<T, ?>)b.get($$0);
   }

   private static <M extends cvc, U extends fyn & gai<M>> void a(cwl<? extends M> $$0, fye.a<M, U> $$1) {
      fye.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mg.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cwl<?> $$1 : mg.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mg.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cwl.a, fzo::new);
      a(cwl.b, fzo::new);
      a(cwl.c, fzo::new);
      a(cwl.d, fzo::new);
      a(cwl.e, fzo::new);
      a(cwl.f, fzo::new);
      a(cwl.g, fzu::new);
      a(cwl.h, fzp::new);
      a(cwl.i, fzg::new);
      a(cwl.j, fzh::new);
      a(cwl.k, fzi::new);
      a(cwl.l, fzl::new);
      a(cwl.m, fzq::new);
      a(cwl.n, fzx::new);
      a(cwl.o, fzy::new);
      a(cwl.p, fzz::new);
      a(cwl.q, gab::new);
      a(cwl.r, gag::new);
      a(cwl.s, gah::new);
      a(cwl.t, gaj::new);
      a(cwl.u, gam::new);
      a(cwl.v, gao::new);
      a(cwl.w, gap::new);
      a(cwl.x, fzm::new);
      a(cwl.y, gaq::new);
   }

   interface a<T extends cvc, U extends fyn & gai<T>> {
      default void a(wy $$0, cwl<T> $$1, fpo $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gi()), $$2.t.gi(), $$0);
         $$2.t.bR = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cri var2, wy var3);
   }
}
