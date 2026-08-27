import javax.annotation.Nullable;

public class gej {
   private boolean a;
   @Nullable
   private ged.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gej(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gee.a $$0) {
      if (this.c != null) {
         $$0.a(ged.j, !this.c.equals("vanilla"));
      }

      $$0.a(ged.k, this.a());
   }

   private ged.c a() {
      fjj $$0 = eqx.O().Q();
      if ($$0 != null && $$0.e()) {
         return ged.c.a;
      } else {
         return eqx.O().S() ? ged.c.b : ged.c.c;
      }
   }

   public boolean a(gea $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(geb.b, $$0x -> {
            $$0x.a(ged.n, this.b);
            if (this.d != null) {
               $$0x.a(ged.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cpu $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? ged.b.e : ged.b.a;
         case b -> ged.b.b;
         case c -> ged.b.c;
         case d -> ged.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
