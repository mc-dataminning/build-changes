import javax.annotation.Nullable;

public class gdj {
   private boolean a;
   @Nullable
   private gdd.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gdj(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gde.a $$0) {
      if (this.c != null) {
         $$0.a(gdd.j, !this.c.equals("vanilla"));
      }

      $$0.a(gdd.k, this.a());
   }

   private gdd.c a() {
      fin $$0 = eqn.N().P();
      if ($$0 != null && $$0.e()) {
         return gdd.c.a;
      } else {
         return eqn.N().R() ? gdd.c.b : gdd.c.c;
      }
   }

   public boolean a(gda $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdb.b, $$0x -> {
            $$0x.a(gdd.n, this.b);
            if (this.d != null) {
               $$0x.a(gdd.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cph $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gdd.b.e : gdd.b.a;
         case b -> gdd.b.b;
         case c -> gdd.b.c;
         case d -> gdd.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
