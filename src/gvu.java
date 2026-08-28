import javax.annotation.Nullable;

public class gvu {
   private boolean a;
   @Nullable
   private gvo.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gvu(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gvp.a $$0) {
      if (this.c != null) {
         $$0.a(gvo.j, !this.c.equals("vanilla"));
      }

      $$0.a(gvo.k, this.a());
   }

   private gvo.c a() {
      fzr $$0 = fgm.Q().S();
      if ($$0 != null && $$0.e()) {
         return gvo.c.a;
      } else {
         return fgm.Q().U() ? gvo.c.b : gvo.c.c;
      }
   }

   public boolean a(gvl $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gvm.b, $$0x -> {
            $$0x.a(gvo.n, this.b);
            if (this.d != null) {
               $$0x.a(gvo.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dct $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gvo.b.e : gvo.b.a;
         case b -> gvo.b.b;
         case c -> gvo.b.c;
         case d -> gvo.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
