import java.util.ArrayDeque;
import java.util.Deque;

public class vo extends vk {
   private final Deque<vm> a = new ArrayDeque<>();

   public vo(vl... $$0) {
      vm $$1 = vm.a();

      for (vl $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public uz.a a(ve<?> $$0, String $$1) {
      vm $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return uz.a.b;
      } else {
         if ($$0 == uf.b) {
            vm $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public uz.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
