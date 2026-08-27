import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tc {
   public static final tc a = new tc();
   private final Collection<sw> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sz c;

   private tc() {
   }

   public void a(sw $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sz $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sw::j);
      }
   }
}
