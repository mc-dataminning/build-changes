import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ghf implements aue {
   private Map<dqe<?>, ghg<?>> d = ImmutableMap.of();
   private final fhy e;
   private final fyo f;
   public dca a;
   public ffu b;
   public ews c;
   private final Supplier<gga> g;
   private final Supplier<glp> h;
   private final Supplier<gko> i;

   public ghf(fhy $$0, fyo $$1, Supplier<gga> $$2, Supplier<glp> $$3, Supplier<gko> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dqc> ghg<E> a(E $$0) {
      return (ghg<E>)this.d.get($$0.r());
   }

   public void a(dca $$0, ffu $$1, ews $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dqc> void a(E $$0, float $$1, fbc $$2, gfg $$3) {
      ghg<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dqc> void a(ghg<T> $$0, T $$1, float $$2, fbc $$3, gfg $$4) {
      dca $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = gfe.a($$5, $$1.az_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gqp.d);
   }

   public <E extends dqc> boolean a(E $$0, fbc $$1, gfg $$2, int $$3, int $$4) {
      ghg<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dqc $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new z($$3);
      }
   }

   public void a(@Nullable dca $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aud $$0) {
      ghh.a $$1 = new ghh.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ghi.a($$1);
   }
}
