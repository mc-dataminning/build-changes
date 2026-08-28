import javax.annotation.Nullable;

public class hkg {
   private boolean a;
   @Nullable
   private hka.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hkg(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hkb.a $$0) {
      if (this.c != null) {
         $$0.a(hka.j, !this.c.equals("vanilla"));
      }

      $$0.a(hka.k, this.a());
   }

   private hka.c a() {
      ggl $$0 = flh.Q().S();
      if ($$0 != null && $$0.e()) {
         return hka.c.a;
      } else {
         return flh.Q().U() ? hka.c.b : hka.c.c;
      }
   }

   public boolean a(hjx $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hjy.b, $$0x -> {
            $$0x.a(hka.n, this.b);
            if (this.d != null) {
               $$0x.a(hka.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgd $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hka.b.e : hka.b.a;
         case b -> hka.b.b;
         case c -> hka.b.c;
         case d -> hka.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
