import java.util.ArrayDeque;
import java.util.Deque;

public class uz extends uv {
   private final Deque<ux> a = new ArrayDeque<>();

   public uz(uw... $$0) {
      ux $$1 = ux.a();

      for (uw $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public uk.a a(up<?> $$0, String $$1) {
      ux $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return uk.a.b;
      } else {
         if ($$0 == tq.b) {
            ux $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public uk.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
