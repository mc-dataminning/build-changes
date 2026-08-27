import javax.annotation.Nullable;

public class gfd {
   private boolean a;
   @Nullable
   private gex.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gfd(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gey.a $$0) {
      if (this.c != null) {
         $$0.a(gex.j, !this.c.equals("vanilla"));
      }

      $$0.a(gex.k, this.a());
   }

   private gex.c a() {
      fkc $$0 = ero.O().Q();
      if ($$0 != null && $$0.e()) {
         return gex.c.a;
      } else {
         return ero.O().S() ? gex.c.b : gex.c.c;
      }
   }

   public boolean a(geu $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gev.b, $$0x -> {
            $$0x.a(gex.n, this.b);
            if (this.d != null) {
               $$0x.a(gex.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cqw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gex.b.e : gex.b.a;
         case b -> gex.b.b;
         case c -> gex.b.c;
         case d -> gex.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
