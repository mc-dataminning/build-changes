import java.util.ArrayDeque;
import java.util.Deque;

public class sd extends rz {
   private final Deque<sb> a = new ArrayDeque<>();

   public sd(sa... $$0) {
      sb $$1 = sb.a();

      for (sa $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ro.a a(rt<?> $$0, String $$1) {
      sb $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ro.a.b;
      } else {
         if ($$0 == qy.b) {
            sb $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ro.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
