import javax.annotation.Nullable;

public class hhc {
   private boolean a;
   @Nullable
   private hgw.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hhc(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hgx.a $$0) {
      if (this.c != null) {
         $$0.a(hgw.j, !this.c.equals("vanilla"));
      }

      $$0.a(hgw.k, this.a());
   }

   private hgw.c a() {
      gfx $$0 = fme.Q().S();
      if ($$0 != null && $$0.e()) {
         return hgw.c.a;
      } else {
         return fme.Q().U() ? hgw.c.b : hgw.c.c;
      }
   }

   public boolean a(hgt $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hgu.b, $$0x -> {
            $$0x.a(hgw.n, this.b);
            if (this.d != null) {
               $$0x.a(hgw.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dhe $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hgw.b.e : hgw.b.a;
         case b -> hgw.b.b;
         case c -> hgw.b.c;
         case d -> hgw.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
