import javax.annotation.Nullable;

public class gum {
   private boolean a;
   @Nullable
   private gug.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gum(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(guh.a $$0) {
      if (this.c != null) {
         $$0.a(gug.j, !this.c.equals("vanilla"));
      }

      $$0.a(gug.k, this.a());
   }

   private gug.c a() {
      fyj $$0 = fff.Q().S();
      if ($$0 != null && $$0.e()) {
         return gug.c.a;
      } else {
         return fff.Q().U() ? gug.c.b : gug.c.c;
      }
   }

   public boolean a(gud $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gue.b, $$0x -> {
            $$0x.a(gug.n, this.b);
            if (this.d != null) {
               $$0x.a(gug.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbv $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gug.b.e : gug.b.a;
         case b -> gug.b.b;
         case c -> gug.b.c;
         case d -> gug.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
