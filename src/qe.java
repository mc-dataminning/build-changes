import com.google.common.collect.Lists;
import java.util.Collection;

public class qe {
   public static final qe a = new qe();
   private final Collection<py> b = Lists.newCopyOnWriteArrayList();

   public void a(py $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(py::b);
      this.b.removeIf(py::k);
   }
}
