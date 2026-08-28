import java.util.ArrayDeque;
import java.util.Deque;

public class vk extends vg {
   private final Deque<vi> a = new ArrayDeque<>();

   public vk(vh... $$0) {
      vi $$1 = vi.a();

      for (vh $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public uv.a a(va<?> $$0, String $$1) {
      vi $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return uv.a.b;
      } else {
         if ($$0 == ub.b) {
            vi $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public uv.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
