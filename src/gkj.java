import javax.annotation.Nullable;

public class gkj {
   private boolean a;
   @Nullable
   private gkd.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gkj(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gke.a $$0) {
      if (this.c != null) {
         $$0.a(gkd.j, !this.c.equals("vanilla"));
      }

      $$0.a(gkd.k, this.a());
   }

   private gkd.c a() {
      fop $$0 = evr.O().Q();
      if ($$0 != null && $$0.e()) {
         return gkd.c.a;
      } else {
         return evr.O().S() ? gkd.c.b : gkd.c.c;
      }
   }

   public boolean a(gka $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gkb.b, $$0x -> {
            $$0x.a(gkd.n, this.b);
            if (this.d != null) {
               $$0x.a(gkd.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ctu $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gkd.b.e : gkd.b.a;
         case b -> gkd.b.b;
         case c -> gkd.b.c;
         case d -> gkd.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
