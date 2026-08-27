import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxk implements asb {
   private Map<div<?>, fxl<?>> d = ImmutableMap.of();
   private final eys e;
   private final foy f;
   public cvn a;
   public ews b;
   public enq c;
   private final Supplier<fwf> g;
   private final Supplier<gbq> h;
   private final Supplier<gaq> i;

   public fxk(eys $$0, foy $$1, Supplier<fwf> $$2, Supplier<gbq> $$3, Supplier<gaq> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dit> fxl<E> a(E $$0) {
      return (fxl<E>)this.d.get($$0.v());
   }

   public void a(cvn $$0, ews $$1, enq $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dit> void a(E $$0, float $$1, esa $$2, fvl $$3) {
      fxl<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dit> void a(fxl<T> $$0, T $$1, float $$2, esa $$3, fvl $$4) {
      cvn $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fvj.a($$5, $$1.aE_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, ggk.d);
   }

   public <E extends dit> boolean a(E $$0, esa $$1, fvl $$2, int $$3, int $$4) {
      fxl<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dit $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cvn $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(asa $$0) {
      fxm.a $$1 = new fxm.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fxn.a($$1);
   }
}
