import javax.annotation.Nullable;

public class hqw {
   private boolean a;
   @Nullable
   private hqq.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hqw(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hqr.a $$0) {
      if (this.c != null) {
         $$0.a(hqq.j, !this.c.equals("vanilla"));
      }

      $$0.a(hqq.k, this.a());
   }

   private hqq.c a() {
      gms $$0 = frf.Q().S();
      if ($$0 != null && $$0.e()) {
         return hqq.c.a;
      } else {
         return frf.Q().U() ? hqq.c.b : hqq.c.c;
      }
   }

   public boolean a(hqn $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hqo.b, $$0x -> {
            $$0x.a(hqq.n, this.b);
            if (this.d != null) {
               $$0x.a(hqq.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(djw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hqq.b.e : hqq.b.a;
         case b -> hqq.b.b;
         case c -> hqq.b.c;
         case d -> hqq.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
