import javax.annotation.Nullable;

public class hnt {
   private boolean a;
   @Nullable
   private hnn.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hnt(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hno.a $$0) {
      if (this.c != null) {
         $$0.a(hnn.j, !this.c.equals("vanilla"));
      }

      $$0.a(hnn.k, this.a());
   }

   private hnn.c a() {
      gjs $$0 = fof.Q().S();
      if ($$0 != null && $$0.e()) {
         return hnn.c.a;
      } else {
         return fof.Q().U() ? hnn.c.b : hnn.c.c;
      }
   }

   public boolean a(hnk $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hnl.b, $$0x -> {
            $$0x.a(hnn.n, this.b);
            if (this.d != null) {
               $$0x.a(hnn.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dim $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hnn.b.e : hnn.b.a;
         case b -> hnn.b.b;
         case c -> hnn.b.c;
         case d -> hnn.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
