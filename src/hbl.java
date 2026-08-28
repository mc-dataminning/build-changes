import java.util.function.Function;
import javax.annotation.Nullable;

public class hbl {
   private final Function<akv, hbk> a;
   private final Function<akv, hbg.a> b;

   public hbl(hhf $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hbn $$0, cwo $$1, cwm $$2, boolean $$3, bvg $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hbn $$0, cwo $$1, cwm $$2, buk $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hbn $$0, cwo $$1, cwm $$2, boolean $$3, @Nullable dgh $$4, @Nullable bvg $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cwo $$0) {
      if ($$0.h() instanceof cuu $$1 && $$1.d() instanceof dih) {
         czn $$2 = $$0.a(kv.ag);
         if ($$2 != null && !$$2.b()) {
            $$0.d(kv.ag);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), fli.Q());
         }
      }
   }

   public void a(hbn $$0, cwo $$1, cwm $$2, @Nullable dgh $$3, @Nullable bvg $$4, int $$5) {
      b($$1);
      akv $$6 = $$1.a(kv.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gfy $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cwo $$0) {
      akv $$1 = $$0.a(kv.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
