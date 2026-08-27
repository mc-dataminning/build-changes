import javax.annotation.Nullable;

public class gte {
   private boolean a;
   @Nullable
   private gsy.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gte(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gsz.a $$0) {
      if (this.c != null) {
         $$0.a(gsy.j, !this.c.equals("vanilla"));
      }

      $$0.a(gsy.k, this.a());
   }

   private gsy.c a() {
      fxf $$0 = feb.Q().S();
      if ($$0 != null && $$0.e()) {
         return gsy.c.a;
      } else {
         return feb.Q().U() ? gsy.c.b : gsy.c.c;
      }
   }

   public boolean a(gsv $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gsw.b, $$0x -> {
            $$0x.a(gsy.n, this.b);
            if (this.d != null) {
               $$0x.a(gsy.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(daw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gsy.b.e : gsy.b.a;
         case b -> gsy.b.b;
         case c -> gsy.b.c;
         case d -> gsy.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
