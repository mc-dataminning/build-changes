import javax.annotation.Nullable;

public class hqk {
   private boolean a;
   @Nullable
   private hqe.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hqk(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hqf.a $$0) {
      if (this.c != null) {
         $$0.a(hqe.j, !this.c.equals("vanilla"));
      }

      $$0.a(hqe.k, this.a());
   }

   private hqe.c a() {
      gmd $$0 = fqq.Q().S();
      if ($$0 != null && $$0.e()) {
         return hqe.c.a;
      } else {
         return fqq.Q().U() ? hqe.c.b : hqe.c.c;
      }
   }

   public boolean a(hqb $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hqc.b, $$0x -> {
            $$0x.a(hqe.n, this.b);
            if (this.d != null) {
               $$0x.a(hqe.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dkg $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hqe.b.e : hqe.b.a;
         case b -> hqe.b.b;
         case c -> hqe.b.c;
         case d -> hqe.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
