import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tu {
   public static final tu a = new tu();
   private final Collection<to> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tr c;

   private tu() {
   }

   public void a(to $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tr $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(to::j);
      }
   }
}
