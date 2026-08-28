import java.util.ArrayDeque;
import java.util.Deque;

public class wg extends wc {
   private final Deque<we> a = new ArrayDeque<>();

   public wg(wd... $$0) {
      we $$1 = we.a();

      for (wd $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vr.a a(vw<?> $$0, String $$1) {
      we $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vr.a.b;
      } else {
         if ($$0 == ux.b) {
            we $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vr.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
