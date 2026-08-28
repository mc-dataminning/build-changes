import javax.annotation.Nullable;

public class hhd {
   private boolean a;
   @Nullable
   private hgx.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hhd(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hgy.a $$0) {
      if (this.c != null) {
         $$0.a(hgx.j, !this.c.equals("vanilla"));
      }

      $$0.a(hgx.k, this.a());
   }

   private hgx.c a() {
      gfy $$0 = fmf.Q().S();
      if ($$0 != null && $$0.e()) {
         return hgx.c.a;
      } else {
         return fmf.Q().U() ? hgx.c.b : hgx.c.c;
      }
   }

   public boolean a(hgu $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hgv.b, $$0x -> {
            $$0x.a(hgx.n, this.b);
            if (this.d != null) {
               $$0x.a(hgx.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dhe $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hgx.b.e : hgx.b.a;
         case b -> hgx.b.b;
         case c -> hgx.b.c;
         case d -> hgx.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
