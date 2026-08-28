import javax.annotation.Nullable;

public class hhe {
   private boolean a;
   @Nullable
   private hgy.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hhe(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hgz.a $$0) {
      if (this.c != null) {
         $$0.a(hgy.j, !this.c.equals("vanilla"));
      }

      $$0.a(hgy.k, this.a());
   }

   private hgy.c a() {
      gfz $$0 = fmg.Q().S();
      if ($$0 != null && $$0.e()) {
         return hgy.c.a;
      } else {
         return fmg.Q().U() ? hgy.c.b : hgy.c.c;
      }
   }

   public boolean a(hgv $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hgw.b, $$0x -> {
            $$0x.a(hgy.n, this.b);
            if (this.d != null) {
               $$0x.a(hgy.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dhf $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hgy.b.e : hgy.b.a;
         case b -> hgy.b.b;
         case c -> hgy.b.c;
         case d -> hgy.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
