import com.google.common.collect.Lists;
import java.util.Collection;

public class qa {
   public static final qa a = new qa();
   private final Collection<pu> b = Lists.newCopyOnWriteArrayList();

   public void a(pu $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(pu::b);
      this.b.removeIf(pu::k);
   }
}
