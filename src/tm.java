import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tm {
   public static final tm a = new tm();
   private final Collection<tg> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private tj c;

   private tm() {
   }

   public void a(tg $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(tj $$0) {
      if (this.c != null) {
         ad.a("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(tg::j);
      }
   }
}
