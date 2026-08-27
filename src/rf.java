import com.google.common.collect.Lists;
import java.util.Collection;

public class rf {
   public static final rf a = new rf();
   private final Collection<qz> b = Lists.newCopyOnWriteArrayList();

   public void a(qz $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(qz::b);
      this.b.removeIf(qz::k);
   }
}
