import java.util.ArrayDeque;
import java.util.Deque;

public class uj extends uf {
   private final Deque<uh> a = new ArrayDeque<>();

   public uj(ug... $$0) {
      uh $$1 = uh.a();

      for (ug $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public tu.a a(tz<?> $$0, String $$1) {
      uh $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return tu.a.b;
      } else {
         if ($$0 == ta.b) {
            uh $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public tu.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
