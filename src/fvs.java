import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvs implements aqk {
   private Map<dhf<?>, fvt<?>> d = ImmutableMap.of();
   private final exc e;
   private final fnf f;
   public ctx a;
   public evc b;
   public ema c;
   private final Supplier<fun> g;
   private final Supplier<fzy> h;
   private final Supplier<fyy> i;

   public fvs(exc $$0, fnf $$1, Supplier<fun> $$2, Supplier<fzy> $$3, Supplier<fyy> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dhd> fvt<E> a(E $$0) {
      return (fvt<E>)this.d.get($$0.v());
   }

   public void a(ctx $$0, evc $$1, ema $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dhd> void a(E $$0, float $$1, eqk $$2, ftt $$3) {
      fvt<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dhd> void a(fvt<T> $$0, T $$1, float $$2, eqk $$3, ftt $$4) {
      ctx $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = ftr.a($$5, $$1.aE_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, ges.d);
   }

   public <E extends dhd> boolean a(E $$0, eqk $$1, ftt $$2, int $$3, int $$4) {
      fvt<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dhd $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable ctx $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aqj $$0) {
      fvu.a $$1 = new fvu.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fvv.a($$1);
   }
}
