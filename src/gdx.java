import javax.annotation.Nullable;

public class gdx {
   private boolean a;
   @Nullable
   private gdr.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gdx(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gds.a $$0) {
      if (this.c != null) {
         $$0.a(gdr.j, !this.c.equals("vanilla"));
      }

      $$0.a(gdr.k, this.a());
   }

   private gdr.c a() {
      fix $$0 = eql.O().Q();
      if ($$0 != null && $$0.e()) {
         return gdr.c.a;
      } else {
         return eql.O().S() ? gdr.c.b : gdr.c.c;
      }
   }

   public boolean a(gdo $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdp.b, $$0x -> {
            $$0x.a(gdr.n, this.b);
            if (this.d != null) {
               $$0x.a(gdr.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cpi $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gdr.b.e : gdr.b.a;
         case b -> gdr.b.b;
         case c -> gdr.b.c;
         case d -> gdr.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
