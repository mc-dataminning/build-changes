import java.util.ArrayDeque;
import java.util.Deque;

public class uv extends ur {
   private final Deque<ut> a = new ArrayDeque<>();

   public uv(us... $$0) {
      ut $$1 = ut.a();

      for (us $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ug.a a(ul<?> $$0, String $$1) {
      ut $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ug.a.b;
      } else {
         if ($$0 == tm.b) {
            ut $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ug.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
