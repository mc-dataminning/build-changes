import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sy {
   public static final sy a = new sy();
   private final Collection<sq> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sv c;

   private sy() {
   }

   public void a(sq $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sv $$0) {
      if (this.c != null) {
         af.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sq::k);
      }
   }
}
