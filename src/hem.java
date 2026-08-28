import javax.annotation.Nullable;

public class hem {
   private boolean a;
   @Nullable
   private heg.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hem(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(heh.a $$0) {
      if (this.c != null) {
         $$0.a(heg.j, !this.c.equals("vanilla"));
      }

      $$0.a(heg.k, this.a());
   }

   private heg.c a() {
      gdm $$0 = fjx.Q().S();
      if ($$0 != null && $$0.e()) {
         return heg.c.a;
      } else {
         return fjx.Q().U() ? heg.c.b : heg.c.c;
      }
   }

   public boolean a(hed $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hee.b, $$0x -> {
            $$0x.a(heg.n, this.b);
            if (this.d != null) {
               $$0x.a(heg.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dfc $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? heg.b.e : heg.b.a;
         case b -> heg.b.b;
         case c -> heg.b.c;
         case d -> heg.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
