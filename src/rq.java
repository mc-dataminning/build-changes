import com.google.common.collect.Lists;
import java.util.Collection;

public class rq {
   public static final rq a = new rq();
   private final Collection<rk> b = Lists.newCopyOnWriteArrayList();

   public void a(rk $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
   }

   public void b() {
      this.b.forEach(rk::b);
      this.b.removeIf(rk::l);
   }
}
