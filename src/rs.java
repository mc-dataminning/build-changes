import com.google.common.collect.Lists;
import java.util.Collection;

public class rs {
   public static final rs a = new rs();
   private final Collection<rm> b = Lists.newCopyOnWriteArrayList();

   public void a(rm $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(rm::b);
      this.b.removeIf(rm::l);
   }
}
