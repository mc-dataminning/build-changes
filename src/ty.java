import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class ty {
   public static final ty a = new ty();
   private final Collection<ts> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tv c;

   private ty() {
   }

   public void a(ts $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tv $$0) {
      if (this.c != null) {
         ae.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(ts::k);
      }
   }
}
