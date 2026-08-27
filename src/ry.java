import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class ry {
   public static final ry a = new ry();
   private final Collection<rs> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private rv c;

   private ry() {
   }

   public void a(rs $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(rv $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(rs::j);
      }
   }
}
