import java.util.ArrayDeque;
import java.util.Deque;

public class wb extends vx {
   private final Deque<vz> a = new ArrayDeque<>();

   public wb(vy... $$0) {
      vz $$1 = vz.a();

      for (vy $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vm.a a(vr<?> $$0, String $$1) {
      vz $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vm.a.b;
      } else {
         if ($$0 == us.b) {
            vz $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vm.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
