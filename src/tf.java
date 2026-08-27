import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tf {
   public static final tf a = new tf();
   private final Collection<sz> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tc c;

   private tf() {
   }

   public void a(sz $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tc $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sz::j);
      }
   }
}
