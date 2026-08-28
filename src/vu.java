import java.util.ArrayDeque;
import java.util.Deque;

public class vu extends vq {
   private final Deque<vs> a = new ArrayDeque<>();

   public vu(vr... $$0) {
      vs $$1 = vs.a();

      for (vr $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public vf.a a(vk<?> $$0, String $$1) {
      vs $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return vf.a.b;
      } else {
         if ($$0 == ul.b) {
            vs $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public vf.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
