import java.util.function.Function;
import javax.annotation.Nullable;

public class hhq {
   private final Function<ali, hhp> a;
   private final Function<ali, hhl.a> b;

   public hhq(hno $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hhs $$0, czy $$1, czw $$2, bxu $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), $$3, $$3.ao() + $$2.ordinal());
   }

   public void a(hhs $$0, czy $$1, czw $$2, bwt $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), null, $$3.ao());
   }

   public void a(hhs $$0, czy $$1, czw $$2, @Nullable djx $$3, @Nullable bxu $$4, int $$5) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void b(czy $$0) {
      if ($$0.h() instanceof cyg $$1 && $$1.c() instanceof dly) {
         dcy $$2 = $$0.a(kk.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kk.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kk.ak, $$1x), frd.Q());
         }
      }
   }

   public void b(hhs $$0, czy $$1, czw $$2, @Nullable djx $$3, @Nullable bxu $$4, int $$5) {
      b($$1);
      ali $$6 = $$1.a(kk.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gmb $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(czy $$0) {
      ali $$1 = $$0.a(kk.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
