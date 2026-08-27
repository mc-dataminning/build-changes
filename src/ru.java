import com.google.common.collect.Lists;
import java.util.Collection;

public class ru {
   public static final ru a = new ru();
   private final Collection<ro> b = Lists.newCopyOnWriteArrayList();

   public void a(ro $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(ro::b);
      this.b.removeIf(ro::l);
   }
}
