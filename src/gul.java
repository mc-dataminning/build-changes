import javax.annotation.Nullable;

public class gul {
   private boolean a;
   @Nullable
   private guf.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gul(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gug.a $$0) {
      if (this.c != null) {
         $$0.a(guf.j, !this.c.equals("vanilla"));
      }

      $$0.a(guf.k, this.a());
   }

   private guf.c a() {
      fyi $$0 = ffe.Q().S();
      if ($$0 != null && $$0.e()) {
         return guf.c.a;
      } else {
         return ffe.Q().U() ? guf.c.b : guf.c.c;
      }
   }

   public boolean a(guc $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gud.b, $$0x -> {
            $$0x.a(guf.n, this.b);
            if (this.d != null) {
               $$0x.a(guf.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbu $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? guf.b.e : guf.b.a;
         case b -> guf.b.b;
         case c -> guf.b.c;
         case d -> guf.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
