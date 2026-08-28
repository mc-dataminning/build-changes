import java.util.ArrayDeque;
import java.util.Deque;

public class vt extends vp {
   private final Deque<vr> a = new ArrayDeque<>();

   public vt(vq... $$0) {
      vr $$1 = vr.a();

      for (vq $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ve.a a(vj<?> $$0, String $$1) {
      vr $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ve.a.b;
      } else {
         if ($$0 == uk.b) {
            vr $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ve.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
