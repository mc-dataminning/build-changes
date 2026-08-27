import com.google.common.collect.ForwardingList;
import java.util.List;

public class fup extends ForwardingList<coz> {
   private final is<coz> a = is.a(chg.g(), coz.h);

   protected List<coz> delegate() {
      return this.a;
   }

   public tc a() {
      tc $$0 = new tc();

      for (coz $$1 : this.delegate()) {
         $$0.add($$1.b(new sw()));
      }

      return $$0;
   }

   public void a(tc $$0) {
      List<coz> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, coz.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (coz $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
