import java.util.ArrayDeque;
import java.util.Deque;

public class vp extends vl {
   private final Deque<vn> a = new ArrayDeque<>();

   public vp(vm... $$0) {
      vn $$1 = vn.a();

      for (vm $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public va.a a(vf<?> $$0, String $$1) {
      vn $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return va.a.b;
      } else {
         if ($$0 == ug.b) {
            vn $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public va.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
