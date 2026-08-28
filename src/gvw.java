import javax.annotation.Nullable;

public class gvw {
   private boolean a;
   @Nullable
   private gvq.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gvw(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gvr.a $$0) {
      if (this.c != null) {
         $$0.a(gvq.j, !this.c.equals("vanilla"));
      }

      $$0.a(gvq.k, this.a());
   }

   private gvq.c a() {
      fzt $$0 = fgo.Q().S();
      if ($$0 != null && $$0.e()) {
         return gvq.c.a;
      } else {
         return fgo.Q().U() ? gvq.c.b : gvq.c.c;
      }
   }

   public boolean a(gvn $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gvo.b, $$0x -> {
            $$0x.a(gvq.n, this.b);
            if (this.d != null) {
               $$0x.a(gvq.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dct $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gvq.b.e : gvq.b.a;
         case b -> gvq.b.b;
         case c -> gvq.b.c;
         case d -> gvq.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
