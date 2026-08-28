import java.util.function.Function;
import javax.annotation.Nullable;

public class heq {
   private final Function<ale, hep> a;
   private final Function<ale, hel.a> b;

   public heq(hkn $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hes $$0, cys $$1, cyq $$2, boolean $$3, bwz $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hes $$0, cys $$1, cyq $$2, bwa $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hes $$0, cys $$1, cyq $$2, boolean $$3, @Nullable dip $$4, @Nullable bwz $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cys $$0) {
      if ($$0.h() instanceof cxa $$1 && $$1.c() instanceof dkq) {
         dbs $$2 = $$0.a(kj.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kj.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kj.ak, $$1x), fof.Q());
         }
      }
   }

   public void a(hes $$0, cys $$1, cyq $$2, @Nullable dip $$3, @Nullable bwz $$4, int $$5) {
      b($$1);
      ale $$6 = $$1.a(kj.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gjd $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cys $$0) {
      ale $$1 = $$0.a(kj.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
