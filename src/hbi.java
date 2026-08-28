import java.util.function.Function;
import javax.annotation.Nullable;

public class hbi {
   private final Function<aku, hbh> a;

   public hbi(hha $$0) {
      this.a = $$0::a;
   }

   public void a(hbk $$0, cwn $$1, cwl $$2, boolean $$3, bvf $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dW(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hbk $$0, cwn $$1, cwl $$2, buj $$3) {
      this.a($$0, $$1, $$2, false, $$3.dW(), null, $$3.ar());
   }

   public void a(hbk $$0, cwn $$1, cwl $$2, boolean $$3, @Nullable dgg $$4, @Nullable bvf $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void a(cwn $$0) {
      if ($$0.h() instanceof cut $$1 && $$1.d() instanceof dig) {
         czm $$2 = $$0.a(kv.ag);
         if ($$2 != null && !$$2.b()) {
            $$0.d(kv.ag);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), flh.Q());
         }
      }
   }

   public void a(hbk $$0, cwn $$1, cwl $$2, @Nullable dgg $$3, @Nullable bvf $$4, int $$5) {
      a($$1);
      aku $$6 = $$1.a(kv.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gfw $$7 ? $$7 : null, $$4, $$5);
      }
   }
}
