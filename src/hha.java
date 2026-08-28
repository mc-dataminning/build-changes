import javax.annotation.Nullable;

public class hha {
   private boolean a;
   @Nullable
   private hgu.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hha(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hgv.a $$0) {
      if (this.c != null) {
         $$0.a(hgu.j, !this.c.equals("vanilla"));
      }

      $$0.a(hgu.k, this.a());
   }

   private hgu.c a() {
      gfu $$0 = flz.Q().S();
      if ($$0 != null && $$0.e()) {
         return hgu.c.a;
      } else {
         return flz.Q().U() ? hgu.c.b : hgu.c.c;
      }
   }

   public boolean a(hgr $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hgs.b, $$0x -> {
            $$0x.a(hgu.n, this.b);
            if (this.d != null) {
               $$0x.a(hgu.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hgu.b.e : hgu.b.a;
         case b -> hgu.b.b;
         case c -> hgu.b.c;
         case d -> hgu.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
