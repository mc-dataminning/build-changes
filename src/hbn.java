import java.util.function.Function;
import javax.annotation.Nullable;

public class hbn {
   private final Function<akv, hbm> a;
   private final Function<akv, hbi.a> b;

   public hbn(hhh $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hbp $$0, cwq $$1, cwo $$2, boolean $$3, bvi $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hbp $$0, cwq $$1, cwo $$2, bum $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hbp $$0, cwq $$1, cwo $$2, boolean $$3, @Nullable dgj $$4, @Nullable bvi $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cwq $$0) {
      if ($$0.h() instanceof cuw $$1 && $$1.d() instanceof dij) {
         czp $$2 = $$0.a(kv.ag);
         if ($$2 != null && !$$2.b()) {
            $$0.d(kv.ag);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), flk.Q());
         }
      }
   }

   public void a(hbp $$0, cwq $$1, cwo $$2, @Nullable dgj $$3, @Nullable bvi $$4, int $$5) {
      b($$1);
      akv $$6 = $$1.a(kv.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gga $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cwq $$0) {
      akv $$1 = $$0.a(kv.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
