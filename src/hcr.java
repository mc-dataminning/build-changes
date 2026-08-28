import javax.annotation.Nullable;

public class hcr {
   private boolean a;
   @Nullable
   private hcl.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hcr(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hcm.a $$0) {
      if (this.c != null) {
         $$0.a(hcl.j, !this.c.equals("vanilla"));
      }

      $$0.a(hcl.k, this.a());
   }

   private hcl.c a() {
      gbv $$0 = fil.Q().S();
      if ($$0 != null && $$0.e()) {
         return hcl.c.a;
      } else {
         return fil.Q().U() ? hcl.c.b : hcl.c.c;
      }
   }

   public boolean a(hci $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hcj.b, $$0x -> {
            $$0x.a(hcl.n, this.b);
            if (this.d != null) {
               $$0x.a(hcl.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ded $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hcl.b.e : hcl.b.a;
         case b -> hcl.b.b;
         case c -> hcl.b.c;
         case d -> hcl.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
