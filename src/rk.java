import com.google.common.collect.Lists;
import java.util.Collection;

public class rk {
   public static final rk a = new rk();
   private final Collection<re> b = Lists.newCopyOnWriteArrayList();

   public void a(re $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(re::b);
      this.b.removeIf(re::l);
   }
}
