import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sx {
   public static final sx a = new sx();
   private final Collection<sp> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private su c;

   private sx() {
   }

   public void a(sp $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(su $$0) {
      if (this.c != null) {
         af.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sp::k);
      }
   }
}
