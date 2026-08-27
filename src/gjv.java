import javax.annotation.Nullable;

public class gjv {
   private boolean a;
   @Nullable
   private gjp.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gjv(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gjq.a $$0) {
      if (this.c != null) {
         $$0.a(gjp.j, !this.c.equals("vanilla"));
      }

      $$0.a(gjp.k, this.a());
   }

   private gjp.c a() {
      fod $$0 = evi.O().Q();
      if ($$0 != null && $$0.e()) {
         return gjp.c.a;
      } else {
         return evi.O().S() ? gjp.c.b : gjp.c.c;
      }
   }

   public boolean a(gjm $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gjn.b, $$0x -> {
            $$0x.a(gjp.n, this.b);
            if (this.d != null) {
               $$0x.a(gjp.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ctm $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gjp.b.e : gjp.b.a;
         case b -> gjp.b.b;
         case c -> gjp.b.c;
         case d -> gjp.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
