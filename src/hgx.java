import javax.annotation.Nullable;

public class hgx {
   private boolean a;
   @Nullable
   private hgr.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hgx(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hgs.a $$0) {
      if (this.c != null) {
         $$0.a(hgr.j, !this.c.equals("vanilla"));
      }

      $$0.a(hgr.k, this.a());
   }

   private hgr.c a() {
      gfs $$0 = flz.Q().S();
      if ($$0 != null && $$0.e()) {
         return hgr.c.a;
      } else {
         return flz.Q().U() ? hgr.c.b : hgr.c.c;
      }
   }

   public boolean a(hgo $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hgp.b, $$0x -> {
            $$0x.a(hgr.n, this.b);
            if (this.d != null) {
               $$0x.a(hgr.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgx $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hgr.b.e : hgr.b.a;
         case b -> hgr.b.b;
         case c -> hgr.b.c;
         case d -> hgr.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
