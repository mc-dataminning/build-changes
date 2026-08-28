import javax.annotation.Nullable;

public class gva {
   private boolean a;
   @Nullable
   private guu.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gva(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(guv.a $$0) {
      if (this.c != null) {
         $$0.a(guu.j, !this.c.equals("vanilla"));
      }

      $$0.a(guu.k, this.a());
   }

   private guu.c a() {
      fyz $$0 = ffw.Q().S();
      if ($$0 != null && $$0.e()) {
         return guu.c.a;
      } else {
         return ffw.Q().U() ? guu.c.b : guu.c.c;
      }
   }

   public boolean a(gur $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gus.b, $$0x -> {
            $$0x.a(guu.n, this.b);
            if (this.d != null) {
               $$0x.a(guu.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dcd $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? guu.b.e : guu.b.a;
         case b -> guu.b.b;
         case c -> guu.b.c;
         case d -> guu.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
