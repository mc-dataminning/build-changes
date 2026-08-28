import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class to {
   public static final to a = new to();
   private final Collection<ti> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tl c;

   private to() {
   }

   public void a(ti $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tl $$0) {
      if (this.c != null) {
         ae.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(ti::k);
      }
   }
}
