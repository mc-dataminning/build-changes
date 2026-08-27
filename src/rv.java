import com.google.common.collect.Lists;
import java.util.Collection;

public class rv {
   public static final rv a = new rv();
   private final Collection<rp> b = Lists.newCopyOnWriteArrayList();

   public void a(rp $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(rp::b);
      this.b.removeIf(rp::l);
   }
}
