import com.google.common.collect.Lists;
import java.util.Collection;

public class px {
   public static final px a = new px();
   private final Collection<pr> b = Lists.newCopyOnWriteArrayList();

   public void a(pr $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(pr::b);
      this.b.removeIf(pr::k);
   }
}
