import java.util.ArrayDeque;
import java.util.Deque;

public class vw extends vs {
   private final Deque<vu> a = new ArrayDeque<>();

   public vw(vt... $$0) {
      vu $$1 = vu.a();

      for (vt $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vh.a a(vm<?> $$0, String $$1) {
      vu $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vh.a.b;
      } else {
         if ($$0 == un.b) {
            vu $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vh.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
