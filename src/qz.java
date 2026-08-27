import com.google.common.collect.Lists;
import java.util.Collection;

public class qz {
   public static final qz a = new qz();
   private final Collection<qt> b = Lists.newCopyOnWriteArrayList();

   public void a(qt $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(qt::b);
      this.b.removeIf(qt::k);
   }
}
