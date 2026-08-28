import java.util.function.Function;
import javax.annotation.Nullable;

public class hhg {
   private final Function<alr, hhf> a;
   private final Function<alr, hhb.a> b;

   public hhg(hne $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hhi $$0, dak $$1, dai $$2, byf $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), $$3, $$3.ao() + $$2.ordinal());
   }

   public void a(hhi $$0, dak $$1, dai $$2, bxe $$3) {
      this.a($$0, $$1, $$2, $$3.dV(), null, $$3.ao());
   }

   public void a(hhi $$0, dak $$1, dai $$2, @Nullable dkj $$3, @Nullable byf $$4, int $$5) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void b(dak $$0) {
      if ($$0.h() instanceof cys $$1 && $$1.c() instanceof dmk) {
         ddk $$2 = $$0.a(kl.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kl.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kl.ak, $$1x), fqq.Q());
         }
      }
   }

   public void b(hhi $$0, dak $$1, dai $$2, @Nullable dkj $$3, @Nullable byf $$4, int $$5) {
      b($$1);
      alr $$6 = $$1.a(kl.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof glo $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(dak $$0) {
      alr $$1 = $$0.a(kl.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
