import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyp implements asg {
   private Map<djn<?>, fyq<?>> d = ImmutableMap.of();
   private final ezv e;
   private final fqb f;
   public cwe a;
   public exv b;
   public eot c;
   private final Supplier<fxk> g;
   private final Supplier<gcw> h;
   private final Supplier<gbw> i;

   public fyp(ezv $$0, fqb $$1, Supplier<fxk> $$2, Supplier<gcw> $$3, Supplier<gbw> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends djl> fyq<E> a(E $$0) {
      return (fyq<E>)this.d.get($$0.r());
   }

   public void a(cwe $$0, exv $$1, eot $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends djl> void a(E $$0, float $$1, etd $$2, fwq $$3) {
      fyq<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.m() && $$0.r().a($$0.n())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends djl> void a(fyq<T> $$0, T $$1, float $$2, etd $$3, fwq $$4) {
      cwe $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fwo.a($$5, $$1.aD_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, ghq.d);
   }

   public <E extends djl> boolean a(E $$0, etd $$1, fwq $$2, int $$3, int $$4) {
      fyq<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(djl $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cwe $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(asf $$0) {
      fyr.a $$1 = new fyr.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fys.a($$1);
   }
}
