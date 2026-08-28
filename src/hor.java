import javax.annotation.Nullable;

public class hor {
   private boolean a;
   @Nullable
   private hol.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hor(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hom.a $$0) {
      if (this.c != null) {
         $$0.a(hol.j, !this.c.equals("vanilla"));
      }

      $$0.a(hol.k, this.a());
   }

   private hol.c a() {
      gko $$0 = foz.Q().S();
      if ($$0 != null && $$0.e()) {
         return hol.c.a;
      } else {
         return foz.Q().U() ? hol.c.b : hol.c.c;
      }
   }

   public boolean a(hoi $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hoj.b, $$0x -> {
            $$0x.a(hol.n, this.b);
            if (this.d != null) {
               $$0x.a(hol.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dix $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hol.b.e : hol.b.a;
         case b -> hol.b.b;
         case c -> hol.b.c;
         case d -> hol.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
