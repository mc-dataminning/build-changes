import java.util.ArrayDeque;
import java.util.Deque;

public class ti extends te {
   private final Deque<tg> a = new ArrayDeque<>();

   public ti(tf... $$0) {
      tg $$1 = tg.a();

      for (tf $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public st.a a(sy<?> $$0, String $$1) {
      tg $$2 = this.a.element();
      if ($$2.a($$0, $$1)) {
         return st.a.b;
      } else {
         if ($$0 == rz.b) {
            tg $$3 = $$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public st.b b() {
      if (this.e() == this.a.element().b()) {
         this.a.pop();
      }

      return super.b();
   }
}
