import javax.annotation.Nullable;

public class ggk {
   private boolean a;
   @Nullable
   private gge.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public ggk(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(ggf.a $$0) {
      if (this.c != null) {
         $$0.a(gge.j, !this.c.equals("vanilla"));
      }

      $$0.a(gge.k, this.a());
   }

   private gge.c a() {
      flh $$0 = esr.N().P();
      if ($$0 != null && $$0.e()) {
         return gge.c.a;
      } else {
         return esr.N().R() ? gge.c.b : gge.c.c;
      }
   }

   public boolean a(ggb $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(ggc.b, $$0x -> {
            $$0x.a(gge.n, this.b);
            if (this.d != null) {
               $$0x.a(gge.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(crp $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gge.b.e : gge.b.a;
         case b -> gge.b.b;
         case c -> gge.b.c;
         case d -> gge.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
