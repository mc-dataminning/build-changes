import javax.annotation.Nullable;

public class guy {
   private boolean a;
   @Nullable
   private gus.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public guy(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gut.a $$0) {
      if (this.c != null) {
         $$0.a(gus.j, !this.c.equals("vanilla"));
      }

      $$0.a(gus.k, this.a());
   }

   private gus.c a() {
      fyx $$0 = fft.Q().S();
      if ($$0 != null && $$0.e()) {
         return gus.c.a;
      } else {
         return fft.Q().U() ? gus.c.b : gus.c.c;
      }
   }

   public boolean a(gup $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(guq.b, $$0x -> {
            $$0x.a(gus.n, this.b);
            if (this.d != null) {
               $$0x.a(gus.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dcc $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gus.b.e : gus.b.a;
         case b -> gus.b.b;
         case c -> gus.b.c;
         case d -> gus.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
