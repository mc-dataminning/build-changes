import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class td {
   public static final td a = new td();
   private final Collection<sx> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private ta c;

   private td() {
   }

   public void a(sx $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(ta $$0) {
      if (this.c != null) {
         ad.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sx::j);
      }
   }
}
