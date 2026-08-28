import java.util.function.Function;
import javax.annotation.Nullable;

public class hcl {
   private final Function<aku, hck> a;
   private final Function<aku, hcg.a> b;

   public hcl(hif $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hcn $$0, cxh $$1, cxf $$2, boolean $$3, bvy $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dU(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hcn $$0, cxh $$1, cxf $$2, bva $$3) {
      this.a($$0, $$1, $$2, false, $$3.dU(), null, $$3.ar());
   }

   public void a(hcn $$0, cxh $$1, cxf $$2, boolean $$3, @Nullable dgz $$4, @Nullable bvy $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cxh $$0) {
      if ($$0.h() instanceof cvo $$1 && $$1.d() instanceof dja) {
         dae $$2 = $$0.a(kv.ai);
         if ($$2 != null && !$$2.b()) {
            $$0.d(kv.ai);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kv.ai, $$1x), fmg.Q());
         }
      }
   }

   public void a(hcn $$0, cxh $$1, cxf $$2, @Nullable dgz $$3, @Nullable bvy $$4, int $$5) {
      b($$1);
      aku $$6 = $$1.a(kv.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof ggy $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cxh $$0) {
      aku $$1 = $$0.a(kv.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
