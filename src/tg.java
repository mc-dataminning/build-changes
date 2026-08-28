import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class tg {
   public static final tg a = new tg();
   private final Collection<ta> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private td c;

   private tg() {
   }

   public void a(ta $$0) {
      this.b.add($$0);
   }

   public void a() {
      this.b.clear();
      if (this.c != null) {
         this.c.c();
         this.c = null;
      }
   }

   public void a(td $$0) {
      if (this.c != null) {
         ad.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.b.forEach($$0 -> $$0.a(this.c));
         this.b.removeIf(ta::j);
      }
   }
}
