import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sw {
   public static final sw a = new sw();
   private final Collection<so> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private st c;

   private sw() {
   }

   public void a(so $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(st $$0) {
      if (this.c != null) {
         af.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(so::k);
      }
   }
}
