import java.util.function.Function;
import javax.annotation.Nullable;

public class hhs {
   private final Function<alk, hhr> a;
   private final Function<alk, hhn.a> b;

   public hhs(hnq $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hhu $$0, daa $$1, czy $$2, bxw $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), $$3, $$3.ao() + $$2.ordinal());
   }

   public void a(hhu $$0, daa $$1, czy $$2, bwv $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), null, $$3.ao());
   }

   public void a(hhu $$0, daa $$1, czy $$2, @Nullable djz $$3, @Nullable bxw $$4, int $$5) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void b(daa $$0) {
      if ($$0.h() instanceof cyi $$1 && $$1.c() instanceof dma) {
         dda $$2 = $$0.a(kl.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kl.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kl.ak, $$1x), frf.Q());
         }
      }
   }

   public void b(hhu $$0, daa $$1, czy $$2, @Nullable djz $$3, @Nullable bxw $$4, int $$5) {
      b($$1);
      alk $$6 = $$1.a(kl.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gmd $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(daa $$0) {
      alk $$1 = $$0.a(kl.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
