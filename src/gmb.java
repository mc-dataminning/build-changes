import javax.annotation.Nullable;

public class gmb {
   private boolean a;
   @Nullable
   private glv.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gmb(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(glw.a $$0) {
      if (this.c != null) {
         $$0.a(glv.j, !this.c.equals("vanilla"));
      }

      $$0.a(glv.k, this.a());
   }

   private glv.c a() {
      fqi $$0 = exh.O().Q();
      if ($$0 != null && $$0.e()) {
         return glv.c.a;
      } else {
         return exh.O().S() ? glv.c.b : glv.c.c;
      }
   }

   public boolean a(gls $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(glt.b, $$0x -> {
            $$0x.a(glv.n, this.b);
            if (this.d != null) {
               $$0x.a(glv.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cvk $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? glv.b.e : glv.b.a;
         case b -> glv.b.b;
         case c -> glv.b.c;
         case d -> glv.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
