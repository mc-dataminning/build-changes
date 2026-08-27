import javax.annotation.Nullable;

public class ged {
   private boolean a;
   @Nullable
   private gdx.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public ged(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gdy.a $$0) {
      if (this.c != null) {
         $$0.a(gdx.j, !this.c.equals("vanilla"));
      }

      $$0.a(gdx.k, this.a());
   }

   private gdx.c a() {
      fjd $$0 = eqp.O().Q();
      if ($$0 != null && $$0.e()) {
         return gdx.c.a;
      } else {
         return eqp.O().S() ? gdx.c.b : gdx.c.c;
      }
   }

   public boolean a(gdu $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gdv.b, $$0x -> {
            $$0x.a(gdx.n, this.b);
            if (this.d != null) {
               $$0x.a(gdx.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cpy $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gdx.b.e : gdx.b.a;
         case b -> gdx.b.b;
         case c -> gdx.b.c;
         case d -> gdx.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
