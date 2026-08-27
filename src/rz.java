import java.util.ArrayDeque;
import java.util.Deque;

public class rz extends rv {
   private final Deque<rx> a = new ArrayDeque<>();

   public rz(rw... $$0) {
      rx $$1 = rx.a();

      for (rw $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public rk.a a(rp<?> $$0, String $$1) {
      rx $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return rk.a.b;
      } else {
         if ($$0 == qu.b) {
            rx $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public rk.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
