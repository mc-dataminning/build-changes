import javax.annotation.Nullable;

public class hcw {
   private boolean a;
   @Nullable
   private hcq.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hcw(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hcr.a $$0) {
      if (this.c != null) {
         $$0.a(hcq.j, !this.c.equals("vanilla"));
      }

      $$0.a(hcq.k, this.a());
   }

   private hcq.c a() {
      gca $$0 = fip.Q().S();
      if ($$0 != null && $$0.e()) {
         return hcq.c.a;
      } else {
         return fip.Q().U() ? hcq.c.b : hcq.c.c;
      }
   }

   public boolean a(hcn $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hco.b, $$0x -> {
            $$0x.a(hcq.n, this.b);
            if (this.d != null) {
               $$0x.a(hcq.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(deg $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hcq.b.e : hcq.b.a;
         case b -> hcq.b.b;
         case c -> hcq.b.c;
         case d -> hcq.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
