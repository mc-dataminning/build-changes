import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class ta {
   public static final ta a = new ta();
   private final Collection<su> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sx c;

   private ta() {
   }

   public void a(su $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sx $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(su::j);
      }
   }
}
