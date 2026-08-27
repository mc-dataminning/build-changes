import com.google.common.collect.Lists;
import java.util.Collection;

public class qd {
   public static final qd a = new qd();
   private final Collection<px> b = Lists.newCopyOnWriteArrayList();

   public void a(px $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(px::b);
      this.b.removeIf(px::k);
   }
}
