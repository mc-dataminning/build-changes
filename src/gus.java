import javax.annotation.Nullable;

public class gus {
   private boolean a;
   @Nullable
   private gum.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gus(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gun.a $$0) {
      if (this.c != null) {
         $$0.a(gum.j, !this.c.equals("vanilla"));
      }

      $$0.a(gum.k, this.a());
   }

   private gum.c a() {
      fyr $$0 = ffn.Q().S();
      if ($$0 != null && $$0.e()) {
         return gum.c.a;
      } else {
         return ffn.Q().U() ? gum.c.b : gum.c.c;
      }
   }

   public boolean a(guj $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(guk.b, $$0x -> {
            $$0x.a(gum.n, this.b);
            if (this.d != null) {
               $$0x.a(gum.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dca $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gum.b.e : gum.b.a;
         case b -> gum.b.b;
         case c -> gum.b.c;
         case d -> gum.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
