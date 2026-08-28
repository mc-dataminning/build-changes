import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gno implements avw {
   private Map<dur<?>, gnp<?>> d = ImmutableMap.of();
   private final fnj e;
   private final ged f;
   public dha a;
   public fli b;
   public fbq c;
   private final Supplier<gmh> g;
   private final Supplier<gsh> h;
   private final Supplier<grh> i;

   public gno(fnj $$0, ged $$1, Supplier<gmh> $$2, Supplier<gsh> $$3, Supplier<grh> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dup> gnp<E> a(E $$0) {
      return (gnp<E>)this.d.get($$0.q());
   }

   public void a(dha $$0, fli $$1, fbq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dup> void a(E $$0, float $$1, fgl $$2, gle $$3) {
      gnp<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.q().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dup> void a(gnp<T> $$0, T $$1, float $$2, fgl $$3, gle $$4) {
      dha $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gla.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, hav.d);
   }

   public <E extends dup> boolean a(E $$0, fgl $$1, gle $$2, int $$3, int $$4) {
      gnp<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dup $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dha $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avv $$0) {
      gnq.a $$1 = new gnq.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = gnr.a($$1);
   }
}
