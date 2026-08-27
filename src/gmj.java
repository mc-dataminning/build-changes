import javax.annotation.Nullable;

public class gmj {
   private boolean a;
   @Nullable
   private gmd.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gmj(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gme.a $$0) {
      if (this.c != null) {
         $$0.a(gmd.j, !this.c.equals("vanilla"));
      }

      $$0.a(gmd.k, this.a());
   }

   private gmd.c a() {
      fqq $$0 = exo.P().R();
      if ($$0 != null && $$0.e()) {
         return gmd.c.a;
      } else {
         return exo.P().T() ? gmd.c.b : gmd.c.c;
      }
   }

   public boolean a(gma $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gmb.b, $$0x -> {
            $$0x.a(gmd.n, this.b);
            if (this.d != null) {
               $$0x.a(gmd.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cvo $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gmd.b.e : gmd.b.a;
         case b -> gmd.b.b;
         case c -> gmd.b.c;
         case d -> gmd.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
