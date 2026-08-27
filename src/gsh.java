import javax.annotation.Nullable;

public class gsh {
   private boolean a;
   @Nullable
   private gsb.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gsh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gsc.a $$0) {
      if (this.c != null) {
         $$0.a(gsb.j, !this.c.equals("vanilla"));
      }

      $$0.a(gsb.k, this.a());
   }

   private gsb.c a() {
      fwk $$0 = fde.Q().S();
      if ($$0 != null && $$0.e()) {
         return gsb.c.a;
      } else {
         return fde.Q().U() ? gsb.c.b : gsb.c.c;
      }
   }

   public boolean a(gry $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(grz.b, $$0x -> {
            $$0x.a(gsb.n, this.b);
            if (this.d != null) {
               $$0x.a(gsb.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(daa $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gsb.b.e : gsb.b.a;
         case b -> gsb.b.b;
         case c -> gsb.b.c;
         case d -> gsb.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
