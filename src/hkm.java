import javax.annotation.Nullable;

public class hkm {
   private boolean a;
   @Nullable
   private hkg.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hkm(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hkh.a $$0) {
      if (this.c != null) {
         $$0.a(hkg.j, !this.c.equals("vanilla"));
      }

      $$0.a(hkg.k, this.a());
   }

   private hkg.c a() {
      ggo $$0 = flj.Q().S();
      if ($$0 != null && $$0.e()) {
         return hkg.c.a;
      } else {
         return flj.Q().U() ? hkg.c.b : hkg.c.c;
      }
   }

   public boolean a(hkd $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hke.b, $$0x -> {
            $$0x.a(hkg.n, this.b);
            if (this.d != null) {
               $$0x.a(hkg.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgf $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hkg.b.e : hkg.b.a;
         case b -> hkg.b.b;
         case c -> hkg.b.c;
         case d -> hkg.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
