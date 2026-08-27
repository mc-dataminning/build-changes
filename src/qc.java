import com.google.common.collect.Lists;
import java.util.Collection;

public class qc {
   public static final qc a = new qc();
   private final Collection<pw> b = Lists.newCopyOnWriteArrayList();

   public void a(pw $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(pw::b);
      this.b.removeIf(pw::k);
   }
}
