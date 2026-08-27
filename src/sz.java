import java.util.ArrayDeque;
import java.util.Deque;

public class sz extends sv {
   private final Deque<sx> a = new ArrayDeque<>();

   public sz(sw... $$0) {
      sx $$1 = sx.a();

      for (sw $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public sk.a a(sp<?> $$0, String $$1) {
      sx $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return sk.a.b;
      } else {
         if ($$0 == rt.b) {
            sx $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public sk.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
