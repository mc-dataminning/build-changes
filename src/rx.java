import java.util.ArrayDeque;
import java.util.Deque;

public class rx extends rt {
   private final Deque<rv> a = new ArrayDeque<>();

   public rx(ru... $$0) {
      rv $$1 = rv.a();

      for (ru $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ri.a a(rn<?> $$0, String $$1) {
      rv $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ri.a.b;
      } else {
         if ($$0 == qs.b) {
            rv $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ri.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
