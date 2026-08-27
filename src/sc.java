import java.util.ArrayDeque;
import java.util.Deque;

public class sc extends ry {
   private final Deque<sa> a = new ArrayDeque<>();

   public sc(rz... $$0) {
      sa $$1 = sa.a();

      for (rz $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public rn.a a(rs<?> $$0, String $$1) {
      sa $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return rn.a.b;
      } else {
         if ($$0 == qw.b) {
            sa $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public rn.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
