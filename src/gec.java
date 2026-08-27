import javax.annotation.Nullable;

public class gec {
   private boolean a;
   @Nullable
   private gdw.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gec(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gdx.a $$0) {
      if (this.c != null) {
         $$0.a(gdw.j, !this.c.equals("vanilla"));
      }

      $$0.a(gdw.k, this.a());
   }

   private gdw.c a() {
      fjc $$0 = eqq.O().Q();
      if ($$0 != null && $$0.e()) {
         return gdw.c.a;
      } else {
         return eqq.O().S() ? gdw.c.b : gdw.c.c;
      }
   }

   public boolean a(gdt $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdu.b, $$0x -> {
            $$0x.a(gdw.n, this.b);
            if (this.d != null) {
               $$0x.a(gdw.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cpn $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gdw.b.e : gdw.b.a;
         case b -> gdw.b.b;
         case c -> gdw.b.c;
         case d -> gdw.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
