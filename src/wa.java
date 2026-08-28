import java.util.ArrayDeque;
import java.util.Deque;

public class wa extends vw {
   private final Deque<vy> a = new ArrayDeque<>();

   public wa(vx... $$0) {
      vy $$1 = vy.a();

      for (vx $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vl.a a(vq<?> $$0, String $$1) {
      vy $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vl.a.b;
      } else {
         if ($$0 == ur.b) {
            vy $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vl.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
