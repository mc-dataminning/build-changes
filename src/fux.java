import com.google.common.collect.ForwardingList;
import java.util.List;

public class fux extends ForwardingList<cpd> {
   private final is<cpd> a = is.a(chk.g(), cpd.h);

   protected List<cpd> delegate() {
      return this.a;
   }

   public tc a() {
      tc $$0 = new tc();

      for (cpd $$1 : this.delegate()) {
         $$0.add($$1.b(new sw()));
      }

      return $$0;
   }

   public void a(tc $$0) {
      List<cpd> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cpd.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cpd $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
