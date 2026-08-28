import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tt {
   public static final tt a = new tt();
   private final Collection<tn> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tq c;

   private tt() {
   }

   public void a(tn $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tq $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(tn::j);
      }
   }
}
