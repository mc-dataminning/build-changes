import java.util.ArrayDeque;
import java.util.Deque;

public class vg extends vc {
   private final Deque<ve> a = new ArrayDeque<>();

   public vg(vd... $$0) {
      ve $$1 = ve.a();

      for (vd $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ur.a a(uw<?> $$0, String $$1) {
      ve $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ur.a.b;
      } else {
         if ($$0 == tx.b) {
            ve $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ur.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
