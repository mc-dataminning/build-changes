import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sz {
   public static final sz a = new sz();
   private final Collection<st> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sw c;

   private sz() {
   }

   public void a(st $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sw $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(st::j);
      }
   }
}
