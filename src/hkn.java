import javax.annotation.Nullable;

public class hkn {
   private boolean a;
   @Nullable
   private hkh.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hkn(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hki.a $$0) {
      if (this.c != null) {
         $$0.a(hkh.j, !this.c.equals("vanilla"));
      }

      $$0.a(hkh.k, this.a());
   }

   private hkh.c a() {
      ggp $$0 = flk.Q().S();
      if ($$0 != null && $$0.e()) {
         return hkh.c.a;
      } else {
         return flk.Q().U() ? hkh.c.b : hkh.c.c;
      }
   }

   public boolean a(hke $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hkf.b, $$0x -> {
            $$0x.a(hkh.n, this.b);
            if (this.d != null) {
               $$0x.a(hkh.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgg $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hkh.b.e : hkh.b.a;
         case b -> hkh.b.b;
         case c -> hkh.b.c;
         case d -> hkh.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
