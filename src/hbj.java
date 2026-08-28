import java.util.function.Function;
import javax.annotation.Nullable;

public class hbj {
   private final Function<aku, hbi> a;

   public hbj(hgz $$0) {
      this.a = $$0::a;
   }

   public void a(hbl $$0, cwp $$1, cwn $$2, boolean $$3, bvg $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dW(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hbl $$0, cwp $$1, cwn $$2, buk $$3) {
      this.a($$0, $$1, $$2, false, $$3.dW(), null, $$3.ar());
   }

   public void a(hbl $$0, cwp $$1, cwn $$2, boolean $$3, @Nullable dgi $$4, @Nullable bvg $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void a(cwp $$0) {
      if ($$0.h() instanceof cuv $$1 && $$1.d() instanceof dii) {
         czo $$2 = $$0.a(kv.ag);
         if ($$2 != null && !$$2.b()) {
            $$0.c(kv.ag);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kv.ag, $$1x), flj.Q());
         }
      }
   }

   public void a(hbl $$0, cwp $$1, cwn $$2, @Nullable dgi $$3, @Nullable bvg $$4, int $$5) {
      a($$1);
      aku $$6 = $$1.a(kv.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gfy $$7 ? $$7 : null, $$4, $$5);
      }
   }
}
