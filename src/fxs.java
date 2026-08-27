import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxs implements asc {
   private Map<diz<?>, fxt<?>> d = ImmutableMap.of();
   private final eyz e;
   private final fpf f;
   public cvr a;
   public ewz b;
   public enx c;
   private final Supplier<fwn> g;
   private final Supplier<gby> h;
   private final Supplier<gay> i;

   public fxs(eyz $$0, fpf $$1, Supplier<fwn> $$2, Supplier<gby> $$3, Supplier<gay> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dix> fxt<E> a(E $$0) {
      return (fxt<E>)this.d.get($$0.v());
   }

   public void a(cvr $$0, ewz $$1, enx $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dix> void a(E $$0, float $$1, esh $$2, fvt $$3) {
      fxt<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dix> void a(fxt<T> $$0, T $$1, float $$2, esh $$3, fvt $$4) {
      cvr $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fvr.a($$5, $$1.aE_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, ggs.d);
   }

   public <E extends dix> boolean a(E $$0, esh $$1, fvt $$2, int $$3, int $$4) {
      fxt<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dix $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cvr $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(asb $$0) {
      fxu.a $$1 = new fxu.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fxv.a($$1);
   }
}
