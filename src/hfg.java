import java.util.function.Function;
import javax.annotation.Nullable;

public class hfg {
   private final Function<alg, hff> a;
   private final Function<alg, hfb.a> b;

   public hfg(hld $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hfi $$0, cyy $$1, cyw $$2, boolean $$3, bxc $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hfi $$0, cyy $$1, cyw $$2, bwd $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hfi $$0, cyy $$1, cyw $$2, boolean $$3, @Nullable div $$4, @Nullable bxc $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cyy $$0) {
      if ($$0.h() instanceof cxg $$1 && $$1.c() instanceof dkw) {
         dby $$2 = $$0.a(kj.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kj.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kj.ak, $$1x), fos.Q());
         }
      }
   }

   public void a(hfi $$0, cyy $$1, cyw $$2, @Nullable div $$3, @Nullable bxc $$4, int $$5) {
      b($$1);
      alg $$6 = $$1.a(kj.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gjr $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cyy $$0) {
      alg $$1 = $$0.a(kj.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
