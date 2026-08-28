import javax.annotation.Nullable;

public class hkl {
   private boolean a;
   @Nullable
   private hkf.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hkl(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hkg.a $$0) {
      if (this.c != null) {
         $$0.a(hkf.j, !this.c.equals("vanilla"));
      }

      $$0.a(hkf.k, this.a());
   }

   private hkf.c a() {
      ggn $$0 = fli.Q().S();
      if ($$0 != null && $$0.e()) {
         return hkf.c.a;
      } else {
         return fli.Q().U() ? hkf.c.b : hkf.c.c;
      }
   }

   public boolean a(hkc $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hkd.b, $$0x -> {
            $$0x.a(hkf.n, this.b);
            if (this.d != null) {
               $$0x.a(hkf.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dge $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hkf.b.e : hkf.b.a;
         case b -> hkf.b.b;
         case c -> hkf.b.c;
         case d -> hkf.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
