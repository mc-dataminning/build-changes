import javax.annotation.Nullable;

public class gdo {
   private boolean a;
   @Nullable
   private gdi.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gdo(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gdj.a $$0) {
      if (this.c != null) {
         $$0.a(gdi.j, !this.c.equals("vanilla"));
      }

      $$0.a(gdi.k, this.a());
   }

   private gdi.c a() {
      fis $$0 = eqm.O().Q();
      if ($$0 != null && $$0.e()) {
         return gdi.c.a;
      } else {
         return eqm.O().S() ? gdi.c.b : gdi.c.c;
      }
   }

   public boolean a(gdf $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdg.b, $$0x -> {
            $$0x.a(gdi.n, this.b);
            if (this.d != null) {
               $$0x.a(gdi.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cpj $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gdi.b.e : gdi.b.a;
         case b -> gdi.b.b;
         case c -> gdi.b.c;
         case d -> gdi.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
