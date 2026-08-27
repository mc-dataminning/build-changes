import com.google.common.collect.Lists;
import java.util.Collection;

public class rg {
   public static final rg a = new rg();
   private final Collection<ra> b = Lists.newCopyOnWriteArrayList();

   public void a(ra $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(ra::b);
      this.b.removeIf(ra::l);
   }
}
