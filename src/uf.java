import java.util.ArrayDeque;
import java.util.Deque;

public class uf extends ub {
   private final Deque<ud> a = new ArrayDeque<>();

   public uf(uc... $$0) {
      ud $$1 = ud.a();

      for (uc $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public tq.a a(tv<?> $$0, String $$1) {
      ud $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return tq.a.b;
      } else {
         if ($$0 == sw.b) {
            ud $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public tq.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
