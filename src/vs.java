import java.util.ArrayDeque;
import java.util.Deque;

public class vs extends vo {
   private final Deque<vq> a = new ArrayDeque<>();

   public vs(vp... $$0) {
      vq $$1 = vq.a();

      for (vp $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vd.a a(vi<?> $$0, String $$1) {
      vq $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vd.a.b;
      } else {
         if ($$0 == uj.b) {
            vq $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vd.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
