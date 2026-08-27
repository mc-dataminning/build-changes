import javax.annotation.Nullable;

public class gjt {
   private boolean a;
   @Nullable
   private gjn.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gjt(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gjo.a $$0) {
      if (this.c != null) {
         $$0.a(gjn.j, !this.c.equals("vanilla"));
      }

      $$0.a(gjn.k, this.a());
   }

   private gjn.c a() {
      fob $$0 = evg.O().Q();
      if ($$0 != null && $$0.e()) {
         return gjn.c.a;
      } else {
         return evg.O().S() ? gjn.c.b : gjn.c.c;
      }
   }

   public boolean a(gjk $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gjl.b, $$0x -> {
            $$0x.a(gjn.n, this.b);
            if (this.d != null) {
               $$0x.a(gjn.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ctl $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gjn.b.e : gjn.b.a;
         case b -> gjn.b.b;
         case c -> gjn.b.c;
         case d -> gjn.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
