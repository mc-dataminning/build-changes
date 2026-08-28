import javax.annotation.Nullable;

public class guk {
   private boolean a;
   @Nullable
   private gue.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public guk(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(guf.a $$0) {
      if (this.c != null) {
         $$0.a(gue.j, !this.c.equals("vanilla"));
      }

      $$0.a(gue.k, this.a());
   }

   private gue.c a() {
      fyh $$0 = ffd.Q().S();
      if ($$0 != null && $$0.e()) {
         return gue.c.a;
      } else {
         return ffd.Q().U() ? gue.c.b : gue.c.c;
      }
   }

   public boolean a(gub $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(guc.b, $$0x -> {
            $$0x.a(gue.n, this.b);
            if (this.d != null) {
               $$0x.a(gue.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbt $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gue.b.e : gue.b.a;
         case b -> gue.b.b;
         case c -> gue.b.c;
         case d -> gue.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
