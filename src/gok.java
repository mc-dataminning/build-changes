import javax.annotation.Nullable;

public class gok {
   private boolean a;
   @Nullable
   private goe.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gok(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gof.a $$0) {
      if (this.c != null) {
         $$0.a(goe.j, !this.c.equals("vanilla"));
      }

      $$0.a(goe.k, this.a());
   }

   private goe.c a() {
      fso $$0 = ezi.Q().S();
      if ($$0 != null && $$0.e()) {
         return goe.c.a;
      } else {
         return ezi.Q().U() ? goe.c.b : goe.c.c;
      }
   }

   public boolean a(gob $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(goc.b, $$0x -> {
            $$0x.a(goe.n, this.b);
            if (this.d != null) {
               $$0x.a(goe.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cwy $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? goe.b.e : goe.b.a;
         case b -> goe.b.b;
         case c -> goe.b.c;
         case d -> goe.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
