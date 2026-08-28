import java.util.ArrayDeque;
import java.util.Deque;

public class vf extends vb {
   private final Deque<vd> a = new ArrayDeque<>();

   public vf(vc... $$0) {
      vd $$1 = vd.a();

      for (vc $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public uq.a a(uv<?> $$0, String $$1) {
      vd $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return uq.a.b;
      } else {
         if ($$0 == tw.b) {
            vd $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public uq.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
