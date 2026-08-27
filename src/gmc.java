import javax.annotation.Nullable;

public class gmc {
   private boolean a;
   @Nullable
   private glw.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gmc(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(glx.a $$0) {
      if (this.c != null) {
         $$0.a(glw.j, !this.c.equals("vanilla"));
      }

      $$0.a(glw.k, this.a());
   }

   private glw.c a() {
      fqi $$0 = exh.O().Q();
      if ($$0 != null && $$0.e()) {
         return glw.c.a;
      } else {
         return exh.O().S() ? glw.c.b : glw.c.c;
      }
   }

   public boolean a(glt $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(glu.b, $$0x -> {
            $$0x.a(glw.n, this.b);
            if (this.d != null) {
               $$0x.a(glw.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cvk $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? glw.b.e : glw.b.a;
         case b -> glw.b.b;
         case c -> glw.b.c;
         case d -> glw.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
