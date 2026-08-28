import java.util.function.Function;
import javax.annotation.Nullable;

public class hgg {
   private final Function<alg, hgf> a;
   private final Function<alg, hgb.a> b;

   public hgg(hme $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hgi $$0, czn $$1, czl $$2, bxj $$3) {
      this.a($$0, $$1, $$2, $$3.dU(), $$3, $$3.ao() + $$2.ordinal());
   }

   public void a(hgi $$0, czn $$1, czl $$2, bwi $$3) {
      this.a($$0, $$1, $$2, $$3.dU(), null, $$3.ao());
   }

   public void a(hgi $$0, czn $$1, czl $$2, @Nullable djm $$3, @Nullable bxj $$4, int $$5) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static void b(czn $$0) {
      if ($$0.h() instanceof cxv $$1 && $$1.c() instanceof dln) {
         dcn $$2 = $$0.a(kk.ak);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kk.ak);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kk.ak, $$1x), fpt.Q());
         }
      }
   }

   public void b(hgi $$0, czn $$1, czl $$2, @Nullable djm $$3, @Nullable bxj $$4, int $$5) {
      b($$1);
      alg $$6 = $$1.a(kk.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof gkq $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(czn $$0) {
      alg $$1 = $$0.a(kk.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
