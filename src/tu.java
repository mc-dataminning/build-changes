import java.util.ArrayDeque;
import java.util.Deque;

public class tu extends tq {
   private final Deque<ts> a = new ArrayDeque<>();

   public tu(tr... $$0) {
      ts $$1 = ts.a();

      for (tr $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public tf.a a(tk<?> $$0, String $$1) {
      ts $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return tf.a.b;
      } else {
         if ($$0 == sl.b) {
            ts $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public tf.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
