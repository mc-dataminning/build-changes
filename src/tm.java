import java.util.ArrayDeque;
import java.util.Deque;

public class tm extends ti {
   private final Deque<tk> a = new ArrayDeque<>();

   public tm(tj... $$0) {
      tk $$1 = tk.a();

      for (tj $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public sx.a a(tc<?> $$0, String $$1) {
      tk $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return sx.a.b;
      } else {
         if ($$0 == sd.b) {
            tk $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public sx.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
