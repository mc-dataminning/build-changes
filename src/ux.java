import java.util.ArrayDeque;
import java.util.Deque;

public class ux extends ut {
   private final Deque<uv> a = new ArrayDeque<>();

   public ux(uu... $$0) {
      uv $$1 = uv.a();

      for (uu $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ui.a a(un<?> $$0, String $$1) {
      uv $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ui.a.b;
      } else {
         if ($$0 == to.b) {
            uv $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ui.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
