import java.util.ArrayDeque;
import java.util.Deque;

public class vh extends vd {
   private final Deque<vf> a = new ArrayDeque<>();

   public vh(ve... $$0) {
      vf $$1 = vf.a();

      for (ve $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public us.a a(ux<?> $$0, String $$1) {
      vf $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return us.a.b;
      } else {
         if ($$0 == ty.b) {
            vf $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public us.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
