import javax.annotation.Nullable;

public class guh {
   private boolean a;
   @Nullable
   private gub.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public guh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(guc.a $$0) {
      if (this.c != null) {
         $$0.a(gub.j, !this.c.equals("vanilla"));
      }

      $$0.a(gub.k, this.a());
   }

   private gub.c a() {
      fye $$0 = ffa.Q().S();
      if ($$0 != null && $$0.e()) {
         return gub.c.a;
      } else {
         return ffa.Q().U() ? gub.c.b : gub.c.c;
      }
   }

   public boolean a(gty $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gtz.b, $$0x -> {
            $$0x.a(gub.n, this.b);
            if (this.d != null) {
               $$0x.a(gub.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbq $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gub.b.e : gub.b.a;
         case b -> gub.b.b;
         case c -> gub.b.c;
         case d -> gub.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
