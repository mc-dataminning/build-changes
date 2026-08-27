import javax.annotation.Nullable;

public class geh {
   private boolean a;
   @Nullable
   private geb.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public geh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gec.a $$0) {
      if (this.c != null) {
         $$0.a(geb.j, !this.c.equals("vanilla"));
      }

      $$0.a(geb.k, this.a());
   }

   private geb.c a() {
      fjh $$0 = eqv.O().Q();
      if ($$0 != null && $$0.e()) {
         return geb.c.a;
      } else {
         return eqv.O().S() ? geb.c.b : geb.c.c;
      }
   }

   public boolean a(gdy $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdz.b, $$0x -> {
            $$0x.a(geb.n, this.b);
            if (this.d != null) {
               $$0x.a(geb.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cps $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? geb.b.e : geb.b.a;
         case b -> geb.b.b;
         case c -> geb.b.c;
         case d -> geb.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
