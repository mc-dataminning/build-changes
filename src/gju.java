import javax.annotation.Nullable;

public class gju {
   private boolean a;
   @Nullable
   private gjo.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gju(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gjp.a $$0) {
      if (this.c != null) {
         $$0.a(gjo.j, !this.c.equals("vanilla"));
      }

      $$0.a(gjo.k, this.a());
   }

   private gjo.c a() {
      foc $$0 = evh.O().Q();
      if ($$0 != null && $$0.e()) {
         return gjo.c.a;
      } else {
         return evh.O().S() ? gjo.c.b : gjo.c.c;
      }
   }

   public boolean a(gjl $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gjm.b, $$0x -> {
            $$0x.a(gjo.n, this.b);
            if (this.d != null) {
               $$0x.a(gjo.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ctl $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gjo.b.e : gjo.b.a;
         case b -> gjo.b.b;
         case c -> gjo.b.c;
         case d -> gjo.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
