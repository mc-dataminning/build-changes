import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sq {
   public static final sq a = new sq();
   private final Collection<sk> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sn c;

   private sq() {
   }

   public void a(sk $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(sn $$0) {
      if (this.c != null) {
         ac.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(sk::j);
      }
   }
}
