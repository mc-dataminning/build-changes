import javax.annotation.Nullable;

public class gun {
   private boolean a;
   @Nullable
   private guh.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gun(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gui.a $$0) {
      if (this.c != null) {
         $$0.a(guh.j, !this.c.equals("vanilla"));
      }

      $$0.a(guh.k, this.a());
   }

   private guh.c a() {
      fyk $$0 = ffg.Q().S();
      if ($$0 != null && $$0.e()) {
         return guh.c.a;
      } else {
         return ffg.Q().U() ? guh.c.b : guh.c.c;
      }
   }

   public boolean a(gue $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(guf.b, $$0x -> {
            $$0x.a(guh.n, this.b);
            if (this.d != null) {
               $$0x.a(guh.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? guh.b.e : guh.b.a;
         case b -> guh.b.b;
         case c -> guh.b.c;
         case d -> guh.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
