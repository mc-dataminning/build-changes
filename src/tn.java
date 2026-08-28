import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tn {
   public static final tn a = new tn();
   private final Collection<th> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tk c;

   private tn() {
   }

   public void a(th $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tk $$0) {
      if (this.c != null) {
         ae.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(th::k);
      }
   }
}
