import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sz {
   public static final sz a = new sz();
   private final Collection<sr> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sw c;
   private sz.a d = sz.a.a;

   private sz() {
   }

   public void a(sr $$0) {
      this.b.add($$0);
   }

   public void a() {
      if (this.d != sz.a.a) {
         this.d = sz.a.c;
      } else {
         this.b.clear();
         if (this.c != null) {
            this.c.c();
            this.c = null;
         }
      }
   }

   public void a(sw $$0) {
      if (this.c != null) {
         ag.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.d = sz.a.b;
         this.b.forEach($$0x -> $$0x.a(this.c));
         this.b.removeIf(sr::k);
         sz.a $$0 = this.d;
         this.d = sz.a.a;
         if ($$0 == sz.a.c) {
            this.a();
         }
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
