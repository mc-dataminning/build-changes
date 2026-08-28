import javax.annotation.Nullable;

public class hpe {
   private boolean a;
   @Nullable
   private hoy.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hpe(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hoz.a $$0) {
      if (this.c != null) {
         $$0.a(hoy.j, !this.c.equals("vanilla"));
      }

      $$0.a(hoy.k, this.a());
   }

   private hoy.c a() {
      gla $$0 = fpo.Q().S();
      if ($$0 != null && $$0.e()) {
         return hoy.c.a;
      } else {
         return fpo.Q().U() ? hoy.c.b : hoy.c.c;
      }
   }

   public boolean a(hov $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(how.b, $$0x -> {
            $$0x.a(hoy.n, this.b);
            if (this.d != null) {
               $$0x.a(hoy.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dje $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hoy.b.e : hoy.b.a;
         case b -> hoy.b.b;
         case c -> hoy.b.c;
         case d -> hoy.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
