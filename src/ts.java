import java.util.ArrayDeque;
import java.util.Deque;

public class ts extends to {
   private final Deque<tq> a = new ArrayDeque<>();

   public ts(tp... $$0) {
      tq $$1 = tq.a();

      for (tp $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public td.a a(ti<?> $$0, String $$1) {
      tq $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return td.a.b;
      } else {
         if ($$0 == sj.b) {
            tq $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public td.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
