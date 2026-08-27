import java.util.ArrayDeque;
import java.util.Deque;

public class vj extends vf {
   private final Deque<vh> a = new ArrayDeque<>();

   public vj(vg... $$0) {
      vh $$1 = vh.a();

      for (vg $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public uu.a a(uz<?> $$0, String $$1) {
      vh $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return uu.a.b;
      } else {
         if ($$0 == ua.b) {
            vh $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public uu.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
