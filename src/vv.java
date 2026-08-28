import java.util.ArrayDeque;
import java.util.Deque;

public class vv extends vr {
   private final Deque<vt> a = new ArrayDeque<>();

   public vv(vs... $$0) {
      vt $$1 = vt.a();

      for (vs $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vg.a a(vl<?> $$0, String $$1) {
      vt $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vg.a.b;
      } else {
         if ($$0 == um.b) {
            vt $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vg.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
