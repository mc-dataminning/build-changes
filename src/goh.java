import javax.annotation.Nullable;

public class goh {
   private boolean a;
   @Nullable
   private gob.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public goh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(goc.a $$0) {
      if (this.c != null) {
         $$0.a(gob.j, !this.c.equals("vanilla"));
      }

      $$0.a(gob.k, this.a());
   }

   private gob.c a() {
      fsm $$0 = ezg.Q().S();
      if ($$0 != null && $$0.e()) {
         return gob.c.a;
      } else {
         return ezg.Q().U() ? gob.c.b : gob.c.c;
      }
   }

   public boolean a(gny $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gnz.b, $$0x -> {
            $$0x.a(gob.n, this.b);
            if (this.d != null) {
               $$0x.a(gob.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cww $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gob.b.e : gob.b.a;
         case b -> gob.b.b;
         case c -> gob.b.c;
         case d -> gob.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
