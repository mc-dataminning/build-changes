import java.util.ArrayDeque;
import java.util.Deque;

public class vm extends vi {
   private final Deque<vk> a = new ArrayDeque<>();

   public vm(vj... $$0) {
      vk $$1 = vk.a();

      for (vj $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ux.a a(vc<?> $$0, String $$1) {
      vk $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ux.a.b;
      } else {
         if ($$0 == ua.b) {
            vk $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ux.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
