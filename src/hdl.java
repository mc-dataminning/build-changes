import java.util.function.Function;
import javax.annotation.Nullable;

public class hdl {
   private final Function<ald, hdk> a;
   private final Function<ald, hdg.a> b;

   public hdl(hjg $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hdn $$0, cxy $$1, cxw $$2, boolean $$3, bwr $$4) {
      this.a($$0, $$1, $$2, $$3, $$4.dV(), $$4, $$4.ar() + $$2.ordinal());
   }

   public void a(hdn $$0, cxy $$1, cxw $$2, bvs $$3) {
      this.a($$0, $$1, $$2, false, $$3.dV(), null, $$3.ar());
   }

   public void a(hdn $$0, cxy $$1, cxw $$2, boolean $$3, @Nullable dhp $$4, @Nullable bwr $$5, int $$6) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         $$0.b = $$3;
         this.a($$0, $$1, $$2, $$4, $$5, $$6);
      }
   }

   private static void b(cxy $$0) {
      if ($$0.h() instanceof cwf $$1 && $$1.d() instanceof djq) {
         dau $$2 = $$0.a(kx.ai);
         if ($$2 != null && !$$2.b()) {
            $$0.e(kx.ai);
            $$2.a().thenAcceptAsync($$1x -> $$0.b(kx.ai, $$1x), fnd.Q());
         }
      }
   }

   public void a(hdn $$0, cxy $$1, cxw $$2, @Nullable dhp $$3, @Nullable bwr $$4, int $$5) {
      b($$1);
      ald $$6 = $$1.a(kx.i);
      if ($$6 != null) {
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof ghz $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(cxy $$0) {
      ald $$1 = $$0.a(kx.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
