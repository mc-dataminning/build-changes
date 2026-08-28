import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class th {
   public static final th a = new th();
   private final Collection<tb> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private te c;

   private th() {
   }

   public void a(tb $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(te $$0) {
      if (this.c != null) {
         ad.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(tb::j);
      }
   }
}
