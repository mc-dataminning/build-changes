import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<cuf<?>, fuz.a<?, ?>> b = Maps.newHashMap();

   public static <T extends csw> void a(cuf<T> $$0, fmg $$1, int $$2, wp $$3) {
      fuz.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mb.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends csw> fuz.a<T, ?> a(cuf<T> $$0) {
      return (fuz.a<T, ?>)b.get($$0);
   }

   private static <M extends csw, U extends fvi & fxd<M>> void a(cuf<? extends M> $$0, fuz.a<M, U> $$1) {
      fuz.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mb.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (cuf<?> $$1 : mb.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mb.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(cuf.a, fwj::new);
      a(cuf.b, fwj::new);
      a(cuf.c, fwj::new);
      a(cuf.d, fwj::new);
      a(cuf.e, fwj::new);
      a(cuf.f, fwj::new);
      a(cuf.g, fwp::new);
      a(cuf.h, fwk::new);
      a(cuf.i, fwb::new);
      a(cuf.j, fwc::new);
      a(cuf.k, fwd::new);
      a(cuf.l, fwg::new);
      a(cuf.m, fwl::new);
      a(cuf.n, fws::new);
      a(cuf.o, fwt::new);
      a(cuf.p, fwu::new);
      a(cuf.q, fww::new);
      a(cuf.r, fxb::new);
      a(cuf.s, fxc::new);
      a(cuf.t, fxe::new);
      a(cuf.u, fxh::new);
      a(cuf.v, fxj::new);
      a(cuf.w, fxk::new);
      a(cuf.x, fwh::new);
      a(cuf.y, fxl::new);
   }

   interface a<T extends csw, U extends fvi & fxd<T>> {
      default void a(wp $$0, cuf<T> $$1, fmg $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gl()), $$2.t.gl(), $$0);
         $$2.t.bQ = $$4.F();
         $$2.a($$4);
      }

      U create(T var1, cpq var2, wp var3);
   }
}
