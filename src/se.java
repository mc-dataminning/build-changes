import java.util.ArrayDeque;
import java.util.Deque;

public class se extends sa {
   private final Deque<sc> a = new ArrayDeque<>();

   public se(sb... $$0) {
      sc $$1 = sc.a();

      for (sb $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public rp.a a(ru<?> $$0, String $$1) {
      sc $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return rp.a.b;
      } else {
         if ($$0 == qy.b) {
            sc $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public rp.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
