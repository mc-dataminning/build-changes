import java.util.ArrayDeque;
import java.util.Deque;

public class tx extends tt {
   private final Deque<tv> a = new ArrayDeque<>();

   public tx(tu... $$0) {
      tv $$1 = tv.a();

      for (tu $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ti.a a(tn<?> $$0, String $$1) {
      tv $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ti.a.b;
      } else {
         if ($$0 == so.b) {
            tv $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ti.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
