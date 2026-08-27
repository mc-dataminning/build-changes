import java.util.ArrayDeque;
import java.util.Deque;

public class uh extends ud {
   private final Deque<uf> a = new ArrayDeque<>();

   public uh(ue... $$0) {
      uf $$1 = uf.a();

      for (ue $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public ts.a a(tx<?> $$0, String $$1) {
      uf $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return ts.a.b;
      } else {
         if ($$0 == sy.b) {
            uf $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public ts.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
