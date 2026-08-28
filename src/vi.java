import java.util.ArrayDeque;
import java.util.Deque;

public class vi extends ve {
   private final Deque<vg> a = new ArrayDeque<>();

   public vi(vf... $$0) {
      vg $$1 = vg.a();

      for (vf $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ut.a a(uy<?> $$0, String $$1) {
      vg $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ut.a.b;
      } else {
         if ($$0 == tz.b) {
            vg $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ut.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
