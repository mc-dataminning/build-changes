import javax.annotation.Nullable;

public class gra {
   private boolean a;
   @Nullable
   private gqu.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gra(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gqv.a $$0) {
      if (this.c != null) {
         $$0.a(gqu.j, !this.c.equals("vanilla"));
      }

      $$0.a(gqu.k, this.a());
   }

   private gqu.c a() {
      fve $$0 = fby.Q().S();
      if ($$0 != null && $$0.e()) {
         return gqu.c.a;
      } else {
         return fby.Q().U() ? gqu.c.b : gqu.c.c;
      }
   }

   public boolean a(gqr $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gqs.b, $$0x -> {
            $$0x.a(gqu.n, this.b);
            if (this.d != null) {
               $$0x.a(gqu.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(czd $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gqu.b.e : gqu.b.a;
         case b -> gqu.b.b;
         case c -> gqu.b.c;
         case d -> gqu.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
