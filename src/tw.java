import java.util.ArrayDeque;
import java.util.Deque;

public class tw extends ts {
   private final Deque<tu> a = new ArrayDeque<>();

   public tw(tt... $$0) {
      tu $$1 = tu.a();

      for (tt $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public th.a a(tm<?> $$0, String $$1) {
      tu $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return th.a.b;
      } else {
         if ($$0 == sn.b) {
            tu $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public th.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
