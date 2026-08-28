import java.util.function.Function;
import javax.annotation.Nullable;

public class hfo {
   private final Function<alg, hfn> a;
   private final Function<alg, hfj.a> b;

   public hfo(hll $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hfq $$0, czd $$1, czb $$2, boolean $$3, bxe $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hfq $$0, czd $$1, czb $$2, bwf $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hfq $$0, czd $$1, czb $$2, boolean $$3, @Nullable dja $$4, @Nullable bxe $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(czd $$0) {
      if ($$0.h() instanceof cxl $$1 && $$1.c() instanceof dlb) {
         dcd $$2 = $$0.a(kj.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kj.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kj.ak, $$1x), foz.Q());
         }
      }
   }

   public void a(hfq $$0, czd $$1, czb $$2, @Nullable dja $$3, @Nullable bxe $$4, int $$5) {
      b($$1);
      alg $$6 = $$1.a(kj.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gjz $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(czd $$0) {
      alg $$1 = $$0.a(kj.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
