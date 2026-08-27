import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class so {
   public static final so a = new so();
   private final Collection<si> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sl c;

   private so() {
   }

   public void a(si $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sl $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(si::j);
      }
   }
}
