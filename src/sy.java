import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public class sy {
   public static final sy a = new sy();
   private final Collection<sq> b = Lists.newCopyOnWriteArrayList();
   @Nullable
   private sv c;
   private sy.a d = sy.a.a;

   private sy() {
   }

   public void a(sq $$0) {
      this.b.add($$0);
   }

   public void a() {
      if (this.d != sy.a.a) {
         this.d = sy.a.c;
      } else {
         this.b.clear();
         if (this.c != null) {
            this.c.c();
            this.c = null;
         }
      }
   }

   public void a(sv $$0) {
      if (this.c != null) {
         ag.b("The runner was already set in GameTestTicker");
      }

      this.c = $$0;
   }

   public void b() {
      if (this.c != null) {
         this.d = sy.a.b;
         this.b.forEach($$0x -> $$0x.a(this.c));
         this.b.removeIf(sq::k);
         sy.a $$0 = this.d;
         this.d = sy.a.a;
         if ($$0 == sy.a.c) {
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
